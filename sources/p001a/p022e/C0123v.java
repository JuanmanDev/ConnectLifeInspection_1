package p001a.p022e;

import androidx.arch.core.util.Function;
import androidx.sqlite.p031db.SupportSQLiteStatement;

/* renamed from: a.e.v */
/* compiled from: lambda */
public final /* synthetic */ class C0123v implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C0123v f176a = new C0123v();

    private /* synthetic */ C0123v() {
    }

    public final Object apply(Object obj) {
        return Long.valueOf(((SupportSQLiteStatement) obj).executeInsert());
    }
}
