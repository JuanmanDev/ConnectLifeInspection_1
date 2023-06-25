package p040c.p200q.p363c.p399w;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.core.content.ContextCompat;
import p040c.p200q.p363c.C6330g;
import p040c.p200q.p363c.p389r.C6736a;
import p040c.p200q.p363c.p389r.C6738c;

/* renamed from: c.q.c.w.a */
/* compiled from: DataCollectionConfigStorage */
public class C6795a {

    /* renamed from: a */
    public final Context f12994a;

    /* renamed from: b */
    public final SharedPreferences f12995b;

    /* renamed from: c */
    public final C6738c f12996c;

    /* renamed from: d */
    public boolean f12997d = mo31562c();

    public C6795a(Context context, String str, C6738c cVar) {
        Context a = m19282a(context);
        this.f12994a = a;
        this.f12995b = a.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f12996c = cVar;
    }

    /* renamed from: a */
    public static Context m19282a(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return context;
        }
        return ContextCompat.createDeviceProtectedStorageContext(context);
    }

    /* renamed from: b */
    public synchronized boolean mo31561b() {
        return this.f12997d;
    }

    /* renamed from: c */
    public final boolean mo31562c() {
        if (this.f12995b.contains("firebase_data_collection_default_enabled")) {
            return this.f12995b.getBoolean("firebase_data_collection_default_enabled", true);
        }
        return mo31563d();
    }

    /* renamed from: d */
    public final boolean mo31563d() {
        ApplicationInfo applicationInfo;
        try {
            PackageManager packageManager = this.f12994a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f12994a.getPackageName(), 128)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    /* renamed from: e */
    public synchronized void mo31564e(Boolean bool) {
        if (bool == null) {
            this.f12995b.edit().remove("firebase_data_collection_default_enabled").apply();
            mo31565f(mo31563d());
        } else {
            boolean equals = Boolean.TRUE.equals(bool);
            this.f12995b.edit().putBoolean("firebase_data_collection_default_enabled", equals).apply();
            mo31565f(equals);
        }
    }

    /* renamed from: f */
    public final synchronized void mo31565f(boolean z) {
        if (this.f12997d != z) {
            this.f12997d = z;
            this.f12996c.mo30534c(new C6736a(C6330g.class, new C6330g(z)));
        }
    }
}
