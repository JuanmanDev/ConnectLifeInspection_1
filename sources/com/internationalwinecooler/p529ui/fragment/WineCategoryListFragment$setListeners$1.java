package com.internationalwinecooler.p529ui.fragment;

import com.hisense.connect_life.core.listener.IItemIndexedCallback;
import com.hisense.connect_life.hismart.networks.request.wine.model.WineCategoryInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, mo47991d2 = {"com/internationalwinecooler/ui/fragment/WineCategoryListFragment$setListeners$1", "Lcom/hisense/connect_life/core/listener/IItemIndexedCallback;", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/WineCategoryInfo;", "accept", "", "index", "", "item", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.fragment.WineCategoryListFragment$setListeners$1 */
/* compiled from: WineCategoryListFragment.kt */
public final class WineCategoryListFragment$setListeners$1 implements IItemIndexedCallback<WineCategoryInfo> {
    public final /* synthetic */ WineCategoryListFragment this$0;

    public WineCategoryListFragment$setListeners$1(WineCategoryListFragment wineCategoryListFragment) {
        this.this$0 = wineCategoryListFragment;
    }

    public void accept(int i, @NotNull WineCategoryInfo wineCategoryInfo) {
        Intrinsics.checkNotNullParameter(wineCategoryInfo, "item");
        this.this$0.getParentActivity().gotoWineDetailFromCategory(wineCategoryInfo);
    }
}
