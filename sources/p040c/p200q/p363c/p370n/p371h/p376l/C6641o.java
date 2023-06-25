package p040c.p200q.p363c.p370n.p371h.p376l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: c.q.c.n.h.l.o */
/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception */
public final class C6641o extends CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8274c {

    /* renamed from: a */
    public final String f12668a;

    /* renamed from: b */
    public final String f12669b;

    /* renamed from: c */
    public final C6591a0<CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8278e.C8280b> f12670c;

    /* renamed from: d */
    public final CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8274c f12671d;

    /* renamed from: e */
    public final int f12672e;

    /* renamed from: c.q.c.n.h.l.o$b */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception */
    public static final class C6643b extends CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8274c.C8275a {

        /* renamed from: a */
        public String f12673a;

        /* renamed from: b */
        public String f12674b;

        /* renamed from: c */
        public C6591a0<CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8278e.C8280b> f12675c;

        /* renamed from: d */
        public CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8274c f12676d;

        /* renamed from: e */
        public Integer f12677e;

        /* renamed from: a */
        public CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8274c mo31159a() {
            String str = "";
            if (this.f12673a == null) {
                str = str + " type";
            }
            if (this.f12675c == null) {
                str = str + " frames";
            }
            if (this.f12677e == null) {
                str = str + " overflowCount";
            }
            if (str.isEmpty()) {
                return new C6641o(this.f12673a, this.f12674b, this.f12675c, this.f12676d, this.f12677e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8274c.C8275a mo31160b(CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8274c cVar) {
            this.f12676d = cVar;
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8274c.C8275a mo31161c(C6591a0<CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8278e.C8280b> a0Var) {
            if (a0Var != null) {
                this.f12675c = a0Var;
                return this;
            }
            throw new NullPointerException("Null frames");
        }

        /* renamed from: d */
        public CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8274c.C8275a mo31162d(int i) {
            this.f12677e = Integer.valueOf(i);
            return this;
        }

        /* renamed from: e */
        public CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8274c.C8275a mo31163e(String str) {
            this.f12674b = str;
            return this;
        }

        /* renamed from: f */
        public CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8274c.C8275a mo31164f(String str) {
            if (str != null) {
                this.f12673a = str;
                return this;
            }
            throw new NullPointerException("Null type");
        }
    }

    @Nullable
    /* renamed from: b */
    public CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8274c mo31151b() {
        return this.f12671d;
    }

    @NonNull
    /* renamed from: c */
    public C6591a0<CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8278e.C8280b> mo31152c() {
        return this.f12670c;
    }

    /* renamed from: d */
    public int mo31153d() {
        return this.f12672e;
    }

    @Nullable
    /* renamed from: e */
    public String mo31154e() {
        return this.f12669b;
    }

    public boolean equals(Object obj) {
        String str;
        CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8274c cVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8274c)) {
            return false;
        }
        CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8274c cVar2 = (CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8274c) obj;
        if (!this.f12668a.equals(cVar2.mo31156f()) || ((str = this.f12669b) != null ? !str.equals(cVar2.mo31154e()) : cVar2.mo31154e() != null) || !this.f12670c.equals(cVar2.mo31152c()) || ((cVar = this.f12671d) != null ? !cVar.equals(cVar2.mo31151b()) : cVar2.mo31151b() != null) || this.f12672e != cVar2.mo31153d()) {
            return false;
        }
        return true;
    }

    @NonNull
    /* renamed from: f */
    public String mo31156f() {
        return this.f12668a;
    }

    public int hashCode() {
        int hashCode = (this.f12668a.hashCode() ^ 1000003) * 1000003;
        String str = this.f12669b;
        int i = 0;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f12670c.hashCode()) * 1000003;
        CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8274c cVar = this.f12671d;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return ((hashCode2 ^ i) * 1000003) ^ this.f12672e;
    }

    public String toString() {
        return "Exception{type=" + this.f12668a + ", reason=" + this.f12669b + ", frames=" + this.f12670c + ", causedBy=" + this.f12671d + ", overflowCount=" + this.f12672e + "}";
    }

    public C6641o(String str, @Nullable String str2, C6591a0<CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8278e.C8280b> a0Var, @Nullable CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8274c cVar, int i) {
        this.f12668a = str;
        this.f12669b = str2;
        this.f12670c = a0Var;
        this.f12671d = cVar;
        this.f12672e = i;
    }
}
