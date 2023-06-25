package com.juconnect.connectlife.sql;

import androidx.annotation.NonNull;
import androidx.browser.browseractions.BrowserServiceFileProvider;
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
import com.hisense.connect_life.hismart.room.NotificationDao;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p040c.p429r.p430a.p439c.p455b.C7455a;

public final class NotificationDb_Impl extends NotificationDb {

    /* renamed from: a */
    public volatile NotificationDao f16723a;

    /* renamed from: com.juconnect.connectlife.sql.NotificationDb_Impl$a */
    public class C8747a extends RoomOpenHelper.Delegate {
        public C8747a(int i) {
            super(i);
        }

        public void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `notification` (`select` INTEGER, `customer_id` TEXT, `device_id` TEXT, `format_id` INTEGER NOT NULL, `title` TEXT, `content` TEXT, `msg_level` INTEGER NOT NULL, `msg_type` INTEGER NOT NULL, `insert_time` INTEGER NOT NULL, `msg_read_status` INTEGER NOT NULL, `start_time` INTEGER NOT NULL, `expire_time` INTEGER NOT NULL, `msg_id` TEXT NOT NULL, `msg_type_code` TEXT, `noid` INTEGER NOT NULL, PRIMARY KEY(`msg_id`))");
            supportSQLiteDatabase.execSQL(RoomMasterTable.CREATE_QUERY);
            supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '4c283d26e9868e8f3b4053ad8675ff43')");
        }

        public void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `notification`");
            if (NotificationDb_Impl.this.mCallbacks != null) {
                int size = NotificationDb_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) NotificationDb_Impl.this.mCallbacks.get(i)).onDestructiveMigration(supportSQLiteDatabase);
                }
            }
        }

        public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
            if (NotificationDb_Impl.this.mCallbacks != null) {
                int size = NotificationDb_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) NotificationDb_Impl.this.mCallbacks.get(i)).onCreate(supportSQLiteDatabase);
                }
            }
        }

        public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
            SupportSQLiteDatabase unused = NotificationDb_Impl.this.mDatabase = supportSQLiteDatabase;
            NotificationDb_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
            if (NotificationDb_Impl.this.mCallbacks != null) {
                int size = NotificationDb_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) NotificationDb_Impl.this.mCallbacks.get(i)).onOpen(supportSQLiteDatabase);
                }
            }
        }

        public void onPostMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        public void onPreMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            DBUtil.dropFtsSyncTriggers(supportSQLiteDatabase);
        }

        public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase supportSQLiteDatabase) {
            HashMap hashMap = new HashMap(15);
            hashMap.put("select", new TableInfo.Column("select", "INTEGER", false, 0, (String) null, 1));
            hashMap.put("customer_id", new TableInfo.Column("customer_id", "TEXT", false, 0, (String) null, 1));
            hashMap.put("device_id", new TableInfo.Column("device_id", "TEXT", false, 0, (String) null, 1));
            hashMap.put("format_id", new TableInfo.Column("format_id", "INTEGER", true, 0, (String) null, 1));
            hashMap.put(NotificationCompatJellybean.KEY_TITLE, new TableInfo.Column(NotificationCompatJellybean.KEY_TITLE, "TEXT", false, 0, (String) null, 1));
            hashMap.put(BrowserServiceFileProvider.CONTENT_SCHEME, new TableInfo.Column(BrowserServiceFileProvider.CONTENT_SCHEME, "TEXT", false, 0, (String) null, 1));
            hashMap.put("msg_level", new TableInfo.Column("msg_level", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("msg_type", new TableInfo.Column("msg_type", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("insert_time", new TableInfo.Column("insert_time", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("msg_read_status", new TableInfo.Column("msg_read_status", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("start_time", new TableInfo.Column("start_time", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("expire_time", new TableInfo.Column("expire_time", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("msg_id", new TableInfo.Column("msg_id", "TEXT", true, 1, (String) null, 1));
            hashMap.put("msg_type_code", new TableInfo.Column("msg_type_code", "TEXT", false, 0, (String) null, 1));
            hashMap.put("noid", new TableInfo.Column("noid", "INTEGER", true, 0, (String) null, 1));
            TableInfo tableInfo = new TableInfo("notification", hashMap, new HashSet(0), new HashSet(0));
            TableInfo read = TableInfo.read(supportSQLiteDatabase, "notification");
            if (tableInfo.equals(read)) {
                return new RoomOpenHelper.ValidationResult(true, (String) null);
            }
            return new RoomOpenHelper.ValidationResult(false, "notification(com.hisense.connect_life.hismart.room.Notification).\n Expected:\n" + tableInfo + "\n Found:\n" + read);
        }
    }

    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `notification`");
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
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "notification");
    }

    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration) {
        return databaseConfiguration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(databaseConfiguration.context).name(databaseConfiguration.name).callback(new RoomOpenHelper(databaseConfiguration, new C8747a(2), "4c283d26e9868e8f3b4053ad8675ff43", "4e457300729f411e9ffa8ad61b915734")).build());
    }

    public List<Migration> getAutoMigrations(@NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> map) {
        return Arrays.asList(new Migration[0]);
    }

    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationDao.class, C7455a.m21423a());
        return hashMap;
    }

    public NotificationDao notificationDao() {
        NotificationDao notificationDao;
        if (this.f16723a != null) {
            return this.f16723a;
        }
        synchronized (this) {
            if (this.f16723a == null) {
                this.f16723a = new C7455a(this);
            }
            notificationDao = this.f16723a;
        }
        return notificationDao;
    }
}
