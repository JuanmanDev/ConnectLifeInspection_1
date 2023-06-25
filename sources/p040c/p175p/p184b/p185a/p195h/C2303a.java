package p040c.p175p.p184b.p185a.p195h;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.animation.AnimationUtils;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.charts.HorizontalBarChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.listener.ChartTouchListener;
import p040c.p175p.p184b.p185a.p189d.C2260b;
import p040c.p175p.p184b.p185a.p191f.C2277d;
import p040c.p175p.p184b.p185a.p192g.p194b.C2293b;
import p040c.p175p.p184b.p185a.p192g.p194b.C2296e;
import p040c.p175p.p184b.p185a.p199k.C2342e;
import p040c.p175p.p184b.p185a.p199k.C2347i;
import p040c.p175p.p184b.p185a.p199k.C2348j;

/* renamed from: c.p.b.a.h.a */
/* compiled from: BarLineChartTouchListener */
public class C2303a extends ChartTouchListener<BarLineChartBase<? extends C2260b<? extends C2293b<? extends Entry>>>> {

    /* renamed from: A */
    public C2342e f2398A = C2342e.m3925c(0.0f, 0.0f);

    /* renamed from: B */
    public float f2399B;

    /* renamed from: C */
    public float f2400C;

    /* renamed from: p */
    public Matrix f2401p = new Matrix();

    /* renamed from: q */
    public Matrix f2402q = new Matrix();

    /* renamed from: r */
    public C2342e f2403r = C2342e.m3925c(0.0f, 0.0f);

    /* renamed from: s */
    public C2342e f2404s = C2342e.m3925c(0.0f, 0.0f);

    /* renamed from: t */
    public float f2405t = 1.0f;

    /* renamed from: u */
    public float f2406u = 1.0f;

    /* renamed from: v */
    public float f2407v = 1.0f;

    /* renamed from: w */
    public C2296e f2408w;

    /* renamed from: x */
    public VelocityTracker f2409x;

    /* renamed from: y */
    public long f2410y = 0;

    /* renamed from: z */
    public C2342e f2411z = C2342e.m3925c(0.0f, 0.0f);

    public C2303a(BarLineChartBase<? extends C2260b<? extends C2293b<? extends Entry>>> barLineChartBase, Matrix matrix, float f) {
        super(barLineChartBase);
        this.f2401p = matrix;
        this.f2399B = C2347i.m3958e(f);
        this.f2400C = C2347i.m3958e(3.5f);
    }

    /* renamed from: h */
    public static float m3729h(MotionEvent motionEvent) {
        return Math.abs(motionEvent.getX(0) - motionEvent.getX(1));
    }

    /* renamed from: i */
    public static float m3730i(MotionEvent motionEvent) {
        return Math.abs(motionEvent.getY(0) - motionEvent.getY(1));
    }

    /* renamed from: k */
    public static void m3731k(C2342e eVar, MotionEvent motionEvent) {
        eVar.f2538c = (motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f;
        eVar.f2539d = (motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f;
    }

    /* renamed from: p */
    public static float m3732p(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((double) ((x * x) + (y * y)));
    }

    /* renamed from: f */
    public void mo17456f() {
        C2342e eVar = this.f2398A;
        float f = 0.0f;
        if (eVar.f2538c != 0.0f || eVar.f2539d != 0.0f) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f2398A.f2538c *= ((BarLineChartBase) this.f7540o).getDragDecelerationFrictionCoef();
            this.f2398A.f2539d *= ((BarLineChartBase) this.f7540o).getDragDecelerationFrictionCoef();
            float f2 = ((float) (currentAnimationTimeMillis - this.f2410y)) / 1000.0f;
            C2342e eVar2 = this.f2398A;
            float f3 = eVar2.f2538c * f2;
            float f4 = eVar2.f2539d * f2;
            C2342e eVar3 = this.f2411z;
            float f5 = eVar3.f2538c + f3;
            eVar3.f2538c = f5;
            float f6 = eVar3.f2539d + f4;
            eVar3.f2539d = f6;
            MotionEvent obtain = MotionEvent.obtain(currentAnimationTimeMillis, currentAnimationTimeMillis, 2, f5, f6, 0);
            float f7 = ((BarLineChartBase) this.f7540o).mo23593H() ? this.f2411z.f2538c - this.f2403r.f2538c : 0.0f;
            if (((BarLineChartBase) this.f7540o).mo23594I()) {
                f = this.f2411z.f2539d - this.f2403r.f2539d;
            }
            mo17459l(obtain, f7, f);
            obtain.recycle();
            C2348j viewPortHandler = ((BarLineChartBase) this.f7540o).getViewPortHandler();
            Matrix matrix = this.f2401p;
            viewPortHandler.mo17613J(matrix, this.f7540o, false);
            this.f2401p = matrix;
            this.f2410y = currentAnimationTimeMillis;
            if (((double) Math.abs(this.f2398A.f2538c)) >= 0.01d || ((double) Math.abs(this.f2398A.f2539d)) >= 0.01d) {
                C2347i.m3976w(this.f7540o);
                return;
            }
            ((BarLineChartBase) this.f7540o).mo23604f();
            ((BarLineChartBase) this.f7540o).postInvalidate();
            mo17468q();
        }
    }

    /* renamed from: g */
    public C2342e mo17457g(float f, float f2) {
        float f3;
        C2348j viewPortHandler = ((BarLineChartBase) this.f7540o).getViewPortHandler();
        float G = f - viewPortHandler.mo17610G();
        if (mo17458j()) {
            f3 = -(f2 - viewPortHandler.mo17612I());
        } else {
            f3 = -((((float) ((BarLineChartBase) this.f7540o).getMeasuredHeight()) - f2) - viewPortHandler.mo17609F());
        }
        return C2342e.m3925c(G, f3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r0 = r2.f2408w;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo17458j() {
        /*
            r2 = this;
            c.p.b.a.g.b.e r0 = r2.f2408w
            if (r0 != 0) goto L_0x000e
            T r0 = r2.f7540o
            com.github.mikephil.charting.charts.BarLineChartBase r0 = (com.github.mikephil.charting.charts.BarLineChartBase) r0
            boolean r0 = r0.mo23589D()
            if (r0 != 0) goto L_0x0020
        L_0x000e:
            c.p.b.a.g.b.e r0 = r2.f2408w
            if (r0 == 0) goto L_0x0022
            T r1 = r2.f7540o
            com.github.mikephil.charting.charts.BarLineChartBase r1 = (com.github.mikephil.charting.charts.BarLineChartBase) r1
            com.github.mikephil.charting.components.YAxis$AxisDependency r0 = r0.mo17384F0()
            boolean r0 = r1.mo17348e(r0)
            if (r0 == 0) goto L_0x0022
        L_0x0020:
            r0 = 1
            goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p175p.p184b.p185a.p195h.C2303a.mo17458j():boolean");
    }

    /* renamed from: l */
    public final void mo17459l(MotionEvent motionEvent, float f, float f2) {
        this.f7536e = ChartTouchListener.ChartGesture.DRAG;
        this.f2401p.set(this.f2402q);
        C2304b onChartGestureListener = ((BarLineChartBase) this.f7540o).getOnChartGestureListener();
        if (mo17458j()) {
            if (this.f7540o instanceof HorizontalBarChart) {
                f = -f;
            } else {
                f2 = -f2;
            }
        }
        this.f2401p.postTranslate(f, f2);
        if (onChartGestureListener != null) {
            onChartGestureListener.mo17475g(motionEvent, f, f2);
        }
    }

    /* renamed from: m */
    public final void mo17460m(MotionEvent motionEvent) {
        C2277d k = ((BarLineChartBase) this.f7540o).mo23579k(motionEvent.getX(), motionEvent.getY());
        if (k != null && !k.mo17326a(this.f7538m)) {
            this.f7538m = k;
            ((BarLineChartBase) this.f7540o).mo23686m(k, true);
        }
    }

    /* renamed from: n */
    public final void mo17461n(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (motionEvent.getPointerCount() >= 2) {
            C2304b onChartGestureListener = ((BarLineChartBase) this.f7540o).getOnChartGestureListener();
            float p = m3732p(motionEvent);
            if (p > this.f2400C) {
                C2342e eVar = this.f2404s;
                C2342e g = mo17457g(eVar.f2538c, eVar.f2539d);
                C2348j viewPortHandler = ((BarLineChartBase) this.f7540o).getViewPortHandler();
                int i = this.f7537l;
                boolean z5 = true;
                float f = 1.0f;
                if (i == 4) {
                    this.f7536e = ChartTouchListener.ChartGesture.PINCH_ZOOM;
                    float f2 = p / this.f2407v;
                    if (f2 >= 1.0f) {
                        z5 = false;
                    }
                    if (z5) {
                        z3 = viewPortHandler.mo17625c();
                    } else {
                        z3 = viewPortHandler.mo17623a();
                    }
                    if (z5) {
                        z4 = viewPortHandler.mo17626d();
                    } else {
                        z4 = viewPortHandler.mo17624b();
                    }
                    float f3 = ((BarLineChartBase) this.f7540o).mo23598M() ? f2 : 1.0f;
                    if (((BarLineChartBase) this.f7540o).mo23599N()) {
                        f = f2;
                    }
                    if (z4 || z3) {
                        this.f2401p.set(this.f2402q);
                        this.f2401p.postScale(f3, f, g.f2538c, g.f2539d);
                        if (onChartGestureListener != null) {
                            onChartGestureListener.mo17470b(motionEvent, f3, f);
                        }
                    }
                } else if (i == 2 && ((BarLineChartBase) this.f7540o).mo23598M()) {
                    this.f7536e = ChartTouchListener.ChartGesture.X_ZOOM;
                    float h = m3729h(motionEvent) / this.f2405t;
                    if (h >= 1.0f) {
                        z5 = false;
                    }
                    if (z5) {
                        z2 = viewPortHandler.mo17625c();
                    } else {
                        z2 = viewPortHandler.mo17623a();
                    }
                    if (z2) {
                        this.f2401p.set(this.f2402q);
                        this.f2401p.postScale(h, 1.0f, g.f2538c, g.f2539d);
                        if (onChartGestureListener != null) {
                            onChartGestureListener.mo17470b(motionEvent, h, 1.0f);
                        }
                    }
                } else if (this.f7537l == 3 && ((BarLineChartBase) this.f7540o).mo23599N()) {
                    this.f7536e = ChartTouchListener.ChartGesture.Y_ZOOM;
                    float i2 = m3730i(motionEvent) / this.f2406u;
                    if (i2 >= 1.0f) {
                        z5 = false;
                    }
                    if (z5) {
                        z = viewPortHandler.mo17626d();
                    } else {
                        z = viewPortHandler.mo17624b();
                    }
                    if (z) {
                        this.f2401p.set(this.f2402q);
                        this.f2401p.postScale(1.0f, i2, g.f2538c, g.f2539d);
                        if (onChartGestureListener != null) {
                            onChartGestureListener.mo17470b(motionEvent, 1.0f, i2);
                        }
                    }
                }
                C2342e.m3927e(g);
            }
        }
    }

    /* renamed from: o */
    public final void mo17462o(MotionEvent motionEvent) {
        this.f2402q.set(this.f2401p);
        this.f2403r.f2538c = motionEvent.getX();
        this.f2403r.f2539d = motionEvent.getY();
        this.f2408w = ((BarLineChartBase) this.f7540o).mo23587B(motionEvent.getX(), motionEvent.getY());
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        this.f7536e = ChartTouchListener.ChartGesture.DOUBLE_TAP;
        C2304b onChartGestureListener = ((BarLineChartBase) this.f7540o).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.mo17474f(motionEvent);
        }
        if (((BarLineChartBase) this.f7540o).mo23591F() && ((C2260b) ((BarLineChartBase) this.f7540o).getData()).mo17280g() > 0) {
            C2342e g = mo17457g(motionEvent.getX(), motionEvent.getY());
            T t = this.f7540o;
            BarLineChartBase barLineChartBase = (BarLineChartBase) t;
            float f = 1.4f;
            float f2 = ((BarLineChartBase) t).mo23598M() ? 1.4f : 1.0f;
            if (!((BarLineChartBase) this.f7540o).mo23599N()) {
                f = 1.0f;
            }
            barLineChartBase.mo23602Q(f2, f, g.f2538c, g.f2539d);
            if (((BarLineChartBase) this.f7540o).mo23693r()) {
                "Double-Tap, Zooming In, x: " + g.f2538c + ", y: " + g.f2539d;
            }
            C2342e.m3927e(g);
        }
        return super.onDoubleTap(motionEvent);
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.f7536e = ChartTouchListener.ChartGesture.FLING;
        C2304b onChartGestureListener = ((BarLineChartBase) this.f7540o).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.mo17471c(motionEvent, motionEvent2, f, f2);
        }
        return super.onFling(motionEvent, motionEvent2, f, f2);
    }

    public void onLongPress(MotionEvent motionEvent) {
        this.f7536e = ChartTouchListener.ChartGesture.LONG_PRESS;
        C2304b onChartGestureListener = ((BarLineChartBase) this.f7540o).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.mo17473e(motionEvent);
        }
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        this.f7536e = ChartTouchListener.ChartGesture.SINGLE_TAP;
        C2304b onChartGestureListener = ((BarLineChartBase) this.f7540o).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.mo17472d(motionEvent);
        }
        if (!((BarLineChartBase) this.f7540o).mo23692q()) {
            return false;
        }
        mo23885c(((BarLineChartBase) this.f7540o).mo23579k(motionEvent.getX(), motionEvent.getY()), motionEvent);
        return super.onSingleTapUp(motionEvent);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (this.f2409x == null) {
            this.f2409x = VelocityTracker.obtain();
        }
        this.f2409x.addMovement(motionEvent);
        int i = 3;
        if (motionEvent.getActionMasked() == 3 && (velocityTracker = this.f2409x) != null) {
            velocityTracker.recycle();
            this.f2409x = null;
        }
        if (this.f7537l == 0) {
            this.f7539n.onTouchEvent(motionEvent);
        }
        if (!((BarLineChartBase) this.f7540o).mo23592G() && !((BarLineChartBase) this.f7540o).mo23598M() && !((BarLineChartBase) this.f7540o).mo23599N()) {
            return true;
        }
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            boolean z = false;
            if (action == 1) {
                VelocityTracker velocityTracker2 = this.f2409x;
                int pointerId = motionEvent.getPointerId(0);
                velocityTracker2.computeCurrentVelocity(1000, (float) C2347i.m3967n());
                float yVelocity = velocityTracker2.getYVelocity(pointerId);
                float xVelocity = velocityTracker2.getXVelocity(pointerId);
                if ((Math.abs(xVelocity) > ((float) C2347i.m3968o()) || Math.abs(yVelocity) > ((float) C2347i.m3968o())) && this.f7537l == 1 && ((BarLineChartBase) this.f7540o).mo23687o()) {
                    mo17468q();
                    this.f2410y = AnimationUtils.currentAnimationTimeMillis();
                    this.f2411z.f2538c = motionEvent.getX();
                    this.f2411z.f2539d = motionEvent.getY();
                    C2342e eVar = this.f2398A;
                    eVar.f2538c = xVelocity;
                    eVar.f2539d = yVelocity;
                    C2347i.m3976w(this.f7540o);
                }
                int i2 = this.f7537l;
                if (i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) {
                    ((BarLineChartBase) this.f7540o).mo23604f();
                    ((BarLineChartBase) this.f7540o).postInvalidate();
                }
                this.f7537l = 0;
                ((BarLineChartBase) this.f7540o).mo23684j();
                VelocityTracker velocityTracker3 = this.f2409x;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f2409x = null;
                }
                mo23884b(motionEvent);
            } else if (action == 2) {
                int i3 = this.f7537l;
                if (i3 == 1) {
                    ((BarLineChartBase) this.f7540o).mo23651g();
                    float f = 0.0f;
                    float x = ((BarLineChartBase) this.f7540o).mo23593H() ? motionEvent.getX() - this.f2403r.f2538c : 0.0f;
                    if (((BarLineChartBase) this.f7540o).mo23594I()) {
                        f = motionEvent.getY() - this.f2403r.f2539d;
                    }
                    mo17459l(motionEvent, x, f);
                } else if (i3 == 2 || i3 == 3 || i3 == 4) {
                    ((BarLineChartBase) this.f7540o).mo23651g();
                    if (((BarLineChartBase) this.f7540o).mo23598M() || ((BarLineChartBase) this.f7540o).mo23599N()) {
                        mo17461n(motionEvent);
                    }
                } else if (i3 == 0 && Math.abs(ChartTouchListener.m10183a(motionEvent.getX(), this.f2403r.f2538c, motionEvent.getY(), this.f2403r.f2539d)) > this.f2399B && ((BarLineChartBase) this.f7540o).mo23592G()) {
                    if (!((BarLineChartBase) this.f7540o).mo23595J() || !((BarLineChartBase) this.f7540o).mo23588C()) {
                        z = true;
                    }
                    if (z) {
                        float abs = Math.abs(motionEvent.getX() - this.f2403r.f2538c);
                        float abs2 = Math.abs(motionEvent.getY() - this.f2403r.f2539d);
                        if ((((BarLineChartBase) this.f7540o).mo23593H() || abs2 >= abs) && (((BarLineChartBase) this.f7540o).mo23594I() || abs2 <= abs)) {
                            this.f7536e = ChartTouchListener.ChartGesture.DRAG;
                            this.f7537l = 1;
                        }
                    } else if (((BarLineChartBase) this.f7540o).mo23596K()) {
                        this.f7536e = ChartTouchListener.ChartGesture.DRAG;
                        if (((BarLineChartBase) this.f7540o).mo23596K()) {
                            mo17460m(motionEvent);
                        }
                    }
                }
            } else if (action == 3) {
                this.f7537l = 0;
                mo23884b(motionEvent);
            } else if (action != 5) {
                if (action == 6) {
                    C2347i.m3978y(motionEvent, this.f2409x);
                    this.f7537l = 5;
                }
            } else if (motionEvent.getPointerCount() >= 2) {
                ((BarLineChartBase) this.f7540o).mo23651g();
                mo17462o(motionEvent);
                this.f2405t = m3729h(motionEvent);
                this.f2406u = m3730i(motionEvent);
                float p = m3732p(motionEvent);
                this.f2407v = p;
                if (p > 10.0f) {
                    if (((BarLineChartBase) this.f7540o).mo23597L()) {
                        this.f7537l = 4;
                    } else if (((BarLineChartBase) this.f7540o).mo23598M() != ((BarLineChartBase) this.f7540o).mo23599N()) {
                        if (((BarLineChartBase) this.f7540o).mo23598M()) {
                            i = 2;
                        }
                        this.f7537l = i;
                    } else {
                        if (this.f2405t > this.f2406u) {
                            i = 2;
                        }
                        this.f7537l = i;
                    }
                }
                m3731k(this.f2404s, motionEvent);
            }
        } else {
            mo23887e(motionEvent);
            mo17468q();
            mo17462o(motionEvent);
        }
        C2348j viewPortHandler = ((BarLineChartBase) this.f7540o).getViewPortHandler();
        Matrix matrix = this.f2401p;
        viewPortHandler.mo17613J(matrix, this.f7540o, true);
        this.f2401p = matrix;
        return true;
    }

    /* renamed from: q */
    public void mo17468q() {
        C2342e eVar = this.f2398A;
        eVar.f2538c = 0.0f;
        eVar.f2539d = 0.0f;
    }
}
