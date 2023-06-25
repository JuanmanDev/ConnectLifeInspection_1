package p040c.p077d.p078a.p081k.p084j.p085a0;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import p040c.p077d.p078a.p079i.C1550a;
import p040c.p077d.p078a.p081k.C1567c;
import p040c.p077d.p078a.p081k.p084j.p085a0.C1609a;

/* renamed from: c.d.a.k.j.a0.e */
/* compiled from: DiskLruCacheWrapper */
public class C1618e implements C1609a {

    /* renamed from: a */
    public final C1628j f980a;

    /* renamed from: b */
    public final File f981b;

    /* renamed from: c */
    public final long f982c;

    /* renamed from: d */
    public final C1613c f983d = new C1613c();

    /* renamed from: e */
    public C1550a f984e;

    @Deprecated
    public C1618e(File file, long j) {
        this.f981b = file;
        this.f982c = j;
        this.f980a = new C1628j();
    }

    /* renamed from: c */
    public static C1609a m1410c(File file, long j) {
        return new C1618e(file, j);
    }

    /* renamed from: a */
    public void mo15692a(C1567c cVar, C1609a.C1611b bVar) {
        C1550a.C1553c o;
        String b = this.f980a.mo15720b(cVar);
        this.f983d.mo15696a(b);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                "Put: Obtained: " + b + " for for Key: " + cVar;
            }
            try {
                C1550a d = mo15701d();
                if (d.mo15533r(b) == null) {
                    o = d.mo15531o(b);
                    if (o != null) {
                        if (bVar.mo15695a(o.mo15545f(0))) {
                            o.mo15544e();
                        }
                        o.mo15543b();
                        this.f983d.mo15697b(b);
                        return;
                    }
                    throw new IllegalStateException("Had two simultaneous puts for: " + b);
                }
            } catch (IOException unused) {
                boolean isLoggable = Log.isLoggable("DiskLruCacheWrapper", 5);
            } catch (Throwable th) {
                o.mo15543b();
                throw th;
            }
        } finally {
            this.f983d.mo15697b(b);
        }
    }

    /* renamed from: b */
    public File mo15693b(C1567c cVar) {
        String b = this.f980a.mo15720b(cVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            "Get: Obtained: " + b + " for for Key: " + cVar;
        }
        try {
            C1550a.C1555e r = mo15701d().mo15533r(b);
            if (r != null) {
                return r.mo15551a(0);
            }
            return null;
        } catch (IOException unused) {
            boolean isLoggable = Log.isLoggable("DiskLruCacheWrapper", 5);
            return null;
        }
    }

    /* renamed from: d */
    public final synchronized C1550a mo15701d() {
        if (this.f984e == null) {
            this.f984e = C1550a.m1178u(this.f981b, 1, 1, this.f982c);
        }
        return this.f984e;
    }
}
