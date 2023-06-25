package p001a.p022e;

import android.content.ContentValues;
import androidx.arch.core.util.Function;
import androidx.sqlite.p031db.SupportSQLiteDatabase;

/* renamed from: a.e.h */
/* compiled from: lambda */
public final /* synthetic */ class C0095h implements Function {

    /* renamed from: a */
    public final /* synthetic */ String f139a;

    /* renamed from: b */
    public final /* synthetic */ int f140b;

    /* renamed from: c */
    public final /* synthetic */ ContentValues f141c;

    /* renamed from: d */
    public final /* synthetic */ String f142d;

    /* renamed from: e */
    public final /* synthetic */ Object[] f143e;

    public /* synthetic */ C0095h(String str, int i, ContentValues contentValues, String str2, Object[] objArr) {
        this.f139a = str;
        this.f140b = i;
        this.f141c = contentValues;
        this.f142d = str2;
        this.f143e = objArr;
    }

    public final Object apply(Object obj) {
        return Integer.valueOf(((SupportSQLiteDatabase) obj).update(this.f139a, this.f140b, this.f141c, this.f142d, this.f143e));
    }
}
