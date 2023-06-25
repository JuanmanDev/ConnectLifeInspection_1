package com.internationalwinecooler.p529ui.inventory;

import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.core.utils.SPUtils;
import com.hisense.connect_life.core.widget.DragCustomView;
import com.internationalwinecooler.NoApplianceDialog;
import com.juconnect.connect_life.R$id;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.inventory.InventoryMainActivity$setListeners$4 */
/* compiled from: InventoryMainActivity.kt */
public final class InventoryMainActivity$setListeners$4 extends Lambda implements Function1<View, Unit> {
    public final /* synthetic */ InventoryMainActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InventoryMainActivity$setListeners$4(InventoryMainActivity inventoryMainActivity) {
        super(1);
        this.this$0 = inventoryMainActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable View view) {
        if (!((DragCustomView) this.this$0._$_findCachedViewById(R$id.add_wine_layout)).isDrag()) {
            Object obj = SPUtils.INSTANCE.get(LanguageConstKt.f15962no, Boolean.FALSE);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            } else if (!((Boolean) obj).booleanValue()) {
                this.this$0.addWine();
            } else {
                NoApplianceDialog noApplianceDialog = new NoApplianceDialog();
                FragmentManager supportFragmentManager = this.this$0.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
                JuConnectExtKt.displayDialog(noApplianceDialog, supportFragmentManager);
            }
        }
    }
}
