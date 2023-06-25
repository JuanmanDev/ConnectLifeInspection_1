package com.juconnect.connect_life.broadcast;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0016¨\u0006\u0011"}, mo47991d2 = {"com/juconnect/connect_life/broadcast/NetWorkMonitorManager$networkCallback$1", "Landroid/net/ConnectivityManager$NetworkCallback;", "onAvailable", "", "network", "Landroid/net/Network;", "onCapabilitiesChanged", "networkCapabilities", "Landroid/net/NetworkCapabilities;", "onLinkPropertiesChanged", "linkProperties", "Landroid/net/LinkProperties;", "onLosing", "maxMsToLive", "", "onLost", "onUnavailable", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: NetWorkMonitorManager.kt */
public final class NetWorkMonitorManager$networkCallback$1 extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ NetWorkMonitorManager this$0;

    public NetWorkMonitorManager$networkCallback$1(NetWorkMonitorManager netWorkMonitorManager) {
        this.this$0 = netWorkMonitorManager;
    }

    public void onAvailable(@NotNull Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        super.onAvailable(network);
        NetMonitorListener access$getNetListener$p = this.this$0.netListener;
        if (access$getNetListener$p != null) {
            access$getNetListener$p.onAvailable(network);
        }
    }

    public void onCapabilitiesChanged(@NotNull Network network, @NotNull NetworkCapabilities networkCapabilities) {
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(networkCapabilities, "networkCapabilities");
        super.onCapabilitiesChanged(network, networkCapabilities);
    }

    public void onLinkPropertiesChanged(@NotNull Network network, @NotNull LinkProperties linkProperties) {
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(linkProperties, "linkProperties");
        super.onLinkPropertiesChanged(network, linkProperties);
    }

    public void onLosing(@NotNull Network network, int i) {
        Intrinsics.checkNotNullParameter(network, "network");
        super.onLosing(network, i);
    }

    public void onLost(@NotNull Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        super.onLost(network);
        NetMonitorListener access$getNetListener$p = this.this$0.netListener;
        if (access$getNetListener$p != null) {
            access$getNetListener$p.onLost();
        }
    }

    public void onUnavailable() {
        super.onUnavailable();
    }
}
