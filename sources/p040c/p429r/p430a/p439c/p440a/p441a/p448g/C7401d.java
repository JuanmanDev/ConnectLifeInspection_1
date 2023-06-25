package p040c.p429r.p430a.p439c.p440a.p441a.p448g;

import com.hisense.connect_life.hismart.networks.request.HiResult;
import com.hisense.connect_life.hismart.networks.request.message.MessageServiceImpl;
import kotlin.jvm.functions.Function1;
import p553f.p594c.p601r.C9217e;

/* renamed from: c.r.a.c.a.a.g.d */
/* compiled from: lambda */
public final /* synthetic */ class C7401d implements C9217e {

    /* renamed from: e */
    public final /* synthetic */ Function1 f14088e;

    /* renamed from: l */
    public final /* synthetic */ boolean f14089l;

    /* renamed from: m */
    public final /* synthetic */ MessageServiceImpl f14090m;

    public /* synthetic */ C7401d(Function1 function1, boolean z, MessageServiceImpl messageServiceImpl) {
        this.f14088e = function1;
        this.f14089l = z;
        this.f14090m = messageServiceImpl;
    }

    public final void accept(Object obj) {
        MessageServiceImpl.m27036getMessageChannel$lambda5(this.f14088e, this.f14089l, this.f14090m, (HiResult) obj);
    }
}
