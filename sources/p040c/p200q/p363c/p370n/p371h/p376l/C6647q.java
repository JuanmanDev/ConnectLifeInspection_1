package p040c.p200q.p363c.p370n.p371h.p376l;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: c.q.c.n.h.l.q */
/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread */
public final class C6647q extends CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8278e {

    /* renamed from: a */
    public final String f12684a;

    /* renamed from: b */
    public final int f12685b;

    /* renamed from: c */
    public final C6591a0<CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8278e.C8280b> f12686c;

    /* renamed from: c.q.c.n.h.l.q$b */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread */
    public static final class C6649b extends CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8278e.C8279a {

        /* renamed from: a */
        public String f12687a;

        /* renamed from: b */
        public Integer f12688b;

        /* renamed from: c */
        public C6591a0<CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8278e.C8280b> f12689c;

        /* renamed from: a */
        public CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8278e mo31181a() {
            String str = "";
            if (this.f12687a == null) {
                str = str + " name";
            }
            if (this.f12688b == null) {
                str = str + " importance";
            }
            if (this.f12689c == null) {
                str = str + " frames";
            }
            if (str.isEmpty()) {
                return new C6647q(this.f12687a, this.f12688b.intValue(), this.f12689c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8278e.C8279a mo31182b(C6591a0<CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8278e.C8280b> a0Var) {
            if (a0Var != null) {
                this.f12689c = a0Var;
                return this;
            }
            throw new NullPointerException("Null frames");
        }

        /* renamed from: c */
        public CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8278e.C8279a mo31183c(int i) {
            this.f12688b = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8278e.C8279a mo31184d(String str) {
            if (str != null) {
                this.f12687a = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }
    }

    @NonNull
    /* renamed from: b */
    public C6591a0<CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8278e.C8280b> mo31175b() {
        return this.f12686c;
    }

    /* renamed from: c */
    public int mo31176c() {
        return this.f12685b;
    }

    @NonNull
    /* renamed from: d */
    public String mo31177d() {
        return this.f12684a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8278e)) {
            return false;
        }
        CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8278e eVar = (CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8278e) obj;
        if (!this.f12684a.equals(eVar.mo31177d()) || this.f12685b != eVar.mo31176c() || !this.f12686c.equals(eVar.mo31175b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.f12684a.hashCode() ^ 1000003) * 1000003) ^ this.f12685b) * 1000003) ^ this.f12686c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.f12684a + ", importance=" + this.f12685b + ", frames=" + this.f12686c + "}";
    }

    public C6647q(String str, int i, C6591a0<CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8278e.C8280b> a0Var) {
        this.f12684a = str;
        this.f12685b = i;
        this.f12686c = a0Var;
    }
}
