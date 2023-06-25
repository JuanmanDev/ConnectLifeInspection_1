package com.hisense.juconnect.app_device.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.hisense.connect_life.core.base.BaseVmFragment;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.EventBusConstKt;
import com.hisense.connect_life.core.utils.LogUtilsShen;
import com.hisense.connect_life.core.utils.LoggerUtil;
import com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo;
import com.hisense.connect_life.hismart.networks.request.device.model.OnlineStatus;
import com.hisense.connect_life.hismart.networks.request.message.model.DeviceStatusMessage;
import com.hisense.connect_life.hismart.networks.request.message.model.WifiMessage;
import com.hisense.connect_life.hismart.room.Notification;
import com.hisense.juconnect.app_device.R$id;
import com.hisense.juconnect.app_device.R$layout;
import com.hisense.juconnect.app_device.adapter.DashboardDeviceAdapter;
import com.hisense.juconnect.app_device.adapter.DeviceNotificationAdapter;
import com.hisense.juconnect.app_device.viewmodel.DeviceViewModel;
import com.hisense.juconnect.app_device.viewmodel.MessageViewModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p429r.p460b.p461a.p464c.C7555u;
import p040c.p429r.p460b.p461a.p464c.C7558x;

@Metadata(mo47990d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0014J\u0006\u0010\u001e\u001a\u00020\u001bJ\u0016\u0010\u001f\u001a\u00020\u001b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u0007H\u0002J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020$H\u0014J\b\u0010%\u001a\u00020\u001bH\u0002J\u0014\u0010&\u001a\u00020\u001b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0010\u0010'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020)H\u0016J\u0012\u0010*\u001a\u00020\u001b2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u0010-\u001a\u00020\u001bH\u0016J\b\u0010.\u001a\u00020\u001bH\u0014J\b\u0010/\u001a\u00020\u001bH\u0016J\u000e\u00100\u001a\u00020\u001b2\u0006\u00101\u001a\u000202J\u000e\u00103\u001a\u00020\u001b2\u0006\u00104\u001a\u000205R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fX\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R!\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00150\u0014j\b\u0012\u0004\u0012\u00020\u0015`\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u0007X.¢\u0006\u0002\n\u0000¨\u00066"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/fragment/ApplianceListFragment;", "Lcom/hisense/connect_life/core/base/BaseVmFragment;", "Lcom/hisense/juconnect/app_device/viewmodel/DeviceViewModel;", "()V", "dashboardDeviceAdapter", "Lcom/hisense/juconnect/app_device/adapter/DashboardDeviceAdapter;", "deviceList", "", "Lcom/hisense/connect_life/hismart/networks/request/device/model/DeviceInfo;", "deviceNotificationAdapter", "Lcom/hisense/juconnect/app_device/adapter/DeviceNotificationAdapter;", "listData", "", "messageViewModel", "Lcom/hisense/juconnect/app_device/viewmodel/MessageViewModel;", "getMessageViewModel", "()Lcom/hisense/juconnect/app_device/viewmodel/MessageViewModel;", "messageViewModel$delegate", "Lkotlin/Lazy;", "notificationList", "Ljava/util/ArrayList;", "Lcom/hisense/connect_life/hismart/room/Notification;", "Lkotlin/collections/ArrayList;", "getNotificationList", "()Ljava/util/ArrayList;", "unReadList", "addListData", "", "bindLayout", "", "clearNotification", "getUnReadMSG", "initViewModelClz", "Ljava/lang/Class;", "initWidgets", "view", "Landroid/view/View;", "loadMore", "notifyAdapter", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "setListeners", "subscribeObservable", "updateProp", "deviceStatusMessage", "Lcom/hisense/connect_life/hismart/networks/request/message/model/DeviceStatusMessage;", "updateWifiStatus", "wifiMessage", "Lcom/hisense/connect_life/hismart/networks/request/message/model/WifiMessage;", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ApplianceListFragment.kt */
public final class ApplianceListFragment extends BaseVmFragment<DeviceViewModel> {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public DashboardDeviceAdapter dashboardDeviceAdapter;
    public List<DeviceInfo> deviceList;
    public DeviceNotificationAdapter deviceNotificationAdapter;
    @NotNull
    public final List<DeviceInfo> listData = new ArrayList();
    @NotNull
    public final Lazy messageViewModel$delegate = LazyKt__LazyJVMKt.lazy(new ApplianceListFragment$messageViewModel$2(this));
    @NotNull
    public final ArrayList<Notification> notificationList = new ArrayList<>();
    public List<Notification> unReadList;

    private final void addListData() {
        if (!this.listData.isEmpty()) {
            this.listData.clear();
        }
        List<DeviceInfo> list = this.deviceList;
        if (list != null) {
            List<DeviceInfo> list2 = this.listData;
            if (list == null) {
                Intrinsics.throwUninitializedPropertyAccessException("deviceList");
                list = null;
            }
            list2.addAll(list);
        }
        this.listData.add(new DeviceInfo());
    }

    private final MessageViewModel getMessageViewModel() {
        return (MessageViewModel) this.messageViewModel$delegate.getValue();
    }

    private final void getUnReadMSG(List<Notification> list) {
        if (list != null && list.size() > 0) {
            getNotificationList().clear();
            CardView cardView = (CardView) _$_findCachedViewById(R$id.list_notification);
            Intrinsics.checkNotNullExpressionValue(cardView, "list_notification");
            cardView.setVisibility(0);
            if (3 < list.size()) {
                LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(R$id.list_notification_more);
                Intrinsics.checkNotNullExpressionValue(linearLayout, "list_notification_more");
                linearLayout.setVisibility(0);
                int size = list.size() - 1;
                int size2 = list.size() - 3;
                if (size2 <= size) {
                    while (true) {
                        int i = size - 1;
                        getNotificationList().add(list.get(size));
                        if (size == size2) {
                            break;
                        }
                        size = i;
                    }
                }
            } else {
                LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(R$id.list_notification_more);
                Intrinsics.checkNotNullExpressionValue(linearLayout2, "list_notification_more");
                linearLayout2.setVisibility(8);
                for (Notification add : list) {
                    getNotificationList().add(add);
                }
                CardView cardView2 = (CardView) _$_findCachedViewById(R$id.list_notification);
                Intrinsics.checkNotNullExpressionValue(cardView2, "list_notification");
                cardView2.setVisibility(0);
            }
            DeviceNotificationAdapter deviceNotificationAdapter2 = this.deviceNotificationAdapter;
            if (deviceNotificationAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("deviceNotificationAdapter");
                deviceNotificationAdapter2 = null;
            }
            deviceNotificationAdapter2.notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: private */
    public final void loadMore() {
        List<Notification> list = this.unReadList;
        DeviceNotificationAdapter deviceNotificationAdapter2 = null;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("unReadList");
            list = null;
        }
        int size = list.size() - 4;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                ArrayList<Notification> arrayList = this.notificationList;
                List<Notification> list2 = this.unReadList;
                if (list2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("unReadList");
                    list2 = null;
                }
                arrayList.add(list2.get(size));
                if (i < 0) {
                    break;
                }
                size = i;
            }
        }
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(R$id.list_notification_more);
        Intrinsics.checkNotNullExpressionValue(linearLayout, "list_notification_more");
        linearLayout.setVisibility(8);
        DeviceNotificationAdapter deviceNotificationAdapter3 = this.deviceNotificationAdapter;
        if (deviceNotificationAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("deviceNotificationAdapter");
        } else {
            deviceNotificationAdapter2 = deviceNotificationAdapter3;
        }
        deviceNotificationAdapter2.notifyDataSetChanged();
    }

    /* renamed from: subscribeObservable$lambda-0  reason: not valid java name */
    public static final void m27148subscribeObservable$lambda0(ApplianceListFragment applianceListFragment, Pair pair) {
        Intrinsics.checkNotNullParameter(applianceListFragment, "this$0");
        applianceListFragment.deviceList = (List) pair.getSecond();
        applianceListFragment.addListData();
        LoggerUtil.Companion companion = LoggerUtil.Companion;
        List<DeviceInfo> list = applianceListFragment.deviceList;
        DashboardDeviceAdapter dashboardDeviceAdapter2 = null;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("deviceList");
            list = null;
        }
        companion.mo39146e(Intrinsics.stringPlus("deviceList===", Integer.valueOf(list.size())));
        DashboardDeviceAdapter dashboardDeviceAdapter3 = applianceListFragment.dashboardDeviceAdapter;
        if (dashboardDeviceAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dashboardDeviceAdapter");
        } else {
            dashboardDeviceAdapter2 = dashboardDeviceAdapter3;
        }
        dashboardDeviceAdapter2.notifyDataSetChanged();
    }

    /* renamed from: subscribeObservable$lambda-2  reason: not valid java name */
    public static final void m27149subscribeObservable$lambda2(ApplianceListFragment applianceListFragment, List<Notification> list) {
        Intrinsics.checkNotNullParameter(applianceListFragment, "this$0");
        if (list != null) {
            CardView cardView = (CardView) applianceListFragment._$_findCachedViewById(R$id.list_notification);
            Intrinsics.checkNotNullExpressionValue(cardView, "list_notification");
            cardView.setVisibility(0);
            applianceListFragment.unReadList = list;
            if (list == null) {
                Intrinsics.throwUninitializedPropertyAccessException("unReadList");
                list = null;
            }
            applianceListFragment.getUnReadMSG(list);
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
        return R$layout.dashboard_appliance_list;
    }

    public final void clearNotification() {
        Job unused = BuildersKt__Builders_commonKt.launch$default(this, Dispatchers.getIO(), (CoroutineStart) null, new ApplianceListFragment$clearNotification$1(this, (Continuation<? super ApplianceListFragment$clearNotification$1>) null), 2, (Object) null);
        CardView cardView = (CardView) _$_findCachedViewById(R$id.list_notification);
        Intrinsics.checkNotNullExpressionValue(cardView, "list_notification");
        cardView.setVisibility(8);
    }

    @NotNull
    public final ArrayList<Notification> getNotificationList() {
        return this.notificationList;
    }

    @NotNull
    public Class<DeviceViewModel> initViewModelClz() {
        return DeviceViewModel.class;
    }

    public void initWidgets(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.deviceNotificationAdapter = new DeviceNotificationAdapter(this.notificationList);
        ((RecyclerView) _$_findCachedViewById(R$id.list_notification_rv)).setLayoutManager(new LinearLayoutManager(getActivity()));
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R$id.list_notification_rv);
        DeviceNotificationAdapter deviceNotificationAdapter2 = this.deviceNotificationAdapter;
        DashboardDeviceAdapter dashboardDeviceAdapter2 = null;
        if (deviceNotificationAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("deviceNotificationAdapter");
            deviceNotificationAdapter2 = null;
        }
        recyclerView.setAdapter(deviceNotificationAdapter2);
        ((RecyclerView) _$_findCachedViewById(R$id.dashboard_device_rv)).setLayoutManager(new GridLayoutManager(getContext(), 2));
        this.dashboardDeviceAdapter = new DashboardDeviceAdapter(this.listData);
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R$id.dashboard_device_rv);
        DashboardDeviceAdapter dashboardDeviceAdapter3 = this.dashboardDeviceAdapter;
        if (dashboardDeviceAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dashboardDeviceAdapter");
        } else {
            dashboardDeviceAdapter2 = dashboardDeviceAdapter3;
        }
        recyclerView2.setAdapter(dashboardDeviceAdapter2);
    }

    public final void notifyAdapter(@NotNull List<DeviceInfo> list) {
        Intrinsics.checkNotNullParameter(list, "deviceList");
        LogUtilsShen.Companion.mo39140i(Intrinsics.stringPlus("缓存的设备 notifyAdapter", Integer.valueOf(list.size())));
        if (this.dashboardDeviceAdapter != null) {
            this.deviceList = list;
            addListData();
            DashboardDeviceAdapter dashboardDeviceAdapter2 = this.dashboardDeviceAdapter;
            if (dashboardDeviceAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dashboardDeviceAdapter");
                dashboardDeviceAdapter2 = null;
            }
            dashboardDeviceAdapter2.notifyDataSetChanged();
        }
    }

    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        Bundle arguments = getArguments();
        Object obj = arguments == null ? null : arguments.get(EventBusConstKt.DEVICE_LIST_KEY);
        if (obj != null) {
            this.deviceList = TypeIntrinsics.asMutableList(obj);
            addListData();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableList<com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo>");
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        LogUtilsShen.Companion.mo39140i(Intrinsics.stringPlus("DeviceViewModel is == ", Integer.valueOf(((DeviceViewModel) getMViewModel()).hashCode())));
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onPause() {
        super.onPause();
        clearNotification();
    }

    public void setListeners() {
        RelativeLayout relativeLayout = (RelativeLayout) _$_findCachedViewById(R$id.wine_inventory_maintain);
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "wine_inventory_maintain");
        JuConnectExtKt.singleClickListener(relativeLayout, ApplianceListFragment$setListeners$1.INSTANCE);
        DashboardDeviceAdapter dashboardDeviceAdapter2 = this.dashboardDeviceAdapter;
        if (dashboardDeviceAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dashboardDeviceAdapter");
            dashboardDeviceAdapter2 = null;
        }
        dashboardDeviceAdapter2.setOnItemClickListener(new ApplianceListFragment$setListeners$2(this));
        CardView cardView = (CardView) _$_findCachedViewById(R$id.dashboard_service);
        Intrinsics.checkNotNullExpressionValue(cardView, "dashboard_service");
        JuConnectExtKt.singleClickListener(cardView, ApplianceListFragment$setListeners$3.INSTANCE);
        TextView textView = (TextView) _$_findCachedViewById(R$id.list_notification_clear);
        Intrinsics.checkNotNullExpressionValue(textView, "list_notification_clear");
        JuConnectExtKt.singleClickListener(textView, new ApplianceListFragment$setListeners$4(this));
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(R$id.list_notification_more);
        Intrinsics.checkNotNullExpressionValue(linearLayout, "list_notification_more");
        JuConnectExtKt.singleClickListener(linearLayout, new ApplianceListFragment$setListeners$5(this));
    }

    public void subscribeObservable() {
        super.subscribeObservable();
        ((DeviceViewModel) getMViewModel()).getApplListLiveData().observe(this, new C7555u(this));
        getMessageViewModel().getUnReadMessageLiveData().observe(this, new C7558x(this));
    }

    public final void updateProp(@NotNull DeviceStatusMessage deviceStatusMessage) {
        Intrinsics.checkNotNullParameter(deviceStatusMessage, "deviceStatusMessage");
        addListData();
        for (DeviceInfo deviceInfo : this.listData) {
            if (Intrinsics.areEqual((Object) deviceInfo.getDeviceId(), (Object) deviceStatusMessage.getDeviceid())) {
                deviceInfo.setProperties(deviceStatusMessage.getProperties());
            }
        }
        DashboardDeviceAdapter dashboardDeviceAdapter2 = this.dashboardDeviceAdapter;
        if (dashboardDeviceAdapter2 != null) {
            if (dashboardDeviceAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dashboardDeviceAdapter");
                dashboardDeviceAdapter2 = null;
            }
            dashboardDeviceAdapter2.notifyDataSetChanged();
        }
    }

    public final void updateWifiStatus(@NotNull WifiMessage wifiMessage) {
        Intrinsics.checkNotNullParameter(wifiMessage, "wifiMessage");
        addListData();
        List<DeviceInfo> list = this.listData;
        ArrayList<DeviceInfo> arrayList = new ArrayList<>();
        for (T next : list) {
            if (Intrinsics.areEqual((Object) ((DeviceInfo) next).getWifiId(), (Object) wifiMessage.getWifiid())) {
                arrayList.add(next);
            }
        }
        for (DeviceInfo onlineStatus : arrayList) {
            onlineStatus.setOnlineStatus(OnlineStatus.Companion.fromType(wifiMessage.getOnlinestats()));
        }
        DashboardDeviceAdapter dashboardDeviceAdapter2 = this.dashboardDeviceAdapter;
        if (dashboardDeviceAdapter2 != null) {
            if (dashboardDeviceAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dashboardDeviceAdapter");
                dashboardDeviceAdapter2 = null;
            }
            dashboardDeviceAdapter2.notifyDataSetChanged();
        }
    }
}
