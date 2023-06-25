package p040c.p200q.p201a.p219b.p241k0.p246e0;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import p040c.p200q.p201a.p219b.C3216y;
import p040c.p200q.p201a.p219b.p241k0.C3000o;
import p040c.p200q.p201a.p219b.p241k0.C3012t;
import p040c.p200q.p201a.p219b.p241k0.C3017v;
import p040c.p200q.p201a.p219b.p241k0.C3027y;
import p040c.p200q.p201a.p219b.p241k0.C3028z;
import p040c.p200q.p201a.p219b.p241k0.p246e0.C2959n;
import p040c.p200q.p201a.p219b.p241k0.p246e0.p247q.C2968d;
import p040c.p200q.p201a.p219b.p259m0.C3107e;
import p040c.p200q.p201a.p219b.p260n0.C3117d;
import p040c.p200q.p201a.p219b.p260n0.C3135r;
import p040c.p200q.p201a.p219b.p260n0.C3141v;
import p040c.p200q.p201a.p219b.p261o0.C3151e;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3166p;

/* renamed from: c.q.a.b.k0.e0.k */
/* compiled from: HlsMediaPeriod */
public final class C2954k implements C3012t, C2959n.C2960a, HlsPlaylistTracker.C4043b {

    /* renamed from: A */
    public C3028z f4904A;

    /* renamed from: B */
    public boolean f4905B;

    /* renamed from: e */
    public final C2951h f4906e;

    /* renamed from: l */
    public final HlsPlaylistTracker f4907l;

    /* renamed from: m */
    public final C2950g f4908m;
    @Nullable

    /* renamed from: n */
    public final C3141v f4909n;

    /* renamed from: o */
    public final C3135r f4910o;

    /* renamed from: p */
    public final C3017v.C3018a f4911p;

    /* renamed from: q */
    public final C3117d f4912q;

    /* renamed from: r */
    public final IdentityHashMap<C3027y, Integer> f4913r = new IdentityHashMap<>();

    /* renamed from: s */
    public final C2962o f4914s = new C2962o();

    /* renamed from: t */
    public final C3000o f4915t;

    /* renamed from: u */
    public final boolean f4916u;
    @Nullable

    /* renamed from: v */
    public C3012t.C3013a f4917v;

    /* renamed from: w */
    public int f4918w;

    /* renamed from: x */
    public TrackGroupArray f4919x;

    /* renamed from: y */
    public C2959n[] f4920y = new C2959n[0];

    /* renamed from: z */
    public C2959n[] f4921z = new C2959n[0];

    public C2954k(C2951h hVar, HlsPlaylistTracker hlsPlaylistTracker, C2950g gVar, @Nullable C3141v vVar, C3135r rVar, C3017v.C3018a aVar, C3117d dVar, C3000o oVar, boolean z) {
        this.f4906e = hVar;
        this.f4907l = hlsPlaylistTracker;
        this.f4908m = gVar;
        this.f4909n = vVar;
        this.f4910o = rVar;
        this.f4911p = aVar;
        this.f4912q = dVar;
        this.f4915t = oVar;
        this.f4916u = z;
        this.f4904A = oVar.mo19484a(new C3028z[0]);
        aVar.mo19548z();
    }

    /* renamed from: v */
    public static Format m6663v(Format format, Format format2, boolean z) {
        String str;
        int i;
        int i2;
        String str2;
        String str3;
        int i3;
        Format format3 = format;
        Format format4 = format2;
        int i4 = -1;
        if (format4 != null) {
            String str4 = format4.f7563n;
            int i5 = format4.f7551D;
            int i6 = format4.f7556I;
            String str5 = format4.f7557J;
            str3 = format4.f7561l;
            str2 = str4;
            i2 = i5;
            i = i6;
            str = str5;
        } else {
            String z2 = C3152e0.m7826z(format3.f7563n, 1);
            if (z) {
                int i7 = format3.f7551D;
                i3 = format3.f7556I;
                str2 = z2;
                str3 = format3.f7561l;
                str = str3;
                i2 = i7;
            } else {
                i3 = 0;
                str2 = z2;
                str3 = null;
                str = null;
                i2 = -1;
            }
            i = i3;
        }
        String d = C3166p.m7892d(str2);
        if (z) {
            i4 = format3.f7562m;
        }
        return Format.m10235i(format3.f7560e, str3, format3.f7565p, d, str2, i4, i2, -1, (List<byte[]>) null, i, str);
    }

    /* renamed from: w */
    public static Format m6664w(Format format) {
        String z = C3152e0.m7826z(format.f7563n, 2);
        return Format.m10249w(format.f7560e, format.f7561l, format.f7565p, C3166p.m7892d(z), z, format.f7562m, format.f7571v, format.f7572w, format.f7573x, (List<byte[]>) null, format.f7556I);
    }

    /* renamed from: a */
    public void mo19346a() {
        int i = this.f4918w - 1;
        this.f4918w = i;
        if (i <= 0) {
            int i2 = 0;
            for (C2959n r : this.f4920y) {
                i2 += r.mo19386r().f7830e;
            }
            TrackGroup[] trackGroupArr = new TrackGroup[i2];
            int i3 = 0;
            for (C2959n nVar : this.f4920y) {
                int i4 = nVar.mo19386r().f7830e;
                int i5 = 0;
                while (i5 < i4) {
                    trackGroupArr[i3] = nVar.mo19386r().mo24210a(i5);
                    i5++;
                    i3++;
                }
            }
            this.f4919x = new TrackGroupArray(trackGroupArr);
            this.f4917v.mo19001l(this);
        }
    }

    /* renamed from: b */
    public long mo19098b() {
        return this.f4904A.mo19098b();
    }

    /* renamed from: c */
    public void mo19347c() {
        this.f4917v.mo18995i(this);
    }

    /* renamed from: d */
    public boolean mo19100d(long j) {
        if (this.f4919x != null) {
            return this.f4904A.mo19100d(j);
        }
        for (C2959n w : this.f4920y) {
            w.mo19390w();
        }
        return false;
    }

    /* renamed from: e */
    public long mo19139e(long j, C3216y yVar) {
        return j;
    }

    /* renamed from: f */
    public long mo19102f() {
        return this.f4904A.mo19102f();
    }

    /* renamed from: g */
    public void mo19103g(long j) {
        this.f4904A.mo19103g(j);
    }

    /* renamed from: h */
    public void mo19348h(C2968d.C2969a aVar) {
        this.f4907l.mo19413d(aVar);
    }

    /* renamed from: j */
    public long mo19140j(C3107e[] eVarArr, boolean[] zArr, C3027y[] yVarArr, boolean[] zArr2, long j) {
        int i;
        C3107e[] eVarArr2 = eVarArr;
        C3027y[] yVarArr2 = yVarArr;
        int[] iArr = new int[eVarArr2.length];
        int[] iArr2 = new int[eVarArr2.length];
        for (int i2 = 0; i2 < eVarArr2.length; i2++) {
            if (yVarArr2[i2] == null) {
                i = -1;
            } else {
                i = this.f4913r.get(yVarArr2[i2]).intValue();
            }
            iArr[i2] = i;
            iArr2[i2] = -1;
            if (eVarArr2[i2] != null) {
                TrackGroup a = eVarArr2[i2].mo19820a();
                int i3 = 0;
                while (true) {
                    C2959n[] nVarArr = this.f4920y;
                    if (i3 >= nVarArr.length) {
                        break;
                    } else if (nVarArr[i3].mo19386r().mo24211b(a) != -1) {
                        iArr2[i2] = i3;
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        this.f4913r.clear();
        int length = eVarArr2.length;
        C3027y[] yVarArr3 = new C3027y[length];
        C3027y[] yVarArr4 = new C3027y[eVarArr2.length];
        C3107e[] eVarArr3 = new C3107e[eVarArr2.length];
        C2959n[] nVarArr2 = new C2959n[this.f4920y.length];
        int i4 = 0;
        int i5 = 0;
        boolean z = false;
        while (i5 < this.f4920y.length) {
            for (int i6 = 0; i6 < eVarArr2.length; i6++) {
                C3107e eVar = null;
                yVarArr4[i6] = iArr[i6] == i5 ? yVarArr2[i6] : null;
                if (iArr2[i6] == i5) {
                    eVar = eVarArr2[i6];
                }
                eVarArr3[i6] = eVar;
            }
            C2959n nVar = this.f4920y[i5];
            C2959n nVar2 = nVar;
            int i7 = length;
            int i8 = i5;
            int i9 = i4;
            C3107e[] eVarArr4 = eVarArr3;
            C2959n[] nVarArr3 = nVarArr2;
            boolean V = nVar.mo19378V(eVarArr3, zArr, yVarArr4, zArr2, j, z);
            int i10 = 0;
            boolean z2 = false;
            while (true) {
                boolean z3 = true;
                if (i10 >= eVarArr2.length) {
                    break;
                }
                if (iArr2[i10] == i8) {
                    C3151e.m7759g(yVarArr4[i10] != null);
                    yVarArr3[i10] = yVarArr4[i10];
                    this.f4913r.put(yVarArr4[i10], Integer.valueOf(i8));
                    z2 = true;
                } else if (iArr[i10] == i8) {
                    if (yVarArr4[i10] != null) {
                        z3 = false;
                    }
                    C3151e.m7759g(z3);
                }
                i10++;
            }
            if (z2) {
                nVarArr3[i9] = nVar2;
                i4 = i9 + 1;
                if (i9 == 0) {
                    nVar2.mo19379W(true);
                    if (!V) {
                        C2959n[] nVarArr4 = this.f4921z;
                        if (nVarArr4.length != 0) {
                            if (nVar2 == nVarArr4[0]) {
                            }
                            this.f4914s.mo19394b();
                            z = true;
                        }
                    }
                    this.f4914s.mo19394b();
                    z = true;
                } else {
                    nVar2.mo19379W(false);
                }
            } else {
                i4 = i9;
            }
            i5 = i8 + 1;
            nVarArr2 = nVarArr3;
            length = i7;
            eVarArr3 = eVarArr4;
            yVarArr2 = yVarArr;
        }
        System.arraycopy(yVarArr3, 0, yVarArr2, 0, length);
        C2959n[] nVarArr5 = (C2959n[]) Arrays.copyOf(nVarArr2, i4);
        this.f4921z = nVarArr5;
        this.f4904A = this.f4915t.mo19484a(nVarArr5);
        return j;
    }

    /* renamed from: k */
    public boolean mo19349k(C2968d.C2969a aVar, long j) {
        boolean z = true;
        for (C2959n N : this.f4920y) {
            z &= N.mo19370N(aVar, j);
        }
        this.f4917v.mo18995i(this);
        return z;
    }

    /* renamed from: m */
    public void mo19141m() {
        for (C2959n m : this.f4920y) {
            m.mo19385m();
        }
    }

    /* renamed from: n */
    public long mo19142n(long j) {
        C2959n[] nVarArr = this.f4921z;
        if (nVarArr.length > 0) {
            boolean U = nVarArr[0].mo19377U(j, false);
            int i = 1;
            while (true) {
                C2959n[] nVarArr2 = this.f4921z;
                if (i >= nVarArr2.length) {
                    break;
                }
                nVarArr2[i].mo19377U(j, U);
                i++;
            }
            if (U) {
                this.f4914s.mo19394b();
            }
        }
        return j;
    }

    /* renamed from: o */
    public final void mo19350o(C2968d dVar, long j) {
        ArrayList arrayList;
        C2968d dVar2 = dVar;
        ArrayList arrayList2 = new ArrayList(dVar2.f5025d);
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < arrayList2.size(); i++) {
            C2968d.C2969a aVar = (C2968d.C2969a) arrayList2.get(i);
            Format format = aVar.f5032b;
            if (format.f7572w > 0 || C3152e0.m7826z(format.f7563n, 2) != null) {
                arrayList3.add(aVar);
            } else if (C3152e0.m7826z(format.f7563n, 1) != null) {
                arrayList4.add(aVar);
            }
        }
        if (!arrayList3.isEmpty()) {
            arrayList = arrayList3;
        } else {
            if (arrayList4.size() < arrayList2.size()) {
                arrayList2.removeAll(arrayList4);
            }
            arrayList = arrayList2;
        }
        C3151e.m7753a(!arrayList.isEmpty());
        C2968d.C2969a[] aVarArr = (C2968d.C2969a[]) arrayList.toArray(new C2968d.C2969a[0]);
        String str = aVarArr[0].f5032b.f7563n;
        C2959n u = mo19352u(0, aVarArr, dVar2.f5028g, dVar2.f5029h, j);
        this.f4920y[0] = u;
        if (!this.f4916u || str == null) {
            u.mo19379W(true);
            u.mo19390w();
            return;
        }
        boolean z = C3152e0.m7826z(str, 2) != null;
        boolean z2 = C3152e0.m7826z(str, 1) != null;
        ArrayList arrayList5 = new ArrayList();
        if (z) {
            int size = arrayList.size();
            Format[] formatArr = new Format[size];
            for (int i2 = 0; i2 < size; i2++) {
                formatArr[i2] = m6664w(aVarArr[i2].f5032b);
            }
            arrayList5.add(new TrackGroup(formatArr));
            if (z2 && (dVar2.f5028g != null || dVar2.f5026e.isEmpty())) {
                arrayList5.add(new TrackGroup(m6663v(aVarArr[0].f5032b, dVar2.f5028g, false)));
            }
            List<Format> list = dVar2.f5029h;
            if (list != null) {
                for (int i3 = 0; i3 < list.size(); i3++) {
                    arrayList5.add(new TrackGroup(list.get(i3)));
                }
            }
        } else if (z2) {
            int size2 = arrayList.size();
            Format[] formatArr2 = new Format[size2];
            for (int i4 = 0; i4 < size2; i4++) {
                formatArr2[i4] = m6663v(aVarArr[i4].f5032b, dVar2.f5028g, true);
            }
            arrayList5.add(new TrackGroup(formatArr2));
        } else {
            throw new IllegalArgumentException("Unexpected codecs attribute: " + str);
        }
        TrackGroup trackGroup = new TrackGroup(Format.m10242p("ID3", "application/id3", (String) null, -1, (DrmInitData) null));
        arrayList5.add(trackGroup);
        u.mo19372P(new TrackGroupArray((TrackGroup[]) arrayList5.toArray(new TrackGroup[0])), 0, new TrackGroupArray(trackGroup));
    }

    /* renamed from: p */
    public long mo19143p() {
        if (this.f4905B) {
            return -9223372036854775807L;
        }
        this.f4911p.mo19518C();
        this.f4905B = true;
        return -9223372036854775807L;
    }

    /* renamed from: q */
    public void mo19144q(C3012t.C3013a aVar, long j) {
        this.f4917v = aVar;
        this.f4907l.mo19417h(this);
        mo19351s(j);
    }

    /* renamed from: r */
    public TrackGroupArray mo19145r() {
        return this.f4919x;
    }

    /* renamed from: s */
    public final void mo19351s(long j) {
        C2968d e = this.f4907l.mo19414e();
        List<C2968d.C2969a> list = e.f5026e;
        List<C2968d.C2969a> list2 = e.f5027f;
        int size = list.size() + 1 + list2.size();
        this.f4920y = new C2959n[size];
        this.f4918w = size;
        mo19350o(e, j);
        char c = 0;
        int i = 1;
        int i2 = 0;
        while (i2 < list.size()) {
            C2968d.C2969a aVar = list.get(i2);
            C2968d.C2969a[] aVarArr = new C2968d.C2969a[1];
            aVarArr[c] = aVar;
            C2968d.C2969a aVar2 = aVar;
            C2959n u = mo19352u(1, aVarArr, (Format) null, Collections.emptyList(), j);
            int i3 = i + 1;
            this.f4920y[i] = u;
            Format format = aVar2.f5032b;
            if (!this.f4916u || format.f7563n == null) {
                u.mo19390w();
            } else {
                u.mo19372P(new TrackGroupArray(new TrackGroup(aVar2.f5032b)), 0, TrackGroupArray.f7829n);
            }
            i2++;
            i = i3;
            c = 0;
        }
        int i4 = 0;
        while (i4 < list2.size()) {
            C2968d.C2969a aVar3 = list2.get(i4);
            C2959n u2 = mo19352u(3, new C2968d.C2969a[]{aVar3}, (Format) null, Collections.emptyList(), j);
            this.f4920y[i] = u2;
            u2.mo19372P(new TrackGroupArray(new TrackGroup(aVar3.f5032b)), 0, TrackGroupArray.f7829n);
            i4++;
            i++;
        }
        this.f4921z = this.f4920y;
    }

    /* renamed from: t */
    public void mo19147t(long j, boolean z) {
        for (C2959n t : this.f4921z) {
            t.mo19387t(j, z);
        }
    }

    /* renamed from: u */
    public final C2959n mo19352u(int i, C2968d.C2969a[] aVarArr, Format format, List<Format> list, long j) {
        return new C2959n(i, this, new C2945f(this.f4906e, this.f4907l, aVarArr, this.f4908m, this.f4909n, this.f4914s, list), this.f4912q, j, format, this.f4910o, this.f4911p);
    }

    /* renamed from: x */
    public void mo18995i(C2959n nVar) {
        this.f4917v.mo18995i(this);
    }

    /* renamed from: y */
    public void mo19354y() {
        this.f4907l.mo19410a(this);
        for (C2959n R : this.f4920y) {
            R.mo19374R();
        }
        this.f4917v = null;
        this.f4911p.mo19516A();
    }
}
