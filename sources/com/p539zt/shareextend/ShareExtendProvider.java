package com.p539zt.shareextend;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.browser.browseractions.BrowserServiceFileProvider;
import java.io.File;
import net.sqlcipher.database.SQLiteDatabase;
import p040c.p537g0.p538a.C8852b;

/* renamed from: com.zt.shareextend.ShareExtendProvider */
public class ShareExtendProvider extends ContentProvider {

    /* renamed from: e */
    public static final String[] f17400e = {"_display_name", "_size", "_data"};

    /* renamed from: a */
    public static Object[] m24004a(Object[] objArr, int i) {
        Object[] objArr2 = new Object[i];
        System.arraycopy(objArr, 0, objArr2, 0, i);
        return objArr2;
    }

    /* renamed from: b */
    public static String[] m24005b(String[] strArr, int i) {
        String[] strArr2 = new String[i];
        System.arraycopy(strArr, 0, strArr2, 0, i);
        return strArr2;
    }

    /* renamed from: e */
    public static Uri m24006e(String str, String str2) {
        return new Uri.Builder().scheme(BrowserServiceFileProvider.CONTENT_SCHEME).authority(str).path(Uri.encode(str2)).build();
    }

    /* renamed from: f */
    public static int m24007f(String str) {
        if ("r".equals(str)) {
            return SQLiteDatabase.CREATE_IF_NECESSARY;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException("Invalid mode: " + str);
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        } else if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
    }

    /* renamed from: d */
    public final File mo46230d(Uri uri) {
        return new File(Uri.decode(uri.getPath()).substring(1));
    }

    public int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        throw new UnsupportedOperationException("No external deletes");
    }

    @Nullable
    public String getType(@NonNull Uri uri) {
        return C8852b.m23833b(mo46230d(uri));
    }

    @Nullable
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    public boolean onCreate() {
        return false;
    }

    @Nullable
    public ParcelFileDescriptor openFile(@NonNull Uri uri, @NonNull String str) {
        return ParcelFileDescriptor.open(mo46230d(uri), m24007f(str));
    }

    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        int i;
        File d = mo46230d(uri);
        if (strArr == null) {
            strArr = f17400e;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i2 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i2] = "_display_name";
                i = i2 + 1;
                objArr[i2] = d.getName();
            } else if ("_size".equals(str3)) {
                strArr3[i2] = "_size";
                i = i2 + 1;
                objArr[i2] = Long.valueOf(d.length());
            } else if ("_data".equals(str3)) {
                strArr3[i2] = "_data";
                i = i2 + 1;
                objArr[i2] = d.getAbsolutePath();
            }
            i2 = i;
        }
        String[] b = m24005b(strArr3, i2);
        Object[] a = m24004a(objArr, i2);
        MatrixCursor matrixCursor = new MatrixCursor(b, 1);
        matrixCursor.addRow(a);
        return matrixCursor;
    }

    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}
