package p553f.p554a.p588g;

import android.content.Context;
import android.os.Build;

/* renamed from: f.a.g.a */
/* compiled from: PathUtils */
public final class C9167a {
    /* renamed from: a */
    public static String m24869a(Context context) {
        if (Build.VERSION.SDK_INT >= 21) {
            return context.getCodeCacheDir().getPath();
        }
        return context.getCacheDir().getPath();
    }

    /* renamed from: b */
    public static String m24870b(Context context) {
        return context.getDir("flutter", 0).getPath();
    }

    /* renamed from: c */
    public static String m24871c(Context context) {
        return context.getFilesDir().getPath();
    }
}
