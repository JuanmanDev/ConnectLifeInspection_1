package p040c.p200q.p201a.p264c.p294g.p335i;

/* renamed from: c.q.a.c.g.i.a7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C4982a7 implements C5352y6 {

    /* renamed from: e */
    public volatile C5352y6 f9797e;

    /* renamed from: l */
    public volatile boolean f9798l;

    /* renamed from: m */
    public Object f9799m;

    public C4982a7(C5352y6 y6Var) {
        if (y6Var != null) {
            this.f9797e = y6Var;
            return;
        }
        throw null;
    }

    public final String toString() {
        Object obj = this.f9797e;
        StringBuilder sb = new StringBuilder();
        sb.append("Suppliers.memoize(");
        if (obj == null) {
            obj = "<supplier that returned " + this.f9799m + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public final Object zza() {
        if (!this.f9798l) {
            synchronized (this) {
                if (!this.f9798l) {
                    C5352y6 y6Var = this.f9797e;
                    y6Var.getClass();
                    Object zza = y6Var.zza();
                    this.f9799m = zza;
                    this.f9798l = true;
                    this.f9797e = null;
                    return zza;
                }
            }
        }
        return this.f9799m;
    }
}
