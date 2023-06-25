package p040c.p200q.p201a.p219b.p250l0.p253m;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;
import p040c.p200q.p201a.p219b.p250l0.C3031a;
import p040c.p200q.p201a.p219b.p250l0.C3032b;
import p040c.p200q.p201a.p219b.p250l0.C3034d;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.l0.m.a */
/* compiled from: PgsDecoder */
public final class C3067a extends C3032b {

    /* renamed from: n */
    public final C3173t f5495n = new C3173t();

    /* renamed from: o */
    public final C3173t f5496o = new C3173t();

    /* renamed from: p */
    public final C3068a f5497p = new C3068a();

    /* renamed from: q */
    public Inflater f5498q;

    /* renamed from: c.q.a.b.l0.m.a$a */
    /* compiled from: PgsDecoder */
    public static final class C3068a {

        /* renamed from: a */
        public final C3173t f5499a = new C3173t();

        /* renamed from: b */
        public final int[] f5500b = new int[256];

        /* renamed from: c */
        public boolean f5501c;

        /* renamed from: d */
        public int f5502d;

        /* renamed from: e */
        public int f5503e;

        /* renamed from: f */
        public int f5504f;

        /* renamed from: g */
        public int f5505g;

        /* renamed from: h */
        public int f5506h;

        /* renamed from: i */
        public int f5507i;

        /* renamed from: d */
        public C3031a mo19706d() {
            int i;
            int i2;
            int i3;
            if (this.f5502d == 0 || this.f5503e == 0 || this.f5506h == 0 || this.f5507i == 0 || this.f5499a.mo20011d() == 0 || this.f5499a.mo20010c() != this.f5499a.mo20011d() || !this.f5501c) {
                return null;
            }
            this.f5499a.mo20006L(0);
            int i4 = this.f5506h * this.f5507i;
            int[] iArr = new int[i4];
            int i5 = 0;
            while (i5 < i4) {
                int y = this.f5499a.mo20032y();
                if (y != 0) {
                    i3 = i5 + 1;
                    iArr[i5] = this.f5500b[y];
                } else {
                    int y2 = this.f5499a.mo20032y();
                    if (y2 != 0) {
                        if ((y2 & 64) == 0) {
                            i = y2 & 63;
                        } else {
                            i = ((y2 & 63) << 8) | this.f5499a.mo20032y();
                        }
                        if ((y2 & 128) == 0) {
                            i2 = 0;
                        } else {
                            i2 = this.f5500b[this.f5499a.mo20032y()];
                        }
                        i3 = i + i5;
                        Arrays.fill(iArr, i5, i3, i2);
                    }
                }
                i5 = i3;
            }
            Bitmap createBitmap = Bitmap.createBitmap(iArr, this.f5506h, this.f5507i, Bitmap.Config.ARGB_8888);
            int i6 = this.f5502d;
            float f = ((float) this.f5504f) / ((float) i6);
            int i7 = this.f5503e;
            return new C3031a(createBitmap, f, 0, ((float) this.f5505g) / ((float) i7), 0, ((float) this.f5506h) / ((float) i6), ((float) this.f5507i) / ((float) i7));
        }

        /* renamed from: e */
        public final void mo19707e(C3173t tVar, int i) {
            int B;
            if (i >= 4) {
                tVar.mo20007M(3);
                int i2 = i - 4;
                if ((tVar.mo20032y() & 128) != 0) {
                    if (i2 >= 7 && (B = tVar.mo19996B()) >= 4) {
                        this.f5506h = tVar.mo19999E();
                        this.f5507i = tVar.mo19999E();
                        this.f5499a.mo20002H(B - 4);
                        i2 -= 7;
                    } else {
                        return;
                    }
                }
                int c = this.f5499a.mo20010c();
                int d = this.f5499a.mo20011d();
                if (c < d && i2 > 0) {
                    int min = Math.min(i2, d - c);
                    tVar.mo20015h(this.f5499a.f5877a, c, min);
                    this.f5499a.mo20006L(c + min);
                }
            }
        }

        /* renamed from: f */
        public final void mo19708f(C3173t tVar, int i) {
            if (i >= 19) {
                this.f5502d = tVar.mo19999E();
                this.f5503e = tVar.mo19999E();
                tVar.mo20007M(11);
                this.f5504f = tVar.mo19999E();
                this.f5505g = tVar.mo19999E();
            }
        }

        /* renamed from: g */
        public final void mo19709g(C3173t tVar, int i) {
            if (i % 5 == 2) {
                tVar.mo20007M(2);
                Arrays.fill(this.f5500b, 0);
                int i2 = i / 5;
                int i3 = 0;
                while (i3 < i2) {
                    int y = tVar.mo20032y();
                    int y2 = tVar.mo20032y();
                    int y3 = tVar.mo20032y();
                    int y4 = tVar.mo20032y();
                    int y5 = tVar.mo20032y();
                    double d = (double) y2;
                    double d2 = (double) (y3 - 128);
                    int i4 = i3;
                    double d3 = (double) (y4 - 128);
                    this.f5500b[y] = C3152e0.m7813n((int) (d + (d3 * 1.772d)), 0, 255) | (C3152e0.m7813n((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255) << 8) | (y5 << 24) | (C3152e0.m7813n((int) ((1.402d * d2) + d), 0, 255) << 16);
                    i3 = i4 + 1;
                }
                this.f5501c = true;
            }
        }

        /* renamed from: h */
        public void mo19710h() {
            this.f5502d = 0;
            this.f5503e = 0;
            this.f5504f = 0;
            this.f5505g = 0;
            this.f5506h = 0;
            this.f5507i = 0;
            this.f5499a.mo20002H(0);
            this.f5501c = false;
        }
    }

    public C3067a() {
        super("PgsDecoder");
    }

    /* renamed from: C */
    public static C3031a m7326C(C3173t tVar, C3068a aVar) {
        int d = tVar.mo20011d();
        int y = tVar.mo20032y();
        int E = tVar.mo19999E();
        int c = tVar.mo20010c() + E;
        C3031a aVar2 = null;
        if (c > d) {
            tVar.mo20006L(d);
            return null;
        }
        if (y != 128) {
            switch (y) {
                case 20:
                    aVar.mo19709g(tVar, E);
                    break;
                case 21:
                    aVar.mo19707e(tVar, E);
                    break;
                case 22:
                    aVar.mo19708f(tVar, E);
                    break;
            }
        } else {
            aVar2 = aVar.mo19706d();
            aVar.mo19710h();
        }
        tVar.mo20006L(c);
        return aVar2;
    }

    /* renamed from: B */
    public final void mo19705B(C3173t tVar) {
        if (tVar.mo20008a() > 0 && tVar.mo20013f() == 120) {
            if (this.f5498q == null) {
                this.f5498q = new Inflater();
            }
            if (C3152e0.m7775O(tVar, this.f5496o, this.f5498q)) {
                C3173t tVar2 = this.f5496o;
                tVar.mo20004J(tVar2.f5877a, tVar2.mo20011d());
            }
        }
    }

    /* renamed from: y */
    public C3034d mo19616y(byte[] bArr, int i, boolean z) {
        this.f5495n.mo20004J(bArr, i);
        mo19705B(this.f5495n);
        this.f5497p.mo19710h();
        ArrayList arrayList = new ArrayList();
        while (this.f5495n.mo20008a() >= 3) {
            C3031a C = m7326C(this.f5495n, this.f5497p);
            if (C != null) {
                arrayList.add(C);
            }
        }
        return new C3069b(Collections.unmodifiableList(arrayList));
    }
}
