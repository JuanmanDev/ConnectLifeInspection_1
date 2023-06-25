package p040c.p200q.p201a.p219b.p224f0;

import androidx.annotation.Nullable;

/* renamed from: c.q.a.b.f0.p */
/* compiled from: SeekPoint */
public final class C2685p {

    /* renamed from: c */
    public static final C2685p f3448c = new C2685p(0, 0);

    /* renamed from: a */
    public final long f3449a;

    /* renamed from: b */
    public final long f3450b;

    public C2685p(long j, long j2) {
        this.f3449a = j;
        this.f3450b = j2;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2685p.class != obj.getClass()) {
            return false;
        }
        C2685p pVar = (C2685p) obj;
        if (this.f3449a == pVar.f3449a && this.f3450b == pVar.f3450b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f3449a) * 31) + ((int) this.f3450b);
    }

    public String toString() {
        return "[timeUs=" + this.f3449a + ", position=" + this.f3450b + "]";
    }
}
