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
import androidx.test.internal.runner.RunnerArgs;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p527firebaseauthapi.zzaay;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.Executor;
import net.sqlcipher.database.SQLiteDatabase;
import org.json.JSONException;
import org.json.JSONObject;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3515b;
import p040c.p200q.p201a.p264c.p276d.p289n.C3550a;
import p040c.p200q.p201a.p264c.p276d.p289n.C3556g;
import p040c.p200q.p201a.p264c.p276d.p289n.C3558i;
import p040c.p200q.p201a.p264c.p294g.p333g.C4352cp;
import p040c.p200q.p201a.p264c.p294g.p333g.C4780sn;
import p040c.p200q.p201a.p264c.p294g.p333g.C4806tn;
import p040c.p200q.p201a.p264c.p294g.p333g.C4832un;
import p040c.p200q.p201a.p264c.p294g.p333g.C4947z8;
import p040c.p200q.p363c.C6331h;
import p040c.p200q.p363c.p367l.p368h.C6372b0;
import p040c.p200q.p363c.p367l.p368h.C6374c0;
import p040c.p200q.p363c.p367l.p368h.C6376d0;
import p040c.p200q.p363c.p367l.p368h.C6381g;
import p040c.p200q.p363c.p367l.p368h.C6400w;
import p040c.p200q.p363c.p367l.p368h.C6401x;

@KeepName
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class GenericIdpActivity extends FragmentActivity implements C4832un {

    /* renamed from: m */
    public static long f15378m;

    /* renamed from: n */
    public static final C6401x f15379n = C6401x.m17944a();

    /* renamed from: e */
    public final Executor f15380e = C4947z8.m13705a().mo26791h(1);

    /* renamed from: l */
    public boolean f15381l = false;

    @Nullable
    /* renamed from: e */
    public final Uri.Builder mo26743e(@NonNull Intent intent, @NonNull String str, @NonNull String str2) {
        return mo37387p(new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler"), intent, str, str2);
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
            new CustomTabsIntent.Builder().build().launchUrl(this, uri);
            return;
        }
        mo26747n(str, (Status) null);
    }

    /* renamed from: n */
    public final void mo26747n(@NonNull String str, @Nullable Status status) {
        if (status == null) {
            mo37388q();
        } else {
            mo37389r(status);
        }
    }

    public final void onCreate(@NonNull Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if ("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(action) || "com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(action) || "com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(action) || "android.intent.action.VIEW".equals(action)) {
            long a = C3556g.m9065c().mo20838a();
            if (a - f15378m >= 30000) {
                f15378m = a;
                if (bundle != null) {
                    this.f15381l = bundle.getBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN");
                    return;
                }
                return;
            }
            return;
        }
        "Could not do operation - unknown action: ".concat(String.valueOf(action));
        mo37388q();
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
                mo37389r(C6400w.m17942a(intent.getStringExtra("firebaseError")));
            } else if (!intent.hasExtra("link") || !intent.hasExtra("eventId")) {
                mo37388q();
            } else {
                String stringExtra = intent.getStringExtra("link");
                String stringExtra2 = intent.getStringExtra("eventId");
                String packageName = getPackageName();
                boolean booleanExtra = intent.getBooleanExtra("encryptionEnabled", true);
                C6372b0 a = C6374c0.m17898b().mo30465a(this, packageName, stringExtra2);
                if (a == null) {
                    mo37388q();
                }
                if (booleanExtra) {
                    stringExtra = C6376d0.m17906a(getApplicationContext(), C6331h.m17786m(a.mo30458a()).mo30407p()).mo30469b(stringExtra);
                }
                zzaay zzaay = new zzaay(a, stringExtra);
                String e = a.mo30462e();
                String b = a.mo30459b();
                zzaay.mo33363S(e);
                if ("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(b) || "com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(b) || "com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(b)) {
                    f15378m = 0;
                    this.f15381l = false;
                    Intent intent2 = new Intent();
                    C3515b.m8981d(zzaay, intent2, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST");
                    intent2.putExtra("com.google.firebase.auth.internal.OPERATION", b);
                    intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
                    if (!LocalBroadcastManager.getInstance(this).sendBroadcast(intent2)) {
                        SharedPreferences.Editor edit = getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
                        edit.putString("verifyAssertionRequest", C3515b.m8982e(zzaay));
                        edit.putString("operation", b);
                        edit.putString("tenantId", e);
                        edit.putLong(NotificationCompat.CarExtender.KEY_TIMESTAMP, C3556g.m9065c().mo20838a());
                        edit.commit();
                    } else {
                        f15379n.mo30501b(this);
                    }
                    finish();
                    return;
                }
                "unsupported operation: ".concat(b);
                mo37388q();
            }
        } else if (!this.f15381l) {
            String packageName2 = getPackageName();
            try {
                String lowerCase = C3558i.m9075b(C3550a.m9042a(this, packageName2)).toLowerCase(Locale.US);
                C6331h m = C6331h.m17786m(getIntent().getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME"));
                if (!C4352cp.m11809f(m)) {
                    new C4780sn(packageName2, lowerCase, getIntent(), m, this).executeOnExecutor(this.f15380e, new Void[0]);
                } else {
                    mo26746j(mo37387p(Uri.parse(C4352cp.m11804a(m.mo30406o().mo30419b())).buildUpon(), getIntent(), packageName2, lowerCase).build(), packageName2);
                }
            } catch (PackageManager.NameNotFoundException e2) {
                "Could not get package signature: " + packageName2 + " " + e2.toString();
                mo26747n(packageName2, (Status) null);
            }
            this.f15381l = true;
        } else {
            mo37388q();
        }
    }

    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN", this.f15381l);
    }

    @Nullable
    /* renamed from: p */
    public final Uri.Builder mo37387p(@NonNull Uri.Builder builder, @NonNull Intent intent, @NonNull String str, @NonNull String str2) {
        String str3;
        Uri.Builder builder2 = builder;
        Intent intent2 = intent;
        String stringExtra = intent2.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String stringExtra2 = intent2.getStringExtra("com.google.firebase.auth.KEY_PROVIDER_ID");
        String stringExtra3 = intent2.getStringExtra("com.google.firebase.auth.KEY_TENANT_ID");
        String stringExtra4 = intent2.getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME");
        ArrayList<String> stringArrayListExtra = intent2.getStringArrayListExtra("com.google.firebase.auth.KEY_PROVIDER_SCOPES");
        String join = (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) ? null : TextUtils.join(RunnerArgs.CLASS_SEPARATOR, stringArrayListExtra);
        Bundle bundleExtra = intent2.getBundleExtra("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS");
        if (bundleExtra == null) {
            str3 = null;
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                for (String str4 : bundleExtra.keySet()) {
                    String string = bundleExtra.getString(str4);
                    if (!TextUtils.isEmpty(string)) {
                        jSONObject.put(str4, string);
                    }
                }
            } catch (JSONException unused) {
            }
            str3 = jSONObject.toString();
        }
        String uuid = UUID.randomUUID().toString();
        String a = C4806tn.m13173a(this, UUID.randomUUID().toString());
        String action = intent.getAction();
        String stringExtra5 = intent2.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String str5 = stringExtra;
        String str6 = a;
        String str7 = uuid;
        String str8 = str3;
        String str9 = join;
        C6374c0.m17898b().mo30467d(getApplicationContext(), str, uuid, a, action, stringExtra2, stringExtra3, stringExtra4);
        String c = C6376d0.m17906a(getApplicationContext(), C6331h.m17786m(stringExtra4).mo30407p()).mo30470c();
        if (TextUtils.isEmpty(c)) {
            mo37389r(C6381g.m17909a("Failed to generate/retrieve public encryption key for Generic IDP flow."));
            return null;
        } else if (str6 == null) {
            return null;
        } else {
            builder2.appendQueryParameter("eid", "p").appendQueryParameter("v", "X".concat(String.valueOf(stringExtra5))).appendQueryParameter("authType", "signInWithRedirect").appendQueryParameter("apiKey", str5).appendQueryParameter("providerId", stringExtra2).appendQueryParameter("sessionId", str6).appendQueryParameter("eventId", str7).appendQueryParameter("apn", str).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", c);
            if (!TextUtils.isEmpty(str9)) {
                builder2.appendQueryParameter("scopes", str9);
            }
            if (!TextUtils.isEmpty(str8)) {
                builder2.appendQueryParameter("customParameters", str8);
            }
            if (!TextUtils.isEmpty(stringExtra3)) {
                builder2.appendQueryParameter("tid", stringExtra3);
            }
            return builder2;
        }
    }

    /* renamed from: q */
    public final void mo37388q() {
        f15378m = 0;
        this.f15381l = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (!LocalBroadcastManager.getInstance(this).sendBroadcast(intent)) {
            f15379n.mo30503d(this, C6381g.m17909a("WEB_CONTEXT_CANCELED"));
        } else {
            f15379n.mo30501b(this);
        }
        finish();
    }

    /* renamed from: r */
    public final void mo37389r(Status status) {
        f15378m = 0;
        this.f15381l = false;
        Intent intent = new Intent();
        C6400w.m17943b(intent, status);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (!LocalBroadcastManager.getInstance(this).sendBroadcast(intent)) {
            f15379n.mo30503d(getApplicationContext(), status);
        } else {
            f15379n.mo30501b(this);
        }
        finish();
    }

    @NonNull
    public final Context zza() {
        return getApplicationContext();
    }
}
