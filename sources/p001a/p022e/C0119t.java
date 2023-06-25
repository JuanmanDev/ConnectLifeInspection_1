package p001a.p022e;

import androidx.arch.core.util.Function;
import androidx.sqlite.p031db.SupportSQLiteDatabase;

/* renamed from: a.e.t */
/* compiled from: lambda */
public final /* synthetic */ class C0119t implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C0119t f172a = new C0119t();

    private /* synthetic */ C0119t() {
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(((SupportSQLiteDatabase) obj).isReadOnly());
    }
}
