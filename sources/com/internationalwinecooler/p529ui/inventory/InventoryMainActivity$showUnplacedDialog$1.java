package com.internationalwinecooler.p529ui.inventory;

import android.widget.RadioButton;
import androidx.fragment.app.Fragment;
import com.donkingliang.groupedadapter.holder.BaseViewHolder;
import com.internationalwinecooler.p529ui.fragment.dialog.UnplacedDialog;
import com.juconnect.connect_life.R$id;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00060\u0002R\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "Lcom/internationalwinecooler/ui/fragment/dialog/UnplacedDialog$ListenerBuilder;", "Lcom/internationalwinecooler/ui/fragment/dialog/UnplacedDialog;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.inventory.InventoryMainActivity$showUnplacedDialog$1 */
/* compiled from: InventoryMainActivity.kt */
public final class InventoryMainActivity$showUnplacedDialog$1 extends Lambda implements Function1<UnplacedDialog.ListenerBuilder, Unit> {
    public final /* synthetic */ BaseViewHolder $holder;
    public final /* synthetic */ InventoryMainActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InventoryMainActivity$showUnplacedDialog$1(InventoryMainActivity inventoryMainActivity, BaseViewHolder baseViewHolder) {
        super(1);
        this.this$0 = inventoryMainActivity;
        this.$holder = baseViewHolder;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((UnplacedDialog.ListenerBuilder) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull UnplacedDialog.ListenerBuilder listenerBuilder) {
        Intrinsics.checkNotNullParameter(listenerBuilder, "$this$addUnplacedDialogListener");
        final InventoryMainActivity inventoryMainActivity = this.this$0;
        final BaseViewHolder baseViewHolder = this.$holder;
        listenerBuilder.dismiss(new Function0<Unit>() {
            public final void invoke() {
                Fragment access$getCurrentFragment$p = inventoryMainActivity.currentFragment;
                if (Intrinsics.areEqual((Object) access$getCurrentFragment$p, (Object) inventoryMainActivity.wineExactCabinetFragment)) {
                    inventoryMainActivity.wineExactCabinetFragment.setUnplacedLayoutState(false, baseViewHolder);
                } else if (Intrinsics.areEqual((Object) access$getCurrentFragment$p, (Object) inventoryMainActivity.wineGenericCabinetFragment)) {
                    inventoryMainActivity.wineGenericCabinetFragment.setUnplacedLayoutState(false, baseViewHolder);
                }
            }
        });
        final InventoryMainActivity inventoryMainActivity2 = this.this$0;
        final BaseViewHolder baseViewHolder2 = this.$holder;
        listenerBuilder.confirm(new Function0<Unit>() {
            public final void invoke() {
                Fragment access$getCurrentFragment$p = inventoryMainActivity2.currentFragment;
                if (Intrinsics.areEqual((Object) access$getCurrentFragment$p, (Object) inventoryMainActivity2.wineExactCabinetFragment)) {
                    inventoryMainActivity2.wineExactCabinetFragment.setUnplacedLayoutState(false, baseViewHolder2);
                } else if (Intrinsics.areEqual((Object) access$getCurrentFragment$p, (Object) inventoryMainActivity2.wineGenericCabinetFragment)) {
                    inventoryMainActivity2.wineGenericCabinetFragment.setUnplacedLayoutState(false, baseViewHolder2);
                }
                ((RadioButton) inventoryMainActivity2._$_findCachedViewById(R$id.wine_list)).setChecked(true);
                ((RadioButton) inventoryMainActivity2._$_findCachedViewById(R$id.wine_cabinet)).setChecked(false);
                InventoryMainActivity inventoryMainActivity = inventoryMainActivity2;
                inventoryMainActivity.switchFragment(inventoryMainActivity.wineCategoryFragment);
                Boolean isInInventory = inventoryMainActivity2.getWineSortBaseModel().getFilterModel().isInInventory();
                Intrinsics.checkNotNull(isInInventory);
                if (isInInventory.booleanValue()) {
                    InventoryMainActivity inventoryMainActivity2 = inventoryMainActivity2;
                    inventoryMainActivity2.setSelectFilterCount(inventoryMainActivity2.getSelectFilterCount() + 1);
                }
                inventoryMainActivity2.setFilterCountShow();
                inventoryMainActivity2.getWineSortBaseModel().getFilterModel().setInInventory(Boolean.FALSE);
                inventoryMainActivity2.setSelectNoLocation(true);
                inventoryMainActivity2.getWineCategory();
            }
        });
    }
}
