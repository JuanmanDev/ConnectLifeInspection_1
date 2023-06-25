package p040c.p429r.p430a.p439c.p440a.p441a.p442a;

import com.hisense.connect_life.hismart.HiSmartCallback;
import com.hisense.connect_life.hismart.networks.request.account.AccountServiceImpl;
import p553f.p594c.p601r.C9217e;

/* renamed from: c.r.a.c.a.a.a.n */
/* compiled from: lambda */
public final /* synthetic */ class C7317n implements C9217e {

    /* renamed from: e */
    public final /* synthetic */ HiSmartCallback f13972e;

    /* renamed from: l */
    public final /* synthetic */ AccountServiceImpl f13973l;

    public /* synthetic */ C7317n(HiSmartCallback hiSmartCallback, AccountServiceImpl accountServiceImpl) {
        this.f13972e = hiSmartCallback;
        this.f13973l = accountServiceImpl;
    }

    public final void accept(Object obj) {
        AccountServiceImpl.m26958register$lambda1(this.f13972e, this.f13973l, (Throwable) obj);
    }
}
