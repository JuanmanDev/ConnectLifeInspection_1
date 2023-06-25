package com.juconnect.connect_life.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.net.wifi.WifiNetworkSpecifier;
import android.os.PatternMatcher;
import androidx.annotation.RequiresApi;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J,\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\f0\nH\u0007J\u0006\u0010\u0019\u001a\u00020\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, mo47991d2 = {"Lcom/juconnect/connect_life/util/WifiNewUtils;", "", "()V", "connectivityManager", "Landroid/net/ConnectivityManager;", "getConnectivityManager", "()Landroid/net/ConnectivityManager;", "setConnectivityManager", "(Landroid/net/ConnectivityManager;)V", "listen", "Lkotlin/Function1;", "", "", "getListen", "()Lkotlin/jvm/functions/Function1;", "setListen", "(Lkotlin/jvm/functions/Function1;)V", "networkCallback", "Landroid/net/ConnectivityManager$NetworkCallback;", "connectwifi", "context", "Landroid/content/Context;", "SSID", "", "mListen", "unRegisterNetwork", "Companion", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WifiNewUtils.kt */
public final class WifiNewUtils {
    @NotNull
    public static final String AUTO_CONN_CANCEL = "2";
    @NotNull
    public static final String AUTO_CONN_FAIL = "0";
    @NotNull
    public static final String AUTO_CONN_LOST = "3";
    @NotNull
    public static final String AUTO_CONN_SUCC = "1";
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @NotNull
    public static final Lazy<WifiNewUtils> instance$delegate = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, WifiNewUtils$Companion$instance$2.INSTANCE);
    @Nullable
    public ConnectivityManager connectivityManager;
    @Nullable
    public Function1<? super Boolean, Unit> listen;
    @Nullable
    public ConnectivityManager.NetworkCallback networkCallback;

    @Metadata(mo47990d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8FX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, mo47991d2 = {"Lcom/juconnect/connect_life/util/WifiNewUtils$Companion;", "", "()V", "AUTO_CONN_CANCEL", "", "AUTO_CONN_FAIL", "AUTO_CONN_LOST", "AUTO_CONN_SUCC", "instance", "Lcom/juconnect/connect_life/util/WifiNewUtils;", "getInstance", "()Lcom/juconnect/connect_life/util/WifiNewUtils;", "instance$delegate", "Lkotlin/Lazy;", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: WifiNewUtils.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final WifiNewUtils getInstance() {
            return (WifiNewUtils) WifiNewUtils.instance$delegate.getValue();
        }
    }

    @RequiresApi(29)
    public final void connectwifi(@NotNull Context context, @NotNull String str, @NotNull Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "SSID");
        Intrinsics.checkNotNullParameter(function1, "mListen");
        String str2 = "ConnectLife";
        if (!str.equals(str2)) {
            str2 = "";
        }
        Object systemService = context.getApplicationContext().getSystemService("connectivity");
        if (systemService != null) {
            this.connectivityManager = (ConnectivityManager) systemService;
            WifiNetworkSpecifier build = new WifiNetworkSpecifier.Builder().setSsidPattern(new PatternMatcher(str, 1)).setWpa2Passphrase(str2).build();
            Intrinsics.checkNotNullExpressionValue(build, "Builder()\n            .s…pwd)\n            .build()");
            try {
                NetworkRequest build2 = new NetworkRequest.Builder().addTransportType(1).addCapability(14).setNetworkSpecifier(build).build();
                if (this.networkCallback != null) {
                    ConnectivityManager connectivityManager2 = this.connectivityManager;
                    Intrinsics.checkNotNull(connectivityManager2);
                    connectivityManager2.bindProcessToNetwork((Network) null);
                    ConnectivityManager connectivityManager3 = this.connectivityManager;
                    Intrinsics.checkNotNull(connectivityManager3);
                    ConnectivityManager.NetworkCallback networkCallback2 = this.networkCallback;
                    Intrinsics.checkNotNull(networkCallback2);
                    connectivityManager3.unregisterNetworkCallback(networkCallback2);
                }
                if (this.networkCallback == null) {
                    this.networkCallback = new WifiNewUtils$connectwifi$1(this, function1);
                }
                ConnectivityManager connectivityManager4 = this.connectivityManager;
                Intrinsics.checkNotNull(connectivityManager4);
                ConnectivityManager.NetworkCallback networkCallback3 = this.networkCallback;
                Intrinsics.checkNotNull(networkCallback3);
                connectivityManager4.requestNetwork(build2, networkCallback3);
            } catch (Exception e) {
                function1.invoke("0");
                e.toString();
                e.printStackTrace();
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
        }
    }

    @Nullable
    public final ConnectivityManager getConnectivityManager() {
        return this.connectivityManager;
    }

    @Nullable
    public final Function1<Boolean, Unit> getListen() {
        return this.listen;
    }

    public final void setConnectivityManager(@Nullable ConnectivityManager connectivityManager2) {
        this.connectivityManager = connectivityManager2;
    }

    public final void setListen(@Nullable Function1<? super Boolean, Unit> function1) {
        this.listen = function1;
    }

    public final void unRegisterNetwork() {
        ConnectivityManager.NetworkCallback networkCallback2 = this.networkCallback;
        if (networkCallback2 != null) {
            Intrinsics.stringPlus("unRegisterNetwork2 connectivityManager=", getConnectivityManager());
            ConnectivityManager connectivityManager2 = getConnectivityManager();
            if (connectivityManager2 != null) {
                connectivityManager2.unregisterNetworkCallback(networkCallback2);
            }
            ConnectivityManager connectivityManager3 = getConnectivityManager();
            if (connectivityManager3 != null) {
                connectivityManager3.bindProcessToNetwork((Network) null);
            }
        }
    }
}
