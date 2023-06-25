package p040c.p200q.p363c.p369m;

/* renamed from: c.q.c.m.v */
/* compiled from: Dependency */
public final class C6456v {

    /* renamed from: a */
    public final Class<?> f12146a;

    /* renamed from: b */
    public final int f12147b;

    /* renamed from: c */
    public final int f12148c;

    public C6456v(Class<?> cls, int i, int i2) {
        C6423a0.m17953c(cls, "Null dependency anInterface.");
        this.f12146a = cls;
        this.f12147b = i;
        this.f12148c = i2;
    }

    /* renamed from: a */
    public static C6456v m18040a(Class<?> cls) {
        return new C6456v(cls, 0, 2);
    }

    /* renamed from: b */
    public static String m18041b(int i) {
        if (i == 0) {
            return "direct";
        }
        if (i == 1) {
            return "provider";
        }
        if (i == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i);
    }

    @Deprecated
    /* renamed from: h */
    public static C6456v m18042h(Class<?> cls) {
        return new C6456v(cls, 0, 0);
    }

    /* renamed from: i */
    public static C6456v m18043i(Class<?> cls) {
        return new C6456v(cls, 0, 1);
    }

    /* renamed from: j */
    public static C6456v m18044j(Class<?> cls) {
        return new C6456v(cls, 1, 0);
    }

    /* renamed from: k */
    public static C6456v m18045k(Class<?> cls) {
        return new C6456v(cls, 1, 1);
    }

    /* renamed from: l */
    public static C6456v m18046l(Class<?> cls) {
        return new C6456v(cls, 2, 0);
    }

    /* renamed from: c */
    public Class<?> mo30585c() {
        return this.f12146a;
    }

    /* renamed from: d */
    public boolean mo30586d() {
        return this.f12148c == 2;
    }

    /* renamed from: e */
    public boolean mo30587e() {
        return this.f12148c == 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6456v)) {
            return false;
        }
        C6456v vVar = (C6456v) obj;
        if (this.f12146a == vVar.f12146a && this.f12147b == vVar.f12147b && this.f12148c == vVar.f12148c) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo30589f() {
        return this.f12147b == 1;
    }

    /* renamed from: g */
    public boolean mo30590g() {
        return this.f12147b == 2;
    }

    public int hashCode() {
        return ((((this.f12146a.hashCode() ^ 1000003) * 1000003) ^ this.f12147b) * 1000003) ^ this.f12148c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f12146a);
        sb.append(", type=");
        int i = this.f12147b;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        sb.append(m18041b(this.f12148c));
        sb.append("}");
        return sb.toString();
    }
}
