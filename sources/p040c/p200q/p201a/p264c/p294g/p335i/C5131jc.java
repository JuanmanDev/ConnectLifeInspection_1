package p040c.p200q.p201a.p264c.p294g.p335i;

/* renamed from: c.q.a.c.g.i.jc */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5131jc implements C5115ic {

    /* renamed from: a */
    public static final C5262s6 f9967a;

    /* renamed from: b */
    public static final C5262s6 f9968b;

    /* renamed from: c */
    public static final C5262s6 f9969c;

    static {
        C5202o6 a = new C5202o6(C5077g6.m14133a("com.google.android.gms.measurement")).mo27481a();
        a.mo27486f("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f9967a = a.mo27486f("measurement.audience.refresh_event_count_filters_timestamp", false);
        f9968b = a.mo27486f("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f9969c = a.mo27486f("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    /* renamed from: a */
    public final boolean mo27333a() {
        return ((Boolean) f9967a.mo27633b()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo27334b() {
        return ((Boolean) f9968b.mo27633b()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo27335c() {
        return ((Boolean) f9969c.mo27633b()).booleanValue();
    }

    public final boolean zza() {
        return true;
    }
}
