package p040c.p429r.p430a.p439c.p440a.p441a.p442a;

import com.hisense.connect_life.hismart.HiSmartCallback;
import com.hisense.connect_life.hismart.networks.request.account.AccountServiceImpl;
import p553f.p594c.p601r.C9217e;

/* renamed from: c.r.a.c.a.a.a.p */
/* compiled from: lambda */
public final /* synthetic */ class C7321p implements C9217e {

    /* renamed from: e */
    public final /* synthetic */ HiSmartCallback f13980e;

    /* renamed from: l */
    public final /* synthetic */ AccountServiceImpl f13981l;

    public /* synthetic */ C7321p(HiSmartCallback hiSmartCallback, AccountServiceImpl accountServiceImpl) {
        this.f13980e = hiSmartCallback;
        this.f13981l = accountServiceImpl;
    }

    public final void accept(Object obj) {
        AccountServiceImpl.m26934checkPass$lambda54(this.f13980e, this.f13981l, (Throwable) obj);
    }
}
