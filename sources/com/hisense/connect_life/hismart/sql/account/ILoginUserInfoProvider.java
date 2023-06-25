package com.hisense.connect_life.hismart.sql.account;

import com.hisense.connect_life.hismart.networks.request.device.model.DeviceTemperatureInfo;
import com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0016\u0010\t\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH&J\u0016\u0010\f\u001a\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\bH&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\bH&J\u0016\u0010\u0011\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH&J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000bH&J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000bH&J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u000b2\u0006\u0010\u000f\u001a\u00020\bH&J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u000bH&J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0013H&J\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0015H&J\u0016\u0010\u001e\u001a\u00020\u00032\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00170\u000bH&J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00170\u000b2\u0006\u0010!\u001a\u00020\bH&J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00170\u000b2\u0006\u0010\r\u001a\u00020\bH&J\u0010\u0010#\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\bH&J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00130\u000bH&J\u0010\u0010%\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0013H&J\u0010\u0010&\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0015H&J\u0018\u0010'\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\b2\u0006\u0010(\u001a\u00020)H&J\u0010\u0010*\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0017H&J\u0016\u0010+\u001a\u00020\u00032\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00170\u000bH&¨\u0006,"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/sql/account/ILoginUserInfoProvider;", "", "deleteAll", "", "deleteAllDeviceInfo", "deleteAllWineInventoryNew", "deleteById", "customer_id", "", "deleteSingleWineInventroyNewList", "inventoryId", "", "deleteWineByCategoryId", "categoryId", "deleteWineInventoryByDeviceId", "deviceId", "deleteWineInventoryByInventoryId", "deleteWineInventoryByInventoryIdList", "getAll", "Lcom/hisense/connect_life/hismart/sql/account/LoginUserInfo;", "getAllDeviceInfo", "Lcom/hisense/connect_life/hismart/networks/request/device/model/DeviceTemperatureInfo;", "getAllWineInventoryByDeviceId", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/WineBaseInfo;", "getAllWineInventoryNew", "getUserInfoById", "insert", "loginUserInfo", "insertDeviceInfo", "deviceInfo", "insertWineInventoryNew", "inventoryInfo", "queryByVivinoId", "vivinoId", "queryWineInventoryByCategoryId", "queryWineInventoryByInventoryId", "sortAndGetAll", "update", "updateDeviceInfo", "updateFavoriteByCatetoryId", "favorite", "", "updateWineInventoryNew", "updateWineInventoryNewList", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ILoginUserInfoProvider.kt */
public interface ILoginUserInfoProvider {
    void deleteAll();

    void deleteAllDeviceInfo();

    void deleteAllWineInventoryNew();

    void deleteById(@NotNull String str);

    void deleteSingleWineInventroyNewList(@NotNull List<String> list);

    void deleteWineByCategoryId(@NotNull List<String> list);

    void deleteWineInventoryByDeviceId(@NotNull String str);

    void deleteWineInventoryByInventoryId(@NotNull String str);

    void deleteWineInventoryByInventoryIdList(@NotNull List<String> list);

    @NotNull
    List<LoginUserInfo> getAll();

    @NotNull
    List<DeviceTemperatureInfo> getAllDeviceInfo();

    @NotNull
    List<WineBaseInfo> getAllWineInventoryByDeviceId(@NotNull String str);

    @NotNull
    List<WineBaseInfo> getAllWineInventoryNew();

    @Nullable
    LoginUserInfo getUserInfoById(@NotNull String str);

    void insert(@NotNull LoginUserInfo loginUserInfo);

    void insertDeviceInfo(@NotNull DeviceTemperatureInfo deviceTemperatureInfo);

    void insertWineInventoryNew(@NotNull List<WineBaseInfo> list);

    @NotNull
    List<WineBaseInfo> queryByVivinoId(@NotNull String str);

    @NotNull
    List<WineBaseInfo> queryWineInventoryByCategoryId(@NotNull String str);

    @NotNull
    WineBaseInfo queryWineInventoryByInventoryId(@NotNull String str);

    @NotNull
    List<LoginUserInfo> sortAndGetAll();

    void update(@NotNull LoginUserInfo loginUserInfo);

    void updateDeviceInfo(@NotNull DeviceTemperatureInfo deviceTemperatureInfo);

    void updateFavoriteByCatetoryId(@NotNull String str, int i);

    void updateWineInventoryNew(@NotNull WineBaseInfo wineBaseInfo);

    void updateWineInventoryNewList(@NotNull List<WineBaseInfo> list);
}
