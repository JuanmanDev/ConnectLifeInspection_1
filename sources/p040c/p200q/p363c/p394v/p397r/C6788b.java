package p040c.p200q.p363c.p394v.p397r;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.installations.remote.TokenResult;

/* renamed from: c.q.c.v.r.b */
/* compiled from: AutoValue_TokenResult */
public final class C6788b extends TokenResult {

    /* renamed from: a */
    public final String f12977a;

    /* renamed from: b */
    public final long f12978b;

    /* renamed from: c */
    public final TokenResult.ResponseCode f12979c;

    /* renamed from: c.q.c.v.r.b$b */
    /* compiled from: AutoValue_TokenResult */
    public static final class C6790b extends TokenResult.C8292a {

        /* renamed from: a */
        public String f12980a;

        /* renamed from: b */
        public Long f12981b;

        /* renamed from: c */
        public TokenResult.ResponseCode f12982c;

        /* renamed from: a */
        public TokenResult mo31543a() {
            String str = "";
            if (this.f12981b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new C6788b(this.f12980a, this.f12981b.longValue(), this.f12982c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public TokenResult.C8292a mo31544b(TokenResult.ResponseCode responseCode) {
            this.f12982c = responseCode;
            return this;
        }

        /* renamed from: c */
        public TokenResult.C8292a mo31545c(String str) {
            this.f12980a = str;
            return this;
        }

        /* renamed from: d */
        public TokenResult.C8292a mo31546d(long j) {
            this.f12981b = Long.valueOf(j);
            return this;
        }
    }

    @Nullable
    /* renamed from: b */
    public TokenResult.ResponseCode mo31537b() {
        return this.f12979c;
    }

    @Nullable
    /* renamed from: c */
    public String mo31538c() {
        return this.f12977a;
    }

    @NonNull
    /* renamed from: d */
    public long mo31539d() {
        return this.f12978b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TokenResult)) {
            return false;
        }
        TokenResult tokenResult = (TokenResult) obj;
        String str = this.f12977a;
        if (str != null ? str.equals(tokenResult.mo31538c()) : tokenResult.mo31538c() == null) {
            if (this.f12978b == tokenResult.mo31539d()) {
                TokenResult.ResponseCode responseCode = this.f12979c;
                if (responseCode == null) {
                    if (tokenResult.mo31537b() == null) {
                        return true;
                    }
                } else if (responseCode.equals(tokenResult.mo31537b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f12977a;
        int i = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f12978b;
        int i2 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        TokenResult.ResponseCode responseCode = this.f12979c;
        if (responseCode != null) {
            i = responseCode.hashCode();
        }
        return i2 ^ i;
    }

    public String toString() {
        return "TokenResult{token=" + this.f12977a + ", tokenExpirationTimestamp=" + this.f12978b + ", responseCode=" + this.f12979c + "}";
    }

    public C6788b(@Nullable String str, long j, @Nullable TokenResult.ResponseCode responseCode) {
        this.f12977a = str;
        this.f12978b = j;
        this.f12979c = responseCode;
    }
}
