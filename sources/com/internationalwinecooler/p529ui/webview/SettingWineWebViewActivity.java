package com.internationalwinecooler.p529ui.webview;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.MutableLiveData;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.gson.JsonObject;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.hismart.networks.request.device.DeviceCache;
import com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo;
import com.hisense.connect_life.hismart.networks.request.message.MsgObserverViewModel;
import com.hisense.connect_life.hismart.networks.request.message.model.DeviceStatusMessage;
import com.hisense.juconnect.app_device.activity.WineLabelScannerActivity;
import com.hisense.juconnect.app_device.event.WinePhotoEvent;
import com.hisense.juconnect.app_device.model.LabelScannerType;
import com.hisense.juconnect.connectlife.R;
import com.internationalwinecooler.p529ui.WebActionEnum;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p482v.p483a.p492g.C7625e;
import p040c.p482v.p483a.p492g.C7626f;
import p040c.p482v.p483a.p492g.C7631k;
import p040c.p482v.p483a.p492g.C7642v;
import p687n.p688a.p689a.C9818b;
import pub.devrel.easypermissions.EasyPermissions;

@Metadata(mo47990d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u001eH\u0014J\b\u0010 \u001a\u00020\u001eH\u0014J\u0010\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#H\u0007J\b\u0010$\u001a\u00020\u001eH\u0014J\u0010\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u0005H\u0002R!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\n\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u00058\u0016@\u0016X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\f\"\u0004\b\u001c\u0010\u000e¨\u0006'"}, mo47991d2 = {"Lcom/internationalwinecooler/ui/webview/SettingWineWebViewActivity;", "Lcom/internationalwinecooler/ui/webview/BaseWineWebViewActivity;", "()V", "compImageLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getCompImageLiveData", "()Landroidx/lifecycle/MutableLiveData;", "compImageLiveData$delegate", "Lkotlin/Lazy;", "deviceIds", "getDeviceIds", "()Ljava/lang/String;", "setDeviceIds", "(Ljava/lang/String;)V", "msgObserverViewModel", "Lcom/hisense/connect_life/hismart/networks/request/message/MsgObserverViewModel;", "getMsgObserverViewModel", "()Lcom/hisense/connect_life/hismart/networks/request/message/MsgObserverViewModel;", "msgObserverViewModel$delegate", "scannerType", "Lcom/hisense/juconnect/app_device/model/LabelScannerType;", "getScannerType", "()Lcom/hisense/juconnect/app_device/model/LabelScannerType;", "setScannerType", "(Lcom/hisense/juconnect/app_device/model/LabelScannerType;)V", "targetUrl", "getTargetUrl", "setTargetUrl", "gotoScanner", "", "initWidgets", "onDestroy", "onWinePhoto", "event", "Lcom/hisense/juconnect/app_device/event/WinePhotoEvent;", "setListeners", "takePhoto", "type", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Route(path = "/app/customWineWebViewActivity")
/* renamed from: com.internationalwinecooler.ui.webview.SettingWineWebViewActivity */
/* compiled from: SettingWineWebViewActivity.kt */
public class SettingWineWebViewActivity extends BaseWineWebViewActivity {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @NotNull
    public final Lazy compImageLiveData$delegate = LazyKt__LazyJVMKt.lazy(SettingWineWebViewActivity$compImageLiveData$2.INSTANCE);
    @Autowired(name = "deviceId")
    public String deviceIds;
    @NotNull
    public final Lazy msgObserverViewModel$delegate = LazyKt__LazyJVMKt.lazy(new SettingWineWebViewActivity$msgObserverViewModel$2(this));
    @NotNull
    public LabelScannerType scannerType = LabelScannerType.WINE_PHOTO;
    @Autowired(name = "target_url")
    public String targetUrl;

    private final MutableLiveData<String> getCompImageLiveData() {
        return (MutableLiveData) this.compImageLiveData$delegate.getValue();
    }

    private final MsgObserverViewModel getMsgObserverViewModel() {
        return (MsgObserverViewModel) this.msgObserverViewModel$delegate.getValue();
    }

    private final void gotoScanner() {
        WineLabelScannerActivity.Companion.gotoWLabScannerForResult(this, this.scannerType.getType(), 1);
    }

    /* renamed from: setListeners$lambda-0  reason: not valid java name */
    public static final void m27213setListeners$lambda0(SettingWineWebViewActivity settingWineWebViewActivity, String str) {
        Intrinsics.checkNotNullParameter(settingWineWebViewActivity, "this$0");
        if (!TextUtils.isEmpty(str)) {
            Intrinsics.checkNotNullExpressionValue(str, LanguageConstKt.f15954it);
            settingWineWebViewActivity.takePhoto(str);
        }
    }

    /* renamed from: setListeners$lambda-1  reason: not valid java name */
    public static final void m27214setListeners$lambda1(SettingWineWebViewActivity settingWineWebViewActivity, String str) {
        Intrinsics.checkNotNullParameter(settingWineWebViewActivity, "this$0");
        if (!TextUtils.isEmpty(str)) {
            WebActionEnum webActionEnum = WebActionEnum.TAKE_PHOTO_CALLBACK;
            Intrinsics.checkNotNullExpressionValue(str, LanguageConstKt.f15954it);
            settingWineWebViewActivity.compressImage(webActionEnum, str);
        }
    }

    /* renamed from: setListeners$lambda-2  reason: not valid java name */
    public static final void m27215setListeners$lambda2(SettingWineWebViewActivity settingWineWebViewActivity, Boolean bool) {
        Intrinsics.checkNotNullParameter(settingWineWebViewActivity, "this$0");
        Intrinsics.checkNotNullExpressionValue(bool, LanguageConstKt.f15954it);
        if (bool.booleanValue()) {
            EventBus.getDefault().post(102);
            EventBus.getDefault().post(105);
            settingWineWebViewActivity.finish();
        }
    }

    /* renamed from: setListeners$lambda-6  reason: not valid java name */
    public static final void m27216setListeners$lambda6(SettingWineWebViewActivity settingWineWebViewActivity, DeviceStatusMessage deviceStatusMessage) {
        JsonObject jsonObject;
        String str;
        Intrinsics.checkNotNullParameter(settingWineWebViewActivity, "this$0");
        MutableLiveData<Pair<WebActionEnum, String>> evaluateJsLiveData = settingWineWebViewActivity.getWineWebViewModel().getEvaluateJsLiveData();
        if (TextUtils.equals(settingWineWebViewActivity.getDeviceIds(), deviceStatusMessage.getDeviceid())) {
            DeviceInfo device = DeviceCache.Companion.getInstance().getDevice(deviceStatusMessage.getDeviceid());
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

    private final void takePhoto(String str) {
        LabelScannerType labelScannerType;
        if (TextUtils.equals("1", str)) {
            labelScannerType = LabelScannerType.ADD_WINE;
        } else {
            labelScannerType = LabelScannerType.WINE_PHOTO;
        }
        this.scannerType = labelScannerType;
        if (EasyPermissions.m26767a(this, "android.permission.CAMERA")) {
            gotoScanner();
            return;
        }
        C9818b.C9820b bVar = new C9818b.C9820b((Activity) this, 1, "android.permission.CAMERA");
        bVar.mo50750e(getString(R.string.rationale_camera));
        bVar.mo50748c(R.string.rationale_ask_ok);
        bVar.mo50747b(R.string.camera_cancel);
        C9818b a = bVar.mo50746a();
        Intrinsics.checkNotNullExpressionValue(a, "Builder(this, CODE_PERMI…                 .build()");
        EasyPermissions.m26771e(a);
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
    public final LabelScannerType getScannerType() {
        return this.scannerType;
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

    public void initWidgets() {
        super.initWidgets();
        loadUrl(getTargetUrl());
        getMsgObserverViewModel().subscribeMessage();
        EventBus.getDefault().register(this);
    }

    public void onDestroy() {
        EventBus.getDefault().post(102);
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onWinePhoto(@NotNull WinePhotoEvent winePhotoEvent) {
        Intrinsics.checkNotNullParameter(winePhotoEvent, NotificationCompat.CATEGORY_EVENT);
        getCompImageLiveData().setValue(winePhotoEvent.getPath());
    }

    public final void setDeviceIds(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceIds = str;
    }

    public void setListeners() {
        super.setListeners();
        getWineWebViewModel().getTakePhotoLiveData().observe(this, new C7642v(this));
        getCompImageLiveData().observe(this, new C7626f(this));
        getWineWebViewModel().getUnbindApplianceLiveData().observe(this, new C7631k(this));
        getMsgObserverViewModel().getStatusMsgLiveData().observe(this, new C7625e(this));
    }

    public final void setScannerType(@NotNull LabelScannerType labelScannerType) {
        Intrinsics.checkNotNullParameter(labelScannerType, "<set-?>");
        this.scannerType = labelScannerType;
    }

    public void setTargetUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.targetUrl = str;
    }
}
