package p040c.p200q.p363c.p394v.p396q;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.installations.local.PersistedInstallation;
import p040c.p200q.p363c.p394v.p396q.C6783c;

/* renamed from: c.q.c.v.q.a */
/* compiled from: AutoValue_PersistedInstallationEntry */
public final class C6779a extends C6783c {

    /* renamed from: a */
    public final String f12950a;

    /* renamed from: b */
    public final PersistedInstallation.RegistrationStatus f12951b;

    /* renamed from: c */
    public final String f12952c;

    /* renamed from: d */
    public final String f12953d;

    /* renamed from: e */
    public final long f12954e;

    /* renamed from: f */
    public final long f12955f;

    /* renamed from: g */
    public final String f12956g;

    /* renamed from: c.q.c.v.q.a$b */
    /* compiled from: AutoValue_PersistedInstallationEntry */
    public static final class C6781b extends C6783c.C6784a {

        /* renamed from: a */
        public String f12957a;

        /* renamed from: b */
        public PersistedInstallation.RegistrationStatus f12958b;

        /* renamed from: c */
        public String f12959c;

        /* renamed from: d */
        public String f12960d;

        /* renamed from: e */
        public Long f12961e;

        /* renamed from: f */
        public Long f12962f;

        /* renamed from: g */
        public String f12963g;

        /* renamed from: a */
        public C6783c mo31497a() {
            String str = "";
            if (this.f12958b == null) {
                str = str + " registrationStatus";
            }
            if (this.f12961e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f12962f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new C6779a(this.f12957a, this.f12958b, this.f12959c, this.f12960d, this.f12961e.longValue(), this.f12962f.longValue(), this.f12963g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C6783c.C6784a mo31498b(@Nullable String str) {
            this.f12959c = str;
            return this;
        }

        /* renamed from: c */
        public C6783c.C6784a mo31499c(long j) {
            this.f12961e = Long.valueOf(j);
            return this;
        }

        /* renamed from: d */
        public C6783c.C6784a mo31500d(String str) {
            this.f12957a = str;
            return this;
        }

        /* renamed from: e */
        public C6783c.C6784a mo31501e(@Nullable String str) {
            this.f12963g = str;
            return this;
        }

        /* renamed from: f */
        public C6783c.C6784a mo31502f(@Nullable String str) {
            this.f12960d = str;
            return this;
        }

        /* renamed from: g */
        public C6783c.C6784a mo31503g(PersistedInstallation.RegistrationStatus registrationStatus) {
            if (registrationStatus != null) {
                this.f12958b = registrationStatus;
                return this;
            }
            throw new NullPointerException("Null registrationStatus");
        }

        /* renamed from: h */
        public C6783c.C6784a mo31504h(long j) {
            this.f12962f = Long.valueOf(j);
            return this;
        }

        public C6781b() {
        }

        public C6781b(C6783c cVar) {
            this.f12957a = cVar.mo31488d();
            this.f12958b = cVar.mo31492g();
            this.f12959c = cVar.mo31486b();
            this.f12960d = cVar.mo31491f();
            this.f12961e = Long.valueOf(cVar.mo31487c());
            this.f12962f = Long.valueOf(cVar.mo31493h());
            this.f12963g = cVar.mo31489e();
        }
    }

    @Nullable
    /* renamed from: b */
    public String mo31486b() {
        return this.f12952c;
    }

    /* renamed from: c */
    public long mo31487c() {
        return this.f12954e;
    }

    @Nullable
    /* renamed from: d */
    public String mo31488d() {
        return this.f12950a;
    }

    @Nullable
    /* renamed from: e */
    public String mo31489e() {
        return this.f12956g;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6783c)) {
            return false;
        }
        C6783c cVar = (C6783c) obj;
        String str3 = this.f12950a;
        if (str3 != null ? str3.equals(cVar.mo31488d()) : cVar.mo31488d() == null) {
            if (this.f12951b.equals(cVar.mo31492g()) && ((str = this.f12952c) != null ? str.equals(cVar.mo31486b()) : cVar.mo31486b() == null) && ((str2 = this.f12953d) != null ? str2.equals(cVar.mo31491f()) : cVar.mo31491f() == null) && this.f12954e == cVar.mo31487c() && this.f12955f == cVar.mo31493h()) {
                String str4 = this.f12956g;
                if (str4 == null) {
                    if (cVar.mo31489e() == null) {
                        return true;
                    }
                } else if (str4.equals(cVar.mo31489e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Nullable
    /* renamed from: f */
    public String mo31491f() {
        return this.f12953d;
    }

    @NonNull
    /* renamed from: g */
    public PersistedInstallation.RegistrationStatus mo31492g() {
        return this.f12951b;
    }

    /* renamed from: h */
    public long mo31493h() {
        return this.f12955f;
    }

    public int hashCode() {
        String str = this.f12950a;
        int i = 0;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f12951b.hashCode()) * 1000003;
        String str2 = this.f12952c;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f12953d;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        long j = this.f12954e;
        long j2 = this.f12955f;
        int i2 = (((((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.f12956g;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i2 ^ i;
    }

    /* renamed from: n */
    public C6783c.C6784a mo31495n() {
        return new C6781b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f12950a + ", registrationStatus=" + this.f12951b + ", authToken=" + this.f12952c + ", refreshToken=" + this.f12953d + ", expiresInSecs=" + this.f12954e + ", tokenCreationEpochInSecs=" + this.f12955f + ", fisError=" + this.f12956g + "}";
    }

    public C6779a(@Nullable String str, PersistedInstallation.RegistrationStatus registrationStatus, @Nullable String str2, @Nullable String str3, long j, long j2, @Nullable String str4) {
        this.f12950a = str;
        this.f12951b = registrationStatus;
        this.f12952c = str2;
        this.f12953d = str3;
        this.f12954e = j;
        this.f12955f = j2;
        this.f12956g = str4;
    }
}
