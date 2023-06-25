package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsService;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.FirebaseAuth;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import net.sqlcipher.database.SQLiteDatabase;
import p040c.p200q.p201a.p264c.p276d.p289n.C3550a;
import p040c.p200q.p201a.p264c.p276d.p289n.C3556g;
import p040c.p200q.p201a.p264c.p276d.p289n.C3558i;
import p040c.p200q.p201a.p264c.p294g.p333g.C4352cp;
import p040c.p200q.p201a.p264c.p294g.p333g.C4405eo;
import p040c.p200q.p201a.p264c.p294g.p333g.C4780sn;
import p040c.p200q.p201a.p264c.p294g.p333g.C4832un;
import p040c.p200q.p201a.p264c.p294g.p333g.C4947z8;
import p040c.p200q.p363c.C6331h;
import p040c.p200q.p363c.p367l.p368h.C6374c0;
import p040c.p200q.p363c.p367l.p368h.C6376d0;
import p040c.p200q.p363c.p367l.p368h.C6381g;
import p040c.p200q.p363c.p367l.p368h.C6400w;
import p040c.p200q.p363c.p367l.p368h.C6401x;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class RecaptchaActivity extends FragmentActivity implements C4832un {

    /* renamed from: l */
    public static final String f15382l = RecaptchaActivity.class.getSimpleName();

    /* renamed from: m */
    public static final ExecutorService f15383m = C4947z8.m13705a().mo26791h(2);

    /* renamed from: n */
    public static long f15384n = 0;

    /* renamed from: o */
    public static final C6401x f15385o = C6401x.m17944a();

    /* renamed from: e */
    public boolean f15386e = false;

    @Nullable
    /* renamed from: e */
    public final Uri.Builder mo26743e(@NonNull Intent intent, @NonNull String str, @NonNull String str2) {
        String str3;
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String uuid = UUID.randomUUID().toString();
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME");
        C6331h m = C6331h.m17786m(stringExtra3);
        FirebaseAuth instance = FirebaseAuth.getInstance(m);
        C6374c0.m17898b().mo30468e(getApplicationContext(), str, uuid, "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA", stringExtra3);
        String c = C6376d0.m17906a(getApplicationContext(), m.mo30407p()).mo30470c();
        if (TextUtils.isEmpty(c)) {
            mo37391q(C6381g.m17909a("Failed to generate/retrieve public encryption key for reCAPTCHA flow."));
            return null;
        }
        if (!TextUtils.isEmpty(instance.mo37329d())) {
            str3 = instance.mo37329d();
        } else {
            str3 = C4405eo.m11927a();
        }
        return new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler").appendQueryParameter("apiKey", stringExtra).appendQueryParameter("authType", "verifyApp").appendQueryParameter("apn", str).appendQueryParameter("hl", str3).appendQueryParameter("eventId", uuid).appendQueryParameter("v", "X".concat(String.valueOf(stringExtra2))).appendQueryParameter("eid", "p").appendQueryParameter("appName", stringExtra3).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", c);
    }

    @NonNull
    /* renamed from: f */
    public final String mo26744f(@NonNull String str) {
        return C4352cp.m11805b(str);
    }

    @Nullable
    /* renamed from: i */
    public final HttpURLConnection mo26745i(@NonNull URL url) {
        try {
            return (HttpURLConnection) url.openConnection();
        } catch (IOException unused) {
            C4832un.f9687b.mo20807c("Error generating connection", new Object[0]);
            return null;
        }
    }

    /* renamed from: j */
    public final void mo26746j(@NonNull Uri uri, @NonNull String str) {
        if (getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) != null) {
            List<ResolveInfo> queryIntentServices = getPackageManager().queryIntentServices(new Intent(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION), 0);
            if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                Intent intent = new Intent("android.intent.action.VIEW", uri);
                intent.putExtra("com.android.browser.application_id", str);
                intent.addFlags(1073741824);
                intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
                startActivity(intent);
                return;
            }
            CustomTabsIntent build = new CustomTabsIntent.Builder().build();
            build.intent.addFlags(1073741824);
            build.intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            build.launchUrl(this, uri);
            return;
        }
        mo26747n(str, (Status) null);
    }

    /* renamed from: n */
    public final void mo26747n(@NonNull String str, @Nullable Status status) {
        if (status == null) {
            mo37390p();
        } else {
            mo37391q(status);
        }
    }

    public final void onCreate(@NonNull Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if ("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(action) || "android.intent.action.VIEW".equals(action)) {
            long a = C3556g.m9065c().mo20838a();
            if (a - f15384n >= 30000) {
                f15384n = a;
                if (bundle != null) {
                    this.f15386e = bundle.getBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW");
                    return;
                }
                return;
            }
            return;
        }
        "Could not do operation - unknown action: ".concat(String.valueOf(action));
        mo37390p();
    }

    public final void onNewIntent(@NonNull Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    public final void onResume() {
        super.onResume();
        if ("android.intent.action.VIEW".equals(getIntent().getAction())) {
            Intent intent = getIntent();
            if (intent.hasExtra("firebaseError")) {
                mo37391q(C6400w.m17942a(intent.getStringExtra("firebaseError")));
            } else if (!intent.hasExtra("link") || !intent.hasExtra("eventId")) {
                mo37390p();
            } else {
                String stringExtra = intent.getStringExtra("link");
                String c = C6374c0.m17898b().mo30466c(getApplicationContext(), getPackageName(), intent.getStringExtra("eventId"));
                if (TextUtils.isEmpty(c)) {
                    mo37391q(C6381g.m17909a("Failed to find registration for this reCAPTCHA event"));
                }
                if (intent.getBooleanExtra("encryptionEnabled", true)) {
                    stringExtra = C6376d0.m17906a(getApplicationContext(), C6331h.m17786m(c).mo30407p()).mo30469b(stringExtra);
                }
                String queryParameter = Uri.parse(stringExtra).getQueryParameter("recaptchaToken");
                f15384n = 0;
                this.f15386e = false;
                Intent intent2 = new Intent();
                intent2.putExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN", queryParameter);
                intent2.putExtra("com.google.firebase.auth.internal.OPERATION", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
                intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
                if (!LocalBroadcastManager.getInstance(this).sendBroadcast(intent2)) {
                    SharedPreferences.Editor edit = getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
                    edit.putString("recaptchaToken", queryParameter);
                    edit.putString("operation", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
                    edit.putLong(NotificationCompat.CarExtender.KEY_TIMESTAMP, C3556g.m9065c().mo20838a());
                    edit.commit();
                } else {
                    f15385o.mo30501b(this);
                }
                finish();
            }
        } else if (!this.f15386e) {
            Intent intent3 = getIntent();
            String packageName = getPackageName();
            try {
                new C4780sn(packageName, C3558i.m9075b(C3550a.m9042a(this, packageName)).toLowerCase(Locale.US), intent3, C6331h.m17786m(intent3.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME")), this).executeOnExecutor(f15383m, new Void[0]);
            } catch (PackageManager.NameNotFoundException e) {
                "Could not get package signature: " + packageName + " " + e.toString();
                mo26747n(packageName, (Status) null);
            }
            this.f15386e = true;
        } else {
            mo37390p();
        }
    }

    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW", this.f15386e);
    }

    /* renamed from: p */
    public final void mo37390p() {
        f15384n = 0;
        this.f15386e = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
        f15385o.mo30501b(this);
        finish();
    }

    /* renamed from: q */
    public final void mo37391q(Status status) {
        f15384n = 0;
        this.f15386e = false;
        Intent intent = new Intent();
        C6400w.m17943b(intent, status);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
        f15385o.mo30501b(this);
        finish();
    }

    @NonNull
    public final Context zza() {
        return getApplicationContext();
    }
}
