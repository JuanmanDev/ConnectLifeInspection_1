package p040c.p200q.p201a.p219b.p250l0.p258r;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import p040c.p200q.p201a.p219b.p250l0.C3031a;
import p040c.p200q.p201a.p219b.p261o0.C3163m;

/* renamed from: c.q.a.b.l0.r.e */
/* compiled from: WebvttCue */
public final class C3089e extends C3031a {

    /* renamed from: o */
    public final long f5613o;

    /* renamed from: p */
    public final long f5614p;

    /* renamed from: c.q.a.b.l0.r.e$a */
    /* compiled from: WebvttCue */
    public static /* synthetic */ class C3090a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5615a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                android.text.Layout$Alignment[] r0 = android.text.Layout.Alignment.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5615a = r0
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5615a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_CENTER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f5615a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p250l0.p258r.C3089e.C3090a.<clinit>():void");
        }
    }

    /* renamed from: c.q.a.b.l0.r.e$b */
    /* compiled from: WebvttCue */
    public static class C3091b {

        /* renamed from: a */
        public long f5616a;

        /* renamed from: b */
        public long f5617b;

        /* renamed from: c */
        public SpannableStringBuilder f5618c;

        /* renamed from: d */
        public Layout.Alignment f5619d;

        /* renamed from: e */
        public float f5620e;

        /* renamed from: f */
        public int f5621f;

        /* renamed from: g */
        public int f5622g;

        /* renamed from: h */
        public float f5623h;

        /* renamed from: i */
        public int f5624i;

        /* renamed from: j */
        public float f5625j;

        public C3091b() {
            mo19798c();
        }

        /* renamed from: a */
        public C3089e mo19796a() {
            if (this.f5623h != Float.MIN_VALUE && this.f5624i == Integer.MIN_VALUE) {
                mo19797b();
            }
            return new C3089e(this.f5616a, this.f5617b, this.f5618c, this.f5619d, this.f5620e, this.f5621f, this.f5622g, this.f5623h, this.f5624i, this.f5625j);
        }

        /* renamed from: b */
        public final C3091b mo19797b() {
            Layout.Alignment alignment = this.f5619d;
            if (alignment == null) {
                this.f5624i = Integer.MIN_VALUE;
            } else {
                int i = C3090a.f5615a[alignment.ordinal()];
                if (i == 1) {
                    this.f5624i = 0;
                } else if (i == 2) {
                    this.f5624i = 1;
                } else if (i != 3) {
                    C3163m.m7880f("WebvttCueBuilder", "Unrecognized alignment: " + this.f5619d);
                    this.f5624i = 0;
                } else {
                    this.f5624i = 2;
                }
            }
            return this;
        }

        /* renamed from: c */
        public void mo19798c() {
            this.f5616a = 0;
            this.f5617b = 0;
            this.f5618c = null;
            this.f5619d = null;
            this.f5620e = Float.MIN_VALUE;
            this.f5621f = Integer.MIN_VALUE;
            this.f5622g = Integer.MIN_VALUE;
            this.f5623h = Float.MIN_VALUE;
            this.f5624i = Integer.MIN_VALUE;
            this.f5625j = Float.MIN_VALUE;
        }

        /* renamed from: d */
        public C3091b mo19799d(long j) {
            this.f5617b = j;
            return this;
        }

        /* renamed from: e */
        public C3091b mo19800e(float f) {
            this.f5620e = f;
            return this;
        }

        /* renamed from: f */
        public C3091b mo19801f(int i) {
            this.f5622g = i;
            return this;
        }

        /* renamed from: g */
        public C3091b mo19802g(int i) {
            this.f5621f = i;
            return this;
        }

        /* renamed from: h */
        public C3091b mo19803h(float f) {
            this.f5623h = f;
            return this;
        }

        /* renamed from: i */
        public C3091b mo19804i(int i) {
            this.f5624i = i;
            return this;
        }

        /* renamed from: j */
        public C3091b mo19805j(long j) {
            this.f5616a = j;
            return this;
        }

        /* renamed from: k */
        public C3091b mo19806k(SpannableStringBuilder spannableStringBuilder) {
            this.f5618c = spannableStringBuilder;
            return this;
        }

        /* renamed from: l */
        public C3091b mo19807l(Layout.Alignment alignment) {
            this.f5619d = alignment;
            return this;
        }

        /* renamed from: m */
        public C3091b mo19808m(float f) {
            this.f5625j = f;
            return this;
        }
    }

    public C3089e(CharSequence charSequence) {
        this(0, 0, charSequence);
    }

    /* renamed from: c */
    public boolean mo19795c() {
        return this.f5336m == Float.MIN_VALUE && this.f5337n == Float.MIN_VALUE;
    }

    public C3089e(long j, long j2, CharSequence charSequence) {
        this(j, j2, charSequence, (Layout.Alignment) null, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3089e(long j, long j2, CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3) {
        super(charSequence, alignment, f, i, i2, f2, i3, f3);
        this.f5613o = j;
        this.f5614p = j2;
    }
}
