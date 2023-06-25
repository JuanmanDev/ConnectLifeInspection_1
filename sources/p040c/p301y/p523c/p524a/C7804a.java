package p040c.p301y.p523c.p524a;

import com.juconnect.vivino.service.VivinoLabelServiceImpl;
import java.io.File;
import kotlin.jvm.internal.Ref;
import p553f.p594c.p601r.C9218f;

/* renamed from: c.y.c.a.a */
/* compiled from: lambda */
public final /* synthetic */ class C7804a implements C9218f {

    /* renamed from: e */
    public final /* synthetic */ Ref.LongRef f14580e;

    /* renamed from: l */
    public final /* synthetic */ Ref.ObjectRef f14581l;

    /* renamed from: m */
    public final /* synthetic */ VivinoLabelServiceImpl f14582m;

    /* renamed from: n */
    public final /* synthetic */ File f14583n;

    public /* synthetic */ C7804a(Ref.LongRef longRef, Ref.ObjectRef objectRef, VivinoLabelServiceImpl vivinoLabelServiceImpl, File file) {
        this.f14580e = longRef;
        this.f14581l = objectRef;
        this.f14582m = vivinoLabelServiceImpl;
        this.f14583n = file;
    }

    public final Object apply(Object obj) {
        return VivinoLabelServiceImpl.m27289scanLabel$lambda2(this.f14580e, this.f14581l, this.f14582m, this.f14583n, (String) obj);
    }
}
