package p040c.p429r.p430a.p439c.p440a.p441a.p442a;

import com.hisense.connect_life.hismart.model.JuCustomResult;
import com.hisense.connect_life.hismart.networks.request.account.AccountServiceImpl;
import kotlin.jvm.functions.Function1;
import p553f.p594c.p601r.C9217e;

/* renamed from: c.r.a.c.a.a.a.e */
/* compiled from: lambda */
public final /* synthetic */ class C7299e implements C9217e {

    /* renamed from: e */
    public final /* synthetic */ AccountServiceImpl f13938e;

    /* renamed from: l */
    public final /* synthetic */ Function1 f13939l;

    public /* synthetic */ C7299e(AccountServiceImpl accountServiceImpl, Function1 function1) {
        this.f13938e = accountServiceImpl;
        this.f13939l = function1;
    }

    public final void accept(Object obj) {
        AccountServiceImpl.m26963saveLoginLog$lambda49(this.f13938e, this.f13939l, (JuCustomResult) obj);
    }
}
