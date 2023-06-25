package com.hisense.connect_life.hismart.sql.account;

import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.hismart.networks.request.device.model.DeviceTemperatureInfo;
import com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo;
import com.juconnect.connect_life.global.GeneralMethodConstant;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016J\u0016\u0010\n\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0016J\u0016\u0010\r\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\tH\u0016J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\tH\u0016J\u0016\u0010\u0012\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0016J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\fH\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\f2\u0006\u0010\u0010\u001a\u00020\tH\u0016J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\fH\u0016J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u00152\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0015H\u0016J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0017H\u0016J\u0016\u0010 \u001a\u00020\u00042\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00190\fH\u0016J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00190\f2\u0006\u0010#\u001a\u00020\tH\u0016J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00190\f2\u0006\u0010\u000e\u001a\u00020\tH\u0016J\u0010\u0010%\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\tH\u0016J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016J\u0010\u0010'\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0015H\u0016J\u0010\u0010(\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0017H\u0016J\u0018\u0010)\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010*\u001a\u00020+H\u0016J\u0010\u0010,\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0019H\u0016J\u0016\u0010-\u001a\u00020\u00042\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00190\fH\u0016¨\u0006."}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/sql/account/LoginUserInfoProvider;", "Lcom/hisense/connect_life/hismart/sql/account/ILoginUserInfoProvider;", "()V", "deleteAll", "", "deleteAllDeviceInfo", "deleteAllWineInventoryNew", "deleteById", "customer_id", "", "deleteSingleWineInventroyNewList", "inventoryId", "", "deleteWineByCategoryId", "categoryId", "deleteWineInventoryByDeviceId", "deviceId", "deleteWineInventoryByInventoryId", "deleteWineInventoryByInventoryIdList", "getAll", "Ljava/util/ArrayList;", "Lcom/hisense/connect_life/hismart/sql/account/LoginUserInfo;", "getAllDeviceInfo", "Lcom/hisense/connect_life/hismart/networks/request/device/model/DeviceTemperatureInfo;", "getAllWineInventoryByDeviceId", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/WineBaseInfo;", "getAllWineInventoryNew", "getUserInfoById", "insert", "loginUserInfo", "insertDeviceInfo", "deviceInfo", "insertWineInventoryNew", "inventoryInfo", "queryByVivinoId", "vivinoId", "queryWineInventoryByCategoryId", "queryWineInventoryByInventoryId", "sortAndGetAll", "update", "updateDeviceInfo", "updateFavoriteByCatetoryId", "favorite", "", "updateWineInventoryNew", "updateWineInventoryNewList", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: LoginUserInfoProvider.kt */
public final class LoginUserInfoProvider implements ILoginUserInfoProvider {
    public void deleteAll() {
        LoginUserInfoRoom.Companion.loginUserInfoDao$hismart_account_release().deleteAll();
    }

    public void deleteAllDeviceInfo() {
        LoginUserInfoRoom.Companion.loginUserInfoDao$hismart_account_release().deleteAllDeviceInfo();
    }

    public void deleteAllWineInventoryNew() {
        LoginUserInfoRoom.Companion.loginUserInfoDao$hismart_account_release().deleteAllWineInventroyNew();
    }

    public void deleteById(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "customer_id");
        LoginUserInfoRoom.Companion.loginUserInfoDao$hismart_account_release().deleteById(str);
    }

    public void deleteSingleWineInventroyNewList(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "inventoryId");
        LoginUserInfoRoom.Companion.loginUserInfoDao$hismart_account_release().deleteSingleWineInventroyNewList(list);
    }

    public void deleteWineByCategoryId(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "categoryId");
        LoginUserInfoRoom.Companion.loginUserInfoDao$hismart_account_release().deleteCategoryId(list);
    }

    public void deleteWineInventoryByDeviceId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "deviceId");
        LoginUserInfoRoom.Companion.loginUserInfoDao$hismart_account_release().deleteWineByDeviceId(str);
    }

    public void deleteWineInventoryByInventoryId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "inventoryId");
        LoginUserInfoRoom.Companion.loginUserInfoDao$hismart_account_release().deleteSingleWineInventroyNew(str);
    }

    public void deleteWineInventoryByInventoryIdList(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "inventoryId");
        LoginUserInfoRoom.Companion.loginUserInfoDao$hismart_account_release().deleteSingleWineInventroyNewList(list);
    }

    @NotNull
    public List<DeviceTemperatureInfo> getAllDeviceInfo() {
        return LoginUserInfoRoom.Companion.loginUserInfoDao$hismart_account_release().getAllDeviceInfo();
    }

    @NotNull
    public List<WineBaseInfo> getAllWineInventoryByDeviceId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "deviceId");
        return LoginUserInfoRoom.Companion.loginUserInfoDao$hismart_account_release().getAllWineInventoryByDeviceid(str);
    }

    @NotNull
    public List<WineBaseInfo> getAllWineInventoryNew() {
        return LoginUserInfoRoom.Companion.loginUserInfoDao$hismart_account_release().getAllWineInventoryNew();
    }

    @Nullable
    public LoginUserInfo getUserInfoById(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "customer_id");
        return LoginUserInfoRoom.Companion.loginUserInfoDao$hismart_account_release().getUserInfoById(str);
    }

    public void insert(@NotNull LoginUserInfo loginUserInfo) {
        Intrinsics.checkNotNullParameter(loginUserInfo, "loginUserInfo");
        LoginUserInfoRoom.Companion.loginUserInfoDao$hismart_account_release().insert(loginUserInfo);
    }

    public void insertDeviceInfo(@NotNull DeviceTemperatureInfo deviceTemperatureInfo) {
        Intrinsics.checkNotNullParameter(deviceTemperatureInfo, GeneralMethodConstant.METHOD_DEVICE_INFO);
        LoginUserInfoRoom.Companion.loginUserInfoDao$hismart_account_release().insertDeviceInfo(deviceTemperatureInfo);
    }

    public void insertWineInventoryNew(@NotNull List<WineBaseInfo> list) {
        Intrinsics.checkNotNullParameter(list, "inventoryInfo");
        LoginUserInfoRoom.Companion.loginUserInfoDao$hismart_account_release().insertWineInventroyNew(list);
    }

    @NotNull
    public List<WineBaseInfo> queryByVivinoId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, KeyConst.KEY_VIVINO_ID);
        return LoginUserInfoRoom.Companion.loginUserInfoDao$hismart_account_release().queryByVivinoId(str);
    }

    @NotNull
    public List<WineBaseInfo> queryWineInventoryByCategoryId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "categoryId");
        return LoginUserInfoRoom.Companion.loginUserInfoDao$hismart_account_release().queryCategoryId(str);
    }

    @NotNull
    public WineBaseInfo queryWineInventoryByInventoryId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "inventoryId");
        return LoginUserInfoRoom.Companion.loginUserInfoDao$hismart_account_release().queryWineInventoryByInventoryId(str);
    }

    public void update(@NotNull LoginUserInfo loginUserInfo) {
        Intrinsics.checkNotNullParameter(loginUserInfo, "loginUserInfo");
        LoginUserInfoRoom.Companion.loginUserInfoDao$hismart_account_release().update(loginUserInfo);
    }

    public void updateDeviceInfo(@NotNull DeviceTemperatureInfo deviceTemperatureInfo) {
        Intrinsics.checkNotNullParameter(deviceTemperatureInfo, GeneralMethodConstant.METHOD_DEVICE_INFO);
        LoginUserInfoRoom.Companion.loginUserInfoDao$hismart_account_release().updateDeviceInfo(deviceTemperatureInfo);
    }

    public void updateFavoriteByCatetoryId(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "categoryId");
        LoginUserInfoRoom.Companion.loginUserInfoDao$hismart_account_release().updateWineFavorite(str, i);
    }

    public void updateWineInventoryNew(@NotNull WineBaseInfo wineBaseInfo) {
        Intrinsics.checkNotNullParameter(wineBaseInfo, "inventoryInfo");
        LoginUserInfoRoom.Companion.loginUserInfoDao$hismart_account_release().upDateWineInventroyNew(wineBaseInfo);
    }

    public void updateWineInventoryNewList(@NotNull List<WineBaseInfo> list) {
        Intrinsics.checkNotNullParameter(list, "inventoryInfo");
        LoginUserInfoRoom.Companion.loginUserInfoDao$hismart_account_release().updateWineInventoryNewList(list);
    }

    @NotNull
    public ArrayList<LoginUserInfo> getAll() {
        return (ArrayList) LoginUserInfoRoom.Companion.loginUserInfoDao$hismart_account_release().getAll();
    }

    @NotNull
    public ArrayList<LoginUserInfo> sortAndGetAll() {
        return (ArrayList) LoginUserInfoRoom.Companion.loginUserInfoDao$hismart_account_release().sortAndGetAll();
    }
}
