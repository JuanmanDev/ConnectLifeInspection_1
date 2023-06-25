package com.hisense.juconnect.app_device.activity;

import android.app.Activity;
import com.alibaba.android.arouter.facade.Postcard;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.EventBusConstKt;
import com.hisense.connect_life.core.global.HtmlPaths;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.global.Paths;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.hismart.networks.request.device.DeviceCache;
import com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo;
import com.hisense.connect_life.hismart.networks.request.device.model.OnlineStatus;
import com.hisense.juconnect.app_device.adapter.ApplianceSettingAdapter;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p040c.p041a.p042a.p043a.p045b.C1337a;

@Metadata(mo47990d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, mo47991d2 = {"com/hisense/juconnect/app_device/activity/ApplianceManagementActivity$setListeners$5", "Lcom/hisense/juconnect/app_device/adapter/ApplianceSettingAdapter$OnItemClickListener;", "onItemClick", "", "position", "", "data", "Lcom/hisense/connect_life/hismart/networks/request/device/model/DeviceInfo;", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ApplianceManagementActivity.kt */
public final class ApplianceManagementActivity$setListeners$5 implements ApplianceSettingAdapter.OnItemClickListener {
    public final /* synthetic */ ApplianceManagementActivity this$0;

    public ApplianceManagementActivity$setListeners$5(ApplianceManagementActivity applianceManagementActivity) {
        this.this$0 = applianceManagementActivity;
    }

    public void onItemClick(int i, @NotNull DeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "data");
        String str = OnlineStatus.CONNECTED == deviceInfo.getOnlineStatus() ? "1" : "2";
        ApplianceManagementActivity applianceManagementActivity = this.this$0;
        int access$getGOTO_SETTING_CODE$p = applianceManagementActivity.GOTO_SETTING_CODE;
        ApplianceManagementActivity applianceManagementActivity2 = this.this$0;
        Postcard a = C1337a.m211c().mo15011a(Paths.App.SettingWineWebViewActivity);
        a.withString("deviceId", deviceInfo.getDeviceId()).withString(KeyConst.KEY_TARGET_URL, JuConnectExtKt.buildAssetUrl(HtmlPaths.DEVICE_SETTINGS2, applianceManagementActivity2, LanguageConstKt.f15944en, MapsKt__MapsKt.mapOf(TuplesKt.m25743to("deviceId", deviceInfo.getDeviceId()), TuplesKt.m25743to(EventBusConstKt.WIFIID, deviceInfo.getWifiId()), TuplesKt.m25743to("onlineStatus", str), TuplesKt.m25743to("oneZoneFlag", DeviceCache.Companion.getInstance().getOneZoneFlagByFeatureCode(deviceInfo.getDeviceId())))));
        a.navigation((Activity) applianceManagementActivity, access$getGOTO_SETTING_CODE$p);
    }
}
