package com.hisense.juconnect.app_device.activity;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.hisense.connect_life.core.base.BaseVmActivity;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.EventBusConstKt;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.core.widget.IconFontView;
import com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo;
import com.hisense.juconnect.app_device.R$color;
import com.hisense.juconnect.app_device.R$drawable;
import com.hisense.juconnect.app_device.R$id;
import com.hisense.juconnect.app_device.R$layout;
import com.hisense.juconnect.app_device.R$string;
import com.hisense.juconnect.app_device.viewmodel.DeviceViewModel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p429r.p460b.p461a.p462a.C7516r;
import p040c.p429r.p460b.p461a.p462a.C7528x;

@Metadata(mo47990d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0014J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\b\u0010\u0017\u001a\u00020\u0015H\u0014J\b\u0010\u0018\u001a\u00020\u0015H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001e\u0010\r\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\t¨\u0006\u0019"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/activity/NameApplianceActivity;", "Lcom/hisense/connect_life/core/base/BaseVmActivity;", "Lcom/hisense/juconnect/app_device/viewmodel/DeviceViewModel;", "()V", "applianceName", "", "getApplianceName", "()Ljava/lang/String;", "setApplianceName", "(Ljava/lang/String;)V", "deviceId", "getDeviceId", "setDeviceId", "wifiId", "getWifiId", "setWifiId", "bindLayout", "", "initViewModelClz", "Ljava/lang/Class;", "initWidgets", "", "setEmptyEditTextShow", "setListeners", "subscribeObservable", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Route(path = "/device/nameApplianceActivity")
/* compiled from: NameApplianceActivity.kt */
public final class NameApplianceActivity extends BaseVmActivity<DeviceViewModel> {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @Autowired(name = "applianceName")
    public String applianceName;
    @Autowired(name = "deviceId")
    public String deviceId;
    @Autowired(name = "wifiId")
    public String wifiId;

    public static final /* synthetic */ DeviceViewModel access$getMViewModel(NameApplianceActivity nameApplianceActivity) {
        return (DeviceViewModel) nameApplianceActivity.getMViewModel();
    }

    /* access modifiers changed from: private */
    public final void setEmptyEditTextShow() {
        if (TextUtils.isEmpty(((EditText) _$_findCachedViewById(R$id.appliance_name)).getText().toString())) {
            ((TextView) _$_findCachedViewById(R$id.user_profile_save)).setTextColor(getColor(R$color.colorText_86));
            ((TextView) _$_findCachedViewById(R$id.user_profile_save)).setBackgroundResource(R$drawable.button_next_unselect_bg);
            ((TextView) _$_findCachedViewById(R$id.user_profile_save)).setEnabled(false);
            ((ImageView) _$_findCachedViewById(R$id.image_circle_red)).setVisibility(0);
            return;
        }
        ((TextView) _$_findCachedViewById(R$id.user_profile_save)).setTextColor(getColor(R$color.colorWhite));
        ((TextView) _$_findCachedViewById(R$id.user_profile_save)).setBackgroundResource(R$drawable.button_next_select_bg);
        ((TextView) _$_findCachedViewById(R$id.user_profile_save)).setEnabled(true);
        ((ImageView) _$_findCachedViewById(R$id.image_circle_red)).setVisibility(8);
    }

    /* renamed from: subscribeObservable$lambda-3  reason: not valid java name */
    public static final void m27120subscribeObservable$lambda3(NameApplianceActivity nameApplianceActivity, Pair pair) {
        Intrinsics.checkNotNullParameter(nameApplianceActivity, "this$0");
        nameApplianceActivity.hideLoading();
        List<DeviceInfo> list = (List) pair.getSecond();
        if (list != null) {
            for (DeviceInfo deviceInfo : list) {
                if (TextUtils.equals(nameApplianceActivity.getWifiId(), deviceInfo.getWifiId())) {
                    nameApplianceActivity.setDeviceId(deviceInfo.getDeviceId());
                }
            }
        }
        ((EditText) nameApplianceActivity._$_findCachedViewById(R$id.appliance_name)).setFocusableInTouchMode(true);
        ((EditText) nameApplianceActivity._$_findCachedViewById(R$id.appliance_name)).setFocusable(true);
        ((EditText) nameApplianceActivity._$_findCachedViewById(R$id.appliance_name)).requestFocus();
    }

    /* renamed from: subscribeObservable$lambda-4  reason: not valid java name */
    public static final void m27121subscribeObservable$lambda4(NameApplianceActivity nameApplianceActivity, Boolean bool) {
        Intrinsics.checkNotNullParameter(nameApplianceActivity, "this$0");
        Intrinsics.checkNotNullExpressionValue(bool, LanguageConstKt.f15954it);
        if (bool.booleanValue()) {
            nameApplianceActivity.finish();
        } else {
            nameApplianceActivity.showString(R$string.fail);
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
        return R$layout.activity_name_appliance;
    }

    @NotNull
    public final String getApplianceName() {
        String str = this.applianceName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(EventBusConstKt.APPLIANCENAME);
        return null;
    }

    @NotNull
    public final String getDeviceId() {
        String str = this.deviceId;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("deviceId");
        return null;
    }

    @NotNull
    public final String getWifiId() {
        String str = this.wifiId;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(EventBusConstKt.WIFIID);
        return null;
    }

    @NotNull
    public Class<DeviceViewModel> initViewModelClz() {
        return DeviceViewModel.class;
    }

    public void initWidgets() {
        TextView textView = (TextView) _$_findCachedViewById(R$id.top_title);
        Intrinsics.checkNotNullExpressionValue(textView, "top_title");
        textView.setVisibility(8);
        ((IconFontView) _$_findCachedViewById(R$id.top_back)).setText(getString(R$string.btn_main_close));
        String applianceName2 = getApplianceName();
        if (applianceName2 != null) {
            ((EditText) _$_findCachedViewById(R$id.appliance_name)).setText(applianceName2);
        }
        setEmptyEditTextShow();
        showLoading();
        ((EditText) _$_findCachedViewById(R$id.appliance_name)).setFocusable(false);
        ((EditText) _$_findCachedViewById(R$id.appliance_name)).setFocusableInTouchMode(false);
        ((DeviceViewModel) getMViewModel()).getApplianceListWithProperty(false);
    }

    public final void setApplianceName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.applianceName = str;
    }

    public final void setDeviceId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceId = str;
    }

    public void setListeners() {
        IconFontView iconFontView = (IconFontView) _$_findCachedViewById(R$id.top_back);
        Intrinsics.checkNotNullExpressionValue(iconFontView, "top_back");
        JuConnectExtKt.singleClickListener(iconFontView, new NameApplianceActivity$setListeners$1(this));
        TextView textView = (TextView) _$_findCachedViewById(R$id.user_profile_save);
        Intrinsics.checkNotNullExpressionValue(textView, "user_profile_save");
        JuConnectExtKt.singleClickListener(textView, new NameApplianceActivity$setListeners$2(this));
        ((EditText) _$_findCachedViewById(R$id.appliance_name)).addTextChangedListener(new NameApplianceActivity$setListeners$3(this));
    }

    public final void setWifiId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.wifiId = str;
    }

    public void subscribeObservable() {
        super.subscribeObservable();
        ((DeviceViewModel) getMViewModel()).getApplListLiveData().observe(this, new C7516r(this));
        ((DeviceViewModel) getMViewModel()).getUpdateDeviceLiveData().observe(this, new C7528x(this));
    }
}
