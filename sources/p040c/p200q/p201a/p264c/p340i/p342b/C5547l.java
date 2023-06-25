package p040c.p200q.p201a.p264c.p340i.p342b;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import androidx.test.internal.runner.RunnerArgs;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzkw;
import com.hisense.connect_life.core.global.EventBusConstKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p294g.p335i.C4987ac;
import p040c.p200q.p201a.p264c.p294g.p335i.C5107i4;

/* renamed from: c.q.a.c.i.b.l */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5547l extends C5569m9 {

    /* renamed from: f */
    public static final String[] f10625f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: g */
    public static final String[] f10626g = {EventBusConstKt.ORIGIN, "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: h */
    public static final String[] f10627h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;"};

    /* renamed from: i */
    public static final String[] f10628i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: j */
    public static final String[] f10629j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: k */
    public static final String[] f10630k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: l */
    public static final String[] f10631l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: m */
    public static final String[] f10632m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: d */
    public final C5535k f10633d;

    /* renamed from: e */
    public final C5521i9 f10634e = new C5521i9(this.f10699a.mo28488c());

    public C5547l(C5709y9 y9Var) {
        super(y9Var);
        this.f10699a.mo28649z();
        this.f10633d = new C5535k(this, this.f10699a.mo28490f(), "google_app_measurement.db");
    }

    @WorkerThread
    /* renamed from: H */
    public static final void m15816H(ContentValues contentValues, String str, Object obj) {
        C3495o.m8904f("value");
        C3495o.m8908j(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put("value", (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: java.lang.String[]} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:29:0x008a=Splitter:B:29:0x008a, B:12:0x003e=Splitter:B:12:0x003e} */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28377G(java.lang.String r21, long r22, long r24, p040c.p200q.p201a.p264c.p340i.p342b.C5676v9 r26) {
        /*
            r20 = this;
            r1 = r20
            r2 = r26
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8908j(r26)
            r20.mo28029h()
            r20.mo28475i()
            r3 = 0
            android.database.sqlite.SQLiteDatabase r0 = r20.mo28385P()     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            java.lang.String r5 = ""
            r13 = -1
            r15 = 2
            r12 = 1
            r11 = 0
            if (r4 == 0) goto L_0x0073
            int r4 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x0032
            java.lang.String[] r6 = new java.lang.String[r15]     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            java.lang.String r7 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            r6[r11] = r7     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            java.lang.String r7 = java.lang.String.valueOf(r22)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            r6[r12] = r7     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            goto L_0x003a
        L_0x0032:
            java.lang.String[] r6 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            java.lang.String r7 = java.lang.String.valueOf(r22)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            r6[r11] = r7     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
        L_0x003a:
            if (r4 == 0) goto L_0x003e
            java.lang.String r5 = "rowid <= ? and "
        L_0x003e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            r4.<init>()     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            java.lang.String r7 = "select app_id, metadata_fingerprint from raw_events where "
            r4.append(r7)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            r4.append(r5)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            java.lang.String r5 = "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"
            r4.append(r5)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            java.lang.String r4 = r4.toString()     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            android.database.Cursor r4 = r0.rawQuery(r4, r6)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            boolean r5 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0070 }
            if (r5 != 0) goto L_0x0064
            if (r4 == 0) goto L_0x0063
            r4.close()
        L_0x0063:
            return
        L_0x0064:
            java.lang.String r3 = r4.getString(r11)     // Catch:{ SQLiteException -> 0x0070 }
            java.lang.String r5 = r4.getString(r12)     // Catch:{ SQLiteException -> 0x0070 }
            r4.close()     // Catch:{ SQLiteException -> 0x0070 }
            goto L_0x00b7
        L_0x0070:
            r0 = move-exception
            goto L_0x0219
        L_0x0073:
            int r4 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x0082
            java.lang.String[] r6 = new java.lang.String[r15]     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            r6[r11] = r3     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            java.lang.String r7 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            r6[r12] = r7     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            goto L_0x0086
        L_0x0082:
            java.lang.String[] r6 = new java.lang.String[]{r3}     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
        L_0x0086:
            if (r4 == 0) goto L_0x008a
            java.lang.String r5 = " and rowid <= ?"
        L_0x008a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            r4.<init>()     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            java.lang.String r7 = "select metadata_fingerprint from raw_events where app_id = ?"
            r4.append(r7)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            r4.append(r5)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            java.lang.String r5 = " order by rowid limit 1;"
            r4.append(r5)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            java.lang.String r4 = r4.toString()     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            android.database.Cursor r4 = r0.rawQuery(r4, r6)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            boolean r5 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0070 }
            if (r5 != 0) goto L_0x00b0
            if (r4 == 0) goto L_0x00af
            r4.close()
        L_0x00af:
            return
        L_0x00b0:
            java.lang.String r5 = r4.getString(r11)     // Catch:{ SQLiteException -> 0x0070 }
            r4.close()     // Catch:{ SQLiteException -> 0x0070 }
        L_0x00b7:
            r16 = r4
            r17 = r5
            java.lang.String r4 = "metadata"
            java.lang.String[] r6 = new java.lang.String[]{r4}     // Catch:{ SQLiteException -> 0x0211, all -> 0x020d }
            java.lang.String[] r8 = new java.lang.String[r15]     // Catch:{ SQLiteException -> 0x0211, all -> 0x020d }
            r8[r11] = r3     // Catch:{ SQLiteException -> 0x0211, all -> 0x020d }
            r8[r12] = r17     // Catch:{ SQLiteException -> 0x0211, all -> 0x020d }
            java.lang.String r5 = "raw_events_metadata"
            java.lang.String r7 = "app_id = ? and metadata_fingerprint = ?"
            r9 = 0
            r10 = 0
            java.lang.String r18 = "rowid"
            java.lang.String r19 = "2"
            r4 = r0
            r15 = r11
            r11 = r18
            r12 = r19
            android.database.Cursor r12 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ SQLiteException -> 0x0211, all -> 0x020d }
            boolean r4 = r12.moveToFirst()     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            if (r4 != 0) goto L_0x00fa
            c.q.a.c.i.b.t4 r0 = r1.f10699a     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            c.q.a.c.i.b.i3 r0 = r0.mo28487b()     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            c.q.a.c.i.b.g3 r0 = r0.mo28339r()     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            java.lang.String r2 = "Raw event metadata record is missing. appId"
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r3)     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            r0.mo28260b(r2, r4)     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            if (r12 == 0) goto L_0x00f9
            r12.close()
        L_0x00f9:
            return
        L_0x00fa:
            byte[] r4 = r12.getBlob(r15)     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            c.q.a.c.g.i.s4 r5 = p040c.p200q.p201a.p264c.p294g.p335i.C5275t4.m14840N1()     // Catch:{ IOException -> 0x01e1 }
            p040c.p200q.p201a.p264c.p340i.p342b.C5426aa.m15490C(r5, r4)     // Catch:{ IOException -> 0x01e1 }
            c.q.a.c.g.i.s4 r5 = (p040c.p200q.p201a.p264c.p294g.p335i.C5260s4) r5     // Catch:{ IOException -> 0x01e1 }
            c.q.a.c.g.i.t8 r4 = r5.mo27520l()     // Catch:{ IOException -> 0x01e1 }
            c.q.a.c.g.i.t4 r4 = (p040c.p200q.p201a.p264c.p294g.p335i.C5275t4) r4     // Catch:{ IOException -> 0x01e1 }
            boolean r5 = r12.moveToNext()     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            if (r5 == 0) goto L_0x0126
            c.q.a.c.i.b.t4 r5 = r1.f10699a     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            c.q.a.c.i.b.i3 r5 = r5.mo28487b()     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            c.q.a.c.i.b.g3 r5 = r5.mo28344w()     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            java.lang.String r6 = "Get multiple raw event metadata records, expected one. appId"
            java.lang.Object r7 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r3)     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            r5.mo28260b(r6, r7)     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
        L_0x0126:
            r12.close()     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8908j(r4)     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            r2.f11046a = r4     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            int r4 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            r13 = 3
            if (r4 == 0) goto L_0x0146
            java.lang.String r4 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?"
            java.lang.String[] r5 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            r5[r15] = r3     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            r14 = 1
            r5[r14] = r17     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            java.lang.String r6 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            r7 = 2
            r5[r7] = r6     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            r7 = r4
            r8 = r5
            goto L_0x0152
        L_0x0146:
            r14 = 1
            java.lang.String r4 = "app_id = ? and metadata_fingerprint = ?"
            r5 = 2
            java.lang.String[] r6 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            r6[r15] = r3     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            r6[r14] = r17     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            r7 = r4
            r8 = r6
        L_0x0152:
            java.lang.String r4 = "rowid"
            java.lang.String r5 = "name"
            java.lang.String r6 = "timestamp"
            java.lang.String r9 = "data"
            java.lang.String[] r6 = new java.lang.String[]{r4, r5, r6, r9}     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            java.lang.String r5 = "raw_events"
            r9 = 0
            r10 = 0
            java.lang.String r11 = "rowid"
            r16 = 0
            r4 = r0
            r17 = r12
            r12 = r16
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ SQLiteException -> 0x01ff, all -> 0x01fd }
            boolean r0 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0070 }
            if (r0 == 0) goto L_0x01c8
        L_0x0175:
            long r5 = r4.getLong(r15)     // Catch:{ SQLiteException -> 0x0070 }
            byte[] r0 = r4.getBlob(r13)     // Catch:{ SQLiteException -> 0x0070 }
            c.q.a.c.g.i.h4 r7 = p040c.p200q.p201a.p264c.p294g.p335i.C5107i4.m14303H()     // Catch:{ IOException -> 0x01a7 }
            p040c.p200q.p201a.p264c.p340i.p342b.C5426aa.m15490C(r7, r0)     // Catch:{ IOException -> 0x01a7 }
            c.q.a.c.g.i.h4 r7 = (p040c.p200q.p201a.p264c.p294g.p335i.C5091h4) r7     // Catch:{ IOException -> 0x01a7 }
            java.lang.String r0 = r4.getString(r14)     // Catch:{ SQLiteException -> 0x0070 }
            r7.mo27287E(r0)     // Catch:{ SQLiteException -> 0x0070 }
            r8 = 2
            long r9 = r4.getLong(r8)     // Catch:{ SQLiteException -> 0x0070 }
            r7.mo27291I(r9)     // Catch:{ SQLiteException -> 0x0070 }
            c.q.a.c.g.i.t8 r0 = r7.mo27520l()     // Catch:{ SQLiteException -> 0x0070 }
            c.q.a.c.g.i.i4 r0 = (p040c.p200q.p201a.p264c.p294g.p335i.C5107i4) r0     // Catch:{ SQLiteException -> 0x0070 }
            boolean r0 = r2.mo28669a(r5, r0)     // Catch:{ SQLiteException -> 0x0070 }
            if (r0 != 0) goto L_0x01bc
            if (r4 == 0) goto L_0x01a6
            r4.close()
        L_0x01a6:
            return
        L_0x01a7:
            r0 = move-exception
            r8 = 2
            c.q.a.c.i.b.t4 r5 = r1.f10699a     // Catch:{ SQLiteException -> 0x0070 }
            c.q.a.c.i.b.i3 r5 = r5.mo28487b()     // Catch:{ SQLiteException -> 0x0070 }
            c.q.a.c.i.b.g3 r5 = r5.mo28339r()     // Catch:{ SQLiteException -> 0x0070 }
            java.lang.String r6 = "Data loss. Failed to merge raw event. appId"
            java.lang.Object r7 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r3)     // Catch:{ SQLiteException -> 0x0070 }
            r5.mo28261c(r6, r7, r0)     // Catch:{ SQLiteException -> 0x0070 }
        L_0x01bc:
            boolean r0 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x0070 }
            if (r0 != 0) goto L_0x0175
            if (r4 == 0) goto L_0x0231
            r4.close()
            return
        L_0x01c8:
            c.q.a.c.i.b.t4 r0 = r1.f10699a     // Catch:{ SQLiteException -> 0x0070 }
            c.q.a.c.i.b.i3 r0 = r0.mo28487b()     // Catch:{ SQLiteException -> 0x0070 }
            c.q.a.c.i.b.g3 r0 = r0.mo28344w()     // Catch:{ SQLiteException -> 0x0070 }
            java.lang.String r2 = "Raw event data disappeared while in transaction. appId"
            java.lang.Object r5 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r3)     // Catch:{ SQLiteException -> 0x0070 }
            r0.mo28260b(r2, r5)     // Catch:{ SQLiteException -> 0x0070 }
            if (r4 == 0) goto L_0x01e0
            r4.close()
        L_0x01e0:
            return
        L_0x01e1:
            r0 = move-exception
            r17 = r12
            c.q.a.c.i.b.t4 r2 = r1.f10699a     // Catch:{ SQLiteException -> 0x01ff, all -> 0x01fd }
            c.q.a.c.i.b.i3 r2 = r2.mo28487b()     // Catch:{ SQLiteException -> 0x01ff, all -> 0x01fd }
            c.q.a.c.i.b.g3 r2 = r2.mo28339r()     // Catch:{ SQLiteException -> 0x01ff, all -> 0x01fd }
            java.lang.String r4 = "Data loss. Failed to merge raw event metadata. appId"
            java.lang.Object r5 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r3)     // Catch:{ SQLiteException -> 0x01ff, all -> 0x01fd }
            r2.mo28261c(r4, r5, r0)     // Catch:{ SQLiteException -> 0x01ff, all -> 0x01fd }
            if (r17 == 0) goto L_0x01fc
            r17.close()
        L_0x01fc:
            return
        L_0x01fd:
            r0 = move-exception
            goto L_0x0204
        L_0x01ff:
            r0 = move-exception
            goto L_0x020a
        L_0x0201:
            r0 = move-exception
            r17 = r12
        L_0x0204:
            r3 = r17
            goto L_0x0234
        L_0x0207:
            r0 = move-exception
            r17 = r12
        L_0x020a:
            r4 = r17
            goto L_0x0219
        L_0x020d:
            r0 = move-exception
            r3 = r16
            goto L_0x0234
        L_0x0211:
            r0 = move-exception
            r4 = r16
            goto L_0x0219
        L_0x0215:
            r0 = move-exception
            goto L_0x0234
        L_0x0217:
            r0 = move-exception
            r4 = r3
        L_0x0219:
            c.q.a.c.i.b.t4 r2 = r1.f10699a     // Catch:{ all -> 0x0232 }
            c.q.a.c.i.b.i3 r2 = r2.mo28487b()     // Catch:{ all -> 0x0232 }
            c.q.a.c.i.b.g3 r2 = r2.mo28339r()     // Catch:{ all -> 0x0232 }
            java.lang.String r5 = "Data loss. Error selecting raw event. appId"
            java.lang.Object r3 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r3)     // Catch:{ all -> 0x0232 }
            r2.mo28261c(r5, r3, r0)     // Catch:{ all -> 0x0232 }
            if (r4 == 0) goto L_0x0231
            r4.close()
        L_0x0231:
            return
        L_0x0232:
            r0 = move-exception
            r3 = r4
        L_0x0234:
            if (r3 == 0) goto L_0x0239
            r3.close()
        L_0x0239:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p340i.p342b.C5547l.mo28377G(java.lang.String, long, long, c.q.a.c.i.b.v9):void");
    }

    @WorkerThread
    /* renamed from: I */
    public final long mo28378I(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            cursor = mo28385P().rawQuery(str, strArr);
            if (cursor.moveToFirst()) {
                long j = cursor.getLong(0);
                if (cursor != null) {
                    cursor.close();
                }
                return j;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e) {
            this.f10699a.mo28487b().mo28339r().mo28261c("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @WorkerThread
    /* renamed from: J */
    public final int mo28379J(String str, String str2) {
        C3495o.m8904f(str);
        C3495o.m8904f(str2);
        mo28029h();
        mo28475i();
        try {
            return mo28385P().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            this.f10699a.mo28487b().mo28339r().mo28262d("Error deleting conditional property", C5515i3.m15778z(str), this.f10699a.mo28620D().mo28146f(str2), e);
            return 0;
        }
    }

    @WorkerThread
    /* renamed from: K */
    public final long mo28380K(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = mo28385P().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                long j2 = rawQuery.getLong(0);
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return j2;
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            return j;
        } catch (SQLiteException e) {
            this.f10699a.mo28487b().mo28339r().mo28261c("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @WorkerThread
    /* renamed from: L */
    public final long mo28381L(String str, String str2) {
        long j;
        SQLiteException e;
        C3495o.m8904f(str);
        C3495o.m8904f("first_open_count");
        mo28029h();
        mo28475i();
        SQLiteDatabase P = mo28385P();
        P.beginTransaction();
        try {
            j = mo28380K("select " + "first_open_count" + " from app2 where app_id=?", new String[]{str}, -1);
            if (j == -1) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str);
                contentValues.put("first_open_count", 0);
                contentValues.put("previous_install_count", 0);
                if (P.insertWithOnConflict("app2", (String) null, contentValues, 5) == -1) {
                    this.f10699a.mo28487b().mo28339r().mo28261c("Failed to insert column (got -1). appId", C5515i3.m15778z(str), "first_open_count");
                    P.endTransaction();
                    return -1;
                }
                j = 0;
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str);
                contentValues2.put("first_open_count", Long.valueOf(1 + j));
                if (((long) P.update("app2", contentValues2, "app_id = ?", new String[]{str})) == 0) {
                    this.f10699a.mo28487b().mo28339r().mo28261c("Failed to update column (got 0). appId", C5515i3.m15778z(str), "first_open_count");
                    P.endTransaction();
                    return -1;
                }
                P.setTransactionSuccessful();
                P.endTransaction();
                return j;
            } catch (SQLiteException e2) {
                e = e2;
            }
        } catch (SQLiteException e3) {
            j = 0;
            e = e3;
            try {
                this.f10699a.mo28487b().mo28339r().mo28262d("Error inserting column. appId", C5515i3.m15778z(str), "first_open_count", e);
                P.endTransaction();
                return j;
            } catch (Throwable th) {
                P.endTransaction();
                throw th;
            }
        }
    }

    @WorkerThread
    /* renamed from: M */
    public final long mo28382M() {
        return mo28380K("select max(bundle_end_timestamp) from queue", (String[]) null, 0);
    }

    @WorkerThread
    /* renamed from: N */
    public final long mo28383N() {
        return mo28380K("select max(timestamp) from raw_events", (String[]) null, 0);
    }

    /* renamed from: O */
    public final long mo28384O(String str) {
        C3495o.m8904f(str);
        return mo28380K("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0);
    }

    @WorkerThread
    /* renamed from: P */
    public final SQLiteDatabase mo28385P() {
        mo28029h();
        try {
            return this.f10633d.getWritableDatabase();
        } catch (SQLiteException e) {
            this.f10699a.mo28487b().mo28344w().mo28260b("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00de  */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo28386Q(java.lang.String r8) {
        /*
            r7 = this;
            r7.mo28029h()
            r7.mo28475i()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.mo28385P()     // Catch:{ SQLiteException -> 0x00c3, all -> 0x00c1 }
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x00c3, all -> 0x00c1 }
            r3 = 0
            r2[r3] = r8     // Catch:{ SQLiteException -> 0x00c3, all -> 0x00c1 }
            java.lang.String r4 = "select parameters from default_event_params where app_id=?"
            android.database.Cursor r1 = r1.rawQuery(r4, r2)     // Catch:{ SQLiteException -> 0x00c3, all -> 0x00c1 }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x00bf }
            if (r2 != 0) goto L_0x0032
            c.q.a.c.i.b.t4 r8 = r7.f10699a     // Catch:{ SQLiteException -> 0x00bf }
            c.q.a.c.i.b.i3 r8 = r8.mo28487b()     // Catch:{ SQLiteException -> 0x00bf }
            c.q.a.c.i.b.g3 r8 = r8.mo28343v()     // Catch:{ SQLiteException -> 0x00bf }
            java.lang.String r2 = "Default event parameters not found"
            r8.mo28259a(r2)     // Catch:{ SQLiteException -> 0x00bf }
            if (r1 == 0) goto L_0x0031
            r1.close()
        L_0x0031:
            return r0
        L_0x0032:
            byte[] r2 = r1.getBlob(r3)     // Catch:{ SQLiteException -> 0x00bf }
            c.q.a.c.g.i.h4 r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5107i4.m14303H()     // Catch:{ IOException -> 0x00a5 }
            p040c.p200q.p201a.p264c.p340i.p342b.C5426aa.m15490C(r3, r2)     // Catch:{ IOException -> 0x00a5 }
            c.q.a.c.g.i.h4 r3 = (p040c.p200q.p201a.p264c.p294g.p335i.C5091h4) r3     // Catch:{ IOException -> 0x00a5 }
            c.q.a.c.g.i.t8 r2 = r3.mo27520l()     // Catch:{ IOException -> 0x00a5 }
            c.q.a.c.g.i.i4 r2 = (p040c.p200q.p201a.p264c.p294g.p335i.C5107i4) r2     // Catch:{ IOException -> 0x00a5 }
            c.q.a.c.i.b.y9 r8 = r7.f10663b     // Catch:{ SQLiteException -> 0x00bf }
            r8.mo28743f0()     // Catch:{ SQLiteException -> 0x00bf }
            java.util.List r8 = r2.mo27328L()     // Catch:{ SQLiteException -> 0x00bf }
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ SQLiteException -> 0x00bf }
            r2.<init>()     // Catch:{ SQLiteException -> 0x00bf }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ SQLiteException -> 0x00bf }
        L_0x0057:
            boolean r3 = r8.hasNext()     // Catch:{ SQLiteException -> 0x00bf }
            if (r3 == 0) goto L_0x009f
            java.lang.Object r3 = r8.next()     // Catch:{ SQLiteException -> 0x00bf }
            c.q.a.c.g.i.m4 r3 = (p040c.p200q.p201a.p264c.p294g.p335i.C5170m4) r3     // Catch:{ SQLiteException -> 0x00bf }
            java.lang.String r4 = r3.mo27418J()     // Catch:{ SQLiteException -> 0x00bf }
            boolean r5 = r3.mo27421X()     // Catch:{ SQLiteException -> 0x00bf }
            if (r5 == 0) goto L_0x0075
            double r5 = r3.mo27414D()     // Catch:{ SQLiteException -> 0x00bf }
            r2.putDouble(r4, r5)     // Catch:{ SQLiteException -> 0x00bf }
            goto L_0x0057
        L_0x0075:
            boolean r5 = r3.mo27422Y()     // Catch:{ SQLiteException -> 0x00bf }
            if (r5 == 0) goto L_0x0083
            float r3 = r3.mo27415E()     // Catch:{ SQLiteException -> 0x00bf }
            r2.putFloat(r4, r3)     // Catch:{ SQLiteException -> 0x00bf }
            goto L_0x0057
        L_0x0083:
            boolean r5 = r3.mo27425b0()     // Catch:{ SQLiteException -> 0x00bf }
            if (r5 == 0) goto L_0x0091
            java.lang.String r3 = r3.mo27419K()     // Catch:{ SQLiteException -> 0x00bf }
            r2.putString(r4, r3)     // Catch:{ SQLiteException -> 0x00bf }
            goto L_0x0057
        L_0x0091:
            boolean r5 = r3.mo27423Z()     // Catch:{ SQLiteException -> 0x00bf }
            if (r5 == 0) goto L_0x0057
            long r5 = r3.mo27417G()     // Catch:{ SQLiteException -> 0x00bf }
            r2.putLong(r4, r5)     // Catch:{ SQLiteException -> 0x00bf }
            goto L_0x0057
        L_0x009f:
            if (r1 == 0) goto L_0x00a4
            r1.close()
        L_0x00a4:
            return r2
        L_0x00a5:
            r2 = move-exception
            c.q.a.c.i.b.t4 r3 = r7.f10699a     // Catch:{ SQLiteException -> 0x00bf }
            c.q.a.c.i.b.i3 r3 = r3.mo28487b()     // Catch:{ SQLiteException -> 0x00bf }
            c.q.a.c.i.b.g3 r3 = r3.mo28339r()     // Catch:{ SQLiteException -> 0x00bf }
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r8 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r8)     // Catch:{ SQLiteException -> 0x00bf }
            r3.mo28261c(r4, r8, r2)     // Catch:{ SQLiteException -> 0x00bf }
            if (r1 == 0) goto L_0x00be
            r1.close()
        L_0x00be:
            return r0
        L_0x00bf:
            r8 = move-exception
            goto L_0x00c5
        L_0x00c1:
            r8 = move-exception
            goto L_0x00dc
        L_0x00c3:
            r8 = move-exception
            r1 = r0
        L_0x00c5:
            c.q.a.c.i.b.t4 r2 = r7.f10699a     // Catch:{ all -> 0x00da }
            c.q.a.c.i.b.i3 r2 = r2.mo28487b()     // Catch:{ all -> 0x00da }
            c.q.a.c.i.b.g3 r2 = r2.mo28339r()     // Catch:{ all -> 0x00da }
            java.lang.String r3 = "Error selecting default event parameters"
            r2.mo28260b(r3, r8)     // Catch:{ all -> 0x00da }
            if (r1 == 0) goto L_0x00d9
            r1.close()
        L_0x00d9:
            return r0
        L_0x00da:
            r8 = move-exception
            r0 = r1
        L_0x00dc:
            if (r0 == 0) goto L_0x00e1
            r0.close()
        L_0x00e1:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p340i.p342b.C5547l.mo28386Q(java.lang.String):android.os.Bundle");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x011b A[Catch:{ SQLiteException -> 0x01dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x011f A[Catch:{ SQLiteException -> 0x01dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0153 A[Catch:{ SQLiteException -> 0x01dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x016f A[Catch:{ SQLiteException -> 0x01dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0172 A[Catch:{ SQLiteException -> 0x01dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0181 A[Catch:{ SQLiteException -> 0x01dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x01c4 A[Catch:{ SQLiteException -> 0x01dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0200  */
    @androidx.annotation.WorkerThread
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p040c.p200q.p201a.p264c.p340i.p342b.C5458d6 mo28387R(java.lang.String r35) {
        /*
            r34 = this;
            r1 = r34
            r2 = r35
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8904f(r35)
            r34.mo28029h()
            r34.mo28475i()
            r3 = 0
            android.database.sqlite.SQLiteDatabase r4 = r34.mo28385P()     // Catch:{ SQLiteException -> 0x01e1, all -> 0x01df }
            java.lang.String r5 = "app_instance_id"
            java.lang.String r6 = "gmp_app_id"
            java.lang.String r7 = "resettable_device_id_hash"
            java.lang.String r8 = "last_bundle_index"
            java.lang.String r9 = "last_bundle_start_timestamp"
            java.lang.String r10 = "last_bundle_end_timestamp"
            java.lang.String r11 = "app_version"
            java.lang.String r12 = "app_store"
            java.lang.String r13 = "gmp_version"
            java.lang.String r14 = "dev_cert_hash"
            java.lang.String r15 = "measurement_enabled"
            java.lang.String r16 = "day"
            java.lang.String r17 = "daily_public_events_count"
            java.lang.String r18 = "daily_events_count"
            java.lang.String r19 = "daily_conversions_count"
            java.lang.String r20 = "config_fetched_time"
            java.lang.String r21 = "failed_config_fetch_time"
            java.lang.String r22 = "app_version_int"
            java.lang.String r23 = "firebase_instance_id"
            java.lang.String r24 = "daily_error_events_count"
            java.lang.String r25 = "daily_realtime_events_count"
            java.lang.String r26 = "health_monitor_sample"
            java.lang.String r27 = "android_id"
            java.lang.String r28 = "adid_reporting_enabled"
            java.lang.String r29 = "admob_app_id"
            java.lang.String r30 = "dynamite_version"
            java.lang.String r31 = "safelisted_events"
            java.lang.String r32 = "ga_app_id"
            java.lang.String r33 = "session_stitching_token"
            java.lang.String[] r6 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33}     // Catch:{ SQLiteException -> 0x01e1, all -> 0x01df }
            r0 = 1
            java.lang.String[] r8 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x01e1, all -> 0x01df }
            r12 = 0
            r8[r12] = r2     // Catch:{ SQLiteException -> 0x01e1, all -> 0x01df }
            java.lang.String r5 = "apps"
            java.lang.String r7 = "app_id=?"
            r9 = 0
            r10 = 0
            r11 = 0
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x01e1, all -> 0x01df }
            boolean r5 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x01dd }
            if (r5 != 0) goto L_0x006d
            if (r4 == 0) goto L_0x006c
            r4.close()
        L_0x006c:
            return r3
        L_0x006d:
            c.q.a.c.i.b.d6 r5 = new c.q.a.c.i.b.d6     // Catch:{ SQLiteException -> 0x01dd }
            c.q.a.c.i.b.y9 r6 = r1.f10663b     // Catch:{ SQLiteException -> 0x01dd }
            c.q.a.c.i.b.t4 r6 = r6.mo28739b0()     // Catch:{ SQLiteException -> 0x01dd }
            r5.<init>(r6, r2)     // Catch:{ SQLiteException -> 0x01dd }
            java.lang.String r6 = r4.getString(r12)     // Catch:{ SQLiteException -> 0x01dd }
            r5.mo28189h(r6)     // Catch:{ SQLiteException -> 0x01dd }
            java.lang.String r6 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x01dd }
            r5.mo28207w(r6)     // Catch:{ SQLiteException -> 0x01dd }
            r6 = 2
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x01dd }
            r5.mo28154F(r6)     // Catch:{ SQLiteException -> 0x01dd }
            r6 = 3
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01dd }
            r5.mo28150B(r6)     // Catch:{ SQLiteException -> 0x01dd }
            r6 = 4
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01dd }
            r5.mo28151C(r6)     // Catch:{ SQLiteException -> 0x01dd }
            r6 = 5
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01dd }
            r5.mo28210z(r6)     // Catch:{ SQLiteException -> 0x01dd }
            r6 = 6
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x01dd }
            r5.mo28193j(r6)     // Catch:{ SQLiteException -> 0x01dd }
            r6 = 7
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x01dd }
            r5.mo28191i(r6)     // Catch:{ SQLiteException -> 0x01dd }
            r6 = 8
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01dd }
            r5.mo28208x(r6)     // Catch:{ SQLiteException -> 0x01dd }
            r6 = 9
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01dd }
            r5.mo28203s(r6)     // Catch:{ SQLiteException -> 0x01dd }
            r6 = 10
            boolean r7 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x01dd }
            if (r7 != 0) goto L_0x00d9
            int r6 = r4.getInt(r6)     // Catch:{ SQLiteException -> 0x01dd }
            if (r6 == 0) goto L_0x00d7
            goto L_0x00d9
        L_0x00d7:
            r6 = r12
            goto L_0x00da
        L_0x00d9:
            r6 = r0
        L_0x00da:
            r5.mo28152D(r6)     // Catch:{ SQLiteException -> 0x01dd }
            r6 = 11
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01dd }
            r5.mo28202r(r6)     // Catch:{ SQLiteException -> 0x01dd }
            r6 = 12
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01dd }
            r5.mo28200p(r6)     // Catch:{ SQLiteException -> 0x01dd }
            r6 = 13
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01dd }
            r5.mo28199o(r6)     // Catch:{ SQLiteException -> 0x01dd }
            r6 = 14
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01dd }
            r5.mo28197m(r6)     // Catch:{ SQLiteException -> 0x01dd }
            r6 = 15
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01dd }
            r5.mo28196l(r6)     // Catch:{ SQLiteException -> 0x01dd }
            r6 = 16
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01dd }
            r5.mo28205u(r6)     // Catch:{ SQLiteException -> 0x01dd }
            r6 = 17
            boolean r7 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x01dd }
            if (r7 == 0) goto L_0x011f
            r6 = -2147483648(0xffffffff80000000, double:NaN)
            goto L_0x0124
        L_0x011f:
            int r6 = r4.getInt(r6)     // Catch:{ SQLiteException -> 0x01dd }
            long r6 = (long) r6     // Catch:{ SQLiteException -> 0x01dd }
        L_0x0124:
            r5.mo28195k(r6)     // Catch:{ SQLiteException -> 0x01dd }
            r6 = 18
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x01dd }
            r5.mo28206v(r6)     // Catch:{ SQLiteException -> 0x01dd }
            r6 = 19
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01dd }
            r5.mo28198n(r6)     // Catch:{ SQLiteException -> 0x01dd }
            r6 = 20
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01dd }
            r5.mo28201q(r6)     // Catch:{ SQLiteException -> 0x01dd }
            r6 = 21
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x01dd }
            r5.mo28209y(r6)     // Catch:{ SQLiteException -> 0x01dd }
            r6 = 23
            boolean r7 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x01dd }
            if (r7 != 0) goto L_0x015b
            int r6 = r4.getInt(r6)     // Catch:{ SQLiteException -> 0x01dd }
            if (r6 == 0) goto L_0x015a
            goto L_0x015b
        L_0x015a:
            r0 = r12
        L_0x015b:
            r5.mo28187g(r0)     // Catch:{ SQLiteException -> 0x01dd }
            r0 = 24
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x01dd }
            r5.mo28185f(r0)     // Catch:{ SQLiteException -> 0x01dd }
            r0 = 25
            boolean r6 = r4.isNull(r0)     // Catch:{ SQLiteException -> 0x01dd }
            if (r6 == 0) goto L_0x0172
            r6 = 0
            goto L_0x0176
        L_0x0172:
            long r6 = r4.getLong(r0)     // Catch:{ SQLiteException -> 0x01dd }
        L_0x0176:
            r5.mo28204t(r6)     // Catch:{ SQLiteException -> 0x01dd }
            r0 = 26
            boolean r6 = r4.isNull(r0)     // Catch:{ SQLiteException -> 0x01dd }
            if (r6 != 0) goto L_0x0193
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x01dd }
            java.lang.String r6 = ","
            r7 = -1
            java.lang.String[] r0 = r0.split(r6, r7)     // Catch:{ SQLiteException -> 0x01dd }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ SQLiteException -> 0x01dd }
            r5.mo28155G(r0)     // Catch:{ SQLiteException -> 0x01dd }
        L_0x0193:
            p040c.p200q.p201a.p264c.p294g.p335i.C5179md.m14505b()     // Catch:{ SQLiteException -> 0x01dd }
            c.q.a.c.i.b.t4 r0 = r1.f10699a     // Catch:{ SQLiteException -> 0x01dd }
            c.q.a.c.i.b.g r0 = r0.mo28649z()     // Catch:{ SQLiteException -> 0x01dd }
            c.q.a.c.i.b.t2 r6 = p040c.p200q.p201a.p264c.p340i.p342b.C5658u2.f10980i0     // Catch:{ SQLiteException -> 0x01dd }
            boolean r0 = r0.mo28235B(r3, r6)     // Catch:{ SQLiteException -> 0x01dd }
            if (r0 == 0) goto L_0x01bb
            c.q.a.c.i.b.t4 r0 = r1.f10699a     // Catch:{ SQLiteException -> 0x01dd }
            c.q.a.c.i.b.g r0 = r0.mo28649z()     // Catch:{ SQLiteException -> 0x01dd }
            c.q.a.c.i.b.t2 r6 = p040c.p200q.p201a.p264c.p340i.p342b.C5658u2.f10984k0     // Catch:{ SQLiteException -> 0x01dd }
            boolean r0 = r0.mo28235B(r2, r6)     // Catch:{ SQLiteException -> 0x01dd }
            if (r0 == 0) goto L_0x01bb
            r0 = 28
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x01dd }
            r5.mo28156H(r0)     // Catch:{ SQLiteException -> 0x01dd }
        L_0x01bb:
            r5.mo28181d()     // Catch:{ SQLiteException -> 0x01dd }
            boolean r0 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x01dd }
            if (r0 == 0) goto L_0x01d7
            c.q.a.c.i.b.t4 r0 = r1.f10699a     // Catch:{ SQLiteException -> 0x01dd }
            c.q.a.c.i.b.i3 r0 = r0.mo28487b()     // Catch:{ SQLiteException -> 0x01dd }
            c.q.a.c.i.b.g3 r0 = r0.mo28339r()     // Catch:{ SQLiteException -> 0x01dd }
            java.lang.String r6 = "Got multiple records for app, expected one. appId"
            java.lang.Object r7 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r35)     // Catch:{ SQLiteException -> 0x01dd }
            r0.mo28260b(r6, r7)     // Catch:{ SQLiteException -> 0x01dd }
        L_0x01d7:
            if (r4 == 0) goto L_0x01dc
            r4.close()
        L_0x01dc:
            return r5
        L_0x01dd:
            r0 = move-exception
            goto L_0x01e3
        L_0x01df:
            r0 = move-exception
            goto L_0x01fe
        L_0x01e1:
            r0 = move-exception
            r4 = r3
        L_0x01e3:
            c.q.a.c.i.b.t4 r5 = r1.f10699a     // Catch:{ all -> 0x01fc }
            c.q.a.c.i.b.i3 r5 = r5.mo28487b()     // Catch:{ all -> 0x01fc }
            c.q.a.c.i.b.g3 r5 = r5.mo28339r()     // Catch:{ all -> 0x01fc }
            java.lang.String r6 = "Error querying app. appId"
            java.lang.Object r2 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r35)     // Catch:{ all -> 0x01fc }
            r5.mo28261c(r6, r2, r0)     // Catch:{ all -> 0x01fc }
            if (r4 == 0) goto L_0x01fb
            r4.close()
        L_0x01fb:
            return r3
        L_0x01fc:
            r0 = move-exception
            r3 = r4
        L_0x01fe:
            if (r3 == 0) goto L_0x0203
            r3.close()
        L_0x0203:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p340i.p342b.C5547l.mo28387R(java.lang.String):c.q.a.c.i.b.d6");
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x012e  */
    @androidx.annotation.WorkerThread
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.zzac mo28388S(java.lang.String r31, java.lang.String r32) {
        /*
            r30 = this;
            r1 = r30
            r8 = r32
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8904f(r31)
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8904f(r32)
            r30.mo28029h()
            r30.mo28475i()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r30.mo28385P()     // Catch:{ SQLiteException -> 0x0105, all -> 0x0103 }
            java.lang.String r11 = "origin"
            java.lang.String r12 = "value"
            java.lang.String r13 = "active"
            java.lang.String r14 = "trigger_event_name"
            java.lang.String r15 = "trigger_timeout"
            java.lang.String r16 = "timed_out_event"
            java.lang.String r17 = "creation_timestamp"
            java.lang.String r18 = "triggered_event"
            java.lang.String r19 = "triggered_timestamp"
            java.lang.String r20 = "time_to_live"
            java.lang.String r21 = "expired_event"
            java.lang.String[] r12 = new java.lang.String[]{r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21}     // Catch:{ SQLiteException -> 0x0105, all -> 0x0103 }
            r0 = 2
            java.lang.String[] r14 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0105, all -> 0x0103 }
            r2 = 0
            r14[r2] = r31     // Catch:{ SQLiteException -> 0x0105, all -> 0x0103 }
            r3 = 1
            r14[r3] = r8     // Catch:{ SQLiteException -> 0x0105, all -> 0x0103 }
            java.lang.String r11 = "conditional_properties"
            java.lang.String r13 = "app_id=? and name=?"
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x0105, all -> 0x0103 }
            boolean r4 = r10.moveToFirst()     // Catch:{ SQLiteException -> 0x0101 }
            if (r4 != 0) goto L_0x0051
            if (r10 == 0) goto L_0x0050
            r10.close()
        L_0x0050:
            return r9
        L_0x0051:
            java.lang.String r4 = r10.getString(r2)     // Catch:{ SQLiteException -> 0x0101 }
            if (r4 != 0) goto L_0x0059
            java.lang.String r4 = ""
        L_0x0059:
            r17 = r4
            java.lang.Object r6 = r1.mo28393Y(r10, r3)     // Catch:{ SQLiteException -> 0x0101 }
            int r0 = r10.getInt(r0)     // Catch:{ SQLiteException -> 0x0101 }
            if (r0 == 0) goto L_0x0068
            r21 = r3
            goto L_0x006a
        L_0x0068:
            r21 = r2
        L_0x006a:
            r0 = 3
            java.lang.String r22 = r10.getString(r0)     // Catch:{ SQLiteException -> 0x0101 }
            r0 = 4
            long r24 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x0101 }
            c.q.a.c.i.b.y9 r0 = r1.f10663b     // Catch:{ SQLiteException -> 0x0101 }
            c.q.a.c.i.b.aa r0 = r0.mo28743f0()     // Catch:{ SQLiteException -> 0x0101 }
            r2 = 5
            byte[] r2 = r10.getBlob(r2)     // Catch:{ SQLiteException -> 0x0101 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzaw> r3 = com.google.android.gms.measurement.internal.zzaw.CREATOR     // Catch:{ SQLiteException -> 0x0101 }
            android.os.Parcelable r0 = r0.mo28092z(r2, r3)     // Catch:{ SQLiteException -> 0x0101 }
            r23 = r0
            com.google.android.gms.measurement.internal.zzaw r23 = (com.google.android.gms.measurement.internal.zzaw) r23     // Catch:{ SQLiteException -> 0x0101 }
            r0 = 6
            long r19 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x0101 }
            c.q.a.c.i.b.y9 r0 = r1.f10663b     // Catch:{ SQLiteException -> 0x0101 }
            c.q.a.c.i.b.aa r0 = r0.mo28743f0()     // Catch:{ SQLiteException -> 0x0101 }
            r2 = 7
            byte[] r2 = r10.getBlob(r2)     // Catch:{ SQLiteException -> 0x0101 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzaw> r3 = com.google.android.gms.measurement.internal.zzaw.CREATOR     // Catch:{ SQLiteException -> 0x0101 }
            android.os.Parcelable r0 = r0.mo28092z(r2, r3)     // Catch:{ SQLiteException -> 0x0101 }
            r26 = r0
            com.google.android.gms.measurement.internal.zzaw r26 = (com.google.android.gms.measurement.internal.zzaw) r26     // Catch:{ SQLiteException -> 0x0101 }
            r0 = 8
            long r4 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x0101 }
            r0 = 9
            long r27 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x0101 }
            c.q.a.c.i.b.y9 r0 = r1.f10663b     // Catch:{ SQLiteException -> 0x0101 }
            c.q.a.c.i.b.aa r0 = r0.mo28743f0()     // Catch:{ SQLiteException -> 0x0101 }
            r2 = 10
            byte[] r2 = r10.getBlob(r2)     // Catch:{ SQLiteException -> 0x0101 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzaw> r3 = com.google.android.gms.measurement.internal.zzaw.CREATOR     // Catch:{ SQLiteException -> 0x0101 }
            android.os.Parcelable r0 = r0.mo28092z(r2, r3)     // Catch:{ SQLiteException -> 0x0101 }
            r29 = r0
            com.google.android.gms.measurement.internal.zzaw r29 = (com.google.android.gms.measurement.internal.zzaw) r29     // Catch:{ SQLiteException -> 0x0101 }
            com.google.android.gms.measurement.internal.zzkw r18 = new com.google.android.gms.measurement.internal.zzkw     // Catch:{ SQLiteException -> 0x0101 }
            r2 = r18
            r3 = r32
            r7 = r17
            r2.<init>(r3, r4, r6, r7)     // Catch:{ SQLiteException -> 0x0101 }
            com.google.android.gms.measurement.internal.zzac r0 = new com.google.android.gms.measurement.internal.zzac     // Catch:{ SQLiteException -> 0x0101 }
            r15 = r0
            r16 = r31
            r15.<init>(r16, r17, r18, r19, r21, r22, r23, r24, r26, r27, r29)     // Catch:{ SQLiteException -> 0x0101 }
            boolean r2 = r10.moveToNext()     // Catch:{ SQLiteException -> 0x0101 }
            if (r2 == 0) goto L_0x00fb
            c.q.a.c.i.b.t4 r2 = r1.f10699a     // Catch:{ SQLiteException -> 0x0101 }
            c.q.a.c.i.b.i3 r2 = r2.mo28487b()     // Catch:{ SQLiteException -> 0x0101 }
            c.q.a.c.i.b.g3 r2 = r2.mo28339r()     // Catch:{ SQLiteException -> 0x0101 }
            java.lang.String r3 = "Got multiple records for conditional property, expected one"
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r31)     // Catch:{ SQLiteException -> 0x0101 }
            c.q.a.c.i.b.t4 r5 = r1.f10699a     // Catch:{ SQLiteException -> 0x0101 }
            c.q.a.c.i.b.d3 r5 = r5.mo28620D()     // Catch:{ SQLiteException -> 0x0101 }
            java.lang.String r5 = r5.mo28146f(r8)     // Catch:{ SQLiteException -> 0x0101 }
            r2.mo28261c(r3, r4, r5)     // Catch:{ SQLiteException -> 0x0101 }
        L_0x00fb:
            if (r10 == 0) goto L_0x0100
            r10.close()
        L_0x0100:
            return r0
        L_0x0101:
            r0 = move-exception
            goto L_0x0107
        L_0x0103:
            r0 = move-exception
            goto L_0x012c
        L_0x0105:
            r0 = move-exception
            r10 = r9
        L_0x0107:
            c.q.a.c.i.b.t4 r2 = r1.f10699a     // Catch:{ all -> 0x012a }
            c.q.a.c.i.b.i3 r2 = r2.mo28487b()     // Catch:{ all -> 0x012a }
            c.q.a.c.i.b.g3 r2 = r2.mo28339r()     // Catch:{ all -> 0x012a }
            java.lang.String r3 = "Error querying conditional property"
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r31)     // Catch:{ all -> 0x012a }
            c.q.a.c.i.b.t4 r5 = r1.f10699a     // Catch:{ all -> 0x012a }
            c.q.a.c.i.b.d3 r5 = r5.mo28620D()     // Catch:{ all -> 0x012a }
            java.lang.String r5 = r5.mo28146f(r8)     // Catch:{ all -> 0x012a }
            r2.mo28262d(r3, r4, r5, r0)     // Catch:{ all -> 0x012a }
            if (r10 == 0) goto L_0x0129
            r10.close()
        L_0x0129:
            return r9
        L_0x012a:
            r0 = move-exception
            r9 = r10
        L_0x012c:
            if (r9 == 0) goto L_0x0131
            r9.close()
        L_0x0131:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p340i.p342b.C5547l.mo28388S(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzac");
    }

    @WorkerThread
    /* renamed from: T */
    public final C5523j mo28389T(long j, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return mo28390U(j, str, 1, false, false, z3, false, z5);
    }

    @WorkerThread
    /* renamed from: U */
    public final C5523j mo28390U(long j, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C3495o.m8904f(str);
        mo28029h();
        mo28475i();
        String[] strArr = {str};
        C5523j jVar = new C5523j();
        Cursor cursor = null;
        try {
            SQLiteDatabase P = mo28385P();
            cursor = P.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                this.f10699a.mo28487b().mo28344w().mo28260b("Not updating daily counts, app is not known. appId", C5515i3.m15778z(str));
                if (cursor != null) {
                    cursor.close();
                }
                return jVar;
            }
            if (cursor.getLong(0) == j) {
                jVar.f10576b = cursor.getLong(1);
                jVar.f10575a = cursor.getLong(2);
                jVar.f10577c = cursor.getLong(3);
                jVar.f10578d = cursor.getLong(4);
                jVar.f10579e = cursor.getLong(5);
            }
            if (z) {
                jVar.f10576b += j2;
            }
            if (z2) {
                jVar.f10575a += j2;
            }
            if (z3) {
                jVar.f10577c += j2;
            }
            if (z4) {
                jVar.f10578d += j2;
            }
            if (z5) {
                jVar.f10579e += j2;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("day", Long.valueOf(j));
            contentValues.put("daily_public_events_count", Long.valueOf(jVar.f10575a));
            contentValues.put("daily_events_count", Long.valueOf(jVar.f10576b));
            contentValues.put("daily_conversions_count", Long.valueOf(jVar.f10577c));
            contentValues.put("daily_error_events_count", Long.valueOf(jVar.f10578d));
            contentValues.put("daily_realtime_events_count", Long.valueOf(jVar.f10579e));
            P.update("apps", contentValues, "app_id=?", strArr);
            if (cursor != null) {
                cursor.close();
            }
            return jVar;
        } catch (SQLiteException e) {
            this.f10699a.mo28487b().mo28339r().mo28261c("Error updating daily counts. appId", C5515i3.m15778z(str), e);
            if (cursor != null) {
                cursor.close();
            }
            return jVar;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0154  */
    @androidx.annotation.WorkerThread
    /* renamed from: V */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p040c.p200q.p201a.p264c.p340i.p342b.C5619r mo28391V(java.lang.String r28, java.lang.String r29) {
        /*
            r27 = this;
            r1 = r27
            r15 = r29
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8904f(r28)
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8904f(r29)
            r27.mo28029h()
            r27.mo28475i()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.lang.String r2 = "lifetime_count"
            java.lang.String r3 = "current_bundle_count"
            java.lang.String r4 = "last_fire_timestamp"
            java.lang.String r5 = "last_bundled_timestamp"
            java.lang.String r6 = "last_bundled_day"
            java.lang.String r7 = "last_sampled_complex_event_id"
            java.lang.String r8 = "last_sampling_rate"
            java.lang.String r9 = "last_exempt_from_sampling"
            java.lang.String r10 = "current_session_count"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9, r10}
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0.<init>(r2)
            r19 = 0
            android.database.sqlite.SQLiteDatabase r2 = r27.mo28385P()     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            r10 = 0
            java.lang.String[] r3 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            java.lang.Object[] r0 = r0.toArray(r3)     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            r4 = r0
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            r0 = 2
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            r6[r10] = r28     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            r11 = 1
            r6[r11] = r15     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            java.lang.String r3 = "events"
            java.lang.String r5 = "app_id=? and name=?"
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r13 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            boolean r2 = r13.moveToFirst()     // Catch:{ SQLiteException -> 0x011f, all -> 0x0119 }
            if (r2 != 0) goto L_0x005e
            if (r13 == 0) goto L_0x005d
            r13.close()
        L_0x005d:
            return r19
        L_0x005e:
            long r5 = r13.getLong(r10)     // Catch:{ SQLiteException -> 0x011f, all -> 0x0119 }
            long r7 = r13.getLong(r11)     // Catch:{ SQLiteException -> 0x011f, all -> 0x0119 }
            long r16 = r13.getLong(r0)     // Catch:{ SQLiteException -> 0x011f, all -> 0x0119 }
            r0 = 3
            boolean r2 = r13.isNull(r0)     // Catch:{ SQLiteException -> 0x011f, all -> 0x0119 }
            r3 = 0
            if (r2 == 0) goto L_0x0076
            r20 = r3
            goto L_0x007a
        L_0x0076:
            long r20 = r13.getLong(r0)     // Catch:{ SQLiteException -> 0x011f, all -> 0x0119 }
        L_0x007a:
            r0 = 4
            boolean r2 = r13.isNull(r0)     // Catch:{ SQLiteException -> 0x011f, all -> 0x0119 }
            if (r2 == 0) goto L_0x0084
            r0 = r19
            goto L_0x008c
        L_0x0084:
            long r22 = r13.getLong(r0)     // Catch:{ SQLiteException -> 0x011f, all -> 0x0119 }
            java.lang.Long r0 = java.lang.Long.valueOf(r22)     // Catch:{ SQLiteException -> 0x011f, all -> 0x0119 }
        L_0x008c:
            r2 = 5
            boolean r9 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x011f, all -> 0x0119 }
            if (r9 == 0) goto L_0x0096
            r18 = r19
            goto L_0x00a0
        L_0x0096:
            long r22 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x011f, all -> 0x0119 }
            java.lang.Long r2 = java.lang.Long.valueOf(r22)     // Catch:{ SQLiteException -> 0x011f, all -> 0x0119 }
            r18 = r2
        L_0x00a0:
            r2 = 6
            boolean r9 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x011f, all -> 0x0119 }
            if (r9 == 0) goto L_0x00aa
            r22 = r19
            goto L_0x00b4
        L_0x00aa:
            long r22 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x011f, all -> 0x0119 }
            java.lang.Long r2 = java.lang.Long.valueOf(r22)     // Catch:{ SQLiteException -> 0x011f, all -> 0x0119 }
            r22 = r2
        L_0x00b4:
            r2 = 7
            boolean r9 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x011f, all -> 0x0119 }
            if (r9 != 0) goto L_0x00cd
            long r23 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x011f, all -> 0x0119 }
            r25 = 1
            int r2 = (r23 > r25 ? 1 : (r23 == r25 ? 0 : -1))
            if (r2 != 0) goto L_0x00c6
            r10 = r11
        L_0x00c6:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r10)     // Catch:{ SQLiteException -> 0x011f, all -> 0x0119 }
            r23 = r2
            goto L_0x00cf
        L_0x00cd:
            r23 = r19
        L_0x00cf:
            r2 = 8
            boolean r9 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x011f, all -> 0x0119 }
            if (r9 == 0) goto L_0x00d9
            r9 = r3
            goto L_0x00de
        L_0x00d9:
            long r2 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x011f, all -> 0x0119 }
            r9 = r2
        L_0x00de:
            c.q.a.c.i.b.r r24 = new c.q.a.c.i.b.r     // Catch:{ SQLiteException -> 0x011f, all -> 0x0119 }
            r2 = r24
            r3 = r28
            r4 = r29
            r11 = r16
            r25 = r13
            r13 = r20
            r15 = r0
            r16 = r18
            r17 = r22
            r18 = r23
            r2.<init>(r3, r4, r5, r7, r9, r11, r13, r15, r16, r17, r18)     // Catch:{ SQLiteException -> 0x0117, all -> 0x0115 }
            boolean r0 = r25.moveToNext()     // Catch:{ SQLiteException -> 0x0117, all -> 0x0115 }
            if (r0 == 0) goto L_0x010f
            c.q.a.c.i.b.t4 r0 = r1.f10699a     // Catch:{ SQLiteException -> 0x0117, all -> 0x0115 }
            c.q.a.c.i.b.i3 r0 = r0.mo28487b()     // Catch:{ SQLiteException -> 0x0117, all -> 0x0115 }
            c.q.a.c.i.b.g3 r0 = r0.mo28339r()     // Catch:{ SQLiteException -> 0x0117, all -> 0x0115 }
            java.lang.String r2 = "Got multiple records for event aggregates, expected one. appId"
            java.lang.Object r3 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r28)     // Catch:{ SQLiteException -> 0x0117, all -> 0x0115 }
            r0.mo28260b(r2, r3)     // Catch:{ SQLiteException -> 0x0117, all -> 0x0115 }
        L_0x010f:
            if (r25 == 0) goto L_0x0114
            r25.close()
        L_0x0114:
            return r24
        L_0x0115:
            r0 = move-exception
            goto L_0x011c
        L_0x0117:
            r0 = move-exception
            goto L_0x0122
        L_0x0119:
            r0 = move-exception
            r25 = r13
        L_0x011c:
            r19 = r25
            goto L_0x0152
        L_0x011f:
            r0 = move-exception
            r25 = r13
        L_0x0122:
            r13 = r25
            goto L_0x012a
        L_0x0125:
            r0 = move-exception
            goto L_0x0152
        L_0x0127:
            r0 = move-exception
            r13 = r19
        L_0x012a:
            c.q.a.c.i.b.t4 r2 = r1.f10699a     // Catch:{ all -> 0x014f }
            c.q.a.c.i.b.i3 r2 = r2.mo28487b()     // Catch:{ all -> 0x014f }
            c.q.a.c.i.b.g3 r2 = r2.mo28339r()     // Catch:{ all -> 0x014f }
            java.lang.String r3 = "Error querying events. appId"
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r28)     // Catch:{ all -> 0x014f }
            c.q.a.c.i.b.t4 r5 = r1.f10699a     // Catch:{ all -> 0x014f }
            c.q.a.c.i.b.d3 r5 = r5.mo28620D()     // Catch:{ all -> 0x014f }
            r6 = r29
            java.lang.String r5 = r5.mo28144d(r6)     // Catch:{ all -> 0x014f }
            r2.mo28262d(r3, r4, r5, r0)     // Catch:{ all -> 0x014f }
            if (r13 == 0) goto L_0x014e
            r13.close()
        L_0x014e:
            return r19
        L_0x014f:
            r0 = move-exception
            r19 = r13
        L_0x0152:
            if (r19 == 0) goto L_0x0157
            r19.close()
        L_0x0157:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p340i.p342b.C5547l.mo28391V(java.lang.String, java.lang.String):c.q.a.c.i.b.r");
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ac  */
    @androidx.annotation.WorkerThread
    /* renamed from: X */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p040c.p200q.p201a.p264c.p340i.p342b.C5450ca mo28392X(java.lang.String r20, java.lang.String r21) {
        /*
            r19 = this;
            r1 = r19
            r9 = r21
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8904f(r20)
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8904f(r21)
            r19.mo28029h()
            r19.mo28475i()
            r10 = 0
            android.database.sqlite.SQLiteDatabase r11 = r19.mo28385P()     // Catch:{ SQLiteException -> 0x0083, all -> 0x0081 }
            java.lang.String r0 = "set_timestamp"
            java.lang.String r2 = "value"
            java.lang.String r3 = "origin"
            java.lang.String[] r13 = new java.lang.String[]{r0, r2, r3}     // Catch:{ SQLiteException -> 0x0083, all -> 0x0081 }
            r0 = 2
            java.lang.String[] r15 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0083, all -> 0x0081 }
            r2 = 0
            r15[r2] = r20     // Catch:{ SQLiteException -> 0x0083, all -> 0x0081 }
            r3 = 1
            r15[r3] = r9     // Catch:{ SQLiteException -> 0x0083, all -> 0x0081 }
            java.lang.String r12 = "user_attributes"
            java.lang.String r14 = "app_id=? and name=?"
            r16 = 0
            r17 = 0
            r18 = 0
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ SQLiteException -> 0x0083, all -> 0x0081 }
            boolean r4 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x007f }
            if (r4 != 0) goto L_0x0042
            if (r11 == 0) goto L_0x0041
            r11.close()
        L_0x0041:
            return r10
        L_0x0042:
            long r6 = r11.getLong(r2)     // Catch:{ SQLiteException -> 0x007f }
            java.lang.Object r8 = r1.mo28393Y(r11, r3)     // Catch:{ SQLiteException -> 0x007f }
            if (r8 != 0) goto L_0x0052
            if (r11 == 0) goto L_0x0051
            r11.close()
        L_0x0051:
            return r10
        L_0x0052:
            java.lang.String r4 = r11.getString(r0)     // Catch:{ SQLiteException -> 0x007f }
            c.q.a.c.i.b.ca r0 = new c.q.a.c.i.b.ca     // Catch:{ SQLiteException -> 0x007f }
            r2 = r0
            r3 = r20
            r5 = r21
            r2.<init>(r3, r4, r5, r6, r8)     // Catch:{ SQLiteException -> 0x007f }
            boolean r2 = r11.moveToNext()     // Catch:{ SQLiteException -> 0x007f }
            if (r2 == 0) goto L_0x0079
            c.q.a.c.i.b.t4 r2 = r1.f10699a     // Catch:{ SQLiteException -> 0x007f }
            c.q.a.c.i.b.i3 r2 = r2.mo28487b()     // Catch:{ SQLiteException -> 0x007f }
            c.q.a.c.i.b.g3 r2 = r2.mo28339r()     // Catch:{ SQLiteException -> 0x007f }
            java.lang.String r3 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r20)     // Catch:{ SQLiteException -> 0x007f }
            r2.mo28260b(r3, r4)     // Catch:{ SQLiteException -> 0x007f }
        L_0x0079:
            if (r11 == 0) goto L_0x007e
            r11.close()
        L_0x007e:
            return r0
        L_0x007f:
            r0 = move-exception
            goto L_0x0085
        L_0x0081:
            r0 = move-exception
            goto L_0x00aa
        L_0x0083:
            r0 = move-exception
            r11 = r10
        L_0x0085:
            c.q.a.c.i.b.t4 r2 = r1.f10699a     // Catch:{ all -> 0x00a8 }
            c.q.a.c.i.b.i3 r2 = r2.mo28487b()     // Catch:{ all -> 0x00a8 }
            c.q.a.c.i.b.g3 r2 = r2.mo28339r()     // Catch:{ all -> 0x00a8 }
            java.lang.String r3 = "Error querying user property. appId"
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r20)     // Catch:{ all -> 0x00a8 }
            c.q.a.c.i.b.t4 r5 = r1.f10699a     // Catch:{ all -> 0x00a8 }
            c.q.a.c.i.b.d3 r5 = r5.mo28620D()     // Catch:{ all -> 0x00a8 }
            java.lang.String r5 = r5.mo28146f(r9)     // Catch:{ all -> 0x00a8 }
            r2.mo28262d(r3, r4, r5, r0)     // Catch:{ all -> 0x00a8 }
            if (r11 == 0) goto L_0x00a7
            r11.close()
        L_0x00a7:
            return r10
        L_0x00a8:
            r0 = move-exception
            r10 = r11
        L_0x00aa:
            if (r10 == 0) goto L_0x00af
            r10.close()
        L_0x00af:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p340i.p342b.C5547l.mo28392X(java.lang.String, java.lang.String):c.q.a.c.i.b.ca");
    }

    @WorkerThread
    /* renamed from: Y */
    public final Object mo28393Y(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 0) {
            this.f10699a.mo28487b().mo28339r().mo28259a("Loaded invalid null value from database");
            return null;
        } else if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        } else {
            if (type == 2) {
                return Double.valueOf(cursor.getDouble(i));
            }
            if (type == 3) {
                return cursor.getString(i);
            }
            if (type != 4) {
                this.f10699a.mo28487b().mo28339r().mo28260b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                return null;
            }
            this.f10699a.mo28487b().mo28339r().mo28259a("Loaded invalid blob type value, ignoring it");
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0044  */
    @androidx.annotation.WorkerThread
    /* renamed from: Z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo28394Z() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.mo28385P()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch:{ SQLiteException -> 0x0026, all -> 0x0024 }
            boolean r2 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x0022 }
            if (r2 == 0) goto L_0x001c
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch:{ SQLiteException -> 0x0022 }
            if (r0 == 0) goto L_0x001b
            r0.close()
        L_0x001b:
            return r1
        L_0x001c:
            if (r0 == 0) goto L_0x0021
            r0.close()
        L_0x0021:
            return r1
        L_0x0022:
            r2 = move-exception
            goto L_0x0029
        L_0x0024:
            r0 = move-exception
            goto L_0x0042
        L_0x0026:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L_0x0029:
            c.q.a.c.i.b.t4 r3 = r6.f10699a     // Catch:{ all -> 0x003e }
            c.q.a.c.i.b.i3 r3 = r3.mo28487b()     // Catch:{ all -> 0x003e }
            c.q.a.c.i.b.g3 r3 = r3.mo28339r()     // Catch:{ all -> 0x003e }
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.mo28260b(r4, r2)     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x003d
            r0.close()
        L_0x003d:
            return r1
        L_0x003e:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L_0x0042:
            if (r1 == 0) goto L_0x0047
            r1.close()
        L_0x0047:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p340i.p342b.C5547l.mo28394Z():java.lang.String");
    }

    @WorkerThread
    /* renamed from: a0 */
    public final List mo28395a0(String str, String str2, String str3) {
        C3495o.m8904f(str);
        mo28029h();
        mo28475i();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return mo28396b0(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* renamed from: b0 */
    public final List mo28396b0(String str, String[] strArr) {
        mo28029h();
        mo28475i();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            SQLiteDatabase P = mo28385P();
            String[] strArr2 = {"app_id", EventBusConstKt.ORIGIN, "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"};
            this.f10699a.mo28649z();
            Cursor query = P.query("conditional_properties", strArr2, str, strArr, (String) null, (String) null, "rowid", "1001");
            if (query.moveToFirst()) {
                while (true) {
                    int size = arrayList.size();
                    this.f10699a.mo28649z();
                    if (size < 1000) {
                        String string = query.getString(0);
                        String string2 = query.getString(1);
                        String string3 = query.getString(2);
                        Object Y = mo28393Y(query, 3);
                        boolean z = query.getInt(4) != 0;
                        String string4 = query.getString(5);
                        long j = query.getLong(6);
                        arrayList.add(new zzac(string, string2, new zzkw(string3, query.getLong(10), Y, string2), query.getLong(8), z, string4, (zzaw) this.f10663b.mo28743f0().mo28092z(query.getBlob(7), zzaw.CREATOR), j, (zzaw) this.f10663b.mo28743f0().mo28092z(query.getBlob(9), zzaw.CREATOR), query.getLong(11), (zzaw) this.f10663b.mo28743f0().mo28092z(query.getBlob(12), zzaw.CREATOR)));
                        if (!query.moveToNext()) {
                            break;
                        }
                    } else {
                        C5491g3 r = this.f10699a.mo28487b().mo28339r();
                        this.f10699a.mo28649z();
                        r.mo28260b("Read more than the max allowed conditional properties, ignoring extra", 1000);
                        break;
                    }
                }
                if (query != null) {
                    query.close();
                }
                return arrayList;
            }
            if (query != null) {
                query.close();
            }
            return arrayList;
        } catch (SQLiteException e) {
            this.f10699a.mo28487b().mo28339r().mo28260b("Error querying conditional user property value", e);
            List emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @WorkerThread
    /* renamed from: c0 */
    public final List mo28397c0(String str) {
        C3495o.m8904f(str);
        mo28029h();
        mo28475i();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            this.f10699a.mo28649z();
            Cursor query = mo28385P().query("user_attributes", new String[]{"name", EventBusConstKt.ORIGIN, "set_timestamp", "value"}, "app_id=?", new String[]{str}, (String) null, (String) null, "rowid", "1000");
            if (query.moveToFirst()) {
                do {
                    String string = query.getString(0);
                    String string2 = query.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j = query.getLong(2);
                    Object Y = mo28393Y(query, 3);
                    if (Y == null) {
                        this.f10699a.mo28487b().mo28339r().mo28260b("Read invalid user property value, ignoring it. appId", C5515i3.m15778z(str));
                    } else {
                        arrayList.add(new C5450ca(str, str2, string, j, Y));
                    }
                } while (query.moveToNext());
                if (query != null) {
                    query.close();
                }
                return arrayList;
            }
            if (query != null) {
                query.close();
            }
            return arrayList;
        } catch (SQLiteException e) {
            this.f10699a.mo28487b().mo28339r().mo28261c("Error querying user properties. appId", C5515i3.m15778z(str), e);
            List emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0128 A[DONT_GENERATE] */
    @androidx.annotation.WorkerThread
    /* renamed from: d0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo28398d0(java.lang.String r18, java.lang.String r19, java.lang.String r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r20
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8904f(r18)
            r17.mo28029h()
            r17.mo28475i()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r11 = "1001"
            r12 = 0
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x010a }
            r13 = 3
            r3.<init>(r13)     // Catch:{ SQLiteException -> 0x010a }
            r14 = r18
            r3.add(r14)     // Catch:{ SQLiteException -> 0x0108 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0108 }
            java.lang.String r5 = "app_id=?"
            r4.<init>(r5)     // Catch:{ SQLiteException -> 0x0108 }
            boolean r5 = android.text.TextUtils.isEmpty(r19)     // Catch:{ SQLiteException -> 0x0108 }
            if (r5 != 0) goto L_0x0038
            r15 = r19
            r3.add(r15)     // Catch:{ SQLiteException -> 0x0104 }
            java.lang.String r5 = " and origin=?"
            r4.append(r5)     // Catch:{ SQLiteException -> 0x0104 }
            goto L_0x003a
        L_0x0038:
            r15 = r19
        L_0x003a:
            boolean r5 = android.text.TextUtils.isEmpty(r20)     // Catch:{ SQLiteException -> 0x0104 }
            if (r5 != 0) goto L_0x0059
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0104 }
            r5.<init>()     // Catch:{ SQLiteException -> 0x0104 }
            r5.append(r0)     // Catch:{ SQLiteException -> 0x0104 }
            java.lang.String r6 = "*"
            r5.append(r6)     // Catch:{ SQLiteException -> 0x0104 }
            java.lang.String r5 = r5.toString()     // Catch:{ SQLiteException -> 0x0104 }
            r3.add(r5)     // Catch:{ SQLiteException -> 0x0104 }
            java.lang.String r5 = " and name glob ?"
            r4.append(r5)     // Catch:{ SQLiteException -> 0x0104 }
        L_0x0059:
            int r5 = r3.size()     // Catch:{ SQLiteException -> 0x0104 }
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0104 }
            java.lang.Object[] r3 = r3.toArray(r5)     // Catch:{ SQLiteException -> 0x0104 }
            r7 = r3
            java.lang.String[] r7 = (java.lang.String[]) r7     // Catch:{ SQLiteException -> 0x0104 }
            android.database.sqlite.SQLiteDatabase r3 = r17.mo28385P()     // Catch:{ SQLiteException -> 0x0104 }
            java.lang.String r5 = "user_attributes"
            java.lang.String r6 = "name"
            java.lang.String r8 = "set_timestamp"
            java.lang.String r9 = "value"
            java.lang.String r10 = "origin"
            java.lang.String[] r6 = new java.lang.String[]{r6, r8, r9, r10}     // Catch:{ SQLiteException -> 0x0104 }
            java.lang.String r8 = r4.toString()     // Catch:{ SQLiteException -> 0x0104 }
            java.lang.String r10 = "rowid"
            c.q.a.c.i.b.t4 r4 = r1.f10699a     // Catch:{ SQLiteException -> 0x0104 }
            r4.mo28649z()     // Catch:{ SQLiteException -> 0x0104 }
            r9 = 0
            r16 = 0
            r4 = r5
            r5 = r6
            r6 = r8
            r8 = r9
            r9 = r16
            android.database.Cursor r12 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x0104 }
            boolean r3 = r12.moveToFirst()     // Catch:{ SQLiteException -> 0x0104 }
            if (r3 != 0) goto L_0x009c
            if (r12 == 0) goto L_0x009b
            r12.close()
        L_0x009b:
            return r2
        L_0x009c:
            int r3 = r2.size()     // Catch:{ SQLiteException -> 0x0104 }
            c.q.a.c.i.b.t4 r4 = r1.f10699a     // Catch:{ SQLiteException -> 0x0104 }
            r4.mo28649z()     // Catch:{ SQLiteException -> 0x0104 }
            r4 = 1000(0x3e8, float:1.401E-42)
            if (r3 < r4) goto L_0x00c2
            c.q.a.c.i.b.t4 r0 = r1.f10699a     // Catch:{ SQLiteException -> 0x0104 }
            c.q.a.c.i.b.i3 r0 = r0.mo28487b()     // Catch:{ SQLiteException -> 0x0104 }
            c.q.a.c.i.b.g3 r0 = r0.mo28339r()     // Catch:{ SQLiteException -> 0x0104 }
            java.lang.String r3 = "Read more than the max allowed user properties, ignoring excess"
            c.q.a.c.i.b.t4 r5 = r1.f10699a     // Catch:{ SQLiteException -> 0x0104 }
            r5.mo28649z()     // Catch:{ SQLiteException -> 0x0104 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ SQLiteException -> 0x0104 }
            r0.mo28260b(r3, r4)     // Catch:{ SQLiteException -> 0x0104 }
            goto L_0x00fe
        L_0x00c2:
            r3 = 0
            java.lang.String r7 = r12.getString(r3)     // Catch:{ SQLiteException -> 0x0104 }
            r3 = 1
            long r8 = r12.getLong(r3)     // Catch:{ SQLiteException -> 0x0104 }
            r3 = 2
            java.lang.Object r10 = r1.mo28393Y(r12, r3)     // Catch:{ SQLiteException -> 0x0104 }
            java.lang.String r15 = r12.getString(r13)     // Catch:{ SQLiteException -> 0x0104 }
            if (r10 != 0) goto L_0x00eb
            c.q.a.c.i.b.t4 r3 = r1.f10699a     // Catch:{ SQLiteException -> 0x0104 }
            c.q.a.c.i.b.i3 r3 = r3.mo28487b()     // Catch:{ SQLiteException -> 0x0104 }
            c.q.a.c.i.b.g3 r3 = r3.mo28339r()     // Catch:{ SQLiteException -> 0x0104 }
            java.lang.String r4 = "(2)Read invalid user property value, ignoring it"
            java.lang.Object r5 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r18)     // Catch:{ SQLiteException -> 0x0104 }
            r3.mo28262d(r4, r5, r15, r0)     // Catch:{ SQLiteException -> 0x0104 }
            goto L_0x00f7
        L_0x00eb:
            c.q.a.c.i.b.ca r3 = new c.q.a.c.i.b.ca     // Catch:{ SQLiteException -> 0x0104 }
            r4 = r3
            r5 = r18
            r6 = r15
            r4.<init>(r5, r6, r7, r8, r10)     // Catch:{ SQLiteException -> 0x0104 }
            r2.add(r3)     // Catch:{ SQLiteException -> 0x0104 }
        L_0x00f7:
            boolean r3 = r12.moveToNext()     // Catch:{ SQLiteException -> 0x0104 }
            if (r3 == 0) goto L_0x00fe
            goto L_0x009c
        L_0x00fe:
            if (r12 == 0) goto L_0x0103
            r12.close()
        L_0x0103:
            return r2
        L_0x0104:
            r0 = move-exception
            goto L_0x010f
        L_0x0106:
            r0 = move-exception
            goto L_0x012c
        L_0x0108:
            r0 = move-exception
            goto L_0x010d
        L_0x010a:
            r0 = move-exception
            r14 = r18
        L_0x010d:
            r15 = r19
        L_0x010f:
            c.q.a.c.i.b.t4 r2 = r1.f10699a     // Catch:{ all -> 0x0106 }
            c.q.a.c.i.b.i3 r2 = r2.mo28487b()     // Catch:{ all -> 0x0106 }
            c.q.a.c.i.b.g3 r2 = r2.mo28339r()     // Catch:{ all -> 0x0106 }
            java.lang.String r3 = "(2)Error querying user properties"
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r18)     // Catch:{ all -> 0x0106 }
            r2.mo28262d(r3, r4, r15, r0)     // Catch:{ all -> 0x0106 }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0106 }
            if (r12 == 0) goto L_0x012b
            r12.close()
        L_0x012b:
            return r0
        L_0x012c:
            if (r12 == 0) goto L_0x0131
            r12.close()
        L_0x0131:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p340i.p342b.C5547l.mo28398d0(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    @WorkerThread
    /* renamed from: e0 */
    public final void mo28399e0() {
        mo28475i();
        mo28385P().beginTransaction();
    }

    @WorkerThread
    /* renamed from: f0 */
    public final void mo28400f0() {
        mo28475i();
        mo28385P().endTransaction();
    }

    @WorkerThread
    /* renamed from: g0 */
    public final void mo28401g0(List list) {
        mo28029h();
        mo28475i();
        C3495o.m8908j(list);
        C3495o.m8910l(list.size());
        if (mo28411u()) {
            String str = "(" + TextUtils.join(RunnerArgs.CLASS_SEPARATOR, list) + ")";
            if (mo28378I("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", (String[]) null) > 0) {
                this.f10699a.mo28487b().mo28344w().mo28259a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                mo28385P().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e) {
                this.f10699a.mo28487b().mo28339r().mo28260b("Error incrementing retry count. error", e);
            }
        }
    }

    @WorkerThread
    /* renamed from: h0 */
    public final void mo28402h0() {
        mo28029h();
        mo28475i();
        if (mo28411u()) {
            long a = this.f10663b.mo28741d0().f10859e.mo28615a();
            long b = this.f10699a.mo28488c().mo20839b();
            long abs = Math.abs(b - a);
            this.f10699a.mo28649z();
            if (abs > ((Long) C5658u2.f11005y.mo28613a((Object) null)).longValue()) {
                this.f10663b.mo28741d0().f10859e.mo28616b(b);
                mo28029h();
                mo28475i();
                if (mo28411u()) {
                    SQLiteDatabase P = mo28385P();
                    this.f10699a.mo28649z();
                    int delete = P.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(this.f10699a.mo28488c().mo20838a()), String.valueOf(C5487g.m15651i())});
                    if (delete > 0) {
                        this.f10699a.mo28487b().mo28343v().mo28260b("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }

    /* renamed from: l */
    public final boolean mo28087l() {
        return false;
    }

    @WorkerThread
    /* renamed from: m */
    public final void mo28403m(String str, String str2) {
        C3495o.m8904f(str);
        C3495o.m8904f(str2);
        mo28029h();
        mo28475i();
        try {
            mo28385P().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            this.f10699a.mo28487b().mo28339r().mo28262d("Error deleting user property. appId", C5515i3.m15778z(str), this.f10699a.mo28620D().mo28146f(str2), e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0333, code lost:
        r11.put("session_scoped", r0);
        r11.put("data", r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0347, code lost:
        if (mo28385P().insertWithOnConflict("property_filters", (java.lang.String) null, r11, 5) != -1) goto L_0x035d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0349, code lost:
        r1.f10699a.mo28487b().mo28339r().mo28260b("Failed to insert property filter (got -1). appId", p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r24));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x035d, code lost:
        r0 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0361, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:?, code lost:
        r1.f10699a.mo28487b().mo28339r().mo28261c("Error storing property filter. appId", p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r24), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x03ac, code lost:
        r3 = r25;
        r7 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x017a, code lost:
        r11 = r0.mo27946K().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0186, code lost:
        if (r11.hasNext() == false) goto L_0x01ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0192, code lost:
        if (((p040c.p200q.p201a.p264c.p294g.p335i.C5106i3) r11.next()).mo27320M() != false) goto L_0x0182;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0194, code lost:
        r1.f10699a.mo28487b().mo28344w().mo28261c("Property filter with no ID. Audience definition ignored. appId, audienceId", p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r24), java.lang.Integer.valueOf(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01ad, code lost:
        r11 = r0.mo27945J().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01c3, code lost:
        if (r11.hasNext() == false) goto L_0x0299;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        r12 = (p040c.p200q.p201a.p264c.p294g.p335i.C4978a3) r11.next();
        mo28475i();
        mo28029h();
        p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8904f(r24);
        p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8908j(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01df, code lost:
        if (r12.mo26921J().isEmpty() == false) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01e1, code lost:
        r0 = r1.f10699a.mo28487b().mo28344w();
        r9 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r24);
        r11 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01f9, code lost:
        if (r12.mo26927S() == false) goto L_0x0206;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01fb, code lost:
        r20 = java.lang.Integer.valueOf(r12.mo26918E());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0206, code lost:
        r20 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0208, code lost:
        r0.mo28262d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r9, r11, java.lang.String.valueOf(r20));
        r21 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0213, code lost:
        r3 = r12.mo27190h();
        r21 = r7;
        r7 = new android.content.ContentValues();
        r7.put("app_id", r2);
        r7.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x022c, code lost:
        if (r12.mo26927S() == false) goto L_0x0237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x022e, code lost:
        r9 = java.lang.Integer.valueOf(r12.mo26918E());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0237, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0238, code lost:
        r7.put("filter_id", r9);
        r7.put("event_name", r12.mo26921J());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0248, code lost:
        if (r12.mo26928T() == false) goto L_0x0253;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x024a, code lost:
        r9 = java.lang.Boolean.valueOf(r12.mo26925Q());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0253, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0254, code lost:
        r7.put("session_scoped", r9);
        r7.put("data", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0268, code lost:
        if (mo28385P().insertWithOnConflict("event_filters", (java.lang.String) null, r7, 5) != -1) goto L_0x027d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x026a, code lost:
        r1.f10699a.mo28487b().mo28339r().mo28260b("Failed to insert event filter (got -1). appId", p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r24));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x027d, code lost:
        r3 = r25;
        r7 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0299, code lost:
        r21 = r7;
        r0 = r0.mo27946K().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x02a7, code lost:
        if (r0.hasNext() == false) goto L_0x03ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x02a9, code lost:
        r3 = (p040c.p200q.p201a.p264c.p294g.p335i.C5106i3) r0.next();
        mo28475i();
        mo28029h();
        p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8904f(r24);
        p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8908j(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x02c3, code lost:
        if (r3.mo27316H().isEmpty() == false) goto L_0x02f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x02c5, code lost:
        r0 = r1.f10699a.mo28487b().mo28344w();
        r8 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r24);
        r9 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x02dd, code lost:
        if (r3.mo27320M() == false) goto L_0x02e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x02df, code lost:
        r3 = java.lang.Integer.valueOf(r3.mo27314D());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02e8, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02e9, code lost:
        r0.mo28262d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r8, r9, java.lang.String.valueOf(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02f2, code lost:
        r7 = r3.mo27190h();
        r11 = new android.content.ContentValues();
        r11.put("app_id", r2);
        r11.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0309, code lost:
        if (r3.mo27320M() == false) goto L_0x0314;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x030b, code lost:
        r12 = java.lang.Integer.valueOf(r3.mo27314D());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0314, code lost:
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0315, code lost:
        r11.put("filter_id", r12);
        r22 = r0;
        r11.put("property_name", r3.mo27316H());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0327, code lost:
        if (r3.mo27321N() == false) goto L_0x0332;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0329, code lost:
        r0 = java.lang.Boolean.valueOf(r3.mo27319L());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0332, code lost:
        r0 = null;
     */
    @androidx.annotation.WorkerThread
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28404n(java.lang.String r24, java.util.List r25) {
        /*
            r23 = this;
            r1 = r23
            r2 = r24
            r3 = r25
            java.lang.String r4 = "app_id=? and audience_id=?"
            java.lang.String r0 = "app_id=?"
            java.lang.String r5 = "event_filters"
            java.lang.String r6 = "property_filters"
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8908j(r25)
            r8 = 0
        L_0x0012:
            int r9 = r25.size()
            if (r8 >= r9) goto L_0x00dc
            java.lang.Object r9 = r3.get(r8)
            c.q.a.c.g.i.y2 r9 = (p040c.p200q.p201a.p264c.p294g.p335i.C5348y2) r9
            c.q.a.c.g.i.q8 r9 = r9.mo27727z()
            c.q.a.c.g.i.x2 r9 = (p040c.p200q.p201a.p264c.p294g.p335i.C5333x2) r9
            int r11 = r9.mo27876r()
            if (r11 == 0) goto L_0x009d
            r11 = 0
        L_0x002b:
            int r12 = r9.mo27876r()
            if (r11 >= r12) goto L_0x009d
            c.q.a.c.g.i.a3 r12 = r9.mo27880w(r11)
            c.q.a.c.g.i.q8 r12 = r12.mo27727z()
            c.q.a.c.g.i.z2 r12 = (p040c.p200q.p201a.p264c.p294g.p335i.C5363z2) r12
            c.q.a.c.g.i.q8 r13 = r12.clone()
            c.q.a.c.g.i.z2 r13 = (p040c.p200q.p201a.p264c.p294g.p335i.C5363z2) r13
            java.lang.String r14 = r12.mo27968w()
            java.lang.String r14 = p040c.p200q.p201a.p264c.p340i.p342b.C5625r5.m16064b(r14)
            if (r14 == 0) goto L_0x0050
            r13.mo27965s(r14)
            r14 = 1
            goto L_0x0051
        L_0x0050:
            r14 = 0
        L_0x0051:
            r15 = 0
        L_0x0052:
            int r7 = r12.mo27964r()
            if (r15 >= r7) goto L_0x0088
            c.q.a.c.g.i.c3 r7 = r12.mo27967v(r15)
            java.lang.String r10 = r7.mo27081H()
            r16 = r12
            java.lang.String[] r12 = p040c.p200q.p201a.p264c.p340i.p342b.C5637s5.f10848a
            r17 = r4
            java.lang.String[] r4 = p040c.p200q.p201a.p264c.p340i.p342b.C5637s5.f10849b
            java.lang.String r4 = p040c.p200q.p201a.p264c.p340i.p342b.C5507h7.m15763a(r10, r12, r4)
            if (r4 == 0) goto L_0x0081
            c.q.a.c.g.i.q8 r7 = r7.mo27727z()
            c.q.a.c.g.i.b3 r7 = (p040c.p200q.p201a.p264c.p294g.p335i.C4994b3) r7
            r7.mo26972r(r4)
            c.q.a.c.g.i.t8 r4 = r7.mo27520l()
            c.q.a.c.g.i.c3 r4 = (p040c.p200q.p201a.p264c.p294g.p335i.C5010c3) r4
            r13.mo27966t(r15, r4)
            r14 = 1
        L_0x0081:
            int r15 = r15 + 1
            r12 = r16
            r4 = r17
            goto L_0x0052
        L_0x0088:
            r17 = r4
            if (r14 == 0) goto L_0x0098
            r9.mo27878t(r11, r13)
            c.q.a.c.g.i.t8 r4 = r9.mo27520l()
            c.q.a.c.g.i.y2 r4 = (p040c.p200q.p201a.p264c.p294g.p335i.C5348y2) r4
            r3.set(r8, r4)
        L_0x0098:
            int r11 = r11 + 1
            r4 = r17
            goto L_0x002b
        L_0x009d:
            r17 = r4
            int r4 = r9.mo27877s()
            if (r4 == 0) goto L_0x00d6
            r4 = 0
        L_0x00a6:
            int r7 = r9.mo27877s()
            if (r4 >= r7) goto L_0x00d6
            c.q.a.c.g.i.i3 r7 = r9.mo27881y(r4)
            java.lang.String r10 = r7.mo27316H()
            java.lang.String[] r11 = p040c.p200q.p201a.p264c.p340i.p342b.C5649t5.f10923a
            java.lang.String[] r12 = p040c.p200q.p201a.p264c.p340i.p342b.C5649t5.f10924b
            java.lang.String r10 = p040c.p200q.p201a.p264c.p340i.p342b.C5507h7.m15763a(r10, r11, r12)
            if (r10 == 0) goto L_0x00d3
            c.q.a.c.g.i.q8 r7 = r7.mo27727z()
            c.q.a.c.g.i.h3 r7 = (p040c.p200q.p201a.p264c.p294g.p335i.C5090h3) r7
            r7.mo27285r(r10)
            r9.mo27879v(r4, r7)
            c.q.a.c.g.i.t8 r7 = r9.mo27520l()
            c.q.a.c.g.i.y2 r7 = (p040c.p200q.p201a.p264c.p294g.p335i.C5348y2) r7
            r3.set(r8, r7)
        L_0x00d3:
            int r4 = r4 + 1
            goto L_0x00a6
        L_0x00d6:
            int r8 = r8 + 1
            r4 = r17
            goto L_0x0012
        L_0x00dc:
            r17 = r4
            r23.mo28475i()
            r23.mo28029h()
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8904f(r24)
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8908j(r25)
            android.database.sqlite.SQLiteDatabase r4 = r23.mo28385P()
            r4.beginTransaction()
            r23.mo28475i()     // Catch:{ all -> 0x0495 }
            r23.mo28029h()     // Catch:{ all -> 0x0495 }
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8904f(r24)     // Catch:{ all -> 0x0495 }
            android.database.sqlite.SQLiteDatabase r7 = r23.mo28385P()     // Catch:{ all -> 0x0495 }
            r8 = 1
            java.lang.String[] r9 = new java.lang.String[r8]     // Catch:{ all -> 0x0495 }
            r10 = 0
            r9[r10] = r2     // Catch:{ all -> 0x0495 }
            r7.delete(r6, r0, r9)     // Catch:{ all -> 0x0495 }
            java.lang.String[] r9 = new java.lang.String[r8]     // Catch:{ all -> 0x0495 }
            r9[r10] = r2     // Catch:{ all -> 0x0495 }
            r7.delete(r5, r0, r9)     // Catch:{ all -> 0x0495 }
            java.util.Iterator r7 = r25.iterator()     // Catch:{ all -> 0x0495 }
        L_0x0112:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x0495 }
            if (r0 == 0) goto L_0x03b2
            java.lang.Object r0 = r7.next()     // Catch:{ all -> 0x0495 }
            c.q.a.c.g.i.y2 r0 = (p040c.p200q.p201a.p264c.p294g.p335i.C5348y2) r0     // Catch:{ all -> 0x0495 }
            r23.mo28475i()     // Catch:{ all -> 0x0495 }
            r23.mo28029h()     // Catch:{ all -> 0x0495 }
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8904f(r24)     // Catch:{ all -> 0x0495 }
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8908j(r0)     // Catch:{ all -> 0x0495 }
            boolean r10 = r0.mo27947N()     // Catch:{ all -> 0x0495 }
            if (r10 != 0) goto L_0x0144
            c.q.a.c.i.b.t4 r0 = r1.f10699a     // Catch:{ all -> 0x0495 }
            c.q.a.c.i.b.i3 r0 = r0.mo28487b()     // Catch:{ all -> 0x0495 }
            c.q.a.c.i.b.g3 r0 = r0.mo28344w()     // Catch:{ all -> 0x0495 }
            java.lang.String r8 = "Audience with no ID. appId"
            java.lang.Object r9 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r24)     // Catch:{ all -> 0x0495 }
            r0.mo28260b(r8, r9)     // Catch:{ all -> 0x0495 }
            goto L_0x0112
        L_0x0144:
            int r10 = r0.mo27940D()     // Catch:{ all -> 0x0495 }
            java.util.List r11 = r0.mo27945J()     // Catch:{ all -> 0x0495 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x0495 }
        L_0x0150:
            boolean r12 = r11.hasNext()     // Catch:{ all -> 0x0495 }
            if (r12 == 0) goto L_0x017a
            java.lang.Object r12 = r11.next()     // Catch:{ all -> 0x0495 }
            c.q.a.c.g.i.a3 r12 = (p040c.p200q.p201a.p264c.p294g.p335i.C4978a3) r12     // Catch:{ all -> 0x0495 }
            boolean r12 = r12.mo26927S()     // Catch:{ all -> 0x0495 }
            if (r12 != 0) goto L_0x0150
            c.q.a.c.i.b.t4 r0 = r1.f10699a     // Catch:{ all -> 0x0495 }
            c.q.a.c.i.b.i3 r0 = r0.mo28487b()     // Catch:{ all -> 0x0495 }
            c.q.a.c.i.b.g3 r0 = r0.mo28344w()     // Catch:{ all -> 0x0495 }
            java.lang.String r8 = "Event filter with no ID. Audience definition ignored. appId, audienceId"
            java.lang.Object r9 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r24)     // Catch:{ all -> 0x0495 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0495 }
            r0.mo28261c(r8, r9, r10)     // Catch:{ all -> 0x0495 }
            goto L_0x0112
        L_0x017a:
            java.util.List r11 = r0.mo27946K()     // Catch:{ all -> 0x0495 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x0495 }
        L_0x0182:
            boolean r12 = r11.hasNext()     // Catch:{ all -> 0x0495 }
            if (r12 == 0) goto L_0x01ad
            java.lang.Object r12 = r11.next()     // Catch:{ all -> 0x0495 }
            c.q.a.c.g.i.i3 r12 = (p040c.p200q.p201a.p264c.p294g.p335i.C5106i3) r12     // Catch:{ all -> 0x0495 }
            boolean r12 = r12.mo27320M()     // Catch:{ all -> 0x0495 }
            if (r12 != 0) goto L_0x0182
            c.q.a.c.i.b.t4 r0 = r1.f10699a     // Catch:{ all -> 0x0495 }
            c.q.a.c.i.b.i3 r0 = r0.mo28487b()     // Catch:{ all -> 0x0495 }
            c.q.a.c.i.b.g3 r0 = r0.mo28344w()     // Catch:{ all -> 0x0495 }
            java.lang.String r8 = "Property filter with no ID. Audience definition ignored. appId, audienceId"
            java.lang.Object r9 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r24)     // Catch:{ all -> 0x0495 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0495 }
            r0.mo28261c(r8, r9, r10)     // Catch:{ all -> 0x0495 }
            goto L_0x0112
        L_0x01ad:
            java.util.List r11 = r0.mo27945J()     // Catch:{ all -> 0x0495 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x0495 }
        L_0x01b5:
            boolean r12 = r11.hasNext()     // Catch:{ all -> 0x0495 }
            java.lang.String r8 = "data"
            java.lang.String r13 = "session_scoped"
            java.lang.String r14 = "filter_id"
            java.lang.String r9 = "audience_id"
            java.lang.String r15 = "app_id"
            if (r12 == 0) goto L_0x0299
            java.lang.Object r12 = r11.next()     // Catch:{ all -> 0x0495 }
            c.q.a.c.g.i.a3 r12 = (p040c.p200q.p201a.p264c.p294g.p335i.C4978a3) r12     // Catch:{ all -> 0x0495 }
            r23.mo28475i()     // Catch:{ all -> 0x0495 }
            r23.mo28029h()     // Catch:{ all -> 0x0495 }
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8904f(r24)     // Catch:{ all -> 0x0495 }
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8908j(r12)     // Catch:{ all -> 0x0495 }
            java.lang.String r21 = r12.mo26921J()     // Catch:{ all -> 0x0495 }
            boolean r21 = r21.isEmpty()     // Catch:{ all -> 0x0495 }
            if (r21 == 0) goto L_0x0213
            c.q.a.c.i.b.t4 r0 = r1.f10699a     // Catch:{ all -> 0x0495 }
            c.q.a.c.i.b.i3 r0 = r0.mo28487b()     // Catch:{ all -> 0x0495 }
            c.q.a.c.i.b.g3 r0 = r0.mo28344w()     // Catch:{ all -> 0x0495 }
            java.lang.String r8 = "Event filter had no event name. Audience definition ignored. appId, audienceId, filterId"
            java.lang.Object r9 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r24)     // Catch:{ all -> 0x0495 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0495 }
            boolean r13 = r12.mo26927S()     // Catch:{ all -> 0x0495 }
            if (r13 == 0) goto L_0x0206
            int r12 = r12.mo26918E()     // Catch:{ all -> 0x0495 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0495 }
            r20 = r12
            goto L_0x0208
        L_0x0206:
            r20 = 0
        L_0x0208:
            java.lang.String r12 = java.lang.String.valueOf(r20)     // Catch:{ all -> 0x0495 }
            r0.mo28262d(r8, r9, r11, r12)     // Catch:{ all -> 0x0495 }
            r21 = r7
            goto L_0x0375
        L_0x0213:
            byte[] r3 = r12.mo27190h()     // Catch:{ all -> 0x0495 }
            r21 = r7
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ all -> 0x0495 }
            r7.<init>()     // Catch:{ all -> 0x0495 }
            r7.put(r15, r2)     // Catch:{ all -> 0x0495 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0495 }
            r7.put(r9, r15)     // Catch:{ all -> 0x0495 }
            boolean r9 = r12.mo26927S()     // Catch:{ all -> 0x0495 }
            if (r9 == 0) goto L_0x0237
            int r9 = r12.mo26918E()     // Catch:{ all -> 0x0495 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0495 }
            goto L_0x0238
        L_0x0237:
            r9 = 0
        L_0x0238:
            r7.put(r14, r9)     // Catch:{ all -> 0x0495 }
            java.lang.String r9 = "event_name"
            java.lang.String r14 = r12.mo26921J()     // Catch:{ all -> 0x0495 }
            r7.put(r9, r14)     // Catch:{ all -> 0x0495 }
            boolean r9 = r12.mo26928T()     // Catch:{ all -> 0x0495 }
            if (r9 == 0) goto L_0x0253
            boolean r9 = r12.mo26925Q()     // Catch:{ all -> 0x0495 }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch:{ all -> 0x0495 }
            goto L_0x0254
        L_0x0253:
            r9 = 0
        L_0x0254:
            r7.put(r13, r9)     // Catch:{ all -> 0x0495 }
            r7.put(r8, r3)     // Catch:{ all -> 0x0495 }
            android.database.sqlite.SQLiteDatabase r3 = r23.mo28385P()     // Catch:{ SQLiteException -> 0x0283 }
            r8 = 5
            r9 = 0
            long r7 = r3.insertWithOnConflict(r5, r9, r7, r8)     // Catch:{ SQLiteException -> 0x0283 }
            r12 = -1
            int r3 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r3 != 0) goto L_0x027d
            c.q.a.c.i.b.t4 r3 = r1.f10699a     // Catch:{ SQLiteException -> 0x0283 }
            c.q.a.c.i.b.i3 r3 = r3.mo28487b()     // Catch:{ SQLiteException -> 0x0283 }
            c.q.a.c.i.b.g3 r3 = r3.mo28339r()     // Catch:{ SQLiteException -> 0x0283 }
            java.lang.String r7 = "Failed to insert event filter (got -1). appId"
            java.lang.Object r8 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r24)     // Catch:{ SQLiteException -> 0x0283 }
            r3.mo28260b(r7, r8)     // Catch:{ SQLiteException -> 0x0283 }
        L_0x027d:
            r3 = r25
            r7 = r21
            goto L_0x01b5
        L_0x0283:
            r0 = move-exception
            c.q.a.c.i.b.t4 r3 = r1.f10699a     // Catch:{ all -> 0x0495 }
            c.q.a.c.i.b.i3 r3 = r3.mo28487b()     // Catch:{ all -> 0x0495 }
            c.q.a.c.i.b.g3 r3 = r3.mo28339r()     // Catch:{ all -> 0x0495 }
            java.lang.String r7 = "Error storing event filter. appId"
            java.lang.Object r8 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r24)     // Catch:{ all -> 0x0495 }
            r3.mo28261c(r7, r8, r0)     // Catch:{ all -> 0x0495 }
            goto L_0x0375
        L_0x0299:
            r21 = r7
            java.util.List r0 = r0.mo27946K()     // Catch:{ all -> 0x0495 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0495 }
        L_0x02a3:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x0495 }
            if (r3 == 0) goto L_0x03ac
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x0495 }
            c.q.a.c.g.i.i3 r3 = (p040c.p200q.p201a.p264c.p294g.p335i.C5106i3) r3     // Catch:{ all -> 0x0495 }
            r23.mo28475i()     // Catch:{ all -> 0x0495 }
            r23.mo28029h()     // Catch:{ all -> 0x0495 }
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8904f(r24)     // Catch:{ all -> 0x0495 }
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8908j(r3)     // Catch:{ all -> 0x0495 }
            java.lang.String r7 = r3.mo27316H()     // Catch:{ all -> 0x0495 }
            boolean r7 = r7.isEmpty()     // Catch:{ all -> 0x0495 }
            if (r7 == 0) goto L_0x02f2
            c.q.a.c.i.b.t4 r0 = r1.f10699a     // Catch:{ all -> 0x0495 }
            c.q.a.c.i.b.i3 r0 = r0.mo28487b()     // Catch:{ all -> 0x0495 }
            c.q.a.c.i.b.g3 r0 = r0.mo28344w()     // Catch:{ all -> 0x0495 }
            java.lang.String r7 = "Property filter had no property name. Audience definition ignored. appId, audienceId, filterId"
            java.lang.Object r8 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r24)     // Catch:{ all -> 0x0495 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0495 }
            boolean r11 = r3.mo27320M()     // Catch:{ all -> 0x0495 }
            if (r11 == 0) goto L_0x02e8
            int r3 = r3.mo27314D()     // Catch:{ all -> 0x0495 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0495 }
            goto L_0x02e9
        L_0x02e8:
            r3 = 0
        L_0x02e9:
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0495 }
            r0.mo28262d(r7, r8, r9, r3)     // Catch:{ all -> 0x0495 }
            goto L_0x0375
        L_0x02f2:
            byte[] r7 = r3.mo27190h()     // Catch:{ all -> 0x0495 }
            android.content.ContentValues r11 = new android.content.ContentValues     // Catch:{ all -> 0x0495 }
            r11.<init>()     // Catch:{ all -> 0x0495 }
            r11.put(r15, r2)     // Catch:{ all -> 0x0495 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0495 }
            r11.put(r9, r12)     // Catch:{ all -> 0x0495 }
            boolean r12 = r3.mo27320M()     // Catch:{ all -> 0x0495 }
            if (r12 == 0) goto L_0x0314
            int r12 = r3.mo27314D()     // Catch:{ all -> 0x0495 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0495 }
            goto L_0x0315
        L_0x0314:
            r12 = 0
        L_0x0315:
            r11.put(r14, r12)     // Catch:{ all -> 0x0495 }
            java.lang.String r12 = "property_name"
            r22 = r0
            java.lang.String r0 = r3.mo27316H()     // Catch:{ all -> 0x0495 }
            r11.put(r12, r0)     // Catch:{ all -> 0x0495 }
            boolean r0 = r3.mo27321N()     // Catch:{ all -> 0x0495 }
            if (r0 == 0) goto L_0x0332
            boolean r0 = r3.mo27319L()     // Catch:{ all -> 0x0495 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0495 }
            goto L_0x0333
        L_0x0332:
            r0 = 0
        L_0x0333:
            r11.put(r13, r0)     // Catch:{ all -> 0x0495 }
            r11.put(r8, r7)     // Catch:{ all -> 0x0495 }
            android.database.sqlite.SQLiteDatabase r0 = r23.mo28385P()     // Catch:{ SQLiteException -> 0x0361 }
            r3 = 0
            r7 = 5
            long r11 = r0.insertWithOnConflict(r6, r3, r11, r7)     // Catch:{ SQLiteException -> 0x0361 }
            r18 = -1
            int r0 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r0 != 0) goto L_0x035d
            c.q.a.c.i.b.t4 r0 = r1.f10699a     // Catch:{ SQLiteException -> 0x0361 }
            c.q.a.c.i.b.i3 r0 = r0.mo28487b()     // Catch:{ SQLiteException -> 0x0361 }
            c.q.a.c.i.b.g3 r0 = r0.mo28339r()     // Catch:{ SQLiteException -> 0x0361 }
            java.lang.String r3 = "Failed to insert property filter (got -1). appId"
            java.lang.Object r7 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r24)     // Catch:{ SQLiteException -> 0x0361 }
            r0.mo28260b(r3, r7)     // Catch:{ SQLiteException -> 0x0361 }
            goto L_0x0375
        L_0x035d:
            r0 = r22
            goto L_0x02a3
        L_0x0361:
            r0 = move-exception
            c.q.a.c.i.b.t4 r3 = r1.f10699a     // Catch:{ all -> 0x0495 }
            c.q.a.c.i.b.i3 r3 = r3.mo28487b()     // Catch:{ all -> 0x0495 }
            c.q.a.c.i.b.g3 r3 = r3.mo28339r()     // Catch:{ all -> 0x0495 }
            java.lang.String r7 = "Error storing property filter. appId"
            java.lang.Object r8 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r24)     // Catch:{ all -> 0x0495 }
            r3.mo28261c(r7, r8, r0)     // Catch:{ all -> 0x0495 }
        L_0x0375:
            r23.mo28475i()     // Catch:{ all -> 0x0495 }
            r23.mo28029h()     // Catch:{ all -> 0x0495 }
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8904f(r24)     // Catch:{ all -> 0x0495 }
            android.database.sqlite.SQLiteDatabase r0 = r23.mo28385P()     // Catch:{ all -> 0x0495 }
            r3 = 2
            java.lang.String[] r7 = new java.lang.String[r3]     // Catch:{ all -> 0x0495 }
            r3 = 0
            r7[r3] = r2     // Catch:{ all -> 0x0495 }
            java.lang.String r3 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x0495 }
            r8 = 1
            r7[r8] = r3     // Catch:{ all -> 0x0495 }
            r3 = r17
            r0.delete(r6, r3, r7)     // Catch:{ all -> 0x0495 }
            r7 = 2
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch:{ all -> 0x0495 }
            r8 = 0
            r7[r8] = r2     // Catch:{ all -> 0x0495 }
            java.lang.String r8 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x0495 }
            r9 = 1
            r7[r9] = r8     // Catch:{ all -> 0x0495 }
            r0.delete(r5, r3, r7)     // Catch:{ all -> 0x0495 }
            r17 = r3
            r7 = r21
            r3 = r25
            goto L_0x0112
        L_0x03ac:
            r3 = r25
            r7 = r21
            goto L_0x0112
        L_0x03b2:
            r3 = 0
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0495 }
            r0.<init>()     // Catch:{ all -> 0x0495 }
            java.util.Iterator r5 = r25.iterator()     // Catch:{ all -> 0x0495 }
        L_0x03bc:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0495 }
            if (r6 == 0) goto L_0x03dc
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x0495 }
            c.q.a.c.g.i.y2 r6 = (p040c.p200q.p201a.p264c.p294g.p335i.C5348y2) r6     // Catch:{ all -> 0x0495 }
            boolean r7 = r6.mo27947N()     // Catch:{ all -> 0x0495 }
            if (r7 == 0) goto L_0x03d7
            int r6 = r6.mo27940D()     // Catch:{ all -> 0x0495 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0495 }
            goto L_0x03d8
        L_0x03d7:
            r9 = r3
        L_0x03d8:
            r0.add(r9)     // Catch:{ all -> 0x0495 }
            goto L_0x03bc
        L_0x03dc:
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8904f(r24)     // Catch:{ all -> 0x0495 }
            r23.mo28475i()     // Catch:{ all -> 0x0495 }
            r23.mo28029h()     // Catch:{ all -> 0x0495 }
            android.database.sqlite.SQLiteDatabase r3 = r23.mo28385P()     // Catch:{ all -> 0x0495 }
            r5 = 1
            java.lang.String[] r6 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x047a }
            r5 = 0
            r6[r5] = r2     // Catch:{ SQLiteException -> 0x047a }
            java.lang.String r5 = "select count(1) from audience_filter_values where app_id=?"
            long r5 = r1.mo28378I(r5, r6)     // Catch:{ SQLiteException -> 0x047a }
            c.q.a.c.i.b.t4 r7 = r1.f10699a     // Catch:{ all -> 0x0495 }
            c.q.a.c.i.b.g r7 = r7.mo28649z()     // Catch:{ all -> 0x0495 }
            r8 = 2000(0x7d0, float:2.803E-42)
            c.q.a.c.i.b.t2 r9 = p040c.p200q.p201a.p264c.p340i.p342b.C5658u2.f10942F     // Catch:{ all -> 0x0495 }
            int r7 = r7.mo28247o(r2, r9)     // Catch:{ all -> 0x0495 }
            int r7 = java.lang.Math.min(r8, r7)     // Catch:{ all -> 0x0495 }
            r8 = 0
            int r7 = java.lang.Math.max(r8, r7)     // Catch:{ all -> 0x0495 }
            long r8 = (long) r7     // Catch:{ all -> 0x0495 }
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 > 0) goto L_0x0413
            goto L_0x048e
        L_0x0413:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0495 }
            r5.<init>()     // Catch:{ all -> 0x0495 }
            r10 = 0
        L_0x0419:
            int r6 = r0.size()     // Catch:{ all -> 0x0495 }
            if (r10 >= r6) goto L_0x0435
            java.lang.Object r6 = r0.get(r10)     // Catch:{ all -> 0x0495 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x0495 }
            if (r6 == 0) goto L_0x048e
            int r6 = r6.intValue()     // Catch:{ all -> 0x0495 }
            java.lang.String r6 = java.lang.Integer.toString(r6)     // Catch:{ all -> 0x0495 }
            r5.add(r6)     // Catch:{ all -> 0x0495 }
            int r10 = r10 + 1
            goto L_0x0419
        L_0x0435:
            java.lang.String r0 = ","
            java.lang.String r0 = android.text.TextUtils.join(r0, r5)     // Catch:{ all -> 0x0495 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0495 }
            r5.<init>()     // Catch:{ all -> 0x0495 }
            java.lang.String r6 = "("
            r5.append(r6)     // Catch:{ all -> 0x0495 }
            r5.append(r0)     // Catch:{ all -> 0x0495 }
            java.lang.String r0 = ")"
            r5.append(r0)     // Catch:{ all -> 0x0495 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0495 }
            r0.<init>()     // Catch:{ all -> 0x0495 }
            java.lang.String r6 = "audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in "
            r0.append(r6)     // Catch:{ all -> 0x0495 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0495 }
            r0.append(r5)     // Catch:{ all -> 0x0495 }
            java.lang.String r5 = " order by rowid desc limit -1 offset ?)"
            r0.append(r5)     // Catch:{ all -> 0x0495 }
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ all -> 0x0495 }
            r6 = 0
            r5[r6] = r2     // Catch:{ all -> 0x0495 }
            java.lang.String r2 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x0495 }
            r6 = 1
            r5[r6] = r2     // Catch:{ all -> 0x0495 }
            java.lang.String r2 = "audience_filter_values"
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0495 }
            r3.delete(r2, r0, r5)     // Catch:{ all -> 0x0495 }
            goto L_0x048e
        L_0x047a:
            r0 = move-exception
            c.q.a.c.i.b.t4 r3 = r1.f10699a     // Catch:{ all -> 0x0495 }
            c.q.a.c.i.b.i3 r3 = r3.mo28487b()     // Catch:{ all -> 0x0495 }
            c.q.a.c.i.b.g3 r3 = r3.mo28339r()     // Catch:{ all -> 0x0495 }
            java.lang.String r5 = "Database error querying filters. appId"
            java.lang.Object r2 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r24)     // Catch:{ all -> 0x0495 }
            r3.mo28261c(r5, r2, r0)     // Catch:{ all -> 0x0495 }
        L_0x048e:
            r4.setTransactionSuccessful()     // Catch:{ all -> 0x0495 }
            r4.endTransaction()
            return
        L_0x0495:
            r0 = move-exception
            r4.endTransaction()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p340i.p342b.C5547l.mo28404n(java.lang.String, java.util.List):void");
    }

    @WorkerThread
    /* renamed from: o */
    public final void mo28405o() {
        mo28475i();
        mo28385P().setTransactionSuccessful();
    }

    @WorkerThread
    /* renamed from: p */
    public final void mo28406p(C5458d6 d6Var) {
        C3495o.m8908j(d6Var);
        mo28029h();
        mo28475i();
        String d0 = d6Var.mo28182d0();
        C3495o.m8908j(d0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", d0);
        contentValues.put("app_instance_id", d6Var.mo28184e0());
        contentValues.put("gmp_app_id", d6Var.mo28192i0());
        contentValues.put("resettable_device_id_hash", d6Var.mo28175a());
        contentValues.put("last_bundle_index", Long.valueOf(d6Var.mo28173Y()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(d6Var.mo28174Z()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(d6Var.mo28172X()));
        contentValues.put("app_version", d6Var.mo28188g0());
        contentValues.put("app_store", d6Var.mo28186f0());
        contentValues.put("gmp_version", Long.valueOf(d6Var.mo28171W()));
        contentValues.put("dev_cert_hash", Long.valueOf(d6Var.mo28168T()));
        contentValues.put("measurement_enabled", Boolean.valueOf(d6Var.mo28158J()));
        contentValues.put("day", Long.valueOf(d6Var.mo28167S()));
        contentValues.put("daily_public_events_count", Long.valueOf(d6Var.mo28165Q()));
        contentValues.put("daily_events_count", Long.valueOf(d6Var.mo28164P()));
        contentValues.put("daily_conversions_count", Long.valueOf(d6Var.mo28162N()));
        contentValues.put("config_fetched_time", Long.valueOf(d6Var.mo28161M()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(d6Var.mo28170V()));
        contentValues.put("app_version_int", Long.valueOf(d6Var.mo28160L()));
        contentValues.put("firebase_instance_id", d6Var.mo28190h0());
        contentValues.put("daily_error_events_count", Long.valueOf(d6Var.mo28163O()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(d6Var.mo28166R()));
        contentValues.put("health_monitor_sample", d6Var.mo28194j0());
        d6Var.mo28149A();
        contentValues.put("android_id", 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(d6Var.mo28157I()));
        contentValues.put("admob_app_id", d6Var.mo28178b0());
        contentValues.put("dynamite_version", Long.valueOf(d6Var.mo28169U()));
        contentValues.put("session_stitching_token", d6Var.mo28177b());
        List c = d6Var.mo28179c();
        if (c != null) {
            if (c.isEmpty()) {
                this.f10699a.mo28487b().mo28344w().mo28260b("Safelisted events should not be an empty list. appId", d0);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(RunnerArgs.CLASS_SEPARATOR, c));
            }
        }
        C4987ac.m13785b();
        if (this.f10699a.mo28649z().mo28235B((String) null, C5658u2.f10976g0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        try {
            SQLiteDatabase P = mo28385P();
            if (((long) P.update("apps", contentValues, "app_id = ?", new String[]{d0})) == 0 && P.insertWithOnConflict("apps", (String) null, contentValues, 5) == -1) {
                this.f10699a.mo28487b().mo28339r().mo28260b("Failed to insert/update app (got -1). appId", C5515i3.m15778z(d0));
            }
        } catch (SQLiteException e) {
            this.f10699a.mo28487b().mo28339r().mo28261c("Error storing app. appId", C5515i3.m15778z(d0), e);
        }
    }

    @WorkerThread
    /* renamed from: q */
    public final void mo28407q(C5619r rVar) {
        C3495o.m8908j(rVar);
        mo28029h();
        mo28475i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", rVar.f10799a);
        contentValues.put("name", rVar.f10800b);
        contentValues.put("lifetime_count", Long.valueOf(rVar.f10801c));
        contentValues.put("current_bundle_count", Long.valueOf(rVar.f10802d));
        contentValues.put("last_fire_timestamp", Long.valueOf(rVar.f10804f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(rVar.f10805g));
        contentValues.put("last_bundled_day", rVar.f10806h);
        contentValues.put("last_sampled_complex_event_id", rVar.f10807i);
        contentValues.put("last_sampling_rate", rVar.f10808j);
        contentValues.put("current_session_count", Long.valueOf(rVar.f10803e));
        Boolean bool = rVar.f10809k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (mo28385P().insertWithOnConflict("events", (String) null, contentValues, 5) == -1) {
                this.f10699a.mo28487b().mo28339r().mo28260b("Failed to insert/update event aggregates (got -1). appId", C5515i3.m15778z(rVar.f10799a));
            }
        } catch (SQLiteException e) {
            this.f10699a.mo28487b().mo28339r().mo28261c("Error storing event aggregates. appId", C5515i3.m15778z(rVar.f10799a), e);
        }
    }

    /* renamed from: r */
    public final boolean mo28408r() {
        return mo28378I("select count(1) > 0 from raw_events", (String[]) null) != 0;
    }

    /* renamed from: s */
    public final boolean mo28409s() {
        return mo28378I("select count(1) > 0 from queue where has_realtime = 1", (String[]) null) != 0;
    }

    /* renamed from: t */
    public final boolean mo28410t() {
        return mo28378I("select count(1) > 0 from raw_events where realtime = 1", (String[]) null) != 0;
    }

    /* renamed from: u */
    public final boolean mo28411u() {
        Context f = this.f10699a.mo28490f();
        this.f10699a.mo28649z();
        return f.getDatabasePath("google_app_measurement.db").exists();
    }

    /* renamed from: v */
    public final boolean mo28412v(String str, Long l, long j, C5107i4 i4Var) {
        mo28029h();
        mo28475i();
        C3495o.m8908j(i4Var);
        C3495o.m8904f(str);
        C3495o.m8908j(l);
        byte[] h = i4Var.mo27190h();
        this.f10699a.mo28487b().mo28343v().mo28261c("Saving complex main event, appId, data size", this.f10699a.mo28620D().mo28144d(str), Integer.valueOf(h.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", h);
        try {
            if (mo28385P().insertWithOnConflict("main_event_params", (String) null, contentValues, 5) != -1) {
                return true;
            }
            this.f10699a.mo28487b().mo28339r().mo28260b("Failed to insert complex main event (got -1). appId", C5515i3.m15778z(str));
            return false;
        } catch (SQLiteException e) {
            this.f10699a.mo28487b().mo28339r().mo28261c("Error storing complex main event. appId", C5515i3.m15778z(str), e);
            return false;
        }
    }

    @WorkerThread
    /* renamed from: w */
    public final boolean mo28413w(zzac zzac) {
        C3495o.m8908j(zzac);
        mo28029h();
        mo28475i();
        String str = zzac.f14887e;
        C3495o.m8908j(str);
        if (mo28392X(str, zzac.f14889m.f14904l) == null) {
            long I = mo28378I("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.f10699a.mo28649z();
            if (I >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put(EventBusConstKt.ORIGIN, zzac.f14888l);
        contentValues.put("name", zzac.f14889m.f14904l);
        Object P = zzac.f14889m.mo33668P();
        C3495o.m8908j(P);
        m15816H(contentValues, "value", P);
        contentValues.put("active", Boolean.valueOf(zzac.f14891o));
        contentValues.put("trigger_event_name", zzac.f14892p);
        contentValues.put("trigger_timeout", Long.valueOf(zzac.f14894r));
        contentValues.put("timed_out_event", this.f10699a.mo28629N().mo28293c0(zzac.f14893q));
        contentValues.put("creation_timestamp", Long.valueOf(zzac.f14890n));
        contentValues.put("triggered_event", this.f10699a.mo28629N().mo28293c0(zzac.f14895s));
        contentValues.put("triggered_timestamp", Long.valueOf(zzac.f14889m.f14905m));
        contentValues.put("time_to_live", Long.valueOf(zzac.f14896t));
        contentValues.put("expired_event", this.f10699a.mo28629N().mo28293c0(zzac.f14897u));
        try {
            if (mo28385P().insertWithOnConflict("conditional_properties", (String) null, contentValues, 5) == -1) {
                this.f10699a.mo28487b().mo28339r().mo28260b("Failed to insert/update conditional user property (got -1)", C5515i3.m15778z(str));
            }
        } catch (SQLiteException e) {
            this.f10699a.mo28487b().mo28339r().mo28261c("Error storing conditional user property", C5515i3.m15778z(str), e);
        }
        return true;
    }

    @WorkerThread
    /* renamed from: x */
    public final boolean mo28414x(C5450ca caVar) {
        C3495o.m8908j(caVar);
        mo28029h();
        mo28475i();
        if (mo28392X(caVar.f10372a, caVar.f10374c) == null) {
            if (C5498ga.m15686X(caVar.f10374c)) {
                if (mo28378I("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{caVar.f10372a}) >= ((long) this.f10699a.mo28649z().mo28248p(caVar.f10372a, C5658u2.f10943G, 25, 100))) {
                    return false;
                }
            } else if (!"_npa".equals(caVar.f10374c)) {
                long I = mo28378I("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{caVar.f10372a, caVar.f10373b});
                this.f10699a.mo28649z();
                if (I >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", caVar.f10372a);
        contentValues.put(EventBusConstKt.ORIGIN, caVar.f10373b);
        contentValues.put("name", caVar.f10374c);
        contentValues.put("set_timestamp", Long.valueOf(caVar.f10375d));
        m15816H(contentValues, "value", caVar.f10376e);
        try {
            if (mo28385P().insertWithOnConflict("user_attributes", (String) null, contentValues, 5) == -1) {
                this.f10699a.mo28487b().mo28339r().mo28260b("Failed to insert/update user property (got -1). appId", C5515i3.m15778z(caVar.f10372a));
            }
        } catch (SQLiteException e) {
            this.f10699a.mo28487b().mo28339r().mo28261c("Error storing user property. appId", C5515i3.m15778z(caVar.f10372a), e);
        }
        return true;
    }
}
