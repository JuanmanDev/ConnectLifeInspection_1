package p040c.p429r.p430a.p439c.p440a.p441a.p442a;

import com.hisense.connect_life.hismart.HiSmartCallback;
import com.hisense.connect_life.hismart.model.JuCustomResult;
import com.hisense.connect_life.hismart.networks.request.account.AccountServiceImpl;
import p553f.p594c.p601r.C9217e;

/* renamed from: c.r.a.c.a.a.a.o0 */
/* compiled from: lambda */
public final /* synthetic */ class C7320o0 implements C9217e {

    /* renamed from: e */
    public final /* synthetic */ AccountServiceImpl f13978e;

    /* renamed from: l */
    public final /* synthetic */ HiSmartCallback f13979l;

    public /* synthetic */ C7320o0(AccountServiceImpl accountServiceImpl, HiSmartCallback hiSmartCallback) {
        this.f13978e = accountServiceImpl;
        this.f13979l = hiSmartCallback;
    }

    public final void accept(Object obj) {
        AccountServiceImpl.m26929checkAuthCode$lambda10(this.f13978e, this.f13979l, (JuCustomResult) obj);
    }
}
