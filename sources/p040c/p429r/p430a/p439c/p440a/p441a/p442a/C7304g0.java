package p040c.p429r.p430a.p439c.p440a.p441a.p442a;

import com.hisense.connect_life.hismart.HiSmartCallback;
import com.hisense.connect_life.hismart.networks.request.account.AccountServiceImpl;
import p553f.p594c.p601r.C9217e;

/* renamed from: c.r.a.c.a.a.a.g0 */
/* compiled from: lambda */
public final /* synthetic */ class C7304g0 implements C9217e {

    /* renamed from: e */
    public final /* synthetic */ HiSmartCallback f13947e;

    /* renamed from: l */
    public final /* synthetic */ AccountServiceImpl f13948l;

    public /* synthetic */ C7304g0(HiSmartCallback hiSmartCallback, AccountServiceImpl accountServiceImpl) {
        this.f13947e = hiSmartCallback;
        this.f13948l = accountServiceImpl;
    }

    public final void accept(Object obj) {
        AccountServiceImpl.m26970thirdSignIn$lambda3(this.f13947e, this.f13948l, (Throwable) obj);
    }
}
