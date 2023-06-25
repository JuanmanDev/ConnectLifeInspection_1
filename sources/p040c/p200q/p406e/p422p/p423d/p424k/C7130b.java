package p040c.p200q.p406e.p422p.p423d.p424k;

/* renamed from: c.q.e.p.d.k.b */
/* compiled from: ModulusGF */
public final class C7130b {

    /* renamed from: f */
    public static final C7130b f13717f = new C7130b(929, 3);

    /* renamed from: a */
    public final int[] f13718a;

    /* renamed from: b */
    public final int[] f13719b;

    /* renamed from: c */
    public final C7131c f13720c;

    /* renamed from: d */
    public final C7131c f13721d;

    /* renamed from: e */
    public final int f13722e;

    public C7130b(int i, int i2) {
        this.f13722e = i;
        this.f13718a = new int[i];
        this.f13719b = new int[i];
        int i3 = 1;
        for (int i4 = 0; i4 < i; i4++) {
            this.f13718a[i4] = i3;
            i3 = (i3 * i2) % i;
        }
        for (int i5 = 0; i5 < i - 1; i5++) {
            this.f13719b[this.f13718a[i5]] = i5;
        }
        this.f13720c = new C7131c(this, new int[]{0});
        this.f13721d = new C7131c(this, new int[]{1});
    }

    /* renamed from: a */
    public int mo32823a(int i, int i2) {
        return (i + i2) % this.f13722e;
    }

    /* renamed from: b */
    public C7131c mo32824b(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f13720c;
        } else {
            int[] iArr = new int[(i + 1)];
            iArr[0] = i2;
            return new C7131c(this, iArr);
        }
    }

    /* renamed from: c */
    public int mo32825c(int i) {
        return this.f13718a[i];
    }

    /* renamed from: d */
    public C7131c mo32826d() {
        return this.f13721d;
    }

    /* renamed from: e */
    public int mo32827e() {
        return this.f13722e;
    }

    /* renamed from: f */
    public C7131c mo32828f() {
        return this.f13720c;
    }

    /* renamed from: g */
    public int mo32829g(int i) {
        if (i != 0) {
            return this.f13718a[(this.f13722e - this.f13719b[i]) - 1];
        }
        throw new ArithmeticException();
    }

    /* renamed from: h */
    public int mo32830h(int i) {
        if (i != 0) {
            return this.f13719b[i];
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: i */
    public int mo32831i(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f13718a;
        int[] iArr2 = this.f13719b;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.f13722e - 1)];
    }

    /* renamed from: j */
    public int mo32832j(int i, int i2) {
        int i3 = this.f13722e;
        return ((i + i3) - i2) % i3;
    }
}
