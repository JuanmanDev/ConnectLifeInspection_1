package com.internationalwinecooler.app;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import androidx.appcompat.widget.TooltipCompatHandler;
import com.internationalwinecooler.model.WineFilterModelKt;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.lang.reflect.Field;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p077d.p078a.p080j.C1564e;

@Metadata(mo47990d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\u000e\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\tJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0012H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007XD¢\u0006\u0002\n\u0000¨\u0006\u001b"}, mo47991d2 = {"Lcom/internationalwinecooler/app/CrashHandlerKt;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "()V", "formatter", "Ljava/text/DateFormat;", "infos", "", "", "mContext", "Landroid/content/Context;", "mDefaultHandler", "tag", "collectDeviceInfo", "", "ctx", "handleException", "", "ex", "", "init", "context", "saveCrashInfo2File", "uncaughtException", "t", "Ljava/lang/Thread;", "e", "Companion", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: CrashHandlerKt.kt */
public final class CrashHandlerKt implements Thread.UncaughtExceptionHandler {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @Nullable
    public static CrashHandlerKt INSTANCE;
    @NotNull
    public final DateFormat formatter = new SimpleDateFormat(WineFilterModelKt.COMMON_FORMAT);
    @NotNull
    public final Map<String, String> infos = new LinkedHashMap();
    @Nullable
    public Context mContext;
    @Nullable
    public Thread.UncaughtExceptionHandler mDefaultHandler;
    @NotNull
    public final String tag = "CrashHandler";

    @Metadata(mo47990d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, mo47991d2 = {"Lcom/internationalwinecooler/app/CrashHandlerKt$Companion;", "", "()V", "INSTANCE", "Lcom/internationalwinecooler/app/CrashHandlerKt;", "getInstance", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: CrashHandlerKt.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CrashHandlerKt getInstance() {
            if (CrashHandlerKt.INSTANCE == null) {
                synchronized (CrashHandlerKt.class) {
                    Companion companion = CrashHandlerKt.Companion;
                    CrashHandlerKt.INSTANCE = new CrashHandlerKt();
                    Unit unit = Unit.INSTANCE;
                }
            }
            CrashHandlerKt access$getINSTANCE$cp = CrashHandlerKt.INSTANCE;
            Intrinsics.checkNotNull(access$getINSTANCE$cp);
            return access$getINSTANCE$cp;
        }
    }

    private final void collectDeviceInfo(Context context) {
        PackageManager packageManager;
        PackageInfo packageInfo;
        if (context == null) {
            packageManager = null;
        } else {
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (packageManager == null) {
            packageInfo = null;
        } else {
            packageInfo = packageManager.getPackageInfo(context.getPackageName(), 1);
        }
        if (packageInfo != null) {
            String str = packageInfo.versionName == null ? "null" : packageInfo.versionName;
            Map<String, String> map = this.infos;
            Intrinsics.checkNotNullExpressionValue(str, "versionName");
            map.put("versionName", str);
            this.infos.put("versionCode", packageInfo.versionCode + "");
        }
        Field[] declaredFields = Build.class.getDeclaredFields();
        Intrinsics.checkNotNullExpressionValue(declaredFields, "fields");
        int i = 0;
        int length = declaredFields.length;
        while (i < length) {
            Field field = declaredFields[i];
            i++;
            try {
                field.setAccessible(true);
                Map<String, String> map2 = this.infos;
                String name = field.getName();
                Intrinsics.checkNotNullExpressionValue(name, "field.name");
                map2.put(name, field.get((Object) null).toString());
                field.getName() + " : " + field.get((Object) null);
            } catch (Exception unused2) {
            }
        }
    }

    private final boolean handleException(Throwable th) {
        if (th == null) {
            return false;
        }
        new CrashHandlerKt$handleException$1().start();
        collectDeviceInfo(this.mContext);
        saveCrashInfo2File(th);
        return true;
    }

    private final String saveCrashInfo2File(Throwable th) {
        StringBuffer stringBuffer = new StringBuffer();
        for (Map.Entry next : this.infos.entrySet()) {
            stringBuffer.append(((String) next.getKey()) + '=' + ((String) next.getValue()) + 10);
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        for (Throwable cause = th.getCause(); cause != null; cause = cause.getCause()) {
            cause.printStackTrace(printWriter);
        }
        printWriter.close();
        stringBuffer.append(stringWriter.toString());
        try {
            String str = "crash-" + this.formatter.format(new Date()) + ".txt";
            if (Intrinsics.areEqual((Object) Environment.getExternalStorageState(), (Object) "mounted")) {
                File file = new File("/sdcard/wineCooler_crash/");
                if (!file.exists()) {
                    file.mkdirs();
                }
                FileOutputStream fileOutputStream = new FileOutputStream(Intrinsics.stringPlus("/sdcard/wineCooler_crash/", str));
                String stringBuffer2 = stringBuffer.toString();
                Intrinsics.checkNotNullExpressionValue(stringBuffer2, "sb.toString()");
                byte[] bytes = stringBuffer2.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                fileOutputStream.write(bytes);
                fileOutputStream.close();
            }
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final void init(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.mContext = context;
        this.mDefaultHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    public void uncaughtException(@NotNull Thread thread, @NotNull Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        Intrinsics.checkNotNullParameter(thread, "t");
        Intrinsics.checkNotNullParameter(th, C1564e.f893u);
        if (handleException(th) || (uncaughtExceptionHandler = this.mDefaultHandler) == null) {
            try {
                Thread.sleep(TooltipCompatHandler.HOVER_HIDE_TIMEOUT_SHORT_MS);
            } catch (InterruptedException unused) {
            }
            Process.killProcess(Process.myPid());
            System.exit(1);
            throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
        }
        Intrinsics.checkNotNull(uncaughtExceptionHandler);
        uncaughtExceptionHandler.uncaughtException(thread, th);
    }
}
