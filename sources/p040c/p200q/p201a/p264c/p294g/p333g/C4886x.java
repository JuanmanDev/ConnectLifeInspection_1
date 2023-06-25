package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzacc;
import com.google.android.gms.internal.p527firebaseauthapi.zzadn;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: c.q.a.c.g.g.x */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4886x {
    /* renamed from: a */
    public static int m13429a(byte[] bArr, int i, C4860w wVar) {
        int j = m13438j(bArr, i, wVar);
        int i2 = wVar.f9715a;
        if (i2 < 0) {
            throw zzadn.zzf();
        } else if (i2 > bArr.length - j) {
            throw zzadn.zzi();
        } else if (i2 == 0) {
            wVar.f9717c = zzacc.zzb;
            return j;
        } else {
            wVar.f9717c = zzacc.zzo(bArr, j, i2);
            return j + i2;
        }
    }

    /* renamed from: b */
    public static int m13430b(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: c */
    public static int m13431c(C4889x2 x2Var, byte[] bArr, int i, int i2, int i3, C4860w wVar) {
        Object d = x2Var.mo26417d();
        int n = m13442n(d, x2Var, bArr, i, i2, i3, wVar);
        x2Var.mo26413b(d);
        wVar.f9717c = d;
        return n;
    }

    /* renamed from: d */
    public static int m13432d(C4889x2 x2Var, byte[] bArr, int i, int i2, C4860w wVar) {
        Object d = x2Var.mo26417d();
        int o = m13443o(d, x2Var, bArr, i, i2, wVar);
        x2Var.mo26413b(d);
        wVar.f9717c = d;
        return o;
    }

    /* renamed from: e */
    public static int m13433e(C4889x2 x2Var, int i, byte[] bArr, int i2, int i3, C4679p1 p1Var, C4860w wVar) {
        int d = m13432d(x2Var, bArr, i2, i3, wVar);
        p1Var.add(wVar.f9717c);
        while (d < i3) {
            int j = m13438j(bArr, d, wVar);
            if (i != wVar.f9715a) {
                break;
            }
            d = m13432d(x2Var, bArr, j, i3, wVar);
            p1Var.add(wVar.f9717c);
        }
        return d;
    }

    /* renamed from: f */
    public static int m13434f(byte[] bArr, int i, C4679p1 p1Var, C4860w wVar) {
        C4571l1 l1Var = (C4571l1) p1Var;
        int j = m13438j(bArr, i, wVar);
        int i2 = wVar.f9715a + j;
        while (j < i2) {
            j = m13438j(bArr, j, wVar);
            l1Var.mo26223g(wVar.f9715a);
        }
        if (j == i2) {
            return j;
        }
        throw zzadn.zzi();
    }

    /* renamed from: g */
    public static int m13435g(byte[] bArr, int i, C4860w wVar) {
        int j = m13438j(bArr, i, wVar);
        int i2 = wVar.f9715a;
        if (i2 < 0) {
            throw zzadn.zzf();
        } else if (i2 == 0) {
            wVar.f9717c = "";
            return j;
        } else {
            wVar.f9717c = new String(bArr, j, i2, C4706q1.f9576a);
            return j + i2;
        }
    }

    /* renamed from: h */
    public static int m13436h(byte[] bArr, int i, C4860w wVar) {
        int j = m13438j(bArr, i, wVar);
        int i2 = wVar.f9715a;
        if (i2 < 0) {
            throw zzadn.zzf();
        } else if (i2 == 0) {
            wVar.f9717c = "";
            return j;
        } else {
            wVar.f9717c = C4385e4.m11886d(bArr, j, i2);
            return j + i2;
        }
    }

    /* renamed from: i */
    public static int m13437i(int i, byte[] bArr, int i2, int i3, C4681p3 p3Var, C4860w wVar) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int m = m13441m(bArr, i2, wVar);
                p3Var.mo26506j(i, Long.valueOf(wVar.f9716b));
                return m;
            } else if (i4 == 1) {
                p3Var.mo26506j(i, Long.valueOf(m13444p(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int j = m13438j(bArr, i2, wVar);
                int i5 = wVar.f9715a;
                if (i5 < 0) {
                    throw zzadn.zzf();
                } else if (i5 <= bArr.length - j) {
                    if (i5 == 0) {
                        p3Var.mo26506j(i, zzacc.zzb);
                    } else {
                        p3Var.mo26506j(i, zzacc.zzo(bArr, j, i5));
                    }
                    return j + i5;
                } else {
                    throw zzadn.zzi();
                }
            } else if (i4 == 3) {
                int i6 = (i & -8) | 4;
                C4681p3 f = C4681p3.m12777f();
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int j2 = m13438j(bArr, i2, wVar);
                    int i8 = wVar.f9715a;
                    if (i8 == i6) {
                        i7 = i8;
                        i2 = j2;
                        break;
                    }
                    i7 = i8;
                    i2 = m13437i(i8, bArr, j2, i3, f, wVar);
                }
                if (i2 > i3 || i7 != i6) {
                    throw zzadn.zzg();
                }
                p3Var.mo26506j(i, f);
                return i2;
            } else if (i4 == 5) {
                p3Var.mo26506j(i, Integer.valueOf(m13430b(bArr, i2)));
                return i2 + 4;
            } else {
                throw zzadn.zzc();
            }
        } else {
            throw zzadn.zzc();
        }
    }

    /* renamed from: j */
    public static int m13438j(byte[] bArr, int i, C4860w wVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m13439k(b, bArr, i2, wVar);
        }
        wVar.f9715a = b;
        return i2;
    }

    /* renamed from: k */
    public static int m13439k(int i, byte[] bArr, int i2, C4860w wVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            wVar.f9715a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & ByteCompanionObject.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            wVar.f9715a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & ByteCompanionObject.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            wVar.f9715a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & ByteCompanionObject.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            wVar.f9715a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & ByteCompanionObject.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                wVar.f9715a = i11;
                return i12;
            }
        }
    }

    /* renamed from: l */
    public static int m13440l(int i, byte[] bArr, int i2, int i3, C4679p1 p1Var, C4860w wVar) {
        C4571l1 l1Var = (C4571l1) p1Var;
        int j = m13438j(bArr, i2, wVar);
        l1Var.mo26223g(wVar.f9715a);
        while (j < i3) {
            int j2 = m13438j(bArr, j, wVar);
            if (i != wVar.f9715a) {
                break;
            }
            j = m13438j(bArr, j2, wVar);
            l1Var.mo26223g(wVar.f9715a);
        }
        return j;
    }

    /* renamed from: m */
    public static int m13441m(byte[] bArr, int i, C4860w wVar) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            wVar.f9716b = j;
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
        wVar.f9716b = j2;
        return i3;
    }

    /* renamed from: n */
    public static int m13442n(Object obj, C4889x2 x2Var, byte[] bArr, int i, int i2, int i3, C4860w wVar) {
        int O = ((C4653o2) x2Var).mo26405O(obj, bArr, i, i2, i3, wVar);
        wVar.f9717c = obj;
        return O;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m13443o(java.lang.Object r6, p040c.p200q.p201a.p264c.p294g.p333g.C4889x2 r7, byte[] r8, int r9, int r10, p040c.p200q.p201a.p264c.p294g.p333g.C4860w r11) {
        /*
            int r0 = r9 + 1
            byte r9 = r8[r9]
            if (r9 >= 0) goto L_0x000c
            int r0 = m13439k(r9, r8, r0, r11)
            int r9 = r11.f9715a
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
            r0.mo26422h(r1, r2, r3, r4, r5)
            r11.f9717c = r6
            return r9
        L_0x001e:
            com.google.android.gms.internal.firebase-auth-api.zzadn r6 = com.google.android.gms.internal.p527firebaseauthapi.zzadn.zzi()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13443o(java.lang.Object, c.q.a.c.g.g.x2, byte[], int, int, c.q.a.c.g.g.w):int");
    }

    /* renamed from: p */
    public static long m13444p(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }
}
