package p040c.p200q.p201a.p219b.p239i0;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.identity.auth.map.device.token.MAPCookie;

/* renamed from: c.q.a.b.i0.d */
/* compiled from: StreamKey */
public final class C2848d implements Comparable<C2848d> {

    /* renamed from: e */
    public final int f4457e;

    /* renamed from: l */
    public final int f4458l;

    /* renamed from: m */
    public final int f4459m;

    public C2848d(int i, int i2, int i3) {
        this.f4457e = i;
        this.f4458l = i2;
        this.f4459m = i3;
    }

    /* renamed from: c */
    public int compareTo(@NonNull C2848d dVar) {
        int i = this.f4457e - dVar.f4457e;
        if (i != 0) {
            return i;
        }
        int i2 = this.f4458l - dVar.f4458l;
        return i2 == 0 ? this.f4459m - dVar.f4459m : i2;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2848d.class != obj.getClass()) {
            return false;
        }
        C2848d dVar = (C2848d) obj;
        if (this.f4457e == dVar.f4457e && this.f4458l == dVar.f4458l && this.f4459m == dVar.f4459m) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f4457e * 31) + this.f4458l) * 31) + this.f4459m;
    }

    public String toString() {
        return this.f4457e + MAPCookie.DOT + this.f4458l + MAPCookie.DOT + this.f4459m;
    }
}
