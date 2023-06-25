package com.internationalwinecooler.viewmodel;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: InventoryWineViewModel.kt */
public final class InventoryWineViewModel$removeWineArrayNew$2 extends Lambda implements Function1<Boolean, Unit> {
    public final /* synthetic */ List<String> $curIdList;
    public final /* synthetic */ InventoryWineViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InventoryWineViewModel$removeWineArrayNew$2(InventoryWineViewModel inventoryWineViewModel, List<String> list) {
        super(1);
        this.this$0 = inventoryWineViewModel;
        this.$curIdList = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        this.this$0.getRemoveWineSucLiveData().setValue(this.$curIdList);
    }
}
