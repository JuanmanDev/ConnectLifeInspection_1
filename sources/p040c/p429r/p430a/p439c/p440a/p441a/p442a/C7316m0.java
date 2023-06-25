package p040c.p429r.p430a.p439c.p440a.p441a.p442a;

import com.hisense.connect_life.hismart.model.JuCustomResult;
import com.hisense.connect_life.hismart.networks.request.account.AccountServiceImpl;
import kotlin.jvm.functions.Function1;
import p553f.p594c.p601r.C9217e;

/* renamed from: c.r.a.c.a.a.a.m0 */
/* compiled from: lambda */
public final /* synthetic */ class C7316m0 implements C9217e {

    /* renamed from: e */
    public final /* synthetic */ AccountServiceImpl f13970e;

    /* renamed from: l */
    public final /* synthetic */ Function1 f13971l;

    public /* synthetic */ C7316m0(AccountServiceImpl accountServiceImpl, Function1 function1) {
        this.f13970e = accountServiceImpl;
        this.f13971l = function1;
    }

    public final void accept(Object obj) {
        AccountServiceImpl.m26941deleteUserData$lambda47(this.f13970e, this.f13971l, (JuCustomResult) obj);
    }
}
