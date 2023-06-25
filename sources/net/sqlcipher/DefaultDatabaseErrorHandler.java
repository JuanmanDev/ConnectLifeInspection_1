package net.sqlcipher;

import java.io.File;
import net.sqlcipher.database.SQLiteDatabase;

public final class DefaultDatabaseErrorHandler implements DatabaseErrorHandler {
    public final String TAG = DefaultDatabaseErrorHandler.class.getSimpleName();

    private void deleteDatabaseFile(String str) {
        if (!str.equalsIgnoreCase(SQLiteDatabase.MEMORY) && str.trim().length() != 0) {
            "deleting the database file: " + str;
            try {
                new File(str).delete();
            } catch (Exception e) {
                "delete failed: " + e.getMessage();
            }
        }
    }

    public void onCorruption(SQLiteDatabase sQLiteDatabase) {
        "Corruption reported by sqlite on database, deleting: " + sQLiteDatabase.getPath();
        if (sQLiteDatabase.isOpen()) {
            try {
                sQLiteDatabase.close();
            } catch (Exception unused) {
            }
        }
        deleteDatabaseFile(sQLiteDatabase.getPath());
    }
}
