package p040c.p200q.p201a.p264c.p340i.p342b;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.measurement.zzcl;
import com.google.android.gms.measurement.internal.zzah;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.DebugKt;
import org.checkerframework.dataflow.qual.Pure;
import org.checkerframework.dataflow.qual.SideEffectFree;
import org.json.JSONException;
import org.json.JSONObject;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p289n.C3553d;
import p040c.p200q.p201a.p264c.p276d.p289n.C3556g;
import p040c.p200q.p201a.p264c.p276d.p291o.C3573c;
import p040c.p200q.p201a.p264c.p294g.p335i.C5035dc;
import p040c.p200q.p201a.p264c.p294g.p335i.C5262s6;

/* renamed from: c.q.a.c.i.b.t4 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5648t4 implements C5601p5 {

    /* renamed from: H */
    public static volatile C5648t4 f10889H;

    /* renamed from: A */
    public volatile Boolean f10890A;

    /* renamed from: B */
    public Boolean f10891B;

    /* renamed from: C */
    public Boolean f10892C;

    /* renamed from: D */
    public volatile boolean f10893D;

    /* renamed from: E */
    public int f10894E;

    /* renamed from: F */
    public final AtomicInteger f10895F = new AtomicInteger(0);

    /* renamed from: G */
    public final long f10896G;

    /* renamed from: a */
    public final Context f10897a;

    /* renamed from: b */
    public final String f10898b;

    /* renamed from: c */
    public final String f10899c;

    /* renamed from: d */
    public final String f10900d;

    /* renamed from: e */
    public final boolean f10901e;

    /* renamed from: f */
    public final C5439c f10902f;

    /* renamed from: g */
    public final C5487g f10903g;

    /* renamed from: h */
    public final C5692x3 f10904h;

    /* renamed from: i */
    public final C5515i3 f10905i;

    /* renamed from: j */
    public final C5612q4 f10906j;

    /* renamed from: k */
    public final C5509h9 f10907k;

    /* renamed from: l */
    public final C5498ga f10908l;

    /* renamed from: m */
    public final C5455d3 f10909m;

    /* renamed from: n */
    public final C3553d f10910n;

    /* renamed from: o */
    public final C5615q7 f10911o;

    /* renamed from: p */
    public final C5423a7 f10912p;

    /* renamed from: q */
    public final C5712z1 f10913q;

    /* renamed from: r */
    public final C5483f7 f10914r;

    /* renamed from: s */
    public final String f10915s;

    /* renamed from: t */
    public C5431b3 f10916t;

    /* renamed from: u */
    public C5616q8 f10917u;

    /* renamed from: v */
    public C5595p f10918v;

    /* renamed from: w */
    public C5702y2 f10919w;

    /* renamed from: x */
    public boolean f10920x = false;

    /* renamed from: y */
    public Boolean f10921y;

    /* renamed from: z */
    public long f10922z;

    public C5648t4(C5694x5 x5Var) {
        long j;
        Bundle bundle;
        boolean z = false;
        C3495o.m8908j(x5Var);
        Context context = x5Var.f11097a;
        C5439c cVar = new C5439c(context);
        this.f10902f = cVar;
        C5622r2.f10812a = cVar;
        this.f10897a = context;
        this.f10898b = x5Var.f11098b;
        this.f10899c = x5Var.f11099c;
        this.f10900d = x5Var.f11100d;
        this.f10901e = x5Var.f11104h;
        this.f10890A = x5Var.f11101e;
        this.f10915s = x5Var.f11106j;
        this.f10893D = true;
        zzcl zzcl = x5Var.f11103g;
        if (!(zzcl == null || (bundle = zzcl.f14811q) == null)) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f10891B = (Boolean) obj;
            }
            Object obj2 = zzcl.f14811q.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f10892C = (Boolean) obj2;
            }
        }
        C5262s6.m14810e(this.f10897a);
        C3553d c = C3556g.m9065c();
        this.f10910n = c;
        Long l = x5Var.f11105i;
        if (l != null) {
            j = l.longValue();
        } else {
            j = c.mo20838a();
        }
        this.f10896G = j;
        this.f10903g = new C5487g(this);
        C5692x3 x3Var = new C5692x3(this);
        x3Var.mo28503l();
        this.f10904h = x3Var;
        C5515i3 i3Var = new C5515i3(this);
        i3Var.mo28503l();
        this.f10905i = i3Var;
        C5498ga gaVar = new C5498ga(this);
        gaVar.mo28503l();
        this.f10908l = gaVar;
        this.f10909m = new C5455d3(new C5683w5(x5Var, this));
        this.f10913q = new C5712z1(this);
        C5615q7 q7Var = new C5615q7(this);
        q7Var.mo28107j();
        this.f10911o = q7Var;
        C5423a7 a7Var = new C5423a7(this);
        a7Var.mo28107j();
        this.f10912p = a7Var;
        C5509h9 h9Var = new C5509h9(this);
        h9Var.mo28107j();
        this.f10907k = h9Var;
        C5483f7 f7Var = new C5483f7(this);
        f7Var.mo28503l();
        this.f10914r = f7Var;
        C5612q4 q4Var = new C5612q4(this);
        q4Var.mo28503l();
        this.f10906j = q4Var;
        zzcl zzcl2 = x5Var.f11103g;
        z = (zzcl2 == null || zzcl2.f14806l == 0) ? true : z;
        if (this.f10897a.getApplicationContext() instanceof Application) {
            C5423a7 I = mo28624I();
            if (I.f10699a.f10897a.getApplicationContext() instanceof Application) {
                Application application = (Application) I.f10699a.f10897a.getApplicationContext();
                if (I.f10322c == null) {
                    I.f10322c = new C5717z6(I, (C5706y6) null);
                }
                if (z) {
                    application.unregisterActivityLifecycleCallbacks(I.f10322c);
                    application.registerActivityLifecycleCallbacks(I.f10322c);
                    I.f10699a.mo28487b().mo28343v().mo28259a("Registered activity lifecycle callback");
                }
            }
        } else {
            mo28487b().mo28344w().mo28259a("Application context is not an Application");
        }
        this.f10906j.mo28540z(new C5636s4(this, x5Var));
    }

    /* renamed from: H */
    public static C5648t4 m16090H(Context context, zzcl zzcl, Long l) {
        Bundle bundle;
        if (zzcl != null && (zzcl.f14809o == null || zzcl.f14810p == null)) {
            zzcl = new zzcl(zzcl.f14805e, zzcl.f14806l, zzcl.f14807m, zzcl.f14808n, (String) null, (String) null, zzcl.f14811q, (String) null);
        }
        C3495o.m8908j(context);
        C3495o.m8908j(context.getApplicationContext());
        if (f10889H == null) {
            synchronized (C5648t4.class) {
                if (f10889H == null) {
                    f10889H = new C5648t4(new C5694x5(context, zzcl, l));
                }
            }
        } else if (!(zzcl == null || (bundle = zzcl.f14811q) == null || !bundle.containsKey("dataCollectionDefaultEnabled"))) {
            C3495o.m8908j(f10889H);
            f10889H.f10890A = Boolean.valueOf(zzcl.f14811q.getBoolean("dataCollectionDefaultEnabled"));
        }
        C3495o.m8908j(f10889H);
        return f10889H;
    }

    /* renamed from: e */
    public static /* bridge */ /* synthetic */ void m16091e(C5648t4 t4Var, C5694x5 x5Var) {
        t4Var.mo28486a().mo28029h();
        t4Var.f10903g.mo28255w();
        C5595p pVar = new C5595p(t4Var);
        pVar.mo28503l();
        t4Var.f10918v = pVar;
        C5702y2 y2Var = new C5702y2(t4Var, x5Var.f11102f);
        y2Var.mo28107j();
        t4Var.f10919w = y2Var;
        C5431b3 b3Var = new C5431b3(t4Var);
        b3Var.mo28107j();
        t4Var.f10916t = b3Var;
        C5616q8 q8Var = new C5616q8(t4Var);
        q8Var.mo28107j();
        t4Var.f10917u = q8Var;
        t4Var.f10908l.mo28504m();
        t4Var.f10904h.mo28504m();
        t4Var.f10919w.mo28108k();
        C5491g3 u = t4Var.mo28487b().mo28342u();
        t4Var.f10903g.mo28249q();
        u.mo28260b("App measurement initialized, version", 74029L);
        t4Var.mo28487b().mo28342u().mo28259a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String s = y2Var.mo28707s();
        if (TextUtils.isEmpty(t4Var.f10898b)) {
            if (t4Var.mo28629N().mo28289T(s)) {
                t4Var.mo28487b().mo28342u().mo28259a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                t4Var.mo28487b().mo28342u().mo28259a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(s)));
            }
        }
        t4Var.mo28487b().mo28338q().mo28259a("Debug-level message logging enabled");
        if (t4Var.f10894E != t4Var.f10895F.get()) {
            t4Var.mo28487b().mo28339r().mo28261c("Not all components initialized", Integer.valueOf(t4Var.f10894E), Integer.valueOf(t4Var.f10895F.get()));
        }
        t4Var.f10920x = true;
    }

    /* renamed from: t */
    public static final void m16092t() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* renamed from: u */
    public static final void m16093u(C5577n5 n5Var) {
        if (n5Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* renamed from: v */
    public static final void m16094v(C5432b4 b4Var) {
        if (b4Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!b4Var.mo28110m()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(String.valueOf(b4Var.getClass()))));
        }
    }

    /* renamed from: w */
    public static final void m16095w(C5589o5 o5Var) {
        if (o5Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!o5Var.mo28505n()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(String.valueOf(o5Var.getClass()))));
        }
    }

    @Pure
    /* renamed from: A */
    public final C5595p mo28617A() {
        m16095w(this.f10918v);
        return this.f10918v;
    }

    @Pure
    /* renamed from: B */
    public final C5702y2 mo28618B() {
        m16094v(this.f10919w);
        return this.f10919w;
    }

    @Pure
    /* renamed from: C */
    public final C5431b3 mo28619C() {
        m16094v(this.f10916t);
        return this.f10916t;
    }

    @Pure
    /* renamed from: D */
    public final C5455d3 mo28620D() {
        return this.f10909m;
    }

    /* renamed from: E */
    public final C5515i3 mo28621E() {
        C5515i3 i3Var = this.f10905i;
        if (i3Var == null || !i3Var.mo28505n()) {
            return null;
        }
        return i3Var;
    }

    @Pure
    /* renamed from: F */
    public final C5692x3 mo28622F() {
        m16093u(this.f10904h);
        return this.f10904h;
    }

    @SideEffectFree
    /* renamed from: G */
    public final C5612q4 mo28623G() {
        return this.f10906j;
    }

    @Pure
    /* renamed from: I */
    public final C5423a7 mo28624I() {
        m16094v(this.f10912p);
        return this.f10912p;
    }

    @Pure
    /* renamed from: J */
    public final C5483f7 mo28625J() {
        m16095w(this.f10914r);
        return this.f10914r;
    }

    @Pure
    /* renamed from: K */
    public final C5615q7 mo28626K() {
        m16094v(this.f10911o);
        return this.f10911o;
    }

    @Pure
    /* renamed from: L */
    public final C5616q8 mo28627L() {
        m16094v(this.f10917u);
        return this.f10917u;
    }

    @Pure
    /* renamed from: M */
    public final C5509h9 mo28628M() {
        m16094v(this.f10907k);
        return this.f10907k;
    }

    @Pure
    /* renamed from: N */
    public final C5498ga mo28629N() {
        m16093u(this.f10908l);
        return this.f10908l;
    }

    @Pure
    /* renamed from: O */
    public final String mo28630O() {
        return this.f10898b;
    }

    @Pure
    /* renamed from: P */
    public final String mo28631P() {
        return this.f10899c;
    }

    @Pure
    /* renamed from: Q */
    public final String mo28632Q() {
        return this.f10900d;
    }

    @Pure
    /* renamed from: R */
    public final String mo28633R() {
        return this.f10915s;
    }

    @Pure
    /* renamed from: a */
    public final C5612q4 mo28486a() {
        m16095w(this.f10906j);
        return this.f10906j;
    }

    @Pure
    /* renamed from: b */
    public final C5515i3 mo28487b() {
        m16095w(this.f10905i);
        return this.f10905i;
    }

    @Pure
    /* renamed from: c */
    public final C3553d mo28488c() {
        return this.f10910n;
    }

    @Pure
    /* renamed from: d */
    public final C5439c mo28489d() {
        return this.f10902f;
    }

    @Pure
    /* renamed from: f */
    public final Context mo28490f() {
        return this.f10897a;
    }

    /* renamed from: g */
    public final void mo28634g() {
        this.f10895F.incrementAndGet();
    }

    /* renamed from: h */
    public final /* synthetic */ void mo28635h(String str, int i, Throwable th, byte[] bArr, Map map) {
        if (!(i == 200 || i == 204)) {
            if (i == 304) {
                i = 304;
            }
            mo28487b().mo28344w().mo28261c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
        }
        if (th == null) {
            mo28622F().f11087s.mo28589a(true);
            if (bArr == null || bArr.length == 0) {
                mo28487b().mo28338q().mo28259a("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String optString = jSONObject.optString("deeplink", "");
                String optString2 = jSONObject.optString("gclid", "");
                double optDouble = jSONObject.optDouble(NotificationCompat.CarExtender.KEY_TIMESTAMP, 0.0d);
                if (TextUtils.isEmpty(optString)) {
                    mo28487b().mo28338q().mo28259a("Deferred Deep Link is empty.");
                    return;
                }
                C5498ga N = mo28629N();
                C5648t4 t4Var = N.f10699a;
                if (!TextUtils.isEmpty(optString)) {
                    List<ResolveInfo> queryIntentActivities = N.f10699a.f10897a.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0);
                    if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                        Bundle bundle = new Bundle();
                        bundle.putString("gclid", optString2);
                        bundle.putString("_cis", "ddp");
                        this.f10912p.mo28068u(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_cmp", bundle);
                        C5498ga N2 = mo28629N();
                        if (!TextUtils.isEmpty(optString)) {
                            try {
                                SharedPreferences.Editor edit = N2.f10699a.f10897a.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                edit.putString("deeplink", optString);
                                edit.putLong(NotificationCompat.CarExtender.KEY_TIMESTAMP, Double.doubleToRawLongBits(optDouble));
                                if (edit.commit()) {
                                    N2.f10699a.f10897a.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                    return;
                                }
                                return;
                            } catch (RuntimeException e) {
                                N2.f10699a.mo28487b().mo28339r().mo28260b("Failed to persist Deferred Deep Link. exception", e);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
                mo28487b().mo28344w().mo28261c("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                return;
            } catch (JSONException e2) {
                mo28487b().mo28339r().mo28260b("Failed to parse the Deferred Deep Link response. exception", e2);
                return;
            }
        }
        mo28487b().mo28344w().mo28261c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
    }

    /* renamed from: i */
    public final void mo28636i() {
        this.f10894E++;
    }

    @WorkerThread
    /* renamed from: j */
    public final void mo28637j() {
        mo28486a().mo28029h();
        m16095w(mo28625J());
        String s = mo28618B().mo28707s();
        Pair p = mo28622F().mo28680p(s);
        if (!this.f10903g.mo28234A() || ((Boolean) p.second).booleanValue() || TextUtils.isEmpty((CharSequence) p.first)) {
            mo28487b().mo28338q().mo28259a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return;
        }
        C5483f7 J = mo28625J();
        J.mo28502k();
        ConnectivityManager connectivityManager = (ConnectivityManager) J.f10699a.f10897a.getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            mo28487b().mo28344w().mo28259a("Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        C5498ga N = mo28629N();
        mo28618B().f10699a.f10903g.mo28249q();
        URL s2 = N.mo28309s(74029, s, (String) p.first, mo28622F().f11088t.mo28615a() - 1);
        if (s2 != null) {
            C5483f7 J2 = mo28625J();
            C5624r4 r4Var = new C5624r4(this);
            J2.mo28029h();
            J2.mo28502k();
            C3495o.m8908j(s2);
            C3495o.m8908j(r4Var);
            J2.f10699a.mo28486a().mo28539y(new C5471e7(J2, s, s2, (byte[]) null, (Map) null, r4Var, (byte[]) null));
        }
    }

    @WorkerThread
    /* renamed from: k */
    public final void mo28638k(boolean z) {
        this.f10890A = Boolean.valueOf(z);
    }

    @WorkerThread
    /* renamed from: l */
    public final void mo28639l(boolean z) {
        mo28486a().mo28029h();
        this.f10893D = z;
    }

    @WorkerThread
    /* renamed from: m */
    public final void mo28640m(zzcl zzcl) {
        C5499h hVar;
        mo28486a().mo28029h();
        C5499h q = mo28622F().mo28681q();
        C5692x3 F = mo28622F();
        C5648t4 t4Var = F.f10699a;
        F.mo28029h();
        int i = 100;
        int i2 = F.mo28679o().getInt("consent_source", 100);
        C5487g gVar = this.f10903g;
        C5648t4 t4Var2 = gVar.f10699a;
        Boolean t = gVar.mo28252t("google_analytics_default_allow_ad_storage");
        C5487g gVar2 = this.f10903g;
        C5648t4 t4Var3 = gVar2.f10699a;
        Boolean t2 = gVar2.mo28252t("google_analytics_default_allow_analytics_storage");
        if (!(t == null && t2 == null) && mo28622F().mo28687w(-10)) {
            hVar = new C5499h(t, t2);
            i = -10;
        } else {
            if (!TextUtils.isEmpty(mo28618B().mo28708t()) && (i2 == 0 || i2 == 30 || i2 == 10 || i2 == 30 || i2 == 30 || i2 == 40)) {
                mo28624I().mo28039G(C5499h.f10511b, -10, this.f10896G);
            } else if (TextUtils.isEmpty(mo28618B().mo28708t()) && zzcl != null && zzcl.f14811q != null && mo28622F().mo28687w(30)) {
                hVar = C5499h.m15748a(zzcl.f14811q);
                if (!hVar.equals(C5499h.f10511b)) {
                    i = 30;
                }
            }
            hVar = null;
        }
        if (hVar != null) {
            mo28624I().mo28039G(hVar, i, this.f10896G);
            q = hVar;
        }
        mo28624I().mo28042J(q);
        if (mo28622F().f11073e.mo28615a() == 0) {
            mo28487b().mo28343v().mo28260b("Persisting first open", Long.valueOf(this.f10896G));
            mo28622F().f11073e.mo28616b(this.f10896G);
        }
        mo28624I().f10333n.mo28480c();
        if (mo28645r()) {
            if (!TextUtils.isEmpty(mo28618B().mo28708t()) || !TextUtils.isEmpty(mo28618B().mo28706r())) {
                C5498ga N = mo28629N();
                String t3 = mo28618B().mo28708t();
                C5692x3 F2 = mo28622F();
                F2.mo28029h();
                String string = F2.mo28679o().getString("gmp_app_id", (String) null);
                String r = mo28618B().mo28706r();
                C5692x3 F3 = mo28622F();
                F3.mo28029h();
                if (N.mo28292b0(t3, string, r, F3.mo28679o().getString("admob_app_id", (String) null))) {
                    mo28487b().mo28342u().mo28259a("Rechecking which service to use due to a GMP App Id change");
                    C5692x3 F4 = mo28622F();
                    F4.mo28029h();
                    Boolean r2 = F4.mo28682r();
                    SharedPreferences.Editor edit = F4.mo28679o().edit();
                    edit.clear();
                    edit.apply();
                    if (r2 != null) {
                        F4.mo28683s(r2);
                    }
                    mo28619C().mo28098q();
                    this.f10917u.mo28566Q();
                    this.f10917u.mo28565P();
                    mo28622F().f11073e.mo28616b(this.f10896G);
                    mo28622F().f11075g.mo28671b((String) null);
                }
                C5692x3 F5 = mo28622F();
                String t4 = mo28618B().mo28708t();
                F5.mo28029h();
                SharedPreferences.Editor edit2 = F5.mo28679o().edit();
                edit2.putString("gmp_app_id", t4);
                edit2.apply();
                C5692x3 F6 = mo28622F();
                String r3 = mo28618B().mo28706r();
                F6.mo28029h();
                SharedPreferences.Editor edit3 = F6.mo28679o().edit();
                edit3.putString("admob_app_id", r3);
                edit3.apply();
            }
            if (!mo28622F().mo28681q().mo28326i(zzah.ANALYTICS_STORAGE)) {
                mo28622F().f11075g.mo28671b((String) null);
            }
            mo28624I().mo28035C(mo28622F().f11075g.mo28670a());
            C5035dc.m13991b();
            if (this.f10903g.mo28235B((String) null, C5658u2.f10970d0)) {
                try {
                    mo28629N().f10699a.f10897a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                } catch (ClassNotFoundException unused) {
                    if (!TextUtils.isEmpty(mo28622F().f11089u.mo28670a())) {
                        mo28487b().mo28344w().mo28259a("Remote config removed with active feature rollouts");
                        mo28622F().f11089u.mo28671b((String) null);
                    }
                }
            }
            if (!TextUtils.isEmpty(mo28618B().mo28708t()) || !TextUtils.isEmpty(mo28618B().mo28706r())) {
                boolean o = mo28642o();
                if (!mo28622F().mo28685u() && !this.f10903g.mo28238E()) {
                    mo28622F().mo28684t(!o);
                }
                if (o) {
                    mo28624I().mo28060f0();
                }
                mo28628M().f10529d.mo28267a();
                mo28627L().mo28568S(new AtomicReference());
                mo28627L().mo28580v(mo28622F().f11092x.mo28602a());
            }
        } else if (mo28642o()) {
            if (!mo28629N().mo28288S("android.permission.INTERNET")) {
                mo28487b().mo28339r().mo28259a("App is missing INTERNET permission");
            }
            if (!mo28629N().mo28288S("android.permission.ACCESS_NETWORK_STATE")) {
                mo28487b().mo28339r().mo28259a("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!C3573c.m9110a(this.f10897a).mo20848f() && !this.f10903g.mo28240G()) {
                if (!C5498ga.m15687Y(this.f10897a)) {
                    mo28487b().mo28339r().mo28259a("AppMeasurementReceiver not registered/enabled");
                }
                if (!C5498ga.m15688Z(this.f10897a, false)) {
                    mo28487b().mo28339r().mo28259a("AppMeasurementService not registered/enabled");
                }
            }
            mo28487b().mo28339r().mo28259a("Uploading is not possible. App measurement disabled");
        }
        mo28622F().f11082n.mo28589a(true);
    }

    @WorkerThread
    /* renamed from: n */
    public final boolean mo28641n() {
        return this.f10890A != null && this.f10890A.booleanValue();
    }

    @WorkerThread
    /* renamed from: o */
    public final boolean mo28642o() {
        return mo28647x() == 0;
    }

    @WorkerThread
    /* renamed from: p */
    public final boolean mo28643p() {
        mo28486a().mo28029h();
        return this.f10893D;
    }

    @Pure
    /* renamed from: q */
    public final boolean mo28644q() {
        return TextUtils.isEmpty(this.f10898b);
    }

    @WorkerThread
    /* renamed from: r */
    public final boolean mo28645r() {
        if (this.f10920x) {
            mo28486a().mo28029h();
            Boolean bool = this.f10921y;
            if (bool == null || this.f10922z == 0 || (!bool.booleanValue() && Math.abs(this.f10910n.mo20839b() - this.f10922z) > 1000)) {
                this.f10922z = this.f10910n.mo20839b();
                boolean z = true;
                Boolean valueOf = Boolean.valueOf(mo28629N().mo28288S("android.permission.INTERNET") && mo28629N().mo28288S("android.permission.ACCESS_NETWORK_STATE") && (C3573c.m9110a(this.f10897a).mo20848f() || this.f10903g.mo28240G() || (C5498ga.m15687Y(this.f10897a) && C5498ga.m15688Z(this.f10897a, false))));
                this.f10921y = valueOf;
                if (valueOf.booleanValue()) {
                    if (!mo28629N().mo28281L(mo28618B().mo28708t(), mo28618B().mo28706r()) && TextUtils.isEmpty(mo28618B().mo28706r())) {
                        z = false;
                    }
                    this.f10921y = Boolean.valueOf(z);
                }
            }
            return this.f10921y.booleanValue();
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    @Pure
    /* renamed from: s */
    public final boolean mo28646s() {
        return this.f10901e;
    }

    @WorkerThread
    /* renamed from: x */
    public final int mo28647x() {
        mo28486a().mo28029h();
        if (this.f10903g.mo28238E()) {
            return 1;
        }
        Boolean bool = this.f10892C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        mo28486a().mo28029h();
        if (!this.f10893D) {
            return 8;
        }
        Boolean r = mo28622F().mo28682r();
        if (r == null) {
            C5487g gVar = this.f10903g;
            C5439c cVar = gVar.f10699a.f10902f;
            Boolean t = gVar.mo28252t("firebase_analytics_collection_enabled");
            if (t == null) {
                Boolean bool2 = this.f10891B;
                if (bool2 != null) {
                    if (bool2.booleanValue()) {
                        return 0;
                    }
                    return 5;
                } else if (this.f10890A == null || this.f10890A.booleanValue()) {
                    return 0;
                } else {
                    return 7;
                }
            } else if (t.booleanValue()) {
                return 0;
            } else {
                return 4;
            }
        } else if (r.booleanValue()) {
            return 0;
        } else {
            return 3;
        }
    }

    @Pure
    /* renamed from: y */
    public final C5712z1 mo28648y() {
        C5712z1 z1Var = this.f10913q;
        if (z1Var != null) {
            return z1Var;
        }
        throw new IllegalStateException("Component not created");
    }

    @Pure
    /* renamed from: z */
    public final C5487g mo28649z() {
        return this.f10903g;
    }
}
