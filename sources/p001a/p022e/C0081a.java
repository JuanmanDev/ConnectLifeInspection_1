package p001a.p022e;

import androidx.arch.core.util.Function;
import androidx.sqlite.p031db.SupportSQLiteStatement;

/* renamed from: a.e.a */
/* compiled from: lambda */
public final /* synthetic */ class C0081a implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C0081a f118a = new C0081a();

    private /* synthetic */ C0081a() {
    }

    public final Object apply(Object obj) {
        return Integer.valueOf(((SupportSQLiteStatement) obj).executeUpdateDelete());
    }
}
