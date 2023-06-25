package p040c.p200q.p406e.p426q.p428c;

import com.google.zxing.NotFoundException;
import java.util.ArrayList;
import java.util.List;
import p040c.p200q.p406e.C7024j;
import p040c.p200q.p406e.p410l.C7033b;

/* renamed from: c.q.e.q.c.b */
/* compiled from: AlignmentPatternFinder */
public final class C7154b {

    /* renamed from: a */
    public final C7033b f13765a;

    /* renamed from: b */
    public final List<C7153a> f13766b = new ArrayList(5);

    /* renamed from: c */
    public final int f13767c;

    /* renamed from: d */
    public final int f13768d;

    /* renamed from: e */
    public final int f13769e;

    /* renamed from: f */
    public final int f13770f;

    /* renamed from: g */
    public final float f13771g;

    /* renamed from: h */
    public final int[] f13772h;

    /* renamed from: i */
    public final C7024j f13773i;

    public C7154b(C7033b bVar, int i, int i2, int i3, int i4, float f, C7024j jVar) {
        this.f13765a = bVar;
        this.f13767c = i;
        this.f13768d = i2;
        this.f13769e = i3;
        this.f13770f = i4;
        this.f13771g = f;
        this.f13772h = new int[3];
        this.f13773i = jVar;
    }

    /* renamed from: a */
    public static float m21382a(int[] iArr, int i) {
        return ((float) (i - iArr[2])) - (((float) iArr[1]) / 2.0f);
    }

    /* renamed from: b */
    public final float mo32878b(int i, int i2, int i3, int i4) {
        C7033b bVar = this.f13765a;
        int h = bVar.mo32538h();
        int[] iArr = this.f13772h;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        int i5 = i;
        while (i5 >= 0 && bVar.mo32534d(i2, i5) && iArr[1] <= i3) {
            iArr[1] = iArr[1] + 1;
            i5--;
        }
        if (i5 >= 0 && iArr[1] <= i3) {
            while (i5 >= 0 && !bVar.mo32534d(i2, i5) && iArr[0] <= i3) {
                iArr[0] = iArr[0] + 1;
                i5--;
            }
            if (iArr[0] > i3) {
                return Float.NaN;
            }
            int i6 = i + 1;
            while (i6 < h && bVar.mo32534d(i2, i6) && iArr[1] <= i3) {
                iArr[1] = iArr[1] + 1;
                i6++;
            }
            if (i6 != h && iArr[1] <= i3) {
                while (i6 < h && !bVar.mo32534d(i2, i6) && iArr[2] <= i3) {
                    iArr[2] = iArr[2] + 1;
                    i6++;
                }
                if (iArr[2] <= i3 && Math.abs(((iArr[0] + iArr[1]) + iArr[2]) - i4) * 5 < i4 * 2 && mo32880d(iArr)) {
                    return m21382a(iArr, i6);
                }
            }
        }
        return Float.NaN;
    }

    /* renamed from: c */
    public C7153a mo32879c() {
        C7153a e;
        C7153a e2;
        int i = this.f13767c;
        int i2 = this.f13770f;
        int i3 = this.f13769e + i;
        int i4 = this.f13768d + (i2 / 2);
        int[] iArr = new int[3];
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = ((i5 & 1) == 0 ? (i5 + 1) / 2 : -((i5 + 1) / 2)) + i4;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i7 = i;
            while (i7 < i3 && !this.f13765a.mo32534d(i7, i6)) {
                i7++;
            }
            int i8 = 0;
            while (i7 < i3) {
                if (!this.f13765a.mo32534d(i7, i6)) {
                    if (i8 == 1) {
                        i8++;
                    }
                    iArr[i8] = iArr[i8] + 1;
                } else if (i8 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i8 != 2) {
                    i8++;
                    iArr[i8] = iArr[i8] + 1;
                } else if (mo32880d(iArr) && (e2 = mo32881e(iArr, i6, i7)) != null) {
                    return e2;
                } else {
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i8 = 1;
                }
                i7++;
            }
            if (mo32880d(iArr) && (e = mo32881e(iArr, i6, i3)) != null) {
                return e;
            }
        }
        if (!this.f13766b.isEmpty()) {
            return this.f13766b.get(0);
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: d */
    public final boolean mo32880d(int[] iArr) {
        float f = this.f13771g;
        float f2 = f / 2.0f;
        for (int i = 0; i < 3; i++) {
            if (Math.abs(f - ((float) iArr[i])) >= f2) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public final C7153a mo32881e(int[] iArr, int i, int i2) {
        int i3 = iArr[0] + iArr[1] + iArr[2];
        float a = m21382a(iArr, i2);
        float b = mo32878b(i, (int) a, iArr[1] * 2, i3);
        if (Float.isNaN(b)) {
            return null;
        }
        float f = ((float) ((iArr[0] + iArr[1]) + iArr[2])) / 3.0f;
        for (C7153a next : this.f13766b) {
            if (next.mo32876f(f, b, a)) {
                return next.mo32877g(b, a, f);
            }
        }
        C7153a aVar = new C7153a(a, b, f);
        this.f13766b.add(aVar);
        C7024j jVar = this.f13773i;
        if (jVar == null) {
            return null;
        }
        jVar.mo32491a(aVar);
        return null;
    }
}
