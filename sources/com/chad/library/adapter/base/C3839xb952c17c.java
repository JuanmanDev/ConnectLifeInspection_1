package com.chad.library.adapter.base;

import android.view.View;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, mo47991d2 = {"<anonymous>", "", "T", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/chad/library/adapter/base/BaseProviderMultiAdapter$bindChildClick$1$1$1", "com/chad/library/adapter/base/BaseProviderMultiAdapter$$special$$inlined$let$lambda$1"}, mo47992k = 3, mo47993mv = {1, 1, 16}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* renamed from: com.chad.library.adapter.base.BaseProviderMultiAdapter$bindChildClick$$inlined$forEach$lambda$1 */
/* compiled from: BaseProviderMultiAdapter.kt */
public final class C3839xb952c17c implements View.OnClickListener {
    public final /* synthetic */ BaseItemProvider $provider$inlined;
    public final /* synthetic */ BaseViewHolder $viewHolder$inlined;
    public final /* synthetic */ BaseProviderMultiAdapter this$0;

    public C3839xb952c17c(BaseProviderMultiAdapter baseProviderMultiAdapter, BaseViewHolder baseViewHolder, BaseItemProvider baseItemProvider) {
        this.this$0 = baseProviderMultiAdapter;
        this.$viewHolder$inlined = baseViewHolder;
        this.$provider$inlined = baseItemProvider;
    }

    public final void onClick(View view) {
        int adapterPosition = this.$viewHolder$inlined.getAdapterPosition();
        if (adapterPosition != -1) {
            int headerLayoutCount = adapterPosition - this.this$0.getHeaderLayoutCount();
            BaseItemProvider baseItemProvider = this.$provider$inlined;
            BaseViewHolder baseViewHolder = this.$viewHolder$inlined;
            Intrinsics.checkExpressionValueIsNotNull(view, "v");
            baseItemProvider.onChildClick(baseViewHolder, view, this.this$0.getData().get(headerLayoutCount), headerLayoutCount);
        }
    }
}
