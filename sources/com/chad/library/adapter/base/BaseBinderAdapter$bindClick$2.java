package com.chad.library.adapter.base;

import android.view.View;
import com.chad.library.adapter.base.binder.BaseItemBinder;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo47991d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick"}, mo47992k = 3, mo47993mv = {1, 1, 16}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: BaseBinderAdapter.kt */
public final class BaseBinderAdapter$bindClick$2 implements View.OnLongClickListener {
    public final /* synthetic */ BaseViewHolder $viewHolder;
    public final /* synthetic */ BaseBinderAdapter this$0;

    public BaseBinderAdapter$bindClick$2(BaseBinderAdapter baseBinderAdapter, BaseViewHolder baseViewHolder) {
        this.this$0 = baseBinderAdapter;
        this.$viewHolder = baseViewHolder;
    }

    public final boolean onLongClick(View view) {
        int adapterPosition = this.$viewHolder.getAdapterPosition();
        if (adapterPosition == -1) {
            return false;
        }
        int headerLayoutCount = adapterPosition - this.this$0.getHeaderLayoutCount();
        BaseItemBinder<Object, BaseViewHolder> itemBinder = this.this$0.getItemBinder(this.$viewHolder.getItemViewType());
        BaseViewHolder baseViewHolder = this.$viewHolder;
        Intrinsics.checkExpressionValueIsNotNull(view, LanguageConstKt.f15954it);
        return itemBinder.onLongClick(baseViewHolder, view, this.this$0.getData().get(headerLayoutCount), headerLayoutCount);
    }
}
