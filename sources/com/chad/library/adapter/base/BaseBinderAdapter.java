package com.chad.library.adapter.base;

import android.annotation.SuppressLint;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.DiffUtil;
import com.chad.library.adapter.base.binder.BaseItemBinder;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0001;B\u0019\u0012\u0010\b\u0002\u00108\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u000107¢\u0006\u0004\b9\u0010:J@\u0010\b\u001a\u00020\u0000\"\n\b\u0000\u0010\u0003\u0018\u0001*\u00020\u00022\u0010\u0010\u0005\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006H\b¢\u0006\u0004\b\b\u0010\tJM\u0010\b\u001a\u00020\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n2\u0010\u0010\u0005\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0016\u0010\u0013J\u001f\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ-\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00022\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bH\u0014¢\u0006\u0004\b\u0019\u0010\u001dJ\u001b\u0010\u001e\u001a\u00020\u000f2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000fH\u0014¢\u0006\u0004\b!\u0010\"J#\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b#\u0010$J%\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b%\u0010$J\u001f\u0010(\u001a\u00020\r2\u0006\u0010'\u001a\u00020&2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020*2\u0006\u0010\u0017\u001a\u00020\rH\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\rH\u0016¢\u0006\u0004\b-\u0010\u0015J\u0017\u0010.\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\rH\u0016¢\u0006\u0004\b.\u0010\u0015RJ\u00101\u001a6\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00060/j\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006`08\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102R&\u00104\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u0002\u0012\u0002\b\u00030\u0004038\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u00105R:\u00106\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n\u0012\u0004\u0012\u00020\u000f0/j\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n\u0012\u0004\u0012\u00020\u000f`08\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00102¨\u0006<"}, mo47991d2 = {"Lcom/chad/library/adapter/base/BaseBinderAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "", "T", "Lcom/chad/library/adapter/base/binder/BaseItemBinder;", "baseItemBinder", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "callback", "addItemBinder", "(Lcom/chad/library/adapter/base/binder/BaseItemBinder;Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)Lcom/chad/library/adapter/base/BaseBinderAdapter;", "Ljava/lang/Class;", "clazz", "(Ljava/lang/Class;Lcom/chad/library/adapter/base/binder/BaseItemBinder;Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)Lcom/chad/library/adapter/base/BaseBinderAdapter;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "viewHolder", "", "viewType", "", "bindChildClick", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;I)V", "bindClick", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)V", "bindViewClickListener", "holder", "item", "convert", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;)V", "", "payloads", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;Ljava/util/List;)V", "findViewType", "(Ljava/lang/Class;)I", "position", "getDefItemViewType", "(I)I", "getItemBinder", "(I)Lcom/chad/library/adapter/base/binder/BaseItemBinder;", "getItemBinderOrNull", "Landroid/view/ViewGroup;", "parent", "onCreateDefViewHolder", "(Landroid/view/ViewGroup;I)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "", "onFailedToRecycleView", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)Z", "onViewAttachedToWindow", "onViewDetachedFromWindow", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "classDiffMap", "Ljava/util/HashMap;", "Landroid/util/SparseArray;", "mBinderArray", "Landroid/util/SparseArray;", "mTypeMap", "", "list", "<init>", "(Ljava/util/List;)V", "ItemCallback", "com.github.CymChad.brvah"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: BaseBinderAdapter.kt */
public class BaseBinderAdapter extends BaseQuickAdapter<Object, BaseViewHolder> {
    public final HashMap<Class<?>, DiffUtil.ItemCallback<Object>> classDiffMap;
    public final SparseArray<BaseItemBinder<Object, ?>> mBinderArray;
    public final HashMap<Class<?>, Integer> mTypeMap;

    @Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0007J!\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, mo47991d2 = {"Lcom/chad/library/adapter/base/BaseBinderAdapter$ItemCallback;", "androidx/recyclerview/widget/DiffUtil$ItemCallback", "", "oldItem", "newItem", "", "areContentsTheSame", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "areItemsTheSame", "getChangePayload", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<init>", "(Lcom/chad/library/adapter/base/BaseBinderAdapter;)V", "com.github.CymChad.brvah"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
    /* compiled from: BaseBinderAdapter.kt */
    public final class ItemCallback extends DiffUtil.ItemCallback<Object> {
        public ItemCallback() {
        }

        @SuppressLint({"DiffUtilEquals"})
        public boolean areContentsTheSame(@NotNull Object obj, @NotNull Object obj2) {
            DiffUtil.ItemCallback itemCallback;
            if (!Intrinsics.areEqual((Object) obj.getClass(), (Object) obj2.getClass()) || (itemCallback = (DiffUtil.ItemCallback) BaseBinderAdapter.this.classDiffMap.get(obj.getClass())) == null) {
                return true;
            }
            return itemCallback.areContentsTheSame(obj, obj2);
        }

        public boolean areItemsTheSame(@NotNull Object obj, @NotNull Object obj2) {
            DiffUtil.ItemCallback itemCallback;
            if (!Intrinsics.areEqual((Object) obj.getClass(), (Object) obj2.getClass()) || (itemCallback = (DiffUtil.ItemCallback) BaseBinderAdapter.this.classDiffMap.get(obj.getClass())) == null) {
                return Intrinsics.areEqual(obj, obj2);
            }
            return itemCallback.areItemsTheSame(obj, obj2);
        }

        @Nullable
        public Object getChangePayload(@NotNull Object obj, @NotNull Object obj2) {
            DiffUtil.ItemCallback itemCallback;
            if (!Intrinsics.areEqual((Object) obj.getClass(), (Object) obj2.getClass()) || (itemCallback = (DiffUtil.ItemCallback) BaseBinderAdapter.this.classDiffMap.get(obj.getClass())) == null) {
                return null;
            }
            return itemCallback.getChangePayload(obj, obj2);
        }
    }

    public BaseBinderAdapter() {
        this((List) null, 1, (DefaultConstructorMarker) null);
    }

    public BaseBinderAdapter(@Nullable List<Object> list) {
        super(0, list);
        this.classDiffMap = new HashMap<>();
        this.mTypeMap = new HashMap<>();
        this.mBinderArray = new SparseArray<>();
        setDiffCallback(new ItemCallback());
    }

    public static /* synthetic */ BaseBinderAdapter addItemBinder$default(BaseBinderAdapter baseBinderAdapter, Class cls, BaseItemBinder baseItemBinder, DiffUtil.ItemCallback itemCallback, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                itemCallback = null;
            }
            return baseBinderAdapter.addItemBinder(cls, baseItemBinder, itemCallback);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addItemBinder");
    }

    @NotNull
    @JvmOverloads
    public final <T> BaseBinderAdapter addItemBinder(@NotNull Class<? extends T> cls, @NotNull BaseItemBinder<T, ?> baseItemBinder) {
        return addItemBinder$default(this, cls, baseItemBinder, (DiffUtil.ItemCallback) null, 4, (Object) null);
    }

    @NotNull
    @JvmOverloads
    public final <T> BaseBinderAdapter addItemBinder(@NotNull Class<? extends T> cls, @NotNull BaseItemBinder<T, ?> baseItemBinder, @Nullable DiffUtil.ItemCallback<T> itemCallback) {
        int size = this.mTypeMap.size() + 1;
        this.mTypeMap.put(cls, Integer.valueOf(size));
        this.mBinderArray.append(size, baseItemBinder);
        baseItemBinder.set_adapter$com_github_CymChad_brvah(this);
        if (itemCallback != null) {
            HashMap<Class<?>, DiffUtil.ItemCallback<Object>> hashMap = this.classDiffMap;
            if (itemCallback != null) {
                hashMap.put(cls, itemCallback);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.DiffUtil.ItemCallback<kotlin.Any>");
            }
        }
        return this;
    }

    public void bindChildClick(@NotNull BaseViewHolder baseViewHolder, int i) {
        if (getOnItemChildClickListener() == null) {
            BaseItemBinder<Object, BaseViewHolder> itemBinder = getItemBinder(i);
            for (Number intValue : itemBinder.getChildClickViewIds()) {
                View findViewById = baseViewHolder.itemView.findViewById(intValue.intValue());
                if (findViewById != null) {
                    if (!findViewById.isClickable()) {
                        findViewById.setClickable(true);
                    }
                    findViewById.setOnClickListener(new BaseBinderAdapter$bindChildClick$$inlined$forEach$lambda$1(this, baseViewHolder, itemBinder));
                }
            }
        }
        if (getOnItemChildLongClickListener() == null) {
            BaseItemBinder<Object, BaseViewHolder> itemBinder2 = getItemBinder(i);
            for (Number intValue2 : itemBinder2.getChildLongClickViewIds()) {
                View findViewById2 = baseViewHolder.itemView.findViewById(intValue2.intValue());
                if (findViewById2 != null) {
                    if (!findViewById2.isLongClickable()) {
                        findViewById2.setLongClickable(true);
                    }
                    findViewById2.setOnLongClickListener(new BaseBinderAdapter$bindChildClick$$inlined$forEach$lambda$2(this, baseViewHolder, itemBinder2));
                }
            }
        }
    }

    public void bindClick(@NotNull BaseViewHolder baseViewHolder) {
        if (getOnItemClickListener() == null) {
            baseViewHolder.itemView.setOnClickListener(new BaseBinderAdapter$bindClick$1(this, baseViewHolder));
        }
        if (getOnItemLongClickListener() == null) {
            baseViewHolder.itemView.setOnLongClickListener(new BaseBinderAdapter$bindClick$2(this, baseViewHolder));
        }
    }

    public void bindViewClickListener(@NotNull BaseViewHolder baseViewHolder, int i) {
        super.bindViewClickListener(baseViewHolder, i);
        bindClick(baseViewHolder);
        bindChildClick(baseViewHolder, i);
    }

    public void convert(@NotNull BaseViewHolder baseViewHolder, @NotNull Object obj) {
        getItemBinder(baseViewHolder.getItemViewType()).convert(baseViewHolder, obj);
    }

    public final int findViewType(@NotNull Class<?> cls) {
        Integer num = this.mTypeMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException(("findViewType: ViewType: " + cls + " Not Find!").toString());
    }

    public int getDefItemViewType(int i) {
        return findViewType(getData().get(i).getClass());
    }

    @NotNull
    public BaseItemBinder<Object, BaseViewHolder> getItemBinder(int i) {
        BaseItemBinder<Object, BaseViewHolder> baseItemBinder = this.mBinderArray.get(i);
        if (baseItemBinder != null) {
            return baseItemBinder;
        }
        throw new IllegalStateException(("getItemBinder: viewType '" + i + "' no such Binder found，please use addItemBinder() first!").toString());
    }

    @Nullable
    public BaseItemBinder<Object, BaseViewHolder> getItemBinderOrNull(int i) {
        BaseItemBinder<Object, BaseViewHolder> baseItemBinder = this.mBinderArray.get(i);
        if (!(baseItemBinder instanceof BaseItemBinder)) {
            return null;
        }
        return baseItemBinder;
    }

    @NotNull
    public BaseViewHolder onCreateDefViewHolder(@NotNull ViewGroup viewGroup, int i) {
        BaseItemBinder<Object, BaseViewHolder> itemBinder = getItemBinder(i);
        itemBinder.set_context$com_github_CymChad_brvah(getContext());
        return itemBinder.onCreateViewHolder(viewGroup, i);
    }

    public void convert(@NotNull BaseViewHolder baseViewHolder, @NotNull Object obj, @NotNull List<? extends Object> list) {
        getItemBinder(baseViewHolder.getItemViewType()).convert(baseViewHolder, obj, list);
    }

    public boolean onFailedToRecycleView(@NotNull BaseViewHolder baseViewHolder) {
        BaseItemBinder<Object, BaseViewHolder> itemBinderOrNull = getItemBinderOrNull(baseViewHolder.getItemViewType());
        if (itemBinderOrNull != null) {
            return itemBinderOrNull.onFailedToRecycleView(baseViewHolder);
        }
        return false;
    }

    public void onViewAttachedToWindow(@NotNull BaseViewHolder baseViewHolder) {
        super.onViewAttachedToWindow(baseViewHolder);
        BaseItemBinder<Object, BaseViewHolder> itemBinderOrNull = getItemBinderOrNull(baseViewHolder.getItemViewType());
        if (itemBinderOrNull != null) {
            itemBinderOrNull.onViewAttachedToWindow(baseViewHolder);
        }
    }

    public void onViewDetachedFromWindow(@NotNull BaseViewHolder baseViewHolder) {
        super.onViewDetachedFromWindow(baseViewHolder);
        BaseItemBinder<Object, BaseViewHolder> itemBinderOrNull = getItemBinderOrNull(baseViewHolder.getItemViewType());
        if (itemBinderOrNull != null) {
            itemBinderOrNull.onViewDetachedFromWindow(baseViewHolder);
        }
    }

    public static /* synthetic */ BaseBinderAdapter addItemBinder$default(BaseBinderAdapter baseBinderAdapter, BaseItemBinder baseItemBinder, DiffUtil.ItemCallback itemCallback, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                itemCallback = null;
            }
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            baseBinderAdapter.addItemBinder(Object.class, baseItemBinder, itemCallback);
            return baseBinderAdapter;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addItemBinder");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BaseBinderAdapter(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }

    @NotNull
    public final /* synthetic */ <T> BaseBinderAdapter addItemBinder(@NotNull BaseItemBinder<T, ?> baseItemBinder, @Nullable DiffUtil.ItemCallback<T> itemCallback) {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        addItemBinder(Object.class, baseItemBinder, itemCallback);
        return this;
    }
}
