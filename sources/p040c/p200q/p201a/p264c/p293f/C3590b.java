package p040c.p200q.p201a.p264c.p293f;

import android.os.Looper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;

/* renamed from: c.q.a.c.f.b */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C3590b {
    @GuardedBy("DynamiteLoaderV2ClassLoader.class")
    @Nullable

    /* renamed from: a */
    public static volatile ClassLoader f6567a;
    @GuardedBy("DynamiteLoaderV2ClassLoader.class")
    @Nullable

    /* renamed from: b */
    public static volatile Thread f6568b;

    @Nullable
    /* renamed from: a */
    public static synchronized ClassLoader m9125a() {
        ClassLoader classLoader;
        synchronized (C3590b.class) {
            if (f6567a == null) {
                f6567a = m9126b();
            }
            classLoader = f6567a;
        }
        return classLoader;
    }

    @Nullable
    /* renamed from: b */
    public static synchronized ClassLoader m9126b() {
        synchronized (C3590b.class) {
            ClassLoader classLoader = null;
            if (f6568b == null) {
                f6568b = m9127c();
                if (f6568b == null) {
                    return null;
                }
            }
            synchronized (f6568b) {
                try {
                    classLoader = f6568b.getContextClassLoader();
                } catch (SecurityException e) {
                    "Failed to get thread context classloader " + e.getMessage();
                }
            }
            return classLoader;
        }
    }

    @Nullable
    /* renamed from: c */
    public static synchronized Thread m9127c() {
        C3589a aVar;
        C3589a aVar2;
        SecurityException e;
        ThreadGroup threadGroup;
        synchronized (C3590b.class) {
            ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
            if (threadGroup2 == null) {
                return null;
            }
            synchronized (Void.class) {
                try {
                    int activeGroupCount = threadGroup2.activeGroupCount();
                    ThreadGroup[] threadGroupArr = new ThreadGroup[activeGroupCount];
                    threadGroup2.enumerate(threadGroupArr);
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= activeGroupCount) {
                            threadGroup = null;
                            break;
                        }
                        threadGroup = threadGroupArr[i2];
                        if ("dynamiteLoader".equals(threadGroup.getName())) {
                            break;
                        }
                        i2++;
                    }
                    if (threadGroup == null) {
                        threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                    }
                    int activeCount = threadGroup.activeCount();
                    Thread[] threadArr = new Thread[activeCount];
                    threadGroup.enumerate(threadArr);
                    while (true) {
                        if (i >= activeCount) {
                            aVar = null;
                            break;
                        }
                        aVar = threadArr[i];
                        if ("GmsDynamite".equals(aVar.getName())) {
                            break;
                        }
                        i++;
                    }
                    if (aVar == null) {
                        try {
                            aVar2 = new C3589a(threadGroup, "GmsDynamite");
                            try {
                                aVar2.setContextClassLoader((ClassLoader) null);
                                aVar2.start();
                            } catch (SecurityException e2) {
                                e = e2;
                            }
                        } catch (SecurityException e3) {
                            e = e3;
                            aVar2 = aVar;
                            "Failed to enumerate thread/threadgroup " + e.getMessage();
                            aVar = aVar2;
                            return aVar;
                        }
                        aVar = aVar2;
                    }
                } catch (SecurityException e4) {
                    e = e4;
                    aVar2 = null;
                    "Failed to enumerate thread/threadgroup " + e.getMessage();
                    aVar = aVar2;
                    return aVar;
                }
            }
            return aVar;
        }
    }
}
