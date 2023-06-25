package p040c.p200q.p201a.p202a.p205i.p208c0;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import p040c.p200q.p201a.p202a.p205i.p212e0.C2512a;
import p040c.p200q.p201a.p202a.p205i.p215y.p216a.C2564b;
import p040c.p200q.p201a.p202a.p205i.p215y.p216a.C2566d;
import p625h.p626a.C9381a;

/* renamed from: c.q.a.a.i.c0.g */
/* compiled from: SchedulingConfigModule_ConfigFactory */
public final class C2417g implements C2564b<SchedulerConfig> {

    /* renamed from: a */
    public final C9381a<C2512a> f2764a;

    public C2417g(C9381a<C2512a> aVar) {
        this.f2764a = aVar;
    }

    /* renamed from: a */
    public static SchedulerConfig m4253a(C2512a aVar) {
        SchedulerConfig a = C2416f.m4252a(aVar);
        C2566d.m4600c(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    /* renamed from: b */
    public static C2417g m4254b(C9381a<C2512a> aVar) {
        return new C2417g(aVar);
    }

    /* renamed from: c */
    public SchedulerConfig get() {
        return m4253a(this.f2764a.get());
    }
}
