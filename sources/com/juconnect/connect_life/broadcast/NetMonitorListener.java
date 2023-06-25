package com.juconnect.connect_life.broadcast;

import android.net.Network;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, mo47991d2 = {"Lcom/juconnect/connect_life/broadcast/NetMonitorListener;", "", "onAvailable", "", "network", "Landroid/net/Network;", "onLost", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: NetMonitorListener.kt */
public interface NetMonitorListener {
    void onAvailable(@Nullable Network network);

    void onLost();
}
