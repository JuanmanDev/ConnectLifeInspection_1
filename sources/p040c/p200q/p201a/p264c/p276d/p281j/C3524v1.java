package p040c.p200q.p201a.p264c.p276d.p281j;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import p040c.p200q.p201a.p264c.p294g.p300f.C3643a;
import p040c.p200q.p201a.p264c.p294g.p300f.C3654l;

/* renamed from: c.q.a.c.d.j.v1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C3524v1 extends C3643a implements C3474i {
    public C3524v1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    /* renamed from: a */
    public final Account mo20735a() {
        Parcel d = mo20908d(2, mo20909e());
        Account account = (Account) C3654l.m9193a(d, Account.CREATOR);
        d.recycle();
        return account;
    }
}
