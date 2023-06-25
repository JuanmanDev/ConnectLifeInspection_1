package p040c.p200q.p201a.p264c.p276d.p281j;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.browser.browseractions.BrowserServiceFileProvider;

/* renamed from: c.q.a.c.d.j.n1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C3494n1 {

    /* renamed from: f */
    public static final Uri f6480f = new Uri.Builder().scheme(BrowserServiceFileProvider.CONTENT_SCHEME).authority("com.google.android.gms.chimera").build();
    @Nullable

    /* renamed from: a */
    public final String f6481a;
    @Nullable

    /* renamed from: b */
    public final String f6482b;
    @Nullable

    /* renamed from: c */
    public final ComponentName f6483c = null;

    /* renamed from: d */
    public final int f6484d;

    /* renamed from: e */
    public final boolean f6485e;

    public C3494n1(String str, String str2, int i, boolean z) {
        C3495o.m8904f(str);
        this.f6481a = str;
        C3495o.m8904f(str2);
        this.f6482b = str2;
        this.f6484d = i;
        this.f6485e = z;
    }

    /* renamed from: a */
    public final int mo20752a() {
        return this.f6484d;
    }

    @Nullable
    /* renamed from: b */
    public final ComponentName mo20753b() {
        return this.f6483c;
    }

    /* renamed from: c */
    public final Intent mo20754c(Context context) {
        Bundle bundle;
        if (this.f6481a == null) {
            return new Intent().setComponent(this.f6483c);
        }
        Intent intent = null;
        if (this.f6485e) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", this.f6481a);
            try {
                bundle = context.getContentResolver().call(f6480f, "serviceIntentCall", (String) null, bundle2);
            } catch (IllegalArgumentException e) {
                "Dynamic intent resolution failed: ".concat(e.toString());
                bundle = null;
            }
            if (bundle != null) {
                intent = (Intent) bundle.getParcelable("serviceResponseIntentKey");
            }
            if (intent == null) {
                "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.f6481a));
            }
        }
        if (intent != null) {
            return intent;
        }
        return new Intent(this.f6481a).setPackage(this.f6482b);
    }

    @Nullable
    /* renamed from: d */
    public final String mo20755d() {
        return this.f6482b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3494n1)) {
            return false;
        }
        C3494n1 n1Var = (C3494n1) obj;
        return C3487m.m8886a(this.f6481a, n1Var.f6481a) && C3487m.m8886a(this.f6482b, n1Var.f6482b) && C3487m.m8886a(this.f6483c, n1Var.f6483c) && this.f6484d == n1Var.f6484d && this.f6485e == n1Var.f6485e;
    }

    public final int hashCode() {
        return C3487m.m8887b(this.f6481a, this.f6482b, this.f6483c, Integer.valueOf(this.f6484d), Boolean.valueOf(this.f6485e));
    }

    public final String toString() {
        String str = this.f6481a;
        if (str != null) {
            return str;
        }
        C3495o.m8908j(this.f6483c);
        return this.f6483c.flattenToString();
    }
}
