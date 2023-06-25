package com.chad.library.adapter.base.provider;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.util.AdapterUtilsKt;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001B\u0007¢\u0006\u0004\bK\u0010LJ\u001b\u0010\u0006\u001a\u00020\u00052\f\b\u0001\u0010\u0004\u001a\u00020\u0002\"\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\b\u001a\u00020\u00052\f\b\u0001\u0010\u0004\u001a\u00020\u0002\"\u00020\u0003¢\u0006\u0004\b\b\u0010\u0007J\u001f\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u0000H&¢\u0006\u0004\b\f\u0010\rJ-\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016¢\u0006\u0004\b\f\u0010\u0011J\u0017\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0015j\b\u0012\u0004\u0012\u00020\u0003`\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0015j\b\u0012\u0004\u0012\u00020\u0003`\u0016¢\u0006\u0004\b\u0019\u0010\u0018J/\u0010\u001e\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010!\u001a\u00020 2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u0003H\u0016¢\u0006\u0004\b!\u0010\"J/\u0010#\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u0003H\u0016¢\u0006\u0004\b#\u0010\u001fJ\u001f\u0010'\u001a\u00020\t2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u0003H\u0016¢\u0006\u0004\b'\u0010(J/\u0010)\u001a\u00020 2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u0003H\u0016¢\u0006\u0004\b)\u0010\"J\u0017\u0010+\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\tH\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\tH\u0016¢\u0006\u0004\b-\u0010,J\u001f\u0010/\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\t2\u0006\u0010&\u001a\u00020\u0003H\u0016¢\u0006\u0004\b/\u00100J\u001d\u00104\u001a\u00020\u00052\f\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0000¢\u0006\u0004\b2\u00103R-\u00108\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0015j\b\u0012\u0004\u0012\u00020\u0003`\u00168B@\u0002X\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u0010\u0018R\"\u0010:\u001a\u0002098\u0006@\u0006X.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0016\u0010B\u001a\u00020\u00038&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0016\u0010D\u001a\u00020\u00038g@&X¦\u0004¢\u0006\u0006\u001a\u0004\bC\u0010AR-\u0010G\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0015j\b\u0012\u0004\u0012\u00020\u0003`\u00168B@\u0002X\u0002¢\u0006\f\n\u0004\bE\u00106\u001a\u0004\bF\u0010\u0018R$\u0010I\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0018\u00010H8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006M"}, mo47991d2 = {"Lcom/chad/library/adapter/base/provider/BaseItemProvider;", "T", "", "", "ids", "", "addChildClickViewIds", "([I)V", "addChildLongClickViewIds", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "helper", "item", "convert", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;)V", "", "", "payloads", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;Ljava/util/List;)V", "Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;", "getAdapter", "()Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getChildClickViewIds", "()Ljava/util/ArrayList;", "getChildLongClickViewIds", "Landroid/view/View;", "view", "data", "position", "onChildClick", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Landroid/view/View;Ljava/lang/Object;I)V", "", "onChildLongClick", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Landroid/view/View;Ljava/lang/Object;I)Z", "onClick", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "onLongClick", "holder", "onViewAttachedToWindow", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)V", "onViewDetachedFromWindow", "viewHolder", "onViewHolderCreated", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;I)V", "adapter", "setAdapter$com_github_CymChad_brvah", "(Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;)V", "setAdapter", "clickViewIds$delegate", "Lkotlin/Lazy;", "getClickViewIds", "clickViewIds", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getItemViewType", "()I", "itemViewType", "getLayoutId", "layoutId", "longClickViewIds$delegate", "getLongClickViewIds", "longClickViewIds", "Ljava/lang/ref/WeakReference;", "weakAdapter", "Ljava/lang/ref/WeakReference;", "<init>", "()V", "com.github.CymChad.brvah"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: BaseItemProvider.kt */
public abstract class BaseItemProvider<T> {
    public final Lazy clickViewIds$delegate = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, BaseItemProvider$clickViewIds$2.INSTANCE);
    @NotNull
    public Context context;
    public final Lazy longClickViewIds$delegate = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, BaseItemProvider$longClickViewIds$2.INSTANCE);
    public WeakReference<BaseProviderMultiAdapter<T>> weakAdapter;

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

    public abstract void convert(@NotNull BaseViewHolder baseViewHolder, T t);

    public void convert(@NotNull BaseViewHolder baseViewHolder, T t, @NotNull List<? extends Object> list) {
    }

    @Nullable
    public BaseProviderMultiAdapter<T> getAdapter() {
        WeakReference<BaseProviderMultiAdapter<T>> weakReference = this.weakAdapter;
        if (weakReference != null) {
            return (BaseProviderMultiAdapter) weakReference.get();
        }
        return null;
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
        Context context2 = this.context;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        return context2;
    }

    public abstract int getItemViewType();

    @LayoutRes
    public abstract int getLayoutId();

    public void onChildClick(@NotNull BaseViewHolder baseViewHolder, @NotNull View view, T t, int i) {
    }

    public boolean onChildLongClick(@NotNull BaseViewHolder baseViewHolder, @NotNull View view, T t, int i) {
        return false;
    }

    public void onClick(@NotNull BaseViewHolder baseViewHolder, @NotNull View view, T t, int i) {
    }

    @NotNull
    public BaseViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        return new BaseViewHolder(AdapterUtilsKt.getItemView(viewGroup, getLayoutId()));
    }

    public boolean onLongClick(@NotNull BaseViewHolder baseViewHolder, @NotNull View view, T t, int i) {
        return false;
    }

    public void onViewAttachedToWindow(@NotNull BaseViewHolder baseViewHolder) {
    }

    public void onViewDetachedFromWindow(@NotNull BaseViewHolder baseViewHolder) {
    }

    public void onViewHolderCreated(@NotNull BaseViewHolder baseViewHolder, int i) {
    }

    public final void setAdapter$com_github_CymChad_brvah(@NotNull BaseProviderMultiAdapter<T> baseProviderMultiAdapter) {
        this.weakAdapter = new WeakReference<>(baseProviderMultiAdapter);
    }

    public final void setContext(@NotNull Context context2) {
        this.context = context2;
    }
}
