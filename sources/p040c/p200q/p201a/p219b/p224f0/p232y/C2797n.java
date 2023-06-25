package p040c.p200q.p201a.p219b.p224f0.p232y;

import android.util.SparseArray;
import androidx.camera.core.VideoCapture;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.util.ArrayList;
import java.util.Arrays;
import p040c.p200q.p201a.p219b.p224f0.C2676i;
import p040c.p200q.p201a.p219b.p224f0.C2686q;
import p040c.p200q.p201a.p219b.p224f0.p232y.C2781e0;
import p040c.p200q.p201a.p219b.p261o0.C3155g;
import p040c.p200q.p201a.p219b.p261o0.C3168q;
import p040c.p200q.p201a.p219b.p261o0.C3173t;
import p040c.p200q.p201a.p219b.p261o0.C3174u;

/* renamed from: c.q.a.b.f0.y.n */
/* compiled from: H264Reader */
public final class C2797n implements C2794l {

    /* renamed from: a */
    public final C2816z f4198a;

    /* renamed from: b */
    public final boolean f4199b;

    /* renamed from: c */
    public final boolean f4200c;

    /* renamed from: d */
    public final C2806s f4201d = new C2806s(7, 128);

    /* renamed from: e */
    public final C2806s f4202e = new C2806s(8, 128);

    /* renamed from: f */
    public final C2806s f4203f = new C2806s(6, 128);

    /* renamed from: g */
    public long f4204g;

    /* renamed from: h */
    public final boolean[] f4205h = new boolean[3];

    /* renamed from: i */
    public String f4206i;

    /* renamed from: j */
    public C2686q f4207j;

    /* renamed from: k */
    public C2799b f4208k;

    /* renamed from: l */
    public boolean f4209l;

    /* renamed from: m */
    public long f4210m;

    /* renamed from: n */
    public boolean f4211n;

    /* renamed from: o */
    public final C3173t f4212o = new C3173t();

    /* renamed from: c.q.a.b.f0.y.n$b */
    /* compiled from: H264Reader */
    public static final class C2799b {

        /* renamed from: a */
        public final C2686q f4213a;

        /* renamed from: b */
        public final boolean f4214b;

        /* renamed from: c */
        public final boolean f4215c;

        /* renamed from: d */
        public final SparseArray<C3168q.C3170b> f4216d = new SparseArray<>();

        /* renamed from: e */
        public final SparseArray<C3168q.C3169a> f4217e = new SparseArray<>();

        /* renamed from: f */
        public final C3174u f4218f;

        /* renamed from: g */
        public byte[] f4219g;

        /* renamed from: h */
        public int f4220h;

        /* renamed from: i */
        public int f4221i;

        /* renamed from: j */
        public long f4222j;

        /* renamed from: k */
        public boolean f4223k;

        /* renamed from: l */
        public long f4224l;

        /* renamed from: m */
        public C2800a f4225m = new C2800a();

        /* renamed from: n */
        public C2800a f4226n = new C2800a();

        /* renamed from: o */
        public boolean f4227o;

        /* renamed from: p */
        public long f4228p;

        /* renamed from: q */
        public long f4229q;

        /* renamed from: r */
        public boolean f4230r;

        /* renamed from: c.q.a.b.f0.y.n$b$a */
        /* compiled from: H264Reader */
        public static final class C2800a {

            /* renamed from: a */
            public boolean f4231a;

            /* renamed from: b */
            public boolean f4232b;

            /* renamed from: c */
            public C3168q.C3170b f4233c;

            /* renamed from: d */
            public int f4234d;

            /* renamed from: e */
            public int f4235e;

            /* renamed from: f */
            public int f4236f;

            /* renamed from: g */
            public int f4237g;

            /* renamed from: h */
            public boolean f4238h;

            /* renamed from: i */
            public boolean f4239i;

            /* renamed from: j */
            public boolean f4240j;

            /* renamed from: k */
            public boolean f4241k;

            /* renamed from: l */
            public int f4242l;

            /* renamed from: m */
            public int f4243m;

            /* renamed from: n */
            public int f4244n;

            /* renamed from: o */
            public int f4245o;

            /* renamed from: p */
            public int f4246p;

            public C2800a() {
            }

            /* renamed from: b */
            public void mo18817b() {
                this.f4232b = false;
                this.f4231a = false;
            }

            /* renamed from: c */
            public final boolean mo18818c(C2800a aVar) {
                boolean z;
                boolean z2;
                if (this.f4231a) {
                    if (!aVar.f4231a || this.f4236f != aVar.f4236f || this.f4237g != aVar.f4237g || this.f4238h != aVar.f4238h) {
                        return true;
                    }
                    if (this.f4239i && aVar.f4239i && this.f4240j != aVar.f4240j) {
                        return true;
                    }
                    int i = this.f4234d;
                    int i2 = aVar.f4234d;
                    if (i != i2 && (i == 0 || i2 == 0)) {
                        return true;
                    }
                    if (this.f4233c.f5870k == 0 && aVar.f4233c.f5870k == 0 && (this.f4243m != aVar.f4243m || this.f4244n != aVar.f4244n)) {
                        return true;
                    }
                    if ((this.f4233c.f5870k != 1 || aVar.f4233c.f5870k != 1 || (this.f4245o == aVar.f4245o && this.f4246p == aVar.f4246p)) && (z = this.f4241k) == (z2 = aVar.f4241k)) {
                        return z && z2 && this.f4242l != aVar.f4242l;
                    }
                    return true;
                }
            }

            /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
                r0 = r2.f4235e;
             */
            /* renamed from: d */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean mo18819d() {
                /*
                    r2 = this;
                    boolean r0 = r2.f4232b
                    if (r0 == 0) goto L_0x000e
                    int r0 = r2.f4235e
                    r1 = 7
                    if (r0 == r1) goto L_0x000c
                    r1 = 2
                    if (r0 != r1) goto L_0x000e
                L_0x000c:
                    r0 = 1
                    goto L_0x000f
                L_0x000e:
                    r0 = 0
                L_0x000f:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p224f0.p232y.C2797n.C2799b.C2800a.mo18819d():boolean");
            }

            /* renamed from: e */
            public void mo18820e(C3168q.C3170b bVar, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, int i5, int i6, int i7, int i8, int i9) {
                this.f4233c = bVar;
                this.f4234d = i;
                this.f4235e = i2;
                this.f4236f = i3;
                this.f4237g = i4;
                this.f4238h = z;
                this.f4239i = z2;
                this.f4240j = z3;
                this.f4241k = z4;
                this.f4242l = i5;
                this.f4243m = i6;
                this.f4244n = i7;
                this.f4245o = i8;
                this.f4246p = i9;
                this.f4231a = true;
                this.f4232b = true;
            }

            /* renamed from: f */
            public void mo18821f(int i) {
                this.f4235e = i;
                this.f4232b = true;
            }
        }

        public C2799b(C2686q qVar, boolean z, boolean z2) {
            this.f4213a = qVar;
            this.f4214b = z;
            this.f4215c = z2;
            byte[] bArr = new byte[128];
            this.f4219g = bArr;
            this.f4218f = new C3174u(bArr, 0, 0);
            mo18815g();
        }

        /* JADX WARNING: Removed duplicated region for block: B:51:0x00ff  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x0102  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x0106  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x0118  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x011e  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x0152  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo18809a(byte[] r24, int r25, int r26) {
            /*
                r23 = this;
                r0 = r23
                r1 = r25
                boolean r2 = r0.f4223k
                if (r2 != 0) goto L_0x0009
                return
            L_0x0009:
                int r2 = r26 - r1
                byte[] r3 = r0.f4219g
                int r4 = r3.length
                int r5 = r0.f4220h
                int r6 = r5 + r2
                r7 = 2
                if (r4 >= r6) goto L_0x001d
                int r5 = r5 + r2
                int r5 = r5 * r7
                byte[] r3 = java.util.Arrays.copyOf(r3, r5)
                r0.f4219g = r3
            L_0x001d:
                byte[] r3 = r0.f4219g
                int r4 = r0.f4220h
                r5 = r24
                java.lang.System.arraycopy(r5, r1, r3, r4, r2)
                int r1 = r0.f4220h
                int r1 = r1 + r2
                r0.f4220h = r1
                c.q.a.b.o0.u r2 = r0.f4218f
                byte[] r3 = r0.f4219g
                r4 = 0
                r2.mo20042i(r3, r4, r1)
                c.q.a.b.o0.u r1 = r0.f4218f
                r2 = 8
                boolean r1 = r1.mo20035b(r2)
                if (r1 != 0) goto L_0x003e
                return
            L_0x003e:
                c.q.a.b.o0.u r1 = r0.f4218f
                r1.mo20044k()
                c.q.a.b.o0.u r1 = r0.f4218f
                int r10 = r1.mo20038e(r7)
                c.q.a.b.o0.u r1 = r0.f4218f
                r2 = 5
                r1.mo20045l(r2)
                c.q.a.b.o0.u r1 = r0.f4218f
                boolean r1 = r1.mo20036c()
                if (r1 != 0) goto L_0x0058
                return
            L_0x0058:
                c.q.a.b.o0.u r1 = r0.f4218f
                r1.mo20041h()
                c.q.a.b.o0.u r1 = r0.f4218f
                boolean r1 = r1.mo20036c()
                if (r1 != 0) goto L_0x0066
                return
            L_0x0066:
                c.q.a.b.o0.u r1 = r0.f4218f
                int r11 = r1.mo20041h()
                boolean r1 = r0.f4215c
                if (r1 != 0) goto L_0x0078
                r0.f4223k = r4
                c.q.a.b.f0.y.n$b$a r1 = r0.f4226n
                r1.mo18821f(r11)
                return
            L_0x0078:
                c.q.a.b.o0.u r1 = r0.f4218f
                boolean r1 = r1.mo20036c()
                if (r1 != 0) goto L_0x0081
                return
            L_0x0081:
                c.q.a.b.o0.u r1 = r0.f4218f
                int r13 = r1.mo20041h()
                android.util.SparseArray<c.q.a.b.o0.q$a> r1 = r0.f4217e
                int r1 = r1.indexOfKey(r13)
                if (r1 >= 0) goto L_0x0092
                r0.f4223k = r4
                return
            L_0x0092:
                android.util.SparseArray<c.q.a.b.o0.q$a> r1 = r0.f4217e
                java.lang.Object r1 = r1.get(r13)
                c.q.a.b.o0.q$a r1 = (p040c.p200q.p201a.p219b.p261o0.C3168q.C3169a) r1
                android.util.SparseArray<c.q.a.b.o0.q$b> r3 = r0.f4216d
                int r5 = r1.f5858b
                java.lang.Object r3 = r3.get(r5)
                r9 = r3
                c.q.a.b.o0.q$b r9 = (p040c.p200q.p201a.p219b.p261o0.C3168q.C3170b) r9
                boolean r3 = r9.f5867h
                if (r3 == 0) goto L_0x00b7
                c.q.a.b.o0.u r3 = r0.f4218f
                boolean r3 = r3.mo20035b(r7)
                if (r3 != 0) goto L_0x00b2
                return
            L_0x00b2:
                c.q.a.b.o0.u r3 = r0.f4218f
                r3.mo20045l(r7)
            L_0x00b7:
                c.q.a.b.o0.u r3 = r0.f4218f
                int r5 = r9.f5869j
                boolean r3 = r3.mo20035b(r5)
                if (r3 != 0) goto L_0x00c2
                return
            L_0x00c2:
                c.q.a.b.o0.u r3 = r0.f4218f
                int r5 = r9.f5869j
                int r12 = r3.mo20038e(r5)
                boolean r3 = r9.f5868i
                r5 = 1
                if (r3 != 0) goto L_0x00f7
                c.q.a.b.o0.u r3 = r0.f4218f
                boolean r3 = r3.mo20035b(r5)
                if (r3 != 0) goto L_0x00d8
                return
            L_0x00d8:
                c.q.a.b.o0.u r3 = r0.f4218f
                boolean r3 = r3.mo20037d()
                if (r3 == 0) goto L_0x00f4
                c.q.a.b.o0.u r6 = r0.f4218f
                boolean r6 = r6.mo20035b(r5)
                if (r6 != 0) goto L_0x00e9
                return
            L_0x00e9:
                c.q.a.b.o0.u r6 = r0.f4218f
                boolean r6 = r6.mo20037d()
                r14 = r3
                r15 = r5
                r16 = r6
                goto L_0x00fb
            L_0x00f4:
                r14 = r3
                r15 = r4
                goto L_0x00f9
            L_0x00f7:
                r14 = r4
                r15 = r14
            L_0x00f9:
                r16 = r15
            L_0x00fb:
                int r3 = r0.f4221i
                if (r3 != r2) goto L_0x0102
                r17 = r5
                goto L_0x0104
            L_0x0102:
                r17 = r4
            L_0x0104:
                if (r17 == 0) goto L_0x0118
                c.q.a.b.o0.u r2 = r0.f4218f
                boolean r2 = r2.mo20036c()
                if (r2 != 0) goto L_0x010f
                return
            L_0x010f:
                c.q.a.b.o0.u r2 = r0.f4218f
                int r2 = r2.mo20041h()
                r18 = r2
                goto L_0x011a
            L_0x0118:
                r18 = r4
            L_0x011a:
                int r2 = r9.f5870k
                if (r2 != 0) goto L_0x0152
                c.q.a.b.o0.u r2 = r0.f4218f
                int r3 = r9.f5871l
                boolean r2 = r2.mo20035b(r3)
                if (r2 != 0) goto L_0x0129
                return
            L_0x0129:
                c.q.a.b.o0.u r2 = r0.f4218f
                int r3 = r9.f5871l
                int r2 = r2.mo20038e(r3)
                boolean r1 = r1.f5859c
                if (r1 == 0) goto L_0x014d
                if (r14 != 0) goto L_0x014d
                c.q.a.b.o0.u r1 = r0.f4218f
                boolean r1 = r1.mo20036c()
                if (r1 != 0) goto L_0x0140
                return
            L_0x0140:
                c.q.a.b.o0.u r1 = r0.f4218f
                int r1 = r1.mo20040g()
                r20 = r1
                r19 = r2
                r21 = r4
                goto L_0x0194
            L_0x014d:
                r19 = r2
                r20 = r4
                goto L_0x0192
            L_0x0152:
                if (r2 != r5) goto L_0x018e
                boolean r2 = r9.f5872m
                if (r2 != 0) goto L_0x018e
                c.q.a.b.o0.u r2 = r0.f4218f
                boolean r2 = r2.mo20036c()
                if (r2 != 0) goto L_0x0161
                return
            L_0x0161:
                c.q.a.b.o0.u r2 = r0.f4218f
                int r2 = r2.mo20040g()
                boolean r1 = r1.f5859c
                if (r1 == 0) goto L_0x0185
                if (r14 != 0) goto L_0x0185
                c.q.a.b.o0.u r1 = r0.f4218f
                boolean r1 = r1.mo20036c()
                if (r1 != 0) goto L_0x0176
                return
            L_0x0176:
                c.q.a.b.o0.u r1 = r0.f4218f
                int r1 = r1.mo20040g()
                r22 = r1
                r21 = r2
                r19 = r4
                r20 = r19
                goto L_0x0196
            L_0x0185:
                r21 = r2
                r19 = r4
                r20 = r19
                r22 = r20
                goto L_0x0196
            L_0x018e:
                r19 = r4
                r20 = r19
            L_0x0192:
                r21 = r20
            L_0x0194:
                r22 = r21
            L_0x0196:
                c.q.a.b.f0.y.n$b$a r8 = r0.f4226n
                r8.mo18820e(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
                r0.f4223k = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p224f0.p232y.C2797n.C2799b.mo18809a(byte[], int, int):void");
        }

        /* renamed from: b */
        public boolean mo18810b(long j, int i, boolean z, boolean z2) {
            boolean z3 = false;
            if (this.f4221i == 9 || (this.f4215c && this.f4226n.mo18818c(this.f4225m))) {
                if (z && this.f4227o) {
                    mo18812d(i + ((int) (j - this.f4222j)));
                }
                this.f4228p = this.f4222j;
                this.f4229q = this.f4224l;
                this.f4230r = false;
                this.f4227o = true;
            }
            if (this.f4214b) {
                z2 = this.f4226n.mo18819d();
            }
            boolean z4 = this.f4230r;
            int i2 = this.f4221i;
            if (i2 == 5 || (z2 && i2 == 1)) {
                z3 = true;
            }
            boolean z5 = z4 | z3;
            this.f4230r = z5;
            return z5;
        }

        /* renamed from: c */
        public boolean mo18811c() {
            return this.f4215c;
        }

        /* renamed from: d */
        public final void mo18812d(int i) {
            boolean z = this.f4230r;
            int i2 = (int) (this.f4222j - this.f4228p);
            this.f4213a.mo18545c(this.f4229q, z ? 1 : 0, i2, i, (C2686q.C2687a) null);
        }

        /* renamed from: e */
        public void mo18813e(C3168q.C3169a aVar) {
            this.f4217e.append(aVar.f5857a, aVar);
        }

        /* renamed from: f */
        public void mo18814f(C3168q.C3170b bVar) {
            this.f4216d.append(bVar.f5863d, bVar);
        }

        /* renamed from: g */
        public void mo18815g() {
            this.f4223k = false;
            this.f4227o = false;
            this.f4226n.mo18817b();
        }

        /* renamed from: h */
        public void mo18816h(long j, int i, long j2) {
            this.f4221i = i;
            this.f4224l = j2;
            this.f4222j = j;
            if (!this.f4214b || i != 1) {
                if (this.f4215c) {
                    int i2 = this.f4221i;
                    if (!(i2 == 5 || i2 == 1 || i2 == 2)) {
                        return;
                    }
                } else {
                    return;
                }
            }
            C2800a aVar = this.f4225m;
            this.f4225m = this.f4226n;
            this.f4226n = aVar;
            aVar.mo18817b();
            this.f4220h = 0;
            this.f4223k = true;
        }
    }

    public C2797n(C2816z zVar, boolean z, boolean z2) {
        this.f4198a = zVar;
        this.f4199b = z;
        this.f4200c = z2;
    }

    /* renamed from: a */
    public final void mo18806a(long j, int i, int i2, long j2) {
        int i3 = i2;
        if (!this.f4209l || this.f4208k.mo18811c()) {
            this.f4201d.mo18841b(i3);
            this.f4202e.mo18841b(i3);
            if (!this.f4209l) {
                if (this.f4201d.mo18842c() && this.f4202e.mo18842c()) {
                    ArrayList arrayList = new ArrayList();
                    C2806s sVar = this.f4201d;
                    arrayList.add(Arrays.copyOf(sVar.f4315d, sVar.f4316e));
                    C2806s sVar2 = this.f4202e;
                    arrayList.add(Arrays.copyOf(sVar2.f4315d, sVar2.f4316e));
                    C2806s sVar3 = this.f4201d;
                    C3168q.C3170b i4 = C3168q.m7910i(sVar3.f4315d, 3, sVar3.f4316e);
                    C2806s sVar4 = this.f4202e;
                    C3168q.C3169a h = C3168q.m7909h(sVar4.f4315d, 3, sVar4.f4316e);
                    this.f4207j.mo18546d(Format.m10250x(this.f4206i, VideoCapture.VIDEO_MIME_TYPE, C3155g.m7840c(i4.f5860a, i4.f5861b, i4.f5862c), -1, -1, i4.f5864e, i4.f5865f, -1.0f, arrayList, -1, i4.f5866g, (DrmInitData) null));
                    this.f4209l = true;
                    this.f4208k.mo18814f(i4);
                    this.f4208k.mo18813e(h);
                    this.f4201d.mo18843d();
                    this.f4202e.mo18843d();
                }
            } else if (this.f4201d.mo18842c()) {
                C2806s sVar5 = this.f4201d;
                this.f4208k.mo18814f(C3168q.m7910i(sVar5.f4315d, 3, sVar5.f4316e));
                this.f4201d.mo18843d();
            } else if (this.f4202e.mo18842c()) {
                C2806s sVar6 = this.f4202e;
                this.f4208k.mo18813e(C3168q.m7909h(sVar6.f4315d, 3, sVar6.f4316e));
                this.f4202e.mo18843d();
            }
        }
        if (this.f4203f.mo18841b(i2)) {
            C2806s sVar7 = this.f4203f;
            this.f4212o.mo20004J(this.f4203f.f4315d, C3168q.m7912k(sVar7.f4315d, sVar7.f4316e));
            this.f4212o.mo20006L(4);
            this.f4198a.mo18865a(j2, this.f4212o);
        }
        if (this.f4208k.mo18810b(j, i, this.f4209l, this.f4211n)) {
            this.f4211n = false;
        }
    }

    /* renamed from: b */
    public void mo18766b(C3173t tVar) {
        int c = tVar.mo20010c();
        int d = tVar.mo20011d();
        byte[] bArr = tVar.f5877a;
        this.f4204g += (long) tVar.mo20008a();
        this.f4207j.mo18544b(tVar, tVar.mo20008a());
        while (true) {
            int c2 = C3168q.m7904c(bArr, c, d, this.f4205h);
            if (c2 == d) {
                mo18807g(bArr, c, d);
                return;
            }
            int f = C3168q.m7907f(bArr, c2);
            int i = c2 - c;
            if (i > 0) {
                mo18807g(bArr, c, c2);
            }
            int i2 = d - c2;
            long j = this.f4204g - ((long) i2);
            mo18806a(j, i2, i < 0 ? -i : 0, this.f4210m);
            mo18808h(j, f, this.f4210m);
            c = c2 + 3;
        }
    }

    /* renamed from: c */
    public void mo18767c() {
        C3168q.m7902a(this.f4205h);
        this.f4201d.mo18843d();
        this.f4202e.mo18843d();
        this.f4203f.mo18843d();
        this.f4208k.mo18815g();
        this.f4204g = 0;
        this.f4211n = false;
    }

    /* renamed from: d */
    public void mo18768d() {
    }

    /* renamed from: e */
    public void mo18769e(C2676i iVar, C2781e0.C2785d dVar) {
        dVar.mo18761a();
        this.f4206i = dVar.mo18762b();
        C2686q a = iVar.mo18552a(dVar.mo18763c(), 2);
        this.f4207j = a;
        this.f4208k = new C2799b(a, this.f4199b, this.f4200c);
        this.f4198a.mo18866b(iVar, dVar);
    }

    /* renamed from: f */
    public void mo18770f(long j, int i) {
        this.f4210m = j;
        this.f4211n |= (i & 2) != 0;
    }

    /* renamed from: g */
    public final void mo18807g(byte[] bArr, int i, int i2) {
        if (!this.f4209l || this.f4208k.mo18811c()) {
            this.f4201d.mo18840a(bArr, i, i2);
            this.f4202e.mo18840a(bArr, i, i2);
        }
        this.f4203f.mo18840a(bArr, i, i2);
        this.f4208k.mo18809a(bArr, i, i2);
    }

    /* renamed from: h */
    public final void mo18808h(long j, int i, long j2) {
        if (!this.f4209l || this.f4208k.mo18811c()) {
            this.f4201d.mo18844e(i);
            this.f4202e.mo18844e(i);
        }
        this.f4203f.mo18844e(i);
        this.f4208k.mo18816h(j, i, j2);
    }
}
