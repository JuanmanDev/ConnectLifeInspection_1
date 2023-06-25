package p040c.p531f0.p532a.p536f;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.net.Uri;
import android.os.AsyncTask;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import p040c.p531f0.p532a.p533c.C8828b;
import p040c.p531f0.p532a.p535e.C8835b;

/* renamed from: c.f0.a.f.a */
/* compiled from: BitmapLoadUtils */
public class C8837a {
    /* renamed from: a */
    public static int m23789a(@NonNull BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        int i5 = 1;
        if (i3 > i2 || i4 > i) {
            while (true) {
                if (i3 / i5 <= i2 && i4 / i5 <= i) {
                    break;
                }
                i5 *= 2;
            }
        }
        return i5;
    }

    /* renamed from: b */
    public static int m23790b(@NonNull Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        Point point = new Point();
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getSize(point);
        }
        int sqrt = (int) Math.sqrt(Math.pow((double) point.x, 2.0d) + Math.pow((double) point.y, 2.0d));
        Canvas canvas = new Canvas();
        int min = Math.min(canvas.getMaximumBitmapWidth(), canvas.getMaximumBitmapHeight());
        if (min > 0) {
            sqrt = Math.min(sqrt, min);
        }
        int c = C8839c.m23801c();
        if (c > 0) {
            sqrt = Math.min(sqrt, c);
        }
        "maxBitmapSize: " + sqrt;
        return sqrt;
    }

    /* renamed from: c */
    public static void m23791c(@Nullable Closeable closeable) {
        if (closeable != null && (closeable instanceof Closeable)) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: d */
    public static void m23792d(@NonNull Context context, @NonNull Uri uri, @Nullable Uri uri2, int i, int i2, C8828b bVar) {
        new C8835b(context, uri, uri2, i, i2, bVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* renamed from: e */
    public static int m23793e(int i) {
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return BottomAppBarTopEdgeTreatment.ANGLE_UP;
            default:
                return 0;
        }
    }

    /* renamed from: f */
    public static int m23794f(int i) {
        return (i == 2 || i == 7 || i == 4 || i == 5) ? -1 : 1;
    }

    /* renamed from: g */
    public static int m23795g(@NonNull Context context, @NonNull Uri uri) {
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                return 0;
            }
            int c = new C8842f(openInputStream).mo46022c();
            m23791c(openInputStream);
            return c;
        } catch (IOException unused) {
            "getExifOrientation: " + uri.toString();
            return 0;
        }
    }

    /* renamed from: h */
    public static Bitmap m23796h(@NonNull Bitmap bitmap, @NonNull Matrix matrix) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            return !bitmap.sameAs(createBitmap) ? createBitmap : bitmap;
        } catch (OutOfMemoryError unused) {
            return bitmap;
        }
    }
}
