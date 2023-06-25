package p040c.p429r.p430a.p439c.p440a.p441a.p442a;

import com.hisense.connect_life.hismart.model.JuCustomResult;
import com.hisense.connect_life.hismart.networks.request.account.AccountServiceImpl;
import kotlin.jvm.functions.Function1;
import p553f.p594c.p601r.C9217e;

/* renamed from: c.r.a.c.a.a.a.b */
/* compiled from: lambda */
public final /* synthetic */ class C7292b implements C9217e {

    /* renamed from: e */
    public final /* synthetic */ AccountServiceImpl f13924e;

    /* renamed from: l */
    public final /* synthetic */ Function1 f13925l;

    public /* synthetic */ C7292b(AccountServiceImpl accountServiceImpl, Function1 function1) {
        this.f13924e = accountServiceImpl;
        this.f13925l = function1;
    }

    public final void accept(Object obj) {
        AccountServiceImpl.m26939deleteAccount$lambda32(this.f13924e, this.f13925l, (JuCustomResult) obj);
    }
}
