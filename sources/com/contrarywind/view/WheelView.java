package com.contrarywind.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p040c.p117g.p118a.C1994a;
import p040c.p117g.p119b.C1995a;
import p040c.p117g.p120c.C1996a;
import p040c.p117g.p120c.C1997b;
import p040c.p117g.p121d.C1998a;
import p040c.p117g.p121d.C1999b;
import p040c.p117g.p121d.C2000c;

public class WheelView extends View {

    /* renamed from: g0 */
    public static final String[] f7067g0 = {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09"};

    /* renamed from: A */
    public int f7068A;

    /* renamed from: B */
    public int f7069B;

    /* renamed from: C */
    public float f7070C;

    /* renamed from: D */
    public Typeface f7071D;

    /* renamed from: E */
    public int f7072E;

    /* renamed from: F */
    public int f7073F;

    /* renamed from: G */
    public int f7074G;

    /* renamed from: H */
    public float f7075H;

    /* renamed from: I */
    public boolean f7076I;

    /* renamed from: J */
    public float f7077J;

    /* renamed from: K */
    public float f7078K;

    /* renamed from: L */
    public float f7079L;

    /* renamed from: M */
    public float f7080M;

    /* renamed from: N */
    public int f7081N;

    /* renamed from: O */
    public int f7082O;

    /* renamed from: P */
    public int f7083P;

    /* renamed from: Q */
    public int f7084Q;

    /* renamed from: R */
    public int f7085R;

    /* renamed from: S */
    public int f7086S;

    /* renamed from: T */
    public int f7087T;

    /* renamed from: U */
    public int f7088U;

    /* renamed from: V */
    public int f7089V;

    /* renamed from: W */
    public float f7090W;

    /* renamed from: a0 */
    public long f7091a0;

    /* renamed from: b0 */
    public int f7092b0;

    /* renamed from: c0 */
    public int f7093c0;

    /* renamed from: d0 */
    public int f7094d0;

    /* renamed from: e */
    public DividerType f7095e;

    /* renamed from: e0 */
    public int f7096e0;

    /* renamed from: f0 */
    public float f7097f0;

    /* renamed from: l */
    public Context f7098l;

    /* renamed from: m */
    public Handler f7099m;

    /* renamed from: n */
    public GestureDetector f7100n;

    /* renamed from: o */
    public C1997b f7101o;

    /* renamed from: p */
    public boolean f7102p;

    /* renamed from: q */
    public boolean f7103q;

    /* renamed from: r */
    public ScheduledExecutorService f7104r;

    /* renamed from: s */
    public ScheduledFuture<?> f7105s;

    /* renamed from: t */
    public Paint f7106t;

    /* renamed from: u */
    public Paint f7107u;

    /* renamed from: v */
    public Paint f7108v;

    /* renamed from: w */
    public C1994a f7109w;

    /* renamed from: x */
    public String f7110x;

    /* renamed from: y */
    public int f7111y;

    /* renamed from: z */
    public int f7112z;

    public enum ACTION {
        CLICK,
        FLING,
        DAGGLE
    }

    public enum DividerType {
        FILL,
        WRAP
    }

    /* renamed from: com.contrarywind.view.WheelView$a */
    public class C3857a implements Runnable {
        public C3857a() {
        }

        public void run() {
            WheelView.this.f7101o.mo16560a(WheelView.this.getCurrentItem());
        }
    }

    public WheelView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: b */
    public void mo22341b() {
        ScheduledFuture<?> scheduledFuture = this.f7105s;
        if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
            this.f7105s.cancel(true);
            this.f7105s = null;
        }
    }

    /* renamed from: c */
    public final String mo22342c(Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof C1995a) {
            return ((C1995a) obj).mo16558a();
        }
        if (obj instanceof Integer) {
            return mo22343d(((Integer) obj).intValue());
        }
        return obj.toString();
    }

    /* renamed from: d */
    public final String mo22343d(int i) {
        return (i < 0 || i >= 10) ? String.valueOf(i) : f7067g0[i];
    }

    /* renamed from: e */
    public final int mo22344e(int i) {
        if (i < 0) {
            return mo22344e(i + this.f7109w.getItemsCount());
        }
        return i > this.f7109w.getItemsCount() + -1 ? mo22344e(i - this.f7109w.getItemsCount()) : i;
    }

    /* renamed from: f */
    public int mo22345f(Paint paint, String str) {
        if (str == null || str.length() <= 0) {
            return 0;
        }
        int length = str.length();
        float[] fArr = new float[length];
        paint.getTextWidths(str, fArr);
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            i += (int) Math.ceil((double) fArr[i2]);
        }
        return i;
    }

    /* renamed from: g */
    public final void mo22346g(Context context) {
        this.f7098l = context;
        this.f7099m = new C1999b(this);
        GestureDetector gestureDetector = new GestureDetector(context, new C1996a(this));
        this.f7100n = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.f7076I = true;
        this.f7080M = 0.0f;
        this.f7081N = -1;
        mo22354h();
    }

    public final C1994a getAdapter() {
        return this.f7109w;
    }

    public final int getCurrentItem() {
        int i;
        C1994a aVar = this.f7109w;
        if (aVar == null) {
            return 0;
        }
        if (!this.f7076I || ((i = this.f7082O) >= 0 && i < aVar.getItemsCount())) {
            return Math.max(0, Math.min(this.f7082O, this.f7109w.getItemsCount() - 1));
        }
        return Math.max(0, Math.min(Math.abs(Math.abs(this.f7082O) - this.f7109w.getItemsCount()), this.f7109w.getItemsCount() - 1));
    }

    public Handler getHandler() {
        return this.f7099m;
    }

    public int getInitPosition() {
        return this.f7081N;
    }

    public float getItemHeight() {
        return this.f7070C;
    }

    public int getItemsCount() {
        C1994a aVar = this.f7109w;
        if (aVar != null) {
            return aVar.getItemsCount();
        }
        return 0;
    }

    public float getTotalScrollY() {
        return this.f7080M;
    }

    /* renamed from: h */
    public final void mo22354h() {
        Paint paint = new Paint();
        this.f7106t = paint;
        paint.setColor(this.f7072E);
        this.f7106t.setAntiAlias(true);
        this.f7106t.setTypeface(this.f7071D);
        this.f7106t.setTextSize((float) this.f7111y);
        Paint paint2 = new Paint();
        this.f7107u = paint2;
        paint2.setColor(this.f7073F);
        this.f7107u.setAntiAlias(true);
        this.f7107u.setTextScaleX(1.1f);
        this.f7107u.setTypeface(this.f7071D);
        this.f7107u.setTextSize((float) this.f7111y);
        Paint paint3 = new Paint();
        this.f7108v = paint3;
        paint3.setColor(this.f7074G);
        this.f7108v.setAntiAlias(true);
        setLayerType(1, (Paint) null);
    }

    /* renamed from: i */
    public boolean mo22355i() {
        return this.f7076I;
    }

    /* renamed from: j */
    public final void mo22356j() {
        float f = this.f7075H;
        if (f < 1.0f) {
            this.f7075H = 1.0f;
        } else if (f > 4.0f) {
            this.f7075H = 4.0f;
        }
    }

    /* renamed from: k */
    public final void mo22357k() {
        Rect rect = new Rect();
        for (int i = 0; i < this.f7109w.getItemsCount(); i++) {
            String c = mo22342c(this.f7109w.getItem(i));
            this.f7107u.getTextBounds(c, 0, c.length(), rect);
            int width = rect.width();
            if (width > this.f7112z) {
                this.f7112z = width;
            }
        }
        this.f7107u.getTextBounds("星期", 0, 2, rect);
        int height = rect.height() + 2;
        this.f7068A = height;
        this.f7070C = this.f7075H * ((float) height);
    }

    /* renamed from: l */
    public final void mo22358l(String str) {
        String str2;
        Rect rect = new Rect();
        this.f7107u.getTextBounds(str, 0, str.length(), rect);
        int i = this.f7093c0;
        if (i == 3) {
            this.f7094d0 = 0;
        } else if (i == 5) {
            this.f7094d0 = (this.f7087T - rect.width()) - ((int) this.f7097f0);
        } else if (i == 17) {
            if (this.f7102p || (str2 = this.f7110x) == null || str2.equals("") || !this.f7103q) {
                this.f7094d0 = (int) (((double) (this.f7087T - rect.width())) * 0.5d);
            } else {
                this.f7094d0 = (int) (((double) (this.f7087T - rect.width())) * 0.25d);
            }
        }
    }

    /* renamed from: m */
    public final void mo22359m(String str) {
        String str2;
        Rect rect = new Rect();
        this.f7106t.getTextBounds(str, 0, str.length(), rect);
        int i = this.f7093c0;
        if (i == 3) {
            this.f7096e0 = 0;
        } else if (i == 5) {
            this.f7096e0 = (this.f7087T - rect.width()) - ((int) this.f7097f0);
        } else if (i == 17) {
            if (this.f7102p || (str2 = this.f7110x) == null || str2.equals("") || !this.f7103q) {
                this.f7096e0 = (int) (((double) (this.f7087T - rect.width())) * 0.5d);
            } else {
                this.f7096e0 = (int) (((double) (this.f7087T - rect.width())) * 0.25d);
            }
        }
    }

    /* renamed from: n */
    public final void mo22360n() {
        if (this.f7101o != null) {
            postDelayed(new C3857a(), 200);
        }
    }

    /* renamed from: o */
    public final void mo22361o() {
        if (this.f7109w != null) {
            mo22357k();
            int i = (int) (this.f7070C * ((float) (this.f7085R - 1)));
            this.f7086S = (int) (((double) (i * 2)) / 3.141592653589793d);
            this.f7088U = (int) (((double) i) / 3.141592653589793d);
            this.f7087T = View.MeasureSpec.getSize(this.f7092b0);
            int i2 = this.f7086S;
            float f = this.f7070C;
            this.f7077J = (((float) i2) - f) / 2.0f;
            float f2 = (((float) i2) + f) / 2.0f;
            this.f7078K = f2;
            this.f7079L = (f2 - ((f - ((float) this.f7068A)) / 2.0f)) - this.f7097f0;
            if (this.f7081N == -1) {
                if (this.f7076I) {
                    this.f7081N = (this.f7109w.getItemsCount() + 1) / 2;
                } else {
                    this.f7081N = 0;
                }
            }
            this.f7083P = this.f7081N;
        }
    }

    public void onDraw(Canvas canvas) {
        boolean z;
        boolean z2;
        String str;
        int i;
        Canvas canvas2 = canvas;
        if (this.f7109w != null) {
            boolean z3 = false;
            int min = Math.min(Math.max(0, this.f7081N), this.f7109w.getItemsCount() - 1);
            this.f7081N = min;
            Object[] objArr = new Object[this.f7085R];
            int i2 = (int) (this.f7080M / this.f7070C);
            this.f7084Q = i2;
            try {
                this.f7083P = min + (i2 % this.f7109w.getItemsCount());
            } catch (ArithmeticException unused) {
            }
            if (!this.f7076I) {
                if (this.f7083P < 0) {
                    this.f7083P = 0;
                }
                if (this.f7083P > this.f7109w.getItemsCount() - 1) {
                    this.f7083P = this.f7109w.getItemsCount() - 1;
                }
            } else {
                if (this.f7083P < 0) {
                    this.f7083P = this.f7109w.getItemsCount() + this.f7083P;
                }
                if (this.f7083P > this.f7109w.getItemsCount() - 1) {
                    this.f7083P -= this.f7109w.getItemsCount();
                }
            }
            float f = this.f7080M % this.f7070C;
            int i3 = 0;
            while (true) {
                int i4 = this.f7085R;
                if (i3 >= i4) {
                    break;
                }
                int i5 = this.f7083P - ((i4 / 2) - i3);
                if (this.f7076I) {
                    objArr[i3] = this.f7109w.getItem(mo22344e(i5));
                } else if (i5 < 0) {
                    objArr[i3] = "";
                } else if (i5 > this.f7109w.getItemsCount() - 1) {
                    objArr[i3] = "";
                } else {
                    objArr[i3] = this.f7109w.getItem(i5);
                }
                i3++;
            }
            boolean z4 = false;
            if (this.f7095e == DividerType.WRAP) {
                if (TextUtils.isEmpty(this.f7110x)) {
                    i = (this.f7087T - this.f7112z) / 2;
                } else {
                    i = (this.f7087T - this.f7112z) / 4;
                }
                float f2 = (float) (i - 12);
                if (f2 <= 0.0f) {
                    f2 = 10.0f;
                }
                float f3 = f2;
                float f4 = ((float) this.f7087T) - f3;
                float f5 = this.f7077J;
                Canvas canvas3 = canvas;
                float f6 = f3;
                float f7 = f4;
                canvas3.drawLine(f6, f5, f7, f5, this.f7108v);
                float f8 = this.f7078K;
                canvas3.drawLine(f6, f8, f7, f8, this.f7108v);
            } else {
                float f9 = this.f7077J;
                canvas.drawLine(0.0f, f9, (float) this.f7087T, f9, this.f7108v);
                float f10 = this.f7078K;
                canvas.drawLine(0.0f, f10, (float) this.f7087T, f10, this.f7108v);
            }
            if (!TextUtils.isEmpty(this.f7110x) && this.f7103q) {
                canvas2.drawText(this.f7110x, ((float) (this.f7087T - mo22345f(this.f7107u, this.f7110x))) - this.f7097f0, this.f7079L, this.f7107u);
            }
            int i6 = 0;
            while (i6 < this.f7085R) {
                canvas.save();
                double d = (double) (((this.f7070C * ((float) i6)) - f) / ((float) this.f7088U));
                float f11 = (float) (90.0d - ((d / 3.141592653589793d) * 180.0d));
                if (f11 >= 90.0f || f11 <= -90.0f) {
                    z2 = z4;
                    z = z3;
                    canvas.restore();
                } else {
                    float pow = (float) Math.pow((double) (Math.abs(f11) / 90.0f), 2.2d);
                    if (this.f7103q || TextUtils.isEmpty(this.f7110x) || TextUtils.isEmpty(mo22342c(objArr[i6]))) {
                        str = mo22342c(objArr[i6]);
                    } else {
                        str = mo22342c(objArr[i6]) + this.f7110x;
                    }
                    mo22365p(str);
                    mo22358l(str);
                    mo22359m(str);
                    float cos = (float) ((((double) this.f7088U) - (Math.cos(d) * ((double) this.f7088U))) - ((Math.sin(d) * ((double) this.f7068A)) / 2.0d));
                    canvas2.translate(0.0f, cos);
                    float f12 = this.f7077J;
                    if (cos > f12 || ((float) this.f7068A) + cos < f12) {
                        float f13 = this.f7078K;
                        if (cos > f13 || ((float) this.f7068A) + cos < f13) {
                            if (cos >= this.f7077J) {
                                int i7 = this.f7068A;
                                if (((float) i7) + cos <= this.f7078K) {
                                    canvas2.drawText(str, (float) this.f7094d0, ((float) i7) - this.f7097f0, this.f7107u);
                                    this.f7082O = this.f7083P - ((this.f7085R / 2) - i6);
                                }
                            }
                            canvas.save();
                            z = false;
                            canvas2.clipRect(0, 0, this.f7087T, (int) this.f7070C);
                            canvas2.scale(1.0f, ((float) Math.sin(d)) * 0.8f);
                            Paint paint = this.f7106t;
                            int i8 = this.f7069B;
                            int i9 = -1;
                            int i10 = i8 == 0 ? 0 : i8 > 0 ? 1 : -1;
                            z2 = false;
                            if (f11 <= 0.0f) {
                                i9 = 1;
                            }
                            paint.setTextSkewX(((float) (i10 * i9)) * 0.5f * pow);
                            this.f7106t.setAlpha((int) ((1.0f - pow) * 255.0f));
                            canvas2.drawText(str, ((float) this.f7096e0) + (((float) this.f7069B) * pow), (float) this.f7068A, this.f7106t);
                            canvas.restore();
                            canvas.restore();
                            this.f7107u.setTextSize((float) this.f7111y);
                        } else {
                            canvas.save();
                            canvas2.clipRect(0.0f, 0.0f, (float) this.f7087T, this.f7078K - cos);
                            canvas2.scale(1.0f, ((float) Math.sin(d)) * 1.0f);
                            canvas2.drawText(str, (float) this.f7094d0, ((float) this.f7068A) - this.f7097f0, this.f7107u);
                            canvas.restore();
                            canvas.save();
                            canvas2.clipRect(0.0f, this.f7078K - cos, (float) this.f7087T, (float) ((int) this.f7070C));
                            canvas2.scale(1.0f, ((float) Math.sin(d)) * 0.8f);
                            canvas2.drawText(str, (float) this.f7096e0, (float) this.f7068A, this.f7106t);
                            canvas.restore();
                        }
                    } else {
                        canvas.save();
                        canvas2.clipRect(0.0f, 0.0f, (float) this.f7087T, this.f7077J - cos);
                        canvas2.scale(1.0f, ((float) Math.sin(d)) * 0.8f);
                        canvas2.drawText(str, (float) this.f7096e0, (float) this.f7068A, this.f7106t);
                        canvas.restore();
                        canvas.save();
                        canvas2.clipRect(0.0f, this.f7077J - cos, (float) this.f7087T, (float) ((int) this.f7070C));
                        canvas2.scale(1.0f, ((float) Math.sin(d)) * 1.0f);
                        canvas2.drawText(str, (float) this.f7094d0, ((float) this.f7068A) - this.f7097f0, this.f7107u);
                        canvas.restore();
                    }
                    z2 = false;
                    z = false;
                    canvas.restore();
                    this.f7107u.setTextSize((float) this.f7111y);
                }
                i6++;
                z3 = z;
                z4 = z2;
            }
        }
    }

    public void onMeasure(int i, int i2) {
        this.f7092b0 = i;
        mo22361o();
        setMeasuredDimension(this.f7087T, this.f7086S);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = this.f7100n.onTouchEvent(motionEvent);
        float f = ((float) (-this.f7081N)) * this.f7070C;
        float itemsCount = ((float) ((this.f7109w.getItemsCount() - 1) - this.f7081N)) * this.f7070C;
        int action = motionEvent.getAction();
        boolean z = false;
        if (action == 0) {
            this.f7091a0 = System.currentTimeMillis();
            mo22341b();
            this.f7090W = motionEvent.getRawY();
        } else if (action == 2) {
            float rawY = this.f7090W - motionEvent.getRawY();
            this.f7090W = motionEvent.getRawY();
            float f2 = this.f7080M + rawY;
            this.f7080M = f2;
            if (!this.f7076I && ((f2 - (this.f7070C * 0.25f) < f && rawY < 0.0f) || (this.f7080M + (this.f7070C * 0.25f) > itemsCount && rawY > 0.0f))) {
                this.f7080M -= rawY;
                z = true;
            }
        } else if (!onTouchEvent) {
            float y = motionEvent.getY();
            int i = this.f7088U;
            float f3 = this.f7070C;
            this.f7089V = (int) ((((float) (((int) (((Math.acos((double) ((((float) i) - y) / ((float) i))) * ((double) this.f7088U)) + ((double) (f3 / 2.0f))) / ((double) f3))) - (this.f7085R / 2))) * f3) - (((this.f7080M % f3) + f3) % f3));
            if (System.currentTimeMillis() - this.f7091a0 > 120) {
                mo22367r(ACTION.DAGGLE);
            } else {
                mo22367r(ACTION.CLICK);
            }
        }
        if (!z && motionEvent.getAction() != 0) {
            invalidate();
        }
        return true;
    }

    /* renamed from: p */
    public final void mo22365p(String str) {
        Rect rect = new Rect();
        this.f7107u.getTextBounds(str, 0, str.length(), rect);
        int i = this.f7111y;
        for (int width = rect.width(); width > this.f7087T; width = rect.width()) {
            i--;
            this.f7107u.setTextSize((float) i);
            this.f7107u.getTextBounds(str, 0, str.length(), rect);
        }
        this.f7106t.setTextSize((float) i);
    }

    /* renamed from: q */
    public final void mo22366q(float f) {
        mo22341b();
        this.f7105s = this.f7104r.scheduleWithFixedDelay(new C1998a(this, f), 0, 5, TimeUnit.MILLISECONDS);
    }

    /* renamed from: r */
    public void mo22367r(ACTION action) {
        mo22341b();
        if (action == ACTION.FLING || action == ACTION.DAGGLE) {
            float f = this.f7080M;
            float f2 = this.f7070C;
            int i = (int) (((f % f2) + f2) % f2);
            this.f7089V = i;
            if (((float) i) > f2 / 2.0f) {
                this.f7089V = (int) (f2 - ((float) i));
            } else {
                this.f7089V = -i;
            }
        }
        this.f7105s = this.f7104r.scheduleWithFixedDelay(new C2000c(this, this.f7089V), 0, 10, TimeUnit.MILLISECONDS);
    }

    public final void setAdapter(C1994a aVar) {
        this.f7109w = aVar;
        mo22361o();
        invalidate();
    }

    public final void setCurrentItem(int i) {
        this.f7082O = i;
        this.f7081N = i;
        this.f7080M = 0.0f;
        invalidate();
    }

    public final void setCyclic(boolean z) {
        this.f7076I = z;
    }

    public void setDividerColor(int i) {
        this.f7074G = i;
        this.f7108v.setColor(i);
    }

    public void setDividerType(DividerType dividerType) {
        this.f7095e = dividerType;
    }

    public void setGravity(int i) {
        this.f7093c0 = i;
    }

    public void setIsOptions(boolean z) {
        this.f7102p = z;
    }

    public void setLabel(String str) {
        this.f7110x = str;
    }

    public void setLineSpacingMultiplier(float f) {
        if (f != 0.0f) {
            this.f7075H = f;
            mo22356j();
        }
    }

    public final void setOnItemSelectedListener(C1997b bVar) {
        this.f7101o = bVar;
    }

    public void setTextColorCenter(int i) {
        this.f7073F = i;
        this.f7107u.setColor(i);
    }

    public void setTextColorOut(int i) {
        this.f7072E = i;
        this.f7106t.setColor(i);
    }

    public final void setTextSize(float f) {
        if (f > 0.0f) {
            int i = (int) (this.f7098l.getResources().getDisplayMetrics().density * f);
            this.f7111y = i;
            this.f7106t.setTextSize((float) i);
            this.f7107u.setTextSize((float) this.f7111y);
        }
    }

    public void setTextXOffset(int i) {
        this.f7069B = i;
        if (i != 0) {
            this.f7107u.setTextScaleX(1.0f);
        }
    }

    public void setTotalScrollY(float f) {
        this.f7080M = f;
    }

    public final void setTypeface(Typeface typeface) {
        this.f7071D = typeface;
        this.f7106t.setTypeface(typeface);
        this.f7107u.setTypeface(this.f7071D);
    }

    public WheelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7102p = false;
        this.f7103q = true;
        this.f7104r = Executors.newSingleThreadScheduledExecutor();
        this.f7071D = Typeface.MONOSPACE;
        this.f7075H = 1.6f;
        this.f7085R = 11;
        this.f7089V = 0;
        this.f7090W = 0.0f;
        this.f7091a0 = 0;
        this.f7093c0 = 17;
        this.f7094d0 = 0;
        this.f7096e0 = 0;
        this.f7111y = getResources().getDimensionPixelSize(R$dimen.pickerview_textsize);
        float f = getResources().getDisplayMetrics().density;
        if (f < 1.0f) {
            this.f7097f0 = 2.4f;
        } else {
            int i = (1.0f > f ? 1 : (1.0f == f ? 0 : -1));
            if (i <= 0 && f < 2.0f) {
                this.f7097f0 = 3.6f;
            } else if (i <= 0 && f < 2.0f) {
                this.f7097f0 = 4.5f;
            } else if (2.0f <= f && f < 3.0f) {
                this.f7097f0 = 6.0f;
            } else if (f >= 3.0f) {
                this.f7097f0 = f * 2.5f;
            }
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.pickerview, 0, 0);
            this.f7093c0 = obtainStyledAttributes.getInt(R$styleable.pickerview_wheelview_gravity, 17);
            this.f7072E = obtainStyledAttributes.getColor(R$styleable.pickerview_wheelview_textColorOut, -5723992);
            this.f7073F = obtainStyledAttributes.getColor(R$styleable.pickerview_wheelview_textColorCenter, -14013910);
            this.f7074G = obtainStyledAttributes.getColor(R$styleable.pickerview_wheelview_dividerColor, -2763307);
            this.f7111y = obtainStyledAttributes.getDimensionPixelOffset(R$styleable.pickerview_wheelview_textSize, this.f7111y);
            this.f7075H = obtainStyledAttributes.getFloat(R$styleable.pickerview_wheelview_lineSpacingMultiplier, this.f7075H);
            obtainStyledAttributes.recycle();
        }
        mo22356j();
        mo22346g(context);
    }
}
