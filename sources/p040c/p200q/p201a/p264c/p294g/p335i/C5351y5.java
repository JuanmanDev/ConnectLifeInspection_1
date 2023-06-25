package p040c.p200q.p201a.p264c.p294g.p335i;

import android.os.Binder;

/* renamed from: c.q.a.c.g.i.y5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final /* synthetic */ class C5351y5 {
    /* renamed from: a */
    public static Object m15362a(C5366z5 z5Var) {
        long clearCallingIdentity;
        try {
            return z5Var.zza();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            Object zza = z5Var.zza();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return zza;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }
}
