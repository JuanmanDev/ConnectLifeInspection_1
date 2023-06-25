package com.internationalwinecooler.p529ui.fragment;

import com.hisense.connect_life.core.utils.Holder;
import com.hisense.connect_life.hismart.networks.request.wine.model.WineCategoryInfo;
import com.internationalwinecooler.p529ui.adapter.WineCategoryListAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, mo47991d2 = {"com/internationalwinecooler/ui/fragment/WineCategoryListFragment$setListeners$3", "Lcom/internationalwinecooler/ui/adapter/WineCategoryListAdapter$ClickFavoriteCallback;", "clickFavorite", "", "wine", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/WineCategoryInfo;", "holder", "Lcom/hisense/connect_life/core/utils/Holder;", "position", "", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.fragment.WineCategoryListFragment$setListeners$3 */
/* compiled from: WineCategoryListFragment.kt */
public final class WineCategoryListFragment$setListeners$3 implements WineCategoryListAdapter.ClickFavoriteCallback {
    public final /* synthetic */ WineCategoryListFragment this$0;

    public WineCategoryListFragment$setListeners$3(WineCategoryListFragment wineCategoryListFragment) {
        this.this$0 = wineCategoryListFragment;
    }

    public void clickFavorite(@NotNull WineCategoryInfo wineCategoryInfo, @NotNull Holder holder, int i) {
        Intrinsics.checkNotNullParameter(wineCategoryInfo, "wine");
        Intrinsics.checkNotNullParameter(holder, "holder");
        this.this$0.mHolder = holder;
        this.this$0.mPosition = i;
        this.this$0.mIsFavorite = wineCategoryInfo.getFavorite() == 1;
        this.this$0.getParentActivity().updateWineCategoryFavorite(wineCategoryInfo, true);
    }
}
