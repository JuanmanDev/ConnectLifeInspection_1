package p040c.p200q.p353b.p360g.p361a;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import p040c.p200q.p353b.p354a.C5841i;
import p040c.p200q.p353b.p354a.C5850m;

/* renamed from: c.q.b.g.a.c */
/* compiled from: Futures */
public final class C6313c extends C6315d {

    /* renamed from: c.q.b.g.a.c$a */
    /* compiled from: Futures */
    public static final class C6314a<V> implements Runnable {

        /* renamed from: e */
        public final Future<V> f11952e;

        /* renamed from: l */
        public final C6312b<? super V> f11953l;

        public C6314a(Future<V> future, C6312b<? super V> bVar) {
            this.f11952e = future;
            this.f11953l = bVar;
        }

        public void run() {
            try {
                this.f11953l.onSuccess(C6313c.m17761b(this.f11952e));
            } catch (ExecutionException e) {
                this.f11953l.onFailure(e.getCause());
            } catch (Error | RuntimeException e2) {
                this.f11953l.onFailure(e2);
            }
        }

        public String toString() {
            C5841i.C5843b b = C5841i.m16567b(this);
            b.mo28960h(this.f11953l);
            return b.toString();
        }
    }

    /* renamed from: a */
    public static <V> void m17760a(C6316e<V> eVar, C6312b<? super V> bVar, Executor executor) {
        C5850m.m16594o(bVar);
        eVar.addListener(new C6314a(eVar, bVar), executor);
    }

    /* renamed from: b */
    public static <V> V m17761b(Future<V> future) {
        C5850m.m16603x(future.isDone(), "Future was expected to be done: %s", future);
        return C6321i.m17771a(future);
    }
}
