package androidx.camera.camera2.impl;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.Camera2Config;
import androidx.camera.core.CameraCaptureSessionStateCallbacks;
import androidx.camera.core.CameraDeviceStateCallbacks;
import androidx.camera.core.Config;
import androidx.camera.core.MutableOptionsBundle;
import androidx.camera.core.OptionsBundle;
import androidx.camera.core.SessionConfig;
import androidx.camera.core.UseCaseConfig;

public final class Camera2SessionOptionUnpacker implements SessionConfig.OptionUnpacker {
    public static final Camera2SessionOptionUnpacker INSTANCE = new Camera2SessionOptionUnpacker();

    public void unpack(UseCaseConfig<?> useCaseConfig, SessionConfig.Builder builder) {
        SessionConfig defaultSessionConfig = useCaseConfig.getDefaultSessionConfig((SessionConfig) null);
        Config emptyBundle = OptionsBundle.emptyBundle();
        int templateType = SessionConfig.defaultEmptySessionConfig().getTemplateType();
        if (defaultSessionConfig != null) {
            templateType = defaultSessionConfig.getTemplateType();
            builder.addAllDeviceStateCallbacks(defaultSessionConfig.getDeviceStateCallbacks());
            builder.addAllSessionStateCallbacks(defaultSessionConfig.getSessionStateCallbacks());
            builder.addAllRepeatingCameraCaptureCallbacks(defaultSessionConfig.getRepeatingCameraCaptureCallbacks());
            emptyBundle = defaultSessionConfig.getImplementationOptions();
        }
        builder.setImplementationOptions(emptyBundle);
        Camera2Config camera2Config = new Camera2Config(useCaseConfig);
        builder.setTemplateType(camera2Config.getCaptureRequestTemplate(templateType));
        builder.addDeviceStateCallback(camera2Config.getDeviceStateCallback(CameraDeviceStateCallbacks.createNoOpCallback()));
        builder.addSessionStateCallback(camera2Config.getSessionStateCallback(CameraCaptureSessionStateCallbacks.createNoOpCallback()));
        builder.addCameraCaptureCallback(CaptureCallbackContainer.create(camera2Config.getSessionCaptureCallback(Camera2CaptureCallbacks.createNoOpCallback())));
        MutableOptionsBundle create = MutableOptionsBundle.create();
        create.insertOption(Camera2Config.CAMERA_EVENT_CALLBACK_OPTION, camera2Config.getCameraEventCallback(CameraEventCallbacks.createEmptyCallback()));
        builder.addImplementationOptions(create);
        Camera2Config.Builder builder2 = new Camera2Config.Builder();
        for (Config.Option next : camera2Config.getCaptureRequestOptions()) {
            builder2.setCaptureRequestOption((CaptureRequest.Key) next.getToken(), camera2Config.retrieveOption(next));
        }
        builder.addImplementationOptions(builder2.build());
    }
}
