package p040c.p200q.p201a.p264c.p276d.p281j;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.NonNull;
import p040c.p200q.p201a.p264c.p294g.p300f.C3653k;

/* renamed from: c.q.a.c.d.j.i */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public interface C3474i extends IInterface {

    /* renamed from: c.q.a.c.d.j.i$a */
    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public static abstract class C3475a extends C3653k implements C3474i {
        @NonNull
        /* renamed from: e */
        public static C3474i m8877e(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof C3474i ? (C3474i) queryLocalInterface : new C3524v1(iBinder);
        }
    }

    @NonNull
    /* renamed from: a */
    Account mo20735a();
}
