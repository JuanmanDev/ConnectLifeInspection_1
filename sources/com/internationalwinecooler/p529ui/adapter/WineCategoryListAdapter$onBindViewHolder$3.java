package com.internationalwinecooler.p529ui.adapter;

import android.view.View;
import com.hisense.connect_life.core.utils.Holder;
import com.hisense.connect_life.hismart.networks.request.wine.model.WineCategoryInfo;
import com.internationalwinecooler.p529ui.adapter.WineCategoryListAdapter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.adapter.WineCategoryListAdapter$onBindViewHolder$3 */
/* compiled from: WineCategoryListAdapter.kt */
public final class WineCategoryListAdapter$onBindViewHolder$3 extends Lambda implements Function1<View, Unit> {
    public final /* synthetic */ Holder $holder;
    public final /* synthetic */ int $position;
    public final /* synthetic */ WineCategoryListAdapter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WineCategoryListAdapter$onBindViewHolder$3(WineCategoryListAdapter wineCategoryListAdapter, int i, Holder holder) {
        super(1);
        this.this$0 = wineCategoryListAdapter;
        this.$position = i;
        this.$holder = holder;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable View view) {
        int favorite = ((WineCategoryInfoWrapper) this.this$0.mFilterList.get(this.$position)).getWineCategoryInfo().getFavorite();
        WineCategoryListAdapter wineCategoryListAdapter = this.this$0;
        WineCategoryInfo wineCategoryInfo = ((WineCategoryInfoWrapper) wineCategoryListAdapter.mFilterList.get(this.$position)).getWineCategoryInfo();
        int i = 1;
        if (favorite == 1) {
            i = 0;
        }
        wineCategoryInfo.setFavorite(i);
        WineCategoryListAdapter.ClickFavoriteCallback access$getClickFavoriteCallback$p = this.this$0.clickFavoriteCallback;
        if (access$getClickFavoriteCallback$p != null) {
            access$getClickFavoriteCallback$p.clickFavorite(((WineCategoryInfoWrapper) this.this$0.mFilterList.get(this.$position)).getWineCategoryInfo(), this.$holder, this.$position);
        }
    }
}
