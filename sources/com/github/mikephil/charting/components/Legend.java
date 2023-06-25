package com.github.mikephil.charting.components;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import java.util.ArrayList;
import java.util.List;
import p040c.p175p.p184b.p185a.p188c.C2255b;
import p040c.p175p.p184b.p185a.p188c.C2258e;
import p040c.p175p.p184b.p185a.p199k.C2339b;
import p040c.p175p.p184b.p185a.p199k.C2347i;
import p040c.p175p.p184b.p185a.p199k.C2348j;

public class Legend extends C2255b {

    /* renamed from: A */
    public boolean f7470A = false;

    /* renamed from: B */
    public List<C2339b> f7471B = new ArrayList(16);

    /* renamed from: C */
    public List<Boolean> f7472C = new ArrayList(16);

    /* renamed from: D */
    public List<C2339b> f7473D = new ArrayList(16);

    /* renamed from: g */
    public C2258e[] f7474g = new C2258e[0];

    /* renamed from: h */
    public C2258e[] f7475h;

    /* renamed from: i */
    public boolean f7476i = false;

    /* renamed from: j */
    public LegendHorizontalAlignment f7477j = LegendHorizontalAlignment.LEFT;

    /* renamed from: k */
    public LegendVerticalAlignment f7478k = LegendVerticalAlignment.BOTTOM;

    /* renamed from: l */
    public LegendOrientation f7479l = LegendOrientation.HORIZONTAL;

    /* renamed from: m */
    public boolean f7480m = false;

    /* renamed from: n */
    public LegendDirection f7481n = LegendDirection.LEFT_TO_RIGHT;

    /* renamed from: o */
    public LegendForm f7482o = LegendForm.SQUARE;

    /* renamed from: p */
    public float f7483p = 8.0f;

    /* renamed from: q */
    public float f7484q = 3.0f;

    /* renamed from: r */
    public DashPathEffect f7485r = null;

    /* renamed from: s */
    public float f7486s = 6.0f;

    /* renamed from: t */
    public float f7487t = 0.0f;

    /* renamed from: u */
    public float f7488u = 5.0f;

    /* renamed from: v */
    public float f7489v = 3.0f;

    /* renamed from: w */
    public float f7490w = 0.95f;

    /* renamed from: x */
    public float f7491x = 0.0f;

    /* renamed from: y */
    public float f7492y = 0.0f;

    /* renamed from: z */
    public float f7493z = 0.0f;

    public enum LegendDirection {
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT
    }

    public enum LegendForm {
        NONE,
        EMPTY,
        DEFAULT,
        SQUARE,
        CIRCLE,
        LINE
    }

    public enum LegendHorizontalAlignment {
        LEFT,
        CENTER,
        RIGHT
    }

    public enum LegendOrientation {
        HORIZONTAL,
        VERTICAL
    }

    public enum LegendVerticalAlignment {
        TOP,
        CENTER,
        BOTTOM
    }

    /* renamed from: com.github.mikephil.charting.components.Legend$a */
    public static /* synthetic */ class C3987a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7494a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.github.mikephil.charting.components.Legend$LegendOrientation[] r0 = com.github.mikephil.charting.components.Legend.LegendOrientation.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7494a = r0
                com.github.mikephil.charting.components.Legend$LegendOrientation r1 = com.github.mikephil.charting.components.Legend.LegendOrientation.VERTICAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f7494a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.github.mikephil.charting.components.Legend$LegendOrientation r1 = com.github.mikephil.charting.components.Legend.LegendOrientation.HORIZONTAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.github.mikephil.charting.components.Legend.C3987a.<clinit>():void");
        }
    }

    public Legend() {
        this.f2349e = C2347i.m3958e(10.0f);
        this.f2346b = C2347i.m3958e(5.0f);
        this.f2347c = C2347i.m3958e(3.0f);
    }

    /* renamed from: A */
    public float mo23811A() {
        return this.f7487t;
    }

    /* renamed from: B */
    public boolean mo23812B() {
        return this.f7480m;
    }

    /* renamed from: C */
    public boolean mo23813C() {
        return this.f7476i;
    }

    /* renamed from: D */
    public void mo23814D(List<C2258e> list) {
        this.f7474g = (C2258e[]) list.toArray(new C2258e[list.size()]);
    }

    /* renamed from: g */
    public void mo23815g(Paint paint, C2348j jVar) {
        float f;
        int i;
        float f2;
        float f3;
        float f4;
        float f5;
        Paint paint2 = paint;
        float e = C2347i.m3958e(this.f7483p);
        float e2 = C2347i.m3958e(this.f7489v);
        float e3 = C2347i.m3958e(this.f7488u);
        float e4 = C2347i.m3958e(this.f7486s);
        float e5 = C2347i.m3958e(this.f7487t);
        boolean z = this.f7470A;
        C2258e[] eVarArr = this.f7474g;
        int length = eVarArr.length;
        mo23830v(paint);
        this.f7493z = mo23829u(paint);
        int i2 = C3987a.f7494a[this.f7479l.ordinal()];
        if (i2 == 1) {
            float f6 = e;
            float f7 = e2;
            C2258e[] eVarArr2 = eVarArr;
            float j = C2347i.m3963j(paint);
            float f8 = 0.0f;
            float f9 = 0.0f;
            float f10 = 0.0f;
            boolean z2 = false;
            for (int i3 = 0; i3 < length; i3++) {
                C2258e eVar = eVarArr2[i3];
                boolean z3 = eVar.f2355b != LegendForm.NONE;
                if (Float.isNaN(eVar.f2356c)) {
                    f = f6;
                } else {
                    f = C2347i.m3958e(eVar.f2356c);
                }
                String str = eVar.f2354a;
                if (!z2) {
                    f10 = 0.0f;
                }
                if (z3) {
                    if (z2) {
                        f10 += f7;
                    }
                    f10 += f;
                }
                if (str != null) {
                    if (z3 && !z2) {
                        f10 += e3;
                    } else if (z2) {
                        f8 = Math.max(f8, f10);
                        f9 += j + e5;
                        f10 = 0.0f;
                        z2 = false;
                    }
                    f10 += (float) C2347i.m3957d(paint2, str);
                    if (i3 < length - 1) {
                        f9 += j + e5;
                    }
                } else {
                    f10 += f;
                    if (i3 < length - 1) {
                        f10 += f7;
                    }
                    z2 = true;
                }
                f8 = Math.max(f8, f10);
            }
            this.f7491x = f8;
            this.f7492y = f9;
        } else if (i2 == 2) {
            float j2 = C2347i.m3963j(paint);
            float l = C2347i.m3965l(paint) + e5;
            float k = jVar.mo17633k() * this.f7490w;
            this.f7472C.clear();
            this.f7471B.clear();
            this.f7473D.clear();
            int i4 = 0;
            float f11 = 0.0f;
            int i5 = -1;
            float f12 = 0.0f;
            float f13 = 0.0f;
            while (i4 < length) {
                C2258e eVar2 = eVarArr[i4];
                float f14 = e;
                float f15 = e4;
                boolean z4 = eVar2.f2355b != LegendForm.NONE;
                if (Float.isNaN(eVar2.f2356c)) {
                    f2 = f14;
                } else {
                    f2 = C2347i.m3958e(eVar2.f2356c);
                }
                String str2 = eVar2.f2354a;
                C2258e[] eVarArr3 = eVarArr;
                float f16 = l;
                this.f7472C.add(Boolean.FALSE);
                float f17 = i5 == -1 ? 0.0f : f12 + e2;
                if (str2 != null) {
                    f3 = e2;
                    this.f7471B.add(C2347i.m3955b(paint2, str2));
                    f4 = f17 + (z4 ? e3 + f2 : 0.0f) + this.f7471B.get(i4).f2532c;
                } else {
                    f3 = e2;
                    float f18 = f2;
                    this.f7471B.add(C2339b.m3918b(0.0f, 0.0f));
                    f4 = f17 + (z4 ? f18 : 0.0f);
                    if (i5 == -1) {
                        i5 = i4;
                    }
                }
                if (str2 != null || i4 == length - 1) {
                    float f19 = f13;
                    int i6 = (f19 > 0.0f ? 1 : (f19 == 0.0f ? 0 : -1));
                    float f20 = i6 == 0 ? 0.0f : f15;
                    if (!z || i6 == 0 || k - f19 >= f20 + f4) {
                        f5 = f19 + f20 + f4;
                    } else {
                        this.f7473D.add(C2339b.m3918b(f19, j2));
                        float max = Math.max(f11, f19);
                        this.f7472C.set(i5 > -1 ? i5 : i4, Boolean.TRUE);
                        f11 = max;
                        f5 = f4;
                    }
                    if (i4 == length - 1) {
                        this.f7473D.add(C2339b.m3918b(f5, j2));
                        f11 = Math.max(f11, f5);
                    }
                    f13 = f5;
                }
                if (str2 != null) {
                    i5 = -1;
                }
                i4++;
                e2 = f3;
                e = f14;
                e4 = f15;
                l = f16;
                f12 = f4;
                eVarArr = eVarArr3;
            }
            float f21 = l;
            this.f7491x = f11;
            float size = j2 * ((float) this.f7473D.size());
            if (this.f7473D.size() == 0) {
                i = 0;
            } else {
                i = this.f7473D.size() - 1;
            }
            this.f7492y = size + (f21 * ((float) i));
        }
        this.f7492y += this.f2347c;
        this.f7491x += this.f2346b;
    }

    /* renamed from: h */
    public List<Boolean> mo23816h() {
        return this.f7472C;
    }

    /* renamed from: i */
    public List<C2339b> mo23817i() {
        return this.f7471B;
    }

    /* renamed from: j */
    public List<C2339b> mo23818j() {
        return this.f7473D;
    }

    /* renamed from: k */
    public LegendDirection mo23819k() {
        return this.f7481n;
    }

    /* renamed from: l */
    public C2258e[] mo23820l() {
        return this.f7474g;
    }

    /* renamed from: m */
    public C2258e[] mo23821m() {
        return this.f7475h;
    }

    /* renamed from: n */
    public LegendForm mo23822n() {
        return this.f7482o;
    }

    /* renamed from: o */
    public DashPathEffect mo23823o() {
        return this.f7485r;
    }

    /* renamed from: p */
    public float mo23824p() {
        return this.f7484q;
    }

    /* renamed from: q */
    public float mo23825q() {
        return this.f7483p;
    }

    /* renamed from: r */
    public float mo23826r() {
        return this.f7488u;
    }

    /* renamed from: s */
    public LegendHorizontalAlignment mo23827s() {
        return this.f7477j;
    }

    /* renamed from: t */
    public float mo23828t() {
        return this.f7490w;
    }

    /* renamed from: u */
    public float mo23829u(Paint paint) {
        float f = 0.0f;
        for (C2258e eVar : this.f7474g) {
            String str = eVar.f2354a;
            if (str != null) {
                float a = (float) C2347i.m3954a(paint, str);
                if (a > f) {
                    f = a;
                }
            }
        }
        return f;
    }

    /* renamed from: v */
    public float mo23830v(Paint paint) {
        float e = C2347i.m3958e(this.f7488u);
        float f = 0.0f;
        float f2 = 0.0f;
        for (C2258e eVar : this.f7474g) {
            float e2 = C2347i.m3958e(Float.isNaN(eVar.f2356c) ? this.f7483p : eVar.f2356c);
            if (e2 > f2) {
                f2 = e2;
            }
            String str = eVar.f2354a;
            if (str != null) {
                float d = (float) C2347i.m3957d(paint, str);
                if (d > f) {
                    f = d;
                }
            }
        }
        return f + f2 + e;
    }

    /* renamed from: w */
    public LegendOrientation mo23831w() {
        return this.f7479l;
    }

    /* renamed from: x */
    public float mo23832x() {
        return this.f7489v;
    }

    /* renamed from: y */
    public LegendVerticalAlignment mo23833y() {
        return this.f7478k;
    }

    /* renamed from: z */
    public float mo23834z() {
        return this.f7486s;
    }
}
