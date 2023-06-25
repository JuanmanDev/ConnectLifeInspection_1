package p040c.p200q.p406e.p426q.p428c;

import p040c.p200q.p406e.C7023i;

/* renamed from: c.q.e.q.c.a */
/* compiled from: AlignmentPattern */
public final class C7153a extends C7023i {

    /* renamed from: c */
    public final float f13764c;

    public C7153a(float f, float f2, float f3) {
        super(f, f2);
        this.f13764c = f3;
    }

    /* renamed from: f */
    public boolean mo32876f(float f, float f2, float f3) {
        if (Math.abs(f2 - mo32487d()) > f || Math.abs(f3 - mo32486c()) > f) {
            return false;
        }
        float abs = Math.abs(f - this.f13764c);
        if (abs <= 1.0f || abs <= this.f13764c) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public C7153a mo32877g(float f, float f2, float f3) {
        return new C7153a((mo32486c() + f2) / 2.0f, (mo32487d() + f) / 2.0f, (this.f13764c + f3) / 2.0f);
    }
}
