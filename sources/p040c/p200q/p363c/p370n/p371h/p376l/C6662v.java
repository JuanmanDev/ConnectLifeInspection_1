package p040c.p200q.p363c.p370n.p371h.p376l;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: c.q.c.n.h.l.v */
/* compiled from: AutoValue_CrashlyticsReport_Session_User */
public final class C6662v extends CrashlyticsReport.C8260e.C8289f {

    /* renamed from: a */
    public final String f12722a;

    /* renamed from: c.q.c.n.h.l.v$b */
    /* compiled from: AutoValue_CrashlyticsReport_Session_User */
    public static final class C6664b extends CrashlyticsReport.C8260e.C8289f.C8290a {

        /* renamed from: a */
        public String f12723a;

        /* renamed from: a */
        public CrashlyticsReport.C8260e.C8289f mo31237a() {
            String str = "";
            if (this.f12723a == null) {
                str = str + " identifier";
            }
            if (str.isEmpty()) {
                return new C6662v(this.f12723a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C8260e.C8289f.C8290a mo31238b(String str) {
            if (str != null) {
                this.f12723a = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }
    }

    @NonNull
    /* renamed from: b */
    public String mo31233b() {
        return this.f12722a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.C8260e.C8289f) {
            return this.f12722a.equals(((CrashlyticsReport.C8260e.C8289f) obj).mo31233b());
        }
        return false;
    }

    public int hashCode() {
        return this.f12722a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.f12722a + "}";
    }

    public C6662v(String str) {
        this.f12722a = str;
    }
}
