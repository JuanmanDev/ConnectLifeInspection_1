package com.internationalwinecooler.p529ui.adapter;

import android.view.View;
import android.widget.ImageView;
import com.hisense.connect_life.core.utils.Holder;
import com.hisense.connect_life.core.widget.IconFontView;
import com.hisense.juconnect.connectlife.R;
import com.internationalwinecooler.p529ui.adapter.WineCategoryListAdapter;
import com.juconnect.connect_life.R$id;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.adapter.WineCategoryListAdapter$onBindViewHolder$2 */
/* compiled from: WineCategoryListAdapter.kt */
public final class WineCategoryListAdapter$onBindViewHolder$2 extends Lambda implements Function1<View, Unit> {
    public final /* synthetic */ Holder $holder;
    public final /* synthetic */ int $position;
    public final /* synthetic */ WineCategoryListAdapter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WineCategoryListAdapter$onBindViewHolder$2(WineCategoryListAdapter wineCategoryListAdapter, Holder holder, int i) {
        super(1);
        this.this$0 = wineCategoryListAdapter;
        this.$holder = holder;
        this.$position = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable View view) {
        if (this.this$0.picIsSelect) {
            ImageView imageView = (ImageView) this.$holder.itemView.findViewById(R$id.image_wine);
            Intrinsics.checkNotNullExpressionValue(imageView, "holder.itemView.image_wine");
            if (imageView.getVisibility() == 0) {
                WineCategoryListAdapter wineCategoryListAdapter = this.this$0;
                wineCategoryListAdapter.selectNum = wineCategoryListAdapter.selectNum + 1;
                ((ImageView) this.$holder.itemView.findViewById(R$id.image_wine)).setVisibility(8);
                ((IconFontView) this.$holder.itemView.findViewById(R$id.ic_selected)).setVisibility(0);
                this.$holder.itemView.setBackgroundResource(R.color.colorWhite);
                this.this$0.selectedWineList.add(((WineCategoryInfoWrapper) this.this$0.mFilterList.get(this.$position)).getWineCategoryInfo());
                this.this$0.idCategoriesList.add(String.valueOf(((WineCategoryInfoWrapper) this.this$0.mFilterList.get(this.$position)).getWineCategoryInfo().getCategoryId()));
                ((WineCategoryInfoWrapper) this.this$0.mFilterList.get(this.$position)).setSelected(true);
            } else {
                WineCategoryListAdapter wineCategoryListAdapter2 = this.this$0;
                wineCategoryListAdapter2.selectNum = wineCategoryListAdapter2.selectNum - 1;
                ((ImageView) this.$holder.itemView.findViewById(R$id.image_wine)).setVisibility(0);
                ((IconFontView) this.$holder.itemView.findViewById(R$id.ic_selected)).setVisibility(8);
                this.$holder.itemView.setBackgroundResource(R.color.transparent);
                this.this$0.selectedWineList.remove(((WineCategoryInfoWrapper) this.this$0.mFilterList.get(this.$position)).getWineCategoryInfo());
                this.this$0.idCategoriesList.remove(String.valueOf(((WineCategoryInfoWrapper) this.this$0.mFilterList.get(this.$position)).getWineCategoryInfo().getCategoryId()));
                ((WineCategoryInfoWrapper) this.this$0.mFilterList.get(this.$position)).setSelected(false);
            }
            WineCategoryListAdapter.SelectDeleteCallback access$getSelectDeleteCallback$p = this.this$0.selectDeleteCallback;
            if (access$getSelectDeleteCallback$p != null) {
                access$getSelectDeleteCallback$p.onSelectDelete(this.this$0.selectNum, this.this$0.idCategoriesList, this.this$0.selectedWineList);
            }
        }
    }
}
