package com.chad.library.adapter.base;

import android.view.View;
import com.chad.library.adapter.base.binder.BaseItemBinder;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, mo47991d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/chad/library/adapter/base/BaseBinderAdapter$bindChildClick$1$1$1", "com/chad/library/adapter/base/BaseBinderAdapter$$special$$inlined$let$lambda$1"}, mo47992k = 3, mo47993mv = {1, 1, 16}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: BaseBinderAdapter.kt */
public final class BaseBinderAdapter$bindChildClick$$inlined$forEach$lambda$1 implements View.OnClickListener {
    public final /* synthetic */ BaseItemBinder $provider$inlined;
    public final /* synthetic */ BaseViewHolder $viewHolder$inlined;
    public final /* synthetic */ BaseBinderAdapter this$0;

    public BaseBinderAdapter$bindChildClick$$inlined$forEach$lambda$1(BaseBinderAdapter baseBinderAdapter, BaseViewHolder baseViewHolder, BaseItemBinder baseItemBinder) {
        this.this$0 = baseBinderAdapter;
        this.$viewHolder$inlined = baseViewHolder;
        this.$provider$inlined = baseItemBinder;
    }

    public final void onClick(View view) {
        int adapterPosition = this.$viewHolder$inlined.getAdapterPosition();
        if (adapterPosition != -1) {
            int headerLayoutCount = adapterPosition - this.this$0.getHeaderLayoutCount();
            BaseItemBinder baseItemBinder = this.$provider$inlined;
            BaseViewHolder baseViewHolder = this.$viewHolder$inlined;
            Intrinsics.checkExpressionValueIsNotNull(view, "v");
            baseItemBinder.onChildClick(baseViewHolder, view, this.this$0.getData().get(headerLayoutCount), headerLayoutCount);
        }
    }
}
