package com.juconnect.connectlife.ju_picture.util;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.browseractions.BrowserServiceFileProvider;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, mo47991d2 = {"Lcom/juconnect/connectlife/ju_picture/util/FileUtil;", "", "()V", "Companion", "ju_picture_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: FileUtil.kt */
public final class FileUtil {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    @Metadata(mo47990d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\b¨\u0006\u000e"}, mo47991d2 = {"Lcom/juconnect/connectlife/ju_picture/util/FileUtil$Companion;", "", "()V", "checkDirPath", "", "dirPath", "getRealFilePathFromUri", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "parseUri", "data", "Landroid/content/Intent;", "ju_picture_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: FileUtil.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String checkDirPath(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "dirPath");
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            return str;
        }

        @Nullable
        public final String getRealFilePathFromUri(@NotNull Context context, @Nullable Uri uri) {
            Cursor query;
            int columnIndex;
            Intrinsics.checkNotNullParameter(context, "context");
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

        @Nullable
        public final String parseUri(@NotNull Intent intent, @NotNull Context context) {
            Intrinsics.checkNotNullParameter(intent, "data");
            Intrinsics.checkNotNullParameter(context, "context");
            Uri data = intent.getData();
            ContentResolver contentResolver = context.getContentResolver();
            Intrinsics.checkNotNull(data);
            contentResolver.query(data, new String[]{"_data"}, (String) null, (String[]) null, (String) null);
            return data.getPath();
        }
    }
}
