package p553f.p554a.p576f.p587i;

import android.os.Build;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import p553f.p554a.p570e.p571a.C9003c;
import p553f.p554a.p570e.p571a.C9016i;
import p553f.p554a.p570e.p571a.C9017j;

/* renamed from: f.a.f.i.b */
/* compiled from: FlutterCookieManager */
public class C9152b implements C9017j.C9021c {

    /* renamed from: e */
    public final C9017j f17928e;

    /* renamed from: f.a.f.i.b$a */
    /* compiled from: FlutterCookieManager */
    public class C9153a implements ValueCallback<Boolean> {

        /* renamed from: a */
        public final /* synthetic */ C9017j.C9022d f17929a;

        /* renamed from: b */
        public final /* synthetic */ boolean f17930b;

        public C9153a(C9017j.C9022d dVar, boolean z) {
            this.f17929a = dVar;
            this.f17930b = z;
        }

        /* renamed from: a */
        public void onReceiveValue(Boolean bool) {
            this.f17929a.success(Boolean.valueOf(this.f17930b));
        }
    }

    public C9152b(C9003c cVar) {
        C9017j jVar = new C9017j(cVar, "plugins.flutter.io/cookie_manager");
        this.f17928e = jVar;
        jVar.mo46575e(this);
    }

    /* renamed from: a */
    public static void m24816a(C9017j.C9022d dVar) {
        CookieManager instance = CookieManager.getInstance();
        boolean hasCookies = instance.hasCookies();
        if (Build.VERSION.SDK_INT >= 21) {
            instance.removeAllCookies(new C9153a(dVar, hasCookies));
            return;
        }
        instance.removeAllCookie();
        dVar.success(Boolean.valueOf(hasCookies));
    }

    /* renamed from: b */
    public void mo46886b() {
        this.f17928e.mo46575e((C9017j.C9021c) null);
    }

    public void onMethodCall(C9016i iVar, C9017j.C9022d dVar) {
        String str = iVar.f17687a;
        if (((str.hashCode() == 928375682 && str.equals("clearCookies")) ? (char) 0 : 65535) != 0) {
            dVar.notImplemented();
        } else {
            m24816a(dVar);
        }
    }
}
