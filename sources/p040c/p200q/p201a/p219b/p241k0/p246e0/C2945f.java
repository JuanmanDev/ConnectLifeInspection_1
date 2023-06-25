package p040c.p200q.p201a.p219b.p241k0.p246e0;

import android.net.Uri;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import p040c.p200q.p201a.p219b.p241k0.p243c0.C2870b;
import p040c.p200q.p201a.p219b.p241k0.p243c0.C2872d;
import p040c.p200q.p201a.p219b.p241k0.p243c0.C2882j;
import p040c.p200q.p201a.p219b.p241k0.p243c0.C2884l;
import p040c.p200q.p201a.p219b.p241k0.p243c0.C2885m;
import p040c.p200q.p201a.p219b.p241k0.p246e0.p247q.C2968d;
import p040c.p200q.p201a.p219b.p241k0.p246e0.p247q.C2970e;
import p040c.p200q.p201a.p219b.p259m0.C3101b;
import p040c.p200q.p201a.p219b.p259m0.C3107e;
import p040c.p200q.p201a.p219b.p260n0.C3122h;
import p040c.p200q.p201a.p219b.p260n0.C3125j;
import p040c.p200q.p201a.p219b.p260n0.C3141v;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

/* renamed from: c.q.a.b.k0.e0.f */
/* compiled from: HlsChunkSource */
public class C2945f {

    /* renamed from: a */
    public final C2951h f4853a;

    /* renamed from: b */
    public final C3122h f4854b;

    /* renamed from: c */
    public final C3122h f4855c;

    /* renamed from: d */
    public final C2962o f4856d;

    /* renamed from: e */
    public final C2968d.C2969a[] f4857e;

    /* renamed from: f */
    public final HlsPlaylistTracker f4858f;

    /* renamed from: g */
    public final TrackGroup f4859g;

    /* renamed from: h */
    public final List<Format> f4860h;

    /* renamed from: i */
    public boolean f4861i;

    /* renamed from: j */
    public byte[] f4862j;

    /* renamed from: k */
    public IOException f4863k;

    /* renamed from: l */
    public C2968d.C2969a f4864l;

    /* renamed from: m */
    public boolean f4865m;

    /* renamed from: n */
    public Uri f4866n;

    /* renamed from: o */
    public byte[] f4867o;

    /* renamed from: p */
    public String f4868p;

    /* renamed from: q */
    public byte[] f4869q;

    /* renamed from: r */
    public C3107e f4870r;

    /* renamed from: s */
    public long f4871s = -9223372036854775807L;

    /* renamed from: t */
    public boolean f4872t;

    /* renamed from: c.q.a.b.k0.e0.f$a */
    /* compiled from: HlsChunkSource */
    public static final class C2946a extends C2882j {

        /* renamed from: k */
        public final String f4873k;

        /* renamed from: l */
        public byte[] f4874l;

        public C2946a(C3122h hVar, C3125j jVar, Format format, int i, Object obj, byte[] bArr, String str) {
            super(hVar, jVar, 3, format, i, obj, bArr);
            this.f4873k = str;
        }

        /* renamed from: f */
        public void mo19125f(byte[] bArr, int i) {
            this.f4874l = Arrays.copyOf(bArr, i);
        }

        /* renamed from: i */
        public byte[] mo19335i() {
            return this.f4874l;
        }
    }

    /* renamed from: c.q.a.b.k0.e0.f$b */
    /* compiled from: HlsChunkSource */
    public static final class C2947b {

        /* renamed from: a */
        public C2872d f4875a;

        /* renamed from: b */
        public boolean f4876b;

        /* renamed from: c */
        public C2968d.C2969a f4877c;

        public C2947b() {
            mo19336a();
        }

        /* renamed from: a */
        public void mo19336a() {
            this.f4875a = null;
            this.f4876b = false;
            this.f4877c = null;
        }
    }

    /* renamed from: c.q.a.b.k0.e0.f$c */
    /* compiled from: HlsChunkSource */
    public static final class C2948c extends C2870b {
        public C2948c(C2970e eVar, long j, int i) {
            super((long) i, (long) (eVar.f5044o.size() - 1));
        }
    }

    /* renamed from: c.q.a.b.k0.e0.f$d */
    /* compiled from: HlsChunkSource */
    public static final class C2949d extends C3101b {

        /* renamed from: g */
        public int f4878g;

        public C2949d(TrackGroup trackGroup, int[] iArr) {
            super(trackGroup, iArr);
            this.f4878g = mo19827i(trackGroup.mo24200a(0));
        }

        /* renamed from: b */
        public int mo19337b() {
            return this.f4878g;
        }

        /* renamed from: j */
        public void mo19338j(long j, long j2, long j3, List<? extends C2884l> list, C2885m[] mVarArr) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (mo19832r(this.f4878g, elapsedRealtime)) {
                for (int i = this.f5667b - 1; i >= 0; i--) {
                    if (!mo19832r(i, elapsedRealtime)) {
                        this.f4878g = i;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        /* renamed from: m */
        public int mo19339m() {
            return 0;
        }

        /* renamed from: p */
        public Object mo19340p() {
            return null;
        }
    }

    public C2945f(C2951h hVar, HlsPlaylistTracker hlsPlaylistTracker, C2968d.C2969a[] aVarArr, C2950g gVar, @Nullable C3141v vVar, C2962o oVar, List<Format> list) {
        this.f4853a = hVar;
        this.f4858f = hlsPlaylistTracker;
        this.f4857e = aVarArr;
        this.f4856d = oVar;
        this.f4860h = list;
        Format[] formatArr = new Format[aVarArr.length];
        int[] iArr = new int[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            formatArr[i] = aVarArr[i].f5032b;
            iArr[i] = i;
        }
        C3122h a = gVar.mo19315a(1);
        this.f4854b = a;
        if (vVar != null) {
            a.mo19308b(vVar);
        }
        this.f4855c = gVar.mo19315a(3);
        TrackGroup trackGroup = new TrackGroup(formatArr);
        this.f4859g = trackGroup;
        this.f4870r = new C2949d(trackGroup, iArr);
    }

    /* renamed from: a */
    public final void mo19318a() {
        this.f4866n = null;
        this.f4867o = null;
        this.f4868p = null;
        this.f4869q = null;
    }

    /* renamed from: b */
    public C2885m[] mo19319b(@Nullable C2953j jVar, long j) {
        int i;
        C2953j jVar2 = jVar;
        if (jVar2 == null) {
            i = -1;
        } else {
            i = this.f4859g.mo24201b(jVar2.f4555c);
        }
        int i2 = i;
        int length = this.f4870r.length();
        C2885m[] mVarArr = new C2885m[length];
        for (int i3 = 0; i3 < length; i3++) {
            int g = this.f4870r.mo19825g(i3);
            C2968d.C2969a aVar = this.f4857e[g];
            if (!this.f4858f.mo19418i(aVar)) {
                mVarArr[i3] = C2885m.f4620a;
            } else {
                C2970e j2 = this.f4858f.mo19419j(aVar, false);
                long b = j2.f5035f - this.f4858f.mo19411b();
                long j3 = b;
                long c = mo19320c(jVar, g != i2, j2, b, j);
                long j4 = j2.f5038i;
                if (c < j4) {
                    mVarArr[i3] = C2885m.f4620a;
                } else {
                    mVarArr[i3] = new C2948c(j2, j3, (int) (c - j4));
                }
            }
        }
        return mVarArr;
    }

    /* renamed from: c */
    public final long mo19320c(@Nullable C2953j jVar, boolean z, C2970e eVar, long j, long j2) {
        long d;
        long j3;
        if (jVar != null && !z) {
            return jVar.mo19122f();
        }
        long j4 = eVar.f5045p + j;
        if (jVar != null && !this.f4865m) {
            j2 = jVar.f4558f;
        }
        if (eVar.f5041l || j2 < j4) {
            d = (long) C3152e0.m7793d(eVar.f5044o, Long.valueOf(j2 - j), true, !this.f4858f.mo19412c() || jVar == null);
            j3 = eVar.f5038i;
        } else {
            d = eVar.f5038i;
            j3 = (long) eVar.f5044o.size();
        }
        return d + j3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008c  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo19321d(long r40, long r42, java.util.List<p040c.p200q.p201a.p219b.p241k0.p246e0.C2953j> r44, p040c.p200q.p201a.p219b.p241k0.p246e0.C2945f.C2947b r45) {
        /*
            r39 = this;
            r8 = r39
            r6 = r42
            r9 = r45
            boolean r0 = r44.isEmpty()
            r11 = 1
            if (r0 == 0) goto L_0x0011
            r1 = r44
            r4 = 0
            goto L_0x001f
        L_0x0011:
            int r0 = r44.size()
            int r0 = r0 - r11
            r1 = r44
            java.lang.Object r0 = r1.get(r0)
            c.q.a.b.k0.e0.j r0 = (p040c.p200q.p201a.p219b.p241k0.p246e0.C2953j) r0
            r4 = r0
        L_0x001f:
            if (r4 != 0) goto L_0x0023
            r0 = -1
            goto L_0x002b
        L_0x0023:
            com.google.android.exoplayer2.source.TrackGroup r0 = r8.f4859g
            com.google.android.exoplayer2.Format r2 = r4.f4555c
            int r0 = r0.mo24201b(r2)
        L_0x002b:
            r5 = r0
            long r2 = r6 - r40
            long r12 = r39.mo19330m(r40)
            if (r4 == 0) goto L_0x0055
            boolean r0 = r8.f4865m
            if (r0 != 0) goto L_0x0055
            long r14 = r4.mo19073c()
            long r2 = r2 - r14
            r10 = 0
            long r2 = java.lang.Math.max(r10, r2)
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x0055
            long r12 = r12 - r14
            long r10 = java.lang.Math.max(r10, r12)
            r15 = r2
            r17 = r10
            goto L_0x0058
        L_0x0055:
            r15 = r2
            r17 = r12
        L_0x0058:
            c.q.a.b.k0.c0.m[] r20 = r8.mo19319b(r4, r6)
            c.q.a.b.m0.e r12 = r8.f4870r
            r13 = r40
            r19 = r44
            r12.mo19338j(r13, r15, r17, r19, r20)
            c.q.a.b.m0.e r0 = r8.f4870r
            int r10 = r0.mo19828k()
            r11 = 0
            if (r5 == r10) goto L_0x0070
            r12 = 1
            goto L_0x0071
        L_0x0070:
            r12 = r11
        L_0x0071:
            c.q.a.b.k0.e0.q.d$a[] r0 = r8.f4857e
            r13 = r0[r10]
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker r0 = r8.f4858f
            boolean r0 = r0.mo19418i(r13)
            if (r0 != 0) goto L_0x008c
            r9.f4877c = r13
            boolean r0 = r8.f4872t
            c.q.a.b.k0.e0.q.d$a r1 = r8.f4864l
            if (r1 != r13) goto L_0x0086
            r11 = 1
        L_0x0086:
            r0 = r0 & r11
            r8.f4872t = r0
            r8.f4864l = r13
            return
        L_0x008c:
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker r0 = r8.f4858f
            r1 = 1
            c.q.a.b.k0.e0.q.e r14 = r0.mo19419j(r13, r1)
            boolean r0 = r14.f5059c
            r8.f4865m = r0
            r8.mo19334q(r14)
            long r0 = r14.f5035f
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker r2 = r8.f4858f
            long r2 = r2.mo19411b()
            long r15 = r0 - r2
            r0 = r39
            r1 = r4
            r2 = r12
            r3 = r14
            r31 = r4
            r17 = r5
            r4 = r15
            r6 = r42
            long r0 = r0.mo19320c(r1, r2, r3, r4, r6)
            long r2 = r14.f5038i
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x00e4
            if (r31 == 0) goto L_0x00dc
            if (r12 == 0) goto L_0x00dc
            c.q.a.b.k0.e0.q.d$a[] r0 = r8.f4857e
            r0 = r0[r17]
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker r1 = r8.f4858f
            r2 = 1
            c.q.a.b.k0.e0.q.e r14 = r1.mo19419j(r0, r2)
            long r1 = r14.f5035f
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker r3 = r8.f4858f
            long r3 = r3.mo19411b()
            long r15 = r1 - r3
            long r1 = r31.mo19122f()
            r25 = r1
            r3 = r17
            goto L_0x00e8
        L_0x00dc:
            com.google.android.exoplayer2.source.BehindLiveWindowException r0 = new com.google.android.exoplayer2.source.BehindLiveWindowException
            r0.<init>()
            r8.f4863k = r0
            return
        L_0x00e4:
            r25 = r0
            r3 = r10
            r0 = r13
        L_0x00e8:
            long r1 = r14.f5038i
            long r1 = r25 - r1
            int r1 = (int) r1
            java.util.List<c.q.a.b.k0.e0.q.e$a> r2 = r14.f5044o
            int r2 = r2.size()
            if (r1 < r2) goto L_0x010e
            boolean r1 = r14.f5041l
            if (r1 == 0) goto L_0x00fd
            r1 = 1
            r9.f4876b = r1
            goto L_0x010d
        L_0x00fd:
            r1 = 1
            r9.f4877c = r0
            boolean r2 = r8.f4872t
            c.q.a.b.k0.e0.q.d$a r3 = r8.f4864l
            if (r3 != r0) goto L_0x0107
            r11 = r1
        L_0x0107:
            r1 = r2 & r11
            r8.f4872t = r1
            r8.f4864l = r0
        L_0x010d:
            return
        L_0x010e:
            r8.f4872t = r11
            r2 = 0
            r8.f4864l = r2
            java.util.List<c.q.a.b.k0.e0.q.e$a> r4 = r14.f5044o
            java.lang.Object r1 = r4.get(r1)
            c.q.a.b.k0.e0.q.e$a r1 = (p040c.p200q.p201a.p219b.p241k0.p246e0.p247q.C2970e.C2971a) r1
            java.lang.String r4 = r1.f5052q
            if (r4 == 0) goto L_0x0159
            java.lang.String r5 = r14.f5057a
            android.net.Uri r4 = p040c.p200q.p201a.p219b.p261o0.C3150d0.m7752d(r5, r4)
            android.net.Uri r5 = r8.f4866n
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0147
            java.lang.String r2 = r1.f5053r
            c.q.a.b.m0.e r0 = r8.f4870r
            int r5 = r0.mo19339m()
            c.q.a.b.m0.e r0 = r8.f4870r
            java.lang.Object r6 = r0.mo19340p()
            r0 = r39
            r1 = r4
            r4 = r5
            r5 = r6
            c.q.a.b.k0.e0.f$a r0 = r0.mo19326i(r1, r2, r3, r4, r5)
            r9.f4875a = r0
            return
        L_0x0147:
            java.lang.String r3 = r1.f5053r
            java.lang.String r5 = r8.f4868p
            boolean r3 = p040c.p200q.p201a.p219b.p261o0.C3152e0.m7789b(r3, r5)
            if (r3 != 0) goto L_0x015c
            java.lang.String r3 = r1.f5053r
            byte[] r5 = r8.f4867o
            r8.mo19332o(r4, r3, r5)
            goto L_0x015c
        L_0x0159:
            r39.mo19318a()
        L_0x015c:
            c.q.a.b.k0.e0.q.e$a r3 = r1.f5047l
            if (r3 == 0) goto L_0x017a
            java.lang.String r2 = r14.f5057a
            java.lang.String r4 = r3.f5046e
            android.net.Uri r18 = p040c.p200q.p201a.p219b.p261o0.C3150d0.m7752d(r2, r4)
            c.q.a.b.n0.j r10 = new c.q.a.b.n0.j
            long r4 = r3.f5054s
            long r2 = r3.f5055t
            r23 = 0
            r17 = r10
            r19 = r4
            r21 = r2
            r17.<init>(r18, r19, r21, r23)
            goto L_0x017b
        L_0x017a:
            r10 = r2
        L_0x017b:
            long r2 = r1.f5050o
            long r2 = r2 + r15
            r21 = r2
            int r4 = r14.f5037h
            int r5 = r1.f5049n
            int r4 = r4 + r5
            r27 = r4
            c.q.a.b.k0.e0.o r5 = r8.f4856d
            c.q.a.b.o0.b0 r30 = r5.mo19393a(r4)
            java.lang.String r4 = r14.f5057a
            java.lang.String r5 = r1.f5046e
            android.net.Uri r33 = p040c.p200q.p201a.p219b.p261o0.C3150d0.m7752d(r4, r5)
            c.q.a.b.n0.j r32 = new c.q.a.b.n0.j
            r15 = r32
            long r4 = r1.f5054s
            long r6 = r1.f5055t
            r38 = 0
            r34 = r4
            r36 = r6
            r32.<init>(r33, r34, r36, r38)
            c.q.a.b.k0.e0.j r4 = new c.q.a.b.k0.e0.j
            r12 = r4
            c.q.a.b.k0.e0.h r13 = r8.f4853a
            c.q.a.b.n0.h r14 = r8.f4854b
            java.util.List<com.google.android.exoplayer2.Format> r5 = r8.f4860h
            r18 = r5
            c.q.a.b.m0.e r5 = r8.f4870r
            int r19 = r5.mo19339m()
            c.q.a.b.m0.e r5 = r8.f4870r
            java.lang.Object r20 = r5.mo19340p()
            long r5 = r1.f5048m
            long r23 = r2 + r5
            boolean r2 = r1.f5056u
            r28 = r2
            boolean r2 = r8.f4861i
            r29 = r2
            com.google.android.exoplayer2.drm.DrmInitData r1 = r1.f5051p
            r32 = r1
            byte[] r1 = r8.f4867o
            r33 = r1
            byte[] r1 = r8.f4869q
            r34 = r1
            r16 = r10
            r17 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r23, r25, r27, r28, r29, r30, r31, r32, r33, r34)
            r9.f4875a = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p241k0.p246e0.C2945f.mo19321d(long, long, java.util.List, c.q.a.b.k0.e0.f$b):void");
    }

    /* renamed from: e */
    public TrackGroup mo19322e() {
        return this.f4859g;
    }

    /* renamed from: f */
    public C3107e mo19323f() {
        return this.f4870r;
    }

    /* renamed from: g */
    public boolean mo19324g(C2872d dVar, long j) {
        C3107e eVar = this.f4870r;
        return eVar.mo19821c(eVar.mo19831q(this.f4859g.mo24201b(dVar.f4555c)), j);
    }

    /* renamed from: h */
    public void mo19325h() {
        IOException iOException = this.f4863k;
        if (iOException == null) {
            C2968d.C2969a aVar = this.f4864l;
            if (aVar != null && this.f4872t) {
                this.f4858f.mo19420m(aVar);
                return;
            }
            return;
        }
        throw iOException;
    }

    /* renamed from: i */
    public final C2946a mo19326i(Uri uri, String str, int i, int i2, Object obj) {
        return new C2946a(this.f4855c, new C3125j(uri, 0, -1, (String) null, 1), this.f4857e[i].f5032b, i2, obj, this.f4862j, str);
    }

    /* renamed from: j */
    public void mo19327j(C2872d dVar) {
        if (dVar instanceof C2946a) {
            C2946a aVar = (C2946a) dVar;
            this.f4862j = aVar.mo19126g();
            mo19332o(aVar.f4553a.f5720a, aVar.f4873k, aVar.mo19335i());
        }
    }

    /* renamed from: k */
    public boolean mo19328k(C2968d.C2969a aVar, long j) {
        int q;
        int b = this.f4859g.mo24201b(aVar.f5032b);
        if (b == -1 || (q = this.f4870r.mo19831q(b)) == -1) {
            return true;
        }
        this.f4872t = (this.f4864l == aVar) | this.f4872t;
        if (j == -9223372036854775807L || this.f4870r.mo19821c(q, j)) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public void mo19329l() {
        this.f4863k = null;
    }

    /* renamed from: m */
    public final long mo19330m(long j) {
        if (this.f4871s != -9223372036854775807L) {
            return this.f4871s - j;
        }
        return -9223372036854775807L;
    }

    /* renamed from: n */
    public void mo19331n(C3107e eVar) {
        this.f4870r = eVar;
    }

    /* renamed from: o */
    public final void mo19332o(Uri uri, String str, byte[] bArr) {
        byte[] byteArray = new BigInteger(C3152e0.m7810l0(str).startsWith("0x") ? str.substring(2) : str, 16).toByteArray();
        byte[] bArr2 = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr2, (16 - byteArray.length) + length, byteArray.length - length);
        this.f4866n = uri;
        this.f4867o = bArr;
        this.f4868p = str;
        this.f4869q = bArr2;
    }

    /* renamed from: p */
    public void mo19333p(boolean z) {
        this.f4861i = z;
    }

    /* renamed from: q */
    public final void mo19334q(C2970e eVar) {
        long j;
        if (eVar.f5041l) {
            j = -9223372036854775807L;
        } else {
            j = eVar.mo19439e() - this.f4858f.mo19411b();
        }
        this.f4871s = j;
    }
}
