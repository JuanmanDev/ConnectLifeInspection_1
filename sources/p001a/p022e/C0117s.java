package p001a.p022e;

import androidx.arch.core.util.Function;
import androidx.room.AutoClosingRoomOpenHelper;
import androidx.sqlite.p031db.SupportSQLiteDatabase;

/* renamed from: a.e.s */
/* compiled from: lambda */
public final /* synthetic */ class C0117s implements Function {

    /* renamed from: a */
    public final /* synthetic */ AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement f169a;

    /* renamed from: b */
    public final /* synthetic */ Function f170b;

    public /* synthetic */ C0117s(AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement autoClosingSupportSqliteStatement, Function function) {
        this.f169a = autoClosingSupportSqliteStatement;
        this.f170b = function;
    }

    public final Object apply(Object obj) {
        return this.f169a.mo11310b(this.f170b, (SupportSQLiteDatabase) obj);
    }
}
