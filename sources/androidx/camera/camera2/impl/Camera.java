package androidx.camera.camera2.impl;

import android.annotation.SuppressLint;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.camera.core.BaseCamera;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraDeviceStateCallbacks;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraX;
import androidx.camera.core.CaptureConfig;
import androidx.camera.core.DeferrableSurface;
import androidx.camera.core.ImmediateSurface;
import androidx.camera.core.SessionConfig;
import androidx.camera.core.UseCase;
import androidx.camera.core.UseCaseAttachState;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

public final class Camera implements BaseCamera {
    public static final String TAG = "Camera";
    public final Object mAttachedUseCaseLock = new Object();
    public final CameraControl mCameraControl;
    public SessionConfig mCameraControlSessionConfig = SessionConfig.defaultEmptySessionConfig();
    @Nullable
    public CameraDevice mCameraDevice;
    public final String mCameraId;
    @GuardedBy("mCameraInfoLock")
    @Nullable
    public CameraInfo mCameraInfo;
    public final Object mCameraInfoLock = new Object();
    public final CameraManager mCameraManager;
    public CaptureSession mCaptureSession = new CaptureSession((Handler) null);
    @GuardedBy("mClosedCaptureSessions")
    public List<CaptureSession> mClosedCaptureSessions = new ArrayList();
    public final Handler mHandler;
    @GuardedBy("mPendingLock")
    public final List<UseCase> mPendingForAddOnline = new ArrayList();
    public final Object mPendingLock = new Object();
    public final AtomicReference<State> mState = new AtomicReference<>(State.UNINITIALIZED);
    public final StateCallback mStateCallback = new StateCallback();
    @GuardedBy("mAttachedUseCaseLock")
    public final UseCaseAttachState mUseCaseAttachState;

    /* renamed from: androidx.camera.camera2.impl.Camera$13 */
    public static /* synthetic */ class C032813 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$camera$camera2$impl$Camera$State;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.camera.camera2.impl.Camera$State[] r0 = androidx.camera.camera2.impl.Camera.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$androidx$camera$camera2$impl$Camera$State = r0
                androidx.camera.camera2.impl.Camera$State r1 = androidx.camera.camera2.impl.Camera.State.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$androidx$camera$camera2$impl$Camera$State     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.camera.camera2.impl.Camera$State r1 = androidx.camera.camera2.impl.Camera.State.CLOSING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$androidx$camera$camera2$impl$Camera$State     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.camera.camera2.impl.Camera$State r1 = androidx.camera.camera2.impl.Camera.State.OPENED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$androidx$camera$camera2$impl$Camera$State     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.camera.camera2.impl.Camera$State r1 = androidx.camera.camera2.impl.Camera.State.OPENING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$androidx$camera$camera2$impl$Camera$State     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.camera.camera2.impl.Camera$State r1 = androidx.camera.camera2.impl.Camera.State.REOPENING     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$androidx$camera$camera2$impl$Camera$State     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.camera.camera2.impl.Camera$State r1 = androidx.camera.camera2.impl.Camera.State.RELEASING     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.Camera.C032813.<clinit>():void");
        }
    }

    public enum State {
        UNINITIALIZED,
        INITIALIZED,
        OPENING,
        OPENED,
        CLOSING,
        REOPENING,
        RELEASING,
        RELEASED
    }

    public final class StateCallback extends CameraDevice.StateCallback {
        public StateCallback() {
        }

        private String getErrorMessage(int i) {
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE" : "ERROR_CAMERA_DEVICE" : "ERROR_CAMERA_DISABLED" : "ERROR_MAX_CAMERAS_IN_USE" : "ERROR_CAMERA_IN_USE";
        }

        public void onClosed(CameraDevice cameraDevice) {
            "CameraDevice.onClosed(): " + cameraDevice.getId();
            Camera.this.resetCaptureSession();
            int i = C032813.$SwitchMap$androidx$camera$camera2$impl$Camera$State[Camera.this.mState.get().ordinal()];
            if (i == 2) {
                Camera.this.mState.set(State.INITIALIZED);
                Camera.this.mCameraDevice = null;
            } else if (i == 5) {
                Camera.this.mState.set(State.OPENING);
                Camera.this.openCameraDevice();
            } else if (i != 6) {
                CameraX.postError(CameraX.ErrorCode.CAMERA_STATE_INCONSISTENT, "Camera closed while in state: " + Camera.this.mState.get());
            } else {
                Camera.this.mState.set(State.RELEASED);
                Camera.this.mCameraDevice = null;
            }
        }

        public void onDisconnected(CameraDevice cameraDevice) {
            "CameraDevice.onDisconnected(): " + cameraDevice.getId();
            Camera.this.resetCaptureSession();
            int i = C032813.$SwitchMap$androidx$camera$camera2$impl$Camera$State[Camera.this.mState.get().ordinal()];
            if (i == 2) {
                Camera.this.mState.set(State.INITIALIZED);
                Camera.this.mCameraDevice = null;
            } else if (i == 3 || i == 4 || i == 5) {
                Camera.this.mState.set(State.CLOSING);
                cameraDevice.close();
                Camera.this.mCameraDevice = null;
            } else if (i == 6) {
                Camera.this.mState.set(State.RELEASED);
                cameraDevice.close();
                Camera.this.mCameraDevice = null;
            } else {
                throw new IllegalStateException("onDisconnected() should not be possible from state: " + Camera.this.mState.get());
            }
        }

        public void onError(CameraDevice cameraDevice, int i) {
            "CameraDevice.onError(): " + cameraDevice.getId() + " with error: " + getErrorMessage(i);
            Camera.this.resetCaptureSession();
            int i2 = C032813.$SwitchMap$androidx$camera$camera2$impl$Camera$State[Camera.this.mState.get().ordinal()];
            if (i2 == 2) {
                Camera.this.mState.set(State.INITIALIZED);
                Camera.this.mCameraDevice = null;
            } else if (i2 == 3 || i2 == 4 || i2 == 5) {
                Camera.this.mState.set(State.CLOSING);
                cameraDevice.close();
                Camera.this.mCameraDevice = null;
            } else if (i2 == 6) {
                Camera.this.mState.set(State.RELEASED);
                cameraDevice.close();
                Camera.this.mCameraDevice = null;
            } else {
                throw new IllegalStateException("onError() should not be possible from state: " + Camera.this.mState.get());
            }
        }

        public void onOpened(CameraDevice cameraDevice) {
            "CameraDevice.onOpened(): " + cameraDevice.getId();
            int i = C032813.$SwitchMap$androidx$camera$camera2$impl$Camera$State[Camera.this.mState.get().ordinal()];
            if (i != 2) {
                if (i == 4 || i == 5) {
                    Camera.this.mState.set(State.OPENED);
                    Camera camera = Camera.this;
                    camera.mCameraDevice = cameraDevice;
                    camera.openCaptureSession();
                    return;
                } else if (i != 6) {
                    throw new IllegalStateException("onOpened() should not be possible from state: " + Camera.this.mState.get());
                }
            }
            cameraDevice.close();
            Camera.this.mCameraDevice = null;
        }
    }

    public Camera(CameraManager cameraManager, String str, Handler handler) {
        this.mCameraManager = cameraManager;
        this.mCameraId = str;
        this.mHandler = handler;
        ScheduledExecutorService newHandlerExecutor = CameraXExecutors.newHandlerExecutor(handler);
        this.mUseCaseAttachState = new UseCaseAttachState(str);
        this.mState.set(State.INITIALIZED);
        this.mCameraControl = new Camera2CameraControl(this, newHandlerExecutor, newHandlerExecutor);
        this.mCaptureSession = new CaptureSession(this.mHandler);
    }

    private boolean checkAndAttachRepeatingSurface(CaptureConfig.Builder builder) {
        Collection<UseCase> activeAndOnlineUseCases;
        if (!builder.getSurfaces().isEmpty()) {
            return false;
        }
        synchronized (this.mAttachedUseCaseLock) {
            activeAndOnlineUseCases = this.mUseCaseAttachState.getActiveAndOnlineUseCases();
        }
        for (UseCase sessionConfig : activeAndOnlineUseCases) {
            List<DeferrableSurface> surfaces = sessionConfig.getSessionConfig(this.mCameraId).getRepeatingCaptureConfig().getSurfaces();
            if (!surfaces.isEmpty()) {
                for (DeferrableSurface addSurface : surfaces) {
                    builder.addSurface(addSurface);
                }
            }
        }
        if (builder.getSurfaces().isEmpty()) {
            return false;
        }
        return true;
    }

    private void configAndClose() {
        int i = C032813.$SwitchMap$androidx$camera$camera2$impl$Camera$State[this.mState.get().ordinal()];
        if (i == 3) {
            this.mState.set(State.CLOSING);
            resetCaptureSession();
            final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
            surfaceTexture.setDefaultBufferSize(640, 480);
            final Surface surface = new Surface(surfaceTexture);
            final C03303 r2 = new Runnable() {
                public void run() {
                    surface.release();
                    surfaceTexture.release();
                }
            };
            SessionConfig.Builder builder = new SessionConfig.Builder();
            builder.addNonRepeatingSurface(new ImmediateSurface(surface));
            builder.setTemplateType(1);
            builder.addSessionStateCallback(new CameraCaptureSession.StateCallback() {
                public void onClosed(@NonNull CameraCaptureSession cameraCaptureSession) {
                    Camera.this.closeCameraResource();
                    r2.run();
                }

                public void onConfigureFailed(@NonNull CameraCaptureSession cameraCaptureSession) {
                    Camera.this.closeCameraResource();
                    r2.run();
                }

                public void onConfigured(@NonNull CameraCaptureSession cameraCaptureSession) {
                    cameraCaptureSession.close();
                }
            });
            try {
                new CaptureSession((Handler) null).open(builder.build(), this.mCameraDevice);
            } catch (CameraAccessException e) {
                "Unable to configure camera " + this.mCameraId + " due to " + e.getMessage();
                r2.run();
            }
        } else if (i == 4 || i == 5) {
            this.mState.set(State.CLOSING);
        } else {
            "configAndClose() ignored due to being in state: " + this.mState.get();
        }
    }

    private CameraDevice.StateCallback createDeviceStateCallback() {
        CameraDevice.StateCallback createComboCallback;
        synchronized (this.mAttachedUseCaseLock) {
            ArrayList arrayList = new ArrayList(this.mUseCaseAttachState.getOnlineBuilder().build().getDeviceStateCallbacks());
            arrayList.add(this.mStateCallback);
            createComboCallback = CameraDeviceStateCallbacks.createComboCallback((List<CameraDevice.StateCallback>) arrayList);
        }
        return createComboCallback;
    }

    private void notifyCameraDeviceCloseToCaptureSessions() {
        synchronized (this.mClosedCaptureSessions) {
            for (CaptureSession notifyCameraDeviceClose : this.mClosedCaptureSessions) {
                notifyCameraDeviceClose.notifyCameraDeviceClose();
            }
            this.mClosedCaptureSessions.clear();
        }
        this.mCaptureSession.notifyCameraDeviceClose();
    }

    @GuardedBy("mAttachedUseCaseLock")
    private void reattachUseCaseSurfaces(UseCase useCase) {
        if (isUseCaseOnline(useCase)) {
            SessionConfig useCaseSessionConfig = this.mUseCaseAttachState.getUseCaseSessionConfig(useCase);
            SessionConfig sessionConfig = useCase.getSessionConfig(this.mCameraId);
            List<DeferrableSurface> surfaces = useCaseSessionConfig.getSurfaces();
            List<DeferrableSurface> surfaces2 = sessionConfig.getSurfaces();
            for (DeferrableSurface next : surfaces2) {
                if (!surfaces.contains(next)) {
                    next.notifySurfaceAttached();
                }
            }
            for (DeferrableSurface next2 : surfaces) {
                if (!surfaces2.contains(next2)) {
                    next2.notifySurfaceDetached();
                }
            }
        }
    }

    private void updateCaptureSessionConfig() {
        SessionConfig.ValidatingBuilder activeAndOnlineBuilder;
        synchronized (this.mAttachedUseCaseLock) {
            activeAndOnlineBuilder = this.mUseCaseAttachState.getActiveAndOnlineBuilder();
        }
        if (activeAndOnlineBuilder.isValid()) {
            activeAndOnlineBuilder.add(this.mCameraControlSessionConfig);
            this.mCaptureSession.setSessionConfig(activeAndOnlineBuilder.build());
        }
    }

    public void addOnlineUseCase(final Collection<UseCase> collection) {
        if (!collection.isEmpty()) {
            synchronized (this.mPendingLock) {
                for (UseCase next : collection) {
                    boolean isUseCaseOnline = isUseCaseOnline(next);
                    if (!this.mPendingForAddOnline.contains(next)) {
                        if (!isUseCaseOnline) {
                            notifyAttachToUseCaseSurfaces(next);
                            this.mPendingForAddOnline.add(next);
                        }
                    }
                }
            }
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new Runnable() {
                    public void run() {
                        Camera.this.addOnlineUseCase(collection);
                    }
                });
                return;
            }
            "Use cases " + collection + " ONLINE for camera " + this.mCameraId;
            synchronized (this.mAttachedUseCaseLock) {
                for (UseCase useCaseOnline : collection) {
                    this.mUseCaseAttachState.setUseCaseOnline(useCaseOnline);
                }
            }
            synchronized (this.mPendingLock) {
                this.mPendingForAddOnline.removeAll(collection);
            }
            open();
            updateCaptureSessionConfig();
            openCaptureSession();
        }
    }

    public void close() {
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                public void run() {
                    Camera.this.close();
                }
            });
            return;
        }
        "Closing camera: " + this.mCameraId;
        int i = C032813.$SwitchMap$androidx$camera$camera2$impl$Camera$State[this.mState.get().ordinal()];
        if (i == 3) {
            this.mState.set(State.CLOSING);
            closeCameraResource();
        } else if (i == 4 || i == 5) {
            resetCaptureSession();
            this.mState.set(State.CLOSING);
        } else {
            "close() ignored due to being in state: " + this.mState.get();
        }
    }

    public void closeCameraResource() {
        this.mCaptureSession.close();
        this.mCaptureSession.release();
        this.mCameraDevice.close();
        notifyCameraDeviceCloseToCaptureSessions();
        this.mCameraDevice = null;
        resetCaptureSession();
    }

    public CameraControl getCameraControl() {
        return this.mCameraControl;
    }

    public CameraInfo getCameraInfo() {
        CameraInfo cameraInfo;
        synchronized (this.mCameraInfoLock) {
            if (this.mCameraInfo == null) {
                this.mCameraInfo = new Camera2CameraInfo(this.mCameraManager, this.mCameraId);
            }
            cameraInfo = this.mCameraInfo;
        }
        return cameraInfo;
    }

    public boolean isUseCaseOnline(UseCase useCase) {
        boolean isUseCaseOnline;
        synchronized (this.mAttachedUseCaseLock) {
            isUseCaseOnline = this.mUseCaseAttachState.isUseCaseOnline(useCase);
        }
        return isUseCaseOnline;
    }

    public void notifyAttachToUseCaseSurfaces(UseCase useCase) {
        for (DeferrableSurface notifySurfaceAttached : useCase.getSessionConfig(this.mCameraId).getSurfaces()) {
            notifySurfaceAttached.notifySurfaceAttached();
        }
    }

    public void notifyDetachFromUseCaseSurfaces(UseCase useCase) {
        for (DeferrableSurface notifySurfaceDetached : useCase.getSessionConfig(this.mCameraId).getSurfaces()) {
            notifySurfaceDetached.notifySurfaceDetached();
        }
    }

    public void onCameraControlCaptureRequests(List<CaptureConfig> list) {
        submitCaptureRequests(list);
    }

    public void onCameraControlUpdateSessionConfig(SessionConfig sessionConfig) {
        this.mCameraControlSessionConfig = sessionConfig;
        updateCaptureSessionConfig();
    }

    public void onUseCaseActive(final UseCase useCase) {
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                public void run() {
                    Camera.this.onUseCaseActive(useCase);
                }
            });
            return;
        }
        "Use case " + useCase + " ACTIVE for camera " + this.mCameraId;
        synchronized (this.mAttachedUseCaseLock) {
            reattachUseCaseSurfaces(useCase);
            this.mUseCaseAttachState.setUseCaseActive(useCase);
        }
        updateCaptureSessionConfig();
    }

    public void onUseCaseInactive(final UseCase useCase) {
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                public void run() {
                    Camera.this.onUseCaseInactive(useCase);
                }
            });
            return;
        }
        "Use case " + useCase + " INACTIVE for camera " + this.mCameraId;
        synchronized (this.mAttachedUseCaseLock) {
            this.mUseCaseAttachState.setUseCaseInactive(useCase);
        }
        updateCaptureSessionConfig();
    }

    public void onUseCaseReset(final UseCase useCase) {
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                public void run() {
                    Camera.this.onUseCaseReset(useCase);
                }
            });
            return;
        }
        "Use case " + useCase + " RESET for camera " + this.mCameraId;
        synchronized (this.mAttachedUseCaseLock) {
            reattachUseCaseSurfaces(useCase);
            this.mUseCaseAttachState.updateUseCase(useCase);
        }
        updateCaptureSessionConfig();
        openCaptureSession();
    }

    public void onUseCaseUpdated(final UseCase useCase) {
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                public void run() {
                    Camera.this.onUseCaseUpdated(useCase);
                }
            });
            return;
        }
        "Use case " + useCase + " UPDATED for camera " + this.mCameraId;
        synchronized (this.mAttachedUseCaseLock) {
            reattachUseCaseSurfaces(useCase);
            this.mUseCaseAttachState.updateUseCase(useCase);
        }
        updateCaptureSessionConfig();
    }

    public void open() {
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                public void run() {
                    Camera.this.open();
                }
            });
            return;
        }
        int i = C032813.$SwitchMap$androidx$camera$camera2$impl$Camera$State[this.mState.get().ordinal()];
        if (i == 1) {
            openCameraDevice();
        } else if (i != 2) {
            "open() ignored due to being in state: " + this.mState.get();
        } else {
            this.mState.set(State.REOPENING);
        }
    }

    @SuppressLint({"MissingPermission"})
    public void openCameraDevice() {
        this.mState.set(State.OPENING);
        "Opening camera: " + this.mCameraId;
        try {
            this.mCameraManager.openCamera(this.mCameraId, createDeviceStateCallback(), this.mHandler);
        } catch (CameraAccessException e) {
            "Unable to open camera " + this.mCameraId + " due to " + e.getMessage();
            this.mState.set(State.INITIALIZED);
        }
    }

    public void openCaptureSession() {
        SessionConfig.ValidatingBuilder onlineBuilder;
        if (this.mState.get() != State.OPENED) {
            "openCaptureSession() ignored due to being in state: " + this.mState.get();
            return;
        }
        synchronized (this.mAttachedUseCaseLock) {
            onlineBuilder = this.mUseCaseAttachState.getOnlineBuilder();
        }
        if (onlineBuilder.isValid() && this.mCameraDevice != null) {
            List<CaptureConfig> captureConfigs = this.mCaptureSession.getCaptureConfigs();
            resetCaptureSession();
            SessionConfig build = onlineBuilder.build();
            if (!captureConfigs.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (CaptureConfig next : captureConfigs) {
                    if (build.getSurfaces().containsAll(next.getSurfaces())) {
                        arrayList.add(next);
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.mCaptureSession.issueCaptureRequests(arrayList);
                }
            }
            try {
                this.mCaptureSession.open(build, this.mCameraDevice);
            } catch (CameraAccessException e) {
                "Unable to configure camera " + this.mCameraId + " due to " + e.getMessage();
            }
        }
    }

    public void release() {
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                public void run() {
                    Camera.this.release();
                }
            });
            return;
        }
        int i = C032813.$SwitchMap$androidx$camera$camera2$impl$Camera$State[this.mState.get().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    this.mState.set(State.RELEASING);
                    this.mCameraDevice.close();
                    notifyCameraDeviceCloseToCaptureSessions();
                    return;
                } else if (!(i == 4 || i == 5)) {
                    "release() ignored due to being in state: " + this.mState.get();
                    return;
                }
            }
            this.mState.set(State.RELEASING);
            return;
        }
        this.mState.set(State.RELEASED);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:23|24|25|26|(1:28)|29|30|(1:36)(1:35)) */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a6, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0090 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void removeOnlineUseCase(final java.util.Collection<androidx.camera.core.UseCase> r5) {
        /*
            r4 = this;
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Handler r1 = r4.mHandler
            android.os.Looper r1 = r1.getLooper()
            if (r0 == r1) goto L_0x001e
            android.os.Handler r0 = r4.mHandler
            androidx.camera.camera2.impl.Camera$11 r1 = new androidx.camera.camera2.impl.Camera$11
            r1.<init>(r5)
            r0.post(r1)
            return
        L_0x001e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Use cases "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = " OFFLINE for camera "
            r0.append(r1)
            java.lang.String r1 = r4.mCameraId
            r0.append(r1)
            r0.toString()
            java.lang.Object r0 = r4.mAttachedUseCaseLock
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x00af }
            r1.<init>()     // Catch:{ all -> 0x00af }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x00af }
        L_0x0044:
            boolean r2 = r5.hasNext()     // Catch:{ all -> 0x00af }
            if (r2 == 0) goto L_0x0061
            java.lang.Object r2 = r5.next()     // Catch:{ all -> 0x00af }
            androidx.camera.core.UseCase r2 = (androidx.camera.core.UseCase) r2     // Catch:{ all -> 0x00af }
            androidx.camera.core.UseCaseAttachState r3 = r4.mUseCaseAttachState     // Catch:{ all -> 0x00af }
            boolean r3 = r3.isUseCaseOnline(r2)     // Catch:{ all -> 0x00af }
            if (r3 == 0) goto L_0x005b
            r1.add(r2)     // Catch:{ all -> 0x00af }
        L_0x005b:
            androidx.camera.core.UseCaseAttachState r3 = r4.mUseCaseAttachState     // Catch:{ all -> 0x00af }
            r3.setUseCaseOffline(r2)     // Catch:{ all -> 0x00af }
            goto L_0x0044
        L_0x0061:
            java.util.Iterator r5 = r1.iterator()     // Catch:{ all -> 0x00af }
        L_0x0065:
            boolean r1 = r5.hasNext()     // Catch:{ all -> 0x00af }
            if (r1 == 0) goto L_0x0075
            java.lang.Object r1 = r5.next()     // Catch:{ all -> 0x00af }
            androidx.camera.core.UseCase r1 = (androidx.camera.core.UseCase) r1     // Catch:{ all -> 0x00af }
            r4.notifyDetachFromUseCaseSurfaces(r1)     // Catch:{ all -> 0x00af }
            goto L_0x0065
        L_0x0075:
            androidx.camera.core.UseCaseAttachState r5 = r4.mUseCaseAttachState     // Catch:{ all -> 0x00af }
            java.util.Collection r5 = r5.getOnlineUseCases()     // Catch:{ all -> 0x00af }
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x00af }
            if (r5 == 0) goto L_0x00a7
            r5 = 0
            androidx.camera.core.CameraInfo r1 = r4.getCameraInfo()     // Catch:{ CameraInfoUnavailableException -> 0x0090 }
            androidx.camera.camera2.impl.Camera2CameraInfo r1 = (androidx.camera.camera2.impl.Camera2CameraInfo) r1     // Catch:{ CameraInfoUnavailableException -> 0x0090 }
            int r1 = r1.getSupportedHardwareLevel()     // Catch:{ CameraInfoUnavailableException -> 0x0090 }
            r2 = 2
            if (r1 != r2) goto L_0x0090
            r5 = 1
        L_0x0090:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00af }
            r2 = 23
            if (r1 <= r2) goto L_0x00a2
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00af }
            r2 = 29
            if (r1 >= r2) goto L_0x00a2
            if (r5 == 0) goto L_0x00a2
            r4.configAndClose()     // Catch:{ all -> 0x00af }
            goto L_0x00a5
        L_0x00a2:
            r4.close()     // Catch:{ all -> 0x00af }
        L_0x00a5:
            monitor-exit(r0)     // Catch:{ all -> 0x00af }
            return
        L_0x00a7:
            monitor-exit(r0)     // Catch:{ all -> 0x00af }
            r4.openCaptureSession()
            r4.updateCaptureSessionConfig()
            return
        L_0x00af:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00af }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.Camera.removeOnlineUseCase(java.util.Collection):void");
    }

    public void resetCaptureSession() {
        "Closing Capture Session: " + this.mCameraId;
        SessionConfig sessionConfig = this.mCaptureSession.getSessionConfig();
        this.mCaptureSession.close();
        this.mCaptureSession.release();
        if (this.mCameraDevice != null) {
            synchronized (this.mClosedCaptureSessions) {
                this.mClosedCaptureSessions.add(this.mCaptureSession);
            }
        }
        CaptureSession captureSession = new CaptureSession(this.mHandler);
        this.mCaptureSession = captureSession;
        captureSession.setSessionConfig(sessionConfig);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void submitCaptureRequests(final List<CaptureConfig> list) {
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                public void run() {
                    Camera.this.submitCaptureRequests(list);
                }
            });
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (CaptureConfig next : list) {
            CaptureConfig.Builder from = CaptureConfig.Builder.from(next);
            if (!next.getSurfaces().isEmpty() || !next.isUseRepeatingSurface() || checkAndAttachRepeatingSurface(from)) {
                arrayList.add(from.build());
            }
        }
        "issue capture request for camera " + this.mCameraId;
        this.mCaptureSession.issueCaptureRequests(arrayList);
    }
}
