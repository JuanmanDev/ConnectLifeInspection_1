package p001a.p022e;

import androidx.arch.core.util.Function;
import androidx.sqlite.p031db.SupportSQLiteDatabase;

/* renamed from: a.e.m */
/* compiled from: lambda */
public final /* synthetic */ class C0105m implements Function {

    /* renamed from: a */
    public final /* synthetic */ int f153a;

    public /* synthetic */ C0105m(int i) {
        this.f153a = i;
    }

    public final Object apply(Object obj) {
        return ((SupportSQLiteDatabase) obj).setMaxSqlCacheSize(this.f153a);
    }
}
