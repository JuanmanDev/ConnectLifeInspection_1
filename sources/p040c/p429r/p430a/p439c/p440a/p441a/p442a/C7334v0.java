package p040c.p429r.p430a.p439c.p440a.p441a.p442a;

import com.hisense.connect_life.hismart.HiSmartCallback;
import com.hisense.connect_life.hismart.model.JuCustomResult;
import com.hisense.connect_life.hismart.networks.request.account.AccountServiceImpl;
import p553f.p594c.p601r.C9217e;

/* renamed from: c.r.a.c.a.a.a.v0 */
/* compiled from: lambda */
public final /* synthetic */ class C7334v0 implements C9217e {

    /* renamed from: e */
    public final /* synthetic */ AccountServiceImpl f14005e;

    /* renamed from: l */
    public final /* synthetic */ HiSmartCallback f14006l;

    public /* synthetic */ C7334v0(AccountServiceImpl accountServiceImpl, HiSmartCallback hiSmartCallback) {
        this.f14005e = accountServiceImpl;
        this.f14006l = hiSmartCallback;
    }

    public final void accept(Object obj) {
        AccountServiceImpl.m26953logout$lambda12(this.f14005e, this.f14006l, (JuCustomResult) obj);
    }
}
