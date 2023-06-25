package p040c.p200q.p363c.p370n.p371h.p376l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: c.q.c.n.h.l.k */
/* compiled from: AutoValue_CrashlyticsReport_Session_Event */
public final class C6629k extends CrashlyticsReport.C8260e.C8267d {

    /* renamed from: a */
    public final long f12630a;

    /* renamed from: b */
    public final String f12631b;

    /* renamed from: c */
    public final CrashlyticsReport.C8260e.C8267d.C8268a f12632c;

    /* renamed from: d */
    public final CrashlyticsReport.C8260e.C8267d.C8283c f12633d;

    /* renamed from: e */
    public final CrashlyticsReport.C8260e.C8267d.C8285d f12634e;

    /* renamed from: c.q.c.n.h.l.k$b */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event */
    public static final class C6631b extends CrashlyticsReport.C8260e.C8267d.C8282b {

        /* renamed from: a */
        public Long f12635a;

        /* renamed from: b */
        public String f12636b;

        /* renamed from: c */
        public CrashlyticsReport.C8260e.C8267d.C8268a f12637c;

        /* renamed from: d */
        public CrashlyticsReport.C8260e.C8267d.C8283c f12638d;

        /* renamed from: e */
        public CrashlyticsReport.C8260e.C8267d.C8285d f12639e;

        /* renamed from: a */
        public CrashlyticsReport.C8260e.C8267d mo31104a() {
            String str = "";
            if (this.f12635a == null) {
                str = str + " timestamp";
            }
            if (this.f12636b == null) {
                str = str + " type";
            }
            if (this.f12637c == null) {
                str = str + " app";
            }
            if (this.f12638d == null) {
                str = str + " device";
            }
            if (str.isEmpty()) {
                return new C6629k(this.f12635a.longValue(), this.f12636b, this.f12637c, this.f12638d, this.f12639e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C8260e.C8267d.C8282b mo31105b(CrashlyticsReport.C8260e.C8267d.C8268a aVar) {
            if (aVar != null) {
                this.f12637c = aVar;
                return this;
            }
            throw new NullPointerException("Null app");
        }

        /* renamed from: c */
        public CrashlyticsReport.C8260e.C8267d.C8282b mo31106c(CrashlyticsReport.C8260e.C8267d.C8283c cVar) {
            if (cVar != null) {
                this.f12638d = cVar;
                return this;
            }
            throw new NullPointerException("Null device");
        }

        /* renamed from: d */
        public CrashlyticsReport.C8260e.C8267d.C8282b mo31107d(CrashlyticsReport.C8260e.C8267d.C8285d dVar) {
            this.f12639e = dVar;
            return this;
        }

        /* renamed from: e */
        public CrashlyticsReport.C8260e.C8267d.C8282b mo31108e(long j) {
            this.f12635a = Long.valueOf(j);
            return this;
        }

        /* renamed from: f */
        public CrashlyticsReport.C8260e.C8267d.C8282b mo31109f(String str) {
            if (str != null) {
                this.f12636b = str;
                return this;
            }
            throw new NullPointerException("Null type");
        }

        public C6631b() {
        }

        public C6631b(CrashlyticsReport.C8260e.C8267d dVar) {
            this.f12635a = Long.valueOf(dVar.mo31098e());
            this.f12636b = dVar.mo31100f();
            this.f12637c = dVar.mo31095b();
            this.f12638d = dVar.mo31096c();
            this.f12639e = dVar.mo31097d();
        }
    }

    @NonNull
    /* renamed from: b */
    public CrashlyticsReport.C8260e.C8267d.C8268a mo31095b() {
        return this.f12632c;
    }

    @NonNull
    /* renamed from: c */
    public CrashlyticsReport.C8260e.C8267d.C8283c mo31096c() {
        return this.f12633d;
    }

    @Nullable
    /* renamed from: d */
    public CrashlyticsReport.C8260e.C8267d.C8285d mo31097d() {
        return this.f12634e;
    }

    /* renamed from: e */
    public long mo31098e() {
        return this.f12630a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.C8260e.C8267d)) {
            return false;
        }
        CrashlyticsReport.C8260e.C8267d dVar = (CrashlyticsReport.C8260e.C8267d) obj;
        if (this.f12630a == dVar.mo31098e() && this.f12631b.equals(dVar.mo31100f()) && this.f12632c.equals(dVar.mo31095b()) && this.f12633d.equals(dVar.mo31096c())) {
            CrashlyticsReport.C8260e.C8267d.C8285d dVar2 = this.f12634e;
            if (dVar2 == null) {
                if (dVar.mo31097d() == null) {
                    return true;
                }
            } else if (dVar2.equals(dVar.mo31097d())) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    /* renamed from: f */
    public String mo31100f() {
        return this.f12631b;
    }

    /* renamed from: g */
    public CrashlyticsReport.C8260e.C8267d.C8282b mo31101g() {
        return new C6631b(this);
    }

    public int hashCode() {
        long j = this.f12630a;
        int hashCode = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f12631b.hashCode()) * 1000003) ^ this.f12632c.hashCode()) * 1000003) ^ this.f12633d.hashCode()) * 1000003;
        CrashlyticsReport.C8260e.C8267d.C8285d dVar = this.f12634e;
        return hashCode ^ (dVar == null ? 0 : dVar.hashCode());
    }

    public String toString() {
        return "Event{timestamp=" + this.f12630a + ", type=" + this.f12631b + ", app=" + this.f12632c + ", device=" + this.f12633d + ", log=" + this.f12634e + "}";
    }

    public C6629k(long j, String str, CrashlyticsReport.C8260e.C8267d.C8268a aVar, CrashlyticsReport.C8260e.C8267d.C8283c cVar, @Nullable CrashlyticsReport.C8260e.C8267d.C8285d dVar) {
        this.f12630a = j;
        this.f12631b = str;
        this.f12632c = aVar;
        this.f12633d = cVar;
        this.f12634e = dVar;
    }
}
