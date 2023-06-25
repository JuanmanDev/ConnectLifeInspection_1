package p040c.p429r.p430a.p439c.p440a.p441a.p442a;

import com.hisense.connect_life.hismart.HiSmartCallback;
import com.hisense.connect_life.hismart.model.JuCustomResult;
import com.hisense.connect_life.hismart.networks.request.account.AccountServiceImpl;
import p553f.p594c.p601r.C9217e;

/* renamed from: c.r.a.c.a.a.a.u */
/* compiled from: lambda */
public final /* synthetic */ class C7331u implements C9217e {

    /* renamed from: e */
    public final /* synthetic */ AccountServiceImpl f14000e;

    /* renamed from: l */
    public final /* synthetic */ HiSmartCallback f14001l;

    public /* synthetic */ C7331u(AccountServiceImpl accountServiceImpl, HiSmartCallback hiSmartCallback) {
        this.f14000e = accountServiceImpl;
        this.f14001l = hiSmartCallback;
    }

    public final void accept(Object obj) {
        AccountServiceImpl.m26965sendVerificationCode$lambda20(this.f14000e, this.f14001l, (JuCustomResult) obj);
    }
}
