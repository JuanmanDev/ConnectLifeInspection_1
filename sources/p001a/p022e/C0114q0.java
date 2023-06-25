package p001a.p022e;

import androidx.arch.core.util.Function;
import androidx.sqlite.p031db.SupportSQLiteDatabase;

/* renamed from: a.e.q0 */
/* compiled from: lambda */
public final /* synthetic */ class C0114q0 implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C0114q0 f166a = new C0114q0();

    private /* synthetic */ C0114q0() {
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(((SupportSQLiteDatabase) obj).inTransaction());
    }
}
