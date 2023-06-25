package p001a.p022e;

import androidx.arch.core.util.Function;
import androidx.sqlite.p031db.SupportSQLiteDatabase;

/* renamed from: a.e.w */
/* compiled from: lambda */
public final /* synthetic */ class C0125w implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C0125w f178a = new C0125w();

    private /* synthetic */ C0125w() {
    }

    public final Object apply(Object obj) {
        return Long.valueOf(((SupportSQLiteDatabase) obj).getPageSize());
    }
}
