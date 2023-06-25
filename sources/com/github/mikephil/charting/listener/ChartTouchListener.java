package com.github.mikephil.charting.listener;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.github.mikephil.charting.charts.Chart;
import p040c.p175p.p184b.p185a.p191f.C2277d;
import p040c.p175p.p184b.p185a.p195h.C2304b;

public abstract class ChartTouchListener<T extends Chart<?>> extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener {

    /* renamed from: e */
    public ChartGesture f7536e = ChartGesture.NONE;

    /* renamed from: l */
    public int f7537l = 0;

    /* renamed from: m */
    public C2277d f7538m;

    /* renamed from: n */
    public GestureDetector f7539n;

    /* renamed from: o */
    public T f7540o;

    public enum ChartGesture {
        NONE,
        DRAG,
        X_ZOOM,
        Y_ZOOM,
        PINCH_ZOOM,
        ROTATE,
        SINGLE_TAP,
        DOUBLE_TAP,
        LONG_PRESS,
        FLING
    }

    public ChartTouchListener(T t) {
        this.f7540o = t;
        this.f7539n = new GestureDetector(t.getContext(), this);
    }

    /* renamed from: a */
    public static float m10183a(float f, float f2, float f3, float f4) {
        float f5 = f - f2;
        float f6 = f3 - f4;
        return (float) Math.sqrt((double) ((f5 * f5) + (f6 * f6)));
    }

    /* renamed from: b */
    public void mo23884b(MotionEvent motionEvent) {
        C2304b onChartGestureListener = this.f7540o.getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.mo17476h(motionEvent, this.f7536e);
        }
    }

    /* renamed from: c */
    public void mo23885c(C2277d dVar, MotionEvent motionEvent) {
        if (dVar == null || dVar.mo17326a(this.f7538m)) {
            this.f7540o.mo23686m((C2277d) null, true);
            this.f7538m = null;
            return;
        }
        this.f7540o.mo23686m(dVar, true);
        this.f7538m = dVar;
    }

    /* renamed from: d */
    public void mo23886d(C2277d dVar) {
        this.f7538m = dVar;
    }

    /* renamed from: e */
    public void mo23887e(MotionEvent motionEvent) {
        C2304b onChartGestureListener = this.f7540o.getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.mo17469a(motionEvent, this.f7536e);
        }
    }
}
