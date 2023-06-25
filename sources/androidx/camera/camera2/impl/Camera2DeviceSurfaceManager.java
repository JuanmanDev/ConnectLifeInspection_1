package androidx.camera.camera2.impl;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.media.CamcorderProfile;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.CameraDeviceConfig;
import androidx.camera.core.CameraDeviceSurfaceManager;
import androidx.camera.core.CameraX;
import androidx.camera.core.SurfaceConfig;
import androidx.camera.core.UseCase;
import androidx.camera.core.UseCaseConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class Camera2DeviceSurfaceManager implements CameraDeviceSurfaceManager {
    public static final Size MAXIMUM_PREVIEW_SIZE = new Size(1920, 1080);
    public static final String TAG = "Camera2DeviceSurfaceManager";
    public final Map<String, SupportedSurfaceCombination> mCameraSupportedSurfaceCombinationMap = new HashMap();
    public boolean mIsInitialized = false;

    public enum Operation {
        ADD_CONFIG,
        REMOVE_CONFIG
    }

    public Camera2DeviceSurfaceManager(Context context) {
        init(context, new CamcorderProfileHelper() {
            public boolean hasProfile(int i, int i2) {
                return CamcorderProfile.hasProfile(i, i2);
            }
        });
    }

    private String getCameraIdFromConfig(UseCaseConfig<?> useCaseConfig) {
        try {
            return CameraX.getCameraWithLensFacing(((CameraDeviceConfig) useCaseConfig).getLensFacing());
        } catch (Exception e) {
            throw new IllegalArgumentException("Unable to get camera ID for use case " + useCaseConfig.getTargetName(), e);
        }
    }

    private void init(Context context, CamcorderProfileHelper camcorderProfileHelper) {
        if (!this.mIsInitialized) {
            try {
                for (String str : ((CameraManager) context.getSystemService("camera")).getCameraIdList()) {
                    this.mCameraSupportedSurfaceCombinationMap.put(str, new SupportedSurfaceCombination(context, str, camcorderProfileHelper));
                }
                this.mIsInitialized = true;
            } catch (CameraAccessException e) {
                throw new IllegalArgumentException("Fail to get camera id list", e);
            }
        }
    }

    public boolean checkSupported(String str, List<SurfaceConfig> list) {
        if (!this.mIsInitialized) {
            throw new IllegalStateException("Camera2DeviceSurfaceManager is not initialized.");
        } else if (list == null || list.isEmpty()) {
            return true;
        } else {
            SupportedSurfaceCombination supportedSurfaceCombination = this.mCameraSupportedSurfaceCombinationMap.get(str);
            if (supportedSurfaceCombination != null) {
                return supportedSurfaceCombination.checkSupported(list);
            }
            return false;
        }
    }

    @Nullable
    public Rational getCorrectedAspectRatio(@NonNull UseCaseConfig<?> useCaseConfig) {
        if (this.mIsInitialized) {
            String cameraIdFromConfig = getCameraIdFromConfig(useCaseConfig);
            SupportedSurfaceCombination supportedSurfaceCombination = this.mCameraSupportedSurfaceCombinationMap.get(cameraIdFromConfig);
            if (supportedSurfaceCombination != null) {
                return supportedSurfaceCombination.getCorrectedAspectRatio(useCaseConfig);
            }
            throw new IllegalArgumentException("Fail to find supported surface info - CameraId:" + cameraIdFromConfig);
        }
        throw new IllegalStateException("CameraDeviceSurfaceManager is not initialized.");
    }

    public Size getMaxOutputSize(String str, int i) {
        if (this.mIsInitialized) {
            SupportedSurfaceCombination supportedSurfaceCombination = this.mCameraSupportedSurfaceCombinationMap.get(str);
            if (supportedSurfaceCombination != null) {
                return supportedSurfaceCombination.getMaxOutputSizeByFormat(i);
            }
            throw new IllegalArgumentException("Fail to find supported surface info - CameraId:" + str);
        }
        throw new IllegalStateException("CameraDeviceSurfaceManager is not initialized.");
    }

    public Size getPreviewSize() {
        if (this.mIsInitialized) {
            Size size = MAXIMUM_PREVIEW_SIZE;
            if (this.mCameraSupportedSurfaceCombinationMap.isEmpty()) {
                return size;
            }
            return this.mCameraSupportedSurfaceCombinationMap.get((String) this.mCameraSupportedSurfaceCombinationMap.keySet().toArray()[0]).getSurfaceSizeDefinition().getPreviewSize();
        }
        throw new IllegalStateException("CameraDeviceSurfaceManager is not initialized.");
    }

    public Map<UseCase, Size> getSuggestedResolutions(String str, List<UseCase> list, List<UseCase> list2) {
        if (list2 == null || list2.isEmpty()) {
            throw new IllegalArgumentException("No new use cases to be bound.");
        }
        UseCaseSurfaceOccupancyManager.checkUseCaseLimitNotExceeded(list, list2);
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (UseCase next : list) {
                arrayList.add(transformSurfaceConfig(str, next.getImageFormat(), next.getAttachedSurfaceResolution(getCameraIdFromConfig(next.getUseCaseConfig()))));
            }
        }
        for (UseCase imageFormat : list2) {
            arrayList.add(transformSurfaceConfig(str, imageFormat.getImageFormat(), new Size(640, 480)));
        }
        SupportedSurfaceCombination supportedSurfaceCombination = this.mCameraSupportedSurfaceCombinationMap.get(str);
        if (supportedSurfaceCombination != null && supportedSurfaceCombination.checkSupported(arrayList)) {
            return supportedSurfaceCombination.getSuggestedResolutions(list, list2);
        }
        throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + str + ".  May be attempting to bind too many use cases.");
    }

    public boolean requiresCorrectedAspectRatio(@NonNull UseCaseConfig<?> useCaseConfig) {
        if (this.mIsInitialized) {
            String cameraIdFromConfig = getCameraIdFromConfig(useCaseConfig);
            SupportedSurfaceCombination supportedSurfaceCombination = this.mCameraSupportedSurfaceCombinationMap.get(cameraIdFromConfig);
            if (supportedSurfaceCombination != null) {
                return supportedSurfaceCombination.requiresCorrectedAspectRatio();
            }
            throw new IllegalArgumentException("Fail to find supported surface info - CameraId:" + cameraIdFromConfig);
        }
        throw new IllegalStateException("CameraDeviceSurfaceManager is not initialized.");
    }

    public SurfaceConfig transformSurfaceConfig(String str, int i, Size size) {
        if (this.mIsInitialized) {
            SupportedSurfaceCombination supportedSurfaceCombination = this.mCameraSupportedSurfaceCombinationMap.get(str);
            if (supportedSurfaceCombination != null) {
                return supportedSurfaceCombination.transformSurfaceConfig(i, size);
            }
            return null;
        }
        throw new IllegalStateException("Camera2DeviceSurfaceManager is not initialized.");
    }

    @VisibleForTesting
    public Camera2DeviceSurfaceManager(Context context, CamcorderProfileHelper camcorderProfileHelper) {
        init(context, camcorderProfileHelper);
    }
}
