package p040c.p200q.p201a.p264c.p265a.p266a;

import android.net.Uri;
import java.util.Map;

/* renamed from: c.q.a.c.a.a.b */
/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
public final class C3222b extends Thread {

    /* renamed from: e */
    public final /* synthetic */ Map f6091e;

    public C3222b(C3220a aVar, Map map) {
        this.f6091e = map;
    }

    public final void run() {
        Map map = this.f6091e;
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str : map.keySet()) {
            buildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        C3224d.m8288a(buildUpon.build().toString());
    }
}
