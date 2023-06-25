package p040c.p429r.p430a.p439c.p440a.p441a.p442a;

import com.hisense.connect_life.hismart.HiSmartCallback;
import com.hisense.connect_life.hismart.model.JuCustomResult;
import com.hisense.connect_life.hismart.networks.request.account.AccountServiceImpl;
import p553f.p594c.p601r.C9217e;

/* renamed from: c.r.a.c.a.a.a.a1 */
/* compiled from: lambda */
public final /* synthetic */ class C7291a1 implements C9217e {

    /* renamed from: e */
    public final /* synthetic */ AccountServiceImpl f13922e;

    /* renamed from: l */
    public final /* synthetic */ HiSmartCallback f13923l;

    public /* synthetic */ C7291a1(AccountServiceImpl accountServiceImpl, HiSmartCallback hiSmartCallback) {
        this.f13922e = accountServiceImpl;
        this.f13923l = hiSmartCallback;
    }

    public final void accept(Object obj) {
        AccountServiceImpl.m26955refreshToken$lambda14(this.f13922e, this.f13923l, (JuCustomResult) obj);
    }
}
