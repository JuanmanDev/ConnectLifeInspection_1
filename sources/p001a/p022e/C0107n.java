package p001a.p022e;

import androidx.arch.core.util.Function;
import androidx.sqlite.p031db.SupportSQLiteDatabase;

/* renamed from: a.e.n */
/* compiled from: lambda */
public final /* synthetic */ class C0107n implements Function {

    /* renamed from: a */
    public final /* synthetic */ int f155a;

    public /* synthetic */ C0107n(int i) {
        this.f155a = i;
    }

    public final Object apply(Object obj) {
        return ((SupportSQLiteDatabase) obj).setVersion(this.f155a);
    }
}
