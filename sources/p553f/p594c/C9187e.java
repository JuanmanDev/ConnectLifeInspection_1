package p553f.p594c;

import p553f.p594c.p599p.C9211a;
import p553f.p594c.p602s.p604b.C9227b;
import p553f.p594c.p617v.C9323a;

/* renamed from: f.c.e */
/* compiled from: Maybe */
public abstract class C9187e<T> implements C9189g<T> {
    /* renamed from: a */
    public final void mo46996a(C9188f<? super T> fVar) {
        C9227b.m24985d(fVar, "observer is null");
        C9188f<? super Object> s = C9323a.m25172s(this, fVar);
        C9227b.m24985d(s, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            mo46997b(s);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C9211a.m24971b(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* renamed from: b */
    public abstract void mo46997b(C9188f<? super T> fVar);
}
