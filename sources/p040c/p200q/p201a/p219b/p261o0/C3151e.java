package p040c.p200q.p201a.p219b.p261o0;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* renamed from: c.q.a.b.o0.e */
/* compiled from: Assertions */
public final class C3151e {
    /* renamed from: a */
    public static void m7753a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static void m7754b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: c */
    public static int m7755c(int i, int i2, int i3) {
        if (i >= i2 && i < i3) {
            return i;
        }
        throw new IndexOutOfBoundsException();
    }

    @EnsuresNonNull({"#1"})
    /* renamed from: d */
    public static String m7756d(@Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException();
    }

    @EnsuresNonNull({"#1"})
    /* renamed from: e */
    public static <T> T m7757e(@Nullable T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    @EnsuresNonNull({"#1"})
    /* renamed from: f */
    public static <T> T m7758f(@Nullable T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: g */
    public static void m7759g(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: h */
    public static void m7760h(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
