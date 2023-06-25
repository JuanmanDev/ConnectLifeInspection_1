package com.internationalwinecooler.p529ui.webview;

import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.gson.JsonObject;
import com.hisense.connect_life.core.global.HtmlPaths;
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
import p040c.p482v.p483a.p492g.C7630j;

@Metadata(mo47990d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0013H\u0014J\b\u0010\u0015\u001a\u00020\u0013H\u0014R\u001e\u0010\u0003\u001a\u00020\u00048\u0016@\u0016X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u000f\u001a\u00020\u00048\u0016@\u0016X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0016"}, mo47991d2 = {"Lcom/internationalwinecooler/ui/webview/HumitureWebViewActivity;", "Lcom/internationalwinecooler/ui/webview/BaseWineWebViewActivity;", "()V", "deviceAuid", "", "getDeviceAuid", "()Ljava/lang/String;", "setDeviceAuid", "(Ljava/lang/String;)V", "msgObserverViewModel", "Lcom/hisense/connect_life/hismart/networks/request/message/MsgObserverViewModel;", "getMsgObserverViewModel", "()Lcom/hisense/connect_life/hismart/networks/request/message/MsgObserverViewModel;", "msgObserverViewModel$delegate", "Lkotlin/Lazy;", "targetUrl", "getTargetUrl", "setTargetUrl", "initData", "", "initWidgets", "setListeners", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Route(path = "/app/HumitureWebViewActivity")
/* renamed from: com.internationalwinecooler.ui.webview.HumitureWebViewActivity */
/* compiled from: HumitureWebViewActivity.kt */
public class HumitureWebViewActivity extends BaseWineWebViewActivity {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @Autowired(name = "key_auid")
    public String deviceAuid;
    @NotNull
    public final Lazy msgObserverViewModel$delegate = LazyKt__LazyJVMKt.lazy(new HumitureWebViewActivity$msgObserverViewModel$2(this));
    @Autowired(name = "target_url")
    public String targetUrl;

    private final MsgObserverViewModel getMsgObserverViewModel() {
        return (MsgObserverViewModel) this.msgObserverViewModel$delegate.getValue();
    }

    /* renamed from: setListeners$lambda-5  reason: not valid java name */
    public static final void m27209setListeners$lambda5(HumitureWebViewActivity humitureWebViewActivity, DeviceStatusMessage deviceStatusMessage) {
        JsonObject jsonObject;
        Intrinsics.checkNotNullParameter(humitureWebViewActivity, "this$0");
        humitureWebViewActivity.getWineWebViewModel().getEvaluateJsLiveData();
        String deviceid = deviceStatusMessage.getDeviceid();
        if (Intrinsics.areEqual((Object) deviceid, (Object) humitureWebViewActivity.getDeviceAuid())) {
            DeviceInfo device = DeviceCache.Companion.getInstance().getDevice(deviceid);
            if (device == null) {
                jsonObject = null;
            } else {
                jsonObject = device.getProperties();
            }
            if (jsonObject != null) {
                JsonObject jsonObject2 = new JsonObject();
                JsonObject jsonObject3 = new JsonObject();
                JsonObject jsonObject4 = new JsonObject();
                JsonObject jsonObject5 = new JsonObject();
                JsonObject properties = device.getProperties();
                Intrinsics.checkNotNull(properties);
                jsonObject4.addProperty(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, (Number) Integer.valueOf(properties.get("Zone1SetTemperature").getAsInt()));
                jsonObject4.addProperty("B", (Number) Integer.valueOf(properties.get("Zone2SetTemperature").getAsInt()));
                jsonObject4.addProperty("C", (Number) Integer.valueOf(properties.get("Zone3SetTemperature").getAsInt()));
                jsonObject5.addProperty(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, (Number) Integer.valueOf(properties.get("Zone1RealHumidity").getAsInt()));
                jsonObject5.addProperty("B", (Number) Integer.valueOf(properties.get("Zone2RealHumidity").getAsInt()));
                jsonObject5.addProperty("C", (Number) Integer.valueOf(properties.get("Zone3RealHumidity").getAsInt()));
                jsonObject3.add(HtmlPaths.DEVICE_TEMPERATURE, jsonObject4);
                jsonObject3.add("humudity", jsonObject5);
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
    public String getDeviceAuid() {
        String str = this.deviceAuid;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("deviceAuid");
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
    }

    public void initWidgets() {
        super.initWidgets();
        setDeviceId(getDeviceAuid());
        loadUrl(getTargetUrl());
    }

    public void setDeviceAuid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceAuid = str;
    }

    public void setListeners() {
        super.setListeners();
        getMsgObserverViewModel().getStatusMsgLiveData().observe(this, new C7630j(this));
    }

    public void setTargetUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.targetUrl = str;
    }
}
