package p553f.p594c.p602s.p607e.p608a;

import p553f.p594c.C9185c;
import p553f.p594c.p599p.C9211a;
import p553f.p594c.p601r.C9213a;
import p553f.p594c.p601r.C9217e;
import p553f.p594c.p602s.p605c.C9228a;
import p553f.p594c.p602s.p613h.C9310a;
import p553f.p594c.p602s.p613h.C9311b;
import p553f.p594c.p617v.C9323a;
import p630io.reactivex.exceptions.CompositeException;
import p648m.p683f.C9802b;

/* renamed from: f.c.s.e.a.c */
/* compiled from: FlowableDoOnEach */
public final class C9242c<T> extends C9236a<T, T> {

    /* renamed from: m */
    public final C9217e<? super T> f18026m;

    /* renamed from: n */
    public final C9217e<? super Throwable> f18027n;

    /* renamed from: o */
    public final C9213a f18028o;

    /* renamed from: p */
    public final C9213a f18029p;

    /* renamed from: f.c.s.e.a.c$a */
    /* compiled from: FlowableDoOnEach */
    public static final class C9243a<T> extends C9310a<T, T> {

        /* renamed from: p */
        public final C9217e<? super T> f18030p;

        /* renamed from: q */
        public final C9217e<? super Throwable> f18031q;

        /* renamed from: r */
        public final C9213a f18032r;

        /* renamed from: s */
        public final C9213a f18033s;

        public C9243a(C9228a<? super T> aVar, C9217e<? super T> eVar, C9217e<? super Throwable> eVar2, C9213a aVar2, C9213a aVar3) {
            super(aVar);
            this.f18030p = eVar;
            this.f18031q = eVar2;
            this.f18032r = aVar2;
            this.f18033s = aVar3;
        }

        /* renamed from: c */
        public boolean mo47047c(T t) {
            if (this.f18255n) {
                return false;
            }
            try {
                this.f18030p.accept(t);
                return this.f18252e.mo47047c(t);
            } catch (Throwable th) {
                mo47150d(th);
                return false;
            }
        }

        public void onComplete() {
            if (!this.f18255n) {
                try {
                    this.f18032r.run();
                    this.f18255n = true;
                    this.f18252e.onComplete();
                    try {
                        this.f18033s.run();
                    } catch (Throwable th) {
                        C9211a.m24971b(th);
                        C9323a.m25169p(th);
                    }
                } catch (Throwable th2) {
                    mo47150d(th2);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f18255n) {
                C9323a.m25169p(th);
                return;
            }
            boolean z = true;
            this.f18255n = true;
            try {
                this.f18031q.accept(th);
            } catch (Throwable th2) {
                C9211a.m24971b(th2);
                this.f18252e.onError(new CompositeException(th, th2));
                z = false;
            }
            if (z) {
                this.f18252e.onError(th);
            }
            try {
                this.f18033s.run();
            } catch (Throwable th3) {
                C9211a.m24971b(th3);
                C9323a.m25169p(th3);
            }
        }

        public void onNext(T t) {
            if (!this.f18255n) {
                if (this.f18256o != 0) {
                    this.f18252e.onNext(null);
                    return;
                }
                try {
                    this.f18030p.accept(t);
                    this.f18252e.onNext(t);
                } catch (Throwable th) {
                    mo47150d(th);
                }
            }
        }

        public T poll() {
            try {
                T poll = this.f18254m.poll();
                if (poll != null) {
                    try {
                        this.f18030p.accept(poll);
                        this.f18033s.run();
                    } catch (Throwable th) {
                        throw new CompositeException(th, th);
                    }
                } else if (this.f18256o == 1) {
                    this.f18032r.run();
                    this.f18033s.run();
                }
                return poll;
            } catch (Throwable th2) {
                throw new CompositeException(th, th2);
            }
        }

        public int requestFusion(int i) {
            return mo47151e(i);
        }
    }

    /* renamed from: f.c.s.e.a.c$b */
    /* compiled from: FlowableDoOnEach */
    public static final class C9244b<T> extends C9311b<T, T> {

        /* renamed from: p */
        public final C9217e<? super T> f18034p;

        /* renamed from: q */
        public final C9217e<? super Throwable> f18035q;

        /* renamed from: r */
        public final C9213a f18036r;

        /* renamed from: s */
        public final C9213a f18037s;

        public C9244b(C9802b<? super T> bVar, C9217e<? super T> eVar, C9217e<? super Throwable> eVar2, C9213a aVar, C9213a aVar2) {
            super(bVar);
            this.f18034p = eVar;
            this.f18035q = eVar2;
            this.f18036r = aVar;
            this.f18037s = aVar2;
        }

        public void onComplete() {
            if (!this.f18260n) {
                try {
                    this.f18036r.run();
                    this.f18260n = true;
                    this.f18257e.onComplete();
                    try {
                        this.f18037s.run();
                    } catch (Throwable th) {
                        C9211a.m24971b(th);
                        C9323a.m25169p(th);
                    }
                } catch (Throwable th2) {
                    mo47154d(th2);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f18260n) {
                C9323a.m25169p(th);
                return;
            }
            boolean z = true;
            this.f18260n = true;
            try {
                this.f18035q.accept(th);
            } catch (Throwable th2) {
                C9211a.m24971b(th2);
                this.f18257e.onError(new CompositeException(th, th2));
                z = false;
            }
            if (z) {
                this.f18257e.onError(th);
            }
            try {
                this.f18037s.run();
            } catch (Throwable th3) {
                C9211a.m24971b(th3);
                C9323a.m25169p(th3);
            }
        }

        public void onNext(T t) {
            if (!this.f18260n) {
                if (this.f18261o != 0) {
                    this.f18257e.onNext(null);
                    return;
                }
                try {
                    this.f18034p.accept(t);
                    this.f18257e.onNext(t);
                } catch (Throwable th) {
                    mo47154d(th);
                }
            }
        }

        public T poll() {
            try {
                T poll = this.f18259m.poll();
                if (poll != null) {
                    try {
                        this.f18034p.accept(poll);
                        this.f18037s.run();
                    } catch (Throwable th) {
                        throw new CompositeException(th, th);
                    }
                } else if (this.f18261o == 1) {
                    this.f18036r.run();
                    this.f18037s.run();
                }
                return poll;
            } catch (Throwable th2) {
                throw new CompositeException(th, th2);
            }
        }

        public int requestFusion(int i) {
            return mo47155e(i);
        }
    }

    public C9242c(C9185c<T> cVar, C9217e<? super T> eVar, C9217e<? super Throwable> eVar2, C9213a aVar, C9213a aVar2) {
        super(cVar);
        this.f18026m = eVar;
        this.f18027n = eVar2;
        this.f18028o = aVar;
        this.f18029p = aVar2;
    }

    /* renamed from: v */
    public void mo46993v(C9802b<? super T> bVar) {
        if (bVar instanceof C9228a) {
            this.f18010l.mo46992u(new C9243a((C9228a) bVar, this.f18026m, this.f18027n, this.f18028o, this.f18029p));
            return;
        }
        this.f18010l.mo46992u(new C9244b(bVar, this.f18026m, this.f18027n, this.f18028o, this.f18029p));
    }
}
