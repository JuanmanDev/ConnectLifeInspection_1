package p040c.p429r.p430a.p439c.p440a.p441a.p442a;

import com.hisense.connect_life.hismart.HiSmartCallback;
import com.hisense.connect_life.hismart.networks.request.account.AccountServiceImpl;
import p553f.p594c.p601r.C9217e;

/* renamed from: c.r.a.c.a.a.a.j */
/* compiled from: lambda */
public final /* synthetic */ class C7309j implements C9217e {

    /* renamed from: e */
    public final /* synthetic */ HiSmartCallback f13956e;

    /* renamed from: l */
    public final /* synthetic */ AccountServiceImpl f13957l;

    public /* synthetic */ C7309j(HiSmartCallback hiSmartCallback, AccountServiceImpl accountServiceImpl) {
        this.f13956e = hiSmartCallback;
        this.f13957l = accountServiceImpl;
    }

    public final void accept(Object obj) {
        AccountServiceImpl.m26966sendVerificationCode$lambda21(this.f13956e, this.f13957l, (Throwable) obj);
    }
}
