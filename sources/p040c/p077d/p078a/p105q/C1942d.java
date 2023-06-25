package p040c.p077d.p078a.p105q;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* renamed from: c.d.a.q.d */
/* compiled from: Executors */
public final class C1942d {

    /* renamed from: a */
    public static final Executor f1626a = new C1943a();

    /* renamed from: b */
    public static final Executor f1627b = new C1944b();

    /* renamed from: c.d.a.q.d$a */
    /* compiled from: Executors */
    public class C1943a implements Executor {

        /* renamed from: e */
        public final Handler f1628e = new Handler(Looper.getMainLooper());

        public void execute(@NonNull Runnable runnable) {
            this.f1628e.post(runnable);
        }
    }

    /* renamed from: c.d.a.q.d$b */
    /* compiled from: Executors */
    public class C1944b implements Executor {
        public void execute(@NonNull Runnable runnable) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public static Executor m2544a() {
        return f1627b;
    }

    /* renamed from: b */
    public static Executor m2545b() {
        return f1626a;
    }
}
