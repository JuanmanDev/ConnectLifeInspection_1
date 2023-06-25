package p040c.p200q.p201a.p264c.p294g.p333g;

import android.os.Build;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: c.q.a.c.g.g.p9 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4687p9 implements C4440g5 {

    /* renamed from: a */
    public KeyStore f9552a;

    @RequiresApi(23)
    public C4687p9() {
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
                instance.load((KeyStore.LoadStoreParameter) null);
                this.f9552a = instance;
            } catch (IOException | GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        } else {
            throw new IllegalStateException("need Android Keystore on Android M or newer");
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0020 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo26512a(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "android-keystore://"
            java.lang.String r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4751rk.m13022a(r0, r3)     // Catch:{ all -> 0x002f }
            java.security.KeyStore r0 = r2.f9552a     // Catch:{ NullPointerException -> 0x000f }
            boolean r3 = r0.containsAlias(r3)     // Catch:{ NullPointerException -> 0x000f }
            monitor-exit(r2)
            return r3
        L_0x000f:
            r0 = 20
            java.lang.Thread.sleep(r0)     // Catch:{ IOException -> 0x0028, InterruptedException -> 0x0020 }
            java.lang.String r0 = "AndroidKeyStore"
            java.security.KeyStore r0 = java.security.KeyStore.getInstance(r0)     // Catch:{ IOException -> 0x0028, InterruptedException -> 0x0020 }
            r2.f9552a = r0     // Catch:{ IOException -> 0x0028, InterruptedException -> 0x0020 }
            r1 = 0
            r0.load(r1)     // Catch:{ IOException -> 0x0028, InterruptedException -> 0x0020 }
        L_0x0020:
            java.security.KeyStore r0 = r2.f9552a     // Catch:{ all -> 0x002f }
            boolean r3 = r0.containsAlias(r3)     // Catch:{ all -> 0x002f }
            monitor-exit(r2)
            return r3
        L_0x0028:
            r3 = move-exception
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch:{ all -> 0x002f }
            r0.<init>(r3)     // Catch:{ all -> 0x002f }
            throw r0     // Catch:{ all -> 0x002f }
        L_0x002f:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p294g.p333g.C4687p9.mo26512a(java.lang.String):boolean");
    }

    /* renamed from: c */
    public final synchronized C4574l4 mo26021c(String str) {
        C4660o9 o9Var;
        o9Var = new C4660o9(C4751rk.m13022a("android-keystore://", str), this.f9552a);
        byte[] a = C4698pk.m12824a(10);
        byte[] bArr = new byte[0];
        if (!Arrays.equals(a, o9Var.mo25783a(o9Var.mo25784b(a, bArr), bArr))) {
            throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
        }
        return o9Var;
    }

    @RequiresApi(23)
    /* renamed from: d */
    public final synchronized boolean mo26022d(String str) {
        return str.toLowerCase(Locale.US).startsWith("android-keystore://");
    }
}
