package p040c.p200q.p201a.p264c.p294g.p335i;

/* renamed from: c.q.a.c.g.i.hd */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5100hd implements C5084gd {

    /* renamed from: a */
    public static final C5262s6 f9933a;

    /* renamed from: b */
    public static final C5262s6 f9934b;

    /* renamed from: c */
    public static final C5262s6 f9935c;

    /* renamed from: d */
    public static final C5262s6 f9936d;

    static {
        C5202o6 a = new C5202o6(C5077g6.m14133a("com.google.android.gms.measurement")).mo27482b().mo27481a();
        a.mo27486f("measurement.redaction.app_instance_id", true);
        f9933a = a.mo27486f("measurement.redaction.client_ephemeral_aiid_generation", true);
        a.mo27486f("measurement.redaction.config_redacted_fields", true);
        a.mo27486f("measurement.redaction.device_info", true);
        f9934b = a.mo27486f("measurement.redaction.e_tag", true);
        a.mo27486f("measurement.redaction.enhanced_uid", true);
        a.mo27486f("measurement.redaction.populate_ephemeral_app_instance_id", true);
        a.mo27486f("measurement.redaction.google_signals", true);
        a.mo27486f("measurement.redaction.no_aiid_in_config_request", true);
        f9935c = a.mo27486f("measurement.redaction.retain_major_os_version", true);
        f9936d = a.mo27486f("measurement.redaction.scion_payload_generator", true);
        a.mo27486f("measurement.redaction.upload_redacted_fields", true);
        a.mo27486f("measurement.redaction.upload_subdomain_override", true);
        a.mo27486f("measurement.redaction.user_id", true);
    }

    /* renamed from: a */
    public final boolean mo27276a() {
        return ((Boolean) f9933a.mo27633b()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo27277b() {
        return ((Boolean) f9934b.mo27633b()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo27278c() {
        return ((Boolean) f9935c.mo27633b()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo27279d() {
        return ((Boolean) f9936d.mo27633b()).booleanValue();
    }

    public final boolean zza() {
        return true;
    }
}
