package com.juconnect.connectlife.sql;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationCompatJellybean;
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
import androidx.test.orchestrator.junit.BundleJUnitUtils;
import com.hisense.connect_life.core.global.KeyConst;
import com.juconnect.connectlife.sql.changes.InvChangeDao;
import com.juconnect.connectlife.sql.inventory.WineInventoryDao;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p040c.p301y.p302b.p519f.p520a.C7775a;
import p040c.p301y.p302b.p519f.p521b.C7780a;

public final class ConnectLifeDb_Impl extends ConnectLifeDb {

    /* renamed from: a */
    public volatile WineInventoryDao f16720a;

    /* renamed from: b */
    public volatile InvChangeDao f16721b;

    /* renamed from: com.juconnect.connectlife.sql.ConnectLifeDb_Impl$a */
    public class C8746a extends RoomOpenHelper.Delegate {
        public C8746a(int i) {
            super(i);
        }

        public void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `wine_inventory` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `id_inventory` TEXT NOT NULL, `auid` TEXT, `age_to` TEXT, `best_to_drink_date` INTEGER, `date_added` TEXT, `date_removed` TEXT, `grape_type` TEXT, `favorite` INTEGER, `name` TEXT, `personal_notes` TEXT, `region` TEXT, `country` TEXT, `shelf_position` TEXT, `exact_position` TEXT, `vintage` INTEGER, `vivino_id` TEXT, `wine_type` TEXT, `winery` TEXT, `image_url` TEXT, `last_changed` TEXT, `categoryId` TEXT, `dateEnterd` INTEGER NOT NULL)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `wine_inventory_change` (`custom_id` INTEGER NOT NULL, `last_change` TEXT NOT NULL, PRIMARY KEY(`custom_id`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `ticket_bean` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `claimId` INTEGER, `dateOfClaim` TEXT, `dateOfRepair` TEXT, `source` TEXT, `userId` TEXT, `serviceTechnician` TEXT, `sagClaimId` INTEGER, `serviceOrderId` INTEGER, `service_technician` TEXT, `status` TEXT, `warranty` INTEGER, `externalServiceEmail` TEXT, `auid` TEXT, `code` TEXT, `name` TEXT, `purchaseDate` TEXT, `serialNumber` TEXT, `serviceIndex` TEXT, `title` TEXT, `description` TEXT, `errorCode` TEXT, `errorCodeConnectedAppliances` TEXT)");
            supportSQLiteDatabase.execSQL(RoomMasterTable.CREATE_QUERY);
            supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '80b402da00c73789a6087d4ea1c4e60e')");
        }

        public void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `wine_inventory`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `wine_inventory_change`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `ticket_bean`");
            if (ConnectLifeDb_Impl.this.mCallbacks != null) {
                int size = ConnectLifeDb_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) ConnectLifeDb_Impl.this.mCallbacks.get(i)).onDestructiveMigration(supportSQLiteDatabase);
                }
            }
        }

        public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
            if (ConnectLifeDb_Impl.this.mCallbacks != null) {
                int size = ConnectLifeDb_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) ConnectLifeDb_Impl.this.mCallbacks.get(i)).onCreate(supportSQLiteDatabase);
                }
            }
        }

        public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
            SupportSQLiteDatabase unused = ConnectLifeDb_Impl.this.mDatabase = supportSQLiteDatabase;
            ConnectLifeDb_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
            if (ConnectLifeDb_Impl.this.mCallbacks != null) {
                int size = ConnectLifeDb_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) ConnectLifeDb_Impl.this.mCallbacks.get(i)).onOpen(supportSQLiteDatabase);
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
            HashMap hashMap = new HashMap(23);
            hashMap.put("id", new TableInfo.Column("id", "INTEGER", true, 1, (String) null, 1));
            hashMap.put("id_inventory", new TableInfo.Column("id_inventory", "TEXT", true, 0, (String) null, 1));
            hashMap.put(KeyConst.KEY_AUIT, new TableInfo.Column(KeyConst.KEY_AUIT, "TEXT", false, 0, (String) null, 1));
            hashMap.put("age_to", new TableInfo.Column("age_to", "TEXT", false, 0, (String) null, 1));
            hashMap.put("best_to_drink_date", new TableInfo.Column("best_to_drink_date", "INTEGER", false, 0, (String) null, 1));
            hashMap.put("date_added", new TableInfo.Column("date_added", "TEXT", false, 0, (String) null, 1));
            hashMap.put("date_removed", new TableInfo.Column("date_removed", "TEXT", false, 0, (String) null, 1));
            hashMap.put("grape_type", new TableInfo.Column("grape_type", "TEXT", false, 0, (String) null, 1));
            hashMap.put("favorite", new TableInfo.Column("favorite", "INTEGER", false, 0, (String) null, 1));
            hashMap.put("name", new TableInfo.Column("name", "TEXT", false, 0, (String) null, 1));
            hashMap.put("personal_notes", new TableInfo.Column("personal_notes", "TEXT", false, 0, (String) null, 1));
            hashMap.put("region", new TableInfo.Column("region", "TEXT", false, 0, (String) null, 1));
            hashMap.put("country", new TableInfo.Column("country", "TEXT", false, 0, (String) null, 1));
            hashMap.put("shelf_position", new TableInfo.Column("shelf_position", "TEXT", false, 0, (String) null, 1));
            hashMap.put("exact_position", new TableInfo.Column("exact_position", "TEXT", false, 0, (String) null, 1));
            hashMap.put("vintage", new TableInfo.Column("vintage", "INTEGER", false, 0, (String) null, 1));
            hashMap.put("vivino_id", new TableInfo.Column("vivino_id", "TEXT", false, 0, (String) null, 1));
            hashMap.put("wine_type", new TableInfo.Column("wine_type", "TEXT", false, 0, (String) null, 1));
            hashMap.put("winery", new TableInfo.Column("winery", "TEXT", false, 0, (String) null, 1));
            hashMap.put("image_url", new TableInfo.Column("image_url", "TEXT", false, 0, (String) null, 1));
            hashMap.put("last_changed", new TableInfo.Column("last_changed", "TEXT", false, 0, (String) null, 1));
            hashMap.put("categoryId", new TableInfo.Column("categoryId", "TEXT", false, 0, (String) null, 1));
            hashMap.put("dateEnterd", new TableInfo.Column("dateEnterd", "INTEGER", true, 0, (String) null, 1));
            TableInfo tableInfo = new TableInfo("wine_inventory", hashMap, new HashSet(0), new HashSet(0));
            TableInfo read = TableInfo.read(supportSQLiteDatabase2, "wine_inventory");
            if (!tableInfo.equals(read)) {
                return new RoomOpenHelper.ValidationResult(false, "wine_inventory(com.juconnect.connectlife.sql.inventory.WineInventoryEntity).\n Expected:\n" + tableInfo + "\n Found:\n" + read);
            }
            HashMap hashMap2 = new HashMap(2);
            hashMap2.put("custom_id", new TableInfo.Column("custom_id", "INTEGER", true, 1, (String) null, 1));
            hashMap2.put("last_change", new TableInfo.Column("last_change", "TEXT", true, 0, (String) null, 1));
            TableInfo tableInfo2 = new TableInfo("wine_inventory_change", hashMap2, new HashSet(0), new HashSet(0));
            TableInfo read2 = TableInfo.read(supportSQLiteDatabase2, "wine_inventory_change");
            if (!tableInfo2.equals(read2)) {
                return new RoomOpenHelper.ValidationResult(false, "wine_inventory_change(com.juconnect.connectlife.sql.changes.InvChangeEntity).\n Expected:\n" + tableInfo2 + "\n Found:\n" + read2);
            }
            HashMap hashMap3 = new HashMap(23);
            hashMap3.put("id", new TableInfo.Column("id", "INTEGER", true, 1, (String) null, 1));
            hashMap3.put("claimId", new TableInfo.Column("claimId", "INTEGER", false, 0, (String) null, 1));
            hashMap3.put("dateOfClaim", new TableInfo.Column("dateOfClaim", "TEXT", false, 0, (String) null, 1));
            hashMap3.put("dateOfRepair", new TableInfo.Column("dateOfRepair", "TEXT", false, 0, (String) null, 1));
            hashMap3.put("source", new TableInfo.Column("source", "TEXT", false, 0, (String) null, 1));
            hashMap3.put("userId", new TableInfo.Column("userId", "TEXT", false, 0, (String) null, 1));
            hashMap3.put("serviceTechnician", new TableInfo.Column("serviceTechnician", "TEXT", false, 0, (String) null, 1));
            hashMap3.put("sagClaimId", new TableInfo.Column("sagClaimId", "INTEGER", false, 0, (String) null, 1));
            hashMap3.put("serviceOrderId", new TableInfo.Column("serviceOrderId", "INTEGER", false, 0, (String) null, 1));
            hashMap3.put("service_technician", new TableInfo.Column("service_technician", "TEXT", false, 0, (String) null, 1));
            hashMap3.put(NotificationCompat.CATEGORY_STATUS, new TableInfo.Column(NotificationCompat.CATEGORY_STATUS, "TEXT", false, 0, (String) null, 1));
            hashMap3.put("warranty", new TableInfo.Column("warranty", "INTEGER", false, 0, (String) null, 1));
            hashMap3.put("externalServiceEmail", new TableInfo.Column("externalServiceEmail", "TEXT", false, 0, (String) null, 1));
            hashMap3.put(KeyConst.KEY_AUIT, new TableInfo.Column(KeyConst.KEY_AUIT, "TEXT", false, 0, (String) null, 1));
            hashMap3.put("code", new TableInfo.Column("code", "TEXT", false, 0, (String) null, 1));
            hashMap3.put("name", new TableInfo.Column("name", "TEXT", false, 0, (String) null, 1));
            hashMap3.put("purchaseDate", new TableInfo.Column("purchaseDate", "TEXT", false, 0, (String) null, 1));
            hashMap3.put("serialNumber", new TableInfo.Column("serialNumber", "TEXT", false, 0, (String) null, 1));
            hashMap3.put("serviceIndex", new TableInfo.Column("serviceIndex", "TEXT", false, 0, (String) null, 1));
            hashMap3.put(NotificationCompatJellybean.KEY_TITLE, new TableInfo.Column(NotificationCompatJellybean.KEY_TITLE, "TEXT", false, 0, (String) null, 1));
            hashMap3.put(BundleJUnitUtils.KEY_DESCRIPTION, new TableInfo.Column(BundleJUnitUtils.KEY_DESCRIPTION, "TEXT", false, 0, (String) null, 1));
            hashMap3.put("errorCode", new TableInfo.Column("errorCode", "TEXT", false, 0, (String) null, 1));
            hashMap3.put("errorCodeConnectedAppliances", new TableInfo.Column("errorCodeConnectedAppliances", "TEXT", false, 0, (String) null, 1));
            TableInfo tableInfo3 = new TableInfo("ticket_bean", hashMap3, new HashSet(0), new HashSet(0));
            TableInfo read3 = TableInfo.read(supportSQLiteDatabase2, "ticket_bean");
            if (tableInfo3.equals(read3)) {
                return new RoomOpenHelper.ValidationResult(true, (String) null);
            }
            return new RoomOpenHelper.ValidationResult(false, "ticket_bean(com.juconnect.connectlife.model.TicketBean).\n Expected:\n" + tableInfo3 + "\n Found:\n" + read3);
        }
    }

    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `wine_inventory`");
            writableDatabase.execSQL("DELETE FROM `wine_inventory_change`");
            writableDatabase.execSQL("DELETE FROM `ticket_bean`");
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
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "wine_inventory", "wine_inventory_change", "ticket_bean");
    }

    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration) {
        return databaseConfiguration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(databaseConfiguration.context).name(databaseConfiguration.name).callback(new RoomOpenHelper(databaseConfiguration, new C8746a(3), "80b402da00c73789a6087d4ea1c4e60e", "d15dedbd244ac09d64b9a7359af82db0")).build());
    }

    public List<Migration> getAutoMigrations(@NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> map) {
        return Arrays.asList(new Migration[0]);
    }

    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(WineInventoryDao.class, C7780a.m21832b());
        hashMap.put(InvChangeDao.class, C7775a.m21827a());
        return hashMap;
    }

    public InvChangeDao invChangeDao() {
        InvChangeDao invChangeDao;
        if (this.f16721b != null) {
            return this.f16721b;
        }
        synchronized (this) {
            if (this.f16721b == null) {
                this.f16721b = new C7775a(this);
            }
            invChangeDao = this.f16721b;
        }
        return invChangeDao;
    }

    public WineInventoryDao wineInventoryDao() {
        WineInventoryDao wineInventoryDao;
        if (this.f16720a != null) {
            return this.f16720a;
        }
        synchronized (this) {
            if (this.f16720a == null) {
                this.f16720a = new C7780a(this);
            }
            wineInventoryDao = this.f16720a;
        }
        return wineInventoryDao;
    }
}
