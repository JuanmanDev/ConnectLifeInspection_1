package p040c.p077d.p078a.p081k.p091l.p094e;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.juconnect.vivino.global.UrlConstKt;
import java.util.List;
import p040c.p077d.p078a.p081k.C1571e;
import p040c.p077d.p078a.p081k.C1572f;
import p040c.p077d.p078a.p081k.p084j.C1685u;

/* renamed from: c.d.a.k.l.e.d */
/* compiled from: ResourceDrawableDecoder */
public class C1847d implements C1572f<Uri, Drawable> {

    /* renamed from: a */
    public final Context f1435a;

    public C1847d(Context context) {
        this.f1435a = context.getApplicationContext();
    }

    @Nullable
    /* renamed from: c */
    public C1685u<Drawable> mo15621b(@NonNull Uri uri, int i, int i2, @NonNull C1571e eVar) {
        Context d = mo16144d(uri, uri.getAuthority());
        return C1846c.m2151f(C1844a.m2145b(this.f1435a, d, mo16147g(d, uri)));
    }

    @NonNull
    /* renamed from: d */
    public final Context mo16144d(Uri uri, String str) {
        if (str.equals(this.f1435a.getPackageName())) {
            return this.f1435a;
        }
        try {
            return this.f1435a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            if (str.contains(this.f1435a.getPackageName())) {
                return this.f1435a;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e);
        }
    }

    @DrawableRes
    /* renamed from: e */
    public final int mo16145e(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e);
        }
    }

    @DrawableRes
    /* renamed from: f */
    public final int mo16146f(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, UrlConstKt.APP_PLATFORM);
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: " + uri);
    }

    @DrawableRes
    /* renamed from: g */
    public final int mo16147g(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return mo16146f(context, uri);
        }
        if (pathSegments.size() == 1) {
            return mo16145e(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    /* renamed from: h */
    public boolean mo15620a(@NonNull Uri uri, @NonNull C1571e eVar) {
        return uri.getScheme().equals("android.resource");
    }
}
