package com.chad.library.adapter.base;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\u0012\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010-¢\u0006\u0004\b.\u0010/J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0010\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00028\u00002\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0014¢\u0006\u0004\b\u0013\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\u001f\u001a\u00020\n2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\u0019\u001a\u00020\nH$¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b%\u0010\u000fJ\u0017\u0010&\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b&\u0010\u000fR)\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030'8B@\u0002X\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u00060"}, mo47991d2 = {"Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;", "T", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/chad/library/adapter/base/provider/BaseItemProvider;", "provider", "", "addItemProvider", "(Lcom/chad/library/adapter/base/provider/BaseItemProvider;)V", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "viewHolder", "", "viewType", "bindChildClick", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;I)V", "bindClick", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)V", "bindViewClickListener", "holder", "item", "convert", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;)V", "", "", "payloads", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;Ljava/util/List;)V", "position", "getDefItemViewType", "(I)I", "getItemProvider", "(I)Lcom/chad/library/adapter/base/provider/BaseItemProvider;", "data", "getItemType", "(Ljava/util/List;I)I", "Landroid/view/ViewGroup;", "parent", "onCreateDefViewHolder", "(Landroid/view/ViewGroup;I)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "onViewAttachedToWindow", "onViewDetachedFromWindow", "Landroid/util/SparseArray;", "mItemProviders$delegate", "Lkotlin/Lazy;", "getMItemProviders", "()Landroid/util/SparseArray;", "mItemProviders", "", "<init>", "(Ljava/util/List;)V", "com.github.CymChad.brvah"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: BaseProviderMultiAdapter.kt */
public abstract class BaseProviderMultiAdapter<T> extends BaseQuickAdapter<T, BaseViewHolder> {
    public final Lazy mItemProviders$delegate;

    public BaseProviderMultiAdapter() {
        this((List) null, 1, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BaseProviderMultiAdapter(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }

    /* access modifiers changed from: private */
    public final SparseArray<BaseItemProvider<T>> getMItemProviders() {
        return (SparseArray) this.mItemProviders$delegate.getValue();
    }

    public void addItemProvider(@NotNull BaseItemProvider<T> baseItemProvider) {
        baseItemProvider.setAdapter$com_github_CymChad_brvah(this);
        getMItemProviders().put(baseItemProvider.getItemViewType(), baseItemProvider);
    }

    public void bindChildClick(@NotNull BaseViewHolder baseViewHolder, int i) {
        BaseItemProvider itemProvider;
        if (getOnItemChildClickListener() == null) {
            BaseItemProvider itemProvider2 = getItemProvider(i);
            if (itemProvider2 != null) {
                for (Number intValue : itemProvider2.getChildClickViewIds()) {
                    View findViewById = baseViewHolder.itemView.findViewById(intValue.intValue());
                    if (findViewById != null) {
                        if (!findViewById.isClickable()) {
                            findViewById.setClickable(true);
                        }
                        findViewById.setOnClickListener(new C3839xb952c17c(this, baseViewHolder, itemProvider2));
                    }
                }
            } else {
                return;
            }
        }
        if (getOnItemChildLongClickListener() == null && (itemProvider = getItemProvider(i)) != null) {
            for (Number intValue2 : itemProvider.getChildLongClickViewIds()) {
                View findViewById2 = baseViewHolder.itemView.findViewById(intValue2.intValue());
                if (findViewById2 != null) {
                    if (!findViewById2.isLongClickable()) {
                        findViewById2.setLongClickable(true);
                    }
                    findViewById2.setOnLongClickListener(new C3840xb952c17d(this, baseViewHolder, itemProvider));
                }
            }
        }
    }

    public void bindClick(@NotNull BaseViewHolder baseViewHolder) {
        if (getOnItemClickListener() == null) {
            baseViewHolder.itemView.setOnClickListener(new BaseProviderMultiAdapter$bindClick$1(this, baseViewHolder));
        }
        if (getOnItemLongClickListener() == null) {
            baseViewHolder.itemView.setOnLongClickListener(new BaseProviderMultiAdapter$bindClick$2(this, baseViewHolder));
        }
    }

    public void bindViewClickListener(@NotNull BaseViewHolder baseViewHolder, int i) {
        super.bindViewClickListener(baseViewHolder, i);
        bindClick(baseViewHolder);
        bindChildClick(baseViewHolder, i);
    }

    public void convert(@NotNull BaseViewHolder baseViewHolder, T t) {
        BaseItemProvider itemProvider = getItemProvider(baseViewHolder.getItemViewType());
        if (itemProvider == null) {
            Intrinsics.throwNpe();
        }
        itemProvider.convert(baseViewHolder, t);
    }

    public int getDefItemViewType(int i) {
        return getItemType(getData(), i);
    }

    @Nullable
    public BaseItemProvider<T> getItemProvider(int i) {
        return (BaseItemProvider) getMItemProviders().get(i);
    }

    public abstract int getItemType(@NotNull List<? extends T> list, int i);

    @NotNull
    public BaseViewHolder onCreateDefViewHolder(@NotNull ViewGroup viewGroup, int i) {
        BaseItemProvider itemProvider = getItemProvider(i);
        if (itemProvider != null) {
            Context context = viewGroup.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "parent.context");
            itemProvider.setContext(context);
            BaseViewHolder onCreateViewHolder = itemProvider.onCreateViewHolder(viewGroup, i);
            itemProvider.onViewHolderCreated(onCreateViewHolder, i);
            return onCreateViewHolder;
        }
        throw new IllegalStateException(("ViewType: " + i + " no such provider found，please use addItemProvider() first!").toString());
    }

    public BaseProviderMultiAdapter(@Nullable List<T> list) {
        super(0, list);
        this.mItemProviders$delegate = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, BaseProviderMultiAdapter$mItemProviders$2.INSTANCE);
    }

    public void convert(@NotNull BaseViewHolder baseViewHolder, T t, @NotNull List<? extends Object> list) {
        BaseItemProvider itemProvider = getItemProvider(baseViewHolder.getItemViewType());
        if (itemProvider == null) {
            Intrinsics.throwNpe();
        }
        itemProvider.convert(baseViewHolder, t, list);
    }

    public void onViewAttachedToWindow(@NotNull BaseViewHolder baseViewHolder) {
        super.onViewAttachedToWindow(baseViewHolder);
        BaseItemProvider itemProvider = getItemProvider(baseViewHolder.getItemViewType());
        if (itemProvider != null) {
            itemProvider.onViewAttachedToWindow(baseViewHolder);
        }
    }

    public void onViewDetachedFromWindow(@NotNull BaseViewHolder baseViewHolder) {
        super.onViewDetachedFromWindow(baseViewHolder);
        BaseItemProvider itemProvider = getItemProvider(baseViewHolder.getItemViewType());
        if (itemProvider != null) {
            itemProvider.onViewDetachedFromWindow(baseViewHolder);
        }
    }
}
