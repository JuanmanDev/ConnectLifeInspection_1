package androidx.camera.core;

import android.util.Size;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.camera.core.CameraX;
import androidx.camera.core.UseCaseConfig;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class UseCase {
    public static final String TAG = "UseCase";
    public final Map<String, CameraControl> mAttachedCameraControlMap = new HashMap();
    public final Map<String, SessionConfig> mAttachedCameraIdToSessionConfigMap = new HashMap();
    public final Map<String, Size> mAttachedSurfaceResolutionMap = new HashMap();
    public int mImageFormat = 34;
    public final Set<StateChangeListener> mListeners = new HashSet();
    public State mState = State.INACTIVE;
    public UseCaseConfig<?> mUseCaseConfig;

    /* renamed from: androidx.camera.core.UseCase$1 */
    public static /* synthetic */ class C04501 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$camera$core$UseCase$State;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                androidx.camera.core.UseCase$State[] r0 = androidx.camera.core.UseCase.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$androidx$camera$core$UseCase$State = r0
                androidx.camera.core.UseCase$State r1 = androidx.camera.core.UseCase.State.INACTIVE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$androidx$camera$core$UseCase$State     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.camera.core.UseCase$State r1 = androidx.camera.core.UseCase.State.ACTIVE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.UseCase.C04501.<clinit>():void");
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface EventListener {
        void onBind(String str);

        void onUnbind();
    }

    public enum State {
        ACTIVE,
        INACTIVE
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface StateChangeListener {
        void onUseCaseActive(UseCase useCase);

        void onUseCaseInactive(UseCase useCase);

        void onUseCaseReset(UseCase useCase);

        void onUseCaseUpdated(UseCase useCase);
    }

    public UseCase(UseCaseConfig<?> useCaseConfig) {
        updateUseCaseConfig(useCaseConfig);
    }

    private String getCameraIdUnchecked() {
        CameraX.LensFacing lensFacing = (CameraX.LensFacing) this.mUseCaseConfig.retrieveOption(CameraDeviceConfig.OPTION_LENS_FACING);
        try {
            return CameraX.getCameraWithLensFacing(lensFacing);
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid camera lens facing: " + lensFacing, e);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void addStateChangeListener(StateChangeListener stateChangeListener) {
        this.mListeners.add(stateChangeListener);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [androidx.camera.core.Config$ExtendableBuilder, androidx.camera.core.UseCaseConfig$Builder, androidx.camera.core.UseCaseConfig$Builder<?, ?, ?>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.camera.core.UseCaseConfig<?> applyDefaults(androidx.camera.core.UseCaseConfig<?> r5, androidx.camera.core.UseCaseConfig.Builder<?, ?, ?> r6) {
        /*
            r4 = this;
            java.util.Set r0 = r5.listOptions()
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0020
            java.lang.Object r1 = r0.next()
            androidx.camera.core.Config$Option r1 = (androidx.camera.core.Config.Option) r1
            androidx.camera.core.MutableConfig r2 = r6.getMutableConfig()
            java.lang.Object r3 = r5.retrieveOption(r1)
            r2.insertOption(r1, r3)
            goto L_0x0008
        L_0x0020:
            androidx.camera.core.UseCaseConfig r5 = r6.build()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.UseCase.applyDefaults(androidx.camera.core.UseCaseConfig, androidx.camera.core.UseCaseConfig$Builder):androidx.camera.core.UseCaseConfig");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void attachCameraControl(String str, CameraControl cameraControl) {
        this.mAttachedCameraControlMap.put(str, cameraControl);
        onCameraControlReady(str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void attachToCamera(String str, SessionConfig sessionConfig) {
        this.mAttachedCameraIdToSessionConfigMap.put(str, sessionConfig);
    }

    @CallSuper
    public void clear() {
        EventListener useCaseEventListener = this.mUseCaseConfig.getUseCaseEventListener((EventListener) null);
        if (useCaseEventListener != null) {
            useCaseEventListener.onUnbind();
        }
        this.mListeners.clear();
    }

    public final void detachCameraControl(String str) {
        this.mAttachedCameraControlMap.remove(str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Set<String> getAttachedCameraIds() {
        return this.mAttachedCameraIdToSessionConfigMap.keySet();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Size getAttachedSurfaceResolution(String str) {
        return this.mAttachedSurfaceResolutionMap.get(str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CameraControl getCameraControl(String str) {
        CameraControl cameraControl = this.mAttachedCameraControlMap.get(str);
        return cameraControl == null ? CameraControl.DEFAULT_EMPTY_INSTANCE : cameraControl;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public UseCaseConfig.Builder<?, ?, ?> getDefaultBuilder(CameraX.LensFacing lensFacing) {
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getImageFormat() {
        return this.mImageFormat;
    }

    public String getName() {
        UseCaseConfig<?> useCaseConfig = this.mUseCaseConfig;
        return useCaseConfig.getTargetName("<UnknownUseCase-" + hashCode() + ">");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public SessionConfig getSessionConfig(String str) {
        SessionConfig sessionConfig = this.mAttachedCameraIdToSessionConfigMap.get(str);
        if (sessionConfig != null) {
            return sessionConfig;
        }
        throw new IllegalArgumentException("Invalid camera: " + str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public UseCaseConfig<?> getUseCaseConfig() {
        return this.mUseCaseConfig;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void notifyActive() {
        this.mState = State.ACTIVE;
        notifyState();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void notifyInactive() {
        this.mState = State.INACTIVE;
        notifyState();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void notifyReset() {
        for (StateChangeListener onUseCaseReset : this.mListeners) {
            onUseCaseReset.onUseCaseReset(this);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void notifyState() {
        int i = C04501.$SwitchMap$androidx$camera$core$UseCase$State[this.mState.ordinal()];
        if (i == 1) {
            for (StateChangeListener onUseCaseInactive : this.mListeners) {
                onUseCaseInactive.onUseCaseInactive(this);
            }
        } else if (i == 2) {
            for (StateChangeListener onUseCaseActive : this.mListeners) {
                onUseCaseActive.onUseCaseActive(this);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void notifyUpdated() {
        for (StateChangeListener onUseCaseUpdated : this.mListeners) {
            onUseCaseUpdated.onUseCaseUpdated(this);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void onBind() {
        EventListener useCaseEventListener = this.mUseCaseConfig.getUseCaseEventListener((EventListener) null);
        if (useCaseEventListener != null) {
            useCaseEventListener.onBind(getCameraIdUnchecked());
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void onCameraControlReady(String str) {
    }

    public abstract Map<String, Size> onSuggestedResolutionUpdated(Map<String, Size> map);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void removeStateChangeListener(StateChangeListener stateChangeListener) {
        this.mListeners.remove(stateChangeListener);
    }

    public void setImageFormat(int i) {
        this.mImageFormat = i;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void updateSuggestedResolution(Map<String, Size> map) {
        for (Map.Entry next : onSuggestedResolutionUpdated(map).entrySet()) {
            this.mAttachedSurfaceResolutionMap.put(next.getKey(), next.getValue());
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void updateUseCaseConfig(UseCaseConfig<?> useCaseConfig) {
        UseCaseConfig.Builder<?, ?, ?> defaultBuilder = getDefaultBuilder(((CameraDeviceConfig) useCaseConfig).getLensFacing((CameraX.LensFacing) null));
        if (defaultBuilder == null) {
            this.mUseCaseConfig = useCaseConfig;
        } else {
            this.mUseCaseConfig = applyDefaults(useCaseConfig, defaultBuilder);
        }
    }
}
