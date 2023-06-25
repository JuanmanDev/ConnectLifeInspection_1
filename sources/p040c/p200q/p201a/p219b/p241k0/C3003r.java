package p040c.p200q.p201a.p219b.p241k0;

import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.UnrecognizedInputFormatException;
import com.google.android.exoplayer2.upstream.Loader;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import p040c.p200q.p201a.p219b.C3030l;
import p040c.p200q.p201a.p219b.C3216y;
import p040c.p200q.p201a.p219b.p222d0.C2634e;
import p040c.p200q.p201a.p219b.p224f0.C2671d;
import p040c.p200q.p201a.p219b.p224f0.C2674g;
import p040c.p200q.p201a.p219b.p224f0.C2675h;
import p040c.p200q.p201a.p219b.p224f0.C2676i;
import p040c.p200q.p201a.p219b.p224f0.C2681n;
import p040c.p200q.p201a.p219b.p224f0.C2682o;
import p040c.p200q.p201a.p219b.p224f0.C2686q;
import p040c.p200q.p201a.p219b.p241k0.C3012t;
import p040c.p200q.p201a.p219b.p241k0.C3017v;
import p040c.p200q.p201a.p219b.p241k0.C3024x;
import p040c.p200q.p201a.p219b.p259m0.C3107e;
import p040c.p200q.p201a.p219b.p260n0.C3117d;
import p040c.p200q.p201a.p219b.p260n0.C3122h;
import p040c.p200q.p201a.p219b.p260n0.C3125j;
import p040c.p200q.p201a.p219b.p260n0.C3135r;
import p040c.p200q.p201a.p219b.p260n0.C3140u;
import p040c.p200q.p201a.p219b.p261o0.C3151e;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3157i;
import p040c.p200q.p201a.p219b.p261o0.C3166p;

/* renamed from: c.q.a.b.k0.r */
/* compiled from: ExtractorMediaPeriod */
public final class C3003r implements C3012t, C2676i, Loader.C4057b<C3004a>, Loader.C4061f, C3024x.C3026b {

    /* renamed from: A */
    public C3024x[] f5204A;

    /* renamed from: B */
    public int[] f5205B;

    /* renamed from: C */
    public boolean f5206C;

    /* renamed from: D */
    public boolean f5207D;
    @Nullable

    /* renamed from: E */
    public C3007d f5208E;

    /* renamed from: F */
    public boolean f5209F;

    /* renamed from: G */
    public int f5210G;

    /* renamed from: H */
    public boolean f5211H;

    /* renamed from: I */
    public boolean f5212I;

    /* renamed from: J */
    public boolean f5213J;

    /* renamed from: K */
    public int f5214K;

    /* renamed from: L */
    public long f5215L;

    /* renamed from: M */
    public long f5216M;

    /* renamed from: N */
    public long f5217N;

    /* renamed from: O */
    public long f5218O;

    /* renamed from: P */
    public boolean f5219P;

    /* renamed from: Q */
    public int f5220Q;

    /* renamed from: R */
    public boolean f5221R;

    /* renamed from: S */
    public boolean f5222S;

    /* renamed from: e */
    public final Uri f5223e;

    /* renamed from: l */
    public final C3122h f5224l;

    /* renamed from: m */
    public final C3135r f5225m;

    /* renamed from: n */
    public final C3017v.C3018a f5226n;

    /* renamed from: o */
    public final C3006c f5227o;

    /* renamed from: p */
    public final C3117d f5228p;
    @Nullable

    /* renamed from: q */
    public final String f5229q;

    /* renamed from: r */
    public final long f5230r;

    /* renamed from: s */
    public final Loader f5231s = new Loader("Loader:ExtractorMediaPeriod");

    /* renamed from: t */
    public final C3005b f5232t;

    /* renamed from: u */
    public final C3157i f5233u;

    /* renamed from: v */
    public final Runnable f5234v;

    /* renamed from: w */
    public final Runnable f5235w;

    /* renamed from: x */
    public final Handler f5236x;
    @Nullable

    /* renamed from: y */
    public C3012t.C3013a f5237y;
    @Nullable

    /* renamed from: z */
    public C2682o f5238z;

    /* renamed from: c.q.a.b.k0.r$a */
    /* compiled from: ExtractorMediaPeriod */
    public final class C3004a implements Loader.C4060e {

        /* renamed from: a */
        public final Uri f5239a;

        /* renamed from: b */
        public final C3140u f5240b;

        /* renamed from: c */
        public final C3005b f5241c;

        /* renamed from: d */
        public final C2676i f5242d;

        /* renamed from: e */
        public final C3157i f5243e;

        /* renamed from: f */
        public final C2681n f5244f;

        /* renamed from: g */
        public volatile boolean f5245g;

        /* renamed from: h */
        public boolean f5246h = true;

        /* renamed from: i */
        public long f5247i;

        /* renamed from: j */
        public C3125j f5248j;

        /* renamed from: k */
        public long f5249k = -1;

        public C3004a(Uri uri, C3122h hVar, C3005b bVar, C2676i iVar, C3157i iVar2) {
            this.f5239a = uri;
            this.f5240b = new C3140u(hVar);
            this.f5241c = bVar;
            this.f5242d = iVar;
            this.f5243e = iVar2;
            C2681n nVar = new C2681n();
            this.f5244f = nVar;
            this.f5248j = new C3125j(uri, nVar.f3443a, -1, C3003r.this.f5229q);
        }

        /* renamed from: a */
        public void mo19121a() {
            this.f5245g = true;
        }

        /* renamed from: g */
        public final void mo19506g(long j, long j2) {
            this.f5244f.f3443a = j;
            this.f5247i = j2;
            this.f5246h = true;
        }

        public void load() {
            int i = 0;
            while (i == 0 && !this.f5245g) {
                C2671d dVar = null;
                try {
                    long j = this.f5244f.f3443a;
                    C3125j jVar = new C3125j(this.f5239a, j, -1, C3003r.this.f5229q);
                    this.f5248j = jVar;
                    long c = this.f5240b.mo19309c(jVar);
                    this.f5249k = c;
                    if (c != -1) {
                        this.f5249k = c + j;
                    }
                    Uri e = this.f5240b.mo19312e();
                    C3151e.m7757e(e);
                    Uri uri = e;
                    C2671d dVar2 = new C2671d(this.f5240b, j, this.f5249k);
                    try {
                        C2674g b = this.f5241c.mo19508b(dVar2, this.f5242d, uri);
                        if (this.f5246h) {
                            b.mo18550g(j, this.f5247i);
                            this.f5246h = false;
                        }
                        while (i == 0 && !this.f5245g) {
                            this.f5243e.mo19956a();
                            i = b.mo18548e(dVar2, this.f5244f);
                            if (dVar2.getPosition() > C3003r.this.f5230r + j) {
                                j = dVar2.getPosition();
                                this.f5243e.mo19957b();
                                C3003r.this.f5236x.post(C3003r.this.f5235w);
                            }
                        }
                        if (i == 1) {
                            i = 0;
                        } else {
                            this.f5244f.f3443a = dVar2.getPosition();
                        }
                        C3152e0.m7805j(this.f5240b);
                    } catch (Throwable th) {
                        th = th;
                        dVar = dVar2;
                        if (!(i == 1 || dVar == null)) {
                            this.f5244f.f3443a = dVar.getPosition();
                        }
                        C3152e0.m7805j(this.f5240b);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    this.f5244f.f3443a = dVar.getPosition();
                    C3152e0.m7805j(this.f5240b);
                    throw th;
                }
            }
        }
    }

    /* renamed from: c.q.a.b.k0.r$b */
    /* compiled from: ExtractorMediaPeriod */
    public static final class C3005b {

        /* renamed from: a */
        public final C2674g[] f5251a;
        @Nullable

        /* renamed from: b */
        public C2674g f5252b;

        public C3005b(C2674g[] gVarArr) {
            this.f5251a = gVarArr;
        }

        /* renamed from: a */
        public void mo19507a() {
            C2674g gVar = this.f5252b;
            if (gVar != null) {
                gVar.release();
                this.f5252b = null;
            }
        }

        /* renamed from: b */
        public C2674g mo19508b(C2675h hVar, C2676i iVar, Uri uri) {
            C2674g gVar = this.f5252b;
            if (gVar != null) {
                return gVar;
            }
            C2674g[] gVarArr = this.f5251a;
            int length = gVarArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                C2674g gVar2 = gVarArr[i];
                try {
                    if (gVar2.mo18547b(hVar)) {
                        this.f5252b = gVar2;
                        hVar.mo18527f();
                        break;
                    }
                    hVar.mo18527f();
                    i++;
                } catch (EOFException unused) {
                } catch (Throwable th) {
                    hVar.mo18527f();
                    throw th;
                }
            }
            C2674g gVar3 = this.f5252b;
            if (gVar3 != null) {
                gVar3.mo18549f(iVar);
                return this.f5252b;
            }
            throw new UnrecognizedInputFormatException("None of the available extractors (" + C3152e0.m7761A(this.f5251a) + ") could read the stream.", uri);
        }
    }

    /* renamed from: c.q.a.b.k0.r$c */
    /* compiled from: ExtractorMediaPeriod */
    public interface C3006c {
        /* renamed from: f */
        void mo19509f(long j, boolean z);
    }

    /* renamed from: c.q.a.b.k0.r$d */
    /* compiled from: ExtractorMediaPeriod */
    public static final class C3007d {

        /* renamed from: a */
        public final C2682o f5253a;

        /* renamed from: b */
        public final TrackGroupArray f5254b;

        /* renamed from: c */
        public final boolean[] f5255c;

        /* renamed from: d */
        public final boolean[] f5256d;

        /* renamed from: e */
        public final boolean[] f5257e;

        public C3007d(C2682o oVar, TrackGroupArray trackGroupArray, boolean[] zArr) {
            this.f5253a = oVar;
            this.f5254b = trackGroupArray;
            this.f5255c = zArr;
            int i = trackGroupArray.f7830e;
            this.f5256d = new boolean[i];
            this.f5257e = new boolean[i];
        }
    }

    /* renamed from: c.q.a.b.k0.r$e */
    /* compiled from: ExtractorMediaPeriod */
    public final class C3008e implements C3027y {

        /* renamed from: e */
        public final int f5258e;

        public C3008e(int i) {
            this.f5258e = i;
        }

        /* renamed from: a */
        public void mo19097a() {
            C3003r.this.mo19494J();
        }

        /* renamed from: c */
        public boolean mo19099c() {
            return C3003r.this.mo19489E(this.f5258e);
        }

        /* renamed from: i */
        public int mo19105i(C3030l lVar, C2634e eVar, boolean z) {
            return C3003r.this.mo19498N(this.f5258e, lVar, eVar, z);
        }

        /* renamed from: o */
        public int mo19108o(long j) {
            return C3003r.this.mo19501Q(this.f5258e, j);
        }
    }

    public C3003r(Uri uri, C3122h hVar, C2674g[] gVarArr, C3135r rVar, C3017v.C3018a aVar, C3006c cVar, C3117d dVar, @Nullable String str, int i) {
        this.f5223e = uri;
        this.f5224l = hVar;
        this.f5225m = rVar;
        this.f5226n = aVar;
        this.f5227o = cVar;
        this.f5228p = dVar;
        this.f5229q = str;
        this.f5230r = (long) i;
        this.f5232t = new C3005b(gVarArr);
        this.f5233u = new C3157i();
        this.f5234v = new C2995k(this);
        this.f5235w = new C2863a(this);
        this.f5236x = new Handler();
        this.f5205B = new int[0];
        this.f5204A = new C3024x[0];
        this.f5218O = -9223372036854775807L;
        this.f5216M = -1;
        this.f5215L = -9223372036854775807L;
        this.f5210G = 1;
        aVar.mo19548z();
    }

    /* renamed from: A */
    public final int mo19485A() {
        int i = 0;
        for (C3024x t : this.f5204A) {
            i += t.mo19601t();
        }
        return i;
    }

    /* renamed from: B */
    public final long mo19486B() {
        long j = Long.MIN_VALUE;
        for (C3024x q : this.f5204A) {
            j = Math.max(j, q.mo19598q());
        }
        return j;
    }

    /* renamed from: C */
    public final C3007d mo19487C() {
        C3007d dVar = this.f5208E;
        C3151e.m7757e(dVar);
        return dVar;
    }

    /* renamed from: D */
    public final boolean mo19488D() {
        return this.f5218O != -9223372036854775807L;
    }

    /* renamed from: E */
    public boolean mo19489E(int i) {
        return !mo19503S() && (this.f5221R || this.f5204A[i].mo19602u());
    }

    /* renamed from: F */
    public /* synthetic */ void mo19490F() {
        if (!this.f5222S) {
            C3012t.C3013a aVar = this.f5237y;
            C3151e.m7757e(aVar);
            aVar.mo18995i(this);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, boolean], vars: [r6v0 ?, r6v1 ?, r6v3 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:51)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    /* renamed from: G */
    public final void mo19491G() {
        /*
            r11 = this;
            c.q.a.b.f0.o r0 = r11.f5238z
            boolean r1 = r11.f5222S
            if (r1 != 0) goto L_0x00a5
            boolean r1 = r11.f5207D
            if (r1 != 0) goto L_0x00a5
            boolean r1 = r11.f5206C
            if (r1 == 0) goto L_0x00a5
            if (r0 != 0) goto L_0x0012
            goto L_0x00a5
        L_0x0012:
            c.q.a.b.k0.x[] r1 = r11.f5204A
            int r2 = r1.length
            r3 = 0
            r4 = r3
        L_0x0017:
            if (r4 >= r2) goto L_0x0025
            r5 = r1[r4]
            com.google.android.exoplayer2.Format r5 = r5.mo19600s()
            if (r5 != 0) goto L_0x0022
            return
        L_0x0022:
            int r4 = r4 + 1
            goto L_0x0017
        L_0x0025:
            c.q.a.b.o0.i r1 = r11.f5233u
            r1.mo19957b()
            c.q.a.b.k0.x[] r1 = r11.f5204A
            int r1 = r1.length
            com.google.android.exoplayer2.source.TrackGroup[] r2 = new com.google.android.exoplayer2.source.TrackGroup[r1]
            boolean[] r4 = new boolean[r1]
            long r5 = r0.mo18505i()
            r11.f5215L = r5
            r5 = r3
        L_0x0038:
            r6 = 1
            if (r5 >= r1) goto L_0x0068
            c.q.a.b.k0.x[] r7 = r11.f5204A
            r7 = r7[r5]
            com.google.android.exoplayer2.Format r7 = r7.mo19600s()
            com.google.android.exoplayer2.source.TrackGroup r8 = new com.google.android.exoplayer2.source.TrackGroup
            com.google.android.exoplayer2.Format[] r9 = new com.google.android.exoplayer2.Format[r6]
            r9[r3] = r7
            r8.<init>((com.google.android.exoplayer2.Format[]) r9)
            r2[r5] = r8
            java.lang.String r7 = r7.f7566q
            boolean r8 = p040c.p200q.p201a.p219b.p261o0.C3166p.m7901m(r7)
            if (r8 != 0) goto L_0x005e
            boolean r7 = p040c.p200q.p201a.p219b.p261o0.C3166p.m7899k(r7)
            if (r7 == 0) goto L_0x005d
            goto L_0x005e
        L_0x005d:
            r6 = r3
        L_0x005e:
            r4[r5] = r6
            boolean r7 = r11.f5209F
            r6 = r6 | r7
            r11.f5209F = r6
            int r5 = r5 + 1
            goto L_0x0038
        L_0x0068:
            long r7 = r11.f5216M
            r9 = -1
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 != 0) goto L_0x007f
            long r7 = r0.mo18505i()
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 != 0) goto L_0x007f
            r1 = 7
            goto L_0x0080
        L_0x007f:
            r1 = r6
        L_0x0080:
            r11.f5210G = r1
            c.q.a.b.k0.r$d r1 = new c.q.a.b.k0.r$d
            com.google.android.exoplayer2.source.TrackGroupArray r3 = new com.google.android.exoplayer2.source.TrackGroupArray
            r3.<init>((com.google.android.exoplayer2.source.TrackGroup[]) r2)
            r1.<init>(r0, r3, r4)
            r11.f5208E = r1
            r11.f5207D = r6
            c.q.a.b.k0.r$c r1 = r11.f5227o
            long r2 = r11.f5215L
            boolean r0 = r0.mo18503d()
            r1.mo19509f(r2, r0)
            c.q.a.b.k0.t$a r0 = r11.f5237y
            p040c.p200q.p201a.p219b.p261o0.C3151e.m7757e(r0)
            c.q.a.b.k0.t$a r0 = (p040c.p200q.p201a.p219b.p241k0.C3012t.C3013a) r0
            r0.mo19001l(r11)
        L_0x00a5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p241k0.C3003r.mo19491G():void");
    }

    /* renamed from: H */
    public final void mo19492H(int i) {
        C3007d C = mo19487C();
        boolean[] zArr = C.f5257e;
        if (!zArr[i]) {
            Format a = C.f5254b.mo24210a(i).mo24200a(0);
            this.f5226n.mo19525c(C3166p.m7895g(a.f7566q), a, 0, (Object) null, this.f5217N);
            zArr[i] = true;
        }
    }

    /* renamed from: I */
    public final void mo19493I(int i) {
        boolean[] zArr = mo19487C().f5255c;
        if (this.f5219P && zArr[i] && !this.f5204A[i].mo19602u()) {
            this.f5218O = 0;
            this.f5219P = false;
            this.f5212I = true;
            this.f5217N = 0;
            this.f5220Q = 0;
            for (C3024x D : this.f5204A) {
                D.mo19579D();
            }
            C3012t.C3013a aVar = this.f5237y;
            C3151e.m7757e(aVar);
            aVar.mo18995i(this);
        }
    }

    /* renamed from: J */
    public void mo19494J() {
        this.f5231s.mo24273i(this.f5225m.mo19924c(this.f5210G));
    }

    /* renamed from: K */
    public void mo19106k(C3004a aVar, long j, long j2, boolean z) {
        this.f5226n.mo19537o(aVar.f5248j, aVar.f5240b.mo19930g(), aVar.f5240b.mo19931h(), 1, -1, (Format) null, 0, (Object) null, aVar.f5247i, this.f5215L, j, j2, aVar.f5240b.mo19929f());
        if (!z) {
            mo19505z(aVar);
            for (C3024x D : this.f5204A) {
                D.mo19579D();
            }
            if (this.f5214K > 0) {
                C3012t.C3013a aVar2 = this.f5237y;
                C3151e.m7757e(aVar2);
                aVar2.mo18995i(this);
            }
        }
    }

    /* renamed from: L */
    public void mo19107l(C3004a aVar, long j, long j2) {
        if (this.f5215L == -9223372036854775807L) {
            C2682o oVar = this.f5238z;
            C3151e.m7757e(oVar);
            C2682o oVar2 = oVar;
            long B = mo19486B();
            long j3 = B == Long.MIN_VALUE ? 0 : B + 10000;
            this.f5215L = j3;
            this.f5227o.mo19509f(j3, oVar2.mo18503d());
        }
        this.f5226n.mo19540r(aVar.f5248j, aVar.f5240b.mo19930g(), aVar.f5240b.mo19931h(), 1, -1, (Format) null, 0, (Object) null, aVar.f5247i, this.f5215L, j, j2, aVar.f5240b.mo19929f());
        mo19505z(aVar);
        this.f5221R = true;
        C3012t.C3013a aVar2 = this.f5237y;
        C3151e.m7757e(aVar2);
        aVar2.mo18995i(this);
    }

    /* renamed from: M */
    public Loader.C4058c mo19109s(C3004a aVar, long j, long j2, IOException iOException, int i) {
        Loader.C4058c cVar;
        C3004a aVar2;
        boolean z;
        mo19505z(aVar);
        long a = this.f5225m.mo19922a(this.f5210G, this.f5215L, iOException, i);
        if (a == -9223372036854775807L) {
            cVar = Loader.f7922f;
            C3004a aVar3 = aVar;
        } else {
            int A = mo19485A();
            if (A > this.f5220Q) {
                aVar2 = aVar;
                z = true;
            } else {
                z = false;
                aVar2 = aVar;
            }
            cVar = mo19504y(aVar2, A) ? Loader.m10672g(z, a) : Loader.f7921e;
        }
        this.f5226n.mo19543u(aVar.f5248j, aVar.f5240b.mo19930g(), aVar.f5240b.mo19931h(), 1, -1, (Format) null, 0, (Object) null, aVar.f5247i, this.f5215L, j, j2, aVar.f5240b.mo19929f(), iOException, !cVar.mo24277c());
        return cVar;
    }

    /* renamed from: N */
    public int mo19498N(int i, C3030l lVar, C2634e eVar, boolean z) {
        if (mo19503S()) {
            return -3;
        }
        mo19492H(i);
        int z2 = this.f5204A[i].mo19607z(lVar, eVar, z, this.f5221R, this.f5217N);
        if (z2 == -3) {
            mo19493I(i);
        }
        return z2;
    }

    /* renamed from: O */
    public void mo19499O() {
        if (this.f5207D) {
            for (C3024x k : this.f5204A) {
                k.mo19593k();
            }
        }
        this.f5231s.mo24275k(this);
        this.f5236x.removeCallbacksAndMessages((Object) null);
        this.f5237y = null;
        this.f5222S = true;
        this.f5226n.mo19516A();
    }

    /* renamed from: P */
    public final boolean mo19500P(boolean[] zArr, long j) {
        int length = this.f5204A.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= length) {
                return true;
            }
            C3024x xVar = this.f5204A[i];
            xVar.mo19581F();
            if (xVar.mo19588f(j, true, false) == -1) {
                z = false;
            }
            if (z || (!zArr[i] && this.f5209F)) {
                i++;
            }
        }
        return false;
    }

    /* renamed from: Q */
    public int mo19501Q(int i, long j) {
        int i2 = 0;
        if (mo19503S()) {
            return 0;
        }
        mo19492H(i);
        C3024x xVar = this.f5204A[i];
        if (!this.f5221R || j <= xVar.mo19598q()) {
            int f = xVar.mo19588f(j, true, true);
            if (f != -1) {
                i2 = f;
            }
        } else {
            i2 = xVar.mo19589g();
        }
        if (i2 == 0) {
            mo19493I(i);
        }
        return i2;
    }

    /* renamed from: R */
    public final void mo19502R() {
        C3004a aVar = new C3004a(this.f5223e, this.f5224l, this.f5232t, this, this.f5233u);
        if (this.f5207D) {
            C2682o oVar = mo19487C().f5253a;
            C3151e.m7759g(mo19488D());
            long j = this.f5215L;
            if (j == -9223372036854775807L || this.f5218O < j) {
                aVar.mo19506g(oVar.mo18504h(this.f5218O).f3444a.f3450b, this.f5218O);
                this.f5218O = -9223372036854775807L;
            } else {
                this.f5221R = true;
                this.f5218O = -9223372036854775807L;
                return;
            }
        }
        this.f5220Q = mo19485A();
        this.f5226n.mo19546x(aVar.f5248j, 1, -1, (Format) null, 0, (Object) null, aVar.f5247i, this.f5215L, this.f5231s.mo24276l(aVar, this, this.f5225m.mo19924c(this.f5210G)));
    }

    /* renamed from: S */
    public final boolean mo19503S() {
        return this.f5212I || mo19488D();
    }

    /* renamed from: a */
    public C2686q mo18552a(int i, int i2) {
        int length = this.f5204A.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (this.f5205B[i3] == i) {
                return this.f5204A[i3];
            }
        }
        C3024x xVar = new C3024x(this.f5228p);
        xVar.mo19584I(this);
        int i4 = length + 1;
        int[] copyOf = Arrays.copyOf(this.f5205B, i4);
        this.f5205B = copyOf;
        copyOf[length] = i;
        C3024x[] xVarArr = (C3024x[]) Arrays.copyOf(this.f5204A, i4);
        xVarArr[length] = xVar;
        C3152e0.m7799g(xVarArr);
        this.f5204A = xVarArr;
        return xVar;
    }

    /* renamed from: b */
    public long mo19098b() {
        if (this.f5214K == 0) {
            return Long.MIN_VALUE;
        }
        return mo19102f();
    }

    /* renamed from: c */
    public void mo18553c(C2682o oVar) {
        this.f5238z = oVar;
        this.f5236x.post(this.f5234v);
    }

    /* renamed from: d */
    public boolean mo19100d(long j) {
        if (this.f5221R || this.f5219P) {
            return false;
        }
        if (this.f5207D && this.f5214K == 0) {
            return false;
        }
        boolean c = this.f5233u.mo19958c();
        if (this.f5231s.mo24272h()) {
            return c;
        }
        mo19502R();
        return true;
    }

    /* renamed from: e */
    public long mo19139e(long j, C3216y yVar) {
        C2682o oVar = mo19487C().f5253a;
        if (!oVar.mo18503d()) {
            return 0;
        }
        C2682o.C2683a h = oVar.mo18504h(j);
        return C3152e0.m7790b0(j, yVar, h.f3444a.f3449a, h.f3445b.f3449a);
    }

    /* renamed from: f */
    public long mo19102f() {
        long j;
        boolean[] zArr = mo19487C().f5255c;
        if (this.f5221R) {
            return Long.MIN_VALUE;
        }
        if (mo19488D()) {
            return this.f5218O;
        }
        if (this.f5209F) {
            int length = this.f5204A.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                if (zArr[i] && !this.f5204A[i].mo19603v()) {
                    j = Math.min(j, this.f5204A[i].mo19598q());
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = mo19486B();
        }
        return j == Long.MIN_VALUE ? this.f5217N : j;
    }

    /* renamed from: g */
    public void mo19103g(long j) {
    }

    /* renamed from: h */
    public void mo19104h() {
        for (C3024x D : this.f5204A) {
            D.mo19579D();
        }
        this.f5232t.mo19507a();
    }

    /* renamed from: i */
    public void mo19384i(Format format) {
        this.f5236x.post(this.f5234v);
    }

    /* renamed from: j */
    public long mo19140j(C3107e[] eVarArr, boolean[] zArr, C3027y[] yVarArr, boolean[] zArr2, long j) {
        C3007d C = mo19487C();
        TrackGroupArray trackGroupArray = C.f5254b;
        boolean[] zArr3 = C.f5256d;
        int i = this.f5214K;
        int i2 = 0;
        for (int i3 = 0; i3 < eVarArr.length; i3++) {
            if (yVarArr[i3] != null && (eVarArr[i3] == null || !zArr[i3])) {
                int b = yVarArr[i3].f5258e;
                C3151e.m7759g(zArr3[b]);
                this.f5214K--;
                zArr3[b] = false;
                yVarArr[i3] = null;
            }
        }
        boolean z = !this.f5211H ? j != 0 : i == 0;
        for (int i4 = 0; i4 < eVarArr.length; i4++) {
            if (yVarArr[i4] == null && eVarArr[i4] != null) {
                C3107e eVar = eVarArr[i4];
                C3151e.m7759g(eVar.length() == 1);
                C3151e.m7759g(eVar.mo19825g(0) == 0);
                int b2 = trackGroupArray.mo24211b(eVar.mo19820a());
                C3151e.m7759g(!zArr3[b2]);
                this.f5214K++;
                zArr3[b2] = true;
                yVarArr[i4] = new C3008e(b2);
                zArr2[i4] = true;
                if (!z) {
                    C3024x xVar = this.f5204A[b2];
                    xVar.mo19581F();
                    z = xVar.mo19588f(j, true, true) == -1 && xVar.mo19599r() != 0;
                }
            }
        }
        if (this.f5214K == 0) {
            this.f5219P = false;
            this.f5212I = false;
            if (this.f5231s.mo24272h()) {
                C3024x[] xVarArr = this.f5204A;
                int length = xVarArr.length;
                while (i2 < length) {
                    xVarArr[i2].mo19593k();
                    i2++;
                }
                this.f5231s.mo24271f();
            } else {
                C3024x[] xVarArr2 = this.f5204A;
                int length2 = xVarArr2.length;
                while (i2 < length2) {
                    xVarArr2[i2].mo19579D();
                    i2++;
                }
            }
        } else if (z) {
            j = mo19142n(j);
            while (i2 < yVarArr.length) {
                if (yVarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.f5211H = true;
        return j;
    }

    /* renamed from: m */
    public void mo19141m() {
        mo19494J();
    }

    /* renamed from: n */
    public long mo19142n(long j) {
        C3007d C = mo19487C();
        C2682o oVar = C.f5253a;
        boolean[] zArr = C.f5255c;
        if (!oVar.mo18503d()) {
            j = 0;
        }
        this.f5212I = false;
        this.f5217N = j;
        if (mo19488D()) {
            this.f5218O = j;
            return j;
        } else if (this.f5210G != 7 && mo19500P(zArr, j)) {
            return j;
        } else {
            this.f5219P = false;
            this.f5218O = j;
            this.f5221R = false;
            if (this.f5231s.mo24272h()) {
                this.f5231s.mo24271f();
            } else {
                for (C3024x D : this.f5204A) {
                    D.mo19579D();
                }
            }
            return j;
        }
    }

    /* renamed from: o */
    public void mo18554o() {
        this.f5206C = true;
        this.f5236x.post(this.f5234v);
    }

    /* renamed from: p */
    public long mo19143p() {
        if (!this.f5213J) {
            this.f5226n.mo19518C();
            this.f5213J = true;
        }
        if (!this.f5212I) {
            return -9223372036854775807L;
        }
        if (!this.f5221R && mo19485A() <= this.f5220Q) {
            return -9223372036854775807L;
        }
        this.f5212I = false;
        return this.f5217N;
    }

    /* renamed from: q */
    public void mo19144q(C3012t.C3013a aVar, long j) {
        this.f5237y = aVar;
        this.f5233u.mo19958c();
        mo19502R();
    }

    /* renamed from: r */
    public TrackGroupArray mo19145r() {
        return mo19487C().f5254b;
    }

    /* renamed from: t */
    public void mo19147t(long j, boolean z) {
        if (!mo19488D()) {
            boolean[] zArr = mo19487C().f5256d;
            int length = this.f5204A.length;
            for (int i = 0; i < length; i++) {
                this.f5204A[i].mo19592j(j, z, zArr[i]);
            }
        }
    }

    /* renamed from: y */
    public final boolean mo19504y(C3004a aVar, int i) {
        C2682o oVar;
        if (this.f5216M == -1 && ((oVar = this.f5238z) == null || oVar.mo18505i() == -9223372036854775807L)) {
            if (!this.f5207D || mo19503S()) {
                this.f5212I = this.f5207D;
                this.f5217N = 0;
                this.f5220Q = 0;
                for (C3024x D : this.f5204A) {
                    D.mo19579D();
                }
                aVar.mo19506g(0, 0);
                return true;
            }
            this.f5219P = true;
            return false;
        }
        this.f5220Q = i;
        return true;
    }

    /* renamed from: z */
    public final void mo19505z(C3004a aVar) {
        if (this.f5216M == -1) {
            this.f5216M = aVar.f5249k;
        }
    }
}
