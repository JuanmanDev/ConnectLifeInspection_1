package p040c.p325e0.p326a.p332c;

import com.facebook.stetho.dumpapp.Framer;

/* renamed from: c.e0.a.c.e */
/* compiled from: BUGLY */
public final class C4268e {
    static {
        byte[] bArr = {48, Framer.STDOUT_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};
        byte[] bArr2 = new byte[256];
        byte[] bArr3 = new byte[256];
        for (int i = 0; i < 256; i++) {
            bArr2[i] = bArr[i >>> 4];
            bArr3[i] = bArr[i & 15];
        }
    }

    /* renamed from: a */
    public static boolean m11642a(int i, int i2) {
        return i == i2;
    }

    /* renamed from: b */
    public static boolean m11643b(long j, long j2) {
        return j == j2;
    }

    /* renamed from: c */
    public static boolean m11644c(Object obj, Object obj2) {
        return obj.equals(obj2);
    }

    /* renamed from: d */
    public static boolean m11645d(boolean z, boolean z2) {
        return z == z2;
    }
}
