package p040c.p301y.p523c.p524a;

import com.juconnect.vivino.model.LabelScanBean;
import com.juconnect.vivino.service.VivinoLabelServiceImpl;
import kotlin.jvm.internal.Ref;
import p553f.p594c.p601r.C9218f;

/* renamed from: c.y.c.a.b */
/* compiled from: lambda */
public final /* synthetic */ class C7805b implements C9218f {

    /* renamed from: e */
    public final /* synthetic */ VivinoLabelServiceImpl f14584e;

    /* renamed from: l */
    public final /* synthetic */ Ref.ObjectRef f14585l;

    public /* synthetic */ C7805b(VivinoLabelServiceImpl vivinoLabelServiceImpl, Ref.ObjectRef objectRef) {
        this.f14584e = vivinoLabelServiceImpl;
        this.f14585l = objectRef;
    }

    public final Object apply(Object obj) {
        return VivinoLabelServiceImpl.m27291scanLabel$lambda4(this.f14584e, this.f14585l, (LabelScanBean) obj);
    }
}
