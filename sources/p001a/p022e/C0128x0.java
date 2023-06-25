package p001a.p022e;

import androidx.arch.core.util.Function;
import androidx.sqlite.p031db.SupportSQLiteDatabase;

/* renamed from: a.e.x0 */
/* compiled from: lambda */
public final /* synthetic */ class C0128x0 implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C0128x0 f183a = new C0128x0();

    private /* synthetic */ C0128x0() {
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(((SupportSQLiteDatabase) obj).isDatabaseIntegrityOk());
    }
}
