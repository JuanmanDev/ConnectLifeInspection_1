package p001a.p022e;

import androidx.arch.core.util.Function;
import androidx.sqlite.p031db.SupportSQLiteDatabase;

/* renamed from: a.e.q */
/* compiled from: lambda */
public final /* synthetic */ class C0113q implements Function {

    /* renamed from: a */
    public final /* synthetic */ String f165a;

    public /* synthetic */ C0113q(String str) {
        this.f165a = str;
    }

    public final Object apply(Object obj) {
        return ((SupportSQLiteDatabase) obj).execSQL(this.f165a);
    }
}
