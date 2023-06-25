package p040c.p200q.p201a.p264c.p276d.p277g.p278l;

import androidx.annotation.Nullable;

/* renamed from: c.q.a.c.d.g.l.i */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C3384i<L> {

    /* renamed from: a */
    public final L f6305a;

    /* renamed from: b */
    public final String f6306b;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3384i)) {
            return false;
        }
        C3384i iVar = (C3384i) obj;
        return this.f6305a == iVar.f6305a && this.f6306b.equals(iVar.f6306b);
    }

    public int hashCode() {
        return (System.identityHashCode(this.f6305a) * 31) + this.f6306b.hashCode();
    }
}
