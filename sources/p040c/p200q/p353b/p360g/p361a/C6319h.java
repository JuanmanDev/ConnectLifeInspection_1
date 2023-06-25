package p040c.p200q.p353b.p360g.p361a;

import java.lang.Thread;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import p040c.p200q.p353b.p354a.C5850m;

/* renamed from: c.q.b.g.a.h */
/* compiled from: ThreadFactoryBuilder */
public final class C6319h {

    /* renamed from: a */
    public String f11954a = null;

    /* renamed from: b */
    public Boolean f11955b = null;

    /* renamed from: c */
    public Integer f11956c = null;

    /* renamed from: d */
    public Thread.UncaughtExceptionHandler f11957d = null;

    /* renamed from: e */
    public ThreadFactory f11958e = null;

    /* renamed from: c.q.b.g.a.h$a */
    /* compiled from: ThreadFactoryBuilder */
    public static class C6320a implements ThreadFactory {

        /* renamed from: e */
        public final /* synthetic */ ThreadFactory f11959e;

        /* renamed from: l */
        public final /* synthetic */ String f11960l;

        /* renamed from: m */
        public final /* synthetic */ AtomicLong f11961m;

        /* renamed from: n */
        public final /* synthetic */ Boolean f11962n;

        /* renamed from: o */
        public final /* synthetic */ Integer f11963o;

        /* renamed from: p */
        public final /* synthetic */ Thread.UncaughtExceptionHandler f11964p;

        public C6320a(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool, Integer num, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f11959e = threadFactory;
            this.f11960l = str;
            this.f11961m = atomicLong;
            this.f11962n = bool;
            this.f11963o = num;
            this.f11964p = uncaughtExceptionHandler;
        }

        public Thread newThread(Runnable runnable) {
            Thread newThread = this.f11959e.newThread(runnable);
            String str = this.f11960l;
            if (str != null) {
                newThread.setName(C6319h.m17767d(str, Long.valueOf(this.f11961m.getAndIncrement())));
            }
            Boolean bool = this.f11962n;
            if (bool != null) {
                newThread.setDaemon(bool.booleanValue());
            }
            Integer num = this.f11963o;
            if (num != null) {
                newThread.setPriority(num.intValue());
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f11964p;
            if (uncaughtExceptionHandler != null) {
                newThread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
            }
            return newThread;
        }
    }

    /* renamed from: c */
    public static ThreadFactory m17766c(C6319h hVar) {
        String str = hVar.f11954a;
        Boolean bool = hVar.f11955b;
        Integer num = hVar.f11956c;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = hVar.f11957d;
        ThreadFactory threadFactory = hVar.f11958e;
        if (threadFactory == null) {
            threadFactory = Executors.defaultThreadFactory();
        }
        return new C6320a(threadFactory, str, str != null ? new AtomicLong(0) : null, bool, num, uncaughtExceptionHandler);
    }

    /* renamed from: d */
    public static String m17767d(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    /* renamed from: b */
    public ThreadFactory mo30387b() {
        return m17766c(this);
    }

    /* renamed from: e */
    public C6319h mo30388e(String str) {
        m17767d(str, 0);
        this.f11954a = str;
        return this;
    }

    /* renamed from: f */
    public C6319h mo30389f(int i) {
        boolean z = false;
        C5850m.m16586g(i >= 1, "Thread priority (%s) must be >= %s", i, 1);
        if (i <= 10) {
            z = true;
        }
        C5850m.m16586g(z, "Thread priority (%s) must be <= %s", i, 10);
        this.f11956c = Integer.valueOf(i);
        return this;
    }
}
