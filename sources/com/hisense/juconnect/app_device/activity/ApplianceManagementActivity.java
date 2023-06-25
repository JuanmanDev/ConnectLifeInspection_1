package com.hisense.juconnect.app_device.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.hisense.connect_life.core.base.BaseVmActivity;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.Paths;
import com.hisense.connect_life.core.utils.LogUtilsShen;
import com.hisense.connect_life.core.widget.IconFontView;
import com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo;
import com.hisense.connect_life.hismart.networks.request.device.model.OnlineStatus;
import com.hisense.connect_life.hismart.networks.request.message.MsgObserverViewModel;
import com.hisense.connect_life.hismart.networks.request.message.model.WifiMessage;
import com.hisense.juconnect.app_device.R$color;
import com.hisense.juconnect.app_device.R$id;
import com.hisense.juconnect.app_device.R$layout;
import com.hisense.juconnect.app_device.R$string;
import com.hisense.juconnect.app_device.adapter.ApplianceSettingAdapter;
import com.hisense.juconnect.app_device.viewmodel.DeviceViewModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p429r.p460b.p461a.p462a.C7502k;
import p040c.p429r.p460b.p461a.p462a.C7509n0;
import p040c.p429r.p460b.p461a.p462a.C7521t0;
import p040c.p429r.p460b.p461a.p462a.C7530y;
import p040c.p429r.p460b.p461a.p462a.C7531y0;
import p687n.p688a.p689a.C9818b;
import pub.devrel.easypermissions.EasyPermissions;

@Metadata(mo47990d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0011\u001a\u00020\u0005H\u0014J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0013H\u0002J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0013H\u0014J\u0012\u0010\u001b\u001a\u00020\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u0013H\u0014J\u0010\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020!H\u0007J\u001e\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u00052\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\tH\u0016J\u001e\u0010&\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u00052\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\tH\u0016J\b\u0010'\u001a\u00020\u0013H\u0002J\b\u0010(\u001a\u00020\u0013H\u0014J\b\u0010)\u001a\u00020\u0013H\u0016J\u0010\u0010*\u001a\u00020\u00132\u0006\u0010+\u001a\u00020,H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006-"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/activity/ApplianceManagementActivity;", "Lcom/hisense/connect_life/core/base/BaseVmActivity;", "Lcom/hisense/juconnect/app_device/viewmodel/DeviceViewModel;", "()V", "GOTO_SETTING_CODE", "", "applianceSettingAdapter", "Lcom/hisense/juconnect/app_device/adapter/ApplianceSettingAdapter;", "deviceList", "", "Lcom/hisense/connect_life/hismart/networks/request/device/model/DeviceInfo;", "msgObserverViewModel", "Lcom/hisense/connect_life/hismart/networks/request/message/MsgObserverViewModel;", "getMsgObserverViewModel", "()Lcom/hisense/connect_life/hismart/networks/request/message/MsgObserverViewModel;", "msgObserverViewModel$delegate", "Lkotlin/Lazy;", "bindLayout", "checkCameraPer", "", "getApplianceList", "showDialog", "", "gotoBindDevice", "initViewModelClz", "Ljava/lang/Class;", "initWidgets", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onEvent", "message", "", "onPermissionsDenied", "requestCode", "perms", "", "onPermissionsGranted", "setEmptyViewShow", "setListeners", "subscribeObservable", "updateWifiStatus", "wifiMessage", "Lcom/hisense/connect_life/hismart/networks/request/message/model/WifiMessage;", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Route(path = "/device/ApplianceManagementActivity")
/* compiled from: ApplianceManagementActivity.kt */
public final class ApplianceManagementActivity extends BaseVmActivity<DeviceViewModel> {
    public final int GOTO_SETTING_CODE = 1001;
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public ApplianceSettingAdapter applianceSettingAdapter;
    @NotNull
    public List<DeviceInfo> deviceList = new ArrayList();
    @NotNull
    public final Lazy msgObserverViewModel$delegate = LazyKt__LazyJVMKt.lazy(new ApplianceManagementActivity$msgObserverViewModel$2(this));

    private final void checkCameraPer() {
        if (EasyPermissions.m26767a(this, "android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE")) {
            gotoBindDevice();
            return;
        }
        C9818b.C9820b bVar = new C9818b.C9820b((Activity) this, 1, "android.permission.CAMERA");
        bVar.mo50749d(R$string.pt_camera);
        bVar.mo50748c(R$string.rationale_ask_ok);
        bVar.mo50747b(R$string.camera_cancel);
        C9818b a = bVar.mo50746a();
        Intrinsics.checkNotNullExpressionValue(a, "Builder(this, CODE_PERMI…\n                .build()");
        EasyPermissions.m26771e(a);
    }

    private final void getApplianceList(boolean z) {
        if (z) {
            showLoading();
        }
        ((DeviceViewModel) getMViewModel()).getApplianceListWithProperty(z);
    }

    private final MsgObserverViewModel getMsgObserverViewModel() {
        return (MsgObserverViewModel) this.msgObserverViewModel$delegate.getValue();
    }

    private final void gotoBindDevice() {
        JuConnectExtKt.navigation(Paths.Device.AddNewWifiInstructionsActivity);
    }

    private final void setEmptyViewShow() {
        if (this.deviceList.isEmpty()) {
            ((TextView) _$_findCachedViewById(R$id.empty_view)).setVisibility(0);
            ((RecyclerView) _$_findCachedViewById(R$id.apliance_management_rv)).setVisibility(8);
            return;
        }
        ((TextView) _$_findCachedViewById(R$id.empty_view)).setVisibility(8);
        ((RecyclerView) _$_findCachedViewById(R$id.apliance_management_rv)).setVisibility(0);
    }

    /* renamed from: setListeners$lambda-1  reason: not valid java name */
    public static final void m27095setListeners$lambda1(ApplianceManagementActivity applianceManagementActivity) {
        Intrinsics.checkNotNullParameter(applianceManagementActivity, "this$0");
        applianceManagementActivity.getApplianceList(false);
    }

    /* renamed from: setListeners$lambda-2  reason: not valid java name */
    public static final void m27096setListeners$lambda2(View view) {
        JuConnectExtKt.navigation(Paths.Device.AddApplianceFirstActivity);
    }

    /* renamed from: setListeners$lambda-4  reason: not valid java name */
    public static final void m27097setListeners$lambda4(ApplianceManagementActivity applianceManagementActivity, WifiMessage wifiMessage) {
        Intrinsics.checkNotNullParameter(applianceManagementActivity, "this$0");
        if (wifiMessage != null) {
            applianceManagementActivity.updateWifiStatus(wifiMessage);
        }
    }

    /* renamed from: subscribeObservable$lambda-7  reason: not valid java name */
    public static final void m27098subscribeObservable$lambda7(ApplianceManagementActivity applianceManagementActivity, Pair pair) {
        Intrinsics.checkNotNullParameter(applianceManagementActivity, "this$0");
        applianceManagementActivity.hideLoading();
        if (((SwipeRefreshLayout) applianceManagementActivity._$_findCachedViewById(R$id.appliance_setting_srl)).isRefreshing()) {
            ((SwipeRefreshLayout) applianceManagementActivity._$_findCachedViewById(R$id.appliance_setting_srl)).setRefreshing(false);
        }
        List<DeviceInfo> list = (List) pair.getSecond();
        if (list != null) {
            applianceManagementActivity.deviceList.clear();
            for (DeviceInfo add : list) {
                applianceManagementActivity.deviceList.add(add);
            }
        }
        ApplianceSettingAdapter applianceSettingAdapter2 = applianceManagementActivity.applianceSettingAdapter;
        if (applianceSettingAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("applianceSettingAdapter");
            applianceSettingAdapter2 = null;
        }
        applianceSettingAdapter2.notifyDataSetChanged();
        applianceManagementActivity.setEmptyViewShow();
    }

    /* renamed from: subscribeObservable$lambda-9  reason: not valid java name */
    public static final void m27099subscribeObservable$lambda9(ApplianceManagementActivity applianceManagementActivity, Integer num) {
        Intrinsics.checkNotNullParameter(applianceManagementActivity, "this$0");
        if (num != null) {
            int intValue = num.intValue();
            applianceManagementActivity.getApplianceList(true);
            LogUtilsShen.Companion.mo39138e(Intrinsics.stringPlus("mViewModel._refreshLiveData this: ", Integer.valueOf(intValue)));
        }
    }

    private final void updateWifiStatus(WifiMessage wifiMessage) {
        int size = this.deviceList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            DeviceInfo deviceInfo = this.deviceList.get(i);
            if (Intrinsics.areEqual((Object) deviceInfo.getWifiId(), (Object) wifiMessage.getWifiid())) {
                deviceInfo.setOnlineStatus(OnlineStatus.Companion.fromType(wifiMessage.getOnlinestats()));
                ApplianceSettingAdapter applianceSettingAdapter2 = this.applianceSettingAdapter;
                if (applianceSettingAdapter2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("applianceSettingAdapter");
                    applianceSettingAdapter2 = null;
                }
                applianceSettingAdapter2.notifyItemChanged(i);
            }
            i = i2;
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
        return R$layout.activity_apliance_management;
    }

    @NotNull
    public Class<DeviceViewModel> initViewModelClz() {
        return DeviceViewModel.class;
    }

    public void initWidgets() {
        ((TextView) _$_findCachedViewById(R$id.top_title)).setText(getString(R$string.more_appliance_manager));
        ((IconFontView) _$_findCachedViewById(R$id.top_ic)).setText(getString(R$string.btn_main_add));
        ((IconFontView) _$_findCachedViewById(R$id.top_ic)).setTextColor(getColor(R$color.colorBlack));
        ((RecyclerView) _$_findCachedViewById(R$id.apliance_management_rv)).setLayoutManager(new LinearLayoutManager(this));
        ((RecyclerView) _$_findCachedViewById(R$id.apliance_management_rv)).setNestedScrollingEnabled(false);
        List<DeviceInfo> list = this.deviceList;
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            if (Intrinsics.areEqual((Object) ((DeviceInfo) next).getDeviceTypeCode(), (Object) "001")) {
                arrayList.add(next);
            }
        }
        List<DeviceInfo> asMutableList = TypeIntrinsics.asMutableList(arrayList);
        this.deviceList = asMutableList;
        this.applianceSettingAdapter = new ApplianceSettingAdapter(asMutableList);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R$id.apliance_management_rv);
        ApplianceSettingAdapter applianceSettingAdapter2 = this.applianceSettingAdapter;
        ApplianceSettingAdapter applianceSettingAdapter3 = null;
        if (applianceSettingAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("applianceSettingAdapter");
            applianceSettingAdapter2 = null;
        }
        recyclerView.setAdapter(applianceSettingAdapter2);
        ApplianceSettingAdapter applianceSettingAdapter4 = this.applianceSettingAdapter;
        if (applianceSettingAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("applianceSettingAdapter");
        } else {
            applianceSettingAdapter3 = applianceSettingAdapter4;
        }
        applianceSettingAdapter3.notifyDataSetChanged();
        setEmptyViewShow();
        getApplianceList(true);
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        EventBus.getDefault().register(this);
    }

    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "message");
        if (Intrinsics.areEqual(obj, (Object) 102)) {
            LogUtilsShen.Companion.mo39138e("onEvent: ADD_SUCCESS");
            ((DeviceViewModel) getMViewModel()).postRefreshData();
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
        if (i == 1) {
            gotoBindDevice();
        }
    }

    public void setListeners() {
        IconFontView iconFontView = (IconFontView) _$_findCachedViewById(R$id.top_back);
        Intrinsics.checkNotNullExpressionValue(iconFontView, "top_back");
        JuConnectExtKt.singleClickListener(iconFontView, new ApplianceManagementActivity$setListeners$1(this));
        ((IconFontView) _$_findCachedViewById(R$id.top_ic)).setVisibility(8);
        IconFontView iconFontView2 = (IconFontView) _$_findCachedViewById(R$id.top_ic);
        Intrinsics.checkNotNullExpressionValue(iconFontView2, "top_ic");
        JuConnectExtKt.singleClickListener(iconFontView2, ApplianceManagementActivity$setListeners$2.INSTANCE);
        ((SwipeRefreshLayout) _$_findCachedViewById(R$id.appliance_setting_srl)).setOnRefreshListener(new C7530y(this));
        ((LinearLayout) _$_findCachedViewById(R$id.apliance_management_add)).setOnClickListener(C7531y0.f14229e);
        ApplianceSettingAdapter applianceSettingAdapter2 = this.applianceSettingAdapter;
        if (applianceSettingAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("applianceSettingAdapter");
            applianceSettingAdapter2 = null;
        }
        applianceSettingAdapter2.setOnItemClickListener(new ApplianceManagementActivity$setListeners$5(this));
        getMsgObserverViewModel().getWifiMsgLiveData().observe(this, new C7509n0(this));
    }

    public void subscribeObservable() {
        ((DeviceViewModel) getMViewModel()).getApplListLiveData().observe(this, new C7521t0(this));
        ((DeviceViewModel) getMViewModel()).get_refreshLiveData().observe(this, new C7502k(this));
    }
}
