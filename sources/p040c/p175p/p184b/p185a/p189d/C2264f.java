package p040c.p175p.p184b.p185a.p189d;

import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import java.util.List;
import p040c.p175p.p184b.p185a.p191f.C2277d;
import p040c.p175p.p184b.p185a.p192g.p194b.C2296e;

/* renamed from: c.p.b.a.d.f */
/* compiled from: ChartData */
public abstract class C2264f<T extends C2296e<? extends Entry>> {

    /* renamed from: a */
    public float f2364a = -3.4028235E38f;

    /* renamed from: b */
    public float f2365b = Float.MAX_VALUE;

    /* renamed from: c */
    public float f2366c = -3.4028235E38f;

    /* renamed from: d */
    public float f2367d = Float.MAX_VALUE;

    /* renamed from: e */
    public float f2368e = -3.4028235E38f;

    /* renamed from: f */
    public float f2369f = Float.MAX_VALUE;

    /* renamed from: g */
    public float f2370g = -3.4028235E38f;

    /* renamed from: h */
    public float f2371h = Float.MAX_VALUE;

    /* renamed from: i */
    public List<T> f2372i = new ArrayList();

    /* renamed from: a */
    public void mo17274a() {
        List<T> list = this.f2372i;
        if (list != null) {
            this.f2364a = -3.4028235E38f;
            this.f2365b = Float.MAX_VALUE;
            this.f2366c = -3.4028235E38f;
            this.f2367d = Float.MAX_VALUE;
            for (T b : list) {
                mo17275b(b);
            }
            this.f2368e = -3.4028235E38f;
            this.f2369f = Float.MAX_VALUE;
            this.f2370g = -3.4028235E38f;
            this.f2371h = Float.MAX_VALUE;
            C2296e i = mo17282i(this.f2372i);
            if (i != null) {
                this.f2368e = i.mo17404m();
                this.f2369f = i.mo17382C();
                for (T t : this.f2372i) {
                    if (t.mo17384F0() == YAxis.AxisDependency.LEFT) {
                        if (t.mo17382C() < this.f2369f) {
                            this.f2369f = t.mo17382C();
                        }
                        if (t.mo17404m() > this.f2368e) {
                            this.f2368e = t.mo17404m();
                        }
                    }
                }
            }
            C2296e j = mo17283j(this.f2372i);
            if (j != null) {
                this.f2370g = j.mo17404m();
                this.f2371h = j.mo17382C();
                for (T t2 : this.f2372i) {
                    if (t2.mo17384F0() == YAxis.AxisDependency.RIGHT) {
                        if (t2.mo17382C() < this.f2371h) {
                            this.f2371h = t2.mo17382C();
                        }
                        if (t2.mo17404m() > this.f2370g) {
                            this.f2370g = t2.mo17404m();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public void mo17275b(T t) {
        if (this.f2364a < t.mo17404m()) {
            this.f2364a = t.mo17404m();
        }
        if (this.f2365b > t.mo17382C()) {
            this.f2365b = t.mo17382C();
        }
        if (this.f2366c < t.mo17412w0()) {
            this.f2366c = t.mo17412w0();
        }
        if (this.f2367d > t.mo17402k()) {
            this.f2367d = t.mo17402k();
        }
        if (t.mo17384F0() == YAxis.AxisDependency.LEFT) {
            if (this.f2368e < t.mo17404m()) {
                this.f2368e = t.mo17404m();
            }
            if (this.f2369f > t.mo17382C()) {
                this.f2369f = t.mo17382C();
                return;
            }
            return;
        }
        if (this.f2370g < t.mo17404m()) {
            this.f2370g = t.mo17404m();
        }
        if (this.f2371h > t.mo17382C()) {
            this.f2371h = t.mo17382C();
        }
    }

    /* renamed from: c */
    public void mo17276c(float f, float f2) {
        for (T o0 : this.f2372i) {
            o0.mo17406o0(f, f2);
        }
        mo17274a();
    }

    /* renamed from: d */
    public T mo17277d(int i) {
        List<T> list = this.f2372i;
        if (list == null || i < 0 || i >= list.size()) {
            return null;
        }
        return (C2296e) this.f2372i.get(i);
    }

    /* renamed from: e */
    public int mo17278e() {
        List<T> list = this.f2372i;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: f */
    public List<T> mo17279f() {
        return this.f2372i;
    }

    /* renamed from: g */
    public int mo17280g() {
        int i = 0;
        for (T H0 : this.f2372i) {
            i += H0.mo17385H0();
        }
        return i;
    }

    /* renamed from: h */
    public Entry mo17281h(C2277d dVar) {
        if (dVar.mo17329d() >= this.f2372i.size()) {
            return null;
        }
        return ((C2296e) this.f2372i.get(dVar.mo17329d())).mo17410t(dVar.mo17333h(), dVar.mo17335j());
    }

    /* renamed from: i */
    public T mo17282i(List<T> list) {
        for (T t : list) {
            if (t.mo17384F0() == YAxis.AxisDependency.LEFT) {
                return t;
            }
        }
        return null;
    }

    /* renamed from: j */
    public T mo17283j(List<T> list) {
        for (T t : list) {
            if (t.mo17384F0() == YAxis.AxisDependency.RIGHT) {
                return t;
            }
        }
        return null;
    }

    /* renamed from: k */
    public T mo17284k() {
        List<T> list = this.f2372i;
        if (list == null || list.isEmpty()) {
            return null;
        }
        T t = (C2296e) this.f2372i.get(0);
        for (T t2 : this.f2372i) {
            if (t2.mo17385H0() > t.mo17385H0()) {
                t = t2;
            }
        }
        return t;
    }

    /* renamed from: l */
    public float mo17285l() {
        return this.f2366c;
    }

    /* renamed from: m */
    public float mo17286m() {
        return this.f2367d;
    }

    /* renamed from: n */
    public float mo17287n() {
        return this.f2364a;
    }

    /* renamed from: o */
    public float mo17288o(YAxis.AxisDependency axisDependency) {
        if (axisDependency == YAxis.AxisDependency.LEFT) {
            float f = this.f2368e;
            return f == -3.4028235E38f ? this.f2370g : f;
        }
        float f2 = this.f2370g;
        return f2 == -3.4028235E38f ? this.f2368e : f2;
    }

    /* renamed from: p */
    public float mo17289p() {
        return this.f2365b;
    }

    /* renamed from: q */
    public float mo17290q(YAxis.AxisDependency axisDependency) {
        if (axisDependency == YAxis.AxisDependency.LEFT) {
            float f = this.f2369f;
            return f == Float.MAX_VALUE ? this.f2371h : f;
        }
        float f2 = this.f2371h;
        return f2 == Float.MAX_VALUE ? this.f2369f : f2;
    }
}
