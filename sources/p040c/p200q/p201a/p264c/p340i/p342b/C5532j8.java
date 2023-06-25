package p040c.p200q.p201a.p264c.p340i.p342b;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzq;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* renamed from: c.q.a.c.i.b.j8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5532j8 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ AtomicReference f10592e;

    /* renamed from: l */
    public final /* synthetic */ String f10593l;

    /* renamed from: m */
    public final /* synthetic */ String f10594m;

    /* renamed from: n */
    public final /* synthetic */ zzq f10595n;

    /* renamed from: o */
    public final /* synthetic */ boolean f10596o;

    /* renamed from: p */
    public final /* synthetic */ C5616q8 f10597p;

    public C5532j8(C5616q8 q8Var, AtomicReference atomicReference, String str, String str2, String str3, zzq zzq, boolean z) {
        this.f10597p = q8Var;
        this.f10592e = atomicReference;
        this.f10593l = str2;
        this.f10594m = str3;
        this.f10595n = zzq;
        this.f10596o = z;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f10592e) {
            try {
                C5616q8 q8Var = this.f10597p;
                C5691x2 H = q8Var.f10788d;
                if (H == null) {
                    q8Var.f10699a.mo28487b().mo28339r().mo28262d("(legacy) Failed to get user properties; not connected to service", (Object) null, this.f10593l, this.f10594m);
                    this.f10592e.set(Collections.emptyList());
                    this.f10592e.notify();
                    return;
                }
                if (TextUtils.isEmpty((CharSequence) null)) {
                    C3495o.m8908j(this.f10595n);
                    this.f10592e.set(H.mo28455T(this.f10593l, this.f10594m, this.f10596o, this.f10595n));
                } else {
                    this.f10592e.set(H.mo28466p((String) null, this.f10593l, this.f10594m, this.f10596o));
                }
                this.f10597p.mo28560E();
                atomicReference = this.f10592e;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.f10597p.f10699a.mo28487b().mo28339r().mo28262d("(legacy) Failed to get user properties; remote exception", (Object) null, this.f10593l, e);
                    this.f10592e.set(Collections.emptyList());
                    atomicReference = this.f10592e;
                } catch (Throwable th) {
                    this.f10592e.notify();
                    throw th;
                }
            }
        }
    }
}
