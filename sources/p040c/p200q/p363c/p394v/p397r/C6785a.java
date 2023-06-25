package p040c.p200q.p363c.p394v.p397r;

import androidx.annotation.Nullable;
import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.TokenResult;

/* renamed from: c.q.c.v.r.a */
/* compiled from: AutoValue_InstallationResponse */
public final class C6785a extends InstallationResponse {

    /* renamed from: a */
    public final String f12967a;

    /* renamed from: b */
    public final String f12968b;

    /* renamed from: c */
    public final String f12969c;

    /* renamed from: d */
    public final TokenResult f12970d;

    /* renamed from: e */
    public final InstallationResponse.ResponseCode f12971e;

    /* renamed from: c.q.c.v.r.a$b */
    /* compiled from: AutoValue_InstallationResponse */
    public static final class C6787b extends InstallationResponse.C8291a {

        /* renamed from: a */
        public String f12972a;

        /* renamed from: b */
        public String f12973b;

        /* renamed from: c */
        public String f12974c;

        /* renamed from: d */
        public TokenResult f12975d;

        /* renamed from: e */
        public InstallationResponse.ResponseCode f12976e;

        /* renamed from: a */
        public InstallationResponse mo31531a() {
            return new C6785a(this.f12972a, this.f12973b, this.f12974c, this.f12975d, this.f12976e);
        }

        /* renamed from: b */
        public InstallationResponse.C8291a mo31532b(TokenResult tokenResult) {
            this.f12975d = tokenResult;
            return this;
        }

        /* renamed from: c */
        public InstallationResponse.C8291a mo31533c(String str) {
            this.f12973b = str;
            return this;
        }

        /* renamed from: d */
        public InstallationResponse.C8291a mo31534d(String str) {
            this.f12974c = str;
            return this;
        }

        /* renamed from: e */
        public InstallationResponse.C8291a mo31535e(InstallationResponse.ResponseCode responseCode) {
            this.f12976e = responseCode;
            return this;
        }

        /* renamed from: f */
        public InstallationResponse.C8291a mo31536f(String str) {
            this.f12972a = str;
            return this;
        }
    }

    @Nullable
    /* renamed from: b */
    public TokenResult mo31523b() {
        return this.f12970d;
    }

    @Nullable
    /* renamed from: c */
    public String mo31524c() {
        return this.f12968b;
    }

    @Nullable
    /* renamed from: d */
    public String mo31525d() {
        return this.f12969c;
    }

    @Nullable
    /* renamed from: e */
    public InstallationResponse.ResponseCode mo31526e() {
        return this.f12971e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstallationResponse)) {
            return false;
        }
        InstallationResponse installationResponse = (InstallationResponse) obj;
        String str = this.f12967a;
        if (str != null ? str.equals(installationResponse.mo31528f()) : installationResponse.mo31528f() == null) {
            String str2 = this.f12968b;
            if (str2 != null ? str2.equals(installationResponse.mo31524c()) : installationResponse.mo31524c() == null) {
                String str3 = this.f12969c;
                if (str3 != null ? str3.equals(installationResponse.mo31525d()) : installationResponse.mo31525d() == null) {
                    TokenResult tokenResult = this.f12970d;
                    if (tokenResult != null ? tokenResult.equals(installationResponse.mo31523b()) : installationResponse.mo31523b() == null) {
                        InstallationResponse.ResponseCode responseCode = this.f12971e;
                        if (responseCode == null) {
                            if (installationResponse.mo31526e() == null) {
                                return true;
                            }
                        } else if (responseCode.equals(installationResponse.mo31526e())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Nullable
    /* renamed from: f */
    public String mo31528f() {
        return this.f12967a;
    }

    public int hashCode() {
        String str = this.f12967a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f12968b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f12969c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        TokenResult tokenResult = this.f12970d;
        int hashCode4 = (hashCode3 ^ (tokenResult == null ? 0 : tokenResult.hashCode())) * 1000003;
        InstallationResponse.ResponseCode responseCode = this.f12971e;
        if (responseCode != null) {
            i = responseCode.hashCode();
        }
        return hashCode4 ^ i;
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f12967a + ", fid=" + this.f12968b + ", refreshToken=" + this.f12969c + ", authToken=" + this.f12970d + ", responseCode=" + this.f12971e + "}";
    }

    public C6785a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable TokenResult tokenResult, @Nullable InstallationResponse.ResponseCode responseCode) {
        this.f12967a = str;
        this.f12968b = str2;
        this.f12969c = str3;
        this.f12970d = tokenResult;
        this.f12971e = responseCode;
    }
}
