package p040c.p175p.p184b.p185a.p199k;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import p040c.p175p.p184b.p185a.p190e.C2271b;
import p040c.p175p.p184b.p185a.p190e.C2273d;

/* renamed from: c.p.b.a.k.i */
/* compiled from: Utils */
public abstract class C2347i {

    /* renamed from: a */
    public static DisplayMetrics f2559a = null;

    /* renamed from: b */
    public static int f2560b = 50;

    /* renamed from: c */
    public static int f2561c = 8000;

    /* renamed from: d */
    public static final float f2562d = Float.intBitsToFloat(1);

    /* renamed from: e */
    public static Rect f2563e = new Rect();

    /* renamed from: f */
    public static Paint.FontMetrics f2564f = new Paint.FontMetrics();

    /* renamed from: g */
    public static Rect f2565g = new Rect();

    /* renamed from: h */
    public static Rect f2566h = new Rect();

    /* renamed from: i */
    public static Rect f2567i = new Rect();

    /* renamed from: j */
    public static Paint.FontMetrics f2568j = new Paint.FontMetrics();

    static {
        Double.longBitsToDouble(1);
        m3961h();
    }

    /* renamed from: a */
    public static int m3954a(Paint paint, String str) {
        Rect rect = f2563e;
        rect.set(0, 0, 0, 0);
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.height();
    }

    /* renamed from: b */
    public static C2339b m3955b(Paint paint, String str) {
        C2339b b = C2339b.m3918b(0.0f, 0.0f);
        m3956c(paint, str, b);
        return b;
    }

    /* renamed from: c */
    public static void m3956c(Paint paint, String str, C2339b bVar) {
        Rect rect = f2565g;
        rect.set(0, 0, 0, 0);
        paint.getTextBounds(str, 0, str.length(), rect);
        bVar.f2532c = (float) rect.width();
        bVar.f2533d = (float) rect.height();
    }

    /* renamed from: d */
    public static int m3957d(Paint paint, String str) {
        return (int) paint.measureText(str);
    }

    /* renamed from: e */
    public static float m3958e(float f) {
        DisplayMetrics displayMetrics = f2559a;
        if (displayMetrics == null) {
            return f;
        }
        return f * displayMetrics.density;
    }

    /* renamed from: f */
    public static void m3959f(Canvas canvas, Drawable drawable, int i, int i2, int i3, int i4) {
        C2342e b = C2342e.m3924b();
        b.f2538c = (float) (i - (i3 / 2));
        b.f2539d = (float) (i2 - (i4 / 2));
        drawable.copyBounds(f2566h);
        Rect rect = f2566h;
        int i5 = rect.left;
        int i6 = rect.top;
        drawable.setBounds(i5, i6, i5 + i3, i3 + i6);
        int save = canvas.save();
        canvas.translate(b.f2538c, b.f2539d);
        drawable.draw(canvas);
        canvas.restoreToCount(save);
    }

    /* renamed from: g */
    public static void m3960g(Canvas canvas, String str, float f, float f2, Paint paint, C2342e eVar, float f3) {
        float fontMetrics = paint.getFontMetrics(f2568j);
        paint.getTextBounds(str, 0, str.length(), f2567i);
        float f4 = 0.0f - ((float) f2567i.left);
        float f5 = (-f2568j.ascent) + 0.0f;
        Paint.Align textAlign = paint.getTextAlign();
        paint.setTextAlign(Paint.Align.LEFT);
        if (f3 != 0.0f) {
            float width = f4 - (((float) f2567i.width()) * 0.5f);
            float f6 = f5 - (fontMetrics * 0.5f);
            if (!(eVar.f2538c == 0.5f && eVar.f2539d == 0.5f)) {
                C2339b s = m3972s((float) f2567i.width(), fontMetrics, f3);
                f -= s.f2532c * (eVar.f2538c - 0.5f);
                f2 -= s.f2533d * (eVar.f2539d - 0.5f);
                C2339b.m3919c(s);
            }
            canvas.save();
            canvas.translate(f, f2);
            canvas.rotate(f3);
            canvas.drawText(str, width, f6, paint);
            canvas.restore();
        } else {
            if (!(eVar.f2538c == 0.0f && eVar.f2539d == 0.0f)) {
                f4 -= ((float) f2567i.width()) * eVar.f2538c;
                f5 -= fontMetrics * eVar.f2539d;
            }
            canvas.drawText(str, f4 + f, f5 + f2, paint);
        }
        paint.setTextAlign(textAlign);
    }

    /* renamed from: h */
    public static C2273d m3961h() {
        return new C2271b(1);
    }

    /* renamed from: i */
    public static int m3962i(float f) {
        float x = m3977x((double) f);
        if (Float.isInfinite(x)) {
            return 0;
        }
        return ((int) Math.ceil(-Math.log10((double) x))) + 2;
    }

    /* renamed from: j */
    public static float m3963j(Paint paint) {
        return m3964k(paint, f2564f);
    }

    /* renamed from: k */
    public static float m3964k(Paint paint, Paint.FontMetrics fontMetrics) {
        paint.getFontMetrics(fontMetrics);
        return fontMetrics.descent - fontMetrics.ascent;
    }

    /* renamed from: l */
    public static float m3965l(Paint paint) {
        return m3966m(paint, f2564f);
    }

    /* renamed from: m */
    public static float m3966m(Paint paint, Paint.FontMetrics fontMetrics) {
        paint.getFontMetrics(fontMetrics);
        return (fontMetrics.ascent - fontMetrics.top) + fontMetrics.bottom;
    }

    /* renamed from: n */
    public static int m3967n() {
        return f2561c;
    }

    /* renamed from: o */
    public static int m3968o() {
        return f2560b;
    }

    /* renamed from: p */
    public static float m3969p(float f) {
        while (f < 0.0f) {
            f += 360.0f;
        }
        return f % 360.0f;
    }

    /* renamed from: q */
    public static void m3970q(C2342e eVar, float f, float f2, C2342e eVar2) {
        double d = (double) f;
        double d2 = (double) f2;
        eVar2.f2538c = (float) (((double) eVar.f2538c) + (Math.cos(Math.toRadians(d2)) * d));
        eVar2.f2539d = (float) (((double) eVar.f2539d) + (d * Math.sin(Math.toRadians(d2))));
    }

    /* renamed from: r */
    public static int m3971r() {
        return Build.VERSION.SDK_INT;
    }

    /* renamed from: s */
    public static C2339b m3972s(float f, float f2, float f3) {
        return m3973t(f, f2, f3 * 0.017453292f);
    }

    /* renamed from: t */
    public static C2339b m3973t(float f, float f2, float f3) {
        double d = (double) f3;
        return C2339b.m3918b(Math.abs(((float) Math.cos(d)) * f) + Math.abs(((float) Math.sin(d)) * f2), Math.abs(f * ((float) Math.sin(d))) + Math.abs(f2 * ((float) Math.cos(d))));
    }

    /* renamed from: u */
    public static void m3974u(Context context) {
        if (context == null) {
            f2560b = ViewConfiguration.getMinimumFlingVelocity();
            f2561c = ViewConfiguration.getMaximumFlingVelocity();
            return;
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        f2560b = viewConfiguration.getScaledMinimumFlingVelocity();
        f2561c = viewConfiguration.getScaledMaximumFlingVelocity();
        f2559a = context.getResources().getDisplayMetrics();
    }

    /* renamed from: v */
    public static double m3975v(double d) {
        if (d == Double.POSITIVE_INFINITY) {
            return d;
        }
        double d2 = d + 0.0d;
        return Double.longBitsToDouble(Double.doubleToRawLongBits(d2) + (d2 >= 0.0d ? 1 : -1));
    }

    @SuppressLint({"NewApi"})
    /* renamed from: w */
    public static void m3976w(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidateDelayed(10);
        }
    }

    /* renamed from: x */
    public static float m3977x(double d) {
        if (Double.isInfinite(d) || Double.isNaN(d) || d == 0.0d) {
            return 0.0f;
        }
        float pow = (float) Math.pow(10.0d, (double) (1 - ((int) ((float) Math.ceil((double) ((float) Math.log10(d < 0.0d ? -d : d)))))));
        return ((float) Math.round(d * ((double) pow))) / pow;
    }

    /* renamed from: y */
    public static void m3978y(MotionEvent motionEvent, VelocityTracker velocityTracker) {
        velocityTracker.computeCurrentVelocity(1000, (float) f2561c);
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        float xVelocity = velocityTracker.getXVelocity(pointerId);
        float yVelocity = velocityTracker.getYVelocity(pointerId);
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            if (i != actionIndex) {
                int pointerId2 = motionEvent.getPointerId(i);
                if ((velocityTracker.getXVelocity(pointerId2) * xVelocity) + (velocityTracker.getYVelocity(pointerId2) * yVelocity) < 0.0f) {
                    velocityTracker.clear();
                    return;
                }
            }
        }
    }
}
