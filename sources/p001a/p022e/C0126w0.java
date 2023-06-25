package p001a.p022e;

import androidx.arch.core.util.Function;
import androidx.sqlite.p031db.SupportSQLiteDatabase;

/* renamed from: a.e.w0 */
/* compiled from: lambda */
public final /* synthetic */ class C0126w0 implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C0126w0 f179a = new C0126w0();

    private /* synthetic */ C0126w0() {
    }

    public final Object apply(Object obj) {
        return Long.valueOf(((SupportSQLiteDatabase) obj).getMaximumSize());
    }
}
