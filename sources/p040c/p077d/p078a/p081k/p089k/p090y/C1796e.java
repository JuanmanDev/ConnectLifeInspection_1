package p040c.p077d.p078a.p081k.p089k.p090y;

import androidx.annotation.NonNull;
import java.io.InputStream;
import java.net.URL;
import p040c.p077d.p078a.p081k.C1571e;
import p040c.p077d.p078a.p081k.p089k.C1743g;
import p040c.p077d.p078a.p081k.p089k.C1756n;
import p040c.p077d.p078a.p081k.p089k.C1758o;
import p040c.p077d.p078a.p081k.p089k.C1764r;

/* renamed from: c.d.a.k.k.y.e */
/* compiled from: UrlLoader */
public class C1796e implements C1756n<URL, InputStream> {

    /* renamed from: a */
    public final C1756n<C1743g, InputStream> f1360a;

    /* renamed from: c.d.a.k.k.y.e$a */
    /* compiled from: UrlLoader */
    public static class C1797a implements C1758o<URL, InputStream> {
        @NonNull
        /* renamed from: b */
        public C1756n<URL, InputStream> mo15978b(C1764r rVar) {
            return new C1796e(rVar.mo16042d(C1743g.class, InputStream.class));
        }
    }

    public C1796e(C1756n<C1743g, InputStream> nVar) {
        this.f1360a = nVar;
    }

    /* renamed from: c */
    public C1756n.C1757a<InputStream> mo15974b(@NonNull URL url, int i, int i2, @NonNull C1571e eVar) {
        return this.f1360a.mo15974b(new C1743g(url), i, i2, eVar);
    }

    /* renamed from: d */
    public boolean mo15973a(@NonNull URL url) {
        return true;
    }
}
