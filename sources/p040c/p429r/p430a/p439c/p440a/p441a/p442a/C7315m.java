package p040c.p429r.p430a.p439c.p440a.p441a.p442a;

import com.hisense.connect_life.hismart.HiSmartCallback;
import com.hisense.connect_life.hismart.networks.request.account.AccountServiceImpl;
import p553f.p594c.p601r.C9217e;

/* renamed from: c.r.a.c.a.a.a.m */
/* compiled from: lambda */
public final /* synthetic */ class C7315m implements C9217e {

    /* renamed from: e */
    public final /* synthetic */ HiSmartCallback f13968e;

    /* renamed from: l */
    public final /* synthetic */ AccountServiceImpl f13969l;

    public /* synthetic */ C7315m(HiSmartCallback hiSmartCallback, AccountServiceImpl accountServiceImpl) {
        this.f13968e = hiSmartCallback;
        this.f13969l = accountServiceImpl;
    }

    public final void accept(Object obj) {
        AccountServiceImpl.m26956refreshToken$lambda15(this.f13968e, this.f13969l, (Throwable) obj);
    }
}
