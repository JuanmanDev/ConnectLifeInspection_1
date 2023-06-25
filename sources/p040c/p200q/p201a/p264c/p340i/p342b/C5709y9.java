package p040c.p200q.p201a.p264c.p340i.p342b;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.amazon.identity.auth.map.device.token.MAPCookie;
import com.google.android.gms.internal.measurement.zzcl;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzkw;
import com.google.android.gms.measurement.internal.zzq;
import com.juconnect.vivino.global.UrlConstKt;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlinx.coroutines.DebugKt;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p289n.C3553d;
import p040c.p200q.p201a.p264c.p276d.p291o.C3573c;
import p040c.p200q.p201a.p264c.p294g.p335i.C4987ac;
import p040c.p200q.p201a.p264c.p294g.p335i.C4996b5;
import p040c.p200q.p201a.p264c.p294g.p335i.C5012c5;
import p040c.p200q.p201a.p264c.p294g.p335i.C5068fd;
import p040c.p200q.p201a.p264c.p294g.p335i.C5091h4;
import p040c.p200q.p201a.p264c.p294g.p335i.C5107i4;
import p040c.p200q.p201a.p264c.p294g.p335i.C5155l4;
import p040c.p200q.p201a.p264c.p294g.p335i.C5170m4;
import p040c.p200q.p201a.p264c.p294g.p335i.C5179md;
import p040c.p200q.p201a.p264c.p294g.p335i.C5260s4;
import p040c.p200q.p201a.p264c.p294g.p335i.C5289u3;

/* renamed from: c.q.a.c.i.b.y9 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5709y9 implements C5601p5 {

    /* renamed from: F */
    public static volatile C5709y9 f11150F;

    /* renamed from: A */
    public final Map f11151A;

    /* renamed from: B */
    public final Map f11152B;

    /* renamed from: C */
    public C5519i7 f11153C;

    /* renamed from: D */
    public String f11154D;

    /* renamed from: E */
    public final C5486fa f11155E = new C5653t9(this);

    /* renamed from: a */
    public final C5552l4 f11156a;

    /* renamed from: b */
    public final C5587o3 f11157b;

    /* renamed from: c */
    public C5547l f11158c;

    /* renamed from: d */
    public C5611q3 f11159d;

    /* renamed from: e */
    public C5545k9 f11160e;

    /* renamed from: f */
    public C5427b f11161f;

    /* renamed from: g */
    public final C5426aa f11162g;

    /* renamed from: h */
    public C5495g7 f11163h;

    /* renamed from: i */
    public C5640s8 f11164i;

    /* renamed from: j */
    public final C5581n9 f11165j;

    /* renamed from: k */
    public C5420a4 f11166k;

    /* renamed from: l */
    public final C5648t4 f11167l;

    /* renamed from: m */
    public boolean f11168m = false;

    /* renamed from: n */
    public boolean f11169n;

    /* renamed from: o */
    public long f11170o;

    /* renamed from: p */
    public List f11171p;

    /* renamed from: q */
    public int f11172q;

    /* renamed from: r */
    public int f11173r;

    /* renamed from: s */
    public boolean f11174s;

    /* renamed from: t */
    public boolean f11175t;

    /* renamed from: u */
    public boolean f11176u;

    /* renamed from: v */
    public FileLock f11177v;

    /* renamed from: w */
    public FileChannel f11178w;

    /* renamed from: x */
    public List f11179x;

    /* renamed from: y */
    public List f11180y;

    /* renamed from: z */
    public long f11181z;

    public C5709y9(C5720z9 z9Var, C5648t4 t4Var) {
        C3495o.m8908j(z9Var);
        this.f11167l = C5648t4.m16090H(z9Var.f11200a, (zzcl) null, (Long) null);
        this.f11181z = -1;
        this.f11165j = new C5581n9(this);
        C5426aa aaVar = new C5426aa(this);
        aaVar.mo28476j();
        this.f11162g = aaVar;
        C5587o3 o3Var = new C5587o3(this);
        o3Var.mo28476j();
        this.f11157b = o3Var;
        C5552l4 l4Var = new C5552l4(this);
        l4Var.mo28476j();
        this.f11156a = l4Var;
        this.f11151A = new HashMap();
        this.f11152B = new HashMap();
        mo28486a().mo28540z(new C5593o9(this, z9Var));
    }

    /* renamed from: G */
    public static final void m16226G(C5091h4 h4Var, int i, String str) {
        List L = h4Var.mo27294L();
        int i2 = 0;
        while (i2 < L.size()) {
            if (!"_err".equals(((C5170m4) L.get(i2)).mo27418J())) {
                i2++;
            } else {
                return;
            }
        }
        C5155l4 H = C5170m4.m14462H();
        H.mo27385F("_err");
        H.mo27384E(Long.valueOf((long) i).longValue());
        C5155l4 H2 = C5170m4.m14462H();
        H2.mo27385F("_ev");
        H2.mo27386G(str);
        h4Var.mo27300y((C5170m4) H.mo27520l());
        h4Var.mo27300y((C5170m4) H2.mo27520l());
    }

    /* renamed from: H */
    public static final void m16227H(C5091h4 h4Var, @NonNull String str) {
        List L = h4Var.mo27294L();
        for (int i = 0; i < L.size(); i++) {
            if (str.equals(((C5170m4) L.get(i)).mo27418J())) {
                h4Var.mo27286C(i);
                return;
            }
        }
    }

    /* renamed from: Q */
    public static final boolean m16228Q(zzq zzq) {
        return !TextUtils.isEmpty(zzq.f14919l) || !TextUtils.isEmpty(zzq.f14910A);
    }

    /* renamed from: R */
    public static final C5569m9 m16229R(C5569m9 m9Var) {
        if (m9Var == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (m9Var.mo28477k()) {
            return m9Var;
        } else {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(String.valueOf(m9Var.getClass()))));
        }
    }

    /* renamed from: e0 */
    public static C5709y9 m16231e0(Context context) {
        C3495o.m8908j(context);
        C3495o.m8908j(context.getApplicationContext());
        if (f11150F == null) {
            synchronized (C5709y9.class) {
                if (f11150F == null) {
                    C5720z9 z9Var = new C5720z9(context);
                    C3495o.m8908j(z9Var);
                    f11150F = new C5709y9(z9Var, (C5648t4) null);
                }
            }
        }
        return f11150F;
    }

    /* renamed from: j0 */
    public static /* bridge */ /* synthetic */ void m16232j0(C5709y9 y9Var, C5720z9 z9Var) {
        y9Var.mo28486a().mo28029h();
        y9Var.f11166k = new C5420a4(y9Var);
        C5547l lVar = new C5547l(y9Var);
        lVar.mo28476j();
        y9Var.f11158c = lVar;
        C5487g T = y9Var.mo28732T();
        C5552l4 l4Var = y9Var.f11156a;
        C3495o.m8908j(l4Var);
        T.mo28258z(l4Var);
        C5640s8 s8Var = new C5640s8(y9Var);
        s8Var.mo28476j();
        y9Var.f11164i = s8Var;
        C5427b bVar = new C5427b(y9Var);
        bVar.mo28476j();
        y9Var.f11161f = bVar;
        C5495g7 g7Var = new C5495g7(y9Var);
        g7Var.mo28476j();
        y9Var.f11163h = g7Var;
        C5545k9 k9Var = new C5545k9(y9Var);
        k9Var.mo28476j();
        y9Var.f11160e = k9Var;
        y9Var.f11159d = new C5611q3(y9Var);
        if (y9Var.f11172q != y9Var.f11173r) {
            y9Var.mo28487b().mo28339r().mo28261c("Not all upload components initialized", Integer.valueOf(y9Var.f11172q), Integer.valueOf(y9Var.f11173r));
        }
        y9Var.f11168m = true;
    }

    @WorkerThread
    /* renamed from: A */
    public final void mo28717A(String str, C5499h hVar) {
        mo28486a().mo28029h();
        mo28744g();
        this.f11151A.put(str, hVar);
        C5547l lVar = this.f11158c;
        m16229R(lVar);
        C3495o.m8908j(str);
        C3495o.m8908j(hVar);
        lVar.mo28029h();
        lVar.mo28475i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", hVar.mo28324h());
        try {
            if (lVar.mo28385P().insertWithOnConflict("consent_settings", (String) null, contentValues, 5) == -1) {
                lVar.f10699a.mo28487b().mo28339r().mo28260b("Failed to insert/update consent setting (got -1). appId", C5515i3.m15778z(str));
            }
        } catch (SQLiteException e) {
            lVar.f10699a.mo28487b().mo28339r().mo28261c("Error storing consent setting. appId, error", C5515i3.m15778z(str), e);
        }
    }

    @WorkerThread
    /* renamed from: B */
    public final void mo28718B(zzkw zzkw, zzq zzq) {
        long j;
        zzkw zzkw2 = zzkw;
        zzq zzq2 = zzq;
        mo28486a().mo28029h();
        mo28744g();
        if (m16228Q(zzq)) {
            if (!zzq2.f14925r) {
                mo28731S(zzq2);
                return;
            }
            int n0 = mo28745g0().mo28301n0(zzkw2.f14904l);
            int i = 0;
            if (n0 != 0) {
                C5498ga g0 = mo28745g0();
                String str = zzkw2.f14904l;
                mo28732T();
                String r = g0.mo28307r(str, 24, true);
                String str2 = zzkw2.f14904l;
                mo28745g0().mo28271B(this.f11155E, zzq2.f14918e, n0, "_ev", r, str2 != null ? str2.length() : 0);
                return;
            }
            int j0 = mo28745g0().mo28297j0(zzkw2.f14904l, zzkw.mo33668P());
            if (j0 != 0) {
                C5498ga g02 = mo28745g0();
                String str3 = zzkw2.f14904l;
                mo28732T();
                String r2 = g02.mo28307r(str3, 24, true);
                Object P = zzkw.mo33668P();
                if (P != null && ((P instanceof String) || (P instanceof CharSequence))) {
                    i = P.toString().length();
                }
                mo28745g0().mo28271B(this.f11155E, zzq2.f14918e, j0, "_ev", r2, i);
                return;
            }
            Object p = mo28745g0().mo28304p(zzkw2.f14904l, zzkw.mo33668P());
            if (p != null) {
                if ("_sid".equals(zzkw2.f14904l)) {
                    long j2 = zzkw2.f14905m;
                    String str4 = zzkw2.f14908p;
                    String str5 = zzq2.f14918e;
                    C3495o.m8908j(str5);
                    String str6 = str5;
                    C5547l lVar = this.f11158c;
                    m16229R(lVar);
                    C5450ca X = lVar.mo28392X(str6, "_sno");
                    if (X != null) {
                        Object obj = X.f10376e;
                        if (obj instanceof Long) {
                            j = ((Long) obj).longValue();
                            mo28718B(new zzkw("_sno", j2, Long.valueOf(j + 1), str4), zzq2);
                        }
                    }
                    if (X != null) {
                        mo28487b().mo28344w().mo28260b("Retrieved last session number from database does not contain a valid (long) value", X.f10376e);
                    }
                    C5547l lVar2 = this.f11158c;
                    m16229R(lVar2);
                    C5619r V = lVar2.mo28391V(str6, "_s");
                    if (V != null) {
                        j = V.f10801c;
                        mo28487b().mo28343v().mo28260b("Backfill the session number. Last used session number", Long.valueOf(j));
                    } else {
                        j = 0;
                    }
                    mo28718B(new zzkw("_sno", j2, Long.valueOf(j + 1), str4), zzq2);
                }
                String str7 = zzq2.f14918e;
                C3495o.m8908j(str7);
                String str8 = zzkw2.f14908p;
                C3495o.m8908j(str8);
                C5450ca caVar = new C5450ca(str7, str8, zzkw2.f14904l, zzkw2.f14905m, p);
                mo28487b().mo28343v().mo28261c("Setting user property", this.f11167l.mo28620D().mo28146f(caVar.f10374c), p);
                C5547l lVar3 = this.f11158c;
                m16229R(lVar3);
                lVar3.mo28399e0();
                try {
                    if ("_id".equals(caVar.f10374c)) {
                        C5547l lVar4 = this.f11158c;
                        m16229R(lVar4);
                        C5450ca X2 = lVar4.mo28392X(zzq2.f14918e, "_id");
                        if (X2 != null && !caVar.f10376e.equals(X2.f10376e)) {
                            C5547l lVar5 = this.f11158c;
                            m16229R(lVar5);
                            lVar5.mo28403m(zzq2.f14918e, "_lair");
                        }
                    }
                    mo28731S(zzq2);
                    C5547l lVar6 = this.f11158c;
                    m16229R(lVar6);
                    boolean x = lVar6.mo28414x(caVar);
                    C5547l lVar7 = this.f11158c;
                    m16229R(lVar7);
                    lVar7.mo28405o();
                    if (!x) {
                        mo28487b().mo28339r().mo28261c("Too many unique user properties are set. Ignoring user property", this.f11167l.mo28620D().mo28146f(caVar.f10374c), caVar.f10376e);
                        mo28745g0().mo28271B(this.f11155E, zzq2.f14918e, 9, (String) null, (String) null, 0);
                    }
                } finally {
                    C5547l lVar8 = this.f11158c;
                    m16229R(lVar8);
                    lVar8.mo28400f0();
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:230|231) */
    /* JADX WARNING: Code restructure failed: missing block: B:170:?, code lost:
        r0 = r0.subList(0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0302, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0303, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:?, code lost:
        mo28487b().mo28339r().mo28261c("Failed to parse upload URL. Not uploading. appId", p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r6), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0547, code lost:
        if (r11 != null) goto L_0x0549;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x056e, code lost:
        if (r11 != null) goto L_0x0549;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0571, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0598, code lost:
        r1.f11176u = r2;
        mo28725K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x059d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0108, code lost:
        if (r11 != null) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0112, code lost:
        if (r11 != null) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x012a, code lost:
        if (r11 != null) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        r1.f11181z = r7;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:230:0x04eb */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x029b A[SYNTHETIC, Splitter:B:146:0x029b] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x02a4 A[Catch:{ all -> 0x03e5, all -> 0x0593 }] */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0502 A[Catch:{ all -> 0x03e5, all -> 0x0593 }] */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x058f A[SYNTHETIC, Splitter:B:272:0x058f] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0134 A[Catch:{ all -> 0x0130, all -> 0x0596 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:143:0x0282=Splitter:B:143:0x0282, B:262:0x0572=Splitter:B:262:0x0572, B:174:0x0309=Splitter:B:174:0x0309, B:245:0x0549=Splitter:B:245:0x0549, B:230:0x04eb=Splitter:B:230:0x04eb} */
    @androidx.annotation.WorkerThread
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28719C() {
        /*
            r22 = this;
            r1 = r22
            c.q.a.c.i.b.q4 r0 = r22.mo28486a()
            r0.mo28029h()
            r22.mo28744g()
            r2 = 1
            r1.f11176u = r2
            r3 = 0
            c.q.a.c.i.b.t4 r0 = r1.f11167l     // Catch:{ all -> 0x0596 }
            r0.mo28489d()     // Catch:{ all -> 0x0596 }
            c.q.a.c.i.b.t4 r0 = r1.f11167l     // Catch:{ all -> 0x0596 }
            c.q.a.c.i.b.q8 r0 = r0.mo28627L()     // Catch:{ all -> 0x0596 }
            java.lang.Boolean r0 = r0.mo28563J()     // Catch:{ all -> 0x0596 }
            if (r0 != 0) goto L_0x0034
            c.q.a.c.i.b.i3 r0 = r22.mo28487b()     // Catch:{ all -> 0x0596 }
            c.q.a.c.i.b.g3 r0 = r0.mo28344w()     // Catch:{ all -> 0x0596 }
            java.lang.String r2 = "Upload data called on the client side before use of service was decided"
            r0.mo28259a(r2)     // Catch:{ all -> 0x0596 }
            r1.f11176u = r3
        L_0x0030:
            r22.mo28725K()
            return
        L_0x0034:
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0596 }
            if (r0 == 0) goto L_0x004a
            c.q.a.c.i.b.i3 r0 = r22.mo28487b()     // Catch:{ all -> 0x0596 }
            c.q.a.c.i.b.g3 r0 = r0.mo28339r()     // Catch:{ all -> 0x0596 }
            java.lang.String r2 = "Upload called in the client side when service should be used"
            r0.mo28259a(r2)     // Catch:{ all -> 0x0596 }
            r1.f11176u = r3
            goto L_0x0030
        L_0x004a:
            long r4 = r1.f11170o     // Catch:{ all -> 0x0596 }
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0058
            r22.mo28727M()     // Catch:{ all -> 0x0596 }
            r1.f11176u = r3
            goto L_0x0030
        L_0x0058:
            c.q.a.c.i.b.q4 r0 = r22.mo28486a()     // Catch:{ all -> 0x0596 }
            r0.mo28029h()     // Catch:{ all -> 0x0596 }
            java.util.List r0 = r1.f11179x     // Catch:{ all -> 0x0596 }
            if (r0 == 0) goto L_0x0073
            c.q.a.c.i.b.i3 r0 = r22.mo28487b()     // Catch:{ all -> 0x0596 }
            c.q.a.c.i.b.g3 r0 = r0.mo28343v()     // Catch:{ all -> 0x0596 }
            java.lang.String r2 = "Uploading requested multiple times"
            r0.mo28259a(r2)     // Catch:{ all -> 0x0596 }
            r1.f11176u = r3
            goto L_0x0030
        L_0x0073:
            c.q.a.c.i.b.o3 r0 = r1.f11157b     // Catch:{ all -> 0x0596 }
            m16229R(r0)     // Catch:{ all -> 0x0596 }
            boolean r0 = r0.mo28499m()     // Catch:{ all -> 0x0596 }
            if (r0 != 0) goto L_0x0091
            c.q.a.c.i.b.i3 r0 = r22.mo28487b()     // Catch:{ all -> 0x0596 }
            c.q.a.c.i.b.g3 r0 = r0.mo28343v()     // Catch:{ all -> 0x0596 }
            java.lang.String r2 = "Network not connected, ignoring upload request"
            r0.mo28259a(r2)     // Catch:{ all -> 0x0596 }
            r22.mo28727M()     // Catch:{ all -> 0x0596 }
            r1.f11176u = r3
            goto L_0x0030
        L_0x0091:
            c.q.a.c.d.n.d r0 = r22.mo28488c()     // Catch:{ all -> 0x0596 }
            long r4 = r0.mo20838a()     // Catch:{ all -> 0x0596 }
            c.q.a.c.i.b.g r0 = r22.mo28732T()     // Catch:{ all -> 0x0596 }
            c.q.a.c.i.b.t2 r8 = p040c.p200q.p201a.p264c.p340i.p342b.C5658u2.f10953Q     // Catch:{ all -> 0x0596 }
            r9 = 0
            int r0 = r0.mo28247o(r9, r8)     // Catch:{ all -> 0x0596 }
            r22.mo28732T()     // Catch:{ all -> 0x0596 }
            long r10 = p040c.p200q.p201a.p264c.p340i.p342b.C5487g.m15650I()     // Catch:{ all -> 0x0596 }
            long r10 = r4 - r10
            r8 = r3
        L_0x00ae:
            if (r8 >= r0) goto L_0x00b9
            boolean r12 = r1.mo28728N(r9, r10)     // Catch:{ all -> 0x0596 }
            if (r12 == 0) goto L_0x00b9
            int r8 = r8 + 1
            goto L_0x00ae
        L_0x00b9:
            c.q.a.c.i.b.s8 r0 = r1.f11164i     // Catch:{ all -> 0x0596 }
            c.q.a.c.i.b.t3 r0 = r0.f10861g     // Catch:{ all -> 0x0596 }
            long r10 = r0.mo28615a()     // Catch:{ all -> 0x0596 }
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x00dc
            c.q.a.c.i.b.i3 r0 = r22.mo28487b()     // Catch:{ all -> 0x0596 }
            c.q.a.c.i.b.g3 r0 = r0.mo28338q()     // Catch:{ all -> 0x0596 }
            java.lang.String r6 = "Uploading events. Elapsed time since last upload attempt (ms)"
            long r7 = r4 - r10
            long r7 = java.lang.Math.abs(r7)     // Catch:{ all -> 0x0596 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0596 }
            r0.mo28260b(r6, r7)     // Catch:{ all -> 0x0596 }
        L_0x00dc:
            c.q.a.c.i.b.l r0 = r1.f11158c     // Catch:{ all -> 0x0596 }
            m16229R(r0)     // Catch:{ all -> 0x0596 }
            java.lang.String r6 = r0.mo28394Z()     // Catch:{ all -> 0x0596 }
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0596 }
            r7 = -1
            if (r0 != 0) goto L_0x0506
            long r10 = r1.f11181z     // Catch:{ all -> 0x0596 }
            int r0 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0138
            c.q.a.c.i.b.l r10 = r1.f11158c     // Catch:{ all -> 0x0596 }
            m16229R(r10)     // Catch:{ all -> 0x0596 }
            android.database.sqlite.SQLiteDatabase r0 = r10.mo28385P()     // Catch:{ SQLiteException -> 0x0119, all -> 0x0117 }
            java.lang.String r11 = "select rowid from raw_events order by rowid desc limit 1;"
            android.database.Cursor r11 = r0.rawQuery(r11, r9)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0117 }
            boolean r0 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x0115 }
            if (r0 != 0) goto L_0x010e
            if (r11 == 0) goto L_0x012d
        L_0x010a:
            r11.close()     // Catch:{ all -> 0x0596 }
            goto L_0x012d
        L_0x010e:
            long r7 = r11.getLong(r3)     // Catch:{ SQLiteException -> 0x0115 }
            if (r11 == 0) goto L_0x012d
            goto L_0x010a
        L_0x0115:
            r0 = move-exception
            goto L_0x011b
        L_0x0117:
            r0 = move-exception
            goto L_0x0132
        L_0x0119:
            r0 = move-exception
            r11 = r9
        L_0x011b:
            c.q.a.c.i.b.t4 r10 = r10.f10699a     // Catch:{ all -> 0x0130 }
            c.q.a.c.i.b.i3 r10 = r10.mo28487b()     // Catch:{ all -> 0x0130 }
            c.q.a.c.i.b.g3 r10 = r10.mo28339r()     // Catch:{ all -> 0x0130 }
            java.lang.String r12 = "Error querying raw events"
            r10.mo28260b(r12, r0)     // Catch:{ all -> 0x0130 }
            if (r11 == 0) goto L_0x012d
            goto L_0x010a
        L_0x012d:
            r1.f11181z = r7     // Catch:{ all -> 0x0596 }
            goto L_0x0138
        L_0x0130:
            r0 = move-exception
            r9 = r11
        L_0x0132:
            if (r9 == 0) goto L_0x0137
            r9.close()     // Catch:{ all -> 0x0596 }
        L_0x0137:
            throw r0     // Catch:{ all -> 0x0596 }
        L_0x0138:
            c.q.a.c.i.b.g r0 = r22.mo28732T()     // Catch:{ all -> 0x0596 }
            c.q.a.c.i.b.t2 r7 = p040c.p200q.p201a.p264c.p340i.p342b.C5658u2.f10975g     // Catch:{ all -> 0x0596 }
            int r0 = r0.mo28247o(r6, r7)     // Catch:{ all -> 0x0596 }
            c.q.a.c.i.b.g r7 = r22.mo28732T()     // Catch:{ all -> 0x0596 }
            c.q.a.c.i.b.t2 r8 = p040c.p200q.p201a.p264c.p340i.p342b.C5658u2.f10977h     // Catch:{ all -> 0x0596 }
            int r7 = r7.mo28247o(r6, r8)     // Catch:{ all -> 0x0596 }
            int r7 = java.lang.Math.max(r3, r7)     // Catch:{ all -> 0x0596 }
            c.q.a.c.i.b.l r8 = r1.f11158c     // Catch:{ all -> 0x0596 }
            m16229R(r8)     // Catch:{ all -> 0x0596 }
            r8.mo28029h()     // Catch:{ all -> 0x0596 }
            r8.mo28475i()     // Catch:{ all -> 0x0596 }
            if (r0 <= 0) goto L_0x015f
            r10 = r2
            goto L_0x0160
        L_0x015f:
            r10 = r3
        L_0x0160:
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8899a(r10)     // Catch:{ all -> 0x0596 }
            if (r7 <= 0) goto L_0x0167
            r10 = r2
            goto L_0x0168
        L_0x0167:
            r10 = r3
        L_0x0168:
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8899a(r10)     // Catch:{ all -> 0x0596 }
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8904f(r6)     // Catch:{ all -> 0x0596 }
            android.database.sqlite.SQLiteDatabase r11 = r8.mo28385P()     // Catch:{ SQLiteException -> 0x027e, all -> 0x027a }
            java.lang.String r12 = "rowid"
            java.lang.String r13 = "data"
            java.lang.String r14 = "retry_count"
            java.lang.String[] r13 = new java.lang.String[]{r12, r13, r14}     // Catch:{ SQLiteException -> 0x027e, all -> 0x027a }
            java.lang.String[] r15 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x027e, all -> 0x027a }
            r15[r3] = r6     // Catch:{ SQLiteException -> 0x027e, all -> 0x027a }
            java.lang.String r12 = "queue"
            java.lang.String r14 = "app_id=?"
            r16 = 0
            r17 = 0
            java.lang.String r18 = "rowid"
            java.lang.String r19 = java.lang.String.valueOf(r0)     // Catch:{ SQLiteException -> 0x027e, all -> 0x027a }
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ SQLiteException -> 0x027e, all -> 0x027a }
            boolean r0 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x0276 }
            if (r0 != 0) goto L_0x01a5
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ SQLiteException -> 0x0276 }
            if (r11 == 0) goto L_0x01a1
            r11.close()     // Catch:{ all -> 0x0596 }
        L_0x01a1:
            r20 = r4
            goto L_0x029e
        L_0x01a5:
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0276 }
            r12.<init>()     // Catch:{ SQLiteException -> 0x0276 }
            r13 = r3
        L_0x01ab:
            long r14 = r11.getLong(r3)     // Catch:{ SQLiteException -> 0x0276 }
            byte[] r0 = r11.getBlob(r2)     // Catch:{ IOException -> 0x0247 }
            c.q.a.c.i.b.y9 r2 = r8.f10663b     // Catch:{ IOException -> 0x0247 }
            c.q.a.c.i.b.aa r2 = r2.f11162g     // Catch:{ IOException -> 0x0247 }
            m16229R(r2)     // Catch:{ IOException -> 0x0247 }
            java.io.ByteArrayInputStream r9 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x0232 }
            r9.<init>(r0)     // Catch:{ IOException -> 0x0232 }
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x0232 }
            r0.<init>(r9)     // Catch:{ IOException -> 0x0232 }
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0232 }
            r3.<init>()     // Catch:{ IOException -> 0x0232 }
            r10 = 1024(0x400, float:1.435E-42)
            byte[] r10 = new byte[r10]     // Catch:{ IOException -> 0x0232 }
            r20 = r4
        L_0x01cf:
            int r4 = r0.read(r10)     // Catch:{ IOException -> 0x0230 }
            if (r4 > 0) goto L_0x022b
            r0.close()     // Catch:{ IOException -> 0x0230 }
            r9.close()     // Catch:{ IOException -> 0x0230 }
            byte[] r0 = r3.toByteArray()     // Catch:{ IOException -> 0x0230 }
            boolean r2 = r12.isEmpty()     // Catch:{ SQLiteException -> 0x0274 }
            if (r2 != 0) goto L_0x01eb
            int r2 = r0.length     // Catch:{ SQLiteException -> 0x0274 }
            int r2 = r2 + r13
            if (r2 <= r7) goto L_0x01eb
            goto L_0x026d
        L_0x01eb:
            c.q.a.c.g.i.s4 r2 = p040c.p200q.p201a.p264c.p294g.p335i.C5275t4.m14840N1()     // Catch:{ IOException -> 0x0216 }
            p040c.p200q.p201a.p264c.p340i.p342b.C5426aa.m15490C(r2, r0)     // Catch:{ IOException -> 0x0216 }
            c.q.a.c.g.i.s4 r2 = (p040c.p200q.p201a.p264c.p294g.p335i.C5260s4) r2     // Catch:{ IOException -> 0x0216 }
            r3 = 2
            boolean r4 = r11.isNull(r3)     // Catch:{ SQLiteException -> 0x0274 }
            if (r4 != 0) goto L_0x0202
            int r4 = r11.getInt(r3)     // Catch:{ SQLiteException -> 0x0274 }
            r2.mo27599c0(r4)     // Catch:{ SQLiteException -> 0x0274 }
        L_0x0202:
            int r0 = r0.length     // Catch:{ SQLiteException -> 0x0274 }
            int r13 = r13 + r0
            c.q.a.c.g.i.t8 r0 = r2.mo27520l()     // Catch:{ SQLiteException -> 0x0274 }
            c.q.a.c.g.i.t4 r0 = (p040c.p200q.p201a.p264c.p294g.p335i.C5275t4) r0     // Catch:{ SQLiteException -> 0x0274 }
            java.lang.Long r2 = java.lang.Long.valueOf(r14)     // Catch:{ SQLiteException -> 0x0274 }
            android.util.Pair r0 = android.util.Pair.create(r0, r2)     // Catch:{ SQLiteException -> 0x0274 }
            r12.add(r0)     // Catch:{ SQLiteException -> 0x0274 }
            goto L_0x025d
        L_0x0216:
            r0 = move-exception
            c.q.a.c.i.b.t4 r2 = r8.f10699a     // Catch:{ SQLiteException -> 0x0274 }
            c.q.a.c.i.b.i3 r2 = r2.mo28487b()     // Catch:{ SQLiteException -> 0x0274 }
            c.q.a.c.i.b.g3 r2 = r2.mo28339r()     // Catch:{ SQLiteException -> 0x0274 }
            java.lang.String r3 = "Failed to merge queued bundle. appId"
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r6)     // Catch:{ SQLiteException -> 0x0274 }
            r2.mo28261c(r3, r4, r0)     // Catch:{ SQLiteException -> 0x0274 }
            goto L_0x025d
        L_0x022b:
            r5 = 0
            r3.write(r10, r5, r4)     // Catch:{ IOException -> 0x0230 }
            goto L_0x01cf
        L_0x0230:
            r0 = move-exception
            goto L_0x0235
        L_0x0232:
            r0 = move-exception
            r20 = r4
        L_0x0235:
            c.q.a.c.i.b.t4 r2 = r2.f10699a     // Catch:{ IOException -> 0x0245 }
            c.q.a.c.i.b.i3 r2 = r2.mo28487b()     // Catch:{ IOException -> 0x0245 }
            c.q.a.c.i.b.g3 r2 = r2.mo28339r()     // Catch:{ IOException -> 0x0245 }
            java.lang.String r3 = "Failed to ungzip content"
            r2.mo28260b(r3, r0)     // Catch:{ IOException -> 0x0245 }
            throw r0     // Catch:{ IOException -> 0x0245 }
        L_0x0245:
            r0 = move-exception
            goto L_0x024a
        L_0x0247:
            r0 = move-exception
            r20 = r4
        L_0x024a:
            c.q.a.c.i.b.t4 r2 = r8.f10699a     // Catch:{ SQLiteException -> 0x0274 }
            c.q.a.c.i.b.i3 r2 = r2.mo28487b()     // Catch:{ SQLiteException -> 0x0274 }
            c.q.a.c.i.b.g3 r2 = r2.mo28339r()     // Catch:{ SQLiteException -> 0x0274 }
            java.lang.String r3 = "Failed to unzip queued bundle. appId"
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r6)     // Catch:{ SQLiteException -> 0x0274 }
            r2.mo28261c(r3, r4, r0)     // Catch:{ SQLiteException -> 0x0274 }
        L_0x025d:
            boolean r0 = r11.moveToNext()     // Catch:{ SQLiteException -> 0x0274 }
            if (r0 == 0) goto L_0x026d
            if (r13 <= r7) goto L_0x0266
            goto L_0x026d
        L_0x0266:
            r4 = r20
            r2 = 1
            r3 = 0
            r9 = 0
            goto L_0x01ab
        L_0x026d:
            if (r11 == 0) goto L_0x0272
            r11.close()     // Catch:{ all -> 0x0593 }
        L_0x0272:
            r0 = r12
            goto L_0x029e
        L_0x0274:
            r0 = move-exception
            goto L_0x0282
        L_0x0276:
            r0 = move-exception
            r20 = r4
            goto L_0x0282
        L_0x027a:
            r0 = move-exception
            r9 = 0
            goto L_0x0500
        L_0x027e:
            r0 = move-exception
            r20 = r4
            r11 = 0
        L_0x0282:
            c.q.a.c.i.b.t4 r2 = r8.f10699a     // Catch:{ all -> 0x04fe }
            c.q.a.c.i.b.i3 r2 = r2.mo28487b()     // Catch:{ all -> 0x04fe }
            c.q.a.c.i.b.g3 r2 = r2.mo28339r()     // Catch:{ all -> 0x04fe }
            java.lang.String r3 = "Error querying bundles. appId"
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r6)     // Catch:{ all -> 0x04fe }
            r2.mo28261c(r3, r4, r0)     // Catch:{ all -> 0x04fe }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x04fe }
            if (r11 == 0) goto L_0x029e
            r11.close()     // Catch:{ all -> 0x0593 }
        L_0x029e:
            boolean r2 = r0.isEmpty()     // Catch:{ all -> 0x0593 }
            if (r2 != 0) goto L_0x0586
            c.q.a.c.i.b.h r2 = r1.mo28733U(r6)     // Catch:{ all -> 0x0593 }
            com.google.android.gms.measurement.internal.zzah r3 = com.google.android.gms.measurement.internal.zzah.AD_STORAGE     // Catch:{ all -> 0x0593 }
            boolean r2 = r2.mo28326i(r3)     // Catch:{ all -> 0x0593 }
            if (r2 == 0) goto L_0x0309
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x0593 }
        L_0x02b4:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0593 }
            if (r3 == 0) goto L_0x02d3
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0593 }
            android.util.Pair r3 = (android.util.Pair) r3     // Catch:{ all -> 0x0593 }
            java.lang.Object r3 = r3.first     // Catch:{ all -> 0x0593 }
            c.q.a.c.g.i.t4 r3 = (p040c.p200q.p201a.p264c.p294g.p335i.C5275t4) r3     // Catch:{ all -> 0x0593 }
            java.lang.String r4 = r3.mo27677M()     // Catch:{ all -> 0x0593 }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x0593 }
            if (r4 != 0) goto L_0x02b4
            java.lang.String r2 = r3.mo27677M()     // Catch:{ all -> 0x0593 }
            goto L_0x02d4
        L_0x02d3:
            r2 = 0
        L_0x02d4:
            if (r2 == 0) goto L_0x0309
            r3 = 0
        L_0x02d7:
            int r4 = r0.size()     // Catch:{ all -> 0x0593 }
            if (r3 >= r4) goto L_0x0309
            java.lang.Object r4 = r0.get(r3)     // Catch:{ all -> 0x0593 }
            android.util.Pair r4 = (android.util.Pair) r4     // Catch:{ all -> 0x0593 }
            java.lang.Object r4 = r4.first     // Catch:{ all -> 0x0593 }
            c.q.a.c.g.i.t4 r4 = (p040c.p200q.p201a.p264c.p294g.p335i.C5275t4) r4     // Catch:{ all -> 0x0593 }
            java.lang.String r5 = r4.mo27677M()     // Catch:{ all -> 0x0593 }
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x0593 }
            if (r5 == 0) goto L_0x02f2
            goto L_0x0306
        L_0x02f2:
            java.lang.String r4 = r4.mo27677M()     // Catch:{ all -> 0x0593 }
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x0593 }
            if (r4 != 0) goto L_0x0306
            r4 = 0
            java.util.List r0 = r0.subList(r4, r3)     // Catch:{ all -> 0x0302 }
            goto L_0x0309
        L_0x0302:
            r0 = move-exception
            r2 = r4
            goto L_0x0598
        L_0x0306:
            int r3 = r3 + 1
            goto L_0x02d7
        L_0x0309:
            c.q.a.c.g.i.q4 r2 = p040c.p200q.p201a.p264c.p294g.p335i.C5245r4.m14711D()     // Catch:{ all -> 0x0593 }
            int r3 = r0.size()     // Catch:{ all -> 0x0593 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0593 }
            int r5 = r0.size()     // Catch:{ all -> 0x0593 }
            r4.<init>(r5)     // Catch:{ all -> 0x0593 }
            c.q.a.c.i.b.g r5 = r22.mo28732T()     // Catch:{ all -> 0x0593 }
            boolean r5 = r5.mo28236C(r6)     // Catch:{ all -> 0x0593 }
            if (r5 == 0) goto L_0x0332
            c.q.a.c.i.b.h r5 = r1.mo28733U(r6)     // Catch:{ all -> 0x0593 }
            com.google.android.gms.measurement.internal.zzah r7 = com.google.android.gms.measurement.internal.zzah.AD_STORAGE     // Catch:{ all -> 0x0593 }
            boolean r5 = r5.mo28326i(r7)     // Catch:{ all -> 0x0593 }
            if (r5 == 0) goto L_0x0332
            r5 = 1
            goto L_0x0333
        L_0x0332:
            r5 = 0
        L_0x0333:
            c.q.a.c.i.b.h r7 = r1.mo28733U(r6)     // Catch:{ all -> 0x0593 }
            com.google.android.gms.measurement.internal.zzah r8 = com.google.android.gms.measurement.internal.zzah.AD_STORAGE     // Catch:{ all -> 0x0593 }
            boolean r7 = r7.mo28326i(r8)     // Catch:{ all -> 0x0593 }
            c.q.a.c.i.b.h r8 = r1.mo28733U(r6)     // Catch:{ all -> 0x0593 }
            com.google.android.gms.measurement.internal.zzah r9 = com.google.android.gms.measurement.internal.zzah.ANALYTICS_STORAGE     // Catch:{ all -> 0x0593 }
            boolean r8 = r8.mo28326i(r9)     // Catch:{ all -> 0x0593 }
            p040c.p200q.p201a.p264c.p294g.p335i.C5179md.m14505b()     // Catch:{ all -> 0x0593 }
            c.q.a.c.i.b.g r9 = r22.mo28732T()     // Catch:{ all -> 0x0593 }
            c.q.a.c.i.b.t2 r10 = p040c.p200q.p201a.p264c.p340i.p342b.C5658u2.f10980i0     // Catch:{ all -> 0x0593 }
            r11 = 0
            boolean r9 = r9.mo28235B(r11, r10)     // Catch:{ all -> 0x0593 }
            if (r9 == 0) goto L_0x0365
            c.q.a.c.i.b.g r9 = r22.mo28732T()     // Catch:{ all -> 0x0593 }
            c.q.a.c.i.b.t2 r10 = p040c.p200q.p201a.p264c.p340i.p342b.C5658u2.f10984k0     // Catch:{ all -> 0x0593 }
            boolean r9 = r9.mo28235B(r6, r10)     // Catch:{ all -> 0x0593 }
            if (r9 == 0) goto L_0x0365
            r9 = 1
            goto L_0x0366
        L_0x0365:
            r9 = 0
        L_0x0366:
            r10 = 0
        L_0x0367:
            if (r10 >= r3) goto L_0x03e9
            java.lang.Object r11 = r0.get(r10)     // Catch:{ all -> 0x0593 }
            android.util.Pair r11 = (android.util.Pair) r11     // Catch:{ all -> 0x0593 }
            java.lang.Object r11 = r11.first     // Catch:{ all -> 0x0593 }
            c.q.a.c.g.i.t4 r11 = (p040c.p200q.p201a.p264c.p294g.p335i.C5275t4) r11     // Catch:{ all -> 0x0593 }
            c.q.a.c.g.i.q8 r11 = r11.mo27727z()     // Catch:{ all -> 0x0593 }
            c.q.a.c.g.i.s4 r11 = (p040c.p200q.p201a.p264c.p294g.p335i.C5260s4) r11     // Catch:{ all -> 0x0593 }
            java.lang.Object r12 = r0.get(r10)     // Catch:{ all -> 0x0593 }
            android.util.Pair r12 = (android.util.Pair) r12     // Catch:{ all -> 0x0593 }
            java.lang.Object r12 = r12.second     // Catch:{ all -> 0x0593 }
            java.lang.Long r12 = (java.lang.Long) r12     // Catch:{ all -> 0x0593 }
            r4.add(r12)     // Catch:{ all -> 0x0593 }
            c.q.a.c.i.b.g r12 = r22.mo28732T()     // Catch:{ all -> 0x0593 }
            r12.mo28249q()     // Catch:{ all -> 0x0593 }
            r12 = 74029(0x1212d, double:3.6575E-319)
            r11.mo27605i0(r12)     // Catch:{ all -> 0x0593 }
            r12 = r20
            r11.mo27604h0(r12)     // Catch:{ all -> 0x0593 }
            c.q.a.c.i.b.t4 r14 = r1.f11167l     // Catch:{ all -> 0x0593 }
            r14.mo28489d()     // Catch:{ all -> 0x0593 }
            r14 = 0
            r11.mo27600d0(r14)     // Catch:{ all -> 0x03e5 }
            if (r5 != 0) goto L_0x03a6
            r11.mo27568F0()     // Catch:{ all -> 0x0593 }
        L_0x03a6:
            if (r7 != 0) goto L_0x03ae
            r11.mo27582M0()     // Catch:{ all -> 0x0593 }
            r11.mo27574I0()     // Catch:{ all -> 0x0593 }
        L_0x03ae:
            if (r8 != 0) goto L_0x03b3
            r11.mo27563C0()     // Catch:{ all -> 0x0593 }
        L_0x03b3:
            r1.mo28746h(r6, r11)     // Catch:{ all -> 0x0593 }
            if (r9 != 0) goto L_0x03bb
            r11.mo27584N0()     // Catch:{ all -> 0x0593 }
        L_0x03bb:
            c.q.a.c.i.b.g r14 = r22.mo28732T()     // Catch:{ all -> 0x0593 }
            c.q.a.c.i.b.t2 r15 = p040c.p200q.p201a.p264c.p340i.p342b.C5658u2.f10957U     // Catch:{ all -> 0x0593 }
            boolean r14 = r14.mo28235B(r6, r15)     // Catch:{ all -> 0x0593 }
            if (r14 == 0) goto L_0x03dd
            c.q.a.c.g.i.t8 r14 = r11.mo27520l()     // Catch:{ all -> 0x0593 }
            c.q.a.c.g.i.t4 r14 = (p040c.p200q.p201a.p264c.p294g.p335i.C5275t4) r14     // Catch:{ all -> 0x0593 }
            byte[] r14 = r14.mo27190h()     // Catch:{ all -> 0x0593 }
            c.q.a.c.i.b.aa r15 = r1.f11162g     // Catch:{ all -> 0x0593 }
            m16229R(r15)     // Catch:{ all -> 0x0593 }
            long r14 = r15.mo28090x(r14)     // Catch:{ all -> 0x0593 }
            r11.mo27567F(r14)     // Catch:{ all -> 0x0593 }
        L_0x03dd:
            r2.mo27513r(r11)     // Catch:{ all -> 0x0593 }
            int r10 = r10 + 1
            r20 = r12
            goto L_0x0367
        L_0x03e5:
            r0 = move-exception
            r2 = r14
            goto L_0x0598
        L_0x03e9:
            r12 = r20
            c.q.a.c.i.b.i3 r0 = r22.mo28487b()     // Catch:{ all -> 0x0593 }
            java.lang.String r0 = r0.mo28336C()     // Catch:{ all -> 0x0593 }
            r5 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r5)     // Catch:{ all -> 0x0593 }
            if (r0 == 0) goto L_0x040b
            c.q.a.c.i.b.aa r0 = r1.f11162g     // Catch:{ all -> 0x0593 }
            m16229R(r0)     // Catch:{ all -> 0x0593 }
            c.q.a.c.g.i.t8 r5 = r2.mo27520l()     // Catch:{ all -> 0x0593 }
            c.q.a.c.g.i.r4 r5 = (p040c.p200q.p201a.p264c.p294g.p335i.C5245r4) r5     // Catch:{ all -> 0x0593 }
            java.lang.String r0 = r0.mo28078D(r5)     // Catch:{ all -> 0x0593 }
            r11 = r0
            goto L_0x040c
        L_0x040b:
            r11 = 0
        L_0x040c:
            c.q.a.c.i.b.aa r0 = r1.f11162g     // Catch:{ all -> 0x0593 }
            m16229R(r0)     // Catch:{ all -> 0x0593 }
            c.q.a.c.g.i.t8 r0 = r2.mo27520l()     // Catch:{ all -> 0x0593 }
            c.q.a.c.g.i.r4 r0 = (p040c.p200q.p201a.p264c.p294g.p335i.C5245r4) r0     // Catch:{ all -> 0x0593 }
            byte[] r14 = r0.mo27190h()     // Catch:{ all -> 0x0593 }
            c.q.a.c.i.b.n9 r0 = r1.f11165j     // Catch:{ all -> 0x0593 }
            c.q.a.c.i.b.y9 r0 = r0.f10663b     // Catch:{ all -> 0x0593 }
            c.q.a.c.i.b.l4 r0 = r0.f11156a     // Catch:{ all -> 0x0593 }
            m16229R(r0)     // Catch:{ all -> 0x0593 }
            java.lang.String r0 = r0.mo28437w(r6)     // Catch:{ all -> 0x0593 }
            boolean r5 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0593 }
            if (r5 != 0) goto L_0x0463
            c.q.a.c.i.b.t2 r5 = p040c.p200q.p201a.p264c.p340i.p342b.C5658u2.f10995q     // Catch:{ all -> 0x0593 }
            r7 = 0
            java.lang.Object r5 = r5.mo28613a(r7)     // Catch:{ all -> 0x0593 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0593 }
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch:{ all -> 0x0593 }
            android.net.Uri$Builder r7 = r5.buildUpon()     // Catch:{ all -> 0x0593 }
            java.lang.String r5 = r5.getAuthority()     // Catch:{ all -> 0x0593 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0593 }
            r8.<init>()     // Catch:{ all -> 0x0593 }
            r8.append(r0)     // Catch:{ all -> 0x0593 }
            java.lang.String r0 = "."
            r8.append(r0)     // Catch:{ all -> 0x0593 }
            r8.append(r5)     // Catch:{ all -> 0x0593 }
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x0593 }
            r7.authority(r0)     // Catch:{ all -> 0x0593 }
            android.net.Uri r0 = r7.build()     // Catch:{ all -> 0x0593 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0593 }
            goto L_0x046c
        L_0x0463:
            c.q.a.c.i.b.t2 r0 = p040c.p200q.p201a.p264c.p340i.p342b.C5658u2.f10995q     // Catch:{ all -> 0x0593 }
            r5 = 0
            java.lang.Object r0 = r0.mo28613a(r5)     // Catch:{ all -> 0x0593 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0593 }
        L_0x046c:
            java.net.URL r5 = new java.net.URL     // Catch:{ MalformedURLException -> 0x04eb }
            r5.<init>(r0)     // Catch:{ MalformedURLException -> 0x04eb }
            boolean r7 = r4.isEmpty()     // Catch:{ MalformedURLException -> 0x04eb }
            r8 = 1
            r7 = r7 ^ r8
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8899a(r7)     // Catch:{ MalformedURLException -> 0x04eb }
            java.util.List r7 = r1.f11179x     // Catch:{ MalformedURLException -> 0x04eb }
            if (r7 == 0) goto L_0x048c
            c.q.a.c.i.b.i3 r4 = r22.mo28487b()     // Catch:{ MalformedURLException -> 0x04eb }
            c.q.a.c.i.b.g3 r4 = r4.mo28339r()     // Catch:{ MalformedURLException -> 0x04eb }
            java.lang.String r7 = "Set uploading progress before finishing the previous upload"
            r4.mo28259a(r7)     // Catch:{ MalformedURLException -> 0x04eb }
            goto L_0x0493
        L_0x048c:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x04eb }
            r7.<init>(r4)     // Catch:{ MalformedURLException -> 0x04eb }
            r1.f11179x = r7     // Catch:{ MalformedURLException -> 0x04eb }
        L_0x0493:
            c.q.a.c.i.b.s8 r4 = r1.f11164i     // Catch:{ MalformedURLException -> 0x04eb }
            c.q.a.c.i.b.t3 r4 = r4.f10862h     // Catch:{ MalformedURLException -> 0x04eb }
            r4.mo28616b(r12)     // Catch:{ MalformedURLException -> 0x04eb }
            java.lang.String r4 = "?"
            if (r3 <= 0) goto L_0x04a7
            r3 = 0
            c.q.a.c.g.i.t4 r2 = r2.mo27514s(r3)     // Catch:{  }
            java.lang.String r4 = r2.mo27685R1()     // Catch:{ MalformedURLException -> 0x04eb }
        L_0x04a7:
            c.q.a.c.i.b.i3 r2 = r22.mo28487b()     // Catch:{ MalformedURLException -> 0x04eb }
            c.q.a.c.i.b.g3 r2 = r2.mo28343v()     // Catch:{ MalformedURLException -> 0x04eb }
            java.lang.String r3 = "Uploading data. app, uncompressed size, data"
            int r7 = r14.length     // Catch:{ MalformedURLException -> 0x04eb }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ MalformedURLException -> 0x04eb }
            r2.mo28262d(r3, r4, r7, r11)     // Catch:{ MalformedURLException -> 0x04eb }
            r2 = 1
            r1.f11175t = r2     // Catch:{ MalformedURLException -> 0x04eb }
            c.q.a.c.i.b.o3 r11 = r1.f11157b     // Catch:{ MalformedURLException -> 0x04eb }
            m16229R(r11)     // Catch:{ MalformedURLException -> 0x04eb }
            c.q.a.c.i.b.p9 r2 = new c.q.a.c.i.b.p9     // Catch:{ MalformedURLException -> 0x04eb }
            r2.<init>(r1, r6)     // Catch:{ MalformedURLException -> 0x04eb }
            r11.mo28029h()     // Catch:{ MalformedURLException -> 0x04eb }
            r11.mo28475i()     // Catch:{ MalformedURLException -> 0x04eb }
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8908j(r5)     // Catch:{ MalformedURLException -> 0x04eb }
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8908j(r14)     // Catch:{ MalformedURLException -> 0x04eb }
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8908j(r2)     // Catch:{ MalformedURLException -> 0x04eb }
            c.q.a.c.i.b.t4 r3 = r11.f10699a     // Catch:{ MalformedURLException -> 0x04eb }
            c.q.a.c.i.b.q4 r3 = r3.mo28486a()     // Catch:{ MalformedURLException -> 0x04eb }
            c.q.a.c.i.b.n3 r4 = new c.q.a.c.i.b.n3     // Catch:{ MalformedURLException -> 0x04eb }
            r15 = 0
            r10 = r4
            r12 = r6
            r13 = r5
            r16 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch:{ MalformedURLException -> 0x04eb }
            r3.mo28539y(r4)     // Catch:{ MalformedURLException -> 0x04eb }
            goto L_0x0586
        L_0x04eb:
            c.q.a.c.i.b.i3 r2 = r22.mo28487b()     // Catch:{ all -> 0x0593 }
            c.q.a.c.i.b.g3 r2 = r2.mo28339r()     // Catch:{ all -> 0x0593 }
            java.lang.String r3 = "Failed to parse upload URL. Not uploading. appId"
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r6)     // Catch:{ all -> 0x0593 }
            r2.mo28261c(r3, r4, r0)     // Catch:{ all -> 0x0593 }
            goto L_0x0586
        L_0x04fe:
            r0 = move-exception
            r9 = r11
        L_0x0500:
            if (r9 == 0) goto L_0x0505
            r9.close()     // Catch:{ all -> 0x0593 }
        L_0x0505:
            throw r0     // Catch:{ all -> 0x0593 }
        L_0x0506:
            r12 = r4
            r5 = r9
            r1.f11181z = r7     // Catch:{ all -> 0x0593 }
            c.q.a.c.i.b.l r2 = r1.f11158c     // Catch:{ all -> 0x0593 }
            m16229R(r2)     // Catch:{ all -> 0x0593 }
            r22.mo28732T()     // Catch:{ all -> 0x0593 }
            long r3 = p040c.p200q.p201a.p264c.p340i.p342b.C5487g.m15650I()     // Catch:{ all -> 0x0593 }
            long r3 = r12 - r3
            r2.mo28029h()     // Catch:{ all -> 0x0593 }
            r2.mo28475i()     // Catch:{ all -> 0x0593 }
            android.database.sqlite.SQLiteDatabase r0 = r2.mo28385P()     // Catch:{ SQLiteException -> 0x055d, all -> 0x055a }
            r6 = 1
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x055d, all -> 0x055a }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ SQLiteException -> 0x055d, all -> 0x055a }
            r4 = 0
            r6[r4] = r3     // Catch:{ SQLiteException -> 0x055d, all -> 0x055a }
            java.lang.String r3 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            android.database.Cursor r11 = r0.rawQuery(r3, r6)     // Catch:{ SQLiteException -> 0x055d, all -> 0x055a }
            boolean r0 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x0558 }
            if (r0 != 0) goto L_0x054d
            c.q.a.c.i.b.t4 r0 = r2.f10699a     // Catch:{ SQLiteException -> 0x0558 }
            c.q.a.c.i.b.i3 r0 = r0.mo28487b()     // Catch:{ SQLiteException -> 0x0558 }
            c.q.a.c.i.b.g3 r0 = r0.mo28343v()     // Catch:{ SQLiteException -> 0x0558 }
            java.lang.String r3 = "No expired configs for apps with pending events"
            r0.mo28259a(r3)     // Catch:{ SQLiteException -> 0x0558 }
            if (r11 == 0) goto L_0x0571
        L_0x0549:
            r11.close()     // Catch:{ all -> 0x0593 }
            goto L_0x0571
        L_0x054d:
            r3 = 0
            java.lang.String r9 = r11.getString(r3)     // Catch:{ SQLiteException -> 0x0558 }
            if (r11 == 0) goto L_0x0572
            r11.close()     // Catch:{ all -> 0x0593 }
            goto L_0x0572
        L_0x0558:
            r0 = move-exception
            goto L_0x055f
        L_0x055a:
            r0 = move-exception
            r9 = r5
            goto L_0x058d
        L_0x055d:
            r0 = move-exception
            r11 = r5
        L_0x055f:
            c.q.a.c.i.b.t4 r2 = r2.f10699a     // Catch:{ all -> 0x058b }
            c.q.a.c.i.b.i3 r2 = r2.mo28487b()     // Catch:{ all -> 0x058b }
            c.q.a.c.i.b.g3 r2 = r2.mo28339r()     // Catch:{ all -> 0x058b }
            java.lang.String r3 = "Error selecting expired configs"
            r2.mo28260b(r3, r0)     // Catch:{ all -> 0x058b }
            if (r11 == 0) goto L_0x0571
            goto L_0x0549
        L_0x0571:
            r9 = r5
        L_0x0572:
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x0593 }
            if (r0 != 0) goto L_0x0586
            c.q.a.c.i.b.l r0 = r1.f11158c     // Catch:{ all -> 0x0593 }
            m16229R(r0)     // Catch:{ all -> 0x0593 }
            c.q.a.c.i.b.d6 r0 = r0.mo28387R(r9)     // Catch:{ all -> 0x0593 }
            if (r0 == 0) goto L_0x0586
            r1.mo28748i(r0)     // Catch:{ all -> 0x0593 }
        L_0x0586:
            r2 = 0
            r1.f11176u = r2
            goto L_0x0030
        L_0x058b:
            r0 = move-exception
            r9 = r11
        L_0x058d:
            if (r9 == 0) goto L_0x0592
            r9.close()     // Catch:{ all -> 0x0593 }
        L_0x0592:
            throw r0     // Catch:{ all -> 0x0593 }
        L_0x0593:
            r0 = move-exception
            r2 = 0
            goto L_0x0598
        L_0x0596:
            r0 = move-exception
            r2 = r3
        L_0x0598:
            r1.f11176u = r2
            r22.mo28725K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p340i.p342b.C5709y9.mo28719C():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0748, code lost:
        if (r14.isEmpty() != false) goto L_0x074a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x030f A[Catch:{ NumberFormatException -> 0x0732, all -> 0x0a78 }] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x036f A[Catch:{ NumberFormatException -> 0x0732, all -> 0x0a78 }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x039d  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0503 A[Catch:{ NumberFormatException -> 0x0732, all -> 0x0a78 }] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0542 A[Catch:{ NumberFormatException -> 0x0732, all -> 0x0a78 }] */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x05bb A[Catch:{ NumberFormatException -> 0x0732, all -> 0x0a78 }] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0608 A[Catch:{ NumberFormatException -> 0x0732, all -> 0x0a78 }] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0615 A[Catch:{ NumberFormatException -> 0x0732, all -> 0x0a78 }] */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0622 A[Catch:{ NumberFormatException -> 0x0732, all -> 0x0a78 }] */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x065a A[Catch:{ NumberFormatException -> 0x0732, all -> 0x0a78 }] */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x066b A[Catch:{ NumberFormatException -> 0x0732, all -> 0x0a78 }] */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x06ab A[Catch:{ NumberFormatException -> 0x0732, all -> 0x0a78 }] */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x06c6 A[Catch:{ NumberFormatException -> 0x0732, all -> 0x0a78 }] */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x074d A[Catch:{ NumberFormatException -> 0x0732, all -> 0x0a78 }] */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x0792 A[Catch:{ NumberFormatException -> 0x0732, all -> 0x0a78 }] */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x07dc A[Catch:{ NumberFormatException -> 0x0732, all -> 0x0a78 }] */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x07f7 A[Catch:{ NumberFormatException -> 0x0732, all -> 0x0a78 }] */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0884 A[Catch:{ NumberFormatException -> 0x0732, all -> 0x0a78 }] */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x08a3 A[Catch:{ NumberFormatException -> 0x0732, all -> 0x0a78 }] */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x0935 A[Catch:{ NumberFormatException -> 0x0732, all -> 0x0a78 }] */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x09e1 A[Catch:{ SQLiteException -> 0x09fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x09f7  */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x0941 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0155 A[Catch:{ NumberFormatException -> 0x0732, all -> 0x0a78 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x016b A[SYNTHETIC, Splitter:B:46:0x016b] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01e6 A[Catch:{ NumberFormatException -> 0x0732, all -> 0x0a78 }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02c2 A[Catch:{ NumberFormatException -> 0x0732, all -> 0x0a78 }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x030c A[Catch:{ NumberFormatException -> 0x0732, all -> 0x0a78 }] */
    @androidx.annotation.WorkerThread
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28720D(com.google.android.gms.measurement.internal.zzaw r35, com.google.android.gms.measurement.internal.zzq r36) {
        /*
            r34 = this;
            r1 = r34
            r2 = r35
            r3 = r36
            java.lang.String r4 = "metadata_fingerprint"
            java.lang.String r5 = "app_id"
            java.lang.String r6 = "raw_events"
            java.lang.String r7 = "_sno"
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8908j(r36)
            java.lang.String r8 = r3.f14918e
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8904f(r8)
            long r8 = java.lang.System.nanoTime()
            c.q.a.c.i.b.q4 r10 = r34.mo28486a()
            r10.mo28029h()
            r34.mo28744g()
            java.lang.String r10 = r3.f14918e
            c.q.a.c.i.b.aa r11 = r1.f11162g
            m16229R(r11)
            boolean r11 = p040c.p200q.p201a.p264c.p340i.p342b.C5426aa.m15495m(r35, r36)
            if (r11 != 0) goto L_0x0032
            return
        L_0x0032:
            boolean r11 = r3.f14925r
            if (r11 == 0) goto L_0x0a83
            c.q.a.c.i.b.l4 r11 = r1.f11156a
            m16229R(r11)
            java.lang.String r12 = r2.f14899e
            boolean r11 = r11.mo28420F(r10, r12)
            java.lang.String r15 = "_err"
            r14 = 0
            if (r11 == 0) goto L_0x00df
            c.q.a.c.i.b.i3 r3 = r34.mo28487b()
            c.q.a.c.i.b.g3 r3 = r3.mo28344w()
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r10)
            c.q.a.c.i.b.t4 r5 = r1.f11167l
            c.q.a.c.i.b.d3 r5 = r5.mo28620D()
            java.lang.String r6 = r2.f14899e
            java.lang.String r5 = r5.mo28144d(r6)
            java.lang.String r6 = "Dropping blocked event. appId"
            r3.mo28261c(r6, r4, r5)
            c.q.a.c.i.b.l4 r3 = r1.f11156a
            m16229R(r3)
            boolean r3 = r3.mo28418D(r10)
            if (r3 != 0) goto L_0x0097
            c.q.a.c.i.b.l4 r3 = r1.f11156a
            m16229R(r3)
            boolean r3 = r3.mo28421G(r10)
            if (r3 == 0) goto L_0x007a
            goto L_0x0097
        L_0x007a:
            java.lang.String r3 = r2.f14899e
            boolean r3 = r15.equals(r3)
            if (r3 != 0) goto L_0x00de
            c.q.a.c.i.b.ga r11 = r34.mo28745g0()
            c.q.a.c.i.b.fa r12 = r1.f11155E
            r14 = 11
            java.lang.String r2 = r2.f14899e
            r17 = 0
            java.lang.String r15 = "_ev"
            r13 = r10
            r16 = r2
            r11.mo28271B(r12, r13, r14, r15, r16, r17)
            return
        L_0x0097:
            c.q.a.c.i.b.l r2 = r1.f11158c
            m16229R(r2)
            c.q.a.c.i.b.d6 r2 = r2.mo28387R(r10)
            if (r2 == 0) goto L_0x00de
            long r3 = r2.mo28170V()
            long r5 = r2.mo28161M()
            long r3 = java.lang.Math.max(r3, r5)
            c.q.a.c.d.n.d r5 = r34.mo28488c()
            long r5 = r5.mo20838a()
            long r5 = r5 - r3
            long r3 = java.lang.Math.abs(r5)
            r34.mo28732T()
            c.q.a.c.i.b.t2 r5 = p040c.p200q.p201a.p264c.p340i.p342b.C5658u2.f11006z
            java.lang.Object r5 = r5.mo28613a(r14)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x00de
            c.q.a.c.i.b.i3 r3 = r34.mo28487b()
            c.q.a.c.i.b.g3 r3 = r3.mo28338q()
            java.lang.String r4 = "Fetching config for blocked app"
            r3.mo28259a(r4)
            r1.mo28748i(r2)
        L_0x00de:
            return
        L_0x00df:
            c.q.a.c.i.b.j3 r2 = p040c.p200q.p201a.p264c.p340i.p342b.C5527j3.m15794b(r35)
            c.q.a.c.i.b.ga r11 = r34.mo28745g0()
            c.q.a.c.i.b.g r12 = r34.mo28732T()
            int r12 = r12.mo28246n(r10)
            r11.mo28270A(r2, r12)
            com.google.android.gms.measurement.internal.zzaw r2 = r2.mo28354a()
            c.q.a.c.i.b.i3 r11 = r34.mo28487b()
            java.lang.String r11 = r11.mo28336C()
            r13 = 2
            boolean r11 = android.util.Log.isLoggable(r11, r13)
            if (r11 == 0) goto L_0x011c
            c.q.a.c.i.b.i3 r11 = r34.mo28487b()
            c.q.a.c.i.b.g3 r11 = r11.mo28343v()
            c.q.a.c.i.b.t4 r12 = r1.f11167l
            c.q.a.c.i.b.d3 r12 = r12.mo28620D()
            java.lang.String r12 = r12.mo28143c(r2)
            java.lang.String r13 = "Logging event"
            r11.mo28260b(r13, r12)
        L_0x011c:
            c.q.a.c.i.b.l r11 = r1.f11158c
            m16229R(r11)
            r11.mo28399e0()
            r1.mo28731S(r3)     // Catch:{ all -> 0x0a78 }
            java.lang.String r11 = "ecommerce_purchase"
            java.lang.String r12 = r2.f14899e     // Catch:{ all -> 0x0a78 }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0a78 }
            java.lang.String r12 = "refund"
            r28 = r8
            if (r11 != 0) goto L_0x014a
            java.lang.String r9 = "purchase"
            java.lang.String r11 = r2.f14899e     // Catch:{ all -> 0x0a78 }
            boolean r9 = r9.equals(r11)     // Catch:{ all -> 0x0a78 }
            if (r9 != 0) goto L_0x014a
            java.lang.String r9 = r2.f14899e     // Catch:{ all -> 0x0a78 }
            boolean r9 = r12.equals(r9)     // Catch:{ all -> 0x0a78 }
            if (r9 == 0) goto L_0x0148
            goto L_0x014a
        L_0x0148:
            r9 = 0
            goto L_0x014b
        L_0x014a:
            r9 = 1
        L_0x014b:
            java.lang.String r11 = "_iap"
            java.lang.String r13 = r2.f14899e     // Catch:{ all -> 0x0a78 }
            boolean r11 = r11.equals(r13)     // Catch:{ all -> 0x0a78 }
            if (r11 != 0) goto L_0x015f
            if (r9 == 0) goto L_0x0159
            r9 = 1
            goto L_0x015f
        L_0x0159:
            r33 = r4
            r8 = r15
        L_0x015c:
            r4 = 2
            goto L_0x02f9
        L_0x015f:
            com.google.android.gms.measurement.internal.zzau r11 = r2.f14900l     // Catch:{ all -> 0x0a78 }
            java.lang.String r13 = "currency"
            java.lang.String r11 = r11.mo33662V(r13)     // Catch:{ all -> 0x0a78 }
            java.lang.String r13 = "value"
            if (r9 == 0) goto L_0x01d4
            com.google.android.gms.measurement.internal.zzau r9 = r2.f14900l     // Catch:{ all -> 0x0a78 }
            java.lang.Double r9 = r9.mo33659S(r13)     // Catch:{ all -> 0x0a78 }
            double r17 = r9.doubleValue()     // Catch:{ all -> 0x0a78 }
            r19 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r17 = r17 * r19
            r21 = 0
            int r9 = (r17 > r21 ? 1 : (r17 == r21 ? 0 : -1))
            if (r9 != 0) goto L_0x0192
            com.google.android.gms.measurement.internal.zzau r9 = r2.f14900l     // Catch:{ all -> 0x0a78 }
            java.lang.Long r9 = r9.mo33660T(r13)     // Catch:{ all -> 0x0a78 }
            r21 = r15
            long r14 = r9.longValue()     // Catch:{ all -> 0x0a78 }
            double r13 = (double) r14     // Catch:{ all -> 0x0a78 }
            double r17 = r13 * r19
            goto L_0x0194
        L_0x0192:
            r21 = r15
        L_0x0194:
            r13 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r9 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r9 > 0) goto L_0x01ae
            r13 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r9 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r9 < 0) goto L_0x01ae
            long r13 = java.lang.Math.round(r17)     // Catch:{ all -> 0x0a78 }
            java.lang.String r9 = r2.f14899e     // Catch:{ all -> 0x0a78 }
            boolean r9 = r12.equals(r9)     // Catch:{ all -> 0x0a78 }
            if (r9 == 0) goto L_0x01e0
            long r13 = -r13
            goto L_0x01e0
        L_0x01ae:
            c.q.a.c.i.b.i3 r2 = r34.mo28487b()     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.g3 r2 = r2.mo28344w()     // Catch:{ all -> 0x0a78 }
            java.lang.String r3 = "Data lost. Currency value is too big. appId"
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r10)     // Catch:{ all -> 0x0a78 }
            java.lang.Double r5 = java.lang.Double.valueOf(r17)     // Catch:{ all -> 0x0a78 }
            r2.mo28261c(r3, r4, r5)     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.l r2 = r1.f11158c     // Catch:{ all -> 0x0a78 }
            m16229R(r2)     // Catch:{ all -> 0x0a78 }
            r2.mo28405o()     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.l r2 = r1.f11158c
            m16229R(r2)
            r2.mo28400f0()
            return
        L_0x01d4:
            r21 = r15
            com.google.android.gms.measurement.internal.zzau r9 = r2.f14900l     // Catch:{ all -> 0x0a78 }
            java.lang.Long r9 = r9.mo33660T(r13)     // Catch:{ all -> 0x0a78 }
            long r13 = r9.longValue()     // Catch:{ all -> 0x0a78 }
        L_0x01e0:
            boolean r9 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x0a78 }
            if (r9 != 0) goto L_0x02f3
            java.util.Locale r9 = java.util.Locale.US     // Catch:{ all -> 0x0a78 }
            java.lang.String r9 = r11.toUpperCase(r9)     // Catch:{ all -> 0x0a78 }
            java.lang.String r11 = "[A-Z]{3}"
            boolean r11 = r9.matches(r11)     // Catch:{ all -> 0x0a78 }
            if (r11 == 0) goto L_0x02f3
            java.lang.String r11 = "_ltv_"
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0a78 }
            java.lang.String r9 = r11.concat(r9)     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.l r11 = r1.f11158c     // Catch:{ all -> 0x0a78 }
            m16229R(r11)     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.ca r11 = r11.mo28392X(r10, r9)     // Catch:{ all -> 0x0a78 }
            if (r11 == 0) goto L_0x023e
            java.lang.Object r11 = r11.f10376e     // Catch:{ all -> 0x0a78 }
            boolean r12 = r11 instanceof java.lang.Long     // Catch:{ all -> 0x0a78 }
            if (r12 != 0) goto L_0x0210
            goto L_0x023e
        L_0x0210:
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x0a78 }
            long r11 = r11.longValue()     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.ca r18 = new c.q.a.c.i.b.ca     // Catch:{ all -> 0x0a78 }
            java.lang.String r15 = r2.f14901m     // Catch:{ all -> 0x0a78 }
            c.q.a.c.d.n.d r17 = r34.mo28488c()     // Catch:{ all -> 0x0a78 }
            long r19 = r17.mo20838a()     // Catch:{ all -> 0x0a78 }
            long r11 = r11 + r13
            java.lang.Long r17 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0a78 }
            r11 = r18
            r12 = r10
            r14 = 0
            r13 = r15
            r8 = r14
            r15 = 0
            r14 = r9
            r9 = r21
            r15 = r19
            r11.<init>(r12, r13, r14, r15, r17)     // Catch:{ all -> 0x0a78 }
            r33 = r4
            r8 = r9
            r9 = r18
            r4 = 2
            goto L_0x02b7
        L_0x023e:
            r15 = r21
            r8 = 0
            c.q.a.c.i.b.l r11 = r1.f11158c     // Catch:{ all -> 0x0a78 }
            m16229R(r11)     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.g r12 = r34.mo28732T()     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.t2 r8 = p040c.p200q.p201a.p264c.p340i.p342b.C5658u2.f10941E     // Catch:{ all -> 0x0a78 }
            int r8 = r12.mo28247o(r10, r8)     // Catch:{ all -> 0x0a78 }
            int r8 = r8 + -1
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8904f(r10)     // Catch:{ all -> 0x0a78 }
            r11.mo28029h()     // Catch:{ all -> 0x0a78 }
            r11.mo28475i()     // Catch:{ all -> 0x0a78 }
            android.database.sqlite.SQLiteDatabase r12 = r11.mo28385P()     // Catch:{ SQLiteException -> 0x0281 }
            r21 = r15
            r15 = 3
            java.lang.String[] r15 = new java.lang.String[r15]     // Catch:{ SQLiteException -> 0x027d }
            r16 = 0
            r15[r16] = r10     // Catch:{ SQLiteException -> 0x027d }
            r16 = 1
            r15[r16] = r10     // Catch:{ SQLiteException -> 0x027d }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ SQLiteException -> 0x027d }
            r33 = r4
            r4 = 2
            r15[r4] = r8     // Catch:{ SQLiteException -> 0x027b }
            java.lang.String r8 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);"
            r12.execSQL(r8, r15)     // Catch:{ SQLiteException -> 0x027b }
            goto L_0x029b
        L_0x027b:
            r0 = move-exception
            goto L_0x0287
        L_0x027d:
            r0 = move-exception
            r33 = r4
            goto L_0x0286
        L_0x0281:
            r0 = move-exception
            r33 = r4
            r21 = r15
        L_0x0286:
            r4 = 2
        L_0x0287:
            r8 = r0
            c.q.a.c.i.b.t4 r11 = r11.f10699a     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.i3 r11 = r11.mo28487b()     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.g3 r11 = r11.mo28339r()     // Catch:{ all -> 0x0a78 }
            java.lang.String r12 = "Error pruning currencies. appId"
            java.lang.Object r15 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r10)     // Catch:{ all -> 0x0a78 }
            r11.mo28261c(r12, r15, r8)     // Catch:{ all -> 0x0a78 }
        L_0x029b:
            c.q.a.c.i.b.ca r18 = new c.q.a.c.i.b.ca     // Catch:{ all -> 0x0a78 }
            java.lang.String r8 = r2.f14901m     // Catch:{ all -> 0x0a78 }
            c.q.a.c.d.n.d r11 = r34.mo28488c()     // Catch:{ all -> 0x0a78 }
            long r15 = r11.mo20838a()     // Catch:{ all -> 0x0a78 }
            java.lang.Long r17 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0a78 }
            r11 = r18
            r12 = r10
            r13 = r8
            r14 = r9
            r8 = r21
            r11.<init>(r12, r13, r14, r15, r17)     // Catch:{ all -> 0x0a78 }
            r9 = r18
        L_0x02b7:
            c.q.a.c.i.b.l r11 = r1.f11158c     // Catch:{ all -> 0x0a78 }
            m16229R(r11)     // Catch:{ all -> 0x0a78 }
            boolean r11 = r11.mo28414x(r9)     // Catch:{ all -> 0x0a78 }
            if (r11 != 0) goto L_0x02f9
            c.q.a.c.i.b.i3 r11 = r34.mo28487b()     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.g3 r11 = r11.mo28339r()     // Catch:{ all -> 0x0a78 }
            java.lang.String r12 = "Too many unique user properties are set. Ignoring user property. appId"
            java.lang.Object r13 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r10)     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.t4 r14 = r1.f11167l     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.d3 r14 = r14.mo28620D()     // Catch:{ all -> 0x0a78 }
            java.lang.String r15 = r9.f10374c     // Catch:{ all -> 0x0a78 }
            java.lang.String r14 = r14.mo28146f(r15)     // Catch:{ all -> 0x0a78 }
            java.lang.Object r9 = r9.f10376e     // Catch:{ all -> 0x0a78 }
            r11.mo28262d(r12, r13, r14, r9)     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.ga r11 = r34.mo28745g0()     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.fa r12 = r1.f11155E     // Catch:{ all -> 0x0a78 }
            r14 = 9
            r15 = 0
            r16 = 0
            r17 = 0
            r13 = r10
            r11.mo28271B(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0a78 }
            goto L_0x02f9
        L_0x02f3:
            r33 = r4
            r8 = r21
            goto L_0x015c
        L_0x02f9:
            java.lang.String r9 = r2.f14899e     // Catch:{ all -> 0x0a78 }
            boolean r9 = p040c.p200q.p201a.p264c.p340i.p342b.C5498ga.m15686X(r9)     // Catch:{ all -> 0x0a78 }
            java.lang.String r11 = r2.f14899e     // Catch:{ all -> 0x0a78 }
            boolean r8 = r8.equals(r11)     // Catch:{ all -> 0x0a78 }
            r34.mo28745g0()     // Catch:{ all -> 0x0a78 }
            com.google.android.gms.measurement.internal.zzau r11 = r2.f14900l     // Catch:{ all -> 0x0a78 }
            if (r11 != 0) goto L_0x030f
            r16 = 0
            goto L_0x032f
        L_0x030f:
            c.q.a.c.i.b.s r12 = new c.q.a.c.i.b.s     // Catch:{ all -> 0x0a78 }
            r12.<init>(r11)     // Catch:{ all -> 0x0a78 }
            r16 = 0
        L_0x0316:
            boolean r13 = r12.hasNext()     // Catch:{ all -> 0x0a78 }
            if (r13 == 0) goto L_0x032f
            java.lang.String r13 = r12.next()     // Catch:{ all -> 0x0a78 }
            java.lang.Object r13 = r11.mo33661U(r13)     // Catch:{ all -> 0x0a78 }
            boolean r14 = r13 instanceof android.os.Parcelable[]     // Catch:{ all -> 0x0a78 }
            if (r14 == 0) goto L_0x0316
            android.os.Parcelable[] r13 = (android.os.Parcelable[]) r13     // Catch:{ all -> 0x0a78 }
            int r13 = r13.length     // Catch:{ all -> 0x0a78 }
            long r13 = (long) r13     // Catch:{ all -> 0x0a78 }
            long r16 = r16 + r13
            goto L_0x0316
        L_0x032f:
            r22 = 1
            long r15 = r16 + r22
            c.q.a.c.i.b.l r11 = r1.f11158c     // Catch:{ all -> 0x0a78 }
            m16229R(r11)     // Catch:{ all -> 0x0a78 }
            long r12 = r34.mo28722F()     // Catch:{ all -> 0x0a78 }
            r17 = 1
            r20 = 0
            r21 = 0
            r30 = r5
            r4 = 0
            r14 = r10
            r18 = r9
            r19 = r20
            r20 = r8
            c.q.a.c.i.b.j r11 = r11.mo28390U(r12, r14, r15, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0a78 }
            long r12 = r11.f10576b     // Catch:{ all -> 0x0a78 }
            r34.mo28732T()     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.t2 r14 = p040c.p200q.p201a.p264c.p340i.p342b.C5658u2.f10983k     // Catch:{ all -> 0x0a78 }
            r15 = 0
            java.lang.Object r14 = r14.mo28613a(r15)     // Catch:{ all -> 0x0a78 }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ all -> 0x0a78 }
            int r14 = r14.intValue()     // Catch:{ all -> 0x0a78 }
            r31 = r6
            r16 = r7
            long r6 = (long) r14     // Catch:{ all -> 0x0a78 }
            long r12 = r12 - r6
            int r6 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            r17 = 1000(0x3e8, double:4.94E-321)
            if (r6 <= 0) goto L_0x039d
            long r12 = r12 % r17
            int r2 = (r12 > r22 ? 1 : (r12 == r22 ? 0 : -1))
            if (r2 != 0) goto L_0x038c
            c.q.a.c.i.b.i3 r2 = r34.mo28487b()     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.g3 r2 = r2.mo28339r()     // Catch:{ all -> 0x0a78 }
            java.lang.String r3 = "Data loss. Too many events logged. appId, count"
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r10)     // Catch:{ all -> 0x0a78 }
            long r5 = r11.f10576b     // Catch:{ all -> 0x0a78 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0a78 }
            r2.mo28261c(r3, r4, r5)     // Catch:{ all -> 0x0a78 }
        L_0x038c:
            c.q.a.c.i.b.l r2 = r1.f11158c     // Catch:{ all -> 0x0a78 }
            m16229R(r2)     // Catch:{ all -> 0x0a78 }
            r2.mo28405o()     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.l r2 = r1.f11158c
            m16229R(r2)
            r2.mo28400f0()
            return
        L_0x039d:
            if (r9 == 0) goto L_0x03f8
            long r6 = r11.f10575a     // Catch:{ all -> 0x0a78 }
            r34.mo28732T()     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.t2 r12 = p040c.p200q.p201a.p264c.p340i.p342b.C5658u2.f10987m     // Catch:{ all -> 0x0a78 }
            java.lang.Object r12 = r12.mo28613a(r15)     // Catch:{ all -> 0x0a78 }
            java.lang.Integer r12 = (java.lang.Integer) r12     // Catch:{ all -> 0x0a78 }
            int r12 = r12.intValue()     // Catch:{ all -> 0x0a78 }
            long r12 = (long) r12     // Catch:{ all -> 0x0a78 }
            long r6 = r6 - r12
            int r12 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r12 <= 0) goto L_0x03f8
            long r6 = r6 % r17
            int r3 = (r6 > r22 ? 1 : (r6 == r22 ? 0 : -1))
            if (r3 != 0) goto L_0x03d3
            c.q.a.c.i.b.i3 r3 = r34.mo28487b()     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.g3 r3 = r3.mo28339r()     // Catch:{ all -> 0x0a78 }
            java.lang.String r4 = "Data loss. Too many public events logged. appId, count"
            java.lang.Object r5 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r10)     // Catch:{ all -> 0x0a78 }
            long r6 = r11.f10575a     // Catch:{ all -> 0x0a78 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0a78 }
            r3.mo28261c(r4, r5, r6)     // Catch:{ all -> 0x0a78 }
        L_0x03d3:
            c.q.a.c.i.b.ga r11 = r34.mo28745g0()     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.fa r12 = r1.f11155E     // Catch:{ all -> 0x0a78 }
            r14 = 16
            java.lang.String r15 = "_ev"
            java.lang.String r2 = r2.f14899e     // Catch:{ all -> 0x0a78 }
            r17 = 0
            r13 = r10
            r16 = r2
            r11.mo28271B(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.l r2 = r1.f11158c     // Catch:{ all -> 0x0a78 }
            m16229R(r2)     // Catch:{ all -> 0x0a78 }
            r2.mo28405o()     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.l r2 = r1.f11158c
            m16229R(r2)
            r2.mo28400f0()
            return
        L_0x03f8:
            r6 = 1000000(0xf4240, float:1.401298E-39)
            if (r8 == 0) goto L_0x0446
            long r7 = r11.f10578d     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.g r12 = r34.mo28732T()     // Catch:{ all -> 0x0a78 }
            java.lang.String r13 = r3.f14918e     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.t2 r14 = p040c.p200q.p201a.p264c.p340i.p342b.C5658u2.f10985l     // Catch:{ all -> 0x0a78 }
            int r12 = r12.mo28247o(r13, r14)     // Catch:{ all -> 0x0a78 }
            int r12 = java.lang.Math.min(r6, r12)     // Catch:{ all -> 0x0a78 }
            r13 = 0
            int r12 = java.lang.Math.max(r13, r12)     // Catch:{ all -> 0x0a78 }
            long r12 = (long) r12     // Catch:{ all -> 0x0a78 }
            long r7 = r7 - r12
            int r12 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r12 <= 0) goto L_0x0446
            int r2 = (r7 > r22 ? 1 : (r7 == r22 ? 0 : -1))
            if (r2 != 0) goto L_0x0435
            c.q.a.c.i.b.i3 r2 = r34.mo28487b()     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.g3 r2 = r2.mo28339r()     // Catch:{ all -> 0x0a78 }
            java.lang.String r3 = "Too many error events logged. appId, count"
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r10)     // Catch:{ all -> 0x0a78 }
            long r5 = r11.f10578d     // Catch:{ all -> 0x0a78 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0a78 }
            r2.mo28261c(r3, r4, r5)     // Catch:{ all -> 0x0a78 }
        L_0x0435:
            c.q.a.c.i.b.l r2 = r1.f11158c     // Catch:{ all -> 0x0a78 }
            m16229R(r2)     // Catch:{ all -> 0x0a78 }
            r2.mo28405o()     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.l r2 = r1.f11158c
            m16229R(r2)
            r2.mo28400f0()
            return
        L_0x0446:
            com.google.android.gms.measurement.internal.zzau r7 = r2.f14900l     // Catch:{ all -> 0x0a78 }
            android.os.Bundle r7 = r7.mo33658R()     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.ga r8 = r34.mo28745g0()     // Catch:{ all -> 0x0a78 }
            java.lang.String r11 = "_o"
            java.lang.String r12 = r2.f14901m     // Catch:{ all -> 0x0a78 }
            r8.mo28272C(r7, r11, r12)     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.ga r8 = r34.mo28745g0()     // Catch:{ all -> 0x0a78 }
            boolean r8 = r8.mo28289T(r10)     // Catch:{ all -> 0x0a78 }
            java.lang.String r14 = "_r"
            if (r8 == 0) goto L_0x0477
            c.q.a.c.i.b.ga r8 = r34.mo28745g0()     // Catch:{ all -> 0x0a78 }
            java.lang.Long r11 = java.lang.Long.valueOf(r22)     // Catch:{ all -> 0x0a78 }
            java.lang.String r12 = "_dbg"
            r8.mo28272C(r7, r12, r11)     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.ga r8 = r34.mo28745g0()     // Catch:{ all -> 0x0a78 }
            r8.mo28272C(r7, r14, r11)     // Catch:{ all -> 0x0a78 }
        L_0x0477:
            java.lang.String r8 = "_s"
            java.lang.String r11 = r2.f14899e     // Catch:{ all -> 0x0a78 }
            boolean r8 = r8.equals(r11)     // Catch:{ all -> 0x0a78 }
            if (r8 == 0) goto L_0x049f
            c.q.a.c.i.b.l r8 = r1.f11158c     // Catch:{ all -> 0x0a78 }
            m16229R(r8)     // Catch:{ all -> 0x0a78 }
            java.lang.String r11 = r3.f14918e     // Catch:{ all -> 0x0a78 }
            r12 = r16
            c.q.a.c.i.b.ca r8 = r8.mo28392X(r11, r12)     // Catch:{ all -> 0x0a78 }
            if (r8 == 0) goto L_0x049f
            java.lang.Object r11 = r8.f10376e     // Catch:{ all -> 0x0a78 }
            boolean r11 = r11 instanceof java.lang.Long     // Catch:{ all -> 0x0a78 }
            if (r11 == 0) goto L_0x049f
            c.q.a.c.i.b.ga r11 = r34.mo28745g0()     // Catch:{ all -> 0x0a78 }
            java.lang.Object r8 = r8.f10376e     // Catch:{ all -> 0x0a78 }
            r11.mo28272C(r7, r12, r8)     // Catch:{ all -> 0x0a78 }
        L_0x049f:
            c.q.a.c.i.b.l r8 = r1.f11158c     // Catch:{ all -> 0x0a78 }
            m16229R(r8)     // Catch:{ all -> 0x0a78 }
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8904f(r10)     // Catch:{ all -> 0x0a78 }
            r8.mo28029h()     // Catch:{ all -> 0x0a78 }
            r8.mo28475i()     // Catch:{ all -> 0x0a78 }
            android.database.sqlite.SQLiteDatabase r11 = r8.mo28385P()     // Catch:{ SQLiteException -> 0x04e3 }
            c.q.a.c.i.b.t4 r12 = r8.f10699a     // Catch:{ SQLiteException -> 0x04e3 }
            c.q.a.c.i.b.g r12 = r12.mo28649z()     // Catch:{ SQLiteException -> 0x04e3 }
            c.q.a.c.i.b.t2 r13 = p040c.p200q.p201a.p264c.p340i.p342b.C5658u2.f10993p     // Catch:{ SQLiteException -> 0x04e3 }
            int r12 = r12.mo28247o(r10, r13)     // Catch:{ SQLiteException -> 0x04e3 }
            int r6 = java.lang.Math.min(r6, r12)     // Catch:{ SQLiteException -> 0x04e3 }
            r13 = 0
            int r6 = java.lang.Math.max(r13, r6)     // Catch:{ SQLiteException -> 0x04df }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ SQLiteException -> 0x04df }
            r12 = 2
            java.lang.String[] r12 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x04df }
            r12[r13] = r10     // Catch:{ SQLiteException -> 0x04df }
            r16 = 1
            r12[r16] = r6     // Catch:{ SQLiteException -> 0x04df }
            java.lang.String r6 = "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)"
            r4 = r31
            int r5 = r11.delete(r4, r6, r12)     // Catch:{ SQLiteException -> 0x04dd }
            long r5 = (long) r5
            goto L_0x04fd
        L_0x04dd:
            r0 = move-exception
            goto L_0x04e7
        L_0x04df:
            r0 = move-exception
            r4 = r31
            goto L_0x04e7
        L_0x04e3:
            r0 = move-exception
            r4 = r31
            r13 = 0
        L_0x04e7:
            r5 = r0
            c.q.a.c.i.b.t4 r6 = r8.f10699a     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.i3 r6 = r6.mo28487b()     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.g3 r6 = r6.mo28339r()     // Catch:{ all -> 0x0a78 }
            java.lang.String r8 = "Error deleting over the limit events. appId"
            java.lang.Object r11 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r10)     // Catch:{ all -> 0x0a78 }
            r6.mo28261c(r8, r11, r5)     // Catch:{ all -> 0x0a78 }
            r5 = 0
        L_0x04fd:
            r11 = 0
            int r8 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r8 <= 0) goto L_0x0518
            c.q.a.c.i.b.i3 r8 = r34.mo28487b()     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.g3 r8 = r8.mo28344w()     // Catch:{ all -> 0x0a78 }
            java.lang.String r11 = "Data lost. Too many events stored on disk, deleted. appId"
            java.lang.Object r12 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r10)     // Catch:{ all -> 0x0a78 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0a78 }
            r8.mo28261c(r11, r12, r5)     // Catch:{ all -> 0x0a78 }
        L_0x0518:
            c.q.a.c.i.b.q r5 = new c.q.a.c.i.b.q     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.t4 r12 = r1.f11167l     // Catch:{ all -> 0x0a78 }
            java.lang.String r6 = r2.f14901m     // Catch:{ all -> 0x0a78 }
            java.lang.String r8 = r2.f14899e     // Catch:{ all -> 0x0a78 }
            long r2 = r2.f14902n     // Catch:{ all -> 0x0a78 }
            r18 = 0
            r11 = r5
            r31 = r13
            r13 = r6
            r6 = r14
            r14 = r10
            r32 = r4
            r4 = r15
            r15 = r8
            r16 = r2
            r20 = r7
            r11.<init>((p040c.p200q.p201a.p264c.p340i.p342b.C5648t4) r12, (java.lang.String) r13, (java.lang.String) r14, (java.lang.String) r15, (long) r16, (long) r18, (android.os.Bundle) r20)     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.l r2 = r1.f11158c     // Catch:{ all -> 0x0a78 }
            m16229R(r2)     // Catch:{ all -> 0x0a78 }
            java.lang.String r3 = r5.f10755b     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.r r2 = r2.mo28391V(r10, r3)     // Catch:{ all -> 0x0a78 }
            if (r2 != 0) goto L_0x05bb
            c.q.a.c.i.b.l r2 = r1.f11158c     // Catch:{ all -> 0x0a78 }
            m16229R(r2)     // Catch:{ all -> 0x0a78 }
            long r2 = r2.mo28384O(r10)     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.g r7 = r34.mo28732T()     // Catch:{ all -> 0x0a78 }
            int r7 = r7.mo28244l(r10)     // Catch:{ all -> 0x0a78 }
            long r7 = (long) r7     // Catch:{ all -> 0x0a78 }
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x059d
            if (r9 == 0) goto L_0x059d
            c.q.a.c.i.b.i3 r2 = r34.mo28487b()     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.g3 r2 = r2.mo28339r()     // Catch:{ all -> 0x0a78 }
            java.lang.String r3 = "Too many event names used, ignoring event. appId, name, supported count"
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r10)     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.t4 r6 = r1.f11167l     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.d3 r6 = r6.mo28620D()     // Catch:{ all -> 0x0a78 }
            java.lang.String r5 = r5.f10755b     // Catch:{ all -> 0x0a78 }
            java.lang.String r5 = r6.mo28144d(r5)     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.g r6 = r34.mo28732T()     // Catch:{ all -> 0x0a78 }
            int r6 = r6.mo28244l(r10)     // Catch:{ all -> 0x0a78 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0a78 }
            r2.mo28262d(r3, r4, r5, r6)     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.ga r11 = r34.mo28745g0()     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.fa r12 = r1.f11155E     // Catch:{ all -> 0x0a78 }
            r14 = 8
            r15 = 0
            r16 = 0
            r17 = 0
            r13 = r10
            r11.mo28271B(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.l r2 = r1.f11158c
            m16229R(r2)
            r2.mo28400f0()
            return
        L_0x059d:
            c.q.a.c.i.b.r r2 = new c.q.a.c.i.b.r     // Catch:{ all -> 0x0a78 }
            java.lang.String r13 = r5.f10755b     // Catch:{ all -> 0x0a78 }
            long r7 = r5.f10757d     // Catch:{ all -> 0x0a78 }
            r14 = 0
            r16 = 0
            r18 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r11 = r2
            r12 = r10
            r20 = r7
            r11.<init>(r12, r13, r14, r16, r18, r20, r22, r24, r25, r26, r27)     // Catch:{ all -> 0x0a78 }
            goto L_0x05c9
        L_0x05bb:
            c.q.a.c.i.b.t4 r3 = r1.f11167l     // Catch:{ all -> 0x0a78 }
            long r7 = r2.f10804f     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.q r5 = r5.mo28528a(r3, r7)     // Catch:{ all -> 0x0a78 }
            long r7 = r5.f10757d     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.r r2 = r2.mo28588c(r7)     // Catch:{ all -> 0x0a78 }
        L_0x05c9:
            c.q.a.c.i.b.l r3 = r1.f11158c     // Catch:{ all -> 0x0a78 }
            m16229R(r3)     // Catch:{ all -> 0x0a78 }
            r3.mo28407q(r2)     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.q4 r2 = r34.mo28486a()     // Catch:{ all -> 0x0a78 }
            r2.mo28029h()     // Catch:{ all -> 0x0a78 }
            r34.mo28744g()     // Catch:{ all -> 0x0a78 }
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8908j(r5)     // Catch:{ all -> 0x0a78 }
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8908j(r36)     // Catch:{ all -> 0x0a78 }
            java.lang.String r2 = r5.f10754a     // Catch:{ all -> 0x0a78 }
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8904f(r2)     // Catch:{ all -> 0x0a78 }
            java.lang.String r2 = r5.f10754a     // Catch:{ all -> 0x0a78 }
            r3 = r36
            java.lang.String r7 = r3.f14918e     // Catch:{ all -> 0x0a78 }
            boolean r2 = r2.equals(r7)     // Catch:{ all -> 0x0a78 }
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8899a(r2)     // Catch:{ all -> 0x0a78 }
            c.q.a.c.g.i.s4 r2 = p040c.p200q.p201a.p264c.p294g.p335i.C5275t4.m14840N1()     // Catch:{ all -> 0x0a78 }
            r7 = 1
            r2.mo27597a0(r7)     // Catch:{ all -> 0x0a78 }
            java.lang.String r8 = "android"
            r2.mo27593W(r8)     // Catch:{ all -> 0x0a78 }
            java.lang.String r8 = r3.f14918e     // Catch:{ all -> 0x0a78 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0a78 }
            if (r8 != 0) goto L_0x060d
            java.lang.String r8 = r3.f14918e     // Catch:{ all -> 0x0a78 }
            r2.mo27621v(r8)     // Catch:{ all -> 0x0a78 }
        L_0x060d:
            java.lang.String r8 = r3.f14921n     // Catch:{ all -> 0x0a78 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0a78 }
            if (r8 != 0) goto L_0x061a
            java.lang.String r8 = r3.f14921n     // Catch:{ all -> 0x0a78 }
            r2.mo27626y(r8)     // Catch:{ all -> 0x0a78 }
        L_0x061a:
            java.lang.String r8 = r3.f14920m     // Catch:{ all -> 0x0a78 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0a78 }
            if (r8 != 0) goto L_0x0627
            java.lang.String r8 = r3.f14920m     // Catch:{ all -> 0x0a78 }
            r2.mo27628z(r8)     // Catch:{ all -> 0x0a78 }
        L_0x0627:
            p040c.p200q.p201a.p264c.p294g.p335i.C5179md.m14505b()     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.g r8 = r34.mo28732T()     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.t2 r9 = p040c.p200q.p201a.p264c.p340i.p342b.C5658u2.f10980i0     // Catch:{ all -> 0x0a78 }
            boolean r8 = r8.mo28235B(r4, r9)     // Catch:{ all -> 0x0a78 }
            if (r8 == 0) goto L_0x0651
            c.q.a.c.i.b.g r8 = r34.mo28732T()     // Catch:{ all -> 0x0a78 }
            java.lang.String r9 = r3.f14918e     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.t2 r10 = p040c.p200q.p201a.p264c.p340i.p342b.C5658u2.f10984k0     // Catch:{ all -> 0x0a78 }
            boolean r8 = r8.mo28235B(r9, r10)     // Catch:{ all -> 0x0a78 }
            if (r8 == 0) goto L_0x0651
            java.lang.String r8 = r3.f14917H     // Catch:{ all -> 0x0a78 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0a78 }
            if (r8 != 0) goto L_0x0651
            java.lang.String r8 = r3.f14917H     // Catch:{ all -> 0x0a78 }
            r2.mo27601e0(r8)     // Catch:{ all -> 0x0a78 }
        L_0x0651:
            long r8 = r3.f14927t     // Catch:{ all -> 0x0a78 }
            r10 = -2147483648(0xffffffff80000000, double:NaN)
            int r10 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r10 == 0) goto L_0x065e
            int r8 = (int) r8     // Catch:{ all -> 0x0a78 }
            r2.mo27562C(r8)     // Catch:{ all -> 0x0a78 }
        L_0x065e:
            long r8 = r3.f14922o     // Catch:{ all -> 0x0a78 }
            r2.mo27589S(r8)     // Catch:{ all -> 0x0a78 }
            java.lang.String r8 = r3.f14919l     // Catch:{ all -> 0x0a78 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0a78 }
            if (r8 != 0) goto L_0x0670
            java.lang.String r8 = r3.f14919l     // Catch:{ all -> 0x0a78 }
            r2.mo27588R(r8)     // Catch:{ all -> 0x0a78 }
        L_0x0670:
            java.lang.String r8 = r3.f14918e     // Catch:{ all -> 0x0a78 }
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8908j(r8)     // Catch:{ all -> 0x0a78 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.h r8 = r1.mo28733U(r8)     // Catch:{ all -> 0x0a78 }
            java.lang.String r9 = r3.f14915F     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.h r9 = p040c.p200q.p201a.p264c.p340i.p342b.C5499h.m15749b(r9)     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.h r8 = r8.mo28319c(r9)     // Catch:{ all -> 0x0a78 }
            java.lang.String r8 = r8.mo28324h()     // Catch:{ all -> 0x0a78 }
            r2.mo27571H(r8)     // Catch:{ all -> 0x0a78 }
            java.lang.String r8 = r2.mo27610n0()     // Catch:{ all -> 0x0a78 }
            boolean r8 = r8.isEmpty()     // Catch:{ all -> 0x0a78 }
            if (r8 == 0) goto L_0x06a3
            java.lang.String r8 = r3.f14910A     // Catch:{ all -> 0x0a78 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0a78 }
            if (r8 != 0) goto L_0x06a3
            java.lang.String r8 = r3.f14910A     // Catch:{ all -> 0x0a78 }
            r2.mo27618t(r8)     // Catch:{ all -> 0x0a78 }
        L_0x06a3:
            long r8 = r3.f14923p     // Catch:{ all -> 0x0a78 }
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x06ae
            r2.mo27573I(r8)     // Catch:{ all -> 0x0a78 }
        L_0x06ae:
            long r8 = r3.f14912C     // Catch:{ all -> 0x0a78 }
            r2.mo27579L(r8)     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.aa r8 = r1.f11162g     // Catch:{ all -> 0x0a78 }
            m16229R(r8)     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.y9 r9 = r8.f10663b     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.t4 r9 = r9.f11167l     // Catch:{ all -> 0x0a78 }
            android.content.Context r9 = r9.mo28490f()     // Catch:{ all -> 0x0a78 }
            java.util.Map r9 = p040c.p200q.p201a.p264c.p340i.p342b.C5658u2.m16142c(r9)     // Catch:{ all -> 0x0a78 }
            if (r9 == 0) goto L_0x074a
            boolean r10 = r9.isEmpty()     // Catch:{ all -> 0x0a78 }
            if (r10 == 0) goto L_0x06ce
            goto L_0x074a
        L_0x06ce:
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x0a78 }
            r14.<init>()     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.t2 r10 = p040c.p200q.p201a.p264c.p340i.p342b.C5658u2.f10952P     // Catch:{ all -> 0x0a78 }
            java.lang.Object r10 = r10.mo28613a(r4)     // Catch:{ all -> 0x0a78 }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ all -> 0x0a78 }
            int r10 = r10.intValue()     // Catch:{ all -> 0x0a78 }
            java.util.Set r9 = r9.entrySet()     // Catch:{ all -> 0x0a78 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0a78 }
        L_0x06e7:
            boolean r11 = r9.hasNext()     // Catch:{ all -> 0x0a78 }
            if (r11 == 0) goto L_0x0744
            java.lang.Object r11 = r9.next()     // Catch:{ all -> 0x0a78 }
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11     // Catch:{ all -> 0x0a78 }
            java.lang.Object r12 = r11.getKey()     // Catch:{ all -> 0x0a78 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0a78 }
            java.lang.String r13 = "measurement.id."
            boolean r12 = r12.startsWith(r13)     // Catch:{ all -> 0x0a78 }
            if (r12 == 0) goto L_0x06e7
            java.lang.Object r11 = r11.getValue()     // Catch:{ NumberFormatException -> 0x0732 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ NumberFormatException -> 0x0732 }
            int r11 = java.lang.Integer.parseInt(r11)     // Catch:{ NumberFormatException -> 0x0732 }
            if (r11 == 0) goto L_0x06e7
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ NumberFormatException -> 0x0732 }
            r14.add(r11)     // Catch:{ NumberFormatException -> 0x0732 }
            int r11 = r14.size()     // Catch:{ NumberFormatException -> 0x0732 }
            if (r11 < r10) goto L_0x06e7
            c.q.a.c.i.b.t4 r11 = r8.f10699a     // Catch:{ NumberFormatException -> 0x0732 }
            c.q.a.c.i.b.i3 r11 = r11.mo28487b()     // Catch:{ NumberFormatException -> 0x0732 }
            c.q.a.c.i.b.g3 r11 = r11.mo28344w()     // Catch:{ NumberFormatException -> 0x0732 }
            java.lang.String r12 = "Too many experiment IDs. Number of IDs"
            int r13 = r14.size()     // Catch:{ NumberFormatException -> 0x0732 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ NumberFormatException -> 0x0732 }
            r11.mo28260b(r12, r13)     // Catch:{ NumberFormatException -> 0x0732 }
            goto L_0x0744
        L_0x0732:
            r0 = move-exception
            r11 = r0
            c.q.a.c.i.b.t4 r12 = r8.f10699a     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.i3 r12 = r12.mo28487b()     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.g3 r12 = r12.mo28344w()     // Catch:{ all -> 0x0a78 }
            java.lang.String r13 = "Experiment ID NumberFormatException"
            r12.mo28260b(r13, r11)     // Catch:{ all -> 0x0a78 }
            goto L_0x06e7
        L_0x0744:
            boolean r8 = r14.isEmpty()     // Catch:{ all -> 0x0a78 }
            if (r8 == 0) goto L_0x074b
        L_0x074a:
            r14 = r4
        L_0x074b:
            if (r14 == 0) goto L_0x0750
            r2.mo27625x0(r14)     // Catch:{ all -> 0x0a78 }
        L_0x0750:
            java.lang.String r8 = r3.f14918e     // Catch:{ all -> 0x0a78 }
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8908j(r8)     // Catch:{ all -> 0x0a78 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.h r8 = r1.mo28733U(r8)     // Catch:{ all -> 0x0a78 }
            java.lang.String r9 = r3.f14915F     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.h r9 = p040c.p200q.p201a.p264c.p340i.p342b.C5499h.m15749b(r9)     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.h r8 = r8.mo28319c(r9)     // Catch:{ all -> 0x0a78 }
            com.google.android.gms.measurement.internal.zzah r9 = com.google.android.gms.measurement.internal.zzah.AD_STORAGE     // Catch:{ all -> 0x0a78 }
            boolean r9 = r8.mo28326i(r9)     // Catch:{ all -> 0x0a78 }
            if (r9 == 0) goto L_0x079d
            boolean r9 = r3.f14932y     // Catch:{ all -> 0x0a78 }
            if (r9 == 0) goto L_0x079d
            c.q.a.c.i.b.s8 r9 = r1.f11164i     // Catch:{ all -> 0x0a78 }
            java.lang.String r10 = r3.f14918e     // Catch:{ all -> 0x0a78 }
            android.util.Pair r9 = r9.mo28608n(r10, r8)     // Catch:{ all -> 0x0a78 }
            java.lang.Object r10 = r9.first     // Catch:{ all -> 0x0a78 }
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10     // Catch:{ all -> 0x0a78 }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x0a78 }
            if (r10 != 0) goto L_0x079d
            boolean r10 = r3.f14932y     // Catch:{ all -> 0x0a78 }
            if (r10 == 0) goto L_0x079d
            java.lang.Object r10 = r9.first     // Catch:{ all -> 0x0a78 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0a78 }
            r2.mo27598b0(r10)     // Catch:{ all -> 0x0a78 }
            java.lang.Object r10 = r9.second     // Catch:{ all -> 0x0a78 }
            if (r10 == 0) goto L_0x079d
            java.lang.Object r9 = r9.second     // Catch:{ all -> 0x0a78 }
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ all -> 0x0a78 }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x0a78 }
            r2.mo27591U(r9)     // Catch:{ all -> 0x0a78 }
        L_0x079d:
            c.q.a.c.i.b.t4 r9 = r1.f11167l     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.p r9 = r9.mo28617A()     // Catch:{ all -> 0x0a78 }
            r9.mo28502k()     // Catch:{ all -> 0x0a78 }
            java.lang.String r9 = android.os.Build.MODEL     // Catch:{ all -> 0x0a78 }
            r2.mo27575J(r9)     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.t4 r9 = r1.f11167l     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.p r9 = r9.mo28617A()     // Catch:{ all -> 0x0a78 }
            r9.mo28502k()     // Catch:{ all -> 0x0a78 }
            java.lang.String r9 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x0a78 }
            r2.mo27592V(r9)     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.t4 r9 = r1.f11167l     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.p r9 = r9.mo28617A()     // Catch:{ all -> 0x0a78 }
            long r9 = r9.mo28512p()     // Catch:{ all -> 0x0a78 }
            int r9 = (int) r9     // Catch:{ all -> 0x0a78 }
            r2.mo27603g0(r9)     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.t4 r9 = r1.f11167l     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.p r9 = r9.mo28617A()     // Catch:{ all -> 0x0a78 }
            java.lang.String r9 = r9.mo28513q()     // Catch:{ all -> 0x0a78 }
            r2.mo27607k0(r9)     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.t4 r9 = r1.f11167l     // Catch:{ all -> 0x0a78 }
            boolean r9 = r9.mo28642o()     // Catch:{ all -> 0x0a78 }
            if (r9 == 0) goto L_0x07ea
            r2.mo27609m0()     // Catch:{ all -> 0x0a78 }
            boolean r9 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0a78 }
            if (r9 == 0) goto L_0x07e6
            goto L_0x07ea
        L_0x07e6:
            r2.mo27577K(r4)     // Catch:{ all -> 0x0a78 }
            throw r4
        L_0x07ea:
            c.q.a.c.i.b.l r9 = r1.f11158c     // Catch:{ all -> 0x0a78 }
            m16229R(r9)     // Catch:{ all -> 0x0a78 }
            java.lang.String r10 = r3.f14918e     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.d6 r9 = r9.mo28387R(r10)     // Catch:{ all -> 0x0a78 }
            if (r9 != 0) goto L_0x085c
            c.q.a.c.i.b.d6 r9 = new c.q.a.c.i.b.d6     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.t4 r10 = r1.f11167l     // Catch:{ all -> 0x0a78 }
            java.lang.String r11 = r3.f14918e     // Catch:{ all -> 0x0a78 }
            r9.<init>(r10, r11)     // Catch:{ all -> 0x0a78 }
            java.lang.String r10 = r1.mo28747h0(r8)     // Catch:{ all -> 0x0a78 }
            r9.mo28189h(r10)     // Catch:{ all -> 0x0a78 }
            java.lang.String r10 = r3.f14928u     // Catch:{ all -> 0x0a78 }
            r9.mo28206v(r10)     // Catch:{ all -> 0x0a78 }
            java.lang.String r10 = r3.f14919l     // Catch:{ all -> 0x0a78 }
            r9.mo28207w(r10)     // Catch:{ all -> 0x0a78 }
            com.google.android.gms.measurement.internal.zzah r10 = com.google.android.gms.measurement.internal.zzah.AD_STORAGE     // Catch:{ all -> 0x0a78 }
            boolean r10 = r8.mo28326i(r10)     // Catch:{ all -> 0x0a78 }
            if (r10 == 0) goto L_0x0826
            c.q.a.c.i.b.s8 r10 = r1.f11164i     // Catch:{ all -> 0x0a78 }
            java.lang.String r11 = r3.f14918e     // Catch:{ all -> 0x0a78 }
            boolean r12 = r3.f14932y     // Catch:{ all -> 0x0a78 }
            java.lang.String r10 = r10.mo28609o(r11, r12)     // Catch:{ all -> 0x0a78 }
            r9.mo28154F(r10)     // Catch:{ all -> 0x0a78 }
        L_0x0826:
            r10 = 0
            r9.mo28150B(r10)     // Catch:{ all -> 0x0a78 }
            r9.mo28151C(r10)     // Catch:{ all -> 0x0a78 }
            r9.mo28210z(r10)     // Catch:{ all -> 0x0a78 }
            java.lang.String r10 = r3.f14920m     // Catch:{ all -> 0x0a78 }
            r9.mo28193j(r10)     // Catch:{ all -> 0x0a78 }
            long r10 = r3.f14927t     // Catch:{ all -> 0x0a78 }
            r9.mo28195k(r10)     // Catch:{ all -> 0x0a78 }
            java.lang.String r10 = r3.f14921n     // Catch:{ all -> 0x0a78 }
            r9.mo28191i(r10)     // Catch:{ all -> 0x0a78 }
            long r10 = r3.f14922o     // Catch:{ all -> 0x0a78 }
            r9.mo28208x(r10)     // Catch:{ all -> 0x0a78 }
            long r10 = r3.f14923p     // Catch:{ all -> 0x0a78 }
            r9.mo28203s(r10)     // Catch:{ all -> 0x0a78 }
            boolean r10 = r3.f14925r     // Catch:{ all -> 0x0a78 }
            r9.mo28152D(r10)     // Catch:{ all -> 0x0a78 }
            long r10 = r3.f14912C     // Catch:{ all -> 0x0a78 }
            r9.mo28204t(r10)     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.l r10 = r1.f11158c     // Catch:{ all -> 0x0a78 }
            m16229R(r10)     // Catch:{ all -> 0x0a78 }
            r10.mo28406p(r9)     // Catch:{ all -> 0x0a78 }
        L_0x085c:
            com.google.android.gms.measurement.internal.zzah r10 = com.google.android.gms.measurement.internal.zzah.ANALYTICS_STORAGE     // Catch:{ all -> 0x0a78 }
            boolean r8 = r8.mo28326i(r10)     // Catch:{ all -> 0x0a78 }
            if (r8 == 0) goto L_0x087a
            java.lang.String r8 = r9.mo28184e0()     // Catch:{ all -> 0x0a78 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0a78 }
            if (r8 != 0) goto L_0x087a
            java.lang.String r8 = r9.mo28184e0()     // Catch:{ all -> 0x0a78 }
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8908j(r8)     // Catch:{ all -> 0x0a78 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0a78 }
            r2.mo27623w(r8)     // Catch:{ all -> 0x0a78 }
        L_0x087a:
            java.lang.String r8 = r9.mo28190h0()     // Catch:{ all -> 0x0a78 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0a78 }
            if (r8 != 0) goto L_0x0890
            java.lang.String r8 = r9.mo28190h0()     // Catch:{ all -> 0x0a78 }
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8908j(r8)     // Catch:{ all -> 0x0a78 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0a78 }
            r2.mo27587Q(r8)     // Catch:{ all -> 0x0a78 }
        L_0x0890:
            c.q.a.c.i.b.l r8 = r1.f11158c     // Catch:{ all -> 0x0a78 }
            m16229R(r8)     // Catch:{ all -> 0x0a78 }
            java.lang.String r3 = r3.f14918e     // Catch:{ all -> 0x0a78 }
            java.util.List r3 = r8.mo28397c0(r3)     // Catch:{ all -> 0x0a78 }
            r13 = r31
        L_0x089d:
            int r8 = r3.size()     // Catch:{ all -> 0x0a78 }
            if (r13 >= r8) goto L_0x08d3
            c.q.a.c.g.i.b5 r8 = p040c.p200q.p201a.p264c.p294g.p335i.C5012c5.m13888G()     // Catch:{ all -> 0x0a78 }
            java.lang.Object r9 = r3.get(r13)     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.ca r9 = (p040c.p200q.p201a.p264c.p340i.p342b.C5450ca) r9     // Catch:{ all -> 0x0a78 }
            java.lang.String r9 = r9.f10374c     // Catch:{ all -> 0x0a78 }
            r8.mo26979y(r9)     // Catch:{ all -> 0x0a78 }
            java.lang.Object r9 = r3.get(r13)     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.ca r9 = (p040c.p200q.p201a.p264c.p340i.p342b.C5450ca) r9     // Catch:{ all -> 0x0a78 }
            long r9 = r9.f10375d     // Catch:{ all -> 0x0a78 }
            r8.mo26980z(r9)     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.aa r9 = r1.f11162g     // Catch:{ all -> 0x0a78 }
            m16229R(r9)     // Catch:{ all -> 0x0a78 }
            java.lang.Object r10 = r3.get(r13)     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.ca r10 = (p040c.p200q.p201a.p264c.p340i.p342b.C5450ca) r10     // Catch:{ all -> 0x0a78 }
            java.lang.Object r10 = r10.f10376e     // Catch:{ all -> 0x0a78 }
            r9.mo28084K(r8, r10)     // Catch:{ all -> 0x0a78 }
            r2.mo27560A0(r8)     // Catch:{ all -> 0x0a78 }
            int r13 = r13 + 1
            goto L_0x089d
        L_0x08d3:
            c.q.a.c.i.b.l r3 = r1.f11158c     // Catch:{ IOException -> 0x0a2e }
            m16229R(r3)     // Catch:{ IOException -> 0x0a2e }
            c.q.a.c.g.i.t8 r8 = r2.mo27520l()     // Catch:{ IOException -> 0x0a2e }
            c.q.a.c.g.i.t4 r8 = (p040c.p200q.p201a.p264c.p294g.p335i.C5275t4) r8     // Catch:{ IOException -> 0x0a2e }
            r3.mo28029h()     // Catch:{ IOException -> 0x0a2e }
            r3.mo28475i()     // Catch:{ IOException -> 0x0a2e }
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8908j(r8)     // Catch:{ IOException -> 0x0a2e }
            java.lang.String r9 = r8.mo27685R1()     // Catch:{ IOException -> 0x0a2e }
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8904f(r9)     // Catch:{ IOException -> 0x0a2e }
            byte[] r9 = r8.mo27190h()     // Catch:{ IOException -> 0x0a2e }
            c.q.a.c.i.b.y9 r10 = r3.f10663b     // Catch:{ IOException -> 0x0a2e }
            c.q.a.c.i.b.aa r10 = r10.f11162g     // Catch:{ IOException -> 0x0a2e }
            m16229R(r10)     // Catch:{ IOException -> 0x0a2e }
            long r10 = r10.mo28090x(r9)     // Catch:{ IOException -> 0x0a2e }
            android.content.ContentValues r12 = new android.content.ContentValues     // Catch:{ IOException -> 0x0a2e }
            r12.<init>()     // Catch:{ IOException -> 0x0a2e }
            java.lang.String r13 = r8.mo27685R1()     // Catch:{ IOException -> 0x0a2e }
            r14 = r30
            r12.put(r14, r13)     // Catch:{ IOException -> 0x0a2e }
            java.lang.Long r13 = java.lang.Long.valueOf(r10)     // Catch:{ IOException -> 0x0a2e }
            r15 = r33
            r12.put(r15, r13)     // Catch:{ IOException -> 0x0a2e }
            java.lang.String r13 = "metadata"
            r12.put(r13, r9)     // Catch:{ IOException -> 0x0a2e }
            android.database.sqlite.SQLiteDatabase r9 = r3.mo28385P()     // Catch:{ SQLiteException -> 0x0a14 }
            java.lang.String r13 = "raw_events_metadata"
            r7 = 4
            r9.insertWithOnConflict(r13, r4, r12, r7)     // Catch:{ SQLiteException -> 0x0a14 }
            c.q.a.c.i.b.l r2 = r1.f11158c     // Catch:{ all -> 0x0a78 }
            m16229R(r2)     // Catch:{ all -> 0x0a78 }
            com.google.android.gms.measurement.internal.zzau r3 = r5.f10759f     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.s r7 = new c.q.a.c.i.b.s     // Catch:{ all -> 0x0a78 }
            r7.<init>(r3)     // Catch:{ all -> 0x0a78 }
        L_0x092f:
            boolean r3 = r7.hasNext()     // Catch:{ all -> 0x0a78 }
            if (r3 == 0) goto L_0x0941
            java.lang.String r3 = r7.next()     // Catch:{ all -> 0x0a78 }
            boolean r3 = r6.equals(r3)     // Catch:{ all -> 0x0a78 }
            if (r3 == 0) goto L_0x092f
        L_0x093f:
            r13 = 1
            goto L_0x0983
        L_0x0941:
            c.q.a.c.i.b.l4 r3 = r1.f11156a     // Catch:{ all -> 0x0a78 }
            m16229R(r3)     // Catch:{ all -> 0x0a78 }
            java.lang.String r6 = r5.f10754a     // Catch:{ all -> 0x0a78 }
            java.lang.String r7 = r5.f10755b     // Catch:{ all -> 0x0a78 }
            boolean r3 = r3.mo28419E(r6, r7)     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.l r6 = r1.f11158c     // Catch:{ all -> 0x0a78 }
            m16229R(r6)     // Catch:{ all -> 0x0a78 }
            long r17 = r34.mo28722F()     // Catch:{ all -> 0x0a78 }
            java.lang.String r7 = r5.f10754a     // Catch:{ all -> 0x0a78 }
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r16 = r6
            r19 = r7
            c.q.a.c.i.b.j r6 = r16.mo28389T(r17, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x0a78 }
            if (r3 == 0) goto L_0x0981
            long r6 = r6.f10579e     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.g r3 = r34.mo28732T()     // Catch:{ all -> 0x0a78 }
            java.lang.String r8 = r5.f10754a     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.t2 r9 = p040c.p200q.p201a.p264c.p340i.p342b.C5658u2.f10991o     // Catch:{ all -> 0x0a78 }
            int r3 = r3.mo28247o(r8, r9)     // Catch:{ all -> 0x0a78 }
            long r8 = (long) r3     // Catch:{ all -> 0x0a78 }
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 >= 0) goto L_0x0981
            goto L_0x093f
        L_0x0981:
            r13 = r31
        L_0x0983:
            r2.mo28029h()     // Catch:{ all -> 0x0a78 }
            r2.mo28475i()     // Catch:{ all -> 0x0a78 }
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8908j(r5)     // Catch:{ all -> 0x0a78 }
            java.lang.String r3 = r5.f10754a     // Catch:{ all -> 0x0a78 }
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8904f(r3)     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.y9 r3 = r2.f10663b     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.aa r3 = r3.f11162g     // Catch:{ all -> 0x0a78 }
            m16229R(r3)     // Catch:{ all -> 0x0a78 }
            c.q.a.c.g.i.i4 r3 = r3.mo28077B(r5)     // Catch:{ all -> 0x0a78 }
            byte[] r3 = r3.mo27190h()     // Catch:{ all -> 0x0a78 }
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ all -> 0x0a78 }
            r6.<init>()     // Catch:{ all -> 0x0a78 }
            java.lang.String r7 = r5.f10754a     // Catch:{ all -> 0x0a78 }
            r6.put(r14, r7)     // Catch:{ all -> 0x0a78 }
            java.lang.String r7 = "name"
            java.lang.String r8 = r5.f10755b     // Catch:{ all -> 0x0a78 }
            r6.put(r7, r8)     // Catch:{ all -> 0x0a78 }
            java.lang.String r7 = "timestamp"
            long r8 = r5.f10757d     // Catch:{ all -> 0x0a78 }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0a78 }
            r6.put(r7, r8)     // Catch:{ all -> 0x0a78 }
            java.lang.Long r7 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0a78 }
            r6.put(r15, r7)     // Catch:{ all -> 0x0a78 }
            java.lang.String r7 = "data"
            r6.put(r7, r3)     // Catch:{ all -> 0x0a78 }
            java.lang.String r3 = "realtime"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x0a78 }
            r6.put(r3, r7)     // Catch:{ all -> 0x0a78 }
            android.database.sqlite.SQLiteDatabase r3 = r2.mo28385P()     // Catch:{ SQLiteException -> 0x09fc }
            r7 = r32
            long r3 = r3.insert(r7, r4, r6)     // Catch:{ SQLiteException -> 0x09fc }
            r6 = -1
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x09f7
            c.q.a.c.i.b.t4 r3 = r2.f10699a     // Catch:{ SQLiteException -> 0x09fc }
            c.q.a.c.i.b.i3 r3 = r3.mo28487b()     // Catch:{ SQLiteException -> 0x09fc }
            c.q.a.c.i.b.g3 r3 = r3.mo28339r()     // Catch:{ SQLiteException -> 0x09fc }
            java.lang.String r4 = "Failed to insert raw event (got -1). appId"
            java.lang.String r6 = r5.f10754a     // Catch:{ SQLiteException -> 0x09fc }
            java.lang.Object r6 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r6)     // Catch:{ SQLiteException -> 0x09fc }
            r3.mo28260b(r4, r6)     // Catch:{ SQLiteException -> 0x09fc }
            goto L_0x0a45
        L_0x09f7:
            r3 = 0
            r1.f11170o = r3     // Catch:{ all -> 0x0a78 }
            goto L_0x0a45
        L_0x09fc:
            r0 = move-exception
            r3 = r0
            c.q.a.c.i.b.t4 r2 = r2.f10699a     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.i3 r2 = r2.mo28487b()     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.g3 r2 = r2.mo28339r()     // Catch:{ all -> 0x0a78 }
            java.lang.String r4 = "Error storing raw event. appId"
            java.lang.String r5 = r5.f10754a     // Catch:{ all -> 0x0a78 }
            java.lang.Object r5 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r5)     // Catch:{ all -> 0x0a78 }
            r2.mo28261c(r4, r5, r3)     // Catch:{ all -> 0x0a78 }
            goto L_0x0a45
        L_0x0a14:
            r0 = move-exception
            r4 = r0
            c.q.a.c.i.b.t4 r3 = r3.f10699a     // Catch:{ IOException -> 0x0a2e }
            c.q.a.c.i.b.i3 r3 = r3.mo28487b()     // Catch:{ IOException -> 0x0a2e }
            c.q.a.c.i.b.g3 r3 = r3.mo28339r()     // Catch:{ IOException -> 0x0a2e }
            java.lang.String r5 = "Error storing raw event metadata. appId"
            java.lang.String r6 = r8.mo27685R1()     // Catch:{ IOException -> 0x0a2e }
            java.lang.Object r6 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r6)     // Catch:{ IOException -> 0x0a2e }
            r3.mo28261c(r5, r6, r4)     // Catch:{ IOException -> 0x0a2e }
            throw r4     // Catch:{ IOException -> 0x0a2e }
        L_0x0a2e:
            r0 = move-exception
            r3 = r0
            c.q.a.c.i.b.i3 r4 = r34.mo28487b()     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.g3 r4 = r4.mo28339r()     // Catch:{ all -> 0x0a78 }
            java.lang.String r5 = "Data loss. Failed to insert raw event metadata. appId"
            java.lang.String r2 = r2.mo27609m0()     // Catch:{ all -> 0x0a78 }
            java.lang.Object r2 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r2)     // Catch:{ all -> 0x0a78 }
            r4.mo28261c(r5, r2, r3)     // Catch:{ all -> 0x0a78 }
        L_0x0a45:
            c.q.a.c.i.b.l r2 = r1.f11158c     // Catch:{ all -> 0x0a78 }
            m16229R(r2)     // Catch:{ all -> 0x0a78 }
            r2.mo28405o()     // Catch:{ all -> 0x0a78 }
            c.q.a.c.i.b.l r2 = r1.f11158c
            m16229R(r2)
            r2.mo28400f0()
            r34.mo28727M()
            c.q.a.c.i.b.i3 r2 = r34.mo28487b()
            c.q.a.c.i.b.g3 r2 = r2.mo28343v()
            long r3 = java.lang.System.nanoTime()
            long r3 = r3 - r28
            r5 = 500000(0x7a120, double:2.47033E-318)
            long r3 = r3 + r5
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "Background event processing time, ms"
            r2.mo28260b(r4, r3)
            return
        L_0x0a78:
            r0 = move-exception
            r2 = r0
            c.q.a.c.i.b.l r3 = r1.f11158c
            m16229R(r3)
            r3.mo28400f0()
            throw r2
        L_0x0a83:
            r1.mo28731S(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p340i.p342b.C5709y9.mo28720D(com.google.android.gms.measurement.internal.zzaw, com.google.android.gms.measurement.internal.zzq):void");
    }

    @WorkerThread
    /* renamed from: E */
    public final boolean mo28721E() {
        mo28486a().mo28029h();
        FileLock fileLock = this.f11177v;
        if (fileLock == null || !fileLock.isValid()) {
            this.f11158c.f10699a.mo28649z();
            try {
                FileChannel channel = new RandomAccessFile(new File(this.f11167l.mo28490f().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
                this.f11178w = channel;
                FileLock tryLock = channel.tryLock();
                this.f11177v = tryLock;
                if (tryLock != null) {
                    mo28487b().mo28343v().mo28259a("Storage concurrent access okay");
                    return true;
                }
                mo28487b().mo28339r().mo28259a("Storage concurrent data access panic");
                return false;
            } catch (FileNotFoundException e) {
                mo28487b().mo28339r().mo28260b("Failed to acquire storage lock", e);
                return false;
            } catch (IOException e2) {
                mo28487b().mo28339r().mo28260b("Failed to access storage lock file", e2);
                return false;
            } catch (OverlappingFileLockException e3) {
                mo28487b().mo28344w().mo28260b("Storage lock already acquired", e3);
                return false;
            }
        } else {
            mo28487b().mo28343v().mo28259a("Storage concurrent access okay");
            return true;
        }
    }

    /* renamed from: F */
    public final long mo28722F() {
        long a = mo28488c().mo20838a();
        C5640s8 s8Var = this.f11164i;
        s8Var.mo28475i();
        s8Var.mo28029h();
        long a2 = s8Var.f10863i.mo28615a();
        if (a2 == 0) {
            a2 = ((long) s8Var.f10699a.mo28629N().mo28312u().nextInt(86400000)) + 1;
            s8Var.f10863i.mo28616b(a2);
        }
        return ((((a + a2) / 1000) / 60) / 60) / 24;
    }

    @WorkerThread
    /* renamed from: I */
    public final zzq mo28723I(String str) {
        String str2 = str;
        C5547l lVar = this.f11158c;
        m16229R(lVar);
        C5458d6 R = lVar.mo28387R(str2);
        if (R == null || TextUtils.isEmpty(R.mo28188g0())) {
            mo28487b().mo28338q().mo28260b("No app data available; dropping", str2);
            return null;
        }
        Boolean J = mo28724J(R);
        if (J == null || J.booleanValue()) {
            String i0 = R.mo28192i0();
            String g0 = R.mo28188g0();
            long L = R.mo28160L();
            String f0 = R.mo28186f0();
            long W = R.mo28171W();
            long T = R.mo28168T();
            boolean J2 = R.mo28158J();
            String h0 = R.mo28190h0();
            R.mo28149A();
            C5458d6 d6Var = R;
            return new zzq(str, i0, g0, L, f0, W, T, (String) null, J2, false, h0, 0, 0, 0, d6Var.mo28157I(), false, d6Var.mo28178b0(), d6Var.mo28176a0(), d6Var.mo28169U(), d6Var.mo28179c(), (String) null, mo28733U(str).mo28324h(), "", (String) null);
        }
        mo28487b().mo28339r().mo28260b("App version does not match; dropping. appId", C5515i3.m15778z(str));
        return null;
    }

    @WorkerThread
    /* renamed from: J */
    public final Boolean mo28724J(C5458d6 d6Var) {
        try {
            if (d6Var.mo28160L() != -2147483648L) {
                if (d6Var.mo28160L() == ((long) C3573c.m9110a(this.f11167l.mo28490f()).mo20847e(d6Var.mo28182d0(), 0).versionCode)) {
                    return Boolean.TRUE;
                }
            } else {
                String str = C3573c.m9110a(this.f11167l.mo28490f()).mo20847e(d6Var.mo28182d0(), 0).versionName;
                String g0 = d6Var.mo28188g0();
                if (g0 != null && g0.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @WorkerThread
    /* renamed from: K */
    public final void mo28725K() {
        mo28486a().mo28029h();
        if (this.f11174s || this.f11175t || this.f11176u) {
            mo28487b().mo28343v().mo28262d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f11174s), Boolean.valueOf(this.f11175t), Boolean.valueOf(this.f11176u));
            return;
        }
        mo28487b().mo28343v().mo28259a("Stopping uploading service(s)");
        List<Runnable> list = this.f11171p;
        if (list != null) {
            for (Runnable run : list) {
                run.run();
            }
            List list2 = this.f11171p;
            C3495o.m8908j(list2);
            list2.clear();
        }
    }

    /* renamed from: L */
    public final void mo28726L(C5260s4 s4Var, long j, boolean z) {
        C5450ca caVar;
        String str = true != z ? "_lte" : "_se";
        C5547l lVar = this.f11158c;
        m16229R(lVar);
        C5450ca X = lVar.mo28392X(s4Var.mo27609m0(), str);
        if (X == null || X.f10376e == null) {
            caVar = new C5450ca(s4Var.mo27609m0(), DebugKt.DEBUG_PROPERTY_VALUE_AUTO, str, mo28488c().mo20838a(), Long.valueOf(j));
        } else {
            caVar = new C5450ca(s4Var.mo27609m0(), DebugKt.DEBUG_PROPERTY_VALUE_AUTO, str, mo28488c().mo20838a(), Long.valueOf(((Long) X.f10376e).longValue() + j));
        }
        C4996b5 G = C5012c5.m13888G();
        G.mo26979y(str);
        G.mo26980z(mo28488c().mo20838a());
        G.mo26978w(((Long) caVar.f10376e).longValue());
        C5012c5 c5Var = (C5012c5) G.mo27520l();
        int w = C5426aa.m15503w(s4Var, str);
        if (w >= 0) {
            s4Var.mo27606j0(w, c5Var);
        } else {
            s4Var.mo27561B0(c5Var);
        }
        if (j > 0) {
            C5547l lVar2 = this.f11158c;
            m16229R(lVar2);
            lVar2.mo28414x(caVar);
            mo28487b().mo28343v().mo28261c("Updated engagement user property. scope, value", true != z ? "lifetime" : "session-scoped", caVar.f10376e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0237  */
    @androidx.annotation.WorkerThread
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28727M() {
        /*
            r20 = this;
            r0 = r20
            c.q.a.c.i.b.q4 r1 = r20.mo28486a()
            r1.mo28029h()
            r20.mo28744g()
            long r1 = r0.f11170o
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x004e
            r1 = 3600000(0x36ee80, double:1.7786363E-317)
            c.q.a.c.d.n.d r5 = r20.mo28488c()
            long r5 = r5.mo20839b()
            long r7 = r0.f11170o
            long r5 = r5 - r7
            long r5 = java.lang.Math.abs(r5)
            long r1 = r1 - r5
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x004c
            c.q.a.c.i.b.i3 r3 = r20.mo28487b()
            c.q.a.c.i.b.g3 r3 = r3.mo28343v()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "Upload has been suspended. Will update scheduling later in approximately ms"
            r3.mo28260b(r2, r1)
            c.q.a.c.i.b.q3 r1 = r20.mo28737Y()
            r1.mo28531c()
            c.q.a.c.i.b.k9 r1 = r0.f11160e
            m16229R(r1)
            r1.mo28370m()
            return
        L_0x004c:
            r0.f11170o = r3
        L_0x004e:
            c.q.a.c.i.b.t4 r1 = r0.f11167l
            boolean r1 = r1.mo28645r()
            if (r1 == 0) goto L_0x0254
            boolean r1 = r20.mo28729O()
            if (r1 != 0) goto L_0x005e
            goto L_0x0254
        L_0x005e:
            c.q.a.c.d.n.d r1 = r20.mo28488c()
            long r1 = r1.mo20838a()
            r20.mo28732T()
            c.q.a.c.i.b.t2 r5 = p040c.p200q.p201a.p264c.p340i.p342b.C5658u2.f10937A
            r6 = 0
            java.lang.Object r5 = r5.mo28613a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r7 = r5.longValue()
            long r7 = java.lang.Math.max(r3, r7)
            c.q.a.c.i.b.l r5 = r0.f11158c
            m16229R(r5)
            boolean r5 = r5.mo28410t()
            r10 = 1
            if (r5 != 0) goto L_0x0093
            c.q.a.c.i.b.l r5 = r0.f11158c
            m16229R(r5)
            boolean r5 = r5.mo28409s()
            if (r5 == 0) goto L_0x0092
            goto L_0x0093
        L_0x0092:
            r10 = 0
        L_0x0093:
            if (r10 == 0) goto L_0x00d3
            c.q.a.c.i.b.g r5 = r20.mo28732T()
            java.lang.String r5 = r5.mo28253u()
            boolean r11 = android.text.TextUtils.isEmpty(r5)
            if (r11 != 0) goto L_0x00bf
            java.lang.String r11 = ".none."
            boolean r5 = r11.equals(r5)
            if (r5 != 0) goto L_0x00bf
            r20.mo28732T()
            c.q.a.c.i.b.t2 r5 = p040c.p200q.p201a.p264c.p340i.p342b.C5658u2.f11002v
            java.lang.Object r5 = r5.mo28613a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r11 = r5.longValue()
            long r11 = java.lang.Math.max(r3, r11)
            goto L_0x00e6
        L_0x00bf:
            r20.mo28732T()
            c.q.a.c.i.b.t2 r5 = p040c.p200q.p201a.p264c.p340i.p342b.C5658u2.f11001u
            java.lang.Object r5 = r5.mo28613a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r11 = r5.longValue()
            long r11 = java.lang.Math.max(r3, r11)
            goto L_0x00e6
        L_0x00d3:
            r20.mo28732T()
            c.q.a.c.i.b.t2 r5 = p040c.p200q.p201a.p264c.p340i.p342b.C5658u2.f11000t
            java.lang.Object r5 = r5.mo28613a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r11 = r5.longValue()
            long r11 = java.lang.Math.max(r3, r11)
        L_0x00e6:
            c.q.a.c.i.b.s8 r5 = r0.f11164i
            c.q.a.c.i.b.t3 r5 = r5.f10861g
            long r13 = r5.mo28615a()
            c.q.a.c.i.b.s8 r5 = r0.f11164i
            c.q.a.c.i.b.t3 r5 = r5.f10862h
            long r15 = r5.mo28615a()
            c.q.a.c.i.b.l r5 = r0.f11158c
            m16229R(r5)
            r17 = r10
            long r9 = r5.mo28382M()
            c.q.a.c.i.b.l r5 = r0.f11158c
            m16229R(r5)
            r18 = r7
            long r6 = r5.mo28383N()
            long r5 = java.lang.Math.max(r9, r6)
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L_0x0117
        L_0x0114:
            r7 = r3
            goto L_0x018e
        L_0x0117:
            long r5 = r5 - r1
            long r5 = java.lang.Math.abs(r5)
            long r5 = r1 - r5
            long r13 = r13 - r1
            long r7 = java.lang.Math.abs(r13)
            long r15 = r15 - r1
            long r9 = java.lang.Math.abs(r15)
            long r9 = r1 - r9
            long r1 = r1 - r7
            long r1 = java.lang.Math.max(r1, r9)
            long r7 = r5 + r18
            if (r17 == 0) goto L_0x013c
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 <= 0) goto L_0x013c
            long r7 = java.lang.Math.min(r5, r1)
            long r7 = r7 + r11
        L_0x013c:
            c.q.a.c.i.b.aa r13 = r0.f11162g
            m16229R(r13)
            boolean r13 = r13.mo28085M(r1, r11)
            if (r13 != 0) goto L_0x0149
            long r7 = r1 + r11
        L_0x0149:
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x018e
            int r1 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x018e
            r1 = 0
        L_0x0152:
            r20.mo28732T()
            r2 = 20
            c.q.a.c.i.b.t2 r5 = p040c.p200q.p201a.p264c.p340i.p342b.C5658u2.f10939C
            r6 = 0
            java.lang.Object r5 = r5.mo28613a(r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r11 = 0
            int r5 = java.lang.Math.max(r11, r5)
            int r2 = java.lang.Math.min(r2, r5)
            if (r1 >= r2) goto L_0x0114
            r20.mo28732T()
            c.q.a.c.i.b.t2 r2 = p040c.p200q.p201a.p264c.p340i.p342b.C5658u2.f10938B
            java.lang.Object r2 = r2.mo28613a(r6)
            java.lang.Long r2 = (java.lang.Long) r2
            long r5 = r2.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            r12 = 1
            long r12 = r12 << r1
            long r5 = r5 * r12
            long r7 = r7 + r5
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 > 0) goto L_0x018e
            int r1 = r1 + 1
            goto L_0x0152
        L_0x018e:
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0237
            c.q.a.c.i.b.o3 r1 = r0.f11157b
            m16229R(r1)
            boolean r1 = r1.mo28499m()
            if (r1 == 0) goto L_0x021a
            c.q.a.c.i.b.s8 r1 = r0.f11164i
            c.q.a.c.i.b.t3 r1 = r1.f10860f
            long r1 = r1.mo28615a()
            r20.mo28732T()
            c.q.a.c.i.b.t2 r5 = p040c.p200q.p201a.p264c.p340i.p342b.C5658u2.f10997r
            r6 = 0
            java.lang.Object r5 = r5.mo28613a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            c.q.a.c.i.b.aa r9 = r0.f11162g
            m16229R(r9)
            boolean r9 = r9.mo28085M(r1, r5)
            if (r9 != 0) goto L_0x01c9
            long r1 = r1 + r5
            long r7 = java.lang.Math.max(r7, r1)
        L_0x01c9:
            c.q.a.c.i.b.q3 r1 = r20.mo28737Y()
            r1.mo28531c()
            c.q.a.c.d.n.d r1 = r20.mo28488c()
            long r1 = r1.mo20838a()
            long r7 = r7 - r1
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x0200
            r20.mo28732T()
            c.q.a.c.i.b.t2 r1 = p040c.p200q.p201a.p264c.p340i.p342b.C5658u2.f11003w
            r2 = 0
            java.lang.Object r1 = r1.mo28613a(r2)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r7 = java.lang.Math.max(r3, r1)
            c.q.a.c.i.b.s8 r1 = r0.f11164i
            c.q.a.c.i.b.t3 r1 = r1.f10861g
            c.q.a.c.d.n.d r2 = r20.mo28488c()
            long r2 = r2.mo20838a()
            r1.mo28616b(r2)
        L_0x0200:
            c.q.a.c.i.b.i3 r1 = r20.mo28487b()
            c.q.a.c.i.b.g3 r1 = r1.mo28343v()
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            java.lang.String r3 = "Upload scheduled in approximately ms"
            r1.mo28260b(r3, r2)
            c.q.a.c.i.b.k9 r1 = r0.f11160e
            m16229R(r1)
            r1.mo28371n(r7)
            return
        L_0x021a:
            c.q.a.c.i.b.i3 r1 = r20.mo28487b()
            c.q.a.c.i.b.g3 r1 = r1.mo28343v()
            java.lang.String r2 = "No network"
            r1.mo28259a(r2)
            c.q.a.c.i.b.q3 r1 = r20.mo28737Y()
            r1.mo28530b()
            c.q.a.c.i.b.k9 r1 = r0.f11160e
            m16229R(r1)
            r1.mo28370m()
            return
        L_0x0237:
            c.q.a.c.i.b.i3 r1 = r20.mo28487b()
            c.q.a.c.i.b.g3 r1 = r1.mo28343v()
            java.lang.String r2 = "Next upload time is 0"
            r1.mo28259a(r2)
            c.q.a.c.i.b.q3 r1 = r20.mo28737Y()
            r1.mo28531c()
            c.q.a.c.i.b.k9 r1 = r0.f11160e
            m16229R(r1)
            r1.mo28370m()
            return
        L_0x0254:
            c.q.a.c.i.b.i3 r1 = r20.mo28487b()
            c.q.a.c.i.b.g3 r1 = r1.mo28343v()
            java.lang.String r2 = "Nothing to upload or uploading impossible"
            r1.mo28259a(r2)
            c.q.a.c.i.b.q3 r1 = r20.mo28737Y()
            r1.mo28531c()
            c.q.a.c.i.b.k9 r1 = r0.f11160e
            m16229R(r1)
            r1.mo28370m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p340i.p342b.C5709y9.mo28727M():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:381:0x0b7c, code lost:
        if (r10 > (p040c.p200q.p201a.p264c.p340i.p342b.C5487g.m15651i() + r8)) goto L_0x0b7e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x03a7 A[Catch:{ NumberFormatException -> 0x07e2, all -> 0x0d15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x046b A[Catch:{ NumberFormatException -> 0x07e2, all -> 0x0d15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x04c5 A[Catch:{ NumberFormatException -> 0x07e2, all -> 0x0d15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x081d A[Catch:{ NumberFormatException -> 0x07e2, all -> 0x0d15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x0866 A[Catch:{ NumberFormatException -> 0x07e2, all -> 0x0d15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x0889 A[Catch:{ NumberFormatException -> 0x07e2, all -> 0x0d15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x0900 A[Catch:{ NumberFormatException -> 0x07e2, all -> 0x0d15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x0902 A[Catch:{ NumberFormatException -> 0x07e2, all -> 0x0d15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x090a A[Catch:{ NumberFormatException -> 0x07e2, all -> 0x0d15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x0936 A[Catch:{ NumberFormatException -> 0x07e2, all -> 0x0d15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x0b6c A[Catch:{ NumberFormatException -> 0x07e2, all -> 0x0d15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:389:0x0bf3 A[Catch:{ NumberFormatException -> 0x07e2, all -> 0x0d15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:393:0x0c0f A[Catch:{ SQLiteException -> 0x0c27 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:420:0x0d03=Splitter:B:420:0x0d03, B:69:0x01e4=Splitter:B:69:0x01e4} */
    @androidx.annotation.WorkerThread
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo28728N(java.lang.String r44, long r45) {
        /*
            r43 = this;
            r1 = r43
            java.lang.String r2 = "_npa"
            java.lang.String r3 = "_ai"
            c.q.a.c.i.b.l r4 = r1.f11158c
            m16229R(r4)
            r4.mo28399e0()
            c.q.a.c.i.b.v9 r4 = new c.q.a.c.i.b.v9     // Catch:{ all -> 0x0d15 }
            r12 = 0
            r4.<init>(r1, r12)     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.l r5 = r1.f11158c     // Catch:{ all -> 0x0d15 }
            m16229R(r5)     // Catch:{ all -> 0x0d15 }
            r6 = 0
            long r9 = r1.f11181z     // Catch:{ all -> 0x0d15 }
            r7 = r45
            r11 = r4
            r5.mo28377G(r6, r7, r9, r11)     // Catch:{ all -> 0x0d15 }
            java.util.List r5 = r4.f11048c     // Catch:{ all -> 0x0d15 }
            if (r5 == 0) goto L_0x0d03
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x0d15 }
            if (r5 == 0) goto L_0x002e
            goto L_0x0d03
        L_0x002e:
            c.q.a.c.g.i.t4 r5 = r4.f11046a     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.q8 r5 = r5.mo27727z()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.s4 r5 = (p040c.p200q.p201a.p264c.p294g.p335i.C5260s4) r5     // Catch:{ all -> 0x0d15 }
            r5.mo27570G0()     // Catch:{ all -> 0x0d15 }
            r10 = r12
            r13 = r10
            r8 = 0
            r9 = 0
            r11 = -1
            r14 = -1
            r15 = 0
        L_0x0040:
            java.util.List r12 = r4.f11048c     // Catch:{ all -> 0x0d15 }
            int r12 = r12.size()     // Catch:{ all -> 0x0d15 }
            java.lang.String r6 = "_fr"
            java.lang.String r7 = "_et"
            r16 = r15
            java.lang.String r15 = "_e"
            r17 = r2
            r18 = r3
            if (r8 >= r12) goto L_0x0543
            java.util.List r3 = r4.f11048c     // Catch:{ all -> 0x0d15 }
            java.lang.Object r3 = r3.get(r8)     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.i4 r3 = (p040c.p200q.p201a.p264c.p294g.p335i.C5107i4) r3     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.q8 r3 = r3.mo27727z()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.h4 r3 = (p040c.p200q.p201a.p264c.p294g.p335i.C5091h4) r3     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.l4 r12 = r1.f11156a     // Catch:{ all -> 0x0d15 }
            m16229R(r12)     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.t4 r2 = r4.f11046a     // Catch:{ all -> 0x0d15 }
            java.lang.String r2 = r2.mo27685R1()     // Catch:{ all -> 0x0d15 }
            r22 = r9
            java.lang.String r9 = r3.mo27293K()     // Catch:{ all -> 0x0d15 }
            boolean r2 = r12.mo28420F(r2, r9)     // Catch:{ all -> 0x0d15 }
            java.lang.String r9 = "_err"
            if (r2 == 0) goto L_0x00f3
            c.q.a.c.i.b.i3 r2 = r43.mo28487b()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.g3 r2 = r2.mo28344w()     // Catch:{ all -> 0x0d15 }
            java.lang.String r6 = "Dropping blocked raw event. appId"
            c.q.a.c.g.i.t4 r7 = r4.f11046a     // Catch:{ all -> 0x0d15 }
            java.lang.String r7 = r7.mo27685R1()     // Catch:{ all -> 0x0d15 }
            java.lang.Object r7 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r7)     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.t4 r12 = r1.f11167l     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.d3 r12 = r12.mo28620D()     // Catch:{ all -> 0x0d15 }
            java.lang.String r15 = r3.mo27293K()     // Catch:{ all -> 0x0d15 }
            java.lang.String r12 = r12.mo28144d(r15)     // Catch:{ all -> 0x0d15 }
            r2.mo28261c(r6, r7, r12)     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.l4 r2 = r1.f11156a     // Catch:{ all -> 0x0d15 }
            m16229R(r2)     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.t4 r6 = r4.f11046a     // Catch:{ all -> 0x0d15 }
            java.lang.String r6 = r6.mo27685R1()     // Catch:{ all -> 0x0d15 }
            boolean r2 = r2.mo28418D(r6)     // Catch:{ all -> 0x0d15 }
            if (r2 != 0) goto L_0x00e8
            c.q.a.c.i.b.l4 r2 = r1.f11156a     // Catch:{ all -> 0x0d15 }
            m16229R(r2)     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.t4 r6 = r4.f11046a     // Catch:{ all -> 0x0d15 }
            java.lang.String r6 = r6.mo27685R1()     // Catch:{ all -> 0x0d15 }
            boolean r2 = r2.mo28421G(r6)     // Catch:{ all -> 0x0d15 }
            if (r2 == 0) goto L_0x00c3
            goto L_0x00e8
        L_0x00c3:
            java.lang.String r2 = r3.mo27293K()     // Catch:{ all -> 0x0d15 }
            boolean r2 = r9.equals(r2)     // Catch:{ all -> 0x0d15 }
            if (r2 != 0) goto L_0x00e8
            c.q.a.c.i.b.ga r23 = r43.mo28745g0()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.fa r2 = r1.f11155E     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.t4 r6 = r4.f11046a     // Catch:{ all -> 0x0d15 }
            java.lang.String r25 = r6.mo27685R1()     // Catch:{ all -> 0x0d15 }
            r26 = 11
            java.lang.String r27 = "_ev"
            java.lang.String r28 = r3.mo27293K()     // Catch:{ all -> 0x0d15 }
            r29 = 0
            r24 = r2
            r23.mo28271B(r24, r25, r26, r27, r28, r29)     // Catch:{ all -> 0x0d15 }
        L_0x00e8:
            r7 = r8
            r25 = r10
            r15 = r16
            r9 = r22
            r10 = r5
            r5 = -1
            goto L_0x0538
        L_0x00f3:
            java.lang.String r2 = r3.mo27293K()     // Catch:{ all -> 0x0d15 }
            java.lang.String r12 = p040c.p200q.p201a.p264c.p340i.p342b.C5625r5.m16063a(r18)     // Catch:{ all -> 0x0d15 }
            boolean r2 = r2.equals(r12)     // Catch:{ all -> 0x0d15 }
            if (r2 == 0) goto L_0x016d
            r2 = r18
            r3.mo27287E(r2)     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.i3 r12 = r43.mo28487b()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.g3 r12 = r12.mo28343v()     // Catch:{ all -> 0x0d15 }
            r18 = r2
            java.lang.String r2 = "Renaming ad_impression to _ai"
            r12.mo28259a(r2)     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.i3 r2 = r43.mo28487b()     // Catch:{ all -> 0x0d15 }
            java.lang.String r2 = r2.mo28336C()     // Catch:{ all -> 0x0d15 }
            r12 = 5
            boolean r2 = android.util.Log.isLoggable(r2, r12)     // Catch:{ all -> 0x0d15 }
            if (r2 == 0) goto L_0x016d
            r2 = 0
        L_0x0125:
            int r12 = r3.mo27295r()     // Catch:{ all -> 0x0d15 }
            if (r2 >= r12) goto L_0x016d
            java.lang.String r12 = "ad_platform"
            c.q.a.c.g.i.m4 r23 = r3.mo27292J(r2)     // Catch:{ all -> 0x0d15 }
            r24 = r8
            java.lang.String r8 = r23.mo27418J()     // Catch:{ all -> 0x0d15 }
            boolean r8 = r12.equals(r8)     // Catch:{ all -> 0x0d15 }
            if (r8 == 0) goto L_0x0168
            c.q.a.c.g.i.m4 r8 = r3.mo27292J(r2)     // Catch:{ all -> 0x0d15 }
            java.lang.String r8 = r8.mo27419K()     // Catch:{ all -> 0x0d15 }
            boolean r8 = r8.isEmpty()     // Catch:{ all -> 0x0d15 }
            if (r8 != 0) goto L_0x0168
            java.lang.String r8 = "admob"
            c.q.a.c.g.i.m4 r12 = r3.mo27292J(r2)     // Catch:{ all -> 0x0d15 }
            java.lang.String r12 = r12.mo27419K()     // Catch:{ all -> 0x0d15 }
            boolean r8 = r8.equalsIgnoreCase(r12)     // Catch:{ all -> 0x0d15 }
            if (r8 == 0) goto L_0x0168
            c.q.a.c.i.b.i3 r8 = r43.mo28487b()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.g3 r8 = r8.mo28345x()     // Catch:{ all -> 0x0d15 }
            java.lang.String r12 = "AdMob ad impression logged from app. Potentially duplicative."
            r8.mo28259a(r12)     // Catch:{ all -> 0x0d15 }
        L_0x0168:
            int r2 = r2 + 1
            r8 = r24
            goto L_0x0125
        L_0x016d:
            r24 = r8
            c.q.a.c.i.b.l4 r2 = r1.f11156a     // Catch:{ all -> 0x0d15 }
            m16229R(r2)     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.t4 r8 = r4.f11046a     // Catch:{ all -> 0x0d15 }
            java.lang.String r8 = r8.mo27685R1()     // Catch:{ all -> 0x0d15 }
            java.lang.String r12 = r3.mo27293K()     // Catch:{ all -> 0x0d15 }
            boolean r2 = r2.mo28419E(r8, r12)     // Catch:{ all -> 0x0d15 }
            java.lang.String r8 = "_c"
            if (r2 != 0) goto L_0x01db
            c.q.a.c.i.b.aa r12 = r1.f11162g     // Catch:{ all -> 0x0d15 }
            m16229R(r12)     // Catch:{ all -> 0x0d15 }
            java.lang.String r12 = r3.mo27293K()     // Catch:{ all -> 0x0d15 }
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8904f(r12)     // Catch:{ all -> 0x0d15 }
            r23 = r11
            int r11 = r12.hashCode()     // Catch:{ all -> 0x0d15 }
            r25 = r10
            r10 = 94660(0x171c4, float:1.32647E-40)
            if (r11 == r10) goto L_0x01be
            r10 = 95025(0x17331, float:1.33158E-40)
            if (r11 == r10) goto L_0x01b4
            r10 = 95027(0x17333, float:1.33161E-40)
            if (r11 == r10) goto L_0x01aa
            goto L_0x01c8
        L_0x01aa:
            java.lang.String r10 = "_ui"
            boolean r10 = r12.equals(r10)
            if (r10 == 0) goto L_0x01c8
            r10 = 1
            goto L_0x01c9
        L_0x01b4:
            java.lang.String r10 = "_ug"
            boolean r10 = r12.equals(r10)
            if (r10 == 0) goto L_0x01c8
            r10 = 2
            goto L_0x01c9
        L_0x01be:
            java.lang.String r10 = "_in"
            boolean r10 = r12.equals(r10)
            if (r10 == 0) goto L_0x01c8
            r10 = 0
            goto L_0x01c9
        L_0x01c8:
            r10 = -1
        L_0x01c9:
            if (r10 == 0) goto L_0x01df
            r11 = 1
            if (r10 == r11) goto L_0x01df
            r11 = 2
            if (r10 == r11) goto L_0x01df
            r27 = r5
            r26 = r7
            r7 = r13
            r19 = r14
            r2 = 0
            goto L_0x03a5
        L_0x01db:
            r25 = r10
            r23 = r11
        L_0x01df:
            r26 = r7
            r10 = 0
            r11 = 0
            r12 = 0
        L_0x01e4:
            int r7 = r3.mo27295r()     // Catch:{ all -> 0x0d15 }
            r27 = r5
            java.lang.String r5 = "_r"
            if (r10 >= r7) goto L_0x024b
            c.q.a.c.g.i.m4 r7 = r3.mo27292J(r10)     // Catch:{ all -> 0x0d15 }
            java.lang.String r7 = r7.mo27418J()     // Catch:{ all -> 0x0d15 }
            boolean r7 = r8.equals(r7)     // Catch:{ all -> 0x0d15 }
            if (r7 == 0) goto L_0x0219
            c.q.a.c.g.i.m4 r5 = r3.mo27292J(r10)     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.q8 r5 = r5.mo27727z()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.l4 r5 = (p040c.p200q.p201a.p264c.p294g.p335i.C5155l4) r5     // Catch:{ all -> 0x0d15 }
            r7 = r13
            r19 = r14
            r13 = 1
            r5.mo27384E(r13)     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.t8 r5 = r5.mo27520l()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.m4 r5 = (p040c.p200q.p201a.p264c.p294g.p335i.C5170m4) r5     // Catch:{ all -> 0x0d15 }
            r3.mo27289G(r10, r5)     // Catch:{ all -> 0x0d15 }
            r11 = 1
            goto L_0x0243
        L_0x0219:
            r7 = r13
            r19 = r14
            c.q.a.c.g.i.m4 r13 = r3.mo27292J(r10)     // Catch:{ all -> 0x0d15 }
            java.lang.String r13 = r13.mo27418J()     // Catch:{ all -> 0x0d15 }
            boolean r5 = r5.equals(r13)     // Catch:{ all -> 0x0d15 }
            if (r5 == 0) goto L_0x0243
            c.q.a.c.g.i.m4 r5 = r3.mo27292J(r10)     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.q8 r5 = r5.mo27727z()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.l4 r5 = (p040c.p200q.p201a.p264c.p294g.p335i.C5155l4) r5     // Catch:{ all -> 0x0d15 }
            r12 = 1
            r5.mo27384E(r12)     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.t8 r5 = r5.mo27520l()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.m4 r5 = (p040c.p200q.p201a.p264c.p294g.p335i.C5170m4) r5     // Catch:{ all -> 0x0d15 }
            r3.mo27289G(r10, r5)     // Catch:{ all -> 0x0d15 }
            r12 = 1
        L_0x0243:
            int r10 = r10 + 1
            r13 = r7
            r14 = r19
            r5 = r27
            goto L_0x01e4
        L_0x024b:
            r7 = r13
            r19 = r14
            if (r11 != 0) goto L_0x027c
            if (r2 == 0) goto L_0x027c
            c.q.a.c.i.b.i3 r10 = r43.mo28487b()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.g3 r10 = r10.mo28343v()     // Catch:{ all -> 0x0d15 }
            java.lang.String r11 = "Marking event as conversion"
            c.q.a.c.i.b.t4 r13 = r1.f11167l     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.d3 r13 = r13.mo28620D()     // Catch:{ all -> 0x0d15 }
            java.lang.String r14 = r3.mo27293K()     // Catch:{ all -> 0x0d15 }
            java.lang.String r13 = r13.mo28144d(r14)     // Catch:{ all -> 0x0d15 }
            r10.mo28260b(r11, r13)     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.l4 r10 = p040c.p200q.p201a.p264c.p294g.p335i.C5170m4.m14462H()     // Catch:{ all -> 0x0d15 }
            r10.mo27385F(r8)     // Catch:{ all -> 0x0d15 }
            r13 = 1
            r10.mo27384E(r13)     // Catch:{ all -> 0x0d15 }
            r3.mo27299w(r10)     // Catch:{ all -> 0x0d15 }
        L_0x027c:
            if (r12 != 0) goto L_0x02a8
            c.q.a.c.i.b.i3 r10 = r43.mo28487b()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.g3 r10 = r10.mo28343v()     // Catch:{ all -> 0x0d15 }
            java.lang.String r11 = "Marking event as real-time"
            c.q.a.c.i.b.t4 r12 = r1.f11167l     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.d3 r12 = r12.mo28620D()     // Catch:{ all -> 0x0d15 }
            java.lang.String r13 = r3.mo27293K()     // Catch:{ all -> 0x0d15 }
            java.lang.String r12 = r12.mo28144d(r13)     // Catch:{ all -> 0x0d15 }
            r10.mo28260b(r11, r12)     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.l4 r10 = p040c.p200q.p201a.p264c.p294g.p335i.C5170m4.m14462H()     // Catch:{ all -> 0x0d15 }
            r10.mo27385F(r5)     // Catch:{ all -> 0x0d15 }
            r11 = 1
            r10.mo27384E(r11)     // Catch:{ all -> 0x0d15 }
            r3.mo27299w(r10)     // Catch:{ all -> 0x0d15 }
        L_0x02a8:
            c.q.a.c.i.b.l r10 = r1.f11158c     // Catch:{ all -> 0x0d15 }
            m16229R(r10)     // Catch:{ all -> 0x0d15 }
            long r29 = r43.mo28722F()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.t4 r11 = r4.f11046a     // Catch:{ all -> 0x0d15 }
            java.lang.String r31 = r11.mo27685R1()     // Catch:{ all -> 0x0d15 }
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 1
            r28 = r10
            c.q.a.c.i.b.j r10 = r28.mo28389T(r29, r31, r32, r33, r34, r35, r36)     // Catch:{ all -> 0x0d15 }
            long r10 = r10.f10579e     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.g r12 = r43.mo28732T()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.t4 r13 = r4.f11046a     // Catch:{ all -> 0x0d15 }
            java.lang.String r13 = r13.mo27685R1()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.t2 r14 = p040c.p200q.p201a.p264c.p340i.p342b.C5658u2.f10991o     // Catch:{ all -> 0x0d15 }
            int r12 = r12.mo28247o(r13, r14)     // Catch:{ all -> 0x0d15 }
            long r12 = (long) r12     // Catch:{ all -> 0x0d15 }
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 <= 0) goto L_0x02e2
            m16227H(r3, r5)     // Catch:{ all -> 0x0d15 }
            goto L_0x02e4
        L_0x02e2:
            r16 = 1
        L_0x02e4:
            java.lang.String r5 = r3.mo27293K()     // Catch:{ all -> 0x0d15 }
            boolean r5 = p040c.p200q.p201a.p264c.p340i.p342b.C5498ga.m15686X(r5)     // Catch:{ all -> 0x0d15 }
            if (r5 == 0) goto L_0x03a5
            if (r2 == 0) goto L_0x03a5
            c.q.a.c.i.b.l r5 = r1.f11158c     // Catch:{ all -> 0x0d15 }
            m16229R(r5)     // Catch:{ all -> 0x0d15 }
            long r29 = r43.mo28722F()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.t4 r10 = r4.f11046a     // Catch:{ all -> 0x0d15 }
            java.lang.String r31 = r10.mo27685R1()     // Catch:{ all -> 0x0d15 }
            r32 = 0
            r33 = 0
            r34 = 1
            r35 = 0
            r36 = 0
            r28 = r5
            c.q.a.c.i.b.j r5 = r28.mo28389T(r29, r31, r32, r33, r34, r35, r36)     // Catch:{ all -> 0x0d15 }
            long r10 = r5.f10577c     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.g r5 = r43.mo28732T()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.t4 r12 = r4.f11046a     // Catch:{ all -> 0x0d15 }
            java.lang.String r12 = r12.mo27685R1()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.t2 r13 = p040c.p200q.p201a.p264c.p340i.p342b.C5658u2.f10989n     // Catch:{ all -> 0x0d15 }
            int r5 = r5.mo28247o(r12, r13)     // Catch:{ all -> 0x0d15 }
            long r12 = (long) r5     // Catch:{ all -> 0x0d15 }
            int r5 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r5 <= 0) goto L_0x03a5
            c.q.a.c.i.b.i3 r5 = r43.mo28487b()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.g3 r5 = r5.mo28344w()     // Catch:{ all -> 0x0d15 }
            java.lang.String r10 = "Too many conversions. Not logging as conversion. appId"
            c.q.a.c.g.i.t4 r11 = r4.f11046a     // Catch:{ all -> 0x0d15 }
            java.lang.String r11 = r11.mo27685R1()     // Catch:{ all -> 0x0d15 }
            java.lang.Object r11 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r11)     // Catch:{ all -> 0x0d15 }
            r5.mo28260b(r10, r11)     // Catch:{ all -> 0x0d15 }
            r5 = 0
            r10 = 0
            r11 = 0
            r12 = -1
        L_0x0341:
            int r13 = r3.mo27295r()     // Catch:{ all -> 0x0d15 }
            if (r10 >= r13) goto L_0x036b
            c.q.a.c.g.i.m4 r13 = r3.mo27292J(r10)     // Catch:{ all -> 0x0d15 }
            java.lang.String r14 = r13.mo27418J()     // Catch:{ all -> 0x0d15 }
            boolean r14 = r8.equals(r14)     // Catch:{ all -> 0x0d15 }
            if (r14 == 0) goto L_0x035d
            c.q.a.c.g.i.q8 r5 = r13.mo27727z()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.l4 r5 = (p040c.p200q.p201a.p264c.p294g.p335i.C5155l4) r5     // Catch:{ all -> 0x0d15 }
            r12 = r10
            goto L_0x0368
        L_0x035d:
            java.lang.String r13 = r13.mo27418J()     // Catch:{ all -> 0x0d15 }
            boolean r13 = r9.equals(r13)     // Catch:{ all -> 0x0d15 }
            if (r13 == 0) goto L_0x0368
            r11 = 1
        L_0x0368:
            int r10 = r10 + 1
            goto L_0x0341
        L_0x036b:
            if (r11 == 0) goto L_0x0374
            if (r5 == 0) goto L_0x0373
            r3.mo27286C(r12)     // Catch:{ all -> 0x0d15 }
            goto L_0x03a5
        L_0x0373:
            r5 = 0
        L_0x0374:
            if (r5 == 0) goto L_0x038e
            c.q.a.c.g.i.q8 r5 = r5.clone()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.l4 r5 = (p040c.p200q.p201a.p264c.p294g.p335i.C5155l4) r5     // Catch:{ all -> 0x0d15 }
            r5.mo27385F(r9)     // Catch:{ all -> 0x0d15 }
            r9 = 10
            r5.mo27384E(r9)     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.t8 r5 = r5.mo27520l()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.m4 r5 = (p040c.p200q.p201a.p264c.p294g.p335i.C5170m4) r5     // Catch:{ all -> 0x0d15 }
            r3.mo27289G(r12, r5)     // Catch:{ all -> 0x0d15 }
            goto L_0x03a5
        L_0x038e:
            c.q.a.c.i.b.i3 r5 = r43.mo28487b()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.g3 r5 = r5.mo28339r()     // Catch:{ all -> 0x0d15 }
            java.lang.String r9 = "Did not find conversion parameter. appId"
            c.q.a.c.g.i.t4 r10 = r4.f11046a     // Catch:{ all -> 0x0d15 }
            java.lang.String r10 = r10.mo27685R1()     // Catch:{ all -> 0x0d15 }
            java.lang.Object r10 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r10)     // Catch:{ all -> 0x0d15 }
            r5.mo28260b(r9, r10)     // Catch:{ all -> 0x0d15 }
        L_0x03a5:
            if (r2 == 0) goto L_0x045e
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0d15 }
            java.util.List r5 = r3.mo27294L()     // Catch:{ all -> 0x0d15 }
            r2.<init>(r5)     // Catch:{ all -> 0x0d15 }
            r5 = 0
            r9 = -1
            r10 = -1
        L_0x03b3:
            int r11 = r2.size()     // Catch:{ all -> 0x0d15 }
            java.lang.String r12 = "currency"
            java.lang.String r13 = "value"
            if (r5 >= r11) goto L_0x03e3
            java.lang.Object r11 = r2.get(r5)     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.m4 r11 = (p040c.p200q.p201a.p264c.p294g.p335i.C5170m4) r11     // Catch:{ all -> 0x0d15 }
            java.lang.String r11 = r11.mo27418J()     // Catch:{ all -> 0x0d15 }
            boolean r11 = r13.equals(r11)     // Catch:{ all -> 0x0d15 }
            if (r11 == 0) goto L_0x03cf
            r9 = r5
            goto L_0x03e0
        L_0x03cf:
            java.lang.Object r11 = r2.get(r5)     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.m4 r11 = (p040c.p200q.p201a.p264c.p294g.p335i.C5170m4) r11     // Catch:{ all -> 0x0d15 }
            java.lang.String r11 = r11.mo27418J()     // Catch:{ all -> 0x0d15 }
            boolean r11 = r12.equals(r11)     // Catch:{ all -> 0x0d15 }
            if (r11 == 0) goto L_0x03e0
            r10 = r5
        L_0x03e0:
            int r5 = r5 + 1
            goto L_0x03b3
        L_0x03e3:
            r5 = -1
            if (r9 != r5) goto L_0x03e8
            goto L_0x045f
        L_0x03e8:
            java.lang.Object r5 = r2.get(r9)     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.m4 r5 = (p040c.p200q.p201a.p264c.p294g.p335i.C5170m4) r5     // Catch:{ all -> 0x0d15 }
            boolean r5 = r5.mo27423Z()     // Catch:{ all -> 0x0d15 }
            if (r5 != 0) goto L_0x0419
            java.lang.Object r5 = r2.get(r9)     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.m4 r5 = (p040c.p200q.p201a.p264c.p294g.p335i.C5170m4) r5     // Catch:{ all -> 0x0d15 }
            boolean r5 = r5.mo27421X()     // Catch:{ all -> 0x0d15 }
            if (r5 != 0) goto L_0x0419
            c.q.a.c.i.b.i3 r2 = r43.mo28487b()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.g3 r2 = r2.mo28345x()     // Catch:{ all -> 0x0d15 }
            java.lang.String r5 = "Value must be specified with a numeric type."
            r2.mo28259a(r5)     // Catch:{ all -> 0x0d15 }
            r3.mo27286C(r9)     // Catch:{ all -> 0x0d15 }
            m16227H(r3, r8)     // Catch:{ all -> 0x0d15 }
            r2 = 18
            m16226G(r3, r2, r13)     // Catch:{ all -> 0x0d15 }
            goto L_0x045e
        L_0x0419:
            r5 = -1
            if (r10 != r5) goto L_0x041d
            goto L_0x0445
        L_0x041d:
            java.lang.Object r2 = r2.get(r10)     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.m4 r2 = (p040c.p200q.p201a.p264c.p294g.p335i.C5170m4) r2     // Catch:{ all -> 0x0d15 }
            java.lang.String r2 = r2.mo27419K()     // Catch:{ all -> 0x0d15 }
            int r10 = r2.length()     // Catch:{ all -> 0x0d15 }
            r11 = 3
            if (r10 != r11) goto L_0x0445
            r10 = 0
        L_0x042f:
            int r11 = r2.length()     // Catch:{ all -> 0x0d15 }
            if (r10 >= r11) goto L_0x045f
            int r11 = r2.codePointAt(r10)     // Catch:{ all -> 0x0d15 }
            boolean r13 = java.lang.Character.isLetter(r11)     // Catch:{ all -> 0x0d15 }
            if (r13 == 0) goto L_0x0445
            int r11 = java.lang.Character.charCount(r11)     // Catch:{ all -> 0x0d15 }
            int r10 = r10 + r11
            goto L_0x042f
        L_0x0445:
            c.q.a.c.i.b.i3 r2 = r43.mo28487b()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.g3 r2 = r2.mo28345x()     // Catch:{ all -> 0x0d15 }
            java.lang.String r10 = "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."
            r2.mo28259a(r10)     // Catch:{ all -> 0x0d15 }
            r3.mo27286C(r9)     // Catch:{ all -> 0x0d15 }
            m16227H(r3, r8)     // Catch:{ all -> 0x0d15 }
            r2 = 19
            m16226G(r3, r2, r12)     // Catch:{ all -> 0x0d15 }
            goto L_0x045f
        L_0x045e:
            r5 = -1
        L_0x045f:
            java.lang.String r2 = r3.mo27293K()     // Catch:{ all -> 0x0d15 }
            boolean r2 = r15.equals(r2)     // Catch:{ all -> 0x0d15 }
            r8 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto L_0x04c5
            c.q.a.c.i.b.aa r2 = r1.f11162g     // Catch:{ all -> 0x0d15 }
            m16229R(r2)     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.t8 r2 = r3.mo27520l()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.i4 r2 = (p040c.p200q.p201a.p264c.p294g.p335i.C5107i4) r2     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.m4 r2 = p040c.p200q.p201a.p264c.p340i.p342b.C5426aa.m15496n(r2, r6)     // Catch:{ all -> 0x0d15 }
            if (r2 != 0) goto L_0x04c0
            if (r7 == 0) goto L_0x04b4
            long r10 = r7.mo27297t()     // Catch:{ all -> 0x0d15 }
            long r12 = r3.mo27297t()     // Catch:{ all -> 0x0d15 }
            long r10 = r10 - r12
            long r10 = java.lang.Math.abs(r10)     // Catch:{ all -> 0x0d15 }
            int r2 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r2 > 0) goto L_0x04b4
            c.q.a.c.g.i.q8 r2 = r7.clone()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.h4 r2 = (p040c.p200q.p201a.p264c.p294g.p335i.C5091h4) r2     // Catch:{ all -> 0x0d15 }
            boolean r6 = r1.mo28730P(r3, r2)     // Catch:{ all -> 0x0d15 }
            if (r6 == 0) goto L_0x04a7
            r6 = r19
            r10 = r27
            r10.mo27586P(r6, r2)     // Catch:{ all -> 0x0d15 }
            r11 = r23
            r2 = 0
            r13 = 0
            goto L_0x04af
        L_0x04a7:
            r6 = r19
            r10 = r27
            r2 = r3
            r13 = r7
            r11 = r22
        L_0x04af:
            r25 = r2
            r14 = r6
            goto L_0x0524
        L_0x04b4:
            r6 = r19
            r10 = r27
            r25 = r3
            r14 = r6
            r13 = r7
            r11 = r22
            goto L_0x0524
        L_0x04c0:
            r6 = r19
            r10 = r27
            goto L_0x051f
        L_0x04c5:
            r6 = r19
            r10 = r27
            java.lang.String r2 = "_vs"
            java.lang.String r11 = r3.mo27293K()     // Catch:{ all -> 0x0d15 }
            boolean r2 = r2.equals(r11)     // Catch:{ all -> 0x0d15 }
            if (r2 == 0) goto L_0x051f
            c.q.a.c.i.b.aa r2 = r1.f11162g     // Catch:{ all -> 0x0d15 }
            m16229R(r2)     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.t8 r2 = r3.mo27520l()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.i4 r2 = (p040c.p200q.p201a.p264c.p294g.p335i.C5107i4) r2     // Catch:{ all -> 0x0d15 }
            r11 = r26
            c.q.a.c.g.i.m4 r2 = p040c.p200q.p201a.p264c.p340i.p342b.C5426aa.m15496n(r2, r11)     // Catch:{ all -> 0x0d15 }
            if (r2 != 0) goto L_0x051f
            if (r25 == 0) goto L_0x0518
            long r11 = r25.mo27297t()     // Catch:{ all -> 0x0d15 }
            long r13 = r3.mo27297t()     // Catch:{ all -> 0x0d15 }
            long r11 = r11 - r13
            long r11 = java.lang.Math.abs(r11)     // Catch:{ all -> 0x0d15 }
            int r2 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r2 > 0) goto L_0x0518
            c.q.a.c.g.i.q8 r2 = r25.clone()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.h4 r2 = (p040c.p200q.p201a.p264c.p294g.p335i.C5091h4) r2     // Catch:{ all -> 0x0d15 }
            boolean r7 = r1.mo28730P(r2, r3)     // Catch:{ all -> 0x0d15 }
            if (r7 == 0) goto L_0x0511
            r8 = r23
            r10.mo27586P(r8, r2)     // Catch:{ all -> 0x0d15 }
            r14 = r6
            r2 = 0
            r25 = 0
            goto L_0x0516
        L_0x0511:
            r8 = r23
            r2 = r3
            r14 = r22
        L_0x0516:
            r13 = r2
            goto L_0x0523
        L_0x0518:
            r8 = r23
            r13 = r3
            r11 = r8
            r14 = r22
            goto L_0x0524
        L_0x051f:
            r8 = r23
            r14 = r6
            r13 = r7
        L_0x0523:
            r11 = r8
        L_0x0524:
            java.util.List r2 = r4.f11048c     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.t8 r6 = r3.mo27520l()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.i4 r6 = (p040c.p200q.p201a.p264c.p294g.p335i.C5107i4) r6     // Catch:{ all -> 0x0d15 }
            r7 = r24
            r2.set(r7, r6)     // Catch:{ all -> 0x0d15 }
            int r9 = r22 + 1
            r10.mo27629z0(r3)     // Catch:{ all -> 0x0d15 }
            r15 = r16
        L_0x0538:
            int r8 = r7 + 1
            r5 = r10
            r2 = r17
            r3 = r18
            r10 = r25
            goto L_0x0040
        L_0x0543:
            r10 = r5
            r11 = r7
            r22 = r9
            r2 = 0
            r7 = r2
            r5 = 0
        L_0x054b:
            if (r5 >= r9) goto L_0x059b
            c.q.a.c.g.i.i4 r12 = r10.mo27620u0(r5)     // Catch:{ all -> 0x0d15 }
            java.lang.String r13 = r12.mo27327K()     // Catch:{ all -> 0x0d15 }
            boolean r13 = r15.equals(r13)     // Catch:{ all -> 0x0d15 }
            if (r13 == 0) goto L_0x056e
            c.q.a.c.i.b.aa r13 = r1.f11162g     // Catch:{ all -> 0x0d15 }
            m16229R(r13)     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.m4 r13 = p040c.p200q.p201a.p264c.p340i.p342b.C5426aa.m15496n(r12, r6)     // Catch:{ all -> 0x0d15 }
            if (r13 == 0) goto L_0x056e
            r10.mo27614r(r5)     // Catch:{ all -> 0x0d15 }
            int r9 = r9 + -1
            int r5 = r5 + -1
            goto L_0x0598
        L_0x056e:
            c.q.a.c.i.b.aa r13 = r1.f11162g     // Catch:{ all -> 0x0d15 }
            m16229R(r13)     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.m4 r12 = p040c.p200q.p201a.p264c.p340i.p342b.C5426aa.m15496n(r12, r11)     // Catch:{ all -> 0x0d15 }
            if (r12 == 0) goto L_0x0598
            boolean r13 = r12.mo27423Z()     // Catch:{ all -> 0x0d15 }
            if (r13 == 0) goto L_0x0588
            long r12 = r12.mo27417G()     // Catch:{ all -> 0x0d15 }
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0d15 }
            goto L_0x0589
        L_0x0588:
            r12 = 0
        L_0x0589:
            if (r12 == 0) goto L_0x0598
            long r13 = r12.longValue()     // Catch:{ all -> 0x0d15 }
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 <= 0) goto L_0x0598
            long r12 = r12.longValue()     // Catch:{ all -> 0x0d15 }
            long r7 = r7 + r12
        L_0x0598:
            r12 = 1
            int r5 = r5 + r12
            goto L_0x054b
        L_0x059b:
            r5 = 0
            r1.mo28726L(r10, r7, r5)     // Catch:{ all -> 0x0d15 }
            java.util.List r5 = r10.mo27612p0()     // Catch:{ all -> 0x0d15 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0d15 }
        L_0x05a7:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0d15 }
            java.lang.String r9 = "_se"
            if (r6 == 0) goto L_0x05cd
            java.lang.String r6 = "_s"
            java.lang.Object r11 = r5.next()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.i4 r11 = (p040c.p200q.p201a.p264c.p294g.p335i.C5107i4) r11     // Catch:{ all -> 0x0d15 }
            java.lang.String r11 = r11.mo27327K()     // Catch:{ all -> 0x0d15 }
            boolean r6 = r6.equals(r11)     // Catch:{ all -> 0x0d15 }
            if (r6 == 0) goto L_0x05a7
            c.q.a.c.i.b.l r5 = r1.f11158c     // Catch:{ all -> 0x0d15 }
            m16229R(r5)     // Catch:{ all -> 0x0d15 }
            java.lang.String r6 = r10.mo27609m0()     // Catch:{ all -> 0x0d15 }
            r5.mo28403m(r6, r9)     // Catch:{ all -> 0x0d15 }
        L_0x05cd:
            java.lang.String r5 = "_sid"
            int r5 = p040c.p200q.p201a.p264c.p340i.p342b.C5426aa.m15503w(r10, r5)     // Catch:{ all -> 0x0d15 }
            if (r5 < 0) goto L_0x05da
            r5 = 1
            r1.mo28726L(r10, r7, r5)     // Catch:{ all -> 0x0d15 }
            goto L_0x05fa
        L_0x05da:
            int r5 = p040c.p200q.p201a.p264c.p340i.p342b.C5426aa.m15503w(r10, r9)     // Catch:{ all -> 0x0d15 }
            if (r5 < 0) goto L_0x05fa
            r10.mo27616s(r5)     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.i3 r5 = r43.mo28487b()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.g3 r5 = r5.mo28339r()     // Catch:{ all -> 0x0d15 }
            java.lang.String r6 = "Session engagement user property is in the bundle without session ID. appId"
            c.q.a.c.g.i.t4 r7 = r4.f11046a     // Catch:{ all -> 0x0d15 }
            java.lang.String r7 = r7.mo27685R1()     // Catch:{ all -> 0x0d15 }
            java.lang.Object r7 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r7)     // Catch:{ all -> 0x0d15 }
            r5.mo28260b(r6, r7)     // Catch:{ all -> 0x0d15 }
        L_0x05fa:
            c.q.a.c.i.b.aa r5 = r1.f11162g     // Catch:{ all -> 0x0d15 }
            m16229R(r5)     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.t4 r6 = r5.f10699a     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.i3 r6 = r6.mo28487b()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.g3 r6 = r6.mo28343v()     // Catch:{ all -> 0x0d15 }
            java.lang.String r7 = "Checking account type status for ad personalization signals"
            r6.mo28259a(r7)     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.y9 r6 = r5.f10663b     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.l4 r6 = r6.f11156a     // Catch:{ all -> 0x0d15 }
            m16229R(r6)     // Catch:{ all -> 0x0d15 }
            java.lang.String r7 = r10.mo27609m0()     // Catch:{ all -> 0x0d15 }
            boolean r6 = r6.mo28416B(r7)     // Catch:{ all -> 0x0d15 }
            if (r6 == 0) goto L_0x0691
            c.q.a.c.i.b.y9 r6 = r5.f10663b     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.l r6 = r6.f11158c     // Catch:{ all -> 0x0d15 }
            m16229R(r6)     // Catch:{ all -> 0x0d15 }
            java.lang.String r7 = r10.mo27609m0()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.d6 r6 = r6.mo28387R(r7)     // Catch:{ all -> 0x0d15 }
            if (r6 == 0) goto L_0x0691
            boolean r6 = r6.mo28157I()     // Catch:{ all -> 0x0d15 }
            if (r6 == 0) goto L_0x0691
            c.q.a.c.i.b.t4 r6 = r5.f10699a     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.p r6 = r6.mo28617A()     // Catch:{ all -> 0x0d15 }
            boolean r6 = r6.mo28515s()     // Catch:{ all -> 0x0d15 }
            if (r6 == 0) goto L_0x0691
            c.q.a.c.i.b.t4 r6 = r5.f10699a     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.i3 r6 = r6.mo28487b()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.g3 r6 = r6.mo28338q()     // Catch:{ all -> 0x0d15 }
            java.lang.String r7 = "Turning off ad personalization due to account type"
            r6.mo28259a(r7)     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.b5 r6 = p040c.p200q.p201a.p264c.p294g.p335i.C5012c5.m13888G()     // Catch:{ all -> 0x0d15 }
            r7 = r17
            r6.mo26979y(r7)     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.t4 r5 = r5.f10699a     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.p r5 = r5.mo28617A()     // Catch:{ all -> 0x0d15 }
            long r8 = r5.mo28511o()     // Catch:{ all -> 0x0d15 }
            r6.mo26980z(r8)     // Catch:{ all -> 0x0d15 }
            r8 = 1
            r6.mo26978w(r8)     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.t8 r5 = r6.mo27520l()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.c5 r5 = (p040c.p200q.p201a.p264c.p294g.p335i.C5012c5) r5     // Catch:{ all -> 0x0d15 }
            r6 = 0
        L_0x0673:
            int r8 = r10.mo27615r0()     // Catch:{ all -> 0x0d15 }
            if (r6 >= r8) goto L_0x068e
            c.q.a.c.g.i.c5 r8 = r10.mo27608l0(r6)     // Catch:{ all -> 0x0d15 }
            java.lang.String r8 = r8.mo27090I()     // Catch:{ all -> 0x0d15 }
            boolean r8 = r7.equals(r8)     // Catch:{ all -> 0x0d15 }
            if (r8 == 0) goto L_0x068b
            r10.mo27606j0(r6, r5)     // Catch:{ all -> 0x0d15 }
            goto L_0x0691
        L_0x068b:
            int r6 = r6 + 1
            goto L_0x0673
        L_0x068e:
            r10.mo27561B0(r5)     // Catch:{ all -> 0x0d15 }
        L_0x0691:
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10.mo27602f0(r5)     // Catch:{ all -> 0x0d15 }
            r5 = -9223372036854775808
            r10.mo27581M(r5)     // Catch:{ all -> 0x0d15 }
            r5 = 0
        L_0x069f:
            int r6 = r10.mo27594X()     // Catch:{ all -> 0x0d15 }
            if (r5 >= r6) goto L_0x06d2
            c.q.a.c.g.i.i4 r6 = r10.mo27620u0(r5)     // Catch:{ all -> 0x0d15 }
            long r7 = r6.mo27325G()     // Catch:{ all -> 0x0d15 }
            long r11 = r10.mo27619t0()     // Catch:{ all -> 0x0d15 }
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 >= 0) goto L_0x06bc
            long r7 = r6.mo27325G()     // Catch:{ all -> 0x0d15 }
            r10.mo27602f0(r7)     // Catch:{ all -> 0x0d15 }
        L_0x06bc:
            long r7 = r6.mo27325G()     // Catch:{ all -> 0x0d15 }
            long r11 = r10.mo27617s0()     // Catch:{ all -> 0x0d15 }
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 <= 0) goto L_0x06cf
            long r6 = r6.mo27325G()     // Catch:{ all -> 0x0d15 }
            r10.mo27581M(r6)     // Catch:{ all -> 0x0d15 }
        L_0x06cf:
            int r5 = r5 + 1
            goto L_0x069f
        L_0x06d2:
            r10.mo27585O0()     // Catch:{ all -> 0x0d15 }
            r10.mo27564D0()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.b r5 = r1.f11161f     // Catch:{ all -> 0x0d15 }
            m16229R(r5)     // Catch:{ all -> 0x0d15 }
            java.lang.String r23 = r10.mo27609m0()     // Catch:{ all -> 0x0d15 }
            java.util.List r24 = r10.mo27612p0()     // Catch:{ all -> 0x0d15 }
            java.util.List r25 = r10.mo27613q0()     // Catch:{ all -> 0x0d15 }
            long r6 = r10.mo27619t0()     // Catch:{ all -> 0x0d15 }
            java.lang.Long r26 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0d15 }
            long r6 = r10.mo27617s0()     // Catch:{ all -> 0x0d15 }
            java.lang.Long r27 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0d15 }
            r22 = r5
            java.util.List r5 = r22.mo28093m(r23, r24, r25, r26, r27)     // Catch:{ all -> 0x0d15 }
            r10.mo27622v0(r5)     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.g r5 = r43.mo28732T()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.t4 r6 = r4.f11046a     // Catch:{ all -> 0x0d15 }
            java.lang.String r6 = r6.mo27685R1()     // Catch:{ all -> 0x0d15 }
            boolean r5 = r5.mo28239F(r6)     // Catch:{ all -> 0x0d15 }
            if (r5 == 0) goto L_0x0a4f
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ all -> 0x0d15 }
            r5.<init>()     // Catch:{ all -> 0x0d15 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0d15 }
            r6.<init>()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.ga r7 = r43.mo28745g0()     // Catch:{ all -> 0x0d15 }
            java.security.SecureRandom r7 = r7.mo28312u()     // Catch:{ all -> 0x0d15 }
            r8 = 0
        L_0x0725:
            int r9 = r10.mo27594X()     // Catch:{ all -> 0x0d15 }
            if (r8 >= r9) goto L_0x0a15
            c.q.a.c.g.i.i4 r9 = r10.mo27620u0(r8)     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.q8 r9 = r9.mo27727z()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.h4 r9 = (p040c.p200q.p201a.p264c.p294g.p335i.C5091h4) r9     // Catch:{ all -> 0x0d15 }
            java.lang.String r11 = r9.mo27293K()     // Catch:{ all -> 0x0d15 }
            java.lang.String r12 = "_ep"
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0d15 }
            java.lang.String r12 = "_efs"
            java.lang.String r13 = "_sr"
            if (r11 == 0) goto L_0x07c6
            c.q.a.c.i.b.aa r11 = r1.f11162g     // Catch:{ all -> 0x0d15 }
            m16229R(r11)     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.t8 r11 = r9.mo27520l()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.i4 r11 = (p040c.p200q.p201a.p264c.p294g.p335i.C5107i4) r11     // Catch:{ all -> 0x0d15 }
            java.lang.String r14 = "_en"
            java.lang.Object r11 = p040c.p200q.p201a.p264c.p340i.p342b.C5426aa.m15497o(r11, r14)     // Catch:{ all -> 0x0d15 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0d15 }
            java.lang.Object r14 = r5.get(r11)     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.r r14 = (p040c.p200q.p201a.p264c.p340i.p342b.C5619r) r14     // Catch:{ all -> 0x0d15 }
            if (r14 != 0) goto L_0x077a
            c.q.a.c.i.b.l r14 = r1.f11158c     // Catch:{ all -> 0x0d15 }
            m16229R(r14)     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.t4 r15 = r4.f11046a     // Catch:{ all -> 0x0d15 }
            java.lang.String r15 = r15.mo27685R1()     // Catch:{ all -> 0x0d15 }
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8908j(r11)     // Catch:{ all -> 0x0d15 }
            r2 = r11
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.r r14 = r14.mo28391V(r15, r2)     // Catch:{ all -> 0x0d15 }
            if (r14 == 0) goto L_0x077a
            r5.put(r11, r14)     // Catch:{ all -> 0x0d15 }
        L_0x077a:
            if (r14 == 0) goto L_0x07b9
            java.lang.Long r2 = r14.f10807i     // Catch:{ all -> 0x0d15 }
            if (r2 != 0) goto L_0x07b9
            java.lang.Long r2 = r14.f10808j     // Catch:{ all -> 0x0d15 }
            if (r2 == 0) goto L_0x0798
            long r2 = r2.longValue()     // Catch:{ all -> 0x0d15 }
            r20 = 1
            int r2 = (r2 > r20 ? 1 : (r2 == r20 ? 0 : -1))
            if (r2 <= 0) goto L_0x0798
            c.q.a.c.i.b.aa r2 = r1.f11162g     // Catch:{ all -> 0x0d15 }
            m16229R(r2)     // Catch:{ all -> 0x0d15 }
            java.lang.Long r2 = r14.f10808j     // Catch:{ all -> 0x0d15 }
            p040c.p200q.p201a.p264c.p340i.p342b.C5426aa.m15494P(r9, r13, r2)     // Catch:{ all -> 0x0d15 }
        L_0x0798:
            java.lang.Boolean r2 = r14.f10809k     // Catch:{ all -> 0x0d15 }
            if (r2 == 0) goto L_0x07b0
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x0d15 }
            if (r2 == 0) goto L_0x07b0
            c.q.a.c.i.b.aa r2 = r1.f11162g     // Catch:{ all -> 0x0d15 }
            m16229R(r2)     // Catch:{ all -> 0x0d15 }
            r2 = 1
            java.lang.Long r11 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0d15 }
            p040c.p200q.p201a.p264c.p340i.p342b.C5426aa.m15494P(r9, r12, r11)     // Catch:{ all -> 0x0d15 }
        L_0x07b0:
            c.q.a.c.g.i.t8 r2 = r9.mo27520l()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.i4 r2 = (p040c.p200q.p201a.p264c.p294g.p335i.C5107i4) r2     // Catch:{ all -> 0x0d15 }
            r6.add(r2)     // Catch:{ all -> 0x0d15 }
        L_0x07b9:
            r10.mo27586P(r8, r9)     // Catch:{ all -> 0x0d15 }
        L_0x07bc:
            r26 = r4
            r24 = r7
            r2 = r10
            r7 = r5
            r4 = 1
            goto L_0x0a09
        L_0x07c6:
            c.q.a.c.i.b.l4 r2 = r1.f11156a     // Catch:{ all -> 0x0d15 }
            m16229R(r2)     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.t4 r3 = r4.f11046a     // Catch:{ all -> 0x0d15 }
            java.lang.String r3 = r3.mo27685R1()     // Catch:{ all -> 0x0d15 }
            java.lang.String r11 = "measurement.account.time_zone_offset_minutes"
            java.lang.String r11 = r2.mo28213e(r3, r11)     // Catch:{ all -> 0x0d15 }
            boolean r14 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x0d15 }
            if (r14 != 0) goto L_0x07f7
            long r2 = java.lang.Long.parseLong(r11)     // Catch:{ NumberFormatException -> 0x07e2 }
            goto L_0x07f9
        L_0x07e2:
            r0 = move-exception
            r11 = r0
            c.q.a.c.i.b.t4 r2 = r2.f10699a     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.i3 r2 = r2.mo28487b()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.g3 r2 = r2.mo28344w()     // Catch:{ all -> 0x0d15 }
            java.lang.String r14 = "Unable to parse timezone offset. appId"
            java.lang.Object r3 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r3)     // Catch:{ all -> 0x0d15 }
            r2.mo28261c(r14, r3, r11)     // Catch:{ all -> 0x0d15 }
        L_0x07f7:
            r2 = 0
        L_0x07f9:
            c.q.a.c.i.b.ga r11 = r43.mo28745g0()     // Catch:{ all -> 0x0d15 }
            long r14 = r9.mo27297t()     // Catch:{ all -> 0x0d15 }
            long r14 = r11.mo28310s0(r14, r2)     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.t8 r11 = r9.mo27520l()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.i4 r11 = (p040c.p200q.p201a.p264c.p294g.p335i.C5107i4) r11     // Catch:{ all -> 0x0d15 }
            r46 = r12
            r20 = 1
            java.lang.Long r12 = java.lang.Long.valueOf(r20)     // Catch:{ all -> 0x0d15 }
            r22 = r2
            java.lang.String r2 = "_dbg"
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0d15 }
            if (r3 != 0) goto L_0x0851
            java.util.List r3 = r11.mo27328L()     // Catch:{ all -> 0x0d15 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0d15 }
        L_0x0825:
            boolean r11 = r3.hasNext()     // Catch:{ all -> 0x0d15 }
            if (r11 == 0) goto L_0x0851
            java.lang.Object r11 = r3.next()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.m4 r11 = (p040c.p200q.p201a.p264c.p294g.p335i.C5170m4) r11     // Catch:{ all -> 0x0d15 }
            r24 = r3
            java.lang.String r3 = r11.mo27418J()     // Catch:{ all -> 0x0d15 }
            boolean r3 = r2.equals(r3)     // Catch:{ all -> 0x0d15 }
            if (r3 == 0) goto L_0x084e
            long r2 = r11.mo27417G()     // Catch:{ all -> 0x0d15 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0d15 }
            boolean r2 = r12.equals(r2)     // Catch:{ all -> 0x0d15 }
            if (r2 != 0) goto L_0x084c
            goto L_0x0851
        L_0x084c:
            r2 = 1
            goto L_0x0864
        L_0x084e:
            r3 = r24
            goto L_0x0825
        L_0x0851:
            c.q.a.c.i.b.l4 r2 = r1.f11156a     // Catch:{ all -> 0x0d15 }
            m16229R(r2)     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.t4 r3 = r4.f11046a     // Catch:{ all -> 0x0d15 }
            java.lang.String r3 = r3.mo27685R1()     // Catch:{ all -> 0x0d15 }
            java.lang.String r11 = r9.mo27293K()     // Catch:{ all -> 0x0d15 }
            int r2 = r2.mo28433r(r3, r11)     // Catch:{ all -> 0x0d15 }
        L_0x0864:
            if (r2 > 0) goto L_0x0889
            c.q.a.c.i.b.i3 r3 = r43.mo28487b()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.g3 r3 = r3.mo28344w()     // Catch:{ all -> 0x0d15 }
            java.lang.String r11 = "Sample rate must be positive. event, rate"
            java.lang.String r12 = r9.mo27293K()     // Catch:{ all -> 0x0d15 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0d15 }
            r3.mo28261c(r11, r12, r2)     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.t8 r2 = r9.mo27520l()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.i4 r2 = (p040c.p200q.p201a.p264c.p294g.p335i.C5107i4) r2     // Catch:{ all -> 0x0d15 }
            r6.add(r2)     // Catch:{ all -> 0x0d15 }
            r10.mo27586P(r8, r9)     // Catch:{ all -> 0x0d15 }
            goto L_0x07bc
        L_0x0889:
            java.lang.String r3 = r9.mo27293K()     // Catch:{ all -> 0x0d15 }
            java.lang.Object r3 = r5.get(r3)     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.r r3 = (p040c.p200q.p201a.p264c.p340i.p342b.C5619r) r3     // Catch:{ all -> 0x0d15 }
            if (r3 != 0) goto L_0x08e9
            c.q.a.c.i.b.l r3 = r1.f11158c     // Catch:{ all -> 0x0d15 }
            m16229R(r3)     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.t4 r11 = r4.f11046a     // Catch:{ all -> 0x0d15 }
            java.lang.String r11 = r11.mo27685R1()     // Catch:{ all -> 0x0d15 }
            java.lang.String r12 = r9.mo27293K()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.r r3 = r3.mo28391V(r11, r12)     // Catch:{ all -> 0x0d15 }
            if (r3 != 0) goto L_0x08e9
            c.q.a.c.i.b.i3 r3 = r43.mo28487b()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.g3 r3 = r3.mo28344w()     // Catch:{ all -> 0x0d15 }
            java.lang.String r11 = "Event being bundled has no eventAggregate. appId, eventName"
            c.q.a.c.g.i.t4 r12 = r4.f11046a     // Catch:{ all -> 0x0d15 }
            java.lang.String r12 = r12.mo27685R1()     // Catch:{ all -> 0x0d15 }
            r24 = r14
            java.lang.String r14 = r9.mo27293K()     // Catch:{ all -> 0x0d15 }
            r3.mo28261c(r11, r12, r14)     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.r r3 = new c.q.a.c.i.b.r     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.t4 r11 = r4.f11046a     // Catch:{ all -> 0x0d15 }
            java.lang.String r27 = r11.mo27685R1()     // Catch:{ all -> 0x0d15 }
            java.lang.String r28 = r9.mo27293K()     // Catch:{ all -> 0x0d15 }
            r29 = 1
            r31 = 1
            r33 = 1
            long r35 = r9.mo27297t()     // Catch:{ all -> 0x0d15 }
            r37 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r26 = r3
            r26.<init>(r27, r28, r29, r31, r33, r35, r37, r39, r40, r41, r42)     // Catch:{ all -> 0x0d15 }
            goto L_0x08eb
        L_0x08e9:
            r24 = r14
        L_0x08eb:
            c.q.a.c.i.b.aa r11 = r1.f11162g     // Catch:{ all -> 0x0d15 }
            m16229R(r11)     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.t8 r11 = r9.mo27520l()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.i4 r11 = (p040c.p200q.p201a.p264c.p294g.p335i.C5107i4) r11     // Catch:{ all -> 0x0d15 }
            java.lang.String r12 = "_eid"
            java.lang.Object r11 = p040c.p200q.p201a.p264c.p340i.p342b.C5426aa.m15497o(r11, r12)     // Catch:{ all -> 0x0d15 }
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x0d15 }
            if (r11 == 0) goto L_0x0902
            r12 = 1
            goto L_0x0903
        L_0x0902:
            r12 = 0
        L_0x0903:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)     // Catch:{ all -> 0x0d15 }
            r14 = 1
            if (r2 != r14) goto L_0x0936
            c.q.a.c.g.i.t8 r2 = r9.mo27520l()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.i4 r2 = (p040c.p200q.p201a.p264c.p294g.p335i.C5107i4) r2     // Catch:{ all -> 0x0d15 }
            r6.add(r2)     // Catch:{ all -> 0x0d15 }
            boolean r2 = r12.booleanValue()     // Catch:{ all -> 0x0d15 }
            if (r2 == 0) goto L_0x0931
            java.lang.Long r2 = r3.f10807i     // Catch:{ all -> 0x0d15 }
            if (r2 != 0) goto L_0x0925
            java.lang.Long r2 = r3.f10808j     // Catch:{ all -> 0x0d15 }
            if (r2 != 0) goto L_0x0925
            java.lang.Boolean r2 = r3.f10809k     // Catch:{ all -> 0x0d15 }
            if (r2 == 0) goto L_0x0931
        L_0x0925:
            r2 = 0
            c.q.a.c.i.b.r r3 = r3.mo28586a(r2, r2, r2)     // Catch:{ all -> 0x0d15 }
            java.lang.String r2 = r9.mo27293K()     // Catch:{ all -> 0x0d15 }
            r5.put(r2, r3)     // Catch:{ all -> 0x0d15 }
        L_0x0931:
            r10.mo27586P(r8, r9)     // Catch:{ all -> 0x0d15 }
            goto L_0x07bc
        L_0x0936:
            int r14 = r7.nextInt(r2)     // Catch:{ all -> 0x0d15 }
            if (r14 != 0) goto L_0x0978
            c.q.a.c.i.b.aa r11 = r1.f11162g     // Catch:{ all -> 0x0d15 }
            m16229R(r11)     // Catch:{ all -> 0x0d15 }
            long r14 = (long) r2     // Catch:{ all -> 0x0d15 }
            java.lang.Long r2 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0d15 }
            p040c.p200q.p201a.p264c.p340i.p342b.C5426aa.m15494P(r9, r13, r2)     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.t8 r11 = r9.mo27520l()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.i4 r11 = (p040c.p200q.p201a.p264c.p294g.p335i.C5107i4) r11     // Catch:{ all -> 0x0d15 }
            r6.add(r11)     // Catch:{ all -> 0x0d15 }
            boolean r11 = r12.booleanValue()     // Catch:{ all -> 0x0d15 }
            if (r11 == 0) goto L_0x095d
            r11 = 0
            c.q.a.c.i.b.r r3 = r3.mo28586a(r11, r2, r11)     // Catch:{ all -> 0x0d15 }
        L_0x095d:
            java.lang.String r2 = r9.mo27293K()     // Catch:{ all -> 0x0d15 }
            long r11 = r9.mo27297t()     // Catch:{ all -> 0x0d15 }
            r14 = r24
            c.q.a.c.i.b.r r3 = r3.mo28587b(r11, r14)     // Catch:{ all -> 0x0d15 }
            r5.put(r2, r3)     // Catch:{ all -> 0x0d15 }
            r26 = r4
            r24 = r7
            r2 = r10
            r7 = r5
            r4 = 1
            goto L_0x0a06
        L_0x0978:
            r14 = r24
            r24 = r7
            java.lang.Long r7 = r3.f10806h     // Catch:{ all -> 0x0d15 }
            if (r7 == 0) goto L_0x098d
            long r22 = r7.longValue()     // Catch:{ all -> 0x0d15 }
            r26 = r4
            r28 = r5
            r27 = r10
            r25 = r11
            goto L_0x09a3
        L_0x098d:
            c.q.a.c.i.b.ga r7 = r43.mo28745g0()     // Catch:{ all -> 0x0d15 }
            r27 = r10
            r25 = r11
            long r10 = r9.mo27296s()     // Catch:{ all -> 0x0d15 }
            r26 = r4
            r28 = r5
            r4 = r22
            long r22 = r7.mo28310s0(r10, r4)     // Catch:{ all -> 0x0d15 }
        L_0x09a3:
            int r4 = (r22 > r14 ? 1 : (r22 == r14 ? 0 : -1))
            if (r4 == 0) goto L_0x09ec
            c.q.a.c.i.b.aa r4 = r1.f11162g     // Catch:{ all -> 0x0d15 }
            m16229R(r4)     // Catch:{ all -> 0x0d15 }
            r4 = 1
            java.lang.Long r7 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0d15 }
            r10 = r46
            p040c.p200q.p201a.p264c.p340i.p342b.C5426aa.m15494P(r9, r10, r7)     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.aa r7 = r1.f11162g     // Catch:{ all -> 0x0d15 }
            m16229R(r7)     // Catch:{ all -> 0x0d15 }
            long r10 = (long) r2     // Catch:{ all -> 0x0d15 }
            java.lang.Long r2 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0d15 }
            p040c.p200q.p201a.p264c.p340i.p342b.C5426aa.m15494P(r9, r13, r2)     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.t8 r7 = r9.mo27520l()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.i4 r7 = (p040c.p200q.p201a.p264c.p294g.p335i.C5107i4) r7     // Catch:{ all -> 0x0d15 }
            r6.add(r7)     // Catch:{ all -> 0x0d15 }
            boolean r7 = r12.booleanValue()     // Catch:{ all -> 0x0d15 }
            if (r7 == 0) goto L_0x09da
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0d15 }
            r10 = 0
            c.q.a.c.i.b.r r3 = r3.mo28586a(r10, r2, r7)     // Catch:{ all -> 0x0d15 }
        L_0x09da:
            java.lang.String r2 = r9.mo27293K()     // Catch:{ all -> 0x0d15 }
            long r10 = r9.mo27297t()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.r r3 = r3.mo28587b(r10, r14)     // Catch:{ all -> 0x0d15 }
            r7 = r28
            r7.put(r2, r3)     // Catch:{ all -> 0x0d15 }
            goto L_0x0a04
        L_0x09ec:
            r7 = r28
            r4 = 1
            boolean r2 = r12.booleanValue()     // Catch:{ all -> 0x0d15 }
            if (r2 == 0) goto L_0x0a04
            java.lang.String r2 = r9.mo27293K()     // Catch:{ all -> 0x0d15 }
            r11 = r25
            r10 = 0
            c.q.a.c.i.b.r r3 = r3.mo28586a(r11, r10, r10)     // Catch:{ all -> 0x0d15 }
            r7.put(r2, r3)     // Catch:{ all -> 0x0d15 }
        L_0x0a04:
            r2 = r27
        L_0x0a06:
            r2.mo27586P(r8, r9)     // Catch:{ all -> 0x0d15 }
        L_0x0a09:
            int r8 = r8 + 1
            r10 = r2
            r5 = r7
            r7 = r24
            r4 = r26
            r2 = 0
            goto L_0x0725
        L_0x0a15:
            r26 = r4
            r7 = r5
            r2 = r10
            int r3 = r6.size()     // Catch:{ all -> 0x0d15 }
            int r4 = r2.mo27594X()     // Catch:{ all -> 0x0d15 }
            if (r3 >= r4) goto L_0x0a29
            r2.mo27570G0()     // Catch:{ all -> 0x0d15 }
            r2.mo27624w0(r6)     // Catch:{ all -> 0x0d15 }
        L_0x0a29:
            java.util.Set r3 = r7.entrySet()     // Catch:{ all -> 0x0d15 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0d15 }
        L_0x0a31:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0d15 }
            if (r4 == 0) goto L_0x0a4c
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0d15 }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.l r5 = r1.f11158c     // Catch:{ all -> 0x0d15 }
            m16229R(r5)     // Catch:{ all -> 0x0d15 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.r r4 = (p040c.p200q.p201a.p264c.p340i.p342b.C5619r) r4     // Catch:{ all -> 0x0d15 }
            r5.mo28407q(r4)     // Catch:{ all -> 0x0d15 }
            goto L_0x0a31
        L_0x0a4c:
            r3 = r26
            goto L_0x0a51
        L_0x0a4f:
            r2 = r10
            r3 = r4
        L_0x0a51:
            c.q.a.c.g.i.t4 r4 = r3.f11046a     // Catch:{ all -> 0x0d15 }
            java.lang.String r4 = r4.mo27685R1()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.l r5 = r1.f11158c     // Catch:{ all -> 0x0d15 }
            m16229R(r5)     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.d6 r5 = r5.mo28387R(r4)     // Catch:{ all -> 0x0d15 }
            if (r5 != 0) goto L_0x0a7a
            c.q.a.c.i.b.i3 r5 = r43.mo28487b()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.g3 r5 = r5.mo28339r()     // Catch:{ all -> 0x0d15 }
            java.lang.String r6 = "Bundling raw events w/o app info. appId"
            c.q.a.c.g.i.t4 r7 = r3.f11046a     // Catch:{ all -> 0x0d15 }
            java.lang.String r7 = r7.mo27685R1()     // Catch:{ all -> 0x0d15 }
            java.lang.Object r7 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r7)     // Catch:{ all -> 0x0d15 }
            r5.mo28260b(r6, r7)     // Catch:{ all -> 0x0d15 }
            goto L_0x0ad6
        L_0x0a7a:
            int r6 = r2.mo27594X()     // Catch:{ all -> 0x0d15 }
            if (r6 <= 0) goto L_0x0ad6
            long r6 = r5.mo28172X()     // Catch:{ all -> 0x0d15 }
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0a8e
            r2.mo27595Y(r6)     // Catch:{ all -> 0x0d15 }
            goto L_0x0a91
        L_0x0a8e:
            r2.mo27578K0()     // Catch:{ all -> 0x0d15 }
        L_0x0a91:
            long r8 = r5.mo28174Z()     // Catch:{ all -> 0x0d15 }
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0a9c
            goto L_0x0a9d
        L_0x0a9c:
            r6 = r8
        L_0x0a9d:
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x0aa5
            r2.mo27596Z(r6)     // Catch:{ all -> 0x0d15 }
            goto L_0x0aa8
        L_0x0aa5:
            r2.mo27580L0()     // Catch:{ all -> 0x0d15 }
        L_0x0aa8:
            r5.mo28183e()     // Catch:{ all -> 0x0d15 }
            long r6 = r5.mo28173Y()     // Catch:{ all -> 0x0d15 }
            int r6 = (int) r6     // Catch:{ all -> 0x0d15 }
            r2.mo27565E(r6)     // Catch:{ all -> 0x0d15 }
            long r6 = r2.mo27619t0()     // Catch:{ all -> 0x0d15 }
            r5.mo28151C(r6)     // Catch:{ all -> 0x0d15 }
            long r6 = r2.mo27617s0()     // Catch:{ all -> 0x0d15 }
            r5.mo28210z(r6)     // Catch:{ all -> 0x0d15 }
            java.lang.String r6 = r5.mo28180c0()     // Catch:{ all -> 0x0d15 }
            if (r6 == 0) goto L_0x0acb
            r2.mo27590T(r6)     // Catch:{ all -> 0x0d15 }
            goto L_0x0ace
        L_0x0acb:
            r2.mo27572H0()     // Catch:{ all -> 0x0d15 }
        L_0x0ace:
            c.q.a.c.i.b.l r6 = r1.f11158c     // Catch:{ all -> 0x0d15 }
            m16229R(r6)     // Catch:{ all -> 0x0d15 }
            r6.mo28406p(r5)     // Catch:{ all -> 0x0d15 }
        L_0x0ad6:
            int r5 = r2.mo27594X()     // Catch:{ all -> 0x0d15 }
            if (r5 <= 0) goto L_0x0c5a
            c.q.a.c.i.b.t4 r5 = r1.f11167l     // Catch:{ all -> 0x0d15 }
            r5.mo28489d()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.l4 r5 = r1.f11156a     // Catch:{ all -> 0x0d15 }
            m16229R(r5)     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.t4 r6 = r3.f11046a     // Catch:{ all -> 0x0d15 }
            java.lang.String r6 = r6.mo27685R1()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.u3 r5 = r5.mo28434t(r6)     // Catch:{ all -> 0x0d15 }
            r6 = -1
            if (r5 == 0) goto L_0x0b03
            boolean r8 = r5.mo27772V()     // Catch:{ all -> 0x0d15 }
            if (r8 != 0) goto L_0x0afb
            goto L_0x0b03
        L_0x0afb:
            long r8 = r5.mo27762F()     // Catch:{ all -> 0x0d15 }
            r2.mo27569G(r8)     // Catch:{ all -> 0x0d15 }
            goto L_0x0b2a
        L_0x0b03:
            c.q.a.c.g.i.t4 r5 = r3.f11046a     // Catch:{ all -> 0x0d15 }
            java.lang.String r5 = r5.mo27669I()     // Catch:{ all -> 0x0d15 }
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x0d15 }
            if (r5 == 0) goto L_0x0b13
            r2.mo27569G(r6)     // Catch:{ all -> 0x0d15 }
            goto L_0x0b2a
        L_0x0b13:
            c.q.a.c.i.b.i3 r5 = r43.mo28487b()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.g3 r5 = r5.mo28344w()     // Catch:{ all -> 0x0d15 }
            java.lang.String r8 = "Did not find measurement config or missing version info. appId"
            c.q.a.c.g.i.t4 r9 = r3.f11046a     // Catch:{ all -> 0x0d15 }
            java.lang.String r9 = r9.mo27685R1()     // Catch:{ all -> 0x0d15 }
            java.lang.Object r9 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r9)     // Catch:{ all -> 0x0d15 }
            r5.mo28260b(r8, r9)     // Catch:{ all -> 0x0d15 }
        L_0x0b2a:
            c.q.a.c.i.b.l r5 = r1.f11158c     // Catch:{ all -> 0x0d15 }
            m16229R(r5)     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.t8 r2 = r2.mo27520l()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.g.i.t4 r2 = (p040c.p200q.p201a.p264c.p294g.p335i.C5275t4) r2     // Catch:{ all -> 0x0d15 }
            r5.mo28029h()     // Catch:{ all -> 0x0d15 }
            r5.mo28475i()     // Catch:{ all -> 0x0d15 }
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8908j(r2)     // Catch:{ all -> 0x0d15 }
            java.lang.String r8 = r2.mo27685R1()     // Catch:{ all -> 0x0d15 }
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8904f(r8)     // Catch:{ all -> 0x0d15 }
            boolean r8 = r2.mo27697k1()     // Catch:{ all -> 0x0d15 }
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8911m(r8)     // Catch:{ all -> 0x0d15 }
            r5.mo28402h0()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.t4 r8 = r5.f10699a     // Catch:{ all -> 0x0d15 }
            c.q.a.c.d.n.d r8 = r8.mo28488c()     // Catch:{ all -> 0x0d15 }
            long r8 = r8.mo20838a()     // Catch:{ all -> 0x0d15 }
            long r10 = r2.mo27664F1()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.t4 r12 = r5.f10699a     // Catch:{ all -> 0x0d15 }
            r12.mo28649z()     // Catch:{ all -> 0x0d15 }
            long r12 = p040c.p200q.p201a.p264c.p340i.p342b.C5487g.m15651i()     // Catch:{ all -> 0x0d15 }
            long r12 = r8 - r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 < 0) goto L_0x0b7e
            long r10 = r2.mo27664F1()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.t4 r12 = r5.f10699a     // Catch:{ all -> 0x0d15 }
            r12.mo28649z()     // Catch:{ all -> 0x0d15 }
            long r12 = p040c.p200q.p201a.p264c.p340i.p342b.C5487g.m15651i()     // Catch:{ all -> 0x0d15 }
            long r12 = r12 + r8
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 <= 0) goto L_0x0ba1
        L_0x0b7e:
            c.q.a.c.i.b.t4 r10 = r5.f10699a     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.i3 r10 = r10.mo28487b()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.g3 r10 = r10.mo28344w()     // Catch:{ all -> 0x0d15 }
            java.lang.String r11 = "Storing bundle outside of the max uploading time span. appId, now, timestamp"
            java.lang.String r12 = r2.mo27685R1()     // Catch:{ all -> 0x0d15 }
            java.lang.Object r12 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r12)     // Catch:{ all -> 0x0d15 }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0d15 }
            long r13 = r2.mo27664F1()     // Catch:{ all -> 0x0d15 }
            java.lang.Long r9 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0d15 }
            r10.mo28262d(r11, r12, r8, r9)     // Catch:{ all -> 0x0d15 }
        L_0x0ba1:
            byte[] r8 = r2.mo27190h()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.y9 r9 = r5.f10663b     // Catch:{ IOException -> 0x0c41 }
            c.q.a.c.i.b.aa r9 = r9.f11162g     // Catch:{ IOException -> 0x0c41 }
            m16229R(r9)     // Catch:{ IOException -> 0x0c41 }
            byte[] r8 = r9.mo28086O(r8)     // Catch:{ IOException -> 0x0c41 }
            c.q.a.c.i.b.t4 r9 = r5.f10699a     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.i3 r9 = r9.mo28487b()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.g3 r9 = r9.mo28343v()     // Catch:{ all -> 0x0d15 }
            java.lang.String r10 = "Saving bundle, size"
            int r11 = r8.length     // Catch:{ all -> 0x0d15 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0d15 }
            r9.mo28260b(r10, r11)     // Catch:{ all -> 0x0d15 }
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x0d15 }
            r9.<init>()     // Catch:{ all -> 0x0d15 }
            java.lang.String r10 = "app_id"
            java.lang.String r11 = r2.mo27685R1()     // Catch:{ all -> 0x0d15 }
            r9.put(r10, r11)     // Catch:{ all -> 0x0d15 }
            java.lang.String r10 = "bundle_end_timestamp"
            long r11 = r2.mo27664F1()     // Catch:{ all -> 0x0d15 }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0d15 }
            r9.put(r10, r11)     // Catch:{ all -> 0x0d15 }
            java.lang.String r10 = "data"
            r9.put(r10, r8)     // Catch:{ all -> 0x0d15 }
            java.lang.String r8 = "has_realtime"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x0d15 }
            r9.put(r8, r10)     // Catch:{ all -> 0x0d15 }
            boolean r8 = r2.mo27703q1()     // Catch:{ all -> 0x0d15 }
            if (r8 == 0) goto L_0x0c00
            java.lang.String r8 = "retry_count"
            int r10 = r2.mo27712z1()     // Catch:{ all -> 0x0d15 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0d15 }
            r9.put(r8, r10)     // Catch:{ all -> 0x0d15 }
        L_0x0c00:
            android.database.sqlite.SQLiteDatabase r8 = r5.mo28385P()     // Catch:{ SQLiteException -> 0x0c27 }
            java.lang.String r10 = "queue"
            r11 = 0
            long r8 = r8.insert(r10, r11, r9)     // Catch:{ SQLiteException -> 0x0c27 }
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x0c5a
            c.q.a.c.i.b.t4 r6 = r5.f10699a     // Catch:{ SQLiteException -> 0x0c27 }
            c.q.a.c.i.b.i3 r6 = r6.mo28487b()     // Catch:{ SQLiteException -> 0x0c27 }
            c.q.a.c.i.b.g3 r6 = r6.mo28339r()     // Catch:{ SQLiteException -> 0x0c27 }
            java.lang.String r7 = "Failed to insert bundle (got -1). appId"
            java.lang.String r8 = r2.mo27685R1()     // Catch:{ SQLiteException -> 0x0c27 }
            java.lang.Object r8 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r8)     // Catch:{ SQLiteException -> 0x0c27 }
            r6.mo28260b(r7, r8)     // Catch:{ SQLiteException -> 0x0c27 }
            goto L_0x0c5a
        L_0x0c27:
            r0 = move-exception
            r6 = r0
            c.q.a.c.i.b.t4 r5 = r5.f10699a     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.i3 r5 = r5.mo28487b()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.g3 r5 = r5.mo28339r()     // Catch:{ all -> 0x0d15 }
            java.lang.String r7 = "Error storing bundle. appId"
            java.lang.String r2 = r2.mo27685R1()     // Catch:{ all -> 0x0d15 }
            java.lang.Object r2 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r2)     // Catch:{ all -> 0x0d15 }
            r5.mo28261c(r7, r2, r6)     // Catch:{ all -> 0x0d15 }
            goto L_0x0c5a
        L_0x0c41:
            r0 = move-exception
            r6 = r0
            c.q.a.c.i.b.t4 r5 = r5.f10699a     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.i3 r5 = r5.mo28487b()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.g3 r5 = r5.mo28339r()     // Catch:{ all -> 0x0d15 }
            java.lang.String r7 = "Data loss. Failed to serialize bundle. appId"
            java.lang.String r2 = r2.mo27685R1()     // Catch:{ all -> 0x0d15 }
            java.lang.Object r2 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r2)     // Catch:{ all -> 0x0d15 }
            r5.mo28261c(r7, r2, r6)     // Catch:{ all -> 0x0d15 }
        L_0x0c5a:
            c.q.a.c.i.b.l r2 = r1.f11158c     // Catch:{ all -> 0x0d15 }
            m16229R(r2)     // Catch:{ all -> 0x0d15 }
            java.util.List r3 = r3.f11047b     // Catch:{ all -> 0x0d15 }
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8908j(r3)     // Catch:{ all -> 0x0d15 }
            r2.mo28029h()     // Catch:{ all -> 0x0d15 }
            r2.mo28475i()     // Catch:{ all -> 0x0d15 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d15 }
            java.lang.String r6 = "rowid in ("
            r5.<init>(r6)     // Catch:{ all -> 0x0d15 }
            r6 = 0
        L_0x0c72:
            int r7 = r3.size()     // Catch:{ all -> 0x0d15 }
            if (r6 >= r7) goto L_0x0c8f
            if (r6 == 0) goto L_0x0c7f
            java.lang.String r7 = ","
            r5.append(r7)     // Catch:{ all -> 0x0d15 }
        L_0x0c7f:
            java.lang.Object r7 = r3.get(r6)     // Catch:{ all -> 0x0d15 }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x0d15 }
            long r7 = r7.longValue()     // Catch:{ all -> 0x0d15 }
            r5.append(r7)     // Catch:{ all -> 0x0d15 }
            int r6 = r6 + 1
            goto L_0x0c72
        L_0x0c8f:
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch:{ all -> 0x0d15 }
            android.database.sqlite.SQLiteDatabase r6 = r2.mo28385P()     // Catch:{ all -> 0x0d15 }
            java.lang.String r7 = "raw_events"
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0d15 }
            r8 = 0
            int r5 = r6.delete(r7, r5, r8)     // Catch:{ all -> 0x0d15 }
            int r6 = r3.size()     // Catch:{ all -> 0x0d15 }
            if (r5 == r6) goto L_0x0cc4
            c.q.a.c.i.b.t4 r2 = r2.f10699a     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.i3 r2 = r2.mo28487b()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.g3 r2 = r2.mo28339r()     // Catch:{ all -> 0x0d15 }
            java.lang.String r6 = "Deleted fewer rows from raw events table than expected"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0d15 }
            int r3 = r3.size()     // Catch:{ all -> 0x0d15 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0d15 }
            r2.mo28261c(r6, r5, r3)     // Catch:{ all -> 0x0d15 }
        L_0x0cc4:
            c.q.a.c.i.b.l r2 = r1.f11158c     // Catch:{ all -> 0x0d15 }
            m16229R(r2)     // Catch:{ all -> 0x0d15 }
            android.database.sqlite.SQLiteDatabase r3 = r2.mo28385P()     // Catch:{ all -> 0x0d15 }
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0cdc }
            r6 = 0
            r5[r6] = r4     // Catch:{ SQLiteException -> 0x0cdc }
            r6 = 1
            r5[r6] = r4     // Catch:{ SQLiteException -> 0x0cdc }
            java.lang.String r6 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
            r3.execSQL(r6, r5)     // Catch:{ SQLiteException -> 0x0cdc }
            goto L_0x0cf1
        L_0x0cdc:
            r0 = move-exception
            r3 = r0
            c.q.a.c.i.b.t4 r2 = r2.f10699a     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.i3 r2 = r2.mo28487b()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.g3 r2 = r2.mo28339r()     // Catch:{ all -> 0x0d15 }
            java.lang.String r5 = "Failed to remove unused event metadata. appId"
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r4)     // Catch:{ all -> 0x0d15 }
            r2.mo28261c(r5, r4, r3)     // Catch:{ all -> 0x0d15 }
        L_0x0cf1:
            c.q.a.c.i.b.l r2 = r1.f11158c     // Catch:{ all -> 0x0d15 }
            m16229R(r2)     // Catch:{ all -> 0x0d15 }
            r2.mo28405o()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.l r2 = r1.f11158c
            m16229R(r2)
            r2.mo28400f0()
            r2 = 1
            return r2
        L_0x0d03:
            c.q.a.c.i.b.l r2 = r1.f11158c     // Catch:{ all -> 0x0d15 }
            m16229R(r2)     // Catch:{ all -> 0x0d15 }
            r2.mo28405o()     // Catch:{ all -> 0x0d15 }
            c.q.a.c.i.b.l r2 = r1.f11158c
            m16229R(r2)
            r2.mo28400f0()
            r2 = 0
            return r2
        L_0x0d15:
            r0 = move-exception
            r2 = r0
            c.q.a.c.i.b.l r3 = r1.f11158c
            m16229R(r3)
            r3.mo28400f0()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p340i.p342b.C5709y9.mo28728N(java.lang.String, long):boolean");
    }

    /* renamed from: O */
    public final boolean mo28729O() {
        mo28486a().mo28029h();
        mo28744g();
        C5547l lVar = this.f11158c;
        m16229R(lVar);
        if (lVar.mo28408r()) {
            return true;
        }
        C5547l lVar2 = this.f11158c;
        m16229R(lVar2);
        return !TextUtils.isEmpty(lVar2.mo28394Z());
    }

    /* renamed from: P */
    public final boolean mo28730P(C5091h4 h4Var, C5091h4 h4Var2) {
        String str;
        C3495o.m8899a("_e".equals(h4Var.mo27293K()));
        m16229R(this.f11162g);
        C5170m4 n = C5426aa.m15496n((C5107i4) h4Var.mo27520l(), "_sc");
        String str2 = null;
        if (n == null) {
            str = null;
        } else {
            str = n.mo27419K();
        }
        m16229R(this.f11162g);
        C5170m4 n2 = C5426aa.m15496n((C5107i4) h4Var2.mo27520l(), "_pc");
        if (n2 != null) {
            str2 = n2.mo27419K();
        }
        if (str2 == null || !str2.equals(str)) {
            return false;
        }
        C3495o.m8899a("_e".equals(h4Var.mo27293K()));
        m16229R(this.f11162g);
        C5170m4 n3 = C5426aa.m15496n((C5107i4) h4Var.mo27520l(), "_et");
        if (n3 == null || !n3.mo27423Z() || n3.mo27417G() <= 0) {
            return true;
        }
        long G = n3.mo27417G();
        m16229R(this.f11162g);
        C5170m4 n4 = C5426aa.m15496n((C5107i4) h4Var2.mo27520l(), "_et");
        if (n4 != null && n4.mo27417G() > 0) {
            G += n4.mo27417G();
        }
        m16229R(this.f11162g);
        C5426aa.m15494P(h4Var2, "_et", Long.valueOf(G));
        m16229R(this.f11162g);
        C5426aa.m15494P(h4Var, "_fr", 1L);
        return true;
    }

    @WorkerThread
    /* renamed from: S */
    public final C5458d6 mo28731S(zzq zzq) {
        mo28486a().mo28029h();
        mo28744g();
        C3495o.m8908j(zzq);
        C3495o.m8904f(zzq.f14918e);
        if (!zzq.f14916G.isEmpty()) {
            this.f11152B.put(zzq.f14918e, new C5698x9(this, zzq.f14916G));
        }
        C5547l lVar = this.f11158c;
        m16229R(lVar);
        C5458d6 R = lVar.mo28387R(zzq.f14918e);
        C5499h c = mo28733U(zzq.f14918e).mo28319c(C5499h.m15749b(zzq.f14915F));
        String o = c.mo28326i(zzah.AD_STORAGE) ? this.f11164i.mo28609o(zzq.f14918e, zzq.f14932y) : "";
        if (R == null) {
            R = new C5458d6(this.f11167l, zzq.f14918e);
            if (c.mo28326i(zzah.ANALYTICS_STORAGE)) {
                R.mo28189h(mo28747h0(c));
            }
            if (c.mo28326i(zzah.AD_STORAGE)) {
                R.mo28154F(o);
            }
        } else if (c.mo28326i(zzah.AD_STORAGE) && o != null && !o.equals(R.mo28175a())) {
            R.mo28154F(o);
            if (zzq.f14932y && !"00000000-0000-0000-0000-000000000000".equals(this.f11164i.mo28608n(zzq.f14918e, c).first)) {
                R.mo28189h(mo28747h0(c));
                C5547l lVar2 = this.f11158c;
                m16229R(lVar2);
                if (lVar2.mo28392X(zzq.f14918e, "_id") != null) {
                    C5547l lVar3 = this.f11158c;
                    m16229R(lVar3);
                    if (lVar3.mo28392X(zzq.f14918e, "_lair") == null) {
                        C5450ca caVar = new C5450ca(zzq.f14918e, DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_lair", mo28488c().mo20838a(), 1L);
                        C5547l lVar4 = this.f11158c;
                        m16229R(lVar4);
                        lVar4.mo28414x(caVar);
                    }
                }
            }
        } else if (TextUtils.isEmpty(R.mo28184e0()) && c.mo28326i(zzah.ANALYTICS_STORAGE)) {
            R.mo28189h(mo28747h0(c));
        }
        R.mo28207w(zzq.f14919l);
        R.mo28185f(zzq.f14910A);
        if (!TextUtils.isEmpty(zzq.f14928u)) {
            R.mo28206v(zzq.f14928u);
        }
        long j = zzq.f14922o;
        if (j != 0) {
            R.mo28208x(j);
        }
        if (!TextUtils.isEmpty(zzq.f14920m)) {
            R.mo28193j(zzq.f14920m);
        }
        R.mo28195k(zzq.f14927t);
        String str = zzq.f14921n;
        if (str != null) {
            R.mo28191i(str);
        }
        R.mo28203s(zzq.f14923p);
        R.mo28152D(zzq.f14925r);
        if (!TextUtils.isEmpty(zzq.f14924q)) {
            R.mo28209y(zzq.f14924q);
        }
        R.mo28187g(zzq.f14932y);
        R.mo28153E(zzq.f14911B);
        R.mo28204t(zzq.f14912C);
        C5179md.m14505b();
        if (mo28732T().mo28235B((String) null, C5658u2.f10980i0) && mo28732T().mo28235B(zzq.f14918e, C5658u2.f10984k0)) {
            R.mo28156H(zzq.f14917H);
        }
        C4987ac.m13785b();
        if (mo28732T().mo28235B((String) null, C5658u2.f10978h0)) {
            R.mo28155G(zzq.f14913D);
        } else {
            C4987ac.m13785b();
            if (mo28732T().mo28235B((String) null, C5658u2.f10976g0)) {
                R.mo28155G((List) null);
            }
        }
        if (R.mo28159K()) {
            C5547l lVar5 = this.f11158c;
            m16229R(lVar5);
            lVar5.mo28406p(R);
        }
        return R;
    }

    /* renamed from: T */
    public final C5487g mo28732T() {
        C5648t4 t4Var = this.f11167l;
        C3495o.m8908j(t4Var);
        return t4Var.mo28649z();
    }

    @WorkerThread
    /* renamed from: U */
    public final C5499h mo28733U(String str) {
        String str2;
        C5499h hVar = C5499h.f10511b;
        mo28486a().mo28029h();
        mo28744g();
        C5499h hVar2 = (C5499h) this.f11151A.get(str);
        if (hVar2 != null) {
            return hVar2;
        }
        C5547l lVar = this.f11158c;
        m16229R(lVar);
        C3495o.m8908j(str);
        lVar.mo28029h();
        lVar.mo28475i();
        Cursor cursor = null;
        try {
            Cursor rawQuery = lVar.mo28385P().rawQuery("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str});
            if (rawQuery.moveToFirst()) {
                str2 = rawQuery.getString(0);
                if (rawQuery != null) {
                    rawQuery.close();
                }
            } else {
                if (rawQuery != null) {
                    rawQuery.close();
                }
                str2 = "G1";
            }
            C5499h b = C5499h.m15749b(str2);
            mo28717A(str, b);
            return b;
        } catch (SQLiteException e) {
            lVar.f10699a.mo28487b().mo28339r().mo28261c("Database error", "select consent_state from consent_settings where app_id=? limit 1;", e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: V */
    public final C5547l mo28734V() {
        C5547l lVar = this.f11158c;
        m16229R(lVar);
        return lVar;
    }

    /* renamed from: W */
    public final C5455d3 mo28735W() {
        return this.f11167l.mo28620D();
    }

    /* renamed from: X */
    public final C5587o3 mo28736X() {
        C5587o3 o3Var = this.f11157b;
        m16229R(o3Var);
        return o3Var;
    }

    /* renamed from: Y */
    public final C5611q3 mo28737Y() {
        C5611q3 q3Var = this.f11159d;
        if (q3Var != null) {
            return q3Var;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    /* renamed from: Z */
    public final C5552l4 mo28738Z() {
        C5552l4 l4Var = this.f11156a;
        m16229R(l4Var);
        return l4Var;
    }

    /* renamed from: a */
    public final C5612q4 mo28486a() {
        C5648t4 t4Var = this.f11167l;
        C3495o.m8908j(t4Var);
        return t4Var.mo28486a();
    }

    /* renamed from: b */
    public final C5515i3 mo28487b() {
        C5648t4 t4Var = this.f11167l;
        C3495o.m8908j(t4Var);
        return t4Var.mo28487b();
    }

    /* renamed from: b0 */
    public final C5648t4 mo28739b0() {
        return this.f11167l;
    }

    /* renamed from: c */
    public final C3553d mo28488c() {
        C5648t4 t4Var = this.f11167l;
        C3495o.m8908j(t4Var);
        return t4Var.mo28488c();
    }

    /* renamed from: c0 */
    public final C5495g7 mo28740c0() {
        C5495g7 g7Var = this.f11163h;
        m16229R(g7Var);
        return g7Var;
    }

    /* renamed from: d */
    public final C5439c mo28489d() {
        throw null;
    }

    /* renamed from: d0 */
    public final C5640s8 mo28741d0() {
        return this.f11164i;
    }

    @WorkerThread
    /* renamed from: e */
    public final void mo28742e() {
        mo28486a().mo28029h();
        mo28744g();
        if (!this.f11169n) {
            this.f11169n = true;
            if (mo28721E()) {
                FileChannel fileChannel = this.f11178w;
                mo28486a().mo28029h();
                int i = 0;
                if (fileChannel == null || !fileChannel.isOpen()) {
                    mo28487b().mo28339r().mo28259a("Bad channel to read from");
                } else {
                    ByteBuffer allocate = ByteBuffer.allocate(4);
                    try {
                        fileChannel.position(0);
                        int read = fileChannel.read(allocate);
                        if (read == 4) {
                            allocate.flip();
                            i = allocate.getInt();
                        } else if (read != -1) {
                            mo28487b().mo28344w().mo28260b("Unexpected data length. Bytes read", Integer.valueOf(read));
                        }
                    } catch (IOException e) {
                        mo28487b().mo28339r().mo28260b("Failed to read from channel", e);
                    }
                }
                int p = this.f11167l.mo28618B().mo28704p();
                mo28486a().mo28029h();
                if (i > p) {
                    mo28487b().mo28339r().mo28261c("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i), Integer.valueOf(p));
                } else if (i < p) {
                    FileChannel fileChannel2 = this.f11178w;
                    mo28486a().mo28029h();
                    if (fileChannel2 == null || !fileChannel2.isOpen()) {
                        mo28487b().mo28339r().mo28259a("Bad channel to read from");
                    } else {
                        ByteBuffer allocate2 = ByteBuffer.allocate(4);
                        allocate2.putInt(p);
                        allocate2.flip();
                        try {
                            fileChannel2.truncate(0);
                            fileChannel2.write(allocate2);
                            fileChannel2.force(true);
                            if (fileChannel2.size() != 4) {
                                mo28487b().mo28339r().mo28260b("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                            }
                            mo28487b().mo28343v().mo28261c("Storage version upgraded. Previous, current version", Integer.valueOf(i), Integer.valueOf(p));
                            return;
                        } catch (IOException e2) {
                            mo28487b().mo28339r().mo28260b("Failed to write to channel", e2);
                        }
                    }
                    mo28487b().mo28339r().mo28261c("Storage version upgrade failed. Previous, current version", Integer.valueOf(i), Integer.valueOf(p));
                }
            }
        }
    }

    /* renamed from: f */
    public final Context mo28490f() {
        return this.f11167l.mo28490f();
    }

    /* renamed from: f0 */
    public final C5426aa mo28743f0() {
        C5426aa aaVar = this.f11162g;
        m16229R(aaVar);
        return aaVar;
    }

    /* renamed from: g */
    public final void mo28744g() {
        if (!this.f11168m) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* renamed from: g0 */
    public final C5498ga mo28745g0() {
        C5648t4 t4Var = this.f11167l;
        C3495o.m8908j(t4Var);
        return t4Var.mo28629N();
    }

    /* renamed from: h */
    public final void mo28746h(String str, C5260s4 s4Var) {
        int w;
        int indexOf;
        C5552l4 l4Var = this.f11156a;
        m16229R(l4Var);
        Set y = l4Var.mo28438y(str);
        if (y != null) {
            s4Var.mo27627y0(y);
        }
        C5552l4 l4Var2 = this.f11156a;
        m16229R(l4Var2);
        if (l4Var2.mo28424J(str)) {
            s4Var.mo27566E0();
        }
        C5552l4 l4Var3 = this.f11156a;
        m16229R(l4Var3);
        if (l4Var3.mo28427M(str)) {
            if (mo28732T().mo28235B(str, C5658u2.f10990n0)) {
                String o0 = s4Var.mo27611o0();
                if (!TextUtils.isEmpty(o0) && (indexOf = o0.indexOf(MAPCookie.DOT)) != -1) {
                    s4Var.mo27592V(o0.substring(0, indexOf));
                }
            } else {
                s4Var.mo27576J0();
            }
        }
        C5552l4 l4Var4 = this.f11156a;
        m16229R(l4Var4);
        if (l4Var4.mo28428N(str) && (w = C5426aa.m15503w(s4Var, "_id")) != -1) {
            s4Var.mo27616s(w);
        }
        C5552l4 l4Var5 = this.f11156a;
        m16229R(l4Var5);
        if (l4Var5.mo28426L(str)) {
            s4Var.mo27568F0();
        }
        C5552l4 l4Var6 = this.f11156a;
        m16229R(l4Var6);
        if (l4Var6.mo28423I(str)) {
            s4Var.mo27563C0();
            C5698x9 x9Var = (C5698x9) this.f11152B.get(str);
            if (x9Var == null || x9Var.f11116b + mo28732T().mo28250r(str, C5658u2.f10955S) < mo28488c().mo20839b()) {
                x9Var = new C5698x9(this);
                this.f11152B.put(str, x9Var);
            }
            s4Var.mo27583N(x9Var.f11115a);
        }
        C5552l4 l4Var7 = this.f11156a;
        m16229R(l4Var7);
        if (l4Var7.mo28425K(str)) {
            s4Var.mo27584N0();
        }
    }

    @WorkerThread
    /* renamed from: h0 */
    public final String mo28747h0(C5499h hVar) {
        if (!hVar.mo28326i(zzah.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        mo28745g0().mo28312u().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    @WorkerThread
    /* renamed from: i */
    public final void mo28748i(C5458d6 d6Var) {
        ArrayMap arrayMap;
        ArrayMap arrayMap2;
        mo28486a().mo28029h();
        if (!TextUtils.isEmpty(d6Var.mo28192i0()) || !TextUtils.isEmpty(d6Var.mo28178b0())) {
            C5581n9 n9Var = this.f11165j;
            Uri.Builder builder = new Uri.Builder();
            String i0 = d6Var.mo28192i0();
            if (TextUtils.isEmpty(i0)) {
                i0 = d6Var.mo28178b0();
            }
            ArrayMap arrayMap3 = null;
            Uri.Builder appendQueryParameter = builder.scheme((String) C5658u2.f10971e.mo28613a((Object) null)).encodedAuthority((String) C5658u2.f10973f.mo28613a((Object) null)).path("config/app/".concat(String.valueOf(i0))).appendQueryParameter("platform", UrlConstKt.APP_PLATFORM);
            n9Var.f10699a.mo28649z().mo28249q();
            appendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(74029)).appendQueryParameter("runtime_version", "0");
            String uri = builder.build().toString();
            try {
                String d0 = d6Var.mo28182d0();
                C3495o.m8908j(d0);
                String str = d0;
                URL url = new URL(uri);
                mo28487b().mo28343v().mo28260b("Fetching remote configuration", str);
                C5552l4 l4Var = this.f11156a;
                m16229R(l4Var);
                C5289u3 t = l4Var.mo28434t(str);
                C5552l4 l4Var2 = this.f11156a;
                m16229R(l4Var2);
                String v = l4Var2.mo28436v(str);
                if (t != null) {
                    if (!TextUtils.isEmpty(v)) {
                        arrayMap2 = new ArrayMap();
                        arrayMap2.put("If-Modified-Since", v);
                    } else {
                        arrayMap2 = null;
                    }
                    C5068fd.m14095b();
                    if (mo28732T().mo28235B((String) null, C5658u2.f10986l0)) {
                        C5552l4 l4Var3 = this.f11156a;
                        m16229R(l4Var3);
                        String u = l4Var3.mo28435u(str);
                        if (!TextUtils.isEmpty(u)) {
                            if (arrayMap2 == null) {
                                arrayMap2 = new ArrayMap();
                            }
                            arrayMap3 = arrayMap2;
                            arrayMap3.put("If-None-Match", u);
                        }
                    }
                    arrayMap = arrayMap2;
                    this.f11174s = true;
                    C5587o3 o3Var = this.f11157b;
                    m16229R(o3Var);
                    C5617q9 q9Var = new C5617q9(this);
                    o3Var.mo28029h();
                    o3Var.mo28475i();
                    C3495o.m8908j(url);
                    C3495o.m8908j(q9Var);
                    o3Var.f10699a.mo28486a().mo28539y(new C5575n3(o3Var, str, url, (byte[]) null, arrayMap, q9Var));
                }
                arrayMap = arrayMap3;
                this.f11174s = true;
                C5587o3 o3Var2 = this.f11157b;
                m16229R(o3Var2);
                C5617q9 q9Var2 = new C5617q9(this);
                o3Var2.mo28029h();
                o3Var2.mo28475i();
                C3495o.m8908j(url);
                C3495o.m8908j(q9Var2);
                o3Var2.f10699a.mo28486a().mo28539y(new C5575n3(o3Var2, str, url, (byte[]) null, arrayMap, q9Var2));
            } catch (MalformedURLException unused) {
                mo28487b().mo28339r().mo28261c("Failed to parse config URL. Not fetching. appId", C5515i3.m15778z(d6Var.mo28182d0()), uri);
            }
        } else {
            String d02 = d6Var.mo28182d0();
            C3495o.m8908j(d02);
            mo28755n(d02, 204, (Throwable) null, (byte[]) null, (Map) null);
        }
    }

    /* renamed from: i0 */
    public final String mo28749i0(zzq zzq) {
        try {
            return (String) mo28486a().mo28537s(new C5629r9(this, zzq)).get(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            mo28487b().mo28339r().mo28261c("Failed to get app instance id. appId", C5515i3.m15778z(zzq.f14918e), e);
            return null;
        }
    }

    @WorkerThread
    /* renamed from: j */
    public final void mo28750j(zzaw zzaw, zzq zzq) {
        zzaw zzaw2;
        List<zzac> list;
        List<zzac> list2;
        List<zzac> list3;
        String str;
        zzq zzq2 = zzq;
        C3495o.m8908j(zzq);
        C3495o.m8904f(zzq2.f14918e);
        mo28486a().mo28029h();
        mo28744g();
        String str2 = zzq2.f14918e;
        long j = zzaw.f14902n;
        C5527j3 b = C5527j3.m15794b(zzaw);
        mo28486a().mo28029h();
        C5519i7 i7Var = null;
        if (!(this.f11153C == null || (str = this.f11154D) == null || !str.equals(str2))) {
            i7Var = this.f11153C;
        }
        C5498ga.m15697y(i7Var, b.f10586d, false);
        zzaw a = b.mo28354a();
        m16229R(this.f11162g);
        if (C5426aa.m15495m(a, zzq2)) {
            if (!zzq2.f14925r) {
                mo28731S(zzq2);
                return;
            }
            List list4 = zzq2.f14913D;
            if (list4 == null) {
                zzaw2 = a;
            } else if (list4.contains(a.f14899e)) {
                Bundle R = a.f14900l.mo33658R();
                R.putLong("ga_safelisted", 1);
                zzaw2 = new zzaw(a.f14899e, new zzau(R), a.f14901m, a.f14902n);
            } else {
                mo28487b().mo28338q().mo28262d("Dropping non-safelisted event. appId, event name, origin", str2, a.f14899e, a.f14901m);
                return;
            }
            C5547l lVar = this.f11158c;
            m16229R(lVar);
            lVar.mo28399e0();
            try {
                C5547l lVar2 = this.f11158c;
                m16229R(lVar2);
                C3495o.m8904f(str2);
                lVar2.mo28029h();
                lVar2.mo28475i();
                int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                if (i < 0) {
                    lVar2.f10699a.mo28487b().mo28344w().mo28261c("Invalid time querying timed out conditional properties", C5515i3.m15778z(str2), Long.valueOf(j));
                    list = Collections.emptyList();
                } else {
                    list = lVar2.mo28396b0("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j)});
                }
                for (zzac zzac : list) {
                    if (zzac != null) {
                        mo28487b().mo28343v().mo28262d("User property timed out", zzac.f14887e, this.f11167l.mo28620D().mo28146f(zzac.f14889m.f14904l), zzac.f14889m.mo33668P());
                        zzaw zzaw3 = zzac.f14893q;
                        if (zzaw3 != null) {
                            mo28720D(new zzaw(zzaw3, j), zzq2);
                        }
                        C5547l lVar3 = this.f11158c;
                        m16229R(lVar3);
                        lVar3.mo28379J(str2, zzac.f14889m.f14904l);
                    }
                }
                C5547l lVar4 = this.f11158c;
                m16229R(lVar4);
                C3495o.m8904f(str2);
                lVar4.mo28029h();
                lVar4.mo28475i();
                if (i < 0) {
                    lVar4.f10699a.mo28487b().mo28344w().mo28261c("Invalid time querying expired conditional properties", C5515i3.m15778z(str2), Long.valueOf(j));
                    list2 = Collections.emptyList();
                } else {
                    list2 = lVar4.mo28396b0("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j)});
                }
                ArrayList<zzaw> arrayList = new ArrayList<>(list2.size());
                for (zzac zzac2 : list2) {
                    if (zzac2 != null) {
                        mo28487b().mo28343v().mo28262d("User property expired", zzac2.f14887e, this.f11167l.mo28620D().mo28146f(zzac2.f14889m.f14904l), zzac2.f14889m.mo33668P());
                        C5547l lVar5 = this.f11158c;
                        m16229R(lVar5);
                        lVar5.mo28403m(str2, zzac2.f14889m.f14904l);
                        zzaw zzaw4 = zzac2.f14897u;
                        if (zzaw4 != null) {
                            arrayList.add(zzaw4);
                        }
                        C5547l lVar6 = this.f11158c;
                        m16229R(lVar6);
                        lVar6.mo28379J(str2, zzac2.f14889m.f14904l);
                    }
                }
                for (zzaw zzaw5 : arrayList) {
                    mo28720D(new zzaw(zzaw5, j), zzq2);
                }
                C5547l lVar7 = this.f11158c;
                m16229R(lVar7);
                String str3 = zzaw2.f14899e;
                C3495o.m8904f(str2);
                C3495o.m8904f(str3);
                lVar7.mo28029h();
                lVar7.mo28475i();
                if (i < 0) {
                    lVar7.f10699a.mo28487b().mo28344w().mo28262d("Invalid time querying triggered conditional properties", C5515i3.m15778z(str2), lVar7.f10699a.mo28620D().mo28144d(str3), Long.valueOf(j));
                    list3 = Collections.emptyList();
                } else {
                    list3 = lVar7.mo28396b0("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str3, String.valueOf(j)});
                }
                ArrayList<zzaw> arrayList2 = new ArrayList<>(list3.size());
                for (zzac zzac3 : list3) {
                    if (zzac3 != null) {
                        zzkw zzkw = zzac3.f14889m;
                        String str4 = zzac3.f14887e;
                        C3495o.m8908j(str4);
                        String str5 = zzac3.f14888l;
                        String str6 = zzkw.f14904l;
                        Object P = zzkw.mo33668P();
                        C3495o.m8908j(P);
                        C5450ca caVar = new C5450ca(str4, str5, str6, j, P);
                        C5547l lVar8 = this.f11158c;
                        m16229R(lVar8);
                        if (lVar8.mo28414x(caVar)) {
                            mo28487b().mo28343v().mo28262d("User property triggered", zzac3.f14887e, this.f11167l.mo28620D().mo28146f(caVar.f10374c), caVar.f10376e);
                        } else {
                            mo28487b().mo28339r().mo28262d("Too many active user properties, ignoring", C5515i3.m15778z(zzac3.f14887e), this.f11167l.mo28620D().mo28146f(caVar.f10374c), caVar.f10376e);
                        }
                        zzaw zzaw6 = zzac3.f14895s;
                        if (zzaw6 != null) {
                            arrayList2.add(zzaw6);
                        }
                        zzac3.f14889m = new zzkw(caVar);
                        zzac3.f14891o = true;
                        C5547l lVar9 = this.f11158c;
                        m16229R(lVar9);
                        lVar9.mo28413w(zzac3);
                    }
                }
                mo28720D(zzaw2, zzq2);
                for (zzaw zzaw7 : arrayList2) {
                    mo28720D(new zzaw(zzaw7, j), zzq2);
                }
                C5547l lVar10 = this.f11158c;
                m16229R(lVar10);
                lVar10.mo28405o();
            } finally {
                C5547l lVar11 = this.f11158c;
                m16229R(lVar11);
                lVar11.mo28400f0();
            }
        }
    }

    @WorkerThread
    /* renamed from: k */
    public final void mo28751k(zzaw zzaw, String str) {
        zzaw zzaw2 = zzaw;
        String str2 = str;
        C5547l lVar = this.f11158c;
        m16229R(lVar);
        C5458d6 R = lVar.mo28387R(str2);
        if (R == null || TextUtils.isEmpty(R.mo28188g0())) {
            mo28487b().mo28338q().mo28260b("No app data available; dropping event", str2);
            return;
        }
        Boolean J = mo28724J(R);
        if (J == null) {
            if (!"_ui".equals(zzaw2.f14899e)) {
                mo28487b().mo28344w().mo28260b("Could not find package. appId", C5515i3.m15778z(str));
            }
        } else if (!J.booleanValue()) {
            mo28487b().mo28339r().mo28260b("App version does not match; dropping event. appId", C5515i3.m15778z(str));
            return;
        }
        String i0 = R.mo28192i0();
        String g0 = R.mo28188g0();
        long L = R.mo28160L();
        String f0 = R.mo28186f0();
        long W = R.mo28171W();
        long T = R.mo28168T();
        boolean J2 = R.mo28158J();
        String h0 = R.mo28190h0();
        R.mo28149A();
        zzq zzq = r2;
        C5458d6 d6Var = R;
        zzq zzq2 = new zzq(str, i0, g0, L, f0, W, T, (String) null, J2, false, h0, 0, 0, 0, d6Var.mo28157I(), false, d6Var.mo28178b0(), d6Var.mo28176a0(), d6Var.mo28169U(), d6Var.mo28179c(), (String) null, mo28733U(str2).mo28324h(), "", (String) null);
        mo28753l(zzaw2, zzq);
    }

    @WorkerThread
    /* renamed from: k0 */
    public final void mo28752k0(Runnable runnable) {
        mo28486a().mo28029h();
        if (this.f11171p == null) {
            this.f11171p = new ArrayList();
        }
        this.f11171p.add(runnable);
    }

    @WorkerThread
    /* renamed from: l */
    public final void mo28753l(zzaw zzaw, zzq zzq) {
        C3495o.m8904f(zzq.f14918e);
        C5527j3 b = C5527j3.m15794b(zzaw);
        C5498ga g0 = mo28745g0();
        Bundle bundle = b.f10586d;
        C5547l lVar = this.f11158c;
        m16229R(lVar);
        g0.mo28318z(bundle, lVar.mo28386Q(zzq.f14918e));
        mo28745g0().mo28270A(b, mo28732T().mo28246n(zzq.f14918e));
        zzaw a = b.mo28354a();
        if ("_cmp".equals(a.f14899e) && "referrer API v2".equals(a.f14900l.mo33662V("_cis"))) {
            String V = a.f14900l.mo33662V("gclid");
            if (!TextUtils.isEmpty(V)) {
                mo28718B(new zzkw("_lgclid", a.f14902n, V, DebugKt.DEBUG_PROPERTY_VALUE_AUTO), zzq);
            }
        }
        mo28750j(a, zzq);
    }

    /* renamed from: m */
    public final void mo28754m() {
        this.f11173r++;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049 A[Catch:{ all -> 0x0185, all -> 0x018f }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005c A[Catch:{ all -> 0x0185, all -> 0x018f }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0104 A[Catch:{ all -> 0x0185, all -> 0x018f }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x011b A[Catch:{ all -> 0x0185, all -> 0x018f }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0138 A[Catch:{ all -> 0x0185, all -> 0x018f }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0146 A[Catch:{ all -> 0x0185, all -> 0x018f }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0168 A[Catch:{ all -> 0x0185, all -> 0x018f }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x016c A[Catch:{ all -> 0x0185, all -> 0x018f }] */
    @androidx.annotation.WorkerThread
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28755n(java.lang.String r9, int r10, java.lang.Throwable r11, byte[] r12, java.util.Map r13) {
        /*
            r8 = this;
            c.q.a.c.i.b.q4 r0 = r8.mo28486a()
            r0.mo28029h()
            r8.mo28744g()
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8904f(r9)
            r0 = 0
            if (r12 != 0) goto L_0x0012
            byte[] r12 = new byte[r0]     // Catch:{ all -> 0x018f }
        L_0x0012:
            c.q.a.c.i.b.i3 r1 = r8.mo28487b()     // Catch:{ all -> 0x018f }
            c.q.a.c.i.b.g3 r1 = r1.mo28343v()     // Catch:{ all -> 0x018f }
            int r2 = r12.length     // Catch:{ all -> 0x018f }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x018f }
            java.lang.String r3 = "onConfigFetched. Response size"
            r1.mo28260b(r3, r2)     // Catch:{ all -> 0x018f }
            c.q.a.c.i.b.l r1 = r8.f11158c     // Catch:{ all -> 0x018f }
            m16229R(r1)     // Catch:{ all -> 0x018f }
            r1.mo28399e0()     // Catch:{ all -> 0x018f }
            c.q.a.c.i.b.l r1 = r8.f11158c     // Catch:{ all -> 0x0185 }
            m16229R(r1)     // Catch:{ all -> 0x0185 }
            c.q.a.c.i.b.d6 r1 = r1.mo28387R(r9)     // Catch:{ all -> 0x0185 }
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 304(0x130, float:4.26E-43)
            if (r10 == r3) goto L_0x0042
            r3 = 204(0xcc, float:2.86E-43)
            if (r10 == r3) goto L_0x0042
            if (r10 != r4) goto L_0x0046
            r10 = r4
        L_0x0042:
            if (r11 != 0) goto L_0x0046
            r3 = 1
            goto L_0x0047
        L_0x0046:
            r3 = r0
        L_0x0047:
            if (r1 != 0) goto L_0x005c
            c.q.a.c.i.b.i3 r10 = r8.mo28487b()     // Catch:{ all -> 0x0185 }
            c.q.a.c.i.b.g3 r10 = r10.mo28344w()     // Catch:{ all -> 0x0185 }
            java.lang.String r11 = "App does not exist in onConfigFetched. appId"
            java.lang.Object r9 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r9)     // Catch:{ all -> 0x0185 }
            r10.mo28260b(r11, r9)     // Catch:{ all -> 0x0185 }
            goto L_0x016f
        L_0x005c:
            r5 = 404(0x194, float:5.66E-43)
            if (r3 != 0) goto L_0x00ba
            if (r10 != r5) goto L_0x0063
            goto L_0x00ba
        L_0x0063:
            c.q.a.c.d.n.d r12 = r8.mo28488c()     // Catch:{ all -> 0x0185 }
            long r12 = r12.mo20838a()     // Catch:{ all -> 0x0185 }
            r1.mo28205u(r12)     // Catch:{ all -> 0x0185 }
            c.q.a.c.i.b.l r12 = r8.f11158c     // Catch:{ all -> 0x0185 }
            m16229R(r12)     // Catch:{ all -> 0x0185 }
            r12.mo28406p(r1)     // Catch:{ all -> 0x0185 }
            c.q.a.c.i.b.i3 r12 = r8.mo28487b()     // Catch:{ all -> 0x0185 }
            c.q.a.c.i.b.g3 r12 = r12.mo28343v()     // Catch:{ all -> 0x0185 }
            java.lang.String r13 = "Fetching config failed. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0185 }
            r12.mo28261c(r13, r1, r11)     // Catch:{ all -> 0x0185 }
            c.q.a.c.i.b.l4 r11 = r8.f11156a     // Catch:{ all -> 0x0185 }
            m16229R(r11)     // Catch:{ all -> 0x0185 }
            r11.mo28439z(r9)     // Catch:{ all -> 0x0185 }
            c.q.a.c.i.b.s8 r9 = r8.f11164i     // Catch:{ all -> 0x0185 }
            c.q.a.c.i.b.t3 r9 = r9.f10862h     // Catch:{ all -> 0x0185 }
            c.q.a.c.d.n.d r11 = r8.mo28488c()     // Catch:{ all -> 0x0185 }
            long r11 = r11.mo20838a()     // Catch:{ all -> 0x0185 }
            r9.mo28616b(r11)     // Catch:{ all -> 0x0185 }
            r9 = 503(0x1f7, float:7.05E-43)
            if (r10 == r9) goto L_0x00a6
            r9 = 429(0x1ad, float:6.01E-43)
            if (r10 != r9) goto L_0x00b5
        L_0x00a6:
            c.q.a.c.i.b.s8 r9 = r8.f11164i     // Catch:{ all -> 0x0185 }
            c.q.a.c.i.b.t3 r9 = r9.f10860f     // Catch:{ all -> 0x0185 }
            c.q.a.c.d.n.d r10 = r8.mo28488c()     // Catch:{ all -> 0x0185 }
            long r10 = r10.mo20838a()     // Catch:{ all -> 0x0185 }
            r9.mo28616b(r10)     // Catch:{ all -> 0x0185 }
        L_0x00b5:
            r8.mo28727M()     // Catch:{ all -> 0x0185 }
            goto L_0x016f
        L_0x00ba:
            r11 = 0
            if (r13 == 0) goto L_0x00c6
            java.lang.String r3 = "Last-Modified"
            java.lang.Object r3 = r13.get(r3)     // Catch:{ all -> 0x0185 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x0185 }
            goto L_0x00c7
        L_0x00c6:
            r3 = r11
        L_0x00c7:
            if (r3 == 0) goto L_0x00d6
            boolean r6 = r3.isEmpty()     // Catch:{ all -> 0x0185 }
            if (r6 != 0) goto L_0x00d6
            java.lang.Object r3 = r3.get(r0)     // Catch:{ all -> 0x0185 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0185 }
            goto L_0x00d7
        L_0x00d6:
            r3 = r11
        L_0x00d7:
            p040c.p200q.p201a.p264c.p294g.p335i.C5068fd.m14095b()     // Catch:{ all -> 0x0185 }
            c.q.a.c.i.b.g r6 = r8.mo28732T()     // Catch:{ all -> 0x0185 }
            c.q.a.c.i.b.t2 r7 = p040c.p200q.p201a.p264c.p340i.p342b.C5658u2.f10986l0     // Catch:{ all -> 0x0185 }
            boolean r6 = r6.mo28235B(r11, r7)     // Catch:{ all -> 0x0185 }
            if (r6 == 0) goto L_0x0101
            if (r13 == 0) goto L_0x00f1
            java.lang.String r6 = "ETag"
            java.lang.Object r13 = r13.get(r6)     // Catch:{ all -> 0x0185 }
            java.util.List r13 = (java.util.List) r13     // Catch:{ all -> 0x0185 }
            goto L_0x00f2
        L_0x00f1:
            r13 = r11
        L_0x00f2:
            if (r13 == 0) goto L_0x0101
            boolean r6 = r13.isEmpty()     // Catch:{ all -> 0x0185 }
            if (r6 != 0) goto L_0x0101
            java.lang.Object r13 = r13.get(r0)     // Catch:{ all -> 0x0185 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x0185 }
            goto L_0x0102
        L_0x0101:
            r13 = r11
        L_0x0102:
            if (r10 == r5) goto L_0x0110
            if (r10 != r4) goto L_0x0107
            goto L_0x0110
        L_0x0107:
            c.q.a.c.i.b.l4 r11 = r8.f11156a     // Catch:{ all -> 0x0185 }
            m16229R(r11)     // Catch:{ all -> 0x0185 }
            r11.mo28422H(r9, r12, r3, r13)     // Catch:{ all -> 0x0185 }
            goto L_0x0123
        L_0x0110:
            c.q.a.c.i.b.l4 r12 = r8.f11156a     // Catch:{ all -> 0x0185 }
            m16229R(r12)     // Catch:{ all -> 0x0185 }
            c.q.a.c.g.i.u3 r12 = r12.mo28434t(r9)     // Catch:{ all -> 0x0185 }
            if (r12 != 0) goto L_0x0123
            c.q.a.c.i.b.l4 r12 = r8.f11156a     // Catch:{ all -> 0x0185 }
            m16229R(r12)     // Catch:{ all -> 0x0185 }
            r12.mo28422H(r9, r11, r11, r11)     // Catch:{ all -> 0x0185 }
        L_0x0123:
            c.q.a.c.d.n.d r11 = r8.mo28488c()     // Catch:{ all -> 0x0185 }
            long r11 = r11.mo20838a()     // Catch:{ all -> 0x0185 }
            r1.mo28196l(r11)     // Catch:{ all -> 0x0185 }
            c.q.a.c.i.b.l r11 = r8.f11158c     // Catch:{ all -> 0x0185 }
            m16229R(r11)     // Catch:{ all -> 0x0185 }
            r11.mo28406p(r1)     // Catch:{ all -> 0x0185 }
            if (r10 != r5) goto L_0x0146
            c.q.a.c.i.b.i3 r10 = r8.mo28487b()     // Catch:{ all -> 0x0185 }
            c.q.a.c.i.b.g3 r10 = r10.mo28345x()     // Catch:{ all -> 0x0185 }
            java.lang.String r11 = "Config not found. Using empty config. appId"
            r10.mo28260b(r11, r9)     // Catch:{ all -> 0x0185 }
            goto L_0x0157
        L_0x0146:
            c.q.a.c.i.b.i3 r9 = r8.mo28487b()     // Catch:{ all -> 0x0185 }
            c.q.a.c.i.b.g3 r9 = r9.mo28343v()     // Catch:{ all -> 0x0185 }
            java.lang.String r11 = "Successfully fetched config. Got network response. code, size"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0185 }
            r9.mo28261c(r11, r10, r2)     // Catch:{ all -> 0x0185 }
        L_0x0157:
            c.q.a.c.i.b.o3 r9 = r8.f11157b     // Catch:{ all -> 0x0185 }
            m16229R(r9)     // Catch:{ all -> 0x0185 }
            boolean r9 = r9.mo28499m()     // Catch:{ all -> 0x0185 }
            if (r9 == 0) goto L_0x016c
            boolean r9 = r8.mo28729O()     // Catch:{ all -> 0x0185 }
            if (r9 == 0) goto L_0x016c
            r8.mo28719C()     // Catch:{ all -> 0x0185 }
            goto L_0x016f
        L_0x016c:
            r8.mo28727M()     // Catch:{ all -> 0x0185 }
        L_0x016f:
            c.q.a.c.i.b.l r9 = r8.f11158c     // Catch:{ all -> 0x0185 }
            m16229R(r9)     // Catch:{ all -> 0x0185 }
            r9.mo28405o()     // Catch:{ all -> 0x0185 }
            c.q.a.c.i.b.l r9 = r8.f11158c     // Catch:{ all -> 0x018f }
            m16229R(r9)     // Catch:{ all -> 0x018f }
            r9.mo28400f0()     // Catch:{ all -> 0x018f }
            r8.f11174s = r0
            r8.mo28725K()
            return
        L_0x0185:
            r9 = move-exception
            c.q.a.c.i.b.l r10 = r8.f11158c     // Catch:{ all -> 0x018f }
            m16229R(r10)     // Catch:{ all -> 0x018f }
            r10.mo28400f0()     // Catch:{ all -> 0x018f }
            throw r9     // Catch:{ all -> 0x018f }
        L_0x018f:
            r9 = move-exception
            r8.f11174s = r0
            r8.mo28725K()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p340i.p342b.C5709y9.mo28755n(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* renamed from: o */
    public final void mo28756o(boolean z) {
        mo28727M();
    }

    /* JADX INFO: finally extract failed */
    @WorkerThread
    /* renamed from: p */
    public final void mo28757p(int i, Throwable th, byte[] bArr, String str) {
        C5547l lVar;
        mo28486a().mo28029h();
        mo28744g();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.f11175t = false;
                mo28725K();
                throw th2;
            }
        }
        List list = this.f11179x;
        C3495o.m8908j(list);
        List<Long> list2 = list;
        this.f11179x = null;
        if (i != 200) {
            if (i == 204) {
                i = 204;
            }
            mo28487b().mo28343v().mo28261c("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            this.f11164i.f10862h.mo28616b(mo28488c().mo20838a());
            if (i == 503 || i == 429) {
                this.f11164i.f10860f.mo28616b(mo28488c().mo20838a());
            }
            C5547l lVar2 = this.f11158c;
            m16229R(lVar2);
            lVar2.mo28401g0(list2);
            mo28727M();
            this.f11175t = false;
            mo28725K();
        }
        if (th == null) {
            try {
                this.f11164i.f10861g.mo28616b(mo28488c().mo20838a());
                this.f11164i.f10862h.mo28616b(0);
                mo28727M();
                mo28487b().mo28343v().mo28261c("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                C5547l lVar3 = this.f11158c;
                m16229R(lVar3);
                lVar3.mo28399e0();
                try {
                    for (Long l : list2) {
                        try {
                            lVar = this.f11158c;
                            m16229R(lVar);
                            long longValue = l.longValue();
                            lVar.mo28029h();
                            lVar.mo28475i();
                            if (lVar.mo28385P().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                                throw new SQLiteException("Deleted fewer rows from queue than expected");
                            }
                        } catch (SQLiteException e) {
                            lVar.f10699a.mo28487b().mo28339r().mo28260b("Failed to delete a bundle in a queue table", e);
                            throw e;
                        } catch (SQLiteException e2) {
                            List list3 = this.f11180y;
                            if (list3 == null || !list3.contains(l)) {
                                throw e2;
                            }
                        }
                    }
                    C5547l lVar4 = this.f11158c;
                    m16229R(lVar4);
                    lVar4.mo28405o();
                    C5547l lVar5 = this.f11158c;
                    m16229R(lVar5);
                    lVar5.mo28400f0();
                    this.f11180y = null;
                    C5587o3 o3Var = this.f11157b;
                    m16229R(o3Var);
                    if (!o3Var.mo28499m() || !mo28729O()) {
                        this.f11181z = -1;
                        mo28727M();
                    } else {
                        mo28719C();
                    }
                    this.f11170o = 0;
                } catch (Throwable th3) {
                    C5547l lVar6 = this.f11158c;
                    m16229R(lVar6);
                    lVar6.mo28400f0();
                    throw th3;
                }
            } catch (SQLiteException e3) {
                mo28487b().mo28339r().mo28260b("Database error while trying to delete uploaded bundles", e3);
                this.f11170o = mo28488c().mo20839b();
                mo28487b().mo28343v().mo28260b("Disable upload, time", Long.valueOf(this.f11170o));
            }
            this.f11175t = false;
            mo28725K();
        }
        mo28487b().mo28343v().mo28261c("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
        this.f11164i.f10862h.mo28616b(mo28488c().mo20838a());
        this.f11164i.f10860f.mo28616b(mo28488c().mo20838a());
        C5547l lVar22 = this.f11158c;
        m16229R(lVar22);
        lVar22.mo28401g0(list2);
        mo28727M();
        this.f11175t = false;
        mo28725K();
    }

    /* JADX WARNING: Removed duplicated region for block: B:128:0x03eb A[Catch:{ RuntimeException -> 0x0373, all -> 0x057d }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0416 A[Catch:{ RuntimeException -> 0x0373, all -> 0x057d }] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x042b A[SYNTHETIC, Splitter:B:133:0x042b] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x04d3 A[Catch:{ RuntimeException -> 0x0373, all -> 0x057d }] */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x04ef A[Catch:{ RuntimeException -> 0x0373, all -> 0x057d }] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x054f A[Catch:{ RuntimeException -> 0x0373, all -> 0x057d }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0141 A[Catch:{ RuntimeException -> 0x0373, all -> 0x057d }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0201 A[Catch:{ RuntimeException -> 0x0373, all -> 0x057d }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0205 A[Catch:{ RuntimeException -> 0x0373, all -> 0x057d }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x025f A[Catch:{ RuntimeException -> 0x0373, all -> 0x057d }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x026e A[Catch:{ RuntimeException -> 0x0373, all -> 0x057d }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x027e A[Catch:{ RuntimeException -> 0x0373, all -> 0x057d }] */
    @androidx.annotation.WorkerThread
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28758q(com.google.android.gms.measurement.internal.zzq r25) {
        /*
            r24 = this;
            r1 = r24
            r2 = r25
            java.lang.String r3 = "_sysu"
            java.lang.String r4 = "_sys"
            java.lang.String r5 = "com.android.vending"
            java.lang.String r6 = "_pfo"
            java.lang.String r7 = "_uwa"
            java.lang.String r0 = "app_id=?"
            c.q.a.c.i.b.q4 r8 = r24.mo28486a()
            r8.mo28029h()
            r24.mo28744g()
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8908j(r25)
            java.lang.String r8 = r2.f14918e
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8904f(r8)
            boolean r8 = m16228Q(r25)
            if (r8 == 0) goto L_0x0587
            c.q.a.c.i.b.l r8 = r1.f11158c
            m16229R(r8)
            java.lang.String r9 = r2.f14918e
            c.q.a.c.i.b.d6 r8 = r8.mo28387R(r9)
            r9 = 0
            if (r8 == 0) goto L_0x005e
            java.lang.String r11 = r8.mo28192i0()
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 == 0) goto L_0x005e
            java.lang.String r11 = r2.f14919l
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 != 0) goto L_0x005e
            r8.mo28196l(r9)
            c.q.a.c.i.b.l r11 = r1.f11158c
            m16229R(r11)
            r11.mo28406p(r8)
            c.q.a.c.i.b.l4 r8 = r1.f11156a
            m16229R(r8)
            java.lang.String r11 = r2.f14918e
            r8.mo28415A(r11)
        L_0x005e:
            boolean r8 = r2.f14925r
            if (r8 != 0) goto L_0x0066
            r24.mo28731S(r25)
            return
        L_0x0066:
            long r11 = r2.f14930w
            int r8 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r8 != 0) goto L_0x0074
            c.q.a.c.d.n.d r8 = r24.mo28488c()
            long r11 = r8.mo20838a()
        L_0x0074:
            c.q.a.c.i.b.t4 r8 = r1.f11167l
            c.q.a.c.i.b.p r8 = r8.mo28617A()
            r8.mo28514r()
            int r8 = r2.f14931x
            r15 = 1
            if (r8 == 0) goto L_0x009c
            if (r8 == r15) goto L_0x009c
            c.q.a.c.i.b.i3 r13 = r24.mo28487b()
            c.q.a.c.i.b.g3 r13 = r13.mo28344w()
            java.lang.String r14 = r2.f14918e
            java.lang.Object r14 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r14)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r9 = "Incorrect app type, assuming installed app. appId, appType"
            r13.mo28261c(r9, r14, r8)
            r8 = 0
        L_0x009c:
            c.q.a.c.i.b.l r9 = r1.f11158c
            m16229R(r9)
            r9.mo28399e0()
            c.q.a.c.i.b.l r9 = r1.f11158c     // Catch:{ all -> 0x057d }
            m16229R(r9)     // Catch:{ all -> 0x057d }
            java.lang.String r10 = r2.f14918e     // Catch:{ all -> 0x057d }
            java.lang.String r13 = "_npa"
            c.q.a.c.i.b.ca r9 = r9.mo28392X(r10, r13)     // Catch:{ all -> 0x057d }
            if (r9 == 0) goto L_0x00c5
            java.lang.String r10 = "auto"
            java.lang.String r13 = r9.f10373b     // Catch:{ all -> 0x057d }
            boolean r10 = r10.equals(r13)     // Catch:{ all -> 0x057d }
            if (r10 == 0) goto L_0x00be
            goto L_0x00c5
        L_0x00be:
            r21 = r3
            r22 = r4
            r4 = r15
            r3 = 0
            goto L_0x0119
        L_0x00c5:
            java.lang.Boolean r10 = r2.f14911B     // Catch:{ all -> 0x057d }
            if (r10 == 0) goto L_0x0101
            com.google.android.gms.measurement.internal.zzkw r10 = new com.google.android.gms.measurement.internal.zzkw     // Catch:{ all -> 0x057d }
            java.lang.String r14 = "_npa"
            java.lang.Boolean r13 = r2.f14911B     // Catch:{ all -> 0x057d }
            boolean r13 = r13.booleanValue()     // Catch:{ all -> 0x057d }
            if (r15 == r13) goto L_0x00d8
            r19 = 0
            goto L_0x00da
        L_0x00d8:
            r19 = 1
        L_0x00da:
            java.lang.Long r19 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x057d }
            java.lang.String r20 = "auto"
            r21 = r3
            r22 = r4
            r3 = 1
            r13 = r10
            r3 = 0
            r4 = r15
            r15 = r11
            r17 = r19
            r18 = r20
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x057d }
            if (r9 == 0) goto L_0x00fd
            java.lang.Object r9 = r9.f10376e     // Catch:{ all -> 0x057d }
            java.lang.Long r13 = r10.f14906n     // Catch:{ all -> 0x057d }
            boolean r9 = r9.equals(r13)     // Catch:{ all -> 0x057d }
            if (r9 != 0) goto L_0x0119
        L_0x00fd:
            r1.mo28718B(r10, r2)     // Catch:{ all -> 0x057d }
            goto L_0x0119
        L_0x0101:
            r21 = r3
            r22 = r4
            r4 = r15
            r3 = 0
            if (r9 == 0) goto L_0x0119
            com.google.android.gms.measurement.internal.zzkw r9 = new com.google.android.gms.measurement.internal.zzkw     // Catch:{ all -> 0x057d }
            java.lang.String r14 = "_npa"
            r17 = 0
            java.lang.String r18 = "auto"
            r13 = r9
            r15 = r11
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x057d }
            r1.mo28762u(r9, r2)     // Catch:{ all -> 0x057d }
        L_0x0119:
            c.q.a.c.i.b.l r9 = r1.f11158c     // Catch:{ all -> 0x057d }
            m16229R(r9)     // Catch:{ all -> 0x057d }
            java.lang.String r10 = r2.f14918e     // Catch:{ all -> 0x057d }
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8908j(r10)     // Catch:{ all -> 0x057d }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x057d }
            c.q.a.c.i.b.d6 r9 = r9.mo28387R(r10)     // Catch:{ all -> 0x057d }
            if (r9 == 0) goto L_0x0201
            c.q.a.c.i.b.ga r13 = r24.mo28745g0()     // Catch:{ all -> 0x057d }
            java.lang.String r14 = r2.f14919l     // Catch:{ all -> 0x057d }
            java.lang.String r15 = r9.mo28192i0()     // Catch:{ all -> 0x057d }
            java.lang.String r10 = r2.f14910A     // Catch:{ all -> 0x057d }
            java.lang.String r3 = r9.mo28178b0()     // Catch:{ all -> 0x057d }
            boolean r3 = r13.mo28292b0(r14, r15, r10, r3)     // Catch:{ all -> 0x057d }
            if (r3 == 0) goto L_0x0201
            c.q.a.c.i.b.i3 r3 = r24.mo28487b()     // Catch:{ all -> 0x057d }
            c.q.a.c.i.b.g3 r3 = r3.mo28344w()     // Catch:{ all -> 0x057d }
            java.lang.String r10 = "New GMP App Id passed in. Removing cached database data. appId"
            java.lang.String r13 = r9.mo28182d0()     // Catch:{ all -> 0x057d }
            java.lang.Object r13 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r13)     // Catch:{ all -> 0x057d }
            r3.mo28260b(r10, r13)     // Catch:{ all -> 0x057d }
            c.q.a.c.i.b.l r3 = r1.f11158c     // Catch:{ all -> 0x057d }
            m16229R(r3)     // Catch:{ all -> 0x057d }
            java.lang.String r9 = r9.mo28182d0()     // Catch:{ all -> 0x057d }
            r3.mo28475i()     // Catch:{ all -> 0x057d }
            r3.mo28029h()     // Catch:{ all -> 0x057d }
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8904f(r9)     // Catch:{ all -> 0x057d }
            android.database.sqlite.SQLiteDatabase r10 = r3.mo28385P()     // Catch:{ SQLiteException -> 0x01e9 }
            java.lang.String[] r13 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x01e9 }
            r14 = 0
            r13[r14] = r9     // Catch:{ SQLiteException -> 0x01e9 }
            java.lang.String r14 = "events"
            int r14 = r10.delete(r14, r0, r13)     // Catch:{ SQLiteException -> 0x01e9 }
            java.lang.String r15 = "user_attributes"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01e9 }
            int r14 = r14 + r15
            java.lang.String r15 = "conditional_properties"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01e9 }
            int r14 = r14 + r15
            java.lang.String r15 = "apps"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01e9 }
            int r14 = r14 + r15
            java.lang.String r15 = "raw_events"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01e9 }
            int r14 = r14 + r15
            java.lang.String r15 = "raw_events_metadata"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01e9 }
            int r14 = r14 + r15
            java.lang.String r15 = "event_filters"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01e9 }
            int r14 = r14 + r15
            java.lang.String r15 = "property_filters"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01e9 }
            int r14 = r14 + r15
            java.lang.String r15 = "audience_filter_values"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01e9 }
            int r14 = r14 + r15
            java.lang.String r15 = "consent_settings"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01e9 }
            int r14 = r14 + r15
            p040c.p200q.p201a.p264c.p294g.p335i.C5238qc.m14689b()     // Catch:{ SQLiteException -> 0x01e9 }
            c.q.a.c.i.b.t4 r15 = r3.f10699a     // Catch:{ SQLiteException -> 0x01e9 }
            c.q.a.c.i.b.g r15 = r15.mo28649z()     // Catch:{ SQLiteException -> 0x01e9 }
            c.q.a.c.i.b.t2 r4 = p040c.p200q.p201a.p264c.p340i.p342b.C5658u2.f10996q0     // Catch:{ SQLiteException -> 0x01e9 }
            r23 = r6
            r6 = 0
            boolean r4 = r15.mo28235B(r6, r4)     // Catch:{ SQLiteException -> 0x01e7 }
            if (r4 == 0) goto L_0x01d1
            java.lang.String r4 = "default_event_params"
            int r0 = r10.delete(r4, r0, r13)     // Catch:{ SQLiteException -> 0x01e7 }
            int r14 = r14 + r0
        L_0x01d1:
            if (r14 <= 0) goto L_0x01ff
            c.q.a.c.i.b.t4 r0 = r3.f10699a     // Catch:{ SQLiteException -> 0x01e7 }
            c.q.a.c.i.b.i3 r0 = r0.mo28487b()     // Catch:{ SQLiteException -> 0x01e7 }
            c.q.a.c.i.b.g3 r0 = r0.mo28343v()     // Catch:{ SQLiteException -> 0x01e7 }
            java.lang.String r4 = "Deleted application data. app, records"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r14)     // Catch:{ SQLiteException -> 0x01e7 }
            r0.mo28261c(r4, r9, r6)     // Catch:{ SQLiteException -> 0x01e7 }
            goto L_0x01ff
        L_0x01e7:
            r0 = move-exception
            goto L_0x01ec
        L_0x01e9:
            r0 = move-exception
            r23 = r6
        L_0x01ec:
            c.q.a.c.i.b.t4 r3 = r3.f10699a     // Catch:{ all -> 0x057d }
            c.q.a.c.i.b.i3 r3 = r3.mo28487b()     // Catch:{ all -> 0x057d }
            c.q.a.c.i.b.g3 r3 = r3.mo28339r()     // Catch:{ all -> 0x057d }
            java.lang.String r4 = "Error deleting application data. appId, error"
            java.lang.Object r6 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r9)     // Catch:{ all -> 0x057d }
            r3.mo28261c(r4, r6, r0)     // Catch:{ all -> 0x057d }
        L_0x01ff:
            r9 = 0
            goto L_0x0203
        L_0x0201:
            r23 = r6
        L_0x0203:
            if (r9 == 0) goto L_0x025a
            long r3 = r9.mo28160L()     // Catch:{ all -> 0x057d }
            r13 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x021c
            long r3 = r9.mo28160L()     // Catch:{ all -> 0x057d }
            long r13 = r2.f14927t     // Catch:{ all -> 0x057d }
            int r0 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x021c
            r0 = 1
            goto L_0x021d
        L_0x021c:
            r0 = 0
        L_0x021d:
            java.lang.String r3 = r9.mo28188g0()     // Catch:{ all -> 0x057d }
            long r9 = r9.mo28160L()     // Catch:{ all -> 0x057d }
            r13 = -2147483648(0xffffffff80000000, double:NaN)
            int r4 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r4 != 0) goto L_0x0238
            if (r3 == 0) goto L_0x0238
            java.lang.String r4 = r2.f14920m     // Catch:{ all -> 0x057d }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x057d }
            if (r4 != 0) goto L_0x0238
            r15 = 1
            goto L_0x0239
        L_0x0238:
            r15 = 0
        L_0x0239:
            r0 = r0 | r15
            if (r0 == 0) goto L_0x025a
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x057d }
            r0.<init>()     // Catch:{ all -> 0x057d }
            java.lang.String r4 = "_pv"
            r0.putString(r4, r3)     // Catch:{ all -> 0x057d }
            com.google.android.gms.measurement.internal.zzaw r3 = new com.google.android.gms.measurement.internal.zzaw     // Catch:{ all -> 0x057d }
            com.google.android.gms.measurement.internal.zzau r15 = new com.google.android.gms.measurement.internal.zzau     // Catch:{ all -> 0x057d }
            r15.<init>(r0)     // Catch:{ all -> 0x057d }
            java.lang.String r14 = "_au"
            java.lang.String r16 = "auto"
            r13 = r3
            r17 = r11
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x057d }
            r1.mo28750j(r3, r2)     // Catch:{ all -> 0x057d }
        L_0x025a:
            r24.mo28731S(r25)     // Catch:{ all -> 0x057d }
            if (r8 != 0) goto L_0x026e
            c.q.a.c.i.b.l r0 = r1.f11158c     // Catch:{ all -> 0x057d }
            m16229R(r0)     // Catch:{ all -> 0x057d }
            java.lang.String r3 = r2.f14918e     // Catch:{ all -> 0x057d }
            java.lang.String r4 = "_f"
            c.q.a.c.i.b.r r0 = r0.mo28391V(r3, r4)     // Catch:{ all -> 0x057d }
            r15 = 0
            goto L_0x027c
        L_0x026e:
            c.q.a.c.i.b.l r0 = r1.f11158c     // Catch:{ all -> 0x057d }
            m16229R(r0)     // Catch:{ all -> 0x057d }
            java.lang.String r3 = r2.f14918e     // Catch:{ all -> 0x057d }
            java.lang.String r4 = "_v"
            c.q.a.c.i.b.r r0 = r0.mo28391V(r3, r4)     // Catch:{ all -> 0x057d }
            r15 = 1
        L_0x027c:
            if (r0 != 0) goto L_0x054f
            r3 = 3600000(0x36ee80, double:1.7786363E-317)
            long r8 = r11 / r3
            r13 = 1
            long r8 = r8 + r13
            long r8 = r8 * r3
            java.lang.String r3 = "_dac"
            java.lang.String r4 = "_et"
            java.lang.String r6 = "_r"
            java.lang.String r10 = "_c"
            if (r15 != 0) goto L_0x0507
            com.google.android.gms.measurement.internal.zzkw r0 = new com.google.android.gms.measurement.internal.zzkw     // Catch:{ all -> 0x057d }
            java.lang.String r14 = "_fot"
            java.lang.Long r17 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x057d }
            java.lang.String r18 = "auto"
            r13 = r0
            r15 = r11
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x057d }
            r1.mo28718B(r0, r2)     // Catch:{ all -> 0x057d }
            c.q.a.c.i.b.q4 r0 = r24.mo28486a()     // Catch:{ all -> 0x057d }
            r0.mo28029h()     // Catch:{ all -> 0x057d }
            c.q.a.c.i.b.a4 r0 = r1.f11166k     // Catch:{ all -> 0x057d }
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8908j(r0)     // Catch:{ all -> 0x057d }
            r8 = r0
            c.q.a.c.i.b.a4 r8 = (p040c.p200q.p201a.p264c.p340i.p342b.C5420a4) r8     // Catch:{ all -> 0x057d }
            java.lang.String r0 = r2.f14918e     // Catch:{ all -> 0x057d }
            if (r0 == 0) goto L_0x03a8
            boolean r9 = r0.isEmpty()     // Catch:{ all -> 0x057d }
            if (r9 == 0) goto L_0x02be
            goto L_0x03a8
        L_0x02be:
            c.q.a.c.i.b.t4 r9 = r8.f10315a     // Catch:{ all -> 0x057d }
            c.q.a.c.i.b.q4 r9 = r9.mo28486a()     // Catch:{ all -> 0x057d }
            r9.mo28029h()     // Catch:{ all -> 0x057d }
            boolean r9 = r8.mo28030a()     // Catch:{ all -> 0x057d }
            if (r9 != 0) goto L_0x02de
            c.q.a.c.i.b.t4 r0 = r8.f10315a     // Catch:{ all -> 0x057d }
            c.q.a.c.i.b.i3 r0 = r0.mo28487b()     // Catch:{ all -> 0x057d }
            c.q.a.c.i.b.g3 r0 = r0.mo28342u()     // Catch:{ all -> 0x057d }
            java.lang.String r5 = "Install Referrer Reporter is not available"
            r0.mo28259a(r5)     // Catch:{ all -> 0x057d }
            goto L_0x03b7
        L_0x02de:
            c.q.a.c.i.b.z3 r9 = new c.q.a.c.i.b.z3     // Catch:{ all -> 0x057d }
            r9.<init>(r8, r0)     // Catch:{ all -> 0x057d }
            c.q.a.c.i.b.t4 r0 = r8.f10315a     // Catch:{ all -> 0x057d }
            c.q.a.c.i.b.q4 r0 = r0.mo28486a()     // Catch:{ all -> 0x057d }
            r0.mo28029h()     // Catch:{ all -> 0x057d }
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x057d }
            java.lang.String r13 = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE"
            r0.<init>(r13)     // Catch:{ all -> 0x057d }
            android.content.ComponentName r13 = new android.content.ComponentName     // Catch:{ all -> 0x057d }
            java.lang.String r14 = "com.google.android.finsky.externalreferrer.GetInstallReferrerService"
            r13.<init>(r5, r14)     // Catch:{ all -> 0x057d }
            r0.setComponent(r13)     // Catch:{ all -> 0x057d }
            c.q.a.c.i.b.t4 r13 = r8.f10315a     // Catch:{ all -> 0x057d }
            android.content.Context r13 = r13.mo28490f()     // Catch:{ all -> 0x057d }
            android.content.pm.PackageManager r13 = r13.getPackageManager()     // Catch:{ all -> 0x057d }
            if (r13 != 0) goto L_0x031a
            c.q.a.c.i.b.t4 r0 = r8.f10315a     // Catch:{ all -> 0x057d }
            c.q.a.c.i.b.i3 r0 = r0.mo28487b()     // Catch:{ all -> 0x057d }
            c.q.a.c.i.b.g3 r0 = r0.mo28346y()     // Catch:{ all -> 0x057d }
            java.lang.String r5 = "Failed to obtain Package Manager to verify binding conditions for Install Referrer"
            r0.mo28259a(r5)     // Catch:{ all -> 0x057d }
            goto L_0x03b7
        L_0x031a:
            r14 = 0
            java.util.List r13 = r13.queryIntentServices(r0, r14)     // Catch:{ all -> 0x057d }
            if (r13 == 0) goto L_0x0398
            boolean r15 = r13.isEmpty()     // Catch:{ all -> 0x057d }
            if (r15 != 0) goto L_0x0398
            java.lang.Object r13 = r13.get(r14)     // Catch:{ all -> 0x057d }
            android.content.pm.ResolveInfo r13 = (android.content.pm.ResolveInfo) r13     // Catch:{ all -> 0x057d }
            android.content.pm.ServiceInfo r14 = r13.serviceInfo     // Catch:{ all -> 0x057d }
            if (r14 == 0) goto L_0x03b7
            android.content.pm.ServiceInfo r14 = r13.serviceInfo     // Catch:{ all -> 0x057d }
            java.lang.String r14 = r14.packageName     // Catch:{ all -> 0x057d }
            android.content.pm.ServiceInfo r13 = r13.serviceInfo     // Catch:{ all -> 0x057d }
            java.lang.String r13 = r13.name     // Catch:{ all -> 0x057d }
            if (r13 == 0) goto L_0x0388
            boolean r5 = r5.equals(r14)     // Catch:{ all -> 0x057d }
            if (r5 == 0) goto L_0x0388
            boolean r5 = r8.mo28030a()     // Catch:{ all -> 0x057d }
            if (r5 == 0) goto L_0x0388
            android.content.Intent r5 = new android.content.Intent     // Catch:{ all -> 0x057d }
            r5.<init>(r0)     // Catch:{ all -> 0x057d }
            c.q.a.c.d.m.a r0 = p040c.p200q.p201a.p264c.p276d.p288m.C3548a.m9034b()     // Catch:{ RuntimeException -> 0x0373 }
            c.q.a.c.i.b.t4 r13 = r8.f10315a     // Catch:{ RuntimeException -> 0x0373 }
            android.content.Context r13 = r13.mo28490f()     // Catch:{ RuntimeException -> 0x0373 }
            r14 = 1
            boolean r0 = r0.mo20832a(r13, r5, r9, r14)     // Catch:{ RuntimeException -> 0x0373 }
            c.q.a.c.i.b.t4 r5 = r8.f10315a     // Catch:{ RuntimeException -> 0x0373 }
            c.q.a.c.i.b.i3 r5 = r5.mo28487b()     // Catch:{ RuntimeException -> 0x0373 }
            c.q.a.c.i.b.g3 r5 = r5.mo28343v()     // Catch:{ RuntimeException -> 0x0373 }
            java.lang.String r9 = "Install Referrer Service is"
            java.lang.String r13 = "available"
            java.lang.String r14 = "not available"
            r15 = 1
            if (r15 == r0) goto L_0x036f
            r13 = r14
        L_0x036f:
            r5.mo28260b(r9, r13)     // Catch:{ RuntimeException -> 0x0373 }
            goto L_0x03b7
        L_0x0373:
            r0 = move-exception
            c.q.a.c.i.b.t4 r5 = r8.f10315a     // Catch:{ all -> 0x057d }
            c.q.a.c.i.b.i3 r5 = r5.mo28487b()     // Catch:{ all -> 0x057d }
            c.q.a.c.i.b.g3 r5 = r5.mo28339r()     // Catch:{ all -> 0x057d }
            java.lang.String r8 = "Exception occurred while binding to Install Referrer Service"
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x057d }
            r5.mo28260b(r8, r0)     // Catch:{ all -> 0x057d }
            goto L_0x03b7
        L_0x0388:
            c.q.a.c.i.b.t4 r0 = r8.f10315a     // Catch:{ all -> 0x057d }
            c.q.a.c.i.b.i3 r0 = r0.mo28487b()     // Catch:{ all -> 0x057d }
            c.q.a.c.i.b.g3 r0 = r0.mo28344w()     // Catch:{ all -> 0x057d }
            java.lang.String r5 = "Play Store version 8.3.73 or higher required for Install Referrer"
            r0.mo28259a(r5)     // Catch:{ all -> 0x057d }
            goto L_0x03b7
        L_0x0398:
            c.q.a.c.i.b.t4 r0 = r8.f10315a     // Catch:{ all -> 0x057d }
            c.q.a.c.i.b.i3 r0 = r0.mo28487b()     // Catch:{ all -> 0x057d }
            c.q.a.c.i.b.g3 r0 = r0.mo28342u()     // Catch:{ all -> 0x057d }
            java.lang.String r5 = "Play Service for fetching Install Referrer is unavailable on device"
            r0.mo28259a(r5)     // Catch:{ all -> 0x057d }
            goto L_0x03b7
        L_0x03a8:
            c.q.a.c.i.b.t4 r0 = r8.f10315a     // Catch:{ all -> 0x057d }
            c.q.a.c.i.b.i3 r0 = r0.mo28487b()     // Catch:{ all -> 0x057d }
            c.q.a.c.i.b.g3 r0 = r0.mo28346y()     // Catch:{ all -> 0x057d }
            java.lang.String r5 = "Install Referrer Reporter was called with invalid app package name"
            r0.mo28259a(r5)     // Catch:{ all -> 0x057d }
        L_0x03b7:
            c.q.a.c.i.b.q4 r0 = r24.mo28486a()     // Catch:{ all -> 0x057d }
            r0.mo28029h()     // Catch:{ all -> 0x057d }
            r24.mo28744g()     // Catch:{ all -> 0x057d }
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ all -> 0x057d }
            r5.<init>()     // Catch:{ all -> 0x057d }
            r8 = 1
            r5.putLong(r10, r8)     // Catch:{ all -> 0x057d }
            r5.putLong(r6, r8)     // Catch:{ all -> 0x057d }
            r8 = 0
            r5.putLong(r7, r8)     // Catch:{ all -> 0x057d }
            r6 = r23
            r5.putLong(r6, r8)     // Catch:{ all -> 0x057d }
            r10 = r22
            r5.putLong(r10, r8)     // Catch:{ all -> 0x057d }
            r15 = r21
            r5.putLong(r15, r8)     // Catch:{ all -> 0x057d }
            r8 = 1
            r5.putLong(r4, r8)     // Catch:{ all -> 0x057d }
            boolean r0 = r2.f14933z     // Catch:{ all -> 0x057d }
            if (r0 == 0) goto L_0x03ee
            r5.putLong(r3, r8)     // Catch:{ all -> 0x057d }
        L_0x03ee:
            java.lang.String r0 = r2.f14918e     // Catch:{ all -> 0x057d }
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8908j(r0)     // Catch:{ all -> 0x057d }
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x057d }
            c.q.a.c.i.b.l r0 = r1.f11158c     // Catch:{ all -> 0x057d }
            m16229R(r0)     // Catch:{ all -> 0x057d }
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8904f(r3)     // Catch:{ all -> 0x057d }
            r0.mo28029h()     // Catch:{ all -> 0x057d }
            r0.mo28475i()     // Catch:{ all -> 0x057d }
            java.lang.String r4 = "first_open_count"
            long r8 = r0.mo28381L(r3, r4)     // Catch:{ all -> 0x057d }
            c.q.a.c.i.b.t4 r0 = r1.f11167l     // Catch:{ all -> 0x057d }
            android.content.Context r0 = r0.mo28490f()     // Catch:{ all -> 0x057d }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x057d }
            if (r0 != 0) goto L_0x042b
            c.q.a.c.i.b.i3 r0 = r24.mo28487b()     // Catch:{ all -> 0x057d }
            c.q.a.c.i.b.g3 r0 = r0.mo28339r()     // Catch:{ all -> 0x057d }
            java.lang.String r4 = "PackageManager is null, first open report might be inaccurate. appId"
            java.lang.Object r3 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r3)     // Catch:{ all -> 0x057d }
            r0.mo28260b(r4, r3)     // Catch:{ all -> 0x057d }
        L_0x0427:
            r3 = 0
            goto L_0x04eb
        L_0x042b:
            c.q.a.c.i.b.t4 r0 = r1.f11167l     // Catch:{ NameNotFoundException -> 0x043b }
            android.content.Context r0 = r0.mo28490f()     // Catch:{ NameNotFoundException -> 0x043b }
            c.q.a.c.d.o.b r0 = p040c.p200q.p201a.p264c.p276d.p291o.C3573c.m9110a(r0)     // Catch:{ NameNotFoundException -> 0x043b }
            r4 = 0
            android.content.pm.PackageInfo r0 = r0.mo20847e(r3, r4)     // Catch:{ NameNotFoundException -> 0x043b }
            goto L_0x044e
        L_0x043b:
            r0 = move-exception
            c.q.a.c.i.b.i3 r4 = r24.mo28487b()     // Catch:{ all -> 0x057d }
            c.q.a.c.i.b.g3 r4 = r4.mo28339r()     // Catch:{ all -> 0x057d }
            java.lang.String r13 = "Package info is null, first open report might be inaccurate. appId"
            java.lang.Object r14 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r3)     // Catch:{ all -> 0x057d }
            r4.mo28261c(r13, r14, r0)     // Catch:{ all -> 0x057d }
            r0 = 0
        L_0x044e:
            if (r0 == 0) goto L_0x04a4
            long r13 = r0.firstInstallTime     // Catch:{ all -> 0x057d }
            r16 = 0
            int r4 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r4 == 0) goto L_0x04a4
            long r13 = r0.firstInstallTime     // Catch:{ all -> 0x057d }
            r21 = r3
            long r3 = r0.lastUpdateTime     // Catch:{ all -> 0x057d }
            int r0 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0486
            c.q.a.c.i.b.g r0 = r24.mo28732T()     // Catch:{ all -> 0x057d }
            c.q.a.c.i.b.t2 r3 = p040c.p200q.p201a.p264c.p340i.p342b.C5658u2.f10968c0     // Catch:{ all -> 0x057d }
            r4 = 0
            boolean r0 = r0.mo28235B(r4, r3)     // Catch:{ all -> 0x057d }
            if (r0 == 0) goto L_0x0480
            r13 = 0
            int r0 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x047e
            r13 = 1
            r5.putLong(r7, r13)     // Catch:{ all -> 0x057d }
            r0 = 0
            r8 = 0
            goto L_0x0488
        L_0x047e:
            r0 = 0
            goto L_0x0488
        L_0x0480:
            r13 = 1
            r5.putLong(r7, r13)     // Catch:{ all -> 0x057d }
            goto L_0x047e
        L_0x0486:
            r4 = 0
            r0 = 1
        L_0x0488:
            com.google.android.gms.measurement.internal.zzkw r3 = new com.google.android.gms.measurement.internal.zzkw     // Catch:{ all -> 0x057d }
            java.lang.String r14 = "_fi"
            r7 = 1
            if (r7 == r0) goto L_0x0492
            r16 = 0
            goto L_0x0494
        L_0x0492:
            r16 = 1
        L_0x0494:
            java.lang.Long r17 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x057d }
            java.lang.String r18 = "auto"
            r13 = r3
            r7 = r15
            r15 = r11
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x057d }
            r1.mo28718B(r3, r2)     // Catch:{ all -> 0x057d }
            goto L_0x04a8
        L_0x04a4:
            r21 = r3
            r7 = r15
            r4 = 0
        L_0x04a8:
            c.q.a.c.i.b.t4 r0 = r1.f11167l     // Catch:{ NameNotFoundException -> 0x04bc }
            android.content.Context r0 = r0.mo28490f()     // Catch:{ NameNotFoundException -> 0x04bc }
            c.q.a.c.d.o.b r0 = p040c.p200q.p201a.p264c.p276d.p291o.C3573c.m9110a(r0)     // Catch:{ NameNotFoundException -> 0x04bc }
            r3 = r21
            r13 = 0
            android.content.pm.ApplicationInfo r0 = r0.mo20845c(r3, r13)     // Catch:{ NameNotFoundException -> 0x04ba }
            goto L_0x04d1
        L_0x04ba:
            r0 = move-exception
            goto L_0x04bf
        L_0x04bc:
            r0 = move-exception
            r3 = r21
        L_0x04bf:
            c.q.a.c.i.b.i3 r13 = r24.mo28487b()     // Catch:{ all -> 0x057d }
            c.q.a.c.i.b.g3 r13 = r13.mo28339r()     // Catch:{ all -> 0x057d }
            java.lang.String r14 = "Application info is null, first open report might be inaccurate. appId"
            java.lang.Object r3 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r3)     // Catch:{ all -> 0x057d }
            r13.mo28261c(r14, r3, r0)     // Catch:{ all -> 0x057d }
            r0 = r4
        L_0x04d1:
            if (r0 == 0) goto L_0x0427
            int r3 = r0.flags     // Catch:{ all -> 0x057d }
            r4 = 1
            r3 = r3 & r4
            if (r3 == 0) goto L_0x04de
            r3 = 1
            r5.putLong(r10, r3)     // Catch:{ all -> 0x057d }
        L_0x04de:
            int r0 = r0.flags     // Catch:{ all -> 0x057d }
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0427
            r3 = 1
            r5.putLong(r7, r3)     // Catch:{ all -> 0x057d }
            goto L_0x0427
        L_0x04eb:
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x04f2
            r5.putLong(r6, r8)     // Catch:{ all -> 0x057d }
        L_0x04f2:
            com.google.android.gms.measurement.internal.zzaw r0 = new com.google.android.gms.measurement.internal.zzaw     // Catch:{ all -> 0x057d }
            com.google.android.gms.measurement.internal.zzau r15 = new com.google.android.gms.measurement.internal.zzau     // Catch:{ all -> 0x057d }
            r15.<init>(r5)     // Catch:{ all -> 0x057d }
            java.lang.String r14 = "_f"
            java.lang.String r16 = "auto"
            r13 = r0
            r17 = r11
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x057d }
            r1.mo28753l(r0, r2)     // Catch:{ all -> 0x057d }
            goto L_0x056c
        L_0x0507:
            com.google.android.gms.measurement.internal.zzkw r0 = new com.google.android.gms.measurement.internal.zzkw     // Catch:{ all -> 0x057d }
            java.lang.String r14 = "_fvt"
            java.lang.Long r17 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x057d }
            java.lang.String r18 = "auto"
            r13 = r0
            r15 = r11
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x057d }
            r1.mo28718B(r0, r2)     // Catch:{ all -> 0x057d }
            c.q.a.c.i.b.q4 r0 = r24.mo28486a()     // Catch:{ all -> 0x057d }
            r0.mo28029h()     // Catch:{ all -> 0x057d }
            r24.mo28744g()     // Catch:{ all -> 0x057d }
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x057d }
            r0.<init>()     // Catch:{ all -> 0x057d }
            r7 = 1
            r0.putLong(r10, r7)     // Catch:{ all -> 0x057d }
            r0.putLong(r6, r7)     // Catch:{ all -> 0x057d }
            r0.putLong(r4, r7)     // Catch:{ all -> 0x057d }
            boolean r4 = r2.f14933z     // Catch:{ all -> 0x057d }
            if (r4 == 0) goto L_0x053a
            r0.putLong(r3, r7)     // Catch:{ all -> 0x057d }
        L_0x053a:
            com.google.android.gms.measurement.internal.zzaw r3 = new com.google.android.gms.measurement.internal.zzaw     // Catch:{ all -> 0x057d }
            com.google.android.gms.measurement.internal.zzau r15 = new com.google.android.gms.measurement.internal.zzau     // Catch:{ all -> 0x057d }
            r15.<init>(r0)     // Catch:{ all -> 0x057d }
            java.lang.String r14 = "_v"
            java.lang.String r16 = "auto"
            r13 = r3
            r17 = r11
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x057d }
            r1.mo28753l(r3, r2)     // Catch:{ all -> 0x057d }
            goto L_0x056c
        L_0x054f:
            boolean r0 = r2.f14926s     // Catch:{ all -> 0x057d }
            if (r0 == 0) goto L_0x056c
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x057d }
            r0.<init>()     // Catch:{ all -> 0x057d }
            com.google.android.gms.measurement.internal.zzaw r3 = new com.google.android.gms.measurement.internal.zzaw     // Catch:{ all -> 0x057d }
            com.google.android.gms.measurement.internal.zzau r15 = new com.google.android.gms.measurement.internal.zzau     // Catch:{ all -> 0x057d }
            r15.<init>(r0)     // Catch:{ all -> 0x057d }
            java.lang.String r14 = "_cd"
            java.lang.String r16 = "auto"
            r13 = r3
            r17 = r11
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x057d }
            r1.mo28753l(r3, r2)     // Catch:{ all -> 0x057d }
        L_0x056c:
            c.q.a.c.i.b.l r0 = r1.f11158c     // Catch:{ all -> 0x057d }
            m16229R(r0)     // Catch:{ all -> 0x057d }
            r0.mo28405o()     // Catch:{ all -> 0x057d }
            c.q.a.c.i.b.l r0 = r1.f11158c
            m16229R(r0)
            r0.mo28400f0()
            return
        L_0x057d:
            r0 = move-exception
            c.q.a.c.i.b.l r2 = r1.f11158c
            m16229R(r2)
            r2.mo28400f0()
            throw r0
        L_0x0587:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p340i.p342b.C5709y9.mo28758q(com.google.android.gms.measurement.internal.zzq):void");
    }

    /* renamed from: r */
    public final void mo28759r() {
        this.f11172q++;
    }

    @WorkerThread
    /* renamed from: s */
    public final void mo28760s(zzac zzac) {
        String str = zzac.f14887e;
        C3495o.m8908j(str);
        zzq I = mo28723I(str);
        if (I != null) {
            mo28761t(zzac, I);
        }
    }

    @WorkerThread
    /* renamed from: t */
    public final void mo28761t(zzac zzac, zzq zzq) {
        C3495o.m8908j(zzac);
        C3495o.m8904f(zzac.f14887e);
        C3495o.m8908j(zzac.f14889m);
        C3495o.m8904f(zzac.f14889m.f14904l);
        mo28486a().mo28029h();
        mo28744g();
        if (m16228Q(zzq)) {
            if (zzq.f14925r) {
                C5547l lVar = this.f11158c;
                m16229R(lVar);
                lVar.mo28399e0();
                try {
                    mo28731S(zzq);
                    String str = zzac.f14887e;
                    C3495o.m8908j(str);
                    String str2 = str;
                    C5547l lVar2 = this.f11158c;
                    m16229R(lVar2);
                    zzac S = lVar2.mo28388S(str2, zzac.f14889m.f14904l);
                    if (S != null) {
                        mo28487b().mo28338q().mo28261c("Removing conditional user property", zzac.f14887e, this.f11167l.mo28620D().mo28146f(zzac.f14889m.f14904l));
                        C5547l lVar3 = this.f11158c;
                        m16229R(lVar3);
                        lVar3.mo28379J(str2, zzac.f14889m.f14904l);
                        if (S.f14891o) {
                            C5547l lVar4 = this.f11158c;
                            m16229R(lVar4);
                            lVar4.mo28403m(str2, zzac.f14889m.f14904l);
                        }
                        zzaw zzaw = zzac.f14897u;
                        if (zzaw != null) {
                            zzau zzau = zzaw.f14900l;
                            Bundle R = zzau != null ? zzau.mo33658R() : null;
                            C5498ga g0 = mo28745g0();
                            zzaw zzaw2 = zzac.f14897u;
                            C3495o.m8908j(zzaw2);
                            zzaw w0 = g0.mo28316w0(str2, zzaw2.f14899e, R, S.f14888l, zzac.f14897u.f14902n, true, true);
                            C3495o.m8908j(w0);
                            mo28720D(w0, zzq);
                        }
                    } else {
                        mo28487b().mo28344w().mo28261c("Conditional user property doesn't exist", C5515i3.m15778z(zzac.f14887e), this.f11167l.mo28620D().mo28146f(zzac.f14889m.f14904l));
                    }
                    C5547l lVar5 = this.f11158c;
                    m16229R(lVar5);
                    lVar5.mo28405o();
                } finally {
                    C5547l lVar6 = this.f11158c;
                    m16229R(lVar6);
                    lVar6.mo28400f0();
                }
            } else {
                mo28731S(zzq);
            }
        }
    }

    @WorkerThread
    /* renamed from: u */
    public final void mo28762u(zzkw zzkw, zzq zzq) {
        mo28486a().mo28029h();
        mo28744g();
        if (m16228Q(zzq)) {
            if (!zzq.f14925r) {
                mo28731S(zzq);
            } else if (!"_npa".equals(zzkw.f14904l) || zzq.f14911B == null) {
                mo28487b().mo28338q().mo28260b("Removing user property", this.f11167l.mo28620D().mo28146f(zzkw.f14904l));
                C5547l lVar = this.f11158c;
                m16229R(lVar);
                lVar.mo28399e0();
                try {
                    mo28731S(zzq);
                    if ("_id".equals(zzkw.f14904l)) {
                        C5547l lVar2 = this.f11158c;
                        m16229R(lVar2);
                        String str = zzq.f14918e;
                        C3495o.m8908j(str);
                        lVar2.mo28403m(str, "_lair");
                    }
                    C5547l lVar3 = this.f11158c;
                    m16229R(lVar3);
                    String str2 = zzq.f14918e;
                    C3495o.m8908j(str2);
                    lVar3.mo28403m(str2, zzkw.f14904l);
                    C5547l lVar4 = this.f11158c;
                    m16229R(lVar4);
                    lVar4.mo28405o();
                    mo28487b().mo28338q().mo28260b("User property removed", this.f11167l.mo28620D().mo28146f(zzkw.f14904l));
                } finally {
                    C5547l lVar5 = this.f11158c;
                    m16229R(lVar5);
                    lVar5.mo28400f0();
                }
            } else {
                mo28487b().mo28338q().mo28259a("Falling back to manifest metadata value for ad personalization");
                mo28718B(new zzkw("_npa", mo28488c().mo20838a(), Long.valueOf(true != zzq.f14911B.booleanValue() ? 0 : 1), DebugKt.DEBUG_PROPERTY_VALUE_AUTO), zzq);
            }
        }
    }

    @WorkerThread
    /* renamed from: v */
    public final void mo28763v(zzq zzq) {
        if (this.f11179x != null) {
            ArrayList arrayList = new ArrayList();
            this.f11180y = arrayList;
            arrayList.addAll(this.f11179x);
        }
        C5547l lVar = this.f11158c;
        m16229R(lVar);
        String str = zzq.f14918e;
        C3495o.m8908j(str);
        String str2 = str;
        C3495o.m8904f(str2);
        lVar.mo28029h();
        lVar.mo28475i();
        try {
            SQLiteDatabase P = lVar.mo28385P();
            String[] strArr = {str2};
            int delete = P.delete("apps", "app_id=?", strArr) + P.delete("events", "app_id=?", strArr) + P.delete("user_attributes", "app_id=?", strArr) + P.delete("conditional_properties", "app_id=?", strArr) + P.delete("raw_events", "app_id=?", strArr) + P.delete("raw_events_metadata", "app_id=?", strArr) + P.delete("queue", "app_id=?", strArr) + P.delete("audience_filter_values", "app_id=?", strArr) + P.delete("main_event_params", "app_id=?", strArr) + P.delete("default_event_params", "app_id=?", strArr);
            if (delete > 0) {
                lVar.f10699a.mo28487b().mo28343v().mo28261c("Reset analytics data. app, records", str2, Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            lVar.f10699a.mo28487b().mo28339r().mo28261c("Error resetting analytics data. appId, error", C5515i3.m15778z(str2), e);
        }
        if (zzq.f14925r) {
            mo28758q(zzq);
        }
    }

    @WorkerThread
    /* renamed from: w */
    public final void mo28764w(String str, C5519i7 i7Var) {
        mo28486a().mo28029h();
        String str2 = this.f11154D;
        if (str2 == null || str2.equals(str) || i7Var != null) {
            this.f11154D = str;
            this.f11153C = i7Var;
        }
    }

    @WorkerThread
    /* renamed from: x */
    public final void mo28765x() {
        mo28486a().mo28029h();
        C5547l lVar = this.f11158c;
        m16229R(lVar);
        lVar.mo28402h0();
        if (this.f11164i.f10861g.mo28615a() == 0) {
            this.f11164i.f10861g.mo28616b(mo28488c().mo20838a());
        }
        mo28727M();
    }

    @WorkerThread
    /* renamed from: y */
    public final void mo28766y(zzac zzac) {
        String str = zzac.f14887e;
        C3495o.m8908j(str);
        zzq I = mo28723I(str);
        if (I != null) {
            mo28767z(zzac, I);
        }
    }

    @WorkerThread
    /* renamed from: z */
    public final void mo28767z(zzac zzac, zzq zzq) {
        C3495o.m8908j(zzac);
        C3495o.m8904f(zzac.f14887e);
        C3495o.m8908j(zzac.f14888l);
        C3495o.m8908j(zzac.f14889m);
        C3495o.m8904f(zzac.f14889m.f14904l);
        mo28486a().mo28029h();
        mo28744g();
        if (m16228Q(zzq)) {
            if (!zzq.f14925r) {
                mo28731S(zzq);
                return;
            }
            zzac zzac2 = new zzac(zzac);
            boolean z = false;
            zzac2.f14891o = false;
            C5547l lVar = this.f11158c;
            m16229R(lVar);
            lVar.mo28399e0();
            try {
                C5547l lVar2 = this.f11158c;
                m16229R(lVar2);
                String str = zzac2.f14887e;
                C3495o.m8908j(str);
                zzac S = lVar2.mo28388S(str, zzac2.f14889m.f14904l);
                if (S != null && !S.f14888l.equals(zzac2.f14888l)) {
                    mo28487b().mo28344w().mo28262d("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f11167l.mo28620D().mo28146f(zzac2.f14889m.f14904l), zzac2.f14888l, S.f14888l);
                }
                if (S != null && S.f14891o) {
                    zzac2.f14888l = S.f14888l;
                    zzac2.f14890n = S.f14890n;
                    zzac2.f14894r = S.f14894r;
                    zzac2.f14892p = S.f14892p;
                    zzac2.f14895s = S.f14895s;
                    zzac2.f14891o = true;
                    zzkw zzkw = zzac2.f14889m;
                    zzac2.f14889m = new zzkw(zzkw.f14904l, S.f14889m.f14905m, zzkw.mo33668P(), S.f14889m.f14908p);
                } else if (TextUtils.isEmpty(zzac2.f14892p)) {
                    zzkw zzkw2 = zzac2.f14889m;
                    zzac2.f14889m = new zzkw(zzkw2.f14904l, zzac2.f14890n, zzkw2.mo33668P(), zzac2.f14889m.f14908p);
                    zzac2.f14891o = true;
                    z = true;
                }
                if (zzac2.f14891o) {
                    zzkw zzkw3 = zzac2.f14889m;
                    String str2 = zzac2.f14887e;
                    C3495o.m8908j(str2);
                    String str3 = zzac2.f14888l;
                    String str4 = zzkw3.f14904l;
                    long j = zzkw3.f14905m;
                    Object P = zzkw3.mo33668P();
                    C3495o.m8908j(P);
                    C5450ca caVar = new C5450ca(str2, str3, str4, j, P);
                    C5547l lVar3 = this.f11158c;
                    m16229R(lVar3);
                    if (lVar3.mo28414x(caVar)) {
                        mo28487b().mo28338q().mo28262d("User property updated immediately", zzac2.f14887e, this.f11167l.mo28620D().mo28146f(caVar.f10374c), caVar.f10376e);
                    } else {
                        mo28487b().mo28339r().mo28262d("(2)Too many active user properties, ignoring", C5515i3.m15778z(zzac2.f14887e), this.f11167l.mo28620D().mo28146f(caVar.f10374c), caVar.f10376e);
                    }
                    if (z && zzac2.f14895s != null) {
                        mo28720D(new zzaw(zzac2.f14895s, zzac2.f14890n), zzq);
                    }
                }
                C5547l lVar4 = this.f11158c;
                m16229R(lVar4);
                if (lVar4.mo28413w(zzac2)) {
                    mo28487b().mo28338q().mo28262d("Conditional property added", zzac2.f14887e, this.f11167l.mo28620D().mo28146f(zzac2.f14889m.f14904l), zzac2.f14889m.mo33668P());
                } else {
                    mo28487b().mo28339r().mo28262d("Too many conditional properties, ignoring", C5515i3.m15778z(zzac2.f14887e), this.f11167l.mo28620D().mo28146f(zzac2.f14889m.f14904l), zzac2.f14889m.mo33668P());
                }
                C5547l lVar5 = this.f11158c;
                m16229R(lVar5);
                lVar5.mo28405o();
            } finally {
                C5547l lVar6 = this.f11158c;
                m16229R(lVar6);
                lVar6.mo28400f0();
            }
        }
    }
}
