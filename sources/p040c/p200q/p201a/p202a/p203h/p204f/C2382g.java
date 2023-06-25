package p040c.p200q.p201a.p202a.p203h.p204f;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.QosTier;
import java.util.List;
import p040c.p200q.p201a.p202a.p203h.p204f.C2392l;

/* renamed from: c.q.a.a.h.f.g */
/* compiled from: AutoValue_LogRequest */
public final class C2382g extends C2392l {

    /* renamed from: a */
    public final long f2692a;

    /* renamed from: b */
    public final long f2693b;

    /* renamed from: c */
    public final ClientInfo f2694c;

    /* renamed from: d */
    public final Integer f2695d;

    /* renamed from: e */
    public final String f2696e;

    /* renamed from: f */
    public final List<C2390k> f2697f;

    /* renamed from: g */
    public final QosTier f2698g;

    /* renamed from: c.q.a.a.h.f.g$b */
    /* compiled from: AutoValue_LogRequest */
    public static final class C2384b extends C2392l.C2393a {

        /* renamed from: a */
        public Long f2699a;

        /* renamed from: b */
        public Long f2700b;

        /* renamed from: c */
        public ClientInfo f2701c;

        /* renamed from: d */
        public Integer f2702d;

        /* renamed from: e */
        public String f2703e;

        /* renamed from: f */
        public List<C2390k> f2704f;

        /* renamed from: g */
        public QosTier f2705g;

        /* renamed from: a */
        public C2392l mo17753a() {
            String str = "";
            if (this.f2699a == null) {
                str = str + " requestTimeMs";
            }
            if (this.f2700b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new C2382g(this.f2699a.longValue(), this.f2700b.longValue(), this.f2701c, this.f2702d, this.f2703e, this.f2704f, this.f2705g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C2392l.C2393a mo17754b(@Nullable ClientInfo clientInfo) {
            this.f2701c = clientInfo;
            return this;
        }

        /* renamed from: c */
        public C2392l.C2393a mo17755c(@Nullable List<C2390k> list) {
            this.f2704f = list;
            return this;
        }

        /* renamed from: d */
        public C2392l.C2393a mo17756d(@Nullable Integer num) {
            this.f2702d = num;
            return this;
        }

        /* renamed from: e */
        public C2392l.C2393a mo17757e(@Nullable String str) {
            this.f2703e = str;
            return this;
        }

        /* renamed from: f */
        public C2392l.C2393a mo17758f(@Nullable QosTier qosTier) {
            this.f2705g = qosTier;
            return this;
        }

        /* renamed from: g */
        public C2392l.C2393a mo17759g(long j) {
            this.f2699a = Long.valueOf(j);
            return this;
        }

        /* renamed from: h */
        public C2392l.C2393a mo17760h(long j) {
            this.f2700b = Long.valueOf(j);
            return this;
        }
    }

    @Nullable
    /* renamed from: b */
    public ClientInfo mo17743b() {
        return this.f2694c;
    }

    @Nullable
    /* renamed from: c */
    public List<C2390k> mo17744c() {
        return this.f2697f;
    }

    @Nullable
    /* renamed from: d */
    public Integer mo17745d() {
        return this.f2695d;
    }

    @Nullable
    /* renamed from: e */
    public String mo17746e() {
        return this.f2696e;
    }

    public boolean equals(Object obj) {
        ClientInfo clientInfo;
        Integer num;
        String str;
        List<C2390k> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2392l)) {
            return false;
        }
        C2392l lVar = (C2392l) obj;
        if (this.f2692a == lVar.mo17749g() && this.f2693b == lVar.mo17750h() && ((clientInfo = this.f2694c) != null ? clientInfo.equals(lVar.mo17743b()) : lVar.mo17743b() == null) && ((num = this.f2695d) != null ? num.equals(lVar.mo17745d()) : lVar.mo17745d() == null) && ((str = this.f2696e) != null ? str.equals(lVar.mo17746e()) : lVar.mo17746e() == null) && ((list = this.f2697f) != null ? list.equals(lVar.mo17744c()) : lVar.mo17744c() == null)) {
            QosTier qosTier = this.f2698g;
            if (qosTier == null) {
                if (lVar.mo17748f() == null) {
                    return true;
                }
            } else if (qosTier.equals(lVar.mo17748f())) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    /* renamed from: f */
    public QosTier mo17748f() {
        return this.f2698g;
    }

    /* renamed from: g */
    public long mo17749g() {
        return this.f2692a;
    }

    /* renamed from: h */
    public long mo17750h() {
        return this.f2693b;
    }

    public int hashCode() {
        long j = this.f2692a;
        long j2 = this.f2693b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        ClientInfo clientInfo = this.f2694c;
        int i2 = 0;
        int hashCode = (i ^ (clientInfo == null ? 0 : clientInfo.hashCode())) * 1000003;
        Integer num = this.f2695d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f2696e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<C2390k> list = this.f2697f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        QosTier qosTier = this.f2698g;
        if (qosTier != null) {
            i2 = qosTier.hashCode();
        }
        return hashCode4 ^ i2;
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f2692a + ", requestUptimeMs=" + this.f2693b + ", clientInfo=" + this.f2694c + ", logSource=" + this.f2695d + ", logSourceName=" + this.f2696e + ", logEvents=" + this.f2697f + ", qosTier=" + this.f2698g + "}";
    }

    public C2382g(long j, long j2, @Nullable ClientInfo clientInfo, @Nullable Integer num, @Nullable String str, @Nullable List<C2390k> list, @Nullable QosTier qosTier) {
        this.f2692a = j;
        this.f2693b = j2;
        this.f2694c = clientInfo;
        this.f2695d = num;
        this.f2696e = str;
        this.f2697f = list;
        this.f2698g = qosTier;
    }
}
