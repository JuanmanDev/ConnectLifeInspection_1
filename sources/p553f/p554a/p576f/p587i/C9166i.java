package p553f.p554a.p576f.p587i;

import android.view.View;
import p553f.p554a.p556d.p558b.p561g.C8944a;
import p553f.p554a.p570e.p571a.C9003c;

/* renamed from: f.a.f.i.i */
/* compiled from: WebViewFlutterPlugin */
public class C9166i implements C8944a {

    /* renamed from: e */
    public C9152b f17961e;

    public void onAttachedToEngine(C8944a.C8946b bVar) {
        C9003c b = bVar.mo46465b();
        bVar.mo46467d().mo46378o().mo46693G().mo46682a("plugins.flutter.io/webview", new C9165h(b, (View) null));
        this.f17961e = new C9152b(b);
    }

    public void onDetachedFromEngine(C8944a.C8946b bVar) {
        C9152b bVar2 = this.f17961e;
        if (bVar2 != null) {
            bVar2.mo46886b();
            this.f17961e = null;
        }
    }
}
