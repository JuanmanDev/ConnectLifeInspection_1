package p001a.p022e;

import androidx.arch.core.util.Function;
import androidx.sqlite.p031db.SupportSQLiteDatabase;

/* renamed from: a.e.s0 */
/* compiled from: lambda */
public final /* synthetic */ class C0118s0 implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C0118s0 f171a = new C0118s0();

    private /* synthetic */ C0118s0() {
    }

    public final Object apply(Object obj) {
        return Integer.valueOf(((SupportSQLiteDatabase) obj).getVersion());
    }
}
