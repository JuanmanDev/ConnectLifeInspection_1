package p040c.p200q.p201a.p264c.p267b.p268a.p273h.p274e;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;
import p040c.p200q.p201a.p264c.p267b.p268a.p273h.C3256c;
import p040c.p200q.p201a.p264c.p276d.p277g.C3348d;
import p040c.p200q.p201a.p264c.p276d.p277g.C3352f;
import p040c.p200q.p201a.p264c.p276d.p277g.C3354g;
import p040c.p200q.p201a.p264c.p276d.p277g.p278l.C3375f;
import p040c.p200q.p201a.p264c.p276d.p284k.C3537a;

/* renamed from: c.q.a.c.b.a.h.e.g */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C3264g {

    /* renamed from: a */
    public static C3537a f6130a = new C3537a("GoogleSignInCommon", new String[0]);

    @Nullable
    /* renamed from: a */
    public static C3256c m8327a(@Nullable Intent intent) {
        if (intent == null) {
            return new C3256c((GoogleSignInAccount) null, Status.f8175r);
        }
        Status status = (Status) intent.getParcelableExtra("googleSignInStatus");
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
        if (googleSignInAccount != null) {
            return new C3256c(googleSignInAccount, Status.f8173p);
        }
        if (status == null) {
            status = Status.f8175r;
        }
        return new C3256c((GoogleSignInAccount) null, status);
    }

    /* renamed from: b */
    public static Intent m8328b(Context context, GoogleSignInOptions googleSignInOptions) {
        f6130a.mo20805a("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    /* renamed from: c */
    public static C3352f<Status> m8329c(C3348d dVar, Context context, boolean z) {
        f6130a.mo20805a("Signing out", new Object[0]);
        m8330d(context);
        if (z) {
            return C3354g.m8506b(Status.f8173p, dVar);
        }
        return dVar.mo20450a(new C3265h(dVar));
    }

    /* renamed from: d */
    public static void m8330d(Context context) {
        C3271n.m8342c(context).mo20309a();
        Iterator<C3348d> it = C3348d.m8496b().iterator();
        if (!it.hasNext()) {
            C3375f.m8587a();
        } else {
            it.next().mo20453e();
            throw null;
        }
    }

    /* renamed from: e */
    public static Intent m8331e(Context context, GoogleSignInOptions googleSignInOptions) {
        f6130a.mo20805a("getFallbackSignInIntent()", new Object[0]);
        Intent b = m8328b(context, googleSignInOptions);
        b.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
        return b;
    }

    /* renamed from: f */
    public static C3352f<Status> m8332f(C3348d dVar, Context context, boolean z) {
        f6130a.mo20805a("Revoking access", new Object[0]);
        String e = C3259b.m8309b(context).mo20290e();
        m8330d(context);
        if (z) {
            return C3262e.m8321a(e);
        }
        return dVar.mo20450a(new C3266i(dVar));
    }

    /* renamed from: g */
    public static Intent m8333g(Context context, GoogleSignInOptions googleSignInOptions) {
        f6130a.mo20805a("getNoImplementationSignInIntent()", new Object[0]);
        Intent b = m8328b(context, googleSignInOptions);
        b.setAction("com.google.android.gms.auth.NO_IMPL");
        return b;
    }
}
