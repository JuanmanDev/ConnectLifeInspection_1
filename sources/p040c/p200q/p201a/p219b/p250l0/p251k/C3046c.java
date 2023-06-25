package p040c.p200q.p201a.p219b.p250l0.p251k;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.text.Typography;
import okio.Utf8;
import p040c.p200q.p201a.p219b.p250l0.C3031a;
import p040c.p200q.p201a.p219b.p250l0.C3034d;
import p040c.p200q.p201a.p219b.p250l0.C3038g;
import p040c.p200q.p201a.p219b.p261o0.C3151e;
import p040c.p200q.p201a.p219b.p261o0.C3163m;
import p040c.p200q.p201a.p219b.p261o0.C3172s;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.l0.k.c */
/* compiled from: Cea708Decoder */
public final class C3046c extends C3050e {

    /* renamed from: g */
    public final C3173t f5387g = new C3173t();

    /* renamed from: h */
    public final C3172s f5388h = new C3172s();

    /* renamed from: i */
    public final int f5389i;

    /* renamed from: j */
    public final C3047a[] f5390j;

    /* renamed from: k */
    public C3047a f5391k;

    /* renamed from: l */
    public List<C3031a> f5392l;

    /* renamed from: m */
    public List<C3031a> f5393m;

    /* renamed from: n */
    public C3048b f5394n;

    /* renamed from: o */
    public int f5395o;

    /* renamed from: c.q.a.b.l0.k.c$a */
    /* compiled from: Cea708Decoder */
    public static final class C3047a {

        /* renamed from: A */
        public static final int[] f5396A = {0, 0, 0, 0, 0, 0, 2};

        /* renamed from: B */
        public static final int[] f5397B = {3, 3, 3, 3, 3, 3, 1};

        /* renamed from: C */
        public static final boolean[] f5398C = {false, false, false, true, true, true, false};

        /* renamed from: D */
        public static final int[] f5399D;

        /* renamed from: E */
        public static final int[] f5400E = {0, 1, 2, 3, 4, 3, 4};

        /* renamed from: F */
        public static final int[] f5401F = {0, 0, 0, 0, 0, 3, 3};

        /* renamed from: G */
        public static final int[] f5402G;

        /* renamed from: w */
        public static final int f5403w = m7261h(2, 2, 2, 0);

        /* renamed from: x */
        public static final int f5404x = m7261h(0, 0, 0, 0);

        /* renamed from: y */
        public static final int f5405y;

        /* renamed from: z */
        public static final int[] f5406z = {0, 0, 0, 0, 0, 2, 0};

        /* renamed from: a */
        public final List<SpannableString> f5407a = new ArrayList();

        /* renamed from: b */
        public final SpannableStringBuilder f5408b = new SpannableStringBuilder();

        /* renamed from: c */
        public boolean f5409c;

        /* renamed from: d */
        public boolean f5410d;

        /* renamed from: e */
        public int f5411e;

        /* renamed from: f */
        public boolean f5412f;

        /* renamed from: g */
        public int f5413g;

        /* renamed from: h */
        public int f5414h;

        /* renamed from: i */
        public int f5415i;

        /* renamed from: j */
        public int f5416j;

        /* renamed from: k */
        public boolean f5417k;

        /* renamed from: l */
        public int f5418l;

        /* renamed from: m */
        public int f5419m;

        /* renamed from: n */
        public int f5420n;

        /* renamed from: o */
        public int f5421o;

        /* renamed from: p */
        public int f5422p;

        /* renamed from: q */
        public int f5423q;

        /* renamed from: r */
        public int f5424r;

        /* renamed from: s */
        public int f5425s;

        /* renamed from: t */
        public int f5426t;

        /* renamed from: u */
        public int f5427u;

        /* renamed from: v */
        public int f5428v;

        static {
            int h = m7261h(0, 0, 0, 3);
            f5405y = h;
            int i = f5404x;
            f5399D = new int[]{i, h, i, i, h, i, i};
            f5402G = new int[]{i, i, i, i, i, h, h};
        }

        public C3047a() {
            mo19687l();
        }

        /* renamed from: g */
        public static int m7260g(int i, int i2, int i3) {
            return m7261h(i, i2, i3, 0);
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0024  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0029  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x002b  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x002e  */
        /* renamed from: h */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int m7261h(int r4, int r5, int r6, int r7) {
            /*
                r0 = 0
                r1 = 4
                p040c.p200q.p201a.p219b.p261o0.C3151e.m7755c(r4, r0, r1)
                p040c.p200q.p201a.p219b.p261o0.C3151e.m7755c(r5, r0, r1)
                p040c.p200q.p201a.p219b.p261o0.C3151e.m7755c(r6, r0, r1)
                p040c.p200q.p201a.p219b.p261o0.C3151e.m7755c(r7, r0, r1)
                r1 = 1
                r2 = 255(0xff, float:3.57E-43)
                if (r7 == 0) goto L_0x0021
                if (r7 == r1) goto L_0x0021
                r3 = 2
                if (r7 == r3) goto L_0x001e
                r3 = 3
                if (r7 == r3) goto L_0x001c
                goto L_0x0021
            L_0x001c:
                r7 = r0
                goto L_0x0022
            L_0x001e:
                r7 = 127(0x7f, float:1.78E-43)
                goto L_0x0022
            L_0x0021:
                r7 = r2
            L_0x0022:
                if (r4 <= r1) goto L_0x0026
                r4 = r2
                goto L_0x0027
            L_0x0026:
                r4 = r0
            L_0x0027:
                if (r5 <= r1) goto L_0x002b
                r5 = r2
                goto L_0x002c
            L_0x002b:
                r5 = r0
            L_0x002c:
                if (r6 <= r1) goto L_0x002f
                r0 = r2
            L_0x002f:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p250l0.p251k.C3046c.C3047a.m7261h(int, int, int, int):int");
        }

        /* renamed from: a */
        public void mo19678a(char c) {
            if (c == 10) {
                this.f5407a.add(mo19681d());
                this.f5408b.clear();
                if (this.f5422p != -1) {
                    this.f5422p = 0;
                }
                if (this.f5423q != -1) {
                    this.f5423q = 0;
                }
                if (this.f5424r != -1) {
                    this.f5424r = 0;
                }
                if (this.f5426t != -1) {
                    this.f5426t = 0;
                }
                while (true) {
                    if ((this.f5417k && this.f5407a.size() >= this.f5416j) || this.f5407a.size() >= 15) {
                        this.f5407a.remove(0);
                    } else {
                        return;
                    }
                }
            } else {
                this.f5408b.append(c);
            }
        }

        /* renamed from: b */
        public void mo19679b() {
            int length = this.f5408b.length();
            if (length > 0) {
                this.f5408b.delete(length - 1, length);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0065  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0070  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x008f  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0091  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x009d  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x009f  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00ab  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public p040c.p200q.p201a.p219b.p250l0.p251k.C3045b mo19680c() {
            /*
                r15 = this;
                boolean r0 = r15.mo19685j()
                if (r0 == 0) goto L_0x0008
                r0 = 0
                return r0
            L_0x0008:
                android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
                r2.<init>()
                r0 = 0
                r1 = r0
            L_0x000f:
                java.util.List<android.text.SpannableString> r3 = r15.f5407a
                int r3 = r3.size()
                if (r1 >= r3) goto L_0x002a
                java.util.List<android.text.SpannableString> r3 = r15.f5407a
                java.lang.Object r3 = r3.get(r1)
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                r2.append(r3)
                r3 = 10
                r2.append(r3)
                int r1 = r1 + 1
                goto L_0x000f
            L_0x002a:
                android.text.SpannableString r1 = r15.mo19681d()
                r2.append(r1)
                int r1 = r15.f5418l
                r3 = 2
                r4 = 3
                r5 = 1
                if (r1 == 0) goto L_0x005e
                if (r1 == r5) goto L_0x005b
                if (r1 == r3) goto L_0x0058
                if (r1 != r4) goto L_0x003f
                goto L_0x005e
            L_0x003f:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unexpected justification value: "
                r1.append(r2)
                int r2 = r15.f5418l
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0058:
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_CENTER
                goto L_0x0060
            L_0x005b:
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE
                goto L_0x0060
            L_0x005e:
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL
            L_0x0060:
                r6 = r1
                boolean r1 = r15.f5412f
                if (r1 == 0) goto L_0x0070
                int r1 = r15.f5414h
                float r1 = (float) r1
                r7 = 1120272384(0x42c60000, float:99.0)
                float r1 = r1 / r7
                int r8 = r15.f5413g
                float r8 = (float) r8
                float r8 = r8 / r7
                goto L_0x007d
            L_0x0070:
                int r1 = r15.f5414h
                float r1 = (float) r1
                r7 = 1129381888(0x43510000, float:209.0)
                float r1 = r1 / r7
                int r7 = r15.f5413g
                float r7 = (float) r7
                r8 = 1116995584(0x42940000, float:74.0)
                float r8 = r7 / r8
            L_0x007d:
                r7 = 1063675494(0x3f666666, float:0.9)
                float r1 = r1 * r7
                r9 = 1028443341(0x3d4ccccd, float:0.05)
                float r10 = r1 + r9
                float r8 = r8 * r7
                float r7 = r8 + r9
                int r1 = r15.f5415i
                int r8 = r1 % 3
                if (r8 != 0) goto L_0x0091
                r8 = r0
                goto L_0x0097
            L_0x0091:
                int r1 = r1 % r4
                if (r1 != r5) goto L_0x0096
                r8 = r5
                goto L_0x0097
            L_0x0096:
                r8 = r3
            L_0x0097:
                int r1 = r15.f5415i
                int r9 = r1 / 3
                if (r9 != 0) goto L_0x009f
                r9 = r0
                goto L_0x00a5
            L_0x009f:
                int r1 = r1 / r4
                if (r1 != r5) goto L_0x00a4
                r9 = r5
                goto L_0x00a5
            L_0x00a4:
                r9 = r3
            L_0x00a5:
                int r1 = r15.f5421o
                int r3 = f5404x
                if (r1 == r3) goto L_0x00ac
                r0 = r5
            L_0x00ac:
                c.q.a.b.l0.k.b r13 = new c.q.a.b.l0.k.b
                r5 = 0
                r11 = 1
                int r12 = r15.f5421o
                int r14 = r15.f5411e
                r1 = r13
                r3 = r6
                r4 = r7
                r6 = r8
                r7 = r10
                r8 = r9
                r9 = r11
                r10 = r0
                r11 = r12
                r12 = r14
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p250l0.p251k.C3046c.C3047a.mo19680c():c.q.a.b.l0.k.b");
        }

        /* renamed from: d */
        public SpannableString mo19681d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f5408b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f5422p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f5422p, length, 33);
                }
                if (this.f5423q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f5423q, length, 33);
                }
                if (this.f5424r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f5425s), this.f5424r, length, 33);
                }
                if (this.f5426t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f5427u), this.f5426t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        /* renamed from: e */
        public void mo19682e() {
            this.f5407a.clear();
            this.f5408b.clear();
            this.f5422p = -1;
            this.f5423q = -1;
            this.f5424r = -1;
            this.f5426t = -1;
            this.f5428v = 0;
        }

        /* renamed from: f */
        public void mo19683f(boolean z, boolean z2, boolean z3, int i, boolean z4, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            boolean z5 = z2;
            int i9 = i7;
            int i10 = i8;
            this.f5409c = true;
            this.f5410d = z;
            this.f5417k = z5;
            this.f5411e = i;
            this.f5412f = z4;
            this.f5413g = i2;
            this.f5414h = i3;
            this.f5415i = i6;
            int i11 = i4 + 1;
            if (this.f5416j != i11) {
                this.f5416j = i11;
                while (true) {
                    if ((!z5 || this.f5407a.size() < this.f5416j) && this.f5407a.size() < 15) {
                        break;
                    }
                    this.f5407a.remove(0);
                }
            }
            if (!(i9 == 0 || this.f5419m == i9)) {
                this.f5419m = i9;
                int i12 = i9 - 1;
                mo19692q(f5399D[i12], f5405y, f5398C[i12], 0, f5396A[i12], f5397B[i12], f5406z[i12]);
            }
            if (i10 != 0 && this.f5420n != i10) {
                this.f5420n = i10;
                int i13 = i10 - 1;
                mo19688m(0, 1, 1, false, false, f5401F[i13], f5400E[i13]);
                mo19689n(f5403w, f5402G[i13], f5404x);
            }
        }

        /* renamed from: i */
        public boolean mo19684i() {
            return this.f5409c;
        }

        /* renamed from: j */
        public boolean mo19685j() {
            return !mo19684i() || (this.f5407a.isEmpty() && this.f5408b.length() == 0);
        }

        /* renamed from: k */
        public boolean mo19686k() {
            return this.f5410d;
        }

        /* renamed from: l */
        public void mo19687l() {
            mo19682e();
            this.f5409c = false;
            this.f5410d = false;
            this.f5411e = 4;
            this.f5412f = false;
            this.f5413g = 0;
            this.f5414h = 0;
            this.f5415i = 0;
            this.f5416j = 15;
            this.f5417k = true;
            this.f5418l = 0;
            this.f5419m = 0;
            this.f5420n = 0;
            int i = f5404x;
            this.f5421o = i;
            this.f5425s = f5403w;
            this.f5427u = i;
        }

        /* renamed from: m */
        public void mo19688m(int i, int i2, int i3, boolean z, boolean z2, int i4, int i5) {
            if (this.f5422p != -1) {
                if (!z) {
                    this.f5408b.setSpan(new StyleSpan(2), this.f5422p, this.f5408b.length(), 33);
                    this.f5422p = -1;
                }
            } else if (z) {
                this.f5422p = this.f5408b.length();
            }
            if (this.f5423q != -1) {
                if (!z2) {
                    this.f5408b.setSpan(new UnderlineSpan(), this.f5423q, this.f5408b.length(), 33);
                    this.f5423q = -1;
                }
            } else if (z2) {
                this.f5423q = this.f5408b.length();
            }
        }

        /* renamed from: n */
        public void mo19689n(int i, int i2, int i3) {
            if (!(this.f5424r == -1 || this.f5425s == i)) {
                this.f5408b.setSpan(new ForegroundColorSpan(this.f5425s), this.f5424r, this.f5408b.length(), 33);
            }
            if (i != f5403w) {
                this.f5424r = this.f5408b.length();
                this.f5425s = i;
            }
            if (!(this.f5426t == -1 || this.f5427u == i2)) {
                this.f5408b.setSpan(new BackgroundColorSpan(this.f5427u), this.f5426t, this.f5408b.length(), 33);
            }
            if (i2 != f5404x) {
                this.f5426t = this.f5408b.length();
                this.f5427u = i2;
            }
        }

        /* renamed from: o */
        public void mo19690o(int i, int i2) {
            if (this.f5428v != i) {
                mo19678a(10);
            }
            this.f5428v = i;
        }

        /* renamed from: p */
        public void mo19691p(boolean z) {
            this.f5410d = z;
        }

        /* renamed from: q */
        public void mo19692q(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
            this.f5421o = i;
            this.f5418l = i6;
        }
    }

    /* renamed from: c.q.a.b.l0.k.c$b */
    /* compiled from: Cea708Decoder */
    public static final class C3048b {

        /* renamed from: a */
        public final int f5429a;

        /* renamed from: b */
        public final int f5430b;

        /* renamed from: c */
        public final byte[] f5431c;

        /* renamed from: d */
        public int f5432d = 0;

        public C3048b(int i, int i2) {
            this.f5429a = i;
            this.f5430b = i2;
            this.f5431c = new byte[((i2 * 2) - 1)];
        }
    }

    public C3046c(int i, List<byte[]> list) {
        this.f5389i = i == -1 ? 1 : i;
        this.f5390j = new C3047a[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.f5390j[i2] = new C3047a();
        }
        this.f5391k = this.f5390j[0];
        mo19663C();
    }

    /* renamed from: A */
    public final void mo19661A() {
        int h = C3047a.m7261h(this.f5388h.mo19985h(2), this.f5388h.mo19985h(2), this.f5388h.mo19985h(2), this.f5388h.mo19985h(2));
        int h2 = this.f5388h.mo19985h(2);
        int g = C3047a.m7260g(this.f5388h.mo19985h(2), this.f5388h.mo19985h(2), this.f5388h.mo19985h(2));
        if (this.f5388h.mo19984g()) {
            h2 |= 4;
        }
        boolean g2 = this.f5388h.mo19984g();
        int h3 = this.f5388h.mo19985h(2);
        int h4 = this.f5388h.mo19985h(2);
        int h5 = this.f5388h.mo19985h(2);
        this.f5388h.mo19993p(8);
        this.f5391k.mo19692q(h, g, g2, h2, h3, h4, h5);
    }

    /* renamed from: B */
    public final void mo19662B() {
        C3048b bVar = this.f5394n;
        int i = bVar.f5432d;
        if (i != (bVar.f5430b * 2) - 1) {
            C3163m.m7880f("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f5394n.f5430b * 2) - 1) + ", but current index is " + this.f5394n.f5432d + " (sequence number " + this.f5394n.f5429a + "); ignoring packet");
            return;
        }
        this.f5388h.mo19990m(bVar.f5431c, i);
        int h = this.f5388h.mo19985h(3);
        int h2 = this.f5388h.mo19985h(5);
        if (h == 7) {
            this.f5388h.mo19993p(2);
            h = this.f5388h.mo19985h(6);
            if (h < 7) {
                C3163m.m7880f("Cea708Decoder", "Invalid extended service number: " + h);
            }
        }
        if (h2 == 0) {
            if (h != 0) {
                C3163m.m7880f("Cea708Decoder", "serviceNumber is non-zero (" + h + ") when blockSize is 0");
            }
        } else if (h == this.f5389i) {
            boolean z = false;
            while (this.f5388h.mo19979b() > 0) {
                int h3 = this.f5388h.mo19985h(8);
                if (h3 == 16) {
                    int h4 = this.f5388h.mo19985h(8);
                    if (h4 <= 31) {
                        mo19668q(h4);
                    } else if (h4 <= 127) {
                        mo19673v(h4);
                    } else if (h4 <= 159) {
                        mo19669r(h4);
                    } else if (h4 <= 255) {
                        mo19674w(h4);
                    } else {
                        C3163m.m7880f("Cea708Decoder", "Invalid extended command: " + h4);
                    }
                } else if (h3 <= 31) {
                    mo19666o(h3);
                } else if (h3 <= 127) {
                    mo19671t(h3);
                } else if (h3 <= 159) {
                    mo19667p(h3);
                } else if (h3 <= 255) {
                    mo19672u(h3);
                } else {
                    C3163m.m7880f("Cea708Decoder", "Invalid base command: " + h3);
                }
                z = true;
            }
            if (z) {
                this.f5392l = mo19665n();
            }
        }
    }

    /* renamed from: C */
    public final void mo19663C() {
        for (int i = 0; i < 8; i++) {
            this.f5390j[i].mo19687l();
        }
    }

    /* renamed from: e */
    public C3034d mo19637e() {
        List<C3031a> list = this.f5392l;
        this.f5393m = list;
        return new C3054f(list);
    }

    /* renamed from: f */
    public void mo19638f(C3038g gVar) {
        this.f5387g.mo20004J(gVar.f3307m.array(), gVar.f3307m.limit());
        while (this.f5387g.mo20008a() >= 3) {
            int y = this.f5387g.mo20032y() & 7;
            int i = y & 3;
            boolean z = false;
            boolean z2 = (y & 4) == 4;
            byte y2 = (byte) this.f5387g.mo20032y();
            byte y3 = (byte) this.f5387g.mo20032y();
            if ((i == 2 || i == 3) && z2) {
                if (i == 3) {
                    mo19664m();
                    int i2 = (y2 & ExifInterface.MARKER_SOF0) >> 6;
                    byte b = y2 & Utf8.REPLACEMENT_BYTE;
                    if (b == 0) {
                        b = 64;
                    }
                    C3048b bVar = new C3048b(i2, b);
                    this.f5394n = bVar;
                    byte[] bArr = bVar.f5431c;
                    int i3 = bVar.f5432d;
                    bVar.f5432d = i3 + 1;
                    bArr[i3] = y3;
                } else {
                    if (i == 2) {
                        z = true;
                    }
                    C3151e.m7753a(z);
                    C3048b bVar2 = this.f5394n;
                    if (bVar2 == null) {
                        C3163m.m7877c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                    } else {
                        byte[] bArr2 = bVar2.f5431c;
                        int i4 = bVar2.f5432d;
                        int i5 = i4 + 1;
                        bVar2.f5432d = i5;
                        bArr2[i4] = y2;
                        bVar2.f5432d = i5 + 1;
                        bArr2[i5] = y3;
                    }
                }
                C3048b bVar3 = this.f5394n;
                if (bVar3.f5432d == (bVar3.f5430b * 2) - 1) {
                    mo19664m();
                }
            }
        }
    }

    public void flush() {
        super.flush();
        this.f5392l = null;
        this.f5393m = null;
        this.f5395o = 0;
        this.f5391k = this.f5390j[0];
        mo19663C();
        this.f5394n = null;
    }

    /* renamed from: i */
    public boolean mo19639i() {
        return this.f5392l != this.f5393m;
    }

    /* renamed from: m */
    public final void mo19664m() {
        if (this.f5394n != null) {
            mo19662B();
            this.f5394n = null;
        }
    }

    /* renamed from: n */
    public final List<C3031a> mo19665n() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            if (!this.f5390j[i].mo19685j() && this.f5390j[i].mo19686k()) {
                arrayList.add(this.f5390j[i].mo19680c());
            }
        }
        Collections.sort(arrayList);
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: o */
    public final void mo19666o(int i) {
        if (i == 0) {
            return;
        }
        if (i == 3) {
            this.f5392l = mo19665n();
        } else if (i != 8) {
            switch (i) {
                case 12:
                    mo19663C();
                    return;
                case 13:
                    this.f5391k.mo19678a(10);
                    return;
                case 14:
                    return;
                default:
                    if (i >= 17 && i <= 23) {
                        C3163m.m7880f("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i);
                        this.f5388h.mo19993p(8);
                        return;
                    } else if (i < 24 || i > 31) {
                        C3163m.m7880f("Cea708Decoder", "Invalid C0 command: " + i);
                        return;
                    } else {
                        C3163m.m7880f("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i);
                        this.f5388h.mo19993p(16);
                        return;
                    }
            }
        } else {
            this.f5391k.mo19679b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0093, code lost:
        if (r2 > 8) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009b, code lost:
        if (r4.f5388h.mo19984g() == false) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009d, code lost:
        r4.f5390j[8 - r2].mo19687l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a6, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c5, code lost:
        if (r2 > 8) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cd, code lost:
        if (r4.f5388h.mo19984g() == false) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cf, code lost:
        r4.f5390j[8 - r2].mo19691p(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d9, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f3, code lost:
        if (r2 > 8) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00fb, code lost:
        if (r4.f5388h.mo19984g() == false) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00fd, code lost:
        r4.f5390j[8 - r2].mo19682e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0106, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        return;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19667p(int r5) {
        /*
            r4 = this;
            r0 = 16
            r1 = 8
            r2 = 1
            switch(r5) {
                case 128: goto L_0x0109;
                case 129: goto L_0x0109;
                case 130: goto L_0x0109;
                case 131: goto L_0x0109;
                case 132: goto L_0x0109;
                case 133: goto L_0x0109;
                case 134: goto L_0x0109;
                case 135: goto L_0x0109;
                case 136: goto L_0x00f3;
                case 137: goto L_0x00dc;
                case 138: goto L_0x00c5;
                case 139: goto L_0x00a9;
                case 140: goto L_0x0093;
                case 141: goto L_0x008c;
                case 142: goto L_0x0117;
                case 143: goto L_0x0087;
                case 144: goto L_0x0073;
                case 145: goto L_0x005d;
                case 146: goto L_0x0049;
                case 147: goto L_0x0008;
                case 148: goto L_0x0008;
                case 149: goto L_0x0008;
                case 150: goto L_0x0008;
                case 151: goto L_0x0033;
                case 152: goto L_0x0020;
                case 153: goto L_0x0020;
                case 154: goto L_0x0020;
                case 155: goto L_0x0020;
                case 156: goto L_0x0020;
                case 157: goto L_0x0020;
                case 158: goto L_0x0020;
                case 159: goto L_0x0020;
                default: goto L_0x0008;
            }
        L_0x0008:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid C1 command: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "Cea708Decoder"
            p040c.p200q.p201a.p219b.p261o0.C3163m.m7880f(r0, r5)
            goto L_0x0117
        L_0x0020:
            int r5 = r5 + -152
            r4.mo19670s(r5)
            int r0 = r4.f5395o
            if (r0 == r5) goto L_0x0117
            r4.f5395o = r5
            c.q.a.b.l0.k.c$a[] r0 = r4.f5390j
            r5 = r0[r5]
            r4.f5391k = r5
            goto L_0x0117
        L_0x0033:
            c.q.a.b.l0.k.c$a r5 = r4.f5391k
            boolean r5 = r5.mo19684i()
            if (r5 != 0) goto L_0x0044
            c.q.a.b.o0.s r5 = r4.f5388h
            r0 = 32
            r5.mo19993p(r0)
            goto L_0x0117
        L_0x0044:
            r4.mo19661A()
            goto L_0x0117
        L_0x0049:
            c.q.a.b.l0.k.c$a r5 = r4.f5391k
            boolean r5 = r5.mo19684i()
            if (r5 != 0) goto L_0x0058
            c.q.a.b.o0.s r5 = r4.f5388h
            r5.mo19993p(r0)
            goto L_0x0117
        L_0x0058:
            r4.mo19677z()
            goto L_0x0117
        L_0x005d:
            c.q.a.b.l0.k.c$a r5 = r4.f5391k
            boolean r5 = r5.mo19684i()
            if (r5 != 0) goto L_0x006e
            c.q.a.b.o0.s r5 = r4.f5388h
            r0 = 24
            r5.mo19993p(r0)
            goto L_0x0117
        L_0x006e:
            r4.mo19676y()
            goto L_0x0117
        L_0x0073:
            c.q.a.b.l0.k.c$a r5 = r4.f5391k
            boolean r5 = r5.mo19684i()
            if (r5 != 0) goto L_0x0082
            c.q.a.b.o0.s r5 = r4.f5388h
            r5.mo19993p(r0)
            goto L_0x0117
        L_0x0082:
            r4.mo19675x()
            goto L_0x0117
        L_0x0087:
            r4.mo19663C()
            goto L_0x0117
        L_0x008c:
            c.q.a.b.o0.s r5 = r4.f5388h
            r5.mo19993p(r1)
            goto L_0x0117
        L_0x0093:
            if (r2 > r1) goto L_0x0117
            c.q.a.b.o0.s r5 = r4.f5388h
            boolean r5 = r5.mo19984g()
            if (r5 == 0) goto L_0x00a6
            c.q.a.b.l0.k.c$a[] r5 = r4.f5390j
            int r0 = 8 - r2
            r5 = r5[r0]
            r5.mo19687l()
        L_0x00a6:
            int r2 = r2 + 1
            goto L_0x0093
        L_0x00a9:
            r5 = r2
        L_0x00aa:
            if (r5 > r1) goto L_0x0117
            c.q.a.b.o0.s r0 = r4.f5388h
            boolean r0 = r0.mo19984g()
            if (r0 == 0) goto L_0x00c2
            c.q.a.b.l0.k.c$a[] r0 = r4.f5390j
            int r3 = 8 - r5
            r0 = r0[r3]
            boolean r3 = r0.mo19686k()
            r3 = r3 ^ r2
            r0.mo19691p(r3)
        L_0x00c2:
            int r5 = r5 + 1
            goto L_0x00aa
        L_0x00c5:
            if (r2 > r1) goto L_0x0117
            c.q.a.b.o0.s r5 = r4.f5388h
            boolean r5 = r5.mo19984g()
            if (r5 == 0) goto L_0x00d9
            c.q.a.b.l0.k.c$a[] r5 = r4.f5390j
            int r0 = 8 - r2
            r5 = r5[r0]
            r0 = 0
            r5.mo19691p(r0)
        L_0x00d9:
            int r2 = r2 + 1
            goto L_0x00c5
        L_0x00dc:
            r5 = r2
        L_0x00dd:
            if (r5 > r1) goto L_0x0117
            c.q.a.b.o0.s r0 = r4.f5388h
            boolean r0 = r0.mo19984g()
            if (r0 == 0) goto L_0x00f0
            c.q.a.b.l0.k.c$a[] r0 = r4.f5390j
            int r3 = 8 - r5
            r0 = r0[r3]
            r0.mo19691p(r2)
        L_0x00f0:
            int r5 = r5 + 1
            goto L_0x00dd
        L_0x00f3:
            if (r2 > r1) goto L_0x0117
            c.q.a.b.o0.s r5 = r4.f5388h
            boolean r5 = r5.mo19984g()
            if (r5 == 0) goto L_0x0106
            c.q.a.b.l0.k.c$a[] r5 = r4.f5390j
            int r0 = 8 - r2
            r5 = r5[r0]
            r5.mo19682e()
        L_0x0106:
            int r2 = r2 + 1
            goto L_0x00f3
        L_0x0109:
            int r5 = r5 + -128
            int r0 = r4.f5395o
            if (r0 == r5) goto L_0x0117
            r4.f5395o = r5
            c.q.a.b.l0.k.c$a[] r0 = r4.f5390j
            r5 = r0[r5]
            r4.f5391k = r5
        L_0x0117:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p250l0.p251k.C3046c.mo19667p(int):void");
    }

    /* renamed from: q */
    public final void mo19668q(int i) {
        if (i > 7) {
            if (i <= 15) {
                this.f5388h.mo19993p(8);
            } else if (i <= 23) {
                this.f5388h.mo19993p(16);
            } else if (i <= 31) {
                this.f5388h.mo19993p(24);
            }
        }
    }

    /* renamed from: r */
    public final void mo19669r(int i) {
        if (i <= 135) {
            this.f5388h.mo19993p(32);
        } else if (i <= 143) {
            this.f5388h.mo19993p(40);
        } else if (i <= 159) {
            this.f5388h.mo19993p(2);
            this.f5388h.mo19993p(this.f5388h.mo19985h(6) * 8);
        }
    }

    /* renamed from: s */
    public final void mo19670s(int i) {
        C3047a aVar = this.f5390j[i];
        this.f5388h.mo19993p(2);
        boolean g = this.f5388h.mo19984g();
        boolean g2 = this.f5388h.mo19984g();
        boolean g3 = this.f5388h.mo19984g();
        int h = this.f5388h.mo19985h(3);
        boolean g4 = this.f5388h.mo19984g();
        int h2 = this.f5388h.mo19985h(7);
        int h3 = this.f5388h.mo19985h(8);
        int h4 = this.f5388h.mo19985h(4);
        int h5 = this.f5388h.mo19985h(4);
        this.f5388h.mo19993p(2);
        int h6 = this.f5388h.mo19985h(6);
        this.f5388h.mo19993p(2);
        aVar.mo19683f(g, g2, g3, h, g4, h2, h3, h5, h6, h4, this.f5388h.mo19985h(3), this.f5388h.mo19985h(3));
    }

    /* renamed from: t */
    public final void mo19671t(int i) {
        if (i == 127) {
            this.f5391k.mo19678a(9835);
        } else {
            this.f5391k.mo19678a((char) (i & 255));
        }
    }

    /* renamed from: u */
    public final void mo19672u(int i) {
        this.f5391k.mo19678a((char) (i & 255));
    }

    /* renamed from: v */
    public final void mo19673v(int i) {
        if (i == 32) {
            this.f5391k.mo19678a(' ');
        } else if (i == 33) {
            this.f5391k.mo19678a(Typography.nbsp);
        } else if (i == 37) {
            this.f5391k.mo19678a(Typography.ellipsis);
        } else if (i == 42) {
            this.f5391k.mo19678a(352);
        } else if (i == 44) {
            this.f5391k.mo19678a(338);
        } else if (i == 63) {
            this.f5391k.mo19678a(376);
        } else if (i == 57) {
            this.f5391k.mo19678a(Typography.f18809tm);
        } else if (i == 58) {
            this.f5391k.mo19678a(353);
        } else if (i == 60) {
            this.f5391k.mo19678a(339);
        } else if (i != 61) {
            switch (i) {
                case 48:
                    this.f5391k.mo19678a(9608);
                    return;
                case 49:
                    this.f5391k.mo19678a(Typography.leftSingleQuote);
                    return;
                case 50:
                    this.f5391k.mo19678a(Typography.rightSingleQuote);
                    return;
                case 51:
                    this.f5391k.mo19678a(Typography.leftDoubleQuote);
                    return;
                case 52:
                    this.f5391k.mo19678a(Typography.rightDoubleQuote);
                    return;
                case 53:
                    this.f5391k.mo19678a(Typography.bullet);
                    return;
                default:
                    switch (i) {
                        case 118:
                            this.f5391k.mo19678a(8539);
                            return;
                        case 119:
                            this.f5391k.mo19678a(8540);
                            return;
                        case 120:
                            this.f5391k.mo19678a(8541);
                            return;
                        case 121:
                            this.f5391k.mo19678a(8542);
                            return;
                        case 122:
                            this.f5391k.mo19678a(9474);
                            return;
                        case 123:
                            this.f5391k.mo19678a(9488);
                            return;
                        case 124:
                            this.f5391k.mo19678a(9492);
                            return;
                        case 125:
                            this.f5391k.mo19678a(9472);
                            return;
                        case 126:
                            this.f5391k.mo19678a(9496);
                            return;
                        case 127:
                            this.f5391k.mo19678a(9484);
                            return;
                        default:
                            C3163m.m7880f("Cea708Decoder", "Invalid G2 character: " + i);
                            return;
                    }
            }
        } else {
            this.f5391k.mo19678a(8480);
        }
    }

    /* renamed from: w */
    public final void mo19674w(int i) {
        if (i == 160) {
            this.f5391k.mo19678a(13252);
            return;
        }
        C3163m.m7880f("Cea708Decoder", "Invalid G3 character: " + i);
        this.f5391k.mo19678a('_');
    }

    /* renamed from: x */
    public final void mo19675x() {
        this.f5391k.mo19688m(this.f5388h.mo19985h(4), this.f5388h.mo19985h(2), this.f5388h.mo19985h(2), this.f5388h.mo19984g(), this.f5388h.mo19984g(), this.f5388h.mo19985h(3), this.f5388h.mo19985h(3));
    }

    /* renamed from: y */
    public final void mo19676y() {
        int h = C3047a.m7261h(this.f5388h.mo19985h(2), this.f5388h.mo19985h(2), this.f5388h.mo19985h(2), this.f5388h.mo19985h(2));
        int h2 = C3047a.m7261h(this.f5388h.mo19985h(2), this.f5388h.mo19985h(2), this.f5388h.mo19985h(2), this.f5388h.mo19985h(2));
        this.f5388h.mo19993p(2);
        this.f5391k.mo19689n(h, h2, C3047a.m7260g(this.f5388h.mo19985h(2), this.f5388h.mo19985h(2), this.f5388h.mo19985h(2)));
    }

    /* renamed from: z */
    public final void mo19677z() {
        this.f5388h.mo19993p(4);
        int h = this.f5388h.mo19985h(4);
        this.f5388h.mo19993p(2);
        this.f5391k.mo19690o(h, this.f5388h.mo19985h(6));
    }
}
