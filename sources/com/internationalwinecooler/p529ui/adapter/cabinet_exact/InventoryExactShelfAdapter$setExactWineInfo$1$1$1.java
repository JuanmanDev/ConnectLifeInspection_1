package com.internationalwinecooler.p529ui.adapter.cabinet_exact;

import com.hisense.connect_life.core.listener.IItemCallback;
import com.hisense.connect_life.core.widget.InventoryExactPositionTextView;
import com.hisense.juconnect.connectlife.R;
import com.juconnect.connectlife.model.WineInventoryBean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo47990d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, mo47991d2 = {"com/internationalwinecooler/ui/adapter/cabinet_exact/InventoryExactShelfAdapter$setExactWineInfo$1$1$1", "Lcom/hisense/connect_life/core/listener/IItemCallback;", "", "accept", "", "item", "cancel", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.adapter.cabinet_exact.InventoryExactShelfAdapter$setExactWineInfo$1$1$1 */
/* compiled from: InventoryExactShelfAdapter.kt */
public final class InventoryExactShelfAdapter$setExactWineInfo$1$1$1 implements IItemCallback<Boolean> {
    public final /* synthetic */ int $cuBlackResId;
    public final /* synthetic */ int $cuGreenResId;
    public final /* synthetic */ int $textColor;
    public final /* synthetic */ InventoryExactPositionTextView $this_apply;
    public final /* synthetic */ WineInventoryBean $wineInventoryBean;

    public InventoryExactShelfAdapter$setExactWineInfo$1$1$1(WineInventoryBean wineInventoryBean, InventoryExactPositionTextView inventoryExactPositionTextView, int i, int i2, int i3) {
        this.$wineInventoryBean = wineInventoryBean;
        this.$this_apply = inventoryExactPositionTextView;
        this.$cuGreenResId = i;
        this.$cuBlackResId = i2;
        this.$textColor = i3;
    }

    public /* bridge */ /* synthetic */ void accept(Object obj) {
        accept(((Boolean) obj).booleanValue());
    }

    public void cancel() {
    }

    public void accept(boolean z) {
        if (this.$wineInventoryBean.isFavorite() != null) {
            Boolean isFavorite = this.$wineInventoryBean.isFavorite();
            Intrinsics.checkNotNull(isFavorite);
            if (isFavorite.booleanValue()) {
                this.$this_apply.setBackgroundResource(this.$cuGreenResId);
                InventoryExactPositionTextView inventoryExactPositionTextView = this.$this_apply;
                inventoryExactPositionTextView.setTextColor(inventoryExactPositionTextView.getResources().getColor(R.color.colorButton));
                return;
            }
        }
        this.$this_apply.setBackgroundResource(this.$cuBlackResId);
        InventoryExactPositionTextView inventoryExactPositionTextView2 = this.$this_apply;
        inventoryExactPositionTextView2.setTextColor(inventoryExactPositionTextView2.getResources().getColor(this.$textColor));
    }
}
