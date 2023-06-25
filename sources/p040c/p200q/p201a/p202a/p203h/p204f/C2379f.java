package p040c.p200q.p201a.p202a.p203h.p204f;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import java.util.Arrays;
import p040c.p200q.p201a.p202a.p203h.p204f.C2390k;

/* renamed from: c.q.a.a.h.f.f */
/* compiled from: AutoValue_LogEvent */
public final class C2379f extends C2390k {

    /* renamed from: a */
    public final long f2678a;

    /* renamed from: b */
    public final Integer f2679b;

    /* renamed from: c */
    public final long f2680c;

    /* renamed from: d */
    public final byte[] f2681d;

    /* renamed from: e */
    public final String f2682e;

    /* renamed from: f */
    public final long f2683f;

    /* renamed from: g */
    public final NetworkConnectionInfo f2684g;

    /* renamed from: c.q.a.a.h.f.f$b */
    /* compiled from: AutoValue_LogEvent */
    public static final class C2381b extends C2390k.C2391a {

        /* renamed from: a */
        public Long f2685a;

        /* renamed from: b */
        public Integer f2686b;

        /* renamed from: c */
        public Long f2687c;

        /* renamed from: d */
        public byte[] f2688d;

        /* renamed from: e */
        public String f2689e;

        /* renamed from: f */
        public Long f2690f;

        /* renamed from: g */
        public NetworkConnectionInfo f2691g;

        /* renamed from: a */
        public C2390k mo17735a() {
            String str = "";
            if (this.f2685a == null) {
                str = str + " eventTimeMs";
            }
            if (this.f2687c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f2690f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new C2379f(this.f2685a.longValue(), this.f2686b, this.f2687c.longValue(), this.f2688d, this.f2689e, this.f2690f.longValue(), this.f2691g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C2390k.C2391a mo17736b(@Nullable Integer num) {
            this.f2686b = num;
            return this;
        }

        /* renamed from: c */
        public C2390k.C2391a mo17737c(long j) {
            this.f2685a = Long.valueOf(j);
            return this;
        }

        /* renamed from: d */
        public C2390k.C2391a mo17738d(long j) {
            this.f2687c = Long.valueOf(j);
            return this;
        }

        /* renamed from: e */
        public C2390k.C2391a mo17739e(@Nullable NetworkConnectionInfo networkConnectionInfo) {
            this.f2691g = networkConnectionInfo;
            return this;
        }

        /* renamed from: f */
        public C2390k.C2391a mo17740f(@Nullable byte[] bArr) {
            this.f2688d = bArr;
            return this;
        }

        /* renamed from: g */
        public C2390k.C2391a mo17741g(@Nullable String str) {
            this.f2689e = str;
            return this;
        }

        /* renamed from: h */
        public C2390k.C2391a mo17742h(long j) {
            this.f2690f = Long.valueOf(j);
            return this;
        }
    }

    @Nullable
    /* renamed from: b */
    public Integer mo17725b() {
        return this.f2679b;
    }

    /* renamed from: c */
    public long mo17726c() {
        return this.f2678a;
    }

    /* renamed from: d */
    public long mo17727d() {
        return this.f2680c;
    }

    @Nullable
    /* renamed from: e */
    public NetworkConnectionInfo mo17728e() {
        return this.f2684g;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2390k)) {
            return false;
        }
        C2390k kVar = (C2390k) obj;
        if (this.f2678a == kVar.mo17726c() && ((num = this.f2679b) != null ? num.equals(kVar.mo17725b()) : kVar.mo17725b() == null) && this.f2680c == kVar.mo17727d()) {
            if (Arrays.equals(this.f2681d, kVar instanceof C2379f ? ((C2379f) kVar).f2681d : kVar.mo17730f()) && ((str = this.f2682e) != null ? str.equals(kVar.mo17731g()) : kVar.mo17731g() == null) && this.f2683f == kVar.mo17732h()) {
                NetworkConnectionInfo networkConnectionInfo = this.f2684g;
                if (networkConnectionInfo == null) {
                    if (kVar.mo17728e() == null) {
                        return true;
                    }
                } else if (networkConnectionInfo.equals(kVar.mo17728e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Nullable
    /* renamed from: f */
    public byte[] mo17730f() {
        return this.f2681d;
    }

    @Nullable
    /* renamed from: g */
    public String mo17731g() {
        return this.f2682e;
    }

    /* renamed from: h */
    public long mo17732h() {
        return this.f2683f;
    }

    public int hashCode() {
        long j = this.f2678a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f2679b;
        int i2 = 0;
        int hashCode = num == null ? 0 : num.hashCode();
        long j2 = this.f2680c;
        int hashCode2 = (((((i ^ hashCode) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f2681d)) * 1000003;
        String str = this.f2682e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j3 = this.f2683f;
        int i3 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        NetworkConnectionInfo networkConnectionInfo = this.f2684g;
        if (networkConnectionInfo != null) {
            i2 = networkConnectionInfo.hashCode();
        }
        return i3 ^ i2;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f2678a + ", eventCode=" + this.f2679b + ", eventUptimeMs=" + this.f2680c + ", sourceExtension=" + Arrays.toString(this.f2681d) + ", sourceExtensionJsonProto3=" + this.f2682e + ", timezoneOffsetSeconds=" + this.f2683f + ", networkConnectionInfo=" + this.f2684g + "}";
    }

    public C2379f(long j, @Nullable Integer num, long j2, @Nullable byte[] bArr, @Nullable String str, long j3, @Nullable NetworkConnectionInfo networkConnectionInfo) {
        this.f2678a = j;
        this.f2679b = num;
        this.f2680c = j2;
        this.f2681d = bArr;
        this.f2682e = str;
        this.f2683f = j3;
        this.f2684g = networkConnectionInfo;
    }
}
