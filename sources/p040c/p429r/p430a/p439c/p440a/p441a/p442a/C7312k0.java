package p040c.p429r.p430a.p439c.p440a.p441a.p442a;

import com.hisense.connect_life.hismart.HiSmartCallback;
import com.hisense.connect_life.hismart.model.JuCustomResult;
import com.hisense.connect_life.hismart.networks.request.account.AccountServiceImpl;
import p553f.p594c.p601r.C9217e;

/* renamed from: c.r.a.c.a.a.a.k0 */
/* compiled from: lambda */
public final /* synthetic */ class C7312k0 implements C9217e {

    /* renamed from: e */
    public final /* synthetic */ AccountServiceImpl f13962e;

    /* renamed from: l */
    public final /* synthetic */ HiSmartCallback f13963l;

    public /* synthetic */ C7312k0(AccountServiceImpl accountServiceImpl, HiSmartCallback hiSmartCallback) {
        this.f13962e = accountServiceImpl;
        this.f13963l = hiSmartCallback;
    }

    public final void accept(Object obj) {
        AccountServiceImpl.m26951login$lambda8(this.f13962e, this.f13963l, (JuCustomResult) obj);
    }
}
