package p553f.p594c.p617v;

import java.util.concurrent.Callable;
import p553f.p594c.C9183a;
import p553f.p594c.C9185c;
import p553f.p594c.C9187e;
import p553f.p594c.C9188f;
import p553f.p594c.C9190h;
import p553f.p594c.C9193j;
import p553f.p594c.C9194k;
import p553f.p594c.C9197l;
import p553f.p594c.p601r.C9215c;
import p553f.p594c.p601r.C9217e;
import p553f.p594c.p601r.C9218f;
import p553f.p594c.p602s.p604b.C9227b;
import p553f.p594c.p602s.p614i.C9315c;
import p630io.reactivex.exceptions.CompositeException;
import p630io.reactivex.exceptions.MissingBackpressureException;
import p630io.reactivex.exceptions.OnErrorNotImplementedException;
import p630io.reactivex.exceptions.UndeliverableException;
import p648m.p683f.C9802b;

/* renamed from: f.c.v.a */
/* compiled from: RxJavaPlugins */
public final class C9323a {

    /* renamed from: a */
    public static volatile C9217e<? super Throwable> f18273a;

    /* renamed from: b */
    public static volatile C9218f<? super Runnable, ? extends Runnable> f18274b;

    /* renamed from: c */
    public static volatile C9218f<? super Callable<C9194k>, ? extends C9194k> f18275c;

    /* renamed from: d */
    public static volatile C9218f<? super Callable<C9194k>, ? extends C9194k> f18276d;

    /* renamed from: e */
    public static volatile C9218f<? super Callable<C9194k>, ? extends C9194k> f18277e;

    /* renamed from: f */
    public static volatile C9218f<? super Callable<C9194k>, ? extends C9194k> f18278f;

    /* renamed from: g */
    public static volatile C9218f<? super C9194k, ? extends C9194k> f18279g;

    /* renamed from: h */
    public static volatile C9218f<? super C9194k, ? extends C9194k> f18280h;

    /* renamed from: i */
    public static volatile C9218f<? super C9185c, ? extends C9185c> f18281i;

    /* renamed from: j */
    public static volatile C9218f<? super C9190h, ? extends C9190h> f18282j;

    /* renamed from: k */
    public static volatile C9218f<? super C9187e, ? extends C9187e> f18283k;

    /* renamed from: l */
    public static volatile C9218f<? super C9197l, ? extends C9197l> f18284l;

    /* renamed from: m */
    public static volatile C9218f<? super C9183a, ? extends C9183a> f18285m;

    /* renamed from: n */
    public static volatile C9215c<? super C9185c, ? super C9802b, ? extends C9802b> f18286n;

    /* renamed from: o */
    public static volatile C9215c<? super C9187e, ? super C9188f, ? extends C9188f> f18287o;

    /* renamed from: p */
    public static volatile C9215c<? super C9190h, ? super C9193j, ? extends C9193j> f18288p;

    /* renamed from: a */
    public static <T, U, R> R m25154a(C9215c<T, U, R> cVar, T t, U u) {
        try {
            return cVar.apply(t, u);
        } catch (Throwable th) {
            throw C9315c.m25141d(th);
        }
    }

    /* renamed from: b */
    public static <T, R> R m25155b(C9218f<T, R> fVar, T t) {
        try {
            return fVar.apply(t);
        } catch (Throwable th) {
            throw C9315c.m25141d(th);
        }
    }

    /* renamed from: c */
    public static C9194k m25156c(C9218f<? super Callable<C9194k>, ? extends C9194k> fVar, Callable<C9194k> callable) {
        Object b = m25155b(fVar, callable);
        C9227b.m24985d(b, "Scheduler Callable result can't be null");
        return (C9194k) b;
    }

    /* renamed from: d */
    public static C9194k m25157d(Callable<C9194k> callable) {
        try {
            C9194k call = callable.call();
            C9227b.m24985d(call, "Scheduler Callable result can't be null");
            return call;
        } catch (Throwable th) {
            throw C9315c.m25141d(th);
        }
    }

    /* renamed from: e */
    public static C9194k m25158e(Callable<C9194k> callable) {
        C9227b.m24985d(callable, "Scheduler Callable can't be null");
        C9218f<? super Callable<C9194k>, ? extends C9194k> fVar = f18275c;
        if (fVar == null) {
            return m25157d(callable);
        }
        return m25156c(fVar, callable);
    }

    /* renamed from: f */
    public static C9194k m25159f(Callable<C9194k> callable) {
        C9227b.m24985d(callable, "Scheduler Callable can't be null");
        C9218f<? super Callable<C9194k>, ? extends C9194k> fVar = f18277e;
        if (fVar == null) {
            return m25157d(callable);
        }
        return m25156c(fVar, callable);
    }

    /* renamed from: g */
    public static C9194k m25160g(Callable<C9194k> callable) {
        C9227b.m24985d(callable, "Scheduler Callable can't be null");
        C9218f<? super Callable<C9194k>, ? extends C9194k> fVar = f18278f;
        if (fVar == null) {
            return m25157d(callable);
        }
        return m25156c(fVar, callable);
    }

    /* renamed from: h */
    public static C9194k m25161h(Callable<C9194k> callable) {
        C9227b.m24985d(callable, "Scheduler Callable can't be null");
        C9218f<? super Callable<C9194k>, ? extends C9194k> fVar = f18276d;
        if (fVar == null) {
            return m25157d(callable);
        }
        return m25156c(fVar, callable);
    }

    /* renamed from: i */
    public static boolean m25162i(Throwable th) {
        if (!(th instanceof OnErrorNotImplementedException) && !(th instanceof MissingBackpressureException) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof CompositeException)) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public static C9183a m25163j(C9183a aVar) {
        C9218f<? super C9183a, ? extends C9183a> fVar = f18285m;
        return fVar != null ? (C9183a) m25155b(fVar, aVar) : aVar;
    }

    /* renamed from: k */
    public static <T> C9185c<T> m25164k(C9185c<T> cVar) {
        C9218f<? super C9185c, ? extends C9185c> fVar = f18281i;
        return fVar != null ? (C9185c) m25155b(fVar, cVar) : cVar;
    }

    /* renamed from: l */
    public static <T> C9187e<T> m25165l(C9187e<T> eVar) {
        C9218f<? super C9187e, ? extends C9187e> fVar = f18283k;
        return fVar != null ? (C9187e) m25155b(fVar, eVar) : eVar;
    }

    /* renamed from: m */
    public static <T> C9190h<T> m25166m(C9190h<T> hVar) {
        C9218f<? super C9190h, ? extends C9190h> fVar = f18282j;
        return fVar != null ? (C9190h) m25155b(fVar, hVar) : hVar;
    }

    /* renamed from: n */
    public static <T> C9197l<T> m25167n(C9197l<T> lVar) {
        C9218f<? super C9197l, ? extends C9197l> fVar = f18284l;
        return fVar != null ? (C9197l) m25155b(fVar, lVar) : lVar;
    }

    /* renamed from: o */
    public static C9194k m25168o(C9194k kVar) {
        C9218f<? super C9194k, ? extends C9194k> fVar = f18279g;
        if (fVar == null) {
            return kVar;
        }
        return (C9194k) m25155b(fVar, kVar);
    }

    /* renamed from: p */
    public static void m25169p(Throwable th) {
        C9217e<? super Throwable> eVar = f18273a;
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!m25162i(th)) {
            th = new UndeliverableException(th);
        }
        if (eVar != null) {
            try {
                eVar.accept(th);
                return;
            } catch (Throwable th2) {
                th2.printStackTrace();
                m25175v(th2);
            }
        }
        th.printStackTrace();
        m25175v(th);
    }

    /* renamed from: q */
    public static C9194k m25170q(C9194k kVar) {
        C9218f<? super C9194k, ? extends C9194k> fVar = f18280h;
        if (fVar == null) {
            return kVar;
        }
        return (C9194k) m25155b(fVar, kVar);
    }

    /* renamed from: r */
    public static Runnable m25171r(Runnable runnable) {
        C9227b.m24985d(runnable, "run is null");
        C9218f<? super Runnable, ? extends Runnable> fVar = f18274b;
        if (fVar == null) {
            return runnable;
        }
        return (Runnable) m25155b(fVar, runnable);
    }

    /* renamed from: s */
    public static <T> C9188f<? super T> m25172s(C9187e<T> eVar, C9188f<? super T> fVar) {
        C9215c<? super C9187e, ? super C9188f, ? extends C9188f> cVar = f18287o;
        return cVar != null ? (C9188f) m25154a(cVar, eVar, fVar) : fVar;
    }

    /* renamed from: t */
    public static <T> C9193j<? super T> m25173t(C9190h<T> hVar, C9193j<? super T> jVar) {
        C9215c<? super C9190h, ? super C9193j, ? extends C9193j> cVar = f18288p;
        return cVar != null ? (C9193j) m25154a(cVar, hVar, jVar) : jVar;
    }

    /* renamed from: u */
    public static <T> C9802b<? super T> m25174u(C9185c<T> cVar, C9802b<? super T> bVar) {
        C9215c<? super C9185c, ? super C9802b, ? extends C9802b> cVar2 = f18286n;
        return cVar2 != null ? (C9802b) m25154a(cVar2, cVar, bVar) : bVar;
    }

    /* renamed from: v */
    public static void m25175v(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }
}
