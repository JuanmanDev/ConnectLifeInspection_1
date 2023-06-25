package p040c.p200q.p363c.p400x;

import com.google.firebase.messaging.threads.ThreadPriority;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p040c.p200q.p201a.p264c.p276d.p289n.p290r.C3567a;
import p040c.p200q.p363c.p400x.p402f1.C6825b;

/* renamed from: c.q.c.x.h0 */
/* compiled from: FcmExecutors */
public class C6831h0 {
    /* renamed from: a */
    public static Executor m19372a(String str) {
        return new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C3567a(str));
    }

    /* renamed from: b */
    public static Executor m19373b() {
        return m19372a("Firebase-Messaging-File-Io");
    }

    /* renamed from: c */
    public static ScheduledExecutorService m19374c() {
        return new ScheduledThreadPoolExecutor(1, new C3567a("Firebase-Messaging-Init"));
    }

    /* renamed from: d */
    public static ExecutorService m19375d() {
        return C6825b.m19361a().mo31606a(new C3567a("Firebase-Messaging-Intent-Handle"), ThreadPriority.HIGH_SPEED);
    }

    /* renamed from: e */
    public static ExecutorService m19376e() {
        return Executors.newSingleThreadExecutor(new C3567a("Firebase-Messaging-Network-Io"));
    }

    /* renamed from: f */
    public static ExecutorService m19377f() {
        return Executors.newSingleThreadExecutor(new C3567a("Firebase-Messaging-Task"));
    }

    /* renamed from: g */
    public static ScheduledExecutorService m19378g() {
        return new ScheduledThreadPoolExecutor(1, new C3567a("Firebase-Messaging-Topics-Io"));
    }
}
