package p040c.p429r.p430a.p439c.p440a.p441a.p442a;

import com.hisense.connect_life.hismart.model.JuCustomResult;
import com.hisense.connect_life.hismart.networks.request.account.AccountServiceImpl;
import kotlin.jvm.functions.Function1;
import p553f.p594c.p601r.C9217e;

/* renamed from: c.r.a.c.a.a.a.r */
/* compiled from: lambda */
public final /* synthetic */ class C7325r implements C9217e {

    /* renamed from: e */
    public final /* synthetic */ Function1 f13988e;

    /* renamed from: l */
    public final /* synthetic */ AccountServiceImpl f13989l;

    public /* synthetic */ C7325r(Function1 function1, AccountServiceImpl accountServiceImpl) {
        this.f13988e = function1;
        this.f13989l = accountServiceImpl;
    }

    public final void accept(Object obj) {
        AccountServiceImpl.m26927addUserProfile$lambda22(this.f13988e, this.f13989l, (JuCustomResult) obj);
    }
}
