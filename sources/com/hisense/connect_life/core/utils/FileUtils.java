package com.hisense.connect_life.core.utils;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Base64;
import androidx.browser.browseractions.BrowserServiceFileProvider;
import com.hisense.connect_life.core.global.AppConfig;
import com.hisense.connect_life.core.utils.LogUtilsShen;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, mo47991d2 = {"Lcom/hisense/connect_life/core/utils/FileUtils;", "", "()V", "Companion", "core_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: FileUtils.kt */
public final class FileUtils {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    @Metadata(mo47990d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006J\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0004J\u0016\u0010\u0015\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017¨\u0006\u0018"}, mo47991d2 = {"Lcom/hisense/connect_life/core/utils/FileUtils$Companion;", "", "()V", "decoderBase64ToFile", "Ljava/io/File;", "base64", "", "getDiskCacheDir", "getDiskFilesDir", "getDiskFilesPathString", "fileName", "getRealFilePathFromUri", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "writeBytesToFile", "", "content", "", "destFile", "writeFileToSDCard", "responseBody", "Lokhttp3/ResponseBody;", "core_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: FileUtils.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String getDiskCacheDir() {
            String str;
            if (Intrinsics.areEqual((Object) "mounted", (Object) Environment.getExternalStorageState()) || !Environment.isExternalStorageRemovable()) {
                File externalCacheDir = AppConfig.Companion.getApplication().getExternalCacheDir();
                Intrinsics.checkNotNull(externalCacheDir);
                str = externalCacheDir.getPath();
                Intrinsics.checkNotNullExpressionValue(str, "{\n//                LogU…eDir!!.path\n            }");
            } else {
                str = AppConfig.Companion.getApplication().getCacheDir().getPath();
                Intrinsics.checkNotNullExpressionValue(str, "{\n//                LogU…cheDir.path\n            }");
            }
            return Intrinsics.stringPlus(str, File.separator);
        }

        private final String getDiskFilesDir() {
            String str;
            if (Intrinsics.areEqual((Object) "mounted", (Object) Environment.getExternalStorageState()) || !Environment.isExternalStorageRemovable()) {
                File externalFilesDir = AppConfig.Companion.getApplication().getExternalFilesDir("");
                Intrinsics.checkNotNull(externalFilesDir);
                str = externalFilesDir.getPath();
                Intrinsics.checkNotNullExpressionValue(str, "{\n//                LogU…(\"\")!!.path\n            }");
            } else {
                str = AppConfig.Companion.getApplication().getFilesDir().getPath();
                Intrinsics.checkNotNullExpressionValue(str, "{\n//                LogU…lesDir.path\n            }");
            }
            return Intrinsics.stringPlus(str, File.separator);
        }

        private final String getRealFilePathFromUri(Context context, Uri uri) {
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
            if (!StringsKt__StringsJVMKt.equals(BrowserServiceFileProvider.CONTENT_SCHEME, scheme, true) || (query = context.getContentResolver().query(uri, new String[]{"_data"}, (String) null, (String[]) null, (String) null)) == null) {
                return null;
            }
            if (query.moveToFirst() && (columnIndex = query.getColumnIndex("_data")) > -1) {
                str = query.getString(columnIndex);
            }
            query.close();
            return str;
        }

        /* JADX WARNING: type inference failed for: r1v0, types: [java.io.OutputStream, java.io.File] */
        @Nullable
        public final File decoderBase64ToFile(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "base64");
            ? r1 = 0;
            if (TextUtils.isEmpty(str)) {
                return r1;
            }
            byte[] decode = Base64.decode(str, 0);
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(BitmapFactory.decodeByteArray(decode, 0, decode.length), 250, 300, true);
            LogUtilsShen.Companion.mo39138e(Intrinsics.stringPlus("decoderBase64ToFile bitmap size1: ", Integer.valueOf(createScaledBitmap.getByteCount())));
            File cacheDir = AppConfig.Companion.getApplication().getCacheDir();
            Uri fromFile = Uri.fromFile(new File(cacheDir, "warranty_image" + System.currentTimeMillis() + ".jpg"));
            String str2 = "";
            if (fromFile != null) {
                try {
                    OutputStream openOutputStream = AppConfig.Companion.getApplication().getContentResolver().openOutputStream(fromFile);
                    if (openOutputStream != null) {
                        createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 100, openOutputStream);
                        LogUtilsShen.Companion.mo39138e(Intrinsics.stringPlus("decoderBase64ToFile bitmap size2: ", Integer.valueOf(createScaledBitmap.getByteCount())));
                    }
                    if (openOutputStream != null) {
                        try {
                            openOutputStream.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                } catch (IOException unused) {
                    Intrinsics.stringPlus("Cannot open file: ", fromFile);
                    if (r1 != 0) {
                        r1.close();
                    }
                } catch (Throwable th) {
                    if (r1 != 0) {
                        try {
                            r1.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                    }
                    throw th;
                }
                String realFilePathFromUri = getRealFilePathFromUri(AppConfig.Companion.getApplication(), fromFile);
                if (realFilePathFromUri != null) {
                    str2 = realFilePathFromUri;
                }
            }
            if (createScaledBitmap != null && !createScaledBitmap.isRecycled()) {
                createScaledBitmap.recycle();
            }
            return new File(str2);
        }

        @NotNull
        public final String getDiskFilesPathString(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "fileName");
            String diskFilesDir = getDiskFilesDir();
            File file = new File(diskFilesDir);
            String str2 = "";
            if (file.exists() || file.isDirectory()) {
                if (!new File(diskFilesDir + '/' + str).exists()) {
                    LogUtilsShen.Companion.mo39138e(Intrinsics.stringPlus(str, " file not exist"));
                } else {
                    str2 = Intrinsics.stringPlus(diskFilesDir, str);
                }
            }
            LogUtilsShen.Companion companion = LogUtilsShen.Companion;
            companion.mo39138e(str + " _filesPathString: " + str2);
            return str2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:34:0x0058 A[SYNTHETIC, Splitter:B:34:0x0058] */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x005d A[Catch:{ IOException -> 0x0062 }] */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x005e A[Catch:{ IOException -> 0x0062 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void writeBytesToFile(@org.jetbrains.annotations.NotNull byte[] r4, @org.jetbrains.annotations.NotNull java.io.File r5) {
            /*
                r3 = this;
                java.lang.String r0 = "content"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = "destFile"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                r0 = 0
                boolean r1 = r5.exists()     // Catch:{ IOException -> 0x0042, all -> 0x003f }
                r2 = 1
                if (r1 != 0) goto L_0x0017
                boolean r1 = r5.createNewFile()     // Catch:{ IOException -> 0x0042, all -> 0x003f }
                goto L_0x0018
            L_0x0017:
                r1 = r2
            L_0x0018:
                if (r1 == 0) goto L_0x002c
                r1 = 0
                okio.Sink r5 = okio.Okio__JvmOkioKt.sink$default(r5, r1, r2, r0)     // Catch:{ IOException -> 0x0042, all -> 0x003f }
                okio.BufferedSink r0 = okio.Okio.buffer((okio.Sink) r5)     // Catch:{ IOException -> 0x002a }
                r0.write((byte[]) r4)     // Catch:{ IOException -> 0x002a }
                r0.flush()     // Catch:{ IOException -> 0x002a }
                goto L_0x002d
            L_0x002a:
                r4 = move-exception
                goto L_0x0044
            L_0x002c:
                r5 = r0
            L_0x002d:
                if (r0 != 0) goto L_0x0030
                goto L_0x0033
            L_0x0030:
                r0.close()     // Catch:{ IOException -> 0x003a }
            L_0x0033:
                if (r5 != 0) goto L_0x0036
                goto L_0x0053
            L_0x0036:
                r5.close()     // Catch:{ IOException -> 0x003a }
                goto L_0x0053
            L_0x003a:
                r4 = move-exception
                r4.printStackTrace()
                goto L_0x0053
            L_0x003f:
                r4 = move-exception
                r5 = r0
                goto L_0x0055
            L_0x0042:
                r4 = move-exception
                r5 = r0
            L_0x0044:
                r4.printStackTrace()     // Catch:{ all -> 0x0054 }
                if (r0 != 0) goto L_0x004a
                goto L_0x004d
            L_0x004a:
                r0.close()     // Catch:{ IOException -> 0x003a }
            L_0x004d:
                if (r5 != 0) goto L_0x0050
                goto L_0x0053
            L_0x0050:
                r5.close()     // Catch:{ IOException -> 0x003a }
            L_0x0053:
                return
            L_0x0054:
                r4 = move-exception
            L_0x0055:
                if (r0 != 0) goto L_0x0058
                goto L_0x005b
            L_0x0058:
                r0.close()     // Catch:{ IOException -> 0x0062 }
            L_0x005b:
                if (r5 != 0) goto L_0x005e
                goto L_0x0066
            L_0x005e:
                r5.close()     // Catch:{ IOException -> 0x0062 }
                goto L_0x0066
            L_0x0062:
                r5 = move-exception
                r5.printStackTrace()
            L_0x0066:
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.hisense.connect_life.core.utils.FileUtils.Companion.writeBytesToFile(byte[], java.io.File):void");
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x0072 A[SYNTHETIC, Splitter:B:26:0x0072] */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0079 A[SYNTHETIC, Splitter:B:29:0x0079] */
        /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void writeFileToSDCard(@org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull okhttp3.ResponseBody r6) {
            /*
                r4 = this;
                java.lang.String r0 = "fileName"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                java.lang.String r0 = "responseBody"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                java.lang.String r0 = r4.getDiskFilesDir()
                java.io.File r1 = new java.io.File
                r1.<init>(r0)
                boolean r2 = r1.exists()
                if (r2 != 0) goto L_0x0022
                boolean r2 = r1.isDirectory()
                if (r2 != 0) goto L_0x0022
                r1.mkdirs()
            L_0x0022:
                java.io.File r1 = new java.io.File
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r0)
                r0 = 47
                r2.append(r0)
                r2.append(r5)
                java.lang.String r5 = r2.toString()
                r1.<init>(r5)
                java.io.InputStream r5 = r6.byteStream()
                r6 = 4096(0x1000, float:5.74E-42)
                byte[] r6 = new byte[r6]
                r0 = 0
                r2 = 0
                java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x006b }
                r3.<init>(r1)     // Catch:{ IOException -> 0x006b }
            L_0x004a:
                int r0 = r5.read(r6)     // Catch:{ IOException -> 0x0066, all -> 0x0063 }
                if (r0 <= 0) goto L_0x0054
                r3.write(r6, r2, r0)     // Catch:{ IOException -> 0x0066, all -> 0x0063 }
                goto L_0x004a
            L_0x0054:
                r3.flush()     // Catch:{ IOException -> 0x0066, all -> 0x0063 }
                r3.close()     // Catch:{ IOException -> 0x0066, all -> 0x0063 }
                r3.close()     // Catch:{ IOException -> 0x005e }
                goto L_0x0075
            L_0x005e:
                r5 = move-exception
                r5.printStackTrace()
                goto L_0x0075
            L_0x0063:
                r5 = move-exception
                r0 = r3
                goto L_0x0076
            L_0x0066:
                r5 = move-exception
                r0 = r3
                goto L_0x006c
            L_0x0069:
                r5 = move-exception
                goto L_0x0076
            L_0x006b:
                r5 = move-exception
            L_0x006c:
                r5.printStackTrace()     // Catch:{ all -> 0x0069 }
                if (r0 != 0) goto L_0x0072
                goto L_0x0075
            L_0x0072:
                r0.close()     // Catch:{ IOException -> 0x005e }
            L_0x0075:
                return
            L_0x0076:
                if (r0 != 0) goto L_0x0079
                goto L_0x0081
            L_0x0079:
                r0.close()     // Catch:{ IOException -> 0x007d }
                goto L_0x0081
            L_0x007d:
                r6 = move-exception
                r6.printStackTrace()
            L_0x0081:
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.hisense.connect_life.core.utils.FileUtils.Companion.writeFileToSDCard(java.lang.String, okhttp3.ResponseBody):void");
        }
    }
}
