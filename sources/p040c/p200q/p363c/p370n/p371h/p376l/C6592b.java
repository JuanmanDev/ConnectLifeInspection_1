package p040c.p200q.p363c.p370n.p371h.p376l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: c.q.c.n.h.l.b */
/* compiled from: AutoValue_CrashlyticsReport */
public final class C6592b extends CrashlyticsReport {

    /* renamed from: b */
    public final String f12524b;

    /* renamed from: c */
    public final String f12525c;

    /* renamed from: d */
    public final int f12526d;

    /* renamed from: e */
    public final String f12527e;

    /* renamed from: f */
    public final String f12528f;

    /* renamed from: g */
    public final String f12529g;

    /* renamed from: h */
    public final CrashlyticsReport.C8260e f12530h;

    /* renamed from: i */
    public final CrashlyticsReport.C8256d f12531i;

    /* renamed from: c.q.c.n.h.l.b$b */
    /* compiled from: AutoValue_CrashlyticsReport */
    public static final class C6594b extends CrashlyticsReport.C8253b {

        /* renamed from: a */
        public String f12532a;

        /* renamed from: b */
        public String f12533b;

        /* renamed from: c */
        public Integer f12534c;

        /* renamed from: d */
        public String f12535d;

        /* renamed from: e */
        public String f12536e;

        /* renamed from: f */
        public String f12537f;

        /* renamed from: g */
        public CrashlyticsReport.C8260e f12538g;

        /* renamed from: h */
        public CrashlyticsReport.C8256d f12539h;

        /* renamed from: a */
        public CrashlyticsReport mo30946a() {
            String str = "";
            if (this.f12532a == null) {
                str = str + " sdkVersion";
            }
            if (this.f12533b == null) {
                str = str + " gmpAppId";
            }
            if (this.f12534c == null) {
                str = str + " platform";
            }
            if (this.f12535d == null) {
                str = str + " installationUuid";
            }
            if (this.f12536e == null) {
                str = str + " buildVersion";
            }
            if (this.f12537f == null) {
                str = str + " displayVersion";
            }
            if (str.isEmpty()) {
                return new C6592b(this.f12532a, this.f12533b, this.f12534c.intValue(), this.f12535d, this.f12536e, this.f12537f, this.f12538g, this.f12539h);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C8253b mo30947b(String str) {
            if (str != null) {
                this.f12536e = str;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }

        /* renamed from: c */
        public CrashlyticsReport.C8253b mo30948c(String str) {
            if (str != null) {
                this.f12537f = str;
                return this;
            }
            throw new NullPointerException("Null displayVersion");
        }

        /* renamed from: d */
        public CrashlyticsReport.C8253b mo30949d(String str) {
            if (str != null) {
                this.f12533b = str;
                return this;
            }
            throw new NullPointerException("Null gmpAppId");
        }

        /* renamed from: e */
        public CrashlyticsReport.C8253b mo30950e(String str) {
            if (str != null) {
                this.f12535d = str;
                return this;
            }
            throw new NullPointerException("Null installationUuid");
        }

        /* renamed from: f */
        public CrashlyticsReport.C8253b mo30951f(CrashlyticsReport.C8256d dVar) {
            this.f12539h = dVar;
            return this;
        }

        /* renamed from: g */
        public CrashlyticsReport.C8253b mo30952g(int i) {
            this.f12534c = Integer.valueOf(i);
            return this;
        }

        /* renamed from: h */
        public CrashlyticsReport.C8253b mo30953h(String str) {
            if (str != null) {
                this.f12532a = str;
                return this;
            }
            throw new NullPointerException("Null sdkVersion");
        }

        /* renamed from: i */
        public CrashlyticsReport.C8253b mo30954i(CrashlyticsReport.C8260e eVar) {
            this.f12538g = eVar;
            return this;
        }

        public C6594b() {
        }

        public C6594b(CrashlyticsReport crashlyticsReport) {
            this.f12532a = crashlyticsReport.mo30942i();
            this.f12533b = crashlyticsReport.mo30936e();
            this.f12534c = Integer.valueOf(crashlyticsReport.mo30940h());
            this.f12535d = crashlyticsReport.mo30938f();
            this.f12536e = crashlyticsReport.mo30934c();
            this.f12537f = crashlyticsReport.mo30935d();
            this.f12538g = crashlyticsReport.mo30943j();
            this.f12539h = crashlyticsReport.mo30939g();
        }
    }

    @NonNull
    /* renamed from: c */
    public String mo30934c() {
        return this.f12528f;
    }

    @NonNull
    /* renamed from: d */
    public String mo30935d() {
        return this.f12529g;
    }

    @NonNull
    /* renamed from: e */
    public String mo30936e() {
        return this.f12525c;
    }

    public boolean equals(Object obj) {
        CrashlyticsReport.C8260e eVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport)) {
            return false;
        }
        CrashlyticsReport crashlyticsReport = (CrashlyticsReport) obj;
        if (this.f12524b.equals(crashlyticsReport.mo30942i()) && this.f12525c.equals(crashlyticsReport.mo30936e()) && this.f12526d == crashlyticsReport.mo30940h() && this.f12527e.equals(crashlyticsReport.mo30938f()) && this.f12528f.equals(crashlyticsReport.mo30934c()) && this.f12529g.equals(crashlyticsReport.mo30935d()) && ((eVar = this.f12530h) != null ? eVar.equals(crashlyticsReport.mo30943j()) : crashlyticsReport.mo30943j() == null)) {
            CrashlyticsReport.C8256d dVar = this.f12531i;
            if (dVar == null) {
                if (crashlyticsReport.mo30939g() == null) {
                    return true;
                }
            } else if (dVar.equals(crashlyticsReport.mo30939g())) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    /* renamed from: f */
    public String mo30938f() {
        return this.f12527e;
    }

    @Nullable
    /* renamed from: g */
    public CrashlyticsReport.C8256d mo30939g() {
        return this.f12531i;
    }

    /* renamed from: h */
    public int mo30940h() {
        return this.f12526d;
    }

    public int hashCode() {
        int hashCode = (((((((((((this.f12524b.hashCode() ^ 1000003) * 1000003) ^ this.f12525c.hashCode()) * 1000003) ^ this.f12526d) * 1000003) ^ this.f12527e.hashCode()) * 1000003) ^ this.f12528f.hashCode()) * 1000003) ^ this.f12529g.hashCode()) * 1000003;
        CrashlyticsReport.C8260e eVar = this.f12530h;
        int i = 0;
        int hashCode2 = (hashCode ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        CrashlyticsReport.C8256d dVar = this.f12531i;
        if (dVar != null) {
            i = dVar.hashCode();
        }
        return hashCode2 ^ i;
    }

    @NonNull
    /* renamed from: i */
    public String mo30942i() {
        return this.f12524b;
    }

    @Nullable
    /* renamed from: j */
    public CrashlyticsReport.C8260e mo30943j() {
        return this.f12530h;
    }

    /* renamed from: k */
    public CrashlyticsReport.C8253b mo30944k() {
        return new C6594b(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f12524b + ", gmpAppId=" + this.f12525c + ", platform=" + this.f12526d + ", installationUuid=" + this.f12527e + ", buildVersion=" + this.f12528f + ", displayVersion=" + this.f12529g + ", session=" + this.f12530h + ", ndkPayload=" + this.f12531i + "}";
    }

    public C6592b(String str, String str2, int i, String str3, String str4, String str5, @Nullable CrashlyticsReport.C8260e eVar, @Nullable CrashlyticsReport.C8256d dVar) {
        this.f12524b = str;
        this.f12525c = str2;
        this.f12526d = i;
        this.f12527e = str3;
        this.f12528f = str4;
        this.f12529g = str5;
        this.f12530h = eVar;
        this.f12531i = dVar;
    }
}
