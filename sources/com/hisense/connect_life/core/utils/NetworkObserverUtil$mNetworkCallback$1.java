package com.hisense.connect_life.core.utils;

import android.net.ConnectivityManager;
import android.net.Network;
import com.hisense.connect_life.core.listener.IPredicate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, mo47991d2 = {"com/hisense/connect_life/core/utils/NetworkObserverUtil$mNetworkCallback$1", "Landroid/net/ConnectivityManager$NetworkCallback;", "onAvailable", "", "network", "Landroid/net/Network;", "onLost", "core_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: NetworkUtil.kt */
public final class NetworkObserverUtil$mNetworkCallback$1 extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ NetworkObserverUtil this$0;

    public NetworkObserverUtil$mNetworkCallback$1(NetworkObserverUtil networkObserverUtil) {
        this.this$0 = networkObserverUtil;
    }

    public void onAvailable(@NotNull Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        super.onAvailable(network);
        IPredicate access$getMAvailableCallback$p = this.this$0.mAvailableCallback;
        if (access$getMAvailableCallback$p != null) {
            access$getMAvailableCallback$p.accept();
        }
    }

    public void onLost(@NotNull Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        super.onLost(network);
        IPredicate access$getMLostCallback$p = this.this$0.mLostCallback;
        if (access$getMLostCallback$p != null) {
            access$getMLostCallback$p.accept();
        }
    }
}
