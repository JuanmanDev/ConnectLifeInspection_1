package p040c.p200q.p201a.p202a.p205i.p208c0.p210k;

import android.content.Context;
import p040c.p200q.p201a.p202a.p205i.p215y.p216a.C2564b;
import p625h.p626a.C9381a;

/* renamed from: c.q.a.a.i.c0.k.u0 */
/* compiled from: SchemaManager_Factory */
public final class C2498u0 implements C2564b<C2495t0> {

    /* renamed from: a */
    public final C9381a<Context> f2925a;

    /* renamed from: b */
    public final C9381a<String> f2926b;

    /* renamed from: c */
    public final C9381a<Integer> f2927c;

    public C2498u0(C9381a<Context> aVar, C9381a<String> aVar2, C9381a<Integer> aVar3) {
        this.f2925a = aVar;
        this.f2926b = aVar2;
        this.f2927c = aVar3;
    }

    /* renamed from: a */
    public static C2498u0 m4439a(C9381a<Context> aVar, C9381a<String> aVar2, C9381a<Integer> aVar3) {
        return new C2498u0(aVar, aVar2, aVar3);
    }

    /* renamed from: c */
    public static C2495t0 m4440c(Context context, String str, int i) {
        return new C2495t0(context, str, i);
    }

    /* renamed from: b */
    public C2495t0 get() {
        return m4440c(this.f2925a.get(), this.f2926b.get(), this.f2927c.get().intValue());
    }
}
