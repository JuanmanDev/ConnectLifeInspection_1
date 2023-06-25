package p040c.p077d.p078a.p105q;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collection;

/* renamed from: c.d.a.q.i */
/* compiled from: Preconditions */
public final class C1949i {
    /* renamed from: a */
    public static void m2560a(boolean z, @NonNull String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    @NonNull
    /* renamed from: b */
    public static String m2561b(@Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    @NonNull
    /* renamed from: c */
    public static <T extends Collection<Y>, Y> T m2562c(@NonNull T t) {
        if (!t.isEmpty()) {
            return t;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    @NonNull
    /* renamed from: d */
    public static <T> T m2563d(@Nullable T t) {
        m2564e(t, "Argument must not be null");
        return t;
    }

    @NonNull
    /* renamed from: e */
    public static <T> T m2564e(@Nullable T t, @NonNull String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }
}
