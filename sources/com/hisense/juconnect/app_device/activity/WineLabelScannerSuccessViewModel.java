package com.hisense.juconnect.app_device.activity;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.hisense.connect_life.core.base.BaseViewModel;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.utils.LogUtilsShen;
import com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo;
import com.hisense.connect_life.hismart.networks.request.wine.model.WineCategoryInfo;
import com.hisense.connect_life.hismart.sql.account.LoginUserInfoRoom;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0002J\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0002J\b\u0010\u0012\u001a\u00020\u000eH\u0002J\b\u0010\u0013\u001a\u00020\u000eH\u0002R!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048FX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048FX\u0002¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\n\u0010\u0007¨\u0006\u0014"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/activity/WineLabelScannerSuccessViewModel;", "Lcom/hisense/connect_life/core/base/BaseViewModel;", "()V", "categoryIdLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getCategoryIdLiveData", "()Landroidx/lifecycle/MutableLiveData;", "categoryIdLiveData$delegate", "Lkotlin/Lazy;", "isInventoryLiveData", "", "isInventoryLiveData$delegate", "getLocalWineList", "", "vivinoId", "isInventory", "queryLastChange", "testLogAllCategory", "testLogAllWine", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WineLabelScannerSuccessViewModel.kt */
public final class WineLabelScannerSuccessViewModel extends BaseViewModel {
    @NotNull
    public final Lazy categoryIdLiveData$delegate = LazyKt__LazyJVMKt.lazy(WineLabelScannerSuccessViewModel$categoryIdLiveData$2.INSTANCE);
    @NotNull
    public final Lazy isInventoryLiveData$delegate = LazyKt__LazyJVMKt.lazy(WineLabelScannerSuccessViewModel$isInventoryLiveData$2.INSTANCE);

    /* access modifiers changed from: private */
    public final void getLocalWineList(String str) {
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new WineLabelScannerSuccessViewModel$getLocalWineList$1(str, this, (Continuation<? super WineLabelScannerSuccessViewModel$getLocalWineList$1>) null), 2, (Object) null);
    }

    private final void queryLastChange(String str) {
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new WineLabelScannerSuccessViewModel$queryLastChange$1(this, str, (Continuation<? super WineLabelScannerSuccessViewModel$queryLastChange$1>) null), 2, (Object) null);
    }

    private final void testLogAllCategory() {
        List<WineCategoryInfo> loadAllWineInventories = LoginUserInfoRoom.Companion.wineCategoryProvider().loadAllWineInventories();
        if (loadAllWineInventories != null) {
            for (WineCategoryInfo wineCategoryInfo : loadAllWineInventories) {
                LogUtilsShen.Companion companion = LogUtilsShen.Companion;
                companion.mo39140i("testLogAllWine  category is" + wineCategoryInfo.getCategoryId() + " wineName is " + wineCategoryInfo.getWineName());
            }
        }
        if (loadAllWineInventories == null || loadAllWineInventories.isEmpty()) {
            LogUtilsShen.Companion.mo39140i("testLogAllWine  wines is  empty");
        }
    }

    private final void testLogAllWine() {
        List<WineBaseInfo> allWineInventoryNew = LoginUserInfoRoom.Companion.loginUserInfoProvider().getAllWineInventoryNew();
        if (allWineInventoryNew != null) {
            for (WineBaseInfo wineBaseInfo : allWineInventoryNew) {
                LogUtilsShen.Companion companion = LogUtilsShen.Companion;
                companion.mo39140i("testLogAllWine  vivinoId is" + wineBaseInfo.getVivinoId() + " wineName is " + wineBaseInfo.getWineName());
            }
        }
        if (allWineInventoryNew == null || allWineInventoryNew.isEmpty()) {
            LogUtilsShen.Companion.mo39140i("testLogAllWine  wines is  empty");
        }
    }

    @NotNull
    public final MutableLiveData<String> getCategoryIdLiveData() {
        return (MutableLiveData) this.categoryIdLiveData$delegate.getValue();
    }

    public final void isInventory(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, KeyConst.KEY_VIVINO_ID);
        queryLastChange(str);
    }

    @NotNull
    public final MutableLiveData<Boolean> isInventoryLiveData() {
        return (MutableLiveData) this.isInventoryLiveData$delegate.getValue();
    }
}
