package p040c.p077d.p078a.p081k.p082i.p083o;

import android.net.Uri;
import androidx.browser.browseractions.BrowserServiceFileProvider;

/* renamed from: c.d.a.k.i.o.b */
/* compiled from: MediaStoreUtil */
public final class C1597b {
    /* renamed from: a */
    public static boolean m1372a(Uri uri) {
        return m1373b(uri) && !m1376e(uri);
    }

    /* renamed from: b */
    public static boolean m1373b(Uri uri) {
        return uri != null && BrowserServiceFileProvider.CONTENT_SCHEME.equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* renamed from: c */
    public static boolean m1374c(Uri uri) {
        return m1373b(uri) && m1376e(uri);
    }

    /* renamed from: d */
    public static boolean m1375d(int i, int i2) {
        return i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384;
    }

    /* renamed from: e */
    public static boolean m1376e(Uri uri) {
        return uri.getPathSegments().contains("video");
    }
}
