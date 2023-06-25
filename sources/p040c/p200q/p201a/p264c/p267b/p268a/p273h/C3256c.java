package p040c.p200q.p201a.p264c.p267b.p268a.p273h;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import p040c.p200q.p201a.p264c.p276d.p277g.C3356i;

/* renamed from: c.q.a.c.b.a.h.c */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public class C3256c implements C3356i {

    /* renamed from: e */
    public Status f6118e;
    @Nullable

    /* renamed from: l */
    public GoogleSignInAccount f6119l;

    public C3256c(@Nullable GoogleSignInAccount googleSignInAccount, @NonNull Status status) {
        this.f6119l = googleSignInAccount;
        this.f6118e = status;
    }

    @NonNull
    /* renamed from: F */
    public Status mo20282F() {
        return this.f6118e;
    }

    @Nullable
    /* renamed from: a */
    public GoogleSignInAccount mo20283a() {
        return this.f6119l;
    }
}
