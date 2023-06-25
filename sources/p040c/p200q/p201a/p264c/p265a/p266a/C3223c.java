package p040c.p200q.p201a.p264c.p265a.p266a;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: c.q.a.c.a.a.c */
/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
public final class C3223c extends Thread {

    /* renamed from: e */
    public final WeakReference<C3220a> f6092e;

    /* renamed from: l */
    public final long f6093l;

    /* renamed from: m */
    public final CountDownLatch f6094m = new CountDownLatch(1);

    /* renamed from: n */
    public boolean f6095n = false;

    public C3223c(C3220a aVar, long j) {
        this.f6092e = new WeakReference<>(aVar);
        this.f6093l = j;
        start();
    }

    /* renamed from: a */
    public final void mo20229a() {
        C3220a aVar = (C3220a) this.f6092e.get();
        if (aVar != null) {
            aVar.mo20219c();
            this.f6095n = true;
        }
    }

    public final void run() {
        try {
            if (!this.f6094m.await(this.f6093l, TimeUnit.MILLISECONDS)) {
                mo20229a();
            }
        } catch (InterruptedException unused) {
            mo20229a();
        }
    }
}
