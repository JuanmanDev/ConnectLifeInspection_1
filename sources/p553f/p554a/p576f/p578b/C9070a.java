package p553f.p554a.p576f.p578b;

import android.content.Context;
import p553f.p554a.p556d.p558b.p561g.C8944a;
import p553f.p554a.p570e.p571a.C9003c;
import p553f.p554a.p570e.p571a.C9017j;

/* renamed from: f.a.f.b.a */
/* compiled from: DeviceInfoPlugin */
public class C9070a implements C8944a {

    /* renamed from: e */
    public C9017j f17810e;

    /* renamed from: a */
    public final void mo46743a(C9003c cVar, Context context) {
        this.f17810e = new C9017j(cVar, "plugins.flutter.io/device_info");
        this.f17810e.mo46575e(new C9071b(context.getContentResolver(), context.getPackageManager()));
    }

    /* renamed from: b */
    public final void mo46744b() {
        this.f17810e.mo46575e((C9017j.C9021c) null);
        this.f17810e = null;
    }

    public void onAttachedToEngine(C8944a.C8946b bVar) {
        mo46743a(bVar.mo46465b(), bVar.mo46464a());
    }

    public void onDetachedFromEngine(C8944a.C8946b bVar) {
        mo46744b();
    }
}
