package p040c.p200q.p363c.p370n.p371h.p374j;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.File;

/* renamed from: c.q.c.n.h.j.i */
/* compiled from: AutoValue_CrashlyticsReportWithSessionId */
public final class C6508i extends C6539t {

    /* renamed from: a */
    public final CrashlyticsReport f12223a;

    /* renamed from: b */
    public final String f12224b;

    /* renamed from: c */
    public final File f12225c;

    public C6508i(CrashlyticsReport crashlyticsReport, String str, File file) {
        if (crashlyticsReport != null) {
            this.f12223a = crashlyticsReport;
            if (str != null) {
                this.f12224b = str;
                if (file != null) {
                    this.f12225c = file;
                    return;
                }
                throw new NullPointerException("Null reportFile");
            }
            throw new NullPointerException("Null sessionId");
        }
        throw new NullPointerException("Null report");
    }

    /* renamed from: b */
    public CrashlyticsReport mo30682b() {
        return this.f12223a;
    }

    /* renamed from: c */
    public File mo30683c() {
        return this.f12225c;
    }

    /* renamed from: d */
    public String mo30684d() {
        return this.f12224b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6539t)) {
            return false;
        }
        C6539t tVar = (C6539t) obj;
        if (!this.f12223a.equals(tVar.mo30682b()) || !this.f12224b.equals(tVar.mo30684d()) || !this.f12225c.equals(tVar.mo30683c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.f12223a.hashCode() ^ 1000003) * 1000003) ^ this.f12224b.hashCode()) * 1000003) ^ this.f12225c.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f12223a + ", sessionId=" + this.f12224b + ", reportFile=" + this.f12225c + "}";
    }
}
