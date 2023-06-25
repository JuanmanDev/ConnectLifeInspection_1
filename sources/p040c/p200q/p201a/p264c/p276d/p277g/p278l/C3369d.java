package p040c.p200q.p201a.p264c.p276d.p277g.p278l;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import p040c.p200q.p201a.p264c.p276d.p277g.C3334a;
import p040c.p200q.p201a.p264c.p276d.p277g.C3334a.C3336b;
import p040c.p200q.p201a.p264c.p276d.p277g.C3348d;
import p040c.p200q.p201a.p264c.p276d.p277g.C3356i;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* renamed from: c.q.a.c.d.g.l.d */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class C3369d<R extends C3356i, A extends C3334a.C3336b> extends BasePendingResult<R> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3369d(@NonNull C3334a<?> aVar, @NonNull C3348d dVar) {
        super(dVar);
        C3495o.m8909k(dVar, "GoogleApiClient must not be null");
        C3495o.m8909k(aVar, "Api must not be null");
        aVar.mo20416b();
    }

    /* renamed from: l */
    public abstract void mo20306l(@NonNull A a);

    /* renamed from: m */
    public void mo20487m(@NonNull R r) {
    }

    /* renamed from: n */
    public final void mo20488n(@NonNull A a) {
        try {
            mo20306l(a);
        } catch (DeadObjectException e) {
            mo20489o(e);
            throw e;
        } catch (RemoteException e2) {
            mo20489o(e2);
        }
    }

    /* renamed from: o */
    public final void mo20489o(@NonNull RemoteException remoteException) {
        mo20490p(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }

    /* renamed from: p */
    public final void mo20490p(@NonNull Status status) {
        C3495o.m8900b(!status.mo24536U(), "Failed result must not be success");
        C3356i c = mo20305c(status);
        mo24546f(c);
        mo20487m(c);
    }
}
