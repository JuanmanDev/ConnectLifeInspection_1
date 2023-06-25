package p040c.p200q.p201a.p264c.p294g.p335i;

import com.google.android.gms.internal.measurement.zzje;
import com.google.android.gms.internal.measurement.zzkp;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: c.q.a.c.g.i.i7 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class C5110i7 {
    /* renamed from: a */
    public static int m14325a(byte[] bArr, int i, C5094h7 h7Var) {
        int j = m14334j(bArr, i, h7Var);
        int i2 = h7Var.f9925a;
        if (i2 < 0) {
            throw zzkp.zzd();
        } else if (i2 > bArr.length - j) {
            throw zzkp.zzf();
        } else if (i2 == 0) {
            h7Var.f9927c = zzje.zzb;
            return j;
        } else {
            h7Var.f9927c = zzje.zzl(bArr, j, i2);
            return j + i2;
        }
    }

    /* renamed from: b */
    public static int m14326b(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: c */
    public static int m14327c(C5065fa faVar, byte[] bArr, int i, int i2, int i3, C5094h7 h7Var) {
        Object d = faVar.mo27240d();
        int n = m14338n(d, faVar, bArr, i, i2, i3, h7Var);
        faVar.mo27238b(d);
        h7Var.f9927c = d;
        return n;
    }

    /* renamed from: d */
    public static int m14328d(C5065fa faVar, byte[] bArr, int i, int i2, C5094h7 h7Var) {
        Object d = faVar.mo27240d();
        int o = m14339o(d, faVar, bArr, i, i2, h7Var);
        faVar.mo27238b(d);
        h7Var.f9927c = d;
        return o;
    }

    /* renamed from: e */
    public static int m14329e(C5065fa faVar, int i, byte[] bArr, int i2, int i3, C5354y8 y8Var, C5094h7 h7Var) {
        int d = m14328d(faVar, bArr, i2, i3, h7Var);
        y8Var.add(h7Var.f9927c);
        while (d < i3) {
            int j = m14334j(bArr, d, h7Var);
            if (i != h7Var.f9925a) {
                break;
            }
            d = m14328d(faVar, bArr, j, i3, h7Var);
            y8Var.add(h7Var.f9927c);
        }
        return d;
    }

    /* renamed from: f */
    public static int m14330f(byte[] bArr, int i, C5354y8 y8Var, C5094h7 h7Var) {
        C5294u8 u8Var = (C5294u8) y8Var;
        int j = m14334j(bArr, i, h7Var);
        int i2 = h7Var.f9925a + j;
        while (j < i2) {
            j = m14334j(bArr, j, h7Var);
            u8Var.mo27780k(h7Var.f9925a);
        }
        if (j == i2) {
            return j;
        }
        throw zzkp.zzf();
    }

    /* renamed from: g */
    public static int m14331g(byte[] bArr, int i, C5094h7 h7Var) {
        int j = m14334j(bArr, i, h7Var);
        int i2 = h7Var.f9925a;
        if (i2 < 0) {
            throw zzkp.zzd();
        } else if (i2 == 0) {
            h7Var.f9927c = "";
            return j;
        } else {
            h7Var.f9927c = new String(bArr, j, i2, C5369z8.f10297a);
            return j + i2;
        }
    }

    /* renamed from: h */
    public static int m14332h(byte[] bArr, int i, C5094h7 h7Var) {
        int j = m14334j(bArr, i, h7Var);
        int i2 = h7Var.f9925a;
        if (i2 < 0) {
            throw zzkp.zzd();
        } else if (i2 == 0) {
            h7Var.f9927c = "";
            return j;
        } else {
            h7Var.f9927c = C5177mb.m14501d(bArr, j, i2);
            return j + i2;
        }
    }

    /* renamed from: i */
    public static int m14333i(int i, byte[] bArr, int i2, int i3, C5341xa xaVar, C5094h7 h7Var) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int m = m14337m(bArr, i2, h7Var);
                xaVar.mo27933j(i, Long.valueOf(h7Var.f9926b));
                return m;
            } else if (i4 == 1) {
                xaVar.mo27933j(i, Long.valueOf(m14340p(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int j = m14334j(bArr, i2, h7Var);
                int i5 = h7Var.f9925a;
                if (i5 < 0) {
                    throw zzkp.zzd();
                } else if (i5 <= bArr.length - j) {
                    if (i5 == 0) {
                        xaVar.mo27933j(i, zzje.zzb);
                    } else {
                        xaVar.mo27933j(i, zzje.zzl(bArr, j, i5));
                    }
                    return j + i5;
                } else {
                    throw zzkp.zzf();
                }
            } else if (i4 == 3) {
                int i6 = (i & -8) | 4;
                C5341xa f = C5341xa.m15303f();
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int j2 = m14334j(bArr, i2, h7Var);
                    int i8 = h7Var.f9925a;
                    if (i8 == i6) {
                        i7 = i8;
                        i2 = j2;
                        break;
                    }
                    i7 = i8;
                    i2 = m14333i(i8, bArr, j2, i3, f, h7Var);
                }
                if (i2 > i3 || i7 != i6) {
                    throw zzkp.zze();
                }
                xaVar.mo27933j(i, f);
                return i2;
            } else if (i4 == 5) {
                xaVar.mo27933j(i, Integer.valueOf(m14326b(bArr, i2)));
                return i2 + 4;
            } else {
                throw zzkp.zzb();
            }
        } else {
            throw zzkp.zzb();
        }
    }

    /* renamed from: j */
    public static int m14334j(byte[] bArr, int i, C5094h7 h7Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m14335k(b, bArr, i2, h7Var);
        }
        h7Var.f9925a = b;
        return i2;
    }

    /* renamed from: k */
    public static int m14335k(int i, byte[] bArr, int i2, C5094h7 h7Var) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            h7Var.f9925a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & ByteCompanionObject.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            h7Var.f9925a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & ByteCompanionObject.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            h7Var.f9925a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & ByteCompanionObject.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            h7Var.f9925a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & ByteCompanionObject.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                h7Var.f9925a = i11;
                return i12;
            }
        }
    }

    /* renamed from: l */
    public static int m14336l(int i, byte[] bArr, int i2, int i3, C5354y8 y8Var, C5094h7 h7Var) {
        C5294u8 u8Var = (C5294u8) y8Var;
        int j = m14334j(bArr, i2, h7Var);
        u8Var.mo27780k(h7Var.f9925a);
        while (j < i3) {
            int j2 = m14334j(bArr, j, h7Var);
            if (i != h7Var.f9925a) {
                break;
            }
            j = m14334j(bArr, j2, h7Var);
            u8Var.mo27780k(h7Var.f9925a);
        }
        return j;
    }

    /* renamed from: m */
    public static int m14337m(byte[] bArr, int i, C5094h7 h7Var) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            h7Var.f9926b = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & ByteCompanionObject.MAX_VALUE)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & ByteCompanionObject.MAX_VALUE)) << i4;
            int i6 = i5;
            b = b2;
            i3 = i6;
        }
        h7Var.f9926b = j2;
        return i3;
    }

    /* renamed from: n */
    public static int m14338n(Object obj, C5065fa faVar, byte[] bArr, int i, int i2, int i3, C5094h7 h7Var) {
        int J = ((C5340x9) faVar).mo27901J(obj, bArr, i, i2, i3, h7Var);
        h7Var.f9927c = obj;
        return J;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m14339o(java.lang.Object r6, p040c.p200q.p201a.p264c.p294g.p335i.C5065fa r7, byte[] r8, int r9, int r10, p040c.p200q.p201a.p264c.p294g.p335i.C5094h7 r11) {
        /*
            int r0 = r9 + 1
            byte r9 = r8[r9]
            if (r9 >= 0) goto L_0x000c
            int r0 = m14335k(r9, r8, r0, r11)
            int r9 = r11.f9925a
        L_0x000c:
            r3 = r0
            if (r9 < 0) goto L_0x001e
            int r10 = r10 - r3
            if (r9 > r10) goto L_0x001e
            int r9 = r9 + r3
            r0 = r7
            r1 = r6
            r2 = r8
            r4 = r9
            r5 = r11
            r0.mo27245i(r1, r2, r3, r4, r5)
            r11.f9927c = r6
            return r9
        L_0x001e:
            com.google.android.gms.internal.measurement.zzkp r6 = com.google.android.gms.internal.measurement.zzkp.zzf()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14339o(java.lang.Object, c.q.a.c.g.i.fa, byte[], int, int, c.q.a.c.g.i.h7):int");
    }

    /* renamed from: p */
    public static long m14340p(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }
}
