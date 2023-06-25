package p553f.p594c.p602s.p607e.p610c;

import java.util.concurrent.atomic.AtomicReference;
import p553f.p594c.C9192i;
import p553f.p594c.C9193j;
import p553f.p594c.C9194k;
import p553f.p594c.p598o.C9207b;
import p630io.reactivex.internal.disposables.DisposableHelper;

/* renamed from: f.c.s.e.c.g */
/* compiled from: ObservableSubscribeOn */
public final class C9285g<T> extends C9278a<T, T> {

    /* renamed from: l */
    public final C9194k f18174l;

    /* renamed from: f.c.s.e.c.g$a */
    /* compiled from: ObservableSubscribeOn */
    public static final class C9286a<T> extends AtomicReference<C9207b> implements C9193j<T>, C9207b {
        public static final long serialVersionUID = 8094547886072529208L;

        /* renamed from: e */
        public final C9193j<? super T> f18175e;

        /* renamed from: l */
        public final AtomicReference<C9207b> f18176l = new AtomicReference<>();

        public C9286a(C9193j<? super T> jVar) {
            this.f18175e = jVar;
        }

        /* renamed from: a */
        public void mo47109a(C9207b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }

        public void dispose() {
            DisposableHelper.dispose(this.f18176l);
            DisposableHelper.dispose(this);
        }

        public void onComplete() {
            this.f18175e.onComplete();
        }

        public void onError(Throwable th) {
            this.f18175e.onError(th);
        }

        public void onNext(T t) {
            this.f18175e.onNext(t);
        }

        public void onSubscribe(C9207b bVar) {
            DisposableHelper.setOnce(this.f18176l, bVar);
        }
    }

    /* renamed from: f.c.s.e.c.g$b */
    /* compiled from: ObservableSubscribeOn */
    public final class C9287b implements Runnable {

        /* renamed from: e */
        public final C9286a<T> f18177e;

        public C9287b(C9286a<T> aVar) {
            this.f18177e = aVar;
        }

        public void run() {
            C9285g.this.f18157e.mo47002a(this.f18177e);
        }
    }

    public C9285g(C9192i<T> iVar, C9194k kVar) {
        super(iVar);
        this.f18174l = kVar;
    }

    /* renamed from: e */
    public void mo47006e(C9193j<? super T> jVar) {
        C9286a aVar = new C9286a(jVar);
        jVar.onSubscribe(aVar);
        aVar.mo47109a(this.f18174l.mo47014b(new C9287b(aVar)));
    }
}
