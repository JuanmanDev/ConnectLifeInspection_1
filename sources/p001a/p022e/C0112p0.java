package p001a.p022e;

import androidx.arch.core.util.Function;
import androidx.room.RoomDatabase;
import androidx.sqlite.p031db.SupportSQLiteDatabase;

/* renamed from: a.e.p0 */
/* compiled from: lambda */
public final /* synthetic */ class C0112p0 implements Function {

    /* renamed from: a */
    public final /* synthetic */ RoomDatabase f164a;

    public /* synthetic */ C0112p0(RoomDatabase roomDatabase) {
        this.f164a = roomDatabase;
    }

    public final Object apply(Object obj) {
        return this.f164a.mo11541b((SupportSQLiteDatabase) obj);
    }
}
