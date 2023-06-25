package androidx.camera.camera2.impl;

import android.content.Context;
import android.view.WindowManager;
import androidx.annotation.RestrictTo;
import androidx.camera.core.CameraFactory;
import androidx.camera.core.CameraX;
import androidx.camera.core.CaptureConfig;
import androidx.camera.core.ConfigProvider;
import androidx.camera.core.Preview;
import androidx.camera.core.PreviewConfig;
import androidx.camera.core.SessionConfig;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class PreviewConfigProvider implements ConfigProvider<PreviewConfig> {
    public static final String TAG = "PreviewConfigProvider";
    public final CameraFactory mCameraFactory;
    public final WindowManager mWindowManager;

    public PreviewConfigProvider(CameraFactory cameraFactory, Context context) {
        this.mCameraFactory = cameraFactory;
        this.mWindowManager = (WindowManager) context.getSystemService("window");
    }

    public PreviewConfig getConfig(CameraX.LensFacing lensFacing) {
        List list;
        PreviewConfig.Builder fromConfig = PreviewConfig.Builder.fromConfig(Preview.DEFAULT_CONFIG.getConfig(lensFacing));
        SessionConfig.Builder builder = new SessionConfig.Builder();
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
        try {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                CameraX.LensFacing lensFacing3 = (CameraX.LensFacing) it.next();
                if (this.mCameraFactory.cameraIdForLensFacing(lensFacing3) != null) {
                    fromConfig.setLensFacing(lensFacing3);
                    break;
                }
            }
            fromConfig.setTargetRotation(this.mWindowManager.getDefaultDisplay().getRotation());
        } catch (Exception unused) {
        }
        return fromConfig.build();
    }
}
