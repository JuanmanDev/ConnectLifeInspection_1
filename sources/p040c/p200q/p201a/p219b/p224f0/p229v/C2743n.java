package p040c.p200q.p201a.p219b.p224f0.p229v;

import p040c.p200q.p201a.p219b.p224f0.C2675h;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.f0.v.n */
/* compiled from: TrackFragment */
public final class C2743n {

    /* renamed from: a */
    public C2728e f3933a;

    /* renamed from: b */
    public long f3934b;

    /* renamed from: c */
    public long f3935c;

    /* renamed from: d */
    public long f3936d;

    /* renamed from: e */
    public int f3937e;

    /* renamed from: f */
    public int f3938f;

    /* renamed from: g */
    public long[] f3939g;

    /* renamed from: h */
    public int[] f3940h;

    /* renamed from: i */
    public int[] f3941i;

    /* renamed from: j */
    public int[] f3942j;

    /* renamed from: k */
    public long[] f3943k;

    /* renamed from: l */
    public boolean[] f3944l;

    /* renamed from: m */
    public boolean f3945m;

    /* renamed from: n */
    public boolean[] f3946n;

    /* renamed from: o */
    public C2742m f3947o;

    /* renamed from: p */
    public int f3948p;

    /* renamed from: q */
    public C3173t f3949q;

    /* renamed from: r */
    public boolean f3950r;

    /* renamed from: s */
    public long f3951s;

    /* renamed from: a */
    public void mo18684a(C2675h hVar) {
        hVar.readFully(this.f3949q.f5877a, 0, this.f3948p);
        this.f3949q.mo20006L(0);
        this.f3950r = false;
    }

    /* renamed from: b */
    public void mo18685b(C3173t tVar) {
        tVar.mo20015h(this.f3949q.f5877a, 0, this.f3948p);
        this.f3949q.mo20006L(0);
        this.f3950r = false;
    }

    /* renamed from: c */
    public long mo18686c(int i) {
        return this.f3943k[i] + ((long) this.f3942j[i]);
    }

    /* renamed from: d */
    public void mo18687d(int i) {
        C3173t tVar = this.f3949q;
        if (tVar == null || tVar.mo20011d() < i) {
            this.f3949q = new C3173t(i);
        }
        this.f3948p = i;
        this.f3945m = true;
        this.f3950r = true;
    }

    /* renamed from: e */
    public void mo18688e(int i, int i2) {
        this.f3937e = i;
        this.f3938f = i2;
        int[] iArr = this.f3940h;
        if (iArr == null || iArr.length < i) {
            this.f3939g = new long[i];
            this.f3940h = new int[i];
        }
        int[] iArr2 = this.f3941i;
        if (iArr2 == null || iArr2.length < i2) {
            int i3 = (i2 * 125) / 100;
            this.f3941i = new int[i3];
            this.f3942j = new int[i3];
            this.f3943k = new long[i3];
            this.f3944l = new boolean[i3];
            this.f3946n = new boolean[i3];
        }
    }

    /* renamed from: f */
    public void mo18689f() {
        this.f3937e = 0;
        this.f3951s = 0;
        this.f3945m = false;
        this.f3950r = false;
        this.f3947o = null;
    }

    /* renamed from: g */
    public boolean mo18690g(int i) {
        return this.f3945m && this.f3946n[i];
    }
}
