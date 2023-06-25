package p040c.p200q.p201a.p219b.p241k0.p244d0;

import android.os.SystemClock;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p040c.p200q.p201a.p219b.C2627d;
import p040c.p200q.p201a.p219b.C3216y;
import p040c.p200q.p201a.p219b.p224f0.C2669b;
import p040c.p200q.p201a.p219b.p224f0.C2682o;
import p040c.p200q.p201a.p219b.p224f0.C2686q;
import p040c.p200q.p201a.p219b.p241k0.p243c0.C2870b;
import p040c.p200q.p201a.p219b.p241k0.p243c0.C2872d;
import p040c.p200q.p201a.p219b.p241k0.p243c0.C2873e;
import p040c.p200q.p201a.p219b.p241k0.p243c0.C2876f;
import p040c.p200q.p201a.p219b.p241k0.p243c0.C2881i;
import p040c.p200q.p201a.p219b.p241k0.p243c0.C2883k;
import p040c.p200q.p201a.p219b.p241k0.p243c0.C2884l;
import p040c.p200q.p201a.p219b.p241k0.p243c0.C2885m;
import p040c.p200q.p201a.p219b.p241k0.p243c0.C2887n;
import p040c.p200q.p201a.p219b.p241k0.p244d0.C2891c;
import p040c.p200q.p201a.p219b.p241k0.p244d0.C2913j;
import p040c.p200q.p201a.p219b.p241k0.p244d0.p245k.C2917a;
import p040c.p200q.p201a.p219b.p241k0.p244d0.p245k.C2918b;
import p040c.p200q.p201a.p219b.p241k0.p244d0.p245k.C2925h;
import p040c.p200q.p201a.p219b.p241k0.p244d0.p245k.C2926i;
import p040c.p200q.p201a.p219b.p259m0.C3107e;
import p040c.p200q.p201a.p219b.p260n0.C3122h;
import p040c.p200q.p201a.p219b.p260n0.C3125j;
import p040c.p200q.p201a.p219b.p260n0.C3136s;
import p040c.p200q.p201a.p219b.p260n0.C3141v;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3166p;

/* renamed from: c.q.a.b.k0.d0.h */
/* compiled from: DefaultDashChunkSource */
public class C2908h implements C2891c {

    /* renamed from: a */
    public final C3136s f4717a;

    /* renamed from: b */
    public final int[] f4718b;

    /* renamed from: c */
    public final C3107e f4719c;

    /* renamed from: d */
    public final int f4720d;

    /* renamed from: e */
    public final C3122h f4721e;

    /* renamed from: f */
    public final long f4722f;

    /* renamed from: g */
    public final int f4723g;
    @Nullable

    /* renamed from: h */
    public final C2913j.C2916c f4724h;

    /* renamed from: i */
    public final C2910b[] f4725i;

    /* renamed from: j */
    public C2918b f4726j;

    /* renamed from: k */
    public int f4727k;

    /* renamed from: l */
    public IOException f4728l;

    /* renamed from: m */
    public boolean f4729m;

    /* renamed from: n */
    public long f4730n = -9223372036854775807L;

    /* renamed from: c.q.a.b.k0.d0.h$a */
    /* compiled from: DefaultDashChunkSource */
    public static final class C2909a implements C2891c.C2892a {

        /* renamed from: a */
        public final C3122h.C3123a f4731a;

        /* renamed from: b */
        public final int f4732b;

        public C2909a(C3122h.C3123a aVar) {
            this(aVar, 1);
        }

        /* renamed from: a */
        public C2891c mo19132a(C3136s sVar, C2918b bVar, int i, int[] iArr, C3107e eVar, int i2, long j, boolean z, boolean z2, @Nullable C2913j.C2916c cVar, @Nullable C3141v vVar) {
            C3141v vVar2 = vVar;
            C3122h a = this.f4731a.mo19884a();
            if (vVar2 != null) {
                a.mo19308b(vVar2);
            }
            return new C2908h(sVar, bVar, i, iArr, eVar, i2, a, j, this.f4732b, z, z2, cVar);
        }

        public C2909a(C3122h.C3123a aVar, int i) {
            this.f4731a = aVar;
            this.f4732b = i;
        }
    }

    /* renamed from: c.q.a.b.k0.d0.h$c */
    /* compiled from: DefaultDashChunkSource */
    public static final class C2911c extends C2870b {
        public C2911c(C2910b bVar, long j, long j2) {
            super(j, j2);
        }
    }

    public C2908h(C3136s sVar, C2918b bVar, int i, int[] iArr, C3107e eVar, int i2, C3122h hVar, long j, int i3, boolean z, boolean z2, @Nullable C2913j.C2916c cVar) {
        C3107e eVar2 = eVar;
        this.f4717a = sVar;
        this.f4726j = bVar;
        this.f4718b = iArr;
        this.f4719c = eVar2;
        this.f4720d = i2;
        this.f4721e = hVar;
        this.f4727k = i;
        this.f4722f = j;
        this.f4723g = i3;
        this.f4724h = cVar;
        long g = bVar.mo19239g(i);
        ArrayList<C2926i> j2 = mo19196j();
        this.f4725i = new C2910b[eVar.length()];
        for (int i4 = 0; i4 < this.f4725i.length; i4++) {
            this.f4725i[i4] = new C2910b(g, i2, j2.get(eVar2.mo19825g(i4)), z, z2, cVar);
        }
    }

    /* renamed from: a */
    public void mo19115a() {
        IOException iOException = this.f4728l;
        if (iOException == null) {
            this.f4717a.mo19182a();
            return;
        }
        throw iOException;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0026, code lost:
        r6 = r4.f4725i[r4.f4719c.mo19827i(r5.f4555c)];
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo19116c(p040c.p200q.p201a.p219b.p241k0.p243c0.C2872d r5, boolean r6, java.lang.Exception r7, long r8) {
        /*
            r4 = this;
            r0 = 0
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            c.q.a.b.k0.d0.j$c r6 = r4.f4724h
            r1 = 1
            if (r6 == 0) goto L_0x0010
            boolean r6 = r6.mo19229g(r5)
            if (r6 == 0) goto L_0x0010
            return r1
        L_0x0010:
            c.q.a.b.k0.d0.k.b r6 = r4.f4726j
            boolean r6 = r6.f4771d
            if (r6 != 0) goto L_0x0052
            boolean r6 = r5 instanceof p040c.p200q.p201a.p219b.p241k0.p243c0.C2884l
            if (r6 == 0) goto L_0x0052
            boolean r6 = r7 instanceof com.google.android.exoplayer2.upstream.HttpDataSource.InvalidResponseCodeException
            if (r6 == 0) goto L_0x0052
            com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException r7 = (com.google.android.exoplayer2.upstream.HttpDataSource.InvalidResponseCodeException) r7
            int r6 = r7.responseCode
            r7 = 404(0x194, float:5.66E-43)
            if (r6 != r7) goto L_0x0052
            c.q.a.b.k0.d0.h$b[] r6 = r4.f4725i
            c.q.a.b.m0.e r7 = r4.f4719c
            com.google.android.exoplayer2.Format r2 = r5.f4555c
            int r7 = r7.mo19827i(r2)
            r6 = r6[r7]
            int r7 = r6.mo19207h()
            r2 = -1
            if (r7 == r2) goto L_0x0052
            if (r7 == 0) goto L_0x0052
            long r2 = r6.mo19205f()
            long r6 = (long) r7
            long r2 = r2 + r6
            r6 = 1
            long r2 = r2 - r6
            r6 = r5
            c.q.a.b.k0.c0.l r6 = (p040c.p200q.p201a.p219b.p241k0.p243c0.C2884l) r6
            long r6 = r6.mo19122f()
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x0052
            r4.f4729m = r1
            return r1
        L_0x0052:
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x006a
            c.q.a.b.m0.e r6 = r4.f4719c
            com.google.android.exoplayer2.Format r5 = r5.f4555c
            int r5 = r6.mo19827i(r5)
            boolean r5 = r6.mo19821c(r5, r8)
            if (r5 == 0) goto L_0x006a
            r0 = r1
        L_0x006a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p241k0.p244d0.C2908h.mo19116c(c.q.a.b.k0.c0.d, boolean, java.lang.Exception, long):boolean");
    }

    /* renamed from: d */
    public void mo19131d(C2918b bVar, int i) {
        try {
            this.f4726j = bVar;
            this.f4727k = i;
            long g = bVar.mo19239g(i);
            ArrayList<C2926i> j = mo19196j();
            for (int i2 = 0; i2 < this.f4725i.length; i2++) {
                this.f4725i[i2] = this.f4725i[i2].mo19202b(g, j.get(this.f4719c.mo19825g(i2)));
            }
        } catch (BehindLiveWindowException e) {
            this.f4728l = e;
        }
    }

    /* renamed from: e */
    public long mo19117e(long j, C3216y yVar) {
        for (C2910b bVar : this.f4725i) {
            if (bVar.f4735c != null) {
                long j2 = bVar.mo19209j(j);
                long k = bVar.mo19210k(j2);
                return C3152e0.m7790b0(j, yVar, k, (k >= j || j2 >= ((long) (bVar.mo19207h() + -1))) ? k : bVar.mo19210k(j2 + 1));
            }
        }
        return j;
    }

    /* renamed from: f */
    public int mo19118f(long j, List<? extends C2884l> list) {
        if (this.f4728l != null || this.f4719c.length() < 2) {
            return list.size();
        }
        return this.f4719c.mo19814h(j, list);
    }

    /* renamed from: g */
    public void mo19119g(C2872d dVar) {
        C2682o d;
        if (dVar instanceof C2883k) {
            int i = this.f4719c.mo19827i(((C2883k) dVar).f4555c);
            C2910b bVar = this.f4725i[i];
            if (bVar.f4735c == null && (d = bVar.f4733a.mo19077d()) != null) {
                this.f4725i[i] = bVar.mo19203c(new C2907g((C2669b) d, bVar.f4734b.f4814c));
            }
        }
        C2913j.C2916c cVar = this.f4724h;
        if (cVar != null) {
            cVar.mo19230h(dVar);
        }
    }

    /* renamed from: h */
    public void mo19120h(long j, long j2, List<? extends C2884l> list, C2876f fVar) {
        C2884l lVar;
        long j3;
        C2885m[] mVarArr;
        int i;
        int i2;
        boolean z;
        C2876f fVar2 = fVar;
        if (this.f4728l == null) {
            long j4 = j2 - j;
            long n = mo19200n(j);
            long a = C2627d.m5057a(this.f4726j.f4768a) + C2627d.m5057a(this.f4726j.mo19236d(this.f4727k).f4800b) + j2;
            C2913j.C2916c cVar = this.f4724h;
            if (cVar == null || !cVar.mo19228f(a)) {
                long i3 = mo19195i();
                boolean z2 = true;
                if (list.isEmpty()) {
                    List<? extends C2884l> list2 = list;
                    lVar = null;
                } else {
                    lVar = (C2884l) list.get(list.size() - 1);
                }
                int length = this.f4719c.length();
                C2885m[] mVarArr2 = new C2885m[length];
                int i4 = 0;
                while (i4 < length) {
                    C2910b bVar = this.f4725i[i4];
                    if (bVar.f4735c == null) {
                        mVarArr2[i4] = C2885m.f4620a;
                        i2 = i4;
                        i = length;
                        mVarArr = mVarArr2;
                        z = z2;
                        j3 = i3;
                    } else {
                        long e = bVar.mo19204e(this.f4726j, this.f4727k, i3);
                        long g = bVar.mo19206g(this.f4726j, this.f4727k, i3);
                        C2910b bVar2 = bVar;
                        i2 = i4;
                        i = length;
                        mVarArr = mVarArr2;
                        z = true;
                        j3 = i3;
                        long k = mo19197k(bVar, lVar, j2, e, g);
                        if (k < e) {
                            mVarArr[i2] = C2885m.f4620a;
                        } else {
                            mVarArr[i2] = new C2911c(bVar2, k, g);
                        }
                    }
                    i4 = i2 + 1;
                    List<? extends C2884l> list3 = list;
                    z2 = z;
                    length = i;
                    mVarArr2 = mVarArr;
                    i3 = j3;
                }
                boolean z3 = z2;
                long j5 = i3;
                this.f4719c.mo19338j(j, j4, n, list, mVarArr2);
                C2910b bVar3 = this.f4725i[this.f4719c.mo19337b()];
                C2873e eVar = bVar3.f4733a;
                if (eVar != null) {
                    C2926i iVar = bVar3.f4734b;
                    C2925h k2 = eVar.mo19076b() == null ? iVar.mo19292k() : null;
                    C2925h j6 = bVar3.f4735c == null ? iVar.mo19291j() : null;
                    if (!(k2 == null && j6 == null)) {
                        fVar2.f4577a = mo19198l(bVar3, this.f4721e, this.f4719c.mo19829l(), this.f4719c.mo19339m(), this.f4719c.mo19340p(), k2, j6);
                        return;
                    }
                }
                long a2 = bVar3.f4736d;
                long j7 = -9223372036854775807L;
                int i5 = (a2 > -9223372036854775807L ? 1 : (a2 == -9223372036854775807L ? 0 : -1));
                boolean z4 = i5 != 0 ? z3 : false;
                if (bVar3.mo19207h() == 0) {
                    fVar2.f4578b = z4;
                    return;
                }
                long j8 = j5;
                long e2 = bVar3.mo19204e(this.f4726j, this.f4727k, j8);
                long g2 = bVar3.mo19206g(this.f4726j, this.f4727k, j8);
                mo19201o(bVar3, g2);
                long j9 = g2;
                boolean z5 = z4;
                long k3 = mo19197k(bVar3, lVar, j2, e2, j9);
                if (k3 < e2) {
                    this.f4728l = new BehindLiveWindowException();
                    return;
                }
                int i6 = (k3 > j9 ? 1 : (k3 == j9 ? 0 : -1));
                if (i6 > 0 || (this.f4729m && i6 >= 0)) {
                    fVar2.f4578b = z5;
                } else if (!z5 || bVar3.mo19210k(k3) < a2) {
                    int min = (int) Math.min((long) this.f4723g, (j9 - k3) + 1);
                    if (i5 != 0) {
                        while (min > 1 && bVar3.mo19210k((((long) min) + k3) - 1) >= a2) {
                            min--;
                        }
                    }
                    int i7 = min;
                    if (list.isEmpty()) {
                        j7 = j2;
                    }
                    fVar2.f4577a = mo19199m(bVar3, this.f4721e, this.f4720d, this.f4719c.mo19829l(), this.f4719c.mo19339m(), this.f4719c.mo19340p(), k3, i7, j7);
                } else {
                    fVar2.f4578b = true;
                }
            }
        }
    }

    /* renamed from: i */
    public final long mo19195i() {
        long currentTimeMillis;
        if (this.f4722f != 0) {
            currentTimeMillis = SystemClock.elapsedRealtime() + this.f4722f;
        } else {
            currentTimeMillis = System.currentTimeMillis();
        }
        return currentTimeMillis * 1000;
    }

    /* renamed from: j */
    public final ArrayList<C2926i> mo19196j() {
        List<C2917a> list = this.f4726j.mo19236d(this.f4727k).f4801c;
        ArrayList<C2926i> arrayList = new ArrayList<>();
        for (int i : this.f4718b) {
            arrayList.addAll(list.get(i).f4765c);
        }
        return arrayList;
    }

    /* renamed from: k */
    public final long mo19197k(C2910b bVar, @Nullable C2884l lVar, long j, long j2, long j3) {
        if (lVar != null) {
            return lVar.mo19122f();
        }
        return C3152e0.m7815o(bVar.mo19209j(j), j2, j3);
    }

    /* renamed from: l */
    public C2872d mo19198l(C2910b bVar, C3122h hVar, Format format, int i, Object obj, C2925h hVar2, C2925h hVar3) {
        String str = bVar.f4734b.f4813b;
        if (hVar2 == null || (hVar3 = hVar2.mo19283a(hVar3, str)) != null) {
            hVar2 = hVar3;
        }
        return new C2883k(hVar, new C3125j(hVar2.mo19284b(str), hVar2.f4808a, hVar2.f4809b, bVar.f4734b.mo19289h()), format, i, obj, bVar.f4733a);
    }

    /* renamed from: m */
    public C2872d mo19199m(C2910b bVar, C3122h hVar, int i, Format format, int i2, Object obj, long j, int i3, long j2) {
        C2910b bVar2 = bVar;
        long j3 = j;
        C2926i iVar = bVar2.f4734b;
        long k = bVar2.mo19210k(j3);
        C2925h l = bVar2.mo19211l(j3);
        String str = iVar.f4813b;
        if (bVar2.f4733a == null) {
            return new C2887n(hVar, new C3125j(l.mo19284b(str), l.f4808a, l.f4809b, iVar.mo19289h()), format, i2, obj, k, bVar2.mo19208i(j3), j, i, format);
        }
        int i4 = 1;
        int i5 = i3;
        int i6 = 1;
        while (i4 < i5) {
            C2925h a = l.mo19283a(bVar2.mo19211l(((long) i4) + j3), str);
            if (a == null) {
                break;
            }
            i6++;
            i4++;
            l = a;
        }
        long i7 = bVar2.mo19208i((((long) i6) + j3) - 1);
        long a2 = bVar.f4736d;
        long j4 = (a2 == -9223372036854775807L || a2 > i7) ? -9223372036854775807L : a2;
        C3125j jVar = r18;
        C3125j jVar2 = new C3125j(l.mo19284b(str), l.f4808a, l.f4809b, iVar.mo19289h());
        return new C2881i(hVar, jVar, format, i2, obj, k, i7, j2, j4, j, i6, -iVar.f4814c, bVar2.f4733a);
    }

    /* renamed from: n */
    public final long mo19200n(long j) {
        if (this.f4726j.f4771d && this.f4730n != -9223372036854775807L) {
            return this.f4730n - j;
        }
        return -9223372036854775807L;
    }

    /* renamed from: o */
    public final void mo19201o(C2910b bVar, long j) {
        this.f4730n = this.f4726j.f4771d ? bVar.mo19208i(j) : -9223372036854775807L;
    }

    /* renamed from: c.q.a.b.k0.d0.h$b */
    /* compiled from: DefaultDashChunkSource */
    public static final class C2910b {
        @Nullable

        /* renamed from: a */
        public final C2873e f4733a;

        /* renamed from: b */
        public final C2926i f4734b;
        @Nullable

        /* renamed from: c */
        public final C2906f f4735c;

        /* renamed from: d */
        public final long f4736d;

        /* renamed from: e */
        public final long f4737e;

        public C2910b(long j, int i, C2926i iVar, boolean z, boolean z2, C2686q qVar) {
            this(j, iVar, m6455d(i, iVar, z, z2, qVar), 0, iVar.mo19290i());
        }

        /* JADX WARNING: type inference failed for: r12v9, types: [c.q.a.b.f0.t.e] */
        /* JADX WARNING: type inference failed for: r12v10, types: [c.q.a.b.f0.x.a] */
        /* JADX WARNING: Multi-variable type inference failed */
        @androidx.annotation.Nullable
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static p040c.p200q.p201a.p219b.p241k0.p243c0.C2873e m6455d(int r10, p040c.p200q.p201a.p219b.p241k0.p244d0.p245k.C2926i r11, boolean r12, boolean r13, p040c.p200q.p201a.p219b.p224f0.C2686q r14) {
            /*
                com.google.android.exoplayer2.Format r0 = r11.f4812a
                java.lang.String r0 = r0.f7565p
                boolean r1 = m6456m(r0)
                r2 = 0
                if (r1 == 0) goto L_0x000c
                return r2
            L_0x000c:
                java.lang.String r1 = "application/x-rawcc"
                boolean r1 = r1.equals(r0)
                if (r1 == 0) goto L_0x001c
                c.q.a.b.f0.x.a r12 = new c.q.a.b.f0.x.a
                com.google.android.exoplayer2.Format r13 = r11.f4812a
                r12.<init>(r13)
                goto L_0x004c
            L_0x001c:
                boolean r0 = m6457n(r0)
                if (r0 == 0) goto L_0x0029
                c.q.a.b.f0.t.e r12 = new c.q.a.b.f0.t.e
                r13 = 1
                r12.<init>(r13)
                goto L_0x004c
            L_0x0029:
                r0 = 0
                if (r12 == 0) goto L_0x002f
                r12 = 4
                r4 = r12
                goto L_0x0030
            L_0x002f:
                r4 = r0
            L_0x0030:
                if (r13 == 0) goto L_0x003d
                java.lang.String r12 = "application/cea-608"
                com.google.android.exoplayer2.Format r12 = com.google.android.exoplayer2.Format.m10245s(r2, r12, r0, r2)
                java.util.List r12 = java.util.Collections.singletonList(r12)
                goto L_0x0041
            L_0x003d:
                java.util.List r12 = java.util.Collections.emptyList()
            L_0x0041:
                r8 = r12
                c.q.a.b.f0.v.g r12 = new c.q.a.b.f0.v.g
                r5 = 0
                r6 = 0
                r7 = 0
                r3 = r12
                r9 = r14
                r3.<init>(r4, r5, r6, r7, r8, r9)
            L_0x004c:
                c.q.a.b.k0.c0.e r13 = new c.q.a.b.k0.c0.e
                com.google.android.exoplayer2.Format r11 = r11.f4812a
                r13.<init>(r12, r10, r11)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p241k0.p244d0.C2908h.C2910b.m6455d(int, c.q.a.b.k0.d0.k.i, boolean, boolean, c.q.a.b.f0.q):c.q.a.b.k0.c0.e");
        }

        /* renamed from: m */
        public static boolean m6456m(String str) {
            return C3166p.m7900l(str) || "application/ttml+xml".equals(str);
        }

        /* renamed from: n */
        public static boolean m6457n(String str) {
            return str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm");
        }

        @CheckResult
        /* renamed from: b */
        public C2910b mo19202b(long j, C2926i iVar) {
            long d;
            long j2 = j;
            C2906f i = this.f4734b.mo19290i();
            C2906f i2 = iVar.mo19290i();
            if (i == null) {
                return new C2910b(j, iVar, this.f4733a, this.f4737e, i);
            } else if (!i.mo19192e()) {
                return new C2910b(j, iVar, this.f4733a, this.f4737e, i2);
            } else {
                int g = i.mo19194g(j2);
                if (g == 0) {
                    return new C2910b(j, iVar, this.f4733a, this.f4737e, i2);
                }
                long f = (i.mo19193f() + ((long) g)) - 1;
                long a = i.mo19188a(f) + i.mo19189b(f, j2);
                long f2 = i2.mo19193f();
                long a2 = i2.mo19188a(f2);
                long j3 = this.f4737e;
                int i3 = (a > a2 ? 1 : (a == a2 ? 0 : -1));
                if (i3 == 0) {
                    d = f + 1;
                } else if (i3 >= 0) {
                    d = i.mo19191d(a2, j2);
                } else {
                    throw new BehindLiveWindowException();
                }
                long j4 = j3 + (d - f2);
                return new C2910b(j, iVar, this.f4733a, j4, i2);
            }
        }

        @CheckResult
        /* renamed from: c */
        public C2910b mo19203c(C2906f fVar) {
            return new C2910b(this.f4736d, this.f4734b, this.f4733a, this.f4737e, fVar);
        }

        /* renamed from: e */
        public long mo19204e(C2918b bVar, int i, long j) {
            if (mo19207h() != -1 || bVar.f4773f == -9223372036854775807L) {
                return mo19205f();
            }
            return Math.max(mo19205f(), mo19209j(((j - C2627d.m5057a(bVar.f4768a)) - C2627d.m5057a(bVar.mo19236d(i).f4800b)) - C2627d.m5057a(bVar.f4773f)));
        }

        /* renamed from: f */
        public long mo19205f() {
            return this.f4735c.mo19193f() + this.f4737e;
        }

        /* renamed from: g */
        public long mo19206g(C2918b bVar, int i, long j) {
            long f;
            int h = mo19207h();
            if (h == -1) {
                f = mo19209j((j - C2627d.m5057a(bVar.f4768a)) - C2627d.m5057a(bVar.mo19236d(i).f4800b));
            } else {
                f = mo19205f() + ((long) h);
            }
            return f - 1;
        }

        /* renamed from: h */
        public int mo19207h() {
            return this.f4735c.mo19194g(this.f4736d);
        }

        /* renamed from: i */
        public long mo19208i(long j) {
            return mo19210k(j) + this.f4735c.mo19189b(j - this.f4737e, this.f4736d);
        }

        /* renamed from: j */
        public long mo19209j(long j) {
            return this.f4735c.mo19191d(j, this.f4736d) + this.f4737e;
        }

        /* renamed from: k */
        public long mo19210k(long j) {
            return this.f4735c.mo19188a(j - this.f4737e);
        }

        /* renamed from: l */
        public C2925h mo19211l(long j) {
            return this.f4735c.mo19190c(j - this.f4737e);
        }

        public C2910b(long j, C2926i iVar, @Nullable C2873e eVar, long j2, @Nullable C2906f fVar) {
            this.f4736d = j;
            this.f4734b = iVar;
            this.f4737e = j2;
            this.f4733a = eVar;
            this.f4735c = fVar;
        }
    }
}
