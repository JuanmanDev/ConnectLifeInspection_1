package com.internationalwinecooler.p529ui.fragment.dialog;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p117g.p118a.C1994a;

@Metadata(mo47990d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, mo47991d2 = {"com/internationalwinecooler/ui/fragment/dialog/InventoryRegionDialog$initSelecter$1", "Lcom/contrarywind/adapter/WheelAdapter;", "", "getItem", "index", "", "getItemsCount", "indexOf", "o", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.fragment.dialog.InventoryRegionDialog$initSelecter$1 */
/* compiled from: InventoryRegionDialog.kt */
public final class InventoryRegionDialog$initSelecter$1 implements C1994a<Object> {
    public final /* synthetic */ InventoryRegionDialog this$0;

    public InventoryRegionDialog$initSelecter$1(InventoryRegionDialog inventoryRegionDialog) {
        this.this$0 = inventoryRegionDialog;
    }

    @NotNull
    public Object getItem(int i) {
        return this.this$0.list.get(i);
    }

    public int getItemsCount() {
        return this.this$0.list.size();
    }

    public int indexOf(@Nullable Object obj) {
        return CollectionsKt___CollectionsKt.indexOf(this.this$0.list, obj);
    }
}
