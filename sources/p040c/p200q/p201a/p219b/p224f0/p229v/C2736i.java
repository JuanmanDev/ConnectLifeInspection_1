package p040c.p200q.p201a.p219b.p224f0.p229v;

import android.support.p025v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.ArrayDeque;
import java.util.ArrayList;
import p040c.p200q.p201a.p219b.p224f0.C2674g;
import p040c.p200q.p201a.p219b.p224f0.C2675h;
import p040c.p200q.p201a.p219b.p224f0.C2676i;
import p040c.p200q.p201a.p219b.p224f0.C2678k;
import p040c.p200q.p201a.p219b.p224f0.C2681n;
import p040c.p200q.p201a.p219b.p224f0.C2682o;
import p040c.p200q.p201a.p219b.p224f0.C2685p;
import p040c.p200q.p201a.p219b.p224f0.C2686q;
import p040c.p200q.p201a.p219b.p224f0.p229v.C2718c;
import p040c.p200q.p201a.p219b.p261o0.C3151e;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3168q;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.f0.v.i */
/* compiled from: Mp4Extractor */
public final class C2736i implements C2674g, C2682o {

    /* renamed from: t */
    public static final int f3891t = C3152e0.m7764D("qt  ");

    /* renamed from: a */
    public final int f3892a;

    /* renamed from: b */
    public final C3173t f3893b;

    /* renamed from: c */
    public final C3173t f3894c;

    /* renamed from: d */
    public final C3173t f3895d;

    /* renamed from: e */
    public final ArrayDeque<C2718c.C2719a> f3896e;

    /* renamed from: f */
    public int f3897f;

    /* renamed from: g */
    public int f3898g;

    /* renamed from: h */
    public long f3899h;

    /* renamed from: i */
    public int f3900i;

    /* renamed from: j */
    public C3173t f3901j;

    /* renamed from: k */
    public int f3902k;

    /* renamed from: l */
    public int f3903l;

    /* renamed from: m */
    public int f3904m;

    /* renamed from: n */
    public C2676i f3905n;

    /* renamed from: o */
    public C2737a[] f3906o;

    /* renamed from: p */
    public long[][] f3907p;

    /* renamed from: q */
    public int f3908q;

    /* renamed from: r */
    public long f3909r;

    /* renamed from: s */
    public boolean f3910s;

    /* renamed from: c.q.a.b.f0.v.i$a */
    /* compiled from: Mp4Extractor */
    public static final class C2737a {

        /* renamed from: a */
        public final C2741l f3911a;

        /* renamed from: b */
        public final C2744o f3912b;

        /* renamed from: c */
        public final C2686q f3913c;

        /* renamed from: d */
        public int f3914d;

        public C2737a(C2741l lVar, C2744o oVar, C2686q qVar) {
            this.f3911a = lVar;
            this.f3912b = oVar;
            this.f3913c = qVar;
        }
    }

    static {
        C2717b bVar = C2717b.f3665a;
    }

    public C2736i() {
        this(0);
    }

    /* renamed from: j */
    public static long[][] m5571j(C2737a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            jArr[i] = new long[aVarArr[i].f3912b.f3953b];
            jArr2[i] = aVarArr[i].f3912b.f3957f[0];
        }
        long j = 0;
        int i2 = 0;
        while (i2 < aVarArr.length) {
            long j2 = Long.MAX_VALUE;
            int i3 = -1;
            for (int i4 = 0; i4 < aVarArr.length; i4++) {
                if (!zArr[i4] && jArr2[i4] <= j2) {
                    j2 = jArr2[i4];
                    i3 = i4;
                }
            }
            int i5 = iArr[i3];
            jArr[i3][i5] = j;
            j += (long) aVarArr[i3].f3912b.f3955d[i5];
            int i6 = i5 + 1;
            iArr[i3] = i6;
            if (i6 < jArr[i3].length) {
                jArr2[i3] = aVarArr[i3].f3912b.f3957f[i6];
            } else {
                zArr[i3] = true;
                i2++;
            }
        }
        return jArr;
    }

    /* renamed from: l */
    public static int m5572l(C2744o oVar, long j) {
        int a = oVar.mo18691a(j);
        return a == -1 ? oVar.mo18692b(j) : a;
    }

    /* renamed from: o */
    public static /* synthetic */ C2674g[] m5573o() {
        return new C2674g[]{new C2736i()};
    }

    /* renamed from: p */
    public static long m5574p(C2744o oVar, long j, long j2) {
        int l = m5572l(oVar, j);
        if (l == -1) {
            return j2;
        }
        return Math.min(oVar.f3954c[l], j2);
    }

    /* renamed from: r */
    public static boolean m5575r(C3173t tVar) {
        tVar.mo20006L(8);
        if (tVar.mo20017j() == f3891t) {
            return true;
        }
        tVar.mo20007M(4);
        while (tVar.mo20008a() > 0) {
            if (tVar.mo20017j() == f3891t) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: w */
    public static boolean m5576w(int i) {
        return i == C2718c.f3670C || i == C2718c.f3674E || i == C2718c.f3676F || i == C2718c.f3678G || i == C2718c.f3680H || i == C2718c.f3698Q || i == C2718c.f3669B0;
    }

    /* renamed from: x */
    public static boolean m5577x(int i) {
        return i == C2718c.f3702S || i == C2718c.f3672D || i == C2718c.f3704T || i == C2718c.f3706U || i == C2718c.f3738m0 || i == C2718c.f3740n0 || i == C2718c.f3742o0 || i == C2718c.f3700R || i == C2718c.f3744p0 || i == C2718c.f3746q0 || i == C2718c.f3748r0 || i == C2718c.f3750s0 || i == C2718c.f3752t0 || i == C2718c.f3696P || i == C2718c.f3715b || i == C2718c.f3667A0 || i == C2718c.f3671C0 || i == C2718c.f3673D0;
    }

    /* renamed from: b */
    public boolean mo18547b(C2675h hVar) {
        return C2740k.m5602d(hVar);
    }

    /* renamed from: d */
    public boolean mo18503d() {
        return true;
    }

    /* renamed from: e */
    public int mo18548e(C2675h hVar, C2681n nVar) {
        while (true) {
            int i = this.f3897f;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        return mo18681v(hVar, nVar);
                    }
                    throw new IllegalStateException();
                } else if (mo18680u(hVar, nVar)) {
                    return 1;
                }
            } else if (!mo18679t(hVar)) {
                return -1;
            }
        }
    }

    /* renamed from: f */
    public void mo18549f(C2676i iVar) {
        this.f3905n = iVar;
    }

    /* renamed from: g */
    public void mo18550g(long j, long j2) {
        this.f3896e.clear();
        this.f3900i = 0;
        this.f3902k = -1;
        this.f3903l = 0;
        this.f3904m = 0;
        if (j == 0) {
            mo18674k();
        } else if (this.f3906o != null) {
            mo18682y(j2);
        }
    }

    /* renamed from: h */
    public C2682o.C2683a mo18504h(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        int b;
        C2737a[] aVarArr = this.f3906o;
        if (aVarArr.length == 0) {
            return new C2682o.C2683a(C2685p.f3448c);
        }
        int i = this.f3908q;
        if (i != -1) {
            C2744o oVar = aVarArr[i].f3912b;
            int l = m5572l(oVar, j);
            if (l == -1) {
                return new C2682o.C2683a(C2685p.f3448c);
            }
            long j6 = oVar.f3957f[l];
            j2 = oVar.f3954c[l];
            if (j6 >= j || l >= oVar.f3953b - 1 || (b = oVar.mo18692b(j)) == -1 || b == l) {
                j5 = -1;
                j4 = -9223372036854775807L;
            } else {
                j4 = oVar.f3957f[b];
                j5 = oVar.f3954c[b];
            }
            j3 = j5;
            j = j6;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -1;
            j4 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            C2737a[] aVarArr2 = this.f3906o;
            if (i2 >= aVarArr2.length) {
                break;
            }
            if (i2 != this.f3908q) {
                C2744o oVar2 = aVarArr2[i2].f3912b;
                long p = m5574p(oVar2, j, j2);
                if (j4 != -9223372036854775807L) {
                    j3 = m5574p(oVar2, j4, j3);
                }
                j2 = p;
            }
            i2++;
        }
        C2685p pVar = new C2685p(j, j2);
        if (j4 == -9223372036854775807L) {
            return new C2682o.C2683a(pVar);
        }
        return new C2682o.C2683a(pVar, new C2685p(j4, j3));
    }

    /* renamed from: i */
    public long mo18505i() {
        return this.f3909r;
    }

    /* renamed from: k */
    public final void mo18674k() {
        this.f3897f = 0;
        this.f3900i = 0;
    }

    /* renamed from: m */
    public final int mo18675m(long j) {
        int i = -1;
        int i2 = -1;
        int i3 = 0;
        long j2 = Long.MAX_VALUE;
        boolean z = true;
        long j3 = Long.MAX_VALUE;
        boolean z2 = true;
        long j4 = Long.MAX_VALUE;
        while (true) {
            C2737a[] aVarArr = this.f3906o;
            if (i3 >= aVarArr.length) {
                break;
            }
            C2737a aVar = aVarArr[i3];
            int i4 = aVar.f3914d;
            C2744o oVar = aVar.f3912b;
            if (i4 != oVar.f3953b) {
                long j5 = oVar.f3954c[i4];
                long j6 = this.f3907p[i3][i4];
                long j7 = j5 - j;
                boolean z3 = j7 < 0 || j7 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                if ((!z3 && z2) || (z3 == z2 && j7 < j4)) {
                    z2 = z3;
                    j4 = j7;
                    i2 = i3;
                    j3 = j6;
                }
                if (j6 < j2) {
                    z = z3;
                    i = i3;
                    j2 = j6;
                }
            }
            i3++;
        }
        return (j2 == Long.MAX_VALUE || !z || j3 < j2 + 10485760) ? i2 : i;
    }

    /* renamed from: n */
    public final ArrayList<C2744o> mo18676n(C2718c.C2719a aVar, C2678k kVar, boolean z) {
        C2741l v;
        ArrayList<C2744o> arrayList = new ArrayList<>();
        for (int i = 0; i < aVar.f3768Y0.size(); i++) {
            C2718c.C2719a aVar2 = aVar.f3768Y0.get(i);
            if (aVar2.f3765a == C2718c.f3674E && (v = C2721d.m5493v(aVar2, aVar.mo18647g(C2718c.f3672D), -9223372036854775807L, (DrmInitData) null, z, this.f3910s)) != null) {
                C2744o r = C2721d.m5489r(v, aVar2.mo18646f(C2718c.f3676F).mo18646f(C2718c.f3678G).mo18646f(C2718c.f3680H), kVar);
                if (r.f3953b != 0) {
                    arrayList.add(r);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: q */
    public final void mo18677q(long j) {
        while (!this.f3896e.isEmpty() && this.f3896e.peek().f3766W0 == j) {
            C2718c.C2719a pop = this.f3896e.pop();
            if (pop.f3765a == C2718c.f3670C) {
                mo18678s(pop);
                this.f3896e.clear();
                this.f3897f = 2;
            } else if (!this.f3896e.isEmpty()) {
                this.f3896e.peek().mo18644d(pop);
            }
        }
        if (this.f3897f != 2) {
            mo18674k();
        }
    }

    public void release() {
    }

    /* renamed from: s */
    public final void mo18678s(C2718c.C2719a aVar) {
        Metadata metadata;
        C2718c.C2719a aVar2 = aVar;
        ArrayList arrayList = new ArrayList();
        C2678k kVar = new C2678k();
        C2718c.C2720b g = aVar2.mo18647g(C2718c.f3667A0);
        Metadata metadata2 = null;
        if (g != null) {
            metadata = C2721d.m5494w(g, this.f3910s);
            if (metadata != null) {
                kVar.mo18557c(metadata);
            }
        } else {
            metadata = null;
        }
        C2718c.C2719a f = aVar2.mo18646f(C2718c.f3669B0);
        if (f != null) {
            metadata2 = C2721d.m5483l(f);
        }
        boolean z = true;
        if ((this.f3892a & 1) == 0) {
            z = false;
        }
        ArrayList<C2744o> n = mo18676n(aVar2, kVar, z);
        int size = n.size();
        int i = -1;
        long j = -9223372036854775807L;
        for (int i2 = 0; i2 < size; i2++) {
            C2744o oVar = n.get(i2);
            C2741l lVar = oVar.f3952a;
            C2737a aVar3 = new C2737a(lVar, oVar, this.f3905n.mo18552a(i2, lVar.f3918b));
            aVar3.f3913c.mo18546d(C2735h.m5560a(lVar.f3918b, lVar.f3922f.mo23920f(oVar.f3956e + 30), metadata, metadata2, kVar));
            long j2 = lVar.f3921e;
            if (j2 == -9223372036854775807L) {
                j2 = oVar.f3959h;
            }
            j = Math.max(j, j2);
            if (lVar.f3918b == 2) {
                if (i == -1) {
                    i = arrayList.size();
                }
            }
            arrayList.add(aVar3);
        }
        this.f3908q = i;
        this.f3909r = j;
        C2737a[] aVarArr = (C2737a[]) arrayList.toArray(new C2737a[arrayList.size()]);
        this.f3906o = aVarArr;
        this.f3907p = m5571j(aVarArr);
        this.f3905n.mo18554o();
        this.f3905n.mo18553c(this);
    }

    /* renamed from: t */
    public final boolean mo18679t(C2675h hVar) {
        if (this.f3900i == 0) {
            if (!hVar.mo18522a(this.f3895d.f5877a, 0, 8, true)) {
                return false;
            }
            this.f3900i = 8;
            this.f3895d.mo20006L(0);
            this.f3899h = this.f3895d.mo19995A();
            this.f3898g = this.f3895d.mo20017j();
        }
        long j = this.f3899h;
        if (j == 1) {
            hVar.readFully(this.f3895d.f5877a, 8, 8);
            this.f3900i += 8;
            this.f3899h = this.f3895d.mo19998D();
        } else if (j == 0) {
            long e = hVar.mo18526e();
            if (e == -1 && !this.f3896e.isEmpty()) {
                e = this.f3896e.peek().f3766W0;
            }
            if (e != -1) {
                this.f3899h = (e - hVar.getPosition()) + ((long) this.f3900i);
            }
        }
        if (this.f3899h >= ((long) this.f3900i)) {
            if (m5576w(this.f3898g)) {
                long position = (hVar.getPosition() + this.f3899h) - ((long) this.f3900i);
                this.f3896e.push(new C2718c.C2719a(this.f3898g, position));
                if (this.f3899h == ((long) this.f3900i)) {
                    mo18677q(position);
                } else {
                    mo18674k();
                }
            } else if (m5577x(this.f3898g)) {
                C3151e.m7759g(this.f3900i == 8);
                C3151e.m7759g(this.f3899h <= 2147483647L);
                C3173t tVar = new C3173t((int) this.f3899h);
                this.f3901j = tVar;
                System.arraycopy(this.f3895d.f5877a, 0, tVar.f5877a, 0, 8);
                this.f3897f = 1;
            } else {
                this.f3901j = null;
                this.f3897f = 1;
            }
            return true;
        }
        throw new ParserException("Atom size less than header length (unsupported).");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo18680u(p040c.p200q.p201a.p219b.p224f0.C2675h r10, p040c.p200q.p201a.p219b.p224f0.C2681n r11) {
        /*
            r9 = this;
            long r0 = r9.f3899h
            int r2 = r9.f3900i
            long r2 = (long) r2
            long r0 = r0 - r2
            long r2 = r10.getPosition()
            long r2 = r2 + r0
            c.q.a.b.o0.t r4 = r9.f3901j
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0045
            byte[] r11 = r4.f5877a
            int r4 = r9.f3900i
            int r0 = (int) r0
            r10.readFully(r11, r4, r0)
            int r10 = r9.f3898g
            int r11 = p040c.p200q.p201a.p219b.p224f0.p229v.C2718c.f3715b
            if (r10 != r11) goto L_0x0028
            c.q.a.b.o0.t r10 = r9.f3901j
            boolean r10 = m5575r(r10)
            r9.f3910s = r10
            goto L_0x0050
        L_0x0028:
            java.util.ArrayDeque<c.q.a.b.f0.v.c$a> r10 = r9.f3896e
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L_0x0050
            java.util.ArrayDeque<c.q.a.b.f0.v.c$a> r10 = r9.f3896e
            java.lang.Object r10 = r10.peek()
            c.q.a.b.f0.v.c$a r10 = (p040c.p200q.p201a.p219b.p224f0.p229v.C2718c.C2719a) r10
            c.q.a.b.f0.v.c$b r11 = new c.q.a.b.f0.v.c$b
            int r0 = r9.f3898g
            c.q.a.b.o0.t r1 = r9.f3901j
            r11.<init>(r0, r1)
            r10.mo18645e(r11)
            goto L_0x0050
        L_0x0045:
            r7 = 262144(0x40000, double:1.295163E-318)
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 >= 0) goto L_0x0052
            int r11 = (int) r0
            r10.mo18528g(r11)
        L_0x0050:
            r10 = r6
            goto L_0x005a
        L_0x0052:
            long r7 = r10.getPosition()
            long r7 = r7 + r0
            r11.f3443a = r7
            r10 = r5
        L_0x005a:
            r9.mo18677q(r2)
            if (r10 == 0) goto L_0x0065
            int r10 = r9.f3897f
            r11 = 2
            if (r10 == r11) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r5 = r6
        L_0x0066:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p224f0.p229v.C2736i.mo18680u(c.q.a.b.f0.h, c.q.a.b.f0.n):boolean");
    }

    /* renamed from: v */
    public final int mo18681v(C2675h hVar, C2681n nVar) {
        C2675h hVar2 = hVar;
        long position = hVar.getPosition();
        if (this.f3902k == -1) {
            int m = mo18675m(position);
            this.f3902k = m;
            if (m == -1) {
                return -1;
            }
        }
        C2737a aVar = this.f3906o[this.f3902k];
        C2686q qVar = aVar.f3913c;
        int i = aVar.f3914d;
        C2744o oVar = aVar.f3912b;
        long j = oVar.f3954c[i];
        int i2 = oVar.f3955d[i];
        long j2 = (j - position) + ((long) this.f3903l);
        if (j2 < 0 || j2 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            nVar.f3443a = j;
            return 1;
        }
        if (aVar.f3911a.f3923g == 1) {
            j2 += 8;
            i2 -= 8;
        }
        hVar2.mo18528g((int) j2);
        int i3 = aVar.f3911a.f3926j;
        if (i3 == 0) {
            while (true) {
                int i4 = this.f3903l;
                if (i4 >= i2) {
                    break;
                }
                int a = qVar.mo18543a(hVar2, i2 - i4, false);
                this.f3903l += a;
                this.f3904m -= a;
            }
        } else {
            byte[] bArr = this.f3894c.f5877a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i5 = 4 - i3;
            while (this.f3903l < i2) {
                int i6 = this.f3904m;
                if (i6 == 0) {
                    hVar2.readFully(this.f3894c.f5877a, i5, i3);
                    this.f3894c.mo20006L(0);
                    this.f3904m = this.f3894c.mo19997C();
                    this.f3893b.mo20006L(0);
                    qVar.mo18544b(this.f3893b, 4);
                    this.f3903l += 4;
                    i2 += i5;
                } else {
                    int a2 = qVar.mo18543a(hVar2, i6, false);
                    this.f3903l += a2;
                    this.f3904m -= a2;
                }
            }
        }
        C2744o oVar2 = aVar.f3912b;
        qVar.mo18545c(oVar2.f3957f[i], oVar2.f3958g[i], i2, 0, (C2686q.C2687a) null);
        aVar.f3914d++;
        this.f3902k = -1;
        this.f3903l = 0;
        this.f3904m = 0;
        return 0;
    }

    /* renamed from: y */
    public final void mo18682y(long j) {
        for (C2737a aVar : this.f3906o) {
            C2744o oVar = aVar.f3912b;
            int a = oVar.mo18691a(j);
            if (a == -1) {
                a = oVar.mo18692b(j);
            }
            aVar.f3914d = a;
        }
    }

    public C2736i(int i) {
        this.f3892a = i;
        this.f3895d = new C3173t(16);
        this.f3896e = new ArrayDeque<>();
        this.f3893b = new C3173t(C3168q.f5853a);
        this.f3894c = new C3173t(4);
        this.f3902k = -1;
    }
}
