package com.internationalwinecooler.p529ui.fragment.dialog;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.fragment.dialog.InventoryBestToServeYearDialog$setListeners$2 */
/* compiled from: InventoryBestToServeYearDialog.kt */
public final class InventoryBestToServeYearDialog$setListeners$2 extends Lambda implements Function1<View, Unit> {
    public final /* synthetic */ InventoryBestToServeYearDialog this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InventoryBestToServeYearDialog$setListeners$2(InventoryBestToServeYearDialog inventoryBestToServeYearDialog) {
        super(1);
        this.this$0 = inventoryBestToServeYearDialog;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable View view) {
        this.this$0.mIsClickConfirm = true;
        InventoryBestToServeYearDialog inventoryBestToServeYearDialog = this.this$0;
        inventoryBestToServeYearDialog.startYear = ((Number) inventoryBestToServeYearDialog.startYearList.get(this.this$0.startCurrentItem)).intValue();
        InventoryBestToServeYearDialog inventoryBestToServeYearDialog2 = this.this$0;
        inventoryBestToServeYearDialog2.endYear = ((Number) inventoryBestToServeYearDialog2.endYearList.get(this.this$0.endCurrentItem)).intValue();
        this.this$0.dismiss();
    }
}
