package com.hisense.connect_life.hismart.sql.account;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.hisense.connect_life.hismart.networks.request.device.model.DeviceTemperatureInfo;
import com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Dao
@Metadata(mo47990d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J\b\u0010\u0004\u001a\u00020\u0003H'J\b\u0010\u0005\u001a\u00020\u0003H'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH'J\u0016\u0010\t\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH'J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\bH'J\u0016\u0010\u000e\u001a\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH'J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\bH'J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000bH'J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000bH'J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000b2\u0006\u0010\u0010\u001a\u00020\bH'J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000bH'J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0007\u001a\u00020\bH'J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0012H'J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0014H'J\u0016\u0010\u001d\u001a\u00020\u00032\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00160\u000bH'J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00160\u000b2\u0006\u0010\u001f\u001a\u00020\bH'J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00160\u000b2\u0006\u0010\n\u001a\u00020\bH'J\u0010\u0010!\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\bH'J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00120\u000bH'J\u0010\u0010#\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0016H'J\u0010\u0010$\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0012H'J\u0010\u0010%\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0014H'J\u0018\u0010&\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\b2\u0006\u0010'\u001a\u00020(H'J\u0016\u0010)\u001a\u00020\u00032\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00160\u000bH'¨\u0006+"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/sql/account/LoginUserInfoDao;", "", "deleteAll", "", "deleteAllDeviceInfo", "deleteAllWineInventroyNew", "deleteById", "customer_id", "", "deleteCategoryId", "categoryId", "", "deleteSingleWineInventroyNew", "inventoryId", "deleteSingleWineInventroyNewList", "deleteWineByDeviceId", "deviceId", "getAll", "Lcom/hisense/connect_life/hismart/sql/account/LoginUserInfo;", "getAllDeviceInfo", "Lcom/hisense/connect_life/hismart/networks/request/device/model/DeviceTemperatureInfo;", "getAllWineInventoryByDeviceid", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/WineBaseInfo;", "getAllWineInventoryNew", "getUserInfoById", "insert", "loginUserInfo", "insertDeviceInfo", "deviceInfo", "insertWineInventroyNew", "queryByVivinoId", "vivinoId", "queryCategoryId", "queryWineInventoryByInventoryId", "sortAndGetAll", "upDateWineInventroyNew", "update", "updateDeviceInfo", "updateWineFavorite", "favorite", "", "updateWineInventoryNewList", "wineBaseInfoList", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: LoginUserInfoDao.kt */
public interface LoginUserInfoDao {
    @Query("DELETE FROM login_user_info")
    void deleteAll();

    @Query("DELETE FROM device_temperature_info")
    void deleteAllDeviceInfo();

    @Query("DELETE FROM wine_inventory_new")
    void deleteAllWineInventroyNew();

    @Query("DELETE  FROM login_user_info where customer_id_s = :customer_id")
    void deleteById(@NotNull String str);

    @Query("DELETE FROM wine_inventory_new WHERE categoryId in (:categoryId)")
    void deleteCategoryId(@NotNull List<String> list);

    @Query("DELETE FROM wine_inventory_new WHERE inventoryId = :inventoryId")
    void deleteSingleWineInventroyNew(@NotNull String str);

    @Query("DELETE FROM wine_inventory_new WHERE inventoryId in (:inventoryId)")
    void deleteSingleWineInventroyNewList(@NotNull List<String> list);

    @Query("DELETE FROM wine_inventory_new WHERE deviceId = :deviceId")
    void deleteWineByDeviceId(@NotNull String str);

    @NotNull
    @Query("SELECT * FROM login_user_info")
    List<LoginUserInfo> getAll();

    @NotNull
    @Query("SELECT * FROM device_temperature_info")
    List<DeviceTemperatureInfo> getAllDeviceInfo();

    @NotNull
    @Query("SELECT * FROM wine_inventory_new WHERE deviceId = :deviceId")
    List<WineBaseInfo> getAllWineInventoryByDeviceid(@NotNull String str);

    @NotNull
    @Query("SELECT * FROM wine_inventory_new")
    List<WineBaseInfo> getAllWineInventoryNew();

    @Nullable
    @Query("SELECT * FROM login_user_info where customer_id_s = :customer_id")
    LoginUserInfo getUserInfoById(@NotNull String str);

    @Insert(onConflict = 1)
    void insert(@NotNull LoginUserInfo loginUserInfo);

    @Insert(onConflict = 1)
    void insertDeviceInfo(@NotNull DeviceTemperatureInfo deviceTemperatureInfo);

    @Insert(onConflict = 1)
    void insertWineInventroyNew(@NotNull List<WineBaseInfo> list);

    @NotNull
    @Query("SELECT *FROM wine_inventory_new WHERE vivinoId = :vivinoId")
    List<WineBaseInfo> queryByVivinoId(@NotNull String str);

    @NotNull
    @Query("SELECT *FROM wine_inventory_new WHERE categoryId = :categoryId")
    List<WineBaseInfo> queryCategoryId(@NotNull String str);

    @NotNull
    @Query("SELECT *FROM wine_inventory_new WHERE inventoryId = :inventoryId")
    WineBaseInfo queryWineInventoryByInventoryId(@NotNull String str);

    @NotNull
    @Query("SELECT * FROM login_user_info ORDER BY update_time DESC")
    List<LoginUserInfo> sortAndGetAll();

    @Update
    void upDateWineInventroyNew(@NotNull WineBaseInfo wineBaseInfo);

    @Update
    void update(@NotNull LoginUserInfo loginUserInfo);

    @Update
    void updateDeviceInfo(@NotNull DeviceTemperatureInfo deviceTemperatureInfo);

    @Query("UPDATE  wine_inventory_new  SET favorite =:favorite  WHERE categoryId = :categoryId")
    void updateWineFavorite(@NotNull String str, int i);

    @Update
    void updateWineInventoryNewList(@NotNull List<WineBaseInfo> list);
}
