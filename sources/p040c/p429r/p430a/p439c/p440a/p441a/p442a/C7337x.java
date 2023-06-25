package p040c.p429r.p430a.p439c.p440a.p441a.p442a;

import com.hisense.connect_life.hismart.networks.request.account.AccountServiceImpl;
import kotlin.jvm.functions.Function1;
import p553f.p594c.p601r.C9217e;

/* renamed from: c.r.a.c.a.a.a.x */
/* compiled from: lambda */
public final /* synthetic */ class C7337x implements C9217e {

    /* renamed from: e */
    public final /* synthetic */ Function1 f14011e;

    /* renamed from: l */
    public final /* synthetic */ AccountServiceImpl f14012l;

    public /* synthetic */ C7337x(Function1 function1, AccountServiceImpl accountServiceImpl) {
        this.f14011e = function1;
        this.f14012l = accountServiceImpl;
    }

    public final void accept(Object obj) {
        AccountServiceImpl.m26942deleteUserData$lambda48(this.f14011e, this.f14012l, (Throwable) obj);
    }
}
