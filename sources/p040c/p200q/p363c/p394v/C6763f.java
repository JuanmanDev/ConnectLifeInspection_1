package p040c.p200q.p363c.p394v;

import androidx.annotation.NonNull;
import p040c.p200q.p363c.p394v.C6773l;

/* renamed from: c.q.c.v.f */
/* compiled from: AutoValue_InstallationTokenResult */
public final class C6763f extends C6773l {

    /* renamed from: a */
    public final String f12916a;

    /* renamed from: b */
    public final long f12917b;

    /* renamed from: c */
    public final long f12918c;

    /* renamed from: c.q.c.v.f$b */
    /* compiled from: AutoValue_InstallationTokenResult */
    public static final class C6765b extends C6773l.C6774a {

        /* renamed from: a */
        public String f12919a;

        /* renamed from: b */
        public Long f12920b;

        /* renamed from: c */
        public Long f12921c;

        /* renamed from: a */
        public C6773l mo31446a() {
            String str = "";
            if (this.f12919a == null) {
                str = str + " token";
            }
            if (this.f12920b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f12921c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new C6763f(this.f12919a, this.f12920b.longValue(), this.f12921c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C6773l.C6774a mo31447b(String str) {
            if (str != null) {
                this.f12919a = str;
                return this;
            }
            throw new NullPointerException("Null token");
        }

        /* renamed from: c */
        public C6773l.C6774a mo31448c(long j) {
            this.f12921c = Long.valueOf(j);
            return this;
        }

        /* renamed from: d */
        public C6773l.C6774a mo31449d(long j) {
            this.f12920b = Long.valueOf(j);
            return this;
        }
    }

    @NonNull
    /* renamed from: b */
    public String mo31440b() {
        return this.f12916a;
    }

    @NonNull
    /* renamed from: c */
    public long mo31441c() {
        return this.f12918c;
    }

    @NonNull
    /* renamed from: d */
    public long mo31442d() {
        return this.f12917b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6773l)) {
            return false;
        }
        C6773l lVar = (C6773l) obj;
        if (this.f12916a.equals(lVar.mo31440b()) && this.f12917b == lVar.mo31442d() && this.f12918c == lVar.mo31441c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f12917b;
        long j2 = this.f12918c;
        return ((((this.f12916a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f12916a + ", tokenExpirationTimestamp=" + this.f12917b + ", tokenCreationTimestamp=" + this.f12918c + "}";
    }

    public C6763f(String str, long j, long j2) {
        this.f12916a = str;
        this.f12917b = j;
        this.f12918c = j2;
    }
}
