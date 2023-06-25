package p040c.p200q.p201a.p202a.p205i.p208c0.p209j;

import java.util.concurrent.Executor;
import p040c.p200q.p201a.p202a.p205i.C2538q;
import p040c.p200q.p201a.p202a.p205i.p208c0.p210k.C2467j0;
import p040c.p200q.p201a.p202a.p205i.p211d0.C2507a;

/* renamed from: c.q.a.a.i.c0.j.v */
/* compiled from: WorkInitializer */
public class C2443v {

    /* renamed from: a */
    public final Executor f2833a;

    /* renamed from: b */
    public final C2467j0 f2834b;

    /* renamed from: c */
    public final C2445x f2835c;

    /* renamed from: d */
    public final C2507a f2836d;

    public C2443v(Executor executor, C2467j0 j0Var, C2445x xVar, C2507a aVar) {
        this.f2833a = executor;
        this.f2834b = j0Var;
        this.f2835c = xVar;
        this.f2836d = aVar;
    }

    /* renamed from: a */
    public void mo17845a() {
        this.f2833a.execute(new C2433n(this));
    }

    /* renamed from: b */
    public /* synthetic */ Object mo17846b() {
        for (C2538q a : this.f2834b.mo17883v()) {
            this.f2835c.mo17811a(a, 1);
        }
        return null;
    }

    /* renamed from: c */
    public /* synthetic */ void mo17847c() {
        this.f2836d.mo17899b(new C2434o(this));
    }
}
