package p040c.p175p.p184b.p185a.p191f;

import com.github.mikephil.charting.components.YAxis;

/* renamed from: c.p.b.a.f.d */
/* compiled from: Highlight */
public class C2277d {

    /* renamed from: a */
    public float f2384a;

    /* renamed from: b */
    public float f2385b;

    /* renamed from: c */
    public float f2386c;

    /* renamed from: d */
    public float f2387d;

    /* renamed from: e */
    public int f2388e;

    /* renamed from: f */
    public int f2389f;

    /* renamed from: g */
    public int f2390g;

    /* renamed from: h */
    public YAxis.AxisDependency f2391h;

    /* renamed from: i */
    public float f2392i;

    /* renamed from: j */
    public float f2393j;

    public C2277d(float f, float f2, float f3, float f4, int i, YAxis.AxisDependency axisDependency) {
        this.f2384a = Float.NaN;
        this.f2385b = Float.NaN;
        this.f2388e = -1;
        this.f2390g = -1;
        this.f2384a = f;
        this.f2385b = f2;
        this.f2386c = f3;
        this.f2387d = f4;
        this.f2389f = i;
        this.f2391h = axisDependency;
    }

    /* renamed from: a */
    public boolean mo17326a(C2277d dVar) {
        return dVar != null && this.f2389f == dVar.f2389f && this.f2384a == dVar.f2384a && this.f2390g == dVar.f2390g && this.f2388e == dVar.f2388e;
    }

    /* renamed from: b */
    public YAxis.AxisDependency mo17327b() {
        return this.f2391h;
    }

    /* renamed from: c */
    public int mo17328c() {
        return this.f2388e;
    }

    /* renamed from: d */
    public int mo17329d() {
        return this.f2389f;
    }

    /* renamed from: e */
    public float mo17330e() {
        return this.f2392i;
    }

    /* renamed from: f */
    public float mo17331f() {
        return this.f2393j;
    }

    /* renamed from: g */
    public int mo17332g() {
        return this.f2390g;
    }

    /* renamed from: h */
    public float mo17333h() {
        return this.f2384a;
    }

    /* renamed from: i */
    public float mo17334i() {
        return this.f2386c;
    }

    /* renamed from: j */
    public float mo17335j() {
        return this.f2385b;
    }

    /* renamed from: k */
    public float mo17336k() {
        return this.f2387d;
    }

    /* renamed from: l */
    public void mo17337l(int i) {
        this.f2388e = i;
    }

    /* renamed from: m */
    public void mo17338m(float f, float f2) {
        this.f2392i = f;
        this.f2393j = f2;
    }

    public String toString() {
        return "Highlight, x: " + this.f2384a + ", y: " + this.f2385b + ", dataSetIndex: " + this.f2389f + ", stackIndex (only stacked barentry): " + this.f2390g;
    }

    public C2277d(float f, float f2, float f3, float f4, int i, int i2, YAxis.AxisDependency axisDependency) {
        this(f, f2, f3, f4, i, axisDependency);
        this.f2390g = i2;
    }
}
