package p040c.p142n.p143a.p144a;

/* renamed from: c.n.a.a.c */
/* compiled from: JsonStreamContext */
public abstract class C2063c {

    /* renamed from: a */
    public int f1917a;

    /* renamed from: b */
    public int f1918b;

    /* renamed from: a */
    public final int mo16695a() {
        int i = this.f1918b;
        if (i < 0) {
            return 0;
        }
        return i;
    }

    /* renamed from: b */
    public final int mo16696b() {
        return this.f1918b + 1;
    }

    /* renamed from: c */
    public final String mo16697c() {
        int i = this.f1917a;
        if (i == 0) {
            return "ROOT";
        }
        if (i != 1) {
            return i != 2 ? "?" : "OBJECT";
        }
        return "ARRAY";
    }

    /* renamed from: d */
    public final boolean mo16698d() {
        return this.f1917a == 1;
    }

    /* renamed from: e */
    public final boolean mo16699e() {
        return this.f1917a == 2;
    }
}
