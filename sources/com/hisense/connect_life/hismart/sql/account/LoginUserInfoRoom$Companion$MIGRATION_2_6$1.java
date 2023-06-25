package com.hisense.connect_life.hismart.sql.account;

import androidx.room.migration.Migration;
import androidx.sqlite.p031db.SupportSQLiteDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, mo47991d2 = {"com/hisense/connect_life/hismart/sql/account/LoginUserInfoRoom$Companion$MIGRATION_2_6$1", "Landroidx/room/migration/Migration;", "migrate", "", "database", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: LoginUserInfoRoom.kt */
public final class LoginUserInfoRoom$Companion$MIGRATION_2_6$1 extends Migration {
    public LoginUserInfoRoom$Companion$MIGRATION_2_6$1() {
        super(2, 6);
    }

    public void migrate(@NotNull SupportSQLiteDatabase supportSQLiteDatabase) {
        Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "database");
        supportSQLiteDatabase.execSQL("CREATE TABLE `device_temperature_info` (`Zone2SetTemperature` TEXT NOT NULL, `temperatureUnit` TEXT NOT NULL, `onlineStatus` INTEGER NOT NULL, `Zone1SetTemperature` TEXT NOT NULL, `Zone2RealHumidity` TEXT NOT NULL, `Zone1RealHumidity` TEXT NOT NULL,`Zone3RealHumidity` TEXT NOT NULL,`deviceId` TEXT NOT NULL,`Zone3SetTemperature` TEXT NOT NULL,PRIMARY KEY(`deviceId`))");
        supportSQLiteDatabase.execSQL("CREATE TABLE `wine_category` (`area` TEXT NOT NULL DEFAULT '', `country` TEXT NOT NULL DEFAULT '', `deviceIdList` TEXT , `wineType` TEXT NOT NULL DEFAULT '', `id_id` INTEGER NOT NULL, `wineCount` INTEGER NOT NULL  DEFAULT 0,`photoUrl` TEXT NOT NULL DEFAULT '',`wineFactoryName` TEXT NOT NULL DEFAULT '',`filtered` INTEGER  DEFAULT 0,`wineName` TEXT NOT NULL DEFAULT '',`inPosition` INTEGER NOT NULL DEFAULT 1,`produceYear` TEXT NOT NULL DEFAULT '',`favorite` INTEGER NOT NULL DEFAULT 0,`inCell` INTEGER NOT NULL DEFAULT 1,`categoryId` INTEGER NOT NULL ,`grapes` TEXT ,PRIMARY KEY(`id_id`))");
        supportSQLiteDatabase.execSQL("CREATE TABLE `wine_inventory_new` (`country` TEXT , `cellNum` INTEGER NOT NULL, `notes` TEXT , `scoreCount` TEXT , `autoAdd` INTEGER NOT NULL, `deviceId` TEXT NOT NULL,`foodMatch` TEXT ,`remindAlarmDate` INTEGER ,`photoUrl` TEXT ,`score` TEXT NOT NULL, `positionNum` INTEGER NOT NULL, `filtered` INTEGER , `id` INTEGER NOT NULL, `zoneName` TEXT , `area` TEXT,`alcohol` TEXT NOT NULL,`wineType` TEXT,`inventoryDate` INTEGER NOT NULL,`vivinoId` TEXT , `wineFactoryName` TEXT , `wineName` TEXT , `inventoryId` INTEGER NOT NULL, `produceYear` TEXT , `favorite` INTEGER NOT NULL,`categoryId` TEXT NOT NULL,`grapes` TEXT NOT NULL,`bestDrinkDate` INTEGER ,PRIMARY KEY(`id`))");
    }
}
