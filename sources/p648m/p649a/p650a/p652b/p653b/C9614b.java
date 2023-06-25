package p648m.p649a.p650a.p652b.p653b;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: m.a.a.b.b.b */
/* compiled from: DigestUtils */
public class C9614b {
    /* renamed from: a */
    public static MessageDigest m25804a(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: b */
    public static MessageDigest m25805b() {
        return m25804a("MD5");
    }
}
