package p040c.p531f0.p532a.p534d;

/* renamed from: c.f0.a.d.b */
/* compiled from: ExifInfo */
public class C8832b {

    /* renamed from: a */
    public int f17158a;

    /* renamed from: b */
    public int f17159b;

    /* renamed from: c */
    public int f17160c;

    public C8832b(int i, int i2, int i3) {
        this.f17158a = i;
        this.f17159b = i2;
        this.f17160c = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8832b.class != obj.getClass()) {
            return false;
        }
        C8832b bVar = (C8832b) obj;
        if (this.f17158a != bVar.f17158a || this.f17159b != bVar.f17159b) {
            return false;
        }
        if (this.f17160c == bVar.f17160c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f17158a * 31) + this.f17159b) * 31) + this.f17160c;
    }
}
