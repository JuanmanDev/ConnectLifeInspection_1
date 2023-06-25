package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzacc;
import com.google.android.gms.internal.p527firebaseauthapi.zzadn;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: c.q.a.c.g.g.l0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4570l0 extends C4624n0 {

    /* renamed from: f */
    public final byte[] f9362f;

    /* renamed from: g */
    public int f9363g;

    /* renamed from: h */
    public int f9364h;

    /* renamed from: i */
    public int f9365i;

    /* renamed from: j */
    public int f9366j;

    /* renamed from: k */
    public int f9367k = Integer.MAX_VALUE;

    public /* synthetic */ C4570l0(byte[] bArr, int i, int i2, boolean z, C4543k0 k0Var) {
        super((C4597m0) null);
        this.f9362f = bArr;
        this.f9363g = i2;
        this.f9365i = 0;
    }

    /* renamed from: a */
    public final int mo26203a() {
        return this.f9365i;
    }

    /* renamed from: b */
    public final int mo26204b(int i) {
        if (i >= 0) {
            int i2 = i + this.f9365i;
            if (i2 >= 0) {
                int i3 = this.f9367k;
                if (i2 <= i3) {
                    this.f9367k = i2;
                    mo26219t();
                    return i3;
                }
                throw zzadn.zzi();
            }
            throw zzadn.zzg();
        }
        throw zzadn.zzf();
    }

    /* renamed from: c */
    public final int mo26205c() {
        if (mo26211i()) {
            this.f9366j = 0;
            return 0;
        }
        int p = mo26215p();
        this.f9366j = p;
        if ((p >>> 3) != 0) {
            return p;
        }
        throw zzadn.zzc();
    }

    /* renamed from: d */
    public final zzacc mo26206d() {
        int p = mo26215p();
        if (p > 0) {
            int i = this.f9363g;
            int i2 = this.f9365i;
            if (p <= i - i2) {
                zzacc zzo = zzacc.zzo(this.f9362f, i2, p);
                this.f9365i += p;
                return zzo;
            }
        }
        if (p == 0) {
            return zzacc.zzb;
        }
        if (p > 0) {
            int i3 = this.f9363g;
            int i4 = this.f9365i;
            if (p <= i3 - i4) {
                int i5 = p + i4;
                this.f9365i = i5;
                return zzacc.zzq(Arrays.copyOfRange(this.f9362f, i4, i5));
            }
        }
        if (p <= 0) {
            throw zzadn.zzf();
        }
        throw zzadn.zzi();
    }

    /* renamed from: e */
    public final String mo26207e() {
        int p = mo26215p();
        if (p > 0) {
            int i = this.f9363g;
            int i2 = this.f9365i;
            if (p <= i - i2) {
                String str = new String(this.f9362f, i2, p, C4706q1.f9576a);
                this.f9365i += p;
                return str;
            }
        }
        if (p == 0) {
            return "";
        }
        if (p < 0) {
            throw zzadn.zzf();
        }
        throw zzadn.zzi();
    }

    /* renamed from: f */
    public final String mo26208f() {
        int p = mo26215p();
        if (p > 0) {
            int i = this.f9363g;
            int i2 = this.f9365i;
            if (p <= i - i2) {
                String d = C4385e4.m11886d(this.f9362f, i2, p);
                this.f9365i += p;
                return d;
            }
        }
        if (p == 0) {
            return "";
        }
        if (p <= 0) {
            throw zzadn.zzf();
        }
        throw zzadn.zzi();
    }

    /* renamed from: g */
    public final void mo26209g(int i) {
        if (this.f9366j != i) {
            throw zzadn.zzb();
        }
    }

    /* renamed from: h */
    public final void mo26210h(int i) {
        this.f9367k = i;
        mo26219t();
    }

    /* renamed from: i */
    public final boolean mo26211i() {
        return this.f9365i == this.f9363g;
    }

    /* renamed from: j */
    public final boolean mo26212j() {
        return mo26217r() != 0;
    }

    /* renamed from: n */
    public final byte mo26213n() {
        int i = this.f9365i;
        if (i != this.f9363g) {
            byte[] bArr = this.f9362f;
            this.f9365i = i + 1;
            return bArr[i];
        }
        throw zzadn.zzi();
    }

    /* renamed from: o */
    public final int mo26214o() {
        int i = this.f9365i;
        if (this.f9363g - i >= 4) {
            byte[] bArr = this.f9362f;
            this.f9365i = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }
        throw zzadn.zzi();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0067, code lost:
        if (r2[r3] >= 0) goto L_0x0069;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo26215p() {
        /*
            r5 = this;
            int r0 = r5.f9365i
            int r1 = r5.f9363g
            if (r1 != r0) goto L_0x0007
            goto L_0x006c
        L_0x0007:
            byte[] r2 = r5.f9362f
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0012
            r5.f9365i = r3
            return r0
        L_0x0012:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L_0x006c
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0023
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            goto L_0x0069
        L_0x0023:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x0030
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L_0x002e:
            r1 = r3
            goto L_0x0069
        L_0x0030:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x003e
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L_0x0069
        L_0x003e:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L_0x002e
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0069
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002e
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0069
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002e
            int r1 = r3 + 1
            byte r2 = r2[r3]
            if (r2 < 0) goto L_0x006c
        L_0x0069:
            r5.f9365i = r1
            return r0
        L_0x006c:
            long r0 = r5.mo26218s()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p294g.p333g.C4570l0.mo26215p():int");
    }

    /* renamed from: q */
    public final long mo26216q() {
        int i = this.f9365i;
        if (this.f9363g - i >= 8) {
            byte[] bArr = this.f9362f;
            this.f9365i = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }
        throw zzadn.zzi();
    }

    /* renamed from: r */
    public final long mo26217r() {
        long j;
        long j2;
        long j3;
        long j4;
        byte b;
        int i = this.f9365i;
        int i2 = this.f9363g;
        if (i2 != i) {
            byte[] bArr = this.f9362f;
            int i3 = i + 1;
            byte b2 = bArr[i];
            if (b2 >= 0) {
                this.f9365i = i3;
                return (long) b2;
            } else if (i2 - i3 >= 9) {
                int i4 = i3 + 1;
                byte b3 = b2 ^ (bArr[i3] << 7);
                if (b3 < 0) {
                    b = b3 ^ ByteCompanionObject.MIN_VALUE;
                } else {
                    int i5 = i4 + 1;
                    byte b4 = b3 ^ (bArr[i4] << 14);
                    if (b4 >= 0) {
                        j2 = (long) (b4 ^ ByteCompanionObject.MIN_VALUE);
                    } else {
                        i4 = i5 + 1;
                        byte b5 = b4 ^ (bArr[i5] << 21);
                        if (b5 < 0) {
                            b = b5 ^ ByteCompanionObject.MIN_VALUE;
                        } else {
                            i5 = i4 + 1;
                            long j5 = (((long) bArr[i4]) << 28) ^ ((long) b5);
                            if (j5 >= 0) {
                                j4 = 266354560;
                            } else {
                                int i6 = i5 + 1;
                                long j6 = j5 ^ (((long) bArr[i5]) << 35);
                                if (j6 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i5 = i6 + 1;
                                    j5 = j6 ^ (((long) bArr[i6]) << 42);
                                    if (j5 >= 0) {
                                        j4 = 4363953127296L;
                                    } else {
                                        i6 = i5 + 1;
                                        j6 = j5 ^ (((long) bArr[i5]) << 49);
                                        if (j6 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i5 = i6 + 1;
                                            j2 = (j6 ^ (((long) bArr[i6]) << 56)) ^ 71499008037633920L;
                                            if (j2 < 0) {
                                                i6 = i5 + 1;
                                                if (((long) bArr[i5]) >= 0) {
                                                    j = j2;
                                                    i4 = i6;
                                                    this.f9365i = i4;
                                                    return j;
                                                }
                                            }
                                        }
                                    }
                                }
                                j = j3 ^ j6;
                                i4 = i6;
                                this.f9365i = i4;
                                return j;
                            }
                            j2 = j5 ^ j4;
                        }
                    }
                    i4 = i5;
                    j = j2;
                    this.f9365i = i4;
                    return j;
                }
                j = (long) b;
                this.f9365i = i4;
                return j;
            }
        }
        return mo26218s();
    }

    /* renamed from: s */
    public final long mo26218s() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte n = mo26213n();
            j |= ((long) (n & ByteCompanionObject.MAX_VALUE)) << i;
            if ((n & ByteCompanionObject.MIN_VALUE) == 0) {
                return j;
            }
        }
        throw zzadn.zze();
    }

    /* renamed from: t */
    public final void mo26219t() {
        int i = this.f9363g + this.f9364h;
        this.f9363g = i;
        int i2 = this.f9367k;
        if (i > i2) {
            int i3 = i - i2;
            this.f9364h = i3;
            this.f9363g = i - i3;
            return;
        }
        this.f9364h = 0;
    }
}
