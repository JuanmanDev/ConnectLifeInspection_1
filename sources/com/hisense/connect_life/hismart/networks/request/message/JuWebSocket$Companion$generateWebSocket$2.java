package com.hisense.connect_life.hismart.networks.request.message;

import com.hisense.connect_life.hismart.networks.request.message.JuWebSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\"\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\rH\u0016J\u0018\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, mo47991d2 = {"com/hisense/connect_life/hismart/networks/request/message/JuWebSocket$Companion$generateWebSocket$2", "Lokhttp3/WebSocketListener;", "webSocket", "Lokhttp3/WebSocket;", "getWebSocket", "()Lokhttp3/WebSocket;", "setWebSocket", "(Lokhttp3/WebSocket;)V", "onClosed", "", "code", "", "reason", "", "onFailure", "t", "", "response", "Lokhttp3/Response;", "onMessage", "text", "bytes", "Lokio/ByteString;", "onOpen", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: JuWebSocket.kt */
public final class JuWebSocket$Companion$generateWebSocket$2 extends WebSocketListener {
    public final /* synthetic */ long $pingInterval;
    public final /* synthetic */ long $pingIntervalFail;
    public final /* synthetic */ String $url;
    @Nullable
    public WebSocket webSocket;

    public JuWebSocket$Companion$generateWebSocket$2(long j, String str, long j2) {
        this.$pingIntervalFail = j;
        this.$url = str;
        this.$pingInterval = j2;
    }

    @Nullable
    public final WebSocket getWebSocket() {
        return this.webSocket;
    }

    public void onClosed(@NotNull WebSocket webSocket2, int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(webSocket2, "webSocket");
        Intrinsics.checkNotNullParameter(str, "reason");
        super.onClosed(webSocket2, i, str);
    }

    public void onFailure(@NotNull WebSocket webSocket2, @NotNull Throwable th, @Nullable Response response) {
        Intrinsics.checkNotNullParameter(webSocket2, "webSocket");
        Intrinsics.checkNotNullParameter(th, "t");
        super.onFailure(webSocket2, th, response);
        if (!JuWebSocket.isCancel) {
            JuWebSocket.Companion companion = JuWebSocket.Companion;
            JuWebSocket.mPingIntervalFail = JuWebSocket.mPingIntervalFail + 1;
            if (((long) JuWebSocket.mPingIntervalFail) >= this.$pingIntervalFail) {
                JuWebSocket.Companion companion2 = JuWebSocket.Companion;
                JuWebSocket.mPingIntervalFail = 0;
                WebSocket access$getMWebSocket$cp = JuWebSocket.mWebSocket;
                if (access$getMWebSocket$cp != null) {
                    access$getMWebSocket$cp.cancel();
                }
                JuWebSocket.Companion companion3 = JuWebSocket.Companion;
                JuWebSocket.mWebSocket = null;
                JuWebSocket.Companion.generateWebSocket(this.$url, this.$pingInterval, this.$pingIntervalFail);
            }
        }
        "JuWebSocket onFailure response: " + response + ", Throwable: " + th;
    }

    public void onMessage(@NotNull WebSocket webSocket2, @NotNull ByteString byteString) {
        Intrinsics.checkNotNullParameter(webSocket2, "webSocket");
        Intrinsics.checkNotNullParameter(byteString, "bytes");
        super.onMessage(webSocket2, byteString);
        Intrinsics.stringPlus("JuWebSocket onMessage bytes: ", byteString);
    }

    public void onOpen(@NotNull WebSocket webSocket2, @NotNull Response response) {
        Intrinsics.checkNotNullParameter(webSocket2, "webSocket");
        Intrinsics.checkNotNullParameter(response, "response");
        super.onOpen(webSocket2, response);
        this.webSocket = webSocket2;
    }

    public final void setWebSocket(@Nullable WebSocket webSocket2) {
        this.webSocket = webSocket2;
    }

    public void onMessage(@NotNull WebSocket webSocket2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(webSocket2, "webSocket");
        Intrinsics.checkNotNullParameter(str, "text");
        super.onMessage(webSocket2, str);
        Intrinsics.stringPlus("JuWebSocket onMessage pushSwitch: ", Boolean.valueOf(JuWebSocket.Companion.getPushSwitch()));
        Intrinsics.stringPlus("JuWebSocket onMessage text: ", str);
        if (JuWebSocket.Companion.getPushSwitch()) {
            JuWebSocket.Companion.processMessage(str);
        }
    }
}
