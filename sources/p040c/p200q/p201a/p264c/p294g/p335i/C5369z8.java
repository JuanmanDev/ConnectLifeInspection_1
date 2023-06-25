package p040c.p200q.p201a.p264c.p294g.p335i;

import com.google.android.gms.internal.measurement.zzkp;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: c.q.a.c.g.i.z8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class C5369z8 {

    /* renamed from: a */
    public static final Charset f10297a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final byte[] f10298b;

    static {
        Charset.forName("US-ASCII");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f10298b = bArr;
        ByteBuffer.wrap(bArr);
        byte[] bArr2 = f10298b;
        int i = C5353y7.f10281a;
        int length = bArr2.length;
        try {
            new C5323w7(bArr2, 0, 0, false, (C5308v7) null).mo27863c(0);
        } catch (zzkp e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static int m15421a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: b */
    public static int m15422b(byte[] bArr) {
        int length = bArr.length;
        int d = m15424d(length, bArr, 0, length);
        if (d == 0) {
            return 1;
        }
        return d;
    }

    /* renamed from: c */
    public static int m15423c(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: d */
    public static int m15424d(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: e */
    public static Object m15425e(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw null;
    }

    /* renamed from: f */
    public static Object m15426f(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: g */
    public static String m15427g(byte[] bArr) {
        return new String(bArr, f10297a);
    }

    /* renamed from: h */
    public static boolean m15428h(byte[] bArr) {
        return C5177mb.m14502e(bArr);
    }
}
