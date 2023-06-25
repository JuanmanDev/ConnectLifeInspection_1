package p553f.p594c.p595n.p596a;

import java.util.concurrent.Callable;
import p553f.p594c.C9194k;
import p553f.p594c.p599p.C9211a;
import p553f.p594c.p601r.C9218f;

/* renamed from: f.c.n.a.a */
/* compiled from: RxAndroidPlugins */
public final class C9199a {

    /* renamed from: a */
    public static volatile C9218f<Callable<C9194k>, C9194k> f17989a;

    /* renamed from: b */
    public static volatile C9218f<C9194k, C9194k> f17990b;

    /* renamed from: a */
    public static <T, R> R m24948a(C9218f<T, R> fVar, T t) {
        try {
            return fVar.apply(t);
        } catch (Throwable th) {
            C9211a.m24970a(th);
            throw null;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [f.c.r.f<java.util.concurrent.Callable<f.c.k>, f.c.k>, f.c.r.f] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p553f.p594c.C9194k m24949b(p553f.p594c.p601r.C9218f<java.util.concurrent.Callable<p553f.p594c.C9194k>, p553f.p594c.C9194k> r0, java.util.concurrent.Callable<p553f.p594c.C9194k> r1) {
        /*
            java.lang.Object r0 = m24948a(r0, r1)
            f.c.k r0 = (p553f.p594c.C9194k) r0
            if (r0 == 0) goto L_0x0009
            return r0
        L_0x0009:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Scheduler Callable returned null"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p553f.p594c.p595n.p596a.C9199a.m24949b(f.c.r.f, java.util.concurrent.Callable):f.c.k");
    }

    /* renamed from: c */
    public static C9194k m24950c(Callable<C9194k> callable) {
        try {
            C9194k call = callable.call();
            if (call != null) {
                return call;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            C9211a.m24970a(th);
            throw null;
        }
    }

    /* renamed from: d */
    public static C9194k m24951d(Callable<C9194k> callable) {
        if (callable != null) {
            C9218f<Callable<C9194k>, C9194k> fVar = f17989a;
            if (fVar == null) {
                return m24950c(callable);
            }
            return m24949b(fVar, callable);
        }
        throw new NullPointerException("scheduler == null");
    }

    /* renamed from: e */
    public static C9194k m24952e(C9194k kVar) {
        if (kVar != null) {
            C9218f fVar = f17990b;
            if (fVar == null) {
                return kVar;
            }
            return (C9194k) m24948a(fVar, kVar);
        }
        throw new NullPointerException("scheduler == null");
    }
}
