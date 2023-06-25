package p001a.p022e;

import androidx.arch.core.util.Function;
import androidx.sqlite.p031db.SupportSQLiteDatabase;

/* renamed from: a.e.p */
/* compiled from: lambda */
public final /* synthetic */ class C0111p implements Function {

    /* renamed from: a */
    public final /* synthetic */ String f161a;

    /* renamed from: b */
    public final /* synthetic */ String f162b;

    /* renamed from: c */
    public final /* synthetic */ Object[] f163c;

    public /* synthetic */ C0111p(String str, String str2, Object[] objArr) {
        this.f161a = str;
        this.f162b = str2;
        this.f163c = objArr;
    }

    public final Object apply(Object obj) {
        return Integer.valueOf(((SupportSQLiteDatabase) obj).delete(this.f161a, this.f162b, this.f163c));
    }
}
