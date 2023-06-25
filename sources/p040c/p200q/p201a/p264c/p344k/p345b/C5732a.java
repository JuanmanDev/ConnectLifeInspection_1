package p040c.p200q.p201a.p264c.p344k.p345b;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zai;
import com.google.android.gms.signin.internal.zak;
import p040c.p200q.p201a.p264c.p267b.p268a.p273h.p274e.C3259b;
import p040c.p200q.p201a.p264c.p276d.C3330e;
import p040c.p200q.p201a.p264c.p276d.p277g.C3348d;
import p040c.p200q.p201a.p264c.p276d.p281j.C3453d;
import p040c.p200q.p201a.p264c.p276d.p281j.C3461e;
import p040c.p200q.p201a.p264c.p276d.p281j.C3465f;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p344k.C5745g;

/* renamed from: c.q.a.c.k.b.a */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class C5732a extends C3465f<C5737f> implements C5745g {

    /* renamed from: P */
    public static final /* synthetic */ int f11214P = 0;

    /* renamed from: L */
    public final boolean f11215L = true;

    /* renamed from: M */
    public final C3461e f11216M;

    /* renamed from: N */
    public final Bundle f11217N;
    @Nullable

    /* renamed from: O */
    public final Integer f11218O;

    public C5732a(@NonNull Context context, @NonNull Looper looper, boolean z, @NonNull C3461e eVar, @NonNull Bundle bundle, @NonNull C3348d.C3349a aVar, @NonNull C3348d.C3350b bVar) {
        super(context, looper, 44, eVar, aVar, bVar);
        this.f11216M = eVar;
        this.f11217N = bundle;
        this.f11218O = eVar.mo20704i();
    }

    @NonNull
    /* renamed from: k0 */
    public static Bundle m16331k0(@NonNull C3461e eVar) {
        eVar.mo20703h();
        Integer i = eVar.mo20704i();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", eVar.mo20696a());
        if (i != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", i.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", (String) null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", (String) null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", (String) null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    @NonNull
    /* renamed from: C */
    public final String mo20300C() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @NonNull
    /* renamed from: D */
    public final String mo20301D() {
        return "com.google.android.gms.signin.service.START";
    }

    /* renamed from: i */
    public final void mo28805i(C5736e eVar) {
        C3495o.m8909k(eVar, "Expecting a valid ISignInCallbacks");
        try {
            Account c = this.f11216M.mo20698c();
            GoogleSignInAccount c2 = "<<default account>>".equals(c.name) ? C3259b.m8309b(mo20684w()).mo20288c() : null;
            Integer num = this.f11218O;
            C3495o.m8908j(num);
            ((C5737f) mo20648B()).mo28809v(new zai(1, new zat(c, num.intValue(), c2)), eVar);
        } catch (RemoteException e) {
            try {
                eVar.mo20619A(new zak(1, new ConnectionResult(8, (PendingIntent) null), (zav) null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    /* renamed from: j */
    public final int mo20302j() {
        return C3330e.f6210a;
    }

    /* renamed from: m */
    public final boolean mo20676m() {
        return this.f11215L;
    }

    /* renamed from: n */
    public final void mo28806n() {
        mo20669f(new C3453d.C3457d());
    }

    @NonNull
    /* renamed from: q */
    public final /* synthetic */ IInterface mo20304q(@NonNull IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof C5737f ? (C5737f) queryLocalInterface : new C5737f(iBinder);
    }

    @NonNull
    /* renamed from: y */
    public final Bundle mo20686y() {
        if (!mo20684w().getPackageName().equals(this.f11216M.mo20701f())) {
            this.f11217N.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f11216M.mo20701f());
        }
        return this.f11217N;
    }
}
