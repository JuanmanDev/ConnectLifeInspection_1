package p040c.p200q.p363c.p370n.p371h.p376l;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: c.q.c.n.h.l.u */
/* compiled from: AutoValue_CrashlyticsReport_Session_OperatingSystem */
public final class C6659u extends CrashlyticsReport.C8260e.C8287e {

    /* renamed from: a */
    public final int f12714a;

    /* renamed from: b */
    public final String f12715b;

    /* renamed from: c */
    public final String f12716c;

    /* renamed from: d */
    public final boolean f12717d;

    /* renamed from: c.q.c.n.h.l.u$b */
    /* compiled from: AutoValue_CrashlyticsReport_Session_OperatingSystem */
    public static final class C6661b extends CrashlyticsReport.C8260e.C8287e.C8288a {

        /* renamed from: a */
        public Integer f12718a;

        /* renamed from: b */
        public String f12719b;

        /* renamed from: c */
        public String f12720c;

        /* renamed from: d */
        public Boolean f12721d;

        /* renamed from: a */
        public CrashlyticsReport.C8260e.C8287e mo31228a() {
            String str = "";
            if (this.f12718a == null) {
                str = str + " platform";
            }
            if (this.f12719b == null) {
                str = str + " version";
            }
            if (this.f12720c == null) {
                str = str + " buildVersion";
            }
            if (this.f12721d == null) {
                str = str + " jailbroken";
            }
            if (str.isEmpty()) {
                return new C6659u(this.f12718a.intValue(), this.f12719b, this.f12720c, this.f12721d.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C8260e.C8287e.C8288a mo31229b(String str) {
            if (str != null) {
                this.f12720c = str;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }

        /* renamed from: c */
        public CrashlyticsReport.C8260e.C8287e.C8288a mo31230c(boolean z) {
            this.f12721d = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: d */
        public CrashlyticsReport.C8260e.C8287e.C8288a mo31231d(int i) {
            this.f12718a = Integer.valueOf(i);
            return this;
        }

        /* renamed from: e */
        public CrashlyticsReport.C8260e.C8287e.C8288a mo31232e(String str) {
            if (str != null) {
                this.f12719b = str;
                return this;
            }
            throw new NullPointerException("Null version");
        }
    }

    @NonNull
    /* renamed from: b */
    public String mo31221b() {
        return this.f12716c;
    }

    /* renamed from: c */
    public int mo31222c() {
        return this.f12714a;
    }

    @NonNull
    /* renamed from: d */
    public String mo31223d() {
        return this.f12715b;
    }

    /* renamed from: e */
    public boolean mo31224e() {
        return this.f12717d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.C8260e.C8287e)) {
            return false;
        }
        CrashlyticsReport.C8260e.C8287e eVar = (CrashlyticsReport.C8260e.C8287e) obj;
        if (this.f12714a != eVar.mo31222c() || !this.f12715b.equals(eVar.mo31223d()) || !this.f12716c.equals(eVar.mo31221b()) || this.f12717d != eVar.mo31224e()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((this.f12714a ^ 1000003) * 1000003) ^ this.f12715b.hashCode()) * 1000003) ^ this.f12716c.hashCode()) * 1000003) ^ (this.f12717d ? 1231 : 1237);
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.f12714a + ", version=" + this.f12715b + ", buildVersion=" + this.f12716c + ", jailbroken=" + this.f12717d + "}";
    }

    public C6659u(int i, String str, String str2, boolean z) {
        this.f12714a = i;
        this.f12715b = str;
        this.f12716c = str2;
        this.f12717d = z;
    }
}
