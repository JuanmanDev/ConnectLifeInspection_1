package net.sqlcipher.database;

import androidx.sqlite.p031db.SupportSQLiteOpenHelper;

public class SupportFactory implements SupportSQLiteOpenHelper.Factory {
    public final boolean clearPassphrase;
    public final SQLiteDatabaseHook hook;
    public final byte[] passphrase;

    public SupportFactory(byte[] bArr) {
        this(bArr, (SQLiteDatabaseHook) null);
    }

    public SupportSQLiteOpenHelper create(SupportSQLiteOpenHelper.Configuration configuration) {
        return new SupportHelper(configuration, this.passphrase, this.hook, this.clearPassphrase);
    }

    public SupportFactory(byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook) {
        this(bArr, sQLiteDatabaseHook, true);
    }

    public SupportFactory(byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z) {
        this.passphrase = bArr;
        this.hook = sQLiteDatabaseHook;
        this.clearPassphrase = z;
    }
}
