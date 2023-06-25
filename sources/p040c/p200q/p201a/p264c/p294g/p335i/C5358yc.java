package p040c.p200q.p201a.p264c.p294g.p335i;

/* renamed from: c.q.a.c.g.i.yc */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5358yc implements C5343xc {

    /* renamed from: a */
    public static final C5262s6 f10286a;

    static {
        C5202o6 a = new C5202o6(C5077g6.m14133a("com.google.android.gms.measurement")).mo27481a();
        a.mo27484d("measurement.id.lifecycle.app_in_background_parameter", 0);
        a.mo27486f("measurement.lifecycle.app_backgrounded_tracking", true);
        f10286a = a.mo27486f("measurement.lifecycle.app_in_background_parameter", false);
        a.mo27484d("measurement.id.lifecycle.app_backgrounded_tracking", 0);
    }

    public final boolean zza() {
        return ((Boolean) f10286a.mo27633b()).booleanValue();
    }
}
