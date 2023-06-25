package p040c.p077d.p078a.p081k.p089k.p090y;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.InputStream;
import p040c.p077d.p078a.p081k.C1571e;
import p040c.p077d.p078a.p081k.p082i.p083o.C1597b;
import p040c.p077d.p078a.p081k.p082i.p083o.C1598c;
import p040c.p077d.p078a.p081k.p089k.C1756n;
import p040c.p077d.p078a.p081k.p089k.C1758o;
import p040c.p077d.p078a.p081k.p089k.C1764r;
import p040c.p077d.p078a.p104p.C1936c;

/* renamed from: c.d.a.k.k.y.c */
/* compiled from: MediaStoreImageThumbLoader */
public class C1792c implements C1756n<Uri, InputStream> {

    /* renamed from: a */
    public final Context f1356a;

    /* renamed from: c.d.a.k.k.y.c$a */
    /* compiled from: MediaStoreImageThumbLoader */
    public static class C1793a implements C1758o<Uri, InputStream> {

        /* renamed from: a */
        public final Context f1357a;

        public C1793a(Context context) {
            this.f1357a = context;
        }

        @NonNull
        /* renamed from: b */
        public C1756n<Uri, InputStream> mo15978b(C1764r rVar) {
            return new C1792c(this.f1357a);
        }
    }

    public C1792c(Context context) {
        this.f1356a = context.getApplicationContext();
    }

    /* renamed from: c */
    public C1756n.C1757a<InputStream> mo15974b(@NonNull Uri uri, int i, int i2, @NonNull C1571e eVar) {
        if (C1597b.m1375d(i, i2)) {
            return new C1756n.C1757a<>(new C1936c(uri), C1598c.m1378f(this.f1356a, uri));
        }
        return null;
    }

    /* renamed from: d */
    public boolean mo15973a(@NonNull Uri uri) {
        return C1597b.m1372a(uri);
    }
}
