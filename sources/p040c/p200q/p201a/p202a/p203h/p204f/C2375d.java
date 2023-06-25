package p040c.p200q.p201a.p202a.p203h.p204f;

import androidx.annotation.NonNull;
import java.util.List;

/* renamed from: c.q.a.a.h.f.d */
/* compiled from: AutoValue_BatchedLogRequest */
public final class C2375d extends C2389j {

    /* renamed from: a */
    public final List<C2392l> f2673a;

    public C2375d(List<C2392l> list) {
        if (list != null) {
            this.f2673a = list;
            return;
        }
        throw new NullPointerException("Null logRequests");
    }

    @NonNull
    /* renamed from: c */
    public List<C2392l> mo17713c() {
        return this.f2673a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2389j) {
            return this.f2673a.equals(((C2389j) obj).mo17713c());
        }
        return false;
    }

    public int hashCode() {
        return this.f2673a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f2673a + "}";
    }
}
