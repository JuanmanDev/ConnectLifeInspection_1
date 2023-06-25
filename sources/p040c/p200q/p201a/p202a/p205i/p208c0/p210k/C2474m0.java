package p040c.p200q.p201a.p202a.p205i.p208c0.p210k;

import p040c.p200q.p201a.p202a.p205i.p215y.p216a.C2564b;
import p040c.p200q.p201a.p202a.p205i.p215y.p216a.C2566d;

/* renamed from: c.q.a.a.i.c0.k.m0 */
/* compiled from: EventStoreModule_DbNameFactory */
public final class C2474m0 implements C2564b<String> {

    /* renamed from: c.q.a.a.i.c0.k.m0$a */
    /* compiled from: EventStoreModule_DbNameFactory */
    public static final class C2475a {

        /* renamed from: a */
        public static final C2474m0 f2888a = new C2474m0();
    }

    /* renamed from: a */
    public static C2474m0 m4347a() {
        return C2475a.f2888a;
    }

    /* renamed from: b */
    public static String m4348b() {
        String a = C2472l0.m4343a();
        C2566d.m4600c(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    /* renamed from: c */
    public String get() {
        return m4348b();
    }
}
