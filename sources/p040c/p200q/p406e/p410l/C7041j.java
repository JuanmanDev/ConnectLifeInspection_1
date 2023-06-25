package p040c.p200q.p406e.p410l;

/* renamed from: c.q.e.l.j */
/* compiled from: PerspectiveTransform */
public final class C7041j {

    /* renamed from: a */
    public final float f13477a;

    /* renamed from: b */
    public final float f13478b;

    /* renamed from: c */
    public final float f13479c;

    /* renamed from: d */
    public final float f13480d;

    /* renamed from: e */
    public final float f13481e;

    /* renamed from: f */
    public final float f13482f;

    /* renamed from: g */
    public final float f13483g;

    /* renamed from: h */
    public final float f13484h;

    /* renamed from: i */
    public final float f13485i;

    public C7041j(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f13477a = f;
        this.f13478b = f4;
        this.f13479c = f7;
        this.f13480d = f2;
        this.f13481e = f5;
        this.f13482f = f8;
        this.f13483g = f3;
        this.f13484h = f6;
        this.f13485i = f9;
    }

    /* renamed from: b */
    public static C7041j m20876b(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        return m20878d(f9, f10, f11, f12, f13, f14, f15, f16).mo32572e(m20877c(f, f2, f3, f4, f5, f6, f7, f8));
    }

    /* renamed from: c */
    public static C7041j m20877c(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        return m20878d(f, f2, f3, f4, f5, f6, f7, f8).mo32571a();
    }

    /* renamed from: d */
    public static C7041j m20878d(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9 = ((f - f3) + f5) - f7;
        float f10 = ((f2 - f4) + f6) - f8;
        if (f9 == 0.0f && f10 == 0.0f) {
            return new C7041j(f3 - f, f5 - f3, f, f4 - f2, f6 - f4, f2, 0.0f, 0.0f, 1.0f);
        }
        float f11 = f3 - f5;
        float f12 = f7 - f5;
        float f13 = f4 - f6;
        float f14 = f8 - f6;
        float f15 = (f11 * f14) - (f12 * f13);
        float f16 = ((f14 * f9) - (f12 * f10)) / f15;
        float f17 = ((f11 * f10) - (f9 * f13)) / f15;
        return new C7041j((f16 * f3) + (f3 - f), (f17 * f7) + (f7 - f), f, (f4 - f2) + (f16 * f4), (f8 - f2) + (f17 * f8), f2, f16, f17, 1.0f);
    }

    /* renamed from: a */
    public C7041j mo32571a() {
        float f = this.f13481e;
        float f2 = this.f13485i;
        float f3 = this.f13482f;
        float f4 = this.f13484h;
        float f5 = (f * f2) - (f3 * f4);
        float f6 = this.f13483g;
        float f7 = this.f13480d;
        float f8 = (f3 * f6) - (f7 * f2);
        float f9 = (f7 * f4) - (f * f6);
        float f10 = this.f13479c;
        float f11 = this.f13478b;
        float f12 = (f10 * f4) - (f11 * f2);
        float f13 = this.f13477a;
        return new C7041j(f5, f8, f9, f12, (f2 * f13) - (f10 * f6), (f6 * f11) - (f4 * f13), (f11 * f3) - (f10 * f), (f10 * f7) - (f3 * f13), (f13 * f) - (f11 * f7));
    }

    /* renamed from: e */
    public C7041j mo32572e(C7041j jVar) {
        C7041j jVar2 = jVar;
        float f = this.f13477a;
        float f2 = jVar2.f13477a;
        float f3 = this.f13480d;
        float f4 = jVar2.f13478b;
        float f5 = this.f13483g;
        float f6 = jVar2.f13479c;
        float f7 = (f * f2) + (f3 * f4) + (f5 * f6);
        float f8 = jVar2.f13480d;
        float f9 = jVar2.f13481e;
        float f10 = jVar2.f13482f;
        float f11 = (f * f8) + (f3 * f9) + (f5 * f10);
        float f12 = jVar2.f13483g;
        float f13 = jVar2.f13484h;
        float f14 = jVar2.f13485i;
        float f15 = (f * f12) + (f3 * f13) + (f5 * f14);
        float f16 = this.f13478b;
        float f17 = f15;
        float f18 = this.f13481e;
        float f19 = f11;
        float f20 = this.f13484h;
        float f21 = (f16 * f2) + (f18 * f4) + (f20 * f6);
        float f22 = (f20 * f14) + (f16 * f12) + (f18 * f13);
        float f23 = this.f13479c;
        float f24 = this.f13482f;
        float f25 = (f2 * f23) + (f4 * f24);
        float f26 = this.f13485i;
        float f27 = (f23 * f12) + (f24 * f13) + (f26 * f14);
        return new C7041j(f7, f19, f17, f21, (f16 * f8) + (f18 * f9) + (f20 * f10), f22, (f6 * f26) + f25, (f8 * f23) + (f9 * f24) + (f10 * f26), f27);
    }

    /* renamed from: f */
    public void mo32573f(float[] fArr) {
        float[] fArr2 = fArr;
        int length = fArr2.length;
        float f = this.f13477a;
        float f2 = this.f13478b;
        float f3 = this.f13479c;
        float f4 = this.f13480d;
        float f5 = this.f13481e;
        float f6 = this.f13482f;
        float f7 = this.f13483g;
        float f8 = this.f13484h;
        float f9 = this.f13485i;
        for (int i = 0; i < length; i += 2) {
            float f10 = fArr2[i];
            int i2 = i + 1;
            float f11 = fArr2[i2];
            float f12 = (f3 * f10) + (f6 * f11) + f9;
            fArr2[i] = (((f * f10) + (f4 * f11)) + f7) / f12;
            fArr2[i2] = (((f10 * f2) + (f11 * f5)) + f8) / f12;
        }
    }
}
