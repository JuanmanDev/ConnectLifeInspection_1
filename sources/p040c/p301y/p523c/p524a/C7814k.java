package p040c.p301y.p523c.p524a;

import com.juconnect.vivino.model.MatchStatusBean;
import com.juconnect.vivino.service.VivinoLabelServiceImpl;
import kotlin.jvm.internal.Ref;
import p553f.p594c.p601r.C9218f;

/* renamed from: c.y.c.a.k */
/* compiled from: lambda */
public final /* synthetic */ class C7814k implements C9218f {

    /* renamed from: e */
    public final /* synthetic */ VivinoLabelServiceImpl f14596e;

    /* renamed from: l */
    public final /* synthetic */ Ref.ObjectRef f14597l;

    public /* synthetic */ C7814k(VivinoLabelServiceImpl vivinoLabelServiceImpl, Ref.ObjectRef objectRef) {
        this.f14596e = vivinoLabelServiceImpl;
        this.f14597l = objectRef;
    }

    public final Object apply(Object obj) {
        return VivinoLabelServiceImpl.m27292scanLabel$lambda5(this.f14596e, this.f14597l, (MatchStatusBean) obj);
    }
}
