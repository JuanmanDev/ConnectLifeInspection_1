package p040c.p313b0.p314a.p317d;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: c.b0.a.d.d */
/* compiled from: CredentialDatabaseHelper */
public class C4161d extends SQLiteOpenHelper {
    public C4161d(Context context) {
        super(context, "CredentialDatabase.db", (SQLiteDatabase.CursorFactory) null, 2);
    }

    /* renamed from: a */
    public void mo25499a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS protection_space");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS credential");
        onCreate(sQLiteDatabase);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE protection_space (_id INTEGER PRIMARY KEY,host TEXT NOT NULL,protocol TEXT,realm TEXT,port INTEGER,UNIQUE(host, protocol, realm, port));");
        sQLiteDatabase.execSQL("CREATE TABLE credential (_id INTEGER PRIMARY KEY,username TEXT NOT NULL,password TEXT NOT NULL,protection_space_id INTEGER NOT NULL,UNIQUE(username, password, protection_space_id),FOREIGN KEY (protection_space_id) REFERENCES protection_space (_id) ON DELETE CASCADE);");
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        onUpgrade(sQLiteDatabase, i, i2);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS protection_space");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS credential");
        onCreate(sQLiteDatabase);
    }
}
