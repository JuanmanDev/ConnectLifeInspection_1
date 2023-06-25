package p040c.p200q.p201a.p219b.p241k0.p246e0;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.upstream.Loader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p040c.p200q.p201a.p219b.C3030l;
import p040c.p200q.p201a.p219b.p222d0.C2634e;
import p040c.p200q.p201a.p219b.p224f0.C2673f;
import p040c.p200q.p201a.p219b.p224f0.C2676i;
import p040c.p200q.p201a.p219b.p224f0.C2682o;
import p040c.p200q.p201a.p219b.p224f0.C2686q;
import p040c.p200q.p201a.p219b.p241k0.C3017v;
import p040c.p200q.p201a.p219b.p241k0.C3024x;
import p040c.p200q.p201a.p219b.p241k0.C3027y;
import p040c.p200q.p201a.p219b.p241k0.C3028z;
import p040c.p200q.p201a.p219b.p241k0.p243c0.C2872d;
import p040c.p200q.p201a.p219b.p241k0.p246e0.C2945f;
import p040c.p200q.p201a.p219b.p241k0.p246e0.p247q.C2968d;
import p040c.p200q.p201a.p219b.p260n0.C3117d;
import p040c.p200q.p201a.p219b.p260n0.C3135r;
import p040c.p200q.p201a.p219b.p261o0.C3151e;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3163m;
import p040c.p200q.p201a.p219b.p261o0.C3166p;

/* renamed from: c.q.a.b.k0.e0.n */
/* compiled from: HlsSampleStreamWrapper */
public final class C2959n implements Loader.C4057b<C2872d>, Loader.C4061f, C3028z, C2676i, C3024x.C3026b {

    /* renamed from: A */
    public int[] f4942A = new int[0];

    /* renamed from: B */
    public boolean f4943B;

    /* renamed from: C */
    public int f4944C = -1;

    /* renamed from: D */
    public boolean f4945D;

    /* renamed from: E */
    public int f4946E = -1;

    /* renamed from: F */
    public int f4947F;

    /* renamed from: G */
    public int f4948G;

    /* renamed from: H */
    public boolean f4949H;

    /* renamed from: I */
    public boolean f4950I;

    /* renamed from: J */
    public int f4951J;

    /* renamed from: K */
    public Format f4952K;

    /* renamed from: L */
    public Format f4953L;

    /* renamed from: M */
    public boolean f4954M;

    /* renamed from: N */
    public TrackGroupArray f4955N;

    /* renamed from: O */
    public TrackGroupArray f4956O;

    /* renamed from: P */
    public int[] f4957P;

    /* renamed from: Q */
    public int f4958Q;

    /* renamed from: R */
    public boolean f4959R;

    /* renamed from: S */
    public boolean[] f4960S = new boolean[0];

    /* renamed from: T */
    public boolean[] f4961T = new boolean[0];

    /* renamed from: U */
    public long f4962U;

    /* renamed from: V */
    public long f4963V;

    /* renamed from: W */
    public boolean f4964W;

    /* renamed from: X */
    public boolean f4965X;

    /* renamed from: Y */
    public boolean f4966Y;

    /* renamed from: Z */
    public boolean f4967Z;

    /* renamed from: a0 */
    public long f4968a0;

    /* renamed from: b0 */
    public int f4969b0;

    /* renamed from: e */
    public final int f4970e;

    /* renamed from: l */
    public final C2960a f4971l;

    /* renamed from: m */
    public final C2945f f4972m;

    /* renamed from: n */
    public final C3117d f4973n;

    /* renamed from: o */
    public final Format f4974o;

    /* renamed from: p */
    public final C3135r f4975p;

    /* renamed from: q */
    public final Loader f4976q = new Loader("Loader:HlsSampleStreamWrapper");

    /* renamed from: r */
    public final C3017v.C3018a f4977r;

    /* renamed from: s */
    public final C2945f.C2947b f4978s = new C2945f.C2947b();

    /* renamed from: t */
    public final ArrayList<C2953j> f4979t;

    /* renamed from: u */
    public final List<C2953j> f4980u;

    /* renamed from: v */
    public final Runnable f4981v;

    /* renamed from: w */
    public final Runnable f4982w;

    /* renamed from: x */
    public final Handler f4983x;

    /* renamed from: y */
    public final ArrayList<C2958m> f4984y;

    /* renamed from: z */
    public C3024x[] f4985z = new C3024x[0];

    /* renamed from: c.q.a.b.k0.e0.n$a */
    /* compiled from: HlsSampleStreamWrapper */
    public interface C2960a extends C3028z.C3029a<C2959n> {
        /* renamed from: a */
        void mo19346a();

        /* renamed from: h */
        void mo19348h(C2968d.C2969a aVar);
    }

    /* renamed from: c.q.a.b.k0.e0.n$b */
    /* compiled from: HlsSampleStreamWrapper */
    public static final class C2961b extends C3024x {
        public C2961b(C3117d dVar) {
            super(dVar);
        }

        @Nullable
        /* renamed from: L */
        public final Metadata mo19392L(@Nullable Metadata metadata) {
            if (metadata == null) {
                return null;
            }
            int b = metadata.mo24053b();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= b) {
                    i2 = -1;
                    break;
                }
                Metadata.Entry a = metadata.mo24052a(i2);
                if ((a instanceof PrivFrame) && "com.apple.streaming.transportStreamTimestamp".equals(((PrivFrame) a).f7770l)) {
                    break;
                }
                i2++;
            }
            if (i2 == -1) {
                return metadata;
            }
            if (b == 1) {
                return null;
            }
            Metadata.Entry[] entryArr = new Metadata.Entry[(b - 1)];
            while (i < b) {
                if (i != i2) {
                    entryArr[i < i2 ? i : i - 1] = metadata.mo24052a(i);
                }
                i++;
            }
            return new Metadata(entryArr);
        }

        /* renamed from: d */
        public void mo18546d(Format format) {
            super.mo18546d(format.mo23921g(mo19392L(format.f7564o)));
        }
    }

    public C2959n(int i, C2960a aVar, C2945f fVar, C3117d dVar, long j, Format format, C3135r rVar, C3017v.C3018a aVar2) {
        this.f4970e = i;
        this.f4971l = aVar;
        this.f4972m = fVar;
        this.f4973n = dVar;
        this.f4974o = format;
        this.f4975p = rVar;
        this.f4977r = aVar2;
        ArrayList<C2953j> arrayList = new ArrayList<>();
        this.f4979t = arrayList;
        this.f4980u = Collections.unmodifiableList(arrayList);
        this.f4984y = new ArrayList<>();
        this.f4981v = new C2941b(this);
        this.f4982w = new C2940a(this);
        this.f4983x = new Handler();
        this.f4962U = j;
        this.f4963V = j;
    }

    /* renamed from: A */
    public static boolean m6701A(Format format, Format format2) {
        String str = format.f7566q;
        String str2 = format2.f7566q;
        int g = C3166p.m7895g(str);
        if (g != 3) {
            if (g == C3166p.m7895g(str2)) {
                return true;
            }
            return false;
        } else if (!C3152e0.m7789b(str, str2)) {
            return false;
        } else {
            if (("application/cea-608".equals(str) || "application/cea-708".equals(str)) && format.f7558K != format2.f7558K) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: C */
    public static int m6702C(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 3;
    }

    /* renamed from: E */
    public static boolean m6703E(C2872d dVar) {
        return dVar instanceof C2953j;
    }

    /* renamed from: x */
    public static C2673f m6704x(int i, int i2) {
        C3163m.m7880f("HlsSampleStreamWrapper", "Unmapped track with id " + i + " of type " + i2);
        return new C2673f();
    }

    /* renamed from: y */
    public static Format m6705y(Format format, Format format2, boolean z) {
        if (format == null) {
            return format2;
        }
        int i = z ? format.f7562m : -1;
        String z2 = C3152e0.m7826z(format.f7563n, C3166p.m7895g(format2.f7566q));
        String d = C3166p.m7892d(z2);
        if (d == null) {
            d = format2.f7566q;
        }
        return format2.mo23913a(format.f7560e, format.f7561l, d, z2, i, format.f7571v, format.f7572w, format.f7556I, format.f7557J);
    }

    /* renamed from: B */
    public final C2953j mo19360B() {
        ArrayList<C2953j> arrayList = this.f4979t;
        return arrayList.get(arrayList.size() - 1);
    }

    /* renamed from: D */
    public void mo19361D(int i, boolean z, boolean z2) {
        if (!z2) {
            this.f4943B = false;
            this.f4945D = false;
        }
        this.f4969b0 = i;
        for (C3024x J : this.f4985z) {
            J.mo19585J(i);
        }
        if (z) {
            for (C3024x K : this.f4985z) {
                K.mo19586K();
            }
        }
    }

    /* renamed from: F */
    public final boolean mo19362F() {
        return this.f4963V != -9223372036854775807L;
    }

    /* renamed from: G */
    public boolean mo19363G(int i) {
        return this.f4966Y || (!mo19362F() && this.f4985z[i].mo19602u());
    }

    /* renamed from: H */
    public final void mo19364H() {
        int i = this.f4955N.f7830e;
        int[] iArr = new int[i];
        this.f4957P = iArr;
        Arrays.fill(iArr, -1);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = 0;
            while (true) {
                C3024x[] xVarArr = this.f4985z;
                if (i3 >= xVarArr.length) {
                    break;
                } else if (m6701A(xVarArr[i3].mo19600s(), this.f4955N.mo24210a(i2).mo24200a(0))) {
                    this.f4957P[i2] = i3;
                    break;
                } else {
                    i3++;
                }
            }
        }
        Iterator<C2958m> it = this.f4984y.iterator();
        while (it.hasNext()) {
            it.next().mo19357b();
        }
    }

    /* renamed from: I */
    public final void mo19365I() {
        if (!this.f4954M && this.f4957P == null && this.f4949H) {
            C3024x[] xVarArr = this.f4985z;
            int length = xVarArr.length;
            int i = 0;
            while (i < length) {
                if (xVarArr[i].mo19600s() != null) {
                    i++;
                } else {
                    return;
                }
            }
            if (this.f4955N != null) {
                mo19364H();
                return;
            }
            mo19389v();
            this.f4950I = true;
            this.f4971l.mo19346a();
        }
    }

    /* renamed from: J */
    public void mo19366J() {
        this.f4976q.mo19182a();
        this.f4972m.mo19325h();
    }

    /* renamed from: K */
    public void mo19106k(C2872d dVar, long j, long j2, boolean z) {
        C2872d dVar2 = dVar;
        this.f4977r.mo19537o(dVar2.f4553a, dVar.mo19075e(), dVar.mo19074d(), dVar2.f4554b, this.f4970e, dVar2.f4555c, dVar2.f4556d, dVar2.f4557e, dVar2.f4558f, dVar2.f4559g, j, j2, dVar.mo19072b());
        if (!z) {
            mo19375S();
            if (this.f4951J > 0) {
                this.f4971l.mo18995i(this);
            }
        }
    }

    /* renamed from: L */
    public void mo19107l(C2872d dVar, long j, long j2) {
        C2872d dVar2 = dVar;
        this.f4972m.mo19327j(dVar2);
        this.f4977r.mo19540r(dVar2.f4553a, dVar.mo19075e(), dVar.mo19074d(), dVar2.f4554b, this.f4970e, dVar2.f4555c, dVar2.f4556d, dVar2.f4557e, dVar2.f4558f, dVar2.f4559g, j, j2, dVar.mo19072b());
        if (!this.f4950I) {
            mo19100d(this.f4962U);
        } else {
            this.f4971l.mo18995i(this);
        }
    }

    /* renamed from: M */
    public Loader.C4058c mo19109s(C2872d dVar, long j, long j2, IOException iOException, int i) {
        Loader.C4058c g;
        C2872d dVar2 = dVar;
        long b = dVar.mo19072b();
        boolean E = m6703E(dVar);
        long b2 = this.f4975p.mo19923b(dVar2.f4554b, j2, iOException, i);
        boolean z = false;
        boolean g2 = b2 != -9223372036854775807L ? this.f4972m.mo19324g(dVar2, b2) : false;
        if (g2) {
            if (E && b == 0) {
                ArrayList<C2953j> arrayList = this.f4979t;
                if (arrayList.remove(arrayList.size() - 1) == dVar2) {
                    z = true;
                }
                C3151e.m7759g(z);
                if (this.f4979t.isEmpty()) {
                    this.f4963V = this.f4962U;
                }
            }
            g = Loader.f7921e;
        } else {
            long a = this.f4975p.mo19922a(dVar2.f4554b, j2, iOException, i);
            g = a != -9223372036854775807L ? Loader.m10672g(false, a) : Loader.f7922f;
        }
        Loader.C4058c cVar = g;
        this.f4977r.mo19543u(dVar2.f4553a, dVar.mo19075e(), dVar.mo19074d(), dVar2.f4554b, this.f4970e, dVar2.f4555c, dVar2.f4556d, dVar2.f4557e, dVar2.f4558f, dVar2.f4559g, j, j2, b, iOException, !cVar.mo24277c());
        if (g2) {
            if (!this.f4950I) {
                mo19100d(this.f4962U);
            } else {
                this.f4971l.mo18995i(this);
            }
        }
        return cVar;
    }

    /* renamed from: N */
    public boolean mo19370N(C2968d.C2969a aVar, long j) {
        return this.f4972m.mo19328k(aVar, j);
    }

    /* renamed from: O */
    public final void mo19371O() {
        this.f4949H = true;
        mo19365I();
    }

    /* renamed from: P */
    public void mo19372P(TrackGroupArray trackGroupArray, int i, TrackGroupArray trackGroupArray2) {
        this.f4950I = true;
        this.f4955N = trackGroupArray;
        this.f4956O = trackGroupArray2;
        this.f4958Q = i;
        this.f4971l.mo19346a();
    }

    /* renamed from: Q */
    public int mo19373Q(int i, C3030l lVar, C2634e eVar, boolean z) {
        if (mo19362F()) {
            return -3;
        }
        int i2 = 0;
        if (!this.f4979t.isEmpty()) {
            int i3 = 0;
            while (i3 < this.f4979t.size() - 1 && mo19391z(this.f4979t.get(i3))) {
                i3++;
            }
            C3152e0.m7788a0(this.f4979t, 0, i3);
            C2953j jVar = this.f4979t.get(0);
            Format format = jVar.f4555c;
            if (!format.equals(this.f4953L)) {
                this.f4977r.mo19525c(this.f4970e, format, jVar.f4556d, jVar.f4557e, jVar.f4558f);
            }
            this.f4953L = format;
        }
        int z2 = this.f4985z[i].mo19607z(lVar, eVar, z, this.f4966Y, this.f4962U);
        if (z2 == -5 && i == this.f4948G) {
            int w = this.f4985z[i].mo19604w();
            while (i2 < this.f4979t.size() && this.f4979t.get(i2).f4887j != w) {
                i2++;
            }
            lVar.f5333a = lVar.f5333a.mo23918e(i2 < this.f4979t.size() ? this.f4979t.get(i2).f4555c : this.f4952K);
        }
        return z2;
    }

    /* renamed from: R */
    public void mo19374R() {
        if (this.f4950I) {
            for (C3024x k : this.f4985z) {
                k.mo19593k();
            }
        }
        this.f4976q.mo24275k(this);
        this.f4983x.removeCallbacksAndMessages((Object) null);
        this.f4954M = true;
        this.f4984y.clear();
    }

    /* renamed from: S */
    public final void mo19375S() {
        for (C3024x E : this.f4985z) {
            E.mo19580E(this.f4964W);
        }
        this.f4964W = false;
    }

    /* renamed from: T */
    public final boolean mo19376T(long j) {
        int length = this.f4985z.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= length) {
                return true;
            }
            C3024x xVar = this.f4985z[i];
            xVar.mo19581F();
            if (xVar.mo19588f(j, true, false) == -1) {
                z = false;
            }
            if (z || (!this.f4961T[i] && this.f4959R)) {
                i++;
            }
        }
        return false;
    }

    /* renamed from: U */
    public boolean mo19377U(long j, boolean z) {
        this.f4962U = j;
        if (mo19362F()) {
            this.f4963V = j;
            return true;
        } else if (this.f4949H && !z && mo19376T(j)) {
            return false;
        } else {
            this.f4963V = j;
            this.f4966Y = false;
            this.f4979t.clear();
            if (this.f4976q.mo24272h()) {
                this.f4976q.mo24271f();
            } else {
                mo19375S();
            }
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x013c  */
    /* renamed from: V */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo19378V(p040c.p200q.p201a.p219b.p259m0.C3107e[] r20, boolean[] r21, p040c.p200q.p201a.p219b.p241k0.C3027y[] r22, boolean[] r23, long r24, boolean r26) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r22
            r12 = r24
            boolean r3 = r0.f4950I
            p040c.p200q.p201a.p219b.p261o0.C3151e.m7759g(r3)
            int r3 = r0.f4951J
            r14 = 0
            r4 = r14
        L_0x0011:
            int r5 = r1.length
            r6 = 0
            r15 = 1
            if (r4 >= r5) goto L_0x0033
            r5 = r2[r4]
            if (r5 == 0) goto L_0x0030
            r5 = r1[r4]
            if (r5 == 0) goto L_0x0022
            boolean r5 = r21[r4]
            if (r5 != 0) goto L_0x0030
        L_0x0022:
            int r5 = r0.f4951J
            int r5 = r5 - r15
            r0.f4951J = r5
            r5 = r2[r4]
            c.q.a.b.k0.e0.m r5 = (p040c.p200q.p201a.p219b.p241k0.p246e0.C2958m) r5
            r5.mo19359e()
            r2[r4] = r6
        L_0x0030:
            int r4 = r4 + 1
            goto L_0x0011
        L_0x0033:
            if (r26 != 0) goto L_0x0045
            boolean r4 = r0.f4965X
            if (r4 == 0) goto L_0x003c
            if (r3 != 0) goto L_0x0043
            goto L_0x0045
        L_0x003c:
            long r3 = r0.f4962U
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r3 = r14
            goto L_0x0046
        L_0x0045:
            r3 = r15
        L_0x0046:
            c.q.a.b.k0.e0.f r4 = r0.f4972m
            c.q.a.b.m0.e r4 = r4.mo19323f()
            r16 = r3
            r11 = r4
            r3 = r14
        L_0x0050:
            int r5 = r1.length
            if (r3 >= r5) goto L_0x00b0
            r5 = r2[r3]
            if (r5 != 0) goto L_0x00ad
            r5 = r1[r3]
            if (r5 == 0) goto L_0x00ad
            int r5 = r0.f4951J
            int r5 = r5 + r15
            r0.f4951J = r5
            r5 = r1[r3]
            com.google.android.exoplayer2.source.TrackGroupArray r7 = r0.f4955N
            com.google.android.exoplayer2.source.TrackGroup r8 = r5.mo19820a()
            int r7 = r7.mo24211b(r8)
            int r8 = r0.f4958Q
            if (r7 != r8) goto L_0x0076
            c.q.a.b.k0.e0.f r8 = r0.f4972m
            r8.mo19331n(r5)
            r11 = r5
        L_0x0076:
            c.q.a.b.k0.e0.m r5 = new c.q.a.b.k0.e0.m
            r5.<init>(r0, r7)
            r2[r3] = r5
            r23[r3] = r15
            int[] r5 = r0.f4957P
            if (r5 == 0) goto L_0x008a
            r5 = r2[r3]
            c.q.a.b.k0.e0.m r5 = (p040c.p200q.p201a.p219b.p241k0.p246e0.C2958m) r5
            r5.mo19357b()
        L_0x008a:
            boolean r5 = r0.f4949H
            if (r5 == 0) goto L_0x00ad
            if (r16 != 0) goto L_0x00ad
            c.q.a.b.k0.x[] r5 = r0.f4985z
            int[] r8 = r0.f4957P
            r7 = r8[r7]
            r5 = r5[r7]
            r5.mo19581F()
            int r7 = r5.mo19588f(r12, r15, r15)
            r8 = -1
            if (r7 != r8) goto L_0x00aa
            int r5 = r5.mo19599r()
            if (r5 == 0) goto L_0x00aa
            r5 = r15
            goto L_0x00ab
        L_0x00aa:
            r5 = r14
        L_0x00ab:
            r16 = r5
        L_0x00ad:
            int r3 = r3 + 1
            goto L_0x0050
        L_0x00b0:
            int r1 = r0.f4951J
            if (r1 != 0) goto L_0x00e5
            c.q.a.b.k0.e0.f r1 = r0.f4972m
            r1.mo19329l()
            r0.f4953L = r6
            java.util.ArrayList<c.q.a.b.k0.e0.j> r1 = r0.f4979t
            r1.clear()
            com.google.android.exoplayer2.upstream.Loader r1 = r0.f4976q
            boolean r1 = r1.mo24272h()
            if (r1 == 0) goto L_0x00e0
            boolean r1 = r0.f4949H
            if (r1 == 0) goto L_0x00d9
            c.q.a.b.k0.x[] r1 = r0.f4985z
            int r3 = r1.length
        L_0x00cf:
            if (r14 >= r3) goto L_0x00d9
            r4 = r1[r14]
            r4.mo19593k()
            int r14 = r14 + 1
            goto L_0x00cf
        L_0x00d9:
            com.google.android.exoplayer2.upstream.Loader r1 = r0.f4976q
            r1.mo24271f()
            goto L_0x014b
        L_0x00e0:
            r19.mo19375S()
            goto L_0x014b
        L_0x00e5:
            java.util.ArrayList<c.q.a.b.k0.e0.j> r1 = r0.f4979t
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0138
            boolean r1 = p040c.p200q.p201a.p219b.p261o0.C3152e0.m7789b(r11, r4)
            if (r1 != 0) goto L_0x0138
            boolean r1 = r0.f4965X
            if (r1 != 0) goto L_0x012f
            r3 = 0
            int r1 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x00fe
            long r3 = -r12
        L_0x00fe:
            r6 = r3
            c.q.a.b.k0.e0.j r1 = r19.mo19360B()
            c.q.a.b.k0.e0.f r3 = r0.f4972m
            c.q.a.b.k0.c0.m[] r17 = r3.mo19319b(r1, r12)
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.util.List<c.q.a.b.k0.e0.j> r10 = r0.f4980u
            r3 = r11
            r4 = r24
            r18 = r11
            r11 = r17
            r3.mo19338j(r4, r6, r8, r10, r11)
            c.q.a.b.k0.e0.f r3 = r0.f4972m
            com.google.android.exoplayer2.source.TrackGroup r3 = r3.mo19322e()
            com.google.android.exoplayer2.Format r1 = r1.f4555c
            int r1 = r3.mo24201b(r1)
            int r3 = r18.mo19828k()
            if (r3 == r1) goto L_0x012d
            goto L_0x012f
        L_0x012d:
            r1 = r14
            goto L_0x0130
        L_0x012f:
            r1 = r15
        L_0x0130:
            if (r1 == 0) goto L_0x0138
            r0.f4964W = r15
            r1 = r15
            r16 = r1
            goto L_0x013a
        L_0x0138:
            r1 = r26
        L_0x013a:
            if (r16 == 0) goto L_0x014b
            r0.mo19377U(r12, r1)
        L_0x013f:
            int r1 = r2.length
            if (r14 >= r1) goto L_0x014b
            r1 = r2[r14]
            if (r1 == 0) goto L_0x0148
            r23[r14] = r15
        L_0x0148:
            int r14 = r14 + 1
            goto L_0x013f
        L_0x014b:
            r0.mo19383a0(r2)
            r0.f4965X = r15
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p241k0.p246e0.C2959n.mo19378V(c.q.a.b.m0.e[], boolean[], c.q.a.b.k0.y[], boolean[], long, boolean):boolean");
    }

    /* renamed from: W */
    public void mo19379W(boolean z) {
        this.f4972m.mo19333p(z);
    }

    /* renamed from: X */
    public void mo19380X(long j) {
        this.f4968a0 = j;
        for (C3024x H : this.f4985z) {
            H.mo19583H(j);
        }
    }

    /* renamed from: Y */
    public int mo19381Y(int i, long j) {
        if (mo19362F()) {
            return 0;
        }
        C3024x xVar = this.f4985z[i];
        if (this.f4966Y && j > xVar.mo19598q()) {
            return xVar.mo19589g();
        }
        int f = xVar.mo19588f(j, true, true);
        if (f == -1) {
            return 0;
        }
        return f;
    }

    /* renamed from: Z */
    public void mo19382Z(int i) {
        int i2 = this.f4957P[i];
        C3151e.m7759g(this.f4960S[i2]);
        this.f4960S[i2] = false;
    }

    /* renamed from: a */
    public C2686q mo18552a(int i, int i2) {
        C3024x[] xVarArr = this.f4985z;
        int length = xVarArr.length;
        boolean z = false;
        if (i2 == 1) {
            int i3 = this.f4944C;
            if (i3 != -1) {
                if (!this.f4943B) {
                    this.f4943B = true;
                    this.f4942A[i3] = i;
                    return xVarArr[i3];
                } else if (this.f4942A[i3] == i) {
                    return xVarArr[i3];
                } else {
                    return m6704x(i, i2);
                }
            } else if (this.f4967Z) {
                return m6704x(i, i2);
            }
        } else if (i2 == 2) {
            int i4 = this.f4946E;
            if (i4 != -1) {
                if (!this.f4945D) {
                    this.f4945D = true;
                    this.f4942A[i4] = i;
                    return xVarArr[i4];
                } else if (this.f4942A[i4] == i) {
                    return xVarArr[i4];
                } else {
                    return m6704x(i, i2);
                }
            } else if (this.f4967Z) {
                return m6704x(i, i2);
            }
        } else {
            for (int i5 = 0; i5 < length; i5++) {
                if (this.f4942A[i5] == i) {
                    return this.f4985z[i5];
                }
            }
            if (this.f4967Z) {
                return m6704x(i, i2);
            }
        }
        C2961b bVar = new C2961b(this.f4973n);
        bVar.mo19583H(this.f4968a0);
        bVar.mo19585J(this.f4969b0);
        bVar.mo19584I(this);
        int i6 = length + 1;
        int[] copyOf = Arrays.copyOf(this.f4942A, i6);
        this.f4942A = copyOf;
        copyOf[length] = i;
        C3024x[] xVarArr2 = (C3024x[]) Arrays.copyOf(this.f4985z, i6);
        this.f4985z = xVarArr2;
        xVarArr2[length] = bVar;
        boolean[] copyOf2 = Arrays.copyOf(this.f4961T, i6);
        this.f4961T = copyOf2;
        if (i2 == 1 || i2 == 2) {
            z = true;
        }
        copyOf2[length] = z;
        this.f4959R |= this.f4961T[length];
        if (i2 == 1) {
            this.f4943B = true;
            this.f4944C = length;
        } else if (i2 == 2) {
            this.f4945D = true;
            this.f4946E = length;
        }
        if (m6702C(i2) > m6702C(this.f4947F)) {
            this.f4948G = length;
            this.f4947F = i2;
        }
        this.f4960S = Arrays.copyOf(this.f4960S, i6);
        return bVar;
    }

    /* renamed from: a0 */
    public final void mo19383a0(C3027y[] yVarArr) {
        this.f4984y.clear();
        for (C2958m mVar : yVarArr) {
            if (mVar != null) {
                this.f4984y.add(mVar);
            }
        }
    }

    /* renamed from: b */
    public long mo19098b() {
        if (mo19362F()) {
            return this.f4963V;
        }
        if (this.f4966Y) {
            return Long.MIN_VALUE;
        }
        return mo19360B().f4559g;
    }

    /* renamed from: c */
    public void mo18553c(C2682o oVar) {
    }

    /* renamed from: d */
    public boolean mo19100d(long j) {
        List<C2953j> list;
        long max;
        if (this.f4966Y || this.f4976q.mo24272h()) {
            return false;
        }
        if (mo19362F()) {
            list = Collections.emptyList();
            max = this.f4963V;
        } else {
            list = this.f4980u;
            C2953j B = mo19360B();
            if (B.mo19123g()) {
                max = B.f4559g;
            } else {
                max = Math.max(this.f4962U, B.f4558f);
            }
        }
        this.f4972m.mo19321d(j, max, list, this.f4978s);
        C2945f.C2947b bVar = this.f4978s;
        boolean z = bVar.f4876b;
        C2872d dVar = bVar.f4875a;
        C2968d.C2969a aVar = bVar.f4877c;
        bVar.mo19336a();
        if (z) {
            this.f4963V = -9223372036854775807L;
            this.f4966Y = true;
            return true;
        } else if (dVar == null) {
            if (aVar != null) {
                this.f4971l.mo19348h(aVar);
            }
            return false;
        } else {
            if (m6703E(dVar)) {
                this.f4963V = -9223372036854775807L;
                C2953j jVar = (C2953j) dVar;
                jVar.mo19341i(this);
                this.f4979t.add(jVar);
                this.f4952K = jVar.f4555c;
            }
            this.f4977r.mo19546x(dVar.f4553a, dVar.f4554b, this.f4970e, dVar.f4555c, dVar.f4556d, dVar.f4557e, dVar.f4558f, dVar.f4559g, this.f4976q.mo24276l(dVar, this, this.f4975p.mo19924c(dVar.f4554b)));
            return true;
        }
    }

    /* renamed from: f */
    public long mo19102f() {
        if (this.f4966Y) {
            return Long.MIN_VALUE;
        }
        if (mo19362F()) {
            return this.f4963V;
        }
        long j = this.f4962U;
        C2953j B = mo19360B();
        if (!B.mo19123g()) {
            if (this.f4979t.size() > 1) {
                ArrayList<C2953j> arrayList = this.f4979t;
                B = arrayList.get(arrayList.size() - 2);
            } else {
                B = null;
            }
        }
        if (B != null) {
            j = Math.max(j, B.f4559g);
        }
        if (this.f4949H) {
            for (C3024x q : this.f4985z) {
                j = Math.max(j, q.mo19598q());
            }
        }
        return j;
    }

    /* renamed from: g */
    public void mo19103g(long j) {
    }

    /* renamed from: h */
    public void mo19104h() {
        mo19375S();
    }

    /* renamed from: i */
    public void mo19384i(Format format) {
        this.f4983x.post(this.f4981v);
    }

    /* renamed from: m */
    public void mo19385m() {
        mo19366J();
    }

    /* renamed from: o */
    public void mo18554o() {
        this.f4967Z = true;
        this.f4983x.post(this.f4982w);
    }

    /* renamed from: r */
    public TrackGroupArray mo19386r() {
        return this.f4955N;
    }

    /* renamed from: t */
    public void mo19387t(long j, boolean z) {
        if (this.f4949H && !mo19362F()) {
            int length = this.f4985z.length;
            for (int i = 0; i < length; i++) {
                this.f4985z[i].mo19592j(j, z, this.f4960S[i]);
            }
        }
    }

    /* renamed from: u */
    public int mo19388u(int i) {
        int i2 = this.f4957P[i];
        if (i2 != -1) {
            boolean[] zArr = this.f4960S;
            if (zArr[i2]) {
                return -2;
            }
            zArr[i2] = true;
            return i2;
        } else if (this.f4956O.mo24211b(this.f4955N.mo24210a(i)) == -1) {
            return -2;
        } else {
            return -3;
        }
    }

    /* renamed from: v */
    public final void mo19389v() {
        int length = this.f4985z.length;
        boolean z = false;
        int i = 6;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            int i4 = 2;
            if (i3 >= length) {
                break;
            }
            String str = this.f4985z[i3].mo19600s().f7566q;
            if (!C3166p.m7901m(str)) {
                if (C3166p.m7899k(str)) {
                    i4 = 1;
                } else {
                    i4 = C3166p.m7900l(str) ? 3 : 6;
                }
            }
            if (m6702C(i4) > m6702C(i)) {
                i2 = i3;
                i = i4;
            } else if (i4 == i && i2 != -1) {
                i2 = -1;
            }
            i3++;
        }
        TrackGroup e = this.f4972m.mo19322e();
        int i5 = e.f7826e;
        this.f4958Q = -1;
        this.f4957P = new int[length];
        for (int i6 = 0; i6 < length; i6++) {
            this.f4957P[i6] = i6;
        }
        TrackGroup[] trackGroupArr = new TrackGroup[length];
        for (int i7 = 0; i7 < length; i7++) {
            Format s = this.f4985z[i7].mo19600s();
            if (i7 == i2) {
                Format[] formatArr = new Format[i5];
                if (i5 == 1) {
                    formatArr[0] = s.mo23918e(e.mo24200a(0));
                } else {
                    for (int i8 = 0; i8 < i5; i8++) {
                        formatArr[i8] = m6705y(e.mo24200a(i8), s, true);
                    }
                }
                trackGroupArr[i7] = new TrackGroup(formatArr);
                this.f4958Q = i7;
            } else {
                trackGroupArr[i7] = new TrackGroup(m6705y((i != 2 || !C3166p.m7899k(s.f7566q)) ? null : this.f4974o, s, false));
            }
        }
        this.f4955N = new TrackGroupArray(trackGroupArr);
        if (this.f4956O == null) {
            z = true;
        }
        C3151e.m7759g(z);
        this.f4956O = TrackGroupArray.f7829n;
    }

    /* renamed from: w */
    public void mo19390w() {
        if (!this.f4950I) {
            mo19100d(this.f4962U);
        }
    }

    /* renamed from: z */
    public final boolean mo19391z(C2953j jVar) {
        int i = jVar.f4887j;
        int length = this.f4985z.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (this.f4960S[i2] && this.f4985z[i2].mo19604w() == i) {
                return false;
            }
        }
        return true;
    }
}
