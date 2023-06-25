package p040c.p200q.p201a.p202a.p205i.p208c0.p209j;

import java.util.concurrent.Executor;
import p040c.p200q.p201a.p202a.p205i.p208c0.p210k.C2467j0;
import p040c.p200q.p201a.p202a.p205i.p211d0.C2507a;
import p040c.p200q.p201a.p202a.p205i.p215y.p216a.C2564b;
import p625h.p626a.C9381a;

/* renamed from: c.q.a.a.i.c0.j.w */
/* compiled from: WorkInitializer_Factory */
public final class C2444w implements C2564b<C2443v> {

    /* renamed from: a */
    public final C9381a<Executor> f2837a;

    /* renamed from: b */
    public final C9381a<C2467j0> f2838b;

    /* renamed from: c */
    public final C9381a<C2445x> f2839c;

    /* renamed from: d */
    public final C9381a<C2507a> f2840d;

    public C2444w(C9381a<Executor> aVar, C9381a<C2467j0> aVar2, C9381a<C2445x> aVar3, C9381a<C2507a> aVar4) {
        this.f2837a = aVar;
        this.f2838b = aVar2;
        this.f2839c = aVar3;
        this.f2840d = aVar4;
    }

    /* renamed from: a */
    public static C2444w m4295a(C9381a<Executor> aVar, C9381a<C2467j0> aVar2, C9381a<C2445x> aVar3, C9381a<C2507a> aVar4) {
        return new C2444w(aVar, aVar2, aVar3, aVar4);
    }

    /* renamed from: c */
    public static C2443v m4296c(Executor executor, C2467j0 j0Var, C2445x xVar, C2507a aVar) {
        return new C2443v(executor, j0Var, xVar, aVar);
    }

    /* renamed from: b */
    public C2443v get() {
        return m4296c(this.f2837a.get(), this.f2838b.get(), this.f2839c.get(), this.f2840d.get());
    }
}
