package p040c.p200q.p201a.p264c.p267b.p268a;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import p040c.p200q.p201a.p264c.p267b.p268a.p272g.C3250a;
import p040c.p200q.p201a.p264c.p267b.p268a.p273h.p274e.C3263f;
import p040c.p200q.p201a.p264c.p276d.p277g.C3334a;
import p040c.p200q.p201a.p264c.p276d.p281j.C3487m;
import p040c.p200q.p201a.p264c.p294g.p296b.C3616f;

/* renamed from: c.q.a.c.b.a.a */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C3225a {

    /* renamed from: a */
    public static final C3334a.C3343g<C3616f> f6096a = new C3334a.C3343g<>();

    /* renamed from: b */
    public static final C3334a.C3343g<C3263f> f6097b = new C3334a.C3343g<>();

    /* renamed from: c */
    public static final C3334a.C3335a<C3616f, C3226a> f6098c = new C3288j();

    /* renamed from: d */
    public static final C3334a.C3335a<C3263f, GoogleSignInOptions> f6099d = new C3289k();

    /* renamed from: e */
    public static final C3334a<GoogleSignInOptions> f6100e = new C3334a<>("Auth.GOOGLE_SIGN_IN_API", f6099d, f6097b);

    @Deprecated
    /* renamed from: c.q.a.c.b.a.a$a */
    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    public static class C3226a implements C3334a.C3338d {

        /* renamed from: n */
        public static final C3226a f6101n = new C3227a().mo20235b();

        /* renamed from: e */
        public final String f6102e;

        /* renamed from: l */
        public final boolean f6103l;
        @Nullable

        /* renamed from: m */
        public final String f6104m;

        public C3226a(C3227a aVar) {
            this.f6102e = aVar.f6105a;
            this.f6103l = aVar.f6106b.booleanValue();
            this.f6104m = aVar.f6107c;
        }

        /* renamed from: a */
        public final Bundle mo20231a() {
            Bundle bundle = new Bundle();
            bundle.putString("consumer_package", this.f6102e);
            bundle.putBoolean("force_save_dialog", this.f6103l);
            bundle.putString("log_session_id", this.f6104m);
            return bundle;
        }

        public boolean equals(@Nullable Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C3226a)) {
                return false;
            }
            C3226a aVar = (C3226a) obj;
            return C3487m.m8886a(this.f6102e, aVar.f6102e) && this.f6103l == aVar.f6103l && C3487m.m8886a(this.f6104m, aVar.f6104m);
        }

        public int hashCode() {
            return C3487m.m8887b(this.f6102e, Boolean.valueOf(this.f6103l), this.f6104m);
        }

        @Deprecated
        /* renamed from: c.q.a.c.b.a.a$a$a */
        /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
        public static class C3227a {

            /* renamed from: a */
            public String f6105a;

            /* renamed from: b */
            public Boolean f6106b = Boolean.FALSE;
            @Nullable

            /* renamed from: c */
            public String f6107c;

            public C3227a() {
            }

            /* renamed from: a */
            public C3227a mo20234a(String str) {
                this.f6107c = str;
                return this;
            }

            /* renamed from: b */
            public C3226a mo20235b() {
                return new C3226a(this);
            }

            public C3227a(C3226a aVar) {
                this.f6105a = aVar.f6102e;
                this.f6106b = Boolean.valueOf(aVar.f6103l);
                this.f6107c = aVar.f6104m;
            }
        }
    }

    static {
        C3334a<C3229c> aVar = C3228b.f6110c;
        new C3334a("Auth.CREDENTIALS_API", f6098c, f6096a);
        C3250a aVar2 = C3228b.f6111d;
    }
}
