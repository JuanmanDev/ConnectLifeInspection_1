package com.internationalwinecooler.p529ui.fragment;

import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.hismart.networks.request.wine.model.WineCategoryInfo;
import com.internationalwinecooler.p529ui.adapter.WineCategoryListAdapter;
import com.juconnect.connect_life.R$id;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0016¨\u0006\u000b"}, mo47991d2 = {"com/internationalwinecooler/ui/fragment/WineCategoryListFragment$setListeners$2", "Lcom/internationalwinecooler/ui/adapter/WineCategoryListAdapter$SelectDeleteCallback;", "onSelectDelete", "", "selectNum", "", "idInventoryList", "", "", "wineList", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/WineCategoryInfo;", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.fragment.WineCategoryListFragment$setListeners$2 */
/* compiled from: WineCategoryListFragment.kt */
public final class WineCategoryListFragment$setListeners$2 implements WineCategoryListAdapter.SelectDeleteCallback {
    public final /* synthetic */ WineCategoryListFragment this$0;

    public WineCategoryListFragment$setListeners$2(WineCategoryListFragment wineCategoryListFragment) {
        this.this$0 = wineCategoryListFragment;
    }

    public void onSelectDelete(int i, @NotNull List<String> list, @NotNull List<WineCategoryInfo> list2) {
        Intrinsics.checkNotNullParameter(list, "idInventoryList");
        Intrinsics.checkNotNullParameter(list2, "wineList");
        if (i == 0) {
            this.this$0.idCategoriesList.clear();
            this.this$0.getParentActivity().setAddWineLayoutShow(true);
            ((CardView) this.this$0._$_findCachedViewById(R$id.delete_cv)).setVisibility(8);
            return;
        }
        this.this$0.idCategoriesList.clear();
        this.this$0.idCategoriesList.addAll(list);
        this.this$0.getParentActivity().setAddWineLayoutShow(false);
        ((CardView) this.this$0._$_findCachedViewById(R$id.delete_cv)).setVisibility(0);
        ((TextView) this.this$0._$_findCachedViewById(R$id.select_counts)).setText(String.valueOf(i));
        TextView textView = (TextView) this.this$0._$_findCachedViewById(R$id.delete);
        Intrinsics.checkNotNullExpressionValue(textView, "delete");
        JuConnectExtKt.singleClickListener(textView, new WineCategoryListFragment$setListeners$2$onSelectDelete$1(this.this$0, list2));
    }
}
