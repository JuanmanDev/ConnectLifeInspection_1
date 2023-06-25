package p553f.p594c;

import java.util.concurrent.TimeUnit;
import p553f.p594c.p598o.C9207b;
import p553f.p594c.p599p.C9211a;
import p553f.p594c.p601r.C9213a;
import p553f.p594c.p601r.C9217e;
import p553f.p594c.p601r.C9218f;
import p553f.p594c.p602s.p604b.C9222a;
import p553f.p594c.p602s.p604b.C9227b;
import p553f.p594c.p602s.p605c.C9232e;
import p553f.p594c.p602s.p607e.p608a.C9237b;
import p553f.p594c.p602s.p607e.p608a.C9242c;
import p553f.p594c.p602s.p607e.p608a.C9245d;
import p553f.p594c.p602s.p607e.p608a.C9246e;
import p553f.p594c.p602s.p607e.p608a.C9253i;
import p553f.p594c.p602s.p607e.p608a.C9254j;
import p553f.p594c.p602s.p607e.p608a.C9257k;
import p553f.p594c.p602s.p607e.p608a.C9261l;
import p553f.p594c.p602s.p607e.p608a.C9263m;
import p553f.p594c.p602s.p607e.p608a.C9267o;
import p553f.p594c.p602s.p607e.p608a.C9269p;
import p553f.p594c.p602s.p607e.p608a.C9271q;
import p553f.p594c.p602s.p607e.p608a.C9274r;
import p553f.p594c.p617v.C9323a;
import p553f.p594c.p618w.C9324a;
import p630io.reactivex.internal.operators.flowable.FlowableInternalHelper$RequestMax;
import p630io.reactivex.internal.subscribers.LambdaSubscriber;
import p630io.reactivex.internal.subscribers.StrictSubscriber;
import p648m.p683f.C9801a;
import p648m.p683f.C9802b;
import p648m.p683f.C9803c;

/* renamed from: f.c.c */
/* compiled from: Flowable */
public abstract class C9185c<T> implements C9801a<T> {

    /* renamed from: e */
    public static final int f17984e = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    /* renamed from: b */
    public static int m24905b() {
        return f17984e;
    }

    /* renamed from: g */
    public static <T> C9185c<T> m24906g() {
        return C9323a.m25164k(C9245d.f18038l);
    }

    /* renamed from: j */
    public static <T> C9185c<T> m24907j(T t) {
        C9227b.m24985d(t, "item is null");
        return C9323a.m25164k(new C9253i(t));
    }

    /* renamed from: y */
    public static C9185c<Long> m24908y(long j, TimeUnit timeUnit) {
        return m24909z(j, timeUnit, C9324a.m25176a());
    }

    /* renamed from: z */
    public static C9185c<Long> m24909z(long j, TimeUnit timeUnit, C9194k kVar) {
        C9227b.m24985d(timeUnit, "unit is null");
        C9227b.m24985d(kVar, "scheduler is null");
        return C9323a.m25164k(new C9274r(Math.max(0, j), timeUnit, kVar));
    }

    /* renamed from: a */
    public final void mo46975a(C9802b<? super T> bVar) {
        if (bVar instanceof C9186d) {
            mo46992u((C9186d) bVar);
            return;
        }
        C9227b.m24985d(bVar, "s is null");
        mo46992u(new StrictSubscriber(bVar));
    }

    /* renamed from: c */
    public final C9185c<T> mo46976c(long j, TimeUnit timeUnit) {
        return mo46977d(j, timeUnit, C9324a.m25176a(), false);
    }

    /* renamed from: d */
    public final C9185c<T> mo46977d(long j, TimeUnit timeUnit, C9194k kVar, boolean z) {
        C9227b.m24985d(timeUnit, "unit is null");
        C9227b.m24985d(kVar, "scheduler is null");
        return C9323a.m25164k(new C9237b(this, Math.max(0, j), timeUnit, kVar, z));
    }

    /* renamed from: e */
    public final C9185c<T> mo46978e(C9217e<? super T> eVar, C9217e<? super Throwable> eVar2, C9213a aVar, C9213a aVar2) {
        C9227b.m24985d(eVar, "onNext is null");
        C9227b.m24985d(eVar2, "onError is null");
        C9227b.m24985d(aVar, "onComplete is null");
        C9227b.m24985d(aVar2, "onAfterTerminate is null");
        return C9323a.m25164k(new C9242c(this, eVar, eVar2, aVar, aVar2));
    }

    /* renamed from: f */
    public final C9185c<T> mo46979f(C9217e<? super T> eVar) {
        C9217e a = C9222a.m24980a();
        C9213a aVar = C9222a.f18007b;
        return mo46978e(eVar, a, aVar, aVar);
    }

    /* renamed from: h */
    public final <R> C9185c<R> mo46980h(C9218f<? super T, ? extends C9801a<? extends R>> fVar) {
        return mo46981i(fVar, false, m24905b(), m24905b());
    }

    /* renamed from: i */
    public final <R> C9185c<R> mo46981i(C9218f<? super T, ? extends C9801a<? extends R>> fVar, boolean z, int i, int i2) {
        C9227b.m24985d(fVar, "mapper is null");
        C9227b.m24986e(i, "maxConcurrency");
        C9227b.m24986e(i2, "bufferSize");
        if (!(this instanceof C9232e)) {
            return C9323a.m25164k(new C9246e(this, fVar, z, i, i2));
        }
        Object call = ((C9232e) this).call();
        if (call == null) {
            return m24906g();
        }
        return C9269p.m25041a(call, fVar);
    }

    /* renamed from: k */
    public final <R> C9185c<R> mo46982k(C9218f<? super T, ? extends R> fVar) {
        C9227b.m24985d(fVar, "mapper is null");
        return C9323a.m25164k(new C9254j(this, fVar));
    }

    /* renamed from: l */
    public final C9185c<T> mo46983l(C9194k kVar) {
        return mo46984m(kVar, false, m24905b());
    }

    /* renamed from: m */
    public final C9185c<T> mo46984m(C9194k kVar, boolean z, int i) {
        C9227b.m24985d(kVar, "scheduler is null");
        C9227b.m24986e(i, "bufferSize");
        return C9323a.m25164k(new C9257k(this, kVar, z, i));
    }

    /* renamed from: n */
    public final C9185c<T> mo46985n() {
        return mo46986o(m24905b(), false, true);
    }

    /* renamed from: o */
    public final C9185c<T> mo46986o(int i, boolean z, boolean z2) {
        C9227b.m24986e(i, "capacity");
        return C9323a.m25164k(new C9261l(this, i, z2, z, C9222a.f18007b));
    }

    /* renamed from: p */
    public final C9185c<T> mo46987p() {
        return C9323a.m25164k(new C9263m(this));
    }

    /* renamed from: q */
    public final C9185c<T> mo46988q() {
        return C9323a.m25164k(new C9267o(this));
    }

    /* renamed from: r */
    public final C9207b mo46989r(C9217e<? super T> eVar) {
        return mo46991t(eVar, C9222a.f18009d, C9222a.f18007b, FlowableInternalHelper$RequestMax.INSTANCE);
    }

    /* renamed from: s */
    public final C9207b mo46990s(C9217e<? super T> eVar, C9217e<? super Throwable> eVar2) {
        return mo46991t(eVar, eVar2, C9222a.f18007b, FlowableInternalHelper$RequestMax.INSTANCE);
    }

    /* renamed from: t */
    public final C9207b mo46991t(C9217e<? super T> eVar, C9217e<? super Throwable> eVar2, C9213a aVar, C9217e<? super C9803c> eVar3) {
        C9227b.m24985d(eVar, "onNext is null");
        C9227b.m24985d(eVar2, "onError is null");
        C9227b.m24985d(aVar, "onComplete is null");
        C9227b.m24985d(eVar3, "onSubscribe is null");
        LambdaSubscriber lambdaSubscriber = new LambdaSubscriber(eVar, eVar2, aVar, eVar3);
        mo46992u(lambdaSubscriber);
        return lambdaSubscriber;
    }

    /* renamed from: u */
    public final void mo46992u(C9186d<? super T> dVar) {
        C9227b.m24985d(dVar, "s is null");
        try {
            C9802b<? super Object> u = C9323a.m25174u(this, dVar);
            C9227b.m24985d(u, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            mo46993v(u);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C9211a.m24971b(th);
            C9323a.m25169p(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* renamed from: v */
    public abstract void mo46993v(C9802b<? super T> bVar);

    /* renamed from: w */
    public final C9185c<T> mo46994w(C9194k kVar) {
        C9227b.m24985d(kVar, "scheduler is null");
        return mo46995x(kVar, true);
    }

    /* renamed from: x */
    public final C9185c<T> mo46995x(C9194k kVar, boolean z) {
        C9227b.m24985d(kVar, "scheduler is null");
        return C9323a.m25164k(new C9271q(this, kVar, z));
    }
}
