package com.hisense.connect_life.app_account.util;

import android.graphics.Bitmap;
import android.os.Build;
import android.support.p025v4.media.session.PlaybackStateCompat;
import androidx.test.internal.runner.RunnerArgs;
import com.amazon.identity.auth.map.device.token.MAPCookie;
import java.io.File;
import java.io.FileInputStream;
import java.text.DecimalFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/util/FileSizeUtil;", "", "()V", "Companion", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: FileSizeUtil.kt */
public final class FileSizeUtil {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int SIZETYPE_B = 1;
    public static final int SIZETYPE_GB = 4;
    public static final int SIZETYPE_KB = 2;
    public static final int SIZETYPE_MB = 3;

    @Metadata(mo47990d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0016\u0010\r\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0004J\u000e\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000eJ\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0017J\u0016\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0004J\u000e\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001bJ\u0010\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001bH\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006¨\u0006\u001e"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/util/FileSizeUtil$Companion;", "", "()V", "SIZETYPE_B", "", "getSIZETYPE_B", "()I", "SIZETYPE_GB", "getSIZETYPE_GB", "SIZETYPE_KB", "getSIZETYPE_KB", "SIZETYPE_MB", "getSIZETYPE_MB", "FormetFileSize", "", "fileS", "", "", "sizeType", "getAutoFileOrFilesSize", "filePath", "getBitmapSize", "bitmap", "Landroid/graphics/Bitmap;", "getFileOrFilesSize", "getFileSize", "file", "Ljava/io/File;", "getFileSizes", "f", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: FileSizeUtil.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String FormetFileSize(long j) {
            DecimalFormat decimalFormat = new DecimalFormat("#.00");
            if (j == 0) {
                return "0B";
            }
            if (j < 1024) {
                return Intrinsics.stringPlus(decimalFormat.format((double) j), "B");
            }
            if (j < PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
                return Intrinsics.stringPlus(decimalFormat.format(((double) j) / ((double) 1024)), "KB");
            }
            if (j < 1073741824) {
                return Intrinsics.stringPlus(decimalFormat.format(((double) j) / ((double) 1048576)), "MB");
            }
            return Intrinsics.stringPlus(decimalFormat.format(((double) j) / ((double) 1073741824)), "GB");
        }

        private final long getFileSizes(File file) {
            long j;
            File[] listFiles = file.listFiles();
            Intrinsics.checkNotNull(listFiles);
            int length = listFiles.length;
            long j2 = 0;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                if (listFiles[i].isDirectory()) {
                    File file2 = listFiles[i];
                    Intrinsics.checkNotNullExpressionValue(file2, "flist[i]");
                    j = getFileSizes(file2);
                } else {
                    File file3 = listFiles[i];
                    Intrinsics.checkNotNullExpressionValue(file3, "flist[i]");
                    j = getFileSize(file3);
                }
                j2 += j;
                i = i2;
            }
            return j2;
        }

        @NotNull
        public final String getAutoFileOrFilesSize(@NotNull String str) {
            long j;
            Intrinsics.checkNotNullParameter(str, "filePath");
            File file = new File(str);
            try {
                if (file.isDirectory()) {
                    j = getFileSizes(file);
                } else {
                    j = getFileSize(file);
                }
            } catch (Exception e) {
                e.printStackTrace();
                j = 0;
            }
            return FormetFileSize(j);
        }

        public final int getBitmapSize(@NotNull Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            int i = Build.VERSION.SDK_INT;
            if (i >= 19) {
                return bitmap.getAllocationByteCount();
            }
            if (i >= 12) {
                return bitmap.getByteCount();
            }
            return bitmap.getRowBytes() * bitmap.getHeight();
        }

        public final double getFileOrFilesSize(@NotNull String str, int i) {
            long j;
            Intrinsics.checkNotNullParameter(str, "filePath");
            File file = new File(str);
            try {
                if (file.isDirectory()) {
                    j = getFileSizes(file);
                } else {
                    j = getFileSize(file);
                }
            } catch (Exception e) {
                e.printStackTrace();
                j = 0;
            }
            return FormetFileSize(j, i);
        }

        public final long getFileSize(@NotNull File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            if (file.exists()) {
                return (long) new FileInputStream(file).available();
            }
            file.createNewFile();
            return 0;
        }

        public final int getSIZETYPE_B() {
            return FileSizeUtil.SIZETYPE_B;
        }

        public final int getSIZETYPE_GB() {
            return FileSizeUtil.SIZETYPE_GB;
        }

        public final int getSIZETYPE_KB() {
            return FileSizeUtil.SIZETYPE_KB;
        }

        public final int getSIZETYPE_MB() {
            return FileSizeUtil.SIZETYPE_MB;
        }

        public final double FormetFileSize(long j, int i) {
            DecimalFormat decimalFormat = new DecimalFormat("#.00");
            try {
                if (i == getSIZETYPE_B()) {
                    Double valueOf = Double.valueOf(decimalFormat.format((double) j));
                    Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(df.format(fileS.toDouble()))");
                    return valueOf.doubleValue();
                } else if (i == getSIZETYPE_KB()) {
                    String format = decimalFormat.format(((double) j) / ((double) 1024));
                    Intrinsics.checkNotNullExpressionValue(format, "df.format(fileS.toDouble() / 1024)");
                    Double valueOf2 = Double.valueOf(StringsKt__StringsJVMKt.replace$default(format, RunnerArgs.CLASS_SEPARATOR, MAPCookie.DOT, false, 4, (Object) null));
                    Intrinsics.checkNotNullExpressionValue(valueOf2, "valueOf(\n               …                        )");
                    return valueOf2.doubleValue();
                } else if (i == getSIZETYPE_MB()) {
                    String format2 = decimalFormat.format(((double) j) / ((double) 1048576));
                    Intrinsics.checkNotNullExpressionValue(format2, "df.format(fileS.toDouble() / 1048576)");
                    Double valueOf3 = Double.valueOf(StringsKt__StringsJVMKt.replace$default(format2, RunnerArgs.CLASS_SEPARATOR, MAPCookie.DOT, false, 4, (Object) null));
                    Intrinsics.checkNotNullExpressionValue(valueOf3, "valueOf(\n               …                        )");
                    return valueOf3.doubleValue();
                } else if (i != getSIZETYPE_GB()) {
                    return 0.0d;
                } else {
                    String format3 = decimalFormat.format(((double) j) / ((double) 1073741824));
                    Intrinsics.checkNotNullExpressionValue(format3, "df.format(fileS.toDouble() / 1073741824)");
                    Double valueOf4 = Double.valueOf(StringsKt__StringsJVMKt.replace$default(format3, RunnerArgs.CLASS_SEPARATOR, MAPCookie.DOT, false, 4, (Object) null));
                    Intrinsics.checkNotNullExpressionValue(valueOf4, "valueOf(\n               …                        )");
                    return valueOf4.doubleValue();
                }
            } catch (Exception e) {
                e.printStackTrace();
                return 0.0d;
            }
        }
    }
}
