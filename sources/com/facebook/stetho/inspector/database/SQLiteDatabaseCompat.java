package com.facebook.stetho.inspector.database;

import android.annotation.TargetApi;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;

public abstract class SQLiteDatabaseCompat {
    public static final int ENABLE_FOREIGN_KEY_CONSTRAINTS = 2;
    public static final int ENABLE_WRITE_AHEAD_LOGGING = 1;
    public static final SQLiteDatabaseCompat sInstance;

    @TargetApi(11)
    public static class HoneycombImpl extends SQLiteDatabaseCompat {
        public HoneycombImpl() {
        }

        public void enableFeatures(@SQLiteOpenOptions int i, SQLiteDatabase sQLiteDatabase) {
            if ((i & 1) != 0) {
                sQLiteDatabase.enableWriteAheadLogging();
            }
            if ((i & 2) != 0) {
                sQLiteDatabase.execSQL("PRAGMA foreign_keys = ON");
            }
        }

        public int provideOpenFlags(@SQLiteOpenOptions int i) {
            return 0;
        }
    }

    @TargetApi(16)
    public static class JellyBeanAndBeyondImpl extends SQLiteDatabaseCompat {
        public JellyBeanAndBeyondImpl() {
        }

        public void enableFeatures(@SQLiteOpenOptions int i, SQLiteDatabase sQLiteDatabase) {
            if ((i & 2) != 0) {
                sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
            }
        }

        public int provideOpenFlags(@SQLiteOpenOptions int i) {
            return (i & 1) != 0 ? 536870912 : 0;
        }
    }

    public static class NoopImpl extends SQLiteDatabaseCompat {
        public NoopImpl() {
        }

        public void enableFeatures(@SQLiteOpenOptions int i, SQLiteDatabase sQLiteDatabase) {
        }

        public int provideOpenFlags(@SQLiteOpenOptions int i) {
            return 0;
        }
    }

    public @interface SQLiteOpenOptions {
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 16) {
            sInstance = new JellyBeanAndBeyondImpl();
        } else if (i >= 11) {
            sInstance = new HoneycombImpl();
        } else {
            sInstance = new NoopImpl();
        }
    }

    public static SQLiteDatabaseCompat getInstance() {
        return sInstance;
    }

    public abstract void enableFeatures(@SQLiteOpenOptions int i, SQLiteDatabase sQLiteDatabase);

    public abstract int provideOpenFlags(@SQLiteOpenOptions int i);
}
