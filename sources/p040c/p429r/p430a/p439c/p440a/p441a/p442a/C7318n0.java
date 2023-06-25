package p040c.p429r.p430a.p439c.p440a.p441a.p442a;

import com.hisense.connect_life.hismart.HiSmartCallback;
import com.hisense.connect_life.hismart.networks.request.account.AccountServiceImpl;
import p553f.p594c.p601r.C9217e;

/* renamed from: c.r.a.c.a.a.a.n0 */
/* compiled from: lambda */
public final /* synthetic */ class C7318n0 implements C9217e {

    /* renamed from: e */
    public final /* synthetic */ HiSmartCallback f13974e;

    /* renamed from: l */
    public final /* synthetic */ AccountServiceImpl f13975l;

    public /* synthetic */ C7318n0(HiSmartCallback hiSmartCallback, AccountServiceImpl accountServiceImpl) {
        this.f13974e = hiSmartCallback;
        this.f13975l = accountServiceImpl;
    }

    public final void accept(Object obj) {
        AccountServiceImpl.m26952login$lambda9(this.f13974e, this.f13975l, (Throwable) obj);
    }
}
