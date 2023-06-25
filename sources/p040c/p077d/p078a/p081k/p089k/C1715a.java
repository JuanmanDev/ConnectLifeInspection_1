package p040c.p077d.p078a.p081k.p089k;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import java.io.InputStream;
import p040c.p077d.p078a.p081k.C1571e;
import p040c.p077d.p078a.p081k.p082i.C1578d;
import p040c.p077d.p078a.p081k.p082i.C1586h;
import p040c.p077d.p078a.p081k.p082i.C1594m;
import p040c.p077d.p078a.p081k.p089k.C1756n;
import p040c.p077d.p078a.p104p.C1936c;

/* renamed from: c.d.a.k.k.a */
/* compiled from: AssetUriLoader */
public class C1715a<Data> implements C1756n<Uri, Data> {

    /* renamed from: c */
    public static final int f1265c = 22;

    /* renamed from: a */
    public final AssetManager f1266a;

    /* renamed from: b */
    public final C1716a<Data> f1267b;

    /* renamed from: c.d.a.k.k.a$a */
    /* compiled from: AssetUriLoader */
    public interface C1716a<Data> {
        /* renamed from: a */
        C1578d<Data> mo15977a(AssetManager assetManager, String str);
    }

    /* renamed from: c.d.a.k.k.a$b */
    /* compiled from: AssetUriLoader */
    public static class C1717b implements C1758o<Uri, ParcelFileDescriptor>, C1716a<ParcelFileDescriptor> {

        /* renamed from: a */
        public final AssetManager f1268a;

        public C1717b(AssetManager assetManager) {
            this.f1268a = assetManager;
        }

        /* renamed from: a */
        public C1578d<ParcelFileDescriptor> mo15977a(AssetManager assetManager, String str) {
            return new C1586h(assetManager, str);
        }

        @NonNull
        /* renamed from: b */
        public C1756n<Uri, ParcelFileDescriptor> mo15978b(C1764r rVar) {
            return new C1715a(this.f1268a, this);
        }
    }

    /* renamed from: c.d.a.k.k.a$c */
    /* compiled from: AssetUriLoader */
    public static class C1718c implements C1758o<Uri, InputStream>, C1716a<InputStream> {

        /* renamed from: a */
        public final AssetManager f1269a;

        public C1718c(AssetManager assetManager) {
            this.f1269a = assetManager;
        }

        /* renamed from: a */
        public C1578d<InputStream> mo15977a(AssetManager assetManager, String str) {
            return new C1594m(assetManager, str);
        }

        @NonNull
        /* renamed from: b */
        public C1756n<Uri, InputStream> mo15978b(C1764r rVar) {
            return new C1715a(this.f1269a, this);
        }
    }

    public C1715a(AssetManager assetManager, C1716a<Data> aVar) {
        this.f1266a = assetManager;
        this.f1267b = aVar;
    }

    /* renamed from: c */
    public C1756n.C1757a<Data> mo15974b(@NonNull Uri uri, int i, int i2, @NonNull C1571e eVar) {
        return new C1756n.C1757a<>(new C1936c(uri), this.f1267b.mo15977a(this.f1266a, uri.toString().substring(f1265c)));
    }

    /* renamed from: d */
    public boolean mo15973a(@NonNull Uri uri) {
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }
}
