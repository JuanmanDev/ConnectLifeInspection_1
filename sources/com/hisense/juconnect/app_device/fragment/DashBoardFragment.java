package com.hisense.juconnect.app_device.fragment;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.alibaba.android.arouter.facade.Postcard;
import com.hisense.connect_life.core.base.BaseVmFragment;
import com.hisense.connect_life.core.global.Paths;
import com.hisense.connect_life.core.global.SPManagerKt;
import com.hisense.connect_life.core.utils.LogUtilsShen;
import com.hisense.connect_life.hismart.networks.request.device.DeviceCache;
import com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo;
import com.hisense.connect_life.hismart.networks.request.device.model.SimpleDeviceBean;
import com.hisense.connect_life.hismart.networks.request.device.model.UpgradeInfo;
import com.hisense.connect_life.hismart.networks.request.message.MsgObserverViewModel;
import com.hisense.connect_life.hismart.networks.request.message.model.DeviceStatusMessage;
import com.hisense.connect_life.hismart.networks.request.message.model.WifiMessage;
import com.hisense.connect_life.hismart.networks.request.wine.model.FilterCondition;
import com.hisense.juconnect.app_device.R$id;
import com.hisense.juconnect.app_device.R$layout;
import com.hisense.juconnect.app_device.activity.ConnectLifeViewModel;
import com.hisense.juconnect.app_device.viewmodel.DeviceViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p041a.p042a.p043a.p045b.C1337a;
import p040c.p429r.p460b.p461a.p464c.C7536b;
import p040c.p429r.p460b.p461a.p464c.C7544j;
import p040c.p429r.p460b.p461a.p464c.C7545k;
import p040c.p429r.p460b.p461a.p464c.C7546l;
import p040c.p429r.p460b.p461a.p464c.C7549o;
import p040c.p429r.p460b.p461a.p464c.C7556v;
import p040c.p429r.p460b.p461a.p464c.C7557w;

@Metadata(mo47990d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u001b\u001a\u00020\u001cH\u0014J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0007H\u0002J\b\u0010!\u001a\u00020\u001eH\u0014J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020#H\u0016J\u0010\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020&H\u0014J\b\u0010'\u001a\u00020\u001eH\u0016J\u0010\u0010(\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020*H\u0007J\u0010\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020\u0007H\u0016J\b\u0010-\u001a\u00020\u001eH\u0002J\u0010\u0010.\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020\u000fH\u0002J\b\u00100\u001a\u00020\u001eH\u0014J\b\u00101\u001a\u00020\u001eH\u0002J\b\u00102\u001a\u00020\u001eH\u0016J\u0018\u00103\u001a\u00020\u001e2\u000e\u00104\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u000105H\u0002J\u0010\u00106\u001a\u00020\u001e2\u0006\u00107\u001a\u000208H\u0002J\u0010\u00109\u001a\u00020\u001e2\u0006\u0010:\u001a\u00020;H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0018\u001a\u00020\u0019X.¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006<"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/fragment/DashBoardFragment;", "Lcom/hisense/connect_life/core/base/BaseVmFragment;", "Lcom/hisense/juconnect/app_device/viewmodel/DeviceViewModel;", "()V", "applianceListFragment", "Lcom/hisense/juconnect/app_device/fragment/ApplianceListFragment;", "checkOtaUpdate", "", "connectLifeViewModel", "Lcom/hisense/juconnect/app_device/activity/ConnectLifeViewModel;", "getConnectLifeViewModel", "()Lcom/hisense/juconnect/app_device/activity/ConnectLifeViewModel;", "connectLifeViewModel$delegate", "Lkotlin/Lazy;", "currentFragment", "Landroidx/fragment/app/Fragment;", "mApplList", "", "Lcom/hisense/connect_life/hismart/networks/request/device/model/DeviceInfo;", "msgObserverViewModel", "Lcom/hisense/connect_life/hismart/networks/request/message/MsgObserverViewModel;", "getMsgObserverViewModel", "()Lcom/hisense/connect_life/hismart/networks/request/message/MsgObserverViewModel;", "msgObserverViewModel$delegate", "noApplianceFragment", "Lcom/hisense/juconnect/app_device/fragment/NoApplianceFragment;", "resume", "bindLayout", "", "checkWifiDeviceVersion", "", "getApplianceList", "showDialog", "initData", "initViewModelClz", "Ljava/lang/Class;", "initWidgets", "view", "Landroid/view/View;", "onDestroy", "onEvent", "message", "", "onHiddenChanged", "hidden", "queryDeviceOnline", "replaceFragment", "fragment", "setListeners", "showCacheData", "subscribeObservable", "updateApplList", "list", "", "updateDeviceStatus", "statusMessage", "Lcom/hisense/connect_life/hismart/networks/request/message/model/DeviceStatusMessage;", "updateWifiStatus", "wifiMessage", "Lcom/hisense/connect_life/hismart/networks/request/message/model/WifiMessage;", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: DashBoardFragment.kt */
public final class DashBoardFragment extends BaseVmFragment<DeviceViewModel> {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public ApplianceListFragment applianceListFragment;
    public boolean checkOtaUpdate = true;
    @NotNull
    public final Lazy connectLifeViewModel$delegate = LazyKt__LazyJVMKt.lazy(new DashBoardFragment$connectLifeViewModel$2(this));
    @Nullable
    public Fragment currentFragment;
    @NotNull
    public final List<DeviceInfo> mApplList = new ArrayList();
    @NotNull
    public final Lazy msgObserverViewModel$delegate = LazyKt__LazyJVMKt.lazy(new DashBoardFragment$msgObserverViewModel$2(this));
    public NoApplianceFragment noApplianceFragment;
    public boolean resume;

    private final void checkWifiDeviceVersion() {
        if (this.checkOtaUpdate) {
            this.checkOtaUpdate = false;
            ArrayList arrayList = new ArrayList();
            for (DeviceInfo wifiId : this.mApplList) {
                arrayList.add(wifiId.getWifiId());
            }
            ((DeviceViewModel) getMViewModel()).otaCheckWifiDeviceVersion(arrayList);
        }
    }

    private final void getApplianceList(boolean z) {
        ((DeviceViewModel) getMViewModel()).updateLoadingStatus(z);
        ((DeviceViewModel) getMViewModel()).getApplianceListWithProperty(z);
    }

    private final ConnectLifeViewModel getConnectLifeViewModel() {
        return (ConnectLifeViewModel) this.connectLifeViewModel$delegate.getValue();
    }

    private final MsgObserverViewModel getMsgObserverViewModel() {
        return (MsgObserverViewModel) this.msgObserverViewModel$delegate.getValue();
    }

    private final void queryDeviceOnline() {
        List<DeviceInfo> list = this.mApplList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (DeviceInfo deviceInfo : list) {
            arrayList.add(new SimpleDeviceBean(deviceInfo.getDeviceId(), deviceInfo.getWifiId()));
        }
        ((DeviceViewModel) getMViewModel()).queryDeviceOnline(arrayList);
    }

    private final void replaceFragment(Fragment fragment) {
        if (this.currentFragment != fragment) {
            getChildFragmentManager().beginTransaction().replace(R$id.fragment_dashboard_fl, fragment).commit();
            this.currentFragment = fragment;
        }
    }

    /* renamed from: setListeners$lambda-0  reason: not valid java name */
    public static final void m27150setListeners$lambda0(DashBoardFragment dashBoardFragment) {
        Intrinsics.checkNotNullParameter(dashBoardFragment, "this$0");
        dashBoardFragment.getApplianceList(false);
    }

    private final void showCacheData() {
        List<DeviceInfo> useCacheDeviceList = ((DeviceViewModel) getMViewModel()).useCacheDeviceList();
        LogUtilsShen.Companion.mo39140i(Intrinsics.stringPlus("缓存的设备数量 ", Integer.valueOf(useCacheDeviceList.size())));
        LogUtilsShen.Companion.mo39140i(Intrinsics.stringPlus("DeviceViewModel is  || ", Integer.valueOf(((DeviceViewModel) getMViewModel()).hashCode())));
        updateApplList(useCacheDeviceList);
    }

    /* renamed from: subscribeObservable$lambda-12  reason: not valid java name */
    public static final void m27151subscribeObservable$lambda12(DashBoardFragment dashBoardFragment, Pair pair) {
        Intrinsics.checkNotNullParameter(dashBoardFragment, "this$0");
        ((DeviceViewModel) dashBoardFragment.getMViewModel()).updateLoadingStatus(false);
        ArrayList arrayList = new ArrayList();
        Iterator it = ((Iterable) pair.getSecond()).iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((UpgradeInfo) next).getUpgradeFlag() <= 0) {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            Postcard a = C1337a.m211c().mo15011a(Paths.Device.FirmwareUpdateActivity);
            a.withSerializable("upgradeInfoList", arrayList);
            a.navigation();
        }
    }

    /* renamed from: subscribeObservable$lambda-2  reason: not valid java name */
    public static final void m27152subscribeObservable$lambda2(DashBoardFragment dashBoardFragment, Pair pair) {
        Intrinsics.checkNotNullParameter(dashBoardFragment, "this$0");
        if (((Boolean) pair.getFirst()).booleanValue()) {
            dashBoardFragment.resume = true;
            dashBoardFragment.updateApplList((List) pair.getSecond());
            ArrayList arrayList = new ArrayList();
            for (DeviceInfo deviceId : DeviceCache.Companion.getInstance().getDeviceList()) {
                arrayList.add(deviceId.getDeviceId());
            }
            ((DeviceViewModel) dashBoardFragment.getMViewModel()).getRemoteQueryByDevList(arrayList, (FilterCondition) null);
        }
    }

    /* renamed from: subscribeObservable$lambda-3  reason: not valid java name */
    public static final void m27153subscribeObservable$lambda3(List list) {
    }

    /* renamed from: subscribeObservable$lambda-4  reason: not valid java name */
    public static final void m27154subscribeObservable$lambda4(List list) {
    }

    /* renamed from: subscribeObservable$lambda-9$lambda-6  reason: not valid java name */
    public static final void m27155subscribeObservable$lambda9$lambda6(DashBoardFragment dashBoardFragment, MsgObserverViewModel msgObserverViewModel, WifiMessage wifiMessage) {
        Intrinsics.checkNotNullParameter(dashBoardFragment, "this$0");
        Intrinsics.checkNotNullParameter(msgObserverViewModel, "$this_with");
        if (wifiMessage != null) {
            dashBoardFragment.updateWifiStatus(wifiMessage);
            msgObserverViewModel.getWifiMsgLiveData().setValue(null);
        }
    }

    /* renamed from: subscribeObservable$lambda-9$lambda-8  reason: not valid java name */
    public static final void m27156subscribeObservable$lambda9$lambda8(DashBoardFragment dashBoardFragment, MsgObserverViewModel msgObserverViewModel, DeviceStatusMessage deviceStatusMessage) {
        Intrinsics.checkNotNullParameter(dashBoardFragment, "this$0");
        Intrinsics.checkNotNullParameter(msgObserverViewModel, "$this_with");
        if (deviceStatusMessage != null) {
            dashBoardFragment.getApplianceList(false);
            dashBoardFragment.updateDeviceStatus(deviceStatusMessage);
            msgObserverViewModel.getStatusMsgLiveData().setValue(null);
        }
    }

    /* JADX WARNING: type inference failed for: r5v13, types: [com.hisense.juconnect.app_device.fragment.NoApplianceFragment] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void updateApplList(java.util.List<com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo> r5) {
        /*
            r4 = this;
            int r0 = com.hisense.juconnect.app_device.R$id.fragment_dashboard_srl
            android.view.View r0 = r4._$_findCachedViewById(r0)
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r0 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r0
            boolean r0 = r0.isRefreshing()
            r1 = 0
            if (r0 == 0) goto L_0x001a
            int r0 = com.hisense.juconnect.app_device.R$id.fragment_dashboard_srl
            android.view.View r0 = r4._$_findCachedViewById(r0)
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r0 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r0
            r0.setRefreshing(r1)
        L_0x001a:
            java.util.List<com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo> r0 = r4.mApplList
            boolean r0 = r0.isEmpty()
            r2 = 1
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x0029
            java.util.List<com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo> r0 = r4.mApplList
            r0.clear()
        L_0x0029:
            if (r5 == 0) goto L_0x0037
            boolean r0 = r5.isEmpty()
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x0037
            java.util.List<com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo> r0 = r4.mApplList
            r0.addAll(r5)
        L_0x0037:
            java.util.List<com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo> r5 = r4.mApplList
            int r5 = r5.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r0 = "mAppList："
            kotlin.jvm.internal.Intrinsics.stringPlus(r0, r5)
            kotlin.Pair[] r5 = new kotlin.Pair[r2]
            java.util.List<com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo> r0 = r4.mApplList
            java.lang.String r3 = "mApplList"
            kotlin.Pair r0 = kotlin.TuplesKt.m25743to(r3, r0)
            r5[r1] = r0
            android.os.Bundle r5 = androidx.core.p028os.BundleKt.bundleOf(r5)
            java.util.List<com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo> r0 = r4.mApplList
            int r0 = r0.size()
            r3 = 0
            if (r0 != 0) goto L_0x007a
            com.hisense.connect_life.core.base.BaseViewModel r5 = r4.getMViewModel()
            com.hisense.juconnect.app_device.viewmodel.DeviceViewModel r5 = (com.hisense.juconnect.app_device.viewmodel.DeviceViewModel) r5
            r5.updateLoadingStatus(r1)
            com.hisense.connect_life.core.global.SPManagerKt.setHasDevice(r1)
            com.hisense.juconnect.app_device.fragment.NoApplianceFragment r5 = r4.noApplianceFragment
            if (r5 != 0) goto L_0x0075
            java.lang.String r5 = "noApplianceFragment"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
            goto L_0x0076
        L_0x0075:
            r3 = r5
        L_0x0076:
            r4.replaceFragment(r3)
            goto L_0x00a6
        L_0x007a:
            com.hisense.connect_life.core.global.SPManagerKt.setHasDevice(r2)
            com.hisense.juconnect.app_device.fragment.ApplianceListFragment r0 = r4.applianceListFragment
            java.lang.String r1 = "applianceListFragment"
            if (r0 != 0) goto L_0x0087
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            r0 = r3
        L_0x0087:
            r0.setArguments(r5)
            com.hisense.juconnect.app_device.fragment.ApplianceListFragment r5 = r4.applianceListFragment
            if (r5 != 0) goto L_0x0092
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            r5 = r3
        L_0x0092:
            r4.replaceFragment(r5)
            com.hisense.juconnect.app_device.fragment.ApplianceListFragment r5 = r4.applianceListFragment
            if (r5 != 0) goto L_0x009d
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            goto L_0x009e
        L_0x009d:
            r3 = r5
        L_0x009e:
            java.util.List<com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo> r5 = r4.mApplList
            r3.notifyAdapter(r5)
            r4.checkWifiDeviceVersion()
        L_0x00a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.juconnect.app_device.fragment.DashBoardFragment.updateApplList(java.util.List):void");
    }

    private final void updateDeviceStatus(DeviceStatusMessage deviceStatusMessage) {
        Fragment fragment = this.currentFragment;
        ApplianceListFragment applianceListFragment2 = this.applianceListFragment;
        ApplianceListFragment applianceListFragment3 = null;
        if (applianceListFragment2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("applianceListFragment");
            applianceListFragment2 = null;
        }
        if (Intrinsics.areEqual((Object) fragment, (Object) applianceListFragment2)) {
            ApplianceListFragment applianceListFragment4 = this.applianceListFragment;
            if (applianceListFragment4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("applianceListFragment");
            } else {
                applianceListFragment3 = applianceListFragment4;
            }
            applianceListFragment3.updateProp(deviceStatusMessage);
        }
    }

    private final void updateWifiStatus(WifiMessage wifiMessage) {
        Fragment fragment = this.currentFragment;
        ApplianceListFragment applianceListFragment2 = this.applianceListFragment;
        ApplianceListFragment applianceListFragment3 = null;
        if (applianceListFragment2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("applianceListFragment");
            applianceListFragment2 = null;
        }
        if (Intrinsics.areEqual((Object) fragment, (Object) applianceListFragment2)) {
            ApplianceListFragment applianceListFragment4 = this.applianceListFragment;
            if (applianceListFragment4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("applianceListFragment");
            } else {
                applianceListFragment3 = applianceListFragment4;
            }
            applianceListFragment3.updateWifiStatus(wifiMessage);
        }
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Nullable
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public int bindLayout() {
        return R$layout.fragment_dash_board;
    }

    public void initData() {
        super.initData();
        getMsgObserverViewModel().subscribeMessage();
    }

    @NotNull
    public Class<DeviceViewModel> initViewModelClz() {
        return DeviceViewModel.class;
    }

    public void initWidgets(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        EventBus.getDefault().register(this);
        this.noApplianceFragment = new NoApplianceFragment();
        this.applianceListFragment = new ApplianceListFragment();
        SPManagerKt.setHasDevice(false);
        showCacheData();
        getApplianceList(false);
    }

    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "message");
        if (Intrinsics.areEqual(obj, (Object) 102)) {
            getApplianceList(true);
        }
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            Fragment fragment = this.currentFragment;
            ApplianceListFragment applianceListFragment2 = this.applianceListFragment;
            ApplianceListFragment applianceListFragment3 = null;
            if (applianceListFragment2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("applianceListFragment");
                applianceListFragment2 = null;
            }
            if (Intrinsics.areEqual((Object) fragment, (Object) applianceListFragment2)) {
                ApplianceListFragment applianceListFragment4 = this.applianceListFragment;
                if (applianceListFragment4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("applianceListFragment");
                } else {
                    applianceListFragment3 = applianceListFragment4;
                }
                applianceListFragment3.clearNotification();
            }
        }
    }

    public void setListeners() {
        ((SwipeRefreshLayout) _$_findCachedViewById(R$id.fragment_dashboard_srl)).setOnRefreshListener(new C7544j(this));
    }

    public void subscribeObservable() {
        super.subscribeObservable();
        ((DeviceViewModel) getMViewModel()).getApplListLiveData().observe(this, new C7546l(this));
        ((DeviceViewModel) getMViewModel()).getDeviceOnlineLiveData().observe(this, C7557w.f14258a);
        ((DeviceViewModel) getMViewModel()).getDevicePropertyLiveData().observe(this, C7536b.f14235a);
        MsgObserverViewModel msgObserverViewModel = getMsgObserverViewModel();
        msgObserverViewModel.getWifiMsgLiveData().observe(this, new C7549o(this, msgObserverViewModel));
        msgObserverViewModel.getStatusMsgLiveData().observe(this, new C7556v(this, msgObserverViewModel));
        ((DeviceViewModel) getMViewModel()).getOtaCheckWifiDeviceVersionLiveData().observe(this, new C7545k(this));
    }
}
