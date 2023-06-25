package p040c.p429r.p430a.p439c.p440a.p441a.p442a;

import com.hisense.connect_life.hismart.HiSmartCallback;
import com.hisense.connect_life.hismart.model.JuCustomResult;
import com.hisense.connect_life.hismart.networks.request.account.AccountServiceImpl;
import p553f.p594c.p601r.C9217e;

/* renamed from: c.r.a.c.a.a.a.t */
/* compiled from: lambda */
public final /* synthetic */ class C7329t implements C9217e {

    /* renamed from: e */
    public final /* synthetic */ AccountServiceImpl f13996e;

    /* renamed from: l */
    public final /* synthetic */ HiSmartCallback f13997l;

    public /* synthetic */ C7329t(AccountServiceImpl accountServiceImpl, HiSmartCallback hiSmartCallback) {
        this.f13996e = accountServiceImpl;
        this.f13997l = hiSmartCallback;
    }

    public final void accept(Object obj) {
        AccountServiceImpl.m26935checkUpgrade$lambda55(this.f13996e, this.f13997l, (JuCustomResult) obj);
    }
}
