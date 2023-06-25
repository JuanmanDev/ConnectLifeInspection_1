package p001a.p022e;

import androidx.arch.core.util.Function;
import androidx.sqlite.p031db.SupportSQLiteDatabase;

/* renamed from: a.e.u0 */
/* compiled from: lambda */
public final /* synthetic */ class C0122u0 implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C0122u0 f175a = new C0122u0();

    private /* synthetic */ C0122u0() {
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(((SupportSQLiteDatabase) obj).isDbLockedByCurrentThread());
    }
}
