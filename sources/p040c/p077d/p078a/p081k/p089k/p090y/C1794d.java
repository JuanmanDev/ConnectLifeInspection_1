package p040c.p077d.p078a.p081k.p089k.p090y;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.InputStream;
import p040c.p077d.p078a.p081k.C1571e;
import p040c.p077d.p078a.p081k.p082i.p083o.C1597b;
import p040c.p077d.p078a.p081k.p082i.p083o.C1598c;
import p040c.p077d.p078a.p081k.p089k.C1756n;
import p040c.p077d.p078a.p081k.p089k.C1758o;
import p040c.p077d.p078a.p081k.p089k.C1764r;
import p040c.p077d.p078a.p081k.p091l.p092c.C1834x;
import p040c.p077d.p078a.p104p.C1936c;

/* renamed from: c.d.a.k.k.y.d */
/* compiled from: MediaStoreVideoThumbLoader */
public class C1794d implements C1756n<Uri, InputStream> {

    /* renamed from: a */
    public final Context f1358a;

    /* renamed from: c.d.a.k.k.y.d$a */
    /* compiled from: MediaStoreVideoThumbLoader */
    public static class C1795a implements C1758o<Uri, InputStream> {

        /* renamed from: a */
        public final Context f1359a;

        public C1795a(Context context) {
            this.f1359a = context;
        }

        @NonNull
        /* renamed from: b */
        public C1756n<Uri, InputStream> mo15978b(C1764r rVar) {
            return new C1794d(this.f1359a);
        }
    }

    public C1794d(Context context) {
        this.f1358a = context.getApplicationContext();
    }

    @Nullable
    /* renamed from: c */
    public C1756n.C1757a<InputStream> mo15974b(@NonNull Uri uri, int i, int i2, @NonNull C1571e eVar) {
        if (!C1597b.m1375d(i, i2) || !mo16067e(eVar)) {
            return null;
        }
        return new C1756n.C1757a<>(new C1936c(uri), C1598c.m1379g(this.f1358a, uri));
    }

    /* renamed from: d */
    public boolean mo15973a(@NonNull Uri uri) {
        return C1597b.m1374c(uri);
    }

    /* renamed from: e */
    public final boolean mo16067e(C1571e eVar) {
        Long l = (Long) eVar.mo15616c(C1834x.f1423d);
        return l != null && l.longValue() == -1;
    }
}
