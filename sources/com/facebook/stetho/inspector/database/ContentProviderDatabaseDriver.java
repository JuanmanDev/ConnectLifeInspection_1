package com.facebook.stetho.inspector.database;

import android.content.Context;
import android.database.Cursor;
import com.facebook.stetho.inspector.protocol.module.BaseDatabaseDriver;
import com.facebook.stetho.inspector.protocol.module.Database;
import com.facebook.stetho.inspector.protocol.module.DatabaseDescriptor;
import com.facebook.stetho.inspector.protocol.module.DatabaseDriver2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ContentProviderDatabaseDriver extends DatabaseDriver2<ContentProviderDatabaseDescriptor> {
    public static final String sDatabaseName = "content-providers";
    public final ContentProviderSchema[] mContentProviderSchemas;
    public List<String> mTableNames;

    public static class ContentProviderDatabaseDescriptor implements DatabaseDescriptor {
        public String name() {
            return ContentProviderDatabaseDriver.sDatabaseName;
        }
    }

    public ContentProviderDatabaseDriver(Context context, ContentProviderSchema... contentProviderSchemaArr) {
        super(context);
        this.mContentProviderSchemas = contentProviderSchemaArr;
    }

    private String fetchTableName(String str) {
        for (String next : this.mTableNames) {
            if (str.contains(next)) {
                return next;
            }
        }
        return "";
    }

    public List<ContentProviderDatabaseDescriptor> getDatabaseNames() {
        return Collections.singletonList(new ContentProviderDatabaseDescriptor());
    }

    public Database.ExecuteSQLResponse executeSQL(ContentProviderDatabaseDescriptor contentProviderDatabaseDescriptor, String str, BaseDatabaseDriver.ExecuteResultHandler<Database.ExecuteSQLResponse> executeResultHandler) {
        ContentProviderSchema contentProviderSchema = this.mContentProviderSchemas[this.mTableNames.indexOf(fetchTableName(str))];
        Cursor query = this.mContext.getContentResolver().query(contentProviderSchema.getUri(), contentProviderSchema.getProjection(), (String) null, (String[]) null, (String) null);
        try {
            return executeResultHandler.handleSelect(query);
        } finally {
            query.close();
        }
    }

    public List<String> getTableNames(ContentProviderDatabaseDescriptor contentProviderDatabaseDescriptor) {
        if (this.mTableNames == null) {
            this.mTableNames = new ArrayList();
            for (ContentProviderSchema tableName : this.mContentProviderSchemas) {
                this.mTableNames.add(tableName.getTableName());
            }
        }
        return this.mTableNames;
    }
}
