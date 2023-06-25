package p040c.p200q.p201a.p202a.p205i.p208c0.p210k;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.util.Arrays;
import java.util.List;

/* renamed from: c.q.a.a.i.c0.k.t0 */
/* compiled from: SchemaManager */
public final class C2495t0 extends SQLiteOpenHelper {

    /* renamed from: m */
    public static final String f2914m = ("INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")");

    /* renamed from: n */
    public static int f2915n = 5;

    /* renamed from: o */
    public static final C2496a f2916o = C2449b0.f2846a;

    /* renamed from: p */
    public static final C2496a f2917p = C2453d0.f2854a;

    /* renamed from: q */
    public static final C2496a f2918q = C2447a0.f2842a;

    /* renamed from: r */
    public static final C2496a f2919r = C2503z.f2933a;

    /* renamed from: s */
    public static final C2496a f2920s;

    /* renamed from: t */
    public static final List<C2496a> f2921t;

    /* renamed from: e */
    public final int f2922e;

    /* renamed from: l */
    public boolean f2923l = false;

    /* renamed from: c.q.a.a.i.c0.k.t0$a */
    /* compiled from: SchemaManager */
    public interface C2496a {
        /* renamed from: a */
        void mo17850a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        C2451c0 c0Var = C2451c0.f2849a;
        f2920s = c0Var;
        f2921t = Arrays.asList(new C2496a[]{f2916o, f2917p, f2918q, f2919r, c0Var});
    }

    public C2495t0(Context context, String str, int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.f2922e = i;
    }

    /* renamed from: b */
    public static /* synthetic */ void m4430b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    /* renamed from: c */
    public static /* synthetic */ void m4431c(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    /* renamed from: e */
    public static /* synthetic */ void m4433e(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    /* renamed from: f */
    public static /* synthetic */ void m4434f(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(f2914m);
    }

    /* renamed from: a */
    public final void mo17920a(SQLiteDatabase sQLiteDatabase) {
        if (!this.f2923l) {
            onConfigure(sQLiteDatabase);
        }
    }

    /* renamed from: g */
    public final void mo17921g(SQLiteDatabase sQLiteDatabase, int i) {
        mo17920a(sQLiteDatabase);
        mo17922h(sQLiteDatabase, 0, i);
    }

    /* renamed from: h */
    public final void mo17922h(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i2 <= f2921t.size()) {
            while (i < i2) {
                f2921t.get(i).mo17850a(sQLiteDatabase);
                i++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i + " to " + i2 + " was requested, but cannot be performed. Only " + f2921t.size() + " migrations are provided");
    }

    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f2923l = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        if (Build.VERSION.SDK_INT >= 16) {
            sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        mo17921g(sQLiteDatabase, this.f2922e);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        mo17921g(sQLiteDatabase, i2);
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        mo17920a(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        mo17920a(sQLiteDatabase);
        mo17922h(sQLiteDatabase, i, i2);
    }
}
