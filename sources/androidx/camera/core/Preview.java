package androidx.camera.core;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.camera.core.CameraX;
import androidx.camera.core.PreviewConfig;
import androidx.camera.core.UseCaseConfig;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import java.util.Map;
import java.util.Objects;

public class Preview extends UseCase {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final Defaults DEFAULT_CONFIG = new Defaults();
    public static final String TAG = "Preview";
    @Nullable
    public PreviewOutput mLatestPreviewOutput;
    public final Handler mMainHandler = new Handler(Looper.getMainLooper());
    @Nullable
    public OnPreviewOutputUpdateListener mSubscribedPreviewOutputListener;
    public boolean mSurfaceDispatched = false;
    public SurfaceTextureHolder mSurfaceTextureHolder;
    public final PreviewConfig.Builder mUseCaseConfigBuilder;

    public static class CheckedSurfaceTextureHolder implements SurfaceTextureHolder {
        public final CheckedSurfaceTexture mCheckedSurfaceTexture;

        public CheckedSurfaceTextureHolder(CheckedSurfaceTexture checkedSurfaceTexture) {
            this.mCheckedSurfaceTexture = checkedSurfaceTexture;
        }

        public void release() {
            this.mCheckedSurfaceTexture.release();
        }

        public void resetSurfaceTexture() {
            this.mCheckedSurfaceTexture.resetSurfaceTexture();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class Defaults implements ConfigProvider<PreviewConfig> {
        public static final PreviewConfig DEFAULT_CONFIG = new PreviewConfig.Builder().setCallbackHandler(DEFAULT_HANDLER).setMaxResolution(DEFAULT_MAX_RESOLUTION).setSurfaceOccupancyPriority(2).build();
        public static final Handler DEFAULT_HANDLER = new Handler(Looper.getMainLooper());
        public static final Size DEFAULT_MAX_RESOLUTION = CameraX.getSurfaceManager().getPreviewSize();
        public static final int DEFAULT_SURFACE_OCCUPANCY_PRIORITY = 2;

        public PreviewConfig getConfig(CameraX.LensFacing lensFacing) {
            if (lensFacing == null) {
                return DEFAULT_CONFIG;
            }
            PreviewConfig.Builder fromConfig = PreviewConfig.Builder.fromConfig(DEFAULT_CONFIG);
            fromConfig.setLensFacing(lensFacing);
            return fromConfig.build();
        }
    }

    public interface OnPreviewOutputUpdateListener {
        void onUpdated(PreviewOutput previewOutput);
    }

    public static abstract class PreviewOutput {
        public static PreviewOutput create(SurfaceTexture surfaceTexture, Size size, int i) {
            return new AutoValue_Preview_PreviewOutput(surfaceTexture, size, i);
        }

        public abstract int getRotationDegrees();

        public abstract SurfaceTexture getSurfaceTexture();

        @NonNull
        public abstract Size getTextureSize();
    }

    public static class ProcessingSurfaceTextureHolder implements SurfaceTextureHolder {
        public final Preview mPreview;
        public final ProcessingSurfaceTexture mProcessingSurfaceTexture;
        public final Size mResolution;

        public ProcessingSurfaceTextureHolder(ProcessingSurfaceTexture processingSurfaceTexture, Preview preview, Size size) {
            this.mProcessingSurfaceTexture = processingSurfaceTexture;
            this.mPreview = preview;
            this.mResolution = size;
        }

        public void release() {
            this.mProcessingSurfaceTexture.close();
        }

        public void resetSurfaceTexture() {
            this.mProcessingSurfaceTexture.resetSurfaceTexture();
            this.mPreview.updateOutput(this.mProcessingSurfaceTexture.getSurfaceTexture(), this.mResolution);
        }
    }

    public interface SurfaceTextureHolder {
        void release();

        void resetSurfaceTexture();
    }

    public enum UseCaseError {
        UNKNOWN_ERROR
    }

    @MainThread
    public Preview(@NonNull PreviewConfig previewConfig) {
        super(previewConfig);
        this.mUseCaseConfigBuilder = PreviewConfig.Builder.fromConfig(previewConfig);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: androidx.camera.core.ProcessingSurfaceTexture} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: androidx.camera.core.CheckedSurfaceTexture} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: androidx.camera.core.ProcessingSurfaceTexture} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: androidx.camera.core.ProcessingSurfaceTexture} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private androidx.camera.core.SessionConfig.Builder createFrom(androidx.camera.core.PreviewConfig r11, android.util.Size r12) {
        /*
            r10 = this;
            androidx.camera.core.SessionConfig$Builder r0 = androidx.camera.core.SessionConfig.Builder.createFrom(r11)
            r1 = 0
            androidx.camera.core.CaptureProcessor r8 = r11.getCaptureProcessor(r1)
            if (r8 == 0) goto L_0x0041
            androidx.camera.core.CaptureStage$DefaultCaptureStage r1 = new androidx.camera.core.CaptureStage$DefaultCaptureStage
            r1.<init>()
            androidx.camera.core.ProcessingSurfaceTexture r9 = new androidx.camera.core.ProcessingSurfaceTexture
            int r3 = r12.getWidth()
            int r4 = r12.getHeight()
            r5 = 35
            android.os.Handler r2 = r10.mMainHandler
            android.os.Handler r6 = r11.getCallbackHandler(r2)
            r2 = r9
            r7 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8)
            androidx.camera.core.CameraCaptureCallback r11 = r9.getCameraCaptureCallback()
            r0.addCameraCaptureCallback(r11)
            androidx.camera.core.Preview$ProcessingSurfaceTextureHolder r11 = new androidx.camera.core.Preview$ProcessingSurfaceTextureHolder
            r11.<init>(r9, r10, r12)
            r10.mSurfaceTextureHolder = r11
            int r11 = r1.getId()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r0.setTag(r11)
            goto L_0x0063
        L_0x0041:
            androidx.camera.core.ImageInfoProcessor r11 = r11.getImageInfoProcessor(r1)
            if (r11 == 0) goto L_0x004f
            androidx.camera.core.Preview$1 r1 = new androidx.camera.core.Preview$1
            r1.<init>(r11)
            r0.addCameraCaptureCallback(r1)
        L_0x004f:
            androidx.camera.core.CheckedSurfaceTexture r9 = new androidx.camera.core.CheckedSurfaceTexture
            androidx.camera.core.Preview$2 r11 = new androidx.camera.core.Preview$2
            r11.<init>()
            r9.<init>(r11)
            r9.setResolution(r12)
            androidx.camera.core.Preview$CheckedSurfaceTextureHolder r11 = new androidx.camera.core.Preview$CheckedSurfaceTextureHolder
            r11.<init>(r9)
            r10.mSurfaceTextureHolder = r11
        L_0x0063:
            androidx.camera.core.Preview$SurfaceTextureHolder r11 = r10.mSurfaceTextureHolder
            r11.resetSurfaceTexture()
            r0.addSurface(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.Preview.createFrom(androidx.camera.core.PreviewConfig, android.util.Size):androidx.camera.core.SessionConfig$Builder");
    }

    public static String getCameraIdUnchecked(CameraX.LensFacing lensFacing) {
        try {
            return CameraX.getCameraWithLensFacing(lensFacing);
        } catch (Exception e) {
            throw new IllegalArgumentException("Unable to get camera id for camera lens facing " + lensFacing, e);
        }
    }

    private CameraControl getCurrentCameraControl() {
        return getCameraControl(getCameraIdUnchecked(((PreviewConfig) getUseCaseConfig()).getLensFacing()));
    }

    @UiThread
    private void invalidateMetadata() {
        PreviewOutput previewOutput = this.mLatestPreviewOutput;
        if (previewOutput != null) {
            updateOutput(previewOutput.getSurfaceTexture(), this.mLatestPreviewOutput.getTextureSize());
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void clear() {
        SurfaceTexture surfaceTexture;
        this.mSurfaceTextureHolder.release();
        removePreviewOutputListener();
        notifyInactive();
        PreviewOutput previewOutput = this.mLatestPreviewOutput;
        if (previewOutput == null) {
            surfaceTexture = null;
        } else {
            surfaceTexture = previewOutput.getSurfaceTexture();
        }
        if (surfaceTexture != null && !this.mSurfaceDispatched) {
            surfaceTexture.release();
        }
        super.clear();
    }

    public void enableTorch(boolean z) {
        getCurrentCameraControl().enableTorch(z);
    }

    public void focus(Rect rect, Rect rect2) {
        focus(rect, rect2, (OnFocusListener) null);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public UseCaseConfig.Builder<?, ?, ?> getDefaultBuilder(CameraX.LensFacing lensFacing) {
        PreviewConfig previewConfig = (PreviewConfig) CameraX.getDefaultUseCaseConfig(PreviewConfig.class, lensFacing);
        if (previewConfig != null) {
            return PreviewConfig.Builder.fromConfig(previewConfig);
        }
        return null;
    }

    @UiThread
    @Nullable
    public OnPreviewOutputUpdateListener getOnPreviewOutputUpdateListener() {
        return this.mSubscribedPreviewOutputListener;
    }

    public boolean isTorchOn() {
        return getCurrentCameraControl().isTorchOn();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Map<String, Size> onSuggestedResolutionUpdated(Map<String, Size> map) {
        PreviewConfig previewConfig = (PreviewConfig) getUseCaseConfig();
        String cameraIdUnchecked = getCameraIdUnchecked(previewConfig.getLensFacing());
        Size size = map.get(cameraIdUnchecked);
        if (size != null) {
            attachToCamera(cameraIdUnchecked, createFrom(previewConfig, size).build());
            return map;
        }
        throw new IllegalArgumentException("Suggested resolution map missing resolution for camera " + cameraIdUnchecked);
    }

    @UiThread
    public void removePreviewOutputListener() {
        setOnPreviewOutputUpdateListener((OnPreviewOutputUpdateListener) null);
    }

    @UiThread
    public void setOnPreviewOutputUpdateListener(@Nullable OnPreviewOutputUpdateListener onPreviewOutputUpdateListener) {
        OnPreviewOutputUpdateListener onPreviewOutputUpdateListener2 = this.mSubscribedPreviewOutputListener;
        this.mSubscribedPreviewOutputListener = onPreviewOutputUpdateListener;
        if (onPreviewOutputUpdateListener2 == null && onPreviewOutputUpdateListener != null) {
            notifyActive();
            PreviewOutput previewOutput = this.mLatestPreviewOutput;
            if (previewOutput != null) {
                this.mSurfaceDispatched = true;
                onPreviewOutputUpdateListener.onUpdated(previewOutput);
            }
        } else if (onPreviewOutputUpdateListener2 != null && onPreviewOutputUpdateListener == null) {
            notifyInactive();
        } else if (onPreviewOutputUpdateListener2 != null && onPreviewOutputUpdateListener2 != onPreviewOutputUpdateListener && this.mLatestPreviewOutput != null) {
            this.mSurfaceTextureHolder.resetSurfaceTexture();
        }
    }

    public void setTargetRotation(int i) {
        int targetRotation = ((ImageOutputConfig) getUseCaseConfig()).getTargetRotation(-1);
        if (targetRotation == -1 || targetRotation != i) {
            this.mUseCaseConfigBuilder.setTargetRotation(i);
            updateUseCaseConfig(this.mUseCaseConfigBuilder.build());
            invalidateMetadata();
        }
    }

    public String toString() {
        return "Preview:" + getName();
    }

    @UiThread
    public void updateOutput(SurfaceTexture surfaceTexture, Size size) {
        int i;
        SurfaceTexture surfaceTexture2;
        PreviewConfig previewConfig = (PreviewConfig) getUseCaseConfig();
        PreviewOutput previewOutput = this.mLatestPreviewOutput;
        if (previewOutput == null) {
            i = 0;
        } else {
            i = previewOutput.getRotationDegrees();
        }
        try {
            i = CameraX.getCameraInfo(CameraX.getCameraWithLensFacing(previewConfig.getLensFacing())).getSensorRotationDegrees(previewConfig.getTargetRotation(0));
        } catch (CameraInfoUnavailableException e) {
            "Unable to update output metadata: " + e;
        }
        PreviewOutput create = PreviewOutput.create(surfaceTexture, size, i);
        if (!Objects.equals(this.mLatestPreviewOutput, create)) {
            PreviewOutput previewOutput2 = this.mLatestPreviewOutput;
            if (previewOutput2 == null) {
                surfaceTexture2 = null;
            } else {
                surfaceTexture2 = previewOutput2.getSurfaceTexture();
            }
            OnPreviewOutputUpdateListener onPreviewOutputUpdateListener = getOnPreviewOutputUpdateListener();
            this.mLatestPreviewOutput = create;
            boolean z = surfaceTexture2 != surfaceTexture;
            if (z) {
                if (surfaceTexture2 != null && !this.mSurfaceDispatched) {
                    surfaceTexture2.release();
                }
                this.mSurfaceDispatched = false;
            }
            if (onPreviewOutputUpdateListener != null) {
                if (z) {
                    notifyReset();
                }
                this.mSurfaceDispatched = true;
                onPreviewOutputUpdateListener.onUpdated(create);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void updateUseCaseConfig(UseCaseConfig<?> useCaseConfig) {
        PreviewConfig previewConfig = (PreviewConfig) useCaseConfig;
        if (CameraX.getSurfaceManager().requiresCorrectedAspectRatio(previewConfig)) {
            Rational correctedAspectRatio = CameraX.getSurfaceManager().getCorrectedAspectRatio(previewConfig);
            PreviewConfig.Builder fromConfig = PreviewConfig.Builder.fromConfig(previewConfig);
            fromConfig.setTargetAspectRatio(correctedAspectRatio);
            previewConfig = fromConfig.build();
        }
        super.updateUseCaseConfig(previewConfig);
    }

    public void zoom(Rect rect) {
        getCurrentCameraControl().setCropRegion(rect);
    }

    public void focus(Rect rect, Rect rect2, @Nullable OnFocusListener onFocusListener) {
        if (onFocusListener == null) {
            getCurrentCameraControl().focus(rect, rect2);
        } else {
            getCurrentCameraControl().focus(rect, rect2, CameraXExecutors.mainThreadExecutor(), onFocusListener);
        }
    }
}
