package p040c.p200q.p201a.p264c.p340i.p342b;

import android.content.Context;
import androidx.appcompat.widget.TooltipCompatHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import net.sqlcipher.database.SQLiteDatabase;
import okhttp3.internal.p700ws.RealWebSocket;
import p040c.p200q.p201a.p264c.p294g.p335i.C5077g6;
import p040c.p200q.p201a.p264c.p294g.p335i.C5306v5;

/* renamed from: c.q.a.c.i.b.u2 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5658u2 {

    /* renamed from: A */
    public static final C5646t2 f10937A;

    /* renamed from: B */
    public static final C5646t2 f10938B = m16140a("measurement.upload.retry_time", 1800000L, 1800000L, C5488g0.f10482a);

    /* renamed from: C */
    public static final C5646t2 f10939C = m16140a("measurement.upload.retry_count", 6, 6, C5512i0.f10539a);

    /* renamed from: D */
    public static final C5646t2 f10940D = m16140a("measurement.upload.max_queue_time", 2419200000L, 2419200000L, C5524j0.f10580a);

    /* renamed from: E */
    public static final C5646t2 f10941E = m16140a("measurement.lifetimevalue.max_currency_tracked", 4, 4, C5536k0.f10602a);

    /* renamed from: F */
    public static final C5646t2 f10942F = m16140a("measurement.audience.filter_result_max_count", 200, 200, C5560m0.f10664a);

    /* renamed from: G */
    public static final C5646t2 f10943G = m16140a("measurement.upload.max_public_user_properties", 25, 25, (C5610q2) null);

    /* renamed from: H */
    public static final C5646t2 f10944H = m16140a("measurement.upload.max_event_name_cardinality", 500, 500, (C5610q2) null);

    /* renamed from: I */
    public static final C5646t2 f10945I = m16140a("measurement.upload.max_public_event_params", 25, 25, (C5610q2) null);

    /* renamed from: J */
    public static final C5646t2 f10946J = m16140a("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, C5572n0.f10688a);

    /* renamed from: K */
    public static final C5646t2 f10947K;

    /* renamed from: L */
    public static final C5646t2 f10948L = m16140a("measurement.test.string_flag", "---", "---", C5596p0.f10737a);

    /* renamed from: M */
    public static final C5646t2 f10949M = m16140a("measurement.test.long_flag", -1L, -1L, C5608q0.f10760a);

    /* renamed from: N */
    public static final C5646t2 f10950N = m16140a("measurement.test.int_flag", -2, -2, C5620r0.f10810a);

    /* renamed from: O */
    public static final C5646t2 f10951O;

    /* renamed from: P */
    public static final C5646t2 f10952P = m16140a("measurement.experiment.max_ids", 50, 50, C5656u0.f10935a);

    /* renamed from: Q */
    public static final C5646t2 f10953Q = m16140a("measurement.max_bundles_per_iteration", 100, 100, C5667v0.f11025a);

    /* renamed from: R */
    public static final C5646t2 f10954R = m16140a("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, C5678w0.f11052a);

    /* renamed from: S */
    public static final C5646t2 f10955S = m16140a("measurement.redaction.app_instance_id.ttl", 7200000L, 7200000L, C5711z0.f11183a);

    /* renamed from: T */
    public static final C5646t2 f10956T;

    /* renamed from: U */
    public static final C5646t2 f10957U;

    /* renamed from: V */
    public static final C5646t2 f10958V;

    /* renamed from: W */
    public static final C5646t2 f10959W;

    /* renamed from: X */
    public static final C5646t2 f10960X;

    /* renamed from: Y */
    public static final C5646t2 f10961Y;

    /* renamed from: Z */
    public static final C5646t2 f10962Z;

    /* renamed from: a */
    public static final List f10963a = Collections.synchronizedList(new ArrayList());

    /* renamed from: a0 */
    public static final C5646t2 f10964a0;

    /* renamed from: b */
    public static final C5646t2 f10965b = m16140a("measurement.ad_id_cache_time", 10000L, 10000L, C5500h0.f10513a);

    /* renamed from: b0 */
    public static final C5646t2 f10966b0;

    /* renamed from: c */
    public static final C5646t2 f10967c = m16140a("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, C5710z.f11182a);

    /* renamed from: c0 */
    public static final C5646t2 f10968c0;

    /* renamed from: d */
    public static final C5646t2 f10969d = m16140a("measurement.config.cache_time", 86400000L, 3600000L, C5548l0.f10635a);

    /* renamed from: d0 */
    public static final C5646t2 f10970d0;

    /* renamed from: e */
    public static final C5646t2 f10971e = m16140a("measurement.config.url_scheme", "https", "https", C5689x0.f11068a);

    /* renamed from: e0 */
    public static final C5646t2 f10972e0;

    /* renamed from: f */
    public static final C5646t2 f10973f = m16140a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", C5537k1.f10603a);

    /* renamed from: f0 */
    public static final C5646t2 f10974f0 = m16140a("measurement.service.storage_consent_support_version", 203600, 203600, C5585o1.f10710a);

    /* renamed from: g */
    public static final C5646t2 f10975g = m16140a("measurement.upload.max_bundles", 100, 100, C5679w1.f11053a);

    /* renamed from: g0 */
    public static final C5646t2 f10976g0;

    /* renamed from: h */
    public static final C5646t2 f10977h = m16140a("measurement.upload.max_batch_size", 65536, 65536, C5514i2.f10541a);

    /* renamed from: h0 */
    public static final C5646t2 f10978h0;

    /* renamed from: i */
    public static final C5646t2 f10979i = m16140a("measurement.upload.max_bundle_size", 65536, 65536, C5526j2.f10582a);

    /* renamed from: i0 */
    public static final C5646t2 f10980i0;

    /* renamed from: j */
    public static final C5646t2 f10981j = m16140a("measurement.upload.max_events_per_bundle", 1000, 1000, C5538k2.f10604a);

    /* renamed from: j0 */
    public static final C5646t2 f10982j0;

    /* renamed from: k */
    public static final C5646t2 f10983k = m16140a("measurement.upload.max_events_per_day", 100000, 100000, C5550l2.f10637a);

    /* renamed from: k0 */
    public static final C5646t2 f10984k0;

    /* renamed from: l */
    public static final C5646t2 f10985l = m16140a("measurement.upload.max_error_events_per_day", 1000, 1000, C5632s0.f10840a);

    /* renamed from: l0 */
    public static final C5646t2 f10986l0;

    /* renamed from: m */
    public static final C5646t2 f10987m;

    /* renamed from: m0 */
    public static final C5646t2 f10988m0;

    /* renamed from: n */
    public static final C5646t2 f10989n = m16140a("measurement.upload.max_conversions_per_day", 10000, 10000, C5597p1.f10738a);

    /* renamed from: n0 */
    public static final C5646t2 f10990n0;

    /* renamed from: o */
    public static final C5646t2 f10991o = m16140a("measurement.upload.max_realtime_events_per_day", 10, 10, C5430b2.f10348a);

    /* renamed from: o0 */
    public static final C5646t2 f10992o0;

    /* renamed from: p */
    public static final C5646t2 f10993p = m16140a("measurement.store.max_stored_events_per_app", 100000, 100000, C5562m2.f10666a);

    /* renamed from: p0 */
    public static final C5646t2 f10994p0;

    /* renamed from: q */
    public static final C5646t2 f10995q = m16140a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", C5574n2.f10690a);

    /* renamed from: q0 */
    public static final C5646t2 f10996q0;

    /* renamed from: r */
    public static final C5646t2 f10997r = m16140a("measurement.upload.backoff_period", 43200000L, 43200000L, C5586o2.f10711a);

    /* renamed from: r0 */
    public static final C5646t2 f10998r0;

    /* renamed from: s */
    public static final C5646t2 f10999s = m16140a("measurement.upload.window_interval", 3600000L, 3600000L, C5598p2.f10739a);

    /* renamed from: t */
    public static final C5646t2 f11000t = m16140a("measurement.upload.interval", 3600000L, 3600000L, C5677w.f11051a);

    /* renamed from: u */
    public static final C5646t2 f11001u = m16140a("measurement.upload.realtime_upload_interval", 10000L, 10000L, C5699y.f11117a);

    /* renamed from: v */
    public static final C5646t2 f11002v = m16140a("measurement.upload.debug_upload_interval", 1000L, 1000L, C5416a0.f10312a);

    /* renamed from: w */
    public static final C5646t2 f11003w = m16140a("measurement.upload.minimum_delay", 500L, 500L, C5428b0.f10346a);

    /* renamed from: x */
    public static final C5646t2 f11004x;

    /* renamed from: y */
    public static final C5646t2 f11005y = m16140a("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, C5452d0.f10377a);

    /* renamed from: z */
    public static final C5646t2 f11006z = m16140a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, C5464e0.f10426a);

    static {
        Collections.synchronizedSet(new HashSet());
        Integer valueOf = Integer.valueOf(SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH);
        f10987m = m16140a("measurement.upload.max_public_events_per_day", valueOf, valueOf, C5465e1.f10427a);
        Long valueOf2 = Long.valueOf(RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS);
        f11004x = m16140a("measurement.alarm_manager.minimum_interval", valueOf2, valueOf2, C5440c0.f10359a);
        Long valueOf3 = Long.valueOf(TooltipCompatHandler.HOVER_HIDE_TIMEOUT_MS);
        f10937A = m16140a("measurement.upload.initial_upload_delay_time", valueOf3, valueOf3, C5476f0.f10448a);
        Boolean bool = Boolean.FALSE;
        f10947K = m16140a("measurement.test.boolean_flag", bool, bool, C5584o0.f10709a);
        Double valueOf4 = Double.valueOf(-3.0d);
        f10951O = m16140a("measurement.test.double_flag", valueOf4, valueOf4, C5644t0.f10874a);
        Boolean bool2 = Boolean.TRUE;
        f10956T = m16140a("measurement.collection.log_event_and_bundle_v2", bool2, bool2, C5417a1.f10313a);
        f10957U = m16140a("measurement.quality.checksum", bool, bool, (C5610q2) null);
        f10958V = m16140a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, C5429b1.f10347a);
        f10959W = m16140a("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, C5441c1.f10360a);
        f10960X = m16140a("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, C5453d1.f10378a);
        f10961Y = m16140a("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, C5477f1.f10449a);
        f10962Z = m16140a("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, C5489g1.f10483a);
        f10964a0 = m16140a("measurement.lifecycle.app_in_background_parameter", bool, bool, C5501h1.f10514a);
        f10966b0 = m16140a("measurement.integration.disable_firebase_instance_id", bool, bool, C5513i1.f10540a);
        f10968c0 = m16140a("measurement.collection.service.update_with_analytics_fix", bool, bool, C5525j1.f10581a);
        f10970d0 = m16140a("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, C5549l1.f10636a);
        f10972e0 = m16140a("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, C5561m1.f10665a);
        m16140a("measurement.collection.synthetic_data_mitigation", bool, bool, C5573n1.f10689a);
        m16140a("measurement.client.click_identifier_control.dev", bool, bool, C5609q1.f10761a);
        m16140a("measurement.service.click_identifier_control", bool, bool, C5621r1.f10811a);
        f10976g0 = m16140a("measurement.service.store_null_safelist", bool2, bool2, C5633s1.f10841a);
        f10978h0 = m16140a("measurement.service.store_safelist", bool2, bool2, C5645t1.f10875a);
        m16140a("measurement.collection.enable_session_stitching_token.service", bool, bool, C5657u1.f10936a);
        f10980i0 = m16140a("measurement.collection.enable_session_stitching_token.service_new", bool2, bool2, C5668v1.f11026a);
        f10982j0 = m16140a("measurement.collection.enable_session_stitching_token.client.dev", bool2, bool2, C5690x1.f11069a);
        f10984k0 = m16140a("measurement.session_stitching_token_enabled", bool, bool, C5701y1.f11120a);
        f10986l0 = m16140a("measurement.redaction.e_tag", bool2, bool2, C5418a2.f10314a);
        f10988m0 = m16140a("measurement.redaction.client_ephemeral_aiid_generation", bool2, bool2, C5442c2.f10361a);
        f10990n0 = m16140a("measurement.redaction.retain_major_os_version", bool2, bool2, C5454d2.f10379a);
        f10992o0 = m16140a("measurement.redaction.scion_payload_generator", bool2, bool2, C5466e2.f10428a);
        f10994p0 = m16140a("measurement.audience.dynamic_filters.oob_fix", bool2, bool2, C5478f2.f10450a);
        f10996q0 = m16140a("measurement.service.clear_global_params_on_uninstall", bool2, bool2, C5490g2.f10484a);
        f10998r0 = m16140a("measurement.sessionid.enable_client_session_id", bool2, bool2, C5502h2.f10515a);
    }

    /* renamed from: a */
    public static C5646t2 m16140a(String str, Object obj, Object obj2, C5610q2 q2Var) {
        C5646t2 t2Var = new C5646t2(str, obj, obj2, q2Var, (C5634s2) null);
        f10963a.add(t2Var);
        return t2Var;
    }

    /* renamed from: c */
    public static Map m16142c(Context context) {
        C5306v5 a = C5306v5.m15121a(context.getContentResolver(), C5077g6.m14133a("com.google.android.gms.measurement"), C5666v.f11024e);
        return a == null ? Collections.emptyMap() : a.mo27817b();
    }
}
