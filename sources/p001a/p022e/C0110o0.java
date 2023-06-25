package p001a.p022e;

import androidx.arch.core.util.Function;
import androidx.room.RoomDatabase;
import androidx.sqlite.p031db.SupportSQLiteDatabase;

/* renamed from: a.e.o0 */
/* compiled from: lambda */
public final /* synthetic */ class C0110o0 implements Function {

    /* renamed from: a */
    public final /* synthetic */ RoomDatabase f160a;

    public /* synthetic */ C0110o0(RoomDatabase roomDatabase) {
        this.f160a = roomDatabase;
    }

    public final Object apply(Object obj) {
        return this.f160a.mo11538a((SupportSQLiteDatabase) obj);
    }
}
