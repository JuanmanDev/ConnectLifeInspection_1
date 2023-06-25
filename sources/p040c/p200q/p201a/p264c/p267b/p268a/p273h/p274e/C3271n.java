package p040c.p200q.p201a.p264c.p267b.p268a.p273h.p274e;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* renamed from: c.q.a.c.b.a.h.e.n */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C3271n {
    @Nullable

    /* renamed from: d */
    public static C3271n f6133d;

    /* renamed from: a */
    public C3259b f6134a;
    @Nullable

    /* renamed from: b */
    public GoogleSignInAccount f6135b;
    @Nullable

    /* renamed from: c */
    public GoogleSignInOptions f6136c = this.f6134a.mo20289d();

    public C3271n(Context context) {
        C3259b b = C3259b.m8309b(context);
        this.f6134a = b;
        this.f6135b = b.mo20288c();
    }

    /* renamed from: c */
    public static synchronized C3271n m8342c(@NonNull Context context) {
        C3271n d;
        synchronized (C3271n.class) {
            d = m8343d(context.getApplicationContext());
        }
        return d;
    }

    /* renamed from: d */
    public static synchronized C3271n m8343d(Context context) {
        synchronized (C3271n.class) {
            if (f6133d != null) {
                C3271n nVar = f6133d;
                return nVar;
            }
            C3271n nVar2 = new C3271n(context);
            f6133d = nVar2;
            return nVar2;
        }
    }

    /* renamed from: a */
    public final synchronized void mo20309a() {
        this.f6134a.mo20287a();
        this.f6135b = null;
    }

    /* renamed from: b */
    public final synchronized void mo20310b(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.f6134a.mo20291f(googleSignInAccount, googleSignInOptions);
        this.f6135b = googleSignInAccount;
        this.f6136c = googleSignInOptions;
    }

    @Nullable
    /* renamed from: e */
    public final synchronized GoogleSignInAccount mo20311e() {
        return this.f6135b;
    }
}
