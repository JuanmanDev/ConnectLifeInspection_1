package p040c.p200q.p363c.p370n.p371h.p376l;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: c.q.c.n.h.l.i */
/* compiled from: AutoValue_CrashlyticsReport_Session_Application_Organization */
public final class C6625i extends CrashlyticsReport.C8260e.C8261a.C8263b {

    /* renamed from: a */
    public final String f12611a;

    @NonNull
    /* renamed from: a */
    public String mo31069a() {
        return this.f12611a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.C8260e.C8261a.C8263b) {
            return this.f12611a.equals(((CrashlyticsReport.C8260e.C8261a.C8263b) obj).mo31069a());
        }
        return false;
    }

    public int hashCode() {
        return this.f12611a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Organization{clsId=" + this.f12611a + "}";
    }
}
