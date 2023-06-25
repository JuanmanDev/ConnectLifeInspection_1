package p040c.p200q.p406e.p422p.p423d;

/* renamed from: c.q.e.p.d.d */
/* compiled from: Codeword */
public final class C7120d {

    /* renamed from: a */
    public final int f13690a;

    /* renamed from: b */
    public final int f13691b;

    /* renamed from: c */
    public final int f13692c;

    /* renamed from: d */
    public final int f13693d;

    /* renamed from: e */
    public int f13694e = -1;

    public C7120d(int i, int i2, int i3, int i4) {
        this.f13690a = i;
        this.f13691b = i2;
        this.f13692c = i3;
        this.f13693d = i4;
    }

    /* renamed from: a */
    public int mo32778a() {
        return this.f13692c;
    }

    /* renamed from: b */
    public int mo32779b() {
        return this.f13691b;
    }

    /* renamed from: c */
    public int mo32780c() {
        return this.f13694e;
    }

    /* renamed from: d */
    public int mo32781d() {
        return this.f13690a;
    }

    /* renamed from: e */
    public int mo32782e() {
        return this.f13693d;
    }

    /* renamed from: f */
    public int mo32783f() {
        return this.f13691b - this.f13690a;
    }

    /* renamed from: g */
    public boolean mo32784g() {
        return mo32785h(this.f13694e);
    }

    /* renamed from: h */
    public boolean mo32785h(int i) {
        return i != -1 && this.f13692c == (i % 3) * 3;
    }

    /* renamed from: i */
    public void mo32786i(int i) {
        this.f13694e = i;
    }

    /* renamed from: j */
    public void mo32787j() {
        this.f13694e = ((this.f13693d / 30) * 3) + (this.f13692c / 3);
    }

    public String toString() {
        return this.f13694e + "|" + this.f13693d;
    }
}
