package p040c.p429r.p430a.p439c.p440a.p441a.p442a;

import com.hisense.connect_life.hismart.HiSmartCallback;
import com.hisense.connect_life.hismart.model.JuCustomResult;
import com.hisense.connect_life.hismart.networks.request.account.AccountServiceImpl;
import p553f.p594c.p601r.C9217e;

/* renamed from: c.r.a.c.a.a.a.w0 */
/* compiled from: lambda */
public final /* synthetic */ class C7336w0 implements C9217e {

    /* renamed from: e */
    public final /* synthetic */ AccountServiceImpl f14009e;

    /* renamed from: l */
    public final /* synthetic */ HiSmartCallback f14010l;

    public /* synthetic */ C7336w0(AccountServiceImpl accountServiceImpl, HiSmartCallback hiSmartCallback) {
        this.f14009e = accountServiceImpl;
        this.f14010l = hiSmartCallback;
    }

    public final void accept(Object obj) {
        AccountServiceImpl.m26931checkLoginNameSign$lambda34(this.f14009e, this.f14010l, (JuCustomResult) obj);
    }
}
