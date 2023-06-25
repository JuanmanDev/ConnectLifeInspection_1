package p040c.p142n.p143a.p144a.p149l;

import com.fasterxml.jackson.core.JsonFactory;

/* renamed from: c.n.a.a.l.b */
/* compiled from: CharsToNameCanonicalizer */
public final class C2091b {

    /* renamed from: k */
    public static final C2091b f2027k = new C2091b();

    /* renamed from: a */
    public C2091b f2028a;

    /* renamed from: b */
    public final int f2029b;

    /* renamed from: c */
    public boolean f2030c;

    /* renamed from: d */
    public String[] f2031d;

    /* renamed from: e */
    public C2092a[] f2032e;

    /* renamed from: f */
    public int f2033f;

    /* renamed from: g */
    public int f2034g;

    /* renamed from: h */
    public int f2035h;

    /* renamed from: i */
    public int f2036i;

    /* renamed from: j */
    public boolean f2037j;

    /* renamed from: c.n.a.a.l.b$a */
    /* compiled from: CharsToNameCanonicalizer */
    public static final class C2092a {
    }

    public C2091b() {
        this.f2030c = true;
        this.f2037j = true;
        this.f2029b = 0;
        this.f2036i = 0;
        mo16805e(64);
    }

    /* renamed from: a */
    public static int m2993a(int i) {
        return i - (i >> 2);
    }

    /* renamed from: b */
    public static C2091b m2994b() {
        long currentTimeMillis = System.currentTimeMillis();
        return m2995c((((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1);
    }

    /* renamed from: c */
    public static C2091b m2995c(int i) {
        return f2027k.mo16807g(i);
    }

    /* renamed from: d */
    public int mo16804d() {
        return this.f2029b;
    }

    /* renamed from: e */
    public final void mo16805e(int i) {
        this.f2031d = new String[i];
        this.f2032e = new C2092a[(i >> 1)];
        this.f2035h = i - 1;
        this.f2033f = 0;
        this.f2036i = 0;
        this.f2034g = m2993a(i);
    }

    /* renamed from: f */
    public C2091b mo16806f(int i) {
        String[] strArr;
        C2092a[] aVarArr;
        int i2;
        int i3;
        int i4;
        synchronized (this) {
            strArr = this.f2031d;
            aVarArr = this.f2032e;
            i2 = this.f2033f;
            i3 = this.f2029b;
            i4 = this.f2036i;
        }
        return new C2091b(this, i, strArr, aVarArr, i2, i3, i4);
    }

    /* renamed from: g */
    public final C2091b mo16807g(int i) {
        return new C2091b((C2091b) null, -1, this.f2031d, this.f2032e, this.f2033f, i, this.f2036i);
    }

    /* renamed from: h */
    public boolean mo16808h() {
        return this.f2037j;
    }

    /* renamed from: i */
    public final void mo16809i(C2091b bVar) {
        if (bVar.mo16811k() > 12000) {
            synchronized (this) {
                mo16805e(256);
                this.f2037j = false;
            }
        } else if (bVar.mo16811k() > mo16811k()) {
            synchronized (this) {
                this.f2031d = bVar.f2031d;
                this.f2032e = bVar.f2032e;
                this.f2033f = bVar.f2033f;
                this.f2034g = bVar.f2034g;
                this.f2035h = bVar.f2035h;
                this.f2036i = bVar.f2036i;
                this.f2037j = false;
            }
        }
    }

    /* renamed from: j */
    public void mo16810j() {
        C2091b bVar;
        if (mo16808h() && (bVar = this.f2028a) != null && this.f2030c) {
            bVar.mo16809i(this);
            this.f2037j = false;
        }
    }

    /* renamed from: k */
    public int mo16811k() {
        return this.f2033f;
    }

    public C2091b(C2091b bVar, int i, String[] strArr, C2092a[] aVarArr, int i2, int i3, int i4) {
        this.f2028a = bVar;
        this.f2030c = JsonFactory.Feature.CANONICALIZE_FIELD_NAMES.enabledIn(i);
        this.f2031d = strArr;
        this.f2032e = aVarArr;
        this.f2033f = i2;
        this.f2029b = i3;
        int length = strArr.length;
        this.f2034g = m2993a(length);
        this.f2035h = length - 1;
        this.f2036i = i4;
        this.f2037j = false;
    }
}
