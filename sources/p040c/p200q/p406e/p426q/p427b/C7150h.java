package p040c.p200q.p406e.p426q.p427b;

import com.google.zxing.FormatException;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import p040c.p200q.p406e.p410l.C7033b;

/* renamed from: c.q.e.q.b.h */
/* compiled from: Version */
public final class C7150h {

    /* renamed from: e */
    public static final int[] f13754e = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};

    /* renamed from: f */
    public static final C7150h[] f13755f = m21366b();

    /* renamed from: a */
    public final int f13756a;

    /* renamed from: b */
    public final int[] f13757b;

    /* renamed from: c */
    public final C7152b[] f13758c;

    /* renamed from: d */
    public final int f13759d;

    /* renamed from: c.q.e.q.b.h$a */
    /* compiled from: Version */
    public static final class C7151a {

        /* renamed from: a */
        public final int f13760a;

        /* renamed from: b */
        public final int f13761b;

        public C7151a(int i, int i2) {
            this.f13760a = i;
            this.f13761b = i2;
        }

        /* renamed from: a */
        public int mo32872a() {
            return this.f13760a;
        }

        /* renamed from: b */
        public int mo32873b() {
            return this.f13761b;
        }
    }

    /* renamed from: c.q.e.q.b.h$b */
    /* compiled from: Version */
    public static final class C7152b {

        /* renamed from: a */
        public final int f13762a;

        /* renamed from: b */
        public final C7151a[] f13763b;

        public C7152b(int i, C7151a... aVarArr) {
            this.f13762a = i;
            this.f13763b = aVarArr;
        }

        /* renamed from: a */
        public C7151a[] mo32874a() {
            return this.f13763b;
        }

        /* renamed from: b */
        public int mo32875b() {
            return this.f13762a;
        }
    }

    public C7150h(int i, int[] iArr, C7152b... bVarArr) {
        this.f13756a = i;
        this.f13757b = iArr;
        this.f13758c = bVarArr;
        int b = bVarArr[0].mo32875b();
        int i2 = 0;
        for (C7151a aVar : bVarArr[0].mo32874a()) {
            i2 += aVar.mo32872a() * (aVar.mo32873b() + b);
        }
        this.f13759d = i2;
    }

    /* renamed from: b */
    public static C7150h[] m21366b() {
        return new C7150h[]{new C7150h(1, new int[0], new C7152b(7, new C7151a(1, 19)), new C7152b(10, new C7151a(1, 16)), new C7152b(13, new C7151a(1, 13)), new C7152b(17, new C7151a(1, 9))), new C7150h(2, new int[]{6, 18}, new C7152b(10, new C7151a(1, 34)), new C7152b(16, new C7151a(1, 28)), new C7152b(22, new C7151a(1, 22)), new C7152b(28, new C7151a(1, 16))), new C7150h(3, new int[]{6, 22}, new C7152b(15, new C7151a(1, 55)), new C7152b(26, new C7151a(1, 44)), new C7152b(18, new C7151a(2, 17)), new C7152b(22, new C7151a(2, 13))), new C7150h(4, new int[]{6, 26}, new C7152b(20, new C7151a(1, 80)), new C7152b(18, new C7151a(2, 32)), new C7152b(26, new C7151a(2, 24)), new C7152b(16, new C7151a(4, 9))), new C7150h(5, new int[]{6, 30}, new C7152b(26, new C7151a(1, 108)), new C7152b(24, new C7151a(2, 43)), new C7152b(18, new C7151a(2, 15), new C7151a(2, 16)), new C7152b(22, new C7151a(2, 11), new C7151a(2, 12))), new C7150h(6, new int[]{6, 34}, new C7152b(18, new C7151a(2, 68)), new C7152b(16, new C7151a(4, 27)), new C7152b(24, new C7151a(4, 19)), new C7152b(28, new C7151a(4, 15))), new C7150h(7, new int[]{6, 22, 38}, new C7152b(20, new C7151a(2, 78)), new C7152b(18, new C7151a(4, 31)), new C7152b(18, new C7151a(2, 14), new C7151a(4, 15)), new C7152b(26, new C7151a(4, 13), new C7151a(1, 14))), new C7150h(8, new int[]{6, 24, 42}, new C7152b(24, new C7151a(2, 97)), new C7152b(22, new C7151a(2, 38), new C7151a(2, 39)), new C7152b(22, new C7151a(4, 18), new C7151a(2, 19)), new C7152b(26, new C7151a(4, 14), new C7151a(2, 15))), new C7150h(9, new int[]{6, 26, 46}, new C7152b(30, new C7151a(2, 116)), new C7152b(22, new C7151a(3, 36), new C7151a(2, 37)), new C7152b(20, new C7151a(4, 16), new C7151a(4, 17)), new C7152b(24, new C7151a(4, 12), new C7151a(4, 13))), new C7150h(10, new int[]{6, 28, 50}, new C7152b(18, new C7151a(2, 68), new C7151a(2, 69)), new C7152b(26, new C7151a(4, 43), new C7151a(1, 44)), new C7152b(24, new C7151a(6, 19), new C7151a(2, 20)), new C7152b(28, new C7151a(6, 15), new C7151a(2, 16))), new C7150h(11, new int[]{6, 30, 54}, new C7152b(20, new C7151a(4, 81)), new C7152b(30, new C7151a(1, 50), new C7151a(4, 51)), new C7152b(28, new C7151a(4, 22), new C7151a(4, 23)), new C7152b(24, new C7151a(3, 12), new C7151a(8, 13))), new C7150h(12, new int[]{6, 32, 58}, new C7152b(24, new C7151a(2, 92), new C7151a(2, 93)), new C7152b(22, new C7151a(6, 36), new C7151a(2, 37)), new C7152b(26, new C7151a(4, 20), new C7151a(6, 21)), new C7152b(28, new C7151a(7, 14), new C7151a(4, 15))), new C7150h(13, new int[]{6, 34, 62}, new C7152b(26, new C7151a(4, 107)), new C7152b(22, new C7151a(8, 37), new C7151a(1, 38)), new C7152b(24, new C7151a(8, 20), new C7151a(4, 21)), new C7152b(22, new C7151a(12, 11), new C7151a(4, 12))), new C7150h(14, new int[]{6, 26, 46, 66}, new C7152b(30, new C7151a(3, 115), new C7151a(1, 116)), new C7152b(24, new C7151a(4, 40), new C7151a(5, 41)), new C7152b(20, new C7151a(11, 16), new C7151a(5, 17)), new C7152b(24, new C7151a(11, 12), new C7151a(5, 13))), new C7150h(15, new int[]{6, 26, 48, 70}, new C7152b(22, new C7151a(5, 87), new C7151a(1, 88)), new C7152b(24, new C7151a(5, 41), new C7151a(5, 42)), new C7152b(30, new C7151a(5, 24), new C7151a(7, 25)), new C7152b(24, new C7151a(11, 12), new C7151a(7, 13))), new C7150h(16, new int[]{6, 26, 50, 74}, new C7152b(24, new C7151a(5, 98), new C7151a(1, 99)), new C7152b(28, new C7151a(7, 45), new C7151a(3, 46)), new C7152b(24, new C7151a(15, 19), new C7151a(2, 20)), new C7152b(30, new C7151a(3, 15), new C7151a(13, 16))), new C7150h(17, new int[]{6, 30, 54, 78}, new C7152b(28, new C7151a(1, 107), new C7151a(5, 108)), new C7152b(28, new C7151a(10, 46), new C7151a(1, 47)), new C7152b(28, new C7151a(1, 22), new C7151a(15, 23)), new C7152b(28, new C7151a(2, 14), new C7151a(17, 15))), new C7150h(18, new int[]{6, 30, 56, 82}, new C7152b(30, new C7151a(5, 120), new C7151a(1, 121)), new C7152b(26, new C7151a(9, 43), new C7151a(4, 44)), new C7152b(28, new C7151a(17, 22), new C7151a(1, 23)), new C7152b(28, new C7151a(2, 14), new C7151a(19, 15))), new C7150h(19, new int[]{6, 30, 58, 86}, new C7152b(28, new C7151a(3, 113), new C7151a(4, 114)), new C7152b(26, new C7151a(3, 44), new C7151a(11, 45)), new C7152b(26, new C7151a(17, 21), new C7151a(4, 22)), new C7152b(26, new C7151a(9, 13), new C7151a(16, 14))), new C7150h(20, new int[]{6, 34, 62, 90}, new C7152b(28, new C7151a(3, 107), new C7151a(5, 108)), new C7152b(26, new C7151a(3, 41), new C7151a(13, 42)), new C7152b(30, new C7151a(15, 24), new C7151a(5, 25)), new C7152b(28, new C7151a(15, 15), new C7151a(10, 16))), new C7150h(21, new int[]{6, 28, 50, 72, 94}, new C7152b(28, new C7151a(4, 116), new C7151a(4, 117)), new C7152b(26, new C7151a(17, 42)), new C7152b(28, new C7151a(17, 22), new C7151a(6, 23)), new C7152b(30, new C7151a(19, 16), new C7151a(6, 17))), new C7150h(22, new int[]{6, 26, 50, 74, 98}, new C7152b(28, new C7151a(2, 111), new C7151a(7, 112)), new C7152b(28, new C7151a(17, 46)), new C7152b(30, new C7151a(7, 24), new C7151a(16, 25)), new C7152b(24, new C7151a(34, 13))), new C7150h(23, new int[]{6, 30, 54, 78, 102}, new C7152b(30, new C7151a(4, 121), new C7151a(5, 122)), new C7152b(28, new C7151a(4, 47), new C7151a(14, 48)), new C7152b(30, new C7151a(11, 24), new C7151a(14, 25)), new C7152b(30, new C7151a(16, 15), new C7151a(14, 16))), new C7150h(24, new int[]{6, 28, 54, 80, 106}, new C7152b(30, new C7151a(6, 117), new C7151a(4, 118)), new C7152b(28, new C7151a(6, 45), new C7151a(14, 46)), new C7152b(30, new C7151a(11, 24), new C7151a(16, 25)), new C7152b(30, new C7151a(30, 16), new C7151a(2, 17))), new C7150h(25, new int[]{6, 32, 58, 84, 110}, new C7152b(26, new C7151a(8, 106), new C7151a(4, 107)), new C7152b(28, new C7151a(8, 47), new C7151a(13, 48)), new C7152b(30, new C7151a(7, 24), new C7151a(22, 25)), new C7152b(30, new C7151a(22, 15), new C7151a(13, 16))), new C7150h(26, new int[]{6, 30, 58, 86, 114}, new C7152b(28, new C7151a(10, 114), new C7151a(2, 115)), new C7152b(28, new C7151a(19, 46), new C7151a(4, 47)), new C7152b(28, new C7151a(28, 22), new C7151a(6, 23)), new C7152b(30, new C7151a(33, 16), new C7151a(4, 17))), new C7150h(27, new int[]{6, 34, 62, 90, 118}, new C7152b(30, new C7151a(8, 122), new C7151a(4, 123)), new C7152b(28, new C7151a(22, 45), new C7151a(3, 46)), new C7152b(30, new C7151a(8, 23), new C7151a(26, 24)), new C7152b(30, new C7151a(12, 15), new C7151a(28, 16))), new C7150h(28, new int[]{6, 26, 50, 74, 98, 122}, new C7152b(30, new C7151a(3, 117), new C7151a(10, 118)), new C7152b(28, new C7151a(3, 45), new C7151a(23, 46)), new C7152b(30, new C7151a(4, 24), new C7151a(31, 25)), new C7152b(30, new C7151a(11, 15), new C7151a(31, 16))), new C7150h(29, new int[]{6, 30, 54, 78, 102, 126}, new C7152b(30, new C7151a(7, 116), new C7151a(7, 117)), new C7152b(28, new C7151a(21, 45), new C7151a(7, 46)), new C7152b(30, new C7151a(1, 23), new C7151a(37, 24)), new C7152b(30, new C7151a(19, 15), new C7151a(26, 16))), new C7150h(30, new int[]{6, 26, 52, 78, 104, 130}, new C7152b(30, new C7151a(5, 115), new C7151a(10, 116)), new C7152b(28, new C7151a(19, 47), new C7151a(10, 48)), new C7152b(30, new C7151a(15, 24), new C7151a(25, 25)), new C7152b(30, new C7151a(23, 15), new C7151a(25, 16))), new C7150h(31, new int[]{6, 30, 56, 82, 108, 134}, new C7152b(30, new C7151a(13, 115), new C7151a(3, 116)), new C7152b(28, new C7151a(2, 46), new C7151a(29, 47)), new C7152b(30, new C7151a(42, 24), new C7151a(1, 25)), new C7152b(30, new C7151a(23, 15), new C7151a(28, 16))), new C7150h(32, new int[]{6, 34, 60, 86, 112, 138}, new C7152b(30, new C7151a(17, 115)), new C7152b(28, new C7151a(10, 46), new C7151a(23, 47)), new C7152b(30, new C7151a(10, 24), new C7151a(35, 25)), new C7152b(30, new C7151a(19, 15), new C7151a(35, 16))), new C7150h(33, new int[]{6, 30, 58, 86, 114, 142}, new C7152b(30, new C7151a(17, 115), new C7151a(1, 116)), new C7152b(28, new C7151a(14, 46), new C7151a(21, 47)), new C7152b(30, new C7151a(29, 24), new C7151a(19, 25)), new C7152b(30, new C7151a(11, 15), new C7151a(46, 16))), new C7150h(34, new int[]{6, 34, 62, 90, 118, 146}, new C7152b(30, new C7151a(13, 115), new C7151a(6, 116)), new C7152b(28, new C7151a(14, 46), new C7151a(23, 47)), new C7152b(30, new C7151a(44, 24), new C7151a(7, 25)), new C7152b(30, new C7151a(59, 16), new C7151a(1, 17))), new C7150h(35, new int[]{6, 30, 54, 78, 102, 126, 150}, new C7152b(30, new C7151a(12, 121), new C7151a(7, 122)), new C7152b(28, new C7151a(12, 47), new C7151a(26, 48)), new C7152b(30, new C7151a(39, 24), new C7151a(14, 25)), new C7152b(30, new C7151a(22, 15), new C7151a(41, 16))), new C7150h(36, new int[]{6, 24, 50, 76, 102, 128, 154}, new C7152b(30, new C7151a(6, 121), new C7151a(14, 122)), new C7152b(28, new C7151a(6, 47), new C7151a(34, 48)), new C7152b(30, new C7151a(46, 24), new C7151a(10, 25)), new C7152b(30, new C7151a(2, 15), new C7151a(64, 16))), new C7150h(37, new int[]{6, 28, 54, 80, 106, 132, 158}, new C7152b(30, new C7151a(17, 122), new C7151a(4, 123)), new C7152b(28, new C7151a(29, 46), new C7151a(14, 47)), new C7152b(30, new C7151a(49, 24), new C7151a(10, 25)), new C7152b(30, new C7151a(24, 15), new C7151a(46, 16))), new C7150h(38, new int[]{6, 32, 58, 84, 110, 136, 162}, new C7152b(30, new C7151a(4, 122), new C7151a(18, 123)), new C7152b(28, new C7151a(13, 46), new C7151a(32, 47)), new C7152b(30, new C7151a(48, 24), new C7151a(14, 25)), new C7152b(30, new C7151a(42, 15), new C7151a(32, 16))), new C7150h(39, new int[]{6, 26, 54, 82, 110, 138, 166}, new C7152b(30, new C7151a(20, 117), new C7151a(4, 118)), new C7152b(28, new C7151a(40, 47), new C7151a(7, 48)), new C7152b(30, new C7151a(43, 24), new C7151a(22, 25)), new C7152b(30, new C7151a(10, 15), new C7151a(67, 16))), new C7150h(40, new int[]{6, 30, 58, 86, 114, 142, 170}, new C7152b(30, new C7151a(19, 118), new C7151a(6, 119)), new C7152b(28, new C7151a(18, 47), new C7151a(31, 48)), new C7152b(30, new C7151a(34, 24), new C7151a(34, 25)), new C7152b(30, new C7151a(20, 15), new C7151a(61, 16)))};
    }

    /* renamed from: c */
    public static C7150h m21367c(int i) {
        int i2 = 0;
        int i3 = Integer.MAX_VALUE;
        int i4 = 0;
        while (true) {
            int[] iArr = f13754e;
            if (i2 < iArr.length) {
                int i5 = iArr[i2];
                if (i5 == i) {
                    return m21369i(i2 + 7);
                }
                int e = C7148f.m21362e(i, i5);
                if (e < i3) {
                    i4 = i2 + 7;
                    i3 = e;
                }
                i2++;
            } else if (i3 <= 3) {
                return m21369i(i4);
            } else {
                return null;
            }
        }
    }

    /* renamed from: g */
    public static C7150h m21368g(int i) {
        if (i % 4 == 1) {
            try {
                return m21369i((i - 17) / 4);
            } catch (IllegalArgumentException unused) {
                throw FormatException.getFormatInstance();
            }
        } else {
            throw FormatException.getFormatInstance();
        }
    }

    /* renamed from: i */
    public static C7150h m21369i(int i) {
        if (i > 0 && i <= 40) {
            return f13755f[i - 1];
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public C7033b mo32865a() {
        int e = mo32867e();
        C7033b bVar = new C7033b(e);
        bVar.mo32545n(0, 0, 9, 9);
        int i = e - 8;
        bVar.mo32545n(i, 0, 8, 9);
        bVar.mo32545n(0, i, 9, 8);
        int length = this.f13757b.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = this.f13757b[i2] - 2;
            for (int i4 = 0; i4 < length; i4++) {
                if (!((i2 == 0 && (i4 == 0 || i4 == length - 1)) || (i2 == length - 1 && i4 == 0))) {
                    bVar.mo32545n(this.f13757b[i4] - 2, i3, 5, 5);
                }
            }
        }
        int i5 = e - 17;
        bVar.mo32545n(6, 9, 1, i5);
        bVar.mo32545n(9, 6, i5, 1);
        if (this.f13756a > 6) {
            int i6 = e - 11;
            bVar.mo32545n(i6, 0, 3, 6);
            bVar.mo32545n(0, i6, 6, 3);
        }
        return bVar;
    }

    /* renamed from: d */
    public int[] mo32866d() {
        return this.f13757b;
    }

    /* renamed from: e */
    public int mo32867e() {
        return (this.f13756a * 4) + 17;
    }

    /* renamed from: f */
    public C7152b mo32868f(ErrorCorrectionLevel errorCorrectionLevel) {
        return this.f13758c[errorCorrectionLevel.ordinal()];
    }

    /* renamed from: h */
    public int mo32869h() {
        return this.f13759d;
    }

    /* renamed from: j */
    public int mo32870j() {
        return this.f13756a;
    }

    public String toString() {
        return String.valueOf(this.f13756a);
    }
}
