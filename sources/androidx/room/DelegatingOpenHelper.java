package androidx.room;

import androidx.annotation.NonNull;
import androidx.sqlite.p031db.SupportSQLiteOpenHelper;

public interface DelegatingOpenHelper {
    @NonNull
    SupportSQLiteOpenHelper getDelegate();
}
