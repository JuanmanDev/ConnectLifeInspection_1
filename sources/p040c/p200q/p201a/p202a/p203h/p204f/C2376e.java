package p040c.p200q.p201a.p202a.p203h.p204f;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.ClientInfo;

/* renamed from: c.q.a.a.h.f.e */
/* compiled from: AutoValue_ClientInfo */
public final class C2376e extends ClientInfo {

    /* renamed from: a */
    public final ClientInfo.ClientType f2674a;

    /* renamed from: b */
    public final C2363a f2675b;

    /* renamed from: c.q.a.a.h.f.e$b */
    /* compiled from: AutoValue_ClientInfo */
    public static final class C2378b extends ClientInfo.C3989a {

        /* renamed from: a */
        public ClientInfo.ClientType f2676a;

        /* renamed from: b */
        public C2363a f2677b;

        /* renamed from: a */
        public ClientInfo mo17722a() {
            return new C2376e(this.f2676a, this.f2677b);
        }

        /* renamed from: b */
        public ClientInfo.C3989a mo17723b(@Nullable C2363a aVar) {
            this.f2677b = aVar;
            return this;
        }

        /* renamed from: c */
        public ClientInfo.C3989a mo17724c(@Nullable ClientInfo.ClientType clientType) {
            this.f2676a = clientType;
            return this;
        }
    }

    @Nullable
    /* renamed from: b */
    public C2363a mo17717b() {
        return this.f2675b;
    }

    @Nullable
    /* renamed from: c */
    public ClientInfo.ClientType mo17718c() {
        return this.f2674a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientInfo)) {
            return false;
        }
        ClientInfo clientInfo = (ClientInfo) obj;
        ClientInfo.ClientType clientType = this.f2674a;
        if (clientType != null ? clientType.equals(clientInfo.mo17718c()) : clientInfo.mo17718c() == null) {
            C2363a aVar = this.f2675b;
            if (aVar == null) {
                if (clientInfo.mo17717b() == null) {
                    return true;
                }
            } else if (aVar.equals(clientInfo.mo17717b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        ClientInfo.ClientType clientType = this.f2674a;
        int i = 0;
        int hashCode = ((clientType == null ? 0 : clientType.hashCode()) ^ 1000003) * 1000003;
        C2363a aVar = this.f2675b;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f2674a + ", androidClientInfo=" + this.f2675b + "}";
    }

    public C2376e(@Nullable ClientInfo.ClientType clientType, @Nullable C2363a aVar) {
        this.f2674a = clientType;
        this.f2675b = aVar;
    }
}
