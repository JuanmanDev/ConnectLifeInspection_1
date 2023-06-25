package p040c.p200q.p201a.p264c.p267b.p268a.p273h.p274e;

import androidx.annotation.Nullable;
import androidx.browser.trusted.sharing.ShareTarget;
import com.facebook.stetho.server.http.HttpHeaders;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import p040c.p200q.p201a.p264c.p276d.p277g.C3348d;
import p040c.p200q.p201a.p264c.p276d.p277g.C3352f;
import p040c.p200q.p201a.p264c.p276d.p277g.C3354g;
import p040c.p200q.p201a.p264c.p276d.p277g.p278l.C3405p;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p284k.C3537a;

/* renamed from: c.q.a.c.b.a.h.e.e */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C3262e implements Runnable {

    /* renamed from: m */
    public static final C3537a f6126m = new C3537a("RevokeAccessOperation", new String[0]);

    /* renamed from: e */
    public final String f6127e;

    /* renamed from: l */
    public final C3405p f6128l = new C3405p((C3348d) null);

    public C3262e(String str) {
        C3495o.m8904f(str);
        this.f6127e = str;
    }

    /* renamed from: a */
    public static C3352f<Status> m8321a(@Nullable String str) {
        if (str == null) {
            return C3354g.m8505a(new Status(4), (C3348d) null);
        }
        C3262e eVar = new C3262e(str);
        new Thread(eVar).start();
        return eVar.f6128l;
    }

    public final void run() {
        Status status = Status.f8175r;
        try {
            String valueOf = String.valueOf(this.f6127e);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(valueOf.length() != 0 ? "https://accounts.google.com/o/oauth2/revoke?token=".concat(valueOf) : new String("https://accounts.google.com/o/oauth2/revoke?token=")).openConnection();
            httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, ShareTarget.ENCODING_TYPE_URL_ENCODED);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f8173p;
            } else {
                f6126m.mo20807c("Unable to revoke access!", new Object[0]);
            }
            C3537a aVar = f6126m;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Response Code: ");
            sb.append(responseCode);
            aVar.mo20805a(sb.toString(), new Object[0]);
        } catch (IOException e) {
            C3537a aVar2 = f6126m;
            String valueOf2 = String.valueOf(e.toString());
            aVar2.mo20807c(valueOf2.length() != 0 ? "IOException when revoking access: ".concat(valueOf2) : new String("IOException when revoking access: "), new Object[0]);
        } catch (Exception e2) {
            C3537a aVar3 = f6126m;
            String valueOf3 = String.valueOf(e2.toString());
            aVar3.mo20807c(valueOf3.length() != 0 ? "Exception when revoking access: ".concat(valueOf3) : new String("Exception when revoking access: "), new Object[0]);
        }
        this.f6128l.mo24546f(status);
    }
}
