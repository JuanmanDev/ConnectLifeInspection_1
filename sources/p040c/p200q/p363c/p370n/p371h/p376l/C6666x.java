package p040c.p200q.p363c.p370n.p371h.p376l;

import p040c.p200q.p363c.p370n.p371h.C6476e;
import p040c.p200q.p363c.p370n.p371h.p376l.C6595b0;

/* renamed from: c.q.c.n.h.l.x */
/* compiled from: AutoValue_StaticSessionData_AppData */
public final class C6666x extends C6595b0.C6596a {

    /* renamed from: a */
    public final String f12727a;

    /* renamed from: b */
    public final String f12728b;

    /* renamed from: c */
    public final String f12729c;

    /* renamed from: d */
    public final String f12730d;

    /* renamed from: e */
    public final int f12731e;

    /* renamed from: f */
    public final C6476e f12732f;

    public C6666x(String str, String str2, String str3, String str4, int i, C6476e eVar) {
        if (str != null) {
            this.f12727a = str;
            if (str2 != null) {
                this.f12728b = str2;
                if (str3 != null) {
                    this.f12729c = str3;
                    if (str4 != null) {
                        this.f12730d = str4;
                        this.f12731e = i;
                        if (eVar != null) {
                            this.f12732f = eVar;
                            return;
                        }
                        throw new NullPointerException("Null developmentPlatformProvider");
                    }
                    throw new NullPointerException("Null installUuid");
                }
                throw new NullPointerException("Null versionName");
            }
            throw new NullPointerException("Null versionCode");
        }
        throw new NullPointerException("Null appIdentifier");
    }

    /* renamed from: a */
    public String mo30958a() {
        return this.f12727a;
    }

    /* renamed from: c */
    public int mo30959c() {
        return this.f12731e;
    }

    /* renamed from: d */
    public C6476e mo30960d() {
        return this.f12732f;
    }

    /* renamed from: e */
    public String mo30961e() {
        return this.f12730d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6595b0.C6596a)) {
            return false;
        }
        C6595b0.C6596a aVar = (C6595b0.C6596a) obj;
        if (!this.f12727a.equals(aVar.mo30958a()) || !this.f12728b.equals(aVar.mo30962f()) || !this.f12729c.equals(aVar.mo30963g()) || !this.f12730d.equals(aVar.mo30961e()) || this.f12731e != aVar.mo30959c() || !this.f12732f.equals(aVar.mo30960d())) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public String mo30962f() {
        return this.f12728b;
    }

    /* renamed from: g */
    public String mo30963g() {
        return this.f12729c;
    }

    public int hashCode() {
        return ((((((((((this.f12727a.hashCode() ^ 1000003) * 1000003) ^ this.f12728b.hashCode()) * 1000003) ^ this.f12729c.hashCode()) * 1000003) ^ this.f12730d.hashCode()) * 1000003) ^ this.f12731e) * 1000003) ^ this.f12732f.hashCode();
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.f12727a + ", versionCode=" + this.f12728b + ", versionName=" + this.f12729c + ", installUuid=" + this.f12730d + ", deliveryMechanism=" + this.f12731e + ", developmentPlatformProvider=" + this.f12732f + "}";
    }
}
