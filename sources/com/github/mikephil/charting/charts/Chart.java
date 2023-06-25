package com.github.mikephil.charting.charts;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.listener.ChartTouchListener;
import java.util.ArrayList;
import java.util.Iterator;
import p040c.p175p.p184b.p185a.p186a.C2250a;
import p040c.p175p.p184b.p185a.p188c.C2256c;
import p040c.p175p.p184b.p185a.p188c.C2257d;
import p040c.p175p.p184b.p185a.p189d.C2264f;
import p040c.p175p.p184b.p185a.p190e.C2271b;
import p040c.p175p.p184b.p185a.p190e.C2273d;
import p040c.p175p.p184b.p185a.p191f.C2275b;
import p040c.p175p.p184b.p185a.p191f.C2277d;
import p040c.p175p.p184b.p185a.p191f.C2279f;
import p040c.p175p.p184b.p185a.p192g.p193a.C2288e;
import p040c.p175p.p184b.p185a.p192g.p194b.C2296e;
import p040c.p175p.p184b.p185a.p195h.C2304b;
import p040c.p175p.p184b.p185a.p195h.C2305c;
import p040c.p175p.p184b.p185a.p197j.C2318g;
import p040c.p175p.p184b.p185a.p197j.C2320i;
import p040c.p175p.p184b.p185a.p199k.C2342e;
import p040c.p175p.p184b.p185a.p199k.C2347i;
import p040c.p175p.p184b.p185a.p199k.C2348j;

public abstract class Chart<T extends C2264f<? extends C2296e<? extends Entry>>> extends ViewGroup implements C2288e {

    /* renamed from: A */
    public C2320i f7398A;

    /* renamed from: B */
    public C2318g f7399B;

    /* renamed from: C */
    public C2279f f7400C;

    /* renamed from: D */
    public C2348j f7401D = new C2348j();

    /* renamed from: E */
    public C2250a f7402E;

    /* renamed from: F */
    public float f7403F = 0.0f;

    /* renamed from: G */
    public float f7404G = 0.0f;

    /* renamed from: H */
    public float f7405H = 0.0f;

    /* renamed from: I */
    public float f7406I = 0.0f;

    /* renamed from: J */
    public boolean f7407J = false;

    /* renamed from: K */
    public C2277d[] f7408K;

    /* renamed from: L */
    public float f7409L = 0.0f;

    /* renamed from: M */
    public boolean f7410M = true;

    /* renamed from: N */
    public C2257d f7411N;

    /* renamed from: O */
    public ArrayList<Runnable> f7412O = new ArrayList<>();

    /* renamed from: P */
    public boolean f7413P = false;

    /* renamed from: e */
    public boolean f7414e = false;

    /* renamed from: l */
    public T f7415l = null;

    /* renamed from: m */
    public boolean f7416m = true;

    /* renamed from: n */
    public boolean f7417n = true;

    /* renamed from: o */
    public float f7418o = 0.9f;

    /* renamed from: p */
    public C2271b f7419p = new C2271b(0);

    /* renamed from: q */
    public Paint f7420q;

    /* renamed from: r */
    public Paint f7421r;

    /* renamed from: s */
    public XAxis f7422s;

    /* renamed from: t */
    public boolean f7423t = true;

    /* renamed from: u */
    public C2256c f7424u;

    /* renamed from: v */
    public Legend f7425v;

    /* renamed from: w */
    public C2305c f7426w;

    /* renamed from: x */
    public ChartTouchListener f7427x;

    /* renamed from: y */
    public String f7428y = "No chart data available.";

    /* renamed from: z */
    public C2304b f7429z;

    /* renamed from: com.github.mikephil.charting.charts.Chart$a */
    public class C3985a implements ValueAnimator.AnimatorUpdateListener {
        public C3985a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            Chart.this.postInvalidate();
        }
    }

    public Chart(Context context) {
        super(context);
        mo23580n();
    }

    /* renamed from: f */
    public abstract void mo23604f();

    /* renamed from: g */
    public void mo23651g() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    public C2250a getAnimator() {
        return this.f7402E;
    }

    public C2342e getCenter() {
        return C2342e.m3925c(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f);
    }

    public C2342e getCenterOfView() {
        return getCenter();
    }

    public C2342e getCenterOffsets() {
        return this.f7401D.mo17636n();
    }

    public Bitmap getChartBitmap() {
        Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(createBitmap);
        Drawable background = getBackground();
        if (background != null) {
            background.draw(canvas);
        } else {
            canvas.drawColor(-1);
        }
        draw(canvas);
        return createBitmap;
    }

    public RectF getContentRect() {
        return this.f7401D.mo17637o();
    }

    public T getData() {
        return this.f7415l;
    }

    public C2273d getDefaultValueFormatter() {
        return this.f7419p;
    }

    public C2256c getDescription() {
        return this.f7424u;
    }

    public float getDragDecelerationFrictionCoef() {
        return this.f7418o;
    }

    public float getExtraBottomOffset() {
        return this.f7405H;
    }

    public float getExtraLeftOffset() {
        return this.f7406I;
    }

    public float getExtraRightOffset() {
        return this.f7404G;
    }

    public float getExtraTopOffset() {
        return this.f7403F;
    }

    public C2277d[] getHighlighted() {
        return this.f7408K;
    }

    public C2279f getHighlighter() {
        return this.f7400C;
    }

    public ArrayList<Runnable> getJobs() {
        return this.f7412O;
    }

    public Legend getLegend() {
        return this.f7425v;
    }

    public C2320i getLegendRenderer() {
        return this.f7398A;
    }

    public C2257d getMarker() {
        return this.f7411N;
    }

    @Deprecated
    public C2257d getMarkerView() {
        return getMarker();
    }

    public float getMaxHighlightDistance() {
        return this.f7409L;
    }

    public abstract /* synthetic */ int getMaxVisibleCount();

    public C2304b getOnChartGestureListener() {
        return this.f7429z;
    }

    public ChartTouchListener getOnTouchListener() {
        return this.f7427x;
    }

    public C2318g getRenderer() {
        return this.f7399B;
    }

    public C2348j getViewPortHandler() {
        return this.f7401D;
    }

    public XAxis getXAxis() {
        return this.f7422s;
    }

    public float getXChartMax() {
        return this.f7422s.f2322G;
    }

    public float getXChartMin() {
        return this.f7422s.f2323H;
    }

    public float getXRange() {
        return this.f7422s.f2324I;
    }

    public abstract /* synthetic */ float getYChartMax();

    public abstract /* synthetic */ float getYChartMin();

    public float getYMax() {
        return this.f7415l.mo17287n();
    }

    public float getYMin() {
        return this.f7415l.mo17289p();
    }

    /* renamed from: h */
    public void mo23682h(Canvas canvas) {
        float f;
        float f2;
        C2256c cVar = this.f7424u;
        if (cVar != null && cVar.mo17262f()) {
            C2342e g = this.f7424u.mo17263g();
            this.f7420q.setTypeface(this.f7424u.mo17259c());
            this.f7420q.setTextSize(this.f7424u.mo17258b());
            this.f7420q.setColor(this.f7424u.mo17257a());
            this.f7420q.setTextAlign(this.f7424u.mo17265i());
            if (g == null) {
                f2 = (((float) getWidth()) - this.f7401D.mo17611H()) - this.f7424u.mo17260d();
                f = (((float) getHeight()) - this.f7401D.mo17609F()) - this.f7424u.mo17261e();
            } else {
                float f3 = g.f2538c;
                f = g.f2539d;
                f2 = f3;
            }
            canvas.drawText(this.f7424u.mo17264h(), f2, f, this.f7420q);
        }
    }

    /* renamed from: i */
    public void mo23683i(Canvas canvas) {
        if (this.f7411N != null && mo23691p() && mo23723v()) {
            int i = 0;
            while (true) {
                C2277d[] dVarArr = this.f7408K;
                if (i < dVarArr.length) {
                    C2277d dVar = dVarArr[i];
                    C2296e d = this.f7415l.mo17277d(dVar.mo17329d());
                    Entry h = this.f7415l.mo17281h(this.f7408K[i]);
                    int o = d.mo17405o(h);
                    if (h != null && ((float) o) <= ((float) d.mo17385H0()) * this.f7402E.mo17224a()) {
                        float[] l = mo23685l(dVar);
                        if (this.f7401D.mo17646x(l[0], l[1])) {
                            this.f7411N.mo17266a(h, dVar);
                            this.f7411N.mo17267b(canvas, l[0], l[1]);
                        }
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: j */
    public void mo23684j() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
    }

    /* renamed from: k */
    public C2277d mo23579k(float f, float f2) {
        if (this.f7415l == null) {
            return null;
        }
        return getHighlighter().mo17314a(f, f2);
    }

    /* renamed from: l */
    public float[] mo23685l(C2277d dVar) {
        return new float[]{dVar.mo17330e(), dVar.mo17331f()};
    }

    /* renamed from: m */
    public void mo23686m(C2277d dVar, boolean z) {
        Entry entry = null;
        if (dVar == null) {
            this.f7408K = null;
        } else {
            if (this.f7414e) {
                "Highlighted: " + dVar.toString();
            }
            Entry h = this.f7415l.mo17281h(dVar);
            if (h == null) {
                this.f7408K = null;
                dVar = null;
            } else {
                this.f7408K = new C2277d[]{dVar};
            }
            entry = h;
        }
        setLastHighlighted(this.f7408K);
        if (z && this.f7426w != null) {
            if (!mo23723v()) {
                this.f7426w.mo17478b();
            } else {
                this.f7426w.mo17477a(entry, dVar);
            }
        }
        invalidate();
    }

    /* renamed from: n */
    public void mo23580n() {
        setWillNotDraw(false);
        this.f7402E = new C2250a(new C3985a());
        C2347i.m3974u(getContext());
        this.f7409L = C2347i.m3958e(500.0f);
        this.f7424u = new C2256c();
        Legend legend = new Legend();
        this.f7425v = legend;
        this.f7398A = new C2320i(this.f7401D, legend);
        this.f7422s = new XAxis();
        this.f7420q = new Paint(1);
        Paint paint = new Paint(1);
        this.f7421r = paint;
        paint.setColor(Color.rgb(247, 189, 51));
        this.f7421r.setTextAlign(Paint.Align.CENTER);
        this.f7421r.setTextSize(C2347i.m3958e(12.0f));
        boolean z = this.f7414e;
    }

    /* renamed from: o */
    public boolean mo23687o() {
        return this.f7417n;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f7413P) {
            mo23722u(this);
        }
    }

    public void onDraw(Canvas canvas) {
        if (this.f7415l == null) {
            if (!TextUtils.isEmpty(this.f7428y)) {
                C2342e center = getCenter();
                canvas.drawText(this.f7428y, center.f2538c, center.f2539d, this.f7421r);
            }
        } else if (!this.f7407J) {
            mo23604f();
            this.f7407J = true;
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            getChildAt(i5).layout(i, i2, i3, i4);
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int e = (int) C2347i.m3958e(50.0f);
        setMeasuredDimension(Math.max(getSuggestedMinimumWidth(), ViewGroup.resolveSize(e, i)), Math.max(getSuggestedMinimumHeight(), ViewGroup.resolveSize(e, i2)));
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        boolean z = this.f7414e;
        if (i > 0 && i2 > 0 && i < 10000 && i2 < 10000) {
            if (this.f7414e) {
                "Setting chart dimens, width: " + i + ", height: " + i2;
            }
            this.f7401D.mo17615L((float) i, (float) i2);
        } else if (this.f7414e) {
            "*Avoiding* setting chart dimens! width: " + i + ", height: " + i2;
        }
        mo23620s();
        Iterator<Runnable> it = this.f7412O.iterator();
        while (it.hasNext()) {
            post(it.next());
        }
        this.f7412O.clear();
        super.onSizeChanged(i, i2, i3, i4);
    }

    /* renamed from: p */
    public boolean mo23691p() {
        return this.f7410M;
    }

    /* renamed from: q */
    public boolean mo23692q() {
        return this.f7416m;
    }

    /* renamed from: r */
    public boolean mo23693r() {
        return this.f7414e;
    }

    /* renamed from: s */
    public abstract void mo23620s();

    public void setData(T t) {
        this.f7415l = t;
        this.f7407J = false;
        if (t != null) {
            mo23721t(t.mo17289p(), t.mo17287n());
            for (C2296e eVar : this.f7415l.mo17279f()) {
                if (eVar.mo17397c0() || eVar.mo17389K() == this.f7419p) {
                    eVar.mo17398e0(this.f7419p);
                }
            }
            mo23620s();
            boolean z = this.f7414e;
        }
    }

    public void setDescription(C2256c cVar) {
        this.f7424u = cVar;
    }

    public void setDragDecelerationEnabled(boolean z) {
        this.f7417n = z;
    }

    public void setDragDecelerationFrictionCoef(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f >= 1.0f) {
            f = 0.999f;
        }
        this.f7418o = f;
    }

    @Deprecated
    public void setDrawMarkerViews(boolean z) {
        setDrawMarkers(z);
    }

    public void setDrawMarkers(boolean z) {
        this.f7410M = z;
    }

    public void setExtraBottomOffset(float f) {
        this.f7405H = C2347i.m3958e(f);
    }

    public void setExtraLeftOffset(float f) {
        this.f7406I = C2347i.m3958e(f);
    }

    public void setExtraRightOffset(float f) {
        this.f7404G = C2347i.m3958e(f);
    }

    public void setExtraTopOffset(float f) {
        this.f7403F = C2347i.m3958e(f);
    }

    public void setHardwareAccelerationEnabled(boolean z) {
        if (z) {
            setLayerType(2, (Paint) null);
        } else {
            setLayerType(1, (Paint) null);
        }
    }

    public void setHighlightPerTapEnabled(boolean z) {
        this.f7416m = z;
    }

    public void setHighlighter(C2275b bVar) {
        this.f7400C = bVar;
    }

    public void setLastHighlighted(C2277d[] dVarArr) {
        if (dVarArr == null || dVarArr.length <= 0 || dVarArr[0] == null) {
            this.f7427x.mo23886d((C2277d) null);
        } else {
            this.f7427x.mo23886d(dVarArr[0]);
        }
    }

    public void setLogEnabled(boolean z) {
        this.f7414e = z;
    }

    public void setMarker(C2257d dVar) {
        this.f7411N = dVar;
    }

    @Deprecated
    public void setMarkerView(C2257d dVar) {
        setMarker(dVar);
    }

    public void setMaxHighlightDistance(float f) {
        this.f7409L = C2347i.m3958e(f);
    }

    public void setNoDataText(String str) {
        this.f7428y = str;
    }

    public void setNoDataTextColor(int i) {
        this.f7421r.setColor(i);
    }

    public void setNoDataTextTypeface(Typeface typeface) {
        this.f7421r.setTypeface(typeface);
    }

    public void setOnChartGestureListener(C2304b bVar) {
        this.f7429z = bVar;
    }

    public void setOnChartValueSelectedListener(C2305c cVar) {
        this.f7426w = cVar;
    }

    public void setOnTouchListener(ChartTouchListener chartTouchListener) {
        this.f7427x = chartTouchListener;
    }

    public void setRenderer(C2318g gVar) {
        if (gVar != null) {
            this.f7399B = gVar;
        }
    }

    public void setTouchEnabled(boolean z) {
        this.f7423t = z;
    }

    public void setUnbindEnabled(boolean z) {
        this.f7413P = z;
    }

    /* renamed from: t */
    public void mo23721t(float f, float f2) {
        float f3;
        T t = this.f7415l;
        if (t == null || t.mo17280g() < 2) {
            f3 = Math.max(Math.abs(f), Math.abs(f2));
        } else {
            f3 = Math.abs(f2 - f);
        }
        this.f7419p.mo17304j(C2347i.m3962i(f3));
    }

    /* renamed from: u */
    public final void mo23722u(View view) {
        if (view.getBackground() != null) {
            view.getBackground().setCallback((Drawable.Callback) null);
        }
        if (view instanceof ViewGroup) {
            int i = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i < viewGroup.getChildCount()) {
                    mo23722u(viewGroup.getChildAt(i));
                    i++;
                } else {
                    viewGroup.removeAllViews();
                    return;
                }
            }
        }
    }

    /* renamed from: v */
    public boolean mo23723v() {
        C2277d[] dVarArr = this.f7408K;
        return (dVarArr == null || dVarArr.length <= 0 || dVarArr[0] == null) ? false : true;
    }

    public Chart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo23580n();
    }

    public Chart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo23580n();
    }
}
