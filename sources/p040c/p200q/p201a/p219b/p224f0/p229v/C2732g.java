package p040c.p200q.p201a.p219b.p224f0.p229v;

import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import kotlinx.coroutines.EventLoop_commonKt;
import p040c.p200q.p201a.p219b.C2627d;
import p040c.p200q.p201a.p219b.p224f0.C2669b;
import p040c.p200q.p201a.p219b.p224f0.C2674g;
import p040c.p200q.p201a.p219b.p224f0.C2675h;
import p040c.p200q.p201a.p219b.p224f0.C2676i;
import p040c.p200q.p201a.p219b.p224f0.C2681n;
import p040c.p200q.p201a.p219b.p224f0.C2682o;
import p040c.p200q.p201a.p219b.p224f0.C2686q;
import p040c.p200q.p201a.p219b.p224f0.p229v.C2718c;
import p040c.p200q.p201a.p219b.p250l0.p251k.C3055g;
import p040c.p200q.p201a.p219b.p261o0.C3146b0;
import p040c.p200q.p201a.p219b.p261o0.C3151e;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3163m;
import p040c.p200q.p201a.p219b.p261o0.C3168q;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.f0.v.g */
/* compiled from: FragmentedMp4Extractor */
public final class C2732g implements C2674g {

    /* renamed from: H */
    public static final int f3813H = C3152e0.m7764D("seig");

    /* renamed from: I */
    public static final byte[] f3814I = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: J */
    public static final Format f3815J = Format.m10241o((String) null, "application/x-emsg", Long.MAX_VALUE);

    /* renamed from: A */
    public int f3816A;

    /* renamed from: B */
    public int f3817B;

    /* renamed from: C */
    public boolean f3818C;

    /* renamed from: D */
    public C2676i f3819D;

    /* renamed from: E */
    public C2686q[] f3820E;

    /* renamed from: F */
    public C2686q[] f3821F;

    /* renamed from: G */
    public boolean f3822G;

    /* renamed from: a */
    public final int f3823a;
    @Nullable

    /* renamed from: b */
    public final C2741l f3824b;

    /* renamed from: c */
    public final List<Format> f3825c;
    @Nullable

    /* renamed from: d */
    public final DrmInitData f3826d;

    /* renamed from: e */
    public final SparseArray<C2734b> f3827e;

    /* renamed from: f */
    public final C3173t f3828f;

    /* renamed from: g */
    public final C3173t f3829g;

    /* renamed from: h */
    public final C3173t f3830h;
    @Nullable

    /* renamed from: i */
    public final C3146b0 f3831i;

    /* renamed from: j */
    public final C3173t f3832j;

    /* renamed from: k */
    public final byte[] f3833k;

    /* renamed from: l */
    public final ArrayDeque<C2718c.C2719a> f3834l;

    /* renamed from: m */
    public final ArrayDeque<C2733a> f3835m;
    @Nullable

    /* renamed from: n */
    public final C2686q f3836n;

    /* renamed from: o */
    public int f3837o;

    /* renamed from: p */
    public int f3838p;

    /* renamed from: q */
    public long f3839q;

    /* renamed from: r */
    public int f3840r;

    /* renamed from: s */
    public C3173t f3841s;

    /* renamed from: t */
    public long f3842t;

    /* renamed from: u */
    public int f3843u;

    /* renamed from: v */
    public long f3844v;

    /* renamed from: w */
    public long f3845w;

    /* renamed from: x */
    public long f3846x;

    /* renamed from: y */
    public C2734b f3847y;

    /* renamed from: z */
    public int f3848z;

    /* renamed from: c.q.a.b.f0.v.g$a */
    /* compiled from: FragmentedMp4Extractor */
    public static final class C2733a {

        /* renamed from: a */
        public final long f3849a;

        /* renamed from: b */
        public final int f3850b;

        public C2733a(long j, int i) {
            this.f3849a = j;
            this.f3850b = i;
        }
    }

    /* renamed from: c.q.a.b.f0.v.g$b */
    /* compiled from: FragmentedMp4Extractor */
    public static final class C2734b {

        /* renamed from: a */
        public final C2686q f3851a;

        /* renamed from: b */
        public final C2743n f3852b = new C2743n();

        /* renamed from: c */
        public C2741l f3853c;

        /* renamed from: d */
        public C2728e f3854d;

        /* renamed from: e */
        public int f3855e;

        /* renamed from: f */
        public int f3856f;

        /* renamed from: g */
        public int f3857g;

        /* renamed from: h */
        public int f3858h;

        /* renamed from: i */
        public final C3173t f3859i = new C3173t(1);

        /* renamed from: j */
        public final C3173t f3860j = new C3173t();

        public C2734b(C2686q qVar) {
            this.f3851a = qVar;
        }

        /* renamed from: c */
        public final C2742m mo18666c() {
            C2743n nVar = this.f3852b;
            int i = nVar.f3933a.f3803a;
            C2742m mVar = nVar.f3947o;
            if (mVar == null) {
                mVar = this.f3853c.mo18683a(i);
            }
            if (mVar == null || !mVar.f3928a) {
                return null;
            }
            return mVar;
        }

        /* renamed from: d */
        public void mo18667d(C2741l lVar, C2728e eVar) {
            C3151e.m7757e(lVar);
            this.f3853c = lVar;
            C3151e.m7757e(eVar);
            this.f3854d = eVar;
            this.f3851a.mo18546d(lVar.f3922f);
            mo18670g();
        }

        /* renamed from: e */
        public boolean mo18668e() {
            this.f3855e++;
            int i = this.f3856f + 1;
            this.f3856f = i;
            int[] iArr = this.f3852b.f3940h;
            int i2 = this.f3857g;
            if (i != iArr[i2]) {
                return true;
            }
            this.f3857g = i2 + 1;
            this.f3856f = 0;
            return false;
        }

        /* renamed from: f */
        public int mo18669f() {
            C3173t tVar;
            C2742m c = mo18666c();
            if (c == null) {
                return 0;
            }
            int i = c.f3931d;
            if (i != 0) {
                tVar = this.f3852b.f3949q;
            } else {
                byte[] bArr = c.f3932e;
                this.f3860j.mo20004J(bArr, bArr.length);
                C3173t tVar2 = this.f3860j;
                i = bArr.length;
                tVar = tVar2;
            }
            boolean g = this.f3852b.mo18690g(this.f3855e);
            this.f3859i.f5877a[0] = (byte) ((g ? 128 : 0) | i);
            this.f3859i.mo20006L(0);
            this.f3851a.mo18544b(this.f3859i, 1);
            this.f3851a.mo18544b(tVar, i);
            if (!g) {
                return i + 1;
            }
            C3173t tVar3 = this.f3852b.f3949q;
            int E = tVar3.mo19999E();
            tVar3.mo20007M(-2);
            int i2 = (E * 6) + 2;
            this.f3851a.mo18544b(tVar3, i2);
            return i + 1 + i2;
        }

        /* renamed from: g */
        public void mo18670g() {
            this.f3852b.mo18689f();
            this.f3855e = 0;
            this.f3857g = 0;
            this.f3856f = 0;
            this.f3858h = 0;
        }

        /* renamed from: h */
        public void mo18671h(long j) {
            long b = C2627d.m5058b(j);
            int i = this.f3855e;
            while (true) {
                C2743n nVar = this.f3852b;
                if (i < nVar.f3938f && nVar.mo18686c(i) < b) {
                    if (this.f3852b.f3944l[i]) {
                        this.f3858h = i;
                    }
                    i++;
                } else {
                    return;
                }
            }
        }

        /* renamed from: i */
        public final void mo18672i() {
            C2742m c = mo18666c();
            if (c != null) {
                C3173t tVar = this.f3852b.f3949q;
                int i = c.f3931d;
                if (i != 0) {
                    tVar.mo20007M(i);
                }
                if (this.f3852b.mo18690g(this.f3855e)) {
                    tVar.mo20007M(tVar.mo19999E() * 6);
                }
            }
        }

        /* renamed from: j */
        public void mo18673j(DrmInitData drmInitData) {
            C2742m a = this.f3853c.mo18683a(this.f3852b.f3933a.f3803a);
            this.f3851a.mo18546d(this.f3853c.f3922f.mo23914b(drmInitData.mo23982c(a != null ? a.f3929b : null)));
        }
    }

    static {
        C2716a aVar = C2716a.f3664a;
    }

    public C2732g() {
        this(0);
    }

    /* renamed from: A */
    public static C2734b m5511A(C3173t tVar, SparseArray<C2734b> sparseArray) {
        tVar.mo20006L(8);
        int b = C2718c.m5466b(tVar.mo20017j());
        C2734b i = m5521i(sparseArray, tVar.mo20017j());
        if (i == null) {
            return null;
        }
        if ((b & 1) != 0) {
            long D = tVar.mo19998D();
            C2743n nVar = i.f3852b;
            nVar.f3935c = D;
            nVar.f3936d = D;
        }
        C2728e eVar = i.f3854d;
        i.f3852b.f3933a = new C2728e((b & 2) != 0 ? tVar.mo19997C() - 1 : eVar.f3803a, (b & 8) != 0 ? tVar.mo19997C() : eVar.f3804b, (b & 16) != 0 ? tVar.mo19997C() : eVar.f3805c, (b & 32) != 0 ? tVar.mo19997C() : eVar.f3806d);
        return i;
    }

    /* renamed from: B */
    public static void m5512B(C2718c.C2719a aVar, SparseArray<C2734b> sparseArray, int i, byte[] bArr) {
        C2734b A = m5511A(aVar.mo18647g(C2718c.f3761y).f3769W0, sparseArray);
        if (A != null) {
            C2743n nVar = A.f3852b;
            long j = nVar.f3951s;
            A.mo18670g();
            if (aVar.mo18647g(C2718c.f3759x) != null && (i & 2) == 0) {
                j = m5531z(aVar.mo18647g(C2718c.f3759x).f3769W0);
            }
            m5515E(aVar, A, j, i);
            C2742m a = A.f3853c.mo18683a(nVar.f3933a.f3803a);
            C2718c.C2720b g = aVar.mo18647g(C2718c.f3720d0);
            if (g != null) {
                m5526u(a, g.f3769W0, nVar);
            }
            C2718c.C2720b g2 = aVar.mo18647g(C2718c.f3722e0);
            if (g2 != null) {
                m5525t(g2.f3769W0, nVar);
            }
            C2718c.C2720b g3 = aVar.mo18647g(C2718c.f3730i0);
            if (g3 != null) {
                m5528w(g3.f3769W0, nVar);
            }
            C2718c.C2720b g4 = aVar.mo18647g(C2718c.f3724f0);
            C2718c.C2720b g5 = aVar.mo18647g(C2718c.f3726g0);
            if (!(g4 == null || g5 == null)) {
                m5529x(g4.f3769W0, g5.f3769W0, a != null ? a.f3929b : null, nVar);
            }
            int size = aVar.f3767X0.size();
            for (int i2 = 0; i2 < size; i2++) {
                C2718c.C2720b bVar = aVar.f3767X0.get(i2);
                if (bVar.f3765a == C2718c.f3728h0) {
                    m5516F(bVar.f3769W0, nVar, bArr);
                }
            }
        }
    }

    /* renamed from: C */
    public static Pair<Integer, C2728e> m5513C(C3173t tVar) {
        tVar.mo20006L(12);
        return Pair.create(Integer.valueOf(tVar.mo20017j()), new C2728e(tVar.mo19997C() - 1, tVar.mo19997C(), tVar.mo19997C(), tVar.mo20017j()));
    }

    /* renamed from: D */
    public static int m5514D(C2734b bVar, int i, long j, int i2, C3173t tVar, int i3) {
        boolean z;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        C2734b bVar2 = bVar;
        tVar.mo20006L(8);
        int b = C2718c.m5466b(tVar.mo20017j());
        C2741l lVar = bVar2.f3853c;
        C2743n nVar = bVar2.f3852b;
        C2728e eVar = nVar.f3933a;
        nVar.f3940h[i] = tVar.mo19997C();
        long[] jArr = nVar.f3939g;
        jArr[i] = nVar.f3935c;
        if ((b & 1) != 0) {
            jArr[i] = jArr[i] + ((long) tVar.mo20017j());
        }
        boolean z7 = (b & 4) != 0;
        int i6 = eVar.f3806d;
        if (z7) {
            i6 = tVar.mo19997C();
        }
        boolean z8 = (b & 256) != 0;
        boolean z9 = (b & 512) != 0;
        boolean z10 = (b & 1024) != 0;
        boolean z11 = (b & 2048) != 0;
        long[] jArr2 = lVar.f3924h;
        long j2 = 0;
        if (jArr2 != null && jArr2.length == 1 && jArr2[0] == 0) {
            j2 = C3152e0.m7792c0(lVar.f3925i[0], 1000, lVar.f3919c);
        }
        int[] iArr = nVar.f3941i;
        int[] iArr2 = nVar.f3942j;
        long[] jArr3 = nVar.f3943k;
        boolean[] zArr = nVar.f3944l;
        int i7 = i6;
        boolean z12 = lVar.f3918b == 2 && (i2 & 1) != 0;
        int i8 = i3 + nVar.f3940h[i];
        long j3 = lVar.f3919c;
        long j4 = j2;
        boolean[] zArr2 = zArr;
        long j5 = i > 0 ? nVar.f3951s : j;
        int i9 = i3;
        while (i9 < i8) {
            int C = z8 ? tVar.mo19997C() : eVar.f3804b;
            if (z9) {
                z = z8;
                i4 = tVar.mo19997C();
            } else {
                z = z8;
                i4 = eVar.f3805c;
            }
            if (i9 == 0 && z7) {
                z2 = z7;
                i5 = i7;
            } else if (z10) {
                z2 = z7;
                i5 = tVar.mo20017j();
            } else {
                z2 = z7;
                i5 = eVar.f3806d;
            }
            if (z11) {
                z5 = z11;
                z4 = z9;
                z3 = z10;
                iArr2[i9] = (int) ((((long) tVar.mo20017j()) * 1000) / j3);
                z6 = false;
            } else {
                z5 = z11;
                z4 = z9;
                z3 = z10;
                z6 = false;
                iArr2[i9] = 0;
            }
            jArr3[i9] = C3152e0.m7792c0(j5, 1000, j3) - j4;
            iArr[i9] = i4;
            zArr2[i9] = (((i5 >> 16) & 1) != 0 || (z12 && i9 != 0)) ? z6 : true;
            i9++;
            j5 += (long) C;
            j3 = j3;
            z8 = z;
            z7 = z2;
            z11 = z5;
            z9 = z4;
            z10 = z3;
        }
        nVar.f3951s = j5;
        return i8;
    }

    /* renamed from: E */
    public static void m5515E(C2718c.C2719a aVar, C2734b bVar, long j, int i) {
        List<C2718c.C2720b> list = aVar.f3767X0;
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C2718c.C2720b bVar2 = list.get(i4);
            if (bVar2.f3765a == C2718c.f3666A) {
                C3173t tVar = bVar2.f3769W0;
                tVar.mo20006L(12);
                int C = tVar.mo19997C();
                if (C > 0) {
                    i3 += C;
                    i2++;
                }
            }
        }
        bVar.f3857g = 0;
        bVar.f3856f = 0;
        bVar.f3855e = 0;
        bVar.f3852b.mo18688e(i2, i3);
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            C2718c.C2720b bVar3 = list.get(i7);
            if (bVar3.f3765a == C2718c.f3666A) {
                i6 = m5514D(bVar, i5, j, i, bVar3.f3769W0, i6);
                i5++;
            }
        }
    }

    /* renamed from: F */
    public static void m5516F(C3173t tVar, C2743n nVar, byte[] bArr) {
        tVar.mo20006L(8);
        tVar.mo20015h(bArr, 0, 16);
        if (Arrays.equals(bArr, f3814I)) {
            m5527v(tVar, 16, nVar);
        }
    }

    /* renamed from: L */
    public static boolean m5517L(int i) {
        return i == C2718c.f3670C || i == C2718c.f3674E || i == C2718c.f3676F || i == C2718c.f3678G || i == C2718c.f3680H || i == C2718c.f3688L || i == C2718c.f3690M || i == C2718c.f3692N || i == C2718c.f3698Q;
    }

    /* renamed from: M */
    public static boolean m5518M(int i) {
        return i == C2718c.f3704T || i == C2718c.f3702S || i == C2718c.f3672D || i == C2718c.f3668B || i == C2718c.f3706U || i == C2718c.f3759x || i == C2718c.f3761y || i == C2718c.f3696P || i == C2718c.f3763z || i == C2718c.f3666A || i == C2718c.f3708V || i == C2718c.f3720d0 || i == C2718c.f3722e0 || i == C2718c.f3730i0 || i == C2718c.f3728h0 || i == C2718c.f3724f0 || i == C2718c.f3726g0 || i == C2718c.f3700R || i == C2718c.f3694O || i == C2718c.f3681H0;
    }

    /* renamed from: d */
    public static DrmInitData m5519d(List<C2718c.C2720b> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            C2718c.C2720b bVar = list.get(i);
            if (bVar.f3765a == C2718c.f3708V) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = bVar.f3769W0.f5877a;
                UUID d = C2738j.m5597d(bArr);
                if (d == null) {
                    C3163m.m7880f("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new DrmInitData.SchemeData(d, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData((List<DrmInitData.SchemeData>) arrayList);
    }

    /* renamed from: h */
    public static C2734b m5520h(SparseArray<C2734b> sparseArray) {
        int size = sparseArray.size();
        C2734b bVar = null;
        long j = Long.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            C2734b valueAt = sparseArray.valueAt(i);
            int i2 = valueAt.f3857g;
            C2743n nVar = valueAt.f3852b;
            if (i2 != nVar.f3937e) {
                long j2 = nVar.f3939g[i2];
                if (j2 < j) {
                    bVar = valueAt;
                    j = j2;
                }
            }
        }
        return bVar;
    }

    @Nullable
    /* renamed from: i */
    public static C2734b m5521i(SparseArray<C2734b> sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return sparseArray.get(i);
    }

    /* renamed from: j */
    public static /* synthetic */ C2674g[] m5522j() {
        return new C2674g[]{new C2732g()};
    }

    /* renamed from: r */
    public static long m5523r(C3173t tVar) {
        tVar.mo20006L(8);
        return C2718c.m5467c(tVar.mo20017j()) == 0 ? tVar.mo19995A() : tVar.mo19998D();
    }

    /* renamed from: s */
    public static void m5524s(C2718c.C2719a aVar, SparseArray<C2734b> sparseArray, int i, byte[] bArr) {
        int size = aVar.f3768Y0.size();
        for (int i2 = 0; i2 < size; i2++) {
            C2718c.C2719a aVar2 = aVar.f3768Y0.get(i2);
            if (aVar2.f3765a == C2718c.f3690M) {
                m5512B(aVar2, sparseArray, i, bArr);
            }
        }
    }

    /* renamed from: t */
    public static void m5525t(C3173t tVar, C2743n nVar) {
        tVar.mo20006L(8);
        int j = tVar.mo20017j();
        if ((C2718c.m5466b(j) & 1) == 1) {
            tVar.mo20007M(8);
        }
        int C = tVar.mo19997C();
        if (C == 1) {
            nVar.f3936d += C2718c.m5467c(j) == 0 ? tVar.mo19995A() : tVar.mo19998D();
            return;
        }
        throw new ParserException("Unexpected saio entry count: " + C);
    }

    /* renamed from: u */
    public static void m5526u(C2742m mVar, C3173t tVar, C2743n nVar) {
        int i;
        int i2 = mVar.f3931d;
        tVar.mo20006L(8);
        boolean z = true;
        if ((C2718c.m5466b(tVar.mo20017j()) & 1) == 1) {
            tVar.mo20007M(8);
        }
        int y = tVar.mo20032y();
        int C = tVar.mo19997C();
        if (C == nVar.f3938f) {
            if (y == 0) {
                boolean[] zArr = nVar.f3946n;
                i = 0;
                for (int i3 = 0; i3 < C; i3++) {
                    int y2 = tVar.mo20032y();
                    i += y2;
                    zArr[i3] = y2 > i2;
                }
            } else {
                if (y <= i2) {
                    z = false;
                }
                i = (y * C) + 0;
                Arrays.fill(nVar.f3946n, 0, C, z);
            }
            nVar.mo18687d(i);
            return;
        }
        throw new ParserException("Length mismatch: " + C + ", " + nVar.f3938f);
    }

    /* renamed from: v */
    public static void m5527v(C3173t tVar, int i, C2743n nVar) {
        tVar.mo20006L(i + 8);
        int b = C2718c.m5466b(tVar.mo20017j());
        if ((b & 1) == 0) {
            boolean z = (b & 2) != 0;
            int C = tVar.mo19997C();
            if (C == nVar.f3938f) {
                Arrays.fill(nVar.f3946n, 0, C, z);
                nVar.mo18687d(tVar.mo20008a());
                nVar.mo18685b(tVar);
                return;
            }
            throw new ParserException("Length mismatch: " + C + ", " + nVar.f3938f);
        }
        throw new ParserException("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /* renamed from: w */
    public static void m5528w(C3173t tVar, C2743n nVar) {
        m5527v(tVar, 0, nVar);
    }

    /* renamed from: x */
    public static void m5529x(C3173t tVar, C3173t tVar2, String str, C2743n nVar) {
        byte[] bArr;
        tVar.mo20006L(8);
        int j = tVar.mo20017j();
        if (tVar.mo20017j() == f3813H) {
            if (C2718c.m5467c(j) == 1) {
                tVar.mo20007M(4);
            }
            if (tVar.mo20017j() == 1) {
                tVar2.mo20006L(8);
                int j2 = tVar2.mo20017j();
                if (tVar2.mo20017j() == f3813H) {
                    int c = C2718c.m5467c(j2);
                    if (c == 1) {
                        if (tVar2.mo19995A() == 0) {
                            throw new ParserException("Variable length description in sgpd found (unsupported)");
                        }
                    } else if (c >= 2) {
                        tVar2.mo20007M(4);
                    }
                    if (tVar2.mo19995A() == 1) {
                        tVar2.mo20007M(1);
                        int y = tVar2.mo20032y();
                        int i = (y & 240) >> 4;
                        int i2 = y & 15;
                        boolean z = tVar2.mo20032y() == 1;
                        if (z) {
                            int y2 = tVar2.mo20032y();
                            byte[] bArr2 = new byte[16];
                            tVar2.mo20015h(bArr2, 0, 16);
                            if (!z || y2 != 0) {
                                bArr = null;
                            } else {
                                int y3 = tVar2.mo20032y();
                                byte[] bArr3 = new byte[y3];
                                tVar2.mo20015h(bArr3, 0, y3);
                                bArr = bArr3;
                            }
                            nVar.f3945m = true;
                            nVar.f3947o = new C2742m(z, str, y2, bArr2, i, i2, bArr);
                            return;
                        }
                        return;
                    }
                    throw new ParserException("Entry count in sgpd != 1 (unsupported).");
                }
                return;
            }
            throw new ParserException("Entry count in sbgp != 1 (unsupported).");
        }
    }

    /* renamed from: y */
    public static Pair<Long, C2669b> m5530y(C3173t tVar, long j) {
        long j2;
        long j3;
        C3173t tVar2 = tVar;
        tVar2.mo20006L(8);
        int c = C2718c.m5467c(tVar.mo20017j());
        tVar2.mo20007M(4);
        long A = tVar.mo19995A();
        if (c == 0) {
            j3 = tVar.mo19995A();
            j2 = tVar.mo19995A();
        } else {
            j3 = tVar.mo19998D();
            j2 = tVar.mo19998D();
        }
        long j4 = j3;
        long j5 = j + j2;
        long c0 = C3152e0.m7792c0(j4, EventLoop_commonKt.MS_TO_NS, A);
        tVar2.mo20007M(2);
        int E = tVar.mo19999E();
        int[] iArr = new int[E];
        long[] jArr = new long[E];
        long[] jArr2 = new long[E];
        long[] jArr3 = new long[E];
        long j6 = c0;
        long j7 = j4;
        int i = 0;
        long j8 = j7;
        while (i < E) {
            int j9 = tVar.mo20017j();
            if ((j9 & Integer.MIN_VALUE) == 0) {
                long A2 = tVar.mo19995A();
                iArr[i] = j9 & Integer.MAX_VALUE;
                jArr[i] = j5;
                jArr3[i] = j6;
                long j10 = j8 + A2;
                long[] jArr4 = jArr2;
                long[] jArr5 = jArr3;
                int i2 = E;
                int[] iArr2 = iArr;
                long c02 = C3152e0.m7792c0(j10, EventLoop_commonKt.MS_TO_NS, A);
                jArr4[i] = c02 - jArr5[i];
                tVar2.mo20007M(4);
                j5 += (long) iArr2[i];
                i++;
                iArr = iArr2;
                jArr3 = jArr5;
                jArr2 = jArr4;
                jArr = jArr;
                E = i2;
                long j11 = c02;
                j8 = j10;
                j6 = j11;
            } else {
                throw new ParserException("Unhandled indirect reference");
            }
        }
        return Pair.create(Long.valueOf(c0), new C2669b(iArr, jArr, jArr2, jArr3));
    }

    /* renamed from: z */
    public static long m5531z(C3173t tVar) {
        tVar.mo20006L(8);
        return C2718c.m5467c(tVar.mo20017j()) == 1 ? tVar.mo19998D() : tVar.mo19995A();
    }

    /* renamed from: G */
    public final void mo18652G(long j) {
        while (!this.f3834l.isEmpty() && this.f3834l.peek().f3766W0 == j) {
            mo18660l(this.f3834l.pop());
        }
        mo18657a();
    }

    /* renamed from: H */
    public final boolean mo18653H(C2675h hVar) {
        if (this.f3840r == 0) {
            if (!hVar.mo18522a(this.f3832j.f5877a, 0, 8, true)) {
                return false;
            }
            this.f3840r = 8;
            this.f3832j.mo20006L(0);
            this.f3839q = this.f3832j.mo19995A();
            this.f3838p = this.f3832j.mo20017j();
        }
        long j = this.f3839q;
        if (j == 1) {
            hVar.readFully(this.f3832j.f5877a, 8, 8);
            this.f3840r += 8;
            this.f3839q = this.f3832j.mo19998D();
        } else if (j == 0) {
            long e = hVar.mo18526e();
            if (e == -1 && !this.f3834l.isEmpty()) {
                e = this.f3834l.peek().f3766W0;
            }
            if (e != -1) {
                this.f3839q = (e - hVar.getPosition()) + ((long) this.f3840r);
            }
        }
        if (this.f3839q >= ((long) this.f3840r)) {
            long position = hVar.getPosition() - ((long) this.f3840r);
            if (this.f3838p == C2718c.f3688L) {
                int size = this.f3827e.size();
                for (int i = 0; i < size; i++) {
                    C2743n nVar = this.f3827e.valueAt(i).f3852b;
                    nVar.f3934b = position;
                    nVar.f3936d = position;
                    nVar.f3935c = position;
                }
            }
            int i2 = this.f3838p;
            if (i2 == C2718c.f3729i) {
                this.f3847y = null;
                this.f3842t = this.f3839q + position;
                if (!this.f3822G) {
                    this.f3819D.mo18553c(new C2682o.C2684b(this.f3845w, position));
                    this.f3822G = true;
                }
                this.f3837o = 2;
                return true;
            }
            if (m5517L(i2)) {
                long position2 = (hVar.getPosition() + this.f3839q) - 8;
                this.f3834l.push(new C2718c.C2719a(this.f3838p, position2));
                if (this.f3839q == ((long) this.f3840r)) {
                    mo18652G(position2);
                } else {
                    mo18657a();
                }
            } else if (m5518M(this.f3838p)) {
                if (this.f3840r == 8) {
                    long j2 = this.f3839q;
                    if (j2 <= 2147483647L) {
                        C3173t tVar = new C3173t((int) j2);
                        this.f3841s = tVar;
                        System.arraycopy(this.f3832j.f5877a, 0, tVar.f5877a, 0, 8);
                        this.f3837o = 1;
                    } else {
                        throw new ParserException("Leaf atom with length > 2147483647 (unsupported).");
                    }
                } else {
                    throw new ParserException("Leaf atom defines extended atom size (unsupported).");
                }
            } else if (this.f3839q <= 2147483647L) {
                this.f3841s = null;
                this.f3837o = 1;
            } else {
                throw new ParserException("Skipping atom with length > 2147483647 (unsupported).");
            }
            return true;
        }
        throw new ParserException("Atom size less than header length (unsupported).");
    }

    /* renamed from: I */
    public final void mo18654I(C2675h hVar) {
        int i = ((int) this.f3839q) - this.f3840r;
        C3173t tVar = this.f3841s;
        if (tVar != null) {
            hVar.readFully(tVar.f5877a, 8, i);
            mo18662n(new C2718c.C2720b(this.f3838p, this.f3841s), hVar.getPosition());
        } else {
            hVar.mo18528g(i);
        }
        mo18652G(hVar.getPosition());
    }

    /* renamed from: J */
    public final void mo18655J(C2675h hVar) {
        int size = this.f3827e.size();
        C2734b bVar = null;
        long j = Long.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            C2743n nVar = this.f3827e.valueAt(i).f3852b;
            if (nVar.f3950r) {
                long j2 = nVar.f3936d;
                if (j2 < j) {
                    bVar = this.f3827e.valueAt(i);
                    j = j2;
                }
            }
        }
        if (bVar == null) {
            this.f3837o = 3;
            return;
        }
        int position = (int) (j - hVar.getPosition());
        if (position >= 0) {
            hVar.mo18528g(position);
            bVar.f3852b.mo18684a(hVar);
            return;
        }
        throw new ParserException("Offset to encryption data was negative.");
    }

    /* renamed from: K */
    public final boolean mo18656K(C2675h hVar) {
        C2686q.C2687a aVar;
        boolean z;
        int i;
        C2675h hVar2 = hVar;
        int i2 = 4;
        boolean z2 = true;
        boolean z3 = false;
        if (this.f3837o == 3) {
            if (this.f3847y == null) {
                C2734b h = m5520h(this.f3827e);
                if (h == null) {
                    int position = (int) (this.f3842t - hVar.getPosition());
                    if (position >= 0) {
                        hVar2.mo18528g(position);
                        mo18657a();
                        return false;
                    }
                    throw new ParserException("Offset to end of mdat was negative.");
                }
                int position2 = (int) (h.f3852b.f3939g[h.f3857g] - hVar.getPosition());
                if (position2 < 0) {
                    C3163m.m7880f("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                    position2 = 0;
                }
                hVar2.mo18528g(position2);
                this.f3847y = h;
            }
            C2734b bVar = this.f3847y;
            int[] iArr = bVar.f3852b.f3941i;
            int i3 = bVar.f3855e;
            int i4 = iArr[i3];
            this.f3848z = i4;
            if (i3 < bVar.f3858h) {
                hVar2.mo18528g(i4);
                this.f3847y.mo18672i();
                if (!this.f3847y.mo18668e()) {
                    this.f3847y = null;
                }
                this.f3837o = 3;
                return true;
            }
            if (bVar.f3853c.f3923g == 1) {
                this.f3848z = i4 - 8;
                hVar2.mo18528g(8);
            }
            int f = this.f3847y.mo18669f();
            this.f3816A = f;
            this.f3848z += f;
            this.f3837o = 4;
            this.f3817B = 0;
        }
        C2734b bVar2 = this.f3847y;
        C2743n nVar = bVar2.f3852b;
        C2741l lVar = bVar2.f3853c;
        C2686q qVar = bVar2.f3851a;
        int i5 = bVar2.f3855e;
        long c = nVar.mo18686c(i5) * 1000;
        C3146b0 b0Var = this.f3831i;
        if (b0Var != null) {
            c = b0Var.mo19943a(c);
        }
        long j = c;
        int i6 = lVar.f3926j;
        if (i6 == 0) {
            while (true) {
                int i7 = this.f3816A;
                int i8 = this.f3848z;
                if (i7 >= i8) {
                    break;
                }
                this.f3816A += qVar.mo18543a(hVar2, i8 - i7, false);
            }
        } else {
            byte[] bArr = this.f3829g.f5877a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i9 = i6 + 1;
            int i10 = 4 - i6;
            while (this.f3816A < this.f3848z) {
                int i11 = this.f3817B;
                if (i11 == 0) {
                    hVar2.readFully(bArr, i10, i9);
                    this.f3829g.mo20006L(z3);
                    this.f3817B = this.f3829g.mo19997C() - (z2 ? 1 : 0);
                    this.f3828f.mo20006L(z3);
                    qVar.mo18544b(this.f3828f, i2);
                    qVar.mo18544b(this.f3829g, z2);
                    this.f3818C = (this.f3821F.length <= 0 || !C3168q.m7908g(lVar.f3922f.f7566q, bArr[i2])) ? z3 : z2;
                    this.f3816A += 5;
                    this.f3848z += i10;
                } else {
                    if (this.f3818C) {
                        this.f3830h.mo20002H(i11);
                        hVar2.readFully(this.f3830h.f5877a, z3 ? 1 : 0, this.f3817B);
                        qVar.mo18544b(this.f3830h, this.f3817B);
                        i = this.f3817B;
                        C3173t tVar = this.f3830h;
                        int k = C3168q.m7912k(tVar.f5877a, tVar.mo20011d());
                        this.f3830h.mo20006L("video/hevc".equals(lVar.f3922f.f7566q) ? 1 : 0);
                        this.f3830h.mo20005K(k);
                        C3055g.m7297a(j, this.f3830h, this.f3821F);
                    } else {
                        i = qVar.mo18543a(hVar2, i11, z3);
                    }
                    this.f3816A += i;
                    this.f3817B -= i;
                    i2 = 4;
                    z2 = true;
                    z3 = false;
                }
            }
        }
        boolean z4 = nVar.f3944l[i5];
        C2742m b = this.f3847y.mo18666c();
        if (b != null) {
            z = z4 | true;
            aVar = b.f3930c;
        } else {
            z = z4;
            aVar = null;
        }
        qVar.mo18545c(j, z ? 1 : 0, this.f3848z, 0, aVar);
        mo18665q(j);
        if (!this.f3847y.mo18668e()) {
            this.f3847y = null;
        }
        this.f3837o = 3;
        return true;
    }

    /* renamed from: a */
    public final void mo18657a() {
        this.f3837o = 0;
        this.f3840r = 0;
    }

    /* renamed from: b */
    public boolean mo18547b(C2675h hVar) {
        return C2740k.m5600b(hVar);
    }

    /* renamed from: c */
    public final C2728e mo18658c(SparseArray<C2728e> sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        C2728e eVar = sparseArray.get(i);
        C3151e.m7757e(eVar);
        return eVar;
    }

    /* renamed from: e */
    public int mo18548e(C2675h hVar, C2681n nVar) {
        while (true) {
            int i = this.f3837o;
            if (i != 0) {
                if (i == 1) {
                    mo18654I(hVar);
                } else if (i == 2) {
                    mo18655J(hVar);
                } else if (mo18656K(hVar)) {
                    return 0;
                }
            } else if (!mo18653H(hVar)) {
                return -1;
            }
        }
    }

    /* renamed from: f */
    public void mo18549f(C2676i iVar) {
        this.f3819D = iVar;
        C2741l lVar = this.f3824b;
        if (lVar != null) {
            C2734b bVar = new C2734b(iVar.mo18552a(0, lVar.f3918b));
            bVar.mo18667d(this.f3824b, new C2728e(0, 0, 0, 0));
            this.f3827e.put(0, bVar);
            mo18659k();
            this.f3819D.mo18554o();
        }
    }

    /* renamed from: g */
    public void mo18550g(long j, long j2) {
        int size = this.f3827e.size();
        for (int i = 0; i < size; i++) {
            this.f3827e.valueAt(i).mo18670g();
        }
        this.f3835m.clear();
        this.f3843u = 0;
        this.f3844v = j2;
        this.f3834l.clear();
        mo18657a();
    }

    /* renamed from: k */
    public final void mo18659k() {
        int i;
        if (this.f3820E == null) {
            C2686q[] qVarArr = new C2686q[2];
            this.f3820E = qVarArr;
            C2686q qVar = this.f3836n;
            if (qVar != null) {
                qVarArr[0] = qVar;
                i = 1;
            } else {
                i = 0;
            }
            if ((this.f3823a & 4) != 0) {
                this.f3820E[i] = this.f3819D.mo18552a(this.f3827e.size(), 4);
                i++;
            }
            C2686q[] qVarArr2 = (C2686q[]) Arrays.copyOf(this.f3820E, i);
            this.f3820E = qVarArr2;
            for (C2686q d : qVarArr2) {
                d.mo18546d(f3815J);
            }
        }
        if (this.f3821F == null) {
            this.f3821F = new C2686q[this.f3825c.size()];
            for (int i2 = 0; i2 < this.f3821F.length; i2++) {
                C2686q a = this.f3819D.mo18552a(this.f3827e.size() + 1 + i2, 3);
                a.mo18546d(this.f3825c.get(i2));
                this.f3821F[i2] = a;
            }
        }
    }

    /* renamed from: l */
    public final void mo18660l(C2718c.C2719a aVar) {
        int i = aVar.f3765a;
        if (i == C2718c.f3670C) {
            mo18664p(aVar);
        } else if (i == C2718c.f3688L) {
            mo18663o(aVar);
        } else if (!this.f3834l.isEmpty()) {
            this.f3834l.peek().mo18644d(aVar);
        }
    }

    /* renamed from: m */
    public final void mo18661m(C3173t tVar) {
        C2686q[] qVarArr = this.f3820E;
        if (qVarArr != null && qVarArr.length != 0) {
            tVar.mo20006L(12);
            int a = tVar.mo20008a();
            tVar.mo20026s();
            tVar.mo20026s();
            long c0 = C3152e0.m7792c0(tVar.mo19995A(), EventLoop_commonKt.MS_TO_NS, tVar.mo19995A());
            int c = tVar.mo20010c();
            byte[] bArr = tVar.f5877a;
            bArr[c - 4] = 0;
            bArr[c - 3] = 0;
            bArr[c - 2] = 0;
            bArr[c - 1] = 0;
            for (C2686q b : this.f3820E) {
                tVar.mo20006L(12);
                b.mo18544b(tVar, a);
            }
            long j = this.f3846x;
            if (j != -9223372036854775807L) {
                long j2 = j + c0;
                C3146b0 b0Var = this.f3831i;
                if (b0Var != null) {
                    j2 = b0Var.mo19943a(j2);
                }
                long j3 = j2;
                for (C2686q c2 : this.f3820E) {
                    c2.mo18545c(j3, 1, a, 0, (C2686q.C2687a) null);
                }
                return;
            }
            this.f3835m.addLast(new C2733a(c0, a));
            this.f3843u += a;
        }
    }

    /* renamed from: n */
    public final void mo18662n(C2718c.C2720b bVar, long j) {
        if (!this.f3834l.isEmpty()) {
            this.f3834l.peek().mo18645e(bVar);
            return;
        }
        int i = bVar.f3765a;
        if (i == C2718c.f3668B) {
            Pair<Long, C2669b> y = m5530y(bVar.f3769W0, j);
            this.f3846x = ((Long) y.first).longValue();
            this.f3819D.mo18553c((C2682o) y.second);
            this.f3822G = true;
        } else if (i == C2718c.f3681H0) {
            mo18661m(bVar.f3769W0);
        }
    }

    /* renamed from: o */
    public final void mo18663o(C2718c.C2719a aVar) {
        DrmInitData drmInitData;
        m5524s(aVar, this.f3827e, this.f3823a, this.f3833k);
        if (this.f3826d != null) {
            drmInitData = null;
        } else {
            drmInitData = m5519d(aVar.f3767X0);
        }
        if (drmInitData != null) {
            int size = this.f3827e.size();
            for (int i = 0; i < size; i++) {
                this.f3827e.valueAt(i).mo18673j(drmInitData);
            }
        }
        if (this.f3844v != -9223372036854775807L) {
            int size2 = this.f3827e.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.f3827e.valueAt(i2).mo18671h(this.f3844v);
            }
            this.f3844v = -9223372036854775807L;
        }
    }

    /* renamed from: p */
    public final void mo18664p(C2718c.C2719a aVar) {
        int i;
        int i2;
        C2718c.C2719a aVar2 = aVar;
        boolean z = true;
        int i3 = 0;
        C3151e.m7760h(this.f3824b == null, "Unexpected moov box.");
        DrmInitData drmInitData = this.f3826d;
        if (drmInitData == null) {
            drmInitData = m5519d(aVar2.f3767X0);
        }
        C2718c.C2719a f = aVar2.mo18646f(C2718c.f3692N);
        SparseArray sparseArray = new SparseArray();
        int size = f.f3767X0.size();
        long j = -9223372036854775807L;
        for (int i4 = 0; i4 < size; i4++) {
            C2718c.C2720b bVar = f.f3767X0.get(i4);
            int i5 = bVar.f3765a;
            if (i5 == C2718c.f3763z) {
                Pair<Integer, C2728e> C = m5513C(bVar.f3769W0);
                sparseArray.put(((Integer) C.first).intValue(), C.second);
            } else if (i5 == C2718c.f3694O) {
                j = m5523r(bVar.f3769W0);
            }
        }
        SparseArray sparseArray2 = new SparseArray();
        int size2 = aVar2.f3768Y0.size();
        int i6 = 0;
        while (i6 < size2) {
            C2718c.C2719a aVar3 = aVar2.f3768Y0.get(i6);
            if (aVar3.f3765a == C2718c.f3674E) {
                i = i6;
                i2 = size2;
                C2741l v = C2721d.m5493v(aVar3, aVar2.mo18647g(C2718c.f3672D), j, drmInitData, (this.f3823a & 16) != 0, false);
                if (v != null) {
                    sparseArray2.put(v.f3917a, v);
                }
            } else {
                i = i6;
                i2 = size2;
            }
            i6 = i + 1;
            size2 = i2;
        }
        int size3 = sparseArray2.size();
        if (this.f3827e.size() == 0) {
            while (i3 < size3) {
                C2741l lVar = (C2741l) sparseArray2.valueAt(i3);
                C2734b bVar2 = new C2734b(this.f3819D.mo18552a(i3, lVar.f3918b));
                bVar2.mo18667d(lVar, mo18658c(sparseArray, lVar.f3917a));
                this.f3827e.put(lVar.f3917a, bVar2);
                this.f3845w = Math.max(this.f3845w, lVar.f3921e);
                i3++;
            }
            mo18659k();
            this.f3819D.mo18554o();
            return;
        }
        if (this.f3827e.size() != size3) {
            z = false;
        }
        C3151e.m7759g(z);
        while (i3 < size3) {
            C2741l lVar2 = (C2741l) sparseArray2.valueAt(i3);
            this.f3827e.get(lVar2.f3917a).mo18667d(lVar2, mo18658c(sparseArray, lVar2.f3917a));
            i3++;
        }
    }

    /* renamed from: q */
    public final void mo18665q(long j) {
        while (!this.f3835m.isEmpty()) {
            C2733a removeFirst = this.f3835m.removeFirst();
            this.f3843u -= removeFirst.f3850b;
            long j2 = removeFirst.f3849a + j;
            C3146b0 b0Var = this.f3831i;
            if (b0Var != null) {
                j2 = b0Var.mo19943a(j2);
            }
            for (C2686q c : this.f3820E) {
                c.mo18545c(j2, 1, removeFirst.f3850b, this.f3843u, (C2686q.C2687a) null);
            }
        }
    }

    public void release() {
    }

    public C2732g(int i) {
        this(i, (C3146b0) null);
    }

    public C2732g(int i, @Nullable C3146b0 b0Var) {
        this(i, b0Var, (C2741l) null, (DrmInitData) null);
    }

    public C2732g(int i, @Nullable C3146b0 b0Var, @Nullable C2741l lVar, @Nullable DrmInitData drmInitData) {
        this(i, b0Var, lVar, drmInitData, Collections.emptyList());
    }

    public C2732g(int i, @Nullable C3146b0 b0Var, @Nullable C2741l lVar, @Nullable DrmInitData drmInitData, List<Format> list) {
        this(i, b0Var, lVar, drmInitData, list, (C2686q) null);
    }

    public C2732g(int i, @Nullable C3146b0 b0Var, @Nullable C2741l lVar, @Nullable DrmInitData drmInitData, List<Format> list, @Nullable C2686q qVar) {
        this.f3823a = i | (lVar != null ? 8 : 0);
        this.f3831i = b0Var;
        this.f3824b = lVar;
        this.f3826d = drmInitData;
        this.f3825c = Collections.unmodifiableList(list);
        this.f3836n = qVar;
        this.f3832j = new C3173t(16);
        this.f3828f = new C3173t(C3168q.f5853a);
        this.f3829g = new C3173t(5);
        this.f3830h = new C3173t();
        this.f3833k = new byte[16];
        this.f3834l = new ArrayDeque<>();
        this.f3835m = new ArrayDeque<>();
        this.f3827e = new SparseArray<>();
        this.f3845w = -9223372036854775807L;
        this.f3844v = -9223372036854775807L;
        this.f3846x = -9223372036854775807L;
        mo18657a();
    }
}
