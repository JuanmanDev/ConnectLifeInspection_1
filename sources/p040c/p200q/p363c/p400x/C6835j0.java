package p040c.p200q.p363c.p400x;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.AnyThread;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompat;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import p040c.p200q.p201a.p264c.p275c.C3297b;
import p040c.p200q.p201a.p264c.p347m.C5771j;
import p040c.p200q.p201a.p264c.p347m.C5777m;
import p040c.p200q.p363c.C6331h;
import p040c.p200q.p363c.p393u.C6757b;
import p040c.p200q.p363c.p394v.C6770i;
import p040c.p200q.p363c.p394v.C6773l;
import p040c.p200q.p363c.p403y.C6880i;

/* renamed from: c.q.c.x.j0 */
/* compiled from: GmsRpc */
public class C6835j0 {

    /* renamed from: a */
    public final C6331h f13082a;

    /* renamed from: b */
    public final C6841m0 f13083b;

    /* renamed from: c */
    public final C3297b f13084c;

    /* renamed from: d */
    public final C6757b<C6880i> f13085d;

    /* renamed from: e */
    public final C6757b<HeartBeatInfo> f13086e;

    /* renamed from: f */
    public final C6770i f13087f;

    public C6835j0(C6331h hVar, C6841m0 m0Var, C6757b<C6880i> bVar, C6757b<HeartBeatInfo> bVar2, C6770i iVar) {
        this(hVar, m0Var, new C3297b(hVar.mo30404j()), bVar, bVar2, iVar);
    }

    /* renamed from: a */
    public static String m19382a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    /* renamed from: f */
    public static boolean m19383f(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    /* renamed from: b */
    public final C5771j<String> mo31621b(C5771j<Bundle> jVar) {
        return jVar.mo28849j(C6867y.f13147e, new C6846p(this));
    }

    /* renamed from: c */
    public final String mo31622c() {
        try {
            return m19382a(MessageDigest.getInstance("SHA-1").digest(this.f13082a.mo30405n().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    /* renamed from: d */
    public C5771j<String> mo31623d() {
        return mo31621b(mo31627i(C6841m0.m19427c(this.f13082a), "*", new Bundle()));
    }

    @AnyThread
    /* renamed from: e */
    public final String mo31624e(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString("error");
            if ("RST".equals(string3)) {
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string3 != null) {
                throw new IOException(string3);
            } else {
                "Unexpected response: " + bundle;
                new Throwable();
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    /* renamed from: g */
    public /* synthetic */ String mo31625g(C5771j jVar) {
        return mo31624e((Bundle) jVar.mo28853n(IOException.class));
    }

    /* renamed from: h */
    public final void mo31626h(String str, String str2, Bundle bundle) {
        HeartBeatInfo.HeartBeat b;
        bundle.putString("scope", str2);
        bundle.putString(NotificationCompat.MessagingStyle.Message.KEY_SENDER, str);
        bundle.putString("subtype", str);
        bundle.putString("gmp_app_id", this.f13082a.mo30406o().mo30420c());
        bundle.putString("gmsv", Integer.toString(this.f13083b.mo31640d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f13083b.mo31638a());
        bundle.putString("app_ver_name", this.f13083b.mo31639b());
        bundle.putString("firebase-app-name-hash", mo31622c());
        try {
            String b2 = ((C6773l) C5777m.m16409a(this.f13087f.mo31453a(false))).mo31440b();
            if (!TextUtils.isEmpty(b2)) {
                bundle.putString("Goog-Firebase-Installations-Auth", b2);
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        bundle.putString("appid", (String) C5777m.m16409a(this.f13087f.getId()));
        bundle.putString("cliv", "fcm-" + "23.1.0");
        HeartBeatInfo heartBeatInfo = this.f13086e.get();
        C6880i iVar = this.f13085d.get();
        if (heartBeatInfo != null && iVar != null && (b = heartBeatInfo.mo31418b("fire-iid")) != HeartBeatInfo.HeartBeat.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(b.getCode()));
            bundle.putString("Firebase-Client", iVar.mo31729a());
        }
    }

    /* renamed from: i */
    public final C5771j<Bundle> mo31627i(String str, String str2, Bundle bundle) {
        try {
            mo31626h(str, str2, bundle);
            return this.f13084c.mo20338a(bundle);
        } catch (InterruptedException | ExecutionException e) {
            return C5777m.m16413e(e);
        }
    }

    /* renamed from: j */
    public C5771j<?> mo31628j(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        return mo31621b(mo31627i(str, "/topics/" + str2, bundle));
    }

    /* renamed from: k */
    public C5771j<?> mo31629k(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        bundle.putString("delete", "1");
        return mo31621b(mo31627i(str, "/topics/" + str2, bundle));
    }

    @VisibleForTesting
    public C6835j0(C6331h hVar, C6841m0 m0Var, C3297b bVar, C6757b<C6880i> bVar2, C6757b<HeartBeatInfo> bVar3, C6770i iVar) {
        this.f13082a = hVar;
        this.f13083b = m0Var;
        this.f13084c = bVar;
        this.f13085d = bVar2;
        this.f13086e = bVar3;
        this.f13087f = iVar;
    }
}
