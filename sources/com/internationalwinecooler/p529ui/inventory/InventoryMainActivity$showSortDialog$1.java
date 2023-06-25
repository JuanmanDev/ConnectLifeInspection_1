package com.internationalwinecooler.p529ui.inventory;

import android.widget.TextView;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.utils.SPUtils;
import com.internationalwinecooler.p529ui.inventory.InventorySortDialog;
import com.juconnect.connect_life.R$id;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, mo47991d2 = {"com/internationalwinecooler/ui/inventory/InventoryMainActivity$showSortDialog$1", "Lcom/internationalwinecooler/ui/inventory/InventorySortDialog$ISortCallback;", "onSort", "", "sortId", "", "sortName", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.inventory.InventoryMainActivity$showSortDialog$1 */
/* compiled from: InventoryMainActivity.kt */
public final class InventoryMainActivity$showSortDialog$1 implements InventorySortDialog.ISortCallback {
    public final /* synthetic */ InventorySortDialog $dialog;
    public final /* synthetic */ InventoryMainActivity this$0;

    public InventoryMainActivity$showSortDialog$1(InventoryMainActivity inventoryMainActivity, InventorySortDialog inventorySortDialog) {
        this.this$0 = inventoryMainActivity;
        this.$dialog = inventorySortDialog;
    }

    public void onSort(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, KeyConst.KEY_SORTID);
        Intrinsics.checkNotNullParameter(str2, "sortName");
        this.this$0.sortId = str;
        this.$dialog.hideDialog();
        ((TextView) this.this$0._$_findCachedViewById(R$id.sort_text_name)).setText(str2);
        this.this$0.getWineSortBaseModel().setSort(str);
        this.this$0.getWineCategory();
        SPUtils.INSTANCE.put(KeyConst.KEY_SORTID, str);
    }
}
