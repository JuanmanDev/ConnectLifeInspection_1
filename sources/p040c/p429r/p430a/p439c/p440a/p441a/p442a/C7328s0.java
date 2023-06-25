package p040c.p429r.p430a.p439c.p440a.p441a.p442a;

import com.hisense.connect_life.hismart.model.JuCustomResult;
import com.hisense.connect_life.hismart.networks.request.account.AccountServiceImpl;
import kotlin.jvm.functions.Function1;
import p553f.p594c.p601r.C9217e;

/* renamed from: c.r.a.c.a.a.a.s0 */
/* compiled from: lambda */
public final /* synthetic */ class C7328s0 implements C9217e {

    /* renamed from: e */
    public final /* synthetic */ AccountServiceImpl f13994e;

    /* renamed from: l */
    public final /* synthetic */ Function1 f13995l;

    public /* synthetic */ C7328s0(AccountServiceImpl accountServiceImpl, Function1 function1) {
        this.f13994e = accountServiceImpl;
        this.f13995l = function1;
    }

    public final void accept(Object obj) {
        AccountServiceImpl.m26973updateJHLUserRegisterProtocol$lambda43(this.f13994e, this.f13995l, (JuCustomResult) obj);
    }
}
