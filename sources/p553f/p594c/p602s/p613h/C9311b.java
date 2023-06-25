package p553f.p594c.p602s.p613h;

import p553f.p594c.C9186d;
import p553f.p594c.p599p.C9211a;
import p553f.p594c.p602s.p605c.C9231d;
import p553f.p594c.p617v.C9323a;
import p630io.reactivex.internal.subscriptions.SubscriptionHelper;
import p648m.p683f.C9802b;
import p648m.p683f.C9803c;

/* renamed from: f.c.s.h.b */
/* compiled from: BasicFuseableSubscriber */
public abstract class C9311b<T, R> implements C9186d<T>, C9231d<R> {

    /* renamed from: e */
    public final C9802b<? super R> f18257e;

    /* renamed from: l */
    public C9803c f18258l;

    /* renamed from: m */
    public C9231d<T> f18259m;

    /* renamed from: n */
    public boolean f18260n;

    /* renamed from: o */
    public int f18261o;

    public C9311b(C9802b<? super R> bVar) {
        this.f18257e = bVar;
    }

    /* renamed from: a */
    public void mo47152a() {
    }

    /* renamed from: b */
    public boolean mo47153b() {
        return true;
    }

    public void cancel() {
        this.f18258l.cancel();
    }

    public void clear() {
        this.f18259m.clear();
    }

    /* renamed from: d */
    public final void mo47154d(Throwable th) {
        C9211a.m24971b(th);
        this.f18258l.cancel();
        onError(th);
    }

    /* renamed from: e */
    public final int mo47155e(int i) {
        C9231d<T> dVar = this.f18259m;
        if (dVar == null || (i & 4) != 0) {
            return 0;
        }
        int requestFusion = dVar.requestFusion(i);
        if (requestFusion != 0) {
            this.f18261o = requestFusion;
        }
        return requestFusion;
    }

    public boolean isEmpty() {
        return this.f18259m.isEmpty();
    }

    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public void onComplete() {
        if (!this.f18260n) {
            this.f18260n = true;
            this.f18257e.onComplete();
        }
    }

    public void onError(Throwable th) {
        if (this.f18260n) {
            C9323a.m25169p(th);
            return;
        }
        this.f18260n = true;
        this.f18257e.onError(th);
    }

    public final void onSubscribe(C9803c cVar) {
        if (SubscriptionHelper.validate(this.f18258l, cVar)) {
            this.f18258l = cVar;
            if (cVar instanceof C9231d) {
                this.f18259m = (C9231d) cVar;
            }
            if (mo47153b()) {
                this.f18257e.onSubscribe(this);
                mo47152a();
            }
        }
    }

    public void request(long j) {
        this.f18258l.request(j);
    }
}
