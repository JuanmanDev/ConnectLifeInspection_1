package p040c.p429r.p430a.p439c.p440a.p441a.p442a;

import com.hisense.connect_life.hismart.networks.request.account.AccountServiceImpl;
import kotlin.jvm.functions.Function1;
import p553f.p594c.p601r.C9217e;

/* renamed from: c.r.a.c.a.a.a.h0 */
/* compiled from: lambda */
public final /* synthetic */ class C7306h0 implements C9217e {

    /* renamed from: e */
    public final /* synthetic */ Function1 f13951e;

    /* renamed from: l */
    public final /* synthetic */ AccountServiceImpl f13952l;

    public /* synthetic */ C7306h0(Function1 function1, AccountServiceImpl accountServiceImpl) {
        this.f13951e = function1;
        this.f13952l = accountServiceImpl;
    }

    public final void accept(Object obj) {
        AccountServiceImpl.m26964saveLoginLog$lambda50(this.f13951e, this.f13952l, (Throwable) obj);
    }
}
