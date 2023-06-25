package com.juconnect.connectlife.ju_dist.utils;

import android.content.Context;
import com.internationalwinecooler.model.WineFilterModelKt;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, mo47991d2 = {"Lcom/juconnect/connectlife/ju_dist/utils/LogUtils;", "", "()V", "Companion", "ju_dist_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: LogUtils.kt */
public final class LogUtils {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    @Metadata(mo47990d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u001a\u0010\b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0006\u0010\t\u001a\u00020\u0006J\"\u0010\n\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, mo47991d2 = {"Lcom/juconnect/connectlife/ju_dist/utils/LogUtils$Companion;", "", "()V", "debug", "", "TAG", "", "msg", "error", "formatTime", "saveLog", "context", "Landroid/content/Context;", "ju_dist_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: LogUtils.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void debug(@Nullable String str, @Nullable String str2) {
            String.valueOf(str2);
        }

        public final void error(@Nullable String str, @Nullable String str2) {
            String.valueOf(str2);
        }

        @NotNull
        public final String formatTime() {
            String format = new SimpleDateFormat("yyy-MM-dd HH:mm:ss").format(new Date());
            Intrinsics.checkNotNullExpressionValue(format, "sdf.format(date)");
            return format;
        }

        public final void saveLog(@Nullable String str, @Nullable String str2, @NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            String format = new SimpleDateFormat(WineFilterModelKt.COMMON_FORMAT).format(new Date());
            File file = new File(context.getExternalCacheDir(), "配网信息.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.append(format + "    " + str + "    " + str2 + "    \n");
            fileWriter.flush();
            fileWriter.close();
        }
    }
}
