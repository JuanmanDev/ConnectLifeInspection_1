package p553f.p594c.p602s.p607e.p610c;

import p553f.p594c.C9187e;
import p553f.p594c.C9188f;
import p553f.p594c.C9192i;
import p553f.p594c.C9193j;
import p553f.p594c.p598o.C9207b;
import p553f.p594c.p617v.C9323a;
import p630io.reactivex.internal.disposables.DisposableHelper;

/* renamed from: f.c.s.e.c.e */
/* compiled from: ObservableSingleMaybe */
public final class C9282e<T> extends C9187e<T> {

    /* renamed from: a */
    public final C9192i<T> f18168a;

    /* renamed from: f.c.s.e.c.e$a */
    /* compiled from: ObservableSingleMaybe */
    public static final class C9283a<T> implements C9193j<T>, C9207b {

        /* renamed from: e */
        public final C9188f<? super T> f18169e;

        /* renamed from: l */
        public C9207b f18170l;

        /* renamed from: m */
        public T f18171m;

        /* renamed from: n */
        public boolean f18172n;

        public C9283a(C9188f<? super T> fVar) {
            this.f18169e = fVar;
        }

        public void dispose() {
            this.f18170l.dispose();
        }

        public void onComplete() {
            if (!this.f18172n) {
                this.f18172n = true;
                T t = this.f18171m;
                this.f18171m = null;
                if (t == null) {
                    this.f18169e.onComplete();
                } else {
                    this.f18169e.onSuccess(t);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f18172n) {
                C9323a.m25169p(th);
                return;
            }
            this.f18172n = true;
            this.f18169e.onError(th);
        }

        public void onNext(T t) {
            if (!this.f18172n) {
                if (this.f18171m != null) {
                    this.f18172n = true;
                    this.f18170l.dispose();
                    this.f18169e.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.f18171m = t;
            }
        }

        public void onSubscribe(C9207b bVar) {
            if (DisposableHelper.validate(this.f18170l, bVar)) {
                this.f18170l = bVar;
                this.f18169e.onSubscribe(this);
            }
        }
    }

    public C9282e(C9192i<T> iVar) {
        this.f18168a = iVar;
    }

    /* renamed from: b */
    public void mo46997b(C9188f<? super T> fVar) {
        this.f18168a.mo47002a(new C9283a(fVar));
    }
}
