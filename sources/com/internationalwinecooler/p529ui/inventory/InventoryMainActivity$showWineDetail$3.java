package com.internationalwinecooler.p529ui.inventory;

import com.hisense.connect_life.core.listener.IItemCallback;
import com.juconnect.connectlife.model.WineInventoryBean;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\b"}, mo47991d2 = {"com/internationalwinecooler/ui/inventory/InventoryMainActivity$showWineDetail$3", "Lcom/hisense/connect_life/core/listener/IItemCallback;", "", "Lcom/juconnect/connectlife/model/WineInventoryBean;", "accept", "", "item", "cancel", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.inventory.InventoryMainActivity$showWineDetail$3 */
/* compiled from: InventoryMainActivity.kt */
public final class InventoryMainActivity$showWineDetail$3 implements IItemCallback<List<? extends WineInventoryBean>> {
    public final /* synthetic */ InventoryMainActivity this$0;

    public InventoryMainActivity$showWineDetail$3(InventoryMainActivity inventoryMainActivity) {
        this.this$0 = inventoryMainActivity;
    }

    public void cancel() {
    }

    public void accept(@NotNull List<WineInventoryBean> list) {
        Intrinsics.checkNotNullParameter(list, "item");
        if (!list.isEmpty() && list.size() > 0) {
            Job unused = BuildersKt__Builders_commonKt.launch$default(this.this$0, Dispatchers.getIO(), (CoroutineStart) null, new InventoryMainActivity$showWineDetail$3$accept$1(list, this.this$0, (Continuation<? super InventoryMainActivity$showWineDetail$3$accept$1>) null), 2, (Object) null);
        }
    }
}
