package androidx.test.rule.provider;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.UserHandle;
import android.text.TextUtils;
import android.view.Display;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.test.internal.util.Checks;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;

public class DelegatingContext extends ContextWrapper {
    public static final int NO_OP_PID = -1;
    public static final int NO_OP_UID = -1;
    public static final String TAG = "DelegatingContext";
    public final ContentResolver contentResolver;
    public final Context context;
    public Set<String> databases = new HashSet();
    public Set<String> files = new HashSet();
    public final String prefix;
    public Set<String> revokedPermissions = new HashSet();

    public DelegatingContext(@NonNull Context context2, @NonNull String str, @NonNull ContentResolver contentResolver2) {
        super((Context) Checks.checkNotNull(context2));
        this.context = context2;
        this.prefix = (String) Checks.checkNotNull(str);
        this.contentResolver = (ContentResolver) Checks.checkNotNull(contentResolver2);
    }

    private String getPrefixName(@NonNull String str) {
        Checks.checkArgument(!TextUtils.isEmpty(str), "Name cannot be empty or null");
        String valueOf = String.valueOf(this.prefix);
        String valueOf2 = String.valueOf(str);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public boolean addDatabase(@NonNull String str) {
        Checks.checkArgument(!TextUtils.isEmpty(str), "Database name cannot be empty or null");
        return this.databases.add(str);
    }

    public void addRevokedPermission(@NonNull String str) {
        Checks.checkArgument(!TextUtils.isEmpty(str), "permission cannot be null or empty");
        this.revokedPermissions.add(str);
    }

    public boolean bindService(Intent intent, @NonNull ServiceConnection serviceConnection, int i) {
        throw new UnsupportedOperationException();
    }

    public int checkCallingOrSelfPermission(@NonNull String str) {
        return checkPermission(str, -1, -1);
    }

    public int checkCallingOrSelfUriPermission(@NonNull Uri uri, int i) {
        throw new UnsupportedOperationException();
    }

    public int checkCallingPermission(@NonNull String str) {
        return checkPermission(str, -1, -1);
    }

    public int checkCallingUriPermission(@NonNull Uri uri, int i) {
        throw new UnsupportedOperationException();
    }

    public int checkPermission(@NonNull String str, int i, int i2) {
        Checks.checkArgument(!TextUtils.isEmpty(str), "permission cannot be null or empty");
        return this.revokedPermissions.contains(str) ? -1 : 0;
    }

    public int checkSelfPermission(@NonNull String str) {
        return checkPermission(str, -1, -1);
    }

    public int checkUriPermission(@NonNull Uri uri, int i, int i2, int i3) {
        throw new UnsupportedOperationException();
    }

    public void clearWallpaper() {
        throw new UnsupportedOperationException();
    }

    public Context createConfigurationContext(@NonNull Configuration configuration) {
        throw new UnsupportedOperationException();
    }

    public Context createDisplayContext(@NonNull Display display) {
        throw new UnsupportedOperationException();
    }

    public Context createPackageContext(String str, int i) {
        throw new UnsupportedOperationException();
    }

    public String[] databaseList() {
        Set<String> set = this.databases;
        return (String[]) set.toArray(new String[set.size()]);
    }

    public boolean deleteDatabase(@NonNull String str) {
        Checks.checkArgument(!TextUtils.isEmpty(str), "Database name cannot be empty or null");
        if (!this.databases.contains(str) || !this.context.deleteDatabase(getPrefixName(str))) {
            return false;
        }
        this.databases.remove(str);
        return true;
    }

    public boolean deleteFile(@NonNull String str) {
        Checks.checkArgument(!TextUtils.isEmpty(str), "File name cannot be empty or null");
        if (!this.files.contains(str) || !this.context.deleteFile(getPrefixName(str))) {
            return false;
        }
        this.files.remove(str);
        return true;
    }

    public void enforceCallingOrSelfPermission(@NonNull String str, String str2) {
        enforcePermission(str, -1, -1, str2);
    }

    public void enforceCallingOrSelfUriPermission(Uri uri, int i, String str) {
        throw new UnsupportedOperationException();
    }

    public void enforceCallingPermission(@NonNull String str, String str2) {
        enforcePermission(str, -1, -1, str2);
    }

    public void enforceCallingUriPermission(Uri uri, int i, String str) {
        throw new UnsupportedOperationException();
    }

    public void enforcePermission(@NonNull String str, int i, int i2, String str2) {
        if (checkPermission(str, i, i2) != 0) {
            String concat = str2 != null ? String.valueOf(str2).concat(": ") : "";
            StringBuilder sb = new StringBuilder(String.valueOf(concat).length() + 14 + String.valueOf(str).length());
            sb.append(concat);
            sb.append("No permission ");
            sb.append(str);
            throw new SecurityException(sb.toString());
        }
    }

    public void enforceUriPermission(@NonNull Uri uri, int i, int i2, int i3, String str) {
        throw new UnsupportedOperationException();
    }

    public String[] fileList() {
        Set<String> set = this.files;
        return (String[]) set.toArray(new String[set.size()]);
    }

    public Context getApplicationContext() {
        return this;
    }

    public ApplicationInfo getApplicationInfo() {
        throw new UnsupportedOperationException();
    }

    public File getCacheDir() {
        throw new UnsupportedOperationException();
    }

    public ClassLoader getClassLoader() {
        throw new UnsupportedOperationException();
    }

    public File getCodeCacheDir() {
        throw new UnsupportedOperationException();
    }

    public ContentResolver getContentResolver() {
        return this.contentResolver;
    }

    public File getDatabasePath(@NonNull String str) {
        Checks.checkArgument(!TextUtils.isEmpty(str), "Database name cannot be empty or null");
        return this.context.getDatabasePath(getPrefixName(str));
    }

    public File getDir(@NonNull String str, int i) {
        Checks.checkArgument(!TextUtils.isEmpty(str), "Directory name cannot be empty or null");
        return this.context.getDir(getPrefixName(str), i);
    }

    public File getExternalCacheDir() {
        throw new UnsupportedOperationException();
    }

    public File[] getExternalCacheDirs() {
        throw new UnsupportedOperationException();
    }

    public File getExternalFilesDir(String str) {
        throw new UnsupportedOperationException();
    }

    public File[] getExternalFilesDirs(String str) {
        throw new UnsupportedOperationException();
    }

    public File[] getExternalMediaDirs() {
        throw new UnsupportedOperationException();
    }

    public File getFileStreamPath(@NonNull String str) {
        Checks.checkArgument(!TextUtils.isEmpty(str), "File name cannot be empty or null");
        return this.context.getFileStreamPath(getPrefixName(str));
    }

    public File getFilesDir() {
        throw new UnsupportedOperationException();
    }

    public Looper getMainLooper() {
        throw new UnsupportedOperationException();
    }

    public File getNoBackupFilesDir() {
        throw new UnsupportedOperationException();
    }

    public File getObbDir() {
        throw new UnsupportedOperationException();
    }

    public File[] getObbDirs() {
        throw new UnsupportedOperationException();
    }

    public String getPackageCodePath() {
        throw new UnsupportedOperationException();
    }

    public PackageManager getPackageManager() {
        throw new UnsupportedOperationException();
    }

    public String getPackageName() {
        throw new UnsupportedOperationException();
    }

    public String getPackageResourcePath() {
        throw new UnsupportedOperationException();
    }

    public SharedPreferences getSharedPreferences(String str, int i) {
        throw new UnsupportedOperationException();
    }

    public Object getSystemService(@NonNull String str) {
        Checks.checkArgument(!TextUtils.isEmpty(str), "name cannot be empty or null");
        if (Build.VERSION.SDK_INT >= 19 && "appops".equals(str)) {
            return this.context.getSystemService("appops");
        }
        throw new UnsupportedOperationException();
    }

    public String getSystemServiceName(Class<?> cls) {
        throw new UnsupportedOperationException();
    }

    public Resources.Theme getTheme() {
        throw new UnsupportedOperationException();
    }

    public Drawable getWallpaper() {
        throw new UnsupportedOperationException();
    }

    public int getWallpaperDesiredMinimumHeight() {
        throw new UnsupportedOperationException();
    }

    public int getWallpaperDesiredMinimumWidth() {
        throw new UnsupportedOperationException();
    }

    public void grantUriPermission(String str, Uri uri, int i) {
        throw new UnsupportedOperationException();
    }

    public boolean isRestricted() {
        throw new UnsupportedOperationException();
    }

    public FileInputStream openFileInput(@NonNull String str) {
        Checks.checkArgument(!TextUtils.isEmpty(str), "File name cannot be empty or null");
        if (this.files.contains(str)) {
            return this.context.openFileInput(getPrefixName(str));
        }
        throw new FileNotFoundException(String.format("File %s is not found in current context", new Object[]{str}));
    }

    public FileOutputStream openFileOutput(@NonNull String str, int i) {
        Checks.checkArgument(!TextUtils.isEmpty(str), "File name cannot be empty or null");
        FileOutputStream openFileOutput = this.context.openFileOutput(getPrefixName(str), i);
        if (openFileOutput != null) {
            this.files.add(str);
        }
        return openFileOutput;
    }

    public SQLiteDatabase openOrCreateDatabase(@NonNull String str, int i, SQLiteDatabase.CursorFactory cursorFactory) {
        Checks.checkArgument(!TextUtils.isEmpty(str), "Database name cannot be empty or null");
        if (!this.databases.contains(str)) {
            addDatabase(str);
            String prefixName = getPrefixName(str);
            if (this.context.getDatabasePath(prefixName).exists() && !this.context.deleteDatabase(prefixName)) {
                StringBuilder sb = new StringBuilder(String.valueOf(prefixName).length() + 65);
                sb.append("Database with prefixed name ");
                sb.append(prefixName);
                sb.append(" already exists but failed to delete.");
                sb.toString();
            }
        }
        return this.context.openOrCreateDatabase(getPrefixName(str), i, cursorFactory);
    }

    public Drawable peekWallpaper() {
        throw new UnsupportedOperationException();
    }

    public Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        throw new UnsupportedOperationException();
    }

    public void removeStickyBroadcast(Intent intent) {
        throw new UnsupportedOperationException();
    }

    public void removeStickyBroadcastAsUser(Intent intent, UserHandle userHandle) {
        throw new UnsupportedOperationException();
    }

    public void revokeUriPermission(Uri uri, int i) {
        throw new UnsupportedOperationException();
    }

    public void sendBroadcast(Intent intent, String str) {
        throw new UnsupportedOperationException();
    }

    public void sendBroadcastAsUser(Intent intent, UserHandle userHandle) {
        throw new UnsupportedOperationException();
    }

    public void sendOrderedBroadcast(@NonNull Intent intent, String str, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str2, Bundle bundle) {
        throw new UnsupportedOperationException();
    }

    public void sendOrderedBroadcastAsUser(Intent intent, UserHandle userHandle, String str, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str2, Bundle bundle) {
        throw new UnsupportedOperationException();
    }

    public void sendStickyBroadcast(Intent intent) {
        throw new UnsupportedOperationException();
    }

    public void sendStickyBroadcastAsUser(Intent intent, UserHandle userHandle) {
        throw new UnsupportedOperationException();
    }

    public void sendStickyOrderedBroadcast(Intent intent, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str, Bundle bundle) {
        throw new UnsupportedOperationException();
    }

    public void sendStickyOrderedBroadcastAsUser(Intent intent, UserHandle userHandle, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str, Bundle bundle) {
        throw new UnsupportedOperationException();
    }

    public void setTheme(int i) {
        throw new UnsupportedOperationException();
    }

    public void setWallpaper(Bitmap bitmap) {
        throw new UnsupportedOperationException();
    }

    public void startActivities(Intent[] intentArr) {
        throw new UnsupportedOperationException();
    }

    public void startActivity(Intent intent) {
        throw new UnsupportedOperationException();
    }

    public boolean startInstrumentation(@NonNull ComponentName componentName, String str, Bundle bundle) {
        throw new UnsupportedOperationException();
    }

    public void startIntentSender(IntentSender intentSender, Intent intent, int i, int i2, int i3) {
        throw new UnsupportedOperationException();
    }

    public ComponentName startService(Intent intent) {
        throw new UnsupportedOperationException();
    }

    public boolean stopService(Intent intent) {
        throw new UnsupportedOperationException();
    }

    public void unbindService(@NonNull ServiceConnection serviceConnection) {
        throw new UnsupportedOperationException();
    }

    public void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        throw new UnsupportedOperationException();
    }

    public int checkUriPermission(@Nullable Uri uri, @Nullable String str, @Nullable String str2, int i, int i2, int i3) {
        throw new UnsupportedOperationException();
    }

    public void enforceUriPermission(Uri uri, String str, String str2, int i, int i2, int i3, String str3) {
        throw new UnsupportedOperationException();
    }

    public Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler) {
        throw new UnsupportedOperationException();
    }

    public void sendBroadcast(Intent intent) {
        throw new UnsupportedOperationException();
    }

    public void sendBroadcastAsUser(Intent intent, UserHandle userHandle, String str) {
        throw new UnsupportedOperationException();
    }

    public void sendOrderedBroadcast(Intent intent, String str) {
        throw new UnsupportedOperationException();
    }

    public void setWallpaper(InputStream inputStream) {
        throw new UnsupportedOperationException();
    }

    public void startActivities(Intent[] intentArr, Bundle bundle) {
        throw new UnsupportedOperationException();
    }

    public void startActivity(Intent intent, Bundle bundle) {
        throw new UnsupportedOperationException();
    }

    public void startIntentSender(IntentSender intentSender, Intent intent, int i, int i2, int i3, Bundle bundle) {
        throw new UnsupportedOperationException();
    }

    public SQLiteDatabase openOrCreateDatabase(@NonNull String str, int i, SQLiteDatabase.CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
        Checks.checkArgument(!TextUtils.isEmpty(str), "Database name cannot be empty or null");
        if (Build.VERSION.SDK_INT >= 11) {
            String prefixName = getPrefixName(str);
            if (!this.databases.contains(str)) {
                addDatabase(str);
                if (this.context.getDatabasePath(prefixName).exists() && !this.context.deleteDatabase(prefixName)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(prefixName).length() + 66);
                    sb.append("Database with prefixed name ");
                    sb.append(prefixName);
                    sb.append(" already exists and cannot be deleted.");
                    sb.toString();
                }
            }
            return this.context.openOrCreateDatabase(prefixName, i, cursorFactory, databaseErrorHandler);
        }
        throw new UnsupportedOperationException("For API level < 11, use openOrCreateDatabase(String, int, CursorFactory) instead");
    }
}
