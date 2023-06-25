package com.internationalwinecooler.p529ui;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.hisense.connect_life.core.base.BaseViewModel;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.utils.SPUtils;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.hismart.networks.request.device.DeviceCache;
import com.hisense.connect_life.hismart.networks.request.wine.model.FilterCondition;
import com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo;
import com.juconnect.connectlife.model.WineInventoryBean;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0002J:\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018R5\u0010\u0003\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00050\u00048FX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u001a"}, mo47991d2 = {"Lcom/internationalwinecooler/ui/WineCabinetListModel;", "Lcom/hisense/connect_life/core/base/BaseViewModel;", "()V", "remoteLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Pair;", "", "", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/WineBaseInfo;", "getRemoteLiveData", "()Landroidx/lifecycle/MutableLiveData;", "remoteLiveData$delegate", "Lkotlin/Lazy;", "getRemoteQueryByDevList", "deviceIdList", "filterCondition", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/FilterCondition;", "lastUpdateTime", "", "h5used", "", "updateWineCabinetRoom", "", "favoriteModel", "Lcom/internationalwinecooler/ui/FavoriteModel;", "Companion", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.WineCabinetListModel */
/* compiled from: WineCabinetListModel.kt */
public final class WineCabinetListModel extends BaseViewModel {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @NotNull
    public final Lazy remoteLiveData$delegate = LazyKt__LazyJVMKt.lazy(WineCabinetListModel$remoteLiveData$2.INSTANCE);

    @Metadata(mo47990d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, mo47991d2 = {"Lcom/internationalwinecooler/ui/WineCabinetListModel$Companion;", "", "()V", "toWineInventoryBean", "Lcom/juconnect/connectlife/model/WineInventoryBean;", "entity", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/WineBaseInfo;", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* renamed from: com.internationalwinecooler.ui.WineCabinetListModel$Companion */
    /* compiled from: WineCabinetListModel.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final WineInventoryBean toWineInventoryBean(@NotNull WineBaseInfo wineBaseInfo) {
            String str;
            Intrinsics.checkNotNullParameter(wineBaseInfo, "entity");
            String valueOf = String.valueOf(wineBaseInfo.getInventoryId());
            String deviceId = wineBaseInfo.getDeviceId();
            Long bestDrinkDate = wineBaseInfo.getBestDrinkDate();
            long inventoryDate = wineBaseInfo.getInventoryDate();
            List<String> grapes = wineBaseInfo.getGrapes();
            boolean z = true;
            if (wineBaseInfo.getFavorite() != 1) {
                z = false;
            }
            Boolean valueOf2 = Boolean.valueOf(z);
            String wineName = wineBaseInfo.getWineName();
            String area = wineBaseInfo.getArea();
            String country = wineBaseInfo.getCountry();
            Object obj = SPUtils.INSTANCE.get(KeyConst.KEY_WINE_INVENTORY_TYPE, 0);
            if (obj != null) {
                if (((Integer) obj).intValue() != 0 && wineBaseInfo.getPositionNum() == -1 && DeviceCache.Companion.getInstance().isDeviceType(wineBaseInfo.getDeviceId()) == DeviceCache.Companion.getInstance().getThreeZoneDevice()) {
                    str = "N";
                } else {
                    str = Intrinsics.stringPlus(wineBaseInfo.getZoneName(), Integer.valueOf(wineBaseInfo.getCellNum()));
                }
                String str2 = str;
                String valueOf3 = String.valueOf(wineBaseInfo.getPositionNum());
                String produceYear = wineBaseInfo.getProduceYear();
                return new WineInventoryBean(valueOf, deviceId, "", bestDrinkDate, "", inventoryDate, "", grapes, valueOf2, wineName, "", area, country, str2, valueOf3, produceYear == null ? null : Long.valueOf(Long.parseLong(produceYear)), wineBaseInfo.getVivinoId(), wineBaseInfo.getWineType(), wineBaseInfo.getWineFactoryName(), wineBaseInfo.getPhotoUrl(), "", false, false, (Long) null, wineBaseInfo.getCategoryId(), 14680064, (DefaultConstructorMarker) null);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    @NotNull
    public final MutableLiveData<Pair<String, List<WineBaseInfo>>> getRemoteLiveData() {
        return (MutableLiveData) this.remoteLiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<List<WineBaseInfo>> getRemoteQueryByDevList(@NotNull List<String> list, @Nullable FilterCondition filterCondition, long j, boolean z) {
        Intrinsics.checkNotNullParameter(list, "deviceIdList");
        MutableLiveData<List<WineBaseInfo>> mutableLiveData = new MutableLiveData<>();
        HiSmart.Companion.getInstance().wineWineInventoryManagerSerivce().queryByDevList(list, filterCondition, 0, new WineCabinetListModel$getRemoteQueryByDevList$1(this, mutableLiveData, filterCondition, list, z), new WineCabinetListModel$getRemoteQueryByDevList$2(mutableLiveData));
        return mutableLiveData;
    }

    public final void updateWineCabinetRoom(@Nullable FavoriteModel favoriteModel) {
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new WineCabinetListModel$updateWineCabinetRoom$1(favoriteModel, (Continuation<? super WineCabinetListModel$updateWineCabinetRoom$1>) null), 2, (Object) null);
    }
}
