package p040c.p200q.p201a.p202a.p205i;

import java.util.concurrent.Executor;
import p040c.p200q.p201a.p202a.p205i.p215y.p216a.C2564b;
import p040c.p200q.p201a.p202a.p205i.p215y.p216a.C2566d;

/* renamed from: c.q.a.a.i.l */
/* compiled from: ExecutionModule_ExecutorFactory */
public final class C2530l implements C2564b<Executor> {

    /* renamed from: c.q.a.a.i.l$a */
    /* compiled from: ExecutionModule_ExecutorFactory */
    public static final class C2531a {

        /* renamed from: a */
        public static final C2530l f2970a = new C2530l();
    }

    /* renamed from: a */
    public static C2530l m4510a() {
        return C2531a.f2970a;
    }

    /* renamed from: b */
    public static Executor m4511b() {
        Executor a = C2529k.m4509a();
        C2566d.m4600c(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    /* renamed from: c */
    public Executor get() {
        return m4511b();
    }
}
