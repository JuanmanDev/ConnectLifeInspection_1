package p040c.p200q.p201a.p264c.p340i.p342b;

import android.os.Bundle;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import java.util.Map;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* renamed from: c.q.a.c.i.b.z1 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5712z1 extends C5419a3 {

    /* renamed from: b */
    public final Map f11184b = new ArrayMap();

    /* renamed from: c */
    public final Map f11185c = new ArrayMap();

    /* renamed from: d */
    public long f11186d;

    public C5712z1(C5648t4 t4Var) {
        super(t4Var);
    }

    /* renamed from: i */
    public static /* synthetic */ void m16289i(C5712z1 z1Var, String str, long j) {
        z1Var.mo28029h();
        C3495o.m8904f(str);
        if (z1Var.f11185c.isEmpty()) {
            z1Var.f11186d = j;
        }
        Integer num = (Integer) z1Var.f11185c.get(str);
        if (num != null) {
            z1Var.f11185c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (z1Var.f11185c.size() >= 100) {
            z1Var.f10699a.mo28487b().mo28344w().mo28259a("Too many ads visible");
        } else {
            z1Var.f11185c.put(str, 1);
            z1Var.f11184b.put(str, Long.valueOf(j));
        }
    }

    /* renamed from: j */
    public static /* synthetic */ void m16290j(C5712z1 z1Var, String str, long j) {
        z1Var.mo28029h();
        C3495o.m8904f(str);
        Integer num = (Integer) z1Var.f11185c.get(str);
        if (num != null) {
            C5519i7 s = z1Var.f10699a.mo28626K().mo28552s(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                z1Var.f11185c.remove(str);
                Long l = (Long) z1Var.f11184b.get(str);
                if (l == null) {
                    z1Var.f10699a.mo28487b().mo28339r().mo28259a("First ad unit exposure time was never set");
                } else {
                    long longValue = l.longValue();
                    z1Var.f11184b.remove(str);
                    z1Var.mo28772p(str, j - longValue, s);
                }
                if (z1Var.f11185c.isEmpty()) {
                    long j2 = z1Var.f11186d;
                    if (j2 == 0) {
                        z1Var.f10699a.mo28487b().mo28339r().mo28259a("First ad exposure time was never set");
                        return;
                    }
                    z1Var.mo28771o(j - j2, s);
                    z1Var.f11186d = 0;
                    return;
                }
                return;
            }
            z1Var.f11185c.put(str, Integer.valueOf(intValue));
            return;
        }
        z1Var.f10699a.mo28487b().mo28339r().mo28260b("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    /* renamed from: l */
    public final void mo28768l(String str, long j) {
        if (str == null || str.length() == 0) {
            this.f10699a.mo28487b().mo28339r().mo28259a("Ad unit id must be a non-empty string");
        } else {
            this.f10699a.mo28486a().mo28540z(new C5415a(this, str, j));
        }
    }

    /* renamed from: m */
    public final void mo28769m(String str, long j) {
        if (str == null || str.length() == 0) {
            this.f10699a.mo28487b().mo28339r().mo28259a("Ad unit id must be a non-empty string");
        } else {
            this.f10699a.mo28486a().mo28540z(new C5688x(this, str, j));
        }
    }

    @WorkerThread
    /* renamed from: n */
    public final void mo28770n(long j) {
        C5519i7 s = this.f10699a.mo28626K().mo28552s(false);
        for (String str : this.f11184b.keySet()) {
            mo28772p(str, j - ((Long) this.f11184b.get(str)).longValue(), s);
        }
        if (!this.f11184b.isEmpty()) {
            mo28771o(j - this.f11186d, s);
        }
        mo28773q(j);
    }

    @WorkerThread
    /* renamed from: o */
    public final void mo28771o(long j, C5519i7 i7Var) {
        if (i7Var == null) {
            this.f10699a.mo28487b().mo28343v().mo28259a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            this.f10699a.mo28487b().mo28343v().mo28260b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            C5498ga.m15697y(i7Var, bundle, true);
            this.f10699a.mo28624I().mo28068u("am", "_xa", bundle);
        }
    }

    @WorkerThread
    /* renamed from: p */
    public final void mo28772p(String str, long j, C5519i7 i7Var) {
        if (i7Var == null) {
            this.f10699a.mo28487b().mo28343v().mo28259a("Not logging ad unit exposure. No active activity");
        } else if (j < 1000) {
            this.f10699a.mo28487b().mo28343v().mo28260b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            C5498ga.m15697y(i7Var, bundle, true);
            this.f10699a.mo28624I().mo28068u("am", "_xu", bundle);
        }
    }

    @WorkerThread
    /* renamed from: q */
    public final void mo28773q(long j) {
        for (String put : this.f11184b.keySet()) {
            this.f11184b.put(put, Long.valueOf(j));
        }
        if (!this.f11184b.isEmpty()) {
            this.f11186d = j;
        }
    }
}
