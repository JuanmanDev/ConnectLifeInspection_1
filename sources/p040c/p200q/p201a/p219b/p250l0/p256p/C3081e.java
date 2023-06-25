package p040c.p200q.p201a.p219b.p250l0.p256p;

import android.text.Layout;
import p040c.p200q.p201a.p219b.p261o0.C3151e;

/* renamed from: c.q.a.b.l0.p.e */
/* compiled from: TtmlStyle */
public final class C3081e {

    /* renamed from: a */
    public String f5558a;

    /* renamed from: b */
    public int f5559b;

    /* renamed from: c */
    public boolean f5560c;

    /* renamed from: d */
    public int f5561d;

    /* renamed from: e */
    public boolean f5562e;

    /* renamed from: f */
    public int f5563f = -1;

    /* renamed from: g */
    public int f5564g = -1;

    /* renamed from: h */
    public int f5565h = -1;

    /* renamed from: i */
    public int f5566i = -1;

    /* renamed from: j */
    public int f5567j = -1;

    /* renamed from: k */
    public float f5568k;

    /* renamed from: l */
    public String f5569l;

    /* renamed from: m */
    public C3081e f5570m;

    /* renamed from: n */
    public Layout.Alignment f5571n;

    /* renamed from: a */
    public C3081e mo19742a(C3081e eVar) {
        mo19753l(eVar, true);
        return this;
    }

    /* renamed from: b */
    public int mo19743b() {
        if (this.f5562e) {
            return this.f5561d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    /* renamed from: c */
    public int mo19744c() {
        if (this.f5560c) {
            return this.f5559b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    /* renamed from: d */
    public String mo19745d() {
        return this.f5558a;
    }

    /* renamed from: e */
    public float mo19746e() {
        return this.f5568k;
    }

    /* renamed from: f */
    public int mo19747f() {
        return this.f5567j;
    }

    /* renamed from: g */
    public String mo19748g() {
        return this.f5569l;
    }

    /* renamed from: h */
    public int mo19749h() {
        if (this.f5565h == -1 && this.f5566i == -1) {
            return -1;
        }
        int i = 0;
        int i2 = this.f5565h == 1 ? 1 : 0;
        if (this.f5566i == 1) {
            i = 2;
        }
        return i2 | i;
    }

    /* renamed from: i */
    public Layout.Alignment mo19750i() {
        return this.f5571n;
    }

    /* renamed from: j */
    public boolean mo19751j() {
        return this.f5562e;
    }

    /* renamed from: k */
    public boolean mo19752k() {
        return this.f5560c;
    }

    /* renamed from: l */
    public final C3081e mo19753l(C3081e eVar, boolean z) {
        if (eVar != null) {
            if (!this.f5560c && eVar.f5560c) {
                mo19758q(eVar.f5559b);
            }
            if (this.f5565h == -1) {
                this.f5565h = eVar.f5565h;
            }
            if (this.f5566i == -1) {
                this.f5566i = eVar.f5566i;
            }
            if (this.f5558a == null) {
                this.f5558a = eVar.f5558a;
            }
            if (this.f5563f == -1) {
                this.f5563f = eVar.f5563f;
            }
            if (this.f5564g == -1) {
                this.f5564g = eVar.f5564g;
            }
            if (this.f5571n == null) {
                this.f5571n = eVar.f5571n;
            }
            if (this.f5567j == -1) {
                this.f5567j = eVar.f5567j;
                this.f5568k = eVar.f5568k;
            }
            if (z && !this.f5562e && eVar.f5562e) {
                mo19756o(eVar.f5561d);
            }
        }
        return this;
    }

    /* renamed from: m */
    public boolean mo19754m() {
        return this.f5563f == 1;
    }

    /* renamed from: n */
    public boolean mo19755n() {
        return this.f5564g == 1;
    }

    /* renamed from: o */
    public C3081e mo19756o(int i) {
        this.f5561d = i;
        this.f5562e = true;
        return this;
    }

    /* renamed from: p */
    public C3081e mo19757p(boolean z) {
        C3151e.m7759g(this.f5570m == null);
        this.f5565h = z ? 1 : 0;
        return this;
    }

    /* renamed from: q */
    public C3081e mo19758q(int i) {
        C3151e.m7759g(this.f5570m == null);
        this.f5559b = i;
        this.f5560c = true;
        return this;
    }

    /* renamed from: r */
    public C3081e mo19759r(String str) {
        C3151e.m7759g(this.f5570m == null);
        this.f5558a = str;
        return this;
    }

    /* renamed from: s */
    public C3081e mo19760s(float f) {
        this.f5568k = f;
        return this;
    }

    /* renamed from: t */
    public C3081e mo19761t(int i) {
        this.f5567j = i;
        return this;
    }

    /* renamed from: u */
    public C3081e mo19762u(String str) {
        this.f5569l = str;
        return this;
    }

    /* renamed from: v */
    public C3081e mo19763v(boolean z) {
        C3151e.m7759g(this.f5570m == null);
        this.f5566i = z ? 1 : 0;
        return this;
    }

    /* renamed from: w */
    public C3081e mo19764w(boolean z) {
        C3151e.m7759g(this.f5570m == null);
        this.f5563f = z ? 1 : 0;
        return this;
    }

    /* renamed from: x */
    public C3081e mo19765x(Layout.Alignment alignment) {
        this.f5571n = alignment;
        return this;
    }

    /* renamed from: y */
    public C3081e mo19766y(boolean z) {
        C3151e.m7759g(this.f5570m == null);
        this.f5564g = z ? 1 : 0;
        return this;
    }
}
