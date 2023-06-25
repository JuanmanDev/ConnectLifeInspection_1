package p040c.p200q.p201a.p264c.p340i.p342b;

import android.content.SharedPreferences;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* renamed from: c.q.a.c.i.b.v3 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5670v3 {

    /* renamed from: a */
    public final String f11027a;

    /* renamed from: b */
    public final String f11028b;

    /* renamed from: c */
    public final String f11029c;

    /* renamed from: d */
    public final long f11030d;

    /* renamed from: e */
    public final /* synthetic */ C5692x3 f11031e;

    public /* synthetic */ C5670v3(C5692x3 x3Var, String str, long j, C5659u3 u3Var) {
        this.f11031e = x3Var;
        C3495o.m8904f("health_monitor");
        C3495o.m8899a(j > 0);
        this.f11027a = "health_monitor:start";
        this.f11028b = "health_monitor:count";
        this.f11029c = "health_monitor:value";
        this.f11030d = j;
    }

    @WorkerThread
    /* renamed from: a */
    public final Pair mo28661a() {
        long j;
        this.f11031e.mo28029h();
        this.f11031e.mo28029h();
        long c = mo28663c();
        if (c == 0) {
            mo28664d();
            j = 0;
        } else {
            j = Math.abs(c - this.f11031e.f10699a.mo28488c().mo20838a());
        }
        long j2 = this.f11030d;
        if (j < j2) {
            return null;
        }
        if (j > j2 + j2) {
            mo28664d();
            return null;
        }
        String string = this.f11031e.mo28679o().getString(this.f11029c, (String) null);
        long j3 = this.f11031e.mo28679o().getLong(this.f11028b, 0);
        mo28664d();
        if (string == null || j3 <= 0) {
            return C5692x3.f11070y;
        }
        return new Pair(string, Long.valueOf(j3));
    }

    @WorkerThread
    /* renamed from: b */
    public final void mo28662b(String str, long j) {
        this.f11031e.mo28029h();
        if (mo28663c() == 0) {
            mo28664d();
        }
        if (str == null) {
            str = "";
        }
        long j2 = this.f11031e.mo28679o().getLong(this.f11028b, 0);
        if (j2 <= 0) {
            SharedPreferences.Editor edit = this.f11031e.mo28679o().edit();
            edit.putString(this.f11029c, str);
            edit.putLong(this.f11028b, 1);
            edit.apply();
            return;
        }
        long nextLong = this.f11031e.f10699a.mo28629N().mo28312u().nextLong();
        long j3 = j2 + 1;
        SharedPreferences.Editor edit2 = this.f11031e.mo28679o().edit();
        if ((Long.MAX_VALUE & nextLong) < Long.MAX_VALUE / j3) {
            edit2.putString(this.f11029c, str);
        }
        edit2.putLong(this.f11028b, j3);
        edit2.apply();
    }

    @WorkerThread
    /* renamed from: c */
    public final long mo28663c() {
        return this.f11031e.mo28679o().getLong(this.f11027a, 0);
    }

    @WorkerThread
    /* renamed from: d */
    public final void mo28664d() {
        this.f11031e.mo28029h();
        long a = this.f11031e.f10699a.mo28488c().mo20838a();
        SharedPreferences.Editor edit = this.f11031e.mo28679o().edit();
        edit.remove(this.f11028b);
        edit.remove(this.f11029c);
        edit.putLong(this.f11027a, a);
        edit.apply();
    }
}
