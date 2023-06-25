package com.juconnect.connect_life.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Network;
import android.net.NetworkInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, mo47991d2 = {"com/juconnect/connect_life/broadcast/NetWorkMonitorManager$receiver$1", "Landroid/content/BroadcastReceiver;", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: NetWorkMonitorManager.kt */
public final class NetWorkMonitorManager$receiver$1 extends BroadcastReceiver {
    public final /* synthetic */ NetWorkMonitorManager this$0;

    public NetWorkMonitorManager$receiver$1(NetWorkMonitorManager netWorkMonitorManager) {
        this.this$0 = netWorkMonitorManager;
    }

    public void onReceive(@Nullable Context context, @NotNull Intent intent) {
        NetworkInfo networkInfo;
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (Intrinsics.areEqual((Object) "android.net.conn.CONNECTIVITY_CHANGE", (Object) intent.getAction()) && (networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo")) != null) {
            if (NetworkInfo.State.CONNECTED != networkInfo.getState() || !networkInfo.isAvailable()) {
                Intrinsics.stringPlus(this.this$0.getConnectionType(networkInfo.getType()), "断开");
                NetMonitorListener access$getNetListener$p = this.this$0.netListener;
                if (access$getNetListener$p != null) {
                    access$getNetListener$p.onLost();
                }
            } else if (networkInfo.getType() == 1 || networkInfo.getType() == 0) {
                Intrinsics.stringPlus(this.this$0.getConnectionType(networkInfo.getType()), "连上");
                NetMonitorListener access$getNetListener$p2 = this.this$0.netListener;
                if (access$getNetListener$p2 != null) {
                    access$getNetListener$p2.onAvailable((Network) null);
                }
            }
        }
    }
}
