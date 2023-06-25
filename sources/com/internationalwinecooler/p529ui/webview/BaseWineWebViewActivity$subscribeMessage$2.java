package com.internationalwinecooler.p529ui.webview;

import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import com.google.gson.JsonObject;
import com.hisense.connect_life.hismart.networks.request.device.DeviceCache;
import com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo;
import com.hisense.connect_life.hismart.networks.request.message.listener.SimpleMessageReceived;
import com.hisense.connect_life.hismart.networks.request.message.model.AlarmMessage;
import com.hisense.connect_life.hismart.networks.request.message.model.DeviceStatusMessage;
import com.hisense.connect_life.hismart.networks.request.message.model.SelfMessage;
import com.hisense.connect_life.hismart.networks.request.message.model.WifiMessage;
import com.internationalwinecooler.p529ui.WebActionEnum;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, mo47991d2 = {"com/internationalwinecooler/ui/webview/BaseWineWebViewActivity$subscribeMessage$2", "Lcom/hisense/connect_life/hismart/networks/request/message/listener/SimpleMessageReceived;", "onAlarmMessage", "", "alarmMessage", "Lcom/hisense/connect_life/hismart/networks/request/message/model/AlarmMessage;", "onDeviceStatusMessage", "deviceStatusMessage", "Lcom/hisense/connect_life/hismart/networks/request/message/model/DeviceStatusMessage;", "onSelfMessage", "selfMessage", "Lcom/hisense/connect_life/hismart/networks/request/message/model/SelfMessage;", "onWifiMessage", "wifiMessage", "Lcom/hisense/connect_life/hismart/networks/request/message/model/WifiMessage;", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.webview.BaseWineWebViewActivity$subscribeMessage$2 */
/* compiled from: BaseWineWebViewActivity.kt */
public final class BaseWineWebViewActivity$subscribeMessage$2 extends SimpleMessageReceived {
    public final /* synthetic */ BaseWineWebViewActivity this$0;

    public BaseWineWebViewActivity$subscribeMessage$2(BaseWineWebViewActivity baseWineWebViewActivity) {
        this.this$0 = baseWineWebViewActivity;
    }

    public void onAlarmMessage(@NotNull AlarmMessage alarmMessage) {
        Intrinsics.checkNotNullParameter(alarmMessage, "alarmMessage");
    }

    public void onDeviceStatusMessage(@NotNull DeviceStatusMessage deviceStatusMessage) {
        JsonObject jsonObject;
        String str;
        Intrinsics.checkNotNullParameter(deviceStatusMessage, "deviceStatusMessage");
        MutableLiveData<Pair<WebActionEnum, String>> evaluateJsLiveData = this.this$0.getWineWebViewModel().getEvaluateJsLiveData();
        BaseWineWebViewActivity baseWineWebViewActivity = this.this$0;
        String deviceid = deviceStatusMessage.getDeviceid();
        if (TextUtils.equals(deviceid, baseWineWebViewActivity.getDeviceids())) {
            DeviceInfo device = DeviceCache.Companion.getInstance().getDevice(deviceid);
            JsonObject jsonObject2 = new JsonObject();
            JsonObject jsonObject3 = new JsonObject();
            if (device != null) {
                jsonObject = device.getProperties();
                if (jsonObject == null) {
                    jsonObject = new JsonObject();
                }
            } else {
                jsonObject = new JsonObject();
            }
            if (device == null) {
                str = null;
            } else {
                str = device.getDeviceNickName();
            }
            jsonObject3.addProperty("deviceNickName", str);
            jsonObject3.add("deviceProps", jsonObject);
            jsonObject2.addProperty("resultCode", (Number) 0);
            jsonObject2.add("data", jsonObject3);
            evaluateJsLiveData.postValue(new Pair(WebActionEnum.GET_DEVICE_PROPERTIES_INFO_CALLBACK, jsonObject2.toString()));
        }
    }

    public void onSelfMessage(@NotNull SelfMessage selfMessage) {
        Intrinsics.checkNotNullParameter(selfMessage, "selfMessage");
    }

    public void onWifiMessage(@NotNull WifiMessage wifiMessage) {
        Intrinsics.checkNotNullParameter(wifiMessage, "wifiMessage");
    }
}
