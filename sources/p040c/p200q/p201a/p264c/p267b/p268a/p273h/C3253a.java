package p040c.p200q.p201a.p264c.p267b.p268a.p273h;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import p040c.p200q.p201a.p264c.p267b.p268a.p273h.p274e.C3264g;
import p040c.p200q.p201a.p264c.p267b.p268a.p273h.p274e.C3271n;
import p040c.p200q.p201a.p264c.p276d.p281j.C3447b;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p347m.C5771j;
import p040c.p200q.p201a.p264c.p347m.C5777m;

/* renamed from: c.q.a.c.b.a.h.a */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C3253a {
    /* renamed from: a */
    public static C3254b m8295a(@NonNull Context context, @NonNull GoogleSignInOptions googleSignInOptions) {
        C3495o.m8908j(googleSignInOptions);
        return new C3254b(context, googleSignInOptions);
    }

    @Nullable
    /* renamed from: b */
    public static GoogleSignInAccount m8296b(Context context) {
        return C3271n.m8342c(context).mo20311e();
    }

    /* renamed from: c */
    public static C5771j<GoogleSignInAccount> m8297c(@Nullable Intent intent) {
        C3256c a = C3264g.m8327a(intent);
        if (a == null) {
            return C5777m.m16413e(C3447b.m8741a(Status.f8175r));
        }
        GoogleSignInAccount a2 = a.mo20283a();
        if (!a.mo20282F().mo24536U() || a2 == null) {
            return C5777m.m16413e(C3447b.m8741a(a.mo20282F()));
        }
        return C5777m.m16414f(a2);
    }
}
