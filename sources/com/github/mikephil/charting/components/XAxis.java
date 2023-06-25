package com.github.mikephil.charting.components;

import p040c.p175p.p184b.p185a.p188c.C2254a;
import p040c.p175p.p184b.p185a.p199k.C2347i;

public class XAxis extends C2254a {

    /* renamed from: J */
    public int f7505J;

    /* renamed from: K */
    public int f7506K;

    /* renamed from: L */
    public int f7507L = 1;

    /* renamed from: M */
    public int f7508M = 1;

    /* renamed from: N */
    public float f7509N = 0.0f;

    /* renamed from: O */
    public boolean f7510O = false;

    /* renamed from: P */
    public XAxisPosition f7511P = XAxisPosition.TOP;

    public enum XAxisPosition {
        TOP,
        BOTTOM,
        BOTH_SIDED,
        TOP_INSIDE,
        BOTTOM_INSIDE
    }

    public XAxis() {
        this.f2347c = C2347i.m3958e(4.0f);
    }

    /* renamed from: D */
    public float mo23847D() {
        return this.f7509N;
    }

    /* renamed from: E */
    public XAxisPosition mo23848E() {
        return this.f7511P;
    }

    /* renamed from: F */
    public boolean mo23849F() {
        return this.f7510O;
    }
}
