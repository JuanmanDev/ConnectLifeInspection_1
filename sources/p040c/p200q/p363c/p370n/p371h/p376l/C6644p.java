package p040c.p200q.p363c.p370n.p371h.p376l;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: c.q.c.n.h.l.p */
/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal */
public final class C6644p extends CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8276d {

    /* renamed from: a */
    public final String f12678a;

    /* renamed from: b */
    public final String f12679b;

    /* renamed from: c */
    public final long f12680c;

    /* renamed from: c.q.c.n.h.l.p$b */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal */
    public static final class C6646b extends CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8276d.C8277a {

        /* renamed from: a */
        public String f12681a;

        /* renamed from: b */
        public String f12682b;

        /* renamed from: c */
        public Long f12683c;

        /* renamed from: a */
        public CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8276d mo31171a() {
            String str = "";
            if (this.f12681a == null) {
                str = str + " name";
            }
            if (this.f12682b == null) {
                str = str + " code";
            }
            if (this.f12683c == null) {
                str = str + " address";
            }
            if (str.isEmpty()) {
                return new C6644p(this.f12681a, this.f12682b, this.f12683c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8276d.C8277a mo31172b(long j) {
            this.f12683c = Long.valueOf(j);
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8276d.C8277a mo31173c(String str) {
            if (str != null) {
                this.f12682b = str;
                return this;
            }
            throw new NullPointerException("Null code");
        }

        /* renamed from: d */
        public CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8276d.C8277a mo31174d(String str) {
            if (str != null) {
                this.f12681a = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }
    }

    @NonNull
    /* renamed from: b */
    public long mo31165b() {
        return this.f12680c;
    }

    @NonNull
    /* renamed from: c */
    public String mo31166c() {
        return this.f12679b;
    }

    @NonNull
    /* renamed from: d */
    public String mo31167d() {
        return this.f12678a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8276d)) {
            return false;
        }
        CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8276d dVar = (CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8276d) obj;
        if (!this.f12678a.equals(dVar.mo31167d()) || !this.f12679b.equals(dVar.mo31166c()) || this.f12680c != dVar.mo31165b()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.f12680c;
        return ((((this.f12678a.hashCode() ^ 1000003) * 1000003) ^ this.f12679b.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.f12678a + ", code=" + this.f12679b + ", address=" + this.f12680c + "}";
    }

    public C6644p(String str, String str2, long j) {
        this.f12678a = str;
        this.f12679b = str2;
        this.f12680c = j;
    }
}
