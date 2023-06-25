package p001a.p022e;

import androidx.arch.core.util.Function;
import androidx.sqlite.p031db.SupportSQLiteDatabase;

/* renamed from: a.e.l */
/* compiled from: lambda */
public final /* synthetic */ class C0103l implements Function {

    /* renamed from: a */
    public final /* synthetic */ long f151a;

    public /* synthetic */ C0103l(long j) {
        this.f151a = j;
    }

    public final Object apply(Object obj) {
        return Long.valueOf(((SupportSQLiteDatabase) obj).setMaximumSize(this.f151a));
    }
}
