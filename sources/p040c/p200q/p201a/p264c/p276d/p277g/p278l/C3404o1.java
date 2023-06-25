package p040c.p200q.p201a.p264c.p276d.p277g.p278l;

import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.zzb;

/* renamed from: c.q.a.c.d.g.l.o1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C3404o1 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ LifecycleCallback f6343e;

    /* renamed from: l */
    public final /* synthetic */ String f6344l;

    /* renamed from: m */
    public final /* synthetic */ zzb f6345m;

    public C3404o1(zzb zzb, LifecycleCallback lifecycleCallback, String str) {
        this.f6345m = zzb;
        this.f6343e = lifecycleCallback;
        this.f6344l = str;
    }

    public final void run() {
        zzb zzb = this.f6345m;
        if (zzb.f8203l > 0) {
            this.f6343e.mo20578f(zzb.f8204m != null ? zzb.f8204m.getBundle(this.f6344l) : null);
        }
        if (this.f6345m.f8203l >= 2) {
            this.f6343e.mo20580j();
        }
        if (this.f6345m.f8203l >= 3) {
            this.f6343e.mo20616h();
        }
        if (this.f6345m.f8203l >= 4) {
            this.f6343e.mo20581k();
        }
        if (this.f6345m.f8203l >= 5) {
            this.f6343e.mo24554g();
        }
    }
}
