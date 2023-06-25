package p040c.p200q.p201a.p264c.p267b.p268a.p273h.p274e;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import p040c.p200q.p201a.p264c.p276d.C3330e;
import p040c.p200q.p201a.p264c.p276d.p277g.C3348d;
import p040c.p200q.p201a.p264c.p276d.p281j.C3461e;
import p040c.p200q.p201a.p264c.p276d.p281j.C3465f;
import p040c.p200q.p201a.p264c.p294g.p296b.C3612b;

/* renamed from: c.q.a.c.b.a.h.e.f */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C3263f extends C3465f<C3274q> {

    /* renamed from: L */
    public final GoogleSignInOptions f6129L;

    public C3263f(Context context, Looper looper, C3461e eVar, @Nullable GoogleSignInOptions googleSignInOptions, C3348d.C3349a aVar, C3348d.C3350b bVar) {
        super(context, looper, 91, eVar, aVar, bVar);
        GoogleSignInOptions.C4069a aVar2;
        if (googleSignInOptions != null) {
            aVar2 = new GoogleSignInOptions.C4069a(googleSignInOptions);
        } else {
            aVar2 = new GoogleSignInOptions.C4069a();
        }
        aVar2.mo24453i(C3612b.m9155a());
        if (!eVar.mo20699d().isEmpty()) {
            for (Scope f : eVar.mo20699d()) {
                aVar2.mo24450f(f, new Scope[0]);
            }
        }
        this.f6129L = aVar2.mo24445a();
    }

    /* renamed from: C */
    public final String mo20300C() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    /* renamed from: D */
    public final String mo20301D() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    /* renamed from: j */
    public final int mo20302j() {
        return C3330e.f6210a;
    }

    /* renamed from: k0 */
    public final GoogleSignInOptions mo20303k0() {
        return this.f6129L;
    }

    /* renamed from: q */
    public final /* synthetic */ IInterface mo20304q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        if (queryLocalInterface instanceof C3274q) {
            return (C3274q) queryLocalInterface;
        }
        return new C3277t(iBinder);
    }
}
