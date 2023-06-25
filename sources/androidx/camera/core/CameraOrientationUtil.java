package androidx.camera.core;

import androidx.annotation.RestrictTo;
import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class CameraOrientationUtil {
    public static final boolean DEBUG = false;
    public static final String TAG = "CameraOrientationUtil";

    public static int getRelativeImageRotation(int i, int i2, boolean z) {
        if (z) {
            return ((i2 - i) + 360) % 360;
        }
        return (i2 + i) % 360;
    }

    public static int surfaceRotationToDegrees(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 90;
        }
        if (i == 2) {
            return 180;
        }
        if (i == 3) {
            return BottomAppBarTopEdgeTreatment.ANGLE_UP;
        }
        throw new IllegalArgumentException("Unsupported surface rotation: " + i);
    }
}
