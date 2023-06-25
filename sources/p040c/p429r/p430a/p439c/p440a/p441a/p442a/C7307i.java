package p040c.p429r.p430a.p439c.p440a.p441a.p442a;

import com.hisense.connect_life.hismart.HiSmartCallback;
import com.hisense.connect_life.hismart.networks.request.account.AccountServiceImpl;
import p553f.p594c.p601r.C9217e;

/* renamed from: c.r.a.c.a.a.a.i */
/* compiled from: lambda */
public final /* synthetic */ class C7307i implements C9217e {

    /* renamed from: e */
    public final /* synthetic */ HiSmartCallback f13953e;

    /* renamed from: l */
    public final /* synthetic */ AccountServiceImpl f13954l;

    public /* synthetic */ C7307i(HiSmartCallback hiSmartCallback, AccountServiceImpl accountServiceImpl) {
        this.f13953e = hiSmartCallback;
        this.f13954l = accountServiceImpl;
    }

    public final void accept(Object obj) {
        AccountServiceImpl.m26962resetPasswordByOldPsw$lambda19(this.f13953e, this.f13954l, (Throwable) obj);
    }
}
