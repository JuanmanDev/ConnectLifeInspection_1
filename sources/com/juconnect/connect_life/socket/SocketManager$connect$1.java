package com.juconnect.connect_life.socket;

import androidx.browser.browseractions.BrowserServiceFileProvider;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.hisense.connect_life.hismart.networks.request.message.ProcessMessageUtil;
import com.hisense.connect_life.hismart.networks.request.message.model.AlarmMessage;
import com.hisense.juconnect.app_device.event.UnbindMsg;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p040c.p301y.p508a.p513w.C7735c;

@Metadata(mo47990d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016¨\u0006\u0010"}, mo47991d2 = {"com/juconnect/connect_life/socket/SocketManager$connect$1", "Lcom/juconnect/connect_life/socket/ExampleClient$OnStatusChangeListener;", "onClose", "", "code", "", "reason", "", "remote", "", "onError", "ex", "Ljava/lang/Exception;", "onMessage", "message", "onOpen", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: SocketManager.kt */
public final class SocketManager$connect$1 implements C7735c.C7736a {
    public final /* synthetic */ SocketManager this$0;

    public SocketManager$connect$1(SocketManager socketManager) {
        this.this$0 = socketManager;
    }

    public void onClose(int i, @Nullable String str, boolean z) {
        "onClose:" + str + ' ' + z;
    }

    public void onError(@Nullable Exception exc) {
        this.this$0.sendConnectEvent(false);
        this.this$0.reconnect();
        Intrinsics.stringPlus("onError:", exc);
    }

    public void onMessage(@Nullable String str) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(BrowserServiceFileProvider.CONTENT_SCHEME, str);
        boolean z = true;
        this.this$0.sendEvent(1, jsonObject);
        if (str != null) {
            String access$getDecodeMsg = this.this$0.getDecodeMsg(str);
            if (access$getDecodeMsg.length() <= 0) {
                z = false;
            }
            if (z) {
                JSONObject jSONObject = new JSONObject(access$getDecodeMsg);
                if (Intrinsics.areEqual((Object) jSONObject.getString("msgTypeCode"), (Object) "bind_admin_unbind")) {
                    AlarmMessage alarmMessage = (AlarmMessage) new Gson().fromJson(jSONObject.getString(BrowserServiceFileProvider.CONTENT_SCHEME), AlarmMessage.class);
                    EventBus.getDefault().post(new UnbindMsg(alarmMessage.getDeviceid(), alarmMessage.getWarning()));
                }
            }
            ProcessMessageUtil.Companion.processMessage(access$getDecodeMsg);
        }
    }

    public void onOpen() {
        this.this$0.sendConnectEvent(true);
    }
}
