package p540d.p544b.p545a.p546a;

import android.content.Context;
import android.net.ConnectivityManager;
import p553f.p554a.p556d.p558b.p561g.C8944a;
import p553f.p554a.p570e.p571a.C9003c;
import p553f.p554a.p570e.p571a.C9006d;
import p553f.p554a.p570e.p571a.C9017j;

/* renamed from: d.b.a.a.d */
/* compiled from: ConnectivityPlugin */
public class C8888d implements C8944a {

    /* renamed from: e */
    public C9017j f17408e;

    /* renamed from: l */
    public C9006d f17409l;

    /* renamed from: a */
    public final void mo46247a(C9003c cVar, Context context) {
        this.f17408e = new C9017j(cVar, "dev.fluttercommunity.plus/connectivity");
        this.f17409l = new C9006d(cVar, "dev.fluttercommunity.plus/connectivity_status");
        C8885a aVar = new C8885a((ConnectivityManager) context.getSystemService("connectivity"));
        C8887c cVar2 = new C8887c(aVar);
        C8886b bVar = new C8886b(context, aVar);
        this.f17408e.mo46575e(cVar2);
        this.f17409l.mo46556d(bVar);
    }

    /* renamed from: b */
    public final void mo46248b() {
        this.f17408e.mo46575e((C9017j.C9021c) null);
        this.f17409l.mo46556d((C9006d.C9011d) null);
        this.f17408e = null;
        this.f17409l = null;
    }

    public void onAttachedToEngine(C8944a.C8946b bVar) {
        mo46247a(bVar.mo46465b(), bVar.mo46464a());
    }

    public void onDetachedFromEngine(C8944a.C8946b bVar) {
        mo46248b();
    }
}
