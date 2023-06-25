package p040c.p200q.p201a.p264c.p267b.p268a.p273h.p274e;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import p040c.p200q.p201a.p264c.p294g.p296b.C3614d;
import p040c.p200q.p201a.p264c.p294g.p296b.C3615e;

/* renamed from: c.q.a.c.b.a.h.e.t */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C3277t extends C3614d implements C3274q {
    public C3277t(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    /* renamed from: Q */
    public final void mo20313Q(C3272o oVar, GoogleSignInOptions googleSignInOptions) {
        Parcel d = mo20882d();
        C3615e.m9160b(d, oVar);
        C3615e.m9161c(d, googleSignInOptions);
        mo20883e(103, d);
    }

    /* renamed from: U */
    public final void mo20314U(C3272o oVar, GoogleSignInOptions googleSignInOptions) {
        Parcel d = mo20882d();
        C3615e.m9160b(d, oVar);
        C3615e.m9161c(d, googleSignInOptions);
        mo20883e(102, d);
    }
}
