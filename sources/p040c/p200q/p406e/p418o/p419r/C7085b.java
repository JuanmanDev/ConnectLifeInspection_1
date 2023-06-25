package p040c.p200q.p406e.p418o.p419r;

/* renamed from: c.q.e.o.r.b */
/* compiled from: DataCharacter */
public class C7085b {

    /* renamed from: a */
    public final int f13613a;

    /* renamed from: b */
    public final int f13614b;

    public C7085b(int i, int i2) {
        this.f13613a = i;
        this.f13614b = i2;
    }

    /* renamed from: a */
    public final int mo32670a() {
        return this.f13614b;
    }

    /* renamed from: b */
    public final int mo32671b() {
        return this.f13613a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7085b)) {
            return false;
        }
        C7085b bVar = (C7085b) obj;
        if (this.f13613a == bVar.f13613a && this.f13614b == bVar.f13614b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13613a ^ this.f13614b;
    }

    public final String toString() {
        return this.f13613a + "(" + this.f13614b + ')';
    }
}
