package p040c.p200q.p201a.p202a.p205i.p214x;

import android.content.Context;
import p040c.p200q.p201a.p202a.p205i.p215y.p216a.C2564b;
import p625h.p626a.C9381a;

/* renamed from: c.q.a.a.i.x.k */
/* compiled from: MetadataBackendRegistry_Factory */
public final class C2561k implements C2564b<C2559j> {

    /* renamed from: a */
    public final C9381a<Context> f3013a;

    /* renamed from: b */
    public final C9381a<C2557h> f3014b;

    public C2561k(C9381a<Context> aVar, C9381a<C2557h> aVar2) {
        this.f3013a = aVar;
        this.f3014b = aVar2;
    }

    /* renamed from: a */
    public static C2561k m4590a(C9381a<Context> aVar, C9381a<C2557h> aVar2) {
        return new C2561k(aVar, aVar2);
    }

    /* renamed from: c */
    public static C2559j m4591c(Context context, Object obj) {
        return new C2559j(context, (C2557h) obj);
    }

    /* renamed from: b */
    public C2559j get() {
        return m4591c(this.f3013a.get(), this.f3014b.get());
    }
}
