package com.internationalwinecooler.p529ui.adapter.cabinet_exact;

import android.view.View;
import com.donkingliang.groupedadapter.holder.BaseViewHolder;
import com.internationalwinecooler.p529ui.inventory.InventoryMainActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.adapter.cabinet_exact.InventoryExactMainExpandAdapter$onBindChildViewHolder$23 */
/* compiled from: InventoryExactMainExpandAdapter.kt */
public final class InventoryExactMainExpandAdapter$onBindChildViewHolder$23 extends Lambda implements Function1<View, Unit> {
    public final /* synthetic */ BaseViewHolder $holder;
    public final /* synthetic */ InventoryExactMainExpandAdapter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InventoryExactMainExpandAdapter$onBindChildViewHolder$23(InventoryExactMainExpandAdapter inventoryExactMainExpandAdapter, BaseViewHolder baseViewHolder) {
        super(1);
        this.this$0 = inventoryExactMainExpandAdapter;
        this.$holder = baseViewHolder;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable View view) {
        if (this.this$0.getContext() instanceof InventoryMainActivity) {
            ((InventoryMainActivity) this.this$0.getContext()).showUnplacedDialog(this.$holder);
            this.this$0.setUnplacedLayoutState(true, this.$holder);
        }
    }
}