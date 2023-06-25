package p040c.p200q.p201a.p264c.p294g.p335i;

import com.google.android.gms.internal.measurement.zzje;
import com.google.android.gms.internal.measurement.zzkp;
import java.util.Arrays;

/* renamed from: c.q.a.c.g.i.xa */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class C5341xa {

    /* renamed from: f */
    public static final C5341xa f10266f = new C5341xa(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f10267a;

    /* renamed from: b */
    public int[] f10268b;

    /* renamed from: c */
    public Object[] f10269c;

    /* renamed from: d */
    public int f10270d;

    /* renamed from: e */
    public boolean f10271e;

    public C5341xa() {
        this(0, new int[8], new Object[8], true);
    }

    public C5341xa(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f10270d = -1;
        this.f10267a = i;
        this.f10268b = iArr;
        this.f10269c = objArr;
        this.f10271e = z;
    }

    /* renamed from: c */
    public static C5341xa m15301c() {
        return f10266f;
    }

    /* renamed from: e */
    public static C5341xa m15302e(C5341xa xaVar, C5341xa xaVar2) {
        int i = xaVar.f10267a + xaVar2.f10267a;
        int[] copyOf = Arrays.copyOf(xaVar.f10268b, i);
        System.arraycopy(xaVar2.f10268b, 0, copyOf, xaVar.f10267a, xaVar2.f10267a);
        Object[] copyOf2 = Arrays.copyOf(xaVar.f10269c, i);
        System.arraycopy(xaVar2.f10269c, 0, copyOf2, xaVar.f10267a, xaVar2.f10267a);
        return new C5341xa(i, copyOf, copyOf2, true);
    }

    /* renamed from: f */
    public static C5341xa m15303f() {
        return new C5341xa(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    public final int mo27925a() {
        int i;
        int i2;
        int i3;
        int i4 = this.f10270d;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f10267a; i6++) {
            int i7 = this.f10268b[i6];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 != 0) {
                if (i9 == 1) {
                    ((Long) this.f10269c[i6]).longValue();
                    i = C4999b8.m13822a(i8 << 3) + 8;
                } else if (i9 == 2) {
                    int a = C4999b8.m13822a(i8 << 3);
                    int zzd = ((zzje) this.f10269c[i6]).zzd();
                    i5 += a + C4999b8.m13822a(zzd) + zzd;
                } else if (i9 == 3) {
                    int D = C4999b8.m13821D(i8);
                    i3 = D + D;
                    i2 = ((C5341xa) this.f10269c[i6]).mo27925a();
                } else if (i9 == 5) {
                    ((Integer) this.f10269c[i6]).intValue();
                    i = C4999b8.m13822a(i8 << 3) + 4;
                } else {
                    throw new IllegalStateException(zzkp.zza());
                }
                i5 += i;
            } else {
                long longValue = ((Long) this.f10269c[i6]).longValue();
                i3 = C4999b8.m13822a(i8 << 3);
                i2 = C4999b8.m13823b(longValue);
            }
            i = i3 + i2;
            i5 += i;
        }
        this.f10270d = i5;
        return i5;
    }

    /* renamed from: b */
    public final int mo27926b() {
        int i = this.f10270d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f10267a; i3++) {
            int i4 = this.f10268b[i3];
            int a = C4999b8.m13822a(8);
            int zzd = ((zzje) this.f10269c[i3]).zzd();
            i2 += a + a + C4999b8.m13822a(16) + C4999b8.m13822a(i4 >>> 3) + C4999b8.m13822a(24) + C4999b8.m13822a(zzd) + zzd;
        }
        this.f10270d = i2;
        return i2;
    }

    /* renamed from: d */
    public final C5341xa mo27927d(C5341xa xaVar) {
        if (xaVar.equals(f10266f)) {
            return this;
        }
        mo27929g();
        int i = this.f10267a + xaVar.f10267a;
        mo27935l(i);
        System.arraycopy(xaVar.f10268b, 0, this.f10268b, this.f10267a, xaVar.f10267a);
        System.arraycopy(xaVar.f10269c, 0, this.f10269c, this.f10267a, xaVar.f10267a);
        this.f10267a = i;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C5341xa)) {
            return false;
        }
        C5341xa xaVar = (C5341xa) obj;
        int i = this.f10267a;
        if (i == xaVar.f10267a) {
            int[] iArr = this.f10268b;
            int[] iArr2 = xaVar.f10268b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.f10269c;
                    Object[] objArr2 = xaVar.f10269c;
                    int i3 = this.f10267a;
                    int i4 = 0;
                    while (i4 < i3) {
                        if (objArr[i4].equals(objArr2[i4])) {
                            i4++;
                        }
                    }
                    return true;
                } else if (iArr[i2] != iArr2[i2]) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        return false;
    }

    /* renamed from: g */
    public final void mo27929g() {
        if (!this.f10271e) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: h */
    public final void mo27930h() {
        this.f10271e = false;
    }

    public final int hashCode() {
        int i = this.f10267a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f10268b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f10269c;
        int i7 = this.f10267a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    /* renamed from: i */
    public final void mo27932i(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f10267a; i2++) {
            C5325w9.m15177b(sb, i, String.valueOf(this.f10268b[i2] >>> 3), this.f10269c[i2]);
        }
    }

    /* renamed from: j */
    public final void mo27933j(int i, Object obj) {
        mo27929g();
        mo27935l(this.f10267a + 1);
        int[] iArr = this.f10268b;
        int i2 = this.f10267a;
        iArr[i2] = i;
        this.f10269c[i2] = obj;
        this.f10267a = i2 + 1;
    }

    /* renamed from: k */
    public final void mo27934k(C5192nb nbVar) {
        if (this.f10267a != 0) {
            for (int i = 0; i < this.f10267a; i++) {
                int i2 = this.f10268b[i];
                Object obj = this.f10269c[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    nbVar.mo27114h(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    nbVar.mo27102F(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    nbVar.mo27120n(i3, (zzje) obj);
                } else if (i4 == 3) {
                    nbVar.mo27100D(i3);
                    ((C5341xa) obj).mo27934k(nbVar);
                    nbVar.mo27106J(i3);
                } else if (i4 == 5) {
                    nbVar.mo27110d(i3, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(zzkp.zza());
                }
            }
        }
    }

    /* renamed from: l */
    public final void mo27935l(int i) {
        int[] iArr = this.f10268b;
        if (i > iArr.length) {
            int i2 = this.f10267a;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f10268b = Arrays.copyOf(iArr, i);
            this.f10269c = Arrays.copyOf(this.f10269c, i);
        }
    }
}
