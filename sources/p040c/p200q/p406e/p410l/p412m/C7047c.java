package p040c.p200q.p406e.p410l.p412m;

import com.google.zxing.common.reedsolomon.ReedSolomonException;

/* renamed from: c.q.e.l.m.c */
/* compiled from: ReedSolomonDecoder */
public final class C7047c {

    /* renamed from: a */
    public final C7045a f13512a;

    public C7047c(C7045a aVar) {
        this.f13512a = aVar;
    }

    /* renamed from: a */
    public void mo32597a(int[] iArr, int i) {
        C7046b bVar = new C7046b(this.f13512a, iArr);
        int[] iArr2 = new int[i];
        int i2 = 0;
        boolean z = true;
        for (int i3 = 0; i3 < i; i3++) {
            C7045a aVar = this.f13512a;
            int b = bVar.mo32589b(aVar.mo32579c(aVar.mo32580d() + i3));
            iArr2[(i - 1) - i3] = b;
            if (b != 0) {
                z = false;
            }
        }
        if (!z) {
            C7046b[] d = mo32600d(this.f13512a.mo32578b(i, 1), new C7046b(this.f13512a, iArr2), i);
            C7046b bVar2 = d[0];
            C7046b bVar3 = d[1];
            int[] b2 = mo32598b(bVar2);
            int[] c = mo32599c(bVar3, b2);
            while (i2 < b2.length) {
                int length = (iArr.length - 1) - this.f13512a.mo32585i(b2[i2]);
                if (length >= 0) {
                    iArr[length] = C7045a.m20891a(iArr[length], c[i2]);
                    i2++;
                } else {
                    throw new ReedSolomonException("Bad error location");
                }
            }
        }
    }

    /* renamed from: b */
    public final int[] mo32598b(C7046b bVar) {
        int d = bVar.mo32591d();
        int i = 0;
        if (d == 1) {
            return new int[]{bVar.mo32590c(1)};
        }
        int[] iArr = new int[d];
        for (int i2 = 1; i2 < this.f13512a.mo32582f() && i < d; i2++) {
            if (bVar.mo32589b(i2) == 0) {
                iArr[i] = this.f13512a.mo32584h(i2);
                i++;
            }
        }
        if (i == d) {
            return iArr;
        }
        throw new ReedSolomonException("Error locator degree does not match number of roots");
    }

    /* renamed from: c */
    public final int[] mo32599c(C7046b bVar, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i = 0; i < length; i++) {
            int h = this.f13512a.mo32584h(iArr[i]);
            int i2 = 1;
            for (int i3 = 0; i3 < length; i3++) {
                if (i != i3) {
                    int j = this.f13512a.mo32586j(iArr[i3], h);
                    i2 = this.f13512a.mo32586j(i2, (j & 1) == 0 ? j | 1 : j & -2);
                }
            }
            iArr2[i] = this.f13512a.mo32586j(bVar.mo32589b(h), this.f13512a.mo32584h(i2));
            if (this.f13512a.mo32580d() != 0) {
                iArr2[i] = this.f13512a.mo32586j(iArr2[i], h);
            }
        }
        return iArr2;
    }

    /* renamed from: d */
    public final C7046b[] mo32600d(C7046b bVar, C7046b bVar2, int i) {
        if (bVar.mo32591d() < bVar2.mo32591d()) {
            C7046b bVar3 = bVar2;
            bVar2 = bVar;
            bVar = bVar3;
        }
        C7046b g = this.f13512a.mo32583g();
        C7046b e = this.f13512a.mo32581e();
        do {
            C7046b bVar4 = r11;
            r11 = bVar;
            bVar = bVar4;
            C7046b bVar5 = e;
            C7046b bVar6 = g;
            g = bVar5;
            if (bVar.mo32591d() < i / 2) {
                int c = g.mo32590c(0);
                if (c != 0) {
                    int h = this.f13512a.mo32584h(c);
                    return new C7046b[]{g.mo32593f(h), bVar.mo32593f(h)};
                }
                throw new ReedSolomonException("sigmaTilde(0) was zero");
            } else if (!bVar.mo32592e()) {
                C7046b g2 = this.f13512a.mo32583g();
                int h2 = this.f13512a.mo32584h(bVar.mo32590c(bVar.mo32591d()));
                while (r11.mo32591d() >= bVar.mo32591d() && !r11.mo32592e()) {
                    int d = r11.mo32591d() - bVar.mo32591d();
                    int j = this.f13512a.mo32586j(r11.mo32590c(r11.mo32591d()), h2);
                    g2 = g2.mo32588a(this.f13512a.mo32578b(d, j));
                    r11 = r11.mo32588a(bVar.mo32595h(d, j));
                }
                e = g2.mo32594g(g).mo32588a(bVar6);
            } else {
                throw new ReedSolomonException("r_{i-1} was zero");
            }
        } while (r11.mo32591d() < bVar.mo32591d());
        throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
    }
}
