package p040c.p200q.p201a.p202a.p205i;

import androidx.annotation.Nullable;
import java.util.Map;
import p040c.p200q.p201a.p202a.p205i.C2527j;

/* renamed from: c.q.a.a.i.c */
/* compiled from: AutoValue_EventInternal */
public final class C2408c extends C2527j {

    /* renamed from: a */
    public final String f2734a;

    /* renamed from: b */
    public final Integer f2735b;

    /* renamed from: c */
    public final C2526i f2736c;

    /* renamed from: d */
    public final long f2737d;

    /* renamed from: e */
    public final long f2738e;

    /* renamed from: f */
    public final Map<String, String> f2739f;

    /* renamed from: c.q.a.a.i.c$b */
    /* compiled from: AutoValue_EventInternal */
    public static final class C2410b extends C2527j.C2528a {

        /* renamed from: a */
        public String f2740a;

        /* renamed from: b */
        public Integer f2741b;

        /* renamed from: c */
        public C2526i f2742c;

        /* renamed from: d */
        public Long f2743d;

        /* renamed from: e */
        public Long f2744e;

        /* renamed from: f */
        public Map<String, String> f2745f;

        /* renamed from: d */
        public C2527j mo17791d() {
            String str = "";
            if (this.f2740a == null) {
                str = str + " transportName";
            }
            if (this.f2742c == null) {
                str = str + " encodedPayload";
            }
            if (this.f2743d == null) {
                str = str + " eventMillis";
            }
            if (this.f2744e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f2745f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new C2408c(this.f2740a, this.f2741b, this.f2742c, this.f2743d.longValue(), this.f2744e.longValue(), this.f2745f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: e */
        public Map<String, String> mo17792e() {
            Map<String, String> map = this.f2745f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        /* renamed from: f */
        public C2527j.C2528a mo17793f(Map<String, String> map) {
            if (map != null) {
                this.f2745f = map;
                return this;
            }
            throw new NullPointerException("Null autoMetadata");
        }

        /* renamed from: g */
        public C2527j.C2528a mo17794g(Integer num) {
            this.f2741b = num;
            return this;
        }

        /* renamed from: h */
        public C2527j.C2528a mo17795h(C2526i iVar) {
            if (iVar != null) {
                this.f2742c = iVar;
                return this;
            }
            throw new NullPointerException("Null encodedPayload");
        }

        /* renamed from: i */
        public C2527j.C2528a mo17796i(long j) {
            this.f2743d = Long.valueOf(j);
            return this;
        }

        /* renamed from: j */
        public C2527j.C2528a mo17797j(String str) {
            if (str != null) {
                this.f2740a = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }

        /* renamed from: k */
        public C2527j.C2528a mo17798k(long j) {
            this.f2744e = Long.valueOf(j);
            return this;
        }
    }

    /* renamed from: c */
    public Map<String, String> mo17782c() {
        return this.f2739f;
    }

    @Nullable
    /* renamed from: d */
    public Integer mo17783d() {
        return this.f2735b;
    }

    /* renamed from: e */
    public C2526i mo17784e() {
        return this.f2736c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2527j)) {
            return false;
        }
        C2527j jVar = (C2527j) obj;
        if (!this.f2734a.equals(jVar.mo17788j()) || ((num = this.f2735b) != null ? !num.equals(jVar.mo17783d()) : jVar.mo17783d() != null) || !this.f2736c.equals(jVar.mo17784e()) || this.f2737d != jVar.mo17786f() || this.f2738e != jVar.mo17789k() || !this.f2739f.equals(jVar.mo17782c())) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public long mo17786f() {
        return this.f2737d;
    }

    public int hashCode() {
        int hashCode = (this.f2734a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f2735b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        long j = this.f2737d;
        long j2 = this.f2738e;
        return ((((((((hashCode ^ hashCode2) * 1000003) ^ this.f2736c.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f2739f.hashCode();
    }

    /* renamed from: j */
    public String mo17788j() {
        return this.f2734a;
    }

    /* renamed from: k */
    public long mo17789k() {
        return this.f2738e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f2734a + ", code=" + this.f2735b + ", encodedPayload=" + this.f2736c + ", eventMillis=" + this.f2737d + ", uptimeMillis=" + this.f2738e + ", autoMetadata=" + this.f2739f + "}";
    }

    public C2408c(String str, @Nullable Integer num, C2526i iVar, long j, long j2, Map<String, String> map) {
        this.f2734a = str;
        this.f2735b = num;
        this.f2736c = iVar;
        this.f2737d = j;
        this.f2738e = j2;
        this.f2739f = map;
    }
}
