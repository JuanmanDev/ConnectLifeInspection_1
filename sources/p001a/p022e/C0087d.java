package p001a.p022e;

import androidx.arch.core.util.Function;
import androidx.sqlite.p031db.SupportSQLiteDatabase;

/* renamed from: a.e.d */
/* compiled from: lambda */
public final /* synthetic */ class C0087d implements Function {

    /* renamed from: a */
    public final /* synthetic */ int f128a;

    public /* synthetic */ C0087d(int i) {
        this.f128a = i;
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(((SupportSQLiteDatabase) obj).needUpgrade(this.f128a));
    }
}
