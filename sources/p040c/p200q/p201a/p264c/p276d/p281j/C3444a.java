package p040c.p200q.p201a.p264c.p276d.p281j;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p040c.p200q.p201a.p264c.p276d.p281j.C3474i;

/* renamed from: c.q.a.c.d.j.a */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class C3444a extends C3474i.C3475a {
    @Nullable
    /* renamed from: g */
    public static Account m8740g(@NonNull C3474i iVar) {
        Account account = null;
        if (iVar != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                account = iVar.mo20735a();
            } catch (RemoteException unused) {
            } catch (Throwable th) {
                Binder.restoreCallingIdentity(clearCallingIdentity);
                throw th;
            }
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
        return account;
    }
}
