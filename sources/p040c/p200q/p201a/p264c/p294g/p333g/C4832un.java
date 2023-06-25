package p040c.p200q.p201a.p264c.p294g.p333g;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.api.Status;
import java.net.HttpURLConnection;
import java.net.URL;
import p040c.p200q.p201a.p264c.p276d.p284k.C3537a;

/* renamed from: c.q.a.c.g.g.un */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public interface C4832un {

    /* renamed from: b */
    public static final C3537a f9687b = new C3537a("FirebaseAuth", "GetAuthDomainTaskResponseHandler");

    /* renamed from: e */
    Uri.Builder mo26743e(Intent intent, String str, String str2);

    /* renamed from: f */
    String mo26744f(String str);

    /* renamed from: i */
    HttpURLConnection mo26745i(URL url);

    /* renamed from: j */
    void mo26746j(Uri uri, String str);

    /* renamed from: n */
    void mo26747n(String str, Status status);

    Context zza();
}
