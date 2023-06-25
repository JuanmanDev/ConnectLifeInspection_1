package p040c.p200q.p363c.p370n.p371h.p376l;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: c.q.c.n.h.l.t */
/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Log */
public final class C6656t extends CrashlyticsReport.C8260e.C8267d.C8285d {

    /* renamed from: a */
    public final String f12712a;

    /* renamed from: c.q.c.n.h.l.t$b */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Log */
    public static final class C6658b extends CrashlyticsReport.C8260e.C8267d.C8285d.C8286a {

        /* renamed from: a */
        public String f12713a;

        /* renamed from: a */
        public CrashlyticsReport.C8260e.C8267d.C8285d mo31219a() {
            String str = "";
            if (this.f12713a == null) {
                str = str + " content";
            }
            if (str.isEmpty()) {
                return new C6656t(this.f12713a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C8260e.C8267d.C8285d.C8286a mo31220b(String str) {
            if (str != null) {
                this.f12713a = str;
                return this;
            }
            throw new NullPointerException("Null content");
        }
    }

    @NonNull
    /* renamed from: b */
    public String mo31215b() {
        return this.f12712a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.C8260e.C8267d.C8285d) {
            return this.f12712a.equals(((CrashlyticsReport.C8260e.C8267d.C8285d) obj).mo31215b());
        }
        return false;
    }

    public int hashCode() {
        return this.f12712a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.f12712a + "}";
    }

    public C6656t(String str) {
        this.f12712a = str;
    }
}
