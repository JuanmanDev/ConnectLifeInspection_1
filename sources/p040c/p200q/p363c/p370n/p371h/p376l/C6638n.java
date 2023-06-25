package p040c.p200q.p363c.p370n.p371h.p376l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: c.q.c.n.h.l.n */
/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage */
public final class C6638n extends CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8271a {

    /* renamed from: a */
    public final long f12660a;

    /* renamed from: b */
    public final long f12661b;

    /* renamed from: c */
    public final String f12662c;

    /* renamed from: d */
    public final String f12663d;

    /* renamed from: c.q.c.n.h.l.n$b */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage */
    public static final class C6640b extends CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8271a.C8272a {

        /* renamed from: a */
        public Long f12664a;

        /* renamed from: b */
        public Long f12665b;

        /* renamed from: c */
        public String f12666c;

        /* renamed from: d */
        public String f12667d;

        /* renamed from: a */
        public CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8271a mo31146a() {
            String str = "";
            if (this.f12664a == null) {
                str = str + " baseAddress";
            }
            if (this.f12665b == null) {
                str = str + " size";
            }
            if (this.f12666c == null) {
                str = str + " name";
            }
            if (str.isEmpty()) {
                return new C6638n(this.f12664a.longValue(), this.f12665b.longValue(), this.f12666c, this.f12667d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8271a.C8272a mo31147b(long j) {
            this.f12664a = Long.valueOf(j);
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8271a.C8272a mo31148c(String str) {
            if (str != null) {
                this.f12666c = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }

        /* renamed from: d */
        public CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8271a.C8272a mo31149d(long j) {
            this.f12665b = Long.valueOf(j);
            return this;
        }

        /* renamed from: e */
        public CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8271a.C8272a mo31150e(@Nullable String str) {
            this.f12667d = str;
            return this;
        }
    }

    @NonNull
    /* renamed from: b */
    public long mo31139b() {
        return this.f12660a;
    }

    @NonNull
    /* renamed from: c */
    public String mo31140c() {
        return this.f12662c;
    }

    /* renamed from: d */
    public long mo31141d() {
        return this.f12661b;
    }

    @Nullable
    /* renamed from: e */
    public String mo31142e() {
        return this.f12663d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8271a)) {
            return false;
        }
        CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8271a aVar = (CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8271a) obj;
        if (this.f12660a == aVar.mo31139b() && this.f12661b == aVar.mo31141d() && this.f12662c.equals(aVar.mo31140c())) {
            String str = this.f12663d;
            if (str == null) {
                if (aVar.mo31142e() == null) {
                    return true;
                }
            } else if (str.equals(aVar.mo31142e())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.f12660a;
        long j2 = this.f12661b;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f12662c.hashCode()) * 1000003;
        String str = this.f12663d;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.f12660a + ", size=" + this.f12661b + ", name=" + this.f12662c + ", uuid=" + this.f12663d + "}";
    }

    public C6638n(long j, long j2, String str, @Nullable String str2) {
        this.f12660a = j;
        this.f12661b = j2;
        this.f12662c = str;
        this.f12663d = str2;
    }
}
