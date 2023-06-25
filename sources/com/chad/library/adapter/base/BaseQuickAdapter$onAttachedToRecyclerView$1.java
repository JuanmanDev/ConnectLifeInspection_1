package com.chad.library.adapter.base;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p040c.p111f.p112a.p113a.p114a.p116b.C1985a;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\u000f\n\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo47991d2 = {"com/chad/library/adapter/base/BaseQuickAdapter$onAttachedToRecyclerView$1", "androidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup", "", "position", "getSpanSize", "(I)I", "com.github.CymChad.brvah"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: BaseQuickAdapter.kt */
public final class BaseQuickAdapter$onAttachedToRecyclerView$1 extends GridLayoutManager.SpanSizeLookup {
    public final /* synthetic */ GridLayoutManager.SpanSizeLookup $defSpanSizeLookup;
    public final /* synthetic */ RecyclerView.LayoutManager $manager;
    public final /* synthetic */ BaseQuickAdapter this$0;

    public BaseQuickAdapter$onAttachedToRecyclerView$1(BaseQuickAdapter baseQuickAdapter, RecyclerView.LayoutManager layoutManager, GridLayoutManager.SpanSizeLookup spanSizeLookup) {
        this.this$0 = baseQuickAdapter;
        this.$manager = layoutManager;
        this.$defSpanSizeLookup = spanSizeLookup;
    }

    public int getSpanSize(int i) {
        int itemViewType = this.this$0.getItemViewType(i);
        if (itemViewType == 268435729 && this.this$0.getHeaderViewAsFlow()) {
            return 1;
        }
        if (itemViewType == 268436275 && this.this$0.getFooterViewAsFlow()) {
            return 1;
        }
        if (this.this$0.mSpanSizeLookup == null) {
            return this.this$0.isFixedViewType(itemViewType) ? ((GridLayoutManager) this.$manager).getSpanCount() : this.$defSpanSizeLookup.getSpanSize(i);
        }
        if (this.this$0.isFixedViewType(itemViewType)) {
            return ((GridLayoutManager) this.$manager).getSpanCount();
        }
        C1985a access$getMSpanSizeLookup$p = this.this$0.mSpanSizeLookup;
        if (access$getMSpanSizeLookup$p == null) {
            Intrinsics.throwNpe();
        }
        return access$getMSpanSizeLookup$p.mo16542a((GridLayoutManager) this.$manager, itemViewType, i - this.this$0.getHeaderLayoutCount());
    }
}
