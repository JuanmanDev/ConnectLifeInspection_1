package com.internationalwinecooler.p529ui.adapter.cabinet_exact;

import com.hisense.connect_life.core.listener.IItemCallback;
import kotlin.Metadata;
import kotlin.NotImplementedError;

@Metadata(mo47990d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, mo47991d2 = {"com/internationalwinecooler/ui/adapter/cabinet_exact/InventoryExactMainExpandAdapter$onBindChildViewHolder$1", "Lcom/hisense/connect_life/core/listener/IItemCallback;", "", "accept", "", "item", "cancel", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.adapter.cabinet_exact.InventoryExactMainExpandAdapter$onBindChildViewHolder$1 */
/* compiled from: InventoryExactMainExpandAdapter.kt */
public final class InventoryExactMainExpandAdapter$onBindChildViewHolder$1 implements IItemCallback<Integer> {
    public final /* synthetic */ InventoryExactMainExpandAdapter this$0;

    public InventoryExactMainExpandAdapter$onBindChildViewHolder$1(InventoryExactMainExpandAdapter inventoryExactMainExpandAdapter) {
        this.this$0 = inventoryExactMainExpandAdapter;
    }

    public /* bridge */ /* synthetic */ void accept(Object obj) {
        accept(((Number) obj).intValue());
    }

    public void cancel() {
        throw new NotImplementedError("An operation is not implemented: " + "Not yet implemented");
    }

    public void accept(int i) {
        IItemCallback access$getIItemCallback$p = this.this$0.iItemCallback;
        if (access$getIItemCallback$p != null) {
            access$getIItemCallback$p.accept(Integer.valueOf(i));
        }
    }
}
