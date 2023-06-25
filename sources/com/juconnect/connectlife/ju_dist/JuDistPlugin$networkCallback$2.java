package com.juconnect.connectlife.ju_dist;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo47991d2 = {"<anonymous>", "com/juconnect/connectlife/ju_dist/JuDistPlugin$networkCallback$2$1", "invoke", "()Lcom/juconnect/connectlife/ju_dist/JuDistPlugin$networkCallback$2$1;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: JuDistPlugin.kt */
public final class JuDistPlugin$networkCallback$2 extends Lambda implements Function0<C40781> {
    public final /* synthetic */ JuDistPlugin this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JuDistPlugin$networkCallback$2(JuDistPlugin juDistPlugin) {
        super(0);
        this.this$0 = juDistPlugin;
    }

    @NotNull
    public final C40781 invoke() {
        final JuDistPlugin juDistPlugin = this.this$0;
        return new ConnectivityManager.NetworkCallback() {
            public void onAvailable(@NotNull Network network) {
                NetworkCapabilities networkCapabilities;
                Intrinsics.checkNotNullParameter(network, "network");
                super.onAvailable(network);
                ConnectivityManager access$getConnectivityManager$p = juDistPlugin.connectivityManager;
                Boolean bool = null;
                if (!(access$getConnectivityManager$p == null || (networkCapabilities = access$getConnectivityManager$p.getNetworkCapabilities(network)) == null)) {
                    bool = Boolean.valueOf(networkCapabilities.hasCapability(11));
                }
                "JuDistPlugin networkCallback onAvailable: network=" + network + " isWifi=" + bool;
            }

            public void onCapabilitiesChanged(@NotNull Network network, @NotNull NetworkCapabilities networkCapabilities) {
                Intrinsics.checkNotNullParameter(network, "network");
                Intrinsics.checkNotNullParameter(networkCapabilities, "networkCapabilities");
                super.onCapabilitiesChanged(network, networkCapabilities);
                boolean hasCapability = networkCapabilities.hasCapability(11);
                if (hasCapability) {
                    juDistPlugin.setMNetwork(network);
                    ConnectivityManager access$getConnectivityManager$p = juDistPlugin.connectivityManager;
                    if (access$getConnectivityManager$p != null) {
                        access$getConnectivityManager$p.bindProcessToNetwork(juDistPlugin.getMNetwork());
                    }
                }
                "JuDistPlugin networkCallback onCapabilitiesChanged: network=" + network + ",isWifi=" + hasCapability;
            }

            public void onLost(@NotNull Network network) {
                Intrinsics.checkNotNullParameter(network, "network");
                super.onLost(network);
                ConnectivityManager access$getConnectivityManager$p = juDistPlugin.connectivityManager;
                if (access$getConnectivityManager$p != null) {
                    access$getConnectivityManager$p.bindProcessToNetwork((Network) null);
                }
                Intrinsics.stringPlus("JuDistPlugin networkCallback onLost: network=", network);
            }

            public void onUnavailable() {
                super.onUnavailable();
                ConnectivityManager access$getConnectivityManager$p = juDistPlugin.connectivityManager;
                if (access$getConnectivityManager$p != null) {
                    access$getConnectivityManager$p.bindProcessToNetwork((Network) null);
                }
            }
        };
    }
}
