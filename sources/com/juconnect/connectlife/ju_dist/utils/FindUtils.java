package com.juconnect.connectlife.ju_dist.utils;

import android.content.Context;
import android.net.wifi.WifiManager;
import com.juconnect.connectlife.ju_dist.find.FindCallBack;
import com.juconnect.connectlife.ju_dist.find.UdpClient;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u0006J\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u0006R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, mo47991d2 = {"Lcom/juconnect/connectlife/ju_dist/utils/FindUtils;", "", "()V", "udpClient", "Lcom/juconnect/connectlife/ju_dist/find/UdpClient;", "close", "", "init", "context", "Landroid/content/Context;", "callBack", "Lcom/juconnect/connectlife/ju_dist/find/FindCallBack;", "listen", "needInit", "", "send", "Companion", "ju_dist_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: FindUtils.kt */
public final class FindUtils {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @NotNull
    public static final String TAG = "find_device";
    @Nullable
    public UdpClient udpClient;

    @Metadata(mo47990d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo47991d2 = {"Lcom/juconnect/connectlife/ju_dist/utils/FindUtils$Companion;", "", "()V", "TAG", "", "ju_dist_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: FindUtils.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void close() {
        UdpClient udpClient2 = this.udpClient;
        if (udpClient2 != null && udpClient2 != null) {
            udpClient2.close();
        }
    }

    public final void init(@NotNull Context context, @NotNull FindCallBack findCallBack) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(findCallBack, "callBack");
        if (this.udpClient == null) {
            Object systemService = context.getApplicationContext().getSystemService("wifi");
            if (systemService != null) {
                this.udpClient = new UdpClient(context, (WifiManager) systemService, findCallBack);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.net.wifi.WifiManager");
        }
        LogUtils.Companion.debug("find_device", "已经初始化过了");
    }

    public final void listen() {
        UdpClient udpClient2 = this.udpClient;
        if (udpClient2 != null) {
            udpClient2.listen();
        }
    }

    public final boolean needInit() {
        return this.udpClient == null;
    }

    public final void send() {
        UdpClient udpClient2 = this.udpClient;
        if (udpClient2 == null) {
            LogUtils.Companion.debug("find_device", "你必须先调用init初始化");
        } else if (udpClient2 != null) {
            udpClient2.send();
        }
    }
}
