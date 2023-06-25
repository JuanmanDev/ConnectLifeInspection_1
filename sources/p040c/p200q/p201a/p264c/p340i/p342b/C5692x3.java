package p040c.p200q.p201a.p264c.p340i.p342b;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p040c.p200q.p201a.p264c.p265a.p266a.C3220a;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* renamed from: c.q.a.c.i.b.x3 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5692x3 extends C5589o5 {

    /* renamed from: y */
    public static final Pair f11070y = new Pair("", 0L);

    /* renamed from: c */
    public SharedPreferences f11071c;

    /* renamed from: d */
    public C5670v3 f11072d;

    /* renamed from: e */
    public final C5647t3 f11073e = new C5647t3(this, "first_open_time", 0);

    /* renamed from: f */
    public final C5647t3 f11074f = new C5647t3(this, "app_install_time", 0);

    /* renamed from: g */
    public final C5681w3 f11075g = new C5681w3(this, "app_instance_id", (String) null);

    /* renamed from: h */
    public String f11076h;

    /* renamed from: i */
    public boolean f11077i;

    /* renamed from: j */
    public long f11078j;

    /* renamed from: k */
    public final C5647t3 f11079k = new C5647t3(this, "session_timeout", 1800000);

    /* renamed from: l */
    public final C5623r3 f11080l = new C5623r3(this, "start_new_session", true);

    /* renamed from: m */
    public final C5681w3 f11081m = new C5681w3(this, "non_personalized_ads", (String) null);

    /* renamed from: n */
    public final C5623r3 f11082n = new C5623r3(this, "allow_remote_dynamite", false);

    /* renamed from: o */
    public final C5647t3 f11083o = new C5647t3(this, "last_pause_time", 0);

    /* renamed from: p */
    public final C5647t3 f11084p = new C5647t3(this, "session_id", 0);

    /* renamed from: q */
    public boolean f11085q;

    /* renamed from: r */
    public final C5623r3 f11086r = new C5623r3(this, "app_backgrounded", false);

    /* renamed from: s */
    public final C5623r3 f11087s = new C5623r3(this, "deep_link_retrieval_complete", false);

    /* renamed from: t */
    public final C5647t3 f11088t = new C5647t3(this, "deep_link_retrieval_attempts", 0);

    /* renamed from: u */
    public final C5681w3 f11089u = new C5681w3(this, "firebase_feature_rollouts", (String) null);

    /* renamed from: v */
    public final C5681w3 f11090v = new C5681w3(this, "deferred_attribution_cache", (String) null);

    /* renamed from: w */
    public final C5647t3 f11091w = new C5647t3(this, "deferred_attribution_cache_timestamp", 0);

    /* renamed from: x */
    public final C5635s3 f11092x = new C5635s3(this, "default_event_parameters", (Bundle) null);

    public C5692x3(C5648t4 t4Var) {
        super(t4Var);
    }

    @WorkerThread
    @EnsuresNonNull.List({@EnsuresNonNull({"this.preferences"}), @EnsuresNonNull({"this.monitoringSample"})})
    /* renamed from: i */
    public final void mo28296i() {
        SharedPreferences sharedPreferences = this.f10699a.mo28490f().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f11071c = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.f11085q = z;
        if (!z) {
            SharedPreferences.Editor edit = this.f11071c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.f10699a.mo28649z();
        this.f11072d = new C5670v3(this, "health_monitor", Math.max(0, ((Long) C5658u2.f10967c.mo28613a((Object) null)).longValue()), (C5659u3) null);
    }

    /* renamed from: j */
    public final boolean mo28227j() {
        return true;
    }

    @WorkerThread
    /* renamed from: o */
    public final SharedPreferences mo28679o() {
        mo28029h();
        mo28502k();
        C3495o.m8908j(this.f11071c);
        return this.f11071c;
    }

    @WorkerThread
    /* renamed from: p */
    public final Pair mo28680p(String str) {
        mo28029h();
        long b = this.f10699a.mo28488c().mo20839b();
        String str2 = this.f11076h;
        if (str2 != null && b < this.f11078j) {
            return new Pair(str2, Boolean.valueOf(this.f11077i));
        }
        this.f11078j = b + this.f10699a.mo28649z().mo28250r(str, C5658u2.f10965b);
        C3220a.m8279b(true);
        try {
            C3220a.C3221a a = C3220a.m8278a(this.f10699a.mo28490f());
            this.f11076h = "";
            String a2 = a.mo20225a();
            if (a2 != null) {
                this.f11076h = a2;
            }
            this.f11077i = a.mo20226b();
        } catch (Exception e) {
            this.f10699a.mo28487b().mo28338q().mo28260b("Unable to get advertising id", e);
            this.f11076h = "";
        }
        C3220a.m8279b(false);
        return new Pair(this.f11076h, Boolean.valueOf(this.f11077i));
    }

    @WorkerThread
    /* renamed from: q */
    public final C5499h mo28681q() {
        mo28029h();
        return C5499h.m15749b(mo28679o().getString("consent_settings", "G1"));
    }

    @WorkerThread
    /* renamed from: r */
    public final Boolean mo28682r() {
        mo28029h();
        if (mo28679o().contains("measurement_enabled")) {
            return Boolean.valueOf(mo28679o().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    @WorkerThread
    /* renamed from: s */
    public final void mo28683s(Boolean bool) {
        mo28029h();
        SharedPreferences.Editor edit = mo28679o().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    @WorkerThread
    /* renamed from: t */
    public final void mo28684t(boolean z) {
        mo28029h();
        this.f10699a.mo28487b().mo28343v().mo28260b("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor edit = mo28679o().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    @WorkerThread
    /* renamed from: u */
    public final boolean mo28685u() {
        SharedPreferences sharedPreferences = this.f11071c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    /* renamed from: v */
    public final boolean mo28686v(long j) {
        return j - this.f11079k.mo28615a() > this.f11083o.mo28615a();
    }

    @WorkerThread
    /* renamed from: w */
    public final boolean mo28687w(int i) {
        return C5499h.m15751j(i, mo28679o().getInt("consent_source", 100));
    }
}
