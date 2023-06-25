package p634k.p635a;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.ThreadPoolDispatcherKt;

/* renamed from: k.a.a */
/* compiled from: lambda */
public final /* synthetic */ class C9488a implements ThreadFactory {

    /* renamed from: e */
    public final /* synthetic */ int f18792e;

    /* renamed from: l */
    public final /* synthetic */ String f18793l;

    /* renamed from: m */
    public final /* synthetic */ AtomicInteger f18794m;

    public /* synthetic */ C9488a(int i, String str, AtomicInteger atomicInteger) {
        this.f18792e = i;
        this.f18793l = str;
        this.f18794m = atomicInteger;
    }

    public final Thread newThread(Runnable runnable) {
        return ThreadPoolDispatcherKt.m28777newFixedThreadPoolContext$lambda1(this.f18792e, this.f18793l, this.f18794m, runnable);
    }
}
