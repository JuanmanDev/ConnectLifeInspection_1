package p040c.p200q.p363c.p370n.p371h.p376l;

import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: c.q.c.n.h.l.s */
/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Device */
public final class C6653s extends CrashlyticsReport.C8260e.C8267d.C8283c {

    /* renamed from: a */
    public final Double f12700a;

    /* renamed from: b */
    public final int f12701b;

    /* renamed from: c */
    public final boolean f12702c;

    /* renamed from: d */
    public final int f12703d;

    /* renamed from: e */
    public final long f12704e;

    /* renamed from: f */
    public final long f12705f;

    /* renamed from: c.q.c.n.h.l.s$b */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Device */
    public static final class C6655b extends CrashlyticsReport.C8260e.C8267d.C8283c.C8284a {

        /* renamed from: a */
        public Double f12706a;

        /* renamed from: b */
        public Integer f12707b;

        /* renamed from: c */
        public Boolean f12708c;

        /* renamed from: d */
        public Integer f12709d;

        /* renamed from: e */
        public Long f12710e;

        /* renamed from: f */
        public Long f12711f;

        /* renamed from: a */
        public CrashlyticsReport.C8260e.C8267d.C8283c mo31208a() {
            String str = "";
            if (this.f12707b == null) {
                str = str + " batteryVelocity";
            }
            if (this.f12708c == null) {
                str = str + " proximityOn";
            }
            if (this.f12709d == null) {
                str = str + " orientation";
            }
            if (this.f12710e == null) {
                str = str + " ramUsed";
            }
            if (this.f12711f == null) {
                str = str + " diskUsed";
            }
            if (str.isEmpty()) {
                return new C6653s(this.f12706a, this.f12707b.intValue(), this.f12708c.booleanValue(), this.f12709d.intValue(), this.f12710e.longValue(), this.f12711f.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C8260e.C8267d.C8283c.C8284a mo31209b(Double d) {
            this.f12706a = d;
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.C8260e.C8267d.C8283c.C8284a mo31210c(int i) {
            this.f12707b = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public CrashlyticsReport.C8260e.C8267d.C8283c.C8284a mo31211d(long j) {
            this.f12711f = Long.valueOf(j);
            return this;
        }

        /* renamed from: e */
        public CrashlyticsReport.C8260e.C8267d.C8283c.C8284a mo31212e(int i) {
            this.f12709d = Integer.valueOf(i);
            return this;
        }

        /* renamed from: f */
        public CrashlyticsReport.C8260e.C8267d.C8283c.C8284a mo31213f(boolean z) {
            this.f12708c = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: g */
        public CrashlyticsReport.C8260e.C8267d.C8283c.C8284a mo31214g(long j) {
            this.f12710e = Long.valueOf(j);
            return this;
        }
    }

    @Nullable
    /* renamed from: b */
    public Double mo31199b() {
        return this.f12700a;
    }

    /* renamed from: c */
    public int mo31200c() {
        return this.f12701b;
    }

    /* renamed from: d */
    public long mo31201d() {
        return this.f12705f;
    }

    /* renamed from: e */
    public int mo31202e() {
        return this.f12703d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.C8260e.C8267d.C8283c)) {
            return false;
        }
        CrashlyticsReport.C8260e.C8267d.C8283c cVar = (CrashlyticsReport.C8260e.C8267d.C8283c) obj;
        Double d = this.f12700a;
        if (d != null ? d.equals(cVar.mo31199b()) : cVar.mo31199b() == null) {
            if (this.f12701b == cVar.mo31200c() && this.f12702c == cVar.mo31205g() && this.f12703d == cVar.mo31202e() && this.f12704e == cVar.mo31204f() && this.f12705f == cVar.mo31201d()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public long mo31204f() {
        return this.f12704e;
    }

    /* renamed from: g */
    public boolean mo31205g() {
        return this.f12702c;
    }

    public int hashCode() {
        Double d = this.f12700a;
        int hashCode = ((((d == null ? 0 : d.hashCode()) ^ 1000003) * 1000003) ^ this.f12701b) * 1000003;
        int i = this.f12702c ? 1231 : 1237;
        long j = this.f12704e;
        long j2 = this.f12705f;
        return ((((((hashCode ^ i) * 1000003) ^ this.f12703d) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "Device{batteryLevel=" + this.f12700a + ", batteryVelocity=" + this.f12701b + ", proximityOn=" + this.f12702c + ", orientation=" + this.f12703d + ", ramUsed=" + this.f12704e + ", diskUsed=" + this.f12705f + "}";
    }

    public C6653s(@Nullable Double d, int i, boolean z, int i2, long j, long j2) {
        this.f12700a = d;
        this.f12701b = i;
        this.f12702c = z;
        this.f12703d = i2;
        this.f12704e = j;
        this.f12705f = j2;
    }
}
