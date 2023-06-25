package com.hisense.juconnect.app_socket.connect;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0012\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e¨\u0006\u0013"}, mo47991d2 = {"Lcom/hisense/juconnect/app_socket/connect/ConnectStep;", "", "()V", "lastTime", "", "getLastTime", "()J", "setLastTime", "(J)V", "setting", "", "getSetting", "()Z", "setSetting", "(Z)V", "verifying", "getVerifying", "setVerifying", "timeSpan", "app_socket_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ConnectStep.kt */
public final class ConnectStep {
    @NotNull
    public static final ConnectStep INSTANCE = new ConnectStep();
    public static long lastTime;
    public static boolean setting;
    public static boolean verifying;

    public final long getLastTime() {
        return lastTime;
    }

    public final boolean getSetting() {
        return setting;
    }

    public final boolean getVerifying() {
        return verifying;
    }

    public final void setLastTime(long j) {
        lastTime = j;
    }

    public final void setSetting(boolean z) {
        setting = z;
    }

    public final void setVerifying(boolean z) {
        verifying = z;
    }

    public final long timeSpan() {
        if (lastTime <= 0) {
            return 0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - lastTime;
        lastTime = currentTimeMillis;
        return j;
    }
}
