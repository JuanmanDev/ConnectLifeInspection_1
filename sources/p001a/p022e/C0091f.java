package p001a.p022e;

import androidx.arch.core.util.Function;
import androidx.sqlite.p031db.SupportSQLiteDatabase;

/* renamed from: a.e.f */
/* compiled from: lambda */
public final /* synthetic */ class C0091f implements Function {

    /* renamed from: a */
    public final /* synthetic */ long f132a;

    public /* synthetic */ C0091f(long j) {
        this.f132a = j;
    }

    public final Object apply(Object obj) {
        return ((SupportSQLiteDatabase) obj).setPageSize(this.f132a);
    }
}
