package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.sqlite.p031db.SupportSQLiteStatement;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class EntityDeletionOrUpdateAdapter<T> extends SharedSQLiteStatement {
    public EntityDeletionOrUpdateAdapter(RoomDatabase roomDatabase) {
        super(roomDatabase);
    }

    public abstract void bind(SupportSQLiteStatement supportSQLiteStatement, T t);

    public abstract String createQuery();

    public final int handle(T t) {
        SupportSQLiteStatement acquire = acquire();
        try {
            bind(acquire, t);
            return acquire.executeUpdateDelete();
        } finally {
            release(acquire);
        }
    }

    public final int handleMultiple(Iterable<? extends T> iterable) {
        SupportSQLiteStatement acquire = acquire();
        int i = 0;
        try {
            for (Object bind : iterable) {
                bind(acquire, bind);
                i += acquire.executeUpdateDelete();
            }
            return i;
        } finally {
            release(acquire);
        }
    }

    public final int handleMultiple(T[] tArr) {
        SupportSQLiteStatement acquire = acquire();
        try {
            int i = 0;
            for (T bind : tArr) {
                bind(acquire, bind);
                i += acquire.executeUpdateDelete();
            }
            return i;
        } finally {
            release(acquire);
        }
    }
}
