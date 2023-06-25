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
/* renamed from: com.internationalwinecooler.ui.inventory.InventoryFilterActivity$setListeners$6 */
/* compiled from: InventoryFilterActivity.kt */
public final class InventoryFilterActivity$setListeners$6 extends Lambda implements Function1<View, Unit> {
    public final /* synthetic */ InventoryFilterActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InventoryFilterActivity$setListeners$6(InventoryFilterActivity inventoryFilterActivity) {
        super(1);
        this.this$0 = inventoryFilterActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable View view) {
        if (Intrinsics.areEqual((Object) ((IconFontView) this.this$0._$_findCachedViewById(R$id.icon_show_deleted_items)).getText(), (Object) this.this$0.stringBtnSwitchOff)) {
            ((IconFontView) this.this$0._$_findCachedViewById(R$id.icon_show_deleted_items)).setText(this.this$0.stringBtnSwitchOn);
            this.this$0.mShowDeletedItems = Boolean.TRUE;
            return;
        }
        ((IconFontView) this.this$0._$_findCachedViewById(R$id.icon_show_deleted_items)).setText(this.this$0.stringBtnSwitchOff);
        this.this$0.mShowDeletedItems = Boolean.FALSE;
    }
}
