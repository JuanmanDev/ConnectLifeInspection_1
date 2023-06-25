package com.facebook.stetho.inspector.database;

import android.net.Uri;

public class ContentProviderSchema {
    public final String[] mProjection;
    public final String mTableName;
    public final Uri mUri;

    public static class Builder {
        public Table mTable;

        public ContentProviderSchema build() {
            return new ContentProviderSchema(this);
        }

        public Builder table(Table table) {
            this.mTable = table;
            return this;
        }
    }

    public static class Table {
        public String[] mProjection;
        public String mTableName;
        public Uri mUri;

        public static class Builder {
            public String[] mProjection;
            public String mTableName;
            public Uri mUri;

            public Table build() {
                return new Table(this);
            }

            public Builder name(String str) {
                this.mTableName = str;
                return this;
            }

            public Builder projection(String[] strArr) {
                this.mProjection = strArr;
                return this;
            }

            public Builder uri(Uri uri) {
                this.mUri = uri;
                return this;
            }
        }

        public Table(Builder builder) {
            this.mUri = builder.mUri;
            this.mProjection = builder.mProjection;
            String access$700 = builder.mTableName;
            this.mTableName = access$700;
            if (access$700 == null) {
                this.mTableName = this.mUri.getLastPathSegment();
            }
        }
    }

    public String[] getProjection() {
        return this.mProjection;
    }

    public String getTableName() {
        return this.mTableName;
    }

    public Uri getUri() {
        return this.mUri;
    }

    public ContentProviderSchema(Builder builder) {
        this.mTableName = builder.mTable.mTableName;
        this.mUri = builder.mTable.mUri;
        this.mProjection = builder.mTable.mProjection;
    }
}
