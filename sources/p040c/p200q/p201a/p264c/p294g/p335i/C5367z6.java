package p040c.p200q.p201a.p264c.p294g.p335i;

import java.io.Serializable;

/* renamed from: c.q.a.c.g.i.z6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5367z6 implements Serializable, C5352y6 {

    /* renamed from: e */
    public final C5352y6 f10291e;

    /* renamed from: l */
    public volatile transient boolean f10292l;

    /* renamed from: m */
    public transient Object f10293m;

    public C5367z6(C5352y6 y6Var) {
        if (y6Var != null) {
            this.f10291e = y6Var;
            return;
        }
        throw null;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append("Suppliers.memoize(");
        if (this.f10292l) {
            obj = "<supplier that returned " + this.f10293m + ">";
        } else {
            obj = this.f10291e;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public final Object zza() {
        if (!this.f10292l) {
            synchronized (this) {
                if (!this.f10292l) {
                    Object zza = this.f10291e.zza();
                    this.f10293m = zza;
                    this.f10292l = true;
                    return zza;
                }
            }
        }
        return this.f10293m;
    }
}
