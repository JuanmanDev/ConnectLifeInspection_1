package p040c.p200q.p363c.p370n.p371h.p376l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: c.q.c.n.h.l.l */
/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application */
public final class C6632l extends CrashlyticsReport.C8260e.C8267d.C8268a {

    /* renamed from: a */
    public final CrashlyticsReport.C8260e.C8267d.C8268a.C8270b f12640a;

    /* renamed from: b */
    public final C6591a0<CrashlyticsReport.C8254c> f12641b;

    /* renamed from: c */
    public final C6591a0<CrashlyticsReport.C8254c> f12642c;

    /* renamed from: d */
    public final Boolean f12643d;

    /* renamed from: e */
    public final int f12644e;

    /* renamed from: c.q.c.n.h.l.l$b */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application */
    public static final class C6634b extends CrashlyticsReport.C8260e.C8267d.C8268a.C8269a {

        /* renamed from: a */
        public CrashlyticsReport.C8260e.C8267d.C8268a.C8270b f12645a;

        /* renamed from: b */
        public C6591a0<CrashlyticsReport.C8254c> f12646b;

        /* renamed from: c */
        public C6591a0<CrashlyticsReport.C8254c> f12647c;

        /* renamed from: d */
        public Boolean f12648d;

        /* renamed from: e */
        public Integer f12649e;

        /* renamed from: a */
        public CrashlyticsReport.C8260e.C8267d.C8268a mo31119a() {
            String str = "";
            if (this.f12645a == null) {
                str = str + " execution";
            }
            if (this.f12649e == null) {
                str = str + " uiOrientation";
            }
            if (str.isEmpty()) {
                return new C6632l(this.f12645a, this.f12646b, this.f12647c, this.f12648d, this.f12649e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C8260e.C8267d.C8268a.C8269a mo31120b(@Nullable Boolean bool) {
            this.f12648d = bool;
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.C8260e.C8267d.C8268a.C8269a mo31121c(C6591a0<CrashlyticsReport.C8254c> a0Var) {
            this.f12646b = a0Var;
            return this;
        }

        /* renamed from: d */
        public CrashlyticsReport.C8260e.C8267d.C8268a.C8269a mo31122d(CrashlyticsReport.C8260e.C8267d.C8268a.C8270b bVar) {
            if (bVar != null) {
                this.f12645a = bVar;
                return this;
            }
            throw new NullPointerException("Null execution");
        }

        /* renamed from: e */
        public CrashlyticsReport.C8260e.C8267d.C8268a.C8269a mo31123e(C6591a0<CrashlyticsReport.C8254c> a0Var) {
            this.f12647c = a0Var;
            return this;
        }

        /* renamed from: f */
        public CrashlyticsReport.C8260e.C8267d.C8268a.C8269a mo31124f(int i) {
            this.f12649e = Integer.valueOf(i);
            return this;
        }

        public C6634b() {
        }

        public C6634b(CrashlyticsReport.C8260e.C8267d.C8268a aVar) {
            this.f12645a = aVar.mo31112d();
            this.f12646b = aVar.mo31111c();
            this.f12647c = aVar.mo31113e();
            this.f12648d = aVar.mo31110b();
            this.f12649e = Integer.valueOf(aVar.mo31115f());
        }
    }

    @Nullable
    /* renamed from: b */
    public Boolean mo31110b() {
        return this.f12643d;
    }

    @Nullable
    /* renamed from: c */
    public C6591a0<CrashlyticsReport.C8254c> mo31111c() {
        return this.f12641b;
    }

    @NonNull
    /* renamed from: d */
    public CrashlyticsReport.C8260e.C8267d.C8268a.C8270b mo31112d() {
        return this.f12640a;
    }

    @Nullable
    /* renamed from: e */
    public C6591a0<CrashlyticsReport.C8254c> mo31113e() {
        return this.f12642c;
    }

    public boolean equals(Object obj) {
        C6591a0<CrashlyticsReport.C8254c> a0Var;
        C6591a0<CrashlyticsReport.C8254c> a0Var2;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.C8260e.C8267d.C8268a)) {
            return false;
        }
        CrashlyticsReport.C8260e.C8267d.C8268a aVar = (CrashlyticsReport.C8260e.C8267d.C8268a) obj;
        if (!this.f12640a.equals(aVar.mo31112d()) || ((a0Var = this.f12641b) != null ? !a0Var.equals(aVar.mo31111c()) : aVar.mo31111c() != null) || ((a0Var2 = this.f12642c) != null ? !a0Var2.equals(aVar.mo31113e()) : aVar.mo31113e() != null) || ((bool = this.f12643d) != null ? !bool.equals(aVar.mo31110b()) : aVar.mo31110b() != null) || this.f12644e != aVar.mo31115f()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public int mo31115f() {
        return this.f12644e;
    }

    /* renamed from: g */
    public CrashlyticsReport.C8260e.C8267d.C8268a.C8269a mo31116g() {
        return new C6634b(this);
    }

    public int hashCode() {
        int hashCode = (this.f12640a.hashCode() ^ 1000003) * 1000003;
        C6591a0<CrashlyticsReport.C8254c> a0Var = this.f12641b;
        int i = 0;
        int hashCode2 = (hashCode ^ (a0Var == null ? 0 : a0Var.hashCode())) * 1000003;
        C6591a0<CrashlyticsReport.C8254c> a0Var2 = this.f12642c;
        int hashCode3 = (hashCode2 ^ (a0Var2 == null ? 0 : a0Var2.hashCode())) * 1000003;
        Boolean bool = this.f12643d;
        if (bool != null) {
            i = bool.hashCode();
        }
        return ((hashCode3 ^ i) * 1000003) ^ this.f12644e;
    }

    public String toString() {
        return "Application{execution=" + this.f12640a + ", customAttributes=" + this.f12641b + ", internalKeys=" + this.f12642c + ", background=" + this.f12643d + ", uiOrientation=" + this.f12644e + "}";
    }

    public C6632l(CrashlyticsReport.C8260e.C8267d.C8268a.C8270b bVar, @Nullable C6591a0<CrashlyticsReport.C8254c> a0Var, @Nullable C6591a0<CrashlyticsReport.C8254c> a0Var2, @Nullable Boolean bool, int i) {
        this.f12640a = bVar;
        this.f12641b = a0Var;
        this.f12642c = a0Var2;
        this.f12643d = bool;
        this.f12644e = i;
    }
}
