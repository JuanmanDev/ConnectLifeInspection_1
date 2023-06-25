package p040c.p175p.p184b.p185a.p187b;

import com.github.mikephil.charting.data.BarEntry;
import p040c.p175p.p184b.p185a.p192g.p194b.C2292a;

/* renamed from: c.p.b.a.b.c */
/* compiled from: HorizontalBarBuffer */
public class C2253c extends C2252b {
    public C2253c(int i, int i2, boolean z) {
        super(i, i2, z);
    }

    /* renamed from: e */
    public void mo17230e(C2292a aVar) {
        float f;
        float f2;
        float f3;
        float f4;
        float H0 = ((float) aVar.mo17385H0()) * this.f2311c;
        float f5 = this.f2315g / 2.0f;
        for (int i = 0; ((float) i) < H0; i++) {
            BarEntry barEntry = (BarEntry) aVar.mo17392O(i);
            if (barEntry != null) {
                float f6 = barEntry.mo23876f();
                float c = barEntry.mo17271c();
                float[] j = barEntry.mo23868j();
                if (!this.f2313e || j == null) {
                    float f7 = f6 - f5;
                    float f8 = f6 + f5;
                    if (this.f2314f) {
                        f = c >= 0.0f ? c : 0.0f;
                        if (c > 0.0f) {
                            c = 0.0f;
                        }
                    } else {
                        float f9 = c >= 0.0f ? c : 0.0f;
                        if (c > 0.0f) {
                            c = 0.0f;
                        }
                        float f10 = c;
                        c = f9;
                        f = f10;
                    }
                    if (c > 0.0f) {
                        c *= this.f2312d;
                    } else {
                        f *= this.f2312d;
                    }
                    mo17229d(f, f8, c, f7);
                } else {
                    float f11 = -barEntry.mo23865g();
                    float f12 = 0.0f;
                    int i2 = 0;
                    while (i2 < j.length) {
                        float f13 = j[i2];
                        if (f13 >= 0.0f) {
                            f2 = f13 + f12;
                            f3 = f11;
                            f11 = f12;
                            f12 = f2;
                        } else {
                            f2 = Math.abs(f13) + f11;
                            f3 = Math.abs(f13) + f11;
                        }
                        float f14 = f6 - f5;
                        float f15 = f6 + f5;
                        if (this.f2314f) {
                            f4 = f11 >= f2 ? f11 : f2;
                            if (f11 > f2) {
                                f11 = f2;
                            }
                        } else {
                            float f16 = f11 >= f2 ? f11 : f2;
                            if (f11 > f2) {
                                f11 = f2;
                            }
                            float f17 = f11;
                            f11 = f16;
                            f4 = f17;
                        }
                        float f18 = this.f2312d;
                        mo17229d(f4 * f18, f15, f11 * f18, f14);
                        i2++;
                        f11 = f3;
                    }
                }
            }
        }
        mo17226a();
    }
}
