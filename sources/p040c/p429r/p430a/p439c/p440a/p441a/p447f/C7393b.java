package p040c.p429r.p430a.p439c.p440a.p441a.p447f;

import com.hisense.connect_life.hismart.networks.request.HiResult;
import com.hisense.connect_life.hismart.networks.request.language.LanguageServiceImpl;
import kotlin.jvm.functions.Function1;
import p553f.p594c.p601r.C9217e;

/* renamed from: c.r.a.c.a.a.f.b */
/* compiled from: lambda */
public final /* synthetic */ class C7393b implements C9217e {

    /* renamed from: e */
    public final /* synthetic */ String f14079e;

    /* renamed from: l */
    public final /* synthetic */ Function1 f14080l;

    public /* synthetic */ C7393b(String str, Function1 function1) {
        this.f14079e = str;
        this.f14080l = function1;
    }

    public final void accept(Object obj) {
        LanguageServiceImpl.m27034setDefaultLanguage$lambda2(this.f14079e, this.f14080l, (HiResult) obj);
    }
}
