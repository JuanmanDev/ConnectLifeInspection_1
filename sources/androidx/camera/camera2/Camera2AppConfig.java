package androidx.camera.camera2;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.impl.Camera2CameraFactory;
import androidx.camera.camera2.impl.Camera2DeviceSurfaceManager;
import androidx.camera.camera2.impl.ImageAnalysisConfigProvider;
import androidx.camera.camera2.impl.ImageCaptureConfigProvider;
import androidx.camera.camera2.impl.PreviewConfigProvider;
import androidx.camera.camera2.impl.VideoCaptureConfigProvider;
import androidx.camera.core.AppConfig;
import androidx.camera.core.ExtendableUseCaseConfigFactory;
import androidx.camera.core.ImageAnalysisConfig;
import androidx.camera.core.ImageCaptureConfig;
import androidx.camera.core.PreviewConfig;
import androidx.camera.core.VideoCaptureConfig;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class Camera2AppConfig {
    public static AppConfig create(Context context) {
        Camera2CameraFactory camera2CameraFactory = new Camera2CameraFactory(context);
        Camera2DeviceSurfaceManager camera2DeviceSurfaceManager = new Camera2DeviceSurfaceManager(context);
        ExtendableUseCaseConfigFactory extendableUseCaseConfigFactory = new ExtendableUseCaseConfigFactory();
        extendableUseCaseConfigFactory.installDefaultProvider(ImageAnalysisConfig.class, new ImageAnalysisConfigProvider(camera2CameraFactory, context));
        extendableUseCaseConfigFactory.installDefaultProvider(ImageCaptureConfig.class, new ImageCaptureConfigProvider(camera2CameraFactory, context));
        extendableUseCaseConfigFactory.installDefaultProvider(VideoCaptureConfig.class, new VideoCaptureConfigProvider(camera2CameraFactory, context));
        extendableUseCaseConfigFactory.installDefaultProvider(PreviewConfig.class, new PreviewConfigProvider(camera2CameraFactory, context));
        return new AppConfig.Builder().setCameraFactory(camera2CameraFactory).setDeviceSurfaceManager(camera2DeviceSurfaceManager).setUseCaseConfigFactory(extendableUseCaseConfigFactory).build();
    }
}
