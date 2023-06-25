package p040c.p200q.p201a.p264c.p276d.p277g.p278l;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;

/* renamed from: c.q.a.c.d.g.l.f1 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class C3377f1 {

    /* renamed from: a */
    public final int f6292a;

    public C3377f1(int i) {
        this.f6292a = i;
    }

    /* renamed from: e */
    public static /* bridge */ /* synthetic */ Status m8617e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    /* renamed from: a */
    public abstract void mo20483a(@NonNull Status status);

    /* renamed from: b */
    public abstract void mo20484b(@NonNull Exception exc);

    /* renamed from: c */
    public abstract void mo20485c(C3373e0<?> e0Var);

    /* renamed from: d */
    public abstract void mo20486d(@NonNull C3417u uVar, boolean z);
}
