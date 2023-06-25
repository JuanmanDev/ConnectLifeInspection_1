package com.internationalwinecooler.p529ui.fragment.cabinet_exact;

import androidx.lifecycle.ViewModelProviders;
import com.internationalwinecooler.p529ui.WineCabinetListModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo47991d2 = {"<anonymous>", "Lcom/internationalwinecooler/ui/WineCabinetListModel;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.fragment.cabinet_exact.InventoryExactCabinetFragment$inventoryWineViewModel$2 */
/* compiled from: InventoryExactCabinetFragment.kt */
public final class InventoryExactCabinetFragment$inventoryWineViewModel$2 extends Lambda implements Function0<WineCabinetListModel> {
    public final /* synthetic */ InventoryExactCabinetFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InventoryExactCabinetFragment$inventoryWineViewModel$2(InventoryExactCabinetFragment inventoryExactCabinetFragment) {
        super(0);
        this.this$0 = inventoryExactCabinetFragment;
    }

    @NotNull
    public final WineCabinetListModel invoke() {
        return (WineCabinetListModel) ViewModelProviders.m97of(this.this$0.requireActivity()).get(WineCabinetListModel.class);
    }
}
