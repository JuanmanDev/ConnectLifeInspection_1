package com.juconnect.connect_life.util;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, mo47991d2 = {"com/juconnect/connect_life/util/WifiNewUtils$connectwifi$1", "Landroid/net/ConnectivityManager$NetworkCallback;", "onAvailable", "", "network", "Landroid/net/Network;", "onCapabilitiesChanged", "networkCapabilities", "Landroid/net/NetworkCapabilities;", "onLost", "onUnavailable", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WifiNewUtils.kt */
public final class WifiNewUtils$connectwifi$1 extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ Function1<String, Unit> $mListen;
    public final /* synthetic */ WifiNewUtils this$0;

    public WifiNewUtils$connectwifi$1(WifiNewUtils wifiNewUtils, Function1<? super String, Unit> function1) {
        this.this$0 = wifiNewUtils;
        this.$mListen = function1;
    }

    public void onAvailable(@NotNull Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        super.onAvailable(network);
        ConnectivityManager connectivityManager = this.this$0.getConnectivityManager();
        Intrinsics.checkNotNull(connectivityManager);
        connectivityManager.bindProcessToNetwork(network);
        this.$mListen.invoke("1");
        ConnectivityManager connectivityManager2 = this.this$0.getConnectivityManager();
        Intrinsics.checkNotNull(connectivityManager2);
        Intrinsics.stringPlus("onAvailable isSame=", Boolean.valueOf(Intrinsics.areEqual((Object) network, (Object) connectivityManager2.getActiveNetwork())));
    }

    public void onCapabilitiesChanged(@NotNull Network network, @NotNull NetworkCapabilities networkCapabilities) {
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(networkCapabilities, "networkCapabilities");
        super.onCapabilitiesChanged(network, networkCapabilities);
        boolean hasCapability = networkCapabilities.hasCapability(11);
        if (hasCapability) {
            ConnectivityManager connectivityManager = this.this$0.getConnectivityManager();
            Intrinsics.checkNotNull(connectivityManager);
            connectivityManager.bindProcessToNetwork(network);
        }
        "onCapabilitiesChanged: network=" + network + ",isWifi=" + hasCapability;
    }

    public void onLost(@NotNull Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        super.onLost(network);
        this.$mListen.invoke("3");
        ConnectivityManager connectivityManager = this.this$0.getConnectivityManager();
        Intrinsics.checkNotNull(connectivityManager);
        connectivityManager.bindProcessToNetwork((Network) null);
    }

    public void onUnavailable() {
        super.onUnavailable();
        this.$mListen.invoke("2");
        ConnectivityManager connectivityManager = this.this$0.getConnectivityManager();
        Intrinsics.checkNotNull(connectivityManager);
        connectivityManager.bindProcessToNetwork((Network) null);
    }
}
