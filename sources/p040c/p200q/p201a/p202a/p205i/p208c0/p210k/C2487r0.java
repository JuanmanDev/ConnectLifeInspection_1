package p040c.p200q.p201a.p202a.p205i.p208c0.p210k;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p040c.p200q.p201a.p202a.C2350b;
import p040c.p200q.p201a.p202a.p205i.C2526i;
import p040c.p200q.p201a.p202a.p205i.C2527j;
import p040c.p200q.p201a.p202a.p205i.C2538q;
import p040c.p200q.p201a.p202a.p205i.p206a0.C2396a;
import p040c.p200q.p201a.p202a.p205i.p211d0.C2507a;
import p040c.p200q.p201a.p202a.p205i.p212e0.C2512a;
import p040c.p200q.p201a.p202a.p205i.p213f0.C2523a;
import p040c.p200q.p201a.p202a.p205i.p217z.p218a.C2567a;
import p040c.p200q.p201a.p202a.p205i.p217z.p218a.C2569b;
import p040c.p200q.p201a.p202a.p205i.p217z.p218a.C2571c;
import p040c.p200q.p201a.p202a.p205i.p217z.p218a.C2573d;
import p040c.p200q.p201a.p202a.p205i.p217z.p218a.C2575e;
import p625h.p626a.C9381a;

@WorkerThread
/* renamed from: c.q.a.a.i.c0.k.r0 */
/* compiled from: SQLiteEventStore */
public class C2487r0 implements C2467j0, C2507a, C2465i0 {

    /* renamed from: p */
    public static final C2350b f2898p = C2350b.m4027b("proto");

    /* renamed from: e */
    public final C2495t0 f2899e;

    /* renamed from: l */
    public final C2512a f2900l;

    /* renamed from: m */
    public final C2512a f2901m;

    /* renamed from: n */
    public final C2469k0 f2902n;

    /* renamed from: o */
    public final C9381a<String> f2903o;

    /* renamed from: c.q.a.a.i.c0.k.r0$b */
    /* compiled from: SQLiteEventStore */
    public interface C2489b<T, U> {
        U apply(T t);
    }

    /* renamed from: c.q.a.a.i.c0.k.r0$c */
    /* compiled from: SQLiteEventStore */
    public static class C2490c {

        /* renamed from: a */
        public final String f2904a;

        /* renamed from: b */
        public final String f2905b;

        public C2490c(String str, String str2) {
            this.f2904a = str;
            this.f2905b = str2;
        }
    }

    /* renamed from: c.q.a.a.i.c0.k.r0$d */
    /* compiled from: SQLiteEventStore */
    public interface C2491d<T> {
        /* renamed from: a */
        T mo17851a();
    }

    public C2487r0(C2512a aVar, C2512a aVar2, C2469k0 k0Var, C2495t0 t0Var, C9381a<String> aVar3) {
        this.f2899e = t0Var;
        this.f2900l = aVar;
        this.f2901m = aVar2;
        this.f2902n = k0Var;
        this.f2903o = aVar3;
    }

    /* renamed from: A */
    public static /* synthetic */ Long m4367A(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    /* renamed from: B */
    public static /* synthetic */ C2575e m4368B(long j, Cursor cursor) {
        cursor.moveToNext();
        long j2 = cursor.getLong(0);
        C2575e.C2576a c = C2575e.m4628c();
        c.mo18044c(j2);
        c.mo18043b(j);
        return c.mo18042a();
    }

    /* renamed from: C */
    public static /* synthetic */ C2575e m4369C(long j, SQLiteDatabase sQLiteDatabase) {
        return (C2575e) m4381g0(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new C2481p(j));
    }

    /* renamed from: D */
    public static /* synthetic */ Long m4370D(Cursor cursor) {
        if (!cursor.moveToNext()) {
            return null;
        }
        return Long.valueOf(cursor.getLong(0));
    }

    /* renamed from: G */
    public static /* synthetic */ List m4371G(SQLiteDatabase sQLiteDatabase) {
        return (List) m4381g0(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), C2446a.f2841a);
    }

    /* renamed from: J */
    public static /* synthetic */ List m4372J(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            C2538q.C2539a a = C2538q.m4531a();
            a.mo17949b(cursor.getString(1));
            a.mo17951d(C2523a.m4482b(cursor.getInt(2)));
            a.mo17950c(m4378a0(cursor.getString(3)));
            arrayList.add(a.mo17948a());
        }
        return arrayList;
    }

    /* renamed from: P */
    public static /* synthetic */ Object m4373P(Map map, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j), set);
            }
            set.add(new C2490c(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    /* renamed from: R */
    public static /* synthetic */ byte[] m4374R(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i += blob.length;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            byte[] bArr2 = (byte[]) arrayList.get(i3);
            System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
            i2 += bArr2.length;
        }
        return bArr;
    }

    /* renamed from: U */
    public static /* synthetic */ Boolean m4375U(Cursor cursor) {
        return Boolean.valueOf(cursor.getCount() > 0);
    }

    /* renamed from: V */
    public static /* synthetic */ Object m4376V(String str, LogEventDropped.Reason reason, long j, SQLiteDatabase sQLiteDatabase) {
        if (!((Boolean) m4381g0(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(reason.getNumber())}), C2484q.f2896a)).booleanValue()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(reason.getNumber()));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", (String) null, contentValues);
        } else {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(reason.getNumber())});
        }
        return null;
    }

    /* renamed from: W */
    public static /* synthetic */ Object m4377W(long j, C2538q qVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{qVar.mo17943b(), String.valueOf(C2523a.m4481a(qVar.mo17945d()))}) < 1) {
            contentValues.put("backend_name", qVar.mo17943b());
            contentValues.put("priority", Integer.valueOf(C2523a.m4481a(qVar.mo17945d())));
            sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
        }
        return null;
    }

    /* renamed from: a0 */
    public static byte[] m4378a0(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    /* renamed from: e0 */
    public static C2350b m4379e0(@Nullable String str) {
        if (str == null) {
            return f2898p;
        }
        return C2350b.m4027b(str);
    }

    /* renamed from: f0 */
    public static String m4380f0(Iterable<C2485q0> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<C2485q0> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().mo17867c());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    @VisibleForTesting
    /* renamed from: g0 */
    public static <T> T m4381g0(Cursor cursor, C2489b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    /* renamed from: y */
    public static /* synthetic */ Object m4383y(Throwable th) {
        throw new SynchronizationException("Timed out while trying to acquire the lock.", th);
    }

    /* renamed from: z */
    public static /* synthetic */ SQLiteDatabase m4384z(Throwable th) {
        throw new SynchronizationException("Timed out while trying to open db.", th);
    }

    @Nullable
    /* renamed from: E */
    public C2485q0 mo17875E(C2538q qVar, C2527j jVar) {
        C2396a.m4209c("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", qVar.mo17945d(), jVar.mo17788j(), qVar.mo17943b());
        long longValue = ((Long) mo17914q(new C2468k(this, jVar, qVar))).longValue();
        if (longValue < 1) {
            return null;
        }
        return C2485q0.m4362a(longValue, qVar, jVar);
    }

    /* renamed from: F */
    public /* synthetic */ Boolean mo17888F(C2538q qVar, SQLiteDatabase sQLiteDatabase) {
        Long o = mo17913o(sQLiteDatabase, qVar);
        if (o == null) {
            return Boolean.FALSE;
        }
        return (Boolean) m4381g0(mo17909i().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{o.toString()}), C2457f0.f2862a);
    }

    /* renamed from: H */
    public long mo17876H(C2538q qVar) {
        return ((Long) m4381g0(mo17909i().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{qVar.mo17943b(), String.valueOf(C2523a.m4481a(qVar.mo17945d()))}), C2501x.f2931a)).longValue();
    }

    /* renamed from: I */
    public boolean mo17877I(C2538q qVar) {
        return ((Boolean) mo17914q(new C2450c(this, qVar))).booleanValue();
    }

    /* renamed from: K */
    public /* synthetic */ List mo17889K(C2538q qVar, SQLiteDatabase sQLiteDatabase) {
        List<C2485q0> Y = mo17897Y(sQLiteDatabase, qVar, this.f2902n.mo17854d());
        for (Priority priority : Priority.values()) {
            if (priority != qVar.mo17945d()) {
                int d = this.f2902n.mo17854d() - Y.size();
                if (d <= 0) {
                    break;
                }
                Y.addAll(mo17897Y(sQLiteDatabase, qVar.mo17980f(priority), d));
            }
        }
        return mo17916s(Y, mo17898Z(sQLiteDatabase, Y));
    }

    /* renamed from: L */
    public void mo17878L(Iterable<C2485q0> iterable) {
        if (iterable.iterator().hasNext()) {
            mo17914q(new C2454e(this, "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + m4380f0(iterable), "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name"));
        }
    }

    /* renamed from: M */
    public /* synthetic */ C2567a mo17890M(Map map, C2567a.C2568a aVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            LogEventDropped.Reason e = mo17904e(cursor.getInt(1));
            long j = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            LogEventDropped.C3991a c = LogEventDropped.m10206c();
            c.mo23897c(e);
            c.mo23896b(j);
            ((List) map.get(string)).add(c.mo23895a());
        }
        mo17900b0(aVar, map);
        aVar.mo18026e(mo17912n());
        aVar.mo18025d(mo17910j());
        aVar.mo18024c(this.f2903o.get());
        return aVar.mo18023b();
    }

    /* renamed from: N */
    public /* synthetic */ C2567a mo17891N(String str, Map map, C2567a.C2568a aVar, SQLiteDatabase sQLiteDatabase) {
        return (C2567a) m4381g0(sQLiteDatabase.rawQuery(str, new String[0]), new C2448b(this, map, aVar));
    }

    /* renamed from: O */
    public /* synthetic */ Object mo17892O(List list, C2538q qVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            boolean z = false;
            long j = cursor.getLong(0);
            if (cursor.getInt(7) != 0) {
                z = true;
            }
            C2527j.C2528a a = C2527j.m4486a();
            a.mo17797j(cursor.getString(1));
            a.mo17796i(cursor.getLong(2));
            a.mo17798k(cursor.getLong(3));
            if (z) {
                a.mo17795h(new C2526i(m4379e0(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                a.mo17795h(new C2526i(m4379e0(cursor.getString(4)), mo17901c0(j)));
            }
            if (!cursor.isNull(6)) {
                a.mo17794g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(C2485q0.m4362a(j, qVar, a.mo17791d()));
        }
        return null;
    }

    /* renamed from: Q */
    public /* synthetic */ Long mo17893Q(C2527j jVar, C2538q qVar, SQLiteDatabase sQLiteDatabase) {
        if (mo17915r()) {
            mo17874d(1, LogEventDropped.Reason.CACHE_FULL, jVar.mo17788j());
            return -1L;
        }
        long g = mo17906g(sQLiteDatabase, qVar);
        int e = this.f2902n.mo17855e();
        byte[] a = jVar.mo17784e().mo17961a();
        boolean z = a.length <= e;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(g));
        contentValues.put("transport_name", jVar.mo17788j());
        contentValues.put("timestamp_ms", Long.valueOf(jVar.mo17786f()));
        contentValues.put("uptime_ms", Long.valueOf(jVar.mo17789k()));
        contentValues.put("payload_encoding", jVar.mo17784e().mo17962b().mo17655a());
        contentValues.put("code", jVar.mo17783d());
        contentValues.put("num_attempts", 0);
        contentValues.put("inline", Boolean.valueOf(z));
        contentValues.put("payload", z ? a : new byte[0]);
        long insert = sQLiteDatabase.insert("events", (String) null, contentValues);
        if (!z) {
            int ceil = (int) Math.ceil(((double) a.length) / ((double) e));
            for (int i = 1; i <= ceil; i++) {
                byte[] copyOfRange = Arrays.copyOfRange(a, (i - 1) * e, Math.min(i * e, a.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", (String) null, contentValues2);
            }
        }
        for (Map.Entry next : jVar.mo17969i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put("name", (String) next.getKey());
            contentValues3.put("value", (String) next.getValue());
            sQLiteDatabase.insert("event_metadata", (String) null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    /* renamed from: S */
    public /* synthetic */ Object mo17894S(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i = cursor.getInt(0);
            mo17874d((long) i, LogEventDropped.Reason.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    /* renamed from: T */
    public /* synthetic */ Object mo17895T(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        m4381g0(sQLiteDatabase.rawQuery(str2, (String[]) null), new C2502y(this));
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    /* renamed from: X */
    public /* synthetic */ Object mo17896X(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f2900l.mo17952a()).execute();
        return null;
    }

    /* renamed from: Y */
    public final List<C2485q0> mo17897Y(SQLiteDatabase sQLiteDatabase, C2538q qVar, int i) {
        ArrayList arrayList = new ArrayList();
        Long o = mo17913o(sQLiteDatabase, qVar);
        if (o == null) {
            return arrayList;
        }
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        m4381g0(sQLiteDatabase2.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{o.toString()}, (String) null, (String) null, (String) null, String.valueOf(i)), new C2462h(this, arrayList, qVar));
        return arrayList;
    }

    /* renamed from: Z */
    public final Map<Long, Set<C2490c>> mo17898Z(SQLiteDatabase sQLiteDatabase, List<C2485q0> list) {
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).mo17867c());
            if (i < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        m4381g0(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), (String[]) null, (String) null, (String) null, (String) null), new C2473m(hashMap));
        return hashMap;
    }

    /* renamed from: a */
    public void mo17872a() {
        mo17914q(new C2466j(this));
    }

    /* renamed from: b */
    public <T> T mo17899b(C2507a.C2508a<T> aVar) {
        SQLiteDatabase i = mo17909i();
        mo17905f(i);
        try {
            T execute = aVar.execute();
            i.setTransactionSuccessful();
            return execute;
        } finally {
            i.endTransaction();
        }
    }

    /* renamed from: b0 */
    public final void mo17900b0(C2567a.C2568a aVar, Map<String, List<LogEventDropped>> map) {
        for (Map.Entry next : map.entrySet()) {
            C2571c.C2572a c = C2571c.m4616c();
            c.mo18034c((String) next.getKey());
            c.mo18033b((List) next.getValue());
            aVar.mo18022a(c.mo18032a());
        }
    }

    /* renamed from: c */
    public C2567a mo17873c() {
        return (C2567a) mo17914q(new C2452d(this, "SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new HashMap(), C2567a.m4601e()));
    }

    /* renamed from: c0 */
    public final byte[] mo17901c0(long j) {
        return (byte[]) m4381g0(mo17909i().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, (String) null, (String) null, "sequence_num"), C2471l.f2886a);
    }

    public void close() {
        this.f2899e.close();
    }

    /* renamed from: d */
    public void mo17874d(long j, LogEventDropped.Reason reason, String str) {
        mo17914q(new C2456f(str, reason, j));
    }

    /* renamed from: d0 */
    public final <T> T mo17903d0(C2491d<T> dVar, C2489b<Throwable, T> bVar) {
        long a = this.f2901m.mo17952a();
        while (true) {
            try {
                return dVar.mo17851a();
            } catch (SQLiteDatabaseLockedException e) {
                if (this.f2901m.mo17952a() >= ((long) this.f2902n.mo17852b()) + a) {
                    return bVar.apply(e);
                }
                SystemClock.sleep(50);
            }
        }
    }

    /* renamed from: e */
    public final LogEventDropped.Reason mo17904e(int i) {
        if (i == LogEventDropped.Reason.REASON_UNKNOWN.getNumber()) {
            return LogEventDropped.Reason.REASON_UNKNOWN;
        }
        if (i == LogEventDropped.Reason.MESSAGE_TOO_OLD.getNumber()) {
            return LogEventDropped.Reason.MESSAGE_TOO_OLD;
        }
        if (i == LogEventDropped.Reason.CACHE_FULL.getNumber()) {
            return LogEventDropped.Reason.CACHE_FULL;
        }
        if (i == LogEventDropped.Reason.PAYLOAD_TOO_BIG.getNumber()) {
            return LogEventDropped.Reason.PAYLOAD_TOO_BIG;
        }
        if (i == LogEventDropped.Reason.MAX_RETRIES_REACHED.getNumber()) {
            return LogEventDropped.Reason.MAX_RETRIES_REACHED;
        }
        if (i == LogEventDropped.Reason.INVALID_PAYLOD.getNumber()) {
            return LogEventDropped.Reason.INVALID_PAYLOD;
        }
        if (i == LogEventDropped.Reason.SERVER_ERROR.getNumber()) {
            return LogEventDropped.Reason.SERVER_ERROR;
        }
        C2396a.m4208b("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i));
        return LogEventDropped.Reason.REASON_UNKNOWN;
    }

    /* renamed from: f */
    public final void mo17905f(SQLiteDatabase sQLiteDatabase) {
        mo17903d0(new C2486r(sQLiteDatabase), C2497u.f2924a);
    }

    /* renamed from: g */
    public final long mo17906g(SQLiteDatabase sQLiteDatabase, C2538q qVar) {
        Long o = mo17913o(sQLiteDatabase, qVar);
        if (o != null) {
            return o.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", qVar.mo17943b());
        contentValues.put("priority", Integer.valueOf(C2523a.m4481a(qVar.mo17945d())));
        contentValues.put("next_request_ms", 0);
        if (qVar.mo17944c() != null) {
            contentValues.put("extras", Base64.encodeToString(qVar.mo17944c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
    }

    public final long getPageSize() {
        return mo17909i().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    @VisibleForTesting
    /* renamed from: h */
    public long mo17908h() {
        return mo17911m() * getPageSize();
    }

    @VisibleForTesting
    /* renamed from: i */
    public SQLiteDatabase mo17909i() {
        C2495t0 t0Var = this.f2899e;
        Objects.requireNonNull(t0Var);
        return (SQLiteDatabase) mo17903d0(new C2455e0(t0Var), C2492s.f2906a);
    }

    /* renamed from: j */
    public final C2569b mo17910j() {
        C2569b.C2570a b = C2569b.m4612b();
        C2573d.C2574a c = C2573d.m4622c();
        c.mo18038b(mo17908h());
        c.mo18039c(C2469k0.f2885a.mo17857f());
        b.mo18029b(c.mo18037a());
        return b.mo18028a();
    }

    /* renamed from: k */
    public int mo17879k() {
        return ((Integer) mo17914q(new C2478o(this, this.f2900l.mo17952a() - this.f2902n.mo17853c()))).intValue();
    }

    /* renamed from: l */
    public void mo17880l(Iterable<C2485q0> iterable) {
        if (iterable.iterator().hasNext()) {
            mo17909i().compileStatement("DELETE FROM events WHERE _id in " + m4380f0(iterable)).execute();
        }
    }

    /* renamed from: m */
    public final long mo17911m() {
        return mo17909i().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    /* renamed from: n */
    public final C2575e mo17912n() {
        return (C2575e) mo17914q(new C2499v(this.f2900l.mo17952a()));
    }

    @Nullable
    /* renamed from: o */
    public final Long mo17913o(SQLiteDatabase sQLiteDatabase, C2538q qVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{qVar.mo17943b(), String.valueOf(C2523a.m4481a(qVar.mo17945d()))}));
        if (qVar.mo17944c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(qVar.mo17944c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) m4381g0(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), (String) null, (String) null, (String) null), C2476n.f2889a);
    }

    /* renamed from: p */
    public Iterable<C2485q0> mo17881p(C2538q qVar) {
        return (Iterable) mo17914q(new C2500w(this, qVar));
    }

    @VisibleForTesting
    /* renamed from: q */
    public <T> T mo17914q(C2489b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase i = mo17909i();
        i.beginTransaction();
        try {
            T apply = bVar.apply(i);
            i.setTransactionSuccessful();
            return apply;
        } finally {
            i.endTransaction();
        }
    }

    /* renamed from: r */
    public final boolean mo17915r() {
        return mo17911m() * getPageSize() >= this.f2902n.mo17857f();
    }

    /* renamed from: s */
    public final List<C2485q0> mo17916s(List<C2485q0> list, Map<Long, Set<C2490c>> map) {
        ListIterator<C2485q0> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            C2485q0 next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.mo17867c()))) {
                C2527j.C2528a l = next.mo17866b().mo17970l();
                for (C2490c cVar : map.get(Long.valueOf(next.mo17867c()))) {
                    l.mo17973c(cVar.f2904a, cVar.f2905b);
                }
                listIterator.set(C2485q0.m4362a(next.mo17867c(), next.mo17868d(), l.mo17791d()));
            }
        }
        return list;
    }

    /* renamed from: t */
    public void mo17882t(C2538q qVar, long j) {
        mo17914q(new C2494t(j, qVar));
    }

    /* renamed from: u */
    public /* synthetic */ Object mo17917u(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i = cursor.getInt(0);
            mo17874d((long) i, LogEventDropped.Reason.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    /* renamed from: v */
    public Iterable<C2538q> mo17883v() {
        return (Iterable) mo17914q(C2464i.f2880a);
    }

    /* renamed from: w */
    public /* synthetic */ Integer mo17918w(long j, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j)};
        m4381g0(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new C2458g(this));
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }
}
