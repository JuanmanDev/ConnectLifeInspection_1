package com.hisense.juconnect.app_device.activity;

import android.content.Intent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.gson.Gson;
import com.hisense.connect_life.core.base.BaseVmActivity;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.EventBusConstKt;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.global.Paths;
import com.hisense.connect_life.core.utils.SPUtils;
import com.hisense.connect_life.core.widget.IconFontView;
import com.hisense.connect_life.hismart.networks.request.account.model.UpGps;
import com.hisense.juconnect.app_device.R$id;
import com.hisense.juconnect.app_device.R$layout;
import com.hisense.juconnect.app_device.R$string;
import com.hisense.juconnect.app_device.viewmodel.DeviceViewModel;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p041a.p042a.p043a.p045b.C1337a;
import p040c.p429r.p460b.p461a.p462a.C7532z;

@Metadata(mo47990d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u0005H\u0014J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H\u0002J\b\u0010\u000e\u001a\u00020\fH\u0002J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\fH\u0014J\"\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\b\u0010\u0017\u001a\u00020\fH\u0014J\b\u0010\u0018\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XD¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007XD¢\u0006\u0002\n\u0000¨\u0006\u0019"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/activity/AddApplianceSinglePairActivity;", "Lcom/hisense/connect_life/core/base/BaseVmActivity;", "Lcom/hisense/juconnect/app_device/viewmodel/DeviceViewModel;", "()V", "goToSoftApRequestCode", "", "gpsInfo", "", "nickName", "wifiId", "bindLayout", "gotoAppliancePairedSuccess", "", "deviceId", "gotoSoftAp", "initViewModelClz", "Ljava/lang/Class;", "initWidgets", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "setListeners", "subscribeObservable", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Route(path = "/device/AddApplianceSinglePairActivity")
/* compiled from: AddApplianceSinglePairActivity.kt */
public final class AddApplianceSinglePairActivity extends BaseVmActivity<DeviceViewModel> {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public final int goToSoftApRequestCode = 1001;
    @NotNull
    public String gpsInfo = "";
    @NotNull
    public final String nickName = "pindTestNickName";
    @NotNull
    public final String wifiId = "865002100010002000200000070a32573207";

    private final void gotoAppliancePairedSuccess(String str) {
        Postcard a = C1337a.m211c().mo15011a(Paths.Device.AppliancePairedSuccessActivity);
        a.withString(EventBusConstKt.APPLIANCENAME, this.nickName).withString(EventBusConstKt.WIFIID, this.wifiId).withString("deviceId", str);
        a.navigation();
    }

    /* access modifiers changed from: private */
    public final void gotoSoftAp() {
    }

    /* renamed from: subscribeObservable$lambda-0  reason: not valid java name */
    public static final void m27093subscribeObservable$lambda0(AddApplianceSinglePairActivity addApplianceSinglePairActivity, Pair pair) {
        Intrinsics.checkNotNullParameter(addApplianceSinglePairActivity, "this$0");
        if (((Boolean) pair.getFirst()).booleanValue()) {
            addApplianceSinglePairActivity.gotoAppliancePairedSuccess((String) pair.getSecond());
        } else {
            addApplianceSinglePairActivity.showString("绑定失败！");
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
        return R$layout.activity_add_appliance_single_pair;
    }

    @NotNull
    public Class<DeviceViewModel> initViewModelClz() {
        return DeviceViewModel.class;
    }

    public void initWidgets() {
        ((TextView) _$_findCachedViewById(R$id.top_title)).setText(getString(R$string.add_appliance_new));
        SPUtils sPUtils = SPUtils.INSTANCE;
        String json = new Gson().toJson((Object) new UpGps((String) null, (String) null, 3, (DefaultConstructorMarker) null), (Type) UpGps.class);
        Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(\n         …Gps::class.java\n        )");
        this.gpsInfo = String.valueOf(sPUtils.get(KeyConst.KEY_USER_GPS_INFO, json));
    }

    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == this.goToSoftApRequestCode) {
            setResult(-1);
            finish();
        }
    }

    public void setListeners() {
        IconFontView iconFontView = (IconFontView) _$_findCachedViewById(R$id.top_back);
        Intrinsics.checkNotNullExpressionValue(iconFontView, "top_back");
        JuConnectExtKt.singleClickListener(iconFontView, new AddApplianceSinglePairActivity$setListeners$1(this));
        RelativeLayout relativeLayout = (RelativeLayout) _$_findCachedViewById(R$id.rv_network_setup);
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "rv_network_setup");
        JuConnectExtKt.singleClickListener(relativeLayout, new AddApplianceSinglePairActivity$setListeners$2(this));
    }

    public void subscribeObservable() {
        super.subscribeObservable();
        ((DeviceViewModel) getMViewModel()).getBindDeviceLiveData().observe(this, new C7532z(this));
    }
}
