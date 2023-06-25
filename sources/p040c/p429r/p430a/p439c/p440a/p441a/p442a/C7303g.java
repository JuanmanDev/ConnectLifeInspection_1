package p040c.p429r.p430a.p439c.p440a.p441a.p442a;

import com.hisense.connect_life.hismart.HiSmartCallback;
import com.hisense.connect_life.hismart.model.JuCustomResult;
import com.hisense.connect_life.hismart.networks.request.account.AccountServiceImpl;
import p553f.p594c.p601r.C9217e;

/* renamed from: c.r.a.c.a.a.a.g */
/* compiled from: lambda */
public final /* synthetic */ class C7303g implements C9217e {

    /* renamed from: e */
    public final /* synthetic */ AccountServiceImpl f13945e;

    /* renamed from: l */
    public final /* synthetic */ HiSmartCallback f13946l;

    public /* synthetic */ C7303g(AccountServiceImpl accountServiceImpl, HiSmartCallback hiSmartCallback) {
        this.f13945e = accountServiceImpl;
        this.f13946l = hiSmartCallback;
    }

    public final void accept(Object obj) {
        AccountServiceImpl.m26961resetPasswordByOldPsw$lambda18(this.f13945e, this.f13946l, (JuCustomResult) obj);
    }
}
