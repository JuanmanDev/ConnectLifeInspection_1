package p040c.p200q.p201a.p264c.p276d.p281j;

import android.os.Looper;
import androidx.annotation.NonNull;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* renamed from: c.q.a.c.d.j.c */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C3450c {
    /* renamed from: a */
    public static void m8751a(@NonNull String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            "checkMainThread: current thread " + String.valueOf(Thread.currentThread()) + " IS NOT the main thread " + String.valueOf(Looper.getMainLooper().getThread()) + "!";
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: b */
    public static void m8752b(@NonNull String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            "checkNotMainThread: current thread " + String.valueOf(Thread.currentThread()) + " IS the main thread " + String.valueOf(Looper.getMainLooper().getThread()) + "!";
            throw new IllegalStateException(str);
        }
    }

    @EnsuresNonNull({"#1"})
    /* renamed from: c */
    public static void m8753c(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("null reference");
        }
    }
}
