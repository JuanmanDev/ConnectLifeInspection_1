package p040c.p200q.p201a.p219b.p241k0.p246e0;

import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import java.io.EOFException;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p040c.p200q.p201a.p219b.p224f0.C2671d;
import p040c.p200q.p201a.p219b.p224f0.C2674g;
import p040c.p200q.p201a.p219b.p224f0.C2675h;
import p040c.p200q.p201a.p219b.p224f0.C2681n;
import p040c.p200q.p201a.p219b.p235h0.p237g.C2837b;
import p040c.p200q.p201a.p219b.p241k0.p243c0.C2884l;
import p040c.p200q.p201a.p219b.p241k0.p246e0.p247q.C2968d;
import p040c.p200q.p201a.p219b.p260n0.C3122h;
import p040c.p200q.p201a.p219b.p260n0.C3125j;
import p040c.p200q.p201a.p219b.p261o0.C3146b0;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.k0.e0.j */
/* compiled from: HlsMediaChunk */
public final class C2953j extends C2884l {

    /* renamed from: G */
    public static final AtomicInteger f4880G = new AtomicInteger();

    /* renamed from: A */
    public C2959n f4881A;

    /* renamed from: B */
    public int f4882B;

    /* renamed from: C */
    public int f4883C;

    /* renamed from: D */
    public boolean f4884D;

    /* renamed from: E */
    public volatile boolean f4885E;

    /* renamed from: F */
    public boolean f4886F;

    /* renamed from: j */
    public final int f4887j;

    /* renamed from: k */
    public final int f4888k;

    /* renamed from: l */
    public final C2968d.C2969a f4889l;

    /* renamed from: m */
    public final C3122h f4890m;

    /* renamed from: n */
    public final C3125j f4891n;

    /* renamed from: o */
    public final boolean f4892o;

    /* renamed from: p */
    public final boolean f4893p;

    /* renamed from: q */
    public final boolean f4894q;

    /* renamed from: r */
    public final C3146b0 f4895r;

    /* renamed from: s */
    public final boolean f4896s;

    /* renamed from: t */
    public final C2951h f4897t;

    /* renamed from: u */
    public final List<Format> f4898u;

    /* renamed from: v */
    public final DrmInitData f4899v;

    /* renamed from: w */
    public final C2674g f4900w;

    /* renamed from: x */
    public final C2837b f4901x;

    /* renamed from: y */
    public final C3173t f4902y;

    /* renamed from: z */
    public C2674g f4903z;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2953j(p040c.p200q.p201a.p219b.p241k0.p246e0.C2951h r17, p040c.p200q.p201a.p219b.p260n0.C3122h r18, p040c.p200q.p201a.p219b.p260n0.C3125j r19, p040c.p200q.p201a.p219b.p260n0.C3125j r20, p040c.p200q.p201a.p219b.p241k0.p246e0.p247q.C2968d.C2969a r21, java.util.List<com.google.android.exoplayer2.Format> r22, int r23, java.lang.Object r24, long r25, long r27, long r29, int r31, boolean r32, boolean r33, p040c.p200q.p201a.p219b.p261o0.C3146b0 r34, p040c.p200q.p201a.p219b.p241k0.p246e0.C2953j r35, com.google.android.exoplayer2.drm.DrmInitData r36, byte[] r37, byte[] r38) {
        /*
            r16 = this;
            r12 = r16
            r13 = r18
            r14 = r21
            r15 = r31
            r10 = r35
            r11 = r37
            r0 = r38
            c.q.a.b.n0.h r1 = m6655h(r13, r11, r0)
            com.google.android.exoplayer2.Format r3 = r14.f5032b
            r0 = r16
            r2 = r19
            r4 = r23
            r5 = r24
            r6 = r25
            r8 = r27
            r13 = r10
            r10 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r10)
            r12.f4888k = r15
            r0 = r20
            r12.f4891n = r0
            r12.f4889l = r14
            r0 = r33
            r12.f4893p = r0
            r0 = r34
            r12.f4895r = r0
            r0 = 1
            r1 = 0
            if (r37 == 0) goto L_0x003c
            r2 = r0
            goto L_0x003d
        L_0x003c:
            r2 = r1
        L_0x003d:
            r12.f4892o = r2
            r2 = r32
            r12.f4894q = r2
            r2 = r17
            r12.f4897t = r2
            r2 = r22
            r12.f4898u = r2
            r2 = r36
            r12.f4899v = r2
            r2 = 0
            if (r13 == 0) goto L_0x0071
            c.q.a.b.h0.g.b r3 = r13.f4901x
            r12.f4901x = r3
            c.q.a.b.o0.t r3 = r13.f4902y
            r12.f4902y = r3
            c.q.a.b.k0.e0.q.d$a r3 = r13.f4889l
            if (r3 != r14) goto L_0x0064
            boolean r3 = r13.f4886F
            if (r3 != 0) goto L_0x0063
            goto L_0x0064
        L_0x0063:
            r0 = r1
        L_0x0064:
            r12.f4896s = r0
            int r1 = r13.f4888k
            if (r1 != r15) goto L_0x0083
            if (r0 == 0) goto L_0x006d
            goto L_0x0083
        L_0x006d:
            c.q.a.b.f0.g r0 = r13.f4903z
            r2 = r0
            goto L_0x0083
        L_0x0071:
            c.q.a.b.h0.g.b r0 = new c.q.a.b.h0.g.b
            r0.<init>()
            r12.f4901x = r0
            c.q.a.b.o0.t r0 = new c.q.a.b.o0.t
            r3 = 10
            r0.<init>((int) r3)
            r12.f4902y = r0
            r12.f4896s = r1
        L_0x0083:
            r12.f4900w = r2
            r0 = r18
            r12.f4890m = r0
            java.util.concurrent.atomic.AtomicInteger r0 = f4880G
            int r0 = r0.getAndIncrement()
            r12.f4887j = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p241k0.p246e0.C2953j.<init>(c.q.a.b.k0.e0.h, c.q.a.b.n0.h, c.q.a.b.n0.j, c.q.a.b.n0.j, c.q.a.b.k0.e0.q.d$a, java.util.List, int, java.lang.Object, long, long, long, int, boolean, boolean, c.q.a.b.o0.b0, c.q.a.b.k0.e0.j, com.google.android.exoplayer2.drm.DrmInitData, byte[], byte[]):void");
    }

    /* renamed from: h */
    public static C3122h m6655h(C3122h hVar, byte[] bArr, byte[] bArr2) {
        return bArr != null ? new C2942c(hVar, bArr, bArr2) : hVar;
    }

    /* renamed from: a */
    public void mo19121a() {
        this.f4885E = true;
    }

    /* renamed from: g */
    public boolean mo19123g() {
        return this.f4886F;
    }

    /* renamed from: i */
    public void mo19341i(C2959n nVar) {
        this.f4881A = nVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003f A[Catch:{ all -> 0x0052, all -> 0x0072 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0046 A[SYNTHETIC, Splitter:B:18:0x0046] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001b  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19342j() {
        /*
            r7 = this;
            boolean r0 = r7.f4892o
            r1 = 0
            if (r0 == 0) goto L_0x000d
            c.q.a.b.n0.j r0 = r7.f4553a
            int r2 = r7.f4883C
            if (r2 == 0) goto L_0x0016
            r2 = 1
            goto L_0x0017
        L_0x000d:
            c.q.a.b.n0.j r0 = r7.f4553a
            int r2 = r7.f4883C
            long r2 = (long) r2
            c.q.a.b.n0.j r0 = r0.mo19893d(r2)
        L_0x0016:
            r2 = r1
        L_0x0017:
            boolean r3 = r7.f4893p
            if (r3 != 0) goto L_0x0021
            c.q.a.b.o0.b0 r3 = r7.f4895r
            r3.mo19950j()
            goto L_0x0037
        L_0x0021:
            c.q.a.b.o0.b0 r3 = r7.f4895r
            long r3 = r3.mo19945c()
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0037
            c.q.a.b.o0.b0 r3 = r7.f4895r
            long r4 = r7.f4558f
            r3.mo19949h(r4)
        L_0x0037:
            c.q.a.b.n0.u r3 = r7.f4560h     // Catch:{ all -> 0x0072 }
            c.q.a.b.f0.d r0 = r7.mo19345m(r3, r0)     // Catch:{ all -> 0x0072 }
            if (r2 == 0) goto L_0x0044
            int r2 = r7.f4883C     // Catch:{ all -> 0x0072 }
            r0.mo18528g(r2)     // Catch:{ all -> 0x0072 }
        L_0x0044:
            if (r1 != 0) goto L_0x0060
            boolean r1 = r7.f4885E     // Catch:{ all -> 0x0052 }
            if (r1 != 0) goto L_0x0060
            c.q.a.b.f0.g r1 = r7.f4903z     // Catch:{ all -> 0x0052 }
            r2 = 0
            int r1 = r1.mo18548e(r0, r2)     // Catch:{ all -> 0x0052 }
            goto L_0x0044
        L_0x0052:
            r1 = move-exception
            long r2 = r0.getPosition()     // Catch:{ all -> 0x0072 }
            c.q.a.b.n0.j r0 = r7.f4553a     // Catch:{ all -> 0x0072 }
            long r4 = r0.f5723d     // Catch:{ all -> 0x0072 }
            long r2 = r2 - r4
            int r0 = (int) r2     // Catch:{ all -> 0x0072 }
            r7.f4883C = r0     // Catch:{ all -> 0x0072 }
            throw r1     // Catch:{ all -> 0x0072 }
        L_0x0060:
            long r0 = r0.getPosition()     // Catch:{ all -> 0x0072 }
            c.q.a.b.n0.j r2 = r7.f4553a     // Catch:{ all -> 0x0072 }
            long r2 = r2.f5723d     // Catch:{ all -> 0x0072 }
            long r0 = r0 - r2
            int r0 = (int) r0     // Catch:{ all -> 0x0072 }
            r7.f4883C = r0     // Catch:{ all -> 0x0072 }
            c.q.a.b.n0.u r0 = r7.f4560h
            p040c.p200q.p201a.p219b.p261o0.C3152e0.m7805j(r0)
            return
        L_0x0072:
            r0 = move-exception
            c.q.a.b.n0.u r1 = r7.f4560h
            p040c.p200q.p201a.p219b.p261o0.C3152e0.m7805j(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p241k0.p246e0.C2953j.mo19342j():void");
    }

    /* renamed from: k */
    public final void mo19343k() {
        C3125j jVar;
        C2671d m;
        if (!this.f4884D && (jVar = this.f4891n) != null) {
            try {
                m = mo19345m(this.f4890m, jVar.mo19893d((long) this.f4882B));
                int i = 0;
                while (i == 0) {
                    if (this.f4885E) {
                        break;
                    }
                    i = this.f4903z.mo18548e(m, (C2681n) null);
                }
                this.f4882B = (int) (m.getPosition() - this.f4891n.f5723d);
                C3152e0.m7805j(this.f4890m);
                this.f4884D = true;
            } catch (Throwable th) {
                C3152e0.m7805j(this.f4890m);
                throw th;
            }
        }
    }

    /* renamed from: l */
    public final long mo19344l(C2675h hVar) {
        hVar.mo18527f();
        try {
            hVar.mo18531i(this.f4902y.f5877a, 0, 10);
            this.f4902y.mo20002H(10);
            if (this.f4902y.mo19996B() != C2837b.f4414b) {
                return -9223372036854775807L;
            }
            this.f4902y.mo20007M(3);
            int x = this.f4902y.mo20031x();
            int i = x + 10;
            if (i > this.f4902y.mo20009b()) {
                C3173t tVar = this.f4902y;
                byte[] bArr = tVar.f5877a;
                tVar.mo20002H(i);
                System.arraycopy(bArr, 0, this.f4902y.f5877a, 0, 10);
            }
            hVar.mo18531i(this.f4902y.f5877a, 10, x);
            Metadata c = this.f4901x.mo18908c(this.f4902y.f5877a, x);
            if (c == null) {
                return -9223372036854775807L;
            }
            int b = c.mo24053b();
            for (int i2 = 0; i2 < b; i2++) {
                Metadata.Entry a = c.mo24052a(i2);
                if (a instanceof PrivFrame) {
                    PrivFrame privFrame = (PrivFrame) a;
                    if ("com.apple.streaming.transportStreamTimestamp".equals(privFrame.f7770l)) {
                        System.arraycopy(privFrame.f7771m, 0, this.f4902y.f5877a, 0, 8);
                        this.f4902y.mo20002H(8);
                        return this.f4902y.mo20025r() & 8589934591L;
                    }
                }
            }
            return -9223372036854775807L;
        } catch (EOFException unused) {
        }
    }

    public void load() {
        mo19343k();
        if (!this.f4885E) {
            if (!this.f4894q) {
                mo19342j();
            }
            this.f4886F = true;
        }
    }

    /* renamed from: m */
    public final C2671d mo19345m(C3122h hVar, C3125j jVar) {
        C3125j jVar2 = jVar;
        C2671d dVar = new C2671d(hVar, jVar2.f5723d, hVar.mo19309c(jVar));
        if (this.f4903z != null) {
            return dVar;
        }
        long l = mo19344l(dVar);
        dVar.mo18527f();
        C2671d dVar2 = dVar;
        Pair<C2674g, Boolean> a = this.f4897t.mo19316a(this.f4900w, jVar2.f5720a, this.f4555c, this.f4898u, this.f4899v, this.f4895r, hVar.mo19311d(), dVar2);
        C2674g gVar = (C2674g) a.first;
        this.f4903z = gVar;
        boolean z = true;
        boolean z2 = gVar == this.f4900w;
        if (((Boolean) a.second).booleanValue()) {
            this.f4881A.mo19380X(l != -9223372036854775807L ? this.f4895r.mo19944b(l) : this.f4558f);
        }
        if (!z2 || this.f4891n == null) {
            z = false;
        }
        this.f4884D = z;
        this.f4881A.mo19361D(this.f4887j, this.f4896s, z2);
        if (z2) {
            return dVar2;
        }
        this.f4903z.mo18549f(this.f4881A);
        return dVar2;
    }
}
