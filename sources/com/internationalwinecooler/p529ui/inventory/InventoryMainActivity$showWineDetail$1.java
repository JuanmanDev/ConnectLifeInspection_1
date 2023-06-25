package com.internationalwinecooler.p529ui.inventory;

import com.hisense.connect_life.core.listener.IItemCallback;
import com.juconnect.connectlife.model.WineInventoryBean;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, mo47991d2 = {"com/internationalwinecooler/ui/inventory/InventoryMainActivity$showWineDetail$1", "Lcom/hisense/connect_life/core/listener/IItemCallback;", "Lcom/juconnect/connectlife/model/WineInventoryBean;", "accept", "", "item", "cancel", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.inventory.InventoryMainActivity$showWineDetail$1 */
/* compiled from: InventoryMainActivity.kt */
public final class InventoryMainActivity$showWineDetail$1 implements IItemCallback<WineInventoryBean> {
    public final /* synthetic */ InventoryMainActivity this$0;

    public InventoryMainActivity$showWineDetail$1(InventoryMainActivity inventoryMainActivity) {
        this.this$0 = inventoryMainActivity;
    }

    public void cancel() {
        throw new NotImplementedError("An operation is not implemented: " + "Not yet implemented");
    }

    public void accept(@NotNull WineInventoryBean wineInventoryBean) {
        Intrinsics.checkNotNullParameter(wineInventoryBean, "item");
        String idInventory = wineInventoryBean.getIdInventory();
        if (idInventory != null) {
            InventoryMainActivity inventoryMainActivity = this.this$0;
            inventoryMainActivity.showLoading();
            InventoryMainActivity.access$getMViewModel(inventoryMainActivity).removeWineArrayNew(CollectionsKt__CollectionsJVMKt.listOf(Long.valueOf(Long.parseLong(idInventory))));
        }
    }
}
