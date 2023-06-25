package p040c.p200q.p201a.p264c.p276d.p281j;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.identity.auth.map.device.token.MAPCookie;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p040c.p200q.p201a.p264c.p276d.p289n.C3570t;

/* renamed from: c.q.a.c.d.j.o */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C3495o {
    /* renamed from: a */
    public static void m8899a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static void m8900b(boolean z, @NonNull Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: c */
    public static void m8901c(boolean z, @NonNull String str, @NonNull Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    /* renamed from: d */
    public static void m8902d(@NonNull Handler handler) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            String name = myLooper != null ? myLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            throw new IllegalStateException("Must be called on " + name2 + " thread, but got " + name + MAPCookie.DOT);
        }
    }

    /* renamed from: e */
    public static void m8903e(@NonNull String str) {
        if (!C3570t.m9101a()) {
            throw new IllegalStateException(str);
        }
    }

    @NonNull
    @EnsuresNonNull({"#1"})
    /* renamed from: f */
    public static String m8904f(@Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    @NonNull
    @EnsuresNonNull({"#1"})
    /* renamed from: g */
    public static String m8905g(@Nullable String str, @NonNull Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    /* renamed from: h */
    public static void m8906h() {
        m8907i("Must not be called on the main application thread");
    }

    /* renamed from: i */
    public static void m8907i(@NonNull String str) {
        if (C3570t.m9101a()) {
            throw new IllegalStateException(str);
        }
    }

    @NonNull
    @EnsuresNonNull({"#1"})
    /* renamed from: j */
    public static <T> T m8908j(@Nullable T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException("null reference");
    }

    @NonNull
    @EnsuresNonNull({"#1"})
    /* renamed from: k */
    public static <T> T m8909k(@NonNull T t, @NonNull Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: l */
    public static int m8910l(int i) {
        if (i != 0) {
            return i;
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    /* renamed from: m */
    public static void m8911m(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: n */
    public static void m8912n(boolean z, @NonNull Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: o */
    public static void m8913o(boolean z, @NonNull String str, @NonNull Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }
}
