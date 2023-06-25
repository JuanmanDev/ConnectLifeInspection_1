package p040c.p429r.p430a.p439c.p440a.p441a.p442a;

import com.hisense.connect_life.hismart.HiSmartCallback;
import com.hisense.connect_life.hismart.networks.request.account.AccountServiceImpl;
import p553f.p594c.p601r.C9217e;

/* renamed from: c.r.a.c.a.a.a.d */
/* compiled from: lambda */
public final /* synthetic */ class C7297d implements C9217e {

    /* renamed from: e */
    public final /* synthetic */ HiSmartCallback f13934e;

    /* renamed from: l */
    public final /* synthetic */ AccountServiceImpl f13935l;

    public /* synthetic */ C7297d(HiSmartCallback hiSmartCallback, AccountServiceImpl accountServiceImpl) {
        this.f13934e = hiSmartCallback;
        this.f13935l = accountServiceImpl;
    }

    public final void accept(Object obj) {
        AccountServiceImpl.m26960resetPassword$lambda17(this.f13934e, this.f13935l, (Throwable) obj);
    }
}
