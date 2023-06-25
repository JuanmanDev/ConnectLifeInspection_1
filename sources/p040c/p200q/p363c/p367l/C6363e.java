package p040c.p200q.p363c.p367l;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.p527firebaseauthapi.zzaay;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.zze;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p294g.p333g.C4324bo;
import p040c.p200q.p201a.p264c.p294g.p333g.C4352cp;

/* renamed from: c.q.c.l.e */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class C6363e extends C6357b {

    /* renamed from: a */
    public final Bundle f12033a;

    /* renamed from: c.q.c.l.e$a */
    /* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
    public static class C6364a {

        /* renamed from: a */
        public final FirebaseAuth f12034a;
        @VisibleForTesting

        /* renamed from: b */
        public final Bundle f12035b = new Bundle();

        /* renamed from: c */
        public final Bundle f12036c = new Bundle();

        public /* synthetic */ C6364a(String str, FirebaseAuth firebaseAuth, C6407l lVar) {
            this.f12034a = firebaseAuth;
            this.f12035b.putString("com.google.firebase.auth.KEY_API_KEY", firebaseAuth.mo37327b().mo30406o().mo30419b());
            this.f12035b.putString("com.google.firebase.auth.KEY_PROVIDER_ID", str);
            this.f12035b.putBundle("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS", this.f12036c);
            this.f12035b.putString("com.google.firebase.auth.internal.CLIENT_VERSION", C4324bo.m11745a().mo25834b());
            this.f12035b.putString("com.google.firebase.auth.KEY_TENANT_ID", this.f12034a.mo37330e());
            this.f12035b.putString("com.google.firebase.auth.KEY_FIREBASE_APP_NAME", this.f12034a.mo37327b().mo30405n());
        }

        @NonNull
        /* renamed from: a */
        public C6363e mo30453a() {
            return new C6363e(this.f12035b, (C6409n) null);
        }
    }

    /* renamed from: c.q.c.l.e$b */
    /* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
    public static class C6365b {

        /* renamed from: a */
        public final String f12037a;
        @Nullable

        /* renamed from: b */
        public String f12038b;
        @Nullable

        /* renamed from: c */
        public String f12039c;
        @Nullable

        /* renamed from: d */
        public String f12040d;

        public /* synthetic */ C6365b(String str, C6408m mVar) {
            this.f12037a = str;
        }

        @NonNull
        /* renamed from: a */
        public AuthCredential mo30454a() {
            String str = this.f12037a;
            String str2 = this.f12038b;
            String str3 = this.f12039c;
            String str4 = this.f12040d;
            Parcelable.Creator<zze> creator = zze.CREATOR;
            C3495o.m8905g(str, "Must specify a non-empty providerId");
            if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
                return new zze(str, str2, str3, (zzaay) null, (String) null, (String) null, str4);
            }
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
    }

    public /* synthetic */ C6363e(Bundle bundle, C6409n nVar) {
        this.f12033a = bundle;
    }

    @NonNull
    /* renamed from: a */
    public static C6364a m17883a(@NonNull String str) {
        return m17884b(str, FirebaseAuth.getInstance());
    }

    @NonNull
    /* renamed from: b */
    public static C6364a m17884b(@NonNull String str, @NonNull FirebaseAuth firebaseAuth) {
        C3495o.m8904f(str);
        C3495o.m8908j(firebaseAuth);
        if (!"facebook.com".equals(str) || C4352cp.m11809f(firebaseAuth.mo37327b())) {
            return new C6364a(str, firebaseAuth, (C6407l) null);
        }
        throw new IllegalArgumentException("Sign in with Facebook is not supported via this method; the Facebook TOS dictate that you must use the Facebook Android SDK for Facebook login.");
    }

    @NonNull
    /* renamed from: c */
    public static C6365b m17885c(@NonNull String str) {
        C3495o.m8904f(str);
        return new C6365b(str, (C6408m) null);
    }
}
