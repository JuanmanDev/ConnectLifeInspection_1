package net.sqlcipher.database;

import androidx.sqlite.p031db.SupportSQLiteProgram;

public abstract class SQLiteProgram extends SQLiteClosable implements SupportSQLiteProgram {
    public static final String TAG = "SQLiteProgram";
    public boolean mClosed = false;
    public SQLiteCompiledSql mCompiledSql;
    @Deprecated
    public SQLiteDatabase mDatabase;
    public final String mSql;
    @Deprecated
    public long nHandle = 0;
    @Deprecated
    public long nStatement = 0;

    public SQLiteProgram(SQLiteDatabase sQLiteDatabase, String str) {
        this.mDatabase = sQLiteDatabase;
        this.mSql = str.trim();
        sQLiteDatabase.acquireReference();
        sQLiteDatabase.addSQLiteClosable(this);
        this.nHandle = sQLiteDatabase.mNativeHandle;
        String substring = this.mSql.length() >= 6 ? this.mSql.substring(0, 6) : this.mSql;
        if (substring.equalsIgnoreCase("INSERT") || substring.equalsIgnoreCase("UPDATE") || substring.equalsIgnoreCase("REPLAC") || substring.equalsIgnoreCase("DELETE") || substring.equalsIgnoreCase("SELECT")) {
            SQLiteCompiledSql compiledStatementForSql = sQLiteDatabase.getCompiledStatementForSql(str);
            this.mCompiledSql = compiledStatementForSql;
            if (compiledStatementForSql == null) {
                SQLiteCompiledSql sQLiteCompiledSql = new SQLiteCompiledSql(sQLiteDatabase, str);
                this.mCompiledSql = sQLiteCompiledSql;
                sQLiteCompiledSql.acquire();
                sQLiteDatabase.addToCompiledQueries(str, this.mCompiledSql);
                if (SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION) {
                    "Created DbObj (id#" + this.mCompiledSql.nStatement + ") for sql: " + str;
                }
            } else if (!compiledStatementForSql.acquire()) {
                long j = this.mCompiledSql.nStatement;
                this.mCompiledSql = new SQLiteCompiledSql(sQLiteDatabase, str);
                if (SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION) {
                    "** possible bug ** Created NEW DbObj (id#" + this.mCompiledSql.nStatement + ") because the previously created DbObj (id#" + j + ") was not released for sql:" + str;
                }
            }
            this.nStatement = this.mCompiledSql.nStatement;
            return;
        }
        SQLiteCompiledSql sQLiteCompiledSql2 = new SQLiteCompiledSql(sQLiteDatabase, str);
        this.mCompiledSql = sQLiteCompiledSql2;
        this.nStatement = sQLiteCompiledSql2.nStatement;
    }

    private final native void native_clear_bindings();

    private void releaseCompiledSqlIfNotInCache() {
        if (this.mCompiledSql != null) {
            synchronized (this.mDatabase.mCompiledQueries) {
                if (!this.mDatabase.mCompiledQueries.containsValue(this.mCompiledSql)) {
                    this.mCompiledSql.releaseSqlStatement();
                    this.mCompiledSql = null;
                    this.nStatement = 0;
                } else {
                    this.mCompiledSql.release();
                }
            }
        }
    }

    public void bindBlob(int i, byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("the bind value at index " + i + " is null");
        } else if (this.mClosed) {
            throw new IllegalStateException("program already closed");
        } else if (this.mDatabase.isOpen()) {
            acquireReference();
            try {
                native_bind_blob(i, bArr);
            } finally {
                releaseReference();
            }
        } else {
            throw new IllegalStateException("database " + this.mDatabase.getPath() + " already closed");
        }
    }

    public void bindDouble(int i, double d) {
        if (this.mClosed) {
            throw new IllegalStateException("program already closed");
        } else if (this.mDatabase.isOpen()) {
            acquireReference();
            try {
                native_bind_double(i, d);
            } finally {
                releaseReference();
            }
        } else {
            throw new IllegalStateException("database " + this.mDatabase.getPath() + " already closed");
        }
    }

    public void bindLong(int i, long j) {
        if (this.mClosed) {
            throw new IllegalStateException("program already closed");
        } else if (this.mDatabase.isOpen()) {
            acquireReference();
            try {
                native_bind_long(i, j);
            } finally {
                releaseReference();
            }
        } else {
            throw new IllegalStateException("database " + this.mDatabase.getPath() + " already closed");
        }
    }

    public void bindNull(int i) {
        if (this.mClosed) {
            throw new IllegalStateException("program already closed");
        } else if (this.mDatabase.isOpen()) {
            acquireReference();
            try {
                native_bind_null(i);
            } finally {
                releaseReference();
            }
        } else {
            throw new IllegalStateException("database " + this.mDatabase.getPath() + " already closed");
        }
    }

    public void bindString(int i, String str) {
        if (str == null) {
            throw new IllegalArgumentException("the bind value at index " + i + " is null");
        } else if (this.mClosed) {
            throw new IllegalStateException("program already closed");
        } else if (this.mDatabase.isOpen()) {
            acquireReference();
            try {
                native_bind_string(i, str);
            } finally {
                releaseReference();
            }
        } else {
            throw new IllegalStateException("database " + this.mDatabase.getPath() + " already closed");
        }
    }

    public void clearBindings() {
        if (this.mClosed) {
            throw new IllegalStateException("program already closed");
        } else if (this.mDatabase.isOpen()) {
            acquireReference();
            try {
                native_clear_bindings();
            } finally {
                releaseReference();
            }
        } else {
            throw new IllegalStateException("database " + this.mDatabase.getPath() + " already closed");
        }
    }

    /* JADX INFO: finally extract failed */
    public void close() {
        if (!this.mClosed && this.mDatabase.isOpen()) {
            this.mDatabase.lock();
            try {
                releaseReference();
                this.mDatabase.unlock();
                this.mClosed = true;
            } catch (Throwable th) {
                this.mDatabase.unlock();
                throw th;
            }
        }
    }

    @Deprecated
    public void compile(String str, boolean z) {
    }

    public String getSqlString() {
        return this.mSql;
    }

    public final long getUniqueId() {
        return this.nStatement;
    }

    public final native void native_bind_blob(int i, byte[] bArr);

    public final native void native_bind_double(int i, double d);

    public final native void native_bind_long(int i, long j);

    public final native void native_bind_null(int i);

    public final native void native_bind_string(int i, String str);

    @Deprecated
    public final native void native_compile(String str);

    @Deprecated
    public final native void native_finalize();

    public void onAllReferencesReleased() {
        releaseCompiledSqlIfNotInCache();
        this.mDatabase.releaseReference();
        this.mDatabase.removeSQLiteClosable(this);
    }

    public void onAllReferencesReleasedFromContainer() {
        releaseCompiledSqlIfNotInCache();
        this.mDatabase.releaseReference();
    }
}
