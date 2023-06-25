package com.hisense.connect_life.hismart.networks.request.wine.model;

import com.hisense.connect_life.hismart.networks.request.device.DeviceCache;
import com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0005\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\u0002¨\u0006\b"}, mo47991d2 = {"isSame", "", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/WineCategoryInfo;", "wineCategoryInfo", "noCondition", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/FilterCondition;", "toSaveInfo", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/WineBaseInfo;", "hismart_account_release"}, mo47992k = 2, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ModelExt.kt */
public final class ModelExtKt {
    public static final boolean isSame(@NotNull WineCategoryInfo wineCategoryInfo, @NotNull WineCategoryInfo wineCategoryInfo2) {
        Intrinsics.checkNotNullParameter(wineCategoryInfo, "<this>");
        Intrinsics.checkNotNullParameter(wineCategoryInfo2, "wineCategoryInfo");
        if (wineCategoryInfo.getCategoryId() == 0) {
            return false;
        }
        int categoryId = wineCategoryInfo.getCategoryId();
        int categoryId2 = wineCategoryInfo2.getCategoryId();
        return false;
    }

    public static final boolean noCondition(@NotNull FilterCondition filterCondition) {
        Integer removed;
        Long expired;
        Integer inPosition;
        Integer produceYearTo;
        Integer produceYearFrom;
        Integer favorite;
        Intrinsics.checkNotNullParameter(filterCondition, "<this>");
        List<String> area = filterCondition.getArea();
        if (area == null || area.isEmpty()) {
            List<String> country = filterCondition.getCountry();
            if (country == null || country.isEmpty()) {
                List<String> grapes = filterCondition.getGrapes();
                if (grapes == null || grapes.isEmpty()) {
                    String deviceId = filterCondition.getDeviceId();
                    if (deviceId == null || deviceId.length() == 0) {
                        List<String> wineTypeList = filterCondition.getWineTypeList();
                        return (wineTypeList == null || wineTypeList.isEmpty()) && (filterCondition.getFavorite() == null || ((favorite = filterCondition.getFavorite()) != null && favorite.intValue() == 0)) && ((filterCondition.getProduceYearFrom() == null || ((produceYearFrom = filterCondition.getProduceYearFrom()) != null && produceYearFrom.intValue() == 0)) && ((filterCondition.getProduceYearTo() == null || ((produceYearTo = filterCondition.getProduceYearTo()) != null && produceYearTo.intValue() == 0)) && ((filterCondition.getInPosition() == null || ((inPosition = filterCondition.getInPosition()) != null && inPosition.intValue() == 0)) && ((filterCondition.getExpired() == null || ((expired = filterCondition.getExpired()) != null && expired.longValue() == 0)) && (filterCondition.getRemoved() == null || ((removed = filterCondition.getRemoved()) != null && removed.intValue() == 0))))));
                    }
                }
            }
        }
    }

    @NotNull
    public static final WineBaseInfo toSaveInfo(@NotNull WineCategoryInfo wineCategoryInfo) {
        String str;
        Intrinsics.checkNotNullParameter(wineCategoryInfo, "<this>");
        List<String> deviceIdList = wineCategoryInfo.getDeviceIdList();
        if (deviceIdList == null || deviceIdList.isEmpty()) {
            str = ((DeviceInfo) CollectionsKt___CollectionsKt.first(DeviceCache.Companion.getInstance().getDeviceList())).getDeviceId();
        } else {
            List<String> deviceIdList2 = wineCategoryInfo.getDeviceIdList();
            str = deviceIdList2 == null ? null : deviceIdList2.get(0);
        }
        long id = wineCategoryInfo.getId();
        String valueOf = String.valueOf(wineCategoryInfo.getCategoryId());
        String photoUrl = wineCategoryInfo.getPhotoUrl();
        String wineFactoryName = wineCategoryInfo.getWineFactoryName();
        String area = wineCategoryInfo.getArea();
        String wineType = wineCategoryInfo.getWineType();
        String country = wineCategoryInfo.getCountry();
        String wineName = wineCategoryInfo.getWineName();
        String produceYear = wineCategoryInfo.getProduceYear();
        int favorite = wineCategoryInfo.getFavorite();
        if (str == null) {
            str = "";
        }
        String str2 = str;
        List<String> grapes = wineCategoryInfo.getGrapes();
        if (grapes == null) {
            grapes = CollectionsKt__CollectionsKt.emptyList();
        }
        return new WineBaseInfo(id, 0, -1, photoUrl, wineFactoryName, wineName, wineType, favorite, produceYear, 0L, str2, "", -1, valueOf, (Integer) null, 0, area, country, grapes, 0, "", "", "", (List<String>) null, "", (Long) null, "");
    }
}
