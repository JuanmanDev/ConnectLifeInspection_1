package com.hisense.juconnect.app_device.activity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.test.internal.runner.RunnerArgs;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.hisense.connect_life.core.base.BaseVmActivity;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.EventBusConstKt;
import com.hisense.connect_life.core.global.Paths;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.core.utils.LogUtilsShen;
import com.hisense.connect_life.core.widget.IconFontView;
import com.hisense.juconnect.app_device.R$id;
import com.hisense.juconnect.app_device.R$layout;
import com.hisense.juconnect.app_device.R$string;
import com.hisense.juconnect.app_device.viewmodel.DeviceViewModel;
import com.hisense.juconnect.app_socket.utils.LogUtils;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.greenrobot.eventbus.EventBus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p041a.p042a.p043a.p045b.C1337a;
import p040c.p429r.p460b.p461a.p462a.C7490e;
import p040c.p429r.p460b.p461a.p462a.C7499i0;
import p040c.p429r.p460b.p461a.p462a.C7505l0;
import p040c.p429r.p460b.p461a.p462a.C7515q0;

@Metadata(mo47990d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0005H\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0014J\u0010\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005H\u0002J\u0010\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u0005H\u0002J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020$H\u0016J\b\u0010%\u001a\u00020\u001bH\u0014J\b\u0010&\u001a\u00020\u001bH\u0014J\b\u0010'\u001a\u00020\u001bH\u0014J\b\u0010(\u001a\u00020\u001bH\u0014J\b\u0010)\u001a\u00020\u001bH\u0014J\b\u0010*\u001a\u00020\u001bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001e\u0010\u0011\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001e\u0010\u0014\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR\u000e\u0010\u0017\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/activity/SingleZoneSetApplianceNameActivity;", "Lcom/hisense/connect_life/core/base/BaseVmActivity;", "Lcom/hisense/juconnect/app_device/viewmodel/DeviceViewModel;", "()V", "deviceDefaultName", "", "isFirst", "", "isOpenFlashlight", "mDevId", "getMDevId", "()Ljava/lang/String;", "setMDevId", "(Ljava/lang/String;)V", "mDevType", "getMDevType", "setMDevType", "mWifiId", "getMWifiId", "setMWifiId", "myFrom", "getMyFrom", "setMyFrom", "nickName", "serviceDevId", "wifiId", "bindAppliance", "", "result", "bindLayout", "", "getLastBits", "strhours", "gotoAppliancePairedSuccess", "deviceId", "initViewModelClz", "Ljava/lang/Class;", "initWidgets", "onDestroy", "onResume", "onStop", "setListeners", "subscribeObservable", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Route(path = "/device/SingleZoneSetApplianceNameActivity")
/* compiled from: SingleZoneSetApplianceNameActivity.kt */
public final class SingleZoneSetApplianceNameActivity extends BaseVmActivity<DeviceViewModel> {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @NotNull
    public final String deviceDefaultName = "Wine Climate Cabinet ";
    public boolean isFirst = true;
    public boolean isOpenFlashlight;
    @Autowired(name = "DevId")
    public String mDevId;
    @Autowired(name = "DevType")
    public String mDevType;
    @Autowired(name = "WifiId")
    public String mWifiId;
    @Autowired(name = "from")
    public String myFrom;
    @NotNull
    public String nickName = "";
    @NotNull
    public String serviceDevId = "";
    @NotNull
    public String wifiId = "";

    public static final /* synthetic */ DeviceViewModel access$getMViewModel(SingleZoneSetApplianceNameActivity singleZoneSetApplianceNameActivity) {
        return (DeviceViewModel) singleZoneSetApplianceNameActivity.getMViewModel();
    }

    private final void bindAppliance(String str) {
        LogUtilsShen.Companion.mo39138e(Intrinsics.stringPlus("bindAppliance qrResult: ", str));
        List split$default = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{RunnerArgs.CLASS_SEPARATOR}, false, 0, 6, (Object) null);
        this.wifiId = (String) split$default.get(0);
        String str2 = (String) split$default.get(1);
        String str3 = this.deviceDefaultName + getLastBits(this.wifiId) + getLastBits(str2);
        this.nickName = str3;
        LogUtilsShen.Companion.mo39138e(Intrinsics.stringPlus("bindAppliance nickName: ", str3));
        ((DeviceViewModel) getMViewModel()).bindDevice(this.wifiId, str2, this.nickName, "", "", "");
    }

    private final String getLastBits(String str) {
        String substring = str.substring(str.length() - 4, str.length());
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    private final void gotoAppliancePairedSuccess(String str) {
        Postcard a = C1337a.m211c().mo15011a(Paths.Device.AppliancePairedSuccessActivity);
        a.withString(EventBusConstKt.APPLIANCENAME, this.nickName).withString(EventBusConstKt.WIFIID, this.wifiId).withString("deviceId", str);
        a.navigation();
        Intent intent = new Intent();
        intent.putExtra("data", true);
        setResult(-1, intent);
        finish();
    }

    /* renamed from: subscribeObservable$lambda-0  reason: not valid java name */
    public static final void m27136subscribeObservable$lambda0(SingleZoneSetApplianceNameActivity singleZoneSetApplianceNameActivity, Pair pair) {
        Intrinsics.checkNotNullParameter(singleZoneSetApplianceNameActivity, "this$0");
        singleZoneSetApplianceNameActivity.serviceDevId = (String) pair.getSecond();
    }

    /* renamed from: subscribeObservable$lambda-1  reason: not valid java name */
    public static final void m27137subscribeObservable$lambda1(SingleZoneSetApplianceNameActivity singleZoneSetApplianceNameActivity, Pair pair) {
        Intrinsics.checkNotNullParameter(singleZoneSetApplianceNameActivity, "this$0");
        if (((Boolean) pair.getFirst()).booleanValue()) {
            LogUtilsShen.Companion.mo39138e("SingleZoneSetApplianceNameActivity bindAppliance Success:");
            if (!Intrinsics.areEqual((Object) singleZoneSetApplianceNameActivity.getMyFrom(), (Object) "pair")) {
                EventBus.getDefault().post(102);
                JuConnectExtKt.navigation(Paths.App.MainActivity);
            } else if (!Intrinsics.areEqual((Object) singleZoneSetApplianceNameActivity.getMDevId(), (Object) singleZoneSetApplianceNameActivity.serviceDevId)) {
                singleZoneSetApplianceNameActivity.showString(R$string.pair_error);
            } else {
                ((DeviceViewModel) singleZoneSetApplianceNameActivity.getMViewModel()).updateDeviceCustomInfo((String) pair.getSecond(), singleZoneSetApplianceNameActivity.getMDevId(), ((EditText) singleZoneSetApplianceNameActivity._$_findCachedViewById(R$id.et_appliance_name)).getText().toString());
            }
        } else {
            LogUtilsShen.Companion.mo39138e("SingleZoneSetApplianceNameActivity bindAppliance error:");
            singleZoneSetApplianceNameActivity.showString("绑定失败");
            JuConnectExtKt.navigation(Paths.Device.SingleZoneSetApplianceNameErrorActivity);
        }
    }

    /* renamed from: subscribeObservable$lambda-2  reason: not valid java name */
    public static final void m27138subscribeObservable$lambda2(SingleZoneSetApplianceNameActivity singleZoneSetApplianceNameActivity, Boolean bool) {
        Intrinsics.checkNotNullParameter(singleZoneSetApplianceNameActivity, "this$0");
        Intrinsics.checkNotNullExpressionValue(bool, LanguageConstKt.f15954it);
        if (bool.booleanValue()) {
            EventBus.getDefault().post(102);
            JuConnectExtKt.navigation(Paths.App.MainActivity);
            return;
        }
        singleZoneSetApplianceNameActivity.showString(R$string.fail);
    }

    /* renamed from: subscribeObservable$lambda-4  reason: not valid java name */
    public static final void m27139subscribeObservable$lambda4(SingleZoneSetApplianceNameActivity singleZoneSetApplianceNameActivity, Boolean bool) {
        Intrinsics.checkNotNullParameter(singleZoneSetApplianceNameActivity, "this$0");
        if (bool != null) {
            if (bool.booleanValue()) {
                singleZoneSetApplianceNameActivity.showLoading();
            } else {
                singleZoneSetApplianceNameActivity.hideLoading();
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

    public int bindLayout() {
        return R$layout.activity_single_zone_set_appliance_name;
    }

    @NotNull
    public final String getMDevId() {
        String str = this.mDevId;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mDevId");
        return null;
    }

    @NotNull
    public final String getMDevType() {
        String str = this.mDevType;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mDevType");
        return null;
    }

    @NotNull
    public final String getMWifiId() {
        String str = this.mWifiId;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mWifiId");
        return null;
    }

    @NotNull
    public final String getMyFrom() {
        String str = this.myFrom;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("myFrom");
        return null;
    }

    @NotNull
    public Class<DeviceViewModel> initViewModelClz() {
        return DeviceViewModel.class;
    }

    public void initWidgets() {
        ((TextView) _$_findCachedViewById(R$id.top_title)).setText(getString(R$string.add_appliance));
        LogUtils.Companion.debug("mDevId:", getMDevId());
        LogUtils.Companion.debug("mWifiId:", getMWifiId());
        LogUtilsShen.Companion.mo39138e(Intrinsics.stringPlus("SingleZoneSetApplianceNameActivity mDevId:", getMDevId()));
        LogUtilsShen.Companion.mo39138e(Intrinsics.stringPlus("SingleZoneSetApplianceNameActivity mWifiId:", getMWifiId()));
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onResume() {
        super.onResume();
    }

    public void onStop() {
        super.onStop();
    }

    public void setListeners() {
        IconFontView iconFontView = (IconFontView) _$_findCachedViewById(R$id.top_back);
        Intrinsics.checkNotNullExpressionValue(iconFontView, "top_back");
        JuConnectExtKt.singleClickListener(iconFontView, new SingleZoneSetApplianceNameActivity$setListeners$1(this));
        Button button = (Button) _$_findCachedViewById(R$id.bt_single_zone_save_bind_relation);
        Intrinsics.checkNotNullExpressionValue(button, "bt_single_zone_save_bind_relation");
        JuConnectExtKt.singleClickListener(button, new SingleZoneSetApplianceNameActivity$setListeners$2(this));
    }

    public final void setMDevId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mDevId = str;
    }

    public final void setMDevType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mDevType = str;
    }

    public final void setMWifiId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mWifiId = str;
    }

    public final void setMyFrom(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.myFrom = str;
    }

    public void subscribeObservable() {
        super.subscribeObservable();
        ((DeviceViewModel) getMViewModel()).getBindDeviceIdLiveData().observeForever(new C7499i0(this));
        ((DeviceViewModel) getMViewModel()).getBindDeviceLiveData().observe(this, new C7490e(this));
        ((DeviceViewModel) getMViewModel()).getUpdateDeviceLiveData().observe(this, new C7515q0(this));
        ((DeviceViewModel) getMViewModel()).getLoadingLiveData().observe(this, new C7505l0(this));
    }
}
