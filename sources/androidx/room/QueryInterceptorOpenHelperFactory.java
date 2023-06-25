package androidx.room;

import androidx.annotation.NonNull;
import androidx.room.RoomDatabase;
import androidx.sqlite.p031db.SupportSQLiteOpenHelper;
import java.util.concurrent.Executor;

public final class QueryInterceptorOpenHelperFactory implements SupportSQLiteOpenHelper.Factory {
    public final SupportSQLiteOpenHelper.Factory mDelegate;
    public final RoomDatabase.QueryCallback mQueryCallback;
    public final Executor mQueryCallbackExecutor;

    public QueryInterceptorOpenHelperFactory(@NonNull SupportSQLiteOpenHelper.Factory factory, @NonNull RoomDatabase.QueryCallback queryCallback, @NonNull Executor executor) {
        this.mDelegate = factory;
        this.mQueryCallback = queryCallback;
        this.mQueryCallbackExecutor = executor;
    }

    @NonNull
    public SupportSQLiteOpenHelper create(@NonNull SupportSQLiteOpenHelper.Configuration configuration) {
        return new QueryInterceptorOpenHelper(this.mDelegate.create(configuration), this.mQueryCallback, this.mQueryCallbackExecutor);
    }
}
