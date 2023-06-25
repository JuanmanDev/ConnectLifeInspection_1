package androidx.room;

import androidx.annotation.NonNull;
import androidx.room.RoomDatabase;
import androidx.sqlite.p031db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p001a.p022e.C0100j0;
import p001a.p022e.C0102k0;
import p001a.p022e.C0104l0;
import p001a.p022e.C0106m0;
import p001a.p022e.C0108n0;

public final class QueryInterceptorStatement implements SupportSQLiteStatement {
    public final List<Object> mBindArgsCache = new ArrayList();
    public final SupportSQLiteStatement mDelegate;
    public final RoomDatabase.QueryCallback mQueryCallback;
    public final Executor mQueryCallbackExecutor;
    public final String mSqlStatement;

    public QueryInterceptorStatement(@NonNull SupportSQLiteStatement supportSQLiteStatement, @NonNull RoomDatabase.QueryCallback queryCallback, String str, @NonNull Executor executor) {
        this.mDelegate = supportSQLiteStatement;
        this.mQueryCallback = queryCallback;
        this.mSqlStatement = str;
        this.mQueryCallbackExecutor = executor;
    }

    private void saveArgsToCache(int i, Object obj) {
        int i2 = i - 1;
        if (i2 >= this.mBindArgsCache.size()) {
            for (int size = this.mBindArgsCache.size(); size <= i2; size++) {
                this.mBindArgsCache.add((Object) null);
            }
        }
        this.mBindArgsCache.set(i2, obj);
    }

    /* renamed from: a */
    public /* synthetic */ void mo11519a() {
        this.mQueryCallback.onQuery(this.mSqlStatement, this.mBindArgsCache);
    }

    /* renamed from: b */
    public /* synthetic */ void mo11520b() {
        this.mQueryCallback.onQuery(this.mSqlStatement, this.mBindArgsCache);
    }

    public void bindBlob(int i, byte[] bArr) {
        saveArgsToCache(i, bArr);
        this.mDelegate.bindBlob(i, bArr);
    }

    public void bindDouble(int i, double d) {
        saveArgsToCache(i, Double.valueOf(d));
        this.mDelegate.bindDouble(i, d);
    }

    public void bindLong(int i, long j) {
        saveArgsToCache(i, Long.valueOf(j));
        this.mDelegate.bindLong(i, j);
    }

    public void bindNull(int i) {
        saveArgsToCache(i, this.mBindArgsCache.toArray());
        this.mDelegate.bindNull(i);
    }

    public void bindString(int i, String str) {
        saveArgsToCache(i, str);
        this.mDelegate.bindString(i, str);
    }

    /* renamed from: c */
    public /* synthetic */ void mo11521c() {
        this.mQueryCallback.onQuery(this.mSqlStatement, this.mBindArgsCache);
    }

    public void clearBindings() {
        this.mBindArgsCache.clear();
        this.mDelegate.clearBindings();
    }

    public void close() {
        this.mDelegate.close();
    }

    /* renamed from: d */
    public /* synthetic */ void mo11523d() {
        this.mQueryCallback.onQuery(this.mSqlStatement, this.mBindArgsCache);
    }

    /* renamed from: e */
    public /* synthetic */ void mo11524e() {
        this.mQueryCallback.onQuery(this.mSqlStatement, this.mBindArgsCache);
    }

    public void execute() {
        this.mQueryCallbackExecutor.execute(new C0108n0(this));
        this.mDelegate.execute();
    }

    public long executeInsert() {
        this.mQueryCallbackExecutor.execute(new C0100j0(this));
        return this.mDelegate.executeInsert();
    }

    public int executeUpdateDelete() {
        this.mQueryCallbackExecutor.execute(new C0102k0(this));
        return this.mDelegate.executeUpdateDelete();
    }

    public long simpleQueryForLong() {
        this.mQueryCallbackExecutor.execute(new C0104l0(this));
        return this.mDelegate.simpleQueryForLong();
    }

    public String simpleQueryForString() {
        this.mQueryCallbackExecutor.execute(new C0106m0(this));
        return this.mDelegate.simpleQueryForString();
    }
}
