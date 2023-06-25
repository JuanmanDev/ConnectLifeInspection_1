package androidx.camera.camera2.impl;

import android.content.Context;
import android.util.Rational;
import android.view.WindowManager;
import androidx.annotation.RestrictTo;
import androidx.camera.core.CameraFactory;
import androidx.camera.core.CameraX;
import androidx.camera.core.CaptureConfig;
import androidx.camera.core.ConfigProvider;
import androidx.camera.core.SessionConfig;
import androidx.camera.core.VideoCapture;
import androidx.camera.core.VideoCaptureConfig;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class VideoCaptureConfigProvider implements ConfigProvider<VideoCaptureConfig> {
    public static final Rational DEFAULT_ASPECT_RATIO_16_9 = new Rational(16, 9);
    public static final Rational DEFAULT_ASPECT_RATIO_9_16 = new Rational(9, 16);
    public static final String TAG = "VideoCaptureProvider";
    public final CameraFactory mCameraFactory;
    public final WindowManager mWindowManager;

    public VideoCaptureConfigProvider(CameraFactory cameraFactory, Context context) {
        this.mCameraFactory = cameraFactory;
        this.mWindowManager = (WindowManager) context.getSystemService("window");
    }

    public VideoCaptureConfig getConfig(CameraX.LensFacing lensFacing) {
        List list;
        VideoCaptureConfig.Builder fromConfig = VideoCaptureConfig.Builder.fromConfig(VideoCapture.DEFAULT_CONFIG.getConfig(lensFacing));
        SessionConfig.Builder builder = new SessionConfig.Builder();
        boolean z = true;
        builder.setTemplateType(1);
        fromConfig.setDefaultSessionConfig(builder.build());
        fromConfig.setSessionOptionUnpacker((SessionConfig.OptionUnpacker) Camera2SessionOptionUnpacker.INSTANCE);
        CaptureConfig.Builder builder2 = new CaptureConfig.Builder();
        builder2.setTemplateType(1);
        fromConfig.setDefaultCaptureConfig(builder2.build());
        fromConfig.setCaptureOptionUnpacker((CaptureConfig.OptionUnpacker) Camera2CaptureOptionUnpacker.INSTANCE);
        CameraX.LensFacing lensFacing2 = CameraX.LensFacing.FRONT;
        if (lensFacing == lensFacing2) {
            list = Arrays.asList(new CameraX.LensFacing[]{lensFacing2, CameraX.LensFacing.BACK});
        } else {
            list = Arrays.asList(new CameraX.LensFacing[]{CameraX.LensFacing.BACK, CameraX.LensFacing.FRONT});
        }
        String str = null;
        try {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                CameraX.LensFacing lensFacing3 = (CameraX.LensFacing) it.next();
                String cameraIdForLensFacing = this.mCameraFactory.cameraIdForLensFacing(lensFacing3);
                if (cameraIdForLensFacing != null) {
                    fromConfig.setLensFacing(lensFacing3);
                    str = cameraIdForLensFacing;
                    break;
                }
                str = cameraIdForLensFacing;
            }
            int rotation = this.mWindowManager.getDefaultDisplay().getRotation();
            int sensorRotationDegrees = CameraX.getCameraInfo(str).getSensorRotationDegrees(rotation);
            if (sensorRotationDegrees != 90) {
                if (sensorRotationDegrees != 270) {
                    z = false;
                }
            }
            fromConfig.setTargetRotation(rotation);
            fromConfig.setTargetAspectRatio(z ? DEFAULT_ASPECT_RATIO_9_16 : DEFAULT_ASPECT_RATIO_16_9);
        } catch (Exception unused) {
        }
        return fromConfig.build();
    }
}
