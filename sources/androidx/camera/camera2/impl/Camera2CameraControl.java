package androidx.camera.camera2.impl;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.camera.camera2.Camera2Config;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CaptureConfig;
import androidx.camera.core.FlashMode;
import androidx.camera.core.OnFocusListener;
import androidx.camera.core.SessionConfig;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class Camera2CameraControl implements CameraControl {
    public static final long DEFAULT_FOCUS_TIMEOUT_MS = 5000;
    public static final String TAG = "Camera2CameraControl";
    public MeteringRectangle mAeRect;
    public MeteringRectangle mAfRect;
    public MeteringRectangle mAwbRect;
    public final CameraControl.ControlUpdateListener mControlUpdateListener;
    public Rect mCropRect;
    public Integer mCurrentAfState;
    public final Executor mExecutor;
    public volatile FlashMode mFlashMode;
    public long mFocusTimeoutCounter;
    public ScheduledFuture<?> mFocusTimeoutHandle;
    public long mFocusTimeoutMs;
    public volatile boolean mIsFocusLocked;
    public volatile boolean mIsTorchOn;
    public final ScheduledExecutorService mScheduler;
    public final CameraControlSessionCallback mSessionCallback;
    public final SessionConfig.Builder mSessionConfigBuilder;
    public CaptureResultListener mSessionListenerForFocus;

    /* renamed from: androidx.camera.camera2.impl.Camera2CameraControl$14 */
    public static /* synthetic */ class C034614 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$camera$core$FlashMode;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                androidx.camera.core.FlashMode[] r0 = androidx.camera.core.FlashMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$androidx$camera$core$FlashMode = r0
                androidx.camera.core.FlashMode r1 = androidx.camera.core.FlashMode.OFF     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$androidx$camera$core$FlashMode     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.camera.core.FlashMode r1 = androidx.camera.core.FlashMode.ON     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$androidx$camera$core$FlashMode     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.camera.core.FlashMode r1 = androidx.camera.core.FlashMode.AUTO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.Camera2CameraControl.C034614.<clinit>():void");
        }
    }

    public static final class CameraControlSessionCallback extends CameraCaptureSession.CaptureCallback {
        public final Executor mExecutor;
        public final Set<CaptureResultListener> mResultListeners = new HashSet();

        public CameraControlSessionCallback(@NonNull Executor executor) {
            this.mExecutor = executor;
        }

        @WorkerThread
        public void addListener(CaptureResultListener captureResultListener) {
            this.mResultListeners.add(captureResultListener);
        }

        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull final TotalCaptureResult totalCaptureResult) {
            this.mExecutor.execute(new Runnable() {
                public void run() {
                    HashSet hashSet = new HashSet();
                    for (CaptureResultListener next : CameraControlSessionCallback.this.mResultListeners) {
                        if (next.onCaptureResult(totalCaptureResult)) {
                            hashSet.add(next);
                        }
                    }
                    if (!hashSet.isEmpty()) {
                        CameraControlSessionCallback.this.mResultListeners.removeAll(hashSet);
                    }
                }
            });
        }

        @WorkerThread
        public void removeListener(CaptureResultListener captureResultListener) {
            this.mResultListeners.remove(captureResultListener);
        }
    }

    public interface CaptureResultListener {
        boolean onCaptureResult(TotalCaptureResult totalCaptureResult);
    }

    public Camera2CameraControl(@NonNull CameraControl.ControlUpdateListener controlUpdateListener, @NonNull ScheduledExecutorService scheduledExecutorService, @NonNull Executor executor) {
        this(controlUpdateListener, 5000, scheduledExecutorService, executor);
    }

    @WorkerThread
    private void cancelFocusTimeout() {
        ScheduledFuture<?> scheduledFuture = this.mFocusTimeoutHandle;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.mFocusTimeoutHandle = null;
        }
    }

    private CaptureConfig.Builder createCaptureBuilderWithSharedOptions() {
        CaptureConfig.Builder builder = new CaptureConfig.Builder();
        builder.addImplementationOptions(getSharedOptions());
        return builder;
    }

    @WorkerThread
    private int getDefaultTemplate() {
        return 1;
    }

    @WorkerThread
    private void notifyCaptureRequests(List<CaptureConfig> list) {
        this.mControlUpdateListener.onCameraControlCaptureRequests(list);
    }

    public void cancelAfAeTrigger(final boolean z, final boolean z2) {
        this.mExecutor.execute(new Runnable() {
            public void run() {
                Camera2CameraControl.this.cancelAfAeTriggerInternal(z, z2);
            }
        });
    }

    @WorkerThread
    public void cancelAfAeTriggerInternal(boolean z, boolean z2) {
        CaptureConfig.Builder createCaptureBuilderWithSharedOptions = createCaptureBuilderWithSharedOptions();
        createCaptureBuilderWithSharedOptions.setUseRepeatingSurface(true);
        createCaptureBuilderWithSharedOptions.setTemplateType(getDefaultTemplate());
        Camera2Config.Builder builder = new Camera2Config.Builder();
        if (z) {
            builder.setCaptureRequestOption(CaptureRequest.CONTROL_AF_TRIGGER, 2);
        }
        if (Build.VERSION.SDK_INT >= 23 && z2) {
            builder.setCaptureRequestOption(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
        }
        createCaptureBuilderWithSharedOptions.addImplementationOptions(builder.build());
        notifyCaptureRequests(Collections.singletonList(createCaptureBuilderWithSharedOptions.build()));
    }

    @VisibleForTesting
    public void cancelFocus() {
        this.mExecutor.execute(new Runnable() {
            public void run() {
                Camera2CameraControl.this.cancelFocusInternal();
            }
        });
    }

    @WorkerThread
    public void cancelFocusInternal() {
        cancelFocusTimeout();
        MeteringRectangle meteringRectangle = new MeteringRectangle(new Rect(), 0);
        this.mAfRect = meteringRectangle;
        this.mAeRect = meteringRectangle;
        this.mAwbRect = meteringRectangle;
        CaptureConfig.Builder createCaptureBuilderWithSharedOptions = createCaptureBuilderWithSharedOptions();
        createCaptureBuilderWithSharedOptions.setTemplateType(getDefaultTemplate());
        createCaptureBuilderWithSharedOptions.setUseRepeatingSurface(true);
        Camera2Config.Builder builder = new Camera2Config.Builder();
        builder.setCaptureRequestOption(CaptureRequest.CONTROL_AF_TRIGGER, 2);
        createCaptureBuilderWithSharedOptions.addImplementationOptions(builder.build());
        notifyCaptureRequests(Collections.singletonList(createCaptureBuilderWithSharedOptions.build()));
        this.mIsFocusLocked = false;
        updateSessionConfig();
    }

    public void enableTorch(final boolean z) {
        this.mIsTorchOn = z;
        this.mExecutor.execute(new Runnable() {
            public void run() {
                Camera2CameraControl.this.enableTorchInternal(z);
            }
        });
    }

    @WorkerThread
    public void enableTorchInternal(boolean z) {
        if (!z) {
            CaptureConfig.Builder createCaptureBuilderWithSharedOptions = createCaptureBuilderWithSharedOptions();
            createCaptureBuilderWithSharedOptions.setTemplateType(getDefaultTemplate());
            createCaptureBuilderWithSharedOptions.setUseRepeatingSurface(true);
            Camera2Config.Builder builder = new Camera2Config.Builder();
            builder.setCaptureRequestOption(CaptureRequest.CONTROL_AE_MODE, 1);
            builder.setCaptureRequestOption(CaptureRequest.FLASH_MODE, 0);
            createCaptureBuilderWithSharedOptions.addImplementationOptions(builder.build());
            notifyCaptureRequests(Collections.singletonList(createCaptureBuilderWithSharedOptions.build()));
        }
        updateSessionConfig();
    }

    @SuppressLint({"LambdaLast"})
    public void focus(@NonNull Rect rect, @NonNull Rect rect2, @NonNull Executor executor, @NonNull OnFocusListener onFocusListener) {
        final Rect rect3 = rect;
        final Rect rect4 = rect2;
        final Executor executor2 = executor;
        final OnFocusListener onFocusListener2 = onFocusListener;
        this.mExecutor.execute(new Runnable() {
            public void run() {
                Camera2CameraControl.this.focusInternal(rect3, rect4, executor2, onFocusListener2);
            }
        });
    }

    @WorkerThread
    public void focusInternal(Rect rect, Rect rect2, @NonNull final Executor executor, @Nullable final OnFocusListener onFocusListener) {
        this.mSessionCallback.removeListener(this.mSessionListenerForFocus);
        cancelFocusTimeout();
        this.mAfRect = new MeteringRectangle(rect, 1000);
        this.mAeRect = new MeteringRectangle(rect2, 1000);
        this.mAwbRect = new MeteringRectangle(rect2, 1000);
        "Setting new AF rectangle: " + this.mAfRect;
        "Setting new AE rectangle: " + this.mAeRect;
        "Setting new AWB rectangle: " + this.mAwbRect;
        this.mCurrentAfState = 0;
        this.mIsFocusLocked = true;
        if (onFocusListener != null) {
            C034012 r9 = new CaptureResultListener() {
                @WorkerThread
                public boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
                    Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                    if (num == null) {
                        return false;
                    }
                    if (Camera2CameraControl.this.mCurrentAfState.intValue() == 3) {
                        if (num.intValue() == 4) {
                            executor.execute(new Runnable() {
                                public void run() {
                                    C034012 r0 = C034012.this;
                                    onFocusListener.onFocusLocked(Camera2CameraControl.this.mAfRect.getRect());
                                }
                            });
                            return true;
                        } else if (num.intValue() == 5) {
                            executor.execute(new Runnable() {
                                public void run() {
                                    C034012 r0 = C034012.this;
                                    onFocusListener.onFocusUnableToLock(Camera2CameraControl.this.mAfRect.getRect());
                                }
                            });
                            return true;
                        }
                    }
                    if (!Camera2CameraControl.this.mCurrentAfState.equals(num)) {
                        Camera2CameraControl.this.mCurrentAfState = num;
                    }
                    return false;
                }
            };
            this.mSessionListenerForFocus = r9;
            this.mSessionCallback.addListener(r9);
        }
        updateSessionConfig();
        triggerAfInternal();
        if (this.mFocusTimeoutMs > 0) {
            final long j = this.mFocusTimeoutCounter + 1;
            this.mFocusTimeoutCounter = j;
            final OnFocusListener onFocusListener2 = onFocusListener;
            final Executor executor2 = executor;
            this.mFocusTimeoutHandle = this.mScheduler.schedule(new Runnable() {
                public void run() {
                    Camera2CameraControl.this.mExecutor.execute(new Runnable() {
                        @WorkerThread
                        public void run() {
                            C034313 r0 = C034313.this;
                            long j = j;
                            Camera2CameraControl camera2CameraControl = Camera2CameraControl.this;
                            if (j == camera2CameraControl.mFocusTimeoutCounter) {
                                camera2CameraControl.cancelFocusInternal();
                                Camera2CameraControl camera2CameraControl2 = Camera2CameraControl.this;
                                camera2CameraControl2.mSessionCallback.removeListener(camera2CameraControl2.mSessionListenerForFocus);
                                C034313 r02 = C034313.this;
                                if (onFocusListener2 != null && Camera2CameraControl.this.mCurrentAfState.intValue() == 3) {
                                    executor2.execute(new Runnable() {
                                        public void run() {
                                            C034313 r0 = C034313.this;
                                            onFocusListener2.onFocusTimedOut(Camera2CameraControl.this.mAfRect.getRect());
                                        }
                                    });
                                }
                            }
                        }
                    });
                }
            }, this.mFocusTimeoutMs, TimeUnit.MILLISECONDS);
        }
    }

    public FlashMode getFlashMode() {
        return this.mFlashMode;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007e  */
    @androidx.annotation.VisibleForTesting
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.camera.core.Config getSharedOptions() {
        /*
            r7 = this;
            androidx.camera.camera2.Camera2Config$Builder r0 = new androidx.camera.camera2.Camera2Config$Builder
            r0.<init>()
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_MODE
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.setCaptureRequestOption(r1, r3)
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE
            boolean r4 = r7.isFocusLocked()
            if (r4 == 0) goto L_0x0019
            r4 = r2
            goto L_0x001a
        L_0x0019:
            r4 = 4
        L_0x001a:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.setCaptureRequestOption(r1, r4)
            boolean r1 = r7.mIsTorchOn
            r4 = 3
            r5 = 2
            if (r1 == 0) goto L_0x0031
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.FLASH_MODE
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r0.setCaptureRequestOption(r1, r4)
            goto L_0x0041
        L_0x0031:
            int[] r1 = androidx.camera.camera2.impl.Camera2CameraControl.C034614.$SwitchMap$androidx$camera$core$FlashMode
            androidx.camera.core.FlashMode r6 = r7.mFlashMode
            int r6 = r6.ordinal()
            r1 = r1[r6]
            if (r1 == r2) goto L_0x0041
            if (r1 == r5) goto L_0x0044
            if (r1 == r4) goto L_0x0043
        L_0x0041:
            r4 = r2
            goto L_0x0044
        L_0x0043:
            r4 = r5
        L_0x0044:
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.setCaptureRequestOption(r1, r4)
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AWB_MODE
            r0.setCaptureRequestOption(r1, r3)
            android.hardware.camera2.params.MeteringRectangle r1 = r7.mAfRect
            r3 = 0
            if (r1 == 0) goto L_0x0060
            android.hardware.camera2.CaptureRequest$Key r4 = android.hardware.camera2.CaptureRequest.CONTROL_AF_REGIONS
            android.hardware.camera2.params.MeteringRectangle[] r5 = new android.hardware.camera2.params.MeteringRectangle[r2]
            r5[r3] = r1
            r0.setCaptureRequestOption(r4, r5)
        L_0x0060:
            android.hardware.camera2.params.MeteringRectangle r1 = r7.mAeRect
            if (r1 == 0) goto L_0x006d
            android.hardware.camera2.CaptureRequest$Key r4 = android.hardware.camera2.CaptureRequest.CONTROL_AE_REGIONS
            android.hardware.camera2.params.MeteringRectangle[] r5 = new android.hardware.camera2.params.MeteringRectangle[r2]
            r5[r3] = r1
            r0.setCaptureRequestOption(r4, r5)
        L_0x006d:
            android.hardware.camera2.params.MeteringRectangle r1 = r7.mAwbRect
            if (r1 == 0) goto L_0x007a
            android.hardware.camera2.CaptureRequest$Key r4 = android.hardware.camera2.CaptureRequest.CONTROL_AWB_REGIONS
            android.hardware.camera2.params.MeteringRectangle[] r2 = new android.hardware.camera2.params.MeteringRectangle[r2]
            r2[r3] = r1
            r0.setCaptureRequestOption(r4, r2)
        L_0x007a:
            android.graphics.Rect r1 = r7.mCropRect
            if (r1 == 0) goto L_0x0083
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.SCALER_CROP_REGION
            r0.setCaptureRequestOption(r2, r1)
        L_0x0083:
            androidx.camera.camera2.Camera2Config r0 = r0.build()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.Camera2CameraControl.getSharedOptions():androidx.camera.core.Config");
    }

    public boolean isFocusLocked() {
        return this.mIsFocusLocked;
    }

    public boolean isTorchOn() {
        return this.mIsTorchOn;
    }

    public void setCropRegion(final Rect rect) {
        this.mExecutor.execute(new Runnable() {
            public void run() {
                Camera2CameraControl.this.setCropRegionInternal(rect);
            }
        });
    }

    @WorkerThread
    public void setCropRegionInternal(Rect rect) {
        this.mCropRect = rect;
        updateSessionConfig();
    }

    public void setFlashMode(FlashMode flashMode) {
        this.mFlashMode = flashMode;
        this.mExecutor.execute(new Runnable() {
            public void run() {
                Camera2CameraControl.this.updateSessionConfig();
            }
        });
    }

    public void submitCaptureRequests(final List<CaptureConfig> list) {
        this.mExecutor.execute(new Runnable() {
            public void run() {
                Camera2CameraControl.this.submitCaptureRequestsInternal(list);
            }
        });
    }

    @WorkerThread
    public void submitCaptureRequestsInternal(List<CaptureConfig> list) {
        ArrayList arrayList = new ArrayList();
        for (CaptureConfig from : list) {
            CaptureConfig.Builder from2 = CaptureConfig.Builder.from(from);
            from2.addImplementationOptions(getSharedOptions());
            arrayList.add(from2.build());
        }
        notifyCaptureRequests(arrayList);
    }

    public void triggerAePrecapture() {
        this.mExecutor.execute(new Runnable() {
            public void run() {
                Camera2CameraControl.this.triggerAePrecaptureInternal();
            }
        });
    }

    @WorkerThread
    public void triggerAePrecaptureInternal() {
        CaptureConfig.Builder createCaptureBuilderWithSharedOptions = createCaptureBuilderWithSharedOptions();
        createCaptureBuilderWithSharedOptions.setTemplateType(getDefaultTemplate());
        createCaptureBuilderWithSharedOptions.setUseRepeatingSurface(true);
        Camera2Config.Builder builder = new Camera2Config.Builder();
        builder.setCaptureRequestOption(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
        createCaptureBuilderWithSharedOptions.addImplementationOptions(builder.build());
        notifyCaptureRequests(Collections.singletonList(createCaptureBuilderWithSharedOptions.build()));
    }

    public void triggerAf() {
        this.mExecutor.execute(new Runnable() {
            public void run() {
                Camera2CameraControl.this.triggerAfInternal();
            }
        });
    }

    @WorkerThread
    public void triggerAfInternal() {
        CaptureConfig.Builder createCaptureBuilderWithSharedOptions = createCaptureBuilderWithSharedOptions();
        createCaptureBuilderWithSharedOptions.setTemplateType(getDefaultTemplate());
        createCaptureBuilderWithSharedOptions.setUseRepeatingSurface(true);
        Camera2Config.Builder builder = new Camera2Config.Builder();
        builder.setCaptureRequestOption(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        createCaptureBuilderWithSharedOptions.addImplementationOptions(builder.build());
        notifyCaptureRequests(Collections.singletonList(createCaptureBuilderWithSharedOptions.build()));
    }

    @WorkerThread
    public void updateSessionConfig() {
        this.mSessionConfigBuilder.setImplementationOptions(getSharedOptions());
        this.mControlUpdateListener.onCameraControlUpdateSessionConfig(this.mSessionConfigBuilder.build());
    }

    public Camera2CameraControl(@NonNull CameraControl.ControlUpdateListener controlUpdateListener, long j, @NonNull ScheduledExecutorService scheduledExecutorService, @NonNull Executor executor) {
        this.mSessionConfigBuilder = new SessionConfig.Builder();
        this.mIsTorchOn = false;
        this.mIsFocusLocked = false;
        this.mFlashMode = FlashMode.OFF;
        this.mSessionListenerForFocus = null;
        this.mCropRect = null;
        this.mCurrentAfState = 0;
        this.mFocusTimeoutCounter = 0;
        this.mControlUpdateListener = controlUpdateListener;
        if (CameraXExecutors.isSequentialExecutor(executor)) {
            this.mExecutor = executor;
        } else {
            this.mExecutor = CameraXExecutors.newSequentialExecutor(executor);
        }
        this.mScheduler = scheduledExecutorService;
        this.mFocusTimeoutMs = j;
        this.mSessionCallback = new CameraControlSessionCallback(this.mExecutor);
        this.mSessionConfigBuilder.setTemplateType(getDefaultTemplate());
        this.mSessionConfigBuilder.addRepeatingCameraCaptureCallback(CaptureCallbackContainer.create(this.mSessionCallback));
        this.mExecutor.execute(new Runnable() {
            public void run() {
                Camera2CameraControl.this.updateSessionConfig();
            }
        });
    }

    public void focus(@NonNull final Rect rect, @NonNull final Rect rect2) {
        this.mExecutor.execute(new Runnable() {
            public void run() {
                Camera2CameraControl.this.focusInternal(rect, rect2, CameraXExecutors.directExecutor(), (OnFocusListener) null);
            }
        });
    }
}
