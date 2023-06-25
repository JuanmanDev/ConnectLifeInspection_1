package p040c.p077d.p078a.p081k.p084j.p085a0;

import java.io.File;
import p040c.p077d.p078a.p081k.p084j.p085a0.C1609a;

/* renamed from: c.d.a.k.j.a0.d */
/* compiled from: DiskLruCacheFactory */
public class C1616d implements C1609a.C1610a {

    /* renamed from: a */
    public final long f978a;

    /* renamed from: b */
    public final C1617a f979b;

    /* renamed from: c.d.a.k.j.a0.d$a */
    /* compiled from: DiskLruCacheFactory */
    public interface C1617a {
        /* renamed from: a */
        File mo15700a();
    }

    public C1616d(C1617a aVar, long j) {
        this.f978a = j;
        this.f979b = aVar;
    }

    public C1609a build() {
        File a = this.f979b.mo15700a();
        if (a == null) {
            return null;
        }
        if (a.mkdirs() || (a.exists() && a.isDirectory())) {
            return C1618e.m1410c(a, this.f978a);
        }
        return null;
    }
}
