package okhttp3.internal.platform.android;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http2.Http2;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\bÇ\u0002\u0018\u0000B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\rJ1\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00038\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u001a8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, mo47991d2 = {"Lokhttp3/internal/platform/android/AndroidLog;", "", "loggerName", "", "logLevel", "message", "", "t", "", "androidLog$okhttp", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V", "androidLog", "enable", "()V", "logger", "tag", "enableLogging", "(Ljava/lang/String;Ljava/lang/String;)V", "loggerTag", "(Ljava/lang/String;)Ljava/lang/String;", "MAX_LOG_LENGTH", "I", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Ljava/util/logging/Logger;", "configuredLoggers", "Ljava/util/concurrent/CopyOnWriteArraySet;", "", "knownLoggers", "Ljava/util/Map;", "<init>", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: AndroidLog.kt */
public final class AndroidLog {
    public static final AndroidLog INSTANCE = new AndroidLog();
    public static final int MAX_LOG_LENGTH = 4000;
    public static final CopyOnWriteArraySet<Logger> configuredLoggers = new CopyOnWriteArraySet<>();
    public static final Map<String, String> knownLoggers;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package packageR = OkHttpClient.class.getPackage();
        Intrinsics.checkExpressionValueIsNotNull(packageR, "OkHttpClient::class.java.`package`");
        String name = packageR.getName();
        Intrinsics.checkExpressionValueIsNotNull(name, "OkHttpClient::class.java.`package`.name");
        linkedHashMap.put(name, "OkHttp");
        String name2 = OkHttpClient.class.getName();
        Intrinsics.checkExpressionValueIsNotNull(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = Http2.class.getName();
        Intrinsics.checkExpressionValueIsNotNull(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = TaskRunner.class.getName();
        Intrinsics.checkExpressionValueIsNotNull(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        knownLoggers = MapsKt__MapsKt.toMap(linkedHashMap);
    }

    private final void enableLogging(String str, String str2) {
        Level level;
        Logger logger = Logger.getLogger(str);
        if (configuredLoggers.add(logger)) {
            Intrinsics.checkExpressionValueIsNotNull(logger, "logger");
            logger.setUseParentHandlers(false);
            if (Log.isLoggable(str2, 3)) {
                level = Level.FINE;
            } else if (Log.isLoggable(str2, 4)) {
                level = Level.INFO;
            } else {
                level = Level.WARNING;
            }
            logger.setLevel(level);
            logger.addHandler(AndroidLogHandler.INSTANCE);
        }
    }

    private final String loggerTag(String str) {
        String str2 = knownLoggers.get(str);
        return str2 != null ? str2 : str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0051, code lost:
        r11 = r1 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void androidLog$okhttp(@org.jetbrains.annotations.NotNull java.lang.String r8, int r9, @org.jetbrains.annotations.NotNull java.lang.String r10, @org.jetbrains.annotations.Nullable java.lang.Throwable r11) {
        /*
            r7 = this;
            java.lang.String r8 = r7.loggerTag(r8)
            boolean r0 = android.util.Log.isLoggable(r8, r9)
            if (r0 == 0) goto L_0x005e
            if (r11 == 0) goto L_0x0024
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            java.lang.String r10 = "\n"
            r0.append(r10)
            java.lang.String r10 = android.util.Log.getStackTraceString(r11)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
        L_0x0024:
            r11 = 0
            int r6 = r10.length()
        L_0x0029:
            if (r11 >= r6) goto L_0x005e
            r1 = 10
            r3 = 0
            r4 = 4
            r5 = 0
            r0 = r10
            r2 = r11
            int r0 = kotlin.text.StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) r0, (char) r1, (int) r2, (boolean) r3, (int) r4, (java.lang.Object) r5)
            r1 = -1
            if (r0 == r1) goto L_0x003a
            goto L_0x003b
        L_0x003a:
            r0 = r6
        L_0x003b:
            int r1 = r11 + 4000
            int r1 = java.lang.Math.min(r0, r1)
            if (r10 == 0) goto L_0x0056
            java.lang.String r11 = r10.substring(r11, r1)
            java.lang.String r2 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r11, r2)
            android.util.Log.println(r9, r8, r11)
            if (r1 < r0) goto L_0x0054
            int r11 = r1 + 1
            goto L_0x0029
        L_0x0054:
            r11 = r1
            goto L_0x003b
        L_0x0056:
            kotlin.TypeCastException r8 = new kotlin.TypeCastException
            java.lang.String r9 = "null cannot be cast to non-null type java.lang.String"
            r8.<init>(r9)
            throw r8
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.platform.android.AndroidLog.androidLog$okhttp(java.lang.String, int, java.lang.String, java.lang.Throwable):void");
    }

    public final void enable() {
        for (Map.Entry next : knownLoggers.entrySet()) {
            enableLogging((String) next.getKey(), (String) next.getValue());
        }
    }
}
