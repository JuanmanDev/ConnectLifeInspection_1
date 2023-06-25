package com.internationalwinecooler.p529ui;

import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.hismart.networks.request.wine.model.AddWineCategory;
import com.hisense.connect_life.hismart.networks.request.wine.model.AddWineCategoryResult;
import com.hisense.connect_life.hismart.networks.request.wine.model.AddWineResult;
import com.internationalwinecooler.p529ui.model.AddWineCategoryModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.greenrobot.eventbus.EventBus;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/AddWineCategoryResult;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.WineWebViewModel$addCategory$1 */
/* compiled from: WineWebViewModel.kt */
public final class WineWebViewModel$addCategory$1 extends Lambda implements Function1<AddWineCategoryResult, Unit> {
    public final /* synthetic */ AddWineCategory $addWineCategory;
    public final /* synthetic */ WineWebViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WineWebViewModel$addCategory$1(AddWineCategory addWineCategory, WineWebViewModel wineWebViewModel) {
        super(1);
        this.$addWineCategory = addWineCategory;
        this.this$0 = wineWebViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AddWineCategoryResult) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull AddWineCategoryResult addWineCategoryResult) {
        Intrinsics.checkNotNullParameter(addWineCategoryResult, LanguageConstKt.f15954it);
        if (addWineCategoryResult.getResultCode() == 0) {
            EventBus.getDefault().post(new AddWineCategoryModel());
            EventBus.getDefault().post(this.$addWineCategory);
            this.this$0.addWineSuccess("add success", new AddWineResult(Long.valueOf((long) addWineCategoryResult.getCategoryId()), addWineCategoryResult.getPhotoUrl()));
            return;
        }
        this.this$0.addWineInfoError(addWineCategoryResult.getErrorDesc(), addWineCategoryResult.getResultCode());
    }
}
