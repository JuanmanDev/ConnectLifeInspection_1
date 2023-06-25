package p040c.p175p.p184b.p185a.p187b;

import com.github.mikephil.charting.data.BarEntry;
import p040c.p175p.p184b.p185a.p192g.p194b.C2292a;

/* renamed from: c.p.b.a.b.b */
/* compiled from: BarBuffer */
public class C2252b extends C2251a<C2292a> {

    /* renamed from: e */
    public boolean f2313e = false;

    /* renamed from: f */
    public boolean f2314f = false;

    /* renamed from: g */
    public float f2315g = 1.0f;

    public C2252b(int i, int i2, boolean z) {
        super(i);
        this.f2313e = z;
    }

    /* renamed from: d */
    public void mo17229d(float f, float f2, float f3, float f4) {
        float[] fArr = this.f2310b;
        int i = this.f2309a;
        int i2 = i + 1;
        this.f2309a = i2;
        fArr[i] = f;
        int i3 = i2 + 1;
        this.f2309a = i3;
        fArr[i2] = f2;
        int i4 = i3 + 1;
        this.f2309a = i4;
        fArr[i3] = f3;
        this.f2309a = i4 + 1;
        fArr[i4] = f4;
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
                    mo17229d(f7, c, f8, f);
                } else {
                    float f11 = -barEntry.mo23865g();
                    float f12 = 0.0f;
                    int i2 = 0;
                    while (i2 < j.length) {
                        float f13 = j[i2];
                        int i3 = (f13 > 0.0f ? 1 : (f13 == 0.0f ? 0 : -1));
                        if (i3 == 0 && (f12 == 0.0f || f11 == 0.0f)) {
                            f2 = f13;
                            f3 = f11;
                            f11 = f2;
                        } else if (i3 >= 0) {
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
                        mo17229d(f14, f11 * f18, f15, f4 * f18);
                        i2++;
                        f11 = f3;
                    }
                }
            }
        }
        mo17226a();
    }

    /* renamed from: f */
    public void mo17231f(float f) {
        this.f2315g = f;
    }

    /* renamed from: g */
    public void mo17232g(int i) {
    }

    /* renamed from: h */
    public void mo17233h(boolean z) {
        this.f2314f = z;
    }
}
