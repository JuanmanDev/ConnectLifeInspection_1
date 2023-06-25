package p040c.p429r.p430a.p439c.p440a.p441a.p442a;

import com.hisense.connect_life.hismart.HiSmartCallback;
import com.hisense.connect_life.hismart.model.JuCustomResult;
import com.hisense.connect_life.hismart.networks.request.account.AccountServiceImpl;
import p553f.p594c.p601r.C9217e;

/* renamed from: c.r.a.c.a.a.a.b1 */
/* compiled from: lambda */
public final /* synthetic */ class C7294b1 implements C9217e {

    /* renamed from: e */
    public final /* synthetic */ AccountServiceImpl f13928e;

    /* renamed from: l */
    public final /* synthetic */ HiSmartCallback f13929l;

    public /* synthetic */ C7294b1(AccountServiceImpl accountServiceImpl, HiSmartCallback hiSmartCallback) {
        this.f13928e = accountServiceImpl;
        this.f13929l = hiSmartCallback;
    }

    public final void accept(Object obj) {
        AccountServiceImpl.m26977updateUserEmail$lambda51(this.f13928e, this.f13929l, (JuCustomResult) obj);
    }
}
