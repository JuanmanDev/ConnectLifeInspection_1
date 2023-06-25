package p040c.p200q.p201a.p219b.p221c0;

import androidx.annotation.Nullable;

/* renamed from: c.q.a.b.c0.o */
/* compiled from: AuxEffectInfo */
public final class C2614o {

    /* renamed from: a */
    public final int f3168a;

    /* renamed from: b */
    public final float f3169b;

    public C2614o(int i, float f) {
        this.f3168a = i;
        this.f3169b = f;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2614o.class != obj.getClass()) {
            return false;
        }
        C2614o oVar = (C2614o) obj;
        if (this.f3168a == oVar.f3168a && Float.compare(oVar.f3169b, this.f3169b) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f3168a) * 31) + Float.floatToIntBits(this.f3169b);
    }
}
