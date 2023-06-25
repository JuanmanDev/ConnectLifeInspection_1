package p040c.p126i.p127a;

import androidx.test.internal.runner.RunnerArgs;
import java.io.File;
import net.sqlcipher.DatabaseErrorHandler;
import net.sqlcipher.database.SQLiteDatabase;
import net.sqlcipher.database.SQLiteDatabaseHook;

/* renamed from: c.i.a.a */
/* compiled from: Database */
public class C2005a {

    /* renamed from: a */
    public final boolean f1687a;

    /* renamed from: b */
    public final String f1688b;

    /* renamed from: c */
    public final String f1689c;

    /* renamed from: d */
    public final int f1690d;

    /* renamed from: e */
    public final int f1691e;

    /* renamed from: f */
    public SQLiteDatabase f1692f;

    /* renamed from: g */
    public boolean f1693g;

    /* renamed from: c.i.a.a$a */
    /* compiled from: Database */
    public class C2006a implements DatabaseErrorHandler {
        public C2006a(C2005a aVar) {
        }

        public void onCorruption(SQLiteDatabase sQLiteDatabase) {
        }
    }

    /* renamed from: c.i.a.a$b */
    /* compiled from: Database */
    public class C2007b implements SQLiteDatabaseHook {
        public C2007b(C2005a aVar) {
        }

        public void postKey(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.rawExecSQL("PRAGMA cipher_migrate;");
        }

        public void preKey(SQLiteDatabase sQLiteDatabase) {
        }
    }

    public C2005a(String str, String str2, int i, boolean z, int i2) {
        this.f1688b = str;
        this.f1689c = str2 == null ? "" : str2;
        this.f1687a = z;
        this.f1690d = i;
        this.f1691e = i2;
    }

    /* renamed from: b */
    public static void m2675b(String str) {
        File file = new File(str);
        file.delete();
        new File(file.getPath() + "-journal").delete();
        new File(file.getPath() + "-shm").delete();
        new File(file.getPath() + "-wal").delete();
    }

    /* renamed from: a */
    public void mo16566a() {
        this.f1692f.close();
    }

    /* renamed from: c */
    public SQLiteDatabase mo16567c() {
        return this.f1692f;
    }

    /* renamed from: d */
    public String mo16568d() {
        return "[" + mo16569e() + "] ";
    }

    /* renamed from: e */
    public String mo16569e() {
        Thread currentThread = Thread.currentThread();
        return "" + this.f1690d + RunnerArgs.CLASS_SEPARATOR + currentThread.getName() + "(" + currentThread.getId() + ")";
    }

    /* renamed from: f */
    public SQLiteDatabase mo16570f() {
        return this.f1692f;
    }

    /* renamed from: g */
    public void mo16571g() {
        mo16573i(SQLiteDatabase.CREATE_IF_NECESSARY);
    }

    /* renamed from: h */
    public void mo16572h() {
        mo16574j(1, new C2006a(this));
    }

    /* renamed from: i */
    public final void mo16573i(int i) {
        mo16574j(i, (DatabaseErrorHandler) null);
    }

    /* renamed from: j */
    public final void mo16574j(int i, DatabaseErrorHandler databaseErrorHandler) {
        try {
            this.f1692f = SQLiteDatabase.openDatabase(this.f1688b, this.f1689c, (SQLiteDatabase.CursorFactory) null, i, (SQLiteDatabaseHook) null, databaseErrorHandler);
        } catch (Exception unused) {
            "Opening db in " + this.f1688b + " with PRAGMA cipher_migrate";
            this.f1692f = SQLiteDatabase.openDatabase(this.f1688b, this.f1689c, (SQLiteDatabase.CursorFactory) null, i, (SQLiteDatabaseHook) new C2007b(this), databaseErrorHandler);
        }
    }
}
