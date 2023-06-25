package p040c.p200q.p201a.p219b.p224f0.p229v;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.camera.core.VideoCapture;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.mp4.MdtaMetadataEntry;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.video.ColorInfo;
import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlinx.coroutines.EventLoop_commonKt;
import p040c.p200q.p201a.p219b.p224f0.p229v.C2718c;
import p040c.p200q.p201a.p219b.p261o0.C3151e;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3163m;
import p040c.p200q.p201a.p219b.p261o0.C3166p;
import p040c.p200q.p201a.p219b.p261o0.C3173t;
import p040c.p200q.p201a.p219b.p262p0.C3190h;
import p040c.p200q.p201a.p219b.p262p0.C3191i;

/* renamed from: c.q.a.b.f0.v.d */
/* compiled from: AtomParsers */
public final class C2721d {

    /* renamed from: a */
    public static final int f3770a = C3152e0.m7764D("vide");

    /* renamed from: b */
    public static final int f3771b = C3152e0.m7764D("soun");

    /* renamed from: c */
    public static final int f3772c = C3152e0.m7764D("text");

    /* renamed from: d */
    public static final int f3773d = C3152e0.m7764D("sbtl");

    /* renamed from: e */
    public static final int f3774e = C3152e0.m7764D("subt");

    /* renamed from: f */
    public static final int f3775f = C3152e0.m7764D("clcp");

    /* renamed from: g */
    public static final int f3776g = C3152e0.m7764D("meta");

    /* renamed from: h */
    public static final int f3777h = C3152e0.m7764D("mdta");

    /* renamed from: i */
    public static final byte[] f3778i = C3152e0.m7773M("OpusHead");

    /* renamed from: c.q.a.b.f0.v.d$a */
    /* compiled from: AtomParsers */
    public static final class C2722a {

        /* renamed from: a */
        public final int f3779a;

        /* renamed from: b */
        public int f3780b;

        /* renamed from: c */
        public int f3781c;

        /* renamed from: d */
        public long f3782d;

        /* renamed from: e */
        public final boolean f3783e;

        /* renamed from: f */
        public final C3173t f3784f;

        /* renamed from: g */
        public final C3173t f3785g;

        /* renamed from: h */
        public int f3786h;

        /* renamed from: i */
        public int f3787i;

        public C2722a(C3173t tVar, C3173t tVar2, boolean z) {
            this.f3785g = tVar;
            this.f3784f = tVar2;
            this.f3783e = z;
            tVar2.mo20006L(12);
            this.f3779a = tVar2.mo19997C();
            tVar.mo20006L(12);
            this.f3787i = tVar.mo19997C();
            C3151e.m7760h(tVar.mo20017j() != 1 ? false : true, "first_chunk must be 1");
            this.f3780b = -1;
        }

        /* renamed from: a */
        public boolean mo18648a() {
            long j;
            int i = this.f3780b + 1;
            this.f3780b = i;
            if (i == this.f3779a) {
                return false;
            }
            if (this.f3783e) {
                j = this.f3784f.mo19998D();
            } else {
                j = this.f3784f.mo19995A();
            }
            this.f3782d = j;
            if (this.f3780b == this.f3786h) {
                this.f3781c = this.f3785g.mo19997C();
                this.f3785g.mo20007M(4);
                int i2 = this.f3787i - 1;
                this.f3787i = i2;
                this.f3786h = i2 > 0 ? this.f3785g.mo19997C() - 1 : -1;
            }
            return true;
        }
    }

    /* renamed from: c.q.a.b.f0.v.d$b */
    /* compiled from: AtomParsers */
    public interface C2723b {
        /* renamed from: a */
        boolean mo18649a();

        /* renamed from: b */
        int mo18650b();

        /* renamed from: c */
        int mo18651c();
    }

    /* renamed from: c.q.a.b.f0.v.d$c */
    /* compiled from: AtomParsers */
    public static final class C2724c {

        /* renamed from: a */
        public final C2742m[] f3788a;

        /* renamed from: b */
        public Format f3789b;

        /* renamed from: c */
        public int f3790c;

        /* renamed from: d */
        public int f3791d = 0;

        public C2724c(int i) {
            this.f3788a = new C2742m[i];
        }
    }

    /* renamed from: c.q.a.b.f0.v.d$d */
    /* compiled from: AtomParsers */
    public static final class C2725d implements C2723b {

        /* renamed from: a */
        public final int f3792a = this.f3794c.mo19997C();

        /* renamed from: b */
        public final int f3793b = this.f3794c.mo19997C();

        /* renamed from: c */
        public final C3173t f3794c;

        public C2725d(C2718c.C2720b bVar) {
            C3173t tVar = bVar.f3769W0;
            this.f3794c = tVar;
            tVar.mo20006L(12);
        }

        /* renamed from: a */
        public boolean mo18649a() {
            return this.f3792a != 0;
        }

        /* renamed from: b */
        public int mo18650b() {
            return this.f3793b;
        }

        /* renamed from: c */
        public int mo18651c() {
            int i = this.f3792a;
            return i == 0 ? this.f3794c.mo19997C() : i;
        }
    }

    /* renamed from: c.q.a.b.f0.v.d$e */
    /* compiled from: AtomParsers */
    public static final class C2726e implements C2723b {

        /* renamed from: a */
        public final C3173t f3795a;

        /* renamed from: b */
        public final int f3796b = this.f3795a.mo19997C();

        /* renamed from: c */
        public final int f3797c = (this.f3795a.mo19997C() & 255);

        /* renamed from: d */
        public int f3798d;

        /* renamed from: e */
        public int f3799e;

        public C2726e(C2718c.C2720b bVar) {
            C3173t tVar = bVar.f3769W0;
            this.f3795a = tVar;
            tVar.mo20006L(12);
        }

        /* renamed from: a */
        public boolean mo18649a() {
            return false;
        }

        /* renamed from: b */
        public int mo18650b() {
            return this.f3796b;
        }

        /* renamed from: c */
        public int mo18651c() {
            int i = this.f3797c;
            if (i == 8) {
                return this.f3795a.mo20032y();
            }
            if (i == 16) {
                return this.f3795a.mo19999E();
            }
            int i2 = this.f3798d;
            this.f3798d = i2 + 1;
            if (i2 % 2 != 0) {
                return this.f3799e & 15;
            }
            int y = this.f3795a.mo20032y();
            this.f3799e = y;
            return (y & 240) >> 4;
        }
    }

    /* renamed from: c.q.a.b.f0.v.d$f */
    /* compiled from: AtomParsers */
    public static final class C2727f {

        /* renamed from: a */
        public final int f3800a;

        /* renamed from: b */
        public final long f3801b;

        /* renamed from: c */
        public final int f3802c;

        public C2727f(int i, long j, int i2) {
            this.f3800a = i;
            this.f3801b = j;
            this.f3802c = i2;
        }
    }

    /* renamed from: a */
    public static boolean m5472a(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length - 1;
        int n = C3152e0.m7813n(3, 0, length);
        int n2 = C3152e0.m7813n(jArr.length - 3, 0, length);
        if (jArr[0] > j2 || j2 >= jArr[n] || jArr[n2] >= j3 || j3 > j) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static int m5473b(C3173t tVar, int i, int i2) {
        int c = tVar.mo20010c();
        while (c - i < i2) {
            tVar.mo20006L(c);
            int j = tVar.mo20017j();
            C3151e.m7754b(j > 0, "childAtomSize should be positive");
            if (tVar.mo20017j() == C2718c.f3686K) {
                return c;
            }
            c += j;
        }
        return -1;
    }

    /* renamed from: c */
    public static int m5474c(int i) {
        if (i == f3771b) {
            return 1;
        }
        if (i == f3770a) {
            return 2;
        }
        if (i == f3772c || i == f3773d || i == f3774e || i == f3775f) {
            return 3;
        }
        return i == f3776g ? 4 : -1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.String} */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0256: MOVE  (r8v4 java.lang.String) = (r26v0 java.lang.String)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:122)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:34)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:73)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    public static void m5475d(p040c.p200q.p201a.p219b.p261o0.C3173t r28, int r29, int r30, int r31, int r32, java.lang.String r33, boolean r34, com.google.android.exoplayer2.drm.DrmInitData r35, p040c.p200q.p201a.p219b.p224f0.p229v.C2721d.C2724c r36, int r37) {
        /*
            r0 = r28
            r1 = r30
            r2 = r31
            r14 = r33
            r3 = r35
            r15 = r36
            int r4 = r1 + 8
            r5 = 8
            int r4 = r4 + r5
            r0.mo20006L(r4)
            r4 = 6
            r13 = 0
            if (r34 == 0) goto L_0x0020
            int r5 = r28.mo19999E()
            r0.mo20007M(r4)
            goto L_0x0024
        L_0x0020:
            r0.mo20007M(r5)
            r5 = r13
        L_0x0024:
            r12 = 2
            r6 = 16
            r11 = 1
            if (r5 == 0) goto L_0x0046
            if (r5 != r11) goto L_0x002d
            goto L_0x0046
        L_0x002d:
            if (r5 != r12) goto L_0x0045
            r0.mo20007M(r6)
            double r4 = r28.mo20016i()
            long r4 = java.lang.Math.round(r4)
            int r4 = (int) r4
            int r5 = r28.mo19997C()
            r6 = 20
            r0.mo20007M(r6)
            goto L_0x0057
        L_0x0045:
            return
        L_0x0046:
            int r7 = r28.mo19999E()
            r0.mo20007M(r4)
            int r4 = r28.mo20033z()
            if (r5 != r11) goto L_0x0056
            r0.mo20007M(r6)
        L_0x0056:
            r5 = r7
        L_0x0057:
            int r6 = r28.mo20010c()
            int r7 = p040c.p200q.p201a.p219b.p224f0.p229v.C2718c.f3716b0
            r16 = 0
            r8 = r29
            if (r8 != r7) goto L_0x008b
            android.util.Pair r7 = m5487p(r0, r1, r2)
            if (r7 == 0) goto L_0x0088
            java.lang.Object r8 = r7.first
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            if (r3 != 0) goto L_0x0076
            r3 = r16
            goto L_0x0080
        L_0x0076:
            java.lang.Object r9 = r7.second
            c.q.a.b.f0.v.m r9 = (p040c.p200q.p201a.p219b.p224f0.p229v.C2742m) r9
            java.lang.String r9 = r9.f3929b
            com.google.android.exoplayer2.drm.DrmInitData r3 = r3.mo23982c(r9)
        L_0x0080:
            c.q.a.b.f0.v.m[] r9 = r15.f3788a
            java.lang.Object r7 = r7.second
            c.q.a.b.f0.v.m r7 = (p040c.p200q.p201a.p219b.p224f0.p229v.C2742m) r7
            r9[r37] = r7
        L_0x0088:
            r0.mo20006L(r6)
        L_0x008b:
            r10 = r3
            int r3 = p040c.p200q.p201a.p219b.p224f0.p229v.C2718c.f3741o
            java.lang.String r9 = "audio/raw"
            if (r8 != r3) goto L_0x0096
            java.lang.String r3 = "audio/ac3"
            goto L_0x00fe
        L_0x0096:
            int r3 = p040c.p200q.p201a.p219b.p224f0.p229v.C2718c.f3745q
            if (r8 != r3) goto L_0x009e
            java.lang.String r3 = "audio/eac3"
            goto L_0x00fe
        L_0x009e:
            int r3 = p040c.p200q.p201a.p219b.p224f0.p229v.C2718c.f3749s
            if (r8 != r3) goto L_0x00a6
            java.lang.String r3 = "audio/vnd.dts"
            goto L_0x00fe
        L_0x00a6:
            int r3 = p040c.p200q.p201a.p219b.p224f0.p229v.C2718c.f3751t
            if (r8 == r3) goto L_0x00fc
            int r3 = p040c.p200q.p201a.p219b.p224f0.p229v.C2718c.f3753u
            if (r8 != r3) goto L_0x00af
            goto L_0x00fc
        L_0x00af:
            int r3 = p040c.p200q.p201a.p219b.p224f0.p229v.C2718c.f3755v
            if (r8 != r3) goto L_0x00b6
            java.lang.String r3 = "audio/vnd.dts.hd;profile=lbr"
            goto L_0x00fe
        L_0x00b6:
            int r3 = p040c.p200q.p201a.p219b.p224f0.p229v.C2718c.f3762y0
            if (r8 != r3) goto L_0x00bd
            java.lang.String r3 = "audio/3gpp"
            goto L_0x00fe
        L_0x00bd:
            int r3 = p040c.p200q.p201a.p219b.p224f0.p229v.C2718c.f3764z0
            if (r8 != r3) goto L_0x00c4
            java.lang.String r3 = "audio/amr-wb"
            goto L_0x00fe
        L_0x00c4:
            int r3 = p040c.p200q.p201a.p219b.p224f0.p229v.C2718c.f3737m
            if (r8 == r3) goto L_0x00fa
            int r3 = p040c.p200q.p201a.p219b.p224f0.p229v.C2718c.f3739n
            if (r8 != r3) goto L_0x00cd
            goto L_0x00fa
        L_0x00cd:
            int r3 = p040c.p200q.p201a.p219b.p224f0.p229v.C2718c.f3733k
            if (r8 != r3) goto L_0x00d4
            java.lang.String r3 = "audio/mpeg"
            goto L_0x00fe
        L_0x00d4:
            int r3 = p040c.p200q.p201a.p219b.p224f0.p229v.C2718c.f3697P0
            if (r8 != r3) goto L_0x00db
            java.lang.String r3 = "audio/alac"
            goto L_0x00fe
        L_0x00db:
            int r3 = p040c.p200q.p201a.p219b.p224f0.p229v.C2718c.f3699Q0
            if (r8 != r3) goto L_0x00e2
            java.lang.String r3 = "audio/g711-alaw"
            goto L_0x00fe
        L_0x00e2:
            int r3 = p040c.p200q.p201a.p219b.p224f0.p229v.C2718c.f3701R0
            if (r8 != r3) goto L_0x00e9
            java.lang.String r3 = "audio/g711-mlaw"
            goto L_0x00fe
        L_0x00e9:
            int r3 = p040c.p200q.p201a.p219b.p224f0.p229v.C2718c.f3703S0
            if (r8 != r3) goto L_0x00f0
            java.lang.String r3 = "audio/opus"
            goto L_0x00fe
        L_0x00f0:
            int r3 = p040c.p200q.p201a.p219b.p224f0.p229v.C2718c.f3707U0
            if (r8 != r3) goto L_0x00f7
            java.lang.String r3 = "audio/flac"
            goto L_0x00fe
        L_0x00f7:
            r3 = r16
            goto L_0x00fe
        L_0x00fa:
            r3 = r9
            goto L_0x00fe
        L_0x00fc:
            java.lang.String r3 = "audio/vnd.dts.hd"
        L_0x00fe:
            r8 = r3
            r18 = r4
            r17 = r5
            r7 = r6
            r19 = r16
        L_0x0106:
            int r3 = r7 - r1
            r4 = -1
            if (r3 >= r2) goto L_0x024a
            r0.mo20006L(r7)
            int r6 = r28.mo20017j()
            if (r6 <= 0) goto L_0x0116
            r3 = r11
            goto L_0x0117
        L_0x0116:
            r3 = r13
        L_0x0117:
            java.lang.String r5 = "childAtomSize should be positive"
            p040c.p200q.p201a.p219b.p261o0.C3151e.m7754b(r3, r5)
            int r3 = r28.mo20017j()
            int r5 = p040c.p200q.p201a.p219b.p224f0.p229v.C2718c.f3686K
            if (r3 == r5) goto L_0x01f7
            if (r34 == 0) goto L_0x012c
            int r5 = p040c.p200q.p201a.p219b.p224f0.p229v.C2718c.f3735l
            if (r3 != r5) goto L_0x012c
            goto L_0x01f7
        L_0x012c:
            int r4 = p040c.p200q.p201a.p219b.p224f0.p229v.C2718c.f3743p
            if (r3 != r4) goto L_0x014e
            int r3 = r7 + 8
            r0.mo20006L(r3)
            java.lang.String r3 = java.lang.Integer.toString(r32)
            com.google.android.exoplayer2.Format r3 = p040c.p200q.p201a.p219b.p221c0.C2596g.m4817d(r0, r3, r14, r10)
            r15.f3789b = r3
        L_0x013f:
            r5 = r6
            r6 = r7
            r26 = r8
            r27 = r9
            r20 = r10
            r21 = r11
            r22 = r12
            r1 = r13
            goto L_0x01f4
        L_0x014e:
            int r4 = p040c.p200q.p201a.p219b.p224f0.p229v.C2718c.f3747r
            if (r3 != r4) goto L_0x0162
            int r3 = r7 + 8
            r0.mo20006L(r3)
            java.lang.String r3 = java.lang.Integer.toString(r32)
            com.google.android.exoplayer2.Format r3 = p040c.p200q.p201a.p219b.p221c0.C2596g.m4820g(r0, r3, r14, r10)
            r15.f3789b = r3
            goto L_0x013f
        L_0x0162:
            int r4 = p040c.p200q.p201a.p219b.p224f0.p229v.C2718c.f3757w
            if (r3 != r4) goto L_0x019e
            java.lang.String r3 = java.lang.Integer.toString(r32)
            r5 = 0
            r20 = -1
            r21 = -1
            r22 = 0
            r23 = 0
            r4 = r8
            r24 = r6
            r6 = r20
            r25 = r7
            r7 = r21
            r26 = r8
            r8 = r17
            r27 = r9
            r9 = r18
            r20 = r10
            r10 = r22
            r21 = r11
            r11 = r20
            r22 = r12
            r12 = r23
            r1 = r13
            r13 = r33
            com.google.android.exoplayer2.Format r3 = com.google.android.exoplayer2.Format.m10238l(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r15.f3789b = r3
            r5 = r24
            r6 = r25
            goto L_0x01f4
        L_0x019e:
            r24 = r6
            r25 = r7
            r26 = r8
            r27 = r9
            r20 = r10
            r21 = r11
            r22 = r12
            r1 = r13
            int r4 = p040c.p200q.p201a.p219b.p224f0.p229v.C2718c.f3697P0
            if (r3 != r4) goto L_0x01c0
            r5 = r24
            byte[] r3 = new byte[r5]
            r6 = r25
            r0.mo20006L(r6)
            r0.mo20015h(r3, r1, r5)
            r19 = r3
            goto L_0x01f4
        L_0x01c0:
            r5 = r24
            r6 = r25
            int r4 = p040c.p200q.p201a.p219b.p224f0.p229v.C2718c.f3705T0
            if (r3 != r4) goto L_0x01e2
            int r3 = r5 + -8
            byte[] r4 = f3778i
            int r7 = r4.length
            int r7 = r7 + r3
            byte[] r7 = new byte[r7]
            int r8 = r4.length
            java.lang.System.arraycopy(r4, r1, r7, r1, r8)
            int r4 = r6 + 8
            r0.mo20006L(r4)
            byte[] r4 = f3778i
            int r4 = r4.length
            r0.mo20015h(r7, r4, r3)
            r19 = r7
            goto L_0x01f4
        L_0x01e2:
            int r3 = p040c.p200q.p201a.p219b.p224f0.p229v.C2718c.f3709V0
            if (r5 != r3) goto L_0x01f4
            int r3 = r5 + -12
            byte[] r4 = new byte[r3]
            int r7 = r6 + 12
            r0.mo20006L(r7)
            r0.mo20015h(r4, r1, r3)
            r19 = r4
        L_0x01f4:
            r8 = r26
            goto L_0x023b
        L_0x01f7:
            r5 = r6
            r6 = r7
            r26 = r8
            r27 = r9
            r20 = r10
            r21 = r11
            r22 = r12
            r1 = r13
            int r7 = p040c.p200q.p201a.p219b.p224f0.p229v.C2718c.f3686K
            if (r3 != r7) goto L_0x020a
            r7 = r6
            goto L_0x020e
        L_0x020a:
            int r7 = m5473b(r0, r6, r5)
        L_0x020e:
            if (r7 == r4) goto L_0x01f4
            android.util.Pair r3 = m5478g(r0, r7)
            java.lang.Object r4 = r3.first
            r8 = r4
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r3 = r3.second
            r19 = r3
            byte[] r19 = (byte[]) r19
            java.lang.String r3 = "audio/mp4a-latm"
            boolean r3 = r3.equals(r8)
            if (r3 == 0) goto L_0x023b
            android.util.Pair r3 = p040c.p200q.p201a.p219b.p261o0.C3155g.m7847j(r19)
            java.lang.Object r4 = r3.first
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r18 = r4.intValue()
            java.lang.Object r3 = r3.second
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r17 = r3.intValue()
        L_0x023b:
            int r7 = r6 + r5
            r13 = r1
            r10 = r20
            r11 = r21
            r12 = r22
            r9 = r27
            r1 = r30
            goto L_0x0106
        L_0x024a:
            r26 = r8
            r27 = r9
            r20 = r10
            r22 = r12
            com.google.android.exoplayer2.Format r0 = r15.f3789b
            if (r0 != 0) goto L_0x0288
            r8 = r26
            if (r8 == 0) goto L_0x0288
            r0 = r27
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0265
            r7 = r22
            goto L_0x0266
        L_0x0265:
            r7 = r4
        L_0x0266:
            java.lang.String r0 = java.lang.Integer.toString(r32)
            r2 = 0
            r3 = -1
            r4 = -1
            if (r19 != 0) goto L_0x0270
            goto L_0x0276
        L_0x0270:
            java.util.List r1 = java.util.Collections.singletonList(r19)
            r16 = r1
        L_0x0276:
            r10 = 0
            r1 = r8
            r5 = r17
            r6 = r18
            r8 = r16
            r9 = r20
            r11 = r33
            com.google.android.exoplayer2.Format r0 = com.google.android.exoplayer2.Format.m10237k(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r15.f3789b = r0
        L_0x0288:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p224f0.p229v.C2721d.m5475d(c.q.a.b.o0.t, int, int, int, int, java.lang.String, boolean, com.google.android.exoplayer2.drm.DrmInitData, c.q.a.b.f0.v.d$c, int):void");
    }

    /* renamed from: e */
    public static Pair<Integer, C2742m> m5476e(C3173t tVar, int i, int i2) {
        int i3 = i + 8;
        boolean z = false;
        int i4 = -1;
        String str = null;
        Integer num = null;
        int i5 = 0;
        while (i3 - i < i2) {
            tVar.mo20006L(i3);
            int j = tVar.mo20017j();
            int j2 = tVar.mo20017j();
            if (j2 == C2718c.f3718c0) {
                num = Integer.valueOf(tVar.mo20017j());
            } else if (j2 == C2718c.f3711X) {
                tVar.mo20007M(4);
                str = tVar.mo20029v(4);
            } else if (j2 == C2718c.f3712Y) {
                i4 = i3;
                i5 = j;
            }
            i3 += j;
        }
        if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
            return null;
        }
        C3151e.m7754b(num != null, "frma atom is mandatory");
        C3151e.m7754b(i4 != -1, "schi atom is mandatory");
        C2742m q = m5488q(tVar, i4, i5, str);
        if (q != null) {
            z = true;
        }
        C3151e.m7754b(z, "tenc atom is mandatory");
        return Pair.create(num, q);
    }

    /* renamed from: f */
    public static Pair<long[], long[]> m5477f(C2718c.C2719a aVar) {
        C2718c.C2720b g;
        if (aVar == null || (g = aVar.mo18647g(C2718c.f3700R)) == null) {
            return Pair.create((Object) null, (Object) null);
        }
        C3173t tVar = g.f3769W0;
        tVar.mo20006L(8);
        int c = C2718c.m5467c(tVar.mo20017j());
        int C = tVar.mo19997C();
        long[] jArr = new long[C];
        long[] jArr2 = new long[C];
        int i = 0;
        while (i < C) {
            jArr[i] = c == 1 ? tVar.mo19998D() : tVar.mo19995A();
            jArr2[i] = c == 1 ? tVar.mo20025r() : (long) tVar.mo20017j();
            if (tVar.mo20028u() == 1) {
                tVar.mo20007M(2);
                i++;
            } else {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
        }
        return Pair.create(jArr, jArr2);
    }

    /* renamed from: g */
    public static Pair<String, byte[]> m5478g(C3173t tVar, int i) {
        tVar.mo20006L(i + 8 + 4);
        tVar.mo20007M(1);
        m5479h(tVar);
        tVar.mo20007M(2);
        int y = tVar.mo20032y();
        if ((y & 128) != 0) {
            tVar.mo20007M(2);
        }
        if ((y & 64) != 0) {
            tVar.mo20007M(tVar.mo19999E());
        }
        if ((y & 32) != 0) {
            tVar.mo20007M(2);
        }
        tVar.mo20007M(1);
        m5479h(tVar);
        String e = C3166p.m7893e(tVar.mo20032y());
        if ("audio/mpeg".equals(e) || "audio/vnd.dts".equals(e) || "audio/vnd.dts.hd".equals(e)) {
            return Pair.create(e, (Object) null);
        }
        tVar.mo20007M(12);
        tVar.mo20007M(1);
        int h = m5479h(tVar);
        byte[] bArr = new byte[h];
        tVar.mo20015h(bArr, 0, h);
        return Pair.create(e, bArr);
    }

    /* renamed from: h */
    public static int m5479h(C3173t tVar) {
        int y = tVar.mo20032y();
        int i = y & 127;
        while ((y & 128) == 128) {
            y = tVar.mo20032y();
            i = (i << 7) | (y & 127);
        }
        return i;
    }

    /* renamed from: i */
    public static int m5480i(C3173t tVar) {
        tVar.mo20006L(16);
        return tVar.mo20017j();
    }

    @Nullable
    /* renamed from: j */
    public static Metadata m5481j(C3173t tVar, int i) {
        tVar.mo20007M(8);
        ArrayList arrayList = new ArrayList();
        while (tVar.mo20010c() < i) {
            Metadata.Entry d = C2735h.m5563d(tVar);
            if (d != null) {
                arrayList.add(d);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata((List<? extends Metadata.Entry>) arrayList);
    }

    /* renamed from: k */
    public static Pair<Long, String> m5482k(C3173t tVar) {
        int i = 8;
        tVar.mo20006L(8);
        int c = C2718c.m5467c(tVar.mo20017j());
        tVar.mo20007M(c == 0 ? 8 : 16);
        long A = tVar.mo19995A();
        if (c == 0) {
            i = 4;
        }
        tVar.mo20007M(i);
        int E = tVar.mo19999E();
        return Pair.create(Long.valueOf(A), "" + ((char) (((E >> 10) & 31) + 96)) + ((char) (((E >> 5) & 31) + 96)) + ((char) ((E & 31) + 96)));
    }

    @Nullable
    /* renamed from: l */
    public static Metadata m5483l(C2718c.C2719a aVar) {
        C2718c.C2720b g = aVar.mo18647g(C2718c.f3704T);
        C2718c.C2720b g2 = aVar.mo18647g(C2718c.f3671C0);
        C2718c.C2720b g3 = aVar.mo18647g(C2718c.f3673D0);
        if (g == null || g2 == null || g3 == null || m5480i(g.f3769W0) != f3777h) {
            return null;
        }
        C3173t tVar = g2.f3769W0;
        tVar.mo20006L(12);
        int j = tVar.mo20017j();
        String[] strArr = new String[j];
        for (int i = 0; i < j; i++) {
            int j2 = tVar.mo20017j();
            tVar.mo20007M(4);
            strArr[i] = tVar.mo20029v(j2 - 8);
        }
        C3173t tVar2 = g3.f3769W0;
        tVar2.mo20006L(8);
        ArrayList arrayList = new ArrayList();
        while (tVar2.mo20008a() > 8) {
            int c = tVar2.mo20010c();
            int j3 = tVar2.mo20017j();
            int j4 = tVar2.mo20017j() - 1;
            if (j4 < 0 || j4 >= j) {
                C3163m.m7880f("AtomParsers", "Skipped metadata with unknown key index: " + j4);
            } else {
                MdtaMetadataEntry g4 = C2735h.m5566g(tVar2, c + j3, strArr[j4]);
                if (g4 != null) {
                    arrayList.add(g4);
                }
            }
            tVar2.mo20006L(c + j3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata((List<? extends Metadata.Entry>) arrayList);
    }

    /* renamed from: m */
    public static long m5484m(C3173t tVar) {
        int i = 8;
        tVar.mo20006L(8);
        if (C2718c.m5467c(tVar.mo20017j()) != 0) {
            i = 16;
        }
        tVar.mo20007M(i);
        return tVar.mo19995A();
    }

    /* renamed from: n */
    public static float m5485n(C3173t tVar, int i) {
        tVar.mo20006L(i + 8);
        return ((float) tVar.mo19997C()) / ((float) tVar.mo19997C());
    }

    /* renamed from: o */
    public static byte[] m5486o(C3173t tVar, int i, int i2) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            tVar.mo20006L(i3);
            int j = tVar.mo20017j();
            if (tVar.mo20017j() == C2718c.f3687K0) {
                return Arrays.copyOfRange(tVar.f5877a, i3, j + i3);
            }
            i3 += j;
        }
        return null;
    }

    /* renamed from: p */
    public static Pair<Integer, C2742m> m5487p(C3173t tVar, int i, int i2) {
        Pair<Integer, C2742m> e;
        int c = tVar.mo20010c();
        while (c - i < i2) {
            tVar.mo20006L(c);
            int j = tVar.mo20017j();
            C3151e.m7754b(j > 0, "childAtomSize should be positive");
            if (tVar.mo20017j() == C2718c.f3710W && (e = m5476e(tVar, c, j)) != null) {
                return e;
            }
            c += j;
        }
        return null;
    }

    /* renamed from: q */
    public static C2742m m5488q(C3173t tVar, int i, int i2, String str) {
        int i3;
        int i4;
        int i5 = i + 8;
        while (true) {
            byte[] bArr = null;
            if (i5 - i >= i2) {
                return null;
            }
            tVar.mo20006L(i5);
            int j = tVar.mo20017j();
            if (tVar.mo20017j() == C2718c.f3713Z) {
                int c = C2718c.m5467c(tVar.mo20017j());
                tVar.mo20007M(1);
                if (c == 0) {
                    tVar.mo20007M(1);
                    i4 = 0;
                    i3 = 0;
                } else {
                    int y = tVar.mo20032y();
                    i3 = y & 15;
                    i4 = (y & 240) >> 4;
                }
                boolean z = tVar.mo20032y() == 1;
                int y2 = tVar.mo20032y();
                byte[] bArr2 = new byte[16];
                tVar.mo20015h(bArr2, 0, 16);
                if (z && y2 == 0) {
                    int y3 = tVar.mo20032y();
                    bArr = new byte[y3];
                    tVar.mo20015h(bArr, 0, y3);
                }
                return new C2742m(z, str, y2, bArr2, i4, i3, bArr);
            }
            i5 += j;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0297  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x033c  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0371  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x04bf  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d6  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p040c.p200q.p201a.p219b.p224f0.p229v.C2744o m5489r(p040c.p200q.p201a.p219b.p224f0.p229v.C2741l r35, p040c.p200q.p201a.p219b.p224f0.p229v.C2718c.C2719a r36, p040c.p200q.p201a.p219b.p224f0.C2678k r37) {
        /*
            r1 = r35
            r0 = r36
            r2 = r37
            int r3 = p040c.p200q.p201a.p219b.p224f0.p229v.C2718c.f3746q0
            c.q.a.b.f0.v.c$b r3 = r0.mo18647g(r3)
            if (r3 == 0) goto L_0x0014
            c.q.a.b.f0.v.d$d r4 = new c.q.a.b.f0.v.d$d
            r4.<init>(r3)
            goto L_0x0021
        L_0x0014:
            int r3 = p040c.p200q.p201a.p219b.p224f0.p229v.C2718c.f3748r0
            c.q.a.b.f0.v.c$b r3 = r0.mo18647g(r3)
            if (r3 == 0) goto L_0x04e2
            c.q.a.b.f0.v.d$e r4 = new c.q.a.b.f0.v.d$e
            r4.<init>(r3)
        L_0x0021:
            int r3 = r4.mo18650b()
            r5 = 0
            if (r3 != 0) goto L_0x0042
            c.q.a.b.f0.v.o r9 = new c.q.a.b.f0.v.o
            long[] r2 = new long[r5]
            int[] r3 = new int[r5]
            r4 = 0
            long[] r6 = new long[r5]
            int[] r7 = new int[r5]
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0 = r9
            r1 = r35
            r5 = r6
            r6 = r7
            r7 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x0042:
            int r6 = p040c.p200q.p201a.p219b.p224f0.p229v.C2718c.f3750s0
            c.q.a.b.f0.v.c$b r6 = r0.mo18647g(r6)
            r7 = 1
            if (r6 != 0) goto L_0x0053
            int r6 = p040c.p200q.p201a.p219b.p224f0.p229v.C2718c.f3752t0
            c.q.a.b.f0.v.c$b r6 = r0.mo18647g(r6)
            r8 = r7
            goto L_0x0054
        L_0x0053:
            r8 = r5
        L_0x0054:
            c.q.a.b.o0.t r6 = r6.f3769W0
            int r9 = p040c.p200q.p201a.p219b.p224f0.p229v.C2718c.f3744p0
            c.q.a.b.f0.v.c$b r9 = r0.mo18647g(r9)
            c.q.a.b.o0.t r9 = r9.f3769W0
            int r10 = p040c.p200q.p201a.p219b.p224f0.p229v.C2718c.f3738m0
            c.q.a.b.f0.v.c$b r10 = r0.mo18647g(r10)
            c.q.a.b.o0.t r10 = r10.f3769W0
            int r11 = p040c.p200q.p201a.p219b.p224f0.p229v.C2718c.f3740n0
            c.q.a.b.f0.v.c$b r11 = r0.mo18647g(r11)
            r12 = 0
            if (r11 == 0) goto L_0x0072
            c.q.a.b.o0.t r11 = r11.f3769W0
            goto L_0x0073
        L_0x0072:
            r11 = r12
        L_0x0073:
            int r13 = p040c.p200q.p201a.p219b.p224f0.p229v.C2718c.f3742o0
            c.q.a.b.f0.v.c$b r0 = r0.mo18647g(r13)
            if (r0 == 0) goto L_0x007e
            c.q.a.b.o0.t r0 = r0.f3769W0
            goto L_0x007f
        L_0x007e:
            r0 = r12
        L_0x007f:
            c.q.a.b.f0.v.d$a r13 = new c.q.a.b.f0.v.d$a
            r13.<init>(r9, r6, r8)
            r6 = 12
            r10.mo20006L(r6)
            int r8 = r10.mo19997C()
            int r8 = r8 - r7
            int r9 = r10.mo19997C()
            int r14 = r10.mo19997C()
            if (r0 == 0) goto L_0x00a0
            r0.mo20006L(r6)
            int r15 = r0.mo19997C()
            goto L_0x00a1
        L_0x00a0:
            r15 = r5
        L_0x00a1:
            r16 = -1
            if (r11 == 0) goto L_0x00b5
            r11.mo20006L(r6)
            int r6 = r11.mo19997C()
            if (r6 <= 0) goto L_0x00b7
            int r12 = r11.mo19997C()
            int r16 = r12 + -1
            goto L_0x00b6
        L_0x00b5:
            r6 = r5
        L_0x00b6:
            r12 = r11
        L_0x00b7:
            boolean r11 = r4.mo18649a()
            if (r11 == 0) goto L_0x00d1
            com.google.android.exoplayer2.Format r11 = r1.f3922f
            java.lang.String r11 = r11.f7566q
            java.lang.String r5 = "audio/raw"
            boolean r5 = r5.equals(r11)
            if (r5 == 0) goto L_0x00d1
            if (r8 != 0) goto L_0x00d1
            if (r15 != 0) goto L_0x00d1
            if (r6 != 0) goto L_0x00d1
            r5 = r7
            goto L_0x00d2
        L_0x00d1:
            r5 = 0
        L_0x00d2:
            r18 = 0
            if (r5 != 0) goto L_0x023f
            long[] r5 = new long[r3]
            int[] r11 = new int[r3]
            long[] r7 = new long[r3]
            r36 = r6
            int[] r6 = new int[r3]
            r23 = r10
            r2 = r16
            r25 = r18
            r27 = r25
            r1 = 0
            r10 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r16 = r15
            r15 = r14
            r14 = r9
            r34 = r8
            r8 = r36
        L_0x00f8:
            r36 = r34
            java.lang.String r9 = "AtomParsers"
            if (r1 >= r3) goto L_0x01ba
            r28 = r27
            r27 = r22
            r22 = 1
        L_0x0104:
            if (r27 != 0) goto L_0x0121
            boolean r22 = r13.mo18648a()
            if (r22 == 0) goto L_0x0121
            r30 = r14
            r31 = r15
            long r14 = r13.f3782d
            r32 = r3
            int r3 = r13.f3781c
            r27 = r3
            r28 = r14
            r14 = r30
            r15 = r31
            r3 = r32
            goto L_0x0104
        L_0x0121:
            r32 = r3
            r30 = r14
            r31 = r15
            if (r22 != 0) goto L_0x0145
            java.lang.String r2 = "Unexpected end of chunk data"
            p040c.p200q.p201a.p219b.p261o0.C3163m.m7880f(r9, r2)
            long[] r5 = java.util.Arrays.copyOf(r5, r1)
            int[] r11 = java.util.Arrays.copyOf(r11, r1)
            long[] r7 = java.util.Arrays.copyOf(r7, r1)
            int[] r6 = java.util.Arrays.copyOf(r6, r1)
            r3 = r1
            r2 = r21
            r1 = r27
            goto L_0x01c2
        L_0x0145:
            if (r0 == 0) goto L_0x0158
        L_0x0147:
            if (r24 != 0) goto L_0x0156
            if (r16 <= 0) goto L_0x0156
            int r24 = r0.mo19997C()
            int r21 = r0.mo20017j()
            int r16 = r16 + -1
            goto L_0x0147
        L_0x0156:
            int r24 = r24 + -1
        L_0x0158:
            r3 = r21
            r5[r1] = r28
            int r9 = r4.mo18651c()
            r11[r1] = r9
            r9 = r11[r1]
            if (r9 <= r10) goto L_0x0169
            r9 = r11[r1]
            r10 = r9
        L_0x0169:
            long r14 = (long) r3
            long r14 = r25 + r14
            r7[r1] = r14
            if (r12 != 0) goto L_0x0172
            r9 = 1
            goto L_0x0173
        L_0x0172:
            r9 = 0
        L_0x0173:
            r6[r1] = r9
            if (r1 != r2) goto L_0x0183
            r9 = 1
            r6[r1] = r9
            int r8 = r8 + -1
            if (r8 <= 0) goto L_0x0183
            int r2 = r12.mo19997C()
            int r2 = r2 - r9
        L_0x0183:
            r15 = r2
            r9 = r3
            r14 = r31
            long r2 = (long) r14
            long r25 = r25 + r2
            int r2 = r30 + -1
            if (r2 != 0) goto L_0x019b
            if (r36 <= 0) goto L_0x019b
            int r2 = r23.mo19997C()
            int r3 = r23.mo20017j()
            int r14 = r36 + -1
            goto L_0x019e
        L_0x019b:
            r3 = r14
            r14 = r36
        L_0x019e:
            r36 = r2
            r2 = r11[r1]
            r21 = r3
            long r2 = (long) r2
            long r2 = r28 + r2
            int r22 = r27 + -1
            int r1 = r1 + 1
            r27 = r2
            r2 = r15
            r15 = r21
            r3 = r32
            r21 = r9
            r34 = r14
            r14 = r36
            goto L_0x00f8
        L_0x01ba:
            r32 = r3
            r30 = r14
            r2 = r21
            r1 = r22
        L_0x01c2:
            long r12 = (long) r2
            long r25 = r25 + r12
        L_0x01c5:
            if (r16 <= 0) goto L_0x01d5
            int r2 = r0.mo19997C()
            if (r2 == 0) goto L_0x01cf
            r0 = 0
            goto L_0x01d6
        L_0x01cf:
            r0.mo20017j()
            int r16 = r16 + -1
            goto L_0x01c5
        L_0x01d5:
            r0 = 1
        L_0x01d6:
            if (r8 != 0) goto L_0x01e8
            if (r30 != 0) goto L_0x01e8
            if (r1 != 0) goto L_0x01e8
            if (r36 != 0) goto L_0x01e8
            r2 = r24
            if (r2 != 0) goto L_0x01ea
            if (r0 != 0) goto L_0x01e5
            goto L_0x01ea
        L_0x01e5:
            r12 = r35
            goto L_0x0238
        L_0x01e8:
            r2 = r24
        L_0x01ea:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r12 = "Inconsistent stbl box for track "
            r4.append(r12)
            r12 = r35
            int r13 = r12.f3917a
            r4.append(r13)
            java.lang.String r13 = ": remainingSynchronizationSamples "
            r4.append(r13)
            r4.append(r8)
            java.lang.String r8 = ", remainingSamplesAtTimestampDelta "
            r4.append(r8)
            r8 = r30
            r4.append(r8)
            java.lang.String r8 = ", remainingSamplesInChunk "
            r4.append(r8)
            r4.append(r1)
            java.lang.String r1 = ", remainingTimestampDeltaChanges "
            r4.append(r1)
            r14 = r36
            r4.append(r14)
            java.lang.String r1 = ", remainingSamplesAtTimestampOffset "
            r4.append(r1)
            r4.append(r2)
            if (r0 != 0) goto L_0x022c
            java.lang.String r0 = ", ctts invalid"
            goto L_0x022e
        L_0x022c:
            java.lang.String r0 = ""
        L_0x022e:
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            p040c.p200q.p201a.p219b.p261o0.C3163m.m7880f(r9, r0)
        L_0x0238:
            r0 = r3
            r2 = r5
            r14 = r6
            r13 = r7
            r4 = r10
            r3 = r11
            goto L_0x027d
        L_0x023f:
            r12 = r1
            r32 = r3
            int r0 = r13.f3779a
            long[] r1 = new long[r0]
            int[] r0 = new int[r0]
        L_0x0248:
            boolean r2 = r13.mo18648a()
            if (r2 == 0) goto L_0x0259
            int r2 = r13.f3780b
            long r3 = r13.f3782d
            r1[r2] = r3
            int r3 = r13.f3781c
            r0[r2] = r3
            goto L_0x0248
        L_0x0259:
            com.google.android.exoplayer2.Format r2 = r12.f3922f
            int r3 = r2.f7553F
            int r2 = r2.f7551D
            int r2 = p040c.p200q.p201a.p219b.p261o0.C3152e0.m7770J(r3, r2)
            long r3 = (long) r14
            c.q.a.b.f0.v.f$b r0 = p040c.p200q.p201a.p219b.p224f0.p229v.C2729f.m5510a(r2, r1, r0, r3)
            long[] r1 = r0.f3807a
            int[] r2 = r0.f3808b
            int r3 = r0.f3809c
            long[] r4 = r0.f3810d
            int[] r5 = r0.f3811e
            long r6 = r0.f3812f
            r13 = r4
            r14 = r5
            r25 = r6
            r0 = r32
            r4 = r3
            r3 = r2
            r2 = r1
        L_0x027d:
            r7 = 1000000(0xf4240, double:4.940656E-318)
            long r9 = r12.f3919c
            r5 = r25
            long r7 = p040c.p200q.p201a.p219b.p261o0.C3152e0.m7792c0(r5, r7, r9)
            long[] r1 = r12.f3924h
            r10 = 1000000(0xf4240, double:4.940656E-318)
            if (r1 == 0) goto L_0x04bf
            boolean r1 = r37.mo18555a()
            if (r1 == 0) goto L_0x0297
            goto L_0x04bf
        L_0x0297:
            long[] r1 = r12.f3924h
            int r5 = r1.length
            r6 = 1
            if (r5 != r6) goto L_0x032b
            int r5 = r12.f3918b
            if (r5 != r6) goto L_0x032b
            int r5 = r13.length
            r6 = 2
            if (r5 < r6) goto L_0x032b
            long[] r5 = r12.f3925i
            r6 = 0
            r15 = r5[r6]
            r27 = r1[r6]
            long r5 = r12.f3919c
            long r7 = r12.f3920d
            r29 = r5
            r31 = r7
            long r5 = p040c.p200q.p201a.p219b.p261o0.C3152e0.m7792c0(r27, r29, r31)
            long r21 = r15 + r5
            r5 = r13
            r6 = r25
            r8 = r15
            r23 = r0
            r0 = r10
            r10 = r21
            boolean r5 = m5472a(r5, r6, r8, r10)
            if (r5 == 0) goto L_0x032d
            long r6 = r25 - r21
            r5 = 0
            r8 = r13[r5]
            long r27 = r15 - r8
            com.google.android.exoplayer2.Format r5 = r12.f3922f
            int r5 = r5.f7552E
            long r8 = (long) r5
            long r10 = r12.f3919c
            r29 = r8
            r31 = r10
            long r10 = p040c.p200q.p201a.p219b.p261o0.C3152e0.m7792c0(r27, r29, r31)
            com.google.android.exoplayer2.Format r5 = r12.f3922f
            int r5 = r5.f7552E
            long r8 = (long) r5
            long r0 = r12.f3919c
            r36 = r14
            r14 = r10
            r10 = r0
            long r0 = p040c.p200q.p201a.p219b.p261o0.C3152e0.m7792c0(r6, r8, r10)
            int r5 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r5 != 0) goto L_0x02f6
            int r5 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r5 == 0) goto L_0x032f
        L_0x02f6:
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r7 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x032f
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 > 0) goto L_0x032f
            int r5 = (int) r14
            r6 = r37
            r6.f3426a = r5
            int r0 = (int) r0
            r6.f3427b = r0
            long r0 = r12.f3919c
            r5 = 1000000(0xf4240, double:4.940656E-318)
            p040c.p200q.p201a.p219b.p261o0.C3152e0.m7796e0(r13, r5, r0)
            long[] r0 = r12.f3924h
            r1 = 0
            r5 = r0[r1]
            r7 = 1000000(0xf4240, double:4.940656E-318)
            long r9 = r12.f3920d
            long r7 = p040c.p200q.p201a.p219b.p261o0.C3152e0.m7792c0(r5, r7, r9)
            c.q.a.b.f0.v.o r9 = new c.q.a.b.f0.v.o
            r0 = r9
            r1 = r35
            r5 = r13
            r6 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x032b:
            r23 = r0
        L_0x032d:
            r36 = r14
        L_0x032f:
            long[] r0 = r12.f3924h
            int r1 = r0.length
            r5 = 1
            if (r1 != r5) goto L_0x0371
            r1 = 0
            r5 = r0[r1]
            int r0 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r0 != 0) goto L_0x0371
            long[] r0 = r12.f3925i
            r5 = r0[r1]
            r0 = 0
        L_0x0341:
            int r1 = r13.length
            if (r0 >= r1) goto L_0x0358
            r7 = r13[r0]
            long r14 = r7 - r5
            r16 = 1000000(0xf4240, double:4.940656E-318)
            long r7 = r12.f3919c
            r18 = r7
            long r7 = p040c.p200q.p201a.p219b.p261o0.C3152e0.m7792c0(r14, r16, r18)
            r13[r0] = r7
            int r0 = r0 + 1
            goto L_0x0341
        L_0x0358:
            long r14 = r25 - r5
            r16 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r12.f3919c
            r18 = r0
            long r7 = p040c.p200q.p201a.p219b.p261o0.C3152e0.m7792c0(r14, r16, r18)
            c.q.a.b.f0.v.o r9 = new c.q.a.b.f0.v.o
            r0 = r9
            r1 = r35
            r5 = r13
            r6 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x0371:
            int r0 = r12.f3918b
            r1 = 1
            if (r0 != r1) goto L_0x0378
            r9 = 1
            goto L_0x0379
        L_0x0378:
            r9 = 0
        L_0x0379:
            long[] r0 = r12.f3924h
            int r1 = r0.length
            int[] r1 = new int[r1]
            int r0 = r0.length
            int[] r0 = new int[r0]
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x0385:
            long[] r10 = r12.f3924h
            int r11 = r10.length
            if (r6 >= r11) goto L_0x03e8
            long[] r11 = r12.f3925i
            r14 = r11[r6]
            r21 = -1
            int r11 = (r14 > r21 ? 1 : (r14 == r21 ? 0 : -1))
            if (r11 == 0) goto L_0x03db
            r24 = r10[r6]
            long r10 = r12.f3919c
            r21 = r3
            r22 = r4
            long r3 = r12.f3920d
            r26 = r10
            r28 = r3
            long r3 = p040c.p200q.p201a.p219b.p261o0.C3152e0.m7792c0(r24, r26, r28)
            r10 = 1
            int r11 = p040c.p200q.p201a.p219b.p261o0.C3152e0.m7791c(r13, r14, r10, r10)
            r1[r6] = r11
            long r14 = r14 + r3
            r3 = 0
            int r4 = p040c.p200q.p201a.p219b.p261o0.C3152e0.m7791c(r13, r14, r9, r3)
            r0[r6] = r4
        L_0x03b5:
            r4 = r1[r6]
            r11 = r0[r6]
            if (r4 >= r11) goto L_0x03c8
            r4 = r1[r6]
            r4 = r36[r4]
            r4 = r4 & r10
            if (r4 != 0) goto L_0x03c8
            r4 = r1[r6]
            int r4 = r4 + r10
            r1[r6] = r4
            goto L_0x03b5
        L_0x03c8:
            r4 = r0[r6]
            r11 = r1[r6]
            int r4 = r4 - r11
            int r7 = r7 + r4
            r4 = r1[r6]
            if (r8 == r4) goto L_0x03d4
            r4 = r10
            goto L_0x03d5
        L_0x03d4:
            r4 = r3
        L_0x03d5:
            r4 = r4 | r5
            r5 = r0[r6]
            r8 = r5
            r5 = r4
            goto L_0x03e1
        L_0x03db:
            r21 = r3
            r22 = r4
            r3 = 0
            r10 = 1
        L_0x03e1:
            int r6 = r6 + 1
            r3 = r21
            r4 = r22
            goto L_0x0385
        L_0x03e8:
            r21 = r3
            r22 = r4
            r4 = r23
            r3 = 0
            r10 = 1
            if (r7 == r4) goto L_0x03f3
            goto L_0x03f4
        L_0x03f3:
            r10 = r3
        L_0x03f4:
            r4 = r5 | r10
            if (r4 == 0) goto L_0x03fb
            long[] r5 = new long[r7]
            goto L_0x03fc
        L_0x03fb:
            r5 = r2
        L_0x03fc:
            if (r4 == 0) goto L_0x0401
            int[] r6 = new int[r7]
            goto L_0x0403
        L_0x0401:
            r6 = r21
        L_0x0403:
            if (r4 == 0) goto L_0x0407
            r22 = r3
        L_0x0407:
            if (r4 == 0) goto L_0x040c
            int[] r8 = new int[r7]
            goto L_0x040e
        L_0x040c:
            r8 = r36
        L_0x040e:
            long[] r7 = new long[r7]
            r9 = r3
            r10 = r18
        L_0x0413:
            long[] r14 = r12.f3924h
            int r14 = r14.length
            if (r3 >= r14) goto L_0x04a0
            long[] r14 = r12.f3925i
            r23 = r14[r3]
            r14 = r1[r3]
            r15 = r0[r3]
            r20 = r0
            if (r4 == 0) goto L_0x0438
            int r0 = r15 - r14
            java.lang.System.arraycopy(r2, r14, r5, r9, r0)
            r25 = r2
            r2 = r21
            java.lang.System.arraycopy(r2, r14, r6, r9, r0)
            r21 = r1
            r1 = r36
            java.lang.System.arraycopy(r1, r14, r8, r9, r0)
            goto L_0x0440
        L_0x0438:
            r25 = r2
            r2 = r21
            r21 = r1
            r1 = r36
        L_0x0440:
            r0 = r14
            r14 = r22
        L_0x0443:
            if (r0 >= r15) goto L_0x0484
            r16 = 1000000(0xf4240, double:4.940656E-318)
            r36 = r1
            r26 = r2
            long r1 = r12.f3920d
            r27 = r8
            r8 = r14
            r22 = r15
            r14 = r10
            r18 = r1
            long r1 = p040c.p200q.p201a.p219b.p261o0.C3152e0.m7792c0(r14, r16, r18)
            r14 = r13[r0]
            long r28 = r14 - r23
            r30 = 1000000(0xf4240, double:4.940656E-318)
            long r14 = r12.f3919c
            r32 = r14
            long r14 = p040c.p200q.p201a.p219b.p261o0.C3152e0.m7792c0(r28, r30, r32)
            long r1 = r1 + r14
            r7[r9] = r1
            if (r4 == 0) goto L_0x0476
            r1 = r6[r9]
            if (r1 <= r8) goto L_0x0476
            r1 = r26[r0]
            r14 = r1
            goto L_0x0477
        L_0x0476:
            r14 = r8
        L_0x0477:
            int r9 = r9 + 1
            int r0 = r0 + 1
            r1 = r36
            r15 = r22
            r2 = r26
            r8 = r27
            goto L_0x0443
        L_0x0484:
            r36 = r1
            r26 = r2
            r27 = r8
            r8 = r14
            long[] r0 = r12.f3924h
            r1 = r0[r3]
            long r10 = r10 + r1
            int r3 = r3 + 1
            r22 = r8
            r0 = r20
            r1 = r21
            r2 = r25
            r21 = r26
            r8 = r27
            goto L_0x0413
        L_0x04a0:
            r27 = r8
            r16 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r12.f3920d
            r14 = r10
            r18 = r0
            long r8 = p040c.p200q.p201a.p219b.p261o0.C3152e0.m7792c0(r14, r16, r18)
            c.q.a.b.f0.v.o r10 = new c.q.a.b.f0.v.o
            r0 = r10
            r1 = r35
            r2 = r5
            r3 = r6
            r4 = r22
            r5 = r7
            r6 = r27
            r7 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r10
        L_0x04bf:
            r25 = r2
            r26 = r3
            r22 = r4
            r36 = r14
            long r0 = r12.f3919c
            r2 = 1000000(0xf4240, double:4.940656E-318)
            p040c.p200q.p201a.p219b.p261o0.C3152e0.m7796e0(r13, r2, r0)
            c.q.a.b.f0.v.o r9 = new c.q.a.b.f0.v.o
            r0 = r9
            r6 = r36
            r1 = r35
            r11 = r26
            r2 = r25
            r3 = r11
            r4 = r22
            r5 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x04e2:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.String r1 = "Track has no sample table size information"
            r0.<init>((java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p224f0.p229v.C2721d.m5489r(c.q.a.b.f0.v.l, c.q.a.b.f0.v.c$a, c.q.a.b.f0.k):c.q.a.b.f0.v.o");
    }

    /* renamed from: s */
    public static C2724c m5490s(C3173t tVar, int i, int i2, String str, DrmInitData drmInitData, boolean z) {
        C3173t tVar2 = tVar;
        tVar2.mo20006L(12);
        int j = tVar.mo20017j();
        C2724c cVar = new C2724c(j);
        for (int i3 = 0; i3 < j; i3++) {
            int c = tVar.mo20010c();
            int j2 = tVar.mo20017j();
            C3151e.m7754b(j2 > 0, "childAtomSize should be positive");
            int j3 = tVar.mo20017j();
            if (j3 == C2718c.f3717c || j3 == C2718c.f3719d || j3 == C2718c.f3714a0 || j3 == C2718c.f3736l0 || j3 == C2718c.f3721e || j3 == C2718c.f3723f || j3 == C2718c.f3725g || j3 == C2718c.f3689L0 || j3 == C2718c.f3691M0) {
                m5496y(tVar, j3, c, j2, i, i2, drmInitData, cVar, i3);
            } else if (j3 == C2718c.f3731j || j3 == C2718c.f3716b0 || j3 == C2718c.f3741o || j3 == C2718c.f3745q || j3 == C2718c.f3749s || j3 == C2718c.f3755v || j3 == C2718c.f3751t || j3 == C2718c.f3753u || j3 == C2718c.f3762y0 || j3 == C2718c.f3764z0 || j3 == C2718c.f3737m || j3 == C2718c.f3739n || j3 == C2718c.f3733k || j3 == C2718c.f3697P0 || j3 == C2718c.f3699Q0 || j3 == C2718c.f3701R0 || j3 == C2718c.f3703S0 || j3 == C2718c.f3707U0) {
                m5475d(tVar, j3, c, j2, i, str, z, drmInitData, cVar, i3);
            } else if (j3 == C2718c.f3734k0 || j3 == C2718c.f3754u0 || j3 == C2718c.f3756v0 || j3 == C2718c.f3758w0 || j3 == C2718c.f3760x0) {
                m5491t(tVar, j3, c, j2, i, str, cVar);
            } else if (j3 == C2718c.f3695O0) {
                cVar.f3789b = Format.m10242p(Integer.toString(i), "application/x-camera-motion", (String) null, -1, (DrmInitData) null);
            }
            tVar2.mo20006L(c + j2);
        }
        return cVar;
    }

    /* renamed from: t */
    public static void m5491t(C3173t tVar, int i, int i2, int i3, int i4, String str, C2724c cVar) {
        C3173t tVar2 = tVar;
        int i5 = i;
        C2724c cVar2 = cVar;
        tVar2.mo20006L(i2 + 8 + 8);
        String str2 = "application/ttml+xml";
        List list = null;
        long j = Long.MAX_VALUE;
        if (i5 != C2718c.f3734k0) {
            if (i5 == C2718c.f3754u0) {
                int i6 = (i3 - 8) - 8;
                byte[] bArr = new byte[i6];
                tVar2.mo20015h(bArr, 0, i6);
                list = Collections.singletonList(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i5 == C2718c.f3756v0) {
                str2 = "application/x-mp4-vtt";
            } else if (i5 == C2718c.f3758w0) {
                j = 0;
            } else if (i5 == C2718c.f3760x0) {
                cVar2.f3791d = 1;
                str2 = "application/x-mp4-cea-608";
            } else {
                throw new IllegalStateException();
            }
        }
        cVar2.f3789b = Format.m10247u(Integer.toString(i4), str2, (String) null, -1, 0, str, -1, (DrmInitData) null, j, list);
    }

    /* renamed from: u */
    public static C2727f m5492u(C3173t tVar) {
        boolean z;
        int i = 8;
        tVar.mo20006L(8);
        int c = C2718c.m5467c(tVar.mo20017j());
        tVar.mo20007M(c == 0 ? 8 : 16);
        int j = tVar.mo20017j();
        tVar.mo20007M(4);
        int c2 = tVar.mo20010c();
        if (c == 0) {
            i = 4;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= i) {
                z = true;
                break;
            } else if (tVar.f5877a[c2 + i3] != -1) {
                z = false;
                break;
            } else {
                i3++;
            }
        }
        long j2 = -9223372036854775807L;
        if (z) {
            tVar.mo20007M(i);
        } else {
            long A = c == 0 ? tVar.mo19995A() : tVar.mo19998D();
            if (A != 0) {
                j2 = A;
            }
        }
        tVar.mo20007M(16);
        int j3 = tVar.mo20017j();
        int j4 = tVar.mo20017j();
        tVar.mo20007M(4);
        int j5 = tVar.mo20017j();
        int j6 = tVar.mo20017j();
        if (j3 == 0 && j4 == 65536 && j5 == -65536 && j6 == 0) {
            i2 = 90;
        } else if (j3 == 0 && j4 == -65536 && j5 == 65536 && j6 == 0) {
            i2 = BottomAppBarTopEdgeTreatment.ANGLE_UP;
        } else if (j3 == -65536 && j4 == 0 && j5 == 0 && j6 == -65536) {
            i2 = 180;
        }
        return new C2727f(j, j2, i2);
    }

    /* renamed from: v */
    public static C2741l m5493v(C2718c.C2719a aVar, C2718c.C2720b bVar, long j, DrmInitData drmInitData, boolean z, boolean z2) {
        long j2;
        C2718c.C2720b bVar2;
        long[] jArr;
        long[] jArr2;
        C2718c.C2719a aVar2 = aVar;
        C2718c.C2719a f = aVar2.mo18646f(C2718c.f3676F);
        int c = m5474c(m5480i(f.mo18647g(C2718c.f3704T).f3769W0));
        if (c == -1) {
            return null;
        }
        C2727f u = m5492u(aVar2.mo18647g(C2718c.f3696P).f3769W0);
        long j3 = -9223372036854775807L;
        if (j == -9223372036854775807L) {
            bVar2 = bVar;
            j2 = u.f3801b;
        } else {
            bVar2 = bVar;
            j2 = j;
        }
        long m = m5484m(bVar2.f3769W0);
        if (j2 != -9223372036854775807L) {
            j3 = C3152e0.m7792c0(j2, EventLoop_commonKt.MS_TO_NS, m);
        }
        long j4 = j3;
        C2718c.C2719a f2 = f.mo18646f(C2718c.f3678G).mo18646f(C2718c.f3680H);
        Pair<Long, String> k = m5482k(f.mo18647g(C2718c.f3702S).f3769W0);
        C2724c s = m5490s(f2.mo18647g(C2718c.f3706U).f3769W0, u.f3800a, u.f3802c, (String) k.second, drmInitData, z2);
        if (!z) {
            Pair<long[], long[]> f3 = m5477f(aVar2.mo18646f(C2718c.f3698Q));
            jArr = (long[]) f3.second;
            jArr2 = (long[]) f3.first;
        } else {
            jArr2 = null;
            jArr = null;
        }
        if (s.f3789b == null) {
            return null;
        }
        return new C2741l(u.f3800a, c, ((Long) k.first).longValue(), m, j4, s.f3789b, s.f3791d, s.f3788a, s.f3790c, jArr2, jArr);
    }

    @Nullable
    /* renamed from: w */
    public static Metadata m5494w(C2718c.C2720b bVar, boolean z) {
        if (z) {
            return null;
        }
        C3173t tVar = bVar.f3769W0;
        tVar.mo20006L(8);
        while (tVar.mo20008a() >= 8) {
            int c = tVar.mo20010c();
            int j = tVar.mo20017j();
            if (tVar.mo20017j() == C2718c.f3669B0) {
                tVar.mo20006L(c);
                return m5495x(tVar, c + j);
            }
            tVar.mo20006L(c + j);
        }
        return null;
    }

    @Nullable
    /* renamed from: x */
    public static Metadata m5495x(C3173t tVar, int i) {
        tVar.mo20007M(12);
        while (tVar.mo20010c() < i) {
            int c = tVar.mo20010c();
            int j = tVar.mo20017j();
            if (tVar.mo20017j() == C2718c.f3673D0) {
                tVar.mo20006L(c);
                return m5481j(tVar, c + j);
            }
            tVar.mo20006L(c + j);
        }
        return null;
    }

    /* renamed from: y */
    public static void m5496y(C3173t tVar, int i, int i2, int i3, int i4, int i5, DrmInitData drmInitData, C2724c cVar, int i6) {
        C3173t tVar2 = tVar;
        int i7 = i2;
        int i8 = i3;
        DrmInitData drmInitData2 = drmInitData;
        C2724c cVar2 = cVar;
        tVar2.mo20006L(i7 + 8 + 8);
        tVar2.mo20007M(16);
        int E = tVar.mo19999E();
        int E2 = tVar.mo19999E();
        tVar2.mo20007M(50);
        int c = tVar.mo20010c();
        String str = null;
        int i9 = i;
        if (i9 == C2718c.f3714a0) {
            Pair<Integer, C2742m> p = m5487p(tVar2, i7, i8);
            if (p != null) {
                i9 = ((Integer) p.first).intValue();
                if (drmInitData2 == null) {
                    drmInitData2 = null;
                } else {
                    drmInitData2 = drmInitData2.mo23982c(((C2742m) p.second).f3929b);
                }
                cVar2.f3788a[i6] = (C2742m) p.second;
            }
            tVar2.mo20006L(c);
        }
        DrmInitData drmInitData3 = drmInitData2;
        int i10 = -1;
        List<byte[]> list = null;
        byte[] bArr = null;
        float f = 1.0f;
        boolean z = false;
        while (c - i7 < i8) {
            tVar2.mo20006L(c);
            int c2 = tVar.mo20010c();
            int j = tVar.mo20017j();
            if (j == 0 && tVar.mo20010c() - i7 == i8) {
                break;
            }
            C3151e.m7754b(j > 0, "childAtomSize should be positive");
            int j2 = tVar.mo20017j();
            if (j2 == C2718c.f3682I) {
                C3151e.m7759g(str == null);
                tVar2.mo20006L(c2 + 8);
                C3190h b = C3190h.m8037b(tVar);
                list = b.f5934a;
                cVar2.f3790c = b.f5935b;
                if (!z) {
                    f = b.f5938e;
                }
                str = VideoCapture.VIDEO_MIME_TYPE;
            } else if (j2 == C2718c.f3684J) {
                C3151e.m7759g(str == null);
                tVar2.mo20006L(c2 + 8);
                C3191i a = C3191i.m8038a(tVar);
                list = a.f5939a;
                cVar2.f3790c = a.f5940b;
                str = "video/hevc";
            } else if (j2 == C2718c.f3693N0) {
                C3151e.m7759g(str == null);
                str = i9 == C2718c.f3689L0 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
            } else if (j2 == C2718c.f3727h) {
                C3151e.m7759g(str == null);
                str = "video/3gpp";
            } else if (j2 == C2718c.f3686K) {
                C3151e.m7759g(str == null);
                Pair<String, byte[]> g = m5478g(tVar2, c2);
                str = (String) g.first;
                list = Collections.singletonList(g.second);
            } else if (j2 == C2718c.f3732j0) {
                f = m5485n(tVar2, c2);
                z = true;
            } else if (j2 == C2718c.f3685J0) {
                bArr = m5486o(tVar2, c2, j);
            } else if (j2 == C2718c.f3683I0) {
                int y = tVar.mo20032y();
                tVar2.mo20007M(3);
                if (y == 0) {
                    int y2 = tVar.mo20032y();
                    if (y2 == 0) {
                        i10 = 0;
                    } else if (y2 == 1) {
                        i10 = 1;
                    } else if (y2 == 2) {
                        i10 = 2;
                    } else if (y2 == 3) {
                        i10 = 3;
                    }
                }
            }
            c += j;
        }
        if (str != null) {
            cVar2.f3789b = Format.m10251y(Integer.toString(i4), str, (String) null, -1, -1, E, E2, -1.0f, list, i5, f, bArr, i10, (ColorInfo) null, drmInitData3);
        }
    }
}
