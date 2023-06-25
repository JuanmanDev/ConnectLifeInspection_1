package p040c.p429r.p430a.p439c.p440a.p441a.p445d;

import com.hisense.connect_life.hismart.HiSmartCallback;
import com.hisense.connect_life.hismart.networks.request.config.ConfigServiceImpl;
import com.hisense.connect_life.hismart.networks.request.config.model.ConfigParsCom;
import p553f.p594c.p601r.C9217e;

/* renamed from: c.r.a.c.a.a.d.a */
/* compiled from: lambda */
public final /* synthetic */ class C7347a implements C9217e {

    /* renamed from: e */
    public final /* synthetic */ ConfigServiceImpl f14025e;

    /* renamed from: l */
    public final /* synthetic */ HiSmartCallback f14026l;

    public /* synthetic */ C7347a(ConfigServiceImpl configServiceImpl, HiSmartCallback hiSmartCallback) {
        this.f14025e = configServiceImpl;
        this.f14026l = hiSmartCallback;
    }

    public final void accept(Object obj) {
        ConfigServiceImpl.m26989getNetStatus$lambda2(this.f14025e, this.f14026l, (ConfigParsCom) obj);
    }
}
