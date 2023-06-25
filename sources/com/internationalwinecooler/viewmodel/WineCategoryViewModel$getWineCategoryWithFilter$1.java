package com.internationalwinecooler.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.utils.SPUtils;
import com.hisense.connect_life.hismart.networks.request.wine.model.FilterCondition;
import com.hisense.connect_life.hismart.networks.request.wine.model.QueryCategoryResult;
import com.hisense.connect_life.hismart.networks.request.wine.model.WineCategoryInfo;
import com.hisense.connect_life.hismart.sql.account.LoginUserInfoRoom;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "category", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/QueryCategoryResult;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WineCategoryViewModel.kt */
public final class WineCategoryViewModel$getWineCategoryWithFilter$1 extends Lambda implements Function1<QueryCategoryResult, Unit> {
    public final /* synthetic */ Ref.ObjectRef<FilterCondition> $filterCondition;
    public final /* synthetic */ WineCategoryViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WineCategoryViewModel$getWineCategoryWithFilter$1(Ref.ObjectRef<FilterCondition> objectRef, WineCategoryViewModel wineCategoryViewModel) {
        super(1);
        this.$filterCondition = objectRef;
        this.this$0 = wineCategoryViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((QueryCategoryResult) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull QueryCategoryResult queryCategoryResult) {
        Intrinsics.checkNotNullParameter(queryCategoryResult, "category");
        ArrayList arrayList = new ArrayList();
        List<WineCategoryInfo> categoryList = queryCategoryResult.getCategoryList();
        if (categoryList != null) {
            for (WineCategoryInfo categoryId : categoryList) {
                arrayList.add(String.valueOf(categoryId.getCategoryId()));
            }
        }
        List<WineCategoryInfo> categoryList2 = queryCategoryResult.getCategoryList();
        if (categoryList2 != null) {
            LoginUserInfoRoom.Companion.wineCategoryProvider().deleteByCategoryId(arrayList);
            LoginUserInfoRoom.Companion.wineCategoryProvider().insertWineInventories(categoryList2);
        }
        Integer inPosition = ((FilterCondition) this.$filterCondition.element).getInPosition();
        if (inPosition != null && inPosition.intValue() == 1) {
            Object obj = SPUtils.INSTANCE.get(KeyConst.KEY_WINE_INVENTORY_TYPE, 0);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            } else if (((Integer) obj).intValue() == 0) {
                MutableLiveData<Pair<Boolean, List<WineCategoryInfo>>> getWineListLiveData = this.this$0.getGetWineListLiveData();
                Boolean bool = Boolean.TRUE;
                List<WineCategoryInfo> categoryList3 = queryCategoryResult.getCategoryList();
                ArrayList arrayList2 = new ArrayList();
                for (T next : categoryList3) {
                    WineCategoryInfo wineCategoryInfo = (WineCategoryInfo) next;
                    if (wineCategoryInfo.getInCell() == 0 && wineCategoryInfo.getWineCount() > 0) {
                        arrayList2.add(next);
                    }
                }
                getWineListLiveData.postValue(new Pair(bool, arrayList2));
            } else {
                MutableLiveData<Pair<Boolean, List<WineCategoryInfo>>> getWineListLiveData2 = this.this$0.getGetWineListLiveData();
                Boolean bool2 = Boolean.TRUE;
                List<WineCategoryInfo> categoryList4 = queryCategoryResult.getCategoryList();
                ArrayList arrayList3 = new ArrayList();
                for (T next2 : categoryList4) {
                    WineCategoryInfo wineCategoryInfo2 = (WineCategoryInfo) next2;
                    if (wineCategoryInfo2.getInPosition() == 0 && wineCategoryInfo2.getWineCount() > 0) {
                        arrayList3.add(next2);
                    }
                }
                getWineListLiveData2.postValue(new Pair(bool2, arrayList3));
            }
        } else {
            this.this$0.getGetWineListLiveData().postValue(new Pair(Boolean.TRUE, queryCategoryResult.getCategoryList()));
        }
    }
}
