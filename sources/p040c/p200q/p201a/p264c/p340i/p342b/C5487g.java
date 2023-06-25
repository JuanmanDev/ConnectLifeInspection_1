package p040c.p200q.p201a.p264c.p340i.p342b;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Size;
import androidx.annotation.WorkerThread;
import java.lang.reflect.InvocationTargetException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p289n.C3563n;
import p040c.p200q.p201a.p264c.p276d.p291o.C3573c;

/* renamed from: c.q.a.c.i.b.g */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5487g extends C5577n5 {

    /* renamed from: b */
    public Boolean f10479b;

    /* renamed from: c */
    public C5475f f10480c = C5463e.f10425a;

    /* renamed from: d */
    public Boolean f10481d;

    public C5487g(C5648t4 t4Var) {
        super(t4Var);
    }

    /* renamed from: I */
    public static final long m15650I() {
        return ((Long) C5658u2.f10969d.mo28613a((Object) null)).longValue();
    }

    /* renamed from: i */
    public static final long m15651i() {
        return ((Long) C5658u2.f10940D.mo28613a((Object) null)).longValue();
    }

    /* renamed from: A */
    public final boolean mo28234A() {
        Boolean t = mo28252t("google_analytics_adid_collection_enabled");
        return t == null || t.booleanValue();
    }

    @WorkerThread
    /* renamed from: B */
    public final boolean mo28235B(String str, C5646t2 t2Var) {
        if (str == null) {
            return ((Boolean) t2Var.mo28613a((Object) null)).booleanValue();
        }
        String e = this.f10480c.mo28213e(str, t2Var.mo28614b());
        if (TextUtils.isEmpty(e)) {
            return ((Boolean) t2Var.mo28613a((Object) null)).booleanValue();
        }
        return ((Boolean) t2Var.mo28613a(Boolean.valueOf("1".equals(e)))).booleanValue();
    }

    /* renamed from: C */
    public final boolean mo28236C(String str) {
        return "1".equals(this.f10480c.mo28213e(str, "gaia_collection_enabled"));
    }

    /* renamed from: D */
    public final boolean mo28237D() {
        Boolean t = mo28252t("google_analytics_automatic_screen_reporting_enabled");
        return t == null || t.booleanValue();
    }

    /* renamed from: E */
    public final boolean mo28238E() {
        this.f10699a.mo28489d();
        Boolean t = mo28252t("firebase_analytics_collection_deactivated");
        return t != null && t.booleanValue();
    }

    /* renamed from: F */
    public final boolean mo28239F(String str) {
        return "1".equals(this.f10480c.mo28213e(str, "measurement.event_sampling_enabled"));
    }

    @WorkerThread
    /* renamed from: G */
    public final boolean mo28240G() {
        if (this.f10479b == null) {
            Boolean t = mo28252t("app_measurement_lite");
            this.f10479b = t;
            if (t == null) {
                this.f10479b = Boolean.FALSE;
            }
        }
        return this.f10479b.booleanValue() || !this.f10699a.mo28646s();
    }

    @EnsuresNonNull({"this.isMainProcess"})
    /* renamed from: H */
    public final boolean mo28241H() {
        if (this.f10481d == null) {
            synchronized (this) {
                if (this.f10481d == null) {
                    ApplicationInfo applicationInfo = this.f10699a.mo28490f().getApplicationInfo();
                    String a = C3563n.m9092a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        boolean z = false;
                        if (str != null && str.equals(a)) {
                            z = true;
                        }
                        this.f10481d = Boolean.valueOf(z);
                    }
                    if (this.f10481d == null) {
                        this.f10481d = Boolean.TRUE;
                        this.f10699a.mo28487b().mo28339r().mo28259a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f10481d.booleanValue();
    }

    /* renamed from: j */
    public final String mo28242j(String str, String str2) {
        Class<String> cls = String.class;
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{cls, cls}).invoke((Object) null, new Object[]{str, ""});
            C3495o.m8908j(str3);
            return str3;
        } catch (ClassNotFoundException e) {
            this.f10699a.mo28487b().mo28339r().mo28260b("Could not find SystemProperties class", e);
            return "";
        } catch (NoSuchMethodException e2) {
            this.f10699a.mo28487b().mo28339r().mo28260b("Could not find SystemProperties.get() method", e2);
            return "";
        } catch (IllegalAccessException e3) {
            this.f10699a.mo28487b().mo28339r().mo28260b("Could not access SystemProperties.get()", e3);
            return "";
        } catch (InvocationTargetException e4) {
            this.f10699a.mo28487b().mo28339r().mo28260b("SystemProperties.get() threw an exception", e4);
            return "";
        }
    }

    @WorkerThread
    /* renamed from: k */
    public final double mo28243k(String str, C5646t2 t2Var) {
        if (str == null) {
            return ((Double) t2Var.mo28613a((Object) null)).doubleValue();
        }
        String e = this.f10480c.mo28213e(str, t2Var.mo28614b());
        if (TextUtils.isEmpty(e)) {
            return ((Double) t2Var.mo28613a((Object) null)).doubleValue();
        }
        try {
            return ((Double) t2Var.mo28613a(Double.valueOf(Double.parseDouble(e)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) t2Var.mo28613a((Object) null)).doubleValue();
        }
    }

    /* renamed from: l */
    public final int mo28244l(@Size(min = 1) String str) {
        return mo28248p(str, C5658u2.f10944H, 500, 2000);
    }

    /* renamed from: m */
    public final int mo28245m() {
        C5498ga N = this.f10699a.mo28629N();
        Boolean J = N.f10699a.mo28627L().mo28563J();
        if (N.mo28303o0() < 201500) {
            return (J == null || J.booleanValue()) ? 25 : 100;
        }
        return 100;
    }

    /* renamed from: n */
    public final int mo28246n(@Size(min = 1) String str) {
        return mo28248p(str, C5658u2.f10945I, 25, 100);
    }

    @WorkerThread
    /* renamed from: o */
    public final int mo28247o(String str, C5646t2 t2Var) {
        if (str == null) {
            return ((Integer) t2Var.mo28613a((Object) null)).intValue();
        }
        String e = this.f10480c.mo28213e(str, t2Var.mo28614b());
        if (TextUtils.isEmpty(e)) {
            return ((Integer) t2Var.mo28613a((Object) null)).intValue();
        }
        try {
            return ((Integer) t2Var.mo28613a(Integer.valueOf(Integer.parseInt(e)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) t2Var.mo28613a((Object) null)).intValue();
        }
    }

    @WorkerThread
    /* renamed from: p */
    public final int mo28248p(String str, C5646t2 t2Var, int i, int i2) {
        return Math.max(Math.min(mo28247o(str, t2Var), i2), i);
    }

    /* renamed from: q */
    public final long mo28249q() {
        this.f10699a.mo28489d();
        return 74029;
    }

    @WorkerThread
    /* renamed from: r */
    public final long mo28250r(String str, C5646t2 t2Var) {
        if (str == null) {
            return ((Long) t2Var.mo28613a((Object) null)).longValue();
        }
        String e = this.f10480c.mo28213e(str, t2Var.mo28614b());
        if (TextUtils.isEmpty(e)) {
            return ((Long) t2Var.mo28613a((Object) null)).longValue();
        }
        try {
            return ((Long) t2Var.mo28613a(Long.valueOf(Long.parseLong(e)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) t2Var.mo28613a((Object) null)).longValue();
        }
    }

    /* renamed from: s */
    public final Bundle mo28251s() {
        try {
            if (this.f10699a.mo28490f().getPackageManager() == null) {
                this.f10699a.mo28487b().mo28339r().mo28259a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo c = C3573c.m9110a(this.f10699a.mo28490f()).mo20845c(this.f10699a.mo28490f().getPackageName(), 128);
            if (c != null) {
                return c.metaData;
            }
            this.f10699a.mo28487b().mo28339r().mo28259a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            this.f10699a.mo28487b().mo28339r().mo28260b("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    /* renamed from: t */
    public final Boolean mo28252t(@Size(min = 1) String str) {
        C3495o.m8904f(str);
        Bundle s = mo28251s();
        if (s == null) {
            this.f10699a.mo28487b().mo28339r().mo28259a("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (!s.containsKey(str)) {
            return null;
        } else {
            return Boolean.valueOf(s.getBoolean(str));
        }
    }

    /* renamed from: u */
    public final String mo28253u() {
        return mo28242j("debug.firebase.analytics.app", "");
    }

    /* renamed from: v */
    public final String mo28254v() {
        return mo28242j("debug.deferred.deeplink", "");
    }

    /* renamed from: w */
    public final String mo28255w() {
        this.f10699a.mo28489d();
        return "FA";
    }

    @WorkerThread
    /* renamed from: x */
    public final String mo28256x(String str, C5646t2 t2Var) {
        if (str == null) {
            return (String) t2Var.mo28613a((Object) null);
        }
        return (String) t2Var.mo28613a(this.f10480c.mo28213e(str, t2Var.mo28614b()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e A[SYNTHETIC, Splitter:B:8:0x002e] */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo28257y(@androidx.annotation.Size(min = 1) java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r4 = "analytics.safelisted_events"
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8904f(r4)
            android.os.Bundle r0 = r3.mo28251s()
            r1 = 0
            if (r0 != 0) goto L_0x001d
            c.q.a.c.i.b.t4 r4 = r3.f10699a
            c.q.a.c.i.b.i3 r4 = r4.mo28487b()
            c.q.a.c.i.b.g3 r4 = r4.mo28339r()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.mo28259a(r0)
        L_0x001b:
            r4 = r1
            goto L_0x002c
        L_0x001d:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L_0x0024
            goto L_0x001b
        L_0x0024:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L_0x002c:
            if (r4 == 0) goto L_0x0058
            c.q.a.c.i.b.t4 r0 = r3.f10699a     // Catch:{ NotFoundException -> 0x0048 }
            android.content.Context r0 = r0.mo28490f()     // Catch:{ NotFoundException -> 0x0048 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ NotFoundException -> 0x0048 }
            int r4 = r4.intValue()     // Catch:{ NotFoundException -> 0x0048 }
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch:{ NotFoundException -> 0x0048 }
            if (r4 != 0) goto L_0x0043
            return r1
        L_0x0043:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch:{ NotFoundException -> 0x0048 }
            return r4
        L_0x0048:
            r4 = move-exception
            c.q.a.c.i.b.t4 r0 = r3.f10699a
            c.q.a.c.i.b.i3 r0 = r0.mo28487b()
            c.q.a.c.i.b.g3 r0 = r0.mo28339r()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.mo28260b(r2, r4)
        L_0x0058:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p340i.p342b.C5487g.mo28257y(java.lang.String):java.util.List");
    }

    /* renamed from: z */
    public final void mo28258z(C5475f fVar) {
        this.f10480c = fVar;
    }
}
