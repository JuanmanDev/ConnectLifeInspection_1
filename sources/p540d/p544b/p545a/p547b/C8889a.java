package p540d.p544b.p545a.p547b;

import android.content.Context;
import p553f.p554a.p556d.p558b.p561g.C8944a;
import p553f.p554a.p570e.p571a.C9003c;
import p553f.p554a.p570e.p571a.C9017j;

/* renamed from: d.b.a.b.a */
/* compiled from: DeviceInfoPlusPlugin */
public class C8889a implements C8944a {

    /* renamed from: e */
    public C9017j f17410e;

    /* renamed from: a */
    public final void mo46249a(C9003c cVar, Context context) {
        this.f17410e = new C9017j(cVar, "dev.fluttercommunity.plus/device_info");
        this.f17410e.mo46575e(new C8890b(context.getContentResolver(), context.getPackageManager()));
    }

    /* renamed from: b */
    public final void mo46250b() {
        this.f17410e.mo46575e((C9017j.C9021c) null);
        this.f17410e = null;
    }

    public void onAttachedToEngine(C8944a.C8946b bVar) {
        mo46249a(bVar.mo46465b(), bVar.mo46464a());
    }

    public void onDetachedFromEngine(C8944a.C8946b bVar) {
        mo46250b();
    }
}
