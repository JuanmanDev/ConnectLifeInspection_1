package p040c.p200q.p201a.p219b.p241k0;

import com.google.android.exoplayer2.Format;
import p040c.p200q.p201a.p219b.p224f0.C2686q;
import p040c.p200q.p201a.p219b.p261o0.C3151e;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

/* renamed from: c.q.a.b.k0.w */
/* compiled from: SampleMetadataQueue */
public final class C3022w {

    /* renamed from: a */
    public int f5291a = 1000;

    /* renamed from: b */
    public int[] f5292b = new int[1000];

    /* renamed from: c */
    public long[] f5293c = new long[1000];

    /* renamed from: d */
    public int[] f5294d = new int[1000];

    /* renamed from: e */
    public int[] f5295e = new int[1000];

    /* renamed from: f */
    public long[] f5296f = new long[1000];

    /* renamed from: g */
    public C2686q.C2687a[] f5297g = new C2686q.C2687a[1000];

    /* renamed from: h */
    public Format[] f5298h = new Format[1000];

    /* renamed from: i */
    public int f5299i;

    /* renamed from: j */
    public int f5300j;

    /* renamed from: k */
    public int f5301k;

    /* renamed from: l */
    public int f5302l;

    /* renamed from: m */
    public long f5303m = Long.MIN_VALUE;

    /* renamed from: n */
    public long f5304n = Long.MIN_VALUE;

    /* renamed from: o */
    public boolean f5305o;

    /* renamed from: p */
    public boolean f5306p = true;

    /* renamed from: q */
    public boolean f5307q = true;

    /* renamed from: r */
    public Format f5308r;

    /* renamed from: s */
    public int f5309s;

    /* renamed from: c.q.a.b.k0.w$a */
    /* compiled from: SampleMetadataQueue */
    public static final class C3023a {

        /* renamed from: a */
        public int f5310a;

        /* renamed from: b */
        public long f5311b;

        /* renamed from: c */
        public C2686q.C2687a f5312c;
    }

    /* renamed from: A */
    public void mo19549A(int i) {
        this.f5309s = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0038, code lost:
        return -1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int mo19550a(long r9, boolean r11, boolean r12) {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.f5302l     // Catch:{ all -> 0x0039 }
            int r2 = r8.mo19566q(r0)     // Catch:{ all -> 0x0039 }
            boolean r0 = r8.mo19569t()     // Catch:{ all -> 0x0039 }
            r7 = -1
            if (r0 == 0) goto L_0x0037
            long[] r0 = r8.f5296f     // Catch:{ all -> 0x0039 }
            r3 = r0[r2]     // Catch:{ all -> 0x0039 }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0037
            long r0 = r8.f5304n     // Catch:{ all -> 0x0039 }
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x001f
            if (r12 != 0) goto L_0x001f
            goto L_0x0037
        L_0x001f:
            int r12 = r8.f5299i     // Catch:{ all -> 0x0039 }
            int r0 = r8.f5302l     // Catch:{ all -> 0x0039 }
            int r3 = r12 - r0
            r1 = r8
            r4 = r9
            r6 = r11
            int r9 = r1.mo19559j(r2, r3, r4, r6)     // Catch:{ all -> 0x0039 }
            if (r9 != r7) goto L_0x0030
            monitor-exit(r8)
            return r7
        L_0x0030:
            int r10 = r8.f5302l     // Catch:{ all -> 0x0039 }
            int r10 = r10 + r9
            r8.f5302l = r10     // Catch:{ all -> 0x0039 }
            monitor-exit(r8)
            return r9
        L_0x0037:
            monitor-exit(r8)
            return r7
        L_0x0039:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p241k0.C3022w.mo19550a(long, boolean, boolean):int");
    }

    /* renamed from: b */
    public synchronized int mo19551b() {
        int i;
        i = this.f5299i - this.f5302l;
        this.f5302l = this.f5299i;
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
        return r1;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo19552c(long r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            int r0 = r7.f5299i     // Catch:{ all -> 0x004a }
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0010
            long r3 = r7.f5303m     // Catch:{ all -> 0x004a }
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 <= 0) goto L_0x000e
            r1 = r2
        L_0x000e:
            monitor-exit(r7)
            return r1
        L_0x0010:
            long r3 = r7.f5303m     // Catch:{ all -> 0x004a }
            int r0 = r7.f5302l     // Catch:{ all -> 0x004a }
            long r5 = r7.mo19564o(r0)     // Catch:{ all -> 0x004a }
            long r3 = java.lang.Math.max(r3, r5)     // Catch:{ all -> 0x004a }
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x0022
            monitor-exit(r7)
            return r1
        L_0x0022:
            int r0 = r7.f5299i     // Catch:{ all -> 0x004a }
            int r1 = r7.f5299i     // Catch:{ all -> 0x004a }
            int r1 = r1 - r2
            int r1 = r7.mo19566q(r1)     // Catch:{ all -> 0x004a }
        L_0x002b:
            int r3 = r7.f5302l     // Catch:{ all -> 0x004a }
            if (r0 <= r3) goto L_0x0042
            long[] r3 = r7.f5296f     // Catch:{ all -> 0x004a }
            r4 = r3[r1]     // Catch:{ all -> 0x004a }
            int r3 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x0042
            int r0 = r0 + -1
            int r1 = r1 + -1
            r3 = -1
            if (r1 != r3) goto L_0x002b
            int r1 = r7.f5291a     // Catch:{ all -> 0x004a }
            int r1 = r1 - r2
            goto L_0x002b
        L_0x0042:
            int r8 = r7.f5300j     // Catch:{ all -> 0x004a }
            int r8 = r8 + r0
            r7.mo19558i(r8)     // Catch:{ all -> 0x004a }
            monitor-exit(r7)
            return r2
        L_0x004a:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p241k0.C3022w.mo19552c(long):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00de, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo19553d(long r6, int r8, long r9, int r11, p040c.p200q.p201a.p219b.p224f0.C2686q.C2687a r12) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.f5306p     // Catch:{ all -> 0x00df }
            r1 = 0
            if (r0 == 0) goto L_0x000e
            r0 = r8 & 1
            if (r0 != 0) goto L_0x000c
            monitor-exit(r5)
            return
        L_0x000c:
            r5.f5306p = r1     // Catch:{ all -> 0x00df }
        L_0x000e:
            boolean r0 = r5.f5307q     // Catch:{ all -> 0x00df }
            r2 = 1
            if (r0 != 0) goto L_0x0015
            r0 = r2
            goto L_0x0016
        L_0x0015:
            r0 = r1
        L_0x0016:
            p040c.p200q.p201a.p219b.p261o0.C3151e.m7759g(r0)     // Catch:{ all -> 0x00df }
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r8
            if (r0 == 0) goto L_0x0020
            r0 = r2
            goto L_0x0021
        L_0x0020:
            r0 = r1
        L_0x0021:
            r5.f5305o = r0     // Catch:{ all -> 0x00df }
            long r3 = r5.f5304n     // Catch:{ all -> 0x00df }
            long r3 = java.lang.Math.max(r3, r6)     // Catch:{ all -> 0x00df }
            r5.f5304n = r3     // Catch:{ all -> 0x00df }
            int r0 = r5.f5299i     // Catch:{ all -> 0x00df }
            int r0 = r5.mo19566q(r0)     // Catch:{ all -> 0x00df }
            long[] r3 = r5.f5296f     // Catch:{ all -> 0x00df }
            r3[r0] = r6     // Catch:{ all -> 0x00df }
            long[] r6 = r5.f5293c     // Catch:{ all -> 0x00df }
            r6[r0] = r9     // Catch:{ all -> 0x00df }
            int[] r6 = r5.f5294d     // Catch:{ all -> 0x00df }
            r6[r0] = r11     // Catch:{ all -> 0x00df }
            int[] r6 = r5.f5295e     // Catch:{ all -> 0x00df }
            r6[r0] = r8     // Catch:{ all -> 0x00df }
            c.q.a.b.f0.q$a[] r6 = r5.f5297g     // Catch:{ all -> 0x00df }
            r6[r0] = r12     // Catch:{ all -> 0x00df }
            com.google.android.exoplayer2.Format[] r6 = r5.f5298h     // Catch:{ all -> 0x00df }
            com.google.android.exoplayer2.Format r7 = r5.f5308r     // Catch:{ all -> 0x00df }
            r6[r0] = r7     // Catch:{ all -> 0x00df }
            int[] r6 = r5.f5292b     // Catch:{ all -> 0x00df }
            int r7 = r5.f5309s     // Catch:{ all -> 0x00df }
            r6[r0] = r7     // Catch:{ all -> 0x00df }
            int r6 = r5.f5299i     // Catch:{ all -> 0x00df }
            int r6 = r6 + r2
            r5.f5299i = r6     // Catch:{ all -> 0x00df }
            int r7 = r5.f5291a     // Catch:{ all -> 0x00df }
            if (r6 != r7) goto L_0x00dd
            int r6 = r5.f5291a     // Catch:{ all -> 0x00df }
            int r6 = r6 + 1000
            int[] r7 = new int[r6]     // Catch:{ all -> 0x00df }
            long[] r8 = new long[r6]     // Catch:{ all -> 0x00df }
            long[] r9 = new long[r6]     // Catch:{ all -> 0x00df }
            int[] r10 = new int[r6]     // Catch:{ all -> 0x00df }
            int[] r11 = new int[r6]     // Catch:{ all -> 0x00df }
            c.q.a.b.f0.q$a[] r12 = new p040c.p200q.p201a.p219b.p224f0.C2686q.C2687a[r6]     // Catch:{ all -> 0x00df }
            com.google.android.exoplayer2.Format[] r0 = new com.google.android.exoplayer2.Format[r6]     // Catch:{ all -> 0x00df }
            int r2 = r5.f5291a     // Catch:{ all -> 0x00df }
            int r3 = r5.f5301k     // Catch:{ all -> 0x00df }
            int r2 = r2 - r3
            long[] r3 = r5.f5293c     // Catch:{ all -> 0x00df }
            int r4 = r5.f5301k     // Catch:{ all -> 0x00df }
            java.lang.System.arraycopy(r3, r4, r8, r1, r2)     // Catch:{ all -> 0x00df }
            long[] r3 = r5.f5296f     // Catch:{ all -> 0x00df }
            int r4 = r5.f5301k     // Catch:{ all -> 0x00df }
            java.lang.System.arraycopy(r3, r4, r9, r1, r2)     // Catch:{ all -> 0x00df }
            int[] r3 = r5.f5295e     // Catch:{ all -> 0x00df }
            int r4 = r5.f5301k     // Catch:{ all -> 0x00df }
            java.lang.System.arraycopy(r3, r4, r10, r1, r2)     // Catch:{ all -> 0x00df }
            int[] r3 = r5.f5294d     // Catch:{ all -> 0x00df }
            int r4 = r5.f5301k     // Catch:{ all -> 0x00df }
            java.lang.System.arraycopy(r3, r4, r11, r1, r2)     // Catch:{ all -> 0x00df }
            c.q.a.b.f0.q$a[] r3 = r5.f5297g     // Catch:{ all -> 0x00df }
            int r4 = r5.f5301k     // Catch:{ all -> 0x00df }
            java.lang.System.arraycopy(r3, r4, r12, r1, r2)     // Catch:{ all -> 0x00df }
            com.google.android.exoplayer2.Format[] r3 = r5.f5298h     // Catch:{ all -> 0x00df }
            int r4 = r5.f5301k     // Catch:{ all -> 0x00df }
            java.lang.System.arraycopy(r3, r4, r0, r1, r2)     // Catch:{ all -> 0x00df }
            int[] r3 = r5.f5292b     // Catch:{ all -> 0x00df }
            int r4 = r5.f5301k     // Catch:{ all -> 0x00df }
            java.lang.System.arraycopy(r3, r4, r7, r1, r2)     // Catch:{ all -> 0x00df }
            int r3 = r5.f5301k     // Catch:{ all -> 0x00df }
            long[] r4 = r5.f5293c     // Catch:{ all -> 0x00df }
            java.lang.System.arraycopy(r4, r1, r8, r2, r3)     // Catch:{ all -> 0x00df }
            long[] r4 = r5.f5296f     // Catch:{ all -> 0x00df }
            java.lang.System.arraycopy(r4, r1, r9, r2, r3)     // Catch:{ all -> 0x00df }
            int[] r4 = r5.f5295e     // Catch:{ all -> 0x00df }
            java.lang.System.arraycopy(r4, r1, r10, r2, r3)     // Catch:{ all -> 0x00df }
            int[] r4 = r5.f5294d     // Catch:{ all -> 0x00df }
            java.lang.System.arraycopy(r4, r1, r11, r2, r3)     // Catch:{ all -> 0x00df }
            c.q.a.b.f0.q$a[] r4 = r5.f5297g     // Catch:{ all -> 0x00df }
            java.lang.System.arraycopy(r4, r1, r12, r2, r3)     // Catch:{ all -> 0x00df }
            com.google.android.exoplayer2.Format[] r4 = r5.f5298h     // Catch:{ all -> 0x00df }
            java.lang.System.arraycopy(r4, r1, r0, r2, r3)     // Catch:{ all -> 0x00df }
            int[] r4 = r5.f5292b     // Catch:{ all -> 0x00df }
            java.lang.System.arraycopy(r4, r1, r7, r2, r3)     // Catch:{ all -> 0x00df }
            r5.f5293c = r8     // Catch:{ all -> 0x00df }
            r5.f5296f = r9     // Catch:{ all -> 0x00df }
            r5.f5295e = r10     // Catch:{ all -> 0x00df }
            r5.f5294d = r11     // Catch:{ all -> 0x00df }
            r5.f5297g = r12     // Catch:{ all -> 0x00df }
            r5.f5298h = r0     // Catch:{ all -> 0x00df }
            r5.f5292b = r7     // Catch:{ all -> 0x00df }
            r5.f5301k = r1     // Catch:{ all -> 0x00df }
            int r7 = r5.f5291a     // Catch:{ all -> 0x00df }
            r5.f5299i = r7     // Catch:{ all -> 0x00df }
            r5.f5291a = r6     // Catch:{ all -> 0x00df }
        L_0x00dd:
            monitor-exit(r5)
            return
        L_0x00df:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p241k0.C3022w.mo19553d(long, int, long, int, c.q.a.b.f0.q$a):void");
    }

    /* renamed from: e */
    public final long mo19554e(int i) {
        this.f5303m = Math.max(this.f5303m, mo19564o(i));
        this.f5299i -= i;
        this.f5300j += i;
        int i2 = this.f5301k + i;
        this.f5301k = i2;
        int i3 = this.f5291a;
        if (i2 >= i3) {
            this.f5301k = i2 - i3;
        }
        int i4 = this.f5302l - i;
        this.f5302l = i4;
        if (i4 < 0) {
            this.f5302l = 0;
        }
        if (this.f5299i != 0) {
            return this.f5293c[this.f5301k];
        }
        int i5 = this.f5301k;
        if (i5 == 0) {
            i5 = this.f5291a;
        }
        int i6 = i5 - 1;
        return this.f5293c[i6] + ((long) this.f5294d[i6]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0037, code lost:
        return -1;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized long mo19555f(long r10, boolean r12, boolean r13) {
        /*
            r9 = this;
            monitor-enter(r9)
            int r0 = r9.f5299i     // Catch:{ all -> 0x0038 }
            r1 = -1
            if (r0 == 0) goto L_0x0036
            long[] r0 = r9.f5296f     // Catch:{ all -> 0x0038 }
            int r3 = r9.f5301k     // Catch:{ all -> 0x0038 }
            r3 = r0[r3]     // Catch:{ all -> 0x0038 }
            int r0 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0012
            goto L_0x0036
        L_0x0012:
            if (r13 == 0) goto L_0x001f
            int r13 = r9.f5302l     // Catch:{ all -> 0x0038 }
            int r0 = r9.f5299i     // Catch:{ all -> 0x0038 }
            if (r13 == r0) goto L_0x001f
            int r13 = r9.f5302l     // Catch:{ all -> 0x0038 }
            int r13 = r13 + 1
            goto L_0x0021
        L_0x001f:
            int r13 = r9.f5299i     // Catch:{ all -> 0x0038 }
        L_0x0021:
            r5 = r13
            int r4 = r9.f5301k     // Catch:{ all -> 0x0038 }
            r3 = r9
            r6 = r10
            r8 = r12
            int r10 = r3.mo19559j(r4, r5, r6, r8)     // Catch:{ all -> 0x0038 }
            r11 = -1
            if (r10 != r11) goto L_0x0030
            monitor-exit(r9)
            return r1
        L_0x0030:
            long r10 = r9.mo19554e(r10)     // Catch:{ all -> 0x0038 }
            monitor-exit(r9)
            return r10
        L_0x0036:
            monitor-exit(r9)
            return r1
        L_0x0038:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p241k0.C3022w.mo19555f(long, boolean, boolean):long");
    }

    /* renamed from: g */
    public synchronized long mo19556g() {
        if (this.f5299i == 0) {
            return -1;
        }
        return mo19554e(this.f5299i);
    }

    /* renamed from: h */
    public synchronized long mo19557h() {
        if (this.f5302l == 0) {
            return -1;
        }
        return mo19554e(this.f5302l);
    }

    /* renamed from: i */
    public long mo19558i(int i) {
        int s = mo19568s() - i;
        boolean z = false;
        C3151e.m7753a(s >= 0 && s <= this.f5299i - this.f5302l);
        int i2 = this.f5299i - s;
        this.f5299i = i2;
        this.f5304n = Math.max(this.f5303m, mo19564o(i2));
        if (s == 0 && this.f5305o) {
            z = true;
        }
        this.f5305o = z;
        int i3 = this.f5299i;
        if (i3 == 0) {
            return 0;
        }
        int q = mo19566q(i3 - 1);
        return this.f5293c[q] + ((long) this.f5294d[q]);
    }

    /* renamed from: j */
    public final int mo19559j(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2 && this.f5296f[i] <= j; i4++) {
            if (!z || (this.f5295e[i] & 1) != 0) {
                i3 = i4;
            }
            i++;
            if (i == this.f5291a) {
                i = 0;
            }
        }
        return i3;
    }

    /* renamed from: k */
    public synchronized boolean mo19560k(Format format) {
        if (format == null) {
            this.f5307q = true;
            return false;
        }
        this.f5307q = false;
        if (C3152e0.m7789b(format, this.f5308r)) {
            return false;
        }
        this.f5308r = format;
        return true;
    }

    /* renamed from: l */
    public int mo19561l() {
        return this.f5300j;
    }

    /* renamed from: m */
    public synchronized long mo19562m() {
        return this.f5299i == 0 ? Long.MIN_VALUE : this.f5296f[this.f5301k];
    }

    /* renamed from: n */
    public synchronized long mo19563n() {
        return this.f5304n;
    }

    /* renamed from: o */
    public final long mo19564o(int i) {
        long j = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int q = mo19566q(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            j = Math.max(j, this.f5296f[q]);
            if ((this.f5295e[q] & 1) != 0) {
                break;
            }
            q--;
            if (q == -1) {
                q = this.f5291a - 1;
            }
        }
        return j;
    }

    /* renamed from: p */
    public int mo19565p() {
        return this.f5300j + this.f5302l;
    }

    /* renamed from: q */
    public final int mo19566q(int i) {
        int i2 = this.f5301k + i;
        int i3 = this.f5291a;
        return i2 < i3 ? i2 : i2 - i3;
    }

    /* renamed from: r */
    public synchronized Format mo19567r() {
        return this.f5307q ? null : this.f5308r;
    }

    /* renamed from: s */
    public int mo19568s() {
        return this.f5300j + this.f5299i;
    }

    /* renamed from: t */
    public synchronized boolean mo19569t() {
        return this.f5302l != this.f5299i;
    }

    /* renamed from: u */
    public synchronized boolean mo19570u() {
        return this.f5305o;
    }

    /* renamed from: v */
    public int mo19571v() {
        return mo19569t() ? this.f5292b[mo19566q(this.f5302l)] : this.f5309s;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0022, code lost:
        return -3;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int mo19572w(p040c.p200q.p201a.p219b.C3030l r5, p040c.p200q.p201a.p219b.p222d0.C2634e r6, boolean r7, boolean r8, com.google.android.exoplayer2.Format r9, p040c.p200q.p201a.p219b.p241k0.C3022w.C3023a r10) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.mo19569t()     // Catch:{ all -> 0x006f }
            r1 = -5
            r2 = -3
            r3 = -4
            if (r0 != 0) goto L_0x0029
            if (r8 != 0) goto L_0x0023
            boolean r8 = r4.f5305o     // Catch:{ all -> 0x006f }
            if (r8 == 0) goto L_0x0011
            goto L_0x0023
        L_0x0011:
            com.google.android.exoplayer2.Format r6 = r4.f5308r     // Catch:{ all -> 0x006f }
            if (r6 == 0) goto L_0x0021
            if (r7 != 0) goto L_0x001b
            com.google.android.exoplayer2.Format r6 = r4.f5308r     // Catch:{ all -> 0x006f }
            if (r6 == r9) goto L_0x0021
        L_0x001b:
            com.google.android.exoplayer2.Format r6 = r4.f5308r     // Catch:{ all -> 0x006f }
            r5.f5333a = r6     // Catch:{ all -> 0x006f }
            monitor-exit(r4)
            return r1
        L_0x0021:
            monitor-exit(r4)
            return r2
        L_0x0023:
            r5 = 4
            r6.mo18392q(r5)     // Catch:{ all -> 0x006f }
            monitor-exit(r4)
            return r3
        L_0x0029:
            int r8 = r4.f5302l     // Catch:{ all -> 0x006f }
            int r8 = r4.mo19566q(r8)     // Catch:{ all -> 0x006f }
            if (r7 != 0) goto L_0x0067
            com.google.android.exoplayer2.Format[] r7 = r4.f5298h     // Catch:{ all -> 0x006f }
            r7 = r7[r8]     // Catch:{ all -> 0x006f }
            if (r7 == r9) goto L_0x0038
            goto L_0x0067
        L_0x0038:
            boolean r5 = r6.mo18408w()     // Catch:{ all -> 0x006f }
            if (r5 == 0) goto L_0x0040
            monitor-exit(r4)
            return r2
        L_0x0040:
            long[] r5 = r4.f5296f     // Catch:{ all -> 0x006f }
            r0 = r5[r8]     // Catch:{ all -> 0x006f }
            r6.f3308n = r0     // Catch:{ all -> 0x006f }
            int[] r5 = r4.f5295e     // Catch:{ all -> 0x006f }
            r5 = r5[r8]     // Catch:{ all -> 0x006f }
            r6.mo18392q(r5)     // Catch:{ all -> 0x006f }
            int[] r5 = r4.f5294d     // Catch:{ all -> 0x006f }
            r5 = r5[r8]     // Catch:{ all -> 0x006f }
            r10.f5310a = r5     // Catch:{ all -> 0x006f }
            long[] r5 = r4.f5293c     // Catch:{ all -> 0x006f }
            r6 = r5[r8]     // Catch:{ all -> 0x006f }
            r10.f5311b = r6     // Catch:{ all -> 0x006f }
            c.q.a.b.f0.q$a[] r5 = r4.f5297g     // Catch:{ all -> 0x006f }
            r5 = r5[r8]     // Catch:{ all -> 0x006f }
            r10.f5312c = r5     // Catch:{ all -> 0x006f }
            int r5 = r4.f5302l     // Catch:{ all -> 0x006f }
            int r5 = r5 + 1
            r4.f5302l = r5     // Catch:{ all -> 0x006f }
            monitor-exit(r4)
            return r3
        L_0x0067:
            com.google.android.exoplayer2.Format[] r6 = r4.f5298h     // Catch:{ all -> 0x006f }
            r6 = r6[r8]     // Catch:{ all -> 0x006f }
            r5.f5333a = r6     // Catch:{ all -> 0x006f }
            monitor-exit(r4)
            return r1
        L_0x006f:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p241k0.C3022w.mo19572w(c.q.a.b.l, c.q.a.b.d0.e, boolean, boolean, com.google.android.exoplayer2.Format, c.q.a.b.k0.w$a):int");
    }

    /* renamed from: x */
    public void mo19573x(boolean z) {
        this.f5299i = 0;
        this.f5300j = 0;
        this.f5301k = 0;
        this.f5302l = 0;
        this.f5306p = true;
        this.f5303m = Long.MIN_VALUE;
        this.f5304n = Long.MIN_VALUE;
        this.f5305o = false;
        if (z) {
            this.f5308r = null;
            this.f5307q = true;
        }
    }

    /* renamed from: y */
    public synchronized void mo19574y() {
        this.f5302l = 0;
    }

    /* renamed from: z */
    public synchronized boolean mo19575z(int i) {
        if (this.f5300j > i || i > this.f5300j + this.f5299i) {
            return false;
        }
        this.f5302l = i - this.f5300j;
        return true;
    }
}
