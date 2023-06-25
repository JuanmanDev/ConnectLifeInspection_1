package com.hisense.juconnect.app_socket.utils;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007\b\u0012¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, mo47991d2 = {"Lcom/hisense/juconnect/app_socket/utils/ThreadUtils;", "", "()V", "handler", "Landroid/os/Handler;", "threadPost", "Ljava/util/concurrent/ExecutorService;", "clearMain", "", "clearThread", "mainRun", "runnable", "Ljava/lang/Runnable;", "threadRun", "Companion", "app_socket_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ThreadUtils.kt */
public final class ThreadUtils {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @NotNull
    public static final String TAG = "CONNECT";
    @NotNull
    public static final Lazy<ThreadUtils> instance$delegate = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, ThreadUtils$Companion$instance$2.INSTANCE);
    @NotNull
    public Handler handler;
    @NotNull
    public ExecutorService threadPost;

    @Metadata(mo47990d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, mo47991d2 = {"Lcom/hisense/juconnect/app_socket/utils/ThreadUtils$Companion;", "", "()V", "TAG", "", "instance", "Lcom/hisense/juconnect/app_socket/utils/ThreadUtils;", "getInstance", "()Lcom/hisense/juconnect/app_socket/utils/ThreadUtils;", "instance$delegate", "Lkotlin/Lazy;", "app_socket_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: ThreadUtils.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ThreadUtils getInstance() {
            return (ThreadUtils) ThreadUtils.instance$delegate.getValue();
        }
    }

    public ThreadUtils() {
        this.handler = new Handler(Looper.getMainLooper());
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        Intrinsics.checkNotNullExpressionValue(newCachedThreadPool, "newCachedThreadPool()");
        this.threadPost = newCachedThreadPool;
    }

    public /* synthetic */ ThreadUtils(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final void clearMain() {
        this.handler.removeCallbacksAndMessages((Object) null);
    }

    public final void clearThread() {
        this.threadPost.shutdown();
    }

    public final void mainRun(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.handler.post(runnable);
    }

    public final void threadRun(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.threadPost.submit(runnable);
    }
}
