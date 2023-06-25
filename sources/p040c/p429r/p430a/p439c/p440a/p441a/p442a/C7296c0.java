package p040c.p429r.p430a.p439c.p440a.p441a.p442a;

import com.hisense.connect_life.hismart.model.JuCustomResult;
import com.hisense.connect_life.hismart.networks.request.account.AccountServiceImpl;
import kotlin.jvm.functions.Function1;
import p553f.p594c.p601r.C9217e;

/* renamed from: c.r.a.c.a.a.a.c0 */
/* compiled from: lambda */
public final /* synthetic */ class C7296c0 implements C9217e {

    /* renamed from: e */
    public final /* synthetic */ AccountServiceImpl f13931e;

    /* renamed from: l */
    public final /* synthetic */ Function1 f13932l;

    /* renamed from: m */
    public final /* synthetic */ Function1 f13933m;

    public /* synthetic */ C7296c0(AccountServiceImpl accountServiceImpl, Function1 function1, Function1 function12) {
        this.f13931e = accountServiceImpl;
        this.f13932l = function1;
        this.f13933m = function12;
    }

    public final void accept(Object obj) {
        AccountServiceImpl.m26947getJHLUserProtocolInfo$lambda41(this.f13931e, this.f13932l, this.f13933m, (JuCustomResult) obj);
    }
}
