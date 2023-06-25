package p040c.p200q.p201a.p264c.p340i.p342b;

import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzq;
import java.util.concurrent.Callable;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* renamed from: c.q.a.c.i.b.r9 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5629r9 implements Callable {

    /* renamed from: e */
    public final /* synthetic */ zzq f10834e;

    /* renamed from: l */
    public final /* synthetic */ C5709y9 f10835l;

    public C5629r9(C5709y9 y9Var, zzq zzq) {
        this.f10835l = y9Var;
        this.f10834e = zzq;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C5709y9 y9Var = this.f10835l;
        String str = this.f10834e.f14918e;
        C3495o.m8908j(str);
        if (y9Var.mo28733U(str).mo28326i(zzah.ANALYTICS_STORAGE) && C5499h.m15749b(this.f10834e.f14915F).mo28326i(zzah.ANALYTICS_STORAGE)) {
            return this.f10835l.mo28731S(this.f10834e).mo28184e0();
        }
        this.f10835l.mo28487b().mo28343v().mo28259a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
