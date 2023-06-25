package com.juconnect.connectlife;

import android.content.Context;
import com.facebook.stetho.inspector.elements.android.FragmentDescriptor;
import com.juconnect.connectlife.service.ConnectLifeServiceImpl;
import com.juconnect.connectlife.service.IConnectLifeService;
import com.juconnect.connectlife.sql.ConnectLifeRoom;
import com.juconnect.connectlife.sql.NotificationRoom;
import com.juconnect.connectlife.sql.property.DeviceSettingRoom;
import com.juconnect.connectlife.utils.LoggerUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, mo47991d2 = {"Lcom/juconnect/connectlife/ConnectLife;", "", "()V", "Companion", "connectlife_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ConnectLife.kt */
public final class ConnectLife {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @NotNull
    public static String env = "";
    public static boolean isLogEnable;
    @NotNull
    public static final IConnectLifeService mConnectLifeService = new ConnectLifeServiceImpl();

    @Metadata(mo47990d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0011\u001a\u00020\u0010J&\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, mo47991d2 = {"Lcom/juconnect/connectlife/ConnectLife$Companion;", "", "()V", "env", "", "getEnv$connectlife_release", "()Ljava/lang/String;", "setEnv$connectlife_release", "(Ljava/lang/String;)V", "isLogEnable", "", "isLogEnable$connectlife_release", "()Z", "setLogEnable$connectlife_release", "(Z)V", "mConnectLifeService", "Lcom/juconnect/connectlife/service/IConnectLifeService;", "connectLifeService", "init", "", "context", "Landroid/content/Context;", "tag", "connectlife_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: ConnectLife.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final IConnectLifeService connectLifeService() {
            return ConnectLife.mConnectLifeService;
        }

        @NotNull
        public final String getEnv$connectlife_release() {
            return ConnectLife.env;
        }

        public final void init(@NotNull Context context, @NotNull String str, boolean z, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(str, "env");
            Intrinsics.checkNotNullParameter(str2, FragmentDescriptor.TAG_ATTRIBUTE_NAME);
            ConnectLifeRoom.Companion.init(context);
            NotificationRoom.Companion.init(context);
            DeviceSettingRoom.Companion.init(context);
            setEnv$connectlife_release(str);
            LoggerUtil.Companion.initLog(z, str2);
            setLogEnable$connectlife_release(z);
        }

        public final boolean isLogEnable$connectlife_release() {
            return ConnectLife.isLogEnable;
        }

        public final void setEnv$connectlife_release(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            ConnectLife.env = str;
        }

        public final void setLogEnable$connectlife_release(boolean z) {
            ConnectLife.isLogEnable = z;
        }
    }
}
