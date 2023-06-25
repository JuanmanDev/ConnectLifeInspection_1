package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import p040c.p200q.p201a.p264c.p267b.p268a.p273h.p274e.C3271n;
import p040c.p200q.p201a.p264c.p276d.p277g.C3348d;
import p040c.p200q.p201a.p264c.p294g.p296b.C3611a;

@KeepName
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public class SignInHubActivity extends FragmentActivity {

    /* renamed from: p */
    public static boolean f8139p = false;

    /* renamed from: e */
    public boolean f8140e = false;

    /* renamed from: l */
    public SignInConfiguration f8141l;

    /* renamed from: m */
    public boolean f8142m;

    /* renamed from: n */
    public int f8143n;

    /* renamed from: o */
    public Intent f8144o;

    /* renamed from: com.google.android.gms.auth.api.signin.internal.SignInHubActivity$a */
    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    public class C4070a implements LoaderManager.LoaderCallbacks<Void> {
        public C4070a() {
        }

        public final Loader<Void> onCreateLoader(int i, Bundle bundle) {
            return new zzd(SignInHubActivity.this, C3348d.m8496b());
        }

        public final /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
            Void voidR = (Void) obj;
            SignInHubActivity signInHubActivity = SignInHubActivity.this;
            signInHubActivity.setResult(signInHubActivity.f8143n, SignInHubActivity.this.f8144o);
            SignInHubActivity.this.finish();
        }

        public final void onLoaderReset(Loader<Void> loader) {
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        if (!this.f8140e) {
            setResult(0);
            if (i == 40962) {
                if (intent != null) {
                    SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
                    if (signInAccount != null && signInAccount.mo24457z() != null) {
                        GoogleSignInAccount z = signInAccount.mo24457z();
                        C3271n c = C3271n.m8342c(this);
                        GoogleSignInOptions P = this.f8141l.mo24460P();
                        C3611a.m9154a(z);
                        c.mo20310b(P, z);
                        intent.removeExtra("signInAccount");
                        intent.putExtra("googleSignInAccount", z);
                        this.f8142m = true;
                        this.f8143n = i2;
                        this.f8144o = intent;
                        mo24466s();
                        return;
                    } else if (intent.hasExtra("errorCode")) {
                        int intExtra = intent.getIntExtra("errorCode", 8);
                        if (intExtra == 13) {
                            intExtra = 12501;
                        }
                        mo24465q(intExtra);
                        return;
                    }
                }
                mo24465q(8);
            }
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        C3611a.m9154a(action);
        String str = action;
        if ("com.google.android.gms.auth.NO_IMPL".equals(str)) {
            mo24465q(12500);
        } else if (str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") || str.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Bundle bundleExtra = intent.getBundleExtra("config");
            C3611a.m9154a(bundleExtra);
            SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
            if (signInConfiguration == null) {
                setResult(0);
                finish();
                return;
            }
            this.f8141l = signInConfiguration;
            if (bundle != null) {
                boolean z = bundle.getBoolean("signingInGoogleApiClients");
                this.f8142m = z;
                if (z) {
                    this.f8143n = bundle.getInt("signInResultCode");
                    Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                    C3611a.m9154a(intent2);
                    this.f8144o = intent2;
                    mo24466s();
                }
            } else if (f8139p) {
                setResult(0);
                mo24465q(12502);
            } else {
                f8139p = true;
                Intent intent3 = new Intent(str);
                if (str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
                    intent3.setPackage("com.google.android.gms");
                } else {
                    intent3.setPackage(getPackageName());
                }
                intent3.putExtra("config", this.f8141l);
                try {
                    startActivityForResult(intent3, 40962);
                } catch (ActivityNotFoundException unused) {
                    this.f8140e = true;
                    mo24465q(17);
                }
            }
        } else {
            String valueOf = String.valueOf(intent.getAction());
            if (valueOf.length() != 0) {
                "Unknown action: ".concat(valueOf);
            } else {
                new String("Unknown action: ");
            }
            finish();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f8142m);
        if (this.f8142m) {
            bundle.putInt("signInResultCode", this.f8143n);
            bundle.putParcelable("signInResultData", this.f8144o);
        }
    }

    /* renamed from: q */
    public final void mo24465q(int i) {
        Status status = new Status(i);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f8139p = false;
    }

    /* renamed from: s */
    public final void mo24466s() {
        getSupportLoaderManager().initLoader(0, (Bundle) null, new C4070a());
        f8139p = false;
    }
}
