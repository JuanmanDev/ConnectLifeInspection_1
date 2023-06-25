package com.juconnect.connect_life;

import com.juconnect.connect_life.socket.SocketManager;
import java.util.TimerTask;
import kotlin.Metadata;

@Metadata(mo47990d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, mo47991d2 = {"com/juconnect/connect_life/MainActivity$onResume$1", "Ljava/util/TimerTask;", "run", "", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: MainActivity.kt */
public final class MainActivity$onResume$1 extends TimerTask {
    public void run() {
        SocketManager.Companion.getInstance().checkIsAlive();
    }
}
