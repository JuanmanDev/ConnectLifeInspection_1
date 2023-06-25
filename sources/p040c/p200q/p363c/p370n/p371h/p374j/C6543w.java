package p040c.p200q.p363c.p370n.p371h.p374j;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;
import p040c.p200q.p201a.p264c.p347m.C5771j;
import p040c.p200q.p201a.p264c.p347m.C5773k;
import p040c.p200q.p363c.C6331h;
import p040c.p200q.p363c.p370n.p371h.C6479f;

/* renamed from: c.q.c.n.h.j.w */
/* compiled from: DataCollectionArbiter */
public class C6543w {

    /* renamed from: a */
    public final SharedPreferences f12333a;

    /* renamed from: b */
    public final C6331h f12334b;

    /* renamed from: c */
    public final Object f12335c = new Object();

    /* renamed from: d */
    public C5773k<Void> f12336d = new C5773k<>();

    /* renamed from: e */
    public boolean f12337e = false;

    /* renamed from: f */
    public boolean f12338f = false;
    @Nullable

    /* renamed from: g */
    public Boolean f12339g;

    /* renamed from: h */
    public final C5773k<Void> f12340h = new C5773k<>();

    public C6543w(C6331h hVar) {
        Context j = hVar.mo30404j();
        this.f12334b = hVar;
        this.f12333a = C6513n.m18240r(j);
        Boolean b = mo30807b();
        this.f12339g = b == null ? mo30806a(j) : b;
        synchronized (this.f12335c) {
            if (mo30809d()) {
                this.f12336d.mo28863e(null);
                this.f12337e = true;
            }
        }
    }

    @Nullable
    /* renamed from: f */
    public static Boolean m18386f(Context context) {
        ApplicationInfo applicationInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_crashlytics_collection_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
        } catch (PackageManager.NameNotFoundException e) {
            C6479f.m18125f().mo30644e("Could not read data collection permission from manifest", e);
            return null;
        }
    }

    @SuppressLint({"ApplySharedPref"})
    /* renamed from: h */
    public static void m18387h(SharedPreferences sharedPreferences, Boolean bool) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (bool != null) {
            edit.putBoolean("firebase_crashlytics_collection_enabled", bool.booleanValue());
        } else {
            edit.remove("firebase_crashlytics_collection_enabled");
        }
        edit.apply();
    }

    @Nullable
    /* renamed from: a */
    public final Boolean mo30806a(Context context) {
        Boolean f = m18386f(context);
        if (f == null) {
            this.f12338f = false;
            return null;
        }
        this.f12338f = true;
        return Boolean.valueOf(Boolean.TRUE.equals(f));
    }

    @Nullable
    /* renamed from: b */
    public final Boolean mo30807b() {
        if (!this.f12333a.contains("firebase_crashlytics_collection_enabled")) {
            return null;
        }
        this.f12338f = false;
        return Boolean.valueOf(this.f12333a.getBoolean("firebase_crashlytics_collection_enabled", true));
    }

    /* renamed from: c */
    public void mo30808c(boolean z) {
        if (z) {
            this.f12340h.mo28863e(null);
            return;
        }
        throw new IllegalStateException("An invalid data collection token was used.");
    }

    /* renamed from: d */
    public synchronized boolean mo30809d() {
        boolean z;
        if (this.f12339g != null) {
            z = this.f12339g.booleanValue();
        } else {
            z = this.f12334b.mo30410u();
        }
        mo30810e(z);
        return z;
    }

    /* renamed from: e */
    public final void mo30810e(boolean z) {
        String str;
        String str2 = z ? "ENABLED" : "DISABLED";
        if (this.f12339g == null) {
            str = "global Firebase setting";
        } else {
            str = this.f12338f ? "firebase_crashlytics_collection_enabled manifest flag" : "API";
        }
        C6479f.m18125f().mo30641b(String.format("Crashlytics automatic data collection %s by %s.", new Object[]{str2, str}));
    }

    /* renamed from: g */
    public synchronized void mo30811g(@Nullable Boolean bool) {
        Boolean bool2;
        if (bool != null) {
            try {
                this.f12338f = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            bool2 = bool;
        } else {
            bool2 = mo30806a(this.f12334b.mo30404j());
        }
        this.f12339g = bool2;
        m18387h(this.f12333a, bool);
        synchronized (this.f12335c) {
            if (mo30809d()) {
                if (!this.f12337e) {
                    this.f12336d.mo28863e(null);
                    this.f12337e = true;
                }
            } else if (this.f12337e) {
                this.f12336d = new C5773k<>();
                this.f12337e = false;
            }
        }
    }

    /* renamed from: i */
    public C5771j<Void> mo30812i() {
        C5771j<Void> a;
        synchronized (this.f12335c) {
            a = this.f12336d.mo28859a();
        }
        return a;
    }

    /* renamed from: j */
    public C5771j<Void> mo30813j(Executor executor) {
        return C6505h0.m18198h(executor, this.f12340h.mo28859a(), mo30812i());
    }
}
