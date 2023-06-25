package com.hisense.connect_life.hismart.sql.winecategory;

import com.hisense.connect_life.hismart.networks.request.wine.model.WineCategoryInfo;
import com.hisense.connect_life.hismart.sql.account.LoginUserInfoRoom;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0016\u0010\u0005\u001a\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u0016\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u0016\u0010\u000f\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0016J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0006\u0010\u0013\u001a\u00020\bH\u0016J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\nH\u0016J\u0018\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\nH\u0016J\u0016\u0010\u0017\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0016J\u0010\u0010\u0018\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\fH\u0016¨\u0006\u0019"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/sql/winecategory/WineCategoryProvider;", "Lcom/hisense/connect_life/hismart/sql/winecategory/IWineCategoryProvider;", "()V", "deleteAll", "", "deleteByCategoryId", "categoryId", "", "", "deleteWineInventories", "", "wineInventories", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/WineCategoryInfo;", "deleteWineInventory", "wineInventory", "insertWineInventories", "insertWineInventory", "loadAllWineInventories", "loadAllWineInventory", "idInventory", "queryByCategory", "updateCategoryFavorite", "favorite", "updateWineInventories", "updateWineInventory", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WineCategoryProvider.kt */
public final class WineCategoryProvider implements IWineCategoryProvider {
    public void deleteAll() {
        LoginUserInfoRoom.Companion.wineCategoryDao().deleteAll();
    }

    public void deleteByCategoryId(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "categoryId");
        LoginUserInfoRoom.Companion.wineCategoryDao().deleteByCategoryId(list);
    }

    public int deleteWineInventories(@NotNull List<WineCategoryInfo> list) {
        Intrinsics.checkNotNullParameter(list, "wineInventories");
        return LoginUserInfoRoom.Companion.wineCategoryDao().deleteWineInventories(list);
    }

    public int deleteWineInventory(@NotNull WineCategoryInfo wineCategoryInfo) {
        Intrinsics.checkNotNullParameter(wineCategoryInfo, "wineInventory");
        return LoginUserInfoRoom.Companion.wineCategoryDao().deleteWineInventory(wineCategoryInfo);
    }

    public void insertWineInventories(@NotNull List<WineCategoryInfo> list) {
        Intrinsics.checkNotNullParameter(list, "wineInventories");
        LoginUserInfoRoom.Companion.wineCategoryDao().insertWineInventories(list);
    }

    public void insertWineInventory(@NotNull WineCategoryInfo wineCategoryInfo) {
        Intrinsics.checkNotNullParameter(wineCategoryInfo, "wineInventory");
        LoginUserInfoRoom.Companion.wineCategoryDao().insertWineInventory(wineCategoryInfo);
    }

    @NotNull
    public List<WineCategoryInfo> loadAllWineInventories() {
        return LoginUserInfoRoom.Companion.wineCategoryDao().loadAllWineInventories();
    }

    @NotNull
    public List<WineCategoryInfo> loadAllWineInventory(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "idInventory");
        return LoginUserInfoRoom.Companion.wineCategoryDao().loadAllWineInventory(str);
    }

    @NotNull
    public WineCategoryInfo queryByCategory(int i) {
        return LoginUserInfoRoom.Companion.wineCategoryDao().queryByCategoryId(i);
    }

    public void updateCategoryFavorite(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "categoryId");
        LoginUserInfoRoom.Companion.wineCategoryDao().updateCategoryFavorite(str, i);
    }

    public int updateWineInventories(@NotNull List<WineCategoryInfo> list) {
        Intrinsics.checkNotNullParameter(list, "wineInventories");
        return LoginUserInfoRoom.Companion.wineCategoryDao().updateWineInventories(list);
    }

    public int updateWineInventory(@NotNull WineCategoryInfo wineCategoryInfo) {
        Intrinsics.checkNotNullParameter(wineCategoryInfo, "wineInventory");
        return LoginUserInfoRoom.Companion.wineCategoryDao().updateWineInventory(wineCategoryInfo);
    }
}
