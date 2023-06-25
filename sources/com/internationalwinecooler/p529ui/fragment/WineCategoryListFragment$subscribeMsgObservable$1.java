package com.internationalwinecooler.p529ui.fragment;

import com.hisense.connect_life.hismart.networks.request.message.listener.SimpleMessageReceived;
import com.hisense.connect_life.hismart.networks.request.message.model.InventoryMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, mo47991d2 = {"com/internationalwinecooler/ui/fragment/WineCategoryListFragment$subscribeMsgObservable$1", "Lcom/hisense/connect_life/hismart/networks/request/message/listener/SimpleMessageReceived;", "onInventoryMessage", "", "inventoryMessage", "Lcom/hisense/connect_life/hismart/networks/request/message/model/InventoryMessage;", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.fragment.WineCategoryListFragment$subscribeMsgObservable$1 */
/* compiled from: WineCategoryListFragment.kt */
public final class WineCategoryListFragment$subscribeMsgObservable$1 extends SimpleMessageReceived {
    public final /* synthetic */ WineCategoryListFragment this$0;

    public WineCategoryListFragment$subscribeMsgObservable$1(WineCategoryListFragment wineCategoryListFragment) {
        this.this$0 = wineCategoryListFragment;
    }

    public void onInventoryMessage(@NotNull InventoryMessage inventoryMessage) {
        Intrinsics.checkNotNullParameter(inventoryMessage, "inventoryMessage");
        this.this$0.getParentActivity().getWineCategory();
    }
}
