package p001a.p022e;

import androidx.room.QueryInterceptorDatabase;
import androidx.room.QueryInterceptorProgram;
import androidx.sqlite.p031db.SupportSQLiteQuery;

/* renamed from: a.e.x */
/* compiled from: lambda */
public final /* synthetic */ class C0127x implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ QueryInterceptorDatabase f180e;

    /* renamed from: l */
    public final /* synthetic */ SupportSQLiteQuery f181l;

    /* renamed from: m */
    public final /* synthetic */ QueryInterceptorProgram f182m;

    public /* synthetic */ C0127x(QueryInterceptorDatabase queryInterceptorDatabase, SupportSQLiteQuery supportSQLiteQuery, QueryInterceptorProgram queryInterceptorProgram) {
        this.f180e = queryInterceptorDatabase;
        this.f181l = supportSQLiteQuery;
        this.f182m = queryInterceptorProgram;
    }

    public final void run() {
        this.f180e.mo11515m(this.f181l, this.f182m);
    }
}
