package com.hisense.connect_life.core.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, mo47991d2 = {"com/hisense/connect_life/core/utils/NetworkObserverUtil$wifiReceiver$1", "Landroid/content/BroadcastReceiver;", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "core_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: NetworkUtil.kt */
public final class NetworkObserverUtil$wifiReceiver$1 extends BroadcastReceiver {
    public final /* synthetic */ NetworkObserverUtil this$0;

    public NetworkObserverUtil$wifiReceiver$1(NetworkObserverUtil networkObserverUtil) {
        this.this$0 = networkObserverUtil;
    }

    public void onReceive(@Nullable Context context, @Nullable Intent intent) {
        if (intent != null) {
            NetworkObserverUtil networkObserverUtil = this.this$0;
            if (Intrinsics.areEqual((Object) intent.getAction(), (Object) "android.net.conn.CONNECTIVITY_CHANGE")) {
                networkObserverUtil.handleNetChange();
            }
        }
    }
}
