package net.sqlcipher;

import android.content.ContentValues;
import android.content.OperationApplicationException;
import android.database.CursorWindow;
import android.os.Parcel;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.text.Collator;
import java.util.HashMap;
import net.sqlcipher.database.SQLiteAbortException;
import net.sqlcipher.database.SQLiteConstraintException;
import net.sqlcipher.database.SQLiteDatabase;
import net.sqlcipher.database.SQLiteDatabaseCorruptException;
import net.sqlcipher.database.SQLiteDiskIOException;
import net.sqlcipher.database.SQLiteException;
import net.sqlcipher.database.SQLiteFullException;
import net.sqlcipher.database.SQLiteProgram;
import net.sqlcipher.database.SQLiteStatement;

public class DatabaseUtils {
    public static final boolean DEBUG = false;
    public static final char[] HEX_DIGITS_LOWER = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final boolean LOCAL_LOGV = false;
    public static final String TAG = "DatabaseUtils";
    public static final String[] countProjection = {"count(*)"};
    public static Collator mColl = null;

    public static class InsertHelper {
        public static final int TABLE_INFO_PRAGMA_COLUMNNAME_INDEX = 1;
        public static final int TABLE_INFO_PRAGMA_DEFAULT_INDEX = 4;
        public HashMap<String, Integer> mColumns;
        public final SQLiteDatabase mDb;
        public String mInsertSQL = null;
        public SQLiteStatement mInsertStatement = null;
        public SQLiteStatement mPreparedStatement = null;
        public SQLiteStatement mReplaceStatement = null;
        public final String mTableName;

        public InsertHelper(SQLiteDatabase sQLiteDatabase, String str) {
            this.mDb = sQLiteDatabase;
            this.mTableName = str;
        }

        /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.String[]] */
        /* JADX WARNING: type inference failed for: r3v3, types: [android.database.Cursor] */
        /* JADX WARNING: type inference failed for: r3v5 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void buildSQL() {
            /*
                r11 = this;
                java.lang.String r0 = "'"
                java.lang.String r1 = ")"
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r3 = 128(0x80, float:1.794E-43)
                r2.<init>(r3)
                java.lang.String r4 = "INSERT INTO "
                r2.append(r4)
                java.lang.String r4 = r11.mTableName
                r2.append(r4)
                java.lang.String r4 = " ("
                r2.append(r4)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>(r3)
                java.lang.String r3 = "VALUES ("
                r4.append(r3)
                r3 = 0
                net.sqlcipher.database.SQLiteDatabase r5 = r11.mDb     // Catch:{ all -> 0x00ae }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ae }
                r6.<init>()     // Catch:{ all -> 0x00ae }
                java.lang.String r7 = "PRAGMA table_info("
                r6.append(r7)     // Catch:{ all -> 0x00ae }
                java.lang.String r7 = r11.mTableName     // Catch:{ all -> 0x00ae }
                r6.append(r7)     // Catch:{ all -> 0x00ae }
                r6.append(r1)     // Catch:{ all -> 0x00ae }
                java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x00ae }
                net.sqlcipher.Cursor r3 = r5.rawQuery((java.lang.String) r6, (java.lang.String[]) r3)     // Catch:{ all -> 0x00ae }
                java.util.HashMap r5 = new java.util.HashMap     // Catch:{ all -> 0x00ae }
                int r6 = r3.getCount()     // Catch:{ all -> 0x00ae }
                r5.<init>(r6)     // Catch:{ all -> 0x00ae }
                r11.mColumns = r5     // Catch:{ all -> 0x00ae }
                r5 = 1
                r6 = r5
            L_0x004e:
                boolean r7 = r3.moveToNext()     // Catch:{ all -> 0x00ae }
                if (r7 == 0) goto L_0x009f
                java.lang.String r7 = r3.getString(r5)     // Catch:{ all -> 0x00ae }
                r8 = 4
                java.lang.String r8 = r3.getString(r8)     // Catch:{ all -> 0x00ae }
                java.util.HashMap<java.lang.String, java.lang.Integer> r9 = r11.mColumns     // Catch:{ all -> 0x00ae }
                java.lang.Integer r10 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x00ae }
                r9.put(r7, r10)     // Catch:{ all -> 0x00ae }
                r2.append(r0)     // Catch:{ all -> 0x00ae }
                r2.append(r7)     // Catch:{ all -> 0x00ae }
                r2.append(r0)     // Catch:{ all -> 0x00ae }
                if (r8 != 0) goto L_0x0077
                java.lang.String r7 = "?"
                r4.append(r7)     // Catch:{ all -> 0x00ae }
                goto L_0x0082
            L_0x0077:
                java.lang.String r7 = "COALESCE(?, "
                r4.append(r7)     // Catch:{ all -> 0x00ae }
                r4.append(r8)     // Catch:{ all -> 0x00ae }
                r4.append(r1)     // Catch:{ all -> 0x00ae }
            L_0x0082:
                int r7 = r3.getCount()     // Catch:{ all -> 0x00ae }
                java.lang.String r8 = ", "
                if (r6 != r7) goto L_0x008d
                java.lang.String r7 = ") "
                goto L_0x008e
            L_0x008d:
                r7 = r8
            L_0x008e:
                r2.append(r7)     // Catch:{ all -> 0x00ae }
                int r7 = r3.getCount()     // Catch:{ all -> 0x00ae }
                if (r6 != r7) goto L_0x0099
                java.lang.String r8 = ");"
            L_0x0099:
                r4.append(r8)     // Catch:{ all -> 0x00ae }
                int r6 = r6 + 1
                goto L_0x004e
            L_0x009f:
                if (r3 == 0) goto L_0x00a4
                r3.close()
            L_0x00a4:
                r2.append(r4)
                java.lang.String r0 = r2.toString()
                r11.mInsertSQL = r0
                return
            L_0x00ae:
                r0 = move-exception
                if (r3 == 0) goto L_0x00b4
                r3.close()
            L_0x00b4:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.DatabaseUtils.InsertHelper.buildSQL():void");
        }

        private SQLiteStatement getStatement(boolean z) {
            if (z) {
                if (this.mReplaceStatement == null) {
                    if (this.mInsertSQL == null) {
                        buildSQL();
                    }
                    this.mReplaceStatement = this.mDb.compileStatement("INSERT OR REPLACE" + this.mInsertSQL.substring(6));
                }
                return this.mReplaceStatement;
            }
            if (this.mInsertStatement == null) {
                if (this.mInsertSQL == null) {
                    buildSQL();
                }
                this.mInsertStatement = this.mDb.compileStatement(this.mInsertSQL);
            }
            return this.mInsertStatement;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            "Error inserting " + r4 + " into table  " + r3.mTableName;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0053, code lost:
            return -1;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0036 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private synchronized long insertInternal(android.content.ContentValues r4, boolean r5) {
            /*
                r3 = this;
                monitor-enter(r3)
                net.sqlcipher.database.SQLiteStatement r5 = r3.getStatement(r5)     // Catch:{ SQLException -> 0x0036 }
                r5.clearBindings()     // Catch:{ SQLException -> 0x0036 }
                java.util.Set r0 = r4.valueSet()     // Catch:{ SQLException -> 0x0036 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ SQLException -> 0x0036 }
            L_0x0010:
                boolean r1 = r0.hasNext()     // Catch:{ SQLException -> 0x0036 }
                if (r1 == 0) goto L_0x002e
                java.lang.Object r1 = r0.next()     // Catch:{ SQLException -> 0x0036 }
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ SQLException -> 0x0036 }
                java.lang.Object r2 = r1.getKey()     // Catch:{ SQLException -> 0x0036 }
                java.lang.String r2 = (java.lang.String) r2     // Catch:{ SQLException -> 0x0036 }
                int r2 = r3.getColumnIndex(r2)     // Catch:{ SQLException -> 0x0036 }
                java.lang.Object r1 = r1.getValue()     // Catch:{ SQLException -> 0x0036 }
                net.sqlcipher.DatabaseUtils.bindObjectToProgram(r5, r2, r1)     // Catch:{ SQLException -> 0x0036 }
                goto L_0x0010
            L_0x002e:
                long r4 = r5.executeInsert()     // Catch:{ SQLException -> 0x0036 }
                monitor-exit(r3)
                return r4
            L_0x0034:
                r4 = move-exception
                goto L_0x0054
            L_0x0036:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0034 }
                r5.<init>()     // Catch:{ all -> 0x0034 }
                java.lang.String r0 = "Error inserting "
                r5.append(r0)     // Catch:{ all -> 0x0034 }
                r5.append(r4)     // Catch:{ all -> 0x0034 }
                java.lang.String r4 = " into table  "
                r5.append(r4)     // Catch:{ all -> 0x0034 }
                java.lang.String r4 = r3.mTableName     // Catch:{ all -> 0x0034 }
                r5.append(r4)     // Catch:{ all -> 0x0034 }
                r5.toString()     // Catch:{ all -> 0x0034 }
                r4 = -1
                monitor-exit(r3)
                return r4
            L_0x0054:
                monitor-exit(r3)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.DatabaseUtils.InsertHelper.insertInternal(android.content.ContentValues, boolean):long");
        }

        public void bind(int i, double d) {
            this.mPreparedStatement.bindDouble(i, d);
        }

        public void bindNull(int i) {
            this.mPreparedStatement.bindNull(i);
        }

        public void close() {
            SQLiteStatement sQLiteStatement = this.mInsertStatement;
            if (sQLiteStatement != null) {
                sQLiteStatement.close();
                this.mInsertStatement = null;
            }
            SQLiteStatement sQLiteStatement2 = this.mReplaceStatement;
            if (sQLiteStatement2 != null) {
                sQLiteStatement2.close();
                this.mReplaceStatement = null;
            }
            this.mInsertSQL = null;
            this.mColumns = null;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
            r4.mPreparedStatement = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
            return -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
            r4.mPreparedStatement = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x000c, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            "Error executing InsertHelper with table " + r4.mTableName;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x000e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long execute() {
            /*
                r4 = this;
                net.sqlcipher.database.SQLiteStatement r0 = r4.mPreparedStatement
                if (r0 == 0) goto L_0x0028
                r1 = 0
                long r2 = r0.executeInsert()     // Catch:{ SQLException -> 0x000e }
                r4.mPreparedStatement = r1
                return r2
            L_0x000c:
                r0 = move-exception
                goto L_0x0025
            L_0x000e:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x000c }
                r0.<init>()     // Catch:{ all -> 0x000c }
                java.lang.String r2 = "Error executing InsertHelper with table "
                r0.append(r2)     // Catch:{ all -> 0x000c }
                java.lang.String r2 = r4.mTableName     // Catch:{ all -> 0x000c }
                r0.append(r2)     // Catch:{ all -> 0x000c }
                r0.toString()     // Catch:{ all -> 0x000c }
                r2 = -1
                r4.mPreparedStatement = r1
                return r2
            L_0x0025:
                r4.mPreparedStatement = r1
                throw r0
            L_0x0028:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "you must prepare this inserter before calling execute"
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.DatabaseUtils.InsertHelper.execute():long");
        }

        public int getColumnIndex(String str) {
            getStatement(false);
            Integer num = this.mColumns.get(str);
            if (num != null) {
                return num.intValue();
            }
            throw new IllegalArgumentException("column '" + str + "' is invalid");
        }

        public long insert(ContentValues contentValues) {
            return insertInternal(contentValues, false);
        }

        public void prepareForInsert() {
            SQLiteStatement statement = getStatement(false);
            this.mPreparedStatement = statement;
            statement.clearBindings();
        }

        public void prepareForReplace() {
            SQLiteStatement statement = getStatement(true);
            this.mPreparedStatement = statement;
            statement.clearBindings();
        }

        public long replace(ContentValues contentValues) {
            return insertInternal(contentValues, true);
        }

        public void bind(int i, float f) {
            this.mPreparedStatement.bindDouble(i, (double) f);
        }

        public void bind(int i, long j) {
            this.mPreparedStatement.bindLong(i, j);
        }

        public void bind(int i, int i2) {
            this.mPreparedStatement.bindLong(i, (long) i2);
        }

        public void bind(int i, boolean z) {
            this.mPreparedStatement.bindLong(i, z ? 1 : 0);
        }

        public void bind(int i, byte[] bArr) {
            if (bArr == null) {
                this.mPreparedStatement.bindNull(i);
            } else {
                this.mPreparedStatement.bindBlob(i, bArr);
            }
        }

        public void bind(int i, String str) {
            if (str == null) {
                this.mPreparedStatement.bindNull(i);
            } else {
                this.mPreparedStatement.bindString(i, str);
            }
        }
    }

    public static void appendEscapedSQLString(StringBuilder sb, String str) {
        sb.append('\'');
        if (str.indexOf(39) != -1) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt == '\'') {
                    sb.append('\'');
                }
                sb.append(charAt);
            }
        } else {
            sb.append(str);
        }
        sb.append('\'');
    }

    public static final void appendValueToSql(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("NULL");
        } else if (!(obj instanceof Boolean)) {
            appendEscapedSQLString(sb, obj.toString());
        } else if (((Boolean) obj).booleanValue()) {
            sb.append('1');
        } else {
            sb.append('0');
        }
    }

    public static void bindObjectToProgram(SQLiteProgram sQLiteProgram, int i, Object obj) {
        if (obj == null) {
            sQLiteProgram.bindNull(i);
        } else if ((obj instanceof Double) || (obj instanceof Float)) {
            sQLiteProgram.bindDouble(i, ((Number) obj).doubleValue());
        } else if (obj instanceof Number) {
            sQLiteProgram.bindLong(i, ((Number) obj).longValue());
        } else if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                sQLiteProgram.bindLong(i, 1);
            } else {
                sQLiteProgram.bindLong(i, 0);
            }
        } else if (obj instanceof byte[]) {
            sQLiteProgram.bindBlob(i, (byte[]) obj);
        } else {
            sQLiteProgram.bindString(i, obj.toString());
        }
    }

    public static String concatenateWhere(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        return "(" + str + ") AND (" + str2 + ")";
    }

    public static void cursorDoubleToContentValues(Cursor cursor, String str, ContentValues contentValues, String str2) {
        int columnIndex = cursor.getColumnIndex(str);
        if (!cursor.isNull(columnIndex)) {
            contentValues.put(str2, Double.valueOf(cursor.getDouble(columnIndex)));
        } else {
            contentValues.put(str2, (Double) null);
        }
    }

    public static void cursorDoubleToContentValuesIfPresent(Cursor cursor, ContentValues contentValues, String str) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow(str);
        if (!cursor.isNull(columnIndexOrThrow)) {
            contentValues.put(str, Double.valueOf(cursor.getDouble(columnIndexOrThrow)));
        }
    }

    public static void cursorDoubleToCursorValues(Cursor cursor, String str, ContentValues contentValues) {
        cursorDoubleToContentValues(cursor, str, contentValues, str);
    }

    public static void cursorFillWindow(Cursor cursor, int i, CursorWindow cursorWindow) {
        boolean z;
        if (i >= 0 && i < cursor.getCount()) {
            int position = cursor.getPosition();
            int columnCount = cursor.getColumnCount();
            cursorWindow.clear();
            cursorWindow.setStartPosition(i);
            cursorWindow.setNumColumns(columnCount);
            if (cursor.moveToPosition(i)) {
                while (cursorWindow.allocRow()) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= columnCount) {
                            break;
                        }
                        int type = cursor.getType(i2);
                        if (type == 0) {
                            z = cursorWindow.putNull(i, i2);
                        } else if (type == 1) {
                            z = cursorWindow.putLong(cursor.getLong(i2), i, i2);
                        } else if (type == 2) {
                            z = cursorWindow.putDouble(cursor.getDouble(i2), i, i2);
                        } else if (type != 4) {
                            String string = cursor.getString(i2);
                            if (string != null) {
                                z = cursorWindow.putString(string, i, i2);
                            } else {
                                z = cursorWindow.putNull(i, i2);
                            }
                        } else {
                            byte[] blob = cursor.getBlob(i2);
                            if (blob != null) {
                                z = cursorWindow.putBlob(blob, i, i2);
                            } else {
                                z = cursorWindow.putNull(i, i2);
                            }
                        }
                        if (!z) {
                            cursorWindow.freeLastRow();
                            break;
                        }
                        i2++;
                    }
                    i++;
                    if (!cursor.moveToNext()) {
                        break;
                    }
                }
            }
            cursor.moveToPosition(position);
        }
    }

    public static void cursorFloatToContentValuesIfPresent(Cursor cursor, ContentValues contentValues, String str) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow(str);
        if (!cursor.isNull(columnIndexOrThrow)) {
            contentValues.put(str, Float.valueOf(cursor.getFloat(columnIndexOrThrow)));
        }
    }

    public static void cursorIntToContentValues(Cursor cursor, String str, ContentValues contentValues) {
        cursorIntToContentValues(cursor, str, contentValues, str);
    }

    public static void cursorIntToContentValuesIfPresent(Cursor cursor, ContentValues contentValues, String str) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow(str);
        if (!cursor.isNull(columnIndexOrThrow)) {
            contentValues.put(str, Integer.valueOf(cursor.getInt(columnIndexOrThrow)));
        }
    }

    public static void cursorLongToContentValues(Cursor cursor, String str, ContentValues contentValues) {
        cursorLongToContentValues(cursor, str, contentValues, str);
    }

    public static void cursorLongToContentValuesIfPresent(Cursor cursor, ContentValues contentValues, String str) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow(str);
        if (!cursor.isNull(columnIndexOrThrow)) {
            contentValues.put(str, Long.valueOf(cursor.getLong(columnIndexOrThrow)));
        }
    }

    public static void cursorRowToContentValues(Cursor cursor, ContentValues contentValues) {
        AbstractWindowedCursor abstractWindowedCursor = cursor instanceof AbstractWindowedCursor ? (AbstractWindowedCursor) cursor : null;
        String[] columnNames = cursor.getColumnNames();
        int length = columnNames.length;
        for (int i = 0; i < length; i++) {
            if (abstractWindowedCursor == null || !abstractWindowedCursor.isBlob(i)) {
                contentValues.put(columnNames[i], cursor.getString(i));
            } else {
                contentValues.put(columnNames[i], cursor.getBlob(i));
            }
        }
    }

    public static void cursorShortToContentValuesIfPresent(Cursor cursor, ContentValues contentValues, String str) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow(str);
        if (!cursor.isNull(columnIndexOrThrow)) {
            contentValues.put(str, Short.valueOf(cursor.getShort(columnIndexOrThrow)));
        }
    }

    public static void cursorStringToContentValues(Cursor cursor, String str, ContentValues contentValues) {
        cursorStringToContentValues(cursor, str, contentValues, str);
    }

    public static void cursorStringToContentValuesIfPresent(Cursor cursor, ContentValues contentValues, String str) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow(str);
        if (!cursor.isNull(columnIndexOrThrow)) {
            contentValues.put(str, cursor.getString(columnIndexOrThrow));
        }
    }

    public static void cursorStringToInsertHelper(Cursor cursor, String str, InsertHelper insertHelper, int i) {
        insertHelper.bind(i, cursor.getString(cursor.getColumnIndexOrThrow(str)));
    }

    public static void dumpCurrentRow(Cursor cursor) {
        dumpCurrentRow(cursor, System.out);
    }

    public static String dumpCurrentRowToString(Cursor cursor) {
        StringBuilder sb = new StringBuilder();
        dumpCurrentRow(cursor, sb);
        return sb.toString();
    }

    public static void dumpCursor(Cursor cursor) {
        dumpCursor(cursor, System.out);
    }

    public static String dumpCursorToString(Cursor cursor) {
        StringBuilder sb = new StringBuilder();
        dumpCursor(cursor, sb);
        return sb.toString();
    }

    public static char[] encodeHex(byte[] bArr, char[] cArr) {
        int length = bArr.length;
        char[] cArr2 = new char[(length << 1)];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i + 1;
            cArr2[i] = cArr[(bArr[i2] & 240) >>> 4];
            i = i3 + 1;
            cArr2[i3] = cArr[bArr[i2] & 15];
        }
        return cArr2;
    }

    public static String getCollationKey(String str) {
        byte[] collationKeyInBytes = getCollationKeyInBytes(str);
        try {
            return new String(collationKeyInBytes, 0, getKeyLen(collationKeyInBytes), "ISO8859_1");
        } catch (Exception unused) {
            return "";
        }
    }

    public static byte[] getCollationKeyInBytes(String str) {
        if (mColl == null) {
            Collator instance = Collator.getInstance();
            mColl = instance;
            instance.setStrength(0);
        }
        return mColl.getCollationKey(str).toByteArray();
    }

    public static String getHexCollationKey(String str) {
        byte[] collationKeyInBytes = getCollationKeyInBytes(str);
        return new String(encodeHex(collationKeyInBytes, HEX_DIGITS_LOWER), 0, getKeyLen(collationKeyInBytes) * 2);
    }

    public static int getKeyLen(byte[] bArr) {
        if (bArr[bArr.length - 1] != 0) {
            return bArr.length;
        }
        return bArr.length - 1;
    }

    public static int getTypeOfObject(Object obj) {
        if (obj == null) {
            return 0;
        }
        if (obj instanceof byte[]) {
            return 4;
        }
        if ((obj instanceof Float) || (obj instanceof Double)) {
            return 2;
        }
        return ((obj instanceof Long) || (obj instanceof Integer)) ? 1 : 3;
    }

    public static long longForQuery(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        SQLiteStatement compileStatement = sQLiteDatabase.compileStatement(str);
        try {
            return longForQuery(compileStatement, strArr);
        } finally {
            compileStatement.close();
        }
    }

    public static long queryNumEntries(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor query = sQLiteDatabase.query(str, countProjection, (String) null, (String[]) null, (String) null, (String) null, (String) null);
        try {
            query.moveToFirst();
            return query.getLong(0);
        } finally {
            query.close();
        }
    }

    public static final void readExceptionFromParcel(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt != 0) {
            readExceptionFromParcel(parcel, parcel.readString(), readInt);
        }
    }

    public static void readExceptionWithFileNotFoundExceptionFromParcel(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt != 0) {
            String readString = parcel.readString();
            if (readInt != 1) {
                readExceptionFromParcel(parcel, readString, readInt);
                return;
            }
            throw new FileNotFoundException(readString);
        }
    }

    public static void readExceptionWithOperationApplicationExceptionFromParcel(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt != 0) {
            String readString = parcel.readString();
            if (readInt != 10) {
                readExceptionFromParcel(parcel, readString, readInt);
                return;
            }
            throw new OperationApplicationException(readString);
        }
    }

    public static String sqlEscapeString(String str) {
        StringBuilder sb = new StringBuilder();
        appendEscapedSQLString(sb, str);
        return sb.toString();
    }

    public static String stringForQuery(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        SQLiteStatement compileStatement = sQLiteDatabase.compileStatement(str);
        try {
            return stringForQuery(compileStatement, strArr);
        } finally {
            compileStatement.close();
        }
    }

    public static final void writeExceptionToParcel(Parcel parcel, Exception exc) {
        int i;
        int i2 = 1;
        if (!(exc instanceof FileNotFoundException)) {
            if (exc instanceof IllegalArgumentException) {
                i = 2;
            } else if (exc instanceof UnsupportedOperationException) {
                i = 3;
            } else if (exc instanceof SQLiteAbortException) {
                i = 4;
            } else if (exc instanceof SQLiteConstraintException) {
                i = 5;
            } else if (exc instanceof SQLiteDatabaseCorruptException) {
                i = 6;
            } else if (exc instanceof SQLiteFullException) {
                i = 7;
            } else if (exc instanceof SQLiteDiskIOException) {
                i = 8;
            } else if (exc instanceof SQLiteException) {
                i = 9;
            } else if (exc instanceof OperationApplicationException) {
                i = 10;
            } else {
                parcel.writeException(exc);
                return;
            }
            i2 = i;
        }
        parcel.writeInt(i2);
        parcel.writeString(exc.getMessage());
    }

    public static void cursorIntToContentValues(Cursor cursor, String str, ContentValues contentValues, String str2) {
        int columnIndex = cursor.getColumnIndex(str);
        if (!cursor.isNull(columnIndex)) {
            contentValues.put(str2, Integer.valueOf(cursor.getInt(columnIndex)));
        } else {
            contentValues.put(str2, (Integer) null);
        }
    }

    public static void cursorLongToContentValues(Cursor cursor, String str, ContentValues contentValues, String str2) {
        int columnIndex = cursor.getColumnIndex(str);
        if (!cursor.isNull(columnIndex)) {
            contentValues.put(str2, Long.valueOf(cursor.getLong(columnIndex)));
        } else {
            contentValues.put(str2, (Long) null);
        }
    }

    public static void cursorStringToContentValues(Cursor cursor, String str, ContentValues contentValues, String str2) {
        contentValues.put(str2, cursor.getString(cursor.getColumnIndexOrThrow(str)));
    }

    public static void dumpCurrentRow(Cursor cursor, PrintStream printStream) {
        String str;
        String[] columnNames = cursor.getColumnNames();
        printStream.println("" + cursor.getPosition() + " {");
        int length = columnNames.length;
        for (int i = 0; i < length; i++) {
            try {
                str = cursor.getString(i);
            } catch (SQLiteException unused) {
                str = "<unprintable>";
            }
            printStream.println("   " + columnNames[i] + '=' + str);
        }
        printStream.println("}");
    }

    public static void dumpCursor(Cursor cursor, PrintStream printStream) {
        printStream.println(">>>>> Dumping cursor " + cursor);
        if (cursor != null) {
            int position = cursor.getPosition();
            cursor.moveToPosition(-1);
            while (cursor.moveToNext()) {
                dumpCurrentRow(cursor, printStream);
            }
            cursor.moveToPosition(position);
        }
        printStream.println("<<<<<");
    }

    public static final void readExceptionFromParcel(Parcel parcel, String str, int i) {
        switch (i) {
            case 2:
                throw new IllegalArgumentException(str);
            case 3:
                throw new UnsupportedOperationException(str);
            case 4:
                throw new SQLiteAbortException(str);
            case 5:
                throw new SQLiteConstraintException(str);
            case 6:
                throw new SQLiteDatabaseCorruptException(str);
            case 7:
                throw new SQLiteFullException(str);
            case 8:
                throw new SQLiteDiskIOException(str);
            case 9:
                throw new SQLiteException(str);
            default:
                parcel.readException(i, str);
                return;
        }
    }

    public static long longForQuery(SQLiteStatement sQLiteStatement, String[] strArr) {
        if (strArr != null) {
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                bindObjectToProgram(sQLiteStatement, i2, strArr[i]);
                i = i2;
            }
        }
        return sQLiteStatement.simpleQueryForLong();
    }

    public static String stringForQuery(SQLiteStatement sQLiteStatement, String[] strArr) {
        if (strArr != null) {
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                bindObjectToProgram(sQLiteStatement, i2, strArr[i]);
                i = i2;
            }
        }
        return sQLiteStatement.simpleQueryForString();
    }

    public static void dumpCurrentRow(Cursor cursor, StringBuilder sb) {
        String str;
        String[] columnNames = cursor.getColumnNames();
        sb.append("" + cursor.getPosition() + " {\n");
        int length = columnNames.length;
        for (int i = 0; i < length; i++) {
            try {
                str = cursor.getString(i);
            } catch (SQLiteException unused) {
                str = "<unprintable>";
            }
            sb.append("   " + columnNames[i] + '=' + str + "\n");
        }
        sb.append("}\n");
    }

    public static void dumpCursor(Cursor cursor, StringBuilder sb) {
        sb.append(">>>>> Dumping cursor " + cursor + "\n");
        if (cursor != null) {
            int position = cursor.getPosition();
            cursor.moveToPosition(-1);
            while (cursor.moveToNext()) {
                dumpCurrentRow(cursor, sb);
            }
            cursor.moveToPosition(position);
        }
        sb.append("<<<<<\n");
    }
}
