package p040c.p200q.p201a.p264c.p294g.p333g;

import android.content.Context;
import com.google.firebase.auth.FirebaseAuth;
import java.net.URLConnection;
import java.util.concurrent.ExecutionException;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p347m.C5777m;
import p040c.p200q.p363c.C6331h;
import p040c.p200q.p363c.p390s.C6750j;

/* renamed from: c.q.a.c.g.g.do */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4378do {

    /* renamed from: a */
    public final Context f9177a;

    /* renamed from: b */
    public C4833uo f9178b;

    /* renamed from: c */
    public final String f9179c;

    /* renamed from: d */
    public final C6331h f9180d;

    /* renamed from: e */
    public boolean f9181e = false;

    /* renamed from: f */
    public String f9182f;

    public C4378do(Context context, C6331h hVar, String str) {
        C3495o.m8908j(context);
        this.f9177a = context;
        C3495o.m8908j(hVar);
        this.f9180d = hVar;
        this.f9179c = String.format("Android/%s/%s", new Object[]{"Fallback", str});
    }

    /* renamed from: a */
    public final void mo25916a(URLConnection uRLConnection) {
        String str;
        String str2;
        if (this.f9181e) {
            str = String.valueOf(this.f9179c).concat("/FirebaseUI-Android");
        } else {
            str = String.valueOf(this.f9179c).concat("/FirebaseCore-Android");
        }
        if (this.f9178b == null) {
            Context context = this.f9177a;
            this.f9178b = new C4833uo(context, context.getPackageName());
        }
        uRLConnection.setRequestProperty("X-Android-Package", this.f9178b.mo26750b());
        uRLConnection.setRequestProperty("X-Android-Cert", this.f9178b.mo26749a());
        uRLConnection.setRequestProperty("Accept-Language", C4405eo.m11927a());
        uRLConnection.setRequestProperty("X-Client-Version", str);
        uRLConnection.setRequestProperty("X-Firebase-Locale", this.f9182f);
        uRLConnection.setRequestProperty("X-Firebase-GMPID", this.f9180d.mo30406o().mo30420c());
        C6750j jVar = (C6750j) FirebaseAuth.getInstance(this.f9180d).mo37340v().get();
        if (jVar != null) {
            try {
                str2 = (String) C5777m.m16409a(jVar.mo31417a());
            } catch (InterruptedException | ExecutionException e) {
                "Unable to get heartbeats: ".concat(String.valueOf(e.getMessage()));
            }
            uRLConnection.setRequestProperty("X-Firebase-Client", str2);
            this.f9182f = null;
        }
        str2 = null;
        uRLConnection.setRequestProperty("X-Firebase-Client", str2);
        this.f9182f = null;
    }
}
