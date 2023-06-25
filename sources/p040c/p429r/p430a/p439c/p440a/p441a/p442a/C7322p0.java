package p040c.p429r.p430a.p439c.p440a.p441a.p442a;

import com.hisense.connect_life.hismart.networks.request.account.AccountServiceImpl;
import kotlin.jvm.functions.Function1;
import p553f.p594c.p601r.C9217e;

/* renamed from: c.r.a.c.a.a.a.p0 */
/* compiled from: lambda */
public final /* synthetic */ class C7322p0 implements C9217e {

    /* renamed from: e */
    public final /* synthetic */ Function1 f13982e;

    /* renamed from: l */
    public final /* synthetic */ AccountServiceImpl f13983l;

    public /* synthetic */ C7322p0(Function1 function1, AccountServiceImpl accountServiceImpl) {
        this.f13982e = function1;
        this.f13983l = accountServiceImpl;
    }

    public final void accept(Object obj) {
        AccountServiceImpl.m26940deleteAccount$lambda33(this.f13982e, this.f13983l, (Throwable) obj);
    }
}
