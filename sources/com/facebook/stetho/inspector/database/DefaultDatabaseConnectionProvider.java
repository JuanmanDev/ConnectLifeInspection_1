package com.facebook.stetho.inspector.database;

import android.database.sqlite.SQLiteDatabase;
import com.facebook.stetho.inspector.database.SQLiteDatabaseCompat;
import java.io.File;

public class DefaultDatabaseConnectionProvider implements DatabaseConnectionProvider {
    @SQLiteDatabaseCompat.SQLiteOpenOptions
    public int determineOpenOptions(File file) {
        String parent = file.getParent();
        StringBuilder sb = new StringBuilder();
        sb.append(file.getName());
        sb.append("-wal");
        return new File(parent, sb.toString()).exists() ? 1 : 0;
    }

    public SQLiteDatabase openDatabase(File file) {
        return performOpen(file, determineOpenOptions(file));
    }

    public SQLiteDatabase performOpen(File file, @SQLiteDatabaseCompat.SQLiteOpenOptions int i) {
        SQLiteDatabaseCompat instance = SQLiteDatabaseCompat.getInstance();
        SQLiteDatabase openDatabase = SQLiteDatabase.openDatabase(file.getAbsolutePath(), (SQLiteDatabase.CursorFactory) null, instance.provideOpenFlags(i) | 0);
        instance.enableFeatures(i, openDatabase);
        return openDatabase;
    }
}
