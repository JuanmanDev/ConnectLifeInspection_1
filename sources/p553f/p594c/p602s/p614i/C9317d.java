package p553f.p594c.p602s.p614i;

import java.util.concurrent.atomic.AtomicInteger;
import p553f.p594c.p617v.C9323a;
import p630io.reactivex.internal.util.AtomicThrowable;
import p648m.p683f.C9802b;

/* renamed from: f.c.s.i.d */
/* compiled from: HalfSerializer */
public final class C9317d {
    /* renamed from: a */
    public static void m25142a(C9802b<?> bVar, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable terminate = atomicThrowable.terminate();
            if (terminate != null) {
                bVar.onError(terminate);
            } else {
                bVar.onComplete();
            }
        }
    }

    /* renamed from: b */
    public static void m25143b(C9802b<?> bVar, Throwable th, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (!atomicThrowable.addThrowable(th)) {
            C9323a.m25169p(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            bVar.onError(atomicThrowable.terminate());
        }
    }

    /* renamed from: c */
    public static <T> void m25144c(C9802b<? super T> bVar, T t, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            bVar.onNext(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable terminate = atomicThrowable.terminate();
                if (terminate != null) {
                    bVar.onError(terminate);
                } else {
                    bVar.onComplete();
                }
            }
        }
    }
}
