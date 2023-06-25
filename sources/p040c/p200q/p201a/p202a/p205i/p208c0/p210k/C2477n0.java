package p040c.p200q.p201a.p202a.p205i.p208c0.p210k;

import android.content.Context;
import p040c.p200q.p201a.p202a.p205i.p215y.p216a.C2564b;
import p040c.p200q.p201a.p202a.p205i.p215y.p216a.C2566d;
import p625h.p626a.C9381a;

/* renamed from: c.q.a.a.i.c0.k.n0 */
/* compiled from: EventStoreModule_PackageNameFactory */
public final class C2477n0 implements C2564b<String> {

    /* renamed from: a */
    public final C9381a<Context> f2890a;

    public C2477n0(C9381a<Context> aVar) {
        this.f2890a = aVar;
    }

    /* renamed from: a */
    public static C2477n0 m4351a(C9381a<Context> aVar) {
        return new C2477n0(aVar);
    }

    /* renamed from: c */
    public static String m4352c(Context context) {
        String b = C2472l0.m4344b(context);
        C2566d.m4600c(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }

    /* renamed from: b */
    public String get() {
        return m4352c(this.f2890a.get());
    }
}
