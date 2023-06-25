package com.internationalwinecooler.p529ui.webview;

import android.view.View;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.hisense.connect_life.hismart.networks.request.device.DeviceCache;
import com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo;
import com.hisense.connect_life.hismart.networks.request.message.MsgObserverViewModel;
import com.hisense.connect_life.hismart.networks.request.message.model.DeviceStatusMessage;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p482v.p483a.p492g.C7629i;

@Metadata(mo47990d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0013H\u0014J\b\u0010\u0015\u001a\u00020\u0013H\u0014R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u000f\u001a\u00020\u00048\u0016@\u0016X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0016"}, mo47991d2 = {"Lcom/internationalwinecooler/ui/webview/PropWebViewActivity;", "Lcom/internationalwinecooler/ui/webview/BaseWineWebViewActivity;", "()V", "deviceIds", "", "getDeviceIds", "()Ljava/lang/String;", "setDeviceIds", "(Ljava/lang/String;)V", "msgObserverViewModel", "Lcom/hisense/connect_life/hismart/networks/request/message/MsgObserverViewModel;", "getMsgObserverViewModel", "()Lcom/hisense/connect_life/hismart/networks/request/message/MsgObserverViewModel;", "msgObserverViewModel$delegate", "Lkotlin/Lazy;", "targetUrl", "getTargetUrl", "setTargetUrl", "initData", "", "initWidgets", "setListeners", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Route(path = "/app/propWebViewActivity")
/* renamed from: com.internationalwinecooler.ui.webview.PropWebViewActivity */
/* compiled from: PropWebViewActivity.kt */
public class PropWebViewActivity extends BaseWineWebViewActivity {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @Autowired(name = "deviceId")
    public String deviceIds;
    @NotNull
    public final Lazy msgObserverViewModel$delegate = LazyKt__LazyJVMKt.lazy(new PropWebViewActivity$msgObserverViewModel$2(this));
    @Autowired(name = "target_url")
    public String targetUrl;

    private final MsgObserverViewModel getMsgObserverViewModel() {
        return (MsgObserverViewModel) this.msgObserverViewModel$delegate.getValue();
    }

    /* renamed from: setListeners$lambda-3  reason: not valid java name */
    public static final void m27212setListeners$lambda3(PropWebViewActivity propWebViewActivity, DeviceStatusMessage deviceStatusMessage) {
        JsonObject jsonObject;
        Intrinsics.checkNotNullParameter(propWebViewActivity, "this$0");
        propWebViewActivity.getWineWebViewModel().getEvaluateJsLiveData();
        DeviceInfo device = DeviceCache.Companion.getInstance().getDevice(deviceStatusMessage.getDeviceid());
        Integer num = null;
        if (device == null) {
            jsonObject = null;
        } else {
            jsonObject = device.getProperties();
        }
        if (jsonObject != null) {
            JsonObject properties = device == null ? null : device.getProperties();
            Intrinsics.checkNotNull(properties);
            if (properties.size() > 0) {
                JsonObject jsonObject2 = new JsonObject();
                JsonObject jsonObject3 = new JsonObject();
                JsonObject properties2 = device.getProperties();
                Intrinsics.checkNotNull(properties2);
                JsonElement jsonElement = properties2.get("FunctionalLightsIntensity");
                jsonObject3.addProperty("FunctionalLightsIntensity", (Number) jsonElement == null ? null : Integer.valueOf(jsonElement.getAsInt()));
                JsonObject properties3 = device.getProperties();
                Intrinsics.checkNotNull(properties3);
                JsonElement jsonElement2 = properties3.get("FunctionalLightsColour");
                jsonObject3.addProperty("FunctionalLightsColour", (Number) jsonElement2 == null ? null : Integer.valueOf(jsonElement2.getAsInt()));
                JsonObject properties4 = device.getProperties();
                Intrinsics.checkNotNull(properties4);
                JsonElement jsonElement3 = properties4.get("AmbientBcolour");
                jsonObject3.addProperty("AmbientBcolour", (Number) jsonElement3 == null ? null : Integer.valueOf(jsonElement3.getAsInt()));
                JsonObject properties5 = device.getProperties();
                Intrinsics.checkNotNull(properties5);
                JsonElement jsonElement4 = properties5.get("AmbientGcolour");
                jsonObject3.addProperty("AmbientGcolour", (Number) jsonElement4 == null ? null : Integer.valueOf(jsonElement4.getAsInt()));
                JsonObject properties6 = device.getProperties();
                Intrinsics.checkNotNull(properties6);
                JsonElement jsonElement5 = properties6.get("AmbientLightsIntensity");
                jsonObject3.addProperty("AmbientLightsIntensity", (Number) jsonElement5 == null ? null : Integer.valueOf(jsonElement5.getAsInt()));
                JsonObject properties7 = device.getProperties();
                Intrinsics.checkNotNull(properties7);
                JsonElement jsonElement6 = properties7.get("AmbientRGBlightIntensity");
                jsonObject3.addProperty("AmbientRGBlightIntensity", (Number) jsonElement6 == null ? null : Integer.valueOf(jsonElement6.getAsInt()));
                JsonObject properties8 = device.getProperties();
                Intrinsics.checkNotNull(properties8);
                JsonElement jsonElement7 = properties8.get("AmbientRcolour");
                jsonObject3.addProperty("AmbientRcolour", (Number) jsonElement7 == null ? null : Integer.valueOf(jsonElement7.getAsInt()));
                JsonObject properties9 = device.getProperties();
                Intrinsics.checkNotNull(properties9);
                JsonElement jsonElement8 = properties9.get("AmbientOntime");
                jsonObject3.addProperty("AmbientOntime", (Number) jsonElement8 == null ? null : Integer.valueOf(jsonElement8.getAsInt()));
                JsonObject properties10 = device.getProperties();
                Intrinsics.checkNotNull(properties10);
                JsonElement jsonElement9 = properties10.get("FunctionalOntime");
                jsonObject3.addProperty("FunctionalOntime", (Number) jsonElement9 == null ? null : Integer.valueOf(jsonElement9.getAsInt()));
                JsonObject properties11 = device.getProperties();
                Intrinsics.checkNotNull(properties11);
                JsonElement jsonElement10 = properties11.get("AmbientLightsIntensity");
                jsonObject3.addProperty("AmbientLightsIntensity", (Number) jsonElement10 == null ? null : Integer.valueOf(jsonElement10.getAsInt()));
                JsonObject properties12 = device.getProperties();
                Intrinsics.checkNotNull(properties12);
                JsonElement jsonElement11 = properties12.get("AmbientLightsColour");
                jsonObject3.addProperty("AmbientLightsColour", (Number) jsonElement11 == null ? null : Integer.valueOf(jsonElement11.getAsInt()));
                JsonObject properties13 = device.getProperties();
                Intrinsics.checkNotNull(properties13);
                JsonElement jsonElement12 = properties13.get("FunctionalRGBlightIntensity");
                jsonObject3.addProperty("FunctionalRGBlightIntensity", (Number) jsonElement12 == null ? null : Integer.valueOf(jsonElement12.getAsInt()));
                JsonObject properties14 = device.getProperties();
                Intrinsics.checkNotNull(properties14);
                JsonElement jsonElement13 = properties14.get("FunctionalRcolour");
                jsonObject3.addProperty("FunctionalRcolour", (Number) jsonElement13 == null ? null : Integer.valueOf(jsonElement13.getAsInt()));
                JsonObject properties15 = device.getProperties();
                Intrinsics.checkNotNull(properties15);
                JsonElement jsonElement14 = properties15.get("FunctionalGcolour");
                jsonObject3.addProperty("FunctionalGcolour", (Number) jsonElement14 == null ? null : Integer.valueOf(jsonElement14.getAsInt()));
                JsonObject properties16 = device.getProperties();
                Intrinsics.checkNotNull(properties16);
                JsonElement jsonElement15 = properties16.get("FunctionalBcolour");
                jsonObject3.addProperty("FunctionalBcolour", (Number) jsonElement15 == null ? null : Integer.valueOf(jsonElement15.getAsInt()));
                JsonObject properties17 = device.getProperties();
                Intrinsics.checkNotNull(properties17);
                JsonElement jsonElement16 = properties17.get("SwitchLightsIntensity");
                jsonObject3.addProperty("SwitchLightsIntensity", (Number) jsonElement16 == null ? null : Integer.valueOf(jsonElement16.getAsInt()));
                JsonObject properties18 = device.getProperties();
                Intrinsics.checkNotNull(properties18);
                JsonElement jsonElement17 = properties18.get("SwitchLightsColour");
                jsonObject3.addProperty("SwitchLightsColour", (Number) jsonElement17 == null ? null : Integer.valueOf(jsonElement17.getAsInt()));
                JsonObject properties19 = device.getProperties();
                Intrinsics.checkNotNull(properties19);
                JsonElement jsonElement18 = properties19.get("SwitchRGBLightIntensity");
                jsonObject3.addProperty("SwitchRGBLightIntensity", (Number) jsonElement18 == null ? null : Integer.valueOf(jsonElement18.getAsInt()));
                JsonObject properties20 = device.getProperties();
                Intrinsics.checkNotNull(properties20);
                JsonElement jsonElement19 = properties20.get("SwitchRColour");
                jsonObject3.addProperty("SwitchRColour", (Number) jsonElement19 == null ? null : Integer.valueOf(jsonElement19.getAsInt()));
                JsonObject properties21 = device.getProperties();
                Intrinsics.checkNotNull(properties21);
                JsonElement jsonElement20 = properties21.get("SwitchGColour");
                jsonObject3.addProperty("SwitchGColour", (Number) jsonElement20 == null ? null : Integer.valueOf(jsonElement20.getAsInt()));
                JsonObject properties22 = device.getProperties();
                Intrinsics.checkNotNull(properties22);
                JsonElement jsonElement21 = properties22.get("SwitchBColour");
                jsonObject3.addProperty("SwitchBColour", (Number) jsonElement21 == null ? null : Integer.valueOf(jsonElement21.getAsInt()));
                JsonObject properties23 = device.getProperties();
                Intrinsics.checkNotNull(properties23);
                JsonElement jsonElement22 = properties23.get("SwitchModeOntime");
                jsonObject3.addProperty("SwitchModeOntime", (Number) jsonElement22 == null ? null : Integer.valueOf(jsonElement22.getAsInt()));
                JsonObject properties24 = device.getProperties();
                Intrinsics.checkNotNull(properties24);
                JsonElement jsonElement23 = properties24.get("SaveSwitchMode");
                if (jsonElement23 != null) {
                    num = Integer.valueOf(jsonElement23.getAsInt());
                }
                jsonObject3.addProperty("SaveSwitchMode", (Number) num);
                jsonObject2.addProperty("resultCode", (Number) 0);
                jsonObject2.add("data", jsonObject3);
            }
        }
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Nullable
    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @NotNull
    public final String getDeviceIds() {
        String str = this.deviceIds;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("deviceIds");
        return null;
    }

    @NotNull
    public String getTargetUrl() {
        String str = this.targetUrl;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("targetUrl");
        return null;
    }

    public void initData() {
        super.initData();
        getMsgObserverViewModel().subscribeMessage();
        setDeviceId(getDeviceIds());
    }

    public void initWidgets() {
        super.initWidgets();
        loadUrl(getTargetUrl());
    }

    public final void setDeviceIds(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceIds = str;
    }

    public void setListeners() {
        super.setListeners();
        getMsgObserverViewModel().getStatusMsgLiveData().observe(this, new C7629i(this));
    }

    public void setTargetUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.targetUrl = str;
    }
}
