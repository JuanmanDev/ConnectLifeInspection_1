package p040c.p200q.p201a.p202a.p205i;

import p040c.p200q.p201a.p202a.C2350b;
import p040c.p200q.p201a.p202a.C2351c;
import p040c.p200q.p201a.p202a.C2352d;
import p040c.p200q.p201a.p202a.p205i.C2536p;

/* renamed from: c.q.a.a.i.d */
/* compiled from: AutoValue_SendRequest */
public final class C2504d extends C2536p {

    /* renamed from: a */
    public final C2538q f2934a;

    /* renamed from: b */
    public final String f2935b;

    /* renamed from: c */
    public final C2351c<?> f2936c;

    /* renamed from: d */
    public final C2352d<?, byte[]> f2937d;

    /* renamed from: e */
    public final C2350b f2938e;

    /* renamed from: c.q.a.a.i.d$b */
    /* compiled from: AutoValue_SendRequest */
    public static final class C2506b extends C2536p.C2537a {

        /* renamed from: a */
        public C2538q f2939a;

        /* renamed from: b */
        public String f2940b;

        /* renamed from: c */
        public C2351c<?> f2941c;

        /* renamed from: d */
        public C2352d<?, byte[]> f2942d;

        /* renamed from: e */
        public C2350b f2943e;

        /* renamed from: a */
        public C2536p mo17937a() {
            String str = "";
            if (this.f2939a == null) {
                str = str + " transportContext";
            }
            if (this.f2940b == null) {
                str = str + " transportName";
            }
            if (this.f2941c == null) {
                str = str + " event";
            }
            if (this.f2942d == null) {
                str = str + " transformer";
            }
            if (this.f2943e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new C2504d(this.f2939a, this.f2940b, this.f2941c, this.f2942d, this.f2943e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C2536p.C2537a mo17938b(C2350b bVar) {
            if (bVar != null) {
                this.f2943e = bVar;
                return this;
            }
            throw new NullPointerException("Null encoding");
        }

        /* renamed from: c */
        public C2536p.C2537a mo17939c(C2351c<?> cVar) {
            if (cVar != null) {
                this.f2941c = cVar;
                return this;
            }
            throw new NullPointerException("Null event");
        }

        /* renamed from: d */
        public C2536p.C2537a mo17940d(C2352d<?, byte[]> dVar) {
            if (dVar != null) {
                this.f2942d = dVar;
                return this;
            }
            throw new NullPointerException("Null transformer");
        }

        /* renamed from: e */
        public C2536p.C2537a mo17941e(C2538q qVar) {
            if (qVar != null) {
                this.f2939a = qVar;
                return this;
            }
            throw new NullPointerException("Null transportContext");
        }

        /* renamed from: f */
        public C2536p.C2537a mo17942f(String str) {
            if (str != null) {
                this.f2940b = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }
    }

    /* renamed from: b */
    public C2350b mo17929b() {
        return this.f2938e;
    }

    /* renamed from: c */
    public C2351c<?> mo17930c() {
        return this.f2936c;
    }

    /* renamed from: e */
    public C2352d<?, byte[]> mo17931e() {
        return this.f2937d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2536p)) {
            return false;
        }
        C2536p pVar = (C2536p) obj;
        if (!this.f2934a.equals(pVar.mo17933f()) || !this.f2935b.equals(pVar.mo17934g()) || !this.f2936c.equals(pVar.mo17930c()) || !this.f2937d.equals(pVar.mo17931e()) || !this.f2938e.equals(pVar.mo17929b())) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public C2538q mo17933f() {
        return this.f2934a;
    }

    /* renamed from: g */
    public String mo17934g() {
        return this.f2935b;
    }

    public int hashCode() {
        return ((((((((this.f2934a.hashCode() ^ 1000003) * 1000003) ^ this.f2935b.hashCode()) * 1000003) ^ this.f2936c.hashCode()) * 1000003) ^ this.f2937d.hashCode()) * 1000003) ^ this.f2938e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f2934a + ", transportName=" + this.f2935b + ", event=" + this.f2936c + ", transformer=" + this.f2937d + ", encoding=" + this.f2938e + "}";
    }

    public C2504d(C2538q qVar, String str, C2351c<?> cVar, C2352d<?, byte[]> dVar, C2350b bVar) {
        this.f2934a = qVar;
        this.f2935b = str;
        this.f2936c = cVar;
        this.f2937d = dVar;
        this.f2938e = bVar;
    }
}
