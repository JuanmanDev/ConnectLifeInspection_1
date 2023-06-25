package androidx.camera.camera2.impl;

import android.content.Context;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Rational;
import android.util.Size;
import android.view.WindowManager;
import androidx.camera.core.CameraDeviceConfig;
import androidx.camera.core.CameraInfoUnavailableException;
import androidx.camera.core.CameraX;
import androidx.camera.core.ImageOutputConfig;
import androidx.camera.core.SurfaceCombination;
import androidx.camera.core.SurfaceConfig;
import androidx.camera.core.SurfaceSizeDefinition;
import androidx.camera.core.UseCase;
import androidx.camera.core.UseCaseConfig;
import androidx.core.view.DisplayCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class SupportedSurfaceCombination {
    public static final Size DEFAULT_SIZE = new Size(640, 480);
    public static final Size MAX_PREVIEW_SIZE = new Size(1920, 1080);
    public static final Size QUALITY_1080P_SIZE = new Size(1920, 1080);
    public static final Size QUALITY_2160P_SIZE = new Size(DisplayCompat.DISPLAY_SIZE_4K_WIDTH, DisplayCompat.DISPLAY_SIZE_4K_HEIGHT);
    public static final Size QUALITY_480P_SIZE = new Size(720, 480);
    public static final Size QUALITY_720P_SIZE = new Size(1280, 720);
    public static final Size ZERO_SIZE = new Size(0, 0);
    public CamcorderProfileHelper mCamcorderProfileHelper;
    public String mCameraId;
    public CameraCharacteristics mCharacteristics;
    public int mHardwareLevel = 2;
    public boolean mIsBurstCaptureSupported = false;
    public boolean mIsRawSupported = false;
    public final Map<Integer, Size> mMaxSizeCache = new HashMap();
    public final List<SurfaceCombination> mSurfaceCombinations = new ArrayList();
    public SurfaceSizeDefinition mSurfaceSizeDefinition;

    public static final class CompareSizesByArea implements Comparator<Size> {
        public boolean mReverse = false;

        public CompareSizesByArea() {
        }

        public int compare(Size size, Size size2) {
            int signum = Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
            return this.mReverse ? signum * -1 : signum;
        }

        public CompareSizesByArea(boolean z) {
            this.mReverse = z;
        }
    }

    public SupportedSurfaceCombination(Context context, String str, CamcorderProfileHelper camcorderProfileHelper) {
        this.mCameraId = str;
        this.mCamcorderProfileHelper = camcorderProfileHelper;
        init(context);
    }

    private void checkCustomization() {
    }

    private Size fetchMaxSize(int i) {
        Size size = this.mMaxSizeCache.get(Integer.valueOf(i));
        if (size != null) {
            return size;
        }
        Size maxOutputSizeByFormat = getMaxOutputSizeByFormat(i);
        this.mMaxSizeCache.put(Integer.valueOf(i), maxOutputSizeByFormat);
        return maxOutputSizeByFormat;
    }

    private void generateSupportedCombinationList(CameraManager cameraManager) {
        CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(this.mCameraId);
        this.mCharacteristics = cameraCharacteristics;
        Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num != null) {
            this.mHardwareLevel = num.intValue();
        }
        this.mSurfaceCombinations.addAll(getLegacySupportedCombinationList());
        int i = this.mHardwareLevel;
        if (i == 0 || i == 1 || i == 3) {
            this.mSurfaceCombinations.addAll(getLimitedSupportedCombinationList());
        }
        int i2 = this.mHardwareLevel;
        if (i2 == 1 || i2 == 3) {
            this.mSurfaceCombinations.addAll(getFullSupportedCombinationList());
        }
        int[] iArr = (int[]) this.mCharacteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i3 : iArr) {
                if (i3 == 3) {
                    this.mIsRawSupported = true;
                } else if (i3 == 6) {
                    this.mIsBurstCaptureSupported = true;
                }
            }
        }
        if (this.mIsRawSupported) {
            this.mSurfaceCombinations.addAll(getRAWSupportedCombinationList());
        }
        if (this.mIsBurstCaptureSupported && this.mHardwareLevel == 0) {
            this.mSurfaceCombinations.addAll(getBurstSupportedCombinationList());
        }
        if (this.mHardwareLevel == 3) {
            this.mSurfaceCombinations.addAll(getLevel3SupportedCombinationList());
        }
    }

    private void generateSurfaceSizeDefinition(WindowManager windowManager) {
        this.mSurfaceSizeDefinition = SurfaceSizeDefinition.create(new Size(640, 480), getPreviewSize(windowManager), getRecordSize());
    }

    private Size[] getAllOutputSizesByFormat(int i) {
        Size[] sizeArr;
        CameraCharacteristics cameraCharacteristics = this.mCharacteristics;
        if (cameraCharacteristics != null) {
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            if (streamConfigurationMap != null) {
                if (Build.VERSION.SDK_INT >= 23 || i != 34) {
                    sizeArr = streamConfigurationMap.getOutputSizes(i);
                } else {
                    sizeArr = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
                }
                if (sizeArr != null) {
                    Arrays.sort(sizeArr, new CompareSizesByArea(true));
                    return sizeArr;
                }
                throw new IllegalArgumentException("Can not get supported output size for the format: " + i);
            }
            throw new IllegalArgumentException("Can not get supported output size for the format: " + i);
        }
        throw new IllegalStateException("CameraCharacteristics is null.");
    }

    private List<List<Size>> getAllPossibleSizeArrangements(List<List<Size>> list) {
        int i = 1;
        for (List<Size> size : list) {
            i *= size.size();
        }
        if (i != 0) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new ArrayList());
            }
            int size2 = i / list.get(0).size();
            int i3 = i;
            for (int i4 = 0; i4 < list.size(); i4++) {
                List list2 = list.get(i4);
                for (int i5 = 0; i5 < i; i5++) {
                    ((List) arrayList.get(i5)).add(list2.get((i5 % i3) / size2));
                }
                if (i4 < list.size() - 1) {
                    i3 = size2;
                    size2 /= list.get(i4 + 1).size();
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException("Failed to find supported resolutions.");
    }

    private Size getPreviewSize(WindowManager windowManager) {
        Size size;
        Point point = new Point();
        windowManager.getDefaultDisplay().getRealSize(point);
        if (point.x > point.y) {
            size = new Size(point.x, point.y);
        } else {
            size = new Size(point.y, point.x);
        }
        return (Size) Collections.min(Arrays.asList(new Size[]{new Size(size.getWidth(), size.getHeight()), MAX_PREVIEW_SIZE}), new CompareSizesByArea());
    }

    private Size getRecordSize() {
        Size size = QUALITY_480P_SIZE;
        if (this.mCamcorderProfileHelper.hasProfile(Integer.parseInt(this.mCameraId), 8)) {
            return QUALITY_2160P_SIZE;
        }
        if (this.mCamcorderProfileHelper.hasProfile(Integer.parseInt(this.mCameraId), 6)) {
            return QUALITY_1080P_SIZE;
        }
        if (this.mCamcorderProfileHelper.hasProfile(Integer.parseInt(this.mCameraId), 5)) {
            return QUALITY_720P_SIZE;
        }
        return this.mCamcorderProfileHelper.hasProfile(Integer.parseInt(this.mCameraId), 4) ? QUALITY_480P_SIZE : size;
    }

    private List<Size> getSupportedOutputSizes(UseCase useCase) {
        int imageFormat = useCase.getImageFormat();
        Size[] allOutputSizesByFormat = getAllOutputSizesByFormat(imageFormat);
        ArrayList<Size> arrayList = new ArrayList<>();
        ImageOutputConfig imageOutputConfig = (ImageOutputConfig) useCase.getUseCaseConfig();
        Size maxResolution = imageOutputConfig.getMaxResolution(getMaxOutputSizeByFormat(imageFormat));
        Arrays.sort(allOutputSizesByFormat, new CompareSizesByArea(true));
        for (Size size : allOutputSizesByFormat) {
            if (size.getWidth() * size.getHeight() <= maxResolution.getWidth() * maxResolution.getHeight()) {
                arrayList.add(size);
            }
        }
        if (!arrayList.isEmpty()) {
            boolean contains = arrayList.contains(DEFAULT_SIZE);
            Size targetResolution = imageOutputConfig.getTargetResolution(ZERO_SIZE);
            if (!targetResolution.equals(ZERO_SIZE)) {
                int i = 0;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    Size size2 = (Size) arrayList.get(i2);
                    if (size2.getWidth() * size2.getHeight() < targetResolution.getWidth() * targetResolution.getHeight()) {
                        break;
                    }
                    i = i2;
                }
                arrayList.subList(0, i).clear();
            }
            if (!arrayList.isEmpty() || contains) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                Rational rotateAspectRatioByRotation = rotateAspectRatioByRotation(imageOutputConfig.getTargetAspectRatio((Rational) null), imageOutputConfig.getTargetRotation(0));
                for (Size size3 : arrayList) {
                    if (rotateAspectRatioByRotation == null || !rotateAspectRatioByRotation.equals(new Rational(size3.getWidth(), size3.getHeight()))) {
                        arrayList3.add(size3);
                    } else {
                        arrayList2.add(size3);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                arrayList4.addAll(arrayList2);
                arrayList4.addAll(arrayList3);
                if (arrayList4.isEmpty() && !contains) {
                    arrayList4.add(DEFAULT_SIZE);
                }
                return arrayList4;
            }
            throw new IllegalArgumentException("Can not get supported output size for the desired output size quality for the format: " + imageFormat);
        }
        throw new IllegalArgumentException("Can not get supported output size under supported maximum for the format: " + imageFormat);
    }

    private List<Integer> getUseCasesPriorityOrder(List<UseCase> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (UseCase useCaseConfig : list) {
            int surfaceOccupancyPriority = useCaseConfig.getUseCaseConfig().getSurfaceOccupancyPriority(0);
            if (!arrayList2.contains(Integer.valueOf(surfaceOccupancyPriority))) {
                arrayList2.add(Integer.valueOf(surfaceOccupancyPriority));
            }
        }
        Collections.sort(arrayList2);
        Collections.reverse(arrayList2);
        for (Integer intValue : arrayList2) {
            int intValue2 = intValue.intValue();
            for (UseCase next : list) {
                if (intValue2 == next.getUseCaseConfig().getSurfaceOccupancyPriority(0)) {
                    arrayList.add(Integer.valueOf(list.indexOf(next)));
                }
            }
        }
        return arrayList;
    }

    private void init(Context context) {
        CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        try {
            generateSupportedCombinationList(cameraManager);
            generateSurfaceSizeDefinition(windowManager);
            checkCustomization();
        } catch (CameraAccessException e) {
            throw new IllegalArgumentException("Generate supported combination list and size definition fail - CameraId:" + this.mCameraId, e);
        }
    }

    private Rational rotateAspectRatioByRotation(Rational rational, int i) {
        try {
            int sensorRotationDegrees = CameraX.getCameraInfo(this.mCameraId).getSensorRotationDegrees(i);
            if (rational != null) {
                return (sensorRotationDegrees == 90 || sensorRotationDegrees == 270) ? new Rational(rational.getDenominator(), rational.getNumerator()) : rational;
            }
            return rational;
        } catch (CameraInfoUnavailableException e) {
            throw new IllegalArgumentException("Unable to retrieve camera sensor orientation.", e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0007 A[LOOP:0: B:1:0x0007->B:4:0x0017, LOOP_START, PHI: r1 
      PHI: (r1v1 boolean) = (r1v0 boolean), (r1v5 boolean) binds: [B:0:0x0000, B:4:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean checkSupported(java.util.List<androidx.camera.core.SurfaceConfig> r4) {
        /*
            r3 = this;
            java.util.List<androidx.camera.core.SurfaceCombination> r0 = r3.mSurfaceCombinations
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L_0x0007:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0019
            java.lang.Object r1 = r0.next()
            androidx.camera.core.SurfaceCombination r1 = (androidx.camera.core.SurfaceCombination) r1
            boolean r1 = r1.isSupported(r4)
            if (r1 == 0) goto L_0x0007
        L_0x0019:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.SupportedSurfaceCombination.checkSupported(java.util.List):boolean");
    }

    public List<SurfaceCombination> getBurstSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.MAXIMUM));
        arrayList.add(surfaceCombination);
        SurfaceCombination surfaceCombination2 = new SurfaceCombination();
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.MAXIMUM));
        arrayList.add(surfaceCombination2);
        SurfaceCombination surfaceCombination3 = new SurfaceCombination();
        surfaceCombination3.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination3.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.MAXIMUM));
        arrayList.add(surfaceCombination3);
        return arrayList;
    }

    public String getCameraId() {
        return this.mCameraId;
    }

    public Rational getCorrectedAspectRatio(UseCaseConfig<?> useCaseConfig) {
        if (this.mHardwareLevel != 2 || Build.VERSION.SDK_INT != 21) {
            return null;
        }
        Size fetchMaxSize = fetchMaxSize(256);
        return rotateAspectRatioByRotation(new Rational(fetchMaxSize.getWidth(), fetchMaxSize.getHeight()), ((ImageOutputConfig) useCaseConfig).getTargetRotation(0));
    }

    public List<SurfaceCombination> getFullSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.MAXIMUM));
        arrayList.add(surfaceCombination);
        SurfaceCombination surfaceCombination2 = new SurfaceCombination();
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.MAXIMUM));
        arrayList.add(surfaceCombination2);
        SurfaceCombination surfaceCombination3 = new SurfaceCombination();
        surfaceCombination3.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination3.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.MAXIMUM));
        arrayList.add(surfaceCombination3);
        SurfaceCombination surfaceCombination4 = new SurfaceCombination();
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.JPEG, SurfaceConfig.ConfigSize.MAXIMUM));
        arrayList.add(surfaceCombination4);
        SurfaceCombination surfaceCombination5 = new SurfaceCombination();
        surfaceCombination5.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.ANALYSIS));
        surfaceCombination5.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination5.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.MAXIMUM));
        arrayList.add(surfaceCombination5);
        SurfaceCombination surfaceCombination6 = new SurfaceCombination();
        surfaceCombination6.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.ANALYSIS));
        surfaceCombination6.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination6.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.MAXIMUM));
        arrayList.add(surfaceCombination6);
        return arrayList;
    }

    public List<SurfaceCombination> getLegacySupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.MAXIMUM));
        arrayList.add(surfaceCombination);
        SurfaceCombination surfaceCombination2 = new SurfaceCombination();
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.JPEG, SurfaceConfig.ConfigSize.MAXIMUM));
        arrayList.add(surfaceCombination2);
        SurfaceCombination surfaceCombination3 = new SurfaceCombination();
        surfaceCombination3.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.MAXIMUM));
        arrayList.add(surfaceCombination3);
        SurfaceCombination surfaceCombination4 = new SurfaceCombination();
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.JPEG, SurfaceConfig.ConfigSize.MAXIMUM));
        arrayList.add(surfaceCombination4);
        SurfaceCombination surfaceCombination5 = new SurfaceCombination();
        surfaceCombination5.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination5.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.JPEG, SurfaceConfig.ConfigSize.MAXIMUM));
        arrayList.add(surfaceCombination5);
        SurfaceCombination surfaceCombination6 = new SurfaceCombination();
        surfaceCombination6.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination6.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW));
        arrayList.add(surfaceCombination6);
        SurfaceCombination surfaceCombination7 = new SurfaceCombination();
        surfaceCombination7.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination7.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.PREVIEW));
        arrayList.add(surfaceCombination7);
        SurfaceCombination surfaceCombination8 = new SurfaceCombination();
        surfaceCombination8.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination8.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination8.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.JPEG, SurfaceConfig.ConfigSize.MAXIMUM));
        arrayList.add(surfaceCombination8);
        return arrayList;
    }

    public List<SurfaceCombination> getLevel3SupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.ANALYSIS));
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.MAXIMUM));
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.RAW, SurfaceConfig.ConfigSize.MAXIMUM));
        arrayList.add(surfaceCombination);
        SurfaceCombination surfaceCombination2 = new SurfaceCombination();
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.ANALYSIS));
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.JPEG, SurfaceConfig.ConfigSize.MAXIMUM));
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.RAW, SurfaceConfig.ConfigSize.MAXIMUM));
        arrayList.add(surfaceCombination2);
        return arrayList;
    }

    public List<SurfaceCombination> getLimitedSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.RECORD));
        arrayList.add(surfaceCombination);
        SurfaceCombination surfaceCombination2 = new SurfaceCombination();
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.RECORD));
        arrayList.add(surfaceCombination2);
        SurfaceCombination surfaceCombination3 = new SurfaceCombination();
        surfaceCombination3.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination3.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.RECORD));
        arrayList.add(surfaceCombination3);
        SurfaceCombination surfaceCombination4 = new SurfaceCombination();
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.RECORD));
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.JPEG, SurfaceConfig.ConfigSize.RECORD));
        arrayList.add(surfaceCombination4);
        SurfaceCombination surfaceCombination5 = new SurfaceCombination();
        surfaceCombination5.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination5.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.RECORD));
        surfaceCombination5.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.JPEG, SurfaceConfig.ConfigSize.RECORD));
        arrayList.add(surfaceCombination5);
        SurfaceCombination surfaceCombination6 = new SurfaceCombination();
        surfaceCombination6.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination6.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination6.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.JPEG, SurfaceConfig.ConfigSize.MAXIMUM));
        arrayList.add(surfaceCombination6);
        return arrayList;
    }

    public Size getMaxOutputSizeByFormat(int i) {
        return (Size) Collections.max(Arrays.asList(getAllOutputSizesByFormat(i)), new CompareSizesByArea());
    }

    public List<SurfaceCombination> getRAWSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.RAW, SurfaceConfig.ConfigSize.MAXIMUM));
        arrayList.add(surfaceCombination);
        SurfaceCombination surfaceCombination2 = new SurfaceCombination();
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.RAW, SurfaceConfig.ConfigSize.MAXIMUM));
        arrayList.add(surfaceCombination2);
        SurfaceCombination surfaceCombination3 = new SurfaceCombination();
        surfaceCombination3.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination3.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.RAW, SurfaceConfig.ConfigSize.MAXIMUM));
        arrayList.add(surfaceCombination3);
        SurfaceCombination surfaceCombination4 = new SurfaceCombination();
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.RAW, SurfaceConfig.ConfigSize.MAXIMUM));
        arrayList.add(surfaceCombination4);
        SurfaceCombination surfaceCombination5 = new SurfaceCombination();
        surfaceCombination5.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination5.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination5.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.RAW, SurfaceConfig.ConfigSize.MAXIMUM));
        arrayList.add(surfaceCombination5);
        SurfaceCombination surfaceCombination6 = new SurfaceCombination();
        surfaceCombination6.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination6.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination6.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.RAW, SurfaceConfig.ConfigSize.MAXIMUM));
        arrayList.add(surfaceCombination6);
        SurfaceCombination surfaceCombination7 = new SurfaceCombination();
        surfaceCombination7.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination7.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.JPEG, SurfaceConfig.ConfigSize.MAXIMUM));
        surfaceCombination7.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.RAW, SurfaceConfig.ConfigSize.MAXIMUM));
        arrayList.add(surfaceCombination7);
        SurfaceCombination surfaceCombination8 = new SurfaceCombination();
        surfaceCombination8.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination8.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.JPEG, SurfaceConfig.ConfigSize.MAXIMUM));
        surfaceCombination8.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.RAW, SurfaceConfig.ConfigSize.MAXIMUM));
        arrayList.add(surfaceCombination8);
        return arrayList;
    }

    public Map<UseCase, Size> getSuggestedResolutions(List<UseCase> list, List<UseCase> list2) {
        HashMap hashMap = new HashMap();
        List<Integer> useCasesPriorityOrder = getUseCasesPriorityOrder(list2);
        ArrayList arrayList = new ArrayList();
        for (Integer intValue : useCasesPriorityOrder) {
            arrayList.add(getSupportedOutputSizes(list2.get(intValue.intValue())));
        }
        Iterator<List<Size>> it = getAllPossibleSizeArrangements(arrayList).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            List next = it.next();
            ArrayList arrayList2 = new ArrayList();
            if (list != null) {
                for (UseCase next2 : list) {
                    try {
                        arrayList2.add(transformSurfaceConfig(next2.getImageFormat(), next2.getAttachedSurfaceResolution(CameraX.getCameraWithLensFacing(((CameraDeviceConfig) next2.getUseCaseConfig()).getLensFacing()))));
                    } catch (Exception e) {
                        throw new IllegalArgumentException("Unable to get camera ID for use case " + next2.getName(), e);
                    }
                }
            }
            for (int i = 0; i < next.size(); i++) {
                arrayList2.add(transformSurfaceConfig(list2.get(useCasesPriorityOrder.get(i).intValue()).getImageFormat(), (Size) next.get(i)));
            }
            if (checkSupported(arrayList2)) {
                for (UseCase next3 : list2) {
                    hashMap.put(next3, next.get(useCasesPriorityOrder.indexOf(Integer.valueOf(list2.indexOf(next3)))));
                }
            }
        }
        return hashMap;
    }

    public SurfaceSizeDefinition getSurfaceSizeDefinition() {
        return this.mSurfaceSizeDefinition;
    }

    public boolean isBurstCaptureSupported() {
        return this.mIsBurstCaptureSupported;
    }

    public boolean isRawSupported() {
        return this.mIsRawSupported;
    }

    public boolean requiresCorrectedAspectRatio() {
        return this.mHardwareLevel == 2 && Build.VERSION.SDK_INT == 21;
    }

    public SurfaceConfig transformSurfaceConfig(int i, Size size) {
        SurfaceConfig.ConfigType configType;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.NOT_SUPPORT;
        if (getAllOutputSizesByFormat(i) != null) {
            if (i == 35) {
                configType = SurfaceConfig.ConfigType.YUV;
            } else if (i == 256) {
                configType = SurfaceConfig.ConfigType.JPEG;
            } else if (i == 32) {
                configType = SurfaceConfig.ConfigType.RAW;
            } else {
                configType = SurfaceConfig.ConfigType.PRIV;
            }
            Size fetchMaxSize = fetchMaxSize(i);
            if (size.getWidth() * size.getHeight() <= this.mSurfaceSizeDefinition.getAnalysisSize().getWidth() * this.mSurfaceSizeDefinition.getAnalysisSize().getHeight()) {
                configSize = SurfaceConfig.ConfigSize.ANALYSIS;
            } else if (size.getWidth() * size.getHeight() <= this.mSurfaceSizeDefinition.getPreviewSize().getWidth() * this.mSurfaceSizeDefinition.getPreviewSize().getHeight()) {
                configSize = SurfaceConfig.ConfigSize.PREVIEW;
            } else if (size.getWidth() * size.getHeight() <= this.mSurfaceSizeDefinition.getRecordSize().getWidth() * this.mSurfaceSizeDefinition.getRecordSize().getHeight()) {
                configSize = SurfaceConfig.ConfigSize.RECORD;
            } else if (size.getWidth() * size.getHeight() <= fetchMaxSize.getWidth() * fetchMaxSize.getHeight()) {
                configSize = SurfaceConfig.ConfigSize.MAXIMUM;
            }
            return SurfaceConfig.create(configType, configSize);
        }
        throw new IllegalArgumentException("Can not get supported output size for the format: " + i);
    }

    public SupportedSurfaceCombination() {
    }
}
