package p034b.p035a.p036a.p037a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.TypedValue;
import android.view.Display;
import android.view.MotionEvent;
import android.view.WindowManager;
import androidx.core.app.NotificationManagerCompat;
import com.juconnect.vivino.global.UrlConstKt;

/* renamed from: b.a.a.a.a */
/* compiled from: BGAQRCodeUtil */
public class C1328a {

    /* renamed from: a */
    public static boolean f299a;

    /* renamed from: a */
    public static Bitmap m167a(Bitmap bitmap, int i) {
        float f;
        float f2;
        if (bitmap == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate((float) i, ((float) bitmap.getWidth()) / 2.0f, ((float) bitmap.getHeight()) / 2.0f);
        if (i == 90) {
            f = (float) bitmap.getHeight();
            f2 = 0.0f;
        } else {
            f = (float) bitmap.getHeight();
            f2 = (float) bitmap.getWidth();
        }
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        matrix.postTranslate(f - fArr[2], f2 - fArr[5]);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getHeight(), bitmap.getWidth(), Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(bitmap, matrix, new Paint());
        return createBitmap;
    }

    /* renamed from: b */
    public static float m168b(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((double) ((x * x) + (y * y)));
    }

    /* renamed from: c */
    public static Rect m169c(float f, float f2, float f3, int i, int i2, int i3, int i4) {
        int i5 = (int) ((((float) i) * f) / 2.0f);
        int i6 = (int) ((((float) i2) * f) / 2.0f);
        int i7 = (int) (((f2 / ((float) i3)) * 2000.0f) - 1000.0f);
        int i8 = (int) (((f3 / ((float) i4)) * 2000.0f) - 1000.0f);
        RectF rectF = new RectF((float) m170d(i7 - i5, NotificationManagerCompat.IMPORTANCE_UNSPECIFIED, 1000), (float) m170d(i8 - i6, NotificationManagerCompat.IMPORTANCE_UNSPECIFIED, 1000), (float) m170d(i7 + i5, NotificationManagerCompat.IMPORTANCE_UNSPECIFIED, 1000), (float) m170d(i8 + i6, NotificationManagerCompat.IMPORTANCE_UNSPECIFIED, 1000));
        return new Rect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
    }

    /* renamed from: d */
    public static int m170d(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    /* renamed from: e */
    public static void m171e(String str) {
        m172f("BGAQRCode", str);
    }

    /* renamed from: f */
    public static void m172f(String str, String str2) {
        boolean z = f299a;
    }

    /* renamed from: g */
    public static int m173g(Context context, float f) {
        return (int) TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    /* renamed from: h */
    public static void m174h(String str) {
        boolean z = f299a;
    }

    /* renamed from: i */
    public static Bitmap m175i(String str) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            int i = 1;
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            int i2 = options.outHeight / 400;
            if (i2 > 0) {
                i = i2;
            }
            options.inSampleSize = i;
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeFile(str, options);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: j */
    public static Point m176j(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point;
    }

    /* renamed from: k */
    public static int m177k(Context context) {
        int identifier;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16843277});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        if (!z && (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", UrlConstKt.APP_PLATFORM)) > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: l */
    public static boolean m178l() {
        return f299a;
    }

    /* renamed from: m */
    public static boolean m179m(Context context) {
        Point j = m176j(context);
        return j.y > j.x;
    }

    /* renamed from: n */
    public static Bitmap m180n(Bitmap bitmap, int i) {
        if (bitmap == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    /* renamed from: o */
    public static void m181o(String str, Rect rect) {
        m172f("BGAQRCodeFocusArea", str + " centerX：" + rect.centerX() + " centerY：" + rect.centerY() + " width：" + rect.width() + " height：" + rect.height() + " rectHalfWidth：" + (rect.width() / 2) + " rectHalfHeight：" + (rect.height() / 2) + " left：" + rect.left + " top：" + rect.top + " right：" + rect.right + " bottom：" + rect.bottom);
    }

    /* renamed from: p */
    public static int m182p(Context context, float f) {
        return (int) TypedValue.applyDimension(2, f, context.getResources().getDisplayMetrics());
    }
}
