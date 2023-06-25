package androidx.room;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.arch.core.util.Function;
import androidx.sqlite.p031db.SupportSQLiteDatabase;
import androidx.sqlite.p031db.SupportSQLiteOpenHelper;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class AutoCloser {
    public final long mAutoCloseTimeoutInMs;
    @NonNull
    public final Runnable mAutoCloser = new Runnable() {
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x004f, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r5 = this;
                androidx.room.AutoCloser r0 = androidx.room.AutoCloser.this
                java.lang.Object r0 = r0.mLock
                monitor-enter(r0)
                long r1 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0058 }
                androidx.room.AutoCloser r3 = androidx.room.AutoCloser.this     // Catch:{ all -> 0x0058 }
                long r3 = r3.mLastDecrementRefCountTimeStamp     // Catch:{ all -> 0x0058 }
                long r1 = r1 - r3
                androidx.room.AutoCloser r3 = androidx.room.AutoCloser.this     // Catch:{ all -> 0x0058 }
                long r3 = r3.mAutoCloseTimeoutInMs     // Catch:{ all -> 0x0058 }
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 >= 0) goto L_0x0018
                monitor-exit(r0)     // Catch:{ all -> 0x0058 }
                return
            L_0x0018:
                androidx.room.AutoCloser r1 = androidx.room.AutoCloser.this     // Catch:{ all -> 0x0058 }
                int r1 = r1.mRefCount     // Catch:{ all -> 0x0058 }
                if (r1 == 0) goto L_0x0020
                monitor-exit(r0)     // Catch:{ all -> 0x0058 }
                return
            L_0x0020:
                androidx.room.AutoCloser r1 = androidx.room.AutoCloser.this     // Catch:{ all -> 0x0058 }
                java.lang.Runnable r1 = r1.mOnAutoCloseCallback     // Catch:{ all -> 0x0058 }
                if (r1 == 0) goto L_0x0050
                androidx.room.AutoCloser r1 = androidx.room.AutoCloser.this     // Catch:{ all -> 0x0058 }
                java.lang.Runnable r1 = r1.mOnAutoCloseCallback     // Catch:{ all -> 0x0058 }
                r1.run()     // Catch:{ all -> 0x0058 }
                androidx.room.AutoCloser r1 = androidx.room.AutoCloser.this     // Catch:{ all -> 0x0058 }
                androidx.sqlite.db.SupportSQLiteDatabase r1 = r1.mDelegateDatabase     // Catch:{ all -> 0x0058 }
                if (r1 == 0) goto L_0x004e
                androidx.room.AutoCloser r1 = androidx.room.AutoCloser.this     // Catch:{ all -> 0x0058 }
                androidx.sqlite.db.SupportSQLiteDatabase r1 = r1.mDelegateDatabase     // Catch:{ all -> 0x0058 }
                boolean r1 = r1.isOpen()     // Catch:{ all -> 0x0058 }
                if (r1 == 0) goto L_0x004e
                androidx.room.AutoCloser r1 = androidx.room.AutoCloser.this     // Catch:{ IOException -> 0x0045 }
                androidx.sqlite.db.SupportSQLiteDatabase r1 = r1.mDelegateDatabase     // Catch:{ IOException -> 0x0045 }
                r1.close()     // Catch:{ IOException -> 0x0045 }
                goto L_0x0049
            L_0x0045:
                r1 = move-exception
                androidx.room.util.SneakyThrow.reThrow(r1)     // Catch:{ all -> 0x0058 }
            L_0x0049:
                androidx.room.AutoCloser r1 = androidx.room.AutoCloser.this     // Catch:{ all -> 0x0058 }
                r2 = 0
                r1.mDelegateDatabase = r2     // Catch:{ all -> 0x0058 }
            L_0x004e:
                monitor-exit(r0)     // Catch:{ all -> 0x0058 }
                return
            L_0x0050:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0058 }
                java.lang.String r2 = "mOnAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568"
                r1.<init>(r2)     // Catch:{ all -> 0x0058 }
                throw r1     // Catch:{ all -> 0x0058 }
            L_0x0058:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0058 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.AutoCloser.C08972.run():void");
        }
    };
    @GuardedBy("mLock")
    @Nullable
    public SupportSQLiteDatabase mDelegateDatabase;
    @Nullable
    public SupportSQLiteOpenHelper mDelegateOpenHelper = null;
    public final Runnable mExecuteAutoCloser = new Runnable() {
        public void run() {
            AutoCloser autoCloser = AutoCloser.this;
            autoCloser.mExecutor.execute(autoCloser.mAutoCloser);
        }
    };
    @NonNull
    public final Executor mExecutor;
    @NonNull
    public final Handler mHandler = new Handler(Looper.getMainLooper());
    @GuardedBy("mLock")
    public long mLastDecrementRefCountTimeStamp = SystemClock.uptimeMillis();
    @NonNull
    public final Object mLock = new Object();
    public boolean mManuallyClosed = false;
    @Nullable
    public Runnable mOnAutoCloseCallback = null;
    @GuardedBy("mLock")
    public int mRefCount = 0;

    public AutoCloser(long j, @NonNull TimeUnit timeUnit, @NonNull Executor executor) {
        this.mAutoCloseTimeoutInMs = timeUnit.toMillis(j);
        this.mExecutor = executor;
    }

    public void closeDatabaseIfOpen() {
        synchronized (this.mLock) {
            this.mManuallyClosed = true;
            if (this.mDelegateDatabase != null) {
                this.mDelegateDatabase.close();
            }
            this.mDelegateDatabase = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void decrementCountAndScheduleClose() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.mLock
            monitor-enter(r0)
            int r1 = r5.mRefCount     // Catch:{ all -> 0x0028 }
            if (r1 <= 0) goto L_0x0020
            int r1 = r5.mRefCount     // Catch:{ all -> 0x0028 }
            int r1 = r1 + -1
            r5.mRefCount = r1     // Catch:{ all -> 0x0028 }
            if (r1 != 0) goto L_0x001e
            androidx.sqlite.db.SupportSQLiteDatabase r1 = r5.mDelegateDatabase     // Catch:{ all -> 0x0028 }
            if (r1 != 0) goto L_0x0015
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0015:
            android.os.Handler r1 = r5.mHandler     // Catch:{ all -> 0x0028 }
            java.lang.Runnable r2 = r5.mExecuteAutoCloser     // Catch:{ all -> 0x0028 }
            long r3 = r5.mAutoCloseTimeoutInMs     // Catch:{ all -> 0x0028 }
            r1.postDelayed(r2, r3)     // Catch:{ all -> 0x0028 }
        L_0x001e:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0020:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0028 }
            java.lang.String r2 = "ref count is 0 or lower but we're supposed to decrement"
            r1.<init>(r2)     // Catch:{ all -> 0x0028 }
            throw r1     // Catch:{ all -> 0x0028 }
        L_0x0028:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.AutoCloser.decrementCountAndScheduleClose():void");
    }

    @Nullable
    public <V> V executeRefCountingFunction(@NonNull Function<SupportSQLiteDatabase, V> function) {
        try {
            return function.apply(incrementCountAndEnsureDbIsOpen());
        } finally {
            decrementCountAndScheduleClose();
        }
    }

    @Nullable
    public SupportSQLiteDatabase getDelegateDatabase() {
        SupportSQLiteDatabase supportSQLiteDatabase;
        synchronized (this.mLock) {
            supportSQLiteDatabase = this.mDelegateDatabase;
        }
        return supportSQLiteDatabase;
    }

    @VisibleForTesting
    public int getRefCountForTest() {
        int i;
        synchronized (this.mLock) {
            i = this.mRefCount;
        }
        return i;
    }

    @NonNull
    public SupportSQLiteDatabase incrementCountAndEnsureDbIsOpen() {
        synchronized (this.mLock) {
            this.mHandler.removeCallbacks(this.mExecuteAutoCloser);
            this.mRefCount++;
            if (this.mManuallyClosed) {
                throw new IllegalStateException("Attempting to open already closed database.");
            } else if (this.mDelegateDatabase != null && this.mDelegateDatabase.isOpen()) {
                SupportSQLiteDatabase supportSQLiteDatabase = this.mDelegateDatabase;
                return supportSQLiteDatabase;
            } else if (this.mDelegateOpenHelper != null) {
                SupportSQLiteDatabase writableDatabase = this.mDelegateOpenHelper.getWritableDatabase();
                this.mDelegateDatabase = writableDatabase;
                return writableDatabase;
            } else {
                throw new IllegalStateException("AutoCloser has not been initialized. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
            }
        }
    }

    public void init(@NonNull SupportSQLiteOpenHelper supportSQLiteOpenHelper) {
        if (this.mDelegateOpenHelper == null) {
            this.mDelegateOpenHelper = supportSQLiteOpenHelper;
        }
    }

    public boolean isActive() {
        return !this.mManuallyClosed;
    }

    public void setAutoCloseCallback(Runnable runnable) {
        this.mOnAutoCloseCallback = runnable;
    }
}
