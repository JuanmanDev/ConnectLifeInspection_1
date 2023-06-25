package p040c.p175p.p184b.p185a.p188c;

import android.graphics.DashPathEffect;
import com.github.mikephil.charting.components.LimitLine;
import java.util.ArrayList;
import java.util.List;
import p040c.p175p.p184b.p185a.p190e.C2270a;
import p040c.p175p.p184b.p185a.p190e.C2273d;
import p040c.p175p.p184b.p185a.p199k.C2347i;

/* renamed from: c.p.b.a.c.a */
/* compiled from: AxisBase */
public abstract class C2254a extends C2255b {

    /* renamed from: A */
    public boolean f2316A = false;

    /* renamed from: B */
    public boolean f2317B = true;

    /* renamed from: C */
    public float f2318C = 0.0f;

    /* renamed from: D */
    public float f2319D = 0.0f;

    /* renamed from: E */
    public boolean f2320E = false;

    /* renamed from: F */
    public boolean f2321F = false;

    /* renamed from: G */
    public float f2322G = 0.0f;

    /* renamed from: H */
    public float f2323H = 0.0f;

    /* renamed from: I */
    public float f2324I = 0.0f;

    /* renamed from: g */
    public C2273d f2325g;

    /* renamed from: h */
    public int f2326h = -7829368;

    /* renamed from: i */
    public float f2327i = 1.0f;

    /* renamed from: j */
    public int f2328j = -7829368;

    /* renamed from: k */
    public float f2329k = 1.0f;

    /* renamed from: l */
    public float[] f2330l = new float[0];

    /* renamed from: m */
    public float[] f2331m = new float[0];

    /* renamed from: n */
    public int f2332n;

    /* renamed from: o */
    public int f2333o;

    /* renamed from: p */
    public int f2334p = 6;

    /* renamed from: q */
    public float f2335q = 1.0f;

    /* renamed from: r */
    public boolean f2336r = false;

    /* renamed from: s */
    public boolean f2337s = false;

    /* renamed from: t */
    public boolean f2338t = true;

    /* renamed from: u */
    public boolean f2339u = true;

    /* renamed from: v */
    public boolean f2340v = true;

    /* renamed from: w */
    public boolean f2341w = false;

    /* renamed from: x */
    public DashPathEffect f2342x = null;

    /* renamed from: y */
    public DashPathEffect f2343y = null;

    /* renamed from: z */
    public List<LimitLine> f2344z;

    public C2254a() {
        this.f2349e = C2347i.m3958e(10.0f);
        this.f2346b = C2347i.m3958e(5.0f);
        this.f2347c = C2347i.m3958e(5.0f);
        this.f2344z = new ArrayList();
    }

    /* renamed from: A */
    public boolean mo17234A() {
        return this.f2336r;
    }

    /* renamed from: B */
    public void mo17235B(float f) {
        this.f2319D = f;
    }

    /* renamed from: C */
    public void mo17236C(float f) {
        this.f2318C = f;
    }

    /* renamed from: g */
    public void mo17237g(float f, float f2) {
        float f3 = this.f2320E ? this.f2323H : f - this.f2318C;
        float f4 = this.f2321F ? this.f2322G : f2 + this.f2319D;
        if (Math.abs(f4 - f3) == 0.0f) {
            f4 += 1.0f;
            f3 -= 1.0f;
        }
        this.f2323H = f3;
        this.f2322G = f4;
        this.f2324I = Math.abs(f4 - f3);
    }

    /* renamed from: h */
    public int mo17238h() {
        return this.f2328j;
    }

    /* renamed from: i */
    public DashPathEffect mo17239i() {
        return this.f2342x;
    }

    /* renamed from: j */
    public float mo17240j() {
        return this.f2329k;
    }

    /* renamed from: k */
    public String mo17241k(int i) {
        return (i < 0 || i >= this.f2330l.length) ? "" : mo17249s().mo17306a(this.f2330l[i], this);
    }

    /* renamed from: l */
    public float mo17242l() {
        return this.f2335q;
    }

    /* renamed from: m */
    public int mo17243m() {
        return this.f2326h;
    }

    /* renamed from: n */
    public DashPathEffect mo17244n() {
        return this.f2343y;
    }

    /* renamed from: o */
    public float mo17245o() {
        return this.f2327i;
    }

    /* renamed from: p */
    public int mo17246p() {
        return this.f2334p;
    }

    /* renamed from: q */
    public List<LimitLine> mo17247q() {
        return this.f2344z;
    }

    /* renamed from: r */
    public String mo17248r() {
        String str = "";
        for (int i = 0; i < this.f2330l.length; i++) {
            String k = mo17241k(i);
            if (k != null && str.length() < k.length()) {
                str = k;
            }
        }
        return str;
    }

    /* renamed from: s */
    public C2273d mo17249s() {
        C2273d dVar = this.f2325g;
        if (dVar == null || ((dVar instanceof C2270a) && ((C2270a) dVar).mo17303j() != this.f2333o)) {
            this.f2325g = new C2270a(this.f2333o);
        }
        return this.f2325g;
    }

    /* renamed from: t */
    public boolean mo17250t() {
        return this.f2341w && this.f2332n > 0;
    }

    /* renamed from: u */
    public boolean mo17251u() {
        return this.f2339u;
    }

    /* renamed from: v */
    public boolean mo17252v() {
        return this.f2317B;
    }

    /* renamed from: w */
    public boolean mo17253w() {
        return this.f2338t;
    }

    /* renamed from: x */
    public boolean mo17254x() {
        return this.f2340v;
    }

    /* renamed from: y */
    public boolean mo17255y() {
        return this.f2316A;
    }

    /* renamed from: z */
    public boolean mo17256z() {
        return this.f2337s;
    }
}
