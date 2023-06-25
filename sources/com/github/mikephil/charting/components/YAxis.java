package com.github.mikephil.charting.components;

import android.graphics.Paint;
import p040c.p175p.p184b.p185a.p188c.C2254a;
import p040c.p175p.p184b.p185a.p199k.C2347i;

public class YAxis extends C2254a {

    /* renamed from: J */
    public boolean f7512J = true;

    /* renamed from: K */
    public boolean f7513K = true;

    /* renamed from: L */
    public boolean f7514L = false;

    /* renamed from: M */
    public boolean f7515M = false;

    /* renamed from: N */
    public int f7516N = -7829368;

    /* renamed from: O */
    public float f7517O = 1.0f;

    /* renamed from: P */
    public float f7518P = 10.0f;

    /* renamed from: Q */
    public float f7519Q = 10.0f;

    /* renamed from: R */
    public YAxisLabelPosition f7520R = YAxisLabelPosition.OUTSIDE_CHART;

    /* renamed from: S */
    public AxisDependency f7521S;

    /* renamed from: T */
    public float f7522T = 0.0f;

    /* renamed from: U */
    public float f7523U = Float.POSITIVE_INFINITY;

    public enum AxisDependency {
        LEFT,
        RIGHT
    }

    public enum YAxisLabelPosition {
        OUTSIDE_CHART,
        INSIDE_CHART
    }

    public YAxis(AxisDependency axisDependency) {
        this.f7521S = axisDependency;
        this.f2347c = 0.0f;
    }

    /* renamed from: D */
    public AxisDependency mo23850D() {
        return this.f7521S;
    }

    /* renamed from: E */
    public YAxisLabelPosition mo23851E() {
        return this.f7520R;
    }

    /* renamed from: F */
    public float mo23852F() {
        return this.f7523U;
    }

    /* renamed from: G */
    public float mo23853G() {
        return this.f7522T;
    }

    /* renamed from: H */
    public float mo23854H(Paint paint) {
        paint.setTextSize(this.f2349e);
        return ((float) C2347i.m3954a(paint, mo17248r())) + (mo17261e() * 2.0f);
    }

    /* renamed from: I */
    public float mo23855I(Paint paint) {
        paint.setTextSize(this.f2349e);
        float d = ((float) C2347i.m3957d(paint, mo17248r())) + (mo17260d() * 2.0f);
        float G = mo23853G();
        float F = mo23852F();
        if (G > 0.0f) {
            G = C2347i.m3958e(G);
        }
        if (F > 0.0f && F != Float.POSITIVE_INFINITY) {
            F = C2347i.m3958e(F);
        }
        if (((double) F) <= 0.0d) {
            F = d;
        }
        return Math.max(G, Math.min(d, F));
    }

    /* renamed from: J */
    public float mo23856J() {
        return this.f7519Q;
    }

    /* renamed from: K */
    public float mo23857K() {
        return this.f7518P;
    }

    /* renamed from: L */
    public int mo23858L() {
        return this.f7516N;
    }

    /* renamed from: M */
    public float mo23859M() {
        return this.f7517O;
    }

    /* renamed from: N */
    public boolean mo23860N() {
        return this.f7512J;
    }

    /* renamed from: O */
    public boolean mo23861O() {
        return this.f7513K;
    }

    /* renamed from: P */
    public boolean mo23862P() {
        return this.f7515M;
    }

    /* renamed from: Q */
    public boolean mo23863Q() {
        return this.f7514L;
    }

    /* renamed from: R */
    public boolean mo23864R() {
        return mo17262f() && mo17254x() && mo23851E() == YAxisLabelPosition.OUTSIDE_CHART;
    }

    /* renamed from: g */
    public void mo17237g(float f, float f2) {
        if (Math.abs(f2 - f) == 0.0f) {
            f2 += 1.0f;
            f -= 1.0f;
        }
        float abs = Math.abs(f2 - f);
        this.f2323H = this.f2320E ? this.f2323H : f - ((abs / 100.0f) * mo23856J());
        float K = this.f2321F ? this.f2322G : f2 + ((abs / 100.0f) * mo23857K());
        this.f2322G = K;
        this.f2324I = Math.abs(this.f2323H - K);
    }
}
