package com.chad.library.adapter.base.diff;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListUpdateCallback;
import com.chad.library.adapter.base.BaseQuickAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p111f.p112a.p113a.p114a.p115a.C1984a;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001:\u0001;B'\u0012\u0010\u0010)\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030(\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+¢\u0006\u0004\b9\u0010:J\u0015\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\bJ\u001d\u0010\u000b\u001a\u00020\u00032\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00028\u00002\b\u0010\u0012\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u001d\u001a\u00020\u00032\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00172\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010 \u001a\u00020\u00032\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\u00032\u0006\u0010\"\u001a\u00028\u0000¢\u0006\u0004\b#\u0010\u0005J\u0015\u0010$\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b$\u0010%J\u001b\u0010&\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b&\u0010\u0010J+\u0010'\u001a\u00020\u00032\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00172\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0007¢\u0006\u0004\b'\u0010!R \u0010)\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030(8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001c\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\"\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\u00178\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00101\u001a\u0002008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00106\u001a\u0002058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u0002008\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00102¨\u0006<"}, mo47991d2 = {"Lcom/chad/library/adapter/base/diff/BrvahAsyncDiffer;", "T", "data", "", "addData", "(Ljava/lang/Object;)V", "", "index", "(ILjava/lang/Object;)V", "", "list", "addList", "(Ljava/util/List;)V", "Lcom/chad/library/adapter/base/diff/ListChangeListener;", "listener", "addListListener", "(Lcom/chad/library/adapter/base/diff/ListChangeListener;)V", "newData", "payload", "changeData", "(ILjava/lang/Object;Ljava/lang/Object;)V", "clearAllListListener", "()V", "", "newList", "Landroidx/recyclerview/widget/DiffUtil$DiffResult;", "diffResult", "Ljava/lang/Runnable;", "commitCallback", "latchList", "(Ljava/util/List;Landroidx/recyclerview/widget/DiffUtil$DiffResult;Ljava/lang/Runnable;)V", "previousList", "onCurrentListChanged", "(Ljava/util/List;Ljava/lang/Runnable;)V", "t", "remove", "removeAt", "(I)V", "removeListListener", "submitList", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "adapter", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/chad/library/adapter/base/diff/BrvahAsyncDifferConfig;", "config", "Lcom/chad/library/adapter/base/diff/BrvahAsyncDifferConfig;", "mListeners", "Ljava/util/List;", "Ljava/util/concurrent/Executor;", "mMainThreadExecutor", "Ljava/util/concurrent/Executor;", "mMaxScheduledGeneration", "I", "Landroidx/recyclerview/widget/ListUpdateCallback;", "mUpdateCallback", "Landroidx/recyclerview/widget/ListUpdateCallback;", "sMainThreadExecutor", "<init>", "(Lcom/chad/library/adapter/base/BaseQuickAdapter;Lcom/chad/library/adapter/base/diff/BrvahAsyncDifferConfig;)V", "MainThreadExecutor", "com.github.CymChad.brvah"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: BrvahAsyncDiffer.kt */
public final class BrvahAsyncDiffer<T> {
    public final BaseQuickAdapter<T, ?> adapter;
    public final BrvahAsyncDifferConfig<T> config;
    public final List<C1984a<T>> mListeners;
    public Executor mMainThreadExecutor;
    public int mMaxScheduledGeneration;
    public final ListUpdateCallback mUpdateCallback;
    public final Executor sMainThreadExecutor = new MainThreadExecutor();

    @Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, mo47991d2 = {"Lcom/chad/library/adapter/base/diff/BrvahAsyncDiffer$MainThreadExecutor;", "Ljava/util/concurrent/Executor;", "Ljava/lang/Runnable;", "command", "", "execute", "(Ljava/lang/Runnable;)V", "Landroid/os/Handler;", "mHandler", "Landroid/os/Handler;", "getMHandler", "()Landroid/os/Handler;", "<init>", "()V", "com.github.CymChad.brvah"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
    /* compiled from: BrvahAsyncDiffer.kt */
    public static final class MainThreadExecutor implements Executor {
        @NotNull
        public final Handler mHandler = new Handler(Looper.getMainLooper());

        public void execute(@NotNull Runnable runnable) {
            this.mHandler.post(runnable);
        }

        @NotNull
        public final Handler getMHandler() {
            return this.mHandler;
        }
    }

    public BrvahAsyncDiffer(@NotNull BaseQuickAdapter<T, ?> baseQuickAdapter, @NotNull BrvahAsyncDifferConfig<T> brvahAsyncDifferConfig) {
        this.adapter = baseQuickAdapter;
        this.config = brvahAsyncDifferConfig;
        this.mUpdateCallback = new BrvahListUpdateCallback(baseQuickAdapter);
        Executor mainThreadExecutor = this.config.getMainThreadExecutor();
        this.mMainThreadExecutor = mainThreadExecutor == null ? this.sMainThreadExecutor : mainThreadExecutor;
        this.mListeners = new CopyOnWriteArrayList();
    }

    /* access modifiers changed from: private */
    public final void latchList(List<T> list, DiffUtil.DiffResult diffResult, Runnable runnable) {
        List<T> data = this.adapter.getData();
        this.adapter.setData$com_github_CymChad_brvah(list);
        diffResult.dispatchUpdatesTo(this.mUpdateCallback);
        onCurrentListChanged(data, runnable);
    }

    private final void onCurrentListChanged(List<? extends T> list, Runnable runnable) {
        for (C1984a<T> onCurrentListChanged : this.mListeners) {
            onCurrentListChanged.onCurrentListChanged(list, this.adapter.getData());
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static /* synthetic */ void submitList$default(BrvahAsyncDiffer brvahAsyncDiffer, List list, Runnable runnable, int i, Object obj) {
        if ((i & 2) != 0) {
            runnable = null;
        }
        brvahAsyncDiffer.submitList(list, runnable);
    }

    public final void addData(int i, T t) {
        List<T> data = this.adapter.getData();
        this.adapter.getData().add(i, t);
        this.mUpdateCallback.onInserted(i, 1);
        onCurrentListChanged(data, (Runnable) null);
    }

    public final void addList(@Nullable List<? extends T> list) {
        if (list != null) {
            List<T> data = this.adapter.getData();
            this.adapter.getData().addAll(list);
            this.mUpdateCallback.onInserted(data.size(), list.size());
            onCurrentListChanged(data, (Runnable) null);
        }
    }

    public void addListListener(@NotNull C1984a<T> aVar) {
        this.mListeners.add(aVar);
    }

    public final void changeData(int i, T t, @Nullable T t2) {
        List<T> data = this.adapter.getData();
        this.adapter.getData().set(i, t);
        this.mUpdateCallback.onChanged(i, 1, t2);
        onCurrentListChanged(data, (Runnable) null);
    }

    public final void clearAllListListener() {
        this.mListeners.clear();
    }

    public final void remove(T t) {
        List<T> data = this.adapter.getData();
        int indexOf = this.adapter.getData().indexOf(t);
        if (indexOf != -1) {
            this.adapter.getData().remove(indexOf);
            this.mUpdateCallback.onRemoved(indexOf, 1);
            onCurrentListChanged(data, (Runnable) null);
        }
    }

    public final void removeAt(int i) {
        List<T> data = this.adapter.getData();
        this.adapter.getData().remove(i);
        this.mUpdateCallback.onRemoved(i, 1);
        onCurrentListChanged(data, (Runnable) null);
    }

    public final void removeListListener(@NotNull C1984a<T> aVar) {
        this.mListeners.remove(aVar);
    }

    @JvmOverloads
    public final void submitList(@Nullable List<T> list) {
        submitList$default(this, list, (Runnable) null, 2, (Object) null);
    }

    @JvmOverloads
    public final void submitList(@Nullable List<T> list, @Nullable Runnable runnable) {
        int i = this.mMaxScheduledGeneration + 1;
        this.mMaxScheduledGeneration = i;
        if (list != this.adapter.getData()) {
            List<T> data = this.adapter.getData();
            if (list == null) {
                int size = this.adapter.getData().size();
                this.adapter.setData$com_github_CymChad_brvah(new ArrayList());
                this.mUpdateCallback.onRemoved(0, size);
                onCurrentListChanged(data, runnable);
            } else if (this.adapter.getData().isEmpty()) {
                this.adapter.setData$com_github_CymChad_brvah(list);
                this.mUpdateCallback.onInserted(0, list.size());
                onCurrentListChanged(data, runnable);
            } else {
                this.config.getBackgroundThreadExecutor().execute(new BrvahAsyncDiffer$submitList$1(this, data, list, i, runnable));
            }
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public final void addData(T t) {
        List<T> data = this.adapter.getData();
        this.adapter.getData().add(t);
        this.mUpdateCallback.onInserted(data.size(), 1);
        onCurrentListChanged(data, (Runnable) null);
    }
}
