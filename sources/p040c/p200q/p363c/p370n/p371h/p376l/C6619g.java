package p040c.p200q.p363c.p370n.p371h.p376l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: c.q.c.n.h.l.g */
/* compiled from: AutoValue_CrashlyticsReport_Session */
public final class C6619g extends CrashlyticsReport.C8260e {

    /* renamed from: a */
    public final String f12575a;

    /* renamed from: b */
    public final String f12576b;

    /* renamed from: c */
    public final long f12577c;

    /* renamed from: d */
    public final Long f12578d;

    /* renamed from: e */
    public final boolean f12579e;

    /* renamed from: f */
    public final CrashlyticsReport.C8260e.C8261a f12580f;

    /* renamed from: g */
    public final CrashlyticsReport.C8260e.C8289f f12581g;

    /* renamed from: h */
    public final CrashlyticsReport.C8260e.C8287e f12582h;

    /* renamed from: i */
    public final CrashlyticsReport.C8260e.C8265c f12583i;

    /* renamed from: j */
    public final C6591a0<CrashlyticsReport.C8260e.C8267d> f12584j;

    /* renamed from: k */
    public final int f12585k;

    /* renamed from: c.q.c.n.h.l.g$b */
    /* compiled from: AutoValue_CrashlyticsReport_Session */
    public static final class C6621b extends CrashlyticsReport.C8260e.C8264b {

        /* renamed from: a */
        public String f12586a;

        /* renamed from: b */
        public String f12587b;

        /* renamed from: c */
        public Long f12588c;

        /* renamed from: d */
        public Long f12589d;

        /* renamed from: e */
        public Boolean f12590e;

        /* renamed from: f */
        public CrashlyticsReport.C8260e.C8261a f12591f;

        /* renamed from: g */
        public CrashlyticsReport.C8260e.C8289f f12592g;

        /* renamed from: h */
        public CrashlyticsReport.C8260e.C8287e f12593h;

        /* renamed from: i */
        public CrashlyticsReport.C8260e.C8265c f12594i;

        /* renamed from: j */
        public C6591a0<CrashlyticsReport.C8260e.C8267d> f12595j;

        /* renamed from: k */
        public Integer f12596k;

        /* renamed from: a */
        public CrashlyticsReport.C8260e mo31040a() {
            String str = "";
            if (this.f12586a == null) {
                str = str + " generator";
            }
            if (this.f12587b == null) {
                str = str + " identifier";
            }
            if (this.f12588c == null) {
                str = str + " startedAt";
            }
            if (this.f12590e == null) {
                str = str + " crashed";
            }
            if (this.f12591f == null) {
                str = str + " app";
            }
            if (this.f12596k == null) {
                str = str + " generatorType";
            }
            if (str.isEmpty()) {
                return new C6619g(this.f12586a, this.f12587b, this.f12588c.longValue(), this.f12589d, this.f12590e.booleanValue(), this.f12591f, this.f12592g, this.f12593h, this.f12594i, this.f12595j, this.f12596k.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C8260e.C8264b mo31041b(CrashlyticsReport.C8260e.C8261a aVar) {
            if (aVar != null) {
                this.f12591f = aVar;
                return this;
            }
            throw new NullPointerException("Null app");
        }

        /* renamed from: c */
        public CrashlyticsReport.C8260e.C8264b mo31042c(boolean z) {
            this.f12590e = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: d */
        public CrashlyticsReport.C8260e.C8264b mo31043d(CrashlyticsReport.C8260e.C8265c cVar) {
            this.f12594i = cVar;
            return this;
        }

        /* renamed from: e */
        public CrashlyticsReport.C8260e.C8264b mo31044e(Long l) {
            this.f12589d = l;
            return this;
        }

        /* renamed from: f */
        public CrashlyticsReport.C8260e.C8264b mo31045f(C6591a0<CrashlyticsReport.C8260e.C8267d> a0Var) {
            this.f12595j = a0Var;
            return this;
        }

        /* renamed from: g */
        public CrashlyticsReport.C8260e.C8264b mo31046g(String str) {
            if (str != null) {
                this.f12586a = str;
                return this;
            }
            throw new NullPointerException("Null generator");
        }

        /* renamed from: h */
        public CrashlyticsReport.C8260e.C8264b mo31047h(int i) {
            this.f12596k = Integer.valueOf(i);
            return this;
        }

        /* renamed from: i */
        public CrashlyticsReport.C8260e.C8264b mo31048i(String str) {
            if (str != null) {
                this.f12587b = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        /* renamed from: k */
        public CrashlyticsReport.C8260e.C8264b mo31049k(CrashlyticsReport.C8260e.C8287e eVar) {
            this.f12593h = eVar;
            return this;
        }

        /* renamed from: l */
        public CrashlyticsReport.C8260e.C8264b mo31050l(long j) {
            this.f12588c = Long.valueOf(j);
            return this;
        }

        /* renamed from: m */
        public CrashlyticsReport.C8260e.C8264b mo31051m(CrashlyticsReport.C8260e.C8289f fVar) {
            this.f12592g = fVar;
            return this;
        }

        public C6621b() {
        }

        public C6621b(CrashlyticsReport.C8260e eVar) {
            this.f12586a = eVar.mo31030f();
            this.f12587b = eVar.mo31032h();
            this.f12588c = Long.valueOf(eVar.mo31035k());
            this.f12589d = eVar.mo31027d();
            this.f12590e = Boolean.valueOf(eVar.mo31037m());
            this.f12591f = eVar.mo31025b();
            this.f12592g = eVar.mo31036l();
            this.f12593h = eVar.mo31034j();
            this.f12594i = eVar.mo31026c();
            this.f12595j = eVar.mo31028e();
            this.f12596k = Integer.valueOf(eVar.mo31031g());
        }
    }

    @NonNull
    /* renamed from: b */
    public CrashlyticsReport.C8260e.C8261a mo31025b() {
        return this.f12580f;
    }

    @Nullable
    /* renamed from: c */
    public CrashlyticsReport.C8260e.C8265c mo31026c() {
        return this.f12583i;
    }

    @Nullable
    /* renamed from: d */
    public Long mo31027d() {
        return this.f12578d;
    }

    @Nullable
    /* renamed from: e */
    public C6591a0<CrashlyticsReport.C8260e.C8267d> mo31028e() {
        return this.f12584j;
    }

    public boolean equals(Object obj) {
        Long l;
        CrashlyticsReport.C8260e.C8289f fVar;
        CrashlyticsReport.C8260e.C8287e eVar;
        CrashlyticsReport.C8260e.C8265c cVar;
        C6591a0<CrashlyticsReport.C8260e.C8267d> a0Var;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.C8260e)) {
            return false;
        }
        CrashlyticsReport.C8260e eVar2 = (CrashlyticsReport.C8260e) obj;
        if (!this.f12575a.equals(eVar2.mo31030f()) || !this.f12576b.equals(eVar2.mo31032h()) || this.f12577c != eVar2.mo31035k() || ((l = this.f12578d) != null ? !l.equals(eVar2.mo31027d()) : eVar2.mo31027d() != null) || this.f12579e != eVar2.mo31037m() || !this.f12580f.equals(eVar2.mo31025b()) || ((fVar = this.f12581g) != null ? !fVar.equals(eVar2.mo31036l()) : eVar2.mo31036l() != null) || ((eVar = this.f12582h) != null ? !eVar.equals(eVar2.mo31034j()) : eVar2.mo31034j() != null) || ((cVar = this.f12583i) != null ? !cVar.equals(eVar2.mo31026c()) : eVar2.mo31026c() != null) || ((a0Var = this.f12584j) != null ? !a0Var.equals(eVar2.mo31028e()) : eVar2.mo31028e() != null) || this.f12585k != eVar2.mo31031g()) {
            return false;
        }
        return true;
    }

    @NonNull
    /* renamed from: f */
    public String mo31030f() {
        return this.f12575a;
    }

    /* renamed from: g */
    public int mo31031g() {
        return this.f12585k;
    }

    @NonNull
    /* renamed from: h */
    public String mo31032h() {
        return this.f12576b;
    }

    public int hashCode() {
        long j = this.f12577c;
        int hashCode = (((((this.f12575a.hashCode() ^ 1000003) * 1000003) ^ this.f12576b.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Long l = this.f12578d;
        int i = 0;
        int hashCode2 = (((((hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.f12579e ? 1231 : 1237)) * 1000003) ^ this.f12580f.hashCode()) * 1000003;
        CrashlyticsReport.C8260e.C8289f fVar = this.f12581g;
        int hashCode3 = (hashCode2 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        CrashlyticsReport.C8260e.C8287e eVar = this.f12582h;
        int hashCode4 = (hashCode3 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        CrashlyticsReport.C8260e.C8265c cVar = this.f12583i;
        int hashCode5 = (hashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        C6591a0<CrashlyticsReport.C8260e.C8267d> a0Var = this.f12584j;
        if (a0Var != null) {
            i = a0Var.hashCode();
        }
        return ((hashCode5 ^ i) * 1000003) ^ this.f12585k;
    }

    @Nullable
    /* renamed from: j */
    public CrashlyticsReport.C8260e.C8287e mo31034j() {
        return this.f12582h;
    }

    /* renamed from: k */
    public long mo31035k() {
        return this.f12577c;
    }

    @Nullable
    /* renamed from: l */
    public CrashlyticsReport.C8260e.C8289f mo31036l() {
        return this.f12581g;
    }

    /* renamed from: m */
    public boolean mo31037m() {
        return this.f12579e;
    }

    /* renamed from: n */
    public CrashlyticsReport.C8260e.C8264b mo31038n() {
        return new C6621b(this);
    }

    public String toString() {
        return "Session{generator=" + this.f12575a + ", identifier=" + this.f12576b + ", startedAt=" + this.f12577c + ", endedAt=" + this.f12578d + ", crashed=" + this.f12579e + ", app=" + this.f12580f + ", user=" + this.f12581g + ", os=" + this.f12582h + ", device=" + this.f12583i + ", events=" + this.f12584j + ", generatorType=" + this.f12585k + "}";
    }

    public C6619g(String str, String str2, long j, @Nullable Long l, boolean z, CrashlyticsReport.C8260e.C8261a aVar, @Nullable CrashlyticsReport.C8260e.C8289f fVar, @Nullable CrashlyticsReport.C8260e.C8287e eVar, @Nullable CrashlyticsReport.C8260e.C8265c cVar, @Nullable C6591a0<CrashlyticsReport.C8260e.C8267d> a0Var, int i) {
        this.f12575a = str;
        this.f12576b = str2;
        this.f12577c = j;
        this.f12578d = l;
        this.f12579e = z;
        this.f12580f = aVar;
        this.f12581g = fVar;
        this.f12582h = eVar;
        this.f12583i = cVar;
        this.f12584j = a0Var;
        this.f12585k = i;
    }
}
