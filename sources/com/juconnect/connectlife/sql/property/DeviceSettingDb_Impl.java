package com.juconnect.connectlife.sql.property;

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
import com.hisense.connect_life.core.global.KeyConst;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p040c.p301y.p302b.p519f.p522c.C7789a;
import p040c.p301y.p302b.p519f.p522c.C7794b;
import p040c.p301y.p302b.p519f.p522c.C7799c;

public final class DeviceSettingDb_Impl extends DeviceSettingDb {

    /* renamed from: a */
    public volatile ProfileDao f16726a;

    /* renamed from: b */
    public volatile PropertyDao f16727b;

    /* renamed from: c */
    public volatile MsgDao f16728c;

    /* renamed from: com.juconnect.connectlife.sql.property.DeviceSettingDb_Impl$a */
    public class C8748a extends RoomOpenHelper.Delegate {
        public C8748a(int i) {
            super(i);
        }

        public void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `profile` (`data` TEXT, `auid` TEXT NOT NULL, PRIMARY KEY(`auid`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `property` (`data` TEXT, `auid` TEXT NOT NULL, PRIMARY KEY(`auid`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `msgswitch` (`data` TEXT, `auid` TEXT NOT NULL, PRIMARY KEY(`auid`))");
            supportSQLiteDatabase.execSQL(RoomMasterTable.CREATE_QUERY);
            supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'fcc0dbf8a5328eeebb7feb5ae976499c')");
        }

        public void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `profile`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `property`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `msgswitch`");
            if (DeviceSettingDb_Impl.this.mCallbacks != null) {
                int size = DeviceSettingDb_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) DeviceSettingDb_Impl.this.mCallbacks.get(i)).onDestructiveMigration(supportSQLiteDatabase);
                }
            }
        }

        public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
            if (DeviceSettingDb_Impl.this.mCallbacks != null) {
                int size = DeviceSettingDb_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) DeviceSettingDb_Impl.this.mCallbacks.get(i)).onCreate(supportSQLiteDatabase);
                }
            }
        }

        public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
            SupportSQLiteDatabase unused = DeviceSettingDb_Impl.this.mDatabase = supportSQLiteDatabase;
            DeviceSettingDb_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
            if (DeviceSettingDb_Impl.this.mCallbacks != null) {
                int size = DeviceSettingDb_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) DeviceSettingDb_Impl.this.mCallbacks.get(i)).onOpen(supportSQLiteDatabase);
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
            HashMap hashMap = new HashMap(2);
            hashMap.put("data", new TableInfo.Column("data", "TEXT", false, 0, (String) null, 1));
            hashMap.put(KeyConst.KEY_AUIT, new TableInfo.Column(KeyConst.KEY_AUIT, "TEXT", true, 1, (String) null, 1));
            TableInfo tableInfo = new TableInfo("profile", hashMap, new HashSet(0), new HashSet(0));
            TableInfo read = TableInfo.read(supportSQLiteDatabase2, "profile");
            if (!tableInfo.equals(read)) {
                return new RoomOpenHelper.ValidationResult(false, "profile(com.juconnect.connectlife.sql.property.ProfileEntity).\n Expected:\n" + tableInfo + "\n Found:\n" + read);
            }
            HashMap hashMap2 = new HashMap(2);
            hashMap2.put("data", new TableInfo.Column("data", "TEXT", false, 0, (String) null, 1));
            hashMap2.put(KeyConst.KEY_AUIT, new TableInfo.Column(KeyConst.KEY_AUIT, "TEXT", true, 1, (String) null, 1));
            TableInfo tableInfo2 = new TableInfo("property", hashMap2, new HashSet(0), new HashSet(0));
            TableInfo read2 = TableInfo.read(supportSQLiteDatabase2, "property");
            if (!tableInfo2.equals(read2)) {
                return new RoomOpenHelper.ValidationResult(false, "property(com.juconnect.connectlife.sql.property.PropertyEntity).\n Expected:\n" + tableInfo2 + "\n Found:\n" + read2);
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put("data", new TableInfo.Column("data", "TEXT", false, 0, (String) null, 1));
            hashMap3.put(KeyConst.KEY_AUIT, new TableInfo.Column(KeyConst.KEY_AUIT, "TEXT", true, 1, (String) null, 1));
            TableInfo tableInfo3 = new TableInfo("msgswitch", hashMap3, new HashSet(0), new HashSet(0));
            TableInfo read3 = TableInfo.read(supportSQLiteDatabase2, "msgswitch");
            if (tableInfo3.equals(read3)) {
                return new RoomOpenHelper.ValidationResult(true, (String) null);
            }
            return new RoomOpenHelper.ValidationResult(false, "msgswitch(com.juconnect.connectlife.sql.property.MsgEntity).\n Expected:\n" + tableInfo3 + "\n Found:\n" + read3);
        }
    }

    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `profile`");
            writableDatabase.execSQL("DELETE FROM `property`");
            writableDatabase.execSQL("DELETE FROM `msgswitch`");
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
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "profile", "property", "msgswitch");
    }

    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration) {
        return databaseConfiguration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(databaseConfiguration.context).name(databaseConfiguration.name).callback(new RoomOpenHelper(databaseConfiguration, new C8748a(1), "fcc0dbf8a5328eeebb7feb5ae976499c", "2ac39acf73c96543b33ba8f7ffb793e0")).build());
    }

    public List<Migration> getAutoMigrations(@NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> map) {
        return Arrays.asList(new Migration[0]);
    }

    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(ProfileDao.class, C7794b.m21841a());
        hashMap.put(PropertyDao.class, C7799c.m21844a());
        hashMap.put(MsgDao.class, C7789a.m21838a());
        return hashMap;
    }

    public MsgDao msgDao() {
        MsgDao msgDao;
        if (this.f16728c != null) {
            return this.f16728c;
        }
        synchronized (this) {
            if (this.f16728c == null) {
                this.f16728c = new C7789a(this);
            }
            msgDao = this.f16728c;
        }
        return msgDao;
    }

    public ProfileDao profileDao() {
        ProfileDao profileDao;
        if (this.f16726a != null) {
            return this.f16726a;
        }
        synchronized (this) {
            if (this.f16726a == null) {
                this.f16726a = new C7794b(this);
            }
            profileDao = this.f16726a;
        }
        return profileDao;
    }

    public PropertyDao propertyDao() {
        PropertyDao propertyDao;
        if (this.f16727b != null) {
            return this.f16727b;
        }
        synchronized (this) {
            if (this.f16727b == null) {
                this.f16727b = new C7799c(this);
            }
            propertyDao = this.f16727b;
        }
        return propertyDao;
    }
}
