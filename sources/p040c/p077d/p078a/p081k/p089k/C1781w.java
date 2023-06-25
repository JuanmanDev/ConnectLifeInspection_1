package p040c.p077d.p078a.p081k.p089k;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.browser.browseractions.BrowserServiceFileProvider;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p040c.p077d.p078a.p081k.C1571e;
import p040c.p077d.p078a.p081k.p082i.C1575a;
import p040c.p077d.p078a.p081k.p082i.C1578d;
import p040c.p077d.p078a.p081k.p082i.C1587i;
import p040c.p077d.p078a.p081k.p082i.C1595n;
import p040c.p077d.p078a.p081k.p089k.C1756n;
import p040c.p077d.p078a.p104p.C1936c;

/* renamed from: c.d.a.k.k.w */
/* compiled from: UriLoader */
public class C1781w<Data> implements C1756n<Uri, Data> {

    /* renamed from: b */
    public static final Set<String> f1344b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"file", "android.resource", BrowserServiceFileProvider.CONTENT_SCHEME})));

    /* renamed from: a */
    public final C1784c<Data> f1345a;

    /* renamed from: c.d.a.k.k.w$a */
    /* compiled from: UriLoader */
    public static final class C1782a implements C1758o<Uri, AssetFileDescriptor>, C1784c<AssetFileDescriptor> {

        /* renamed from: a */
        public final ContentResolver f1346a;

        public C1782a(ContentResolver contentResolver) {
            this.f1346a = contentResolver;
        }

        /* renamed from: a */
        public C1578d<AssetFileDescriptor> mo16056a(Uri uri) {
            return new C1575a(this.f1346a, uri);
        }

        /* renamed from: b */
        public C1756n<Uri, AssetFileDescriptor> mo15978b(C1764r rVar) {
            return new C1781w(this);
        }
    }

    /* renamed from: c.d.a.k.k.w$b */
    /* compiled from: UriLoader */
    public static class C1783b implements C1758o<Uri, ParcelFileDescriptor>, C1784c<ParcelFileDescriptor> {

        /* renamed from: a */
        public final ContentResolver f1347a;

        public C1783b(ContentResolver contentResolver) {
            this.f1347a = contentResolver;
        }

        /* renamed from: a */
        public C1578d<ParcelFileDescriptor> mo16056a(Uri uri) {
            return new C1587i(this.f1347a, uri);
        }

        @NonNull
        /* renamed from: b */
        public C1756n<Uri, ParcelFileDescriptor> mo15978b(C1764r rVar) {
            return new C1781w(this);
        }
    }

    /* renamed from: c.d.a.k.k.w$c */
    /* compiled from: UriLoader */
    public interface C1784c<Data> {
        /* renamed from: a */
        C1578d<Data> mo16056a(Uri uri);
    }

    /* renamed from: c.d.a.k.k.w$d */
    /* compiled from: UriLoader */
    public static class C1785d implements C1758o<Uri, InputStream>, C1784c<InputStream> {

        /* renamed from: a */
        public final ContentResolver f1348a;

        public C1785d(ContentResolver contentResolver) {
            this.f1348a = contentResolver;
        }

        /* renamed from: a */
        public C1578d<InputStream> mo16056a(Uri uri) {
            return new C1595n(this.f1348a, uri);
        }

        @NonNull
        /* renamed from: b */
        public C1756n<Uri, InputStream> mo15978b(C1764r rVar) {
            return new C1781w(this);
        }
    }

    public C1781w(C1784c<Data> cVar) {
        this.f1345a = cVar;
    }

    /* renamed from: c */
    public C1756n.C1757a<Data> mo15974b(@NonNull Uri uri, int i, int i2, @NonNull C1571e eVar) {
        return new C1756n.C1757a<>(new C1936c(uri), this.f1345a.mo16056a(uri));
    }

    /* renamed from: d */
    public boolean mo15973a(@NonNull Uri uri) {
        return f1344b.contains(uri.getScheme());
    }
}
