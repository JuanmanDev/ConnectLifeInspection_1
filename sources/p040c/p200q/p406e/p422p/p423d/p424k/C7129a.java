package p040c.p200q.p406e.p422p.p423d.p424k;

import com.google.zxing.ChecksumException;

/* renamed from: c.q.e.p.d.k.a */
/* compiled from: ErrorCorrection */
public final class C7129a {

    /* renamed from: a */
    public final C7130b f13716a = C7130b.f13717f;

    /* renamed from: a */
    public int mo32819a(int[] iArr, int i, int[] iArr2) {
        C7131c cVar = new C7131c(this.f13716a, iArr);
        int[] iArr3 = new int[i];
        int i2 = 0;
        boolean z = false;
        for (int i3 = i; i3 > 0; i3--) {
            int b = cVar.mo32834b(this.f13716a.mo32825c(i3));
            iArr3[i - i3] = b;
            if (b != 0) {
                z = true;
            }
        }
        if (!z) {
            return 0;
        }
        C7131c d = this.f13716a.mo32826d();
        if (iArr2 != null) {
            for (int length : iArr2) {
                int c = this.f13716a.mo32825c((iArr.length - 1) - length);
                C7130b bVar = this.f13716a;
                d = d.mo32839g(new C7131c(bVar, new int[]{bVar.mo32832j(0, c), 1}));
            }
        }
        C7131c[] d2 = mo32822d(this.f13716a.mo32824b(i, 1), new C7131c(this.f13716a, iArr3), i);
        C7131c cVar2 = d2[0];
        C7131c cVar3 = d2[1];
        int[] b2 = mo32820b(cVar2);
        int[] c2 = mo32821c(cVar3, cVar2, b2);
        while (i2 < b2.length) {
            int length2 = (iArr.length - 1) - this.f13716a.mo32830h(b2[i2]);
            if (length2 >= 0) {
                iArr[length2] = this.f13716a.mo32832j(iArr[length2], c2[i2]);
                i2++;
            } else {
                throw ChecksumException.getChecksumInstance();
            }
        }
        return b2.length;
    }

    /* renamed from: b */
    public final int[] mo32820b(C7131c cVar) {
        int d = cVar.mo32836d();
        int[] iArr = new int[d];
        int i = 0;
        for (int i2 = 1; i2 < this.f13716a.mo32827e() && i < d; i2++) {
            if (cVar.mo32834b(i2) == 0) {
                iArr[i] = this.f13716a.mo32829g(i2);
                i++;
            }
        }
        if (i == d) {
            return iArr;
        }
        throw ChecksumException.getChecksumInstance();
    }

    /* renamed from: c */
    public final int[] mo32821c(C7131c cVar, C7131c cVar2, int[] iArr) {
        int d = cVar2.mo32836d();
        int[] iArr2 = new int[d];
        for (int i = 1; i <= d; i++) {
            iArr2[d - i] = this.f13716a.mo32831i(i, cVar2.mo32835c(i));
        }
        C7131c cVar3 = new C7131c(this.f13716a, iArr2);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            int g = this.f13716a.mo32829g(iArr[i2]);
            iArr3[i2] = this.f13716a.mo32831i(this.f13716a.mo32832j(0, cVar.mo32834b(g)), this.f13716a.mo32829g(cVar3.mo32834b(g)));
        }
        return iArr3;
    }

    /* renamed from: d */
    public final C7131c[] mo32822d(C7131c cVar, C7131c cVar2, int i) {
        if (cVar.mo32836d() < cVar2.mo32836d()) {
            C7131c cVar3 = cVar2;
            cVar2 = cVar;
            cVar = cVar3;
        }
        C7131c f = this.f13716a.mo32828f();
        C7131c d = this.f13716a.mo32826d();
        while (true) {
            C7131c cVar4 = r11;
            r11 = cVar;
            cVar = cVar4;
            C7131c cVar5 = d;
            C7131c cVar6 = f;
            f = cVar5;
            if (cVar.mo32836d() < i / 2) {
                int c = f.mo32835c(0);
                if (c != 0) {
                    int g = this.f13716a.mo32829g(c);
                    return new C7131c[]{f.mo32838f(g), cVar.mo32838f(g)};
                }
                throw ChecksumException.getChecksumInstance();
            } else if (!cVar.mo32837e()) {
                C7131c f2 = this.f13716a.mo32828f();
                int g2 = this.f13716a.mo32829g(cVar.mo32835c(cVar.mo32836d()));
                while (r11.mo32836d() >= cVar.mo32836d() && !r11.mo32837e()) {
                    int d2 = r11.mo32836d() - cVar.mo32836d();
                    int i2 = this.f13716a.mo32831i(r11.mo32835c(r11.mo32836d()), g2);
                    f2 = f2.mo32833a(this.f13716a.mo32824b(d2, i2));
                    r11 = r11.mo32842j(cVar.mo32840h(d2, i2));
                }
                d = f2.mo32839g(f).mo32842j(cVar6).mo32841i();
            } else {
                throw ChecksumException.getChecksumInstance();
            }
        }
    }
}
