package p040c.p200q.p363c.p370n.p371h.p376l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: c.q.c.n.h.l.r */
/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame */
public final class C6650r extends CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8278e.C8280b {

    /* renamed from: a */
    public final long f12690a;

    /* renamed from: b */
    public final String f12691b;

    /* renamed from: c */
    public final String f12692c;

    /* renamed from: d */
    public final long f12693d;

    /* renamed from: e */
    public final int f12694e;

    /* renamed from: c.q.c.n.h.l.r$b */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame */
    public static final class C6652b extends CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8278e.C8280b.C8281a {

        /* renamed from: a */
        public Long f12695a;

        /* renamed from: b */
        public String f12696b;

        /* renamed from: c */
        public String f12697c;

        /* renamed from: d */
        public Long f12698d;

        /* renamed from: e */
        public Integer f12699e;

        /* renamed from: a */
        public CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8278e.C8280b mo31193a() {
            String str = "";
            if (this.f12695a == null) {
                str = str + " pc";
            }
            if (this.f12696b == null) {
                str = str + " symbol";
            }
            if (this.f12698d == null) {
                str = str + " offset";
            }
            if (this.f12699e == null) {
                str = str + " importance";
            }
            if (str.isEmpty()) {
                return new C6650r(this.f12695a.longValue(), this.f12696b, this.f12697c, this.f12698d.longValue(), this.f12699e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8278e.C8280b.C8281a mo31194b(String str) {
            this.f12697c = str;
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8278e.C8280b.C8281a mo31195c(int i) {
            this.f12699e = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8278e.C8280b.C8281a mo31196d(long j) {
            this.f12698d = Long.valueOf(j);
            return this;
        }

        /* renamed from: e */
        public CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8278e.C8280b.C8281a mo31197e(long j) {
            this.f12695a = Long.valueOf(j);
            return this;
        }

        /* renamed from: f */
        public CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8278e.C8280b.C8281a mo31198f(String str) {
            if (str != null) {
                this.f12696b = str;
                return this;
            }
            throw new NullPointerException("Null symbol");
        }
    }

    @Nullable
    /* renamed from: b */
    public String mo31185b() {
        return this.f12692c;
    }

    /* renamed from: c */
    public int mo31186c() {
        return this.f12694e;
    }

    /* renamed from: d */
    public long mo31187d() {
        return this.f12693d;
    }

    /* renamed from: e */
    public long mo31188e() {
        return this.f12690a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8278e.C8280b)) {
            return false;
        }
        CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8278e.C8280b bVar = (CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8278e.C8280b) obj;
        if (this.f12690a == bVar.mo31188e() && this.f12691b.equals(bVar.mo31190f()) && ((str = this.f12692c) != null ? str.equals(bVar.mo31185b()) : bVar.mo31185b() == null) && this.f12693d == bVar.mo31187d() && this.f12694e == bVar.mo31186c()) {
            return true;
        }
        return false;
    }

    @NonNull
    /* renamed from: f */
    public String mo31190f() {
        return this.f12691b;
    }

    public int hashCode() {
        long j = this.f12690a;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f12691b.hashCode()) * 1000003;
        String str = this.f12692c;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j2 = this.f12693d;
        return ((((hashCode ^ hashCode2) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f12694e;
    }

    public String toString() {
        return "Frame{pc=" + this.f12690a + ", symbol=" + this.f12691b + ", file=" + this.f12692c + ", offset=" + this.f12693d + ", importance=" + this.f12694e + "}";
    }

    public C6650r(long j, String str, @Nullable String str2, long j2, int i) {
        this.f12690a = j;
        this.f12691b = str;
        this.f12692c = str2;
        this.f12693d = j2;
        this.f12694e = i;
    }
}
