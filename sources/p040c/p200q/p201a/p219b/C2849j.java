package p040c.p200q.p201a.p219b;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.IllegalSeekPositionException;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import p040c.p200q.p201a.p219b.C2578a0;
import p040c.p200q.p201a.p219b.C2659f;
import p040c.p200q.p201a.p219b.C3209t;
import p040c.p200q.p201a.p219b.p241k0.C3012t;
import p040c.p200q.p201a.p219b.p241k0.C3014u;
import p040c.p200q.p201a.p219b.p241k0.C3027y;
import p040c.p200q.p201a.p219b.p259m0.C3107e;
import p040c.p200q.p201a.p219b.p259m0.C3110g;
import p040c.p200q.p201a.p219b.p259m0.C3112h;
import p040c.p200q.p201a.p219b.p260n0.C3118e;
import p040c.p200q.p201a.p219b.p261o0.C3148c0;
import p040c.p200q.p201a.p219b.p261o0.C3151e;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3153f;
import p040c.p200q.p201a.p219b.p261o0.C3162l;
import p040c.p200q.p201a.p219b.p261o0.C3163m;

/* renamed from: c.q.a.b.j */
/* compiled from: ExoPlayerImplInternal */
public final class C2849j implements Handler.Callback, C3012t.C3013a, C3110g.C3111a, C3014u.C3016b, C2659f.C2660a, C3209t.C3210a {

    /* renamed from: A */
    public final C3153f f4460A;

    /* renamed from: B */
    public final C3182p f4461B = new C3182p();

    /* renamed from: C */
    public C3216y f4462C;

    /* renamed from: D */
    public C3205q f4463D;

    /* renamed from: E */
    public C3014u f4464E;

    /* renamed from: F */
    public C3212u[] f4465F;

    /* renamed from: G */
    public boolean f4466G;

    /* renamed from: H */
    public boolean f4467H;

    /* renamed from: I */
    public boolean f4468I;

    /* renamed from: J */
    public int f4469J;

    /* renamed from: K */
    public boolean f4470K;

    /* renamed from: L */
    public int f4471L;

    /* renamed from: M */
    public C2854e f4472M;

    /* renamed from: N */
    public long f4473N;

    /* renamed from: O */
    public int f4474O;

    /* renamed from: e */
    public final C3212u[] f4475e;

    /* renamed from: l */
    public final C3213v[] f4476l;

    /* renamed from: m */
    public final C3110g f4477m;

    /* renamed from: n */
    public final C3112h f4478n;

    /* renamed from: o */
    public final C3098m f4479o;

    /* renamed from: p */
    public final C3118e f4480p;

    /* renamed from: q */
    public final C3162l f4481q;

    /* renamed from: r */
    public final HandlerThread f4482r;

    /* renamed from: s */
    public final Handler f4483s;

    /* renamed from: t */
    public final C2578a0.C2581c f4484t;

    /* renamed from: u */
    public final C2578a0.C2580b f4485u;

    /* renamed from: v */
    public final long f4486v;

    /* renamed from: w */
    public final boolean f4487w;

    /* renamed from: x */
    public final C2659f f4488x;

    /* renamed from: y */
    public final C2853d f4489y;

    /* renamed from: z */
    public final ArrayList<C2852c> f4490z;

    /* renamed from: c.q.a.b.j$b */
    /* compiled from: ExoPlayerImplInternal */
    public static final class C2851b {

        /* renamed from: a */
        public final C3014u f4491a;

        /* renamed from: b */
        public final C2578a0 f4492b;

        /* renamed from: c */
        public final Object f4493c;

        public C2851b(C3014u uVar, C2578a0 a0Var, Object obj) {
            this.f4491a = uVar;
            this.f4492b = a0Var;
            this.f4493c = obj;
        }
    }

    /* renamed from: c.q.a.b.j$c */
    /* compiled from: ExoPlayerImplInternal */
    public static final class C2852c implements Comparable<C2852c> {

        /* renamed from: e */
        public final C3209t f4494e;

        /* renamed from: l */
        public int f4495l;

        /* renamed from: m */
        public long f4496m;
        @Nullable

        /* renamed from: n */
        public Object f4497n;

        public C2852c(C3209t tVar) {
            this.f4494e = tVar;
        }

        /* renamed from: c */
        public int compareTo(@NonNull C2852c cVar) {
            if ((this.f4497n == null) != (cVar.f4497n == null)) {
                if (this.f4497n != null) {
                    return -1;
                }
                return 1;
            } else if (this.f4497n == null) {
                return 0;
            } else {
                int i = this.f4495l - cVar.f4495l;
                if (i != 0) {
                    return i;
                }
                return C3152e0.m7809l(this.f4496m, cVar.f4496m);
            }
        }

        /* renamed from: d */
        public void mo19027d(int i, long j, Object obj) {
            this.f4495l = i;
            this.f4496m = j;
            this.f4497n = obj;
        }
    }

    /* renamed from: c.q.a.b.j$d */
    /* compiled from: ExoPlayerImplInternal */
    public static final class C2853d {

        /* renamed from: a */
        public C3205q f4498a;

        /* renamed from: b */
        public int f4499b;

        /* renamed from: c */
        public boolean f4500c;

        /* renamed from: d */
        public int f4501d;

        public C2853d() {
        }

        /* renamed from: d */
        public boolean mo19028d(C3205q qVar) {
            return qVar != this.f4498a || this.f4499b > 0 || this.f4500c;
        }

        /* renamed from: e */
        public void mo19029e(int i) {
            this.f4499b += i;
        }

        /* renamed from: f */
        public void mo19030f(C3205q qVar) {
            this.f4498a = qVar;
            this.f4499b = 0;
            this.f4500c = false;
        }

        /* renamed from: g */
        public void mo19031g(int i) {
            boolean z = true;
            if (!this.f4500c || this.f4501d == 4) {
                this.f4500c = true;
                this.f4501d = i;
                return;
            }
            if (i != 4) {
                z = false;
            }
            C3151e.m7753a(z);
        }
    }

    /* renamed from: c.q.a.b.j$e */
    /* compiled from: ExoPlayerImplInternal */
    public static final class C2854e {

        /* renamed from: a */
        public final C2578a0 f4502a;

        /* renamed from: b */
        public final int f4503b;

        /* renamed from: c */
        public final long f4504c;

        public C2854e(C2578a0 a0Var, int i, long j) {
            this.f4502a = a0Var;
            this.f4503b = i;
            this.f4504c = j;
        }
    }

    public C2849j(C3212u[] uVarArr, C3110g gVar, C3112h hVar, C3098m mVar, C3118e eVar, boolean z, int i, boolean z2, Handler handler, C3153f fVar) {
        this.f4475e = uVarArr;
        this.f4477m = gVar;
        this.f4478n = hVar;
        this.f4479o = mVar;
        this.f4480p = eVar;
        this.f4467H = z;
        this.f4469J = i;
        this.f4470K = z2;
        this.f4483s = handler;
        this.f4460A = fVar;
        this.f4486v = mVar.mo18429c();
        this.f4487w = mVar.mo18428b();
        this.f4462C = C3216y.f6049d;
        this.f4463D = C3205q.m8147g(-9223372036854775807L, hVar);
        this.f4489y = new C2853d();
        this.f4476l = new C3213v[uVarArr.length];
        for (int i2 = 0; i2 < uVarArr.length; i2++) {
            uVarArr[i2].setIndex(i2);
            this.f4476l[i2] = uVarArr[i2].mo18208l();
        }
        this.f4488x = new C2659f(this, fVar);
        this.f4490z = new ArrayList<>();
        this.f4465F = new C3212u[0];
        this.f4484t = new C2578a0.C2581c();
        this.f4485u = new C2578a0.C2580b();
        gVar.mo19847b(this, eVar);
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.f4482r = handlerThread;
        handlerThread.start();
        this.f4481q = fVar.mo19955d(this.f4482r.getLooper(), this);
    }

    /* renamed from: n */
    public static Format[] m6133n(C3107e eVar) {
        int length = eVar != null ? eVar.length() : 0;
        Format[] formatArr = new Format[length];
        for (int i = 0; i < length; i++) {
            formatArr[i] = eVar.mo19823e(i);
        }
        return formatArr;
    }

    /* renamed from: A */
    public final void mo18955A() {
        C3113n i = this.f4461B.mo20066i();
        long i2 = i.mo19859i();
        if (i2 == Long.MIN_VALUE) {
            mo18984c0(false);
            return;
        }
        boolean e = this.f4479o.mo18431e(mo19012r(i2), this.f4488x.mo18333f().f6029a);
        mo18984c0(e);
        if (e) {
            i.mo19854d(this.f4473N);
        }
    }

    /* renamed from: B */
    public final void mo18956B() {
        if (this.f4489y.mo19028d(this.f4463D)) {
            this.f4483s.obtainMessage(0, this.f4489y.f4499b, this.f4489y.f4500c ? this.f4489y.f4501d : -1, this.f4463D).sendToTarget();
            this.f4489y.mo19030f(this.f4463D);
        }
    }

    /* renamed from: C */
    public final void mo18957C() {
        C3113n i = this.f4461B.mo20066i();
        C3113n o = this.f4461B.mo20072o();
        if (i != null && !i.f5690e) {
            if (o == null || o.f5693h == i) {
                C3212u[] uVarArr = this.f4465F;
                int length = uVarArr.length;
                int i2 = 0;
                while (i2 < length) {
                    if (uVarArr[i2].mo18205i()) {
                        i2++;
                    } else {
                        return;
                    }
                }
                i.f5686a.mo19141m();
            }
        }
    }

    /* renamed from: D */
    public final void mo18958D() {
        if (this.f4461B.mo20066i() != null) {
            C3212u[] uVarArr = this.f4465F;
            int length = uVarArr.length;
            int i = 0;
            while (i < length) {
                if (uVarArr[i].mo18205i()) {
                    i++;
                } else {
                    return;
                }
            }
        }
        this.f4464E.mo19163h();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0093 A[LOOP:1: B:24:0x0073->B:34:0x0093, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x005d A[EDGE_INSN: B:57:0x005d->B:20:0x005d ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0072 A[EDGE_INSN: B:59:0x0072->B:23:0x0072 ?: BREAK  , SYNTHETIC] */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18959E(long r7, long r9) {
        /*
            r6 = this;
            java.util.ArrayList<c.q.a.b.j$c> r0 = r6.f4490z
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00ed
            c.q.a.b.q r0 = r6.f4463D
            c.q.a.b.k0.u$a r0 = r0.f6017c
            boolean r0 = r0.mo19513a()
            if (r0 == 0) goto L_0x0014
            goto L_0x00ed
        L_0x0014:
            c.q.a.b.q r0 = r6.f4463D
            long r0 = r0.f6018d
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x001f
            r0 = 1
            long r7 = r7 - r0
        L_0x001f:
            c.q.a.b.q r0 = r6.f4463D
            c.q.a.b.a0 r1 = r0.f6015a
            c.q.a.b.k0.u$a r0 = r0.f6017c
            java.lang.Object r0 = r0.f5277a
            int r0 = r1.mo18047b(r0)
            int r1 = r6.f4474O
            r2 = 0
            if (r1 <= 0) goto L_0x003b
            java.util.ArrayList<c.q.a.b.j$c> r3 = r6.f4490z
            int r1 = r1 + -1
            java.lang.Object r1 = r3.get(r1)
            c.q.a.b.j$c r1 = (p040c.p200q.p201a.p219b.C2849j.C2852c) r1
            goto L_0x003c
        L_0x003b:
            r1 = r2
        L_0x003c:
            if (r1 == 0) goto L_0x005d
            int r3 = r1.f4495l
            if (r3 > r0) goto L_0x004a
            if (r3 != r0) goto L_0x005d
            long r3 = r1.f4496m
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 <= 0) goto L_0x005d
        L_0x004a:
            int r1 = r6.f4474O
            int r1 = r1 + -1
            r6.f4474O = r1
            if (r1 <= 0) goto L_0x003b
            java.util.ArrayList<c.q.a.b.j$c> r3 = r6.f4490z
            int r1 = r1 + -1
            java.lang.Object r1 = r3.get(r1)
            c.q.a.b.j$c r1 = (p040c.p200q.p201a.p219b.C2849j.C2852c) r1
            goto L_0x003c
        L_0x005d:
            int r1 = r6.f4474O
            java.util.ArrayList<c.q.a.b.j$c> r3 = r6.f4490z
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x0072
            java.util.ArrayList<c.q.a.b.j$c> r1 = r6.f4490z
            int r3 = r6.f4474O
            java.lang.Object r1 = r1.get(r3)
            c.q.a.b.j$c r1 = (p040c.p200q.p201a.p219b.C2849j.C2852c) r1
            goto L_0x0073
        L_0x0072:
            r1 = r2
        L_0x0073:
            if (r1 == 0) goto L_0x009e
            java.lang.Object r3 = r1.f4497n
            if (r3 == 0) goto L_0x009e
            int r3 = r1.f4495l
            if (r3 < r0) goto L_0x0085
            if (r3 != r0) goto L_0x009e
            long r3 = r1.f4496m
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 > 0) goto L_0x009e
        L_0x0085:
            int r1 = r6.f4474O
            int r1 = r1 + 1
            r6.f4474O = r1
            java.util.ArrayList<c.q.a.b.j$c> r3 = r6.f4490z
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x0072
            java.util.ArrayList<c.q.a.b.j$c> r1 = r6.f4490z
            int r3 = r6.f4474O
            java.lang.Object r1 = r1.get(r3)
            c.q.a.b.j$c r1 = (p040c.p200q.p201a.p219b.C2849j.C2852c) r1
            goto L_0x0073
        L_0x009e:
            if (r1 == 0) goto L_0x00ed
            java.lang.Object r3 = r1.f4497n
            if (r3 == 0) goto L_0x00ed
            int r3 = r1.f4495l
            if (r3 != r0) goto L_0x00ed
            long r3 = r1.f4496m
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x00ed
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 > 0) goto L_0x00ed
            c.q.a.b.t r3 = r1.f4494e
            r6.mo18981a0(r3)
            c.q.a.b.t r3 = r1.f4494e
            boolean r3 = r3.mo20170b()
            if (r3 != 0) goto L_0x00cf
            c.q.a.b.t r1 = r1.f4494e
            boolean r1 = r1.mo20178j()
            if (r1 == 0) goto L_0x00c8
            goto L_0x00cf
        L_0x00c8:
            int r1 = r6.f4474O
            int r1 = r1 + 1
            r6.f4474O = r1
            goto L_0x00d6
        L_0x00cf:
            java.util.ArrayList<c.q.a.b.j$c> r1 = r6.f4490z
            int r3 = r6.f4474O
            r1.remove(r3)
        L_0x00d6:
            int r1 = r6.f4474O
            java.util.ArrayList<c.q.a.b.j$c> r3 = r6.f4490z
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x00eb
            java.util.ArrayList<c.q.a.b.j$c> r1 = r6.f4490z
            int r3 = r6.f4474O
            java.lang.Object r1 = r1.get(r3)
            c.q.a.b.j$c r1 = (p040c.p200q.p201a.p219b.C2849j.C2852c) r1
            goto L_0x009e
        L_0x00eb:
            r1 = r2
            goto L_0x009e
        L_0x00ed:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.C2849j.mo18959E(long, long):void");
    }

    /* renamed from: F */
    public final void mo18960F() {
        this.f4461B.mo20078u(this.f4473N);
        if (this.f4461B.mo20053A()) {
            C3142o m = this.f4461B.mo20070m(this.f4473N, this.f4463D);
            if (m == null) {
                mo18958D();
                return;
            }
            this.f4461B.mo20062e(this.f4476l, this.f4477m, this.f4479o.mo18434h(), this.f4464E, m).mo19144q(this, m.f5802b);
            mo18984c0(true);
            mo19016t(false);
        }
    }

    /* renamed from: G */
    public void mo18995i(C3012t tVar) {
        this.f4481q.mo19972f(10, tVar).sendToTarget();
    }

    /* renamed from: H */
    public void mo18962H(C3014u uVar, boolean z, boolean z2) {
        this.f4481q.mo19969c(0, z ? 1 : 0, z2 ? 1 : 0, uVar).sendToTarget();
    }

    /* renamed from: I */
    public final void mo18963I(C3014u uVar, boolean z, boolean z2) {
        this.f4471L++;
        mo18968N(true, z, z2);
        this.f4479o.mo18427a();
        this.f4464E = uVar;
        mo19000k0(2);
        uVar.mo19473b(this, this.f4480p.mo19876c());
        this.f4481q.mo19968b(2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0022, code lost:
        return;
     */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo18964J() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f4466G     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            c.q.a.b.o0.l r0 = r2.f4481q     // Catch:{ all -> 0x0023 }
            r1 = 7
            r0.mo19968b(r1)     // Catch:{ all -> 0x0023 }
            r0 = 0
        L_0x000e:
            boolean r1 = r2.f4466G     // Catch:{ all -> 0x0023 }
            if (r1 != 0) goto L_0x0018
            r2.wait()     // Catch:{ InterruptedException -> 0x0016 }
            goto L_0x000e
        L_0x0016:
            r0 = 1
            goto L_0x000e
        L_0x0018:
            if (r0 == 0) goto L_0x0021
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0023 }
            r0.interrupt()     // Catch:{ all -> 0x0023 }
        L_0x0021:
            monitor-exit(r2)
            return
        L_0x0023:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.C2849j.mo18964J():void");
    }

    /* renamed from: K */
    public final void mo18965K() {
        mo18968N(true, true, true);
        this.f4479o.mo18433g();
        mo19000k0(1);
        this.f4482r.quit();
        synchronized (this) {
            this.f4466G = true;
            notifyAll();
        }
    }

    /* renamed from: L */
    public final boolean mo18966L(C3212u uVar) {
        C3113n nVar = this.f4461B.mo20072o().f5693h;
        return nVar != null && nVar.f5690e && uVar.mo18205i();
    }

    /* renamed from: M */
    public final void mo18967M() {
        if (this.f4461B.mo20074q()) {
            float f = this.f4488x.mo18333f().f6029a;
            C3113n n = this.f4461B.mo20071n();
            C3113n o = this.f4461B.mo20072o();
            boolean z = true;
            while (n != null && n.f5690e) {
                if (n.mo19866p(f)) {
                    if (z) {
                        C3113n n2 = this.f4461B.mo20071n();
                        boolean v = this.f4461B.mo20079v(n2);
                        boolean[] zArr = new boolean[this.f4475e.length];
                        long b = n2.mo19852b(this.f4463D.f6027m, v, zArr);
                        C3205q qVar = this.f4463D;
                        if (!(qVar.f6020f == 4 || b == qVar.f6027m)) {
                            C3205q qVar2 = this.f4463D;
                            this.f4463D = qVar2.mo20160c(qVar2.f6017c, b, qVar2.f6019e, mo19010q());
                            this.f4489y.mo19031g(4);
                            mo18969O(b);
                        }
                        boolean[] zArr2 = new boolean[this.f4475e.length];
                        int i = 0;
                        int i2 = 0;
                        while (true) {
                            C3212u[] uVarArr = this.f4475e;
                            if (i >= uVarArr.length) {
                                break;
                            }
                            C3212u uVar = uVarArr[i];
                            zArr2[i] = uVar.getState() != 0;
                            C3027y yVar = n2.f5688c[i];
                            if (yVar != null) {
                                i2++;
                            }
                            if (zArr2[i]) {
                                if (yVar != uVar.mo18202e()) {
                                    mo18989f(uVar);
                                } else if (zArr[i]) {
                                    uVar.mo18212s(this.f4473N);
                                }
                            }
                            i++;
                        }
                        this.f4463D = this.f4463D.mo20163f(n2.f5694i, n2.f5695j);
                        mo18999k(zArr2, i2);
                    } else {
                        this.f4461B.mo20079v(n);
                        if (n.f5690e) {
                            n.mo19851a(Math.max(n.f5692g.f5802b, n.mo19867q(this.f4473N)), false);
                        }
                    }
                    mo19016t(true);
                    if (this.f4463D.f6020f != 4) {
                        mo18955A();
                        mo19015s0();
                        this.f4481q.mo19968b(2);
                        return;
                    }
                    return;
                }
                if (n == o) {
                    z = false;
                }
                n = n.f5693h;
            }
        }
    }

    /* renamed from: N */
    public final void mo18968N(boolean z, boolean z2, boolean z3) {
        long j;
        C3014u uVar;
        this.f4481q.mo19971e(2);
        this.f4468I = false;
        this.f4488x.mo18491i();
        this.f4473N = 0;
        for (C3212u f : this.f4465F) {
            try {
                mo18989f(f);
            } catch (ExoPlaybackException | RuntimeException e) {
                C3163m.m7878d("ExoPlayerImplInternal", "Stop failed.", e);
            }
        }
        this.f4465F = new C3212u[0];
        this.f4461B.mo20061d(!z2);
        mo18984c0(false);
        if (z2) {
            this.f4472M = null;
        }
        if (z3) {
            this.f4461B.mo20083z(C2578a0.f3043a);
            Iterator<C2852c> it = this.f4490z.iterator();
            while (it.hasNext()) {
                it.next().f4494e.mo20179k(false);
            }
            this.f4490z.clear();
            this.f4474O = 0;
        }
        C3014u.C3015a h = z2 ? this.f4463D.mo20164h(this.f4470K, this.f4484t) : this.f4463D.f6017c;
        long j2 = -9223372036854775807L;
        if (z2) {
            j = -9223372036854775807L;
        } else {
            j = this.f4463D.f6027m;
        }
        if (!z2) {
            j2 = this.f4463D.f6019e;
        }
        long j3 = j2;
        C2578a0 a0Var = z3 ? C2578a0.f3043a : this.f4463D.f6015a;
        Object obj = z3 ? null : this.f4463D.f6016b;
        C3205q qVar = this.f4463D;
        this.f4463D = new C3205q(a0Var, obj, h, j, j3, qVar.f6020f, false, z3 ? TrackGroupArray.f7829n : qVar.f6022h, z3 ? this.f4478n : this.f4463D.f6023i, h, j, 0, j);
        if (z && (uVar = this.f4464E) != null) {
            uVar.mo19476g(this);
            this.f4464E = null;
        }
    }

    /* renamed from: O */
    public final void mo18969O(long j) {
        if (this.f4461B.mo20074q()) {
            j = this.f4461B.mo20071n().mo19868r(j);
        }
        this.f4473N = j;
        this.f4488x.mo18489e(j);
        for (C3212u s : this.f4465F) {
            s.mo18212s(this.f4473N);
        }
    }

    /* renamed from: P */
    public final boolean mo18970P(C2852c cVar) {
        Object obj = cVar.f4497n;
        if (obj == null) {
            Pair<Object, Long> R = mo18972R(new C2854e(cVar.f4494e.mo20175g(), cVar.f4494e.mo20177i(), C2627d.m5057a(cVar.f4494e.mo20173e())), false);
            if (R == null) {
                return false;
            }
            cVar.mo19027d(this.f4463D.f6015a.mo18047b(R.first), ((Long) R.second).longValue(), R.first);
            return true;
        }
        int b = this.f4463D.f6015a.mo18047b(obj);
        if (b == -1) {
            return false;
        }
        cVar.f4495l = b;
        return true;
    }

    /* renamed from: Q */
    public final void mo18971Q() {
        for (int size = this.f4490z.size() - 1; size >= 0; size--) {
            if (!mo18970P(this.f4490z.get(size))) {
                this.f4490z.get(size).f4494e.mo20179k(false);
                this.f4490z.remove(size);
            }
        }
        Collections.sort(this.f4490z);
    }

    /* renamed from: R */
    public final Pair<Object, Long> mo18972R(C2854e eVar, boolean z) {
        int b;
        C2578a0 a0Var = this.f4463D.f6015a;
        C2578a0 a0Var2 = eVar.f4502a;
        if (a0Var.mo18062q()) {
            return null;
        }
        if (a0Var2.mo18062q()) {
            a0Var2 = a0Var;
        }
        try {
            Pair<Object, Long> j = a0Var2.mo18055j(this.f4484t, this.f4485u, eVar.f4503b, eVar.f4504c);
            if (a0Var == a0Var2 || (b = a0Var.mo18047b(j.first)) != -1) {
                return j;
            }
            if (!z || mo18973S(j.first, a0Var2, a0Var) == null) {
                return null;
            }
            return mo19006o(a0Var, a0Var.mo18051f(b, this.f4485u).f3046c, -9223372036854775807L);
        } catch (IndexOutOfBoundsException unused) {
            throw new IllegalSeekPositionException(a0Var, eVar.f4503b, eVar.f4504c);
        }
    }

    @Nullable
    /* renamed from: S */
    public final Object mo18973S(Object obj, C2578a0 a0Var, C2578a0 a0Var2) {
        int b = a0Var.mo18047b(obj);
        int i = a0Var.mo18054i();
        int i2 = b;
        int i3 = -1;
        for (int i4 = 0; i4 < i && i3 == -1; i4++) {
            i2 = a0Var.mo18049d(i2, this.f4485u, this.f4484t, this.f4469J, this.f4470K);
            if (i2 == -1) {
                break;
            }
            i3 = a0Var2.mo18047b(a0Var.mo18057l(i2));
        }
        if (i3 == -1) {
            return null;
        }
        return a0Var2.mo18057l(i3);
    }

    /* renamed from: T */
    public final void mo18974T(long j, long j2) {
        this.f4481q.mo19971e(2);
        this.f4481q.mo19970d(2, j + j2);
    }

    /* renamed from: U */
    public void mo18975U(C2578a0 a0Var, int i, long j) {
        this.f4481q.mo19972f(3, new C2854e(a0Var, i, j)).sendToTarget();
    }

    /* renamed from: V */
    public final void mo18976V(boolean z) {
        C3014u.C3015a aVar = this.f4461B.mo20071n().f5692g.f5801a;
        long Y = mo18979Y(aVar, this.f4463D.f6027m, true);
        if (Y != this.f4463D.f6027m) {
            C3205q qVar = this.f4463D;
            this.f4463D = qVar.mo20160c(aVar, Y, qVar.f6019e, mo19010q());
            if (z) {
                this.f4489y.mo19031g(4);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* renamed from: W */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18977W(p040c.p200q.p201a.p219b.C2849j.C2854e r23) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            c.q.a.b.j$d r2 = r1.f4489y
            r3 = 1
            r2.mo19029e(r3)
            android.util.Pair r2 = r1.mo18972R(r0, r3)
            r4 = 0
            r6 = 0
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 != 0) goto L_0x0028
            c.q.a.b.q r2 = r1.f4463D
            boolean r9 = r1.f4470K
            c.q.a.b.a0$c r10 = r1.f4484t
            c.q.a.b.k0.u$a r2 = r2.mo20164h(r9, r10)
            r15 = r2
            r2 = r3
            r12 = r7
            r18 = r12
            goto L_0x0056
        L_0x0028:
            java.lang.Object r9 = r2.first
            java.lang.Object r10 = r2.second
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            c.q.a.b.p r12 = r1.f4461B
            c.q.a.b.k0.u$a r9 = r12.mo20080w(r9, r10)
            boolean r12 = r9.mo19513a()
            if (r12 == 0) goto L_0x0044
            r2 = r3
            r12 = r4
        L_0x0040:
            r15 = r9
            r18 = r10
            goto L_0x0056
        L_0x0044:
            java.lang.Object r2 = r2.second
            java.lang.Long r2 = (java.lang.Long) r2
            long r12 = r2.longValue()
            long r14 = r0.f4504c
            int r2 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x0054
            r2 = r3
            goto L_0x0040
        L_0x0054:
            r2 = r6
            goto L_0x0040
        L_0x0056:
            r9 = 2
            c.q.a.b.k0.u r10 = r1.f4464E     // Catch:{ all -> 0x00dd }
            if (r10 == 0) goto L_0x00c5
            int r10 = r1.f4471L     // Catch:{ all -> 0x00dd }
            if (r10 <= 0) goto L_0x0060
            goto L_0x00c5
        L_0x0060:
            int r0 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x006c
            r0 = 4
            r1.mo19000k0(r0)     // Catch:{ all -> 0x00dd }
            r1.mo18968N(r6, r3, r6)     // Catch:{ all -> 0x00dd }
            goto L_0x00c7
        L_0x006c:
            c.q.a.b.q r0 = r1.f4463D     // Catch:{ all -> 0x00dd }
            c.q.a.b.k0.u$a r0 = r0.f6017c     // Catch:{ all -> 0x00dd }
            boolean r0 = r15.equals(r0)     // Catch:{ all -> 0x00dd }
            if (r0 == 0) goto L_0x00b6
            c.q.a.b.p r0 = r1.f4461B     // Catch:{ all -> 0x00dd }
            c.q.a.b.n r0 = r0.mo20071n()     // Catch:{ all -> 0x00dd }
            if (r0 == 0) goto L_0x008b
            int r4 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x008b
            c.q.a.b.k0.t r0 = r0.f5686a     // Catch:{ all -> 0x00dd }
            c.q.a.b.y r4 = r1.f4462C     // Catch:{ all -> 0x00dd }
            long r4 = r0.mo19139e(r12, r4)     // Catch:{ all -> 0x00dd }
            goto L_0x008c
        L_0x008b:
            r4 = r12
        L_0x008c:
            long r7 = p040c.p200q.p201a.p219b.C2627d.m5058b(r4)     // Catch:{ all -> 0x00dd }
            c.q.a.b.q r0 = r1.f4463D     // Catch:{ all -> 0x00dd }
            long r10 = r0.f6027m     // Catch:{ all -> 0x00dd }
            long r10 = p040c.p200q.p201a.p219b.C2627d.m5058b(r10)     // Catch:{ all -> 0x00dd }
            int r0 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x00b7
            c.q.a.b.q r0 = r1.f4463D     // Catch:{ all -> 0x00dd }
            long r3 = r0.f6027m     // Catch:{ all -> 0x00dd }
            c.q.a.b.q r14 = r1.f4463D
            long r20 = r22.mo19010q()
            r16 = r3
            c.q.a.b.q r0 = r14.mo20160c(r15, r16, r18, r20)
            r1.f4463D = r0
            if (r2 == 0) goto L_0x00b5
            c.q.a.b.j$d r0 = r1.f4489y
            r0.mo19031g(r9)
        L_0x00b5:
            return
        L_0x00b6:
            r4 = r12
        L_0x00b7:
            long r4 = r1.mo18978X(r15, r4)     // Catch:{ all -> 0x00dd }
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x00c0
            goto L_0x00c1
        L_0x00c0:
            r3 = r6
        L_0x00c1:
            r2 = r2 | r3
            r16 = r4
            goto L_0x00c9
        L_0x00c5:
            r1.f4472M = r0     // Catch:{ all -> 0x00dd }
        L_0x00c7:
            r16 = r12
        L_0x00c9:
            c.q.a.b.q r14 = r1.f4463D
            long r20 = r22.mo19010q()
            c.q.a.b.q r0 = r14.mo20160c(r15, r16, r18, r20)
            r1.f4463D = r0
            if (r2 == 0) goto L_0x00dc
            c.q.a.b.j$d r0 = r1.f4489y
            r0.mo19031g(r9)
        L_0x00dc:
            return
        L_0x00dd:
            r0 = move-exception
            c.q.a.b.q r14 = r1.f4463D
            long r20 = r22.mo19010q()
            r16 = r12
            c.q.a.b.q r3 = r14.mo20160c(r15, r16, r18, r20)
            r1.f4463D = r3
            if (r2 == 0) goto L_0x00f3
            c.q.a.b.j$d r2 = r1.f4489y
            r2.mo19031g(r9)
        L_0x00f3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.C2849j.mo18977W(c.q.a.b.j$e):void");
    }

    /* renamed from: X */
    public final long mo18978X(C3014u.C3015a aVar, long j) {
        return mo18979Y(aVar, j, this.f4461B.mo20071n() != this.f4461B.mo20072o());
    }

    /* renamed from: Y */
    public final long mo18979Y(C3014u.C3015a aVar, long j, boolean z) {
        mo19009p0();
        this.f4468I = false;
        mo19000k0(2);
        C3113n n = this.f4461B.mo20071n();
        C3113n nVar = n;
        while (true) {
            if (nVar != null) {
                if (aVar.equals(nVar.f5692g.f5801a) && nVar.f5690e) {
                    this.f4461B.mo20079v(nVar);
                    break;
                }
                nVar = this.f4461B.mo20058a();
            } else {
                break;
            }
        }
        if (n != nVar || z) {
            for (C3212u f : this.f4465F) {
                mo18989f(f);
            }
            this.f4465F = new C3212u[0];
            n = null;
        }
        if (nVar != null) {
            mo19017t0(n);
            if (nVar.f5691f) {
                long n2 = nVar.f5686a.mo19142n(j);
                nVar.f5686a.mo19147t(n2 - this.f4486v, this.f4487w);
                j = n2;
            }
            mo18969O(j);
            mo18955A();
        } else {
            this.f4461B.mo20061d(true);
            this.f4463D = this.f4463D.mo20163f(TrackGroupArray.f7829n, this.f4478n);
            mo18969O(j);
        }
        mo19016t(false);
        this.f4481q.mo19968b(2);
        return j;
    }

    /* renamed from: Z */
    public final void mo18980Z(C3209t tVar) {
        if (tVar.mo20173e() == -9223372036854775807L) {
            mo18981a0(tVar);
        } else if (this.f4464E == null || this.f4471L > 0) {
            this.f4490z.add(new C2852c(tVar));
        } else {
            C2852c cVar = new C2852c(tVar);
            if (mo18970P(cVar)) {
                this.f4490z.add(cVar);
                Collections.sort(this.f4490z);
                return;
            }
            tVar.mo20179k(false);
        }
    }

    /* renamed from: a0 */
    public final void mo18981a0(C3209t tVar) {
        if (tVar.mo20171c().getLooper() == this.f4481q.mo19973g()) {
            mo18987e(tVar);
            int i = this.f4463D.f6020f;
            if (i == 3 || i == 2) {
                this.f4481q.mo19968b(2);
                return;
            }
            return;
        }
        this.f4481q.mo19972f(15, tVar).sendToTarget();
    }

    /* renamed from: b */
    public synchronized void mo18982b(C3209t tVar) {
        if (this.f4466G) {
            C3163m.m7880f("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            tVar.mo20179k(false);
            return;
        }
        this.f4481q.mo19972f(14, tVar).sendToTarget();
    }

    /* renamed from: b0 */
    public final void mo18983b0(C3209t tVar) {
        tVar.mo20171c().post(new C2577a(this, tVar));
    }

    /* renamed from: c */
    public void mo18493c(C3206r rVar) {
        this.f4481q.mo19972f(16, rVar).sendToTarget();
    }

    /* renamed from: c0 */
    public final void mo18984c0(boolean z) {
        C3205q qVar = this.f4463D;
        if (qVar.f6021g != z) {
            this.f4463D = qVar.mo20158a(z);
        }
    }

    /* renamed from: d */
    public void mo18985d(C3014u uVar, C2578a0 a0Var, Object obj) {
        this.f4481q.mo19972f(8, new C2851b(uVar, a0Var, obj)).sendToTarget();
    }

    /* renamed from: d0 */
    public void mo18986d0(boolean z) {
        this.f4481q.mo19967a(1, z ? 1 : 0, 0).sendToTarget();
    }

    /* renamed from: e */
    public final void mo18987e(C3209t tVar) {
        if (!tVar.mo20178j()) {
            try {
                tVar.mo20174f().mo18210p(tVar.mo20176h(), tVar.mo20172d());
            } finally {
                tVar.mo20179k(true);
            }
        }
    }

    /* renamed from: e0 */
    public final void mo18988e0(boolean z) {
        this.f4468I = false;
        this.f4467H = z;
        if (!z) {
            mo19009p0();
            mo19015s0();
            return;
        }
        int i = this.f4463D.f6020f;
        if (i == 3) {
            mo19004m0();
            this.f4481q.mo19968b(2);
        } else if (i == 2) {
            this.f4481q.mo19968b(2);
        }
    }

    /* renamed from: f */
    public final void mo18989f(C3212u uVar) {
        this.f4488x.mo18487c(uVar);
        mo19003m(uVar);
        uVar.mo18201d();
    }

    /* renamed from: f0 */
    public final void mo18990f0(C3206r rVar) {
        this.f4488x.mo18334g(rVar);
    }

    /* renamed from: g */
    public final void mo18991g() {
        int i;
        long c = this.f4460A.mo19954c();
        mo19013r0();
        if (!this.f4461B.mo20074q()) {
            mo18957C();
            mo18974T(c, 10);
            return;
        }
        C3113n n = this.f4461B.mo20071n();
        C3148c0.m7745a("doSomeWork");
        mo19015s0();
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        n.f5686a.mo19147t(this.f4463D.f6027m - this.f4486v, this.f4487w);
        boolean z = true;
        boolean z2 = true;
        for (C3212u uVar : this.f4465F) {
            uVar.mo18906o(this.f4473N, elapsedRealtime);
            z2 = z2 && uVar.mo18329b();
            boolean z3 = uVar.mo18330c() || uVar.mo18329b() || mo18966L(uVar);
            if (!z3) {
                uVar.mo18211r();
            }
            z = z && z3;
        }
        if (!z) {
            mo18957C();
        }
        long j = n.f5692g.f5804d;
        if (z2 && ((j == -9223372036854775807L || j <= this.f4463D.f6027m) && n.f5692g.f5806f)) {
            mo19000k0(4);
            mo19009p0();
        } else if (this.f4463D.f6020f == 2 && mo19002l0(z)) {
            mo19000k0(3);
            if (this.f4467H) {
                mo19004m0();
            }
        } else if (this.f4463D.f6020f == 3 && (this.f4465F.length != 0 ? !z : !mo19023y())) {
            this.f4468I = this.f4467H;
            mo19000k0(2);
            mo19009p0();
        }
        if (this.f4463D.f6020f == 2) {
            for (C3212u r : this.f4465F) {
                r.mo18211r();
            }
        }
        if ((this.f4467H && this.f4463D.f6020f == 3) || (i = this.f4463D.f6020f) == 2) {
            mo18974T(c, 10);
        } else if (this.f4465F.length == 0 || i == 4) {
            this.f4481q.mo19971e(2);
        } else {
            mo18974T(c, 1000);
        }
        C3148c0.m7747c();
    }

    /* renamed from: g0 */
    public void mo18992g0(int i) {
        this.f4481q.mo19967a(12, i, 0).sendToTarget();
    }

    /* renamed from: h0 */
    public final void mo18993h0(int i) {
        this.f4469J = i;
        if (!this.f4461B.mo20056D(i)) {
            mo18976V(true);
        }
        mo19016t(false);
    }

    public boolean handleMessage(Message message) {
        try {
            switch (message.what) {
                case 0:
                    mo18963I((C3014u) message.obj, message.arg1 != 0, message.arg2 != 0);
                    break;
                case 1:
                    mo18988e0(message.arg1 != 0);
                    break;
                case 2:
                    mo18991g();
                    break;
                case 3:
                    mo18977W((C2854e) message.obj);
                    break;
                case 4:
                    mo18990f0((C3206r) message.obj);
                    break;
                case 5:
                    mo18996i0((C3216y) message.obj);
                    break;
                case 6:
                    mo19007o0(message.arg1 != 0, true);
                    break;
                case 7:
                    mo18965K();
                    return true;
                case 8:
                    mo19022x((C2851b) message.obj);
                    break;
                case 9:
                    mo19018u((C3012t) message.obj);
                    break;
                case 10:
                    mo19014s((C3012t) message.obj);
                    break;
                case 11:
                    mo18967M();
                    break;
                case 12:
                    mo18993h0(message.arg1);
                    break;
                case 13:
                    mo18998j0(message.arg1 != 0);
                    break;
                case 14:
                    mo18980Z((C3209t) message.obj);
                    break;
                case 15:
                    mo18983b0((C3209t) message.obj);
                    break;
                case 16:
                    mo19020v((C3206r) message.obj);
                    break;
                default:
                    return false;
            }
            mo18956B();
        } catch (ExoPlaybackException e) {
            C3163m.m7878d("ExoPlayerImplInternal", "Playback error.", e);
            mo19007o0(false, false);
            this.f4483s.obtainMessage(2, e).sendToTarget();
            mo18956B();
        } catch (IOException e2) {
            C3163m.m7878d("ExoPlayerImplInternal", "Source error.", e2);
            mo19007o0(false, false);
            this.f4483s.obtainMessage(2, ExoPlaybackException.createForSource(e2)).sendToTarget();
            mo18956B();
        } catch (RuntimeException e3) {
            C3163m.m7878d("ExoPlayerImplInternal", "Internal runtime error.", e3);
            mo19007o0(false, false);
            this.f4483s.obtainMessage(2, ExoPlaybackException.createForUnexpected(e3)).sendToTarget();
            mo18956B();
        }
        return true;
    }

    /* renamed from: i0 */
    public final void mo18996i0(C3216y yVar) {
        this.f4462C = yVar;
    }

    /* renamed from: j */
    public final void mo18997j(int i, boolean z, int i2) {
        C3113n n = this.f4461B.mo20071n();
        C3212u uVar = this.f4475e[i];
        this.f4465F[i2] = uVar;
        if (uVar.getState() == 0) {
            C3112h hVar = n.f5695j;
            C3214w wVar = hVar.f5683b[i];
            Format[] n2 = m6133n(hVar.f5684c.mo19842a(i));
            boolean z2 = this.f4467H && this.f4463D.f6020f == 3;
            uVar.mo18206j(wVar, n2, n.f5688c[i], this.f4473N, !z && z2, n.mo19860j());
            this.f4488x.mo18488d(uVar);
            if (z2) {
                uVar.start();
            }
        }
    }

    /* renamed from: j0 */
    public final void mo18998j0(boolean z) {
        this.f4470K = z;
        if (!this.f4461B.mo20057E(z)) {
            mo18976V(true);
        }
        mo19016t(false);
    }

    /* renamed from: k */
    public final void mo18999k(boolean[] zArr, int i) {
        this.f4465F = new C3212u[i];
        C3113n n = this.f4461B.mo20071n();
        int i2 = 0;
        for (int i3 = 0; i3 < this.f4475e.length; i3++) {
            if (n.f5695j.mo19850c(i3)) {
                mo18997j(i3, zArr[i3], i2);
                i2++;
            }
        }
    }

    /* renamed from: k0 */
    public final void mo19000k0(int i) {
        C3205q qVar = this.f4463D;
        if (qVar.f6020f != i) {
            this.f4463D = qVar.mo20161d(i);
        }
    }

    /* renamed from: l */
    public void mo19001l(C3012t tVar) {
        this.f4481q.mo19972f(9, tVar).sendToTarget();
    }

    /* renamed from: l0 */
    public final boolean mo19002l0(boolean z) {
        if (this.f4465F.length == 0) {
            return mo19023y();
        }
        if (!z) {
            return false;
        }
        if (!this.f4463D.f6021g) {
            return true;
        }
        C3113n i = this.f4461B.mo20066i();
        if ((i.mo19863m() && i.f5692g.f5806f) || this.f4479o.mo18430d(mo19010q(), this.f4488x.mo18333f().f6029a, this.f4468I)) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final void mo19003m(C3212u uVar) {
        if (uVar.getState() == 2) {
            uVar.stop();
        }
    }

    /* renamed from: m0 */
    public final void mo19004m0() {
        this.f4468I = false;
        this.f4488x.mo18490h();
        for (C3212u start : this.f4465F) {
            start.start();
        }
    }

    /* renamed from: n0 */
    public void mo19005n0(boolean z) {
        this.f4481q.mo19967a(6, z ? 1 : 0, 0).sendToTarget();
    }

    /* renamed from: o */
    public final Pair<Object, Long> mo19006o(C2578a0 a0Var, int i, long j) {
        return a0Var.mo18055j(this.f4484t, this.f4485u, i, j);
    }

    /* renamed from: o0 */
    public final void mo19007o0(boolean z, boolean z2) {
        mo18968N(true, z, z);
        this.f4489y.mo19029e(this.f4471L + (z2 ? 1 : 0));
        this.f4471L = 0;
        this.f4479o.mo18435i();
        mo19000k0(1);
    }

    /* renamed from: p */
    public Looper mo19008p() {
        return this.f4482r.getLooper();
    }

    /* renamed from: p0 */
    public final void mo19009p0() {
        this.f4488x.mo18491i();
        for (C3212u m : this.f4465F) {
            mo19003m(m);
        }
    }

    /* renamed from: q */
    public final long mo19010q() {
        return mo19012r(this.f4463D.f6025k);
    }

    /* renamed from: q0 */
    public final void mo19011q0(TrackGroupArray trackGroupArray, C3112h hVar) {
        this.f4479o.mo18432f(this.f4475e, trackGroupArray, hVar.f5684c);
    }

    /* renamed from: r */
    public final long mo19012r(long j) {
        C3113n i = this.f4461B.mo20066i();
        if (i == null) {
            return 0;
        }
        return j - i.mo19867q(this.f4473N);
    }

    /* renamed from: r0 */
    public final void mo19013r0() {
        C3014u uVar = this.f4464E;
        if (uVar != null) {
            if (this.f4471L > 0) {
                uVar.mo19163h();
                return;
            }
            mo18960F();
            C3113n i = this.f4461B.mo20066i();
            int i2 = 0;
            if (i == null || i.mo19863m()) {
                mo18984c0(false);
            } else if (!this.f4463D.f6021g) {
                mo18955A();
            }
            if (this.f4461B.mo20074q()) {
                C3113n n = this.f4461B.mo20071n();
                C3113n o = this.f4461B.mo20072o();
                boolean z = false;
                while (this.f4467H && n != o && this.f4473N >= n.f5693h.mo19861k()) {
                    if (z) {
                        mo18956B();
                    }
                    int i3 = n.f5692g.f5805e ? 0 : 3;
                    C3113n a = this.f4461B.mo20058a();
                    mo19017t0(n);
                    C3205q qVar = this.f4463D;
                    C3142o oVar = a.f5692g;
                    this.f4463D = qVar.mo20160c(oVar.f5801a, oVar.f5802b, oVar.f5803c, mo19010q());
                    this.f4489y.mo19031g(i3);
                    mo19015s0();
                    z = true;
                    n = a;
                }
                if (o.f5692g.f5806f) {
                    while (true) {
                        C3212u[] uVarArr = this.f4475e;
                        if (i2 < uVarArr.length) {
                            C3212u uVar2 = uVarArr[i2];
                            C3027y yVar = o.f5688c[i2];
                            if (yVar != null && uVar2.mo18202e() == yVar && uVar2.mo18205i()) {
                                uVar2.mo18207k();
                            }
                            i2++;
                        } else {
                            return;
                        }
                    }
                } else if (o.f5693h != null) {
                    int i4 = 0;
                    while (true) {
                        C3212u[] uVarArr2 = this.f4475e;
                        if (i4 < uVarArr2.length) {
                            C3212u uVar3 = uVarArr2[i4];
                            C3027y yVar2 = o.f5688c[i4];
                            if (uVar3.mo18202e() != yVar2) {
                                return;
                            }
                            if (yVar2 == null || uVar3.mo18205i()) {
                                i4++;
                            } else {
                                return;
                            }
                        } else if (!o.f5693h.f5690e) {
                            mo18957C();
                            return;
                        } else {
                            C3112h hVar = o.f5695j;
                            C3113n b = this.f4461B.mo20059b();
                            C3112h hVar2 = b.f5695j;
                            boolean z2 = b.f5686a.mo19143p() != -9223372036854775807L;
                            int i5 = 0;
                            while (true) {
                                C3212u[] uVarArr3 = this.f4475e;
                                if (i5 < uVarArr3.length) {
                                    C3212u uVar4 = uVarArr3[i5];
                                    if (hVar.mo19850c(i5)) {
                                        if (z2) {
                                            uVar4.mo18207k();
                                        } else if (!uVar4.mo18216t()) {
                                            C3107e a2 = hVar2.f5684c.mo19842a(i5);
                                            boolean c = hVar2.mo19850c(i5);
                                            boolean z3 = this.f4476l[i5].mo18204h() == 6;
                                            C3214w wVar = hVar.f5683b[i5];
                                            C3214w wVar2 = hVar2.f5683b[i5];
                                            if (!c || !wVar2.equals(wVar) || z3) {
                                                uVar4.mo18207k();
                                            } else {
                                                uVar4.mo18218v(m6133n(a2), b.f5688c[i5], b.mo19860j());
                                            }
                                        }
                                    }
                                    i5++;
                                } else {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: s */
    public final void mo19014s(C3012t tVar) {
        if (this.f4461B.mo20077t(tVar)) {
            this.f4461B.mo20078u(this.f4473N);
            mo18955A();
        }
    }

    /* renamed from: s0 */
    public final void mo19015s0() {
        if (this.f4461B.mo20074q()) {
            C3113n n = this.f4461B.mo20071n();
            long p = n.f5686a.mo19143p();
            if (p != -9223372036854775807L) {
                mo18969O(p);
                if (p != this.f4463D.f6027m) {
                    C3205q qVar = this.f4463D;
                    this.f4463D = qVar.mo20160c(qVar.f6017c, p, qVar.f6019e, mo19010q());
                    this.f4489y.mo19031g(4);
                }
            } else {
                long j = this.f4488x.mo18492j();
                this.f4473N = j;
                long q = n.mo19867q(j);
                mo18959E(this.f4463D.f6027m, q);
                this.f4463D.f6027m = q;
            }
            C3113n i = this.f4461B.mo20066i();
            this.f4463D.f6025k = i.mo19858h();
            this.f4463D.f6026l = mo19010q();
        }
    }

    /* renamed from: t */
    public final void mo19016t(boolean z) {
        long j;
        C3113n i = this.f4461B.mo20066i();
        C3014u.C3015a aVar = i == null ? this.f4463D.f6017c : i.f5692g.f5801a;
        boolean z2 = !this.f4463D.f6024j.equals(aVar);
        if (z2) {
            this.f4463D = this.f4463D.mo20159b(aVar);
        }
        C3205q qVar = this.f4463D;
        if (i == null) {
            j = qVar.f6027m;
        } else {
            j = i.mo19858h();
        }
        qVar.f6025k = j;
        this.f4463D.f6026l = mo19010q();
        if ((z2 || z) && i != null && i.f5690e) {
            mo19011q0(i.f5694i, i.f5695j);
        }
    }

    /* renamed from: t0 */
    public final void mo19017t0(@Nullable C3113n nVar) {
        C3113n n = this.f4461B.mo20071n();
        if (n != null && nVar != n) {
            boolean[] zArr = new boolean[this.f4475e.length];
            int i = 0;
            int i2 = 0;
            while (true) {
                C3212u[] uVarArr = this.f4475e;
                if (i < uVarArr.length) {
                    C3212u uVar = uVarArr[i];
                    zArr[i] = uVar.getState() != 0;
                    if (n.f5695j.mo19850c(i)) {
                        i2++;
                    }
                    if (zArr[i] && (!n.f5695j.mo19850c(i) || (uVar.mo18216t() && uVar.mo18202e() == nVar.f5688c[i]))) {
                        mo18989f(uVar);
                    }
                    i++;
                } else {
                    this.f4463D = this.f4463D.mo20163f(n.f5694i, n.f5695j);
                    mo18999k(zArr, i2);
                    return;
                }
            }
        }
    }

    /* renamed from: u */
    public final void mo19018u(C3012t tVar) {
        if (this.f4461B.mo20077t(tVar)) {
            C3113n i = this.f4461B.mo20066i();
            i.mo19862l(this.f4488x.mo18333f().f6029a);
            mo19011q0(i.f5694i, i.f5695j);
            if (!this.f4461B.mo20074q()) {
                mo18969O(this.f4461B.mo20058a().f5692g.f5802b);
                mo19017t0((C3113n) null);
            }
            mo18955A();
        }
    }

    /* renamed from: u0 */
    public final void mo19019u0(float f) {
        for (C3113n h = this.f4461B.mo20065h(); h != null; h = h.f5693h) {
            C3112h hVar = h.f5695j;
            if (hVar != null) {
                for (C3107e eVar : hVar.f5684c.mo19843b()) {
                    if (eVar != null) {
                        eVar.mo19815n(f);
                    }
                }
            }
        }
    }

    /* renamed from: v */
    public final void mo19020v(C3206r rVar) {
        this.f4483s.obtainMessage(1, rVar).sendToTarget();
        mo19019u0(rVar.f6029a);
        for (C3212u uVar : this.f4475e) {
            if (uVar != null) {
                uVar.mo20183q(rVar.f6029a);
            }
        }
    }

    /* renamed from: w */
    public final void mo19021w() {
        mo19000k0(4);
        mo18968N(false, true, false);
    }

    /* renamed from: x */
    public final void mo19022x(C2851b bVar) {
        C2851b bVar2 = bVar;
        if (bVar2.f4491a == this.f4464E) {
            C2578a0 a0Var = this.f4463D.f6015a;
            C2578a0 a0Var2 = bVar2.f4492b;
            Object obj = bVar2.f4493c;
            this.f4461B.mo20083z(a0Var2);
            this.f4463D = this.f4463D.mo20162e(a0Var2, obj);
            mo18971Q();
            int i = this.f4471L;
            long j = 0;
            if (i > 0) {
                this.f4489y.mo19029e(i);
                this.f4471L = 0;
                C2854e eVar = this.f4472M;
                if (eVar != null) {
                    try {
                        Pair<Object, Long> R = mo18972R(eVar, true);
                        this.f4472M = null;
                        if (R == null) {
                            mo19021w();
                            return;
                        }
                        Object obj2 = R.first;
                        long longValue = ((Long) R.second).longValue();
                        C3014u.C3015a w = this.f4461B.mo20080w(obj2, longValue);
                        this.f4463D = this.f4463D.mo20165i(w, w.mo19513a() ? 0 : longValue, longValue);
                    } catch (IllegalSeekPositionException e) {
                        IllegalSeekPositionException illegalSeekPositionException = e;
                        this.f4463D = this.f4463D.mo20165i(this.f4463D.mo20164h(this.f4470K, this.f4484t), -9223372036854775807L, -9223372036854775807L);
                        throw illegalSeekPositionException;
                    }
                } else if (this.f4463D.f6018d != -9223372036854775807L) {
                } else {
                    if (a0Var2.mo18062q()) {
                        mo19021w();
                        return;
                    }
                    Pair<Object, Long> o = mo19006o(a0Var2, a0Var2.mo18046a(this.f4470K), -9223372036854775807L);
                    Object obj3 = o.first;
                    long longValue2 = ((Long) o.second).longValue();
                    C3014u.C3015a w2 = this.f4461B.mo20080w(obj3, longValue2);
                    this.f4463D = this.f4463D.mo20165i(w2, w2.mo19513a() ? 0 : longValue2, longValue2);
                }
            } else if (!a0Var.mo18062q()) {
                C3113n h = this.f4461B.mo20065h();
                C3205q qVar = this.f4463D;
                long j2 = qVar.f6019e;
                Object obj4 = h == null ? qVar.f6017c.f5277a : h.f5687b;
                if (a0Var2.mo18047b(obj4) == -1) {
                    Object S = mo18973S(obj4, a0Var, a0Var2);
                    if (S == null) {
                        mo19021w();
                        return;
                    }
                    Pair<Object, Long> o2 = mo19006o(a0Var2, a0Var2.mo18053h(S, this.f4485u).f3046c, -9223372036854775807L);
                    Object obj5 = o2.first;
                    long longValue3 = ((Long) o2.second).longValue();
                    C3014u.C3015a w3 = this.f4461B.mo20080w(obj5, longValue3);
                    if (h != null) {
                        while (true) {
                            h = h.f5693h;
                            if (h == null) {
                                break;
                            } else if (h.f5692g.f5801a.equals(w3)) {
                                h.f5692g = this.f4461B.mo20073p(h.f5692g);
                            }
                        }
                    }
                    if (!w3.mo19513a()) {
                        j = longValue3;
                    }
                    this.f4463D = this.f4463D.mo20160c(w3, mo18978X(w3, j), longValue3, mo19010q());
                    return;
                }
                C3014u.C3015a aVar = this.f4463D.f6017c;
                if (aVar.mo19513a()) {
                    C3014u.C3015a w4 = this.f4461B.mo20080w(obj4, j2);
                    if (!w4.equals(aVar)) {
                        if (!w4.mo19513a()) {
                            j = j2;
                        }
                        this.f4463D = this.f4463D.mo20160c(w4, mo18978X(w4, j), j2, mo19010q());
                        return;
                    }
                }
                if (!this.f4461B.mo20055C(aVar, this.f4473N)) {
                    mo18976V(false);
                }
                mo19016t(false);
            } else if (!a0Var2.mo18062q()) {
                Pair<Object, Long> o3 = mo19006o(a0Var2, a0Var2.mo18046a(this.f4470K), -9223372036854775807L);
                Object obj6 = o3.first;
                long longValue4 = ((Long) o3.second).longValue();
                C3014u.C3015a w5 = this.f4461B.mo20080w(obj6, longValue4);
                this.f4463D = this.f4463D.mo20165i(w5, w5.mo19513a() ? 0 : longValue4, longValue4);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001b, code lost:
        r0 = r0.f5693h;
     */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo19023y() {
        /*
            r5 = this;
            c.q.a.b.p r0 = r5.f4461B
            c.q.a.b.n r0 = r0.mo20071n()
            c.q.a.b.o r1 = r0.f5692g
            long r1 = r1.f5804d
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x0030
            c.q.a.b.q r3 = r5.f4463D
            long r3 = r3.f6027m
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x0030
            c.q.a.b.n r0 = r0.f5693h
            if (r0 == 0) goto L_0x002e
            boolean r1 = r0.f5690e
            if (r1 != 0) goto L_0x0030
            c.q.a.b.o r0 = r0.f5692g
            c.q.a.b.k0.u$a r0 = r0.f5801a
            boolean r0 = r0.mo19513a()
            if (r0 == 0) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            r0 = 0
            goto L_0x0031
        L_0x0030:
            r0 = 1
        L_0x0031:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.C2849j.mo19023y():boolean");
    }

    /* renamed from: z */
    public /* synthetic */ void mo19024z(C3209t tVar) {
        try {
            mo18987e(tVar);
        } catch (ExoPlaybackException e) {
            C3163m.m7878d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }
}
