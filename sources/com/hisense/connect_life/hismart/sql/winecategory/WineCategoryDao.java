package com.hisense.connect_life.hismart.sql.winecategory;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.hisense.connect_life.hismart.networks.request.wine.model.WineCategoryInfo;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Dao
@Metadata(mo47990d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J\u0016\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H'J\u0016\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006H'J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000bH'J\u0016\u0010\u000e\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006H'J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000bH'J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006H'J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\u0012\u001a\u00020\u0007H'J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\tH'J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\tH'J\u0016\u0010\u0016\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006H'J\u0010\u0010\u0017\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000bH'¨\u0006\u0018"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/sql/winecategory/WineCategoryDao;", "", "deleteAll", "", "deleteByCategoryId", "categoryId", "", "", "deleteWineInventories", "", "wineInventories", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/WineCategoryInfo;", "deleteWineInventory", "wineInventory", "insertWineInventories", "insertWineInventory", "loadAllWineInventories", "loadAllWineInventory", "idInventory", "queryByCategoryId", "updateCategoryFavorite", "favorite", "updateWineInventories", "updateWineInventory", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WineCategoryDao.kt */
public interface WineCategoryDao {
    @Query("DELETE FROM wine_category")
    void deleteAll();

    @Query("DELETE FROM wine_category WHERE categoryId in (:categoryId)")
    void deleteByCategoryId(@NotNull List<String> list);

    @Delete
    int deleteWineInventories(@NotNull List<WineCategoryInfo> list);

    @Delete
    int deleteWineInventory(@NotNull WineCategoryInfo wineCategoryInfo);

    @Insert(onConflict = 1)
    void insertWineInventories(@NotNull List<WineCategoryInfo> list);

    @Insert(onConflict = 1)
    void insertWineInventory(@NotNull WineCategoryInfo wineCategoryInfo);

    @NotNull
    @Query("SELECT * FROM wine_category")
    List<WineCategoryInfo> loadAllWineInventories();

    @NotNull
    @Query("SELECT * FROM wine_category WHERE categoryId = :idInventory")
    List<WineCategoryInfo> loadAllWineInventory(@NotNull String str);

    @NotNull
    @Query("SELECT * FROM wine_category WHERE categoryId  = :categoryId")
    WineCategoryInfo queryByCategoryId(int i);

    @Query("UPDATE wine_category SET favorite = :favorite WHERE categoryId = :categoryId")
    void updateCategoryFavorite(@NotNull String str, int i);

    @Update
    int updateWineInventories(@NotNull List<WineCategoryInfo> list);

    @Update
    int updateWineInventory(@NotNull WineCategoryInfo wineCategoryInfo);
}
