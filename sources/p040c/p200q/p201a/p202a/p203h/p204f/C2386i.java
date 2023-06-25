package p040c.p200q.p201a.p202a.p203h.p204f;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;

/* renamed from: c.q.a.a.h.f.i */
/* compiled from: AutoValue_NetworkConnectionInfo */
public final class C2386i extends NetworkConnectionInfo {

    /* renamed from: a */
    public final NetworkConnectionInfo.NetworkType f2707a;

    /* renamed from: b */
    public final NetworkConnectionInfo.MobileSubtype f2708b;

    /* renamed from: c.q.a.a.h.f.i$b */
    /* compiled from: AutoValue_NetworkConnectionInfo */
    public static final class C2388b extends NetworkConnectionInfo.C3990a {

        /* renamed from: a */
        public NetworkConnectionInfo.NetworkType f2709a;

        /* renamed from: b */
        public NetworkConnectionInfo.MobileSubtype f2710b;

        /* renamed from: a */
        public NetworkConnectionInfo mo17770a() {
            return new C2386i(this.f2709a, this.f2710b);
        }

        /* renamed from: b */
        public NetworkConnectionInfo.C3990a mo17771b(@Nullable NetworkConnectionInfo.MobileSubtype mobileSubtype) {
            this.f2710b = mobileSubtype;
            return this;
        }

        /* renamed from: c */
        public NetworkConnectionInfo.C3990a mo17772c(@Nullable NetworkConnectionInfo.NetworkType networkType) {
            this.f2709a = networkType;
            return this;
        }
    }

    @Nullable
    /* renamed from: b */
    public NetworkConnectionInfo.MobileSubtype mo17765b() {
        return this.f2708b;
    }

    @Nullable
    /* renamed from: c */
    public NetworkConnectionInfo.NetworkType mo17766c() {
        return this.f2707a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NetworkConnectionInfo)) {
            return false;
        }
        NetworkConnectionInfo networkConnectionInfo = (NetworkConnectionInfo) obj;
        NetworkConnectionInfo.NetworkType networkType = this.f2707a;
        if (networkType != null ? networkType.equals(networkConnectionInfo.mo17766c()) : networkConnectionInfo.mo17766c() == null) {
            NetworkConnectionInfo.MobileSubtype mobileSubtype = this.f2708b;
            if (mobileSubtype == null) {
                if (networkConnectionInfo.mo17765b() == null) {
                    return true;
                }
            } else if (mobileSubtype.equals(networkConnectionInfo.mo17765b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        NetworkConnectionInfo.NetworkType networkType = this.f2707a;
        int i = 0;
        int hashCode = ((networkType == null ? 0 : networkType.hashCode()) ^ 1000003) * 1000003;
        NetworkConnectionInfo.MobileSubtype mobileSubtype = this.f2708b;
        if (mobileSubtype != null) {
            i = mobileSubtype.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f2707a + ", mobileSubtype=" + this.f2708b + "}";
    }

    public C2386i(@Nullable NetworkConnectionInfo.NetworkType networkType, @Nullable NetworkConnectionInfo.MobileSubtype mobileSubtype) {
        this.f2707a = networkType;
        this.f2708b = mobileSubtype;
    }
}
