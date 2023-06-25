package com.internationalwinecooler.p529ui.inventory;

import com.hisense.connect_life.core.listener.IPredicate;
import kotlin.Metadata;

@Metadata(mo47990d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, mo47991d2 = {"com/internationalwinecooler/ui/inventory/InventoryMainActivity$addWine$1", "Lcom/hisense/connect_life/core/listener/IPredicate;", "accept", "", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.inventory.InventoryMainActivity$addWine$1 */
/* compiled from: InventoryMainActivity.kt */
public final class InventoryMainActivity$addWine$1 implements IPredicate {
    public final /* synthetic */ InventoryMainActivity this$0;

    public InventoryMainActivity$addWine$1(InventoryMainActivity inventoryMainActivity) {
        this.this$0 = inventoryMainActivity;
    }

    public void accept() {
        this.this$0.requestCameraPermission();
    }
}
