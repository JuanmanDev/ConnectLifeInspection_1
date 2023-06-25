package com.internationalwinecooler.viewmodel;

import com.google.gson.Gson;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.core.utils.SPUtils;
import com.hisense.connect_life.hismart.networks.request.wine.model.WineFilterConditionResult;
import com.internationalwinecooler.p529ui.model.UserFilerWineCondition;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/WineFilterConditionResult;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WineCategoryViewModel.kt */
public final class WineCategoryViewModel$getFilterCondition$1 extends Lambda implements Function1<WineFilterConditionResult, Unit> {
    public final /* synthetic */ List<String> $areaList;
    public final /* synthetic */ List<String> $countryList;
    public final /* synthetic */ List<String> $grapeList;
    public final /* synthetic */ List<String> $wineTypeList;
    public final /* synthetic */ WineCategoryViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WineCategoryViewModel$getFilterCondition$1(List<String> list, List<String> list2, List<String> list3, List<String> list4, WineCategoryViewModel wineCategoryViewModel) {
        super(1);
        this.$wineTypeList = list;
        this.$areaList = list2;
        this.$countryList = list3;
        this.$grapeList = list4;
        this.this$0 = wineCategoryViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((WineFilterConditionResult) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull WineFilterConditionResult wineFilterConditionResult) {
        Intrinsics.checkNotNullParameter(wineFilterConditionResult, LanguageConstKt.f15954it);
        if (wineFilterConditionResult.getResultCode() == 0) {
            List<String> list = this.$wineTypeList;
            List<String> wineTypeList = wineFilterConditionResult.getWineTypeList();
            if (wineTypeList == null) {
                wineTypeList = CollectionsKt__CollectionsKt.emptyList();
            }
            list.addAll(wineTypeList);
            List<String> list2 = this.$areaList;
            List<String> areaList = wineFilterConditionResult.getAreaList();
            if (areaList == null) {
                areaList = CollectionsKt__CollectionsKt.emptyList();
            }
            list2.addAll(areaList);
            List<String> list3 = this.$countryList;
            List<String> countryList = wineFilterConditionResult.getCountryList();
            if (countryList == null) {
                countryList = CollectionsKt__CollectionsKt.emptyList();
            }
            list3.addAll(countryList);
            List<String> list4 = this.$grapeList;
            List<String> grapeList = wineFilterConditionResult.getGrapeList();
            if (grapeList == null) {
                grapeList = CollectionsKt__CollectionsKt.emptyList();
            }
            list4.addAll(grapeList);
            SPUtils sPUtils = SPUtils.INSTANCE;
            String json = new Gson().toJson((Object) wineFilterConditionResult);
            Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(it)");
            sPUtils.put(KeyConst.FILTER_CONDITION, json);
            this.this$0.getGetWineListFilterInfoLiveData().postValue(new UserFilerWineCondition(this.$wineTypeList, this.$areaList, this.$countryList, this.$grapeList));
            return;
        }
        this.this$0.getGetWineListFilterInfoLiveData().postValue(new UserFilerWineCondition(this.$wineTypeList, this.$areaList, this.$countryList, this.$grapeList));
    }
}
