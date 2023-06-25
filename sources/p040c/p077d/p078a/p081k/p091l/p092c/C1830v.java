package p040c.p077d.p078a.p081k.p091l.p092c;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p040c.p077d.p078a.p081k.p084j.p088z.C1697e;
import p040c.p077d.p078a.p105q.C1949i;

/* renamed from: c.d.a.k.l.c.v */
/* compiled from: TransformationUtils */
public final class C1830v {

    /* renamed from: a */
    public static final Paint f1417a = new Paint(6);

    /* renamed from: b */
    public static final Paint f1418b = new Paint(7);

    /* renamed from: c */
    public static final Paint f1419c;

    /* renamed from: d */
    public static final Set<String> f1420d;

    /* renamed from: e */
    public static final Lock f1421e;

    /* renamed from: c.d.a.k.l.c.v$a */
    /* compiled from: TransformationUtils */
    public static final class C1831a implements Lock {
        public void lock() {
        }

        public void lockInterruptibly() {
        }

        @NonNull
        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        public boolean tryLock() {
            return true;
        }

        public boolean tryLock(long j, @NonNull TimeUnit timeUnit) {
            return true;
        }

        public void unlock() {
        }
    }

    static {
        HashSet hashSet = new HashSet(Arrays.asList(new String[]{"XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"}));
        f1420d = hashSet;
        f1421e = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new C1831a();
        Paint paint = new Paint(7);
        f1419c = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    /* renamed from: a */
    public static void m2093a(@NonNull Bitmap bitmap, @NonNull Bitmap bitmap2, Matrix matrix) {
        f1421e.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f1417a);
            m2097e(canvas);
        } finally {
            f1421e.unlock();
        }
    }

    /* renamed from: b */
    public static Bitmap m2094b(@NonNull C1697e eVar, @NonNull Bitmap bitmap, int i, int i2) {
        float f;
        float f2;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f3 = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            f2 = ((float) i2) / ((float) bitmap.getHeight());
            f3 = (((float) i) - (((float) bitmap.getWidth()) * f2)) * 0.5f;
            f = 0.0f;
        } else {
            f2 = ((float) i) / ((float) bitmap.getWidth());
            f = (((float) i2) - (((float) bitmap.getHeight()) * f2)) * 0.5f;
        }
        matrix.setScale(f2, f2);
        matrix.postTranslate((float) ((int) (f3 + 0.5f)), (float) ((int) (f + 0.5f)));
        Bitmap d = eVar.mo15923d(i, i2, m2103k(bitmap));
        m2108p(bitmap, d);
        m2093a(bitmap, d, matrix);
        return d;
    }

    /* renamed from: c */
    public static Bitmap m2095c(@NonNull C1697e eVar, @NonNull Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() > i || bitmap.getHeight() > i2) {
            boolean isLoggable = Log.isLoggable("TransformationUtils", 2);
            return m2098f(eVar, bitmap, i, i2);
        }
        boolean isLoggable2 = Log.isLoggable("TransformationUtils", 2);
        return bitmap;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: d */
    public static Bitmap m2096d(@NonNull C1697e eVar, @NonNull Bitmap bitmap, int i, int i2) {
        int min = Math.min(i, i2);
        float f = (float) min;
        float f2 = f / 2.0f;
        float width = (float) bitmap.getWidth();
        float height = (float) bitmap.getHeight();
        float max = Math.max(f / width, f / height);
        float f3 = width * max;
        float f4 = max * height;
        float f5 = (f - f3) / 2.0f;
        float f6 = (f - f4) / 2.0f;
        RectF rectF = new RectF(f5, f6, f3 + f5, f4 + f6);
        Bitmap g = m2099g(eVar, bitmap);
        Bitmap d = eVar.mo15923d(min, min, m2100h(bitmap));
        d.setHasAlpha(true);
        f1421e.lock();
        try {
            Canvas canvas = new Canvas(d);
            canvas.drawCircle(f2, f2, f2, f1418b);
            canvas.drawBitmap(g, (Rect) null, rectF, f1419c);
            m2097e(canvas);
            f1421e.unlock();
            if (!g.equals(bitmap)) {
                eVar.mo15922c(g);
            }
            return d;
        } catch (Throwable th) {
            f1421e.unlock();
            throw th;
        }
    }

    /* renamed from: e */
    public static void m2097e(Canvas canvas) {
        canvas.setBitmap((Bitmap) null);
    }

    /* renamed from: f */
    public static Bitmap m2098f(@NonNull C1697e eVar, @NonNull Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            boolean isLoggable = Log.isLoggable("TransformationUtils", 2);
            return bitmap;
        }
        float min = Math.min(((float) i) / ((float) bitmap.getWidth()), ((float) i2) / ((float) bitmap.getHeight()));
        int round = Math.round(((float) bitmap.getWidth()) * min);
        int round2 = Math.round(((float) bitmap.getHeight()) * min);
        if (bitmap.getWidth() == round && bitmap.getHeight() == round2) {
            boolean isLoggable2 = Log.isLoggable("TransformationUtils", 2);
            return bitmap;
        }
        Bitmap d = eVar.mo15923d((int) (((float) bitmap.getWidth()) * min), (int) (((float) bitmap.getHeight()) * min), m2103k(bitmap));
        m2108p(bitmap, d);
        if (Log.isLoggable("TransformationUtils", 2)) {
            "request: " + i + "x" + i2;
            "toFit:   " + bitmap.getWidth() + "x" + bitmap.getHeight();
            "toReuse: " + d.getWidth() + "x" + d.getHeight();
            "minPct:   " + min;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        m2093a(bitmap, d, matrix);
        return d;
    }

    /* renamed from: g */
    public static Bitmap m2099g(@NonNull C1697e eVar, @NonNull Bitmap bitmap) {
        Bitmap.Config h = m2100h(bitmap);
        if (h.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap d = eVar.mo15923d(bitmap.getWidth(), bitmap.getHeight(), h);
        new Canvas(d).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return d;
    }

    @NonNull
    /* renamed from: h */
    public static Bitmap.Config m2100h(@NonNull Bitmap bitmap) {
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) {
            return Bitmap.Config.ARGB_8888;
        }
        return Bitmap.Config.RGBA_F16;
    }

    /* renamed from: i */
    public static Lock m2101i() {
        return f1421e;
    }

    /* renamed from: j */
    public static int m2102j(int i) {
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

    @NonNull
    /* renamed from: k */
    public static Bitmap.Config m2103k(@NonNull Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    @VisibleForTesting
    /* renamed from: l */
    public static void m2104l(int i, Matrix matrix) {
        switch (i) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                return;
            case 3:
                matrix.setRotate(180.0f);
                return;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 6:
                matrix.setRotate(90.0f);
                return;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 8:
                matrix.setRotate(-90.0f);
                return;
            default:
                return;
        }
    }

    /* renamed from: m */
    public static boolean m2105m(int i) {
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: n */
    public static Bitmap m2106n(@NonNull C1697e eVar, @NonNull Bitmap bitmap, int i) {
        if (!m2105m(i)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        m2104l(i, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap d = eVar.mo15923d(Math.round(rectF.width()), Math.round(rectF.height()), m2103k(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        d.setHasAlpha(bitmap.hasAlpha());
        m2093a(bitmap, d, matrix);
        return d;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: o */
    public static Bitmap m2107o(@NonNull C1697e eVar, @NonNull Bitmap bitmap, int i) {
        C1949i.m2560a(i > 0, "roundingRadius must be greater than 0.");
        Bitmap.Config h = m2100h(bitmap);
        Bitmap g = m2099g(eVar, bitmap);
        Bitmap d = eVar.mo15923d(g.getWidth(), g.getHeight(), h);
        d.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(g, tileMode, tileMode);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, (float) d.getWidth(), (float) d.getHeight());
        f1421e.lock();
        try {
            Canvas canvas = new Canvas(d);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            float f = (float) i;
            canvas.drawRoundRect(rectF, f, f, paint);
            m2097e(canvas);
            f1421e.unlock();
            if (!g.equals(bitmap)) {
                eVar.mo15922c(g);
            }
            return d;
        } catch (Throwable th) {
            f1421e.unlock();
            throw th;
        }
    }

    /* renamed from: p */
    public static void m2108p(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }
}
