package p001a.p022e;

import androidx.arch.core.util.Function;
import androidx.sqlite.p031db.SupportSQLiteDatabase;

/* renamed from: a.e.g */
/* compiled from: lambda */
public final /* synthetic */ class C0093g implements Function {

    /* renamed from: a */
    public final /* synthetic */ String f134a;

    /* renamed from: b */
    public final /* synthetic */ Object[] f135b;

    public /* synthetic */ C0093g(String str, Object[] objArr) {
        this.f134a = str;
        this.f135b = objArr;
    }

    public final Object apply(Object obj) {
        return ((SupportSQLiteDatabase) obj).execSQL(this.f134a, this.f135b);
    }
}
