package p040c.p200q.p201a.p264c.p276d.p277g.p278l;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import p040c.p200q.p201a.p264c.p276d.p277g.C3334a;
import p040c.p200q.p201a.p264c.p347m.C5773k;

/* renamed from: c.q.a.c.d.g.l.d1 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C3371d1<ResultT> extends C3394l0 {

    /* renamed from: b */
    public final C3408q<C3334a.C3336b, ResultT> f6254b;

    /* renamed from: c */
    public final C5773k<ResultT> f6255c;

    /* renamed from: d */
    public final C3402o f6256d;

    public C3371d1(int i, C3408q<C3334a.C3336b, ResultT> qVar, C5773k<ResultT> kVar, C3402o oVar) {
        super(i);
        this.f6255c = kVar;
        this.f6254b = qVar;
        this.f6256d = oVar;
        if (i == 2 && qVar.mo20600c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    /* renamed from: a */
    public final void mo20483a(@NonNull Status status) {
        this.f6255c.mo28862d(this.f6256d.mo20461a(status));
    }

    /* renamed from: b */
    public final void mo20484b(@NonNull Exception exc) {
        this.f6255c.mo28862d(exc);
    }

    /* renamed from: c */
    public final void mo20485c(C3373e0<?> e0Var) {
        try {
            this.f6254b.mo20599b(e0Var.mo20526v(), this.f6255c);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            mo20483a(C3377f1.m8617e(e2));
        } catch (RuntimeException e3) {
            this.f6255c.mo28862d(e3);
        }
    }

    /* renamed from: d */
    public final void mo20486d(@NonNull C3417u uVar, boolean z) {
        uVar.mo20611d(this.f6255c, z);
    }

    /* renamed from: f */
    public final boolean mo20492f(C3373e0<?> e0Var) {
        return this.f6254b.mo20600c();
    }

    @Nullable
    /* renamed from: g */
    public final Feature[] mo20493g(C3373e0<?> e0Var) {
        return this.f6254b.mo20602e();
    }
}
