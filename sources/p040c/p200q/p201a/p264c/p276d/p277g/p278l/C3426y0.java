package p040c.p200q.p201a.p264c.p276d.p277g.p278l;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import p040c.p200q.p201a.p264c.p347m.C5773k;

/* renamed from: c.q.a.c.d.g.l.y0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class C3426y0<T> extends C3394l0 {

    /* renamed from: b */
    public final C5773k<T> f6388b;

    public C3426y0(int i, C5773k<T> kVar) {
        super(i);
        this.f6388b = kVar;
    }

    /* renamed from: a */
    public final void mo20483a(@NonNull Status status) {
        this.f6388b.mo28862d(new ApiException(status));
    }

    /* renamed from: b */
    public final void mo20484b(@NonNull Exception exc) {
        this.f6388b.mo28862d(exc);
    }

    /* renamed from: c */
    public final void mo20485c(C3373e0<?> e0Var) {
        try {
            mo20528h(e0Var);
        } catch (DeadObjectException e) {
            mo20483a(C3377f1.m8617e(e));
            throw e;
        } catch (RemoteException e2) {
            mo20483a(C3377f1.m8617e(e2));
        } catch (RuntimeException e3) {
            this.f6388b.mo28862d(e3);
        }
    }

    /* renamed from: h */
    public abstract void mo20528h(C3373e0<?> e0Var);
}
