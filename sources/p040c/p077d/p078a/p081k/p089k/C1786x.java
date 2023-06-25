package p040c.p077d.p078a.p081k.p089k;

import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p040c.p077d.p078a.p081k.C1571e;
import p040c.p077d.p078a.p081k.p089k.C1756n;

/* renamed from: c.d.a.k.k.x */
/* compiled from: UrlUriLoader */
public class C1786x<Data> implements C1756n<Uri, Data> {

    /* renamed from: b */
    public static final Set<String> f1349b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));

    /* renamed from: a */
    public final C1756n<C1743g, Data> f1350a;

    /* renamed from: c.d.a.k.k.x$a */
    /* compiled from: UrlUriLoader */
    public static class C1787a implements C1758o<Uri, InputStream> {
        @NonNull
        /* renamed from: b */
        public C1756n<Uri, InputStream> mo15978b(C1764r rVar) {
            return new C1786x(rVar.mo16042d(C1743g.class, InputStream.class));
        }
    }

    public C1786x(C1756n<C1743g, Data> nVar) {
        this.f1350a = nVar;
    }

    /* renamed from: c */
    public C1756n.C1757a<Data> mo15974b(@NonNull Uri uri, int i, int i2, @NonNull C1571e eVar) {
        return this.f1350a.mo15974b(new C1743g(uri.toString()), i, i2, eVar);
    }

    /* renamed from: d */
    public boolean mo15973a(@NonNull Uri uri) {
        return f1349b.contains(uri.getScheme());
    }
}
