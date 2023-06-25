package p040c.p200q.p406e.p418o.p419r.p420g.p421e;

/* renamed from: c.q.e.o.r.g.e.m */
/* compiled from: CurrentParsingState */
public final class C7106m {

    /* renamed from: a */
    public int f13651a = 0;

    /* renamed from: b */
    public C7107a f13652b = C7107a.NUMERIC;

    /* renamed from: c.q.e.o.r.g.e.m$a */
    /* compiled from: CurrentParsingState */
    public enum C7107a {
        NUMERIC,
        ALPHA,
        ISO_IEC_646
    }

    /* renamed from: a */
    public int mo32722a() {
        return this.f13651a;
    }

    /* renamed from: b */
    public void mo32723b(int i) {
        this.f13651a += i;
    }

    /* renamed from: c */
    public boolean mo32724c() {
        return this.f13652b == C7107a.ALPHA;
    }

    /* renamed from: d */
    public boolean mo32725d() {
        return this.f13652b == C7107a.ISO_IEC_646;
    }

    /* renamed from: e */
    public void mo32726e() {
        this.f13652b = C7107a.ALPHA;
    }

    /* renamed from: f */
    public void mo32727f() {
        this.f13652b = C7107a.ISO_IEC_646;
    }

    /* renamed from: g */
    public void mo32728g() {
        this.f13652b = C7107a.NUMERIC;
    }

    /* renamed from: h */
    public void mo32729h(int i) {
        this.f13651a = i;
    }
}
