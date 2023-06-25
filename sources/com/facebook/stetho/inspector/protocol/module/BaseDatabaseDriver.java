package com.facebook.stetho.inspector.protocol.module;

import android.content.Context;
import android.database.Cursor;
import com.facebook.stetho.inspector.protocol.module.Database;
import java.util.List;

public abstract class BaseDatabaseDriver<DESC> {
    public Context mContext;

    public interface ExecuteResultHandler<RESULT> {
        RESULT handleInsert(long j);

        RESULT handleRawQuery();

        RESULT handleSelect(Cursor cursor);

        RESULT handleUpdateDelete(int i);
    }

    public BaseDatabaseDriver(Context context) {
        this.mContext = context;
    }

    public abstract Database.ExecuteSQLResponse executeSQL(DESC desc, String str, ExecuteResultHandler<Database.ExecuteSQLResponse> executeResultHandler);

    public Context getContext() {
        return this.mContext;
    }

    public abstract List<DESC> getDatabaseNames();

    public abstract List<String> getTableNames(DESC desc);
}
