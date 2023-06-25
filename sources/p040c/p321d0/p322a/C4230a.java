package p040c.p321d0.p322a;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import androidx.test.internal.runner.RunnerArgs;
import java.io.File;

/* renamed from: c.d0.a.a */
/* compiled from: Database */
public class C4230a {

    /* renamed from: a */
    public final boolean f9010a;

    /* renamed from: b */
    public final String f9011b;

    /* renamed from: c */
    public final int f9012c;

    /* renamed from: d */
    public final int f9013d;

    /* renamed from: e */
    public SQLiteDatabase f9014e;

    /* renamed from: f */
    public boolean f9015f;

    /* renamed from: c.d0.a.a$a */
    /* compiled from: Database */
    public class C4231a implements DatabaseErrorHandler {
        public C4231a(C4230a aVar) {
        }

        public void onCorruption(SQLiteDatabase sQLiteDatabase) {
        }
    }

    public C4230a(String str, int i, boolean z, int i2) {
        this.f9011b = str;
        this.f9010a = z;
        this.f9012c = i;
        this.f9013d = i2;
    }

    /* renamed from: b */
    public static void m11509b(String str) {
        SQLiteDatabase.deleteDatabase(new File(str));
    }

    /* renamed from: a */
    public void mo25655a() {
        this.f9014e.close();
    }

    /* renamed from: c */
    public SQLiteDatabase mo25656c() {
        return this.f9014e;
    }

    /* renamed from: d */
    public String mo25657d() {
        return "[" + mo25658e() + "] ";
    }

    /* renamed from: e */
    public String mo25658e() {
        Thread currentThread = Thread.currentThread();
        return "" + this.f9012c + RunnerArgs.CLASS_SEPARATOR + currentThread.getName() + "(" + currentThread.getId() + ")";
    }

    /* renamed from: f */
    public SQLiteDatabase mo25659f() {
        return this.f9014e;
    }

    /* renamed from: g */
    public void mo25660g() {
        this.f9014e = SQLiteDatabase.openDatabase(this.f9011b, (SQLiteDatabase.CursorFactory) null, net.sqlcipher.database.SQLiteDatabase.CREATE_IF_NECESSARY);
    }

    /* renamed from: h */
    public void mo25661h() {
        this.f9014e = SQLiteDatabase.openDatabase(this.f9011b, (SQLiteDatabase.CursorFactory) null, 1, new C4231a(this));
    }
}
