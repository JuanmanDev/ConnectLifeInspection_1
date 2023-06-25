package p040c.p200q.p406e.p418o.p419r;

import p040c.p200q.p406e.C7023i;

/* renamed from: c.q.e.o.r.c */
/* compiled from: FinderPattern */
public final class C7086c {

    /* renamed from: a */
    public final int f13615a;

    /* renamed from: b */
    public final int[] f13616b;

    /* renamed from: c */
    public final C7023i[] f13617c;

    public C7086c(int i, int[] iArr, int i2, int i3, int i4) {
        this.f13615a = i;
        this.f13616b = iArr;
        float f = (float) i4;
        this.f13617c = new C7023i[]{new C7023i((float) i2, f), new C7023i((float) i3, f)};
    }

    /* renamed from: a */
    public C7023i[] mo32675a() {
        return this.f13617c;
    }

    /* renamed from: b */
    public int[] mo32676b() {
        return this.f13616b;
    }

    /* renamed from: c */
    public int mo32677c() {
        return this.f13615a;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C7086c) && this.f13615a == ((C7086c) obj).f13615a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f13615a;
    }
}
