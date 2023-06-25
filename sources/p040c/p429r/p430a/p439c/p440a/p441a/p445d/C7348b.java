package p040c.p429r.p430a.p439c.p440a.p441a.p445d;

import com.hisense.connect_life.hismart.HiSmartCallback;
import com.hisense.connect_life.hismart.networks.request.config.ConfigServiceImpl;
import p553f.p594c.p601r.C9217e;

/* renamed from: c.r.a.c.a.a.d.b */
/* compiled from: lambda */
public final /* synthetic */ class C7348b implements C9217e {

    /* renamed from: e */
    public final /* synthetic */ ConfigServiceImpl f14027e;

    /* renamed from: l */
    public final /* synthetic */ HiSmartCallback f14028l;

    public /* synthetic */ C7348b(ConfigServiceImpl configServiceImpl, HiSmartCallback hiSmartCallback) {
        this.f14027e = configServiceImpl;
        this.f14028l = hiSmartCallback;
    }

    public final void accept(Object obj) {
        ConfigServiceImpl.m26990getNetStatus$lambda3(this.f14027e, this.f14028l, (Throwable) obj);
    }
}
