package p040c.p429r.p430a.p439c.p440a.p441a.p442a;

import com.hisense.connect_life.hismart.HiSmartCallback;
import com.hisense.connect_life.hismart.networks.request.account.AccountServiceImpl;
import p553f.p594c.p601r.C9217e;

/* renamed from: c.r.a.c.a.a.a.a */
/* compiled from: lambda */
public final /* synthetic */ class C7289a implements C9217e {

    /* renamed from: e */
    public final /* synthetic */ HiSmartCallback f13918e;

    /* renamed from: l */
    public final /* synthetic */ AccountServiceImpl f13919l;

    public /* synthetic */ C7289a(HiSmartCallback hiSmartCallback, AccountServiceImpl accountServiceImpl) {
        this.f13918e = hiSmartCallback;
        this.f13919l = accountServiceImpl;
    }

    public final void accept(Object obj) {
        AccountServiceImpl.m26930checkAuthCode$lambda11(this.f13918e, this.f13919l, (Throwable) obj);
    }
}
