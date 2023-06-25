package p040c.p200q.p201a.p219b.p239i0;

import android.net.Uri;
import java.io.InputStream;
import java.util.List;
import p040c.p200q.p201a.p219b.p239i0.C2846b;
import p040c.p200q.p201a.p219b.p260n0.C3138t;

/* renamed from: c.q.a.b.i0.c */
/* compiled from: FilteringManifestParser */
public final class C2847c<T extends C2846b<T>> implements C3138t.C3139a<T> {

    /* renamed from: a */
    public final C3138t.C3139a<T> f4455a;

    /* renamed from: b */
    public final List<C2848d> f4456b;

    public C2847c(C3138t.C3139a<T> aVar, List<C2848d> list) {
        this.f4455a = aVar;
        this.f4456b = list;
    }

    /* renamed from: b */
    public T mo18948a(Uri uri, InputStream inputStream) {
        T t = (C2846b) this.f4455a.mo18948a(uri, inputStream);
        List<C2848d> list = this.f4456b;
        return (list == null || list.isEmpty()) ? t : (C2846b) t.mo18947a(this.f4456b);
    }
}
