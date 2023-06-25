package com.chad.library.adapter.base;

import androidx.annotation.LayoutRes;
import com.chad.library.adapter.base.entity.SectionEntity;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u00020\u0005B/\b\u0016\u0012\b\b\u0001\u0010\u001c\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u000f\u0012\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000b¢\u0006\u0004\b\u001f\u0010 B%\b\u0007\u0012\b\b\u0001\u0010\u001c\u001a\u00020\u000f\u0012\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000b¢\u0006\u0004\b\u001f\u0010!J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00028\u0000H$¢\u0006\u0004\b\t\u0010\nJ-\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00028\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0014¢\u0006\u0004\b\t\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00028\u00012\u0006\u0010\u0015\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00028\u00012\u0006\u0010\u0015\u001a\u00020\u000f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\b2\b\b\u0001\u0010\u0019\u001a\u00020\u000fH\u0004¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u000f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\""}, mo47991d2 = {"Lcom/chad/library/adapter/base/BaseSectionQuickAdapter;", "Lcom/chad/library/adapter/base/entity/SectionEntity;", "T", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "VH", "Lcom/chad/library/adapter/base/BaseMultiItemQuickAdapter;", "helper", "item", "", "convertHeader", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/chad/library/adapter/base/entity/SectionEntity;)V", "", "", "payloads", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/chad/library/adapter/base/entity/SectionEntity;Ljava/util/List;)V", "", "type", "", "isFixedViewType", "(I)Z", "holder", "position", "onBindViewHolder", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;I)V", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;ILjava/util/List;)V", "layoutResId", "setNormalLayout", "(I)V", "sectionHeadResId", "I", "data", "<init>", "(IILjava/util/List;)V", "(ILjava/util/List;)V", "com.github.CymChad.brvah"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: BaseSectionQuickAdapter.kt */
public abstract class BaseSectionQuickAdapter<T extends SectionEntity, VH extends BaseViewHolder> extends BaseMultiItemQuickAdapter<T, VH> {
    public final int sectionHeadResId;

    @JvmOverloads
    public BaseSectionQuickAdapter(@LayoutRes int i) {
        this(i, (List) null, 2, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BaseSectionQuickAdapter(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : list);
    }

    public abstract void convertHeader(@NotNull VH vh, @NotNull T t);

    public void convertHeader(@NotNull VH vh, @NotNull T t, @NotNull List<Object> list) {
    }

    public boolean isFixedViewType(int i) {
        return super.isFixedViewType(i) || i == -99;
    }

    public final void setNormalLayout(@LayoutRes int i) {
        addItemType(-100, i);
    }

    @JvmOverloads
    public BaseSectionQuickAdapter(@LayoutRes int i, @Nullable List<T> list) {
        super(list);
        this.sectionHeadResId = i;
        addItemType(-99, i);
    }

    public void onBindViewHolder(@NotNull VH vh, int i) {
        if (vh.getItemViewType() == -99) {
            convertHeader(vh, (SectionEntity) getItem(i - getHeaderLayoutCount()));
        } else {
            super.onBindViewHolder(vh, i);
        }
    }

    public BaseSectionQuickAdapter(@LayoutRes int i, @LayoutRes int i2, @Nullable List<T> list) {
        this(i, list);
        setNormalLayout(i2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BaseSectionQuickAdapter(int i, int i2, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? null : list);
    }

    public void onBindViewHolder(@NotNull VH vh, int i, @NotNull List<Object> list) {
        if (list.isEmpty()) {
            onBindViewHolder(vh, i);
        } else if (vh.getItemViewType() == -99) {
            convertHeader(vh, (SectionEntity) getItem(i - getHeaderLayoutCount()), list);
        } else {
            super.onBindViewHolder(vh, i, list);
        }
    }
}
