package p040c.p200q.p201a.p264c.p294g.p296b;

import android.util.Base64;
import java.util.Random;

/* renamed from: c.q.a.c.g.b.b */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C3612b {

    /* renamed from: a */
    public static final Random f6574a = new Random();

    /* renamed from: a */
    public static String m9155a() {
        byte[] bArr = new byte[16];
        f6574a.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
