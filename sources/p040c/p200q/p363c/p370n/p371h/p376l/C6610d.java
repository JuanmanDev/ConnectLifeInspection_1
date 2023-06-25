package p040c.p200q.p363c.p370n.p371h.p376l;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: c.q.c.n.h.l.d */
/* compiled from: AutoValue_CrashlyticsReport_CustomAttribute */
public final class C6610d extends CrashlyticsReport.C8254c {

    /* renamed from: a */
    public final String f12563a;

    /* renamed from: b */
    public final String f12564b;

    /* renamed from: c.q.c.n.h.l.d$b */
    /* compiled from: AutoValue_CrashlyticsReport_CustomAttribute */
    public static final class C6612b extends CrashlyticsReport.C8254c.C8255a {

        /* renamed from: a */
        public String f12565a;

        /* renamed from: b */
        public String f12566b;

        /* renamed from: a */
        public CrashlyticsReport.C8254c mo31006a() {
            String str = "";
            if (this.f12565a == null) {
                str = str + " key";
            }
            if (this.f12566b == null) {
                str = str + " value";
            }
            if (str.isEmpty()) {
                return new C6610d(this.f12565a, this.f12566b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C8254c.C8255a mo31007b(String str) {
            if (str != null) {
                this.f12565a = str;
                return this;
            }
            throw new NullPointerException("Null key");
        }

        /* renamed from: c */
        public CrashlyticsReport.C8254c.C8255a mo31008c(String str) {
            if (str != null) {
                this.f12566b = str;
                return this;
            }
            throw new NullPointerException("Null value");
        }
    }

    @NonNull
    /* renamed from: b */
    public String mo31001b() {
        return this.f12563a;
    }

    @NonNull
    /* renamed from: c */
    public String mo31002c() {
        return this.f12564b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.C8254c)) {
            return false;
        }
        CrashlyticsReport.C8254c cVar = (CrashlyticsReport.C8254c) obj;
        if (!this.f12563a.equals(cVar.mo31001b()) || !this.f12564b.equals(cVar.mo31002c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f12563a.hashCode() ^ 1000003) * 1000003) ^ this.f12564b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.f12563a + ", value=" + this.f12564b + "}";
    }

    public C6610d(String str, String str2) {
        this.f12563a = str;
        this.f12564b = str2;
    }
}
