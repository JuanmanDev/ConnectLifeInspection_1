package p040c.p200q.p201a.p264c.p276d.p289n;

import android.util.Base64;
import androidx.annotation.NonNull;

/* renamed from: c.q.a.c.d.n.c */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C3552c {
    @NonNull
    /* renamed from: a */
    public static byte[] m9054a(@NonNull String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 10);
    }

    @NonNull
    /* renamed from: b */
    public static byte[] m9055b(@NonNull String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 11);
    }

    @NonNull
    /* renamed from: c */
    public static String m9056c(@NonNull byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 0);
    }

    @NonNull
    /* renamed from: d */
    public static String m9057d(@NonNull byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 10);
    }

    @NonNull
    /* renamed from: e */
    public static String m9058e(@NonNull byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }
}
