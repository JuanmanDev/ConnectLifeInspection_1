package p040c.p200q.p201a.p264c.p267b.p268a.p273h.p274e;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.test.internal.runner.RunnerArgs;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* renamed from: c.q.a.c.b.a.h.e.b */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class C3259b {

    /* renamed from: c */
    public static final Lock f6122c = new ReentrantLock();
    @Nullable

    /* renamed from: d */
    public static C3259b f6123d;

    /* renamed from: a */
    public final Lock f6124a = new ReentrantLock();

    /* renamed from: b */
    public final SharedPreferences f6125b;

    public C3259b(Context context) {
        this.f6125b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    @NonNull
    /* renamed from: b */
    public static C3259b m8309b(@NonNull Context context) {
        C3495o.m8908j(context);
        f6122c.lock();
        try {
            if (f6123d == null) {
                f6123d = new C3259b(context.getApplicationContext());
            }
            return f6123d;
        } finally {
            f6122c.unlock();
        }
    }

    /* renamed from: i */
    public static final String m8310i(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(RunnerArgs.CLASSPATH_SEPARATOR);
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: a */
    public void mo20287a() {
        this.f6124a.lock();
        try {
            this.f6125b.edit().clear().apply();
        } finally {
            this.f6124a.unlock();
        }
    }

    @Nullable
    /* renamed from: c */
    public GoogleSignInAccount mo20288c() {
        String g;
        String g2 = mo20292g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(g2) || (g = mo20292g(m8310i("googleSignInAccount", g2))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.m10788Z(g);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: d */
    public GoogleSignInOptions mo20289d() {
        String g;
        String g2 = mo20292g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(g2) || (g = mo20292g(m8310i("googleSignInOptions", g2))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.m10802X(g);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: e */
    public String mo20290e() {
        return mo20292g("refreshToken");
    }

    /* renamed from: f */
    public void mo20291f(@NonNull GoogleSignInAccount googleSignInAccount, @NonNull GoogleSignInOptions googleSignInOptions) {
        C3495o.m8908j(googleSignInAccount);
        C3495o.m8908j(googleSignInOptions);
        mo20293h("defaultGoogleSignInAccount", googleSignInAccount.mo24427a0());
        C3495o.m8908j(googleSignInAccount);
        C3495o.m8908j(googleSignInOptions);
        String a0 = googleSignInAccount.mo24427a0();
        mo20293h(m8310i("googleSignInAccount", a0), googleSignInAccount.mo24428b0());
        mo20293h(m8310i("googleSignInOptions", a0), googleSignInOptions.mo24440b0());
    }

    @Nullable
    /* renamed from: g */
    public final String mo20292g(@NonNull String str) {
        this.f6124a.lock();
        try {
            return this.f6125b.getString(str, (String) null);
        } finally {
            this.f6124a.unlock();
        }
    }

    /* renamed from: h */
    public final void mo20293h(@NonNull String str, @NonNull String str2) {
        this.f6124a.lock();
        try {
            this.f6125b.edit().putString(str, str2).apply();
        } finally {
            this.f6124a.unlock();
        }
    }
}
