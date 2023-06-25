package p040c.p429r.p430a.p439c.p440a.p441a.p442a;

import com.hisense.connect_life.hismart.HiSmartCallback;
import com.hisense.connect_life.hismart.model.JuCustomResult;
import com.hisense.connect_life.hismart.networks.request.account.AccountServiceImpl;
import p553f.p594c.p601r.C9217e;

/* renamed from: c.r.a.c.a.a.a.y0 */
/* compiled from: lambda */
public final /* synthetic */ class C7340y0 implements C9217e {

    /* renamed from: e */
    public final /* synthetic */ AccountServiceImpl f14016e;

    /* renamed from: l */
    public final /* synthetic */ HiSmartCallback f14017l;

    public /* synthetic */ C7340y0(AccountServiceImpl accountServiceImpl, HiSmartCallback hiSmartCallback) {
        this.f14016e = accountServiceImpl;
        this.f14017l = hiSmartCallback;
    }

    public final void accept(Object obj) {
        AccountServiceImpl.m26969thirdSignIn$lambda2(this.f14016e, this.f14017l, (JuCustomResult) obj);
    }
}
