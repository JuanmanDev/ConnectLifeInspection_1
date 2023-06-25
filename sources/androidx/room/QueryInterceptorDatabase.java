package androidx.room;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.room.RoomDatabase;
import androidx.sqlite.p031db.SupportSQLiteDatabase;
import androidx.sqlite.p031db.SupportSQLiteQuery;
import androidx.sqlite.p031db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import p001a.p022e.C0082a0;
import p001a.p022e.C0084b0;
import p001a.p022e.C0086c0;
import p001a.p022e.C0088d0;
import p001a.p022e.C0090e0;
import p001a.p022e.C0092f0;
import p001a.p022e.C0094g0;
import p001a.p022e.C0096h0;
import p001a.p022e.C0098i0;
import p001a.p022e.C0127x;
import p001a.p022e.C0129y;
import p001a.p022e.C0130z;

public final class QueryInterceptorDatabase implements SupportSQLiteDatabase {
    public final SupportSQLiteDatabase mDelegate;
    public final RoomDatabase.QueryCallback mQueryCallback;
    public final Executor mQueryCallbackExecutor;

    public QueryInterceptorDatabase(@NonNull SupportSQLiteDatabase supportSQLiteDatabase, @NonNull RoomDatabase.QueryCallback queryCallback, @NonNull Executor executor) {
        this.mDelegate = supportSQLiteDatabase;
        this.mQueryCallback = queryCallback;
        this.mQueryCallbackExecutor = executor;
    }

    /* renamed from: a */
    public /* synthetic */ void mo11504a() {
        this.mQueryCallback.onQuery("BEGIN EXCLUSIVE TRANSACTION", Collections.emptyList());
    }

    /* renamed from: b */
    public /* synthetic */ void mo11505b() {
        this.mQueryCallback.onQuery("BEGIN DEFERRED TRANSACTION", Collections.emptyList());
    }

    public void beginTransaction() {
        this.mQueryCallbackExecutor.execute(new C0090e0(this));
        this.mDelegate.beginTransaction();
    }

    public void beginTransactionNonExclusive() {
        this.mQueryCallbackExecutor.execute(new C0088d0(this));
        this.mDelegate.beginTransactionNonExclusive();
    }

    public void beginTransactionWithListener(@NonNull SQLiteTransactionListener sQLiteTransactionListener) {
        this.mQueryCallbackExecutor.execute(new C0098i0(this));
        this.mDelegate.beginTransactionWithListener(sQLiteTransactionListener);
    }

    public void beginTransactionWithListenerNonExclusive(@NonNull SQLiteTransactionListener sQLiteTransactionListener) {
        this.mQueryCallbackExecutor.execute(new C0096h0(this));
        this.mDelegate.beginTransactionWithListenerNonExclusive(sQLiteTransactionListener);
    }

    /* renamed from: c */
    public /* synthetic */ void mo11506c() {
        this.mQueryCallback.onQuery("BEGIN EXCLUSIVE TRANSACTION", Collections.emptyList());
    }

    public void close() {
        this.mDelegate.close();
    }

    @NonNull
    public SupportSQLiteStatement compileStatement(@NonNull String str) {
        return new QueryInterceptorStatement(this.mDelegate.compileStatement(str), this.mQueryCallback, str, this.mQueryCallbackExecutor);
    }

    /* renamed from: d */
    public /* synthetic */ void mo11508d() {
        this.mQueryCallback.onQuery("BEGIN DEFERRED TRANSACTION", Collections.emptyList());
    }

    public int delete(@NonNull String str, @NonNull String str2, @NonNull Object[] objArr) {
        return this.mDelegate.delete(str, str2, objArr);
    }

    @RequiresApi(api = 16)
    public void disableWriteAheadLogging() {
        this.mDelegate.disableWriteAheadLogging();
    }

    /* renamed from: e */
    public /* synthetic */ void mo11509e() {
        this.mQueryCallback.onQuery("END TRANSACTION", Collections.emptyList());
    }

    public boolean enableWriteAheadLogging() {
        return this.mDelegate.enableWriteAheadLogging();
    }

    public void endTransaction() {
        this.mQueryCallbackExecutor.execute(new C0086c0(this));
        this.mDelegate.endTransaction();
    }

    public void execSQL(@NonNull String str) {
        this.mQueryCallbackExecutor.execute(new C0130z(this, str));
        this.mDelegate.execSQL(str);
    }

    /* renamed from: f */
    public /* synthetic */ void mo11510f(String str) {
        this.mQueryCallback.onQuery(str, new ArrayList(0));
    }

    /* renamed from: g */
    public /* synthetic */ void mo11511g(String str, List list) {
        this.mQueryCallback.onQuery(str, list);
    }

    @NonNull
    public List<Pair<String, String>> getAttachedDbs() {
        return this.mDelegate.getAttachedDbs();
    }

    public long getMaximumSize() {
        return this.mDelegate.getMaximumSize();
    }

    public long getPageSize() {
        return this.mDelegate.getPageSize();
    }

    @NonNull
    public String getPath() {
        return this.mDelegate.getPath();
    }

    public int getVersion() {
        return this.mDelegate.getVersion();
    }

    /* renamed from: h */
    public /* synthetic */ void mo11512h(String str) {
        this.mQueryCallback.onQuery(str, Collections.emptyList());
    }

    /* renamed from: i */
    public /* synthetic */ void mo11513i(String str, List list) {
        this.mQueryCallback.onQuery(str, list);
    }

    public boolean inTransaction() {
        return this.mDelegate.inTransaction();
    }

    public long insert(@NonNull String str, int i, @NonNull ContentValues contentValues) {
        return this.mDelegate.insert(str, i, contentValues);
    }

    public boolean isDatabaseIntegrityOk() {
        return this.mDelegate.isDatabaseIntegrityOk();
    }

    public boolean isDbLockedByCurrentThread() {
        return this.mDelegate.isDbLockedByCurrentThread();
    }

    public boolean isOpen() {
        return this.mDelegate.isOpen();
    }

    public boolean isReadOnly() {
        return this.mDelegate.isReadOnly();
    }

    @RequiresApi(api = 16)
    public boolean isWriteAheadLoggingEnabled() {
        return this.mDelegate.isWriteAheadLoggingEnabled();
    }

    /* renamed from: j */
    public /* synthetic */ void mo11514j(SupportSQLiteQuery supportSQLiteQuery, QueryInterceptorProgram queryInterceptorProgram) {
        this.mQueryCallback.onQuery(supportSQLiteQuery.getSql(), queryInterceptorProgram.getBindArgs());
    }

    /* renamed from: m */
    public /* synthetic */ void mo11515m(SupportSQLiteQuery supportSQLiteQuery, QueryInterceptorProgram queryInterceptorProgram) {
        this.mQueryCallback.onQuery(supportSQLiteQuery.getSql(), queryInterceptorProgram.getBindArgs());
    }

    /* renamed from: n */
    public /* synthetic */ void mo11516n() {
        this.mQueryCallback.onQuery("TRANSACTION SUCCESSFUL", Collections.emptyList());
    }

    public boolean needUpgrade(int i) {
        return this.mDelegate.needUpgrade(i);
    }

    @NonNull
    public Cursor query(@NonNull String str) {
        this.mQueryCallbackExecutor.execute(new C0129y(this, str));
        return this.mDelegate.query(str);
    }

    @RequiresApi(api = 16)
    public void setForeignKeyConstraintsEnabled(boolean z) {
        this.mDelegate.setForeignKeyConstraintsEnabled(z);
    }

    public void setLocale(@NonNull Locale locale) {
        this.mDelegate.setLocale(locale);
    }

    public void setMaxSqlCacheSize(int i) {
        this.mDelegate.setMaxSqlCacheSize(i);
    }

    public long setMaximumSize(long j) {
        return this.mDelegate.setMaximumSize(j);
    }

    public void setPageSize(long j) {
        this.mDelegate.setPageSize(j);
    }

    public void setTransactionSuccessful() {
        this.mQueryCallbackExecutor.execute(new C0092f0(this));
        this.mDelegate.setTransactionSuccessful();
    }

    public void setVersion(int i) {
        this.mDelegate.setVersion(i);
    }

    public int update(@NonNull String str, int i, @NonNull ContentValues contentValues, @NonNull String str2, @NonNull Object[] objArr) {
        return this.mDelegate.update(str, i, contentValues, str2, objArr);
    }

    public boolean yieldIfContendedSafely() {
        return this.mDelegate.yieldIfContendedSafely();
    }

    public boolean yieldIfContendedSafely(long j) {
        return this.mDelegate.yieldIfContendedSafely(j);
    }

    public void execSQL(@NonNull String str, @NonNull Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(objArr));
        this.mQueryCallbackExecutor.execute(new C0084b0(this, str, arrayList));
        this.mDelegate.execSQL(str, arrayList.toArray());
    }

    @NonNull
    public Cursor query(@NonNull String str, @NonNull Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(objArr));
        this.mQueryCallbackExecutor.execute(new C0094g0(this, str, arrayList));
        return this.mDelegate.query(str, objArr);
    }

    @NonNull
    public Cursor query(@NonNull SupportSQLiteQuery supportSQLiteQuery) {
        QueryInterceptorProgram queryInterceptorProgram = new QueryInterceptorProgram();
        supportSQLiteQuery.bindTo(queryInterceptorProgram);
        this.mQueryCallbackExecutor.execute(new C0082a0(this, supportSQLiteQuery, queryInterceptorProgram));
        return this.mDelegate.query(supportSQLiteQuery);
    }

    @NonNull
    public Cursor query(@NonNull SupportSQLiteQuery supportSQLiteQuery, @NonNull CancellationSignal cancellationSignal) {
        QueryInterceptorProgram queryInterceptorProgram = new QueryInterceptorProgram();
        supportSQLiteQuery.bindTo(queryInterceptorProgram);
        this.mQueryCallbackExecutor.execute(new C0127x(this, supportSQLiteQuery, queryInterceptorProgram));
        return this.mDelegate.query(supportSQLiteQuery);
    }
}
