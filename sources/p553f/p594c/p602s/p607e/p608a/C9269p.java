package p553f.p594c.p602s.p607e.p608a;

import java.util.concurrent.Callable;
import p553f.p594c.C9185c;
import p553f.p594c.p599p.C9211a;
import p553f.p594c.p601r.C9218f;
import p553f.p594c.p602s.p604b.C9227b;
import p553f.p594c.p617v.C9323a;
import p630io.reactivex.internal.subscriptions.EmptySubscription;
import p630io.reactivex.internal.subscriptions.ScalarSubscription;
import p648m.p683f.C9801a;
import p648m.p683f.C9802b;

/* renamed from: f.c.s.e.a.p */
/* compiled from: FlowableScalarXMap */
public final class C9269p {

    /* renamed from: f.c.s.e.a.p$a */
    /* compiled from: FlowableScalarXMap */
    public static final class C9270a<T, R> extends C9185c<R> {

        /* renamed from: l */
        public final T f18138l;

        /* renamed from: m */
        public final C9218f<? super T, ? extends C9801a<? extends R>> f18139m;

        public C9270a(T t, C9218f<? super T, ? extends C9801a<? extends R>> fVar) {
            this.f18138l = t;
            this.f18139m = fVar;
        }

        /* renamed from: v */
        public void mo46993v(C9802b<? super R> bVar) {
            try {
                Object apply = this.f18139m.apply(this.f18138l);
                C9227b.m24985d(apply, "The mapper returned a null Publisher");
                C9801a aVar = (C9801a) apply;
                if (aVar instanceof Callable) {
                    try {
                        Object call = ((Callable) aVar).call();
                        if (call == null) {
                            EmptySubscription.complete(bVar);
                        } else {
                            bVar.onSubscribe(new ScalarSubscription(bVar, call));
                        }
                    } catch (Throwable th) {
                        C9211a.m24971b(th);
                        EmptySubscription.error(th, bVar);
                    }
                } else {
                    aVar.mo46975a(bVar);
                }
            } catch (Throwable th2) {
                EmptySubscription.error(th2, bVar);
            }
        }
    }

    /* renamed from: a */
    public static <T, U> C9185c<U> m25041a(T t, C9218f<? super T, ? extends C9801a<? extends U>> fVar) {
        return C9323a.m25164k(new C9270a(t, fVar));
    }

    /* renamed from: b */
    public static <T, R> boolean m25042b(C9801a<T> aVar, C9802b<? super R> bVar, C9218f<? super T, ? extends C9801a<? extends R>> fVar) {
        if (!(aVar instanceof Callable)) {
            return false;
        }
        try {
            Object call = ((Callable) aVar).call();
            if (call == null) {
                EmptySubscription.complete(bVar);
                return true;
            }
            try {
                Object apply = fVar.apply(call);
                C9227b.m24985d(apply, "The mapper returned a null Publisher");
                C9801a aVar2 = (C9801a) apply;
                if (aVar2 instanceof Callable) {
                    try {
                        Object call2 = ((Callable) aVar2).call();
                        if (call2 == null) {
                            EmptySubscription.complete(bVar);
                            return true;
                        }
                        bVar.onSubscribe(new ScalarSubscription(bVar, call2));
                    } catch (Throwable th) {
                        C9211a.m24971b(th);
                        EmptySubscription.error(th, bVar);
                        return true;
                    }
                } else {
                    aVar2.mo46975a(bVar);
                }
                return true;
            } catch (Throwable th2) {
                C9211a.m24971b(th2);
                EmptySubscription.error(th2, bVar);
                return true;
            }
        } catch (Throwable th3) {
            C9211a.m24971b(th3);
            EmptySubscription.error(th3, bVar);
            return true;
        }
    }
}
