package com.chad.library.adapter.base.diff;

import androidx.annotation.RestrictTo;
import androidx.recyclerview.widget.DiffUtil;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000*\u0004\b\u0000\u0010\u0001:\u0001\u0010B'\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0004¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006¨\u0006\u0011"}, mo47991d2 = {"Lcom/chad/library/adapter/base/diff/BrvahAsyncDifferConfig;", "T", "Ljava/util/concurrent/Executor;", "backgroundThreadExecutor", "Ljava/util/concurrent/Executor;", "getBackgroundThreadExecutor", "()Ljava/util/concurrent/Executor;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "getDiffCallback", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "mainThreadExecutor", "getMainThreadExecutor", "<init>", "(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V", "Builder", "com.github.CymChad.brvah"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: BrvahAsyncDifferConfig.kt */
public final class BrvahAsyncDifferConfig<T> {
    @NotNull
    public final Executor backgroundThreadExecutor;
    @NotNull
    public final DiffUtil.ItemCallback<T> diffCallback;
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final Executor mainThreadExecutor;

    @Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u0012*\u0004\b\u0001\u0010\u0001:\u0001\u0012B\u0015\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\bR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u000b¨\u0006\u0013"}, mo47991d2 = {"Lcom/chad/library/adapter/base/diff/BrvahAsyncDifferConfig$Builder;", "T", "Lcom/chad/library/adapter/base/diff/BrvahAsyncDifferConfig;", "build", "()Lcom/chad/library/adapter/base/diff/BrvahAsyncDifferConfig;", "Ljava/util/concurrent/Executor;", "executor", "setBackgroundThreadExecutor", "(Ljava/util/concurrent/Executor;)Lcom/chad/library/adapter/base/diff/BrvahAsyncDifferConfig$Builder;", "setMainThreadExecutor", "mBackgroundThreadExecutor", "Ljava/util/concurrent/Executor;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "mDiffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "mMainThreadExecutor", "<init>", "(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V", "Companion", "com.github.CymChad.brvah"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
    /* compiled from: BrvahAsyncDifferConfig.kt */
    public static final class Builder<T> {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        public static Executor sDiffExecutor;
        public static final Object sExecutorLock = new Object();
        public Executor mBackgroundThreadExecutor;
        public final DiffUtil.ItemCallback<T> mDiffCallback;
        public Executor mMainThreadExecutor;

        @Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0003\u0018\u0000B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, mo47991d2 = {"Lcom/chad/library/adapter/base/diff/BrvahAsyncDifferConfig$Builder$Companion;", "Ljava/util/concurrent/Executor;", "sDiffExecutor", "Ljava/util/concurrent/Executor;", "", "sExecutorLock", "Ljava/lang/Object;", "<init>", "()V", "com.github.CymChad.brvah"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
        /* compiled from: BrvahAsyncDifferConfig.kt */
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public Builder(@NotNull DiffUtil.ItemCallback<T> itemCallback) {
            this.mDiffCallback = itemCallback;
        }

        @NotNull
        public final BrvahAsyncDifferConfig<T> build() {
            if (this.mBackgroundThreadExecutor == null) {
                synchronized (sExecutorLock) {
                    if (sDiffExecutor == null) {
                        sDiffExecutor = Executors.newFixedThreadPool(2);
                    }
                    Unit unit = Unit.INSTANCE;
                }
                this.mBackgroundThreadExecutor = sDiffExecutor;
            }
            Executor executor = this.mMainThreadExecutor;
            Executor executor2 = this.mBackgroundThreadExecutor;
            if (executor2 == null) {
                Intrinsics.throwNpe();
            }
            return new BrvahAsyncDifferConfig<>(executor, executor2, this.mDiffCallback);
        }

        @NotNull
        public final Builder<T> setBackgroundThreadExecutor(@Nullable Executor executor) {
            this.mBackgroundThreadExecutor = executor;
            return this;
        }

        @NotNull
        public final Builder<T> setMainThreadExecutor(@Nullable Executor executor) {
            this.mMainThreadExecutor = executor;
            return this;
        }
    }

    public BrvahAsyncDifferConfig(@Nullable Executor executor, @NotNull Executor executor2, @NotNull DiffUtil.ItemCallback<T> itemCallback) {
        this.mainThreadExecutor = executor;
        this.backgroundThreadExecutor = executor2;
        this.diffCallback = itemCallback;
    }

    @NotNull
    public final Executor getBackgroundThreadExecutor() {
        return this.backgroundThreadExecutor;
    }

    @NotNull
    public final DiffUtil.ItemCallback<T> getDiffCallback() {
        return this.diffCallback;
    }

    @Nullable
    public final Executor getMainThreadExecutor() {
        return this.mainThreadExecutor;
    }
}
