package p040c.p200q.p201a.p264c.p340i.p342b;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import androidx.collection.LruCache;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.internal.measurement.zzkp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p294g.p335i.C4992b1;
import p040c.p200q.p201a.p264c.p294g.p335i.C5021ce;
import p040c.p200q.p201a.p264c.p294g.p335i.C5092h5;
import p040c.p200q.p201a.p264c.p294g.p335i.C5124j5;
import p040c.p200q.p201a.p264c.p294g.p335i.C5229q3;
import p040c.p200q.p201a.p264c.p294g.p335i.C5244r3;
import p040c.p200q.p201a.p264c.p294g.p335i.C5274t3;
import p040c.p200q.p201a.p264c.p294g.p335i.C5289u3;
import p040c.p200q.p201a.p264c.p294g.p335i.C5349y3;

/* renamed from: c.q.a.c.i.b.l4 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5552l4 extends C5569m9 implements C5475f {

    /* renamed from: d */
    public final Map f10638d = new ArrayMap();

    /* renamed from: e */
    public final Map f10639e = new ArrayMap();

    /* renamed from: f */
    public final Map f10640f = new ArrayMap();

    /* renamed from: g */
    public final Map f10641g = new ArrayMap();

    /* renamed from: h */
    public final Map f10642h = new ArrayMap();

    /* renamed from: i */
    public final Map f10643i = new ArrayMap();

    /* renamed from: j */
    public final LruCache f10644j = new C5516i4(this, 20);

    /* renamed from: k */
    public final C5021ce f10645k = new C5528j4(this);

    /* renamed from: l */
    public final Map f10646l = new ArrayMap();

    /* renamed from: m */
    public final Map f10647m = new ArrayMap();

    /* renamed from: n */
    public final Map f10648n = new ArrayMap();

    public C5552l4(C5709y9 y9Var) {
        super(y9Var);
    }

    /* renamed from: q */
    public static final Map m15859q(C5289u3 u3Var) {
        ArrayMap arrayMap = new ArrayMap();
        if (u3Var != null) {
            for (C5349y3 y3Var : u3Var.mo27769Q()) {
                arrayMap.put(y3Var.mo27948E(), y3Var.mo27949F());
            }
        }
        return arrayMap;
    }

    /* renamed from: s */
    public static /* bridge */ /* synthetic */ C4992b1 m15860s(C5552l4 l4Var, String str) {
        l4Var.mo28475i();
        C3495o.m8904f(str);
        if (!l4Var.mo28417C(str)) {
            return null;
        }
        if (!l4Var.f10642h.containsKey(str) || l4Var.f10642h.get(str) == null) {
            l4Var.mo28431o(str);
        } else {
            l4Var.mo28432p(str, (C5289u3) l4Var.f10642h.get(str));
        }
        return (C4992b1) l4Var.f10644j.snapshot().get(str);
    }

    @WorkerThread
    /* renamed from: A */
    public final void mo28415A(String str) {
        mo28029h();
        this.f10642h.remove(str);
    }

    @WorkerThread
    /* renamed from: B */
    public final boolean mo28416B(String str) {
        mo28029h();
        C5289u3 t = mo28434t(str);
        if (t == null) {
            return false;
        }
        return t.mo27770T();
    }

    /* renamed from: C */
    public final boolean mo28417C(String str) {
        C5289u3 u3Var;
        if (TextUtils.isEmpty(str) || (u3Var = (C5289u3) this.f10642h.get(str)) == null || u3Var.mo27760D() == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: D */
    public final boolean mo28418D(String str) {
        return "1".equals(mo28213e(str, "measurement.upload.blacklist_internal"));
    }

    @WorkerThread
    /* renamed from: E */
    public final boolean mo28419E(String str, String str2) {
        Boolean bool;
        mo28029h();
        mo28431o(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f10641g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @WorkerThread
    /* renamed from: F */
    public final boolean mo28420F(String str, String str2) {
        Boolean bool;
        mo28029h();
        mo28431o(str);
        if (mo28418D(str) && C5498ga.m15685W(str2)) {
            return true;
        }
        if (mo28421G(str) && C5498ga.m15686X(str2)) {
            return true;
        }
        Map map = (Map) this.f10640f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: G */
    public final boolean mo28421G(String str) {
        return "1".equals(mo28213e(str, "measurement.upload.blacklist_public"));
    }

    @WorkerThread
    /* renamed from: H */
    public final boolean mo28422H(String str, byte[] bArr, String str2, String str3) {
        mo28475i();
        mo28029h();
        C3495o.m8904f(str);
        C5274t3 t3Var = (C5274t3) mo28429m(str, bArr).mo27727z();
        mo28430n(str, t3Var);
        mo28432p(str, (C5289u3) t3Var.mo27520l());
        this.f10642h.put(str, (C5289u3) t3Var.mo27520l());
        this.f10646l.put(str, t3Var.mo27649w());
        this.f10647m.put(str, str2);
        this.f10648n.put(str, str3);
        this.f10638d.put(str, m15859q((C5289u3) t3Var.mo27520l()));
        this.f10663b.mo28734V().mo28404n(str, new ArrayList(t3Var.mo27650y()));
        try {
            t3Var.mo27647t();
            bArr = ((C5289u3) t3Var.mo27520l()).mo27190h();
        } catch (RuntimeException e) {
            this.f10699a.mo28487b().mo28344w().mo28261c("Unable to serialize reduced-size config. Storing full config instead. appId", C5515i3.m15778z(str), e);
        }
        C5547l V = this.f10663b.mo28734V();
        C3495o.m8904f(str);
        V.mo28029h();
        V.mo28475i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        if (V.f10699a.mo28649z().mo28235B((String) null, C5658u2.f10986l0)) {
            contentValues.put("e_tag", str3);
        }
        try {
            if (((long) V.mo28385P().update("apps", contentValues, "app_id = ?", new String[]{str})) == 0) {
                V.f10699a.mo28487b().mo28339r().mo28260b("Failed to update remote config (got 0). appId", C5515i3.m15778z(str));
            }
        } catch (SQLiteException e2) {
            V.f10699a.mo28487b().mo28339r().mo28261c("Error storing remote config. appId", C5515i3.m15778z(str), e2);
        }
        this.f10642h.put(str, (C5289u3) t3Var.mo27520l());
        return true;
    }

    @WorkerThread
    /* renamed from: I */
    public final boolean mo28423I(String str) {
        mo28029h();
        mo28431o(str);
        return this.f10639e.get(str) != null && ((Set) this.f10639e.get(str)).contains("app_instance_id");
    }

    @WorkerThread
    /* renamed from: J */
    public final boolean mo28424J(String str) {
        mo28029h();
        mo28431o(str);
        if (this.f10639e.get(str) == null || (!((Set) this.f10639e.get(str)).contains("device_model") && !((Set) this.f10639e.get(str)).contains("device_info"))) {
            return false;
        }
        return true;
    }

    @WorkerThread
    /* renamed from: K */
    public final boolean mo28425K(String str) {
        mo28029h();
        mo28431o(str);
        return this.f10639e.get(str) != null && ((Set) this.f10639e.get(str)).contains("enhanced_user_id");
    }

    @WorkerThread
    /* renamed from: L */
    public final boolean mo28426L(String str) {
        mo28029h();
        mo28431o(str);
        return this.f10639e.get(str) != null && ((Set) this.f10639e.get(str)).contains("google_signals");
    }

    @WorkerThread
    /* renamed from: M */
    public final boolean mo28427M(String str) {
        mo28029h();
        mo28431o(str);
        if (this.f10639e.get(str) == null || (!((Set) this.f10639e.get(str)).contains("os_version") && !((Set) this.f10639e.get(str)).contains("device_info"))) {
            return false;
        }
        return true;
    }

    @WorkerThread
    /* renamed from: N */
    public final boolean mo28428N(String str) {
        mo28029h();
        mo28431o(str);
        return this.f10639e.get(str) != null && ((Set) this.f10639e.get(str)).contains("user_id");
    }

    @WorkerThread
    /* renamed from: e */
    public final String mo28213e(String str, String str2) {
        mo28029h();
        mo28431o(str);
        Map map = (Map) this.f10638d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    /* renamed from: l */
    public final boolean mo28087l() {
        return false;
    }

    @WorkerThread
    /* renamed from: m */
    public final C5289u3 mo28429m(String str, byte[] bArr) {
        if (bArr == null) {
            return C5289u3.m15009J();
        }
        try {
            C5274t3 H = C5289u3.m15007H();
            C5426aa.m15490C(H, bArr);
            C5289u3 u3Var = (C5289u3) H.mo27520l();
            C5491g3 v = this.f10699a.mo28487b().mo28343v();
            String str2 = null;
            Long valueOf = u3Var.mo27772V() ? Long.valueOf(u3Var.mo27762F()) : null;
            if (u3Var.mo27771U()) {
                str2 = u3Var.mo27764K();
            }
            v.mo28261c("Parsed config. version, gmp_app_id", valueOf, str2);
            return u3Var;
        } catch (zzkp e) {
            this.f10699a.mo28487b().mo28344w().mo28261c("Unable to merge remote config. appId", C5515i3.m15778z(str), e);
            return C5289u3.m15009J();
        } catch (RuntimeException e2) {
            this.f10699a.mo28487b().mo28344w().mo28261c("Unable to merge remote config. appId", C5515i3.m15778z(str), e2);
            return C5289u3.m15009J();
        }
    }

    /* renamed from: n */
    public final void mo28430n(String str, C5274t3 t3Var) {
        HashSet hashSet = new HashSet();
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = new ArrayMap();
        ArrayMap arrayMap3 = new ArrayMap();
        for (C5229q3 E : t3Var.mo27651z()) {
            hashSet.add(E.mo27512E());
        }
        for (int i = 0; i < t3Var.mo27645r(); i++) {
            C5244r3 r3Var = (C5244r3) t3Var.mo27646s(i).mo27727z();
            if (r3Var.mo27535t().isEmpty()) {
                this.f10699a.mo28487b().mo28344w().mo28259a("EventConfig contained null event name");
            } else {
                String t = r3Var.mo27535t();
                String b = C5625r5.m16064b(r3Var.mo27535t());
                if (!TextUtils.isEmpty(b)) {
                    r3Var.mo27534s(b);
                    t3Var.mo27648v(i, r3Var);
                }
                if (r3Var.mo27538y() && r3Var.mo27536v()) {
                    arrayMap.put(t, Boolean.TRUE);
                }
                if (r3Var.mo27539z() && r3Var.mo27537w()) {
                    arrayMap2.put(r3Var.mo27535t(), Boolean.TRUE);
                }
                if (r3Var.mo27532C()) {
                    if (r3Var.mo27533r() < 2 || r3Var.mo27533r() > 65535) {
                        this.f10699a.mo28487b().mo28344w().mo28261c("Invalid sampling rate. Event name, sample rate", r3Var.mo27535t(), Integer.valueOf(r3Var.mo27533r()));
                    } else {
                        arrayMap3.put(r3Var.mo27535t(), Integer.valueOf(r3Var.mo27533r()));
                    }
                }
            }
        }
        this.f10639e.put(str, hashSet);
        this.f10640f.put(str, arrayMap);
        this.f10641g.put(str, arrayMap2);
        this.f10643i.put(str, arrayMap3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00aa, code lost:
        if (r2 != null) goto L_0x00ac;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x012e  */
    @androidx.annotation.WorkerThread
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28431o(java.lang.String r13) {
        /*
            r12 = this;
            r12.mo28475i()
            r12.mo28029h()
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8904f(r13)
            java.util.Map r0 = r12.f10642h
            java.lang.Object r0 = r0.get(r13)
            if (r0 != 0) goto L_0x0132
            c.q.a.c.i.b.y9 r0 = r12.f10663b
            c.q.a.c.i.b.l r0 = r0.mo28734V()
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8904f(r13)
            r0.mo28029h()
            r0.mo28475i()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r0.mo28385P()     // Catch:{ SQLiteException -> 0x0094, all -> 0x0091 }
            java.lang.String r3 = "remote_config"
            java.lang.String r4 = "config_last_modified_time"
            java.lang.String r5 = "e_tag"
            java.lang.String[] r4 = new java.lang.String[]{r3, r4, r5}     // Catch:{ SQLiteException -> 0x0094, all -> 0x0091 }
            r10 = 1
            java.lang.String[] r6 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0094, all -> 0x0091 }
            r11 = 0
            r6[r11] = r13     // Catch:{ SQLiteException -> 0x0094, all -> 0x0091 }
            java.lang.String r3 = "apps"
            java.lang.String r5 = "app_id=?"
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x0094, all -> 0x0091 }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x008f }
            if (r3 != 0) goto L_0x0049
            if (r2 == 0) goto L_0x00af
            goto L_0x00ac
        L_0x0049:
            byte[] r3 = r2.getBlob(r11)     // Catch:{ SQLiteException -> 0x008f }
            java.lang.String r4 = r2.getString(r10)     // Catch:{ SQLiteException -> 0x008f }
            c.q.a.c.i.b.t4 r5 = r0.f10699a     // Catch:{ SQLiteException -> 0x008f }
            c.q.a.c.i.b.g r5 = r5.mo28649z()     // Catch:{ SQLiteException -> 0x008f }
            c.q.a.c.i.b.t2 r6 = p040c.p200q.p201a.p264c.p340i.p342b.C5658u2.f10986l0     // Catch:{ SQLiteException -> 0x008f }
            boolean r5 = r5.mo28235B(r1, r6)     // Catch:{ SQLiteException -> 0x008f }
            if (r5 == 0) goto L_0x0065
            r5 = 2
            java.lang.String r5 = r2.getString(r5)     // Catch:{ SQLiteException -> 0x008f }
            goto L_0x0066
        L_0x0065:
            r5 = r1
        L_0x0066:
            boolean r6 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x008f }
            if (r6 == 0) goto L_0x007f
            c.q.a.c.i.b.t4 r6 = r0.f10699a     // Catch:{ SQLiteException -> 0x008f }
            c.q.a.c.i.b.i3 r6 = r6.mo28487b()     // Catch:{ SQLiteException -> 0x008f }
            c.q.a.c.i.b.g3 r6 = r6.mo28339r()     // Catch:{ SQLiteException -> 0x008f }
            java.lang.String r7 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r8 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r13)     // Catch:{ SQLiteException -> 0x008f }
            r6.mo28260b(r7, r8)     // Catch:{ SQLiteException -> 0x008f }
        L_0x007f:
            if (r3 != 0) goto L_0x0084
            if (r2 == 0) goto L_0x00af
            goto L_0x00ac
        L_0x0084:
            c.q.a.c.i.b.i r6 = new c.q.a.c.i.b.i     // Catch:{ SQLiteException -> 0x008f }
            r6.<init>(r3, r4, r5)     // Catch:{ SQLiteException -> 0x008f }
            if (r2 == 0) goto L_0x00b0
            r2.close()
            goto L_0x00b0
        L_0x008f:
            r3 = move-exception
            goto L_0x0097
        L_0x0091:
            r13 = move-exception
            goto L_0x012c
        L_0x0094:
            r2 = move-exception
            r3 = r2
            r2 = r1
        L_0x0097:
            c.q.a.c.i.b.t4 r0 = r0.f10699a     // Catch:{ all -> 0x012a }
            c.q.a.c.i.b.i3 r0 = r0.mo28487b()     // Catch:{ all -> 0x012a }
            c.q.a.c.i.b.g3 r0 = r0.mo28339r()     // Catch:{ all -> 0x012a }
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r5 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r13)     // Catch:{ all -> 0x012a }
            r0.mo28261c(r4, r5, r3)     // Catch:{ all -> 0x012a }
            if (r2 == 0) goto L_0x00af
        L_0x00ac:
            r2.close()
        L_0x00af:
            r6 = r1
        L_0x00b0:
            if (r6 != 0) goto L_0x00e0
            java.util.Map r0 = r12.f10638d
            r0.put(r13, r1)
            java.util.Map r0 = r12.f10640f
            r0.put(r13, r1)
            java.util.Map r0 = r12.f10639e
            r0.put(r13, r1)
            java.util.Map r0 = r12.f10641g
            r0.put(r13, r1)
            java.util.Map r0 = r12.f10642h
            r0.put(r13, r1)
            java.util.Map r0 = r12.f10646l
            r0.put(r13, r1)
            java.util.Map r0 = r12.f10647m
            r0.put(r13, r1)
            java.util.Map r0 = r12.f10648n
            r0.put(r13, r1)
            java.util.Map r0 = r12.f10643i
            r0.put(r13, r1)
            return
        L_0x00e0:
            byte[] r0 = r6.f10536a
            c.q.a.c.g.i.u3 r0 = r12.mo28429m(r13, r0)
            c.q.a.c.g.i.q8 r0 = r0.mo27727z()
            c.q.a.c.g.i.t3 r0 = (p040c.p200q.p201a.p264c.p294g.p335i.C5274t3) r0
            r12.mo28430n(r13, r0)
            java.util.Map r1 = r12.f10638d
            c.q.a.c.g.i.t8 r2 = r0.mo27520l()
            c.q.a.c.g.i.u3 r2 = (p040c.p200q.p201a.p264c.p294g.p335i.C5289u3) r2
            java.util.Map r2 = m15859q(r2)
            r1.put(r13, r2)
            java.util.Map r1 = r12.f10642h
            c.q.a.c.g.i.t8 r2 = r0.mo27520l()
            c.q.a.c.g.i.u3 r2 = (p040c.p200q.p201a.p264c.p294g.p335i.C5289u3) r2
            r1.put(r13, r2)
            c.q.a.c.g.i.t8 r1 = r0.mo27520l()
            c.q.a.c.g.i.u3 r1 = (p040c.p200q.p201a.p264c.p294g.p335i.C5289u3) r1
            r12.mo28432p(r13, r1)
            java.util.Map r1 = r12.f10646l
            java.lang.String r0 = r0.mo27649w()
            r1.put(r13, r0)
            java.util.Map r0 = r12.f10647m
            java.lang.String r1 = r6.f10537b
            r0.put(r13, r1)
            java.util.Map r0 = r12.f10648n
            java.lang.String r1 = r6.f10538c
            r0.put(r13, r1)
            return
        L_0x012a:
            r13 = move-exception
            r1 = r2
        L_0x012c:
            if (r1 == 0) goto L_0x0131
            r1.close()
        L_0x0131:
            throw r13
        L_0x0132:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p340i.p342b.C5552l4.mo28431o(java.lang.String):void");
    }

    @WorkerThread
    /* renamed from: p */
    public final void mo28432p(String str, C5289u3 u3Var) {
        if (u3Var.mo27760D() != 0) {
            this.f10699a.mo28487b().mo28343v().mo28260b("EES programs found", Integer.valueOf(u3Var.mo27760D()));
            C5124j5 j5Var = (C5124j5) u3Var.mo27768P().get(0);
            try {
                C4992b1 b1Var = new C4992b1();
                b1Var.mo26968d("internal.remoteConfig", new C5480f4(this, str));
                b1Var.mo26968d("internal.appMetadata", new C5492g4(this, str));
                b1Var.mo26968d("internal.logger", new C5504h4(this));
                b1Var.mo26967c(j5Var);
                this.f10644j.put(str, b1Var);
                this.f10699a.mo28487b().mo28343v().mo28261c("EES program loaded for appId, activities", str, Integer.valueOf(j5Var.mo27340D().mo27227D()));
                for (C5092h5 E : j5Var.mo27340D().mo27228G()) {
                    this.f10699a.mo28487b().mo28343v().mo28260b("EES program activity", E.mo27302E());
                }
            } catch (zzd unused) {
                this.f10699a.mo28487b().mo28339r().mo28260b("Failed to load EES program. appId", str);
            }
        } else {
            this.f10644j.remove(str);
        }
    }

    @WorkerThread
    /* renamed from: r */
    public final int mo28433r(String str, String str2) {
        Integer num;
        mo28029h();
        mo28431o(str);
        Map map = (Map) this.f10643i.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    @WorkerThread
    /* renamed from: t */
    public final C5289u3 mo28434t(String str) {
        mo28475i();
        mo28029h();
        C3495o.m8904f(str);
        mo28431o(str);
        return (C5289u3) this.f10642h.get(str);
    }

    @WorkerThread
    /* renamed from: u */
    public final String mo28435u(String str) {
        mo28029h();
        return (String) this.f10648n.get(str);
    }

    @WorkerThread
    /* renamed from: v */
    public final String mo28436v(String str) {
        mo28029h();
        return (String) this.f10647m.get(str);
    }

    @WorkerThread
    /* renamed from: w */
    public final String mo28437w(String str) {
        mo28029h();
        mo28431o(str);
        return (String) this.f10646l.get(str);
    }

    @WorkerThread
    /* renamed from: y */
    public final Set mo28438y(String str) {
        mo28029h();
        mo28431o(str);
        return (Set) this.f10639e.get(str);
    }

    @WorkerThread
    /* renamed from: z */
    public final void mo28439z(String str) {
        mo28029h();
        this.f10647m.put(str, (Object) null);
    }
}
