package com.hisense.juconnect.app_device.activity;

import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.hisense.connect_life.core.base.BaseVmActivity;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.widget.IconFontView;
import com.hisense.connect_life.hismart.networks.request.device.DeviceCache;
import com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo;
import com.hisense.connect_life.hismart.networks.request.device.model.OnlineStatus;
import com.hisense.connect_life.hismart.networks.request.device.model.UpgradeInfo;
import com.hisense.juconnect.app_device.R$id;
import com.hisense.juconnect.app_device.R$layout;
import com.hisense.juconnect.app_device.R$string;
import com.hisense.juconnect.app_device.adapter.FirmwareUpdateAdapter;
import com.hisense.juconnect.app_device.viewmodel.DeviceViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p429r.p460b.p461a.p462a.C7482a0;
import p040c.p429r.p460b.p461a.p462a.C7510o;
import p040c.p429r.p460b.p461a.p462a.C7525v0;

@Metadata(mo47990d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0015\u001a\u00020\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0014H\u0002J\b\u0010\u001b\u001a\u00020\u0018H\u0002J\u0010\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0014H\u0002J\b\u0010\u001d\u001a\u00020\u0018H\u0002J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0018H\u0014J\b\u0010!\u001a\u00020\u0018H\u0002J\u0010\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020\u0018H\u0014J\b\u0010&\u001a\u00020\u0018H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R.\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00060\rj\b\u0012\u0004\u0012\u00020\u0006`\u000e8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/activity/FirmwareUpdateActivity;", "Lcom/hisense/connect_life/core/base/BaseVmActivity;", "Lcom/hisense/juconnect/app_device/viewmodel/DeviceViewModel;", "()V", "dataList", "", "Lcom/hisense/connect_life/hismart/networks/request/device/model/UpgradeInfo;", "deviceInfoList", "", "Lcom/hisense/connect_life/hismart/networks/request/device/model/DeviceInfo;", "firmwareUpdateAdapter", "Lcom/hisense/juconnect/app_device/adapter/FirmwareUpdateAdapter;", "upgradeInfoList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getUpgradeInfoList", "()Ljava/util/ArrayList;", "setUpgradeInfoList", "(Ljava/util/ArrayList;)V", "wifiIdsList", "", "bindLayout", "", "checkWifiDeviceVersion", "", "confirmUpgrade", "wifiId", "getApplianceList", "getDeviceNickNameByWifiId", "getWifiIdsList", "initViewModelClz", "Ljava/lang/Class;", "initWidgets", "setDeviceOnlineStatus", "setEmptyViewShow", "isShowEmpty", "", "setListeners", "subscribeObservable", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Route(path = "/device/FirmwareUpdateActivity")
/* compiled from: FirmwareUpdateActivity.kt */
public final class FirmwareUpdateActivity extends BaseVmActivity<DeviceViewModel> {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @NotNull
    public final List<UpgradeInfo> dataList = new ArrayList();
    @Nullable
    public List<DeviceInfo> deviceInfoList;
    public FirmwareUpdateAdapter firmwareUpdateAdapter;
    @Autowired(name = "upgradeInfoList")
    public ArrayList<UpgradeInfo> upgradeInfoList;
    @NotNull
    public final List<String> wifiIdsList = new ArrayList();

    private final void checkWifiDeviceVersion() {
        ((DeviceViewModel) getMViewModel()).otaCheckWifiDeviceVersion(this.wifiIdsList);
    }

    /* access modifiers changed from: private */
    public final void confirmUpgrade(String str) {
        ((DeviceViewModel) getMViewModel()).otaConfirmUpgrade(str);
    }

    private final void getApplianceList() {
        showLoading();
        new Handler().postDelayed(new C7482a0(this), 30000);
        ((DeviceViewModel) getMViewModel()).getApplianceListWithProperty(true);
    }

    /* renamed from: getApplianceList$lambda-7  reason: not valid java name */
    public static final void m27109getApplianceList$lambda7(FirmwareUpdateActivity firmwareUpdateActivity) {
        Intrinsics.checkNotNullParameter(firmwareUpdateActivity, "this$0");
        firmwareUpdateActivity.hideLoading();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r0 = r0.getDeviceNickName();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getDeviceNickNameByWifiId(java.lang.String r2) {
        /*
            r1 = this;
            com.hisense.connect_life.hismart.networks.request.device.DeviceCache$Companion r0 = com.hisense.connect_life.hismart.networks.request.device.DeviceCache.Companion
            com.hisense.connect_life.hismart.networks.request.device.DeviceCache r0 = r0.getInstance()
            com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo r0 = r0.getDeviceByWifiId(r2)
            if (r0 != 0) goto L_0x000d
            goto L_0x0015
        L_0x000d:
            java.lang.String r0 = r0.getDeviceNickName()
            if (r0 != 0) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r2 = r0
        L_0x0015:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.juconnect.app_device.activity.FirmwareUpdateActivity.getDeviceNickNameByWifiId(java.lang.String):java.lang.String");
    }

    private final void getWifiIdsList() {
        for (DeviceInfo wifiId : DeviceCache.Companion.getInstance().getDeviceList()) {
            this.wifiIdsList.add(wifiId.getWifiId());
        }
    }

    private final void setDeviceOnlineStatus() {
        for (UpgradeInfo upgradeInfo : this.dataList) {
            List<DeviceInfo> list = this.deviceInfoList;
            if (list != null) {
                for (DeviceInfo deviceInfo : list) {
                    if (Intrinsics.areEqual((Object) upgradeInfo.getWifiId(), (Object) deviceInfo.getWifiId())) {
                        upgradeInfo.setOnlineStatus(deviceInfo.getOnlineStatus() == OnlineStatus.CONNECTED);
                    }
                }
            }
        }
        FirmwareUpdateAdapter firmwareUpdateAdapter2 = this.firmwareUpdateAdapter;
        if (firmwareUpdateAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("firmwareUpdateAdapter");
            firmwareUpdateAdapter2 = null;
        }
        firmwareUpdateAdapter2.notifyDataSetChanged();
    }

    private final void setEmptyViewShow(boolean z) {
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R$id.tv_firmware_update);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "tv_firmware_update");
        recyclerView.setVisibility(z ^ true ? 0 : 8);
        if (z) {
            ((TextView) _$_findCachedViewById(R$id.tv_firmware_update_title)).setText(getString(R$string.no_firmware_update_title));
        } else {
            ((TextView) _$_findCachedViewById(R$id.tv_firmware_update_title)).setText(getString(R$string.new_firmware_update_title));
        }
    }

    /* renamed from: subscribeObservable$lambda-1  reason: not valid java name */
    public static final void m27110subscribeObservable$lambda1(FirmwareUpdateActivity firmwareUpdateActivity, Pair pair) {
        Intrinsics.checkNotNullParameter(firmwareUpdateActivity, "this$0");
        firmwareUpdateActivity.hideLoading();
        firmwareUpdateActivity.dataList.clear();
        if (!((Collection) pair.getSecond()).isEmpty()) {
            List<UpgradeInfo> list = firmwareUpdateActivity.dataList;
            ArrayList arrayList = new ArrayList();
            for (Object next : (Iterable) pair.getSecond()) {
                if (((UpgradeInfo) next).getUpgradeFlag() > 0) {
                    arrayList.add(next);
                }
            }
            list.addAll(arrayList);
        }
        firmwareUpdateActivity.setDeviceOnlineStatus();
        FirmwareUpdateAdapter firmwareUpdateAdapter2 = firmwareUpdateActivity.firmwareUpdateAdapter;
        if (firmwareUpdateAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("firmwareUpdateAdapter");
            firmwareUpdateAdapter2 = null;
        }
        firmwareUpdateAdapter2.notifyDataSetChanged();
        firmwareUpdateActivity.setEmptyViewShow(firmwareUpdateActivity.dataList.isEmpty());
    }

    /* renamed from: subscribeObservable$lambda-2  reason: not valid java name */
    public static final void m27111subscribeObservable$lambda2(FirmwareUpdateActivity firmwareUpdateActivity, Pair pair) {
        Intrinsics.checkNotNullParameter(firmwareUpdateActivity, "this$0");
        if (((Boolean) pair.getFirst()).booleanValue()) {
            firmwareUpdateActivity.deviceInfoList = (List) pair.getSecond();
            if (firmwareUpdateActivity.dataList.isEmpty()) {
                firmwareUpdateActivity.getWifiIdsList();
                firmwareUpdateActivity.checkWifiDeviceVersion();
                return;
            }
            firmwareUpdateActivity.hideLoading();
            firmwareUpdateActivity.setDeviceOnlineStatus();
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
        return R$layout.activity_firmware_update_layout;
    }

    @NotNull
    public final ArrayList<UpgradeInfo> getUpgradeInfoList() {
        ArrayList<UpgradeInfo> arrayList = this.upgradeInfoList;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("upgradeInfoList");
        return null;
    }

    @NotNull
    public Class<DeviceViewModel> initViewModelClz() {
        return DeviceViewModel.class;
    }

    public void initWidgets() {
        ((TextView) _$_findCachedViewById(R$id.top_title)).setText(getString(R$string.firmware_update));
        ((IconFontView) _$_findCachedViewById(R$id.top_back)).setText(getString(R$string.btn_main_back));
        this.dataList.clear();
        this.dataList.addAll(getUpgradeInfoList());
        getApplianceList();
        setEmptyViewShow(this.dataList.isEmpty());
        ((RecyclerView) _$_findCachedViewById(R$id.tv_firmware_update)).setLayoutManager(new LinearLayoutManager(this));
        this.firmwareUpdateAdapter = new FirmwareUpdateAdapter(this, this.dataList);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R$id.tv_firmware_update);
        FirmwareUpdateAdapter firmwareUpdateAdapter2 = this.firmwareUpdateAdapter;
        FirmwareUpdateAdapter firmwareUpdateAdapter3 = null;
        if (firmwareUpdateAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("firmwareUpdateAdapter");
            firmwareUpdateAdapter2 = null;
        }
        recyclerView.setAdapter(firmwareUpdateAdapter2);
        FirmwareUpdateAdapter firmwareUpdateAdapter4 = this.firmwareUpdateAdapter;
        if (firmwareUpdateAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("firmwareUpdateAdapter");
        } else {
            firmwareUpdateAdapter3 = firmwareUpdateAdapter4;
        }
        firmwareUpdateAdapter3.setIItemCallback(new FirmwareUpdateActivity$initWidgets$1(this));
    }

    public void setListeners() {
        IconFontView iconFontView = (IconFontView) _$_findCachedViewById(R$id.top_back);
        Intrinsics.checkNotNullExpressionValue(iconFontView, "top_back");
        JuConnectExtKt.singleClickListener(iconFontView, new FirmwareUpdateActivity$setListeners$1(this));
    }

    public final void setUpgradeInfoList(@NotNull ArrayList<UpgradeInfo> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.upgradeInfoList = arrayList;
    }

    public void subscribeObservable() {
        super.subscribeObservable();
        ((DeviceViewModel) getMViewModel()).getOtaCheckWifiDeviceVersionLiveData().observe(this, new C7510o(this));
        ((DeviceViewModel) getMViewModel()).getApplListLiveData().observe(this, new C7525v0(this));
    }
}
