package p040c.p200q.p406e.p410l.p412m;

/* renamed from: c.q.e.l.m.a */
/* compiled from: GenericGF */
public final class C7045a {

    /* renamed from: h */
    public static final C7045a f13495h = new C7045a(4201, 4096, 1);

    /* renamed from: i */
    public static final C7045a f13496i = new C7045a(1033, 1024, 1);

    /* renamed from: j */
    public static final C7045a f13497j = new C7045a(67, 64, 1);

    /* renamed from: k */
    public static final C7045a f13498k = new C7045a(19, 16, 1);

    /* renamed from: l */
    public static final C7045a f13499l = new C7045a(285, 256, 0);

    /* renamed from: m */
    public static final C7045a f13500m;

    /* renamed from: n */
    public static final C7045a f13501n;

    /* renamed from: o */
    public static final C7045a f13502o = f13497j;

    /* renamed from: a */
    public final int[] f13503a;

    /* renamed from: b */
    public final int[] f13504b;

    /* renamed from: c */
    public final C7046b f13505c;

    /* renamed from: d */
    public final C7046b f13506d;

    /* renamed from: e */
    public final int f13507e;

    /* renamed from: f */
    public final int f13508f;

    /* renamed from: g */
    public final int f13509g;

    static {
        C7045a aVar = new C7045a(301, 256, 1);
        f13500m = aVar;
        f13501n = aVar;
    }

    public C7045a(int i, int i2, int i3) {
        this.f13508f = i;
        this.f13507e = i2;
        this.f13509g = i3;
        this.f13503a = new int[i2];
        this.f13504b = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.f13503a[i5] = i4;
            i4 <<= 1;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.f13504b[this.f13503a[i6]] = i6;
        }
        this.f13505c = new C7046b(this, new int[]{0});
        this.f13506d = new C7046b(this, new int[]{1});
    }

    /* renamed from: a */
    public static int m20891a(int i, int i2) {
        return i ^ i2;
    }

    /* renamed from: b */
    public C7046b mo32578b(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f13505c;
        } else {
            int[] iArr = new int[(i + 1)];
            iArr[0] = i2;
            return new C7046b(this, iArr);
        }
    }

    /* renamed from: c */
    public int mo32579c(int i) {
        return this.f13503a[i];
    }

    /* renamed from: d */
    public int mo32580d() {
        return this.f13509g;
    }

    /* renamed from: e */
    public C7046b mo32581e() {
        return this.f13506d;
    }

    /* renamed from: f */
    public int mo32582f() {
        return this.f13507e;
    }

    /* renamed from: g */
    public C7046b mo32583g() {
        return this.f13505c;
    }

    /* renamed from: h */
    public int mo32584h(int i) {
        if (i != 0) {
            return this.f13503a[(this.f13507e - this.f13504b[i]) - 1];
        }
        throw new ArithmeticException();
    }

    /* renamed from: i */
    public int mo32585i(int i) {
        if (i != 0) {
            return this.f13504b[i];
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: j */
    public int mo32586j(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f13503a;
        int[] iArr2 = this.f13504b;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.f13507e - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f13508f) + ',' + this.f13507e + ')';
    }
}
