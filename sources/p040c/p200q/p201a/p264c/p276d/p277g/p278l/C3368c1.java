package p040c.p200q.p201a.p264c.p276d.p277g.p278l;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import p040c.p200q.p201a.p264c.p276d.p277g.C3334a;
import p040c.p200q.p201a.p264c.p276d.p277g.C3356i;
import p040c.p200q.p201a.p264c.p276d.p277g.p278l.C3369d;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* renamed from: c.q.a.c.d.g.l.c1 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C3368c1<A extends C3369d<? extends C3356i, C3334a.C3336b>> extends C3377f1 {

    /* renamed from: b */
    public final A f6252b;

    public C3368c1(int i, A a) {
        super(i);
        C3495o.m8909k(a, "Null methods are not runnable.");
        this.f6252b = (C3369d) a;
    }

    /* renamed from: a */
    public final void mo20483a(@NonNull Status status) {
        try {
            this.f6252b.mo20490p(status);
        } catch (IllegalStateException unused) {
        }
    }

    /* renamed from: b */
    public final void mo20484b(@NonNull Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 2 + String.valueOf(localizedMessage).length());
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        try {
            this.f6252b.mo20490p(new Status(10, sb.toString()));
        } catch (IllegalStateException unused) {
        }
    }

    /* renamed from: c */
    public final void mo20485c(C3373e0<?> e0Var) {
        try {
            this.f6252b.mo20488n(e0Var.mo20526v());
        } catch (RuntimeException e) {
            mo20484b(e);
        }
    }

    /* renamed from: d */
    public final void mo20486d(@NonNull C3417u uVar, boolean z) {
        uVar.mo20610c(this.f6252b, z);
    }
}
