package androidx.camera.camera2.impl;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.camera.core.BaseCamera;
import androidx.camera.core.CameraFactory;
import androidx.camera.core.CameraInfoUnavailableException;
import androidx.camera.core.CameraX;
import androidx.camera.core.CameraXThreads;
import com.amazon.identity.auth.map.device.token.MAPCookie;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class Camera2CameraFactory implements CameraFactory {
    public static final String TAG = "Camera2CameraFactory";
    public static final Handler sHandler = new Handler(sHandlerThread.getLooper());
    public static final HandlerThread sHandlerThread;
    public final CameraManager mCameraManager;

    /* renamed from: androidx.camera.camera2.impl.Camera2CameraFactory$1 */
    public static /* synthetic */ class C03561 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$camera$core$CameraX$LensFacing;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                androidx.camera.core.CameraX$LensFacing[] r0 = androidx.camera.core.CameraX.LensFacing.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$androidx$camera$core$CameraX$LensFacing = r0
                androidx.camera.core.CameraX$LensFacing r1 = androidx.camera.core.CameraX.LensFacing.BACK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$androidx$camera$core$CameraX$LensFacing     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.camera.core.CameraX$LensFacing r1 = androidx.camera.core.CameraX.LensFacing.FRONT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.Camera2CameraFactory.C03561.<clinit>():void");
        }
    }

    static {
        HandlerThread handlerThread = new HandlerThread(CameraXThreads.TAG);
        sHandlerThread = handlerThread;
        handlerThread.start();
    }

    public Camera2CameraFactory(Context context) {
        this.mCameraManager = (CameraManager) context.getSystemService("camera");
    }

    @Nullable
    public String cameraIdForLensFacing(CameraX.LensFacing lensFacing) {
        Set<String> availableCameraIds = getAvailableCameraIds();
        int i = -1;
        int i2 = C03561.$SwitchMap$androidx$camera$core$CameraX$LensFacing[lensFacing.ordinal()];
        if (i2 == 1) {
            i = 1;
        } else if (i2 == 2) {
            i = 0;
        }
        for (String next : availableCameraIds) {
            try {
                Integer num = (Integer) this.mCameraManager.getCameraCharacteristics(next).get(CameraCharacteristics.LENS_FACING);
                if (num != null && num.equals(i)) {
                    return next;
                }
            } catch (CameraAccessException e) {
                throw new CameraInfoUnavailableException("Unable to retrieve info for camera with id " + next + MAPCookie.DOT, e);
            }
        }
        return null;
    }

    public Set<String> getAvailableCameraIds() {
        try {
            return new LinkedHashSet(Arrays.asList(this.mCameraManager.getCameraIdList()));
        } catch (CameraAccessException e) {
            throw new CameraInfoUnavailableException("Unable to retrieve list of cameras on device.", e);
        }
    }

    public BaseCamera getCamera(String str) {
        return new Camera(this.mCameraManager, str, sHandler);
    }
}
