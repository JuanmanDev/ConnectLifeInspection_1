package com.hisense.juconnect.app_device.activity;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.view.PointerIconCompat;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.hisense.connect_life.core.base.BaseActivity;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.Paths;
import com.hisense.connect_life.core.widget.IconFontView;
import com.hisense.juconnect.app_device.R$id;
import com.hisense.juconnect.app_device.R$layout;
import com.hisense.juconnect.app_device.R$string;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0004H\u0014J\n\u0010\u0012\u001a\u0004\u0018\u00010\fH\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0014J\"\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\u001e\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u001dH\u0016J\u001e\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u001dH\u0016J\b\u0010\u001f\u001a\u00020\u0014H\u0014R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/activity/SingleZoneConnectionSettingWifiActivity;", "Lcom/hisense/connect_life/core/base/BaseActivity;", "()V", "REQUEST_WIFI_BT", "", "getREQUEST_WIFI_BT$app_device_release", "()I", "SINGLE_QR_CODE_APPLIANCE_IDENTIFICATION_REQUEST_CODE", "SINGLE_QR_CODE_REQUEST_CODE", "blutooth", "Landroid/bluetooth/BluetoothAdapter;", "btMac", "", "goToAddSingleRequestCode", "wifiMac", "wifiManager", "Landroid/net/wifi/WifiManager;", "bindLayout", "getConnectWifiSsid", "gotoBindDevice", "", "initWidgets", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onPermissionsDenied", "perms", "", "onPermissionsGranted", "setListeners", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Route(path = "/device/SingleZoneConnectionSettingWifiActivity")
/* compiled from: SingleZoneConnectionSettingWifiActivity.kt */
public final class SingleZoneConnectionSettingWifiActivity extends BaseActivity {
    public final int REQUEST_WIFI_BT = 3;
    public final int SINGLE_QR_CODE_APPLIANCE_IDENTIFICATION_REQUEST_CODE = PointerIconCompat.TYPE_HELP;
    public final int SINGLE_QR_CODE_REQUEST_CODE = 1002;
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @Nullable
    public BluetoothAdapter blutooth;
    @Nullable
    public String btMac;
    public final int goToAddSingleRequestCode = 1001;
    @Nullable
    public String wifiMac;
    @Nullable
    public WifiManager wifiManager;

    /* access modifiers changed from: private */
    public final String getConnectWifiSsid() {
        Object systemService = getApplicationContext().getSystemService("wifi");
        if (systemService != null) {
            WifiInfo connectionInfo = ((WifiManager) systemService).getConnectionInfo();
            connectionInfo.toString();
            connectionInfo.getSSID();
            return connectionInfo.getSSID();
        }
        throw new NullPointerException("null cannot be cast to non-null type android.net.wifi.WifiManager");
    }

    private final void gotoBindDevice() {
        JuConnectExtKt.navigationForResult(Paths.Device.AddNewWifiInstructionsActivity, this, 1001);
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
        return R$layout.activity_single_zone_connection_setting_wifi;
    }

    public final int getREQUEST_WIFI_BT$app_device_release() {
        return this.REQUEST_WIFI_BT;
    }

    public void initWidgets() {
        ((TextView) _$_findCachedViewById(R$id.top_title)).setText(getString(R$string.add_appliance_new));
    }

    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == this.goToAddSingleRequestCode) {
            finish();
        }
        if (i2 != -1 || i != this.SINGLE_QR_CODE_REQUEST_CODE || intent == null) {
            return;
        }
        if (!intent.getBooleanExtra("data", true)) {
            showString("绑定失败");
        } else {
            showString("绑定成功");
        }
    }

    public void onPermissionsDenied(int i, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "perms");
        super.onPermissionsDenied(i, list);
        if (i == 1) {
            showString(R$string.pt_camera);
        }
    }

    public void onPermissionsGranted(int i, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "perms");
        super.onPermissionsGranted(i, list);
    }

    public void setListeners() {
        IconFontView iconFontView = (IconFontView) _$_findCachedViewById(R$id.top_back);
        Intrinsics.checkNotNullExpressionValue(iconFontView, "top_back");
        JuConnectExtKt.singleClickListener(iconFontView, new SingleZoneConnectionSettingWifiActivity$setListeners$1(this));
        Button button = (Button) _$_findCachedViewById(R$id.bt_single_zone_connect_setup_next_setting_wifi);
        Intrinsics.checkNotNullExpressionValue(button, "bt_single_zone_connect_setup_next_setting_wifi");
        JuConnectExtKt.singleClickListener(button, new SingleZoneConnectionSettingWifiActivity$setListeners$2(this));
        Button button2 = (Button) _$_findCachedViewById(R$id.bt_open_wifi_settings);
        Intrinsics.checkNotNullExpressionValue(button2, "bt_open_wifi_settings");
        JuConnectExtKt.singleClickListener(button2, new SingleZoneConnectionSettingWifiActivity$setListeners$3(this));
    }
}
