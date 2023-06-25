package p040c.p200q.p201a.p202a.p205i.p208c0.p210k;

import android.database.sqlite.SQLiteDatabase;
import p040c.p200q.p201a.p202a.p205i.p208c0.p210k.C2495t0;

/* renamed from: c.q.a.a.i.c0.k.a0 */
/* compiled from: lambda */
public final /* synthetic */ class C2447a0 implements C2495t0.C2496a {

    /* renamed from: a */
    public static final /* synthetic */ C2447a0 f2842a = new C2447a0();

    private /* synthetic */ C2447a0() {
    }

    /* renamed from: a */
    public final void mo17850a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}
