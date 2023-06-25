package com.chad.library.adapter.base.binder;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import com.chad.library.adapter.base.BaseBinderAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010!\n\u0002\b\b\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u0002B\u0007¢\u0006\u0004\bH\u0010IJ\u001b\u0010\b\u001a\u00020\u00072\f\b\u0001\u0010\u0006\u001a\u00020\u0004\"\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u00020\u00072\f\b\u0001\u0010\u0006\u001a\u00020\u0004\"\u00020\u0005¢\u0006\u0004\b\n\u0010\tJ\u001f\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00028\u00012\u0006\u0010\f\u001a\u00028\u0000H&¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00028\u00012\u0006\u0010\f\u001a\u00028\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\r\u0010\u0012J\u001d\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0013j\b\u0012\u0004\u0012\u00020\u0005`\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0013j\b\u0012\u0004\u0012\u00020\u0005`\u0014¢\u0006\u0004\b\u0017\u0010\u0016J/\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00028\u00012\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00028\u00012\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010 \u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00028\u00012\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u0005H\u0016¢\u0006\u0004\b \u0010\u001cJ\u001f\u0010$\u001a\u00028\u00012\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0005H&¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b&\u0010'J/\u0010(\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00028\u00012\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u0005H\u0016¢\u0006\u0004\b(\u0010\u001fJ\u0017\u0010)\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b+\u0010*R$\u0010-\u001a\u0004\u0018\u00010,8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u00104\u001a\u0004\u0018\u0001038\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0013\u0010;\u001a\u00020,8F@\u0006¢\u0006\u0006\u001a\u0004\b:\u00100R-\u0010?\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0013j\b\u0012\u0004\u0012\u00020\u0005`\u00148B@\u0002X\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010\u0016R\u0013\u0010A\u001a\u0002038F@\u0006¢\u0006\u0006\u001a\u0004\b@\u00107R\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00100B8F@\u0006¢\u0006\u0006\u001a\u0004\bC\u0010DR-\u0010G\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0013j\b\u0012\u0004\u0012\u00020\u0005`\u00148B@\u0002X\u0002¢\u0006\f\n\u0004\bE\u0010=\u001a\u0004\bF\u0010\u0016¨\u0006J"}, mo47991d2 = {"Lcom/chad/library/adapter/base/binder/BaseItemBinder;", "T", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "VH", "", "", "ids", "", "addChildClickViewIds", "([I)V", "addChildLongClickViewIds", "holder", "data", "convert", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;)V", "", "", "payloads", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;Ljava/util/List;)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getChildClickViewIds", "()Ljava/util/ArrayList;", "getChildLongClickViewIds", "Landroid/view/View;", "view", "position", "onChildClick", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Landroid/view/View;Ljava/lang/Object;I)V", "", "onChildLongClick", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Landroid/view/View;Ljava/lang/Object;I)Z", "onClick", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "onFailedToRecycleView", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)Z", "onLongClick", "onViewAttachedToWindow", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)V", "onViewDetachedFromWindow", "Lcom/chad/library/adapter/base/BaseBinderAdapter;", "_adapter", "Lcom/chad/library/adapter/base/BaseBinderAdapter;", "get_adapter$com_github_CymChad_brvah", "()Lcom/chad/library/adapter/base/BaseBinderAdapter;", "set_adapter$com_github_CymChad_brvah", "(Lcom/chad/library/adapter/base/BaseBinderAdapter;)V", "Landroid/content/Context;", "_context", "Landroid/content/Context;", "get_context$com_github_CymChad_brvah", "()Landroid/content/Context;", "set_context$com_github_CymChad_brvah", "(Landroid/content/Context;)V", "getAdapter", "adapter", "clickViewIds$delegate", "Lkotlin/Lazy;", "getClickViewIds", "clickViewIds", "getContext", "context", "", "getData", "()Ljava/util/List;", "longClickViewIds$delegate", "getLongClickViewIds", "longClickViewIds", "<init>", "()V", "com.github.CymChad.brvah"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: BaseItemBinder.kt */
public abstract class BaseItemBinder<T, VH extends BaseViewHolder> {
    @Nullable
    public BaseBinderAdapter _adapter;
    @Nullable
    public Context _context;
    public final Lazy clickViewIds$delegate = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, BaseItemBinder$clickViewIds$2.INSTANCE);
    public final Lazy longClickViewIds$delegate = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, BaseItemBinder$longClickViewIds$2.INSTANCE);

    private final ArrayList<Integer> getClickViewIds() {
        return (ArrayList) this.clickViewIds$delegate.getValue();
    }

    private final ArrayList<Integer> getLongClickViewIds() {
        return (ArrayList) this.longClickViewIds$delegate.getValue();
    }

    public final void addChildClickViewIds(@NotNull @IdRes int... iArr) {
        for (int valueOf : iArr) {
            getClickViewIds().add(Integer.valueOf(valueOf));
        }
    }

    public final void addChildLongClickViewIds(@NotNull @IdRes int... iArr) {
        for (int valueOf : iArr) {
            getLongClickViewIds().add(Integer.valueOf(valueOf));
        }
    }

    public abstract void convert(@NotNull VH vh, T t);

    public void convert(@NotNull VH vh, T t, @NotNull List<? extends Object> list) {
    }

    @NotNull
    public final BaseBinderAdapter getAdapter() {
        BaseBinderAdapter baseBinderAdapter = this._adapter;
        if (baseBinderAdapter != null) {
            if (baseBinderAdapter == null) {
                Intrinsics.throwNpe();
            }
            return baseBinderAdapter;
        }
        throw new IllegalStateException(("This " + this + " has not been attached to BaseBinderAdapter yet.\n                    You should not call the method before addItemBinder().").toString());
    }

    @NotNull
    public final ArrayList<Integer> getChildClickViewIds() {
        return getClickViewIds();
    }

    @NotNull
    public final ArrayList<Integer> getChildLongClickViewIds() {
        return getLongClickViewIds();
    }

    @NotNull
    public final Context getContext() {
        Context context = this._context;
        if (context != null) {
            if (context == null) {
                Intrinsics.throwNpe();
            }
            return context;
        }
        throw new IllegalStateException(("This " + this + " has not been attached to BaseBinderAdapter yet.\n                    You should not call the method before onCreateViewHolder().").toString());
    }

    @NotNull
    public final List<Object> getData() {
        return getAdapter().getData();
    }

    @Nullable
    public final BaseBinderAdapter get_adapter$com_github_CymChad_brvah() {
        return this._adapter;
    }

    @Nullable
    public final Context get_context$com_github_CymChad_brvah() {
        return this._context;
    }

    public void onChildClick(@NotNull VH vh, @NotNull View view, T t, int i) {
    }

    public boolean onChildLongClick(@NotNull VH vh, @NotNull View view, T t, int i) {
        return false;
    }

    public void onClick(@NotNull VH vh, @NotNull View view, T t, int i) {
    }

    @NotNull
    public abstract VH onCreateViewHolder(@NotNull ViewGroup viewGroup, int i);

    public boolean onFailedToRecycleView(@NotNull VH vh) {
        return false;
    }

    public boolean onLongClick(@NotNull VH vh, @NotNull View view, T t, int i) {
        return false;
    }

    public void onViewAttachedToWindow(@NotNull VH vh) {
    }

    public void onViewDetachedFromWindow(@NotNull VH vh) {
    }

    public final void set_adapter$com_github_CymChad_brvah(@Nullable BaseBinderAdapter baseBinderAdapter) {
        this._adapter = baseBinderAdapter;
    }

    public final void set_context$com_github_CymChad_brvah(@Nullable Context context) {
        this._context = context;
    }
}
