package com.internationalwinecooler.p529ui.inventory;

import android.view.View;
import com.hisense.connect_life.core.widget.IconFontView;
import com.juconnect.connect_life.R$id;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.inventory.InventoryFilterActivity$initWineType$1$1 */
/* compiled from: InventoryFilterActivity.kt */
public final class InventoryFilterActivity$initWineType$1$1 extends Lambda implements Function1<View, Unit> {
    public final /* synthetic */ View $itemView;
    public final /* synthetic */ String $wineItemType;
    public final /* synthetic */ InventoryFilterActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InventoryFilterActivity$initWineType$1$1(View view, InventoryFilterActivity inventoryFilterActivity, String str) {
        super(1);
        this.$itemView = view;
        this.this$0 = inventoryFilterActivity;
        this.$wineItemType = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable View view) {
        if (Intrinsics.areEqual((Object) ((IconFontView) this.$itemView.findViewById(R$id.icon_type_view)).getText(), (Object) this.this$0.stringBtnMainCheckboxNormal)) {
            ((IconFontView) this.$itemView.findViewById(R$id.icon_type_view)).setText(this.this$0.stringBtnMainCheckboxSelected);
            this.this$0.mWineType.add(this.$wineItemType);
            InventoryFilterActivity inventoryFilterActivity = this.this$0;
            inventoryFilterActivity.wineTypeSelected = inventoryFilterActivity.wineTypeSelected + 1;
            int unused = inventoryFilterActivity.wineTypeSelected;
            return;
        }
        InventoryFilterActivity inventoryFilterActivity2 = this.this$0;
        inventoryFilterActivity2.wineTypeSelected = inventoryFilterActivity2.wineTypeSelected - 1;
        int unused2 = inventoryFilterActivity2.wineTypeSelected;
        ((IconFontView) this.$itemView.findViewById(R$id.icon_type_view)).setText(this.this$0.stringBtnMainCheckboxNormal);
        this.this$0.mWineType.remove(this.$wineItemType);
    }
}
