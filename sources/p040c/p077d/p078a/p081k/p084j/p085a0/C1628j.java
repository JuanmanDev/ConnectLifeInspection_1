package p040c.p077d.p078a.p081k.p084j.p085a0;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p040c.p077d.p078a.p081k.C1567c;
import p040c.p077d.p078a.p105q.C1946f;
import p040c.p077d.p078a.p105q.C1949i;
import p040c.p077d.p078a.p105q.C1950j;
import p040c.p077d.p078a.p105q.p106k.C1952a;
import p040c.p077d.p078a.p105q.p106k.C1961c;

/* renamed from: c.d.a.k.j.a0.j */
/* compiled from: SafeKeyGenerator */
public class C1628j {

    /* renamed from: a */
    public final C1946f<C1567c, String> f1002a = new C1946f<>(1000);

    /* renamed from: b */
    public final Pools.Pool<C1630b> f1003b = C1952a.m2588d(10, new C1629a(this));

    /* renamed from: c.d.a.k.j.a0.j$a */
    /* compiled from: SafeKeyGenerator */
    public class C1629a implements C1952a.C1956d<C1630b> {
        public C1629a(C1628j jVar) {
        }

        /* renamed from: a */
        public C1630b create() {
            try {
                return new C1630b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: c.d.a.k.j.a0.j$b */
    /* compiled from: SafeKeyGenerator */
    public static final class C1630b implements C1952a.C1958f {

        /* renamed from: e */
        public final MessageDigest f1004e;

        /* renamed from: l */
        public final C1961c f1005l = C1961c.m2601a();

        public C1630b(MessageDigest messageDigest) {
            this.f1004e = messageDigest;
        }

        @NonNull
        /* renamed from: i */
        public C1961c mo15723i() {
            return this.f1005l;
        }
    }

    /* renamed from: a */
    public final String mo15719a(C1567c cVar) {
        C1630b acquire = this.f1003b.acquire();
        C1949i.m2563d(acquire);
        C1630b bVar = acquire;
        try {
            cVar.mo15606a(bVar.f1004e);
            return C1950j.m2584t(bVar.f1004e.digest());
        } finally {
            this.f1003b.release(bVar);
        }
    }

    /* renamed from: b */
    public String mo15720b(C1567c cVar) {
        String g;
        synchronized (this.f1002a) {
            g = this.f1002a.mo16434g(cVar);
        }
        if (g == null) {
            g = mo15719a(cVar);
        }
        synchronized (this.f1002a) {
            this.f1002a.mo16436k(cVar, g);
        }
        return g;
    }
}
