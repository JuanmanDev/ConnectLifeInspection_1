package com.hisense.connect_life.hismart.networks;

import androidx.core.app.NotificationCompat;
import com.facebook.stetho.inspector.elements.android.FragmentDescriptor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/HiLogger;", "", "()V", "Companion", "LogLevel", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: HiLogger.kt */
public final class HiLogger {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @NotNull
    public static final String LOG_TAG = "HISMART_LOG";
    @NotNull
    public static LogLevel _consoleLogLevel = LogLevel.Warning;

    @Metadata(mo47990d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/HiLogger$LogLevel;", "", "(Ljava/lang/String;I)V", "Verbose", "Debug", "Info", "Warning", "Error", "None", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: HiLogger.kt */
    public enum LogLevel {
        Verbose,
        Debug,
        Info,
        Warning,
        Error,
        None
    }

    @Metadata(mo47990d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004J\u0016\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004J\u0016\u0010\f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004J\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0006J\u000e\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0006J\u000e\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004J\u0016\u0010\u0010\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004J\u000e\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004J\u0016\u0010\u0011\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/HiLogger$Companion;", "", "()V", "LOG_TAG", "", "_consoleLogLevel", "Lcom/hisense/connect_life/hismart/networks/HiLogger$LogLevel;", "d", "", "msg", "tag", "e", "i", "initializeHiLogger", "logLevel", "setLogLevel", "v", "w", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: HiLogger.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: d */
        public final void mo39413d(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, NotificationCompat.CATEGORY_MESSAGE);
            if (HiLogger._consoleLogLevel.ordinal() <= LogLevel.Debug.ordinal()) {
                mo39414d(HiLogger.LOG_TAG, str);
            }
        }

        /* renamed from: e */
        public final void mo39415e(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, NotificationCompat.CATEGORY_MESSAGE);
            if (HiLogger._consoleLogLevel.ordinal() <= LogLevel.Error.ordinal()) {
                mo39416e(HiLogger.LOG_TAG, str);
            }
        }

        /* renamed from: i */
        public final void mo39417i(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, NotificationCompat.CATEGORY_MESSAGE);
            if (HiLogger._consoleLogLevel.ordinal() <= LogLevel.Info.ordinal()) {
                mo39418i(HiLogger.LOG_TAG, str);
            }
        }

        public final void initializeHiLogger(@NotNull LogLevel logLevel) {
            Intrinsics.checkNotNullParameter(logLevel, "logLevel");
            HiLogger._consoleLogLevel = logLevel;
        }

        public final void setLogLevel(@NotNull LogLevel logLevel) {
            Intrinsics.checkNotNullParameter(logLevel, "logLevel");
            HiLogger._consoleLogLevel = logLevel;
        }

        /* renamed from: v */
        public final void mo39421v(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, NotificationCompat.CATEGORY_MESSAGE);
            if (HiLogger._consoleLogLevel.ordinal() <= LogLevel.Verbose.ordinal()) {
                mo39422v(HiLogger.LOG_TAG, str);
            }
        }

        /* renamed from: w */
        public final void mo39423w(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, NotificationCompat.CATEGORY_MESSAGE);
            if (HiLogger._consoleLogLevel.ordinal() <= LogLevel.Warning.ordinal()) {
                mo39424w(HiLogger.LOG_TAG, str);
            }
        }

        /* renamed from: d */
        public final void mo39414d(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, FragmentDescriptor.TAG_ATTRIBUTE_NAME);
            Intrinsics.checkNotNullParameter(str2, NotificationCompat.CATEGORY_MESSAGE);
            int ordinal = HiLogger._consoleLogLevel.ordinal();
            int ordinal2 = LogLevel.Debug.ordinal();
        }

        /* renamed from: e */
        public final void mo39416e(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, FragmentDescriptor.TAG_ATTRIBUTE_NAME);
            Intrinsics.checkNotNullParameter(str2, NotificationCompat.CATEGORY_MESSAGE);
            int ordinal = HiLogger._consoleLogLevel.ordinal();
            int ordinal2 = LogLevel.Error.ordinal();
        }

        /* renamed from: i */
        public final void mo39418i(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, FragmentDescriptor.TAG_ATTRIBUTE_NAME);
            Intrinsics.checkNotNullParameter(str2, NotificationCompat.CATEGORY_MESSAGE);
            int ordinal = HiLogger._consoleLogLevel.ordinal();
            int ordinal2 = LogLevel.Info.ordinal();
        }

        /* renamed from: v */
        public final void mo39422v(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, FragmentDescriptor.TAG_ATTRIBUTE_NAME);
            Intrinsics.checkNotNullParameter(str2, NotificationCompat.CATEGORY_MESSAGE);
            int ordinal = HiLogger._consoleLogLevel.ordinal();
            int ordinal2 = LogLevel.Verbose.ordinal();
        }

        /* renamed from: w */
        public final void mo39424w(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, FragmentDescriptor.TAG_ATTRIBUTE_NAME);
            Intrinsics.checkNotNullParameter(str2, NotificationCompat.CATEGORY_MESSAGE);
            int ordinal = HiLogger._consoleLogLevel.ordinal();
            int ordinal2 = LogLevel.Warning.ordinal();
        }
    }
}
