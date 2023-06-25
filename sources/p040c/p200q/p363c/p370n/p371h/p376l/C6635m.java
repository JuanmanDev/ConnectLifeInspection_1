package p040c.p200q.p363c.p370n.p371h.p376l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: c.q.c.n.h.l.m */
/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution */
public final class C6635m extends CrashlyticsReport.C8260e.C8267d.C8268a.C8270b {

    /* renamed from: a */
    public final C6591a0<CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8278e> f12650a;

    /* renamed from: b */
    public final CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8274c f12651b;

    /* renamed from: c */
    public final CrashlyticsReport.C8251a f12652c;

    /* renamed from: d */
    public final CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8276d f12653d;

    /* renamed from: e */
    public final C6591a0<CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8271a> f12654e;

    /* renamed from: c.q.c.n.h.l.m$b */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution */
    public static final class C6637b extends CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8273b {

        /* renamed from: a */
        public C6591a0<CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8278e> f12655a;

        /* renamed from: b */
        public CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8274c f12656b;

        /* renamed from: c */
        public CrashlyticsReport.C8251a f12657c;

        /* renamed from: d */
        public CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8276d f12658d;

        /* renamed from: e */
        public C6591a0<CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8271a> f12659e;

        /* renamed from: a */
        public CrashlyticsReport.C8260e.C8267d.C8268a.C8270b mo31133a() {
            String str = "";
            if (this.f12658d == null) {
                str = str + " signal";
            }
            if (this.f12659e == null) {
                str = str + " binaries";
            }
            if (str.isEmpty()) {
                return new C6635m(this.f12655a, this.f12656b, this.f12657c, this.f12658d, this.f12659e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8273b mo31134b(CrashlyticsReport.C8251a aVar) {
            this.f12657c = aVar;
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8273b mo31135c(C6591a0<CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8271a> a0Var) {
            if (a0Var != null) {
                this.f12659e = a0Var;
                return this;
            }
            throw new NullPointerException("Null binaries");
        }

        /* renamed from: d */
        public CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8273b mo31136d(CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8274c cVar) {
            this.f12656b = cVar;
            return this;
        }

        /* renamed from: e */
        public CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8273b mo31137e(CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8276d dVar) {
            if (dVar != null) {
                this.f12658d = dVar;
                return this;
            }
            throw new NullPointerException("Null signal");
        }

        /* renamed from: f */
        public CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8273b mo31138f(C6591a0<CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8278e> a0Var) {
            this.f12655a = a0Var;
            return this;
        }
    }

    @Nullable
    /* renamed from: b */
    public CrashlyticsReport.C8251a mo31125b() {
        return this.f12652c;
    }

    @NonNull
    /* renamed from: c */
    public C6591a0<CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8271a> mo31126c() {
        return this.f12654e;
    }

    @Nullable
    /* renamed from: d */
    public CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8274c mo31127d() {
        return this.f12651b;
    }

    @NonNull
    /* renamed from: e */
    public CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8276d mo31128e() {
        return this.f12653d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.C8260e.C8267d.C8268a.C8270b)) {
            return false;
        }
        CrashlyticsReport.C8260e.C8267d.C8268a.C8270b bVar = (CrashlyticsReport.C8260e.C8267d.C8268a.C8270b) obj;
        C6591a0<CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8278e> a0Var = this.f12650a;
        if (a0Var != null ? a0Var.equals(bVar.mo31130f()) : bVar.mo31130f() == null) {
            CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8274c cVar = this.f12651b;
            if (cVar != null ? cVar.equals(bVar.mo31127d()) : bVar.mo31127d() == null) {
                CrashlyticsReport.C8251a aVar = this.f12652c;
                if (aVar != null ? aVar.equals(bVar.mo31125b()) : bVar.mo31125b() == null) {
                    if (this.f12653d.equals(bVar.mo31128e()) && this.f12654e.equals(bVar.mo31126c())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Nullable
    /* renamed from: f */
    public C6591a0<CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8278e> mo31130f() {
        return this.f12650a;
    }

    public int hashCode() {
        C6591a0<CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8278e> a0Var = this.f12650a;
        int i = 0;
        int hashCode = ((a0Var == null ? 0 : a0Var.hashCode()) ^ 1000003) * 1000003;
        CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8274c cVar = this.f12651b;
        int hashCode2 = (hashCode ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        CrashlyticsReport.C8251a aVar = this.f12652c;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return ((((hashCode2 ^ i) * 1000003) ^ this.f12653d.hashCode()) * 1000003) ^ this.f12654e.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.f12650a + ", exception=" + this.f12651b + ", appExitInfo=" + this.f12652c + ", signal=" + this.f12653d + ", binaries=" + this.f12654e + "}";
    }

    public C6635m(@Nullable C6591a0<CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8278e> a0Var, @Nullable CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8274c cVar, @Nullable CrashlyticsReport.C8251a aVar, CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8276d dVar, C6591a0<CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8271a> a0Var2) {
        this.f12650a = a0Var;
        this.f12651b = cVar;
        this.f12652c = aVar;
        this.f12653d = dVar;
        this.f12654e = a0Var2;
    }
}
