package p001a.p022e;

import androidx.arch.core.util.Function;
import androidx.sqlite.p031db.SupportSQLiteStatement;

/* renamed from: a.e.t0 */
/* compiled from: lambda */
public final /* synthetic */ class C0120t0 implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C0120t0 f173a = new C0120t0();

    private /* synthetic */ C0120t0() {
    }

    public final Object apply(Object obj) {
        return Long.valueOf(((SupportSQLiteStatement) obj).simpleQueryForLong());
    }
}
