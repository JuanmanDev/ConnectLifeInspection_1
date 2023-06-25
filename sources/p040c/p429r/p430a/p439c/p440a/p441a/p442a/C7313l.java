package p040c.p429r.p430a.p439c.p440a.p441a.p442a;

import com.hisense.connect_life.hismart.networks.request.account.AccountServiceImpl;
import kotlin.jvm.functions.Function1;
import p553f.p594c.p601r.C9217e;

/* renamed from: c.r.a.c.a.a.a.l */
/* compiled from: lambda */
public final /* synthetic */ class C7313l implements C9217e {

    /* renamed from: e */
    public final /* synthetic */ Function1 f13964e;

    /* renamed from: l */
    public final /* synthetic */ AccountServiceImpl f13965l;

    public /* synthetic */ C7313l(Function1 function1, AccountServiceImpl accountServiceImpl) {
        this.f13964e = function1;
        this.f13965l = accountServiceImpl;
    }

    public final void accept(Object obj) {
        AccountServiceImpl.m26928addUserProfile$lambda23(this.f13964e, this.f13965l, (Throwable) obj);
    }
}
