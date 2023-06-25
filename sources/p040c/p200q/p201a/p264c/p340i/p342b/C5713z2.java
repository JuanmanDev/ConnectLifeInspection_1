package p040c.p200q.p201a.p264c.p340i.p342b;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.WorkerThread;
import androidx.core.app.NotificationCompat;

/* renamed from: c.q.a.c.i.b.z2 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5713z2 extends SQLiteOpenHelper {

    /* renamed from: e */
    public final /* synthetic */ C5431b3 f11187e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5713z2(C5431b3 b3Var, Context context, String str) {
        super(context, "google_app_measurement_local.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f11187e = b3Var;
    }

    @WorkerThread
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e) {
            throw e;
        } catch (SQLiteException unused) {
            this.f11187e.f10699a.mo28487b().mo28339r().mo28259a("Opening the local database failed, dropping and recreating it");
            this.f11187e.f10699a.mo28649z();
            if (!this.f11187e.f10699a.mo28490f().getDatabasePath("google_app_measurement_local.db").delete()) {
                this.f11187e.f10699a.mo28487b().mo28339r().mo28260b("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e2) {
                this.f11187e.f10699a.mo28487b().mo28339r().mo28260b("Failed to open local database. Events will bypass local storage", e2);
                return null;
            }
        }
    }

    @WorkerThread
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C5559m.m15890b(this.f11187e.f10699a.mo28487b(), sQLiteDatabase);
    }

    @WorkerThread
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @WorkerThread
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        C5559m.m15889a(this.f11187e.f10699a.mo28487b(), sQLiteDatabase, NotificationCompat.CarExtender.KEY_MESSAGES, "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", (String[]) null);
    }

    @WorkerThread
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
