package p040c.p200q.p201a.p202a.p205i.p208c0;

import java.util.concurrent.Executor;
import p040c.p200q.p201a.p202a.p205i.p208c0.p209j.C2445x;
import p040c.p200q.p201a.p202a.p205i.p208c0.p210k.C2467j0;
import p040c.p200q.p201a.p202a.p205i.p211d0.C2507a;
import p040c.p200q.p201a.p202a.p205i.p214x.C2553e;
import p040c.p200q.p201a.p202a.p205i.p215y.p216a.C2564b;
import p625h.p626a.C9381a;

/* renamed from: c.q.a.a.i.c0.d */
/* compiled from: DefaultScheduler_Factory */
public final class C2414d implements C2564b<C2413c> {

    /* renamed from: a */
    public final C9381a<Executor> f2759a;

    /* renamed from: b */
    public final C9381a<C2553e> f2760b;

    /* renamed from: c */
    public final C9381a<C2445x> f2761c;

    /* renamed from: d */
    public final C9381a<C2467j0> f2762d;

    /* renamed from: e */
    public final C9381a<C2507a> f2763e;

    public C2414d(C9381a<Executor> aVar, C9381a<C2553e> aVar2, C9381a<C2445x> aVar3, C9381a<C2467j0> aVar4, C9381a<C2507a> aVar5) {
        this.f2759a = aVar;
        this.f2760b = aVar2;
        this.f2761c = aVar3;
        this.f2762d = aVar4;
        this.f2763e = aVar5;
    }

    /* renamed from: a */
    public static C2414d m4248a(C9381a<Executor> aVar, C9381a<C2553e> aVar2, C9381a<C2445x> aVar3, C9381a<C2467j0> aVar4, C9381a<C2507a> aVar5) {
        return new C2414d(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    /* renamed from: c */
    public static C2413c m4249c(Executor executor, C2553e eVar, C2445x xVar, C2467j0 j0Var, C2507a aVar) {
        return new C2413c(executor, eVar, xVar, j0Var, aVar);
    }

    /* renamed from: b */
    public C2413c get() {
        return m4249c(this.f2759a.get(), this.f2760b.get(), this.f2761c.get(), this.f2762d.get(), this.f2763e.get());
    }
}
