package androidx.camera.camera2.impl;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.camera2.Camera2Config;
import androidx.camera.core.CameraCaptureCallback;
import androidx.camera.core.CaptureConfig;
import androidx.camera.core.Config;
import androidx.camera.core.DeferrableSurface;
import androidx.camera.core.MutableOptionsBundle;
import androidx.camera.core.SessionConfig;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p040c.p200q.p353b.p360g.p361a.C6316e;

public final class CaptureSession {
    public static final String TAG = "CaptureSession";
    @Nullable
    public CameraCaptureSession mCameraCaptureSession;
    @Nullable
    public volatile Config mCameraEventOnRepeatingOptions;
    public final CameraCaptureSession.CaptureCallback mCaptureCallback = new CameraCaptureSession.CaptureCallback() {
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        }
    };
    public final List<CaptureConfig> mCaptureConfigs = new ArrayList();
    public final StateCallback mCaptureSessionStateCallback = new StateCallback();
    @GuardedBy("mConfiguredDeferrableSurfaces")
    public List<DeferrableSurface> mConfiguredDeferrableSurfaces = Collections.emptyList();
    public Map<DeferrableSurface, Surface> mConfiguredSurfaceMap = new HashMap();
    @Nullable
    public final Executor mExecutor;
    @Nullable
    public final Handler mHandler;
    @GuardedBy("mStateLock")
    public CallbackToFutureAdapter.Completer<Void> mReleaseCompleter;
    @GuardedBy("mStateLock")
    public C6316e<Void> mReleaseFuture;
    @Nullable
    public volatile SessionConfig mSessionConfig;
    @GuardedBy("mStateLock")
    public State mState = State.UNINITIALIZED;
    public final Object mStateLock = new Object();

    /* renamed from: androidx.camera.camera2.impl.CaptureSession$3 */
    public static /* synthetic */ class C03603 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$camera$camera2$impl$CaptureSession$State;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.camera.camera2.impl.CaptureSession$State[] r0 = androidx.camera.camera2.impl.CaptureSession.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$androidx$camera$camera2$impl$CaptureSession$State = r0
                androidx.camera.camera2.impl.CaptureSession$State r1 = androidx.camera.camera2.impl.CaptureSession.State.UNINITIALIZED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$androidx$camera$camera2$impl$CaptureSession$State     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.camera.camera2.impl.CaptureSession$State r1 = androidx.camera.camera2.impl.CaptureSession.State.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$androidx$camera$camera2$impl$CaptureSession$State     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.camera.camera2.impl.CaptureSession$State r1 = androidx.camera.camera2.impl.CaptureSession.State.OPENING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$androidx$camera$camera2$impl$CaptureSession$State     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.camera.camera2.impl.CaptureSession$State r1 = androidx.camera.camera2.impl.CaptureSession.State.OPENED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$androidx$camera$camera2$impl$CaptureSession$State     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.camera.camera2.impl.CaptureSession$State r1 = androidx.camera.camera2.impl.CaptureSession.State.CLOSED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$androidx$camera$camera2$impl$CaptureSession$State     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.camera.camera2.impl.CaptureSession$State r1 = androidx.camera.camera2.impl.CaptureSession.State.RELEASING     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$androidx$camera$camera2$impl$CaptureSession$State     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.camera.camera2.impl.CaptureSession$State r1 = androidx.camera.camera2.impl.CaptureSession.State.RELEASED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.CaptureSession.C03603.<clinit>():void");
        }
    }

    public enum State {
        UNINITIALIZED,
        INITIALIZED,
        OPENING,
        OPENED,
        CLOSED,
        RELEASING,
        RELEASED
    }

    public final class StateCallback extends CameraCaptureSession.StateCallback {
        public StateCallback() {
        }

        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            synchronized (CaptureSession.this.mStateLock) {
                if (CaptureSession.this.mState != State.UNINITIALIZED) {
                    CaptureSession.this.mState = State.RELEASED;
                    CaptureSession.this.mCameraCaptureSession = null;
                    CaptureSession.this.notifySurfaceDetached();
                    if (CaptureSession.this.mReleaseCompleter != null) {
                        CaptureSession.this.mReleaseCompleter.set(null);
                        CaptureSession.this.mReleaseCompleter = null;
                    }
                } else {
                    throw new IllegalStateException("onClosed() should not be possible in state: " + CaptureSession.this.mState);
                }
            }
        }

        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            synchronized (CaptureSession.this.mStateLock) {
                switch (C03603.$SwitchMap$androidx$camera$camera2$impl$CaptureSession$State[CaptureSession.this.mState.ordinal()]) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                        throw new IllegalStateException("onConfiguredFailed() should not be possible in state: " + CaptureSession.this.mState);
                    case 3:
                    case 5:
                        CaptureSession.this.mState = State.CLOSED;
                        CaptureSession.this.mCameraCaptureSession = cameraCaptureSession;
                        break;
                    case 6:
                        CaptureSession.this.mState = State.RELEASING;
                        cameraCaptureSession.close();
                        break;
                }
            }
        }

        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            synchronized (CaptureSession.this.mStateLock) {
                switch (C03603.$SwitchMap$androidx$camera$camera2$impl$CaptureSession$State[CaptureSession.this.mState.ordinal()]) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                        throw new IllegalStateException("onConfigured() should not be possible in state: " + CaptureSession.this.mState);
                    case 3:
                        CaptureSession.this.mState = State.OPENED;
                        CaptureSession.this.mCameraCaptureSession = cameraCaptureSession;
                        if (CaptureSession.this.mSessionConfig != null) {
                            List<CaptureConfig> onEnableSession = new Camera2Config(CaptureSession.this.mSessionConfig.getImplementationOptions()).getCameraEventCallback(CameraEventCallbacks.createEmptyCallback()).createComboCallback().onEnableSession();
                            if (!onEnableSession.isEmpty()) {
                                CaptureSession.this.issueCaptureRequests(CaptureSession.this.setupConfiguredSurface(onEnableSession));
                            }
                        }
                        CaptureSession.this.issueRepeatingCaptureRequests();
                        CaptureSession.this.issueBurstCaptureRequest();
                        break;
                    case 5:
                        CaptureSession.this.mCameraCaptureSession = cameraCaptureSession;
                        break;
                    case 6:
                        cameraCaptureSession.close();
                        break;
                }
                "CameraCaptureSession.onConfigured() mState=" + CaptureSession.this.mState;
            }
        }

        public void onReady(CameraCaptureSession cameraCaptureSession) {
            synchronized (CaptureSession.this.mStateLock) {
                if (C03603.$SwitchMap$androidx$camera$camera2$impl$CaptureSession$State[CaptureSession.this.mState.ordinal()] == 1) {
                    throw new IllegalStateException("onReady() should not be possible in state: " + CaptureSession.this.mState);
                }
            }
        }
    }

    public CaptureSession(@Nullable Handler handler) {
        this.mHandler = handler;
        this.mState = State.INITIALIZED;
        this.mExecutor = handler != null ? CameraXExecutors.newHandlerExecutor(handler) : null;
    }

    private CameraCaptureSession.CaptureCallback createCamera2CaptureCallback(List<CameraCaptureCallback> list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        for (CameraCaptureCallback captureCallback : list) {
            arrayList.add(CaptureCallbackConverter.toCaptureCallback(captureCallback));
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return Camera2CaptureCallbacks.createComboCallback((List<CameraCaptureSession.CaptureCallback>) arrayList);
    }

    private Executor getExecutor() {
        Executor executor = this.mExecutor;
        return executor == null ? CameraXExecutors.myLooperExecutor() : executor;
    }

    @NonNull
    public static Config mergeOptions(List<CaptureConfig> list) {
        MutableOptionsBundle create = MutableOptionsBundle.create();
        for (CaptureConfig implementationOptions : list) {
            Config implementationOptions2 = implementationOptions.getImplementationOptions();
            for (Config.Option next : implementationOptions2.listOptions()) {
                Object retrieveOption = implementationOptions2.retrieveOption(next, null);
                if (create.containsOption(next)) {
                    Object retrieveOption2 = create.retrieveOption(next, null);
                    if (!Objects.equals(retrieveOption2, retrieveOption)) {
                        "Detect conflicting option " + next.getId() + " : " + retrieveOption + " != " + retrieveOption2;
                    }
                } else {
                    create.insertOption(next, retrieveOption);
                }
            }
        }
        return create;
    }

    public void close() {
        synchronized (this.mStateLock) {
            int i = C03603.$SwitchMap$androidx$camera$camera2$impl$CaptureSession$State[this.mState.ordinal()];
            if (i == 1) {
                throw new IllegalStateException("close() should not be possible in state: " + this.mState);
            } else if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        if (this.mSessionConfig != null) {
                            List<CaptureConfig> onDisableSession = new Camera2Config(this.mSessionConfig.getImplementationOptions()).getCameraEventCallback(CameraEventCallbacks.createEmptyCallback()).createComboCallback().onDisableSession();
                            if (!onDisableSession.isEmpty()) {
                                issueCaptureRequests(setupConfiguredSurface(onDisableSession));
                            }
                        }
                    }
                }
                this.mState = State.CLOSED;
                this.mSessionConfig = null;
                this.mCameraEventOnRepeatingOptions = null;
            } else {
                this.mState = State.RELEASED;
            }
        }
    }

    public List<CaptureConfig> getCaptureConfigs() {
        List<CaptureConfig> unmodifiableList;
        synchronized (this.mStateLock) {
            unmodifiableList = Collections.unmodifiableList(this.mCaptureConfigs);
        }
        return unmodifiableList;
    }

    @Nullable
    public SessionConfig getSessionConfig() {
        SessionConfig sessionConfig;
        synchronized (this.mStateLock) {
            sessionConfig = this.mSessionConfig;
        }
        return sessionConfig;
    }

    public State getState() {
        State state;
        synchronized (this.mStateLock) {
            state = this.mState;
        }
        return state;
    }

    public void issueBurstCaptureRequest() {
        if (!this.mCaptureConfigs.isEmpty()) {
            try {
                CameraBurstCaptureCallback cameraBurstCaptureCallback = new CameraBurstCaptureCallback();
                ArrayList arrayList = new ArrayList();
                for (CaptureConfig next : this.mCaptureConfigs) {
                    if (!next.getSurfaces().isEmpty()) {
                        CaptureConfig.Builder from = CaptureConfig.Builder.from(next);
                        if (this.mSessionConfig != null) {
                            from.addImplementationOptions(this.mSessionConfig.getRepeatingCaptureConfig().getImplementationOptions());
                        }
                        if (this.mCameraEventOnRepeatingOptions != null) {
                            from.addImplementationOptions(this.mCameraEventOnRepeatingOptions);
                        }
                        from.addImplementationOptions(next.getImplementationOptions());
                        CaptureRequest build = Camera2CaptureRequestBuilder.build(from.build(), this.mCameraCaptureSession.getDevice(), this.mConfiguredSurfaceMap);
                        if (build == null) {
                            this.mCaptureConfigs.clear();
                            return;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (CameraCaptureCallback captureCallback : next.getCameraCaptureCallbacks()) {
                            CaptureCallbackConverter.toCaptureCallback(captureCallback, arrayList2);
                        }
                        cameraBurstCaptureCallback.addCamera2Callbacks(build, arrayList2);
                        arrayList.add(build);
                    }
                }
                this.mCameraCaptureSession.captureBurst(arrayList, cameraBurstCaptureCallback, this.mHandler);
            } catch (CameraAccessException e) {
                "Unable to access camera: " + e.getMessage();
                Thread.dumpStack();
            } catch (Throwable th) {
                this.mCaptureConfigs.clear();
                throw th;
            }
            this.mCaptureConfigs.clear();
        }
    }

    public void issueCaptureRequests(List<CaptureConfig> list) {
        synchronized (this.mStateLock) {
            switch (C03603.$SwitchMap$androidx$camera$camera2$impl$CaptureSession$State[this.mState.ordinal()]) {
                case 1:
                    throw new IllegalStateException("issueCaptureRequests() should not be possible in state: " + this.mState);
                case 2:
                case 3:
                    this.mCaptureConfigs.addAll(list);
                    break;
                case 4:
                    this.mCaptureConfigs.addAll(list);
                    issueBurstCaptureRequest();
                    break;
                case 5:
                case 6:
                case 7:
                    throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
            }
        }
    }

    public void issueRepeatingCaptureRequests() {
        if (this.mSessionConfig != null) {
            CaptureConfig repeatingCaptureConfig = this.mSessionConfig.getRepeatingCaptureConfig();
            try {
                CaptureConfig.Builder from = CaptureConfig.Builder.from(repeatingCaptureConfig);
                this.mCameraEventOnRepeatingOptions = mergeOptions(new Camera2Config(this.mSessionConfig.getImplementationOptions()).getCameraEventCallback(CameraEventCallbacks.createEmptyCallback()).createComboCallback().onRepeating());
                if (this.mCameraEventOnRepeatingOptions != null) {
                    from.addImplementationOptions(this.mCameraEventOnRepeatingOptions);
                }
                CaptureRequest build = Camera2CaptureRequestBuilder.build(from.build(), this.mCameraCaptureSession.getDevice(), this.mConfiguredSurfaceMap);
                if (build != null) {
                    this.mCameraCaptureSession.setRepeatingRequest(build, createCamera2CaptureCallback(repeatingCaptureConfig.getCameraCaptureCallbacks(), this.mCaptureCallback), this.mHandler);
                }
            } catch (CameraAccessException e) {
                "Unable to access camera: " + e.getMessage();
                Thread.dumpStack();
            }
        }
    }

    public void notifyCameraDeviceClose() {
        notifySurfaceDetached();
    }

    public void notifySurfaceAttached() {
        synchronized (this.mConfiguredDeferrableSurfaces) {
            for (DeferrableSurface notifySurfaceAttached : this.mConfiguredDeferrableSurfaces) {
                notifySurfaceAttached.notifySurfaceAttached();
            }
        }
    }

    public void notifySurfaceDetached() {
        synchronized (this.mConfiguredDeferrableSurfaces) {
            for (DeferrableSurface notifySurfaceDetached : this.mConfiguredDeferrableSurfaces) {
                notifySurfaceDetached.notifySurfaceDetached();
            }
            this.mConfiguredDeferrableSurfaces.clear();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0113, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void open(androidx.camera.core.SessionConfig r8, android.hardware.camera2.CameraDevice r9) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.mStateLock
            monitor-enter(r0)
            int[] r1 = androidx.camera.camera2.impl.CaptureSession.C03603.$SwitchMap$androidx$camera$camera2$impl$CaptureSession$State     // Catch:{ all -> 0x012d }
            androidx.camera.camera2.impl.CaptureSession$State r2 = r7.mState     // Catch:{ all -> 0x012d }
            int r2 = r2.ordinal()     // Catch:{ all -> 0x012d }
            r1 = r1[r2]     // Catch:{ all -> 0x012d }
            r2 = 1
            if (r1 == r2) goto L_0x0114
            r2 = 2
            if (r1 == r2) goto L_0x0027
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x012d }
            r8.<init>()     // Catch:{ all -> 0x012d }
            java.lang.String r9 = "Open not allowed in state: "
            r8.append(r9)     // Catch:{ all -> 0x012d }
            androidx.camera.camera2.impl.CaptureSession$State r9 = r7.mState     // Catch:{ all -> 0x012d }
            r8.append(r9)     // Catch:{ all -> 0x012d }
            r8.toString()     // Catch:{ all -> 0x012d }
            goto L_0x0112
        L_0x0027:
            java.util.List r1 = r8.getSurfaces()     // Catch:{ all -> 0x012d }
            androidx.camera.core.DeferrableSurfaces.refresh(r1)     // Catch:{ all -> 0x012d }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x012d }
            r2.<init>(r1)     // Catch:{ all -> 0x012d }
            r7.mConfiguredDeferrableSurfaces = r2     // Catch:{ all -> 0x012d }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x012d }
            java.util.List<androidx.camera.core.DeferrableSurface> r2 = r7.mConfiguredDeferrableSurfaces     // Catch:{ all -> 0x012d }
            java.util.List r2 = androidx.camera.core.DeferrableSurfaces.surfaceList(r2)     // Catch:{ all -> 0x012d }
            r1.<init>(r2)     // Catch:{ all -> 0x012d }
            boolean r2 = r1.isEmpty()     // Catch:{ all -> 0x012d }
            if (r2 == 0) goto L_0x0048
            monitor-exit(r0)     // Catch:{ all -> 0x012d }
            return
        L_0x0048:
            java.util.Map<androidx.camera.core.DeferrableSurface, android.view.Surface> r2 = r7.mConfiguredSurfaceMap     // Catch:{ all -> 0x012d }
            r2.clear()     // Catch:{ all -> 0x012d }
            r2 = 0
            r3 = r2
        L_0x004f:
            int r4 = r1.size()     // Catch:{ all -> 0x012d }
            if (r3 >= r4) goto L_0x0067
            java.util.Map<androidx.camera.core.DeferrableSurface, android.view.Surface> r4 = r7.mConfiguredSurfaceMap     // Catch:{ all -> 0x012d }
            java.util.List<androidx.camera.core.DeferrableSurface> r5 = r7.mConfiguredDeferrableSurfaces     // Catch:{ all -> 0x012d }
            java.lang.Object r5 = r5.get(r3)     // Catch:{ all -> 0x012d }
            java.lang.Object r6 = r1.get(r3)     // Catch:{ all -> 0x012d }
            r4.put(r5, r6)     // Catch:{ all -> 0x012d }
            int r3 = r3 + 1
            goto L_0x004f
        L_0x0067:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x012d }
            java.util.HashSet r4 = new java.util.HashSet     // Catch:{ all -> 0x012d }
            r4.<init>(r1)     // Catch:{ all -> 0x012d }
            r3.<init>(r4)     // Catch:{ all -> 0x012d }
            r7.notifySurfaceAttached()     // Catch:{ all -> 0x012d }
            androidx.camera.camera2.impl.CaptureSession$State r1 = androidx.camera.camera2.impl.CaptureSession.State.OPENING     // Catch:{ all -> 0x012d }
            r7.mState = r1     // Catch:{ all -> 0x012d }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x012d }
            java.util.List r4 = r8.getSessionStateCallbacks()     // Catch:{ all -> 0x012d }
            r1.<init>(r4)     // Catch:{ all -> 0x012d }
            androidx.camera.camera2.impl.CaptureSession$StateCallback r4 = r7.mCaptureSessionStateCallback     // Catch:{ all -> 0x012d }
            r1.add(r4)     // Catch:{ all -> 0x012d }
            android.hardware.camera2.CameraCaptureSession$StateCallback r1 = androidx.camera.core.CameraCaptureSessionStateCallbacks.createComboCallback((java.util.List<android.hardware.camera2.CameraCaptureSession.StateCallback>) r1)     // Catch:{ all -> 0x012d }
            androidx.camera.camera2.Camera2Config r4 = new androidx.camera.camera2.Camera2Config     // Catch:{ all -> 0x012d }
            androidx.camera.core.Config r5 = r8.getImplementationOptions()     // Catch:{ all -> 0x012d }
            r4.<init>(r5)     // Catch:{ all -> 0x012d }
            androidx.camera.camera2.impl.CameraEventCallbacks r5 = androidx.camera.camera2.impl.CameraEventCallbacks.createEmptyCallback()     // Catch:{ all -> 0x012d }
            androidx.camera.camera2.impl.CameraEventCallbacks r4 = r4.getCameraEventCallback(r5)     // Catch:{ all -> 0x012d }
            androidx.camera.camera2.impl.CameraEventCallbacks$ComboCameraEventCallback r4 = r4.createComboCallback()     // Catch:{ all -> 0x012d }
            java.util.List r4 = r4.onPresetSession()     // Catch:{ all -> 0x012d }
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x012d }
            r6 = 28
            if (r5 < r6) goto L_0x010d
            boolean r5 = r4.isEmpty()     // Catch:{ all -> 0x012d }
            if (r5 != 0) goto L_0x010d
            androidx.camera.core.CaptureConfig r8 = r8.getRepeatingCaptureConfig()     // Catch:{ all -> 0x012d }
            androidx.camera.core.CaptureConfig$Builder r8 = androidx.camera.core.CaptureConfig.Builder.from(r8)     // Catch:{ all -> 0x012d }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x012d }
        L_0x00bb:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x012d }
            if (r5 == 0) goto L_0x00cf
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x012d }
            androidx.camera.core.CaptureConfig r5 = (androidx.camera.core.CaptureConfig) r5     // Catch:{ all -> 0x012d }
            androidx.camera.core.Config r5 = r5.getImplementationOptions()     // Catch:{ all -> 0x012d }
            r8.addImplementationOptions(r5)     // Catch:{ all -> 0x012d }
            goto L_0x00bb
        L_0x00cf:
            androidx.camera.core.CaptureConfig r8 = r8.build()     // Catch:{ all -> 0x012d }
            android.hardware.camera2.CaptureRequest r8 = androidx.camera.camera2.impl.Camera2CaptureRequestBuilder.buildWithoutTarget(r8, r9)     // Catch:{ all -> 0x012d }
            if (r8 == 0) goto L_0x0107
            java.util.LinkedList r4 = new java.util.LinkedList     // Catch:{ all -> 0x012d }
            r4.<init>()     // Catch:{ all -> 0x012d }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x012d }
        L_0x00e2:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x012d }
            if (r5 == 0) goto L_0x00f7
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x012d }
            android.view.Surface r5 = (android.view.Surface) r5     // Catch:{ all -> 0x012d }
            android.hardware.camera2.params.OutputConfiguration r6 = new android.hardware.camera2.params.OutputConfiguration     // Catch:{ all -> 0x012d }
            r6.<init>(r5)     // Catch:{ all -> 0x012d }
            r4.add(r6)     // Catch:{ all -> 0x012d }
            goto L_0x00e2
        L_0x00f7:
            android.hardware.camera2.params.SessionConfiguration r3 = new android.hardware.camera2.params.SessionConfiguration     // Catch:{ all -> 0x012d }
            java.util.concurrent.Executor r5 = r7.getExecutor()     // Catch:{ all -> 0x012d }
            r3.<init>(r2, r4, r5, r1)     // Catch:{ all -> 0x012d }
            r3.setSessionParameters(r8)     // Catch:{ all -> 0x012d }
            r9.createCaptureSession(r3)     // Catch:{ all -> 0x012d }
            goto L_0x0112
        L_0x0107:
            android.os.Handler r8 = r7.mHandler     // Catch:{ all -> 0x012d }
            r9.createCaptureSession(r3, r1, r8)     // Catch:{ all -> 0x012d }
            goto L_0x0112
        L_0x010d:
            android.os.Handler r8 = r7.mHandler     // Catch:{ all -> 0x012d }
            r9.createCaptureSession(r3, r1, r8)     // Catch:{ all -> 0x012d }
        L_0x0112:
            monitor-exit(r0)     // Catch:{ all -> 0x012d }
            return
        L_0x0114:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x012d }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x012d }
            r9.<init>()     // Catch:{ all -> 0x012d }
            java.lang.String r1 = "open() should not be possible in state: "
            r9.append(r1)     // Catch:{ all -> 0x012d }
            androidx.camera.camera2.impl.CaptureSession$State r1 = r7.mState     // Catch:{ all -> 0x012d }
            r9.append(r1)     // Catch:{ all -> 0x012d }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x012d }
            r8.<init>(r9)     // Catch:{ all -> 0x012d }
            throw r8     // Catch:{ all -> 0x012d }
        L_0x012d:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x012d }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.CaptureSession.open(androidx.camera.core.SessionConfig, android.hardware.camera2.CameraDevice):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        if (r4.mReleaseFuture != null) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        r4.mReleaseFuture = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.camera.camera2.impl.CaptureSession.C03592(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        r1 = r4.mReleaseFuture;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0055, code lost:
        return androidx.camera.core.impl.utils.futures.Futures.immediateFuture(null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        r4.mState = androidx.camera.camera2.impl.CaptureSession.State.RELEASING;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p040c.p200q.p353b.p360g.p361a.C6316e<java.lang.Void> release() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.mStateLock
            monitor-enter(r0)
            int[] r1 = androidx.camera.camera2.impl.CaptureSession.C03603.$SwitchMap$androidx$camera$camera2$impl$CaptureSession$State     // Catch:{ all -> 0x0056 }
            androidx.camera.camera2.impl.CaptureSession$State r2 = r4.mState     // Catch:{ all -> 0x0056 }
            int r2 = r2.ordinal()     // Catch:{ all -> 0x0056 }
            r1 = r1[r2]     // Catch:{ all -> 0x0056 }
            switch(r1) {
                case 1: goto L_0x0036;
                case 2: goto L_0x0031;
                case 3: goto L_0x001a;
                case 4: goto L_0x0011;
                case 5: goto L_0x0011;
                case 6: goto L_0x001e;
                default: goto L_0x0010;
            }     // Catch:{ all -> 0x0056 }
        L_0x0010:
            goto L_0x004f
        L_0x0011:
            android.hardware.camera2.CameraCaptureSession r1 = r4.mCameraCaptureSession     // Catch:{ all -> 0x0056 }
            if (r1 == 0) goto L_0x001a
            android.hardware.camera2.CameraCaptureSession r1 = r4.mCameraCaptureSession     // Catch:{ all -> 0x0056 }
            r1.close()     // Catch:{ all -> 0x0056 }
        L_0x001a:
            androidx.camera.camera2.impl.CaptureSession$State r1 = androidx.camera.camera2.impl.CaptureSession.State.RELEASING     // Catch:{ all -> 0x0056 }
            r4.mState = r1     // Catch:{ all -> 0x0056 }
        L_0x001e:
            c.q.b.g.a.e<java.lang.Void> r1 = r4.mReleaseFuture     // Catch:{ all -> 0x0056 }
            if (r1 != 0) goto L_0x002d
            androidx.camera.camera2.impl.CaptureSession$2 r1 = new androidx.camera.camera2.impl.CaptureSession$2     // Catch:{ all -> 0x0056 }
            r1.<init>()     // Catch:{ all -> 0x0056 }
            c.q.b.g.a.e r1 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r1)     // Catch:{ all -> 0x0056 }
            r4.mReleaseFuture = r1     // Catch:{ all -> 0x0056 }
        L_0x002d:
            c.q.b.g.a.e<java.lang.Void> r1 = r4.mReleaseFuture     // Catch:{ all -> 0x0056 }
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            return r1
        L_0x0031:
            androidx.camera.camera2.impl.CaptureSession$State r1 = androidx.camera.camera2.impl.CaptureSession.State.RELEASED     // Catch:{ all -> 0x0056 }
            r4.mState = r1     // Catch:{ all -> 0x0056 }
            goto L_0x004f
        L_0x0036:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0056 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0056 }
            r2.<init>()     // Catch:{ all -> 0x0056 }
            java.lang.String r3 = "release() should not be possible in state: "
            r2.append(r3)     // Catch:{ all -> 0x0056 }
            androidx.camera.camera2.impl.CaptureSession$State r3 = r4.mState     // Catch:{ all -> 0x0056 }
            r2.append(r3)     // Catch:{ all -> 0x0056 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0056 }
            r1.<init>(r2)     // Catch:{ all -> 0x0056 }
            throw r1     // Catch:{ all -> 0x0056 }
        L_0x004f:
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            r0 = 0
            c.q.b.g.a.e r0 = androidx.camera.core.impl.utils.futures.Futures.immediateFuture(r0)
            return r0
        L_0x0056:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.CaptureSession.release():c.q.b.g.a.e");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setSessionConfig(androidx.camera.core.SessionConfig r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.mStateLock
            monitor-enter(r0)
            int[] r1 = androidx.camera.camera2.impl.CaptureSession.C03603.$SwitchMap$androidx$camera$camera2$impl$CaptureSession$State     // Catch:{ all -> 0x004f }
            androidx.camera.camera2.impl.CaptureSession$State r2 = r3.mState     // Catch:{ all -> 0x004f }
            int r2 = r2.ordinal()     // Catch:{ all -> 0x004f }
            r1 = r1[r2]     // Catch:{ all -> 0x004f }
            switch(r1) {
                case 1: goto L_0x0034;
                case 2: goto L_0x0031;
                case 3: goto L_0x0031;
                case 4: goto L_0x0019;
                case 5: goto L_0x0011;
                case 6: goto L_0x0011;
                case 7: goto L_0x0011;
                default: goto L_0x0010;
            }     // Catch:{ all -> 0x004f }
        L_0x0010:
            goto L_0x004d
        L_0x0011:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x004f }
            java.lang.String r1 = "Session configuration cannot be set on a closed/released session."
            r4.<init>(r1)     // Catch:{ all -> 0x004f }
            throw r4     // Catch:{ all -> 0x004f }
        L_0x0019:
            r3.mSessionConfig = r4     // Catch:{ all -> 0x004f }
            java.util.Map<androidx.camera.core.DeferrableSurface, android.view.Surface> r1 = r3.mConfiguredSurfaceMap     // Catch:{ all -> 0x004f }
            java.util.Set r1 = r1.keySet()     // Catch:{ all -> 0x004f }
            java.util.List r4 = r4.getSurfaces()     // Catch:{ all -> 0x004f }
            boolean r4 = r1.containsAll(r4)     // Catch:{ all -> 0x004f }
            if (r4 != 0) goto L_0x002d
            monitor-exit(r0)     // Catch:{ all -> 0x004f }
            return
        L_0x002d:
            r3.issueRepeatingCaptureRequests()     // Catch:{ all -> 0x004f }
            goto L_0x004d
        L_0x0031:
            r3.mSessionConfig = r4     // Catch:{ all -> 0x004f }
            goto L_0x004d
        L_0x0034:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x004f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x004f }
            r1.<init>()     // Catch:{ all -> 0x004f }
            java.lang.String r2 = "setSessionConfig() should not be possible in state: "
            r1.append(r2)     // Catch:{ all -> 0x004f }
            androidx.camera.camera2.impl.CaptureSession$State r2 = r3.mState     // Catch:{ all -> 0x004f }
            r1.append(r2)     // Catch:{ all -> 0x004f }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x004f }
            r4.<init>(r1)     // Catch:{ all -> 0x004f }
            throw r4     // Catch:{ all -> 0x004f }
        L_0x004d:
            monitor-exit(r0)     // Catch:{ all -> 0x004f }
            return
        L_0x004f:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004f }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.CaptureSession.setSessionConfig(androidx.camera.core.SessionConfig):void");
    }

    public List<CaptureConfig> setupConfiguredSurface(List<CaptureConfig> list) {
        ArrayList arrayList = new ArrayList();
        for (CaptureConfig from : list) {
            CaptureConfig.Builder from2 = CaptureConfig.Builder.from(from);
            from2.setTemplateType(1);
            for (DeferrableSurface addSurface : this.mSessionConfig.getRepeatingCaptureConfig().getSurfaces()) {
                from2.addSurface(addSurface);
            }
            arrayList.add(from2.build());
        }
        return arrayList;
    }
}
