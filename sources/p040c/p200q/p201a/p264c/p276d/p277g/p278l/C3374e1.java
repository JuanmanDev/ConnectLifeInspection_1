package p040c.p200q.p201a.p264c.p276d.p277g.p278l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import p040c.p200q.p201a.p264c.p347m.C5773k;

/* renamed from: c.q.a.c.d.g.l.e1 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C3374e1 extends C3426y0<Boolean> {

    /* renamed from: c */
    public final C3384i<?> f6270c;

    public C3374e1(C3384i<?> iVar, C5773k<Boolean> kVar) {
        super(4, kVar);
        this.f6270c = iVar;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo20486d(@NonNull C3417u uVar, boolean z) {
    }

    /* renamed from: f */
    public final boolean mo20492f(C3373e0<?> e0Var) {
        C3412r0 r0Var = e0Var.mo20527x().get(this.f6270c);
        if (r0Var == null) {
            return false;
        }
        r0Var.f6361a.mo20591d();
        throw null;
    }

    @Nullable
    /* renamed from: g */
    public final Feature[] mo20493g(C3373e0<?> e0Var) {
        C3412r0 r0Var = e0Var.mo20527x().get(this.f6270c);
        if (r0Var == null) {
            return null;
        }
        return r0Var.f6361a.mo20589b();
    }

    /* renamed from: h */
    public final void mo20528h(C3373e0<?> e0Var) {
        C3412r0 remove = e0Var.mo20527x().remove(this.f6270c);
        if (remove != null) {
            remove.f6362b.mo20607a(e0Var.mo20526v(), this.f6388b);
            remove.f6361a.mo20588a();
            return;
        }
        this.f6388b.mo28863e(Boolean.FALSE);
    }
}
