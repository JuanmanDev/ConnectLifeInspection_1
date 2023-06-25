package p040c.p200q.p363c.p370n.p371h.p376l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: c.q.c.n.h.l.e */
/* compiled from: AutoValue_CrashlyticsReport_FilesPayload */
public final class C6613e extends CrashlyticsReport.C8256d {

    /* renamed from: a */
    public final C6591a0<CrashlyticsReport.C8256d.C8258b> f12567a;

    /* renamed from: b */
    public final String f12568b;

    /* renamed from: c.q.c.n.h.l.e$b */
    /* compiled from: AutoValue_CrashlyticsReport_FilesPayload */
    public static final class C6615b extends CrashlyticsReport.C8256d.C8257a {

        /* renamed from: a */
        public C6591a0<CrashlyticsReport.C8256d.C8258b> f12569a;

        /* renamed from: b */
        public String f12570b;

        /* renamed from: a */
        public CrashlyticsReport.C8256d mo31014a() {
            String str = "";
            if (this.f12569a == null) {
                str = str + " files";
            }
            if (str.isEmpty()) {
                return new C6613e(this.f12569a, this.f12570b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C8256d.C8257a mo31015b(C6591a0<CrashlyticsReport.C8256d.C8258b> a0Var) {
            if (a0Var != null) {
                this.f12569a = a0Var;
                return this;
            }
            throw new NullPointerException("Null files");
        }

        /* renamed from: c */
        public CrashlyticsReport.C8256d.C8257a mo31016c(String str) {
            this.f12570b = str;
            return this;
        }
    }

    @NonNull
    /* renamed from: b */
    public C6591a0<CrashlyticsReport.C8256d.C8258b> mo31009b() {
        return this.f12567a;
    }

    @Nullable
    /* renamed from: c */
    public String mo31010c() {
        return this.f12568b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.C8256d)) {
            return false;
        }
        CrashlyticsReport.C8256d dVar = (CrashlyticsReport.C8256d) obj;
        if (this.f12567a.equals(dVar.mo31009b())) {
            String str = this.f12568b;
            if (str == null) {
                if (dVar.mo31010c() == null) {
                    return true;
                }
            } else if (str.equals(dVar.mo31010c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f12567a.hashCode() ^ 1000003) * 1000003;
        String str = this.f12568b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FilesPayload{files=" + this.f12567a + ", orgId=" + this.f12568b + "}";
    }

    public C6613e(C6591a0<CrashlyticsReport.C8256d.C8258b> a0Var, @Nullable String str) {
        this.f12567a = a0Var;
        this.f12568b = str;
    }
}
