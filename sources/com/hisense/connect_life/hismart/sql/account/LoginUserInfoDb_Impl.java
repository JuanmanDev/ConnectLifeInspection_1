package com.hisense.connect_life.hismart.sql.account;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.p031db.SupportSQLiteDatabase;
import androidx.sqlite.p031db.SupportSQLiteOpenHelper;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.hisense.connect_life.core.global.EventBusConstKt;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.hismart.sql.winecategory.WineCategoryDao;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p040c.p429r.p430a.p439c.p456c.p457a.C7460a;
import p040c.p429r.p430a.p439c.p456c.p458b.C7474a;

public final class LoginUserInfoDb_Impl extends LoginUserInfoDb {

    /* renamed from: a */
    public volatile LoginUserInfoDao f15979a;

    /* renamed from: b */
    public volatile WineCategoryDao f15980b;

    /* renamed from: com.hisense.connect_life.hismart.sql.account.LoginUserInfoDb_Impl$a */
    public class C8569a extends RoomOpenHelper.Delegate {
        public C8569a(int i) {
            super(i);
        }

        public void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `login_user_info` (`login_name` TEXT NOT NULL, `psw` TEXT NOT NULL, `subscriber_id` INTEGER NOT NULL, `customer_id` INTEGER NOT NULL, `customer_id_s` TEXT NOT NULL, `token` TEXT NOT NULL, `token_create_time` INTEGER NOT NULL, `token_expire_time` INTEGER NOT NULL, `refresh_token` TEXT NOT NULL, `refresh_token_expired_time` INTEGER NOT NULL, `email` TEXT NOT NULL, `update_time` INTEGER NOT NULL, `first_name` TEXT NOT NULL, `last_name` TEXT NOT NULL, `photo_url` TEXT, `login_source` TEXT NOT NULL, `third_platform_id` TEXT NOT NULL, PRIMARY KEY(`customer_id_s`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `device_temperature_info` (`deviceId` TEXT NOT NULL, `onlineStatus` INTEGER NOT NULL, `Zone1SetTemperature` TEXT NOT NULL, `Zone2SetTemperature` TEXT NOT NULL, `Zone3SetTemperature` TEXT NOT NULL, `Zone1RealHumidity` TEXT NOT NULL, `Zone2RealHumidity` TEXT NOT NULL, `Zone3RealHumidity` TEXT NOT NULL, `temperatureUnit` TEXT NOT NULL, PRIMARY KEY(`deviceId`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `wine_category` (`id_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `vivino_id` TEXT, `categoryId` INTEGER NOT NULL, `photoUrl` TEXT NOT NULL DEFAULT '', `wineFactoryName` TEXT NOT NULL DEFAULT '', `wineName` TEXT NOT NULL DEFAULT '', `produceYear` TEXT NOT NULL DEFAULT '', `favorite` INTEGER NOT NULL DEFAULT 0, `inPosition` INTEGER NOT NULL DEFAULT 1, `inCell` INTEGER NOT NULL DEFAULT 1, `wineCount` INTEGER NOT NULL DEFAULT 0, `deviceIdList` TEXT, `wineType` TEXT NOT NULL DEFAULT '', `area` TEXT NOT NULL DEFAULT '', `country` TEXT NOT NULL DEFAULT '', `grapes` TEXT, `filtered` INTEGER DEFAULT 0)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `wine_inventory_new` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `inventoryId` INTEGER NOT NULL, `positionNum` INTEGER NOT NULL, `photoUrl` TEXT, `wineFactoryName` TEXT, `wineName` TEXT, `wineType` TEXT, `favorite` INTEGER NOT NULL, `produceYear` TEXT, `remindAlarmDate` INTEGER, `deviceId` TEXT NOT NULL, `zoneName` TEXT, `cellNum` INTEGER NOT NULL, `categoryId` TEXT NOT NULL, `filtered` INTEGER, `inventoryDate` INTEGER NOT NULL, `area` TEXT, `country` TEXT, `grapes` TEXT NOT NULL, `autoAdd` INTEGER NOT NULL, `vivinoId` TEXT, `score` TEXT NOT NULL, `scoreCount` TEXT, `foodMatch` TEXT, `alcohol` TEXT NOT NULL, `bestDrinkDate` INTEGER, `notes` TEXT)");
            supportSQLiteDatabase.execSQL(RoomMasterTable.CREATE_QUERY);
            supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'a667542ebbd434d885be66cc91a9674a')");
        }

        public void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `login_user_info`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `device_temperature_info`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `wine_category`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `wine_inventory_new`");
            if (LoginUserInfoDb_Impl.this.mCallbacks != null) {
                int size = LoginUserInfoDb_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) LoginUserInfoDb_Impl.this.mCallbacks.get(i)).onDestructiveMigration(supportSQLiteDatabase);
                }
            }
        }

        public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
            if (LoginUserInfoDb_Impl.this.mCallbacks != null) {
                int size = LoginUserInfoDb_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) LoginUserInfoDb_Impl.this.mCallbacks.get(i)).onCreate(supportSQLiteDatabase);
                }
            }
        }

        public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
            SupportSQLiteDatabase unused = LoginUserInfoDb_Impl.this.mDatabase = supportSQLiteDatabase;
            LoginUserInfoDb_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
            if (LoginUserInfoDb_Impl.this.mCallbacks != null) {
                int size = LoginUserInfoDb_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) LoginUserInfoDb_Impl.this.mCallbacks.get(i)).onOpen(supportSQLiteDatabase);
                }
            }
        }

        public void onPostMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        public void onPreMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            DBUtil.dropFtsSyncTriggers(supportSQLiteDatabase);
        }

        public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase supportSQLiteDatabase) {
            SupportSQLiteDatabase supportSQLiteDatabase2 = supportSQLiteDatabase;
            HashMap hashMap = new HashMap(17);
            hashMap.put("login_name", new TableInfo.Column("login_name", "TEXT", true, 0, (String) null, 1));
            hashMap.put(EventBusConstKt.PSW, new TableInfo.Column(EventBusConstKt.PSW, "TEXT", true, 0, (String) null, 1));
            hashMap.put("subscriber_id", new TableInfo.Column("subscriber_id", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("customer_id", new TableInfo.Column("customer_id", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("customer_id_s", new TableInfo.Column("customer_id_s", "TEXT", true, 1, (String) null, 1));
            hashMap.put(FirebaseMessagingService.EXTRA_TOKEN, new TableInfo.Column(FirebaseMessagingService.EXTRA_TOKEN, "TEXT", true, 0, (String) null, 1));
            hashMap.put("token_create_time", new TableInfo.Column("token_create_time", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("token_expire_time", new TableInfo.Column("token_expire_time", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("refresh_token", new TableInfo.Column("refresh_token", "TEXT", true, 0, (String) null, 1));
            hashMap.put("refresh_token_expired_time", new TableInfo.Column("refresh_token_expired_time", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("email", new TableInfo.Column("email", "TEXT", true, 0, (String) null, 1));
            hashMap.put("update_time", new TableInfo.Column("update_time", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("first_name", new TableInfo.Column("first_name", "TEXT", true, 0, (String) null, 1));
            hashMap.put("last_name", new TableInfo.Column("last_name", "TEXT", true, 0, (String) null, 1));
            hashMap.put("photo_url", new TableInfo.Column("photo_url", "TEXT", false, 0, (String) null, 1));
            hashMap.put("login_source", new TableInfo.Column("login_source", "TEXT", true, 0, (String) null, 1));
            hashMap.put("third_platform_id", new TableInfo.Column("third_platform_id", "TEXT", true, 0, (String) null, 1));
            TableInfo tableInfo = new TableInfo("login_user_info", hashMap, new HashSet(0), new HashSet(0));
            TableInfo read = TableInfo.read(supportSQLiteDatabase2, "login_user_info");
            if (!tableInfo.equals(read)) {
                return new RoomOpenHelper.ValidationResult(false, "login_user_info(com.hisense.connect_life.hismart.sql.account.LoginUserInfo).\n Expected:\n" + tableInfo + "\n Found:\n" + read);
            }
            HashMap hashMap2 = new HashMap(9);
            hashMap2.put("deviceId", new TableInfo.Column("deviceId", "TEXT", true, 1, (String) null, 1));
            hashMap2.put("onlineStatus", new TableInfo.Column("onlineStatus", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("Zone1SetTemperature", new TableInfo.Column("Zone1SetTemperature", "TEXT", true, 0, (String) null, 1));
            hashMap2.put("Zone2SetTemperature", new TableInfo.Column("Zone2SetTemperature", "TEXT", true, 0, (String) null, 1));
            hashMap2.put("Zone3SetTemperature", new TableInfo.Column("Zone3SetTemperature", "TEXT", true, 0, (String) null, 1));
            hashMap2.put("Zone1RealHumidity", new TableInfo.Column("Zone1RealHumidity", "TEXT", true, 0, (String) null, 1));
            hashMap2.put("Zone2RealHumidity", new TableInfo.Column("Zone2RealHumidity", "TEXT", true, 0, (String) null, 1));
            hashMap2.put("Zone3RealHumidity", new TableInfo.Column("Zone3RealHumidity", "TEXT", true, 0, (String) null, 1));
            hashMap2.put("temperatureUnit", new TableInfo.Column("temperatureUnit", "TEXT", true, 0, (String) null, 1));
            TableInfo tableInfo2 = new TableInfo("device_temperature_info", hashMap2, new HashSet(0), new HashSet(0));
            TableInfo read2 = TableInfo.read(supportSQLiteDatabase2, "device_temperature_info");
            if (!tableInfo2.equals(read2)) {
                return new RoomOpenHelper.ValidationResult(false, "device_temperature_info(com.hisense.connect_life.hismart.networks.request.device.model.DeviceTemperatureInfo).\n Expected:\n" + tableInfo2 + "\n Found:\n" + read2);
            }
            HashMap hashMap3 = new HashMap(17);
            hashMap3.put("id_id", new TableInfo.Column("id_id", "INTEGER", true, 1, (String) null, 1));
            hashMap3.put("vivino_id", new TableInfo.Column("vivino_id", "TEXT", false, 0, (String) null, 1));
            hashMap3.put("categoryId", new TableInfo.Column("categoryId", "INTEGER", true, 0, (String) null, 1));
            hashMap3.put("photoUrl", new TableInfo.Column("photoUrl", "TEXT", true, 0, "''", 1));
            hashMap3.put("wineFactoryName", new TableInfo.Column("wineFactoryName", "TEXT", true, 0, "''", 1));
            hashMap3.put("wineName", new TableInfo.Column("wineName", "TEXT", true, 0, "''", 1));
            hashMap3.put("produceYear", new TableInfo.Column("produceYear", "TEXT", true, 0, "''", 1));
            hashMap3.put("favorite", new TableInfo.Column("favorite", "INTEGER", true, 0, "0", 1));
            hashMap3.put("inPosition", new TableInfo.Column("inPosition", "INTEGER", true, 0, "1", 1));
            hashMap3.put("inCell", new TableInfo.Column("inCell", "INTEGER", true, 0, "1", 1));
            hashMap3.put("wineCount", new TableInfo.Column("wineCount", "INTEGER", true, 0, "0", 1));
            hashMap3.put("deviceIdList", new TableInfo.Column("deviceIdList", "TEXT", false, 0, (String) null, 1));
            hashMap3.put("wineType", new TableInfo.Column("wineType", "TEXT", true, 0, "''", 1));
            hashMap3.put("area", new TableInfo.Column("area", "TEXT", true, 0, "''", 1));
            hashMap3.put("country", new TableInfo.Column("country", "TEXT", true, 0, "''", 1));
            hashMap3.put("grapes", new TableInfo.Column("grapes", "TEXT", false, 0, (String) null, 1));
            hashMap3.put("filtered", new TableInfo.Column("filtered", "INTEGER", false, 0, "0", 1));
            Object obj = "grapes";
            Object obj2 = "country";
            Object obj3 = "area";
            TableInfo tableInfo3 = new TableInfo("wine_category", hashMap3, new HashSet(0), new HashSet(0));
            TableInfo read3 = TableInfo.read(supportSQLiteDatabase2, "wine_category");
            if (!tableInfo3.equals(read3)) {
                return new RoomOpenHelper.ValidationResult(false, "wine_category(com.hisense.connect_life.hismart.networks.request.wine.model.WineCategoryInfo).\n Expected:\n" + tableInfo3 + "\n Found:\n" + read3);
            }
            HashMap hashMap4 = new HashMap(27);
            hashMap4.put("id", new TableInfo.Column("id", "INTEGER", true, 1, (String) null, 1));
            hashMap4.put("inventoryId", new TableInfo.Column("inventoryId", "INTEGER", true, 0, (String) null, 1));
            hashMap4.put("positionNum", new TableInfo.Column("positionNum", "INTEGER", true, 0, (String) null, 1));
            hashMap4.put("photoUrl", new TableInfo.Column("photoUrl", "TEXT", false, 0, (String) null, 1));
            hashMap4.put("wineFactoryName", new TableInfo.Column("wineFactoryName", "TEXT", false, 0, (String) null, 1));
            hashMap4.put("wineName", new TableInfo.Column("wineName", "TEXT", false, 0, (String) null, 1));
            hashMap4.put("wineType", new TableInfo.Column("wineType", "TEXT", false, 0, (String) null, 1));
            hashMap4.put("favorite", new TableInfo.Column("favorite", "INTEGER", true, 0, (String) null, 1));
            hashMap4.put("produceYear", new TableInfo.Column("produceYear", "TEXT", false, 0, (String) null, 1));
            hashMap4.put("remindAlarmDate", new TableInfo.Column("remindAlarmDate", "INTEGER", false, 0, (String) null, 1));
            hashMap4.put("deviceId", new TableInfo.Column("deviceId", "TEXT", true, 0, (String) null, 1));
            hashMap4.put("zoneName", new TableInfo.Column("zoneName", "TEXT", false, 0, (String) null, 1));
            hashMap4.put("cellNum", new TableInfo.Column("cellNum", "INTEGER", true, 0, (String) null, 1));
            hashMap4.put("categoryId", new TableInfo.Column("categoryId", "TEXT", true, 0, (String) null, 1));
            hashMap4.put("filtered", new TableInfo.Column("filtered", "INTEGER", false, 0, (String) null, 1));
            hashMap4.put("inventoryDate", new TableInfo.Column("inventoryDate", "INTEGER", true, 0, (String) null, 1));
            hashMap4.put(obj3, new TableInfo.Column("area", "TEXT", false, 0, (String) null, 1));
            hashMap4.put(obj2, new TableInfo.Column("country", "TEXT", false, 0, (String) null, 1));
            hashMap4.put(obj, new TableInfo.Column("grapes", "TEXT", true, 0, (String) null, 1));
            hashMap4.put("autoAdd", new TableInfo.Column("autoAdd", "INTEGER", true, 0, (String) null, 1));
            hashMap4.put(KeyConst.KEY_VIVINO_ID, new TableInfo.Column(KeyConst.KEY_VIVINO_ID, "TEXT", false, 0, (String) null, 1));
            hashMap4.put("score", new TableInfo.Column("score", "TEXT", true, 0, (String) null, 1));
            hashMap4.put("scoreCount", new TableInfo.Column("scoreCount", "TEXT", false, 0, (String) null, 1));
            hashMap4.put("foodMatch", new TableInfo.Column("foodMatch", "TEXT", false, 0, (String) null, 1));
            hashMap4.put("alcohol", new TableInfo.Column("alcohol", "TEXT", true, 0, (String) null, 1));
            hashMap4.put("bestDrinkDate", new TableInfo.Column("bestDrinkDate", "INTEGER", false, 0, (String) null, 1));
            hashMap4.put("notes", new TableInfo.Column("notes", "TEXT", false, 0, (String) null, 1));
            TableInfo tableInfo4 = new TableInfo("wine_inventory_new", hashMap4, new HashSet(0), new HashSet(0));
            TableInfo read4 = TableInfo.read(supportSQLiteDatabase2, "wine_inventory_new");
            if (tableInfo4.equals(read4)) {
                return new RoomOpenHelper.ValidationResult(true, (String) null);
            }
            return new RoomOpenHelper.ValidationResult(false, "wine_inventory_new(com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo).\n Expected:\n" + tableInfo4 + "\n Found:\n" + read4);
        }
    }

    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `login_user_info`");
            writableDatabase.execSQL("DELETE FROM `device_temperature_info`");
            writableDatabase.execSQL("DELETE FROM `wine_category`");
            writableDatabase.execSQL("DELETE FROM `wine_inventory_new`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.inTransaction()) {
                writableDatabase.execSQL("VACUUM");
            }
        }
    }

    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "login_user_info", "device_temperature_info", "wine_category", "wine_inventory_new");
    }

    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration) {
        return databaseConfiguration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(databaseConfiguration.context).name(databaseConfiguration.name).callback(new RoomOpenHelper(databaseConfiguration, new C8569a(7), "a667542ebbd434d885be66cc91a9674a", "b2a5385361c9f960504203c0a52f41cd")).build());
    }

    public List<Migration> getAutoMigrations(@NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> map) {
        return Arrays.asList(new Migration[0]);
    }

    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(LoginUserInfoDao.class, C7460a.m21427b());
        hashMap.put(WineCategoryDao.class, C7474a.m21435b());
        return hashMap;
    }

    public LoginUserInfoDao loginUserInfoDao() {
        LoginUserInfoDao loginUserInfoDao;
        if (this.f15979a != null) {
            return this.f15979a;
        }
        synchronized (this) {
            if (this.f15979a == null) {
                this.f15979a = new C7460a(this);
            }
            loginUserInfoDao = this.f15979a;
        }
        return loginUserInfoDao;
    }

    public WineCategoryDao wineCategoryDao() {
        WineCategoryDao wineCategoryDao;
        if (this.f15980b != null) {
            return this.f15980b;
        }
        synchronized (this) {
            if (this.f15980b == null) {
                this.f15980b = new C7474a(this);
            }
            wineCategoryDao = this.f15980b;
        }
        return wineCategoryDao;
    }
}
