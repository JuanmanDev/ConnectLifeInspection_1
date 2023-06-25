package p040c.p200q.p201a.p202a.p205i.p208c0;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import p040c.p200q.p201a.p202a.p205i.p208c0.p209j.C2445x;
import p040c.p200q.p201a.p202a.p205i.p208c0.p210k.C2467j0;
import p040c.p200q.p201a.p202a.p205i.p212e0.C2512a;
import p040c.p200q.p201a.p202a.p205i.p215y.p216a.C2564b;
import p040c.p200q.p201a.p202a.p205i.p215y.p216a.C2566d;
import p625h.p626a.C9381a;

/* renamed from: c.q.a.a.i.c0.i */
/* compiled from: SchedulingModule_WorkSchedulerFactory */
public final class C2419i implements C2564b<C2445x> {

    /* renamed from: a */
    public final C9381a<Context> f2765a;

    /* renamed from: b */
    public final C9381a<C2467j0> f2766b;

    /* renamed from: c */
    public final C9381a<SchedulerConfig> f2767c;

    /* renamed from: d */
    public final C9381a<C2512a> f2768d;

    public C2419i(C9381a<Context> aVar, C9381a<C2467j0> aVar2, C9381a<SchedulerConfig> aVar3, C9381a<C2512a> aVar4) {
        this.f2765a = aVar;
        this.f2766b = aVar2;
        this.f2767c = aVar3;
        this.f2768d = aVar4;
    }

    /* renamed from: a */
    public static C2419i m4257a(C9381a<Context> aVar, C9381a<C2467j0> aVar2, C9381a<SchedulerConfig> aVar3, C9381a<C2512a> aVar4) {
        return new C2419i(aVar, aVar2, aVar3, aVar4);
    }

    /* renamed from: c */
    public static C2445x m4258c(Context context, C2467j0 j0Var, SchedulerConfig schedulerConfig, C2512a aVar) {
        C2445x a = C2418h.m4256a(context, j0Var, schedulerConfig, aVar);
        C2566d.m4600c(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    /* renamed from: b */
    public C2445x get() {
        return m4258c(this.f2765a.get(), this.f2766b.get(), this.f2767c.get(), this.f2768d.get());
    }
}
