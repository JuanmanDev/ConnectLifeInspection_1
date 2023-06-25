package p040c.p200q.p201a.p264c.p294g.p333g;

import java.security.SecureRandom;

/* renamed from: c.q.a.c.g.g.pk */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4698pk {

    /* renamed from: a */
    public static final ThreadLocal f9561a = new C4671ok();

    /* renamed from: a */
    public static byte[] m12824a(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) f9561a.get()).nextBytes(bArr);
        return bArr;
    }
}
