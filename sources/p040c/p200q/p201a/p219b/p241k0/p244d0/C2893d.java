package p040c.p200q.p201a.p219b.p241k0.p244d0;

import android.util.Pair;
import android.util.SparseIntArray;
import androidx.annotation.Nullable;
import androidx.test.internal.runner.RunnerArgs;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import p040c.p200q.p201a.p219b.C3216y;
import p040c.p200q.p201a.p219b.p241k0.C3000o;
import p040c.p200q.p201a.p219b.p241k0.C3002q;
import p040c.p200q.p201a.p219b.p241k0.C3012t;
import p040c.p200q.p201a.p219b.p241k0.C3017v;
import p040c.p200q.p201a.p219b.p241k0.C3027y;
import p040c.p200q.p201a.p219b.p241k0.C3028z;
import p040c.p200q.p201a.p219b.p241k0.p243c0.C2877g;
import p040c.p200q.p201a.p219b.p241k0.p244d0.C2891c;
import p040c.p200q.p201a.p219b.p241k0.p244d0.C2913j;
import p040c.p200q.p201a.p219b.p241k0.p244d0.p245k.C2917a;
import p040c.p200q.p201a.p219b.p241k0.p244d0.p245k.C2918b;
import p040c.p200q.p201a.p219b.p241k0.p244d0.p245k.C2921d;
import p040c.p200q.p201a.p219b.p241k0.p244d0.p245k.C2922e;
import p040c.p200q.p201a.p219b.p241k0.p244d0.p245k.C2923f;
import p040c.p200q.p201a.p219b.p241k0.p244d0.p245k.C2926i;
import p040c.p200q.p201a.p219b.p259m0.C3107e;
import p040c.p200q.p201a.p219b.p260n0.C3117d;
import p040c.p200q.p201a.p219b.p260n0.C3135r;
import p040c.p200q.p201a.p219b.p260n0.C3136s;
import p040c.p200q.p201a.p219b.p260n0.C3141v;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

/* renamed from: c.q.a.b.k0.d0.d */
/* compiled from: DashMediaPeriod */
public final class C2893d implements C3012t, C3028z.C3029a<C2877g<C2891c>>, C2877g.C2879b<C2891c> {

    /* renamed from: A */
    public C3028z f4631A;

    /* renamed from: B */
    public C2918b f4632B;

    /* renamed from: C */
    public int f4633C;

    /* renamed from: D */
    public List<C2922e> f4634D;

    /* renamed from: E */
    public boolean f4635E;

    /* renamed from: e */
    public final int f4636e;

    /* renamed from: l */
    public final C2891c.C2892a f4637l;
    @Nullable

    /* renamed from: m */
    public final C3141v f4638m;

    /* renamed from: n */
    public final C3135r f4639n;

    /* renamed from: o */
    public final long f4640o;

    /* renamed from: p */
    public final C3136s f4641p;

    /* renamed from: q */
    public final C3117d f4642q;

    /* renamed from: r */
    public final TrackGroupArray f4643r;

    /* renamed from: s */
    public final C2894a[] f4644s;

    /* renamed from: t */
    public final C3000o f4645t;

    /* renamed from: u */
    public final C2913j f4646u;

    /* renamed from: v */
    public final IdentityHashMap<C2877g<C2891c>, C2913j.C2916c> f4647v = new IdentityHashMap<>();

    /* renamed from: w */
    public final C3017v.C3018a f4648w;
    @Nullable

    /* renamed from: x */
    public C3012t.C3013a f4649x;

    /* renamed from: y */
    public C2877g<C2891c>[] f4650y = m6336C(0);

    /* renamed from: z */
    public C2912i[] f4651z = new C2912i[0];

    /* renamed from: c.q.a.b.k0.d0.d$a */
    /* compiled from: DashMediaPeriod */
    public static final class C2894a {

        /* renamed from: a */
        public final int[] f4652a;

        /* renamed from: b */
        public final int f4653b;

        /* renamed from: c */
        public final int f4654c;

        /* renamed from: d */
        public final int f4655d;

        /* renamed from: e */
        public final int f4656e;

        /* renamed from: f */
        public final int f4657f;

        /* renamed from: g */
        public final int f4658g;

        public C2894a(int i, int i2, int[] iArr, int i3, int i4, int i5, int i6) {
            this.f4653b = i;
            this.f4652a = iArr;
            this.f4654c = i2;
            this.f4656e = i3;
            this.f4657f = i4;
            this.f4658g = i5;
            this.f4655d = i6;
        }

        /* renamed from: a */
        public static C2894a m6366a(int[] iArr, int i) {
            return new C2894a(3, 1, iArr, i, -1, -1, -1);
        }

        /* renamed from: b */
        public static C2894a m6367b(int[] iArr, int i) {
            return new C2894a(4, 1, iArr, i, -1, -1, -1);
        }

        /* renamed from: c */
        public static C2894a m6368c(int i) {
            return new C2894a(4, 2, (int[]) null, -1, -1, -1, i);
        }

        /* renamed from: d */
        public static C2894a m6369d(int i, int[] iArr, int i2, int i3, int i4) {
            return new C2894a(i, 0, iArr, i2, i3, i4, -1);
        }
    }

    public C2893d(int i, C2918b bVar, int i2, C2891c.C2892a aVar, @Nullable C3141v vVar, C3135r rVar, C3017v.C3018a aVar2, long j, C3136s sVar, C3117d dVar, C3000o oVar, C2913j.C2915b bVar2) {
        this.f4636e = i;
        this.f4632B = bVar;
        this.f4633C = i2;
        this.f4637l = aVar;
        this.f4638m = vVar;
        this.f4639n = rVar;
        this.f4648w = aVar2;
        this.f4640o = j;
        this.f4641p = sVar;
        this.f4642q = dVar;
        this.f4645t = oVar;
        this.f4646u = new C2913j(bVar, bVar2, dVar);
        this.f4631A = oVar.mo19484a(this.f4650y);
        C2923f d = bVar.mo19236d(i2);
        List<C2922e> list = d.f4802d;
        this.f4634D = list;
        Pair<TrackGroupArray, C2894a[]> u = m6339u(d.f4801c, list);
        this.f4643r = (TrackGroupArray) u.first;
        this.f4644s = (C2894a[]) u.second;
        aVar2.mo19548z();
    }

    /* renamed from: A */
    public static boolean m6334A(List<C2917a> list, int[] iArr) {
        for (int i : iArr) {
            List<C2926i> list2 = list.get(i).f4765c;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                if (!list2.get(i2).f4815d.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: B */
    public static int m6335B(int i, List<C2917a> list, int[][] iArr, boolean[] zArr, boolean[] zArr2) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (m6334A(list, iArr[i3])) {
                zArr[i3] = true;
                i2++;
            }
            if (m6342z(list, iArr[i3])) {
                zArr2[i3] = true;
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: C */
    public static C2877g<C2891c>[] m6336C(int i) {
        return new C2877g[i];
    }

    /* renamed from: k */
    public static void m6337k(List<C2922e> list, TrackGroup[] trackGroupArr, C2894a[] aVarArr, int i) {
        int i2 = 0;
        while (i2 < list.size()) {
            trackGroupArr[i] = new TrackGroup(Format.m10242p(list.get(i2).mo19279a(), "application/x-emsg", (String) null, -1, (DrmInitData) null));
            aVarArr[i] = C2894a.m6368c(i2);
            i2++;
            i++;
        }
    }

    /* renamed from: o */
    public static int m6338o(List<C2917a> list, int[][] iArr, int i, boolean[] zArr, boolean[] zArr2, TrackGroup[] trackGroupArr, C2894a[] aVarArr) {
        int i2;
        int i3;
        List<C2917a> list2 = list;
        int i4 = i;
        int i5 = 0;
        int i6 = 0;
        while (i5 < i4) {
            int[] iArr2 = iArr[i5];
            ArrayList arrayList = new ArrayList();
            for (int i7 : iArr2) {
                arrayList.addAll(list2.get(i7).f4765c);
            }
            int size = arrayList.size();
            Format[] formatArr = new Format[size];
            for (int i8 = 0; i8 < size; i8++) {
                formatArr[i8] = ((C2926i) arrayList.get(i8)).f4812a;
            }
            C2917a aVar = list2.get(iArr2[0]);
            int i9 = i6 + 1;
            if (zArr[i5]) {
                i2 = i9 + 1;
            } else {
                i2 = i9;
                i9 = -1;
            }
            if (zArr2[i5]) {
                i3 = i2 + 1;
            } else {
                i3 = i2;
                i2 = -1;
            }
            trackGroupArr[i6] = new TrackGroup(formatArr);
            aVarArr[i6] = C2894a.m6369d(aVar.f4764b, iArr2, i6, i9, i2);
            if (i9 != -1) {
                trackGroupArr[i9] = new TrackGroup(Format.m10242p(aVar.f4763a + ":emsg", "application/x-emsg", (String) null, -1, (DrmInitData) null));
                aVarArr[i9] = C2894a.m6367b(iArr2, i6);
            }
            if (i2 != -1) {
                trackGroupArr[i2] = new TrackGroup(Format.m10245s(aVar.f4763a + ":cea608", "application/cea-608", 0, (String) null));
                aVarArr[i2] = C2894a.m6366a(iArr2, i6);
            }
            i5++;
            i6 = i3;
        }
        return i6;
    }

    /* renamed from: u */
    public static Pair<TrackGroupArray, C2894a[]> m6339u(List<C2917a> list, List<C2922e> list2) {
        int[][] w = m6341w(list);
        int length = w.length;
        boolean[] zArr = new boolean[length];
        boolean[] zArr2 = new boolean[length];
        int B = m6335B(length, list, w, zArr, zArr2) + length + list2.size();
        TrackGroup[] trackGroupArr = new TrackGroup[B];
        C2894a[] aVarArr = new C2894a[B];
        m6337k(list2, trackGroupArr, aVarArr, m6338o(list, w, length, zArr, zArr2, trackGroupArr, aVarArr));
        return Pair.create(new TrackGroupArray(trackGroupArr), aVarArr);
    }

    /* renamed from: v */
    public static C2921d m6340v(List<C2921d> list) {
        for (int i = 0; i < list.size(); i++) {
            C2921d dVar = list.get(i);
            if ("urn:mpeg:dash:adaptation-set-switching:2016".equals(dVar.f4792a)) {
                return dVar;
            }
        }
        return null;
    }

    /* renamed from: w */
    public static int[][] m6341w(List<C2917a> list) {
        int size = list.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        for (int i = 0; i < size; i++) {
            sparseIntArray.put(list.get(i).f4763a, i);
        }
        int[][] iArr = new int[size][];
        boolean[] zArr = new boolean[size];
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            if (!zArr[i3]) {
                zArr[i3] = true;
                C2921d v = m6340v(list.get(i3).f4767e);
                if (v == null) {
                    iArr[i2] = new int[]{i3};
                    i2++;
                } else {
                    String[] f0 = C3152e0.m7798f0(v.f4793b, RunnerArgs.CLASS_SEPARATOR);
                    int length = f0.length + 1;
                    int[] iArr2 = new int[length];
                    iArr2[0] = i3;
                    int i4 = 1;
                    for (String parseInt : f0) {
                        int i5 = sparseIntArray.get(Integer.parseInt(parseInt), -1);
                        if (i5 != -1) {
                            zArr[i5] = true;
                            iArr2[i4] = i5;
                            i4++;
                        }
                    }
                    if (i4 < length) {
                        iArr2 = Arrays.copyOf(iArr2, i4);
                    }
                    iArr[i2] = iArr2;
                    i2++;
                }
            }
        }
        return i2 < size ? (int[][]) Arrays.copyOf(iArr, i2) : iArr;
    }

    /* renamed from: z */
    public static boolean m6342z(List<C2917a> list, int[] iArr) {
        for (int i : iArr) {
            List<C2921d> list2 = list.get(i).f4766d;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                if ("urn:scte:dash:cc:cea-608:2015".equals(list2.get(i2).f4792a)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: D */
    public void mo18995i(C2877g<C2891c> gVar) {
        this.f4649x.mo18995i(this);
    }

    /* renamed from: E */
    public void mo19134E() {
        this.f4646u.mo19224n();
        for (C2877g<C2891c> N : this.f4650y) {
            N.mo19094N(this);
        }
        this.f4649x = null;
        this.f4648w.mo19516A();
    }

    /* renamed from: F */
    public final void mo19135F(C3107e[] eVarArr, boolean[] zArr, C3027y[] yVarArr) {
        for (int i = 0; i < eVarArr.length; i++) {
            if (eVarArr[i] == null || !zArr[i]) {
                if (yVarArr[i] instanceof C2877g) {
                    yVarArr[i].mo19094N(this);
                } else if (yVarArr[i] instanceof C2877g.C2878a) {
                    yVarArr[i].mo19113d();
                }
                yVarArr[i] = null;
            }
        }
    }

    /* renamed from: G */
    public final void mo19136G(C3107e[] eVarArr, C3027y[] yVarArr, int[] iArr) {
        boolean z;
        for (int i = 0; i < eVarArr.length; i++) {
            if ((yVarArr[i] instanceof C3002q) || (yVarArr[i] instanceof C2877g.C2878a)) {
                int x = mo19148x(i, iArr);
                if (x == -1) {
                    z = yVarArr[i] instanceof C3002q;
                } else {
                    z = (yVarArr[i] instanceof C2877g.C2878a) && yVarArr[i].f4601e == yVarArr[x];
                }
                if (!z) {
                    if (yVarArr[i] instanceof C2877g.C2878a) {
                        yVarArr[i].mo19113d();
                    }
                    yVarArr[i] = null;
                }
            }
        }
    }

    /* renamed from: H */
    public final void mo19137H(C3107e[] eVarArr, C3027y[] yVarArr, boolean[] zArr, long j, int[] iArr) {
        for (int i = 0; i < eVarArr.length; i++) {
            if (yVarArr[i] == null && eVarArr[i] != null) {
                zArr[i] = true;
                C2894a aVar = this.f4644s[iArr[i]];
                int i2 = aVar.f4654c;
                if (i2 == 0) {
                    yVarArr[i] = mo19146s(aVar, eVarArr[i], j);
                } else if (i2 == 2) {
                    yVarArr[i] = new C2912i(this.f4634D.get(aVar.f4655d), eVarArr[i].mo19820a().mo24200a(0), this.f4632B.f4771d);
                }
            }
        }
        for (int i3 = 0; i3 < eVarArr.length; i3++) {
            if (yVarArr[i3] == null && eVarArr[i3] != null) {
                C2894a aVar2 = this.f4644s[iArr[i3]];
                if (aVar2.f4654c == 1) {
                    int x = mo19148x(i3, iArr);
                    if (x == -1) {
                        yVarArr[i3] = new C3002q();
                    } else {
                        yVarArr[i3] = yVarArr[x].mo19096P(j, aVar2.f4653b);
                    }
                }
            }
        }
    }

    /* renamed from: I */
    public void mo19138I(C2918b bVar, int i) {
        this.f4632B = bVar;
        this.f4633C = i;
        this.f4646u.mo19226p(bVar);
        C2877g<C2891c>[] gVarArr = this.f4650y;
        if (gVarArr != null) {
            for (C2877g<C2891c> B : gVarArr) {
                B.mo19082B().mo19131d(bVar, i);
            }
            this.f4649x.mo18995i(this);
        }
        this.f4634D = bVar.mo19236d(i).f4802d;
        for (C2912i iVar : this.f4651z) {
            Iterator<C2922e> it = this.f4634D.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C2922e next = it.next();
                if (next.mo19279a().equals(iVar.mo19212b())) {
                    boolean z = true;
                    int e = bVar.mo19237e() - 1;
                    if (!bVar.f4771d || i != e) {
                        z = false;
                    }
                    iVar.mo19214e(next, z);
                }
            }
        }
    }

    /* renamed from: b */
    public long mo19098b() {
        return this.f4631A.mo19098b();
    }

    /* renamed from: c */
    public synchronized void mo19114c(C2877g<C2891c> gVar) {
        C2913j.C2916c remove = this.f4647v.remove(gVar);
        if (remove != null) {
            remove.mo19234l();
        }
    }

    /* renamed from: d */
    public boolean mo19100d(long j) {
        return this.f4631A.mo19100d(j);
    }

    /* renamed from: e */
    public long mo19139e(long j, C3216y yVar) {
        for (C2877g<C2891c> gVar : this.f4650y) {
            if (gVar.f4585e == 2) {
                return gVar.mo19101e(j, yVar);
            }
        }
        return j;
    }

    /* renamed from: f */
    public long mo19102f() {
        return this.f4631A.mo19102f();
    }

    /* renamed from: g */
    public void mo19103g(long j) {
        this.f4631A.mo19103g(j);
    }

    /* renamed from: j */
    public long mo19140j(C3107e[] eVarArr, boolean[] zArr, C3027y[] yVarArr, boolean[] zArr2, long j) {
        int[] y = mo19149y(eVarArr);
        mo19135F(eVarArr, zArr, yVarArr);
        mo19136G(eVarArr, yVarArr, y);
        mo19137H(eVarArr, yVarArr, zArr2, j, y);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C2877g gVar : yVarArr) {
            if (gVar instanceof C2877g) {
                arrayList.add(gVar);
            } else if (gVar instanceof C2912i) {
                arrayList2.add((C2912i) gVar);
            }
        }
        C2877g<C2891c>[] C = m6336C(arrayList.size());
        this.f4650y = C;
        arrayList.toArray(C);
        C2912i[] iVarArr = new C2912i[arrayList2.size()];
        this.f4651z = iVarArr;
        arrayList2.toArray(iVarArr);
        this.f4631A = this.f4645t.mo19484a(this.f4650y);
        return j;
    }

    /* renamed from: m */
    public void mo19141m() {
        this.f4641p.mo19182a();
    }

    /* renamed from: n */
    public long mo19142n(long j) {
        for (C2877g<C2891c> O : this.f4650y) {
            O.mo19095O(j);
        }
        for (C2912i d : this.f4651z) {
            d.mo19213d(j);
        }
        return j;
    }

    /* renamed from: p */
    public long mo19143p() {
        if (this.f4635E) {
            return -9223372036854775807L;
        }
        this.f4648w.mo19518C();
        this.f4635E = true;
        return -9223372036854775807L;
    }

    /* renamed from: q */
    public void mo19144q(C3012t.C3013a aVar, long j) {
        this.f4649x = aVar;
        aVar.mo19001l(this);
    }

    /* renamed from: r */
    public TrackGroupArray mo19145r() {
        return this.f4643r;
    }

    /* renamed from: s */
    public final C2877g<C2891c> mo19146s(C2894a aVar, C3107e eVar, long j) {
        int i;
        Format[] formatArr;
        C2894a aVar2 = aVar;
        int[] iArr = new int[2];
        Format[] formatArr2 = new Format[2];
        boolean z = aVar2.f4657f != -1;
        if (z) {
            formatArr2[0] = this.f4643r.mo24210a(aVar2.f4657f).mo24200a(0);
            iArr[0] = 4;
            i = 1;
        } else {
            i = 0;
        }
        boolean z2 = aVar2.f4658g != -1;
        if (z2) {
            formatArr2[i] = this.f4643r.mo24210a(aVar2.f4658g).mo24200a(0);
            iArr[i] = 3;
            i++;
        }
        if (i < 2) {
            iArr = Arrays.copyOf(iArr, i);
            formatArr = (Format[]) Arrays.copyOf(formatArr2, i);
        } else {
            formatArr = formatArr2;
        }
        int[] iArr2 = iArr;
        C2913j.C2916c k = (!this.f4632B.f4771d || !z) ? null : this.f4646u.mo19221k();
        C2913j.C2916c cVar = k;
        C2877g gVar = new C2877g(aVar2.f4653b, iArr2, formatArr, this.f4637l.mo19132a(this.f4641p, this.f4632B, this.f4633C, aVar2.f4652a, eVar, aVar2.f4653b, this.f4640o, z, z2, k, this.f4638m), this, this.f4642q, j, this.f4639n, this.f4648w);
        synchronized (this) {
            this.f4647v.put(gVar, cVar);
        }
        return gVar;
    }

    /* renamed from: t */
    public void mo19147t(long j, boolean z) {
        for (C2877g<C2891c> t : this.f4650y) {
            t.mo19110t(j, z);
        }
    }

    /* renamed from: x */
    public final int mo19148x(int i, int[] iArr) {
        int i2 = iArr[i];
        if (i2 == -1) {
            return -1;
        }
        int i3 = this.f4644s[i2].f4656e;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int i5 = iArr[i4];
            if (i5 == i3 && this.f4644s[i5].f4654c == 0) {
                return i4;
            }
        }
        return -1;
    }

    /* renamed from: y */
    public final int[] mo19149y(C3107e[] eVarArr) {
        int[] iArr = new int[eVarArr.length];
        for (int i = 0; i < eVarArr.length; i++) {
            if (eVarArr[i] != null) {
                iArr[i] = this.f4643r.mo24211b(eVarArr[i].mo19820a());
            } else {
                iArr[i] = -1;
            }
        }
        return iArr;
    }
}
