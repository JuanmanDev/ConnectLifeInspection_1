package p040c.p200q.p363c.p367l.p368h;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.p527firebaseauthapi.zzaay;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FacebookAuthCredential;
import com.google.firebase.auth.GithubAuthCredential;
import com.google.firebase.auth.GoogleAuthCredential;
import com.google.firebase.auth.PlayGamesAuthCredential;
import com.google.firebase.auth.TwitterAuthCredential;
import com.google.firebase.auth.zze;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* renamed from: c.q.c.l.h.a0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C6370a0 {
    @NonNull
    /* renamed from: a */
    public static zzaay m17892a(AuthCredential authCredential, @Nullable String str) {
        C3495o.m8908j(authCredential);
        if (GoogleAuthCredential.class.isAssignableFrom(authCredential.getClass())) {
            return GoogleAuthCredential.m22659R((GoogleAuthCredential) authCredential, str);
        }
        if (FacebookAuthCredential.class.isAssignableFrom(authCredential.getClass())) {
            return FacebookAuthCredential.m22616R((FacebookAuthCredential) authCredential, str);
        }
        if (TwitterAuthCredential.class.isAssignableFrom(authCredential.getClass())) {
            return TwitterAuthCredential.m22681R((TwitterAuthCredential) authCredential, str);
        }
        if (GithubAuthCredential.class.isAssignableFrom(authCredential.getClass())) {
            return GithubAuthCredential.m22656R((GithubAuthCredential) authCredential, str);
        }
        if (PlayGamesAuthCredential.class.isAssignableFrom(authCredential.getClass())) {
            return PlayGamesAuthCredential.m22678R((PlayGamesAuthCredential) authCredential, str);
        }
        if (zze.class.isAssignableFrom(authCredential.getClass())) {
            return zze.m22734T((zze) authCredential, str);
        }
        throw new IllegalArgumentException("Unsupported credential type.");
    }
}
