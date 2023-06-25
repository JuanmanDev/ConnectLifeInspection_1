package p040c.p429r.p430a.p439c.p440a.p441a.p442a;

import com.hisense.connect_life.hismart.HiSmartCallback;
import com.hisense.connect_life.hismart.model.JuCustomResult;
import com.hisense.connect_life.hismart.networks.request.account.AccountServiceImpl;
import p553f.p594c.p601r.C9217e;

/* renamed from: c.r.a.c.a.a.a.d0 */
/* compiled from: lambda */
public final /* synthetic */ class C7298d0 implements C9217e {

    /* renamed from: e */
    public final /* synthetic */ AccountServiceImpl f13936e;

    /* renamed from: l */
    public final /* synthetic */ HiSmartCallback f13937l;

    public /* synthetic */ C7298d0(AccountServiceImpl accountServiceImpl, HiSmartCallback hiSmartCallback) {
        this.f13936e = accountServiceImpl;
        this.f13937l = hiSmartCallback;
    }

    public final void accept(Object obj) {
        AccountServiceImpl.m26933checkPass$lambda53(this.f13936e, this.f13937l, (JuCustomResult) obj);
    }
}
