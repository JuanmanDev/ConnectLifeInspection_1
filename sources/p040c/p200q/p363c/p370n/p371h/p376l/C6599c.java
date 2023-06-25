package p040c.p200q.p363c.p370n.p371h.p376l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: c.q.c.n.h.l.c */
/* compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo */
public final class C6599c extends CrashlyticsReport.C8251a {

    /* renamed from: a */
    public final int f12540a;

    /* renamed from: b */
    public final String f12541b;

    /* renamed from: c */
    public final int f12542c;

    /* renamed from: d */
    public final int f12543d;

    /* renamed from: e */
    public final long f12544e;

    /* renamed from: f */
    public final long f12545f;

    /* renamed from: g */
    public final long f12546g;

    /* renamed from: h */
    public final String f12547h;

    /* renamed from: c.q.c.n.h.l.c$b */
    /* compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo */
    public static final class C6601b extends CrashlyticsReport.C8251a.C8252a {

        /* renamed from: a */
        public Integer f12548a;

        /* renamed from: b */
        public String f12549b;

        /* renamed from: c */
        public Integer f12550c;

        /* renamed from: d */
        public Integer f12551d;

        /* renamed from: e */
        public Long f12552e;

        /* renamed from: f */
        public Long f12553f;

        /* renamed from: g */
        public Long f12554g;

        /* renamed from: h */
        public String f12555h;

        /* renamed from: a */
        public CrashlyticsReport.C8251a mo30987a() {
            String str = "";
            if (this.f12548a == null) {
                str = str + " pid";
            }
            if (this.f12549b == null) {
                str = str + " processName";
            }
            if (this.f12550c == null) {
                str = str + " reasonCode";
            }
            if (this.f12551d == null) {
                str = str + " importance";
            }
            if (this.f12552e == null) {
                str = str + " pss";
            }
            if (this.f12553f == null) {
                str = str + " rss";
            }
            if (this.f12554g == null) {
                str = str + " timestamp";
            }
            if (str.isEmpty()) {
                return new C6599c(this.f12548a.intValue(), this.f12549b, this.f12550c.intValue(), this.f12551d.intValue(), this.f12552e.longValue(), this.f12553f.longValue(), this.f12554g.longValue(), this.f12555h);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C8251a.C8252a mo30988b(int i) {
            this.f12551d = Integer.valueOf(i);
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.C8251a.C8252a mo30989c(int i) {
            this.f12548a = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public CrashlyticsReport.C8251a.C8252a mo30990d(String str) {
            if (str != null) {
                this.f12549b = str;
                return this;
            }
            throw new NullPointerException("Null processName");
        }

        /* renamed from: e */
        public CrashlyticsReport.C8251a.C8252a mo30991e(long j) {
            this.f12552e = Long.valueOf(j);
            return this;
        }

        /* renamed from: f */
        public CrashlyticsReport.C8251a.C8252a mo30992f(int i) {
            this.f12550c = Integer.valueOf(i);
            return this;
        }

        /* renamed from: g */
        public CrashlyticsReport.C8251a.C8252a mo30993g(long j) {
            this.f12553f = Long.valueOf(j);
            return this;
        }

        /* renamed from: h */
        public CrashlyticsReport.C8251a.C8252a mo30994h(long j) {
            this.f12554g = Long.valueOf(j);
            return this;
        }

        /* renamed from: i */
        public CrashlyticsReport.C8251a.C8252a mo30995i(@Nullable String str) {
            this.f12555h = str;
            return this;
        }
    }

    @NonNull
    /* renamed from: b */
    public int mo30976b() {
        return this.f12543d;
    }

    @NonNull
    /* renamed from: c */
    public int mo30977c() {
        return this.f12540a;
    }

    @NonNull
    /* renamed from: d */
    public String mo30978d() {
        return this.f12541b;
    }

    @NonNull
    /* renamed from: e */
    public long mo30979e() {
        return this.f12544e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.C8251a)) {
            return false;
        }
        CrashlyticsReport.C8251a aVar = (CrashlyticsReport.C8251a) obj;
        if (this.f12540a == aVar.mo30977c() && this.f12541b.equals(aVar.mo30978d()) && this.f12542c == aVar.mo30981f() && this.f12543d == aVar.mo30976b() && this.f12544e == aVar.mo30979e() && this.f12545f == aVar.mo30982g() && this.f12546g == aVar.mo30983h()) {
            String str = this.f12547h;
            if (str == null) {
                if (aVar.mo30985i() == null) {
                    return true;
                }
            } else if (str.equals(aVar.mo30985i())) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    /* renamed from: f */
    public int mo30981f() {
        return this.f12542c;
    }

    @NonNull
    /* renamed from: g */
    public long mo30982g() {
        return this.f12545f;
    }

    @NonNull
    /* renamed from: h */
    public long mo30983h() {
        return this.f12546g;
    }

    public int hashCode() {
        long j = this.f12544e;
        long j2 = this.f12545f;
        long j3 = this.f12546g;
        int hashCode = (((((((((((((this.f12540a ^ 1000003) * 1000003) ^ this.f12541b.hashCode()) * 1000003) ^ this.f12542c) * 1000003) ^ this.f12543d) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str = this.f12547h;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    @Nullable
    /* renamed from: i */
    public String mo30985i() {
        return this.f12547h;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.f12540a + ", processName=" + this.f12541b + ", reasonCode=" + this.f12542c + ", importance=" + this.f12543d + ", pss=" + this.f12544e + ", rss=" + this.f12545f + ", timestamp=" + this.f12546g + ", traceFile=" + this.f12547h + "}";
    }

    public C6599c(int i, String str, int i2, int i3, long j, long j2, long j3, @Nullable String str2) {
        this.f12540a = i;
        this.f12541b = str;
        this.f12542c = i2;
        this.f12543d = i3;
        this.f12544e = j;
        this.f12545f = j2;
        this.f12546g = j3;
        this.f12547h = str2;
    }
}
