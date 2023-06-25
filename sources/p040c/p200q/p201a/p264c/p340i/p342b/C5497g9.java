package p040c.p200q.p201a.p264c.p340i.p342b;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import kotlinx.coroutines.DebugKt;
import p040c.p200q.p201a.p264c.p294g.p335i.C5035dc;
import p040c.p200q.p201a.p264c.p294g.p335i.C5179md;

/* renamed from: c.q.a.c.i.b.g9 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5497g9 {

    /* renamed from: a */
    public final /* synthetic */ C5509h9 f10504a;

    public C5497g9(C5509h9 h9Var) {
        this.f10504a = h9Var;
    }

    @WorkerThread
    /* renamed from: a */
    public final void mo28267a() {
        this.f10504a.mo28029h();
        if (this.f10504a.f10699a.mo28622F().mo28686v(this.f10504a.f10699a.mo28488c().mo20838a())) {
            this.f10504a.f10699a.mo28622F().f11080l.mo28589a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f10504a.f10699a.mo28487b().mo28343v().mo28259a("Detected application was in foreground");
                mo28269c(this.f10504a.f10699a.mo28488c().mo20838a(), false);
            }
        }
    }

    @WorkerThread
    /* renamed from: b */
    public final void mo28268b(long j, boolean z) {
        this.f10504a.mo28029h();
        this.f10504a.mo28334s();
        if (this.f10504a.f10699a.mo28622F().mo28686v(j)) {
            this.f10504a.f10699a.mo28622F().f11080l.mo28589a(true);
            C5179md.m14505b();
            if (this.f10504a.f10699a.mo28649z().mo28235B((String) null, C5658u2.f10982j0)) {
                this.f10504a.f10699a.mo28618B().mo28710v();
            }
        }
        this.f10504a.f10699a.mo28622F().f11083o.mo28616b(j);
        if (this.f10504a.f10699a.mo28622F().f11080l.mo28590b()) {
            mo28269c(j, z);
        }
    }

    @WorkerThread
    /* renamed from: c */
    public final void mo28269c(long j, boolean z) {
        this.f10504a.mo28029h();
        if (this.f10504a.f10699a.mo28642o()) {
            this.f10504a.f10699a.mo28622F().f11083o.mo28616b(j);
            this.f10504a.f10699a.mo28487b().mo28343v().mo28260b("Session started, time", Long.valueOf(this.f10504a.f10699a.mo28488c().mo20839b()));
            Long valueOf = Long.valueOf(j / 1000);
            this.f10504a.f10699a.mo28624I().mo28045M(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_sid", valueOf, j);
            this.f10504a.f10699a.mo28622F().f11084p.mo28616b(valueOf.longValue());
            this.f10504a.f10699a.mo28622F().f11080l.mo28589a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", valueOf.longValue());
            if (this.f10504a.f10699a.mo28649z().mo28235B((String) null, C5658u2.f10964a0) && z) {
                bundle.putLong("_aib", 1);
            }
            this.f10504a.f10699a.mo28624I().mo28069v(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_s", j, bundle);
            C5035dc.m13991b();
            if (this.f10504a.f10699a.mo28649z().mo28235B((String) null, C5658u2.f10970d0)) {
                String a = this.f10504a.f10699a.mo28622F().f11089u.mo28670a();
                if (!TextUtils.isEmpty(a)) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("_ffr", a);
                    this.f10504a.f10699a.mo28624I().mo28069v(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ssr", j, bundle2);
                }
            }
        }
    }
}
