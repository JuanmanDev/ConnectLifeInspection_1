package p040c.p200q.p406e.p426q.p428c;

import p040c.p200q.p406e.C7023i;

/* renamed from: c.q.e.q.c.d */
/* compiled from: FinderPattern */
public final class C7156d extends C7023i {

    /* renamed from: c */
    public final float f13776c;

    /* renamed from: d */
    public final int f13777d;

    public C7156d(float f, float f2, float f3) {
        this(f, f2, f3, 1);
    }

    /* renamed from: f */
    public boolean mo32889f(float f, float f2, float f3) {
        if (Math.abs(f2 - mo32487d()) > f || Math.abs(f3 - mo32486c()) > f) {
            return false;
        }
        float abs = Math.abs(f - this.f13776c);
        if (abs <= 1.0f || abs <= this.f13776c) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public C7156d mo32890g(float f, float f2, float f3) {
        int i = this.f13777d;
        int i2 = i + 1;
        float c = (((float) i) * mo32486c()) + f2;
        float f4 = (float) i2;
        return new C7156d(c / f4, ((((float) this.f13777d) * mo32487d()) + f) / f4, ((((float) this.f13777d) * this.f13776c) + f3) / f4, i2);
    }

    /* renamed from: h */
    public int mo32891h() {
        return this.f13777d;
    }

    /* renamed from: i */
    public float mo32892i() {
        return this.f13776c;
    }

    public C7156d(float f, float f2, float f3, int i) {
        super(f, f2);
        this.f13776c = f3;
        this.f13777d = i;
    }
}
