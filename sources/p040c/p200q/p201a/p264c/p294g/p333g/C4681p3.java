package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzacc;
import com.google.android.gms.internal.p527firebaseauthapi.zzadn;
import java.util.Arrays;

/* renamed from: c.q.a.c.g.g.p3 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4681p3 {

    /* renamed from: f */
    public static final C4681p3 f9545f = new C4681p3(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f9546a;

    /* renamed from: b */
    public int[] f9547b;

    /* renamed from: c */
    public Object[] f9548c;

    /* renamed from: d */
    public int f9549d;

    /* renamed from: e */
    public boolean f9550e;

    public C4681p3() {
        this(0, new int[8], new Object[8], true);
    }

    public C4681p3(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f9549d = -1;
        this.f9546a = i;
        this.f9547b = iArr;
        this.f9548c = objArr;
        this.f9550e = z;
    }

    /* renamed from: c */
    public static C4681p3 m12775c() {
        return f9545f;
    }

    /* renamed from: e */
    public static C4681p3 m12776e(C4681p3 p3Var, C4681p3 p3Var2) {
        int i = p3Var.f9546a + p3Var2.f9546a;
        int[] copyOf = Arrays.copyOf(p3Var.f9547b, i);
        System.arraycopy(p3Var2.f9547b, 0, copyOf, p3Var.f9546a, p3Var2.f9546a);
        Object[] copyOf2 = Arrays.copyOf(p3Var.f9548c, i);
        System.arraycopy(p3Var2.f9548c, 0, copyOf2, p3Var.f9546a, p3Var2.f9546a);
        return new C4681p3(i, copyOf, copyOf2, true);
    }

    /* renamed from: f */
    public static C4681p3 m12777f() {
        return new C4681p3(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    public final int mo26498a() {
        int i;
        int i2;
        int i3;
        int i4 = this.f9549d;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f9546a; i6++) {
            int i7 = this.f9547b[i6];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 != 0) {
                if (i9 == 1) {
                    ((Long) this.f9548c[i6]).longValue();
                    i = C4783t0.m13103f(i8 << 3) + 8;
                } else if (i9 == 2) {
                    int f = C4783t0.m13103f(i8 << 3);
                    int zzd = ((zzacc) this.f9548c[i6]).zzd();
                    i5 += f + C4783t0.m13103f(zzd) + zzd;
                } else if (i9 == 3) {
                    int e = C4783t0.m13102e(i8);
                    i3 = e + e;
                    i2 = ((C4681p3) this.f9548c[i6]).mo26498a();
                } else if (i9 == 5) {
                    ((Integer) this.f9548c[i6]).intValue();
                    i = C4783t0.m13103f(i8 << 3) + 4;
                } else {
                    throw new IllegalStateException(zzadn.zza());
                }
                i5 += i;
            } else {
                long longValue = ((Long) this.f9548c[i6]).longValue();
                i3 = C4783t0.m13103f(i8 << 3);
                i2 = C4783t0.m13104g(longValue);
            }
            i = i3 + i2;
            i5 += i;
        }
        this.f9549d = i5;
        return i5;
    }

    /* renamed from: b */
    public final int mo26499b() {
        int i = this.f9549d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f9546a; i3++) {
            int i4 = this.f9547b[i3];
            int f = C4783t0.m13103f(8);
            int zzd = ((zzacc) this.f9548c[i3]).zzd();
            i2 += f + f + C4783t0.m13103f(16) + C4783t0.m13103f(i4 >>> 3) + C4783t0.m13103f(24) + C4783t0.m13103f(zzd) + zzd;
        }
        this.f9549d = i2;
        return i2;
    }

    /* renamed from: d */
    public final C4681p3 mo26500d(C4681p3 p3Var) {
        if (p3Var.equals(f9545f)) {
            return this;
        }
        mo26502g();
        int i = this.f9546a + p3Var.f9546a;
        mo26508l(i);
        System.arraycopy(p3Var.f9547b, 0, this.f9547b, this.f9546a, p3Var.f9546a);
        System.arraycopy(p3Var.f9548c, 0, this.f9548c, this.f9546a, p3Var.f9546a);
        this.f9546a = i;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C4681p3)) {
            return false;
        }
        C4681p3 p3Var = (C4681p3) obj;
        int i = this.f9546a;
        if (i == p3Var.f9546a) {
            int[] iArr = this.f9547b;
            int[] iArr2 = p3Var.f9547b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.f9548c;
                    Object[] objArr2 = p3Var.f9548c;
                    int i3 = this.f9546a;
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
    public final void mo26502g() {
        if (!this.f9550e) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: h */
    public final void mo26503h() {
        this.f9550e = false;
    }

    public final int hashCode() {
        int i = this.f9546a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f9547b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f9548c;
        int i7 = this.f9546a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    /* renamed from: i */
    public final void mo26505i(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f9546a; i2++) {
            C4626n2.m12518b(sb, i, String.valueOf(this.f9547b[i2] >>> 3), this.f9548c[i2]);
        }
    }

    /* renamed from: j */
    public final void mo26506j(int i, Object obj) {
        mo26502g();
        mo26508l(this.f9546a + 1);
        int[] iArr = this.f9547b;
        int i2 = this.f9546a;
        iArr[i2] = i;
        this.f9548c[i2] = obj;
        this.f9546a = i2 + 1;
    }

    /* renamed from: k */
    public final void mo26507k(C4809u0 u0Var) {
        if (this.f9546a != 0) {
            for (int i = 0; i < this.f9546a; i++) {
                int i2 = this.f9547b[i];
                Object obj = this.f9548c[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    u0Var.mo26689E(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    u0Var.mo26718x(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    u0Var.mo26709o(i3, (zzacc) obj);
                } else if (i4 == 3) {
                    u0Var.mo26700e(i3);
                    ((C4681p3) obj).mo26507k(u0Var);
                    u0Var.mo26713s(i3);
                } else if (i4 == 5) {
                    u0Var.mo26716v(i3, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(zzadn.zza());
                }
            }
        }
    }

    /* renamed from: l */
    public final void mo26508l(int i) {
        int[] iArr = this.f9547b;
        if (i > iArr.length) {
            int i2 = this.f9546a;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f9547b = Arrays.copyOf(iArr, i);
            this.f9548c = Arrays.copyOf(this.f9548c, i);
        }
    }
}
