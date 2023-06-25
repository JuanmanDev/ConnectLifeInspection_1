package p040c.p200q.p201a.p219b.p224f0.p232y;

import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.f0.y.f0 */
/* compiled from: TsUtil */
public final class C2787f0 {
    /* renamed from: a */
    public static int m5791a(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    /* renamed from: b */
    public static long m5792b(C3173t tVar, int i, int i2) {
        tVar.mo20006L(i);
        if (tVar.mo20008a() < 5) {
            return -9223372036854775807L;
        }
        int j = tVar.mo20017j();
        if ((8388608 & j) != 0 || ((2096896 & j) >> 8) != i2) {
            return -9223372036854775807L;
        }
        boolean z = true;
        if (((j & 32) != 0) && tVar.mo20032y() >= 7 && tVar.mo20008a() >= 7) {
            if ((tVar.mo20032y() & 16) != 16) {
                z = false;
            }
            if (z) {
                byte[] bArr = new byte[6];
                tVar.mo20015h(bArr, 0, 6);
                return m5793c(bArr);
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: c */
    public static long m5793c(byte[] bArr) {
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((255 & ((long) bArr[4])) >> 7);
    }
}
