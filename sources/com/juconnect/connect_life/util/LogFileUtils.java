package com.juconnect.connect_life.util;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Environment;
import android.os.FileUtils;
import android.provider.MediaStore;
import android.webkit.MimeTypeMap;
import androidx.annotation.RequiresApi;
import androidx.browser.browseractions.BrowserServiceFileProvider;
import androidx.core.app.NotificationCompatJellybean;
import androidx.webkit.internal.AssetHelper;
import com.hisense.connect_life.core.utils.SPUtils;
import com.internationalwinecooler.model.WineFilterModelKt;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p639io.ByteStreamsKt;
import kotlin.random.Random;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u0000 92\u00020\u0001:\u00019B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0003J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0012H\u0002J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0015H\u0003J\u0006\u0010\u001a\u001a\u00020\u0004J\b\u0010\u001b\u001a\u00020\u0004H\u0002J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020 H\u0002J\n\u0010!\u001a\u0004\u0018\u00010 H\u0003J\b\u0010\"\u001a\u00020\u0012H\u0002J\b\u0010#\u001a\u00020\u0015H\u0002J\u0012\u0010$\u001a\u0004\u0018\u00010\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u0015J\b\u0010%\u001a\u00020&H\u0002J\n\u0010'\u001a\u0004\u0018\u00010&H\u0003J\b\u0010(\u001a\u0004\u0018\u00010)J\b\u0010*\u001a\u0004\u0018\u00010\u0012J\u000e\u0010+\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010,\u001a\u00020\u0004J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0004J\u001e\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u00122\u0006\u00102\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u0012J\u0012\u00104\u001a\u0004\u0018\u00010)2\u0006\u0010\u0019\u001a\u00020\u0015H\u0003J\u000e\u00105\u001a\u0002002\u0006\u00106\u001a\u00020\u0012J\u0018\u00105\u001a\u00020\u00042\u0006\u00106\u001a\u00020\u00122\b\b\u0001\u00107\u001a\u00020\u0004J \u00105\u001a\u00020\u00042\u0006\u00106\u001a\u00020\u00122\u0006\u00108\u001a\u00020\u00042\b\b\u0001\u00107\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\b¨\u0006:"}, mo47991d2 = {"Lcom/juconnect/connect_life/util/LogFileUtils;", "", "()V", "canWrite", "", "getCanWrite", "()Z", "setCanWrite", "(Z)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "isAddTimeMillis", "setAddTimeMillis", "createLogFile", "", "createLogFileByP", "createLogFileByQ", "Landroid/net/Uri;", "deleteFileByP", "path", "deleteFileByQ", "uri", "deleteLogFile", "fileExists", "getDate2String", "time", "", "getInputStreamByP", "Ljava/io/InputStream;", "getInputStreamByQ", "getLogFilePath", "getLogFileUri", "getRealFilePathFromUri", "getStreamByP", "Ljava/io/OutputStream;", "getStreamByQ", "getUploadFile", "Ljava/io/File;", "getUploadPath", "init", "isHaveContent", "setIsAddTime", "isAddTime", "upLog", "", "title", "type", "content", "uriToFileQ", "writeLogToFile", "string", "isAdd", "crash", "Companion", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: LogFileUtils.kt */
public final class LogFileUtils {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @NotNull
    public static final String TAG = "logFile";
    @Nullable
    @SuppressLint({"StaticFieldLeak"})
    public static LogFileUtils instance;
    public boolean canWrite = true;
    public Context context;
    public boolean isAddTimeMillis;

    @Metadata(mo47990d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, mo47991d2 = {"Lcom/juconnect/connect_life/util/LogFileUtils$Companion;", "", "()V", "TAG", "", "instance", "Lcom/juconnect/connect_life/util/LogFileUtils;", "get", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: LogFileUtils.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final synchronized LogFileUtils get() {
            LogFileUtils access$getInstance$cp;
            if (LogFileUtils.instance == null) {
                LogFileUtils.instance = new LogFileUtils();
            }
            access$getInstance$cp = LogFileUtils.instance;
            Intrinsics.checkNotNull(access$getInstance$cp);
            return access$getInstance$cp;
        }
    }

    private final String createLogFile() {
        String str;
        if (SdkVersionUtils.INSTANCE.checkedAndroid_Q()) {
            Uri createLogFileByQ = createLogFileByQ();
            str = String.valueOf(createLogFileByQ);
            Intrinsics.stringPlus("createLogFileByQ: ", str);
            Intrinsics.stringPlus("createLogFileByQ: ", createLogFileByQ);
        } else if (SdkVersionUtils.INSTANCE.checkedAndroidLowThenP()) {
            str = createLogFileByP();
            Intrinsics.stringPlus("createLogFileByP: ", str);
        } else {
            str = "";
        }
        if (str.length() > 0) {
            SPUtils.INSTANCE.put("LogFilePath", str);
        }
        return str;
    }

    private final String createLogFileByP() {
        File file = new File(Environment.getExternalStorageDirectory().getPath() + File.separator + "ConnectLife_config_pair_log.text");
        if (!file.exists()) {
            file.createNewFile();
        }
        String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "logFile.absolutePath");
        return absolutePath;
    }

    @RequiresApi(29)
    private final Uri createLogFileByQ() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", "ConnectLife_config_pair_log.text");
        contentValues.put("mime_type", AssetHelper.DEFAULT_MIME_TYPE);
        return getContext().getContentResolver().insert(MediaStore.Files.getContentUri("external"), contentValues);
    }

    private final boolean deleteFileByP(String str) {
        File file = new File(getLogFilePath());
        if (file.exists()) {
            return file.delete();
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Throwable, java.lang.SecurityException] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.annotation.RequiresApi(29)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean deleteFileByQ(android.net.Uri r4) {
        /*
            r3 = this;
            r0 = 0
            android.content.Context r1 = r3.getContext()     // Catch:{ SecurityException -> 0x0013 }
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ SecurityException -> 0x0013 }
            int r4 = r1.delete(r4, r0, r0)     // Catch:{ SecurityException -> 0x0013 }
            if (r4 <= 0) goto L_0x0011
            r4 = 1
            goto L_0x0012
        L_0x0011:
            r4 = 0
        L_0x0012:
            return r4
        L_0x0013:
            r4 = move-exception
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto L_0x0025
            boolean r1 = r4 instanceof android.app.RecoverableSecurityException
            if (r1 == 0) goto L_0x0021
            r0 = r4
            android.app.RecoverableSecurityException r0 = (android.app.RecoverableSecurityException) r0
        L_0x0021:
            if (r0 != 0) goto L_0x0024
            throw r4
        L_0x0024:
            throw r0
        L_0x0025:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.juconnect.connect_life.util.LogFileUtils.deleteFileByQ(android.net.Uri):boolean");
    }

    private final boolean fileExists() {
        if (!SdkVersionUtils.INSTANCE.checkedAndroid_Q()) {
            return new File(getLogFilePath()).exists();
        }
        try {
            if (getContext().getContentResolver().openFile(getLogFileUri(), "r", (CancellationSignal) null) != null) {
                return true;
            }
            return false;
        } catch (Exception e) {
            Intrinsics.stringPlus("Exception: ", e.getMessage());
            return false;
        }
    }

    private final String getDate2String(long j) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS", Locale.getDefault()).format(new Date(j));
    }

    private final InputStream getInputStreamByP() {
        return new FileInputStream(new File(getLogFilePath()));
    }

    @RequiresApi(29)
    private final InputStream getInputStreamByQ() {
        return getContext().getContentResolver().openInputStream(getLogFileUri());
    }

    private final String getLogFilePath() {
        return String.valueOf(SPUtils.INSTANCE.get("LogFilePath", ""));
    }

    private final Uri getLogFileUri() {
        Uri parse = Uri.parse(getLogFilePath());
        Intrinsics.checkNotNullExpressionValue(parse, "parse(getLogFilePath())");
        return parse;
    }

    private final OutputStream getStreamByP() {
        return new FileOutputStream(new File(getLogFilePath()));
    }

    @RequiresApi(29)
    private final OutputStream getStreamByQ() {
        return getContext().getContentResolver().openOutputStream(getLogFileUri());
    }

    @RequiresApi(29)
    private final File uriToFileQ(Uri uri) {
        if (Intrinsics.areEqual((Object) uri.getScheme(), (Object) "file")) {
            String path = uri.getPath();
            if (path != null) {
                return new File(path);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        } else if (!Intrinsics.areEqual((Object) uri.getScheme(), (Object) BrowserServiceFileProvider.CONTENT_SCHEME)) {
            return null;
        } else {
            ContentResolver contentResolver = getContext().getContentResolver();
            String str = System.currentTimeMillis() + Random.Default.nextInt(0, 9999) + '.' + MimeTypeMap.getSingleton().getExtensionFromMimeType(contentResolver.getType(uri));
            InputStream openInputStream = contentResolver.openInputStream(uri);
            if (openInputStream == null) {
                return null;
            }
            File file = new File(getContext().getCacheDir().getAbsolutePath() + '/' + str);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            FileUtils.copy(openInputStream, fileOutputStream);
            fileOutputStream.close();
            openInputStream.close();
            return file;
        }
    }

    public final boolean deleteLogFile() {
        boolean z;
        if (SdkVersionUtils.INSTANCE.checkedAndroid_Q()) {
            z = deleteFileByQ(getLogFileUri());
        } else {
            z = deleteFileByP(getLogFilePath());
        }
        SPUtils.INSTANCE.remove(getContext(), "LogFilePath");
        return z;
    }

    public final boolean getCanWrite() {
        return this.canWrite;
    }

    @NotNull
    public final Context getContext() {
        Context context2 = this.context;
        if (context2 != null) {
            return context2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("context");
        return null;
    }

    @Nullable
    public final String getRealFilePathFromUri(@Nullable Uri uri) {
        Cursor query;
        int columnIndex;
        String str = null;
        if (uri == null) {
            return null;
        }
        String scheme = uri.getScheme();
        if (scheme == null) {
            return uri.getPath();
        }
        if (StringsKt__StringsJVMKt.equals("file", scheme, true)) {
            return uri.getPath();
        }
        if (!StringsKt__StringsJVMKt.equals(BrowserServiceFileProvider.CONTENT_SCHEME, scheme, true) || (query = getContext().getContentResolver().query(uri, new String[]{"_data"}, (String) null, (String[]) null, (String) null)) == null) {
            return null;
        }
        if (query.moveToFirst() && (columnIndex = query.getColumnIndex("_data")) > -1) {
            str = query.getString(columnIndex);
        }
        query.close();
        return str;
    }

    @Nullable
    public final File getUploadFile() {
        if (!SdkVersionUtils.INSTANCE.checkedAndroid_Q()) {
            return new File(getLogFilePath());
        }
        String path = getLogFileUri().getPath();
        if (path == null || path.length() == 0) {
            return null;
        }
        return uriToFileQ(getLogFileUri());
    }

    @Nullable
    public final String getUploadPath() {
        if (SdkVersionUtils.INSTANCE.checkedAndroid_Q()) {
            return getRealFilePathFromUri(getLogFileUri());
        }
        return getLogFilePath();
    }

    @NotNull
    public final LogFileUtils init(@NotNull Context context2) {
        Intrinsics.checkNotNullParameter(context2, "context");
        setContext(context2);
        return Companion.get();
    }

    public final boolean isAddTimeMillis() {
        return this.isAddTimeMillis;
    }

    public final boolean isHaveContent() {
        InputStream inputStreamByQ = SdkVersionUtils.INSTANCE.checkedAndroid_Q() ? getInputStreamByQ() : getInputStreamByP();
        boolean z = false;
        if (inputStreamByQ == null) {
            return false;
        }
        if (ByteStreamsKt.readBytes(inputStreamByQ).length == 0) {
            z = true;
        }
        return !z;
    }

    public final void setAddTimeMillis(boolean z) {
        this.isAddTimeMillis = z;
    }

    /* renamed from: setCanWrite  reason: collision with other method in class */
    public final void m27246setCanWrite(boolean z) {
        this.canWrite = z;
    }

    public final void setContext(@NotNull Context context2) {
        Intrinsics.checkNotNullParameter(context2, "<set-?>");
        this.context = context2;
    }

    @NotNull
    public final LogFileUtils setIsAddTime(boolean z) {
        this.isAddTimeMillis = z;
        return Companion.get();
    }

    public final void upLog(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, NotificationCompatJellybean.KEY_TITLE);
        Intrinsics.checkNotNullParameter(str2, "type");
        Intrinsics.checkNotNullParameter(str3, BrowserServiceFileProvider.CONTENT_SCHEME);
        boolean z = this.canWrite;
        new SimpleDateFormat(WineFilterModelKt.COMMON_FORMAT, Locale.getDefault());
    }

    public final void writeLogToFile(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "string");
        writeLogToFile(str, true);
    }

    @NotNull
    public final LogFileUtils setCanWrite(boolean z) {
        this.canWrite = z;
        return Companion.get();
    }

    public final boolean writeLogToFile(@NotNull String str, boolean z, @NotNull boolean z2) {
        Intrinsics.checkNotNullParameter(str, "string");
        if (!this.canWrite && !z) {
            return false;
        }
        if (!fileExists()) {
            if (createLogFile().length() == 0) {
                return false;
            }
        }
        try {
            OutputStream streamByQ = SdkVersionUtils.INSTANCE.checkedAndroid_Q() ? getStreamByQ() : getStreamByP();
            if (streamByQ == null) {
                return false;
            }
            if (z2) {
                InputStream inputStreamByQ = SdkVersionUtils.INSTANCE.checkedAndroid_Q() ? getInputStreamByQ() : getInputStreamByP();
                if (inputStreamByQ == null) {
                    return false;
                }
                streamByQ.write(ByteStreamsKt.readBytes(inputStreamByQ));
            }
            StringBuilder sb = new StringBuilder();
            if (isAddTimeMillis()) {
                sb.append(getDate2String(System.currentTimeMillis()));
                sb.append(" : ");
            }
            sb.append(str);
            sb.append("\n");
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "stringBuilder.toString()");
            byte[] bytes = sb2.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            streamByQ.write(bytes);
            streamByQ.flush();
            streamByQ.close();
            return true;
        } catch (SecurityException e) {
            e.printStackTrace();
            return false;
        } catch (IOException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public final boolean writeLogToFile(@NotNull String str, @NotNull boolean z) {
        Intrinsics.checkNotNullParameter(str, "string");
        return writeLogToFile(str, false, true);
    }
}
