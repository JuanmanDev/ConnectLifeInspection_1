package p040c.p200q.p201a.p264c.p267b.p268a.p273h.p274e;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import p040c.p200q.p201a.p264c.p267b.p268a.p273h.C3253a;
import p040c.p200q.p201a.p264c.p267b.p268a.p273h.C3254b;
import p040c.p200q.p201a.p264c.p276d.p289n.C3565p;

/* renamed from: c.q.a.c.b.a.h.e.s */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C3276s extends C3273p {

    /* renamed from: e */
    public final Context f6137e;

    public C3276s(Context context) {
        this.f6137e = context;
    }

    /* renamed from: e */
    public final void mo20315e() {
        if (!C3565p.m9095a(this.f6137e, Binder.getCallingUid())) {
            int callingUid = Binder.getCallingUid();
            StringBuilder sb = new StringBuilder(52);
            sb.append("Calling UID ");
            sb.append(callingUid);
            sb.append(" is not Google Play services.");
            throw new SecurityException(sb.toString());
        }
    }

    /* renamed from: h */
    public final void mo20307h() {
        mo20315e();
        C3259b b = C3259b.m8309b(this.f6137e);
        GoogleSignInAccount c = b.mo20288c();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f8106u;
        if (c != null) {
            googleSignInOptions = b.mo20289d();
        }
        C3254b a = C3253a.m8295a(this.f6137e, googleSignInOptions);
        if (c != null) {
            a.mo20279q();
        } else {
            a.mo20280r();
        }
    }

    /* renamed from: i */
    public final void mo20308i() {
        mo20315e();
        C3271n.m8342c(this.f6137e).mo20309a();
    }
}
