package p040c.p077d.p078a.p081k.p084j;

import androidx.annotation.NonNull;
import java.security.MessageDigest;
import p040c.p077d.p078a.p081k.C1567c;

/* renamed from: c.d.a.k.j.d */
/* compiled from: DataCacheKey */
public final class C1641d implements C1567c {

    /* renamed from: b */
    public final C1567c f1026b;

    /* renamed from: c */
    public final C1567c f1027c;

    public C1641d(C1567c cVar, C1567c cVar2) {
        this.f1026b = cVar;
        this.f1027c = cVar2;
    }

    /* renamed from: a */
    public void mo15606a(@NonNull MessageDigest messageDigest) {
        this.f1026b.mo15606a(messageDigest);
        this.f1027c.mo15606a(messageDigest);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1641d)) {
            return false;
        }
        C1641d dVar = (C1641d) obj;
        if (!this.f1026b.equals(dVar.f1026b) || !this.f1027c.equals(dVar.f1027c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f1026b.hashCode() * 31) + this.f1027c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f1026b + ", signature=" + this.f1027c + '}';
    }
}
