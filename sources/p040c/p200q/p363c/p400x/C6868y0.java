package p040c.p200q.p363c.p400x;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.test.internal.runner.RunnerArgs;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* renamed from: c.q.c.x.y0 */
/* compiled from: TopicsStore */
public final class C6868y0 {
    @GuardedBy("TopicsStore.class")

    /* renamed from: d */
    public static WeakReference<C6868y0> f13148d;

    /* renamed from: a */
    public final SharedPreferences f13149a;

    /* renamed from: b */
    public C6858u0 f13150b;

    /* renamed from: c */
    public final Executor f13151c;

    public C6868y0(SharedPreferences sharedPreferences, Executor executor) {
        this.f13151c = executor;
        this.f13149a = sharedPreferences;
    }

    @WorkerThread
    /* renamed from: a */
    public static synchronized C6868y0 m19514a(Context context, Executor executor) {
        C6868y0 y0Var;
        synchronized (C6868y0.class) {
            y0Var = null;
            if (f13148d != null) {
                y0Var = (C6868y0) f13148d.get();
            }
            if (y0Var == null) {
                y0Var = new C6868y0(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                y0Var.mo31709c();
                f13148d = new WeakReference<>(y0Var);
            }
        }
        return y0Var;
    }

    @Nullable
    /* renamed from: b */
    public synchronized C6866x0 mo31708b() {
        return C6866x0.m19509a(this.f13150b.mo31683d());
    }

    @WorkerThread
    /* renamed from: c */
    public final synchronized void mo31709c() {
        this.f13150b = C6858u0.m19486b(this.f13149a, "topic_operation_queue", RunnerArgs.CLASS_SEPARATOR, this.f13151c);
    }

    /* renamed from: d */
    public synchronized boolean mo31710d(C6866x0 x0Var) {
        return this.f13150b.mo31684e(x0Var.mo31704e());
    }
}
