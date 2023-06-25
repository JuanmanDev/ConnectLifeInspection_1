package p001a.p022e;

import android.content.ContentValues;
import androidx.arch.core.util.Function;
import androidx.sqlite.p031db.SupportSQLiteDatabase;

/* renamed from: a.e.o */
/* compiled from: lambda */
public final /* synthetic */ class C0109o implements Function {

    /* renamed from: a */
    public final /* synthetic */ String f157a;

    /* renamed from: b */
    public final /* synthetic */ int f158b;

    /* renamed from: c */
    public final /* synthetic */ ContentValues f159c;

    public /* synthetic */ C0109o(String str, int i, ContentValues contentValues) {
        this.f157a = str;
        this.f158b = i;
        this.f159c = contentValues;
    }

    public final Object apply(Object obj) {
        return Long.valueOf(((SupportSQLiteDatabase) obj).insert(this.f157a, this.f158b, this.f159c));
    }
}
