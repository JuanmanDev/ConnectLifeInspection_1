package androidx.camera.camera2;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.impl.CameraEventCallbacks;
import androidx.camera.core.Config;
import androidx.camera.core.MutableConfig;
import androidx.camera.core.MutableOptionsBundle;
import androidx.camera.core.OptionsBundle;
import java.util.HashSet;
import java.util.Set;

public final class Camera2Config implements Config {
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final Config.Option<CameraEventCallbacks> CAMERA_EVENT_CALLBACK_OPTION = Config.Option.create("camera2.cameraEvent.callback", CameraEventCallbacks.class);
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String CAPTURE_REQUEST_ID_STEM = "camera2.captureRequest.option.";
    public static final Config.Option<CameraDevice.StateCallback> DEVICE_STATE_CALLBACK_OPTION = Config.Option.create("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class);
    public static final Config.Option<CameraCaptureSession.CaptureCallback> SESSION_CAPTURE_CALLBACK_OPTION = Config.Option.create("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class);
    public static final Config.Option<CameraCaptureSession.StateCallback> SESSION_STATE_CALLBACK_OPTION = Config.Option.create("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class);
    public static final Config.Option<Integer> TEMPLATE_TYPE_OPTION = Config.Option.create("camera2.captureRequest.templateType", Integer.TYPE);
    public final Config mConfig;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class Builder implements Config.ExtendableBuilder {
        public final MutableOptionsBundle mMutableOptionsBundle = MutableOptionsBundle.create();

        public Camera2Config build() {
            return new Camera2Config(OptionsBundle.from(this.mMutableOptionsBundle));
        }

        public MutableConfig getMutableConfig() {
            return this.mMutableOptionsBundle;
        }

        public Builder insertAllOptions(Config config) {
            for (Config.Option next : config.listOptions()) {
                this.mMutableOptionsBundle.insertOption(next, config.retrieveOption(next));
            }
            return this;
        }

        public <ValueT> Builder setCaptureRequestOption(CaptureRequest.Key<ValueT> key, ValueT valuet) {
            this.mMutableOptionsBundle.insertOption(Camera2Config.createCaptureRequestOption(key), valuet);
            return this;
        }
    }

    public static final class Extender {
        public Config.ExtendableBuilder mBaseBuilder;

        public Extender(Config.ExtendableBuilder extendableBuilder) {
            this.mBaseBuilder = extendableBuilder;
        }

        public Extender setCameraEventCallback(CameraEventCallbacks cameraEventCallbacks) {
            this.mBaseBuilder.getMutableConfig().insertOption(Camera2Config.CAMERA_EVENT_CALLBACK_OPTION, cameraEventCallbacks);
            return this;
        }

        public <ValueT> Extender setCaptureRequestOption(CaptureRequest.Key<ValueT> key, ValueT valuet) {
            this.mBaseBuilder.getMutableConfig().insertOption(Camera2Config.createCaptureRequestOption(key), valuet);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public Extender setCaptureRequestTemplate(int i) {
            this.mBaseBuilder.getMutableConfig().insertOption(Camera2Config.TEMPLATE_TYPE_OPTION, Integer.valueOf(i));
            return this;
        }

        public Extender setDeviceStateCallback(CameraDevice.StateCallback stateCallback) {
            this.mBaseBuilder.getMutableConfig().insertOption(Camera2Config.DEVICE_STATE_CALLBACK_OPTION, stateCallback);
            return this;
        }

        public Extender setSessionCaptureCallback(CameraCaptureSession.CaptureCallback captureCallback) {
            this.mBaseBuilder.getMutableConfig().insertOption(Camera2Config.SESSION_CAPTURE_CALLBACK_OPTION, captureCallback);
            return this;
        }

        public Extender setSessionStateCallback(CameraCaptureSession.StateCallback stateCallback) {
            this.mBaseBuilder.getMutableConfig().insertOption(Camera2Config.SESSION_STATE_CALLBACK_OPTION, stateCallback);
            return this;
        }
    }

    public Camera2Config(Config config) {
        this.mConfig = config;
    }

    public static Config.Option<Object> createCaptureRequestOption(CaptureRequest.Key<?> key) {
        return Config.Option.create(CAPTURE_REQUEST_ID_STEM + key.getName(), Object.class, key);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean containsOption(Config.Option<?> option) {
        return this.mConfig.containsOption(option);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void findOptions(String str, Config.OptionMatcher optionMatcher) {
        this.mConfig.findOptions(str, optionMatcher);
    }

    public CameraEventCallbacks getCameraEventCallback(CameraEventCallbacks cameraEventCallbacks) {
        return (CameraEventCallbacks) this.mConfig.retrieveOption(CAMERA_EVENT_CALLBACK_OPTION, cameraEventCallbacks);
    }

    public <ValueT> ValueT getCaptureRequestOption(CaptureRequest.Key<ValueT> key, @Nullable ValueT valuet) {
        return this.mConfig.retrieveOption(createCaptureRequestOption(key), valuet);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Set<Config.Option<?>> getCaptureRequestOptions() {
        final HashSet hashSet = new HashSet();
        findOptions(CAPTURE_REQUEST_ID_STEM, new Config.OptionMatcher() {
            public boolean onOptionMatched(Config.Option<?> option) {
                hashSet.add(option);
                return true;
            }
        });
        return hashSet;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int getCaptureRequestTemplate(int i) {
        return ((Integer) this.mConfig.retrieveOption(TEMPLATE_TYPE_OPTION, Integer.valueOf(i))).intValue();
    }

    public CameraDevice.StateCallback getDeviceStateCallback(CameraDevice.StateCallback stateCallback) {
        return (CameraDevice.StateCallback) this.mConfig.retrieveOption(DEVICE_STATE_CALLBACK_OPTION, stateCallback);
    }

    public CameraCaptureSession.CaptureCallback getSessionCaptureCallback(CameraCaptureSession.CaptureCallback captureCallback) {
        return (CameraCaptureSession.CaptureCallback) this.mConfig.retrieveOption(SESSION_CAPTURE_CALLBACK_OPTION, captureCallback);
    }

    public CameraCaptureSession.StateCallback getSessionStateCallback(CameraCaptureSession.StateCallback stateCallback) {
        return (CameraCaptureSession.StateCallback) this.mConfig.retrieveOption(SESSION_STATE_CALLBACK_OPTION, stateCallback);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Set<Config.Option<?>> listOptions() {
        return this.mConfig.listOptions();
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public <ValueT> ValueT retrieveOption(Config.Option<ValueT> option) {
        return this.mConfig.retrieveOption(option);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public <ValueT> ValueT retrieveOption(Config.Option<ValueT> option, @Nullable ValueT valuet) {
        return this.mConfig.retrieveOption(option, valuet);
    }
}
