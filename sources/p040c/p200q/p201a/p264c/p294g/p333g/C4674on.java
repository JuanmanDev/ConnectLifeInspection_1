package p040c.p200q.p201a.p264c.p294g.p333g;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p527firebaseauthapi.zztk;
import com.google.android.gms.internal.p527firebaseauthapi.zztm;
import com.google.android.gms.internal.p527firebaseauthapi.zzzr;
import com.google.android.gms.internal.p527firebaseauthapi.zzzy;
import com.google.firebase.auth.PhoneAuthCredential;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p284k.C3537a;

/* renamed from: c.q.a.c.g.g.on */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class C4674on {

    /* renamed from: a */
    public final C4620mn f9525a;

    /* renamed from: b */
    public final C3537a f9526b;

    public C4674on(C4620mn mnVar, C3537a aVar) {
        C3495o.m8908j(mnVar);
        this.f9525a = mnVar;
        C3495o.m8908j(aVar);
        this.f9526b = aVar;
    }

    /* renamed from: a */
    public final void mo26480a(zztk zztk) {
        try {
            this.f9525a.mo26088f(zztk);
        } catch (RemoteException e) {
            this.f9526b.mo20806b("RemoteException when sending failure result with credential", e, new Object[0]);
        }
    }

    /* renamed from: b */
    public final void mo26481b(zztm zztm) {
        try {
            this.f9525a.mo26086d(zztm);
        } catch (RemoteException e) {
            this.f9526b.mo20806b("RemoteException when sending failure result for mfa", e, new Object[0]);
        }
    }

    /* renamed from: c */
    public final void mo26482c(Status status, PhoneAuthCredential phoneAuthCredential) {
        try {
            this.f9525a.mo26087e(status, phoneAuthCredential);
        } catch (RemoteException e) {
            this.f9526b.mo20806b("RemoteException when sending failure result.", e, new Object[0]);
        }
    }

    /* renamed from: d */
    public void mo26483d(Status status) {
        try {
            this.f9525a.mo26084b(status);
        } catch (RemoteException e) {
            this.f9526b.mo20806b("RemoteException when sending failure result.", e, new Object[0]);
        }
    }

    /* renamed from: e */
    public final void mo26484e(zzzy zzzy, zzzr zzzr) {
        try {
            this.f9525a.mo26083a(zzzy, zzzr);
        } catch (RemoteException e) {
            this.f9526b.mo20806b("RemoteException when sending get token and account info user response", e, new Object[0]);
        }
    }

    /* renamed from: f */
    public final void mo26485f(zzzy zzzy) {
        try {
            this.f9525a.mo26085c(zzzy);
        } catch (RemoteException e) {
            this.f9526b.mo20806b("RemoteException when sending token result.", e, new Object[0]);
        }
    }
}
