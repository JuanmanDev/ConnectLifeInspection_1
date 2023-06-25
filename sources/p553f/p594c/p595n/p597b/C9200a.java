package p553f.p594c.p595n.p597b;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Callable;
import p553f.p594c.C9194k;
import p553f.p594c.p595n.p596a.C9199a;

/* renamed from: f.c.n.b.a */
/* compiled from: AndroidSchedulers */
public final class C9200a {

    /* renamed from: a */
    public static final C9194k f17991a = C9199a.m24951d(new C9201a());

    /* renamed from: f.c.n.b.a$a */
    /* compiled from: AndroidSchedulers */
    public static class C9201a implements Callable<C9194k> {
        /* renamed from: a */
        public C9194k call() {
            return C9202b.f17992a;
        }
    }

    /* renamed from: f.c.n.b.a$b */
    /* compiled from: AndroidSchedulers */
    public static final class C9202b {

        /* renamed from: a */
        public static final C9194k f17992a = new C9203b(new Handler(Looper.getMainLooper()), false);
    }

    /* renamed from: a */
    public static C9194k m24953a() {
        return C9199a.m24952e(f17991a);
    }
}
