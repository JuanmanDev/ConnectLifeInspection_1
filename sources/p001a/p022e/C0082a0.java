package p001a.p022e;

import androidx.room.QueryInterceptorDatabase;
import androidx.room.QueryInterceptorProgram;
import androidx.sqlite.p031db.SupportSQLiteQuery;

/* renamed from: a.e.a0 */
/* compiled from: lambda */
public final /* synthetic */ class C0082a0 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ QueryInterceptorDatabase f119e;

    /* renamed from: l */
    public final /* synthetic */ SupportSQLiteQuery f120l;

    /* renamed from: m */
    public final /* synthetic */ QueryInterceptorProgram f121m;

    public /* synthetic */ C0082a0(QueryInterceptorDatabase queryInterceptorDatabase, SupportSQLiteQuery supportSQLiteQuery, QueryInterceptorProgram queryInterceptorProgram) {
        this.f119e = queryInterceptorDatabase;
        this.f120l = supportSQLiteQuery;
        this.f121m = queryInterceptorProgram;
    }

    public final void run() {
        this.f119e.mo11514j(this.f120l, this.f121m);
    }
}
