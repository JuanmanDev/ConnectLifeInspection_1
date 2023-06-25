package p040c.p077d.p078a.p081k.p089k.p090y;

import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p040c.p077d.p078a.p081k.C1571e;
import p040c.p077d.p078a.p081k.p089k.C1743g;
import p040c.p077d.p078a.p081k.p089k.C1756n;
import p040c.p077d.p078a.p081k.p089k.C1758o;
import p040c.p077d.p078a.p081k.p089k.C1764r;

/* renamed from: c.d.a.k.k.y.b */
/* compiled from: HttpUriLoader */
public class C1790b implements C1756n<Uri, InputStream> {

    /* renamed from: b */
    public static final Set<String> f1354b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));

    /* renamed from: a */
    public final C1756n<C1743g, InputStream> f1355a;

    /* renamed from: c.d.a.k.k.y.b$a */
    /* compiled from: HttpUriLoader */
    public static class C1791a implements C1758o<Uri, InputStream> {
        @NonNull
        /* renamed from: b */
        public C1756n<Uri, InputStream> mo15978b(C1764r rVar) {
            return new C1790b(rVar.mo16042d(C1743g.class, InputStream.class));
        }
    }

    public C1790b(C1756n<C1743g, InputStream> nVar) {
        this.f1355a = nVar;
    }

    /* renamed from: c */
    public C1756n.C1757a<InputStream> mo15974b(@NonNull Uri uri, int i, int i2, @NonNull C1571e eVar) {
        return this.f1355a.mo15974b(new C1743g(uri.toString()), i, i2, eVar);
    }

    /* renamed from: d */
    public boolean mo15973a(@NonNull Uri uri) {
        return f1354b.contains(uri.getScheme());
    }
}
