package p001a.p022e;

import androidx.arch.core.util.Function;
import androidx.sqlite.p031db.SupportSQLiteDatabase;

/* renamed from: a.e.r0 */
/* compiled from: lambda */
public final /* synthetic */ class C0116r0 implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C0116r0 f168a = new C0116r0();

    private /* synthetic */ C0116r0() {
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(((SupportSQLiteDatabase) obj).yieldIfContendedSafely());
    }
}
