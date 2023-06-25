package p040c.p200q.p363c.p400x;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import androidx.annotation.GuardedBy;
import androidx.test.internal.runner.RunnerArgs;
import java.util.List;
import p040c.p200q.p201a.p264c.p276d.p289n.C3562m;
import p040c.p200q.p363c.C6331h;

/* renamed from: c.q.c.x.m0 */
/* compiled from: Metadata */
public class C6841m0 {

    /* renamed from: a */
    public final Context f13095a;
    @GuardedBy("this")

    /* renamed from: b */
    public String f13096b;
    @GuardedBy("this")

    /* renamed from: c */
    public String f13097c;
    @GuardedBy("this")

    /* renamed from: d */
    public int f13098d;
    @GuardedBy("this")

    /* renamed from: e */
    public int f13099e = 0;

    public C6841m0(Context context) {
        this.f13095a = context;
    }

    /* renamed from: c */
    public static String m19427c(C6331h hVar) {
        String f = hVar.mo30406o().mo30424f();
        if (f != null) {
            return f;
        }
        String c = hVar.mo30406o().mo30420c();
        if (!c.startsWith("1:")) {
            return c;
        }
        String[] split = c.split(RunnerArgs.CLASSPATH_SEPARATOR);
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: a */
    public synchronized String mo31638a() {
        if (this.f13096b == null) {
            mo31644h();
        }
        return this.f13096b;
    }

    /* renamed from: b */
    public synchronized String mo31639b() {
        if (this.f13097c == null) {
            mo31644h();
        }
        return this.f13097c;
    }

    /* renamed from: d */
    public synchronized int mo31640d() {
        PackageInfo f;
        if (this.f13098d == 0 && (f = mo31642f("com.google.android.gms")) != null) {
            this.f13098d = f.versionCode;
        }
        return this.f13098d;
    }

    /* renamed from: e */
    public synchronized int mo31641e() {
        if (this.f13099e != 0) {
            return this.f13099e;
        }
        PackageManager packageManager = this.f13095a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            return 0;
        }
        if (!C3562m.m9087h()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f13099e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            if (C3562m.m9087h()) {
                this.f13099e = 2;
            } else {
                this.f13099e = 1;
            }
            return this.f13099e;
        }
        this.f13099e = 2;
        return 2;
    }

    /* renamed from: f */
    public final PackageInfo mo31642f(String str) {
        try {
            return this.f13095a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            "Failed to find package " + e;
            return null;
        }
    }

    /* renamed from: g */
    public boolean mo31643g() {
        return mo31641e() != 0;
    }

    /* renamed from: h */
    public final synchronized void mo31644h() {
        PackageInfo f = mo31642f(this.f13095a.getPackageName());
        if (f != null) {
            this.f13096b = Integer.toString(f.versionCode);
            this.f13097c = f.versionName;
        }
    }
}
