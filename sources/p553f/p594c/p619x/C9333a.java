package p553f.p594c.p619x;

import p553f.p594c.C9186d;
import p553f.p594c.p602s.p614i.C9313a;
import p630io.reactivex.internal.subscriptions.SubscriptionHelper;
import p630io.reactivex.internal.util.NotificationLite;
import p648m.p683f.C9802b;
import p648m.p683f.C9803c;

/* renamed from: f.c.x.a */
/* compiled from: SerializedSubscriber */
public final class C9333a<T> implements C9186d<T>, C9803c {

    /* renamed from: e */
    public final C9802b<? super T> f18295e;

    /* renamed from: l */
    public final boolean f18296l;

    /* renamed from: m */
    public C9803c f18297m;

    /* renamed from: n */
    public boolean f18298n;

    /* renamed from: o */
    public C9313a<Object> f18299o;

    /* renamed from: p */
    public volatile boolean f18300p;

    public C9333a(C9802b<? super T> bVar) {
        this(bVar, false);
    }

    /* renamed from: a */
    public void mo47177a() {
        C9313a<Object> aVar;
        do {
            synchronized (this) {
                aVar = this.f18299o;
                if (aVar == null) {
                    this.f18298n = false;
                    return;
                }
                this.f18299o = null;
            }
        } while (!aVar.mo47160a(this.f18295e));
    }

    public void cancel() {
        this.f18297m.cancel();
    }

    public void onComplete() {
        if (!this.f18300p) {
            synchronized (this) {
                if (!this.f18300p) {
                    if (this.f18298n) {
                        C9313a<Object> aVar = this.f18299o;
                        if (aVar == null) {
                            aVar = new C9313a<>(4);
                            this.f18299o = aVar;
                        }
                        aVar.mo47161b(NotificationLite.complete());
                        return;
                    }
                    this.f18300p = true;
                    this.f18298n = true;
                    this.f18295e.onComplete();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0038, code lost:
        if (r1 == false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        p553f.p594c.p617v.C9323a.m25169p(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        r2.f18295e.onError(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0043, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onError(java.lang.Throwable r3) {
        /*
            r2 = this;
            boolean r0 = r2.f18300p
            if (r0 == 0) goto L_0x0008
            p553f.p594c.p617v.C9323a.m25169p(r3)
            return
        L_0x0008:
            monitor-enter(r2)
            boolean r0 = r2.f18300p     // Catch:{ all -> 0x0044 }
            r1 = 1
            if (r0 == 0) goto L_0x000f
            goto L_0x0037
        L_0x000f:
            boolean r0 = r2.f18298n     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0032
            r2.f18300p = r1     // Catch:{ all -> 0x0044 }
            f.c.s.i.a<java.lang.Object> r0 = r2.f18299o     // Catch:{ all -> 0x0044 }
            if (r0 != 0) goto L_0x0021
            f.c.s.i.a r0 = new f.c.s.i.a     // Catch:{ all -> 0x0044 }
            r1 = 4
            r0.<init>(r1)     // Catch:{ all -> 0x0044 }
            r2.f18299o = r0     // Catch:{ all -> 0x0044 }
        L_0x0021:
            java.lang.Object r3 = p630io.reactivex.internal.util.NotificationLite.error(r3)     // Catch:{ all -> 0x0044 }
            boolean r1 = r2.f18296l     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x002d
            r0.mo47161b(r3)     // Catch:{ all -> 0x0044 }
            goto L_0x0030
        L_0x002d:
            r0.mo47162c(r3)     // Catch:{ all -> 0x0044 }
        L_0x0030:
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            return
        L_0x0032:
            r2.f18300p = r1     // Catch:{ all -> 0x0044 }
            r2.f18298n = r1     // Catch:{ all -> 0x0044 }
            r1 = 0
        L_0x0037:
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x003e
            p553f.p594c.p617v.C9323a.m25169p(r3)
            return
        L_0x003e:
            m.f.b<? super T> r0 = r2.f18295e
            r0.onError(r3)
            return
        L_0x0044:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p553f.p594c.p619x.C9333a.onError(java.lang.Throwable):void");
    }

    public void onNext(T t) {
        if (!this.f18300p) {
            if (t == null) {
                this.f18297m.cancel();
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            synchronized (this) {
                if (!this.f18300p) {
                    if (this.f18298n) {
                        C9313a<Object> aVar = this.f18299o;
                        if (aVar == null) {
                            aVar = new C9313a<>(4);
                            this.f18299o = aVar;
                        }
                        aVar.mo47161b(NotificationLite.next(t));
                        return;
                    }
                    this.f18298n = true;
                    this.f18295e.onNext(t);
                    mo47177a();
                }
            }
        }
    }

    public void onSubscribe(C9803c cVar) {
        if (SubscriptionHelper.validate(this.f18297m, cVar)) {
            this.f18297m = cVar;
            this.f18295e.onSubscribe(this);
        }
    }

    public void request(long j) {
        this.f18297m.request(j);
    }

    public C9333a(C9802b<? super T> bVar, boolean z) {
        this.f18295e = bVar;
        this.f18296l = z;
    }
}
