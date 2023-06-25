package com.internationalwinecooler.p529ui.inventory;

import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import com.juconnect.connect_life.R$id;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.inventory.InventoryMainActivity$setListeners$7 */
/* compiled from: InventoryMainActivity.kt */
public final class InventoryMainActivity$setListeners$7 extends Lambda implements Function1<View, Unit> {
    public final /* synthetic */ InventoryMainActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InventoryMainActivity$setListeners$7(InventoryMainActivity inventoryMainActivity) {
        super(1);
        this.this$0 = inventoryMainActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable View view) {
        this.this$0.hideKeyboard();
        ((EditText) this.this$0._$_findCachedViewById(R$id.edit_search)).setText("");
        RelativeLayout relativeLayout = (RelativeLayout) this.this$0._$_findCachedViewById(R$id.normal_top_view);
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "normal_top_view");
        relativeLayout.setVisibility(0);
        this.this$0.setAddWineLayoutShow(true);
        RelativeLayout relativeLayout2 = (RelativeLayout) this.this$0._$_findCachedViewById(R$id.top_search_view);
        Intrinsics.checkNotNullExpressionValue(relativeLayout2, "top_search_view");
        relativeLayout2.setVisibility(8);
    }
}
