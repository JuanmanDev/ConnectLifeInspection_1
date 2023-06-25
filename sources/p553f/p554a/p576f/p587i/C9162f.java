package p553f.p554a.p576f.p587i;

import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import java.util.HashMap;
import p553f.p554a.p570e.p571a.C9017j;

/* renamed from: f.a.f.i.f */
/* compiled from: JavaScriptChannel */
public class C9162f {

    /* renamed from: a */
    public final C9017j f17948a;

    /* renamed from: b */
    public final String f17949b;

    /* renamed from: c */
    public final Handler f17950c;

    /* renamed from: f.a.f.i.f$a */
    /* compiled from: JavaScriptChannel */
    public class C9163a implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ String f17951e;

        public C9163a(String str) {
            this.f17951e = str;
        }

        public void run() {
            HashMap hashMap = new HashMap();
            hashMap.put("channel", C9162f.this.f17949b);
            hashMap.put("message", this.f17951e);
            C9162f.this.f17948a.mo46573c("javascriptChannelMessage", hashMap);
        }
    }

    public C9162f(C9017j jVar, String str, Handler handler) {
        this.f17948a = jVar;
        this.f17949b = str;
        this.f17950c = handler;
    }

    @JavascriptInterface
    public void postMessage(String str) {
        C9163a aVar = new C9163a(str);
        if (this.f17950c.getLooper() == Looper.myLooper()) {
            aVar.run();
        } else {
            this.f17950c.post(aVar);
        }
    }
}
