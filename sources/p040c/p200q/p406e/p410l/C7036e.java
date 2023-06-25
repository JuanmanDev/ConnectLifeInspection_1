package p040c.p200q.p406e.p410l;

import com.google.zxing.NotFoundException;

/* renamed from: c.q.e.l.e */
/* compiled from: DefaultGridSampler */
public final class C7036e extends C7039h {
    /* renamed from: c */
    public C7033b mo32566c(C7033b bVar, int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        C7033b bVar2 = bVar;
        int i3 = i;
        int i4 = i2;
        return mo32567d(bVar, i, i2, C7041j.m20876b(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16));
    }

    /* renamed from: d */
    public C7033b mo32567d(C7033b bVar, int i, int i2, C7041j jVar) {
        if (i <= 0 || i2 <= 0) {
            throw NotFoundException.getNotFoundInstance();
        }
        C7033b bVar2 = new C7033b(i, i2);
        int i3 = i * 2;
        float[] fArr = new float[i3];
        for (int i4 = 0; i4 < i2; i4++) {
            float f = ((float) i4) + 0.5f;
            for (int i5 = 0; i5 < i3; i5 += 2) {
                fArr[i5] = ((float) (i5 / 2)) + 0.5f;
                fArr[i5 + 1] = f;
            }
            jVar.mo32573f(fArr);
            C7039h.m20867a(bVar, fArr);
            int i6 = 0;
            while (i6 < i3) {
                try {
                    if (bVar.mo32534d((int) fArr[i6], (int) fArr[i6 + 1])) {
                        bVar2.mo32544m(i6 / 2, i4);
                    }
                    i6 += 2;
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw NotFoundException.getNotFoundInstance();
                }
            }
        }
        return bVar2;
    }
}
