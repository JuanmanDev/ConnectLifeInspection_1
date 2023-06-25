package p040c.p429r.p430a.p439c.p440a.p441a.p442a;

import com.hisense.connect_life.hismart.HiSmartCallback;
import com.hisense.connect_life.hismart.networks.request.account.AccountServiceImpl;
import p553f.p594c.p601r.C9217e;

/* renamed from: c.r.a.c.a.a.a.q0 */
/* compiled from: lambda */
public final /* synthetic */ class C7324q0 implements C9217e {

    /* renamed from: e */
    public final /* synthetic */ HiSmartCallback f13986e;

    /* renamed from: l */
    public final /* synthetic */ AccountServiceImpl f13987l;

    public /* synthetic */ C7324q0(HiSmartCallback hiSmartCallback, AccountServiceImpl accountServiceImpl) {
        this.f13986e = hiSmartCallback;
        this.f13987l = accountServiceImpl;
    }

    public final void accept(Object obj) {
        AccountServiceImpl.m26978updateUserEmail$lambda52(this.f13986e, this.f13987l, (Throwable) obj);
    }
}
