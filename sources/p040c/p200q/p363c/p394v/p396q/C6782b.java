package p040c.p200q.p363c.p394v.p396q;

import android.content.SharedPreferences;
import android.util.Base64;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.test.internal.runner.RunnerArgs;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;
import p040c.p200q.p363c.C6331h;

/* renamed from: c.q.c.v.q.b */
/* compiled from: IidStore */
public class C6782b {

    /* renamed from: c */
    public static final String[] f12964c = {"*", "FCM", "GCM", ""};
    @GuardedBy("iidPrefs")

    /* renamed from: a */
    public final SharedPreferences f12965a;

    /* renamed from: b */
    public final String f12966b;

    public C6782b(@NonNull C6331h hVar) {
        this.f12965a = hVar.mo30404j().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f12966b = m19199b(hVar);
    }

    /* renamed from: b */
    public static String m19199b(C6331h hVar) {
        String f = hVar.mo30406o().mo30424f();
        if (f != null) {
            return f;
        }
        String c = hVar.mo30406o().mo30420c();
        if (!c.startsWith("1:") && !c.startsWith("2:")) {
            return c;
        }
        String[] split = c.split(RunnerArgs.CLASSPATH_SEPARATOR);
        if (split.length != 4) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    @Nullable
    /* renamed from: c */
    public static String m19200c(@NonNull PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final String mo31505a(@NonNull String str, @NonNull String str2) {
        return "|T|" + str + "|" + str2;
    }

    /* renamed from: d */
    public final String mo31506d(String str) {
        try {
            return new JSONObject(str).getString(FirebaseMessagingService.EXTRA_TOKEN);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: e */
    public final PublicKey mo31507e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
            "Invalid key stored " + e;
            return null;
        }
    }

    @Nullable
    /* renamed from: f */
    public String mo31508f() {
        synchronized (this.f12965a) {
            String g = mo31509g();
            if (g != null) {
                return g;
            }
            String h = mo31510h();
            return h;
        }
    }

    @Nullable
    /* renamed from: g */
    public final String mo31509g() {
        String string;
        synchronized (this.f12965a) {
            string = this.f12965a.getString("|S|id", (String) null);
        }
        return string;
    }

    @Nullable
    /* renamed from: h */
    public final String mo31510h() {
        synchronized (this.f12965a) {
            String string = this.f12965a.getString("|S||P|", (String) null);
            if (string == null) {
                return null;
            }
            PublicKey e = mo31507e(string);
            if (e == null) {
                return null;
            }
            String c = m19200c(e);
            return c;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        return r4;
     */
    @androidx.annotation.Nullable
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo31511i() {
        /*
            r7 = this;
            android.content.SharedPreferences r0 = r7.f12965a
            monitor-enter(r0)
            java.lang.String[] r1 = f12964c     // Catch:{ all -> 0x0033 }
            int r2 = r1.length     // Catch:{ all -> 0x0033 }
            r3 = 0
        L_0x0007:
            r4 = 0
            if (r3 >= r2) goto L_0x0031
            r5 = r1[r3]     // Catch:{ all -> 0x0033 }
            java.lang.String r6 = r7.f12966b     // Catch:{ all -> 0x0033 }
            java.lang.String r5 = r7.mo31505a(r6, r5)     // Catch:{ all -> 0x0033 }
            android.content.SharedPreferences r6 = r7.f12965a     // Catch:{ all -> 0x0033 }
            java.lang.String r4 = r6.getString(r5, r4)     // Catch:{ all -> 0x0033 }
            if (r4 == 0) goto L_0x002e
            boolean r5 = r4.isEmpty()     // Catch:{ all -> 0x0033 }
            if (r5 != 0) goto L_0x002e
            java.lang.String r1 = "{"
            boolean r1 = r4.startsWith(r1)     // Catch:{ all -> 0x0033 }
            if (r1 == 0) goto L_0x002c
            java.lang.String r4 = r7.mo31506d(r4)     // Catch:{ all -> 0x0033 }
        L_0x002c:
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            return r4
        L_0x002e:
            int r3 = r3 + 1
            goto L_0x0007
        L_0x0031:
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            return r4
        L_0x0033:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p363c.p394v.p396q.C6782b.mo31511i():java.lang.String");
    }
}
