package p040c.p200q.p201a.p264c.p294g.p335i;

/* renamed from: c.q.a.c.g.i.vc */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5313vc implements C5298uc {

    /* renamed from: a */
    public static final C5262s6 f10198a;

    static {
        C5202o6 a = new C5202o6(C5077g6.m14133a("com.google.android.gms.measurement")).mo27481a();
        a.mo27486f("measurement.sdk.collection.enable_extend_user_property_size", true);
        a.mo27486f("measurement.sdk.collection.last_deep_link_referrer2", true);
        f10198a = a.mo27486f("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        a.mo27484d("measurement.id.sdk.collection.last_deep_link_referrer2", 0);
    }

    public final boolean zza() {
        return ((Boolean) f10198a.mo27633b()).booleanValue();
    }
}
