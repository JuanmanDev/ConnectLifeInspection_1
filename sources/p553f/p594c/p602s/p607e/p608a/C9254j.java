package p553f.p594c.p602s.p607e.p608a;

import p553f.p594c.C9185c;
import p553f.p594c.p601r.C9218f;
import p553f.p594c.p602s.p604b.C9227b;
import p553f.p594c.p602s.p605c.C9228a;
import p553f.p594c.p602s.p613h.C9310a;
import p553f.p594c.p602s.p613h.C9311b;
import p648m.p683f.C9802b;

/* renamed from: f.c.s.e.a.j */
/* compiled from: FlowableMap */
public final class C9254j<T, U> extends C9236a<T, U> {

    /* renamed from: m */
    public final C9218f<? super T, ? extends U> f18087m;

    /* renamed from: f.c.s.e.a.j$a */
    /* compiled from: FlowableMap */
    public static final class C9255a<T, U> extends C9310a<T, U> {

        /* renamed from: p */
        public final C9218f<? super T, ? extends U> f18088p;

        public C9255a(C9228a<? super U> aVar, C9218f<? super T, ? extends U> fVar) {
            super(aVar);
            this.f18088p = fVar;
        }

        /* renamed from: c */
        public boolean mo47047c(T t) {
            if (this.f18255n) {
                return false;
            }
            try {
                Object apply = this.f18088p.apply(t);
                C9227b.m24985d(apply, "The mapper function returned a null value.");
                return this.f18252e.mo47047c(apply);
            } catch (Throwable th) {
                mo47150d(th);
                return true;
            }
        }

        public void onNext(T t) {
            if (!this.f18255n) {
                if (this.f18256o != 0) {
                    this.f18252e.onNext(null);
                    return;
                }
                try {
                    Object apply = this.f18088p.apply(t);
                    C9227b.m24985d(apply, "The mapper function returned a null value.");
                    this.f18252e.onNext(apply);
                } catch (Throwable th) {
                    mo47150d(th);
                }
            }
        }

        public U poll() {
            T poll = this.f18254m.poll();
            if (poll == null) {
                return null;
            }
            U apply = this.f18088p.apply(poll);
            C9227b.m24985d(apply, "The mapper function returned a null value.");
            return apply;
        }

        public int requestFusion(int i) {
            return mo47151e(i);
        }
    }

    /* renamed from: f.c.s.e.a.j$b */
    /* compiled from: FlowableMap */
    public static final class C9256b<T, U> extends C9311b<T, U> {

        /* renamed from: p */
        public final C9218f<? super T, ? extends U> f18089p;

        public C9256b(C9802b<? super U> bVar, C9218f<? super T, ? extends U> fVar) {
            super(bVar);
            this.f18089p = fVar;
        }

        public void onNext(T t) {
            if (!this.f18260n) {
                if (this.f18261o != 0) {
                    this.f18257e.onNext(null);
                    return;
                }
                try {
                    Object apply = this.f18089p.apply(t);
                    C9227b.m24985d(apply, "The mapper function returned a null value.");
                    this.f18257e.onNext(apply);
                } catch (Throwable th) {
                    mo47154d(th);
                }
            }
        }

        public U poll() {
            T poll = this.f18259m.poll();
            if (poll == null) {
                return null;
            }
            U apply = this.f18089p.apply(poll);
            C9227b.m24985d(apply, "The mapper function returned a null value.");
            return apply;
        }

        public int requestFusion(int i) {
            return mo47155e(i);
        }
    }

    public C9254j(C9185c<T> cVar, C9218f<? super T, ? extends U> fVar) {
        super(cVar);
        this.f18087m = fVar;
    }

    /* renamed from: v */
    public void mo46993v(C9802b<? super U> bVar) {
        if (bVar instanceof C9228a) {
            this.f18010l.mo46992u(new C9255a((C9228a) bVar, this.f18087m));
        } else {
            this.f18010l.mo46992u(new C9256b(bVar, this.f18087m));
        }
    }
}
