package com.hisense.juconnect.app_device.activity;

import android.content.Intent;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.PointerIconCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.hisense.connect_life.core.base.BaseVmActivity;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.Paths;
import com.hisense.connect_life.core.widget.IconFontView;
import com.hisense.juconnect.app_device.R$id;
import com.hisense.juconnect.app_device.R$layout;
import com.hisense.juconnect.app_device.R$string;
import com.hisense.juconnect.app_device.adapter.WifiListAdapter;
import com.hisense.juconnect.app_device.viewmodel.DeviceViewModel;
import com.hisense.juconnect.app_device.widget.MultiModeDialog;
import com.hisense.juconnect.app_socket.connect.order.SearchWifiReplyOrder;
import com.hisense.juconnect.app_socket.utils.ThreadUtils;
import com.juconnect.connectlife.model.WifiInfo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import okhttp3.internal.p700ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u001d\u001a\u00020\u0005H\u0014J\u0011\u0010\u001e\u001a\u00020\u001fH@ø\u0001\u0000¢\u0006\u0002\u0010 J\b\u0010!\u001a\u00020\"H\u0002J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020$H\u0016J\b\u0010%\u001a\u00020\"H\u0014J\"\u0010&\u001a\u00020\"2\u0006\u0010'\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u00052\b\u0010)\u001a\u0004\u0018\u00010*H\u0014J\u001e\u0010+\u001a\u00020\"2\u0006\u0010'\u001a\u00020\u00052\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00160\u001bH\u0016J\u001e\u0010-\u001a\u00020\"2\u0006\u0010'\u001a\u00020\u00052\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00160\u001bH\u0016J\b\u0010.\u001a\u00020\"H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u000e¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006/"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/activity/SingleZoneApplianceIdentificationActivity;", "Lcom/hisense/connect_life/core/base/BaseVmActivity;", "Lcom/hisense/juconnect/app_device/viewmodel/DeviceViewModel;", "()V", "SINGLE_QR_CODE_CONNECTION_SETUP_REQUEST_CODE", "", "SINGLE_QR_CODE_OK", "SINGLE_QR_CODE_PAIR_APPLIANCE_REQUEST_CODE", "SINGLE_QR_CODE_REQUEST_CODE", "SINGLE_QR_CODE_SEARCH_WIFI_RESULT", "SingleZoneConnectionSetupRightActivity_REQUEST_CODE", "arrayAdapter1", "Lcom/hisense/juconnect/app_device/adapter/WifiListAdapter;", "dialog", "Lcom/hisense/juconnect/app_device/widget/MultiModeDialog;", "goToAddSingleRequestCode", "handle", "Landroid/os/Handler;", "getHandle", "()Landroid/os/Handler;", "modeList", "Ljava/util/ArrayList;", "", "myBssid", "threadUtils", "Lcom/hisense/juconnect/app_socket/utils/ThreadUtils;", "wifiList", "", "Lcom/juconnect/connectlife/model/WifiInfo;", "bindLayout", "getWifiList", "Lcom/hisense/juconnect/app_socket/connect/order/SearchWifiReplyOrder;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "gotoBindDevice", "", "initViewModelClz", "Ljava/lang/Class;", "initWidgets", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onPermissionsDenied", "perms", "onPermissionsGranted", "setListeners", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Route(path = "/device/SingleZoneApplianceIdentificationActivity")
/* compiled from: SingleZoneApplianceIdentificationActivity.kt */
public final class SingleZoneApplianceIdentificationActivity extends BaseVmActivity<DeviceViewModel> {
    public final int SINGLE_QR_CODE_CONNECTION_SETUP_REQUEST_CODE = PointerIconCompat.TYPE_HELP;
    public final int SINGLE_QR_CODE_OK = 1000;
    public final int SINGLE_QR_CODE_PAIR_APPLIANCE_REQUEST_CODE = PointerIconCompat.TYPE_WAIT;
    public final int SINGLE_QR_CODE_REQUEST_CODE = 1002;
    public final int SINGLE_QR_CODE_SEARCH_WIFI_RESULT = WebSocketProtocol.CLOSE_NO_STATUS_CODE;
    public final int SingleZoneConnectionSetupRightActivity_REQUEST_CODE = WebSocketProtocol.CLOSE_NO_STATUS_CODE;
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public WifiListAdapter arrayAdapter1;
    @NotNull
    public final MultiModeDialog dialog = new MultiModeDialog();
    public final int goToAddSingleRequestCode = 1001;
    @NotNull
    public final Handler handle = new SingleZoneApplianceIdentificationActivity$handle$1(this);
    @NotNull
    public final ArrayList<String> modeList = new ArrayList<>();
    @NotNull
    public String myBssid = "";
    @NotNull
    public ThreadUtils threadUtils = ThreadUtils.Companion.getInstance();
    @NotNull
    public List<WifiInfo> wifiList = new ArrayList();

    /* access modifiers changed from: private */
    public final Object getWifiList(Continuation<? super SearchWifiReplyOrder> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new SingleZoneApplianceIdentificationActivity$getWifiList$2(this, (Continuation<? super SingleZoneApplianceIdentificationActivity$getWifiList$2>) null), continuation);
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
        return R$layout.activity_single_zone_appliance_identification;
    }

    @NotNull
    public final Handler getHandle() {
        return this.handle;
    }

    @NotNull
    public Class<DeviceViewModel> initViewModelClz() {
        return DeviceViewModel.class;
    }

    public void initWidgets() {
        ((TextView) _$_findCachedViewById(R$id.top_title)).setText(getString(R$string.add_appliance_new));
        WifiListAdapter wifiListAdapter = null;
        Job unused = BuildersKt__Builders_commonKt.launch$default(this, Dispatchers.getMain(), (CoroutineStart) null, new SingleZoneApplianceIdentificationActivity$initWidgets$1(this, (Continuation<? super SingleZoneApplianceIdentificationActivity$initWidgets$1>) null), 2, (Object) null);
        ((RecyclerView) _$_findCachedViewById(R$id.lv_wifi_ssid)).setLayoutManager(new LinearLayoutManager(this));
        this.arrayAdapter1 = new WifiListAdapter(this, this.wifiList);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R$id.lv_wifi_ssid);
        WifiListAdapter wifiListAdapter2 = this.arrayAdapter1;
        if (wifiListAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("arrayAdapter1");
        } else {
            wifiListAdapter = wifiListAdapter2;
        }
        recyclerView.setAdapter(wifiListAdapter);
        ((TextView) _$_findCachedViewById(R$id.et_connection_setup_wifi_type)).setText("WPA");
        MultiModeDialog multiModeDialog = this.dialog;
        if (multiModeDialog != null) {
            multiModeDialog.setCurrentItem(1);
        }
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(R$id.linear_wifi_type);
        Intrinsics.checkNotNullExpressionValue(linearLayout, "linear_wifi_type");
        JuConnectExtKt.singleClickListener(linearLayout, new SingleZoneApplianceIdentificationActivity$initWidgets$2(this));
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
        JuConnectExtKt.singleClickListener(iconFontView, new SingleZoneApplianceIdentificationActivity$setListeners$1(this));
        Button button = (Button) _$_findCachedViewById(R$id.bt_single_zone_connect_setup_connect);
        Intrinsics.checkNotNullExpressionValue(button, "bt_single_zone_connect_setup_connect");
        JuConnectExtKt.singleClickListener(button, new SingleZoneApplianceIdentificationActivity$setListeners$2(this));
        ImageView imageView = (ImageView) _$_findCachedViewById(R$id.iv_connection_setup_wifi_name);
        Intrinsics.checkNotNullExpressionValue(imageView, "iv_connection_setup_wifi_name");
        JuConnectExtKt.singleClickListener(imageView, new SingleZoneApplianceIdentificationActivity$setListeners$3(this));
        WifiListAdapter wifiListAdapter = this.arrayAdapter1;
        if (wifiListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("arrayAdapter1");
            wifiListAdapter = null;
        }
        wifiListAdapter.setOnItemClickListener(new SingleZoneApplianceIdentificationActivity$setListeners$4(this));
    }
}
