package net.sqlcipher.database;

public class SQLiteCompiledSql {
    public static final String TAG = "SQLiteCompiledSql";
    public SQLiteDatabase mDatabase;
    public boolean mInUse = false;
    public String mSqlStmt = null;
    public long nHandle = 0;
    public long nStatement = 0;

    public SQLiteCompiledSql(SQLiteDatabase sQLiteDatabase, String str) {
        if (sQLiteDatabase.isOpen()) {
            this.mDatabase = sQLiteDatabase;
            this.mSqlStmt = str;
            this.nHandle = sQLiteDatabase.mNativeHandle;
            compile(str, true);
            return;
        }
        throw new IllegalStateException("database " + sQLiteDatabase.getPath() + " already closed");
    }

    private void compile(String str, boolean z) {
        if (!this.mDatabase.isOpen()) {
            throw new IllegalStateException("database " + this.mDatabase.getPath() + " already closed");
        } else if (z) {
            this.mDatabase.lock();
            try {
                native_compile(str);
            } finally {
                this.mDatabase.unlock();
            }
        }
    }

    private final native void native_compile(String str);

    private final native void native_finalize();

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean acquire() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.mInUse     // Catch:{ all -> 0x0028 }
            if (r0 == 0) goto L_0x0008
            r0 = 0
            monitor-exit(r4)
            return r0
        L_0x0008:
            r0 = 1
            r4.mInUse = r0     // Catch:{ all -> 0x0028 }
            boolean r1 = net.sqlcipher.database.SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x0026
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0028 }
            r1.<init>()     // Catch:{ all -> 0x0028 }
            java.lang.String r2 = "Acquired DbObj (id#"
            r1.append(r2)     // Catch:{ all -> 0x0028 }
            long r2 = r4.nStatement     // Catch:{ all -> 0x0028 }
            r1.append(r2)     // Catch:{ all -> 0x0028 }
            java.lang.String r2 = ") from DB cache"
            r1.append(r2)     // Catch:{ all -> 0x0028 }
            r1.toString()     // Catch:{ all -> 0x0028 }
        L_0x0026:
            monitor-exit(r4)
            return r0
        L_0x0028:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteCompiledSql.acquire():boolean");
    }

    public void finalize() {
        try {
            if (this.nStatement != 0) {
                if (SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION) {
                    "** warning ** Finalized DbObj (id#" + this.nStatement + ")";
                }
                releaseSqlStatement();
                super.finalize();
            }
        } finally {
            super.finalize();
        }
    }

    public synchronized void release() {
        if (SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION) {
            "Released DbObj (id#" + this.nStatement + ") back to DB cache";
        }
        this.mInUse = false;
    }

    public void releaseSqlStatement() {
        if (this.nStatement != 0) {
            if (SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION) {
                "closed and deallocated DbObj (id#" + this.nStatement + ")";
            }
            try {
                this.mDatabase.lock();
                native_finalize();
                this.nStatement = 0;
            } finally {
                this.mDatabase.unlock();
            }
        }
    }
}
