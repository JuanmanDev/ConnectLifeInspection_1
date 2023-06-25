package p040c.p200q.p201a.p202a.p205i.p214x;

import android.content.Context;
import p040c.p200q.p201a.p202a.p205i.p212e0.C2512a;
import p040c.p200q.p201a.p202a.p205i.p215y.p216a.C2564b;
import p625h.p626a.C9381a;

/* renamed from: c.q.a.a.i.x.i */
/* compiled from: CreationContextFactory_Factory */
public final class C2558i implements C2564b<C2557h> {

    /* renamed from: a */
    public final C9381a<Context> f3005a;

    /* renamed from: b */
    public final C9381a<C2512a> f3006b;

    /* renamed from: c */
    public final C9381a<C2512a> f3007c;

    public C2558i(C9381a<Context> aVar, C9381a<C2512a> aVar2, C9381a<C2512a> aVar3) {
        this.f3005a = aVar;
        this.f3006b = aVar2;
        this.f3007c = aVar3;
    }

    /* renamed from: a */
    public static C2558i m4583a(C9381a<Context> aVar, C9381a<C2512a> aVar2, C9381a<C2512a> aVar3) {
        return new C2558i(aVar, aVar2, aVar3);
    }

    /* renamed from: c */
    public static C2557h m4584c(Context context, C2512a aVar, C2512a aVar2) {
        return new C2557h(context, aVar, aVar2);
    }

    /* renamed from: b */
    public C2557h get() {
        return m4584c(this.f3005a.get(), this.f3006b.get(), this.f3007c.get());
    }
}
