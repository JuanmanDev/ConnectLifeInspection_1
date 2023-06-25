package p040c.p200q.p201a.p264c.p276d.p277g.p278l;

import androidx.annotation.Nullable;
import androidx.core.app.Person;
import com.google.android.gms.common.Feature;
import p040c.p200q.p201a.p264c.p276d.p281j.C3487m;

/* renamed from: c.q.a.c.d.g.l.g0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C3379g0 {

    /* renamed from: a */
    public final C3362b<?> f6294a;

    /* renamed from: b */
    public final Feature f6295b;

    public /* synthetic */ C3379g0(C3362b bVar, Feature feature, C3376f0 f0Var) {
        this.f6294a = bVar;
        this.f6295b = feature;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj != null && (obj instanceof C3379g0)) {
            C3379g0 g0Var = (C3379g0) obj;
            if (!C3487m.m8886a(this.f6294a, g0Var.f6294a) || !C3487m.m8886a(this.f6295b, g0Var.f6295b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C3487m.m8887b(this.f6294a, this.f6295b);
    }

    public final String toString() {
        C3487m.C3488a c = C3487m.m8888c(this);
        c.mo20747a(Person.KEY_KEY, this.f6294a);
        c.mo20747a("feature", this.f6295b);
        return c.toString();
    }
}
