package com.internationalwinecooler.viewmodel;

import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.hismart.networks.request.HiResponse;
import com.hisense.connect_life.hismart.networks.request.wine.model.WineCategoryInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "Lcom/hisense/connect_life/hismart/networks/request/HiResponse;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WineCategoryViewModel.kt */
public final class WineCategoryViewModel$updateWineFavorite$2 extends Lambda implements Function1<HiResponse, Unit> {
    public final /* synthetic */ WineCategoryInfo $wine;
    public final /* synthetic */ WineCategoryViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WineCategoryViewModel$updateWineFavorite$2(WineCategoryViewModel wineCategoryViewModel, WineCategoryInfo wineCategoryInfo) {
        super(1);
        this.this$0 = wineCategoryViewModel;
        this.$wine = wineCategoryInfo;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((HiResponse) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull HiResponse hiResponse) {
        Intrinsics.checkNotNullParameter(hiResponse, LanguageConstKt.f15954it);
        if (hiResponse.getResultCode() != 0) {
            this.this$0.favoriteFail(this.$wine);
        }
    }
}
