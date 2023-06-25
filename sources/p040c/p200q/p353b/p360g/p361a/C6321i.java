package p040c.p200q.p353b.p360g.p361a;

import java.util.concurrent.Future;

/* renamed from: c.q.b.g.a.i */
/* compiled from: Uninterruptibles */
public final class C6321i {
    /* renamed from: a */
    public static <V> V m17771a(Future<V> future) {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }
}
