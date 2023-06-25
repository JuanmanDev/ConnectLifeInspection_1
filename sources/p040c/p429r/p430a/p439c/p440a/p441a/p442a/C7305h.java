package p040c.p429r.p430a.p439c.p440a.p441a.p442a;

import com.hisense.connect_life.hismart.model.JuCustomResult;
import com.hisense.connect_life.hismart.networks.request.account.AccountServiceImpl;
import kotlin.jvm.functions.Function1;
import p553f.p594c.p601r.C9217e;

/* renamed from: c.r.a.c.a.a.a.h */
/* compiled from: lambda */
public final /* synthetic */ class C7305h implements C9217e {

    /* renamed from: e */
    public final /* synthetic */ AccountServiceImpl f13949e;

    /* renamed from: l */
    public final /* synthetic */ Function1 f13950l;

    public /* synthetic */ C7305h(AccountServiceImpl accountServiceImpl, Function1 function1) {
        this.f13949e = accountServiceImpl;
        this.f13950l = function1;
    }

    public final void accept(Object obj) {
        AccountServiceImpl.m26975updateProfilePhoto$lambda30(this.f13949e, this.f13950l, (JuCustomResult) obj);
    }
}
