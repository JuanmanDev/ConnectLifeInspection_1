package p040c.p200q.p363c.p370n.p371h.p376l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: c.q.c.n.h.l.h */
/* compiled from: AutoValue_CrashlyticsReport_Session_Application */
public final class C6622h extends CrashlyticsReport.C8260e.C8261a {

    /* renamed from: a */
    public final String f12597a;

    /* renamed from: b */
    public final String f12598b;

    /* renamed from: c */
    public final String f12599c;

    /* renamed from: d */
    public final CrashlyticsReport.C8260e.C8261a.C8263b f12600d;

    /* renamed from: e */
    public final String f12601e;

    /* renamed from: f */
    public final String f12602f;

    /* renamed from: g */
    public final String f12603g;

    /* renamed from: c.q.c.n.h.l.h$b */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Application */
    public static final class C6624b extends CrashlyticsReport.C8260e.C8261a.C8262a {

        /* renamed from: a */
        public String f12604a;

        /* renamed from: b */
        public String f12605b;

        /* renamed from: c */
        public String f12606c;

        /* renamed from: d */
        public CrashlyticsReport.C8260e.C8261a.C8263b f12607d;

        /* renamed from: e */
        public String f12608e;

        /* renamed from: f */
        public String f12609f;

        /* renamed from: g */
        public String f12610g;

        /* renamed from: a */
        public CrashlyticsReport.C8260e.C8261a mo31062a() {
            String str = "";
            if (this.f12604a == null) {
                str = str + " identifier";
            }
            if (this.f12605b == null) {
                str = str + " version";
            }
            if (str.isEmpty()) {
                return new C6622h(this.f12604a, this.f12605b, this.f12606c, this.f12607d, this.f12608e, this.f12609f, this.f12610g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C8260e.C8261a.C8262a mo31063b(@Nullable String str) {
            this.f12609f = str;
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.C8260e.C8261a.C8262a mo31064c(@Nullable String str) {
            this.f12610g = str;
            return this;
        }

        /* renamed from: d */
        public CrashlyticsReport.C8260e.C8261a.C8262a mo31065d(String str) {
            this.f12606c = str;
            return this;
        }

        /* renamed from: e */
        public CrashlyticsReport.C8260e.C8261a.C8262a mo31066e(String str) {
            if (str != null) {
                this.f12604a = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        /* renamed from: f */
        public CrashlyticsReport.C8260e.C8261a.C8262a mo31067f(String str) {
            this.f12608e = str;
            return this;
        }

        /* renamed from: g */
        public CrashlyticsReport.C8260e.C8261a.C8262a mo31068g(String str) {
            if (str != null) {
                this.f12605b = str;
                return this;
            }
            throw new NullPointerException("Null version");
        }
    }

    @Nullable
    /* renamed from: b */
    public String mo31052b() {
        return this.f12602f;
    }

    @Nullable
    /* renamed from: c */
    public String mo31053c() {
        return this.f12603g;
    }

    @Nullable
    /* renamed from: d */
    public String mo31054d() {
        return this.f12599c;
    }

    @NonNull
    /* renamed from: e */
    public String mo31055e() {
        return this.f12597a;
    }

    public boolean equals(Object obj) {
        String str;
        CrashlyticsReport.C8260e.C8261a.C8263b bVar;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.C8260e.C8261a)) {
            return false;
        }
        CrashlyticsReport.C8260e.C8261a aVar = (CrashlyticsReport.C8260e.C8261a) obj;
        if (this.f12597a.equals(aVar.mo31055e()) && this.f12598b.equals(aVar.mo31059h()) && ((str = this.f12599c) != null ? str.equals(aVar.mo31054d()) : aVar.mo31054d() == null) && ((bVar = this.f12600d) != null ? bVar.equals(aVar.mo31058g()) : aVar.mo31058g() == null) && ((str2 = this.f12601e) != null ? str2.equals(aVar.mo31057f()) : aVar.mo31057f() == null) && ((str3 = this.f12602f) != null ? str3.equals(aVar.mo31052b()) : aVar.mo31052b() == null)) {
            String str4 = this.f12603g;
            if (str4 == null) {
                if (aVar.mo31053c() == null) {
                    return true;
                }
            } else if (str4.equals(aVar.mo31053c())) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    /* renamed from: f */
    public String mo31057f() {
        return this.f12601e;
    }

    @Nullable
    /* renamed from: g */
    public CrashlyticsReport.C8260e.C8261a.C8263b mo31058g() {
        return this.f12600d;
    }

    @NonNull
    /* renamed from: h */
    public String mo31059h() {
        return this.f12598b;
    }

    public int hashCode() {
        int hashCode = (((this.f12597a.hashCode() ^ 1000003) * 1000003) ^ this.f12598b.hashCode()) * 1000003;
        String str = this.f12599c;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        CrashlyticsReport.C8260e.C8261a.C8263b bVar = this.f12600d;
        int hashCode3 = (hashCode2 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        String str2 = this.f12601e;
        int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f12602f;
        int hashCode5 = (hashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f12603g;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode5 ^ i;
    }

    public String toString() {
        return "Application{identifier=" + this.f12597a + ", version=" + this.f12598b + ", displayVersion=" + this.f12599c + ", organization=" + this.f12600d + ", installationUuid=" + this.f12601e + ", developmentPlatform=" + this.f12602f + ", developmentPlatformVersion=" + this.f12603g + "}";
    }

    public C6622h(String str, String str2, @Nullable String str3, @Nullable CrashlyticsReport.C8260e.C8261a.C8263b bVar, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.f12597a = str;
        this.f12598b = str2;
        this.f12599c = str3;
        this.f12600d = bVar;
        this.f12601e = str4;
        this.f12602f = str5;
        this.f12603g = str6;
    }
}
