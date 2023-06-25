package com.hisense.connect_life.hismart.sql.account;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import androidx.sqlite.p031db.SupportSQLiteStatement;
import com.hisense.connect_life.hismart.networks.request.device.model.DeviceTemperatureInfo;
import com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo;
import com.hisense.connect_life.hismart.networks.request.wine.model.WineCategoryInfo;
import com.hisense.connect_life.hismart.sql.winecategory.WineCategoryDao;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Database(entities = {LoginUserInfo.class, DeviceTemperatureInfo.class, WineCategoryInfo.class, WineBaseInfo.class}, version = 7)
@Metadata(mo47990d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/sql/account/LoginUserInfoDb;", "Landroidx/room/RoomDatabase;", "()V", "compileStatement", "Landroidx/sqlite/db/SupportSQLiteStatement;", "sql", "", "loginUserInfoDao", "Lcom/hisense/connect_life/hismart/sql/account/LoginUserInfoDao;", "wineCategoryDao", "Lcom/hisense/connect_life/hismart/sql/winecategory/WineCategoryDao;", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@TypeConverters({Converters.class})
/* compiled from: LoginUserInfoDb.kt */
public abstract class LoginUserInfoDb extends RoomDatabase {
    @NotNull
    public SupportSQLiteStatement compileStatement(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "sql");
        SupportSQLiteStatement compileStatement = super.compileStatement(str);
        Intrinsics.checkNotNullExpressionValue(compileStatement, "super.compileStatement(sql)");
        return compileStatement;
    }

    @NotNull
    public abstract LoginUserInfoDao loginUserInfoDao();

    @NotNull
    public abstract WineCategoryDao wineCategoryDao();
}
