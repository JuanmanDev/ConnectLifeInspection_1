package androidx.camera.core;

import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.camera.core.CameraX;
import androidx.camera.core.DeferrableSurface;
import androidx.camera.core.ImageAnalysisConfig;
import androidx.camera.core.ImageReaderProxy;
import androidx.camera.core.SessionConfig;
import androidx.camera.core.UseCaseConfig;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ImageAnalysis extends UseCase {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final Defaults DEFAULT_CONFIG = new Defaults();
    public static final String TAG = "ImageAnalysis";
    @Nullable
    public DeferrableSurface mDeferrableSurface;
    public final Handler mHandler;
    @Nullable
    public ImageReaderProxy mImageReader;
    public final AtomicInteger mRelativeRotation = new AtomicInteger();
    public final AtomicReference<Analyzer> mSubscribedAnalyzer;
    public final ImageAnalysisConfig.Builder mUseCaseConfigBuilder;

    public interface Analyzer {
        void analyze(ImageProxy imageProxy, int i);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class Defaults implements ConfigProvider<ImageAnalysisConfig> {
        public static final ImageAnalysisConfig DEFAULT_CONFIG = new ImageAnalysisConfig.Builder().setImageReaderMode(DEFAULT_IMAGE_READER_MODE).setCallbackHandler(DEFAULT_HANDLER).setImageQueueDepth(6).setTargetResolution(DEFAULT_TARGET_RESOLUTION).setMaxResolution(DEFAULT_MAX_RESOLUTION).setSurfaceOccupancyPriority(1).build();
        public static final Handler DEFAULT_HANDLER = new Handler(Looper.getMainLooper());
        public static final int DEFAULT_IMAGE_QUEUE_DEPTH = 6;
        public static final ImageReaderMode DEFAULT_IMAGE_READER_MODE = ImageReaderMode.ACQUIRE_NEXT_IMAGE;
        public static final Size DEFAULT_MAX_RESOLUTION = new Size(1920, 1080);
        public static final int DEFAULT_SURFACE_OCCUPANCY_PRIORITY = 1;
        public static final Size DEFAULT_TARGET_RESOLUTION = new Size(640, 480);

        public ImageAnalysisConfig getConfig(CameraX.LensFacing lensFacing) {
            return DEFAULT_CONFIG;
        }
    }

    public enum ImageReaderMode {
        ACQUIRE_LATEST_IMAGE,
        ACQUIRE_NEXT_IMAGE
    }

    public ImageAnalysis(ImageAnalysisConfig imageAnalysisConfig) {
        super(imageAnalysisConfig);
        this.mUseCaseConfigBuilder = ImageAnalysisConfig.Builder.fromConfig(imageAnalysisConfig);
        this.mSubscribedAnalyzer = new AtomicReference<>();
        Handler callbackHandler = ((ImageAnalysisConfig) getUseCaseConfig()).getCallbackHandler((Handler) null);
        this.mHandler = callbackHandler;
        if (callbackHandler != null) {
            setImageFormat(ImageReaderFormatRecommender.chooseCombo().imageAnalysisFormat());
            return;
        }
        throw new IllegalStateException("No default mHandler specified.");
    }

    private void tryUpdateRelativeRotation(String str) {
        ImageOutputConfig imageOutputConfig = (ImageOutputConfig) getUseCaseConfig();
        try {
            this.mRelativeRotation.set(CameraX.getCameraInfo(str).getSensorRotationDegrees(imageOutputConfig.getTargetRotation(0)));
        } catch (CameraInfoUnavailableException unused) {
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void clear() {
        DeferrableSurface deferrableSurface = this.mDeferrableSurface;
        if (deferrableSurface != null) {
            deferrableSurface.setOnSurfaceDetachedListener(CameraXExecutors.mainThreadExecutor(), new DeferrableSurface.OnSurfaceDetachedListener() {
                public void onSurfaceDetached() {
                    ImageReaderProxy imageReaderProxy = ImageAnalysis.this.mImageReader;
                    if (imageReaderProxy != null) {
                        imageReaderProxy.close();
                        ImageAnalysis.this.mImageReader = null;
                    }
                }
            });
        }
        super.clear();
    }

    @UiThread
    @Nullable
    public Analyzer getAnalyzer() {
        return this.mSubscribedAnalyzer.get();
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public UseCaseConfig.Builder<?, ?, ?> getDefaultBuilder(CameraX.LensFacing lensFacing) {
        ImageAnalysisConfig imageAnalysisConfig = (ImageAnalysisConfig) CameraX.getDefaultUseCaseConfig(ImageAnalysisConfig.class, lensFacing);
        if (imageAnalysisConfig != null) {
            return ImageAnalysisConfig.Builder.fromConfig(imageAnalysisConfig);
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Map<String, Size> onSuggestedResolutionUpdated(Map<String, Size> map) {
        final ImageAnalysisConfig imageAnalysisConfig = (ImageAnalysisConfig) getUseCaseConfig();
        CameraX.LensFacing lensFacing = imageAnalysisConfig.getLensFacing();
        try {
            String cameraWithLensFacing = CameraX.getCameraWithLensFacing(lensFacing);
            Size size = map.get(cameraWithLensFacing);
            if (size != null) {
                ImageReaderProxy imageReaderProxy = this.mImageReader;
                if (imageReaderProxy != null) {
                    imageReaderProxy.close();
                }
                this.mImageReader = ImageReaderProxys.createCompatibleReader(cameraWithLensFacing, size.getWidth(), size.getHeight(), getImageFormat(), imageAnalysisConfig.getImageQueueDepth(), this.mHandler);
                tryUpdateRelativeRotation(cameraWithLensFacing);
                this.mImageReader.setOnImageAvailableListener(new ImageReaderProxy.OnImageAvailableListener() {
                    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
                        r1 = move-exception;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
                        if (r4 != null) goto L_0x0040;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
                        r4.close();
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
                        r4 = move-exception;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0045, code lost:
                        r0.addSuppressed(r4);
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0048, code lost:
                        throw r1;
                     */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public void onImageAvailable(androidx.camera.core.ImageReaderProxy r4) {
                        /*
                            r3 = this;
                            androidx.camera.core.ImageAnalysis r0 = androidx.camera.core.ImageAnalysis.this
                            java.util.concurrent.atomic.AtomicReference<androidx.camera.core.ImageAnalysis$Analyzer> r0 = r0.mSubscribedAnalyzer
                            java.lang.Object r0 = r0.get()
                            androidx.camera.core.ImageAnalysis$Analyzer r0 = (androidx.camera.core.ImageAnalysis.Analyzer) r0
                            androidx.camera.core.ImageAnalysisConfig r1 = r0
                            androidx.camera.core.ImageAnalysis$ImageReaderMode r2 = r1.getImageReaderMode()
                            androidx.camera.core.ImageAnalysis$ImageReaderMode r1 = r1.getImageReaderMode(r2)
                            androidx.camera.core.ImageAnalysis$ImageReaderMode r2 = androidx.camera.core.ImageAnalysis.ImageReaderMode.ACQUIRE_NEXT_IMAGE
                            boolean r1 = r1.equals(r2)
                            if (r1 == 0) goto L_0x0021
                            androidx.camera.core.ImageProxy r4 = r4.acquireNextImage()
                            goto L_0x0025
                        L_0x0021:
                            androidx.camera.core.ImageProxy r4 = r4.acquireLatestImage()
                        L_0x0025:
                            if (r4 != 0) goto L_0x002d
                            if (r4 == 0) goto L_0x002c
                            r4.close()
                        L_0x002c:
                            return
                        L_0x002d:
                            if (r0 == 0) goto L_0x0049
                            androidx.camera.core.ImageAnalysis r1 = androidx.camera.core.ImageAnalysis.this     // Catch:{ all -> 0x003b }
                            java.util.concurrent.atomic.AtomicInteger r1 = r1.mRelativeRotation     // Catch:{ all -> 0x003b }
                            int r1 = r1.get()     // Catch:{ all -> 0x003b }
                            r0.analyze(r4, r1)     // Catch:{ all -> 0x003b }
                            goto L_0x0049
                        L_0x003b:
                            r0 = move-exception
                            throw r0     // Catch:{ all -> 0x003d }
                        L_0x003d:
                            r1 = move-exception
                            if (r4 == 0) goto L_0x0048
                            r4.close()     // Catch:{ all -> 0x0044 }
                            goto L_0x0048
                        L_0x0044:
                            r4 = move-exception
                            r0.addSuppressed(r4)
                        L_0x0048:
                            throw r1
                        L_0x0049:
                            if (r4 == 0) goto L_0x004e
                            r4.close()
                        L_0x004e:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.ImageAnalysis.C03972.onImageAvailable(androidx.camera.core.ImageReaderProxy):void");
                    }
                }, this.mHandler);
                SessionConfig.Builder createFrom = SessionConfig.Builder.createFrom(imageAnalysisConfig);
                ImmediateSurface immediateSurface = new ImmediateSurface(this.mImageReader.getSurface());
                this.mDeferrableSurface = immediateSurface;
                createFrom.addSurface(immediateSurface);
                attachToCamera(cameraWithLensFacing, createFrom.build());
                return map;
            }
            throw new IllegalArgumentException("Suggested resolution map missing resolution for camera " + cameraWithLensFacing);
        } catch (CameraInfoUnavailableException e) {
            throw new IllegalArgumentException("Unable to find camera with LensFacing " + lensFacing, e);
        }
    }

    @UiThread
    public void removeAnalyzer() {
        setAnalyzer((Analyzer) null);
    }

    @UiThread
    public void setAnalyzer(@Nullable Analyzer analyzer) {
        Analyzer andSet = this.mSubscribedAnalyzer.getAndSet(analyzer);
        if (andSet == null && analyzer != null) {
            notifyActive();
        } else if (andSet != null && analyzer == null) {
            notifyInactive();
        }
    }

    public void setTargetRotation(int i) {
        ImageAnalysisConfig imageAnalysisConfig = (ImageAnalysisConfig) getUseCaseConfig();
        int targetRotation = imageAnalysisConfig.getTargetRotation(-1);
        if (targetRotation == -1 || targetRotation != i) {
            this.mUseCaseConfigBuilder.setTargetRotation(i);
            updateUseCaseConfig(this.mUseCaseConfigBuilder.build());
            try {
                tryUpdateRelativeRotation(CameraX.getCameraWithLensFacing(imageAnalysisConfig.getLensFacing()));
            } catch (CameraInfoUnavailableException unused) {
            }
        }
    }

    public String toString() {
        return "ImageAnalysis:" + getName();
    }
}
