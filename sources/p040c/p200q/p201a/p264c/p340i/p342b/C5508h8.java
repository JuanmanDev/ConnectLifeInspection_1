package p040c.p200q.p201a.p264c.p340i.p342b;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzq;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* renamed from: c.q.a.c.i.b.h8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5508h8 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ AtomicReference f10523e;

    /* renamed from: l */
    public final /* synthetic */ String f10524l;

    /* renamed from: m */
    public final /* synthetic */ String f10525m;

    /* renamed from: n */
    public final /* synthetic */ zzq f10526n;

    /* renamed from: o */
    public final /* synthetic */ C5616q8 f10527o;

    public C5508h8(C5616q8 q8Var, AtomicReference atomicReference, String str, String str2, String str3, zzq zzq) {
        this.f10527o = q8Var;
        this.f10523e = atomicReference;
        this.f10524l = str2;
        this.f10525m = str3;
        this.f10526n = zzq;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f10523e) {
            try {
                C5616q8 q8Var = this.f10527o;
                C5691x2 H = q8Var.f10788d;
                if (H == null) {
                    q8Var.f10699a.mo28487b().mo28339r().mo28262d("(legacy) Failed to get conditional properties; not connected to service", (Object) null, this.f10524l, this.f10525m);
                    this.f10523e.set(Collections.emptyList());
                    this.f10523e.notify();
                    return;
                }
                if (TextUtils.isEmpty((CharSequence) null)) {
                    C3495o.m8908j(this.f10526n);
                    this.f10523e.set(H.mo28450J(this.f10524l, this.f10525m, this.f10526n));
                } else {
                    this.f10523e.set(H.mo28447B((String) null, this.f10524l, this.f10525m));
                }
                this.f10527o.mo28560E();
                atomicReference = this.f10523e;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.f10527o.f10699a.mo28487b().mo28339r().mo28262d("(legacy) Failed to get conditional properties; remote exception", (Object) null, this.f10524l, e);
                    this.f10523e.set(Collections.emptyList());
                    atomicReference = this.f10523e;
                } catch (Throwable th) {
                    this.f10523e.notify();
                    throw th;
                }
            }
        }
    }
}
