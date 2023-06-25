package com.internationalwinecooler.p529ui;

import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.hismart.networks.request.wine.model.AddWineResult;
import com.hisense.connect_life.hismart.networks.request.wine.model.CategoryExistsResult;
import com.hisense.connect_life.hismart.networks.request.wine.model.H5AddWine;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/CategoryExistsResult;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.WineWebViewModel$searchCategoryExist$1 */
/* compiled from: WineWebViewModel.kt */
public final class WineWebViewModel$searchCategoryExist$1 extends Lambda implements Function1<CategoryExistsResult, Unit> {
    public final /* synthetic */ H5AddWine $h5AddWine;
    public final /* synthetic */ WineWebViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WineWebViewModel$searchCategoryExist$1(H5AddWine h5AddWine, WineWebViewModel wineWebViewModel) {
        super(1);
        this.$h5AddWine = h5AddWine;
        this.this$0 = wineWebViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((CategoryExistsResult) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull CategoryExistsResult categoryExistsResult) {
        Long categoryId;
        Intrinsics.checkNotNullParameter(categoryExistsResult, LanguageConstKt.f15954it);
        if (categoryExistsResult.getResultCode() != 0 || categoryExistsResult.getCategoryId() == null || ((categoryId = categoryExistsResult.getCategoryId()) != null && categoryId.longValue() == 0)) {
            this.this$0.addCategory(this.$h5AddWine.getAddWineCategory());
            return;
        }
        this.$h5AddWine.setCategoryId(categoryExistsResult.getCategoryId());
        this.this$0.addWineDirectly(this.$h5AddWine.getAddWine(), new AddWineResult(this.$h5AddWine.getCategoryId(), this.$h5AddWine.getPhoneUrl()));
    }
}
