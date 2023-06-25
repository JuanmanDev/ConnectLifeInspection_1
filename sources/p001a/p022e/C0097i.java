package p001a.p022e;

import androidx.arch.core.util.Function;
import androidx.room.AutoClosingRoomOpenHelper;
import androidx.sqlite.p031db.SupportSQLiteDatabase;

/* renamed from: a.e.i */
/* compiled from: lambda */
public final /* synthetic */ class C0097i implements Function {

    /* renamed from: a */
    public final /* synthetic */ boolean f145a;

    public /* synthetic */ C0097i(boolean z) {
        this.f145a = z;
    }

    public final Object apply(Object obj) {
        return AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.m108h(this.f145a, (SupportSQLiteDatabase) obj);
    }
}
