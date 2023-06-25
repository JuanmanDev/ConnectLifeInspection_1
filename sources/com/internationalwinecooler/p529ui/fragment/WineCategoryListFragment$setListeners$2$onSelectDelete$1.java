package com.internationalwinecooler.p529ui.fragment;

import android.view.View;
import com.hisense.connect_life.hismart.networks.request.wine.model.WineCategoryInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.fragment.WineCategoryListFragment$setListeners$2$onSelectDelete$1 */
/* compiled from: WineCategoryListFragment.kt */
public final class WineCategoryListFragment$setListeners$2$onSelectDelete$1 extends Lambda implements Function1<View, Unit> {
    public final /* synthetic */ List<WineCategoryInfo> $wineList;
    public final /* synthetic */ WineCategoryListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WineCategoryListFragment$setListeners$2$onSelectDelete$1(WineCategoryListFragment wineCategoryListFragment, List<WineCategoryInfo> list) {
        super(1);
        this.this$0 = wineCategoryListFragment;
        this.$wineList = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable View view) {
        this.this$0.selectedDeleteWineList.clear();
        this.this$0.selectedDeleteWineList.addAll(this.$wineList);
        this.this$0.getParentActivity().removeWineCategory(this.this$0.idCategoriesList, true);
    }
}
