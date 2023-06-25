package p040c.p200q.p201a.p264c.p276d.p277g.p278l;

import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.zzd;

/* renamed from: c.q.a.c.d.g.l.p1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C3407p1 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ LifecycleCallback f6348e;

    /* renamed from: l */
    public final /* synthetic */ String f6349l;

    /* renamed from: m */
    public final /* synthetic */ zzd f6350m;

    public C3407p1(zzd zzd, LifecycleCallback lifecycleCallback, String str) {
        this.f6350m = zzd;
        this.f6348e = lifecycleCallback;
        this.f6349l = str;
    }

    public final void run() {
        zzd zzd = this.f6350m;
        if (zzd.f8207l > 0) {
            this.f6348e.mo20578f(zzd.f8208m != null ? zzd.f8208m.getBundle(this.f6349l) : null);
        }
        if (this.f6350m.f8207l >= 2) {
            this.f6348e.mo20580j();
        }
        if (this.f6350m.f8207l >= 3) {
            this.f6348e.mo20616h();
        }
        if (this.f6350m.f8207l >= 4) {
            this.f6348e.mo20581k();
        }
        if (this.f6350m.f8207l >= 5) {
            this.f6348e.mo24554g();
        }
    }
}
