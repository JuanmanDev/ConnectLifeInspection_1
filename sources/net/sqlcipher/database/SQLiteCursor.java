package net.sqlcipher.database;

import android.database.DataSetObserver;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import net.sqlcipher.AbstractWindowedCursor;
import net.sqlcipher.CursorWindow;
import net.sqlcipher.SQLException;

public class SQLiteCursor extends AbstractWindowedCursor {
    public static final int NO_COUNT = -1;
    public static final String TAG = "Cursor";
    public boolean fillWindowForwardOnly;
    public Map<String, Integer> mColumnNameMap;
    public String[] mColumns;
    public int mCount = -1;
    public int mCursorState;
    public int mCursorWindowCapacity;
    public SQLiteDatabase mDatabase;
    public SQLiteCursorDriver mDriver;
    public String mEditTable;
    public int mInitialRead;
    public ReentrantLock mLock;
    public int mMaxRead;
    public MainThreadNotificationHandler mNotificationHandler;
    public boolean mPendingData;
    public SQLiteQuery mQuery;
    public Throwable mStackTrace;

    public static class MainThreadNotificationHandler extends Handler {
        public final WeakReference<SQLiteCursor> wrappedCursor;

        public MainThreadNotificationHandler(SQLiteCursor sQLiteCursor) {
            this.wrappedCursor = new WeakReference<>(sQLiteCursor);
        }

        public void handleMessage(Message message) {
            SQLiteCursor sQLiteCursor = (SQLiteCursor) this.wrappedCursor.get();
            if (sQLiteCursor != null) {
                sQLiteCursor.notifyDataSetChange();
            }
        }
    }

    public final class QueryThread implements Runnable {
        public final int mThreadState;

        public QueryThread(int i) {
            this.mThreadState = i;
        }

        private void sendMessage() {
            SQLiteCursor sQLiteCursor = SQLiteCursor.this;
            MainThreadNotificationHandler mainThreadNotificationHandler = sQLiteCursor.mNotificationHandler;
            if (mainThreadNotificationHandler != null) {
                mainThreadNotificationHandler.sendEmptyMessage(1);
                boolean unused = SQLiteCursor.this.mPendingData = false;
                return;
            }
            boolean unused2 = sQLiteCursor.mPendingData = true;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            net.sqlcipher.database.SQLiteCursor.access$502(r4.this$0, r1);
            sendMessage();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r4 = this;
                net.sqlcipher.database.SQLiteCursor r0 = net.sqlcipher.database.SQLiteCursor.this
                net.sqlcipher.CursorWindow r0 = r0.mWindow
                int r1 = android.os.Process.myTid()
                r2 = 10
                android.os.Process.setThreadPriority(r1, r2)
            L_0x000f:
                net.sqlcipher.database.SQLiteCursor r1 = net.sqlcipher.database.SQLiteCursor.this
                java.util.concurrent.locks.ReentrantLock r1 = r1.mLock
                if (r1 != 0) goto L_0x0022
                net.sqlcipher.database.SQLiteCursor r1 = net.sqlcipher.database.SQLiteCursor.this
                java.util.concurrent.locks.ReentrantLock r2 = new java.util.concurrent.locks.ReentrantLock
                r3 = 1
                r2.<init>(r3)
                java.util.concurrent.locks.ReentrantLock unused = r1.mLock = r2
            L_0x0022:
                net.sqlcipher.database.SQLiteCursor r1 = net.sqlcipher.database.SQLiteCursor.this
                java.util.concurrent.locks.ReentrantLock r1 = r1.mLock
                r1.lock()
                net.sqlcipher.database.SQLiteCursor r1 = net.sqlcipher.database.SQLiteCursor.this
                int r1 = r1.mCursorState
                int r2 = r4.mThreadState
                if (r1 == r2) goto L_0x003f
                net.sqlcipher.database.SQLiteCursor r0 = net.sqlcipher.database.SQLiteCursor.this
                java.util.concurrent.locks.ReentrantLock r0 = r0.mLock
                r0.unlock()
                goto L_0x0096
            L_0x003f:
                net.sqlcipher.database.SQLiteCursor r1 = net.sqlcipher.database.SQLiteCursor.this     // Catch:{ Exception -> 0x008d, all -> 0x0082 }
                net.sqlcipher.database.SQLiteQuery r1 = r1.mQuery     // Catch:{ Exception -> 0x008d, all -> 0x0082 }
                net.sqlcipher.database.SQLiteCursor r2 = net.sqlcipher.database.SQLiteCursor.this     // Catch:{ Exception -> 0x008d, all -> 0x0082 }
                int r2 = r2.mMaxRead     // Catch:{ Exception -> 0x008d, all -> 0x0082 }
                net.sqlcipher.database.SQLiteCursor r3 = net.sqlcipher.database.SQLiteCursor.this     // Catch:{ Exception -> 0x008d, all -> 0x0082 }
                int r3 = r3.mCount     // Catch:{ Exception -> 0x008d, all -> 0x0082 }
                int r1 = r1.fillWindow(r0, r2, r3)     // Catch:{ Exception -> 0x008d, all -> 0x0082 }
                if (r1 == 0) goto L_0x008d
                r2 = -1
                if (r1 != r2) goto L_0x0079
                net.sqlcipher.database.SQLiteCursor r1 = net.sqlcipher.database.SQLiteCursor.this     // Catch:{ Exception -> 0x008d, all -> 0x0082 }
                net.sqlcipher.database.SQLiteCursor r2 = net.sqlcipher.database.SQLiteCursor.this     // Catch:{ Exception -> 0x008d, all -> 0x0082 }
                int r2 = r2.mCount     // Catch:{ Exception -> 0x008d, all -> 0x0082 }
                net.sqlcipher.database.SQLiteCursor r3 = net.sqlcipher.database.SQLiteCursor.this     // Catch:{ Exception -> 0x008d, all -> 0x0082 }
                int r3 = r3.mMaxRead     // Catch:{ Exception -> 0x008d, all -> 0x0082 }
                int r2 = r2 + r3
                int unused = r1.mCount = r2     // Catch:{ Exception -> 0x008d, all -> 0x0082 }
                r4.sendMessage()     // Catch:{ Exception -> 0x008d, all -> 0x0082 }
                net.sqlcipher.database.SQLiteCursor r1 = net.sqlcipher.database.SQLiteCursor.this
                java.util.concurrent.locks.ReentrantLock r1 = r1.mLock
                r1.unlock()
                goto L_0x000f
            L_0x0079:
                net.sqlcipher.database.SQLiteCursor r0 = net.sqlcipher.database.SQLiteCursor.this     // Catch:{ Exception -> 0x008d, all -> 0x0082 }
                int unused = r0.mCount = r1     // Catch:{ Exception -> 0x008d, all -> 0x0082 }
                r4.sendMessage()     // Catch:{ Exception -> 0x008d, all -> 0x0082 }
                goto L_0x008d
            L_0x0082:
                r0 = move-exception
                net.sqlcipher.database.SQLiteCursor r1 = net.sqlcipher.database.SQLiteCursor.this
                java.util.concurrent.locks.ReentrantLock r1 = r1.mLock
                r1.unlock()
                throw r0
            L_0x008d:
                net.sqlcipher.database.SQLiteCursor r0 = net.sqlcipher.database.SQLiteCursor.this
                java.util.concurrent.locks.ReentrantLock r0 = r0.mLock
                r0.unlock()
            L_0x0096:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteCursor.QueryThread.run():void");
        }
    }

    public SQLiteCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        this.mCursorWindowCapacity = 0;
        this.fillWindowForwardOnly = false;
        this.mMaxRead = Integer.MAX_VALUE;
        this.mInitialRead = Integer.MAX_VALUE;
        this.mCursorState = 0;
        this.mLock = null;
        this.mPendingData = false;
        this.mStackTrace = new DatabaseObjectNotClosedException().fillInStackTrace();
        this.mDatabase = sQLiteDatabase;
        this.mDriver = sQLiteCursorDriver;
        this.mEditTable = str;
        this.mColumnNameMap = null;
        this.mQuery = sQLiteQuery;
        try {
            sQLiteDatabase.lock();
            int columnCountLocked = this.mQuery.columnCountLocked();
            this.mColumns = new String[columnCountLocked];
            for (int i = 0; i < columnCountLocked; i++) {
                String columnNameLocked = this.mQuery.columnNameLocked(i);
                this.mColumns[i] = columnNameLocked;
                if ("_id".equals(columnNameLocked)) {
                    this.mRowIdColumnIndex = i;
                }
            }
        } finally {
            sQLiteDatabase.unlock();
        }
    }

    private void deactivateCommon() {
        this.mCursorState = 0;
        CursorWindow cursorWindow = this.mWindow;
        if (cursorWindow != null) {
            cursorWindow.close();
            this.mWindow = null;
        }
    }

    private void fillWindow(int i) {
        int i2;
        if (this.mWindow == null) {
            this.mWindow = new CursorWindow(true);
        } else {
            this.mCursorState++;
            queryThreadLock();
            try {
                this.mWindow.clear();
            } finally {
                queryThreadUnlock();
            }
        }
        if (this.fillWindowForwardOnly) {
            i2 = i;
        } else if (this.mCount == -1) {
            i2 = cursorPickFillWindowStartPosition(i, 0);
        } else {
            i2 = cursorPickFillWindowStartPosition(i, this.mCursorWindowCapacity);
        }
        this.mWindow.setStartPosition(i2);
        this.mWindow.setRequiredPosition(i);
        this.mCount = this.mQuery.fillWindow(this.mWindow, this.mInitialRead, 0);
        if (this.mCursorWindowCapacity == 0) {
            this.mCursorWindowCapacity = this.mWindow.getNumRows();
        }
        if (this.mCount == -1) {
            this.mCount = i2 + this.mInitialRead;
            new Thread(new QueryThread(this.mCursorState), "query thread").start();
        }
    }

    private void queryThreadLock() {
        ReentrantLock reentrantLock = this.mLock;
        if (reentrantLock != null) {
            reentrantLock.lock();
        }
    }

    private void queryThreadUnlock() {
        ReentrantLock reentrantLock = this.mLock;
        if (reentrantLock != null) {
            reentrantLock.unlock();
        }
    }

    public void close() {
        super.close();
        deactivateCommon();
        this.mQuery.close();
        this.mDriver.cursorClosed();
    }

    /* JADX INFO: finally extract failed */
    public boolean commitUpdates(Map<? extends Long, ? extends Map<String, Object>> map) {
        if (!supportsUpdates()) {
            return false;
        }
        synchronized (this.mUpdatedRows) {
            if (map != null) {
                this.mUpdatedRows.putAll(map);
            }
            if (this.mUpdatedRows.size() == 0) {
                return true;
            }
            this.mDatabase.beginTransaction();
            try {
                StringBuilder sb = new StringBuilder(128);
                for (Map.Entry next : this.mUpdatedRows.entrySet()) {
                    Map map2 = (Map) next.getValue();
                    Long l = (Long) next.getKey();
                    if (l == null || map2 == null) {
                        throw new IllegalStateException("null rowId or values found! rowId = " + l + ", values = " + map2);
                    } else if (map2.size() != 0) {
                        long longValue = l.longValue();
                        Iterator it = map2.entrySet().iterator();
                        sb.setLength(0);
                        sb.append("UPDATE " + this.mEditTable + " SET ");
                        Object[] objArr = new Object[map2.size()];
                        int i = 0;
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            sb.append((String) entry.getKey());
                            sb.append("=?");
                            objArr[i] = entry.getValue();
                            if (it.hasNext()) {
                                sb.append(", ");
                            }
                            i++;
                        }
                        sb.append(" WHERE " + this.mColumns[this.mRowIdColumnIndex] + '=' + longValue);
                        sb.append(';');
                        this.mDatabase.execSQL(sb.toString(), objArr);
                        this.mDatabase.rowUpdated(this.mEditTable, longValue);
                    }
                }
                this.mDatabase.setTransactionSuccessful();
                this.mDatabase.endTransaction();
                this.mUpdatedRows.clear();
                onChange(true);
                return true;
            } catch (Throwable th) {
                this.mDatabase.endTransaction();
                throw th;
            }
        }
    }

    public int cursorPickFillWindowStartPosition(int i, int i2) {
        return Math.max(i - (i2 / 3), 0);
    }

    public void deactivate() {
        super.deactivate();
        deactivateCommon();
        this.mDriver.cursorDeactivated();
    }

    public boolean deleteRow() {
        boolean z;
        checkPosition();
        if (this.mRowIdColumnIndex == -1 || this.mCurrentRowID == null) {
            return false;
        }
        this.mDatabase.lock();
        try {
            this.mDatabase.delete(this.mEditTable, this.mColumns[this.mRowIdColumnIndex] + "=?", new String[]{this.mCurrentRowID.toString()});
            z = true;
        } catch (SQLException unused) {
            z = false;
        }
        try {
            int i = this.mPos;
            requery();
            moveToPosition(i);
            if (!z) {
                return false;
            }
            onChange(true);
            return true;
        } finally {
            this.mDatabase.unlock();
        }
    }

    public void finalize() {
        try {
            if (this.mWindow != null) {
                this.mQuery.mSql.length();
                close();
                SQLiteDebug.notifyActiveCursorFinalized();
            }
        } finally {
            super.finalize();
        }
    }

    public int getColumnIndex(String str) {
        if (this.mColumnNameMap == null) {
            String[] strArr = this.mColumns;
            int length = strArr.length;
            HashMap hashMap = new HashMap(length, 1.0f);
            for (int i = 0; i < length; i++) {
                hashMap.put(strArr[i], Integer.valueOf(i));
            }
            this.mColumnNameMap = hashMap;
        }
        if (str.lastIndexOf(46) != -1) {
            new Exception();
        }
        Integer num = this.mColumnNameMap.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    public String[] getColumnNames() {
        return this.mColumns;
    }

    public int getCount() {
        if (this.mCount == -1) {
            fillWindow(0);
        }
        return this.mCount;
    }

    public SQLiteDatabase getDatabase() {
        return this.mDatabase;
    }

    public boolean onMove(int i, int i2) {
        CursorWindow cursorWindow = this.mWindow;
        if (cursorWindow != null && i2 >= cursorWindow.getStartPosition() && i2 < this.mWindow.getStartPosition() + this.mWindow.getNumRows()) {
            return true;
        }
        fillWindow(i2);
        return true;
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        super.registerDataSetObserver(dataSetObserver);
        if (!(Integer.MAX_VALUE == this.mMaxRead && Integer.MAX_VALUE == this.mInitialRead) && this.mNotificationHandler == null) {
            queryThreadLock();
            try {
                this.mNotificationHandler = new MainThreadNotificationHandler(this);
                if (this.mPendingData) {
                    notifyDataSetChange();
                    this.mPendingData = false;
                }
            } finally {
                queryThreadUnlock();
            }
        }
    }

    public boolean requery() {
        if (isClosed()) {
            return false;
        }
        this.mDatabase.lock();
        try {
            if (this.mWindow != null) {
                this.mWindow.clear();
            }
            this.mPos = -1;
            this.mDriver.cursorRequeried(this);
            this.mCount = -1;
            this.mCursorState++;
            queryThreadLock();
            this.mQuery.requery();
            queryThreadUnlock();
            this.mDatabase.unlock();
            return super.requery();
        } catch (Throwable th) {
            this.mDatabase.unlock();
            throw th;
        }
    }

    public void setFillWindowForwardOnly(boolean z) {
        this.fillWindowForwardOnly = z;
    }

    public void setLoadStyle(int i, int i2) {
        this.mMaxRead = i2;
        this.mInitialRead = i;
        this.mLock = new ReentrantLock(true);
    }

    public void setSelectionArguments(String[] strArr) {
        this.mDriver.setBindArguments(strArr);
    }

    /* JADX INFO: finally extract failed */
    public void setWindow(CursorWindow cursorWindow) {
        if (this.mWindow != null) {
            this.mCursorState++;
            queryThreadLock();
            try {
                this.mWindow.close();
                queryThreadUnlock();
                this.mCount = -1;
            } catch (Throwable th) {
                queryThreadUnlock();
                throw th;
            }
        }
        this.mWindow = cursorWindow;
    }

    public boolean supportsUpdates() {
        return !TextUtils.isEmpty(this.mEditTable);
    }

    public void fillWindow(int i, android.database.CursorWindow cursorWindow) {
        int i2;
        if (this.mWindow == null) {
            this.mWindow = new CursorWindow(true);
        } else {
            this.mCursorState++;
            queryThreadLock();
            try {
                this.mWindow.clear();
            } finally {
                queryThreadUnlock();
            }
        }
        if (this.fillWindowForwardOnly) {
            i2 = i;
        } else if (this.mCount == -1) {
            i2 = cursorPickFillWindowStartPosition(i, 0);
        } else {
            i2 = cursorPickFillWindowStartPosition(i, this.mCursorWindowCapacity);
        }
        this.mWindow.setStartPosition(i2);
        this.mWindow.setRequiredPosition(i);
        this.mCount = this.mQuery.fillWindow(this.mWindow, this.mInitialRead, 0);
        if (this.mCursorWindowCapacity == 0) {
            this.mCursorWindowCapacity = this.mWindow.getNumRows();
        }
        if (this.mCount == -1) {
            this.mCount = i2 + this.mInitialRead;
            new Thread(new QueryThread(this.mCursorState), "query thread").start();
        }
    }
}
