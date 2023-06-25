package p040c.p200q.p201a.p348d.p349a.p350a.p351c;

import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: c.q.a.d.a.a.c.u */
/* compiled from: com.google.android.play:review@@2.0.1 */
public final class C5816u {
    /* renamed from: a */
    public static String m16518a(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(bArr);
            return Base64.encodeToString(instance.digest(), 11);
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }
}
