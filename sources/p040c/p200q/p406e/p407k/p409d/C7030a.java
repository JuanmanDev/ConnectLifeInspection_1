package p040c.p200q.p406e.p407k.p409d;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import kotlin.text.Typography;
import p040c.p200q.p406e.C7023i;
import p040c.p200q.p406e.p407k.C7025a;
import p040c.p200q.p406e.p410l.C7033b;
import p040c.p200q.p406e.p410l.C7039h;
import p040c.p200q.p406e.p410l.p411l.C7043a;
import p040c.p200q.p406e.p410l.p411l.C7044b;
import p040c.p200q.p406e.p410l.p412m.C7045a;
import p040c.p200q.p406e.p410l.p412m.C7047c;

/* renamed from: c.q.e.k.d.a */
/* compiled from: Detector */
public final class C7030a {

    /* renamed from: g */
    public static final int[] f13444g = {3808, 476, 2107, 1799};

    /* renamed from: a */
    public final C7033b f13445a;

    /* renamed from: b */
    public boolean f13446b;

    /* renamed from: c */
    public int f13447c;

    /* renamed from: d */
    public int f13448d;

    /* renamed from: e */
    public int f13449e;

    /* renamed from: f */
    public int f13450f;

    /* renamed from: c.q.e.k.d.a$a */
    /* compiled from: Detector */
    public static final class C7031a {

        /* renamed from: a */
        public final int f13451a;

        /* renamed from: b */
        public final int f13452b;

        public C7031a(int i, int i2) {
            this.f13451a = i;
            this.f13452b = i2;
        }

        /* renamed from: a */
        public int mo32511a() {
            return this.f13451a;
        }

        /* renamed from: b */
        public int mo32512b() {
            return this.f13452b;
        }

        /* renamed from: c */
        public C7023i mo32513c() {
            return new C7023i((float) mo32511a(), (float) mo32512b());
        }

        public String toString() {
            return "<" + this.f13451a + ' ' + this.f13452b + Typography.greater;
        }
    }

    public C7030a(C7033b bVar) {
        this.f13445a = bVar;
    }

    /* renamed from: b */
    public static float m20794b(C7023i iVar, C7023i iVar2) {
        return C7043a.m20883a(iVar.mo32486c(), iVar.mo32487d(), iVar2.mo32486c(), iVar2.mo32487d());
    }

    /* renamed from: c */
    public static float m20795c(C7031a aVar, C7031a aVar2) {
        return C7043a.m20884b(aVar.mo32511a(), aVar.mo32512b(), aVar2.mo32511a(), aVar2.mo32512b());
    }

    /* renamed from: d */
    public static C7023i[] m20796d(C7023i[] iVarArr, float f, float f2) {
        float f3 = f2 / (f * 2.0f);
        float c = iVarArr[0].mo32486c() - iVarArr[2].mo32486c();
        float d = iVarArr[0].mo32487d() - iVarArr[2].mo32487d();
        float c2 = (iVarArr[0].mo32486c() + iVarArr[2].mo32486c()) / 2.0f;
        float d2 = (iVarArr[0].mo32487d() + iVarArr[2].mo32487d()) / 2.0f;
        float f4 = c * f3;
        float f5 = d * f3;
        C7023i iVar = new C7023i(c2 + f4, d2 + f5);
        C7023i iVar2 = new C7023i(c2 - f4, d2 - f5);
        float c3 = iVarArr[1].mo32486c() - iVarArr[3].mo32486c();
        float d3 = iVarArr[1].mo32487d() - iVarArr[3].mo32487d();
        float c4 = (iVarArr[1].mo32486c() + iVarArr[3].mo32486c()) / 2.0f;
        float d4 = (iVarArr[1].mo32487d() + iVarArr[3].mo32487d()) / 2.0f;
        float f6 = c3 * f3;
        float f7 = f3 * d3;
        return new C7023i[]{iVar, new C7023i(c4 + f6, d4 + f7), iVar2, new C7023i(c4 - f6, d4 - f7)};
    }

    /* renamed from: h */
    public static int m20797h(long j, boolean z) {
        int i;
        int i2;
        if (z) {
            i = 7;
            i2 = 2;
        } else {
            i = 10;
            i2 = 4;
        }
        int i3 = i - i2;
        int[] iArr = new int[i];
        for (int i4 = i - 1; i4 >= 0; i4--) {
            iArr[i4] = ((int) j) & 15;
            j >>= 4;
        }
        try {
            new C7047c(C7045a.f13498k).mo32597a(iArr, i3);
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                i5 = (i5 << 4) + iArr[i6];
            }
            return i5;
        } catch (ReedSolomonException unused) {
            throw NotFoundException.getNotFoundInstance();
        }
    }

    /* renamed from: m */
    public static int m20798m(int[] iArr, int i) {
        int i2 = 0;
        for (int i3 : iArr) {
            i2 = (i2 << 3) + ((i3 >> (i - 2)) << 1) + (i3 & 1);
        }
        int i4 = ((i2 & 1) << 11) + (i2 >> 1);
        for (int i5 = 0; i5 < 4; i5++) {
            if (Integer.bitCount(f13444g[i5] ^ i4) <= 2) {
                return i5;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: a */
    public C7025a mo32498a(boolean z) {
        C7023i[] f = mo32500f(mo32504k());
        if (z) {
            C7023i iVar = f[0];
            f[0] = f[2];
            f[2] = iVar;
        }
        mo32499e(f);
        C7033b bVar = this.f13445a;
        int i = this.f13450f;
        return new C7025a(mo32509q(bVar, f[i % 4], f[(i + 1) % 4], f[(i + 2) % 4], f[(i + 3) % 4]), mo32505l(f), this.f13446b, this.f13448d, this.f13447c);
    }

    /* renamed from: e */
    public final void mo32499e(C7023i[] iVarArr) {
        long j;
        long j2;
        if (!mo32507o(iVarArr[0]) || !mo32507o(iVarArr[1]) || !mo32507o(iVarArr[2]) || !mo32507o(iVarArr[3])) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i = this.f13449e * 2;
        int[] iArr = {mo32510r(iVarArr[0], iVarArr[1], i), mo32510r(iVarArr[1], iVarArr[2], i), mo32510r(iVarArr[2], iVarArr[3], i), mo32510r(iVarArr[3], iVarArr[0], i)};
        this.f13450f = m20798m(iArr, i);
        long j3 = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = iArr[(this.f13450f + i2) % 4];
            if (this.f13446b) {
                j2 = j3 << 7;
                j = (long) ((i3 >> 1) & 127);
            } else {
                j2 = j3 << 10;
                j = (long) (((i3 >> 2) & 992) + ((i3 >> 1) & 31));
            }
            j3 = j2 + j;
        }
        int h = m20797h(j3, this.f13446b);
        if (this.f13446b) {
            this.f13447c = (h >> 6) + 1;
            this.f13448d = (h & 63) + 1;
            return;
        }
        this.f13447c = (h >> 11) + 1;
        this.f13448d = (h & 2047) + 1;
    }

    /* renamed from: f */
    public final C7023i[] mo32500f(C7031a aVar) {
        this.f13449e = 1;
        C7031a aVar2 = aVar;
        C7031a aVar3 = aVar2;
        C7031a aVar4 = aVar3;
        boolean z = true;
        while (this.f13449e < 9) {
            C7031a j = mo32503j(aVar, z, 1, -1);
            C7031a j2 = mo32503j(aVar2, z, 1, 1);
            C7031a j3 = mo32503j(aVar3, z, -1, 1);
            C7031a j4 = mo32503j(aVar4, z, -1, -1);
            if (this.f13449e > 2) {
                double c = (double) ((m20795c(j4, j) * ((float) this.f13449e)) / (m20795c(aVar4, aVar) * ((float) (this.f13449e + 2))));
                if (c < 0.75d || c > 1.25d || !mo32508p(j, j2, j3, j4)) {
                    break;
                }
            }
            z = !z;
            this.f13449e++;
            aVar4 = j4;
            aVar = j;
            aVar2 = j2;
            aVar3 = j3;
        }
        int i = this.f13449e;
        if (i == 5 || i == 7) {
            this.f13446b = this.f13449e == 5;
            C7023i[] iVarArr = {new C7023i(((float) aVar.mo32511a()) + 0.5f, ((float) aVar.mo32512b()) - 0.5f), new C7023i(((float) aVar2.mo32511a()) + 0.5f, ((float) aVar2.mo32512b()) + 0.5f), new C7023i(((float) aVar3.mo32511a()) - 0.5f, ((float) aVar3.mo32512b()) + 0.5f), new C7023i(((float) aVar4.mo32511a()) - 0.5f, ((float) aVar4.mo32512b()) - 0.5f)};
            int i2 = this.f13449e;
            return m20796d(iVarArr, (float) ((i2 * 2) - 3), (float) (i2 * 2));
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: g */
    public final int mo32501g(C7031a aVar, C7031a aVar2) {
        float c = m20795c(aVar, aVar2);
        float a = ((float) (aVar2.mo32511a() - aVar.mo32511a())) / c;
        float b = ((float) (aVar2.mo32512b() - aVar.mo32512b())) / c;
        float a2 = (float) aVar.mo32511a();
        float b2 = (float) aVar.mo32512b();
        boolean d = this.f13445a.mo32534d(aVar.mo32511a(), aVar.mo32512b());
        int ceil = (int) Math.ceil((double) c);
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < ceil; i2++) {
            a2 += a;
            b2 += b;
            if (this.f13445a.mo32534d(C7043a.m20885c(a2), C7043a.m20885c(b2)) != d) {
                i++;
            }
        }
        float f = ((float) i) / c;
        if (f > 0.1f && f < 0.9f) {
            return 0;
        }
        if (f <= 0.1f) {
            z = true;
        }
        return z == d ? 1 : -1;
    }

    /* renamed from: i */
    public final int mo32502i() {
        if (this.f13446b) {
            return (this.f13447c * 4) + 11;
        }
        int i = this.f13447c;
        if (i <= 4) {
            return (i * 4) + 15;
        }
        return (i * 4) + ((((i - 4) / 8) + 1) * 2) + 15;
    }

    /* renamed from: j */
    public final C7031a mo32503j(C7031a aVar, boolean z, int i, int i2) {
        int a = aVar.mo32511a() + i;
        int b = aVar.mo32512b();
        while (true) {
            b += i2;
            if (!mo32506n(a, b) || this.f13445a.mo32534d(a, b) != z) {
                int i3 = a - i;
                int i4 = b - i2;
            } else {
                a += i;
            }
        }
        int i32 = a - i;
        int i42 = b - i2;
        while (mo32506n(i32, i42) && this.f13445a.mo32534d(i32, i42) == z) {
            i32 += i;
        }
        int i5 = i32 - i;
        while (mo32506n(i5, i42) && this.f13445a.mo32534d(i5, i42) == z) {
            i42 += i2;
        }
        return new C7031a(i5, i42 - i2);
    }

    /* renamed from: k */
    public final C7031a mo32504k() {
        C7023i iVar;
        C7023i iVar2;
        C7023i iVar3;
        C7023i iVar4;
        C7023i iVar5;
        C7023i iVar6;
        C7023i iVar7;
        C7023i iVar8;
        try {
            C7023i[] c = new C7044b(this.f13445a).mo32576c();
            iVar3 = c[0];
            iVar2 = c[1];
            iVar = c[2];
            iVar4 = c[3];
        } catch (NotFoundException unused) {
            int k = this.f13445a.mo32542k() / 2;
            int h = this.f13445a.mo32538h() / 2;
            int i = k + 7;
            int i2 = h - 7;
            C7023i c2 = mo32503j(new C7031a(i, i2), false, 1, -1).mo32513c();
            int i3 = h + 7;
            C7023i c3 = mo32503j(new C7031a(i, i3), false, 1, 1).mo32513c();
            int i4 = k - 7;
            C7023i c4 = mo32503j(new C7031a(i4, i3), false, -1, 1).mo32513c();
            iVar4 = mo32503j(new C7031a(i4, i2), false, -1, -1).mo32513c();
            C7023i iVar9 = c3;
            iVar = c4;
            iVar3 = c2;
            iVar2 = iVar9;
        }
        int c5 = C7043a.m20885c((((iVar3.mo32486c() + iVar4.mo32486c()) + iVar2.mo32486c()) + iVar.mo32486c()) / 4.0f);
        int c6 = C7043a.m20885c((((iVar3.mo32487d() + iVar4.mo32487d()) + iVar2.mo32487d()) + iVar.mo32487d()) / 4.0f);
        try {
            C7023i[] c7 = new C7044b(this.f13445a, 15, c5, c6).mo32576c();
            iVar6 = c7[0];
            iVar5 = c7[1];
            iVar7 = c7[2];
            iVar8 = c7[3];
        } catch (NotFoundException unused2) {
            int i5 = c5 + 7;
            int i6 = c6 - 7;
            iVar6 = mo32503j(new C7031a(i5, i6), false, 1, -1).mo32513c();
            int i7 = c6 + 7;
            iVar5 = mo32503j(new C7031a(i5, i7), false, 1, 1).mo32513c();
            int i8 = c5 - 7;
            iVar7 = mo32503j(new C7031a(i8, i7), false, -1, 1).mo32513c();
            iVar8 = mo32503j(new C7031a(i8, i6), false, -1, -1).mo32513c();
        }
        return new C7031a(C7043a.m20885c((((iVar6.mo32486c() + iVar8.mo32486c()) + iVar5.mo32486c()) + iVar7.mo32486c()) / 4.0f), C7043a.m20885c((((iVar6.mo32487d() + iVar8.mo32487d()) + iVar5.mo32487d()) + iVar7.mo32487d()) / 4.0f));
    }

    /* renamed from: l */
    public final C7023i[] mo32505l(C7023i[] iVarArr) {
        return m20796d(iVarArr, (float) (this.f13449e * 2), (float) mo32502i());
    }

    /* renamed from: n */
    public final boolean mo32506n(int i, int i2) {
        return i >= 0 && i < this.f13445a.mo32542k() && i2 > 0 && i2 < this.f13445a.mo32538h();
    }

    /* renamed from: o */
    public final boolean mo32507o(C7023i iVar) {
        return mo32506n(C7043a.m20885c(iVar.mo32486c()), C7043a.m20885c(iVar.mo32487d()));
    }

    /* renamed from: p */
    public final boolean mo32508p(C7031a aVar, C7031a aVar2, C7031a aVar3, C7031a aVar4) {
        C7031a aVar5 = new C7031a(aVar.mo32511a() - 3, aVar.mo32512b() + 3);
        C7031a aVar6 = new C7031a(aVar2.mo32511a() - 3, aVar2.mo32512b() - 3);
        C7031a aVar7 = new C7031a(aVar3.mo32511a() + 3, aVar3.mo32512b() - 3);
        C7031a aVar8 = new C7031a(aVar4.mo32511a() + 3, aVar4.mo32512b() + 3);
        int g = mo32501g(aVar8, aVar5);
        if (g != 0 && mo32501g(aVar5, aVar6) == g && mo32501g(aVar6, aVar7) == g && mo32501g(aVar7, aVar8) == g) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public final C7033b mo32509q(C7033b bVar, C7023i iVar, C7023i iVar2, C7023i iVar3, C7023i iVar4) {
        C7039h b = C7039h.m20868b();
        int i = mo32502i();
        int i2 = i;
        int i3 = i;
        float f = ((float) i) / 2.0f;
        int i4 = this.f13449e;
        float f2 = f - ((float) i4);
        float f3 = f + ((float) i4);
        return b.mo32566c(bVar, i3, i2, f2, f2, f3, f2, f3, f3, f2, f3, iVar.mo32486c(), iVar.mo32487d(), iVar2.mo32486c(), iVar2.mo32487d(), iVar3.mo32486c(), iVar3.mo32487d(), iVar4.mo32486c(), iVar4.mo32487d());
    }

    /* renamed from: r */
    public final int mo32510r(C7023i iVar, C7023i iVar2, int i) {
        float b = m20794b(iVar, iVar2);
        float f = b / ((float) i);
        float c = iVar.mo32486c();
        float d = iVar.mo32487d();
        float c2 = ((iVar2.mo32486c() - iVar.mo32486c()) * f) / b;
        float d2 = (f * (iVar2.mo32487d() - iVar.mo32487d())) / b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            float f2 = (float) i3;
            if (this.f13445a.mo32534d(C7043a.m20885c((f2 * c2) + c), C7043a.m20885c((f2 * d2) + d))) {
                i2 |= 1 << ((i - i3) - 1);
            }
        }
        return i2;
    }
}
