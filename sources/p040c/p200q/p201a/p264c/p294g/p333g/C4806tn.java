package p040c.p200q.p201a.p264c.p294g.p333g;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: c.q.a.c.g.g.tn */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final /* synthetic */ class C4806tn {
    /* renamed from: a */
    public static String m13173a(C4832un unVar, String str) {
        try {
            String str2 = new String(MessageDigest.getInstance("SHA-256").digest(str.getBytes()));
            int length = str2.length();
            int i = 0;
            while (i < length) {
                if (C4312bc.m11721a(str2.charAt(i))) {
                    char[] charArray = str2.toCharArray();
                    while (i < length) {
                        char c = charArray[i];
                        if (C4312bc.m11721a(c)) {
                            charArray[i] = (char) (c ^ ' ');
                        }
                        i++;
                    }
                    return String.valueOf(charArray);
                }
                i++;
            }
            return str2;
        } catch (NoSuchAlgorithmException unused) {
            C4832un.f9687b.mo20807c("Failed to get SHA-256 MessageDigest", new Object[0]);
            return null;
        }
    }
}
