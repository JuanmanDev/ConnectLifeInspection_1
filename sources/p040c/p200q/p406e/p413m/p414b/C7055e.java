package p040c.p200q.p406e.p413m.p414b;

import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.zxing.FormatException;

/* renamed from: c.q.e.m.b.e */
/* compiled from: Version */
public final class C7055e {

    /* renamed from: h */
    public static final C7055e[] f13535h = m20941a();

    /* renamed from: a */
    public final int f13536a;

    /* renamed from: b */
    public final int f13537b;

    /* renamed from: c */
    public final int f13538c;

    /* renamed from: d */
    public final int f13539d;

    /* renamed from: e */
    public final int f13540e;

    /* renamed from: f */
    public final C7058c f13541f;

    /* renamed from: g */
    public final int f13542g;

    /* renamed from: c.q.e.m.b.e$b */
    /* compiled from: Version */
    public static final class C7057b {

        /* renamed from: a */
        public final int f13543a;

        /* renamed from: b */
        public final int f13544b;

        /* renamed from: a */
        public int mo32622a() {
            return this.f13543a;
        }

        /* renamed from: b */
        public int mo32623b() {
            return this.f13544b;
        }

        public C7057b(int i, int i2) {
            this.f13543a = i;
            this.f13544b = i2;
        }
    }

    public C7055e(int i, int i2, int i3, int i4, int i5, C7058c cVar) {
        this.f13536a = i;
        this.f13537b = i2;
        this.f13538c = i3;
        this.f13539d = i4;
        this.f13540e = i5;
        this.f13541f = cVar;
        int b = cVar.mo32625b();
        int i6 = 0;
        for (C7057b bVar : cVar.mo32624a()) {
            i6 += bVar.mo32622a() * (bVar.mo32623b() + b);
        }
        this.f13542g = i6;
    }

    /* renamed from: a */
    public static C7055e[] m20941a() {
        return new C7055e[]{new C7055e(1, 10, 10, 8, 8, new C7058c(5, new C7057b(1, 3))), new C7055e(2, 12, 12, 10, 10, new C7058c(7, new C7057b(1, 5))), new C7055e(3, 14, 14, 12, 12, new C7058c(10, new C7057b(1, 8))), new C7055e(4, 16, 16, 14, 14, new C7058c(12, new C7057b(1, 12))), new C7055e(5, 18, 18, 16, 16, new C7058c(14, new C7057b(1, 18))), new C7055e(6, 20, 20, 18, 18, new C7058c(18, new C7057b(1, 22))), new C7055e(7, 22, 22, 20, 20, new C7058c(20, new C7057b(1, 30))), new C7055e(8, 24, 24, 22, 22, new C7058c(24, new C7057b(1, 36))), new C7055e(9, 26, 26, 24, 24, new C7058c(28, new C7057b(1, 44))), new C7055e(10, 32, 32, 14, 14, new C7058c(36, new C7057b(1, 62))), new C7055e(11, 36, 36, 16, 16, new C7058c(42, new C7057b(1, 86))), new C7055e(12, 40, 40, 18, 18, new C7058c(48, new C7057b(1, 114))), new C7055e(13, 44, 44, 20, 20, new C7058c(56, new C7057b(1, 144))), new C7055e(14, 48, 48, 22, 22, new C7058c(68, new C7057b(1, 174))), new C7055e(15, 52, 52, 24, 24, new C7058c(42, new C7057b(2, 102))), new C7055e(16, 64, 64, 14, 14, new C7058c(56, new C7057b(2, 140))), new C7055e(17, 72, 72, 16, 16, new C7058c(36, new C7057b(4, 92))), new C7055e(18, 80, 80, 18, 18, new C7058c(48, new C7057b(4, 114))), new C7055e(19, 88, 88, 20, 20, new C7058c(56, new C7057b(4, 144))), new C7055e(20, 96, 96, 22, 22, new C7058c(68, new C7057b(4, 174))), new C7055e(21, 104, 104, 24, 24, new C7058c(56, new C7057b(6, 136))), new C7055e(22, 120, 120, 18, 18, new C7058c(68, new C7057b(6, HideBottomViewOnScrollBehavior.EXIT_ANIMATION_DURATION))), new C7055e(23, 132, 132, 20, 20, new C7058c(62, new C7057b(8, 163))), new C7055e(24, 144, 144, 22, 22, new C7058c(62, new C7057b(8, 156), new C7057b(2, 155))), new C7055e(25, 8, 18, 6, 16, new C7058c(7, new C7057b(1, 5))), new C7055e(26, 8, 32, 6, 14, new C7058c(11, new C7057b(1, 10))), new C7055e(27, 12, 26, 10, 24, new C7058c(14, new C7057b(1, 16))), new C7055e(28, 12, 36, 10, 16, new C7058c(18, new C7057b(1, 22))), new C7055e(29, 16, 36, 14, 16, new C7058c(24, new C7057b(1, 32))), new C7055e(30, 16, 48, 14, 22, new C7058c(28, new C7057b(1, 49)))};
    }

    /* renamed from: h */
    public static C7055e m20942h(int i, int i2) {
        if ((i & 1) == 0 && (i2 & 1) == 0) {
            for (C7055e eVar : f13535h) {
                if (eVar.f13537b == i && eVar.f13538c == i2) {
                    return eVar;
                }
            }
            throw FormatException.getFormatInstance();
        }
        throw FormatException.getFormatInstance();
    }

    /* renamed from: b */
    public int mo32614b() {
        return this.f13540e;
    }

    /* renamed from: c */
    public int mo32615c() {
        return this.f13539d;
    }

    /* renamed from: d */
    public C7058c mo32616d() {
        return this.f13541f;
    }

    /* renamed from: e */
    public int mo32617e() {
        return this.f13538c;
    }

    /* renamed from: f */
    public int mo32618f() {
        return this.f13537b;
    }

    /* renamed from: g */
    public int mo32619g() {
        return this.f13542g;
    }

    /* renamed from: i */
    public int mo32620i() {
        return this.f13536a;
    }

    public String toString() {
        return String.valueOf(this.f13536a);
    }

    /* renamed from: c.q.e.m.b.e$c */
    /* compiled from: Version */
    public static final class C7058c {

        /* renamed from: a */
        public final int f13545a;

        /* renamed from: b */
        public final C7057b[] f13546b;

        /* renamed from: a */
        public C7057b[] mo32624a() {
            return this.f13546b;
        }

        /* renamed from: b */
        public int mo32625b() {
            return this.f13545a;
        }

        public C7058c(int i, C7057b bVar) {
            this.f13545a = i;
            this.f13546b = new C7057b[]{bVar};
        }

        public C7058c(int i, C7057b bVar, C7057b bVar2) {
            this.f13545a = i;
            this.f13546b = new C7057b[]{bVar, bVar2};
        }
    }
}
