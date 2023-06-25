package p034b.p035a.p036a.p037a;

import android.content.Context;
import android.graphics.Point;
import android.hardware.Camera;
import android.view.WindowManager;
import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.DebugKt;

/* renamed from: b.a.a.a.b */
/* compiled from: CameraConfigurationManager */
public final class C1329b {

    /* renamed from: a */
    public final Context f300a;

    /* renamed from: b */
    public Point f301b;

    /* renamed from: c */
    public Point f302c;

    public C1329b(Context context) {
        this.f300a = context;
    }

    /* renamed from: c */
    public static Point m183c(List<Camera.Size> list, Point point) {
        Iterator<Camera.Size> it = list.iterator();
        int i = 0;
        int i2 = Integer.MAX_VALUE;
        int i3 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Camera.Size next = it.next();
            int i4 = next.width;
            int i5 = next.height;
            int abs = Math.abs(i4 - point.x) + Math.abs(i5 - point.y);
            if (abs == 0) {
                i3 = i5;
                i = i4;
                break;
            } else if (abs < i2) {
                i3 = i5;
                i = i4;
                i2 = abs;
            }
        }
        if (i <= 0 || i3 <= 0) {
            return null;
        }
        return new Point(i, i3);
    }

    /* renamed from: d */
    public static String m184d(Collection<String> collection, String... strArr) {
        if (collection != null) {
            for (String str : strArr) {
                if (collection.contains(str)) {
                    return str;
                }
            }
        }
        return null;
    }

    /* renamed from: g */
    public static Point m185g(Camera.Parameters parameters, Point point) {
        Point c = m183c(parameters.getSupportedPreviewSizes(), point);
        return c == null ? new Point((point.x >> 3) << 3, (point.y >> 3) << 3) : c;
    }

    /* renamed from: a */
    public void mo14976a(Camera camera) {
        mo14977b(camera, false);
    }

    /* renamed from: b */
    public final void mo14977b(Camera camera, boolean z) {
        String str;
        Camera.Parameters parameters = camera.getParameters();
        if (z) {
            str = m184d(parameters.getSupportedFlashModes(), "torch", DebugKt.DEBUG_PROPERTY_VALUE_ON);
        } else {
            str = m184d(parameters.getSupportedFlashModes(), DebugKt.DEBUG_PROPERTY_VALUE_OFF);
        }
        if (str != null) {
            parameters.setFlashMode(str);
        }
        camera.setParameters(parameters);
    }

    /* renamed from: e */
    public Point mo14978e() {
        return this.f301b;
    }

    /* renamed from: f */
    public final int mo14979f() {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int i = 0;
        Camera.getCameraInfo(0, cameraInfo);
        WindowManager windowManager = (WindowManager) this.f300a.getSystemService("window");
        if (windowManager == null) {
            return 0;
        }
        int rotation = windowManager.getDefaultDisplay().getRotation();
        if (rotation != 0) {
            if (rotation == 1) {
                i = 90;
            } else if (rotation == 2) {
                i = 180;
            } else if (rotation == 3) {
                i = BottomAppBarTopEdgeTreatment.ANGLE_UP;
            }
        }
        if (cameraInfo.facing == 1) {
            return (360 - ((cameraInfo.orientation + i) % 360)) % 360;
        }
        return ((cameraInfo.orientation - i) + 360) % 360;
    }

    /* renamed from: h */
    public void mo14980h(Camera camera) {
        Point j = C1328a.m176j(this.f300a);
        Point point = new Point();
        point.x = j.x;
        point.y = j.y;
        if (C1328a.m179m(this.f300a)) {
            point.x = j.y;
            point.y = j.x;
        }
        this.f302c = m185g(camera.getParameters(), point);
        if (C1328a.m179m(this.f300a)) {
            Point point2 = this.f302c;
            this.f301b = new Point(point2.y, point2.x);
            return;
        }
        this.f301b = this.f302c;
    }

    /* renamed from: i */
    public void mo14981i(Camera camera) {
        mo14977b(camera, true);
    }

    /* renamed from: j */
    public final int[] mo14982j(Camera camera, float f) {
        int i = (int) (f * 1000.0f);
        int[] iArr = null;
        int i2 = Integer.MAX_VALUE;
        for (int[] next : camera.getParameters().getSupportedPreviewFpsRange()) {
            int abs = Math.abs(i - next[0]) + Math.abs(i - next[1]);
            if (abs < i2) {
                iArr = next;
                i2 = abs;
            }
        }
        return iArr;
    }

    /* renamed from: k */
    public void mo14983k(Camera camera) {
        Camera.Parameters parameters = camera.getParameters();
        Point point = this.f302c;
        parameters.setPreviewSize(point.x, point.y);
        int[] j = mo14982j(camera, 60.0f);
        if (j != null) {
            parameters.setPreviewFpsRange(j[0], j[1]);
        }
        camera.setDisplayOrientation(mo14979f());
        camera.setParameters(parameters);
    }
}
