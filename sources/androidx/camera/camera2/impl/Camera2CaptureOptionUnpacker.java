package androidx.camera.camera2.impl;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.Camera2Config;
import androidx.camera.core.CaptureConfig;
import androidx.camera.core.Config;
import androidx.camera.core.OptionsBundle;
import androidx.camera.core.UseCaseConfig;

public class Camera2CaptureOptionUnpacker implements CaptureConfig.OptionUnpacker {
    public static final Camera2CaptureOptionUnpacker INSTANCE = new Camera2CaptureOptionUnpacker();

    public void unpack(UseCaseConfig<?> useCaseConfig, CaptureConfig.Builder builder) {
        CaptureConfig defaultCaptureConfig = useCaseConfig.getDefaultCaptureConfig((CaptureConfig) null);
        Config emptyBundle = OptionsBundle.emptyBundle();
        int templateType = CaptureConfig.defaultEmptyCaptureConfig().getTemplateType();
        if (defaultCaptureConfig != null) {
            templateType = defaultCaptureConfig.getTemplateType();
            builder.addAllCameraCaptureCallbacks(defaultCaptureConfig.getCameraCaptureCallbacks());
            emptyBundle = defaultCaptureConfig.getImplementationOptions();
        }
        builder.setImplementationOptions(emptyBundle);
        Camera2Config camera2Config = new Camera2Config(useCaseConfig);
        builder.setTemplateType(camera2Config.getCaptureRequestTemplate(templateType));
        builder.addCameraCaptureCallback(CaptureCallbackContainer.create(camera2Config.getSessionCaptureCallback(Camera2CaptureCallbacks.createNoOpCallback())));
        Camera2Config.Builder builder2 = new Camera2Config.Builder();
        for (Config.Option next : camera2Config.getCaptureRequestOptions()) {
            builder2.setCaptureRequestOption((CaptureRequest.Key) next.getToken(), camera2Config.retrieveOption(next));
        }
        builder.addImplementationOptions(builder2.build());
    }
}
