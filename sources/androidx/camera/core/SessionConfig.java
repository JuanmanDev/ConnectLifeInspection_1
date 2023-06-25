package androidx.camera.core;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.camera.core.CaptureConfig;
import androidx.camera.core.Config;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class SessionConfig {
    public final List<CameraDevice.StateCallback> mDeviceStateCallbacks;
    public final CaptureConfig mRepeatingCaptureConfig;
    public final List<CameraCaptureSession.StateCallback> mSessionStateCallbacks;
    public final List<CameraCaptureCallback> mSingleCameraCaptureCallbacks;
    public final List<DeferrableSurface> mSurfaces;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class BaseBuilder {
        public final CaptureConfig.Builder mCaptureConfigBuilder = new CaptureConfig.Builder();
        public List<CameraDevice.StateCallback> mDeviceStateCallbacks = new ArrayList();
        public final List<CameraCaptureCallback> mInteropCameraCaptureCallbacks = new ArrayList();
        public List<CameraCaptureSession.StateCallback> mSessionStateCallbacks = new ArrayList();
        public final Set<DeferrableSurface> mSurfaces = new HashSet();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class Builder extends BaseBuilder {
        public static Builder createFrom(UseCaseConfig<?> useCaseConfig) {
            OptionUnpacker sessionOptionUnpacker = useCaseConfig.getSessionOptionUnpacker((OptionUnpacker) null);
            if (sessionOptionUnpacker != null) {
                Builder builder = new Builder();
                sessionOptionUnpacker.unpack(useCaseConfig, builder);
                return builder;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + useCaseConfig.getTargetName(useCaseConfig.toString()));
        }

        public void addAllCameraCaptureCallbacks(Collection<CameraCaptureCallback> collection) {
            this.mCaptureConfigBuilder.addAllCameraCaptureCallbacks(collection);
            this.mInteropCameraCaptureCallbacks.addAll(collection);
        }

        public void addAllDeviceStateCallbacks(Collection<CameraDevice.StateCallback> collection) {
            for (CameraDevice.StateCallback addDeviceStateCallback : collection) {
                addDeviceStateCallback(addDeviceStateCallback);
            }
        }

        public void addAllRepeatingCameraCaptureCallbacks(Collection<CameraCaptureCallback> collection) {
            this.mCaptureConfigBuilder.addAllCameraCaptureCallbacks(collection);
        }

        public void addAllSessionStateCallbacks(List<CameraCaptureSession.StateCallback> list) {
            for (CameraCaptureSession.StateCallback addSessionStateCallback : list) {
                addSessionStateCallback(addSessionStateCallback);
            }
        }

        public void addCameraCaptureCallback(CameraCaptureCallback cameraCaptureCallback) {
            this.mCaptureConfigBuilder.addCameraCaptureCallback(cameraCaptureCallback);
            this.mInteropCameraCaptureCallbacks.add(cameraCaptureCallback);
        }

        public void addDeviceStateCallback(CameraDevice.StateCallback stateCallback) {
            if (!this.mDeviceStateCallbacks.contains(stateCallback)) {
                this.mDeviceStateCallbacks.add(stateCallback);
                return;
            }
            throw new IllegalArgumentException("Duplicate device state callback.");
        }

        public void addImplementationOptions(Config config) {
            this.mCaptureConfigBuilder.addImplementationOptions(config);
        }

        public void addNonRepeatingSurface(DeferrableSurface deferrableSurface) {
            this.mSurfaces.add(deferrableSurface);
        }

        public void addRepeatingCameraCaptureCallback(CameraCaptureCallback cameraCaptureCallback) {
            this.mCaptureConfigBuilder.addCameraCaptureCallback(cameraCaptureCallback);
        }

        public void addSessionStateCallback(CameraCaptureSession.StateCallback stateCallback) {
            if (!this.mSessionStateCallbacks.contains(stateCallback)) {
                this.mSessionStateCallbacks.add(stateCallback);
                return;
            }
            throw new IllegalArgumentException("Duplicate session state callback.");
        }

        public void addSurface(DeferrableSurface deferrableSurface) {
            this.mSurfaces.add(deferrableSurface);
            this.mCaptureConfigBuilder.addSurface(deferrableSurface);
        }

        public SessionConfig build() {
            return new SessionConfig(new ArrayList(this.mSurfaces), this.mDeviceStateCallbacks, this.mSessionStateCallbacks, this.mInteropCameraCaptureCallbacks, this.mCaptureConfigBuilder.build());
        }

        public void clearSurfaces() {
            this.mSurfaces.clear();
            this.mCaptureConfigBuilder.clearSurfaces();
        }

        public List<CameraCaptureCallback> getSingleCameraCaptureCallbacks() {
            return Collections.unmodifiableList(this.mInteropCameraCaptureCallbacks);
        }

        public void removeSurface(DeferrableSurface deferrableSurface) {
            this.mSurfaces.remove(deferrableSurface);
            this.mCaptureConfigBuilder.removeSurface(deferrableSurface);
        }

        public void setImplementationOptions(Config config) {
            this.mCaptureConfigBuilder.setImplementationOptions(config);
        }

        public void setTag(Object obj) {
            this.mCaptureConfigBuilder.setTag(obj);
        }

        public void setTemplateType(int i) {
            this.mCaptureConfigBuilder.setTemplateType(i);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface OptionUnpacker {
        void unpack(UseCaseConfig<?> useCaseConfig, Builder builder);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class ValidatingBuilder extends BaseBuilder {
        public static final String TAG = "ValidatingBuilder";
        public final List<CameraDevice.StateCallback> mDeviceStateCallbacks = new ArrayList();
        public final List<CameraCaptureSession.StateCallback> mSessionStateCallbacks = new ArrayList();
        public final List<CameraCaptureCallback> mSingleCameraCaptureCallbacks = new ArrayList();
        public boolean mTemplateSet = false;
        public boolean mValid = true;

        public void add(SessionConfig sessionConfig) {
            CaptureConfig repeatingCaptureConfig = sessionConfig.getRepeatingCaptureConfig();
            if (!this.mTemplateSet) {
                this.mCaptureConfigBuilder.setTemplateType(repeatingCaptureConfig.getTemplateType());
                this.mTemplateSet = true;
            } else if (this.mCaptureConfigBuilder.getTemplateType() != repeatingCaptureConfig.getTemplateType()) {
                "Invalid configuration due to template type: " + this.mCaptureConfigBuilder.getTemplateType() + " != " + repeatingCaptureConfig.getTemplateType();
                this.mValid = false;
            }
            Object tag = sessionConfig.getRepeatingCaptureConfig().getTag();
            if (tag != null) {
                this.mCaptureConfigBuilder.setTag(tag);
            }
            this.mDeviceStateCallbacks.addAll(sessionConfig.getDeviceStateCallbacks());
            this.mSessionStateCallbacks.addAll(sessionConfig.getSessionStateCallbacks());
            this.mCaptureConfigBuilder.addAllCameraCaptureCallbacks(sessionConfig.getRepeatingCameraCaptureCallbacks());
            this.mSingleCameraCaptureCallbacks.addAll(sessionConfig.getSingleCameraCaptureCallbacks());
            this.mSurfaces.addAll(sessionConfig.getSurfaces());
            this.mCaptureConfigBuilder.getSurfaces().addAll(repeatingCaptureConfig.getSurfaces());
            if (!this.mSurfaces.containsAll(this.mCaptureConfigBuilder.getSurfaces())) {
                this.mValid = false;
            }
            Config implementationOptions = repeatingCaptureConfig.getImplementationOptions();
            Config implementationOptions2 = this.mCaptureConfigBuilder.getImplementationOptions();
            MutableOptionsBundle create = MutableOptionsBundle.create();
            for (Config.Option next : implementationOptions.listOptions()) {
                Object retrieveOption = implementationOptions.retrieveOption(next, null);
                if ((retrieveOption instanceof MultiValueSet) || !implementationOptions2.containsOption(next)) {
                    create.insertOption(next, implementationOptions.retrieveOption(next));
                } else {
                    Object retrieveOption2 = implementationOptions2.retrieveOption(next, null);
                    if (!Objects.equals(retrieveOption, retrieveOption2)) {
                        "Invalid configuration due to conflicting option: " + next.getId() + " : " + retrieveOption + " != " + retrieveOption2;
                        this.mValid = false;
                    }
                }
            }
            this.mCaptureConfigBuilder.addImplementationOptions(create);
        }

        @NonNull
        public SessionConfig build() {
            if (this.mValid) {
                return new SessionConfig(new ArrayList(this.mSurfaces), this.mDeviceStateCallbacks, this.mSessionStateCallbacks, this.mSingleCameraCaptureCallbacks, this.mCaptureConfigBuilder.build());
            }
            throw new IllegalArgumentException("Unsupported session configuration combination");
        }

        public boolean isValid() {
            return this.mTemplateSet && this.mValid;
        }
    }

    public SessionConfig(List<DeferrableSurface> list, List<CameraDevice.StateCallback> list2, List<CameraCaptureSession.StateCallback> list3, List<CameraCaptureCallback> list4, CaptureConfig captureConfig) {
        this.mSurfaces = list;
        this.mDeviceStateCallbacks = Collections.unmodifiableList(list2);
        this.mSessionStateCallbacks = Collections.unmodifiableList(list3);
        this.mSingleCameraCaptureCallbacks = Collections.unmodifiableList(list4);
        this.mRepeatingCaptureConfig = captureConfig;
    }

    public static SessionConfig defaultEmptySessionConfig() {
        return new SessionConfig(new ArrayList(), new ArrayList(0), new ArrayList(0), new ArrayList(0), new CaptureConfig.Builder().build());
    }

    public List<CameraDevice.StateCallback> getDeviceStateCallbacks() {
        return this.mDeviceStateCallbacks;
    }

    public Config getImplementationOptions() {
        return this.mRepeatingCaptureConfig.getImplementationOptions();
    }

    public List<CameraCaptureCallback> getRepeatingCameraCaptureCallbacks() {
        return this.mRepeatingCaptureConfig.getCameraCaptureCallbacks();
    }

    public CaptureConfig getRepeatingCaptureConfig() {
        return this.mRepeatingCaptureConfig;
    }

    public List<CameraCaptureSession.StateCallback> getSessionStateCallbacks() {
        return this.mSessionStateCallbacks;
    }

    public List<CameraCaptureCallback> getSingleCameraCaptureCallbacks() {
        return this.mSingleCameraCaptureCallbacks;
    }

    public List<DeferrableSurface> getSurfaces() {
        return Collections.unmodifiableList(this.mSurfaces);
    }

    public int getTemplateType() {
        return this.mRepeatingCaptureConfig.getTemplateType();
    }
}
