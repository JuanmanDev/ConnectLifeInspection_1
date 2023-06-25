package p001a.p022e;

import androidx.room.QueryInterceptorDatabase;
import java.util.List;

/* renamed from: a.e.b0 */
/* compiled from: lambda */
public final /* synthetic */ class C0084b0 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ QueryInterceptorDatabase f123e;

    /* renamed from: l */
    public final /* synthetic */ String f124l;

    /* renamed from: m */
    public final /* synthetic */ List f125m;

    public /* synthetic */ C0084b0(QueryInterceptorDatabase queryInterceptorDatabase, String str, List list) {
        this.f123e = queryInterceptorDatabase;
        this.f124l = str;
        this.f125m = list;
    }

    public final void run() {
        this.f123e.mo11511g(this.f124l, this.f125m);
    }
}
