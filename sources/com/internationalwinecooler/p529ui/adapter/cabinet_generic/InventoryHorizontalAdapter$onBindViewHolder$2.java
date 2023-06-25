package com.internationalwinecooler.p529ui.adapter.cabinet_generic;

import android.view.View;
import com.internationalwinecooler.p529ui.inventory.InventoryMainActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.adapter.cabinet_generic.InventoryHorizontalAdapter$onBindViewHolder$2 */
/* compiled from: InventoryHorizontalAdapter.kt */
public final class InventoryHorizontalAdapter$onBindViewHolder$2 extends Lambda implements Function1<View, Unit> {
    public final /* synthetic */ int $position;
    public final /* synthetic */ InventoryHorizontalAdapter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InventoryHorizontalAdapter$onBindViewHolder$2(InventoryHorizontalAdapter inventoryHorizontalAdapter, int i) {
        super(1);
        this.this$0 = inventoryHorizontalAdapter;
        this.$position = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable View view) {
        Boolean isFavorite = this.this$0.getWineList().get(this.$position).isFavorite();
        if (isFavorite != null) {
            InventoryHorizontalAdapter inventoryHorizontalAdapter = this.this$0;
            inventoryHorizontalAdapter.getWineList().get(this.$position).setFavorite(Boolean.valueOf(!isFavorite.booleanValue()));
        }
        if (this.this$0.getContext() instanceof InventoryMainActivity) {
            ((InventoryMainActivity) this.this$0.getContext()).updateWineFavorite(this.this$0.getWineList().get(this.$position), false);
        }
    }
}
