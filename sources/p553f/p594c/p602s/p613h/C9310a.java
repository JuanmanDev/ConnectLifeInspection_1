package p553f.p594c.p602s.p613h;

import p553f.p594c.p599p.C9211a;
import p553f.p594c.p602s.p605c.C9228a;
import p553f.p594c.p602s.p605c.C9231d;
import p553f.p594c.p617v.C9323a;
import p630io.reactivex.internal.subscriptions.SubscriptionHelper;
import p648m.p683f.C9803c;

/* renamed from: f.c.s.h.a */
/* compiled from: BasicFuseableConditionalSubscriber */
public abstract class C9310a<T, R> implements C9228a<T>, C9231d<R> {

    /* renamed from: e */
    public final C9228a<? super R> f18252e;

    /* renamed from: l */
    public C9803c f18253l;

    /* renamed from: m */
    public C9231d<T> f18254m;

    /* renamed from: n */
    public boolean f18255n;

    /* renamed from: o */
    public int f18256o;

    public C9310a(C9228a<? super R> aVar) {
        this.f18252e = aVar;
    }

    /* renamed from: a */
    public void mo47148a() {
    }

    /* renamed from: b */
    public boolean mo47149b() {
        return true;
    }

    public void cancel() {
        this.f18253l.cancel();
    }

    public void clear() {
        this.f18254m.clear();
    }

    /* renamed from: d */
    public final void mo47150d(Throwable th) {
        C9211a.m24971b(th);
        this.f18253l.cancel();
        onError(th);
    }

    /* renamed from: e */
    public final int mo47151e(int i) {
        C9231d<T> dVar = this.f18254m;
        if (dVar == null || (i & 4) != 0) {
            return 0;
        }
        int requestFusion = dVar.requestFusion(i);
        if (requestFusion != 0) {
            this.f18256o = requestFusion;
        }
        return requestFusion;
    }

    public boolean isEmpty() {
        return this.f18254m.isEmpty();
    }

    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public void onComplete() {
        if (!this.f18255n) {
            this.f18255n = true;
            this.f18252e.onComplete();
        }
    }

    public void onError(Throwable th) {
        if (this.f18255n) {
            C9323a.m25169p(th);
            return;
        }
        this.f18255n = true;
        this.f18252e.onError(th);
    }

    public final void onSubscribe(C9803c cVar) {
        if (SubscriptionHelper.validate(this.f18253l, cVar)) {
            this.f18253l = cVar;
            if (cVar instanceof C9231d) {
                this.f18254m = (C9231d) cVar;
            }
            if (mo47149b()) {
                this.f18252e.onSubscribe(this);
                mo47148a();
            }
        }
    }

    public void request(long j) {
        this.f18253l.request(j);
    }
}
