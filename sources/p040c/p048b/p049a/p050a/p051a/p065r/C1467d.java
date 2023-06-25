package p040c.p048b.p049a.p050a.p051a.p065r;

import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: c.b.a.a.a.r.d */
/* compiled from: ThreadUtils */
public final class C1467d {

    /* renamed from: a */
    public static int f645a;

    /* renamed from: b */
    public static final Executor f646b = Executors.newCachedThreadPool(new C1468a());

    /* renamed from: c.b.a.a.a.r.d$a */
    /* compiled from: ThreadUtils */
    public static class C1468a implements ThreadFactory {
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "AmazonAuthorzationLibrary#" + C1467d.m791a());
        }
    }

    /* renamed from: a */
    public static /* synthetic */ int m791a() {
        int i = f645a + 1;
        f645a = i;
        return i;
    }

    /* renamed from: b */
    public static boolean m792b() {
        return Looper.getMainLooper() != null && Looper.getMainLooper() == Looper.myLooper();
    }
}
