package p040c.p200q.p201a.p264c.p294g.p333g;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: c.q.a.c.g.g.q1 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4706q1 {

    /* renamed from: a */
    public static final Charset f9576a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final byte[] f9577b;

    static {
        Charset.forName("US-ASCII");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f9577b = bArr;
        ByteBuffer.wrap(bArr);
        byte[] bArr2 = f9577b;
        int i = C4624n0.f9457e;
        int length = bArr2.length;
        C4624n0.m12506m(bArr2, 0, 0, false);
    }

    /* renamed from: a */
    public static int m12864a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: b */
    public static int m12865b(byte[] bArr) {
        int length = bArr.length;
        int d = m12867d(length, bArr, 0, length);
        if (d == 0) {
            return 1;
        }
        return d;
    }

    /* renamed from: c */
    public static int m12866c(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: d */
    public static int m12867d(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: e */
    public static Object m12868e(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw null;
    }

    /* renamed from: f */
    public static Object m12869f(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: g */
    public static String m12870g(byte[] bArr) {
        return new String(bArr, f9576a);
    }

    /* renamed from: h */
    public static boolean m12871h(byte[] bArr) {
        return C4385e4.m11887e(bArr);
    }
}
