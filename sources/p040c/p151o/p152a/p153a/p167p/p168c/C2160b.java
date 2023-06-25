package p040c.p151o.p152a.p153a.p167p.p168c;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.gigya.android.sdk.p309ui.HostActivity;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import java.util.Map;
import org.json.JSONObject;
import p040c.p151o.p152a.p153a.C2103f;
import p040c.p151o.p152a.p153a.p174u.C2203d;
import p040c.p200q.p201a.p264c.p267b.p268a.p273h.C3253a;
import p040c.p200q.p201a.p264c.p267b.p268a.p273h.C3254b;
import p040c.p200q.p201a.p264c.p267b.p268a.p273h.C3257d;
import p040c.p200q.p201a.p264c.p276d.C3324b;
import p040c.p200q.p201a.p264c.p347m.C5761e;
import p040c.p200q.p201a.p264c.p347m.C5771j;

/* renamed from: c.o.a.a.p.c.b */
/* compiled from: GoogleProvider */
public class C2160b extends C2168e {

    /* renamed from: g */
    public C3254b f2132g;

    /* renamed from: h */
    public String f2133h;

    /* renamed from: i */
    public final C2203d f2134i;

    /* renamed from: c.o.a.a.p.c.b$a */
    /* compiled from: GoogleProvider */
    public class C2161a extends HostActivity.C3954a {

        /* renamed from: a */
        public final /* synthetic */ Map f2135a;

        public C2161a(Map map) {
            this.f2135a = map;
        }

        /* renamed from: a */
        public void mo16986a(AppCompatActivity appCompatActivity, int i, int i2, @Nullable Intent intent) {
            if (i == 0) {
                C2160b.this.mo16990n(this.f2135a, appCompatActivity, C3253a.m8297c(intent));
            }
        }

        /* renamed from: b */
        public void mo16987b(AppCompatActivity appCompatActivity, @Nullable Bundle bundle) {
            appCompatActivity.startActivityForResult(C2160b.this.f2132g.mo20278p(), 0);
        }
    }

    /* renamed from: c.o.a.a.p.c.b$b */
    /* compiled from: GoogleProvider */
    public class C2162b implements C5761e<Void> {

        /* renamed from: a */
        public final /* synthetic */ Activity f2137a;

        public C2162b(C2160b bVar, Activity activity) {
            this.f2137a = activity;
        }

        public void onComplete(@NonNull C5771j<Void> jVar) {
            Activity activity = this.f2137a;
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* renamed from: o */
    public static boolean m3244o(Context context) {
        try {
            Class.forName("c.q.a.c.b.a.h.b");
            if (C3324b.m8405m().mo20388g(context) == 0) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    public void mo16980a() {
        super.mo16980a();
        if (this.f2132g == null) {
            if (this.f2133h == null) {
                C2103f.m3057c("GoogleLoginProvider", "provider client id unavailable for logout");
                return;
            }
            GoogleSignInOptions.C4069a aVar = new GoogleSignInOptions.C4069a(GoogleSignInOptions.f8106u);
            aVar.mo24451g(this.f2133h);
            aVar.mo24446b();
            this.f2132g = C3253a.m8295a(this.f2144a, aVar.mo24445a());
        }
        this.f2132g.mo20280r();
    }

    /* renamed from: c */
    public void mo16981c(Map<String, Object> map, String str) {
        if (!this.f2146c) {
            this.f2146c = true;
            this.f2147d = str;
            try {
                this.f2133h = this.f2134i.mo17059b("googleClientId");
            } catch (Exception e) {
                this.f2146c = false;
                e.printStackTrace();
            }
            if (this.f2133h == null) {
                mo17000g("Missing server client id. Check manifest implementation");
                return;
            }
            GoogleSignInOptions.C4069a aVar = new GoogleSignInOptions.C4069a(GoogleSignInOptions.f8106u);
            aVar.mo24451g(this.f2133h);
            aVar.mo24446b();
            this.f2132g = C3253a.m8295a(this.f2144a, aVar.mo24445a());
            GoogleSignInAccount b = C3253a.m8296b(this.f2144a);
            if (b != null) {
                mo17002i(map, mo16989m(b.mo24426X(), -1, (String) null), str);
                mo16988l((Activity) null);
                return;
            }
            HostActivity.m9833q(this.f2144a, new C2161a(map));
        }
    }

    public String getName() {
        return "google";
    }

    /* renamed from: l */
    public final void mo16988l(Activity activity) {
        C3254b bVar = this.f2132g;
        if (bVar != null) {
            bVar.mo20280r().mo28842c(new C2162b(this, activity));
        } else if (activity != null) {
            activity.finish();
        }
    }

    /* renamed from: m */
    public String mo16989m(String str, long j, String str2) {
        try {
            return new JSONObject().put(getName(), new JSONObject().put("code", str)).toString();
        } catch (Exception e) {
            this.f2146c = false;
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: n */
    public final void mo16990n(Map<String, Object> map, AppCompatActivity appCompatActivity, C5771j<GoogleSignInAccount> jVar) {
        try {
            GoogleSignInAccount n = jVar.mo28853n(ApiException.class);
            if (n == null) {
                mo17000g("Account unavailable");
            } else {
                String X = n.mo24426X();
                if (X == null) {
                    mo17000g("Id token no available");
                } else {
                    mo17002i(map, mo16989m(X, -1, (String) null), this.f2147d);
                }
            }
            mo16988l(appCompatActivity);
        } catch (ApiException e) {
            int statusCode = e.getStatusCode();
            if (statusCode != 12501) {
                mo17000g(C3257d.m8305a(statusCode));
            } else {
                mo16998e();
            }
            mo16988l(appCompatActivity);
        }
    }
}
