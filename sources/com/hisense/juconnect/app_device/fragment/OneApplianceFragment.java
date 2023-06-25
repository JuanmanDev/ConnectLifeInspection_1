package com.hisense.juconnect.app_device.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.cardview.widget.CardView;
import androidx.core.view.ViewCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.Postcard;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.hisense.connect_life.core.base.BaseVmFragment;
import com.hisense.connect_life.core.event.MaiDianEvent;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.EventBusConstKt;
import com.hisense.connect_life.core.global.HtmlPaths;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.global.Paths;
import com.hisense.connect_life.core.global.SPManagerKt;
import com.hisense.connect_life.core.utils.LvHeightUtilsKt;
import com.hisense.connect_life.core.utils.SPUtils;
import com.hisense.connect_life.core.widget.IconFontView;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.hismart.networks.request.device.DeviceCache;
import com.hisense.connect_life.hismart.networks.request.device.IDeviceService;
import com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo;
import com.hisense.connect_life.hismart.networks.request.device.model.OnlineStatus;
import com.hisense.connect_life.hismart.networks.request.message.model.WifiMessage;
import com.hisense.connect_life.hismart.room.Notification;
import com.hisense.juconnect.app_device.R$id;
import com.hisense.juconnect.app_device.R$layout;
import com.hisense.juconnect.app_device.R$string;
import com.hisense.juconnect.app_device.activity.DeviceInfoActivity;
import com.hisense.juconnect.app_device.adapter.DeviceNotificationAdapter;
import com.hisense.juconnect.app_device.adapter.HumitureListAdapter;
import com.hisense.juconnect.app_device.viewmodel.DeviceViewModel;
import com.hisense.juconnect.app_device.viewmodel.MessageViewModel;
import com.juconnect.connect_life.global.GeneralMethodConstant;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p041a.p042a.p043a.p045b.C1337a;
import p040c.p429r.p460b.p461a.p464c.C7537c;
import p040c.p429r.p460b.p461a.p464c.C7538d;
import p040c.p429r.p460b.p461a.p464c.C7541g;
import p040c.p429r.p460b.p461a.p464c.C7552r;
import p040c.p429r.p460b.p461a.p464c.C7553s;

@Metadata(mo47990d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u00104\u001a\u000205H\u0014J\b\u00106\u001a\u000207H\u0002J\u0006\u00108\u001a\u000207J\u0016\u00109\u001a\u0002072\f\u0010/\u001a\b\u0012\u0004\u0012\u00020,00H\u0002J\b\u0010:\u001a\u000207H\u0002J\b\u0010;\u001a\u000207H\u0002J\b\u0010<\u001a\u000207H\u0002J\b\u0010=\u001a\u000207H\u0002J\b\u0010>\u001a\u000207H\u0002J\b\u0010?\u001a\u000207H\u0002J\b\u0010@\u001a\u000207H\u0002J\b\u0010A\u001a\u000207H\u0002J\b\u0010B\u001a\u000207H\u0002J\u000e\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00020DH\u0016J\u0010\u0010E\u001a\u0002072\u0006\u0010F\u001a\u00020GH\u0014J\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010H\u001a\u00020\u000eJ\u000e\u0010I\u001a\u00020\u00052\u0006\u0010H\u001a\u00020\u000eJ\u000e\u0010\u001d\u001a\u00020\u00052\u0006\u0010H\u001a\u00020\u000eJ\b\u0010J\u001a\u000207H\u0002J\"\u0010K\u001a\u0002072\u0006\u0010L\u001a\u0002052\u0006\u0010M\u001a\u0002052\b\u0010N\u001a\u0004\u0018\u00010OH\u0016J\u0010\u0010P\u001a\u0002072\u0006\u0010Q\u001a\u00020RH\u0016J\b\u0010S\u001a\u000207H\u0016J\u0010\u0010T\u001a\u0002072\u0006\u0010U\u001a\u00020VH\u0007J\b\u0010W\u001a\u000207H\u0016J\b\u0010X\u001a\u000207H\u0002J\u000e\u0010Y\u001a\u0002072\u0006\u0010Z\u001a\u00020\fJ\u000e\u0010[\u001a\u0002072\u0006\u0010H\u001a\u00020\u000eJ\b\u0010\\\u001a\u000207H\u0014J\u0012\u0010]\u001a\u0002072\b\u0010Z\u001a\u0004\u0018\u00010\fH\u0002J\u000e\u0010^\u001a\u0002072\u0006\u0010_\u001a\u00020\u0005J\u0012\u0010`\u001a\u0002072\b\u0010Z\u001a\u0004\u0018\u00010\fH\u0002J\u0012\u0010a\u001a\u0002072\b\u0010Z\u001a\u0004\u0018\u00010\fH\u0002J\b\u0010b\u001a\u000207H\u0016J\u000e\u0010c\u001a\u0002072\u0006\u0010d\u001a\u00020eJ\u000e\u0010f\u001a\u0002072\u0006\u0010g\u001a\u00020hR\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\u001fj\b\u0012\u0004\u0012\u00020\u000e` X\u0004¢\u0006\u0002\n\u0000R6\u0010!\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\"0\u001fj\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\"` X\u0004¢\u0006\u0002\n\u0000R6\u0010#\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\"0\u001fj\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\"` X\u0004¢\u0006\u0002\n\u0000R6\u0010$\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\"0\u001fj\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\"` X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010%\u001a\u00020&8BX\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b'\u0010(R\u001e\u0010+\u001a\u0012\u0012\u0004\u0012\u00020,0\u001fj\b\u0012\u0004\u0012\u00020,` X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010/\u001a\b\u0012\u0004\u0012\u00020,00X.¢\u0006\u0002\n\u0000R\u001b\u00101\u001a\u00020&8BX\u0002¢\u0006\f\n\u0004\b3\u0010*\u001a\u0004\b2\u0010(¨\u0006i"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/fragment/OneApplianceFragment;", "Lcom/hisense/connect_life/core/base/BaseVmFragment;", "Lcom/hisense/juconnect/app_device/viewmodel/DeviceViewModel;", "()V", "ChildLockNot", "", "ChildLockSet", "arrayAdapter1", "Lcom/hisense/juconnect/app_device/adapter/HumitureListAdapter;", "arrayAdapter2", "arrayAdapter3", "device", "Lcom/hisense/connect_life/hismart/networks/request/device/model/DeviceInfo;", "deviceAuid", "", "deviceNotificationAdapter", "Lcom/hisense/juconnect/app_device/adapter/DeviceNotificationAdapter;", "dialog", "Lcom/hisense/juconnect/app_device/fragment/SabbathActiveDialog;", "isBattle", "isHomePage", "()Z", "setHomePage", "(Z)V", "isKeyLockOn", "isOffline", "isRemote", "isSingleZone", "isSubbathActive", "isThreeZone", "list", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "list11", "Lkotlin/Pair;", "list12", "list13", "messageViewModel", "Lcom/hisense/juconnect/app_device/viewmodel/MessageViewModel;", "getMessageViewModel", "()Lcom/hisense/juconnect/app_device/viewmodel/MessageViewModel;", "messageViewModel$delegate", "Lkotlin/Lazy;", "notificationList", "Lcom/hisense/connect_life/hismart/room/Notification;", "soundIsOpen", "temperatureUnit", "unReadList", "", "wineWebViewModel", "getWineWebViewModel", "wineWebViewModel$delegate", "bindLayout", "", "clearData", "", "clearNotification", "getUnReadMSG", "gotoCharts", "gotoInventory", "gotoKeyLock", "gotoLights", "gotoManuals", "gotoSettings", "gotoTemperaturePage", "initThreeZoneLayout", "initThreeZoneStatus", "initViewModelClz", "Ljava/lang/Class;", "initWidgets", "view", "Landroid/view/View;", "auid", "isThreeOrOldSingle", "loadMore", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onAttach", "context", "Landroid/content/Context;", "onDestroy", "onEvent", "message", "", "onPause", "refreshAdapter", "refreshWineCoolerInfo", "deviceInfo", "setIsShowVi", "setListeners", "setOfflineStatusShow", "setSabbathActive", "active", "setSingleZoneData", "setThreeZoneData", "subscribeObservable", "updateProp", "deviceStatusMessage", "Lcom/hisense/connect_life/hismart/networks/request/message/model/DeviceStatusMessage;", "updateWifiStatus", "wifiMessage", "Lcom/hisense/connect_life/hismart/networks/request/message/model/WifiMessage;", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: OneApplianceFragment.kt */
public final class OneApplianceFragment extends BaseVmFragment<DeviceViewModel> {
    public boolean ChildLockNot;
    public boolean ChildLockSet;
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public HumitureListAdapter arrayAdapter1;
    public HumitureListAdapter arrayAdapter2;
    public HumitureListAdapter arrayAdapter3;
    @Nullable
    public DeviceInfo device;
    @NotNull
    public String deviceAuid = SPManagerKt.getAuid();
    public DeviceNotificationAdapter deviceNotificationAdapter;
    @NotNull
    public final SabbathActiveDialog dialog = new SabbathActiveDialog();
    public boolean isBattle = true;
    public boolean isHomePage = true;
    public boolean isKeyLockOn = true;
    public boolean isOffline = true;
    public boolean isRemote = true;
    public boolean isSingleZone;
    public boolean isSubbathActive;
    public boolean isThreeZone = true;
    @NotNull
    public final ArrayList<String> list = CollectionsKt__CollectionsKt.arrayListOf(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C", "D", ExifInterface.LONGITUDE_EAST, "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", ExifInterface.LATITUDE_SOUTH, ExifInterface.GPS_DIRECTION_TRUE, "U", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, ExifInterface.LONGITUDE_WEST, "X", EventBusConstKt.Y_E_S, "Z");
    @NotNull
    public final ArrayList<Pair<String, String>> list11 = new ArrayList<>();
    @NotNull
    public final ArrayList<Pair<String, String>> list12 = new ArrayList<>();
    @NotNull
    public final ArrayList<Pair<String, String>> list13 = new ArrayList<>();
    @NotNull
    public final Lazy messageViewModel$delegate = LazyKt__LazyJVMKt.lazy(new OneApplianceFragment$messageViewModel$2(this));
    @NotNull
    public final ArrayList<Notification> notificationList = new ArrayList<>();
    public boolean soundIsOpen;
    @NotNull
    public String temperatureUnit = "0";
    public List<Notification> unReadList;
    @NotNull
    public final Lazy wineWebViewModel$delegate = LazyKt__LazyJVMKt.lazy(new OneApplianceFragment$wineWebViewModel$2(this));

    public OneApplianceFragment() {
    }

    private final void clearData() {
        if (!this.list11.isEmpty()) {
            this.list11.clear();
        }
        if (!this.list12.isEmpty()) {
            this.list12.clear();
        }
        if (!this.list13.isEmpty()) {
            this.list13.clear();
        }
    }

    private final MessageViewModel getMessageViewModel() {
        return (MessageViewModel) this.messageViewModel$delegate.getValue();
    }

    private final void getUnReadMSG(List<Notification> list2) {
        Job unused = BuildersKt__Builders_commonKt.launch$default(this, Dispatchers.getIO(), (CoroutineStart) null, new OneApplianceFragment$getUnReadMSG$1(list2, this, (Continuation<? super OneApplianceFragment$getUnReadMSG$1>) null), 2, (Object) null);
    }

    private final MessageViewModel getWineWebViewModel() {
        return (MessageViewModel) this.wineWebViewModel$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final void gotoCharts() {
        if (this.device != null) {
            Postcard a = C1337a.m211c().mo15011a(Paths.App.StatisticsWebViewActivity);
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
            String languageType = SPManagerKt.getLanguageType();
            DeviceInfo deviceInfo = this.device;
            Intrinsics.checkNotNull(deviceInfo);
            DeviceCache instance = DeviceCache.Companion.getInstance();
            DeviceInfo deviceInfo2 = this.device;
            Intrinsics.checkNotNull(deviceInfo2);
            a.withString(KeyConst.KEY_TARGET_URL, JuConnectExtKt.buildAssetUrl(HtmlPaths.DEVICE_STATISTICS, requireContext, languageType, MapsKt__MapsKt.mapOf(TuplesKt.m25743to("deviceId", deviceInfo.getDeviceId()), TuplesKt.m25743to("oneZoneFlag", instance.getOneZoneFlagByFeatureCode(deviceInfo2.getDeviceId())))));
            a.navigation();
        }
    }

    /* access modifiers changed from: private */
    public final void gotoInventory() {
        Object obj = SPUtils.INSTANCE.get(KeyConst.KEY_INVENTORY_TYPE_FIRST, Boolean.TRUE);
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
        } else if (((Boolean) obj).booleanValue()) {
            Postcard a = C1337a.m211c().mo15011a(Paths.App.InventorySelectTypeActivity);
            a.withBoolean("isShowSecond", false);
            a.withString(KeyConst.KEY_AUIT, this.deviceAuid);
            a.navigation();
        } else {
            Postcard a2 = C1337a.m211c().mo15011a(Paths.App.InventoryMainActivity);
            a2.withString(KeyConst.KEY_AUIT, this.deviceAuid);
            a2.navigation();
        }
    }

    private final void gotoKeyLock() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        Postcard a = C1337a.m211c().mo15011a(Paths.Device.KeyLockActivity);
        a.withBoolean("LOCKON", this.isKeyLockOn);
        a.withBoolean("SOUNDISOPEN", this.soundIsOpen);
        a.withBoolean("ISREMOTE", this.isRemote);
        a.withBoolean("CHILDLOCKNOT", this.ChildLockNot);
        a.withBoolean("ISOFFLINE", this.isOffline);
        a.withBoolean("ISTHREEZONE", this.isThreeZone);
        DeviceInfo deviceInfo = this.device;
        String str = null;
        a.withString("DEVICEID", deviceInfo == null ? null : deviceInfo.getDeviceId());
        DeviceInfo deviceInfo2 = this.device;
        if (deviceInfo2 != null) {
            str = deviceInfo2.getWifiId();
        }
        a.withString("WIFIID", str);
        a.withString("AUID", this.deviceAuid);
        a.withBoolean("CHILDLOCKSET", this.ChildLockSet);
        a.navigation((Activity) requireActivity, 1);
    }

    /* access modifiers changed from: private */
    public final void gotoLights() {
        DeviceInfo deviceInfo = this.device;
        if (deviceInfo != null) {
            String str = OnlineStatus.CONNECTED == (deviceInfo == null ? null : deviceInfo.getOnlineStatus()) ? "1" : "2";
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
            String languageType = SPManagerKt.getLanguageType();
            DeviceInfo deviceInfo2 = this.device;
            Intrinsics.checkNotNull(deviceInfo2);
            DeviceCache instance = DeviceCache.Companion.getInstance();
            DeviceInfo deviceInfo3 = this.device;
            Intrinsics.checkNotNull(deviceInfo3);
            Intrinsics.stringPlus("灯光html5：", JuConnectExtKt.buildAssetUrl(HtmlPaths.APPLIANCE_LIGHT, requireContext, languageType, MapsKt__MapsKt.mapOf(TuplesKt.m25743to("deviceId", deviceInfo2.getDeviceId()), TuplesKt.m25743to("onlineStatus", str), TuplesKt.m25743to("oneZoneFlag", instance.getOneZoneFlagByFeatureCode(deviceInfo3.getDeviceId())))));
            Postcard a = C1337a.m211c().mo15011a(Paths.App.PropWebViewActivity);
            DeviceInfo deviceInfo4 = this.device;
            Intrinsics.checkNotNull(deviceInfo4);
            Postcard withString = a.withString("deviceId", deviceInfo4.getDeviceId());
            Context requireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext()");
            String languageType2 = SPManagerKt.getLanguageType();
            DeviceInfo deviceInfo5 = this.device;
            Intrinsics.checkNotNull(deviceInfo5);
            DeviceCache instance2 = DeviceCache.Companion.getInstance();
            DeviceInfo deviceInfo6 = this.device;
            Intrinsics.checkNotNull(deviceInfo6);
            withString.withString(KeyConst.KEY_TARGET_URL, JuConnectExtKt.buildAssetUrl(HtmlPaths.APPLIANCE_LIGHT, requireContext2, languageType2, MapsKt__MapsKt.mapOf(TuplesKt.m25743to("deviceId", deviceInfo5.getDeviceId()), TuplesKt.m25743to("onlineStatus", str), TuplesKt.m25743to("oneZoneFlag", instance2.getOneZoneFlagByFeatureCode(deviceInfo6.getDeviceId())))));
            a.navigation();
        }
    }

    /* access modifiers changed from: private */
    public final void gotoManuals() {
        if (getActivity() instanceof DeviceInfoActivity) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                ((DeviceInfoActivity) activity).queryWineCoolerManual();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.hisense.juconnect.app_device.activity.DeviceInfoActivity");
        }
    }

    /* access modifiers changed from: private */
    public final void gotoSettings() {
        DeviceInfo deviceInfo = this.device;
        if (deviceInfo != null) {
            String str = OnlineStatus.CONNECTED == (deviceInfo == null ? null : deviceInfo.getOnlineStatus()) ? "1" : "2";
            String.valueOf(this.device);
            Postcard a = C1337a.m211c().mo15011a(Paths.App.SettingWineWebViewActivity);
            DeviceInfo deviceInfo2 = this.device;
            Intrinsics.checkNotNull(deviceInfo2);
            Postcard withString = a.withString("deviceId", deviceInfo2.getDeviceId());
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
            String languageType = SPManagerKt.getLanguageType();
            DeviceInfo deviceInfo3 = this.device;
            Intrinsics.checkNotNull(deviceInfo3);
            DeviceInfo deviceInfo4 = this.device;
            Intrinsics.checkNotNull(deviceInfo4);
            DeviceInfo deviceInfo5 = this.device;
            Intrinsics.checkNotNull(deviceInfo5);
            DeviceCache instance = DeviceCache.Companion.getInstance();
            DeviceInfo deviceInfo6 = this.device;
            Intrinsics.checkNotNull(deviceInfo6);
            withString.withString(KeyConst.KEY_TARGET_URL, JuConnectExtKt.buildAssetUrl(HtmlPaths.DEVICE_SETTINGS2, requireContext, languageType, MapsKt__MapsKt.mapOf(TuplesKt.m25743to("deviceId", deviceInfo3.getDeviceId()), TuplesKt.m25743to(EventBusConstKt.WIFIID, deviceInfo4.getWifiId()), TuplesKt.m25743to("deviceName", deviceInfo5.getDeviceNickName()), TuplesKt.m25743to("onlineStatus", str), TuplesKt.m25743to("oneZoneFlag", instance.getOneZoneFlagByFeatureCode(deviceInfo6.getDeviceId())))));
            a.navigation();
        }
    }

    /* access modifiers changed from: private */
    public final void gotoTemperaturePage() {
        DeviceInfo deviceInfo = this.device;
        if (deviceInfo != null) {
            String str = OnlineStatus.CONNECTED == (deviceInfo == null ? null : deviceInfo.getOnlineStatus()) ? "1" : "2";
            Postcard a = C1337a.m211c().mo15011a(Paths.App.HumitureWebViewActivity);
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
            String languageType = SPManagerKt.getLanguageType();
            DeviceInfo deviceInfo2 = this.device;
            Intrinsics.checkNotNull(deviceInfo2);
            DeviceCache instance = DeviceCache.Companion.getInstance();
            DeviceInfo deviceInfo3 = this.device;
            Intrinsics.checkNotNull(deviceInfo3);
            a.withString(KeyConst.KEY_TARGET_URL, JuConnectExtKt.buildAssetUrl(HtmlPaths.DEVICE_TEMPERATURE, requireContext, languageType, MapsKt__MapsKt.mapOf(TuplesKt.m25743to("deviceId", deviceInfo2.getDeviceId()), TuplesKt.m25743to("onlineStatus", str), TuplesKt.m25743to("oneZoneFlag", instance.getOneZoneFlagByFeatureCode(deviceInfo3.getDeviceId())))));
            a.withString(KeyConst.KEY_AUID, this.deviceAuid);
            a.navigation();
        }
    }

    private final void initThreeZoneLayout() {
        initThreeZoneStatus();
        setThreeZoneData(this.device);
        this.arrayAdapter1 = new HumitureListAdapter(1);
        this.arrayAdapter2 = new HumitureListAdapter(2);
        this.arrayAdapter3 = new HumitureListAdapter(3);
        HumitureListAdapter humitureListAdapter = this.arrayAdapter1;
        DeviceNotificationAdapter deviceNotificationAdapter2 = null;
        if (humitureListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("arrayAdapter1");
            humitureListAdapter = null;
        }
        humitureListAdapter.refreshData(this.list11);
        HumitureListAdapter humitureListAdapter2 = this.arrayAdapter2;
        if (humitureListAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("arrayAdapter2");
            humitureListAdapter2 = null;
        }
        humitureListAdapter2.refreshData(this.list12);
        HumitureListAdapter humitureListAdapter3 = this.arrayAdapter3;
        if (humitureListAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("arrayAdapter3");
            humitureListAdapter3 = null;
        }
        humitureListAdapter3.refreshData(this.list13);
        ListView listView = (ListView) _$_findCachedViewById(R$id.lv1);
        HumitureListAdapter humitureListAdapter4 = this.arrayAdapter1;
        if (humitureListAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("arrayAdapter1");
            humitureListAdapter4 = null;
        }
        listView.setAdapter(humitureListAdapter4);
        ListView listView2 = (ListView) _$_findCachedViewById(R$id.lv2);
        HumitureListAdapter humitureListAdapter5 = this.arrayAdapter2;
        if (humitureListAdapter5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("arrayAdapter2");
            humitureListAdapter5 = null;
        }
        listView2.setAdapter(humitureListAdapter5);
        ListView listView3 = (ListView) _$_findCachedViewById(R$id.lv3);
        HumitureListAdapter humitureListAdapter6 = this.arrayAdapter3;
        if (humitureListAdapter6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("arrayAdapter3");
            humitureListAdapter6 = null;
        }
        listView3.setAdapter(humitureListAdapter6);
        ListView listView4 = (ListView) _$_findCachedViewById(R$id.lv1);
        Intrinsics.checkNotNullExpressionValue(listView4, "lv1");
        LvHeightUtilsKt.setLvHeight(listView4);
        ((RecyclerView) _$_findCachedViewById(R$id.device_notification_rv)).setLayoutManager(new LinearLayoutManager(getActivity()));
        this.deviceNotificationAdapter = new DeviceNotificationAdapter(this.notificationList);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R$id.device_notification_rv);
        DeviceNotificationAdapter deviceNotificationAdapter3 = this.deviceNotificationAdapter;
        if (deviceNotificationAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("deviceNotificationAdapter");
        } else {
            deviceNotificationAdapter2 = deviceNotificationAdapter3;
        }
        recyclerView.setAdapter(deviceNotificationAdapter2);
    }

    private final void initThreeZoneStatus() {
        this.list11.clear();
        this.list12.clear();
        this.list13.clear();
        ((ListView) _$_findCachedViewById(R$id.lv1)).setClickable(false);
        ((ListView) _$_findCachedViewById(R$id.lv1)).setEnabled(false);
        ((ListView) _$_findCachedViewById(R$id.lv2)).setClickable(false);
        ((ListView) _$_findCachedViewById(R$id.lv2)).setEnabled(false);
        ((ListView) _$_findCachedViewById(R$id.lv3)).setClickable(false);
        ((ListView) _$_findCachedViewById(R$id.lv3)).setEnabled(false);
    }

    /* access modifiers changed from: private */
    public final void loadMore() {
        List<Notification> list2 = this.unReadList;
        DeviceNotificationAdapter deviceNotificationAdapter2 = null;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("unReadList");
            list2 = null;
        }
        int size = list2.size() - 3;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                ArrayList<Notification> arrayList = this.notificationList;
                List<Notification> list3 = this.unReadList;
                if (list3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("unReadList");
                    list3 = null;
                }
                arrayList.add(list3.get(size));
                if (i < 0) {
                    break;
                }
                size = i;
            }
        }
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(R$id.device_notification_more);
        Intrinsics.checkNotNullExpressionValue(linearLayout, "device_notification_more");
        linearLayout.setVisibility(4);
        DeviceNotificationAdapter deviceNotificationAdapter3 = this.deviceNotificationAdapter;
        if (deviceNotificationAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("deviceNotificationAdapter");
        } else {
            deviceNotificationAdapter2 = deviceNotificationAdapter3;
        }
        deviceNotificationAdapter2.notifyDataSetChanged();
    }

    private final void refreshAdapter() {
        HumitureListAdapter humitureListAdapter = this.arrayAdapter1;
        HumitureListAdapter humitureListAdapter2 = null;
        if (humitureListAdapter != null) {
            if (humitureListAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("arrayAdapter1");
                humitureListAdapter = null;
            }
            humitureListAdapter.refreshData(this.list11);
        }
        HumitureListAdapter humitureListAdapter3 = this.arrayAdapter2;
        if (humitureListAdapter3 != null) {
            if (humitureListAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("arrayAdapter2");
                humitureListAdapter3 = null;
            }
            humitureListAdapter3.refreshData(this.list12);
        }
        HumitureListAdapter humitureListAdapter4 = this.arrayAdapter3;
        if (humitureListAdapter4 != null) {
            if (humitureListAdapter4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("arrayAdapter3");
            } else {
                humitureListAdapter2 = humitureListAdapter4;
            }
            humitureListAdapter2.refreshData(this.list13);
        }
    }

    /* renamed from: setListeners$lambda-0  reason: not valid java name */
    public static final void m27163setListeners$lambda0(OneApplianceFragment oneApplianceFragment, View view) {
        Intrinsics.checkNotNullParameter(oneApplianceFragment, "this$0");
        ToastUtils o = ToastUtils.m9596o();
        o.mo21600r(17, 0, 0);
        o.mo21599q(ViewCompat.MEASURED_STATE_MASK);
        o.mo21602t(-1);
        o.mo21603w(oneApplianceFragment.getString(R$string.turn_off_the_sabbath), new Object[0]);
    }

    /* renamed from: setListeners$lambda-1  reason: not valid java name */
    public static final void m27164setListeners$lambda1(OneApplianceFragment oneApplianceFragment, View view) {
        Intrinsics.checkNotNullParameter(oneApplianceFragment, "this$0");
        ToastUtils o = ToastUtils.m9596o();
        o.mo21600r(17, 0, 0);
        o.mo21599q(ViewCompat.MEASURED_STATE_MASK);
        o.mo21602t(-1);
        o.mo21603w(oneApplianceFragment.getString(R$string.turn_off_the_sabbath), new Object[0]);
    }

    /* renamed from: setListeners$lambda-2  reason: not valid java name */
    public static final void m27165setListeners$lambda2(OneApplianceFragment oneApplianceFragment, View view) {
        Intrinsics.checkNotNullParameter(oneApplianceFragment, "this$0");
        oneApplianceFragment.gotoKeyLock();
    }

    /* renamed from: setListeners$lambda-3  reason: not valid java name */
    public static final void m27166setListeners$lambda3(OneApplianceFragment oneApplianceFragment, CompoundButton compoundButton, boolean z) {
        Map map;
        Intrinsics.checkNotNullParameter(oneApplianceFragment, "this$0");
        if (compoundButton.isPressed() && oneApplianceFragment.device != null) {
            MapsKt__MapsKt.emptyMap();
            String str = "0";
            if (!oneApplianceFragment.isThreeZone(oneApplianceFragment.deviceAuid)) {
                if (z) {
                    str = "1";
                }
                map = MapsKt__MapsJVMKt.mapOf(TuplesKt.m25743to("KeyLockStatus", str));
            } else {
                if (!z) {
                    str = "1";
                }
                map = MapsKt__MapsJVMKt.mapOf(TuplesKt.m25743to("KeyLockStatus", str));
            }
            Map map2 = map;
            if (oneApplianceFragment.isRemote && !oneApplianceFragment.isOffline) {
                EventBus.getDefault().post(new MaiDianEvent("", String.valueOf(z)));
                FragmentActivity requireActivity = oneApplianceFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                oneApplianceFragment.showProgressDialog(requireActivity, true);
                IDeviceService deviceService = HiSmart.Companion.getInstance().deviceService();
                DeviceInfo deviceInfo = oneApplianceFragment.device;
                String deviceId = deviceInfo == null ? null : deviceInfo.getDeviceId();
                Intrinsics.checkNotNull(deviceId);
                DeviceInfo deviceInfo2 = oneApplianceFragment.device;
                String wifiId = deviceInfo2 == null ? null : deviceInfo2.getWifiId();
                Intrinsics.checkNotNull(wifiId);
                deviceService.sendCommand(deviceId, wifiId, map2, new OneApplianceFragment$setListeners$4$1(oneApplianceFragment), new OneApplianceFragment$setListeners$4$2(oneApplianceFragment));
            } else if (oneApplianceFragment.isOffline) {
                ToastUtils.m9601y(oneApplianceFragment.getString(R$string.appliance_offline), new Object[0]);
                ((ToggleButton) oneApplianceFragment._$_findCachedViewById(R$id.toggle_child_lock)).setChecked(!z);
            } else if (!oneApplianceFragment.isRemote) {
                ToastUtils.m9601y(oneApplianceFragment.getString(R$string.turn_on_the_remote), new Object[0]);
                ((ToggleButton) oneApplianceFragment._$_findCachedViewById(R$id.toggle_child_lock)).setChecked(!z);
            } else {
                ((ToggleButton) oneApplianceFragment._$_findCachedViewById(R$id.toggle_child_lock)).setChecked(false);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:137:0x02c8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void setOfflineStatusShow(com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo r9) {
        /*
            r8 = this;
            java.lang.String.valueOf(r9)
            boolean r0 = r8.isSingleZone
            if (r0 == 0) goto L_0x000b
            r8.setSingleZoneData(r9)
            goto L_0x000e
        L_0x000b:
            r8.setThreeZoneData(r9)
        L_0x000e:
            int r0 = com.hisense.juconnect.app_device.R$id.wine_cooler_name
            android.view.View r0 = r8._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r0 != 0) goto L_0x001a
            goto L_0x0025
        L_0x001a:
            if (r9 != 0) goto L_0x001e
            r2 = r1
            goto L_0x0022
        L_0x001e:
            java.lang.String r2 = r9.getDeviceNickName()
        L_0x0022:
            r0.setText(r2)
        L_0x0025:
            int r0 = com.hisense.juconnect.app_device.R$id.wine_cooler_name02
            android.view.View r0 = r8._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 != 0) goto L_0x0030
            goto L_0x003b
        L_0x0030:
            if (r9 != 0) goto L_0x0034
            r2 = r1
            goto L_0x0038
        L_0x0034:
            java.lang.String r2 = r9.getDeviceNickName()
        L_0x0038:
            r0.setText(r2)
        L_0x003b:
            boolean r0 = r8.isSingleZone
            r2 = 1
            r3 = 8
            r4 = 0
            if (r0 == 0) goto L_0x0078
            int r0 = com.hisense.juconnect.app_device.R$id.single_zone_offline_ic
            android.view.View r0 = r8._$_findCachedViewById(r0)
            com.hisense.connect_life.core.widget.IconFontView r0 = (com.hisense.connect_life.core.widget.IconFontView) r0
            if (r0 != 0) goto L_0x004f
            goto L_0x00ab
        L_0x004f:
            com.hisense.connect_life.hismart.networks.request.device.model.OnlineStatus r5 = com.hisense.connect_life.hismart.networks.request.device.model.OnlineStatus.OFFLINE
            if (r9 != 0) goto L_0x0055
            r6 = r1
            goto L_0x0059
        L_0x0055:
            com.hisense.connect_life.hismart.networks.request.device.model.OnlineStatus r6 = r9.getOnlineStatus()
        L_0x0059:
            if (r5 != r6) goto L_0x005d
            r5 = r2
            goto L_0x005e
        L_0x005d:
            r5 = r4
        L_0x005e:
            if (r5 == 0) goto L_0x0062
            r5 = r4
            goto L_0x0063
        L_0x0062:
            r5 = r3
        L_0x0063:
            r0.setVisibility(r5)
            com.hisense.connect_life.hismart.networks.request.device.model.OnlineStatus r0 = com.hisense.connect_life.hismart.networks.request.device.model.OnlineStatus.OFFLINE
            if (r9 != 0) goto L_0x006c
            r5 = r1
            goto L_0x0070
        L_0x006c:
            com.hisense.connect_life.hismart.networks.request.device.model.OnlineStatus r5 = r9.getOnlineStatus()
        L_0x0070:
            if (r0 != r5) goto L_0x0074
            r0 = r2
            goto L_0x0075
        L_0x0074:
            r0 = r4
        L_0x0075:
            r8.isOffline = r0
            goto L_0x00ab
        L_0x0078:
            int r0 = com.hisense.juconnect.app_device.R$id.dashboard_wine_cooler_ic
            android.view.View r0 = r8._$_findCachedViewById(r0)
            com.hisense.connect_life.core.widget.IconFontView r0 = (com.hisense.connect_life.core.widget.IconFontView) r0
            if (r0 != 0) goto L_0x0083
            goto L_0x00ab
        L_0x0083:
            com.hisense.connect_life.hismart.networks.request.device.model.OnlineStatus r5 = com.hisense.connect_life.hismart.networks.request.device.model.OnlineStatus.OFFLINE
            if (r9 != 0) goto L_0x0089
            r6 = r1
            goto L_0x008d
        L_0x0089:
            com.hisense.connect_life.hismart.networks.request.device.model.OnlineStatus r6 = r9.getOnlineStatus()
        L_0x008d:
            if (r5 != r6) goto L_0x0091
            r5 = r2
            goto L_0x0092
        L_0x0091:
            r5 = r4
        L_0x0092:
            if (r5 == 0) goto L_0x0096
            r5 = r4
            goto L_0x0097
        L_0x0096:
            r5 = r3
        L_0x0097:
            r0.setVisibility(r5)
            com.hisense.connect_life.hismart.networks.request.device.model.OnlineStatus r0 = com.hisense.connect_life.hismart.networks.request.device.model.OnlineStatus.OFFLINE
            if (r9 != 0) goto L_0x00a0
            r5 = r1
            goto L_0x00a4
        L_0x00a0:
            com.hisense.connect_life.hismart.networks.request.device.model.OnlineStatus r5 = r9.getOnlineStatus()
        L_0x00a4:
            if (r0 != r5) goto L_0x00a8
            r0 = r2
            goto L_0x00a9
        L_0x00a8:
            r0 = r4
        L_0x00a9:
            r8.isOffline = r0
        L_0x00ab:
            if (r9 == 0) goto L_0x0313
            com.google.gson.JsonObject r0 = r9.getProperties()
            if (r0 == 0) goto L_0x0313
            com.google.gson.JsonObject r0 = r9.getProperties()
            java.lang.String r5 = "0"
            if (r0 != 0) goto L_0x00bd
        L_0x00bb:
            r0 = r5
            goto L_0x00cd
        L_0x00bd:
            java.lang.String r6 = "KeyLockStatus"
            com.google.gson.JsonElement r0 = r0.get(r6)
            if (r0 != 0) goto L_0x00c6
            goto L_0x00bb
        L_0x00c6:
            java.lang.String r0 = r0.getAsString()
            if (r0 != 0) goto L_0x00cd
            goto L_0x00bb
        L_0x00cd:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r5)
            java.lang.String r6 = r9.getDeviceId()
            boolean r6 = r8.isThreeZone(r6)
            if (r6 != 0) goto L_0x00df
            r8.isThreeZone = r4
            r0 = r0 ^ 1
        L_0x00df:
            com.google.gson.JsonObject r6 = r9.getProperties()
            if (r6 != 0) goto L_0x00e7
        L_0x00e5:
            r6 = r5
            goto L_0x00f7
        L_0x00e7:
            java.lang.String r7 = "ChildLockSoundVolume"
            com.google.gson.JsonElement r6 = r6.get(r7)
            if (r6 != 0) goto L_0x00f0
            goto L_0x00e5
        L_0x00f0:
            java.lang.String r6 = r6.getAsString()
            if (r6 != 0) goto L_0x00f7
            goto L_0x00e5
        L_0x00f7:
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r5)
            r6 = r6 ^ r2
            r8.soundIsOpen = r6
            com.google.gson.JsonObject r6 = r9.getProperties()
            if (r6 != 0) goto L_0x0106
        L_0x0104:
            r6 = r5
            goto L_0x0116
        L_0x0106:
            java.lang.String r7 = "RemoteControlMode"
            com.google.gson.JsonElement r6 = r6.get(r7)
            if (r6 != 0) goto L_0x010f
            goto L_0x0104
        L_0x010f:
            java.lang.String r6 = r6.getAsString()
            if (r6 != 0) goto L_0x0116
            goto L_0x0104
        L_0x0116:
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r5)
            r6 = r6 ^ r2
            r8.isRemote = r6
            if (r6 == 0) goto L_0x0136
            int r6 = com.hisense.juconnect.app_device.R$id.font_remote_on
            android.view.View r6 = r8._$_findCachedViewById(r6)
            com.hisense.connect_life.core.widget.OvenIconFontView r6 = (com.hisense.connect_life.core.widget.OvenIconFontView) r6
            r6.setVisibility(r4)
            int r6 = com.hisense.juconnect.app_device.R$id.font_remote_off
            android.view.View r6 = r8._$_findCachedViewById(r6)
            com.hisense.connect_life.core.widget.ClAllFontView r6 = (com.hisense.connect_life.core.widget.ClAllFontView) r6
            r6.setVisibility(r3)
            goto L_0x014c
        L_0x0136:
            int r6 = com.hisense.juconnect.app_device.R$id.font_remote_on
            android.view.View r6 = r8._$_findCachedViewById(r6)
            com.hisense.connect_life.core.widget.OvenIconFontView r6 = (com.hisense.connect_life.core.widget.OvenIconFontView) r6
            r6.setVisibility(r3)
            int r6 = com.hisense.juconnect.app_device.R$id.font_remote_off
            android.view.View r6 = r8._$_findCachedViewById(r6)
            com.hisense.connect_life.core.widget.ClAllFontView r6 = (com.hisense.connect_life.core.widget.ClAllFontView) r6
            r6.setVisibility(r4)
        L_0x014c:
            com.hisense.connect_life.hismart.networks.request.device.model.OnlineStatus r6 = r9.getOnlineStatus()
            com.hisense.connect_life.hismart.networks.request.device.model.OnlineStatus r7 = com.hisense.connect_life.hismart.networks.request.device.model.OnlineStatus.CONNECTED
            if (r6 != r7) goto L_0x0156
            r6 = r2
            goto L_0x0157
        L_0x0156:
            r6 = r4
        L_0x0157:
            if (r6 == 0) goto L_0x0170
            int r6 = com.hisense.juconnect.app_device.R$id.font_w_on
            android.view.View r6 = r8._$_findCachedViewById(r6)
            com.hisense.connect_life.core.widget.OvenIconFontView r6 = (com.hisense.connect_life.core.widget.OvenIconFontView) r6
            r6.setVisibility(r4)
            int r6 = com.hisense.juconnect.app_device.R$id.font_w_off
            android.view.View r6 = r8._$_findCachedViewById(r6)
            com.hisense.connect_life.core.widget.OvenIconFontView r6 = (com.hisense.connect_life.core.widget.OvenIconFontView) r6
            r6.setVisibility(r3)
            goto L_0x019c
        L_0x0170:
            int r6 = com.hisense.juconnect.app_device.R$id.font_w_on
            android.view.View r6 = r8._$_findCachedViewById(r6)
            com.hisense.connect_life.core.widget.OvenIconFontView r6 = (com.hisense.connect_life.core.widget.OvenIconFontView) r6
            r6.setVisibility(r3)
            int r6 = com.hisense.juconnect.app_device.R$id.font_w_off
            android.view.View r6 = r8._$_findCachedViewById(r6)
            com.hisense.connect_life.core.widget.OvenIconFontView r6 = (com.hisense.connect_life.core.widget.OvenIconFontView) r6
            r6.setVisibility(r4)
            int r6 = com.hisense.juconnect.app_device.R$id.font_remote_off
            android.view.View r6 = r8._$_findCachedViewById(r6)
            com.hisense.connect_life.core.widget.ClAllFontView r6 = (com.hisense.connect_life.core.widget.ClAllFontView) r6
            r6.setVisibility(r4)
            int r6 = com.hisense.juconnect.app_device.R$id.font_remote_on
            android.view.View r6 = r8._$_findCachedViewById(r6)
            com.hisense.connect_life.core.widget.OvenIconFontView r6 = (com.hisense.connect_life.core.widget.OvenIconFontView) r6
            r6.setVisibility(r3)
        L_0x019c:
            int r6 = com.hisense.juconnect.app_device.R$id.toggle_child_lock
            android.view.View r6 = r8._$_findCachedViewById(r6)
            android.widget.ToggleButton r6 = (android.widget.ToggleButton) r6
            if (r6 != 0) goto L_0x01a7
            goto L_0x01aa
        L_0x01a7:
            r6.setChecked(r0)
        L_0x01aa:
            r8.isKeyLockOn = r0
            com.google.gson.JsonObject r0 = r9.getProperties()
            if (r0 != 0) goto L_0x01b4
        L_0x01b2:
            r0 = r1
            goto L_0x01c1
        L_0x01b4:
            java.lang.String r6 = "SabbathMode"
            com.google.gson.JsonElement r0 = r0.get(r6)
            if (r0 != 0) goto L_0x01bd
            goto L_0x01b2
        L_0x01bd:
            java.lang.String r0 = r0.getAsString()
        L_0x01c1:
            java.lang.String r6 = "1"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r6)
            if (r0 == 0) goto L_0x022b
            com.google.gson.JsonObject r0 = r9.getProperties()
            if (r0 != 0) goto L_0x01d1
        L_0x01cf:
            r0 = r1
            goto L_0x01de
        L_0x01d1:
            java.lang.String r6 = "SabbathModeStatus"
            com.google.gson.JsonElement r0 = r0.get(r6)
            if (r0 != 0) goto L_0x01da
            goto L_0x01cf
        L_0x01da:
            java.lang.String r0 = r0.getAsString()
        L_0x01de:
            java.lang.String r6 = "2"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r6)
            if (r0 == 0) goto L_0x022b
            r8.isSubbathActive = r2
            int r0 = com.hisense.juconnect.app_device.R$id.iv_lock_top
            android.view.View r0 = r8._$_findCachedViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0.setVisibility(r4)
            int r0 = com.hisense.juconnect.app_device.R$id.sabbath_is_active
            android.view.View r0 = r8._$_findCachedViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0.setVisibility(r4)
            int r0 = com.hisense.juconnect.app_device.R$id.sabbath_is_noactive
            android.view.View r0 = r8._$_findCachedViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0.setVisibility(r3)
            int r0 = com.hisense.juconnect.app_device.R$id.iv_lights_top
            android.view.View r0 = r8._$_findCachedViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0.setVisibility(r4)
            int r0 = com.hisense.juconnect.app_device.R$id.font_w_on02
            android.view.View r0 = r8._$_findCachedViewById(r0)
            com.hisense.connect_life.core.widget.OvenIconFontView r0 = (com.hisense.connect_life.core.widget.OvenIconFontView) r0
            r0.setVisibility(r4)
            int r0 = com.hisense.juconnect.app_device.R$id.font_w_off02
            android.view.View r0 = r8._$_findCachedViewById(r0)
            com.hisense.connect_life.core.widget.OvenIconFontView r0 = (com.hisense.connect_life.core.widget.OvenIconFontView) r0
            r0.setVisibility(r3)
            goto L_0x026f
        L_0x022b:
            r8.isSubbathActive = r4
            int r0 = com.hisense.juconnect.app_device.R$id.iv_lock_top
            android.view.View r0 = r8._$_findCachedViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0.setVisibility(r3)
            int r0 = com.hisense.juconnect.app_device.R$id.sabbath_is_active
            android.view.View r0 = r8._$_findCachedViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0.setVisibility(r3)
            int r0 = com.hisense.juconnect.app_device.R$id.sabbath_is_noactive
            android.view.View r0 = r8._$_findCachedViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0.setVisibility(r4)
            int r0 = com.hisense.juconnect.app_device.R$id.iv_lights_top
            android.view.View r0 = r8._$_findCachedViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0.setVisibility(r3)
            int r0 = com.hisense.juconnect.app_device.R$id.font_w_on02
            android.view.View r0 = r8._$_findCachedViewById(r0)
            com.hisense.connect_life.core.widget.OvenIconFontView r0 = (com.hisense.connect_life.core.widget.OvenIconFontView) r0
            r0.setVisibility(r3)
            int r0 = com.hisense.juconnect.app_device.R$id.font_w_off02
            android.view.View r0 = r8._$_findCachedViewById(r0)
            com.hisense.connect_life.core.widget.OvenIconFontView r0 = (com.hisense.connect_life.core.widget.OvenIconFontView) r0
            r0.setVisibility(r4)
        L_0x026f:
            boolean r0 = r8.isSubbathActive
            r8.setSabbathActive(r0)
            com.google.gson.JsonObject r0 = r9.getProperties()
            if (r0 != 0) goto L_0x027c
        L_0x027a:
            r0 = r5
            goto L_0x028c
        L_0x027c:
            java.lang.String r3 = "ChildLockNotSting"
            com.google.gson.JsonElement r0 = r0.get(r3)
            if (r0 != 0) goto L_0x0285
            goto L_0x027a
        L_0x0285:
            java.lang.String r0 = r0.getAsString()
            if (r0 != 0) goto L_0x028c
            goto L_0x027a
        L_0x028c:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r5)
            r0 = r0 ^ r2
            r8.ChildLockNot = r0
            com.google.gson.JsonObject r0 = r9.getProperties()
            if (r0 != 0) goto L_0x029b
        L_0x0299:
            r0 = r5
            goto L_0x02ab
        L_0x029b:
            java.lang.String r3 = "ChildLockSetting"
            com.google.gson.JsonElement r0 = r0.get(r3)
            if (r0 != 0) goto L_0x02a4
            goto L_0x0299
        L_0x02a4:
            java.lang.String r0 = r0.getAsString()
            if (r0 != 0) goto L_0x02ab
            goto L_0x0299
        L_0x02ab:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r5)
            r0 = r0 ^ r2
            r8.ChildLockSet = r0
            com.google.gson.JsonObject r0 = r9.getProperties()
            if (r0 != 0) goto L_0x02b9
            goto L_0x02c6
        L_0x02b9:
            java.lang.String r3 = "RealVibration"
            com.google.gson.JsonElement r0 = r0.get(r3)
            if (r0 != 0) goto L_0x02c2
            goto L_0x02c6
        L_0x02c2:
            java.lang.String r1 = r0.getAsString()
        L_0x02c6:
            if (r1 == 0) goto L_0x030c
            kotlin.jvm.internal.StringCompanionObject r0 = kotlin.jvm.internal.StringCompanionObject.INSTANCE
            java.lang.Object[] r0 = new java.lang.Object[r2]
            float r1 = java.lang.Float.parseFloat(r1)
            r3 = 1092406477(0x411ccccd, float:9.8)
            float r1 = r1 * r3
            r3 = 1149239296(0x44800000, float:1024.0)
            float r1 = r1 / r3
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r0[r4] = r1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            java.lang.String r1 = "%.4f"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            java.lang.String r1 = "format(format, *args)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            int r1 = com.hisense.juconnect.app_device.R$id.tv_vibration1
            android.view.View r1 = r8._$_findCachedViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r2 = "m/s²"
            java.lang.String r3 = kotlin.jvm.internal.Intrinsics.stringPlus(r0, r2)
            r1.setText(r3)
            int r1 = com.hisense.juconnect.app_device.R$id.tv_vibration2
            android.view.View r1 = r8._$_findCachedViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r0, r2)
            r1.setText(r0)
        L_0x030c:
            java.lang.String r9 = r9.getDeviceId()
            r8.setIsShowVi(r9)
        L_0x0313:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.juconnect.app_device.fragment.OneApplianceFragment.setOfflineStatusShow(com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo):void");
    }

    private final void setSingleZoneData(DeviceInfo deviceInfo) {
        JsonObject jsonObject;
        JsonObject properties;
        JsonElement jsonElement;
        String str;
        String asString;
        View _$_findCachedViewById = _$_findCachedViewById(R$id.single_zone_layout);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "single_zone_layout");
        _$_findCachedViewById.setVisibility(0);
        View _$_findCachedViewById2 = _$_findCachedViewById(R$id.wine_inventory_humiture);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById2, "wine_inventory_humiture");
        _$_findCachedViewById2.setVisibility(8);
        String str2 = null;
        if (deviceInfo == null) {
            jsonObject = null;
        } else {
            jsonObject = deviceInfo.getProperties();
        }
        if (jsonObject == null || jsonObject.size() <= 0) {
            ((TextView) _$_findCachedViewById(R$id.tv__single_zone_temperature)).setText("--");
            ((TextView) _$_findCachedViewById(R$id.tv_single_zone_humidity)).setText("--");
        } else {
            String asString2 = jsonObject.get("TemperatureUnit").getAsString();
            if (asString2 == null) {
                asString2 = "0";
            }
            this.temperatureUnit = asString2;
            JsonElement jsonElement2 = jsonObject.get("Zone1SetTemperature");
            String str3 = "";
            if (jsonElement2 == null || (str = jsonElement2.getAsString()) == null) {
                str = str3;
            }
            JsonElement jsonElement3 = jsonObject.get("Zone1RealHumidity");
            if (!(jsonElement3 == null || (asString = jsonElement3.getAsString()) == null)) {
                str3 = asString;
            }
            if (Intrinsics.areEqual((Object) this.temperatureUnit, (Object) "0")) {
                ((TextView) _$_findCachedViewById(R$id.tv_single_zone_temperature_unit)).setText("℃");
            } else {
                ((TextView) _$_findCachedViewById(R$id.tv_single_zone_temperature_unit)).setText("℉");
            }
            ((TextView) _$_findCachedViewById(R$id.tv__single_zone_temperature)).setText(str);
            ((TextView) _$_findCachedViewById(R$id.tv_single_zone_humidity)).setText(str3);
        }
        if (!(deviceInfo == null || (properties = deviceInfo.getProperties()) == null || (jsonElement = properties.get("HumidityMeasureSetting")) == null)) {
            str2 = jsonElement.getAsString();
        }
        if (Intrinsics.areEqual((Object) str2, (Object) "0")) {
            _$_findCachedViewById(R$id.humidity_divider).setVisibility(8);
            ((RelativeLayout) _$_findCachedViewById(R$id.humidity_show)).setVisibility(8);
            return;
        }
        _$_findCachedViewById(R$id.humidity_divider).setVisibility(0);
        ((RelativeLayout) _$_findCachedViewById(R$id.humidity_show)).setVisibility(0);
    }

    private final void setThreeZoneData(DeviceInfo deviceInfo) {
        JsonObject jsonObject;
        String str;
        String str2;
        JsonElement jsonElement;
        String str3;
        String str4;
        JsonElement jsonElement2;
        String str5;
        String str6;
        JsonElement jsonElement3;
        View _$_findCachedViewById = _$_findCachedViewById(R$id.single_zone_layout);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "single_zone_layout");
        _$_findCachedViewById.setVisibility(8);
        View _$_findCachedViewById2 = _$_findCachedViewById(R$id.wine_inventory_humiture);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById2, "wine_inventory_humiture");
        boolean z = false;
        _$_findCachedViewById2.setVisibility(0);
        if (deviceInfo == null) {
            jsonObject = null;
        } else {
            jsonObject = deviceInfo.getProperties();
        }
        if (jsonObject == null || jsonObject.size() <= 0) {
            DeviceCache instance = DeviceCache.Companion.getInstance();
            DeviceInfo deviceInfo2 = this.device;
            Intrinsics.stringPlus("获取到类型", Integer.valueOf(instance.isDeviceType(deviceInfo2 == null ? null : deviceInfo2.getDeviceId())));
            clearData();
            FragmentActivity requireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
            String auid = ((DeviceInfoActivity) requireActivity).getAuid();
            Intrinsics.stringPlus("开始加载", auid);
            if (DeviceCache.Companion.getInstance().isDeviceType(auid) == DeviceCache.Companion.getInstance().getBattleTwoZoneDevice()) {
                CollectionsKt__MutableCollectionsKt.addAll(this.list11, (T[]) new Pair[]{new Pair(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, ""), new Pair("B", "")});
                CollectionsKt__MutableCollectionsKt.addAll(this.list12, (T[]) new Pair[]{new Pair("--", "0"), new Pair("--", "0")});
                CollectionsKt__MutableCollectionsKt.addAll(this.list13, (T[]) new Pair[]{new Pair("--", ""), new Pair("--", "")});
            } else {
                CollectionsKt__MutableCollectionsKt.addAll(this.list11, (T[]) new Pair[]{new Pair(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, ""), new Pair("B", ""), new Pair("C", "")});
                CollectionsKt__MutableCollectionsKt.addAll(this.list12, (T[]) new Pair[]{new Pair("--", "0"), new Pair("--", "0"), new Pair("--", "0")});
                CollectionsKt__MutableCollectionsKt.addAll(this.list13, (T[]) new Pair[]{new Pair("--", ""), new Pair("--", ""), new Pair("--", "")});
            }
        } else {
            Intrinsics.checkNotNull(deviceInfo);
            String deviceId = deviceInfo.getDeviceId();
            String asString = jsonObject.get("Zone2Use").getAsString();
            if (asString == null) {
                asString = "0";
            }
            SPManagerKt.setZone2Use(deviceId, asString);
            String asString2 = jsonObject.get("TemperatureUnit").getAsString();
            if (asString2 == null) {
                asString2 = "0";
            }
            this.temperatureUnit = asString2;
            clearData();
            DeviceCache instance2 = DeviceCache.Companion.getInstance();
            DeviceInfo deviceInfo3 = this.device;
            int isDeviceType = instance2.isDeviceType(deviceInfo3 == null ? null : deviceInfo3.getDeviceId());
            if (isDeviceType == DeviceCache.Companion.getInstance().getBattleTwoZoneDevice()) {
                int i = 0;
                while (i < 2) {
                    int i2 = i + 1;
                    JsonElement jsonElement4 = jsonObject.get("Zone" + i2 + "SetTemperature");
                    if (jsonElement4 == null || (str5 = jsonElement4.getAsString()) == null) {
                        str5 = "";
                    }
                    JsonElement jsonElement5 = jsonObject.get("Zone" + i2 + "RealHumidity");
                    if (jsonElement5 == null || (str6 = jsonElement5.getAsString()) == null) {
                        str6 = "";
                    }
                    if (!(str5.length() > 0 ? true : z)) {
                        if (!(str6.length() > 0 ? true : z)) {
                            break;
                        }
                    }
                    this.list11.add(new Pair(this.list.get(i), ""));
                    this.list12.add(new Pair(str5, this.temperatureUnit));
                    if (this.isBattle) {
                        JsonObject properties = deviceInfo.getProperties();
                        if (Intrinsics.areEqual((Object) (properties == null || (jsonElement3 = properties.get("HumidityMeasureSetting")) == null) ? null : jsonElement3.getAsString(), (Object) "0")) {
                            this.list13.clear();
                            i = i2;
                            z = false;
                        }
                    }
                    this.list13.add(new Pair(str6, ""));
                    i = i2;
                    z = false;
                }
            } else if (isDeviceType == DeviceCache.Companion.getInstance().getBattleSingleZoneDevice() || isDeviceType == DeviceCache.Companion.getInstance().getSingleZoneDevice()) {
                int i3 = 0;
                while (i3 < 2) {
                    int i4 = i3 + 1;
                    JsonElement jsonElement6 = jsonObject.get("Zone" + i4 + "SetTemperature");
                    if (jsonElement6 == null || (str = jsonElement6.getAsString()) == null) {
                        str = "";
                    }
                    JsonElement jsonElement7 = jsonObject.get("Zone" + i4 + "RealHumidity");
                    if (jsonElement7 == null || (str2 = jsonElement7.getAsString()) == null) {
                        str2 = "";
                    }
                    if (!(str.length() > 0)) {
                        if (!(str2.length() > 0)) {
                            break;
                        }
                    }
                    this.list11.add(new Pair(this.list.get(i3), ""));
                    this.list12.add(new Pair(str, this.temperatureUnit));
                    if (this.isBattle) {
                        JsonObject properties2 = deviceInfo.getProperties();
                        if (Intrinsics.areEqual((Object) (properties2 == null || (jsonElement = properties2.get("HumidityMeasureSetting")) == null) ? null : jsonElement.getAsString(), (Object) "0")) {
                            this.list13.clear();
                            i3 = i4;
                        }
                    }
                    this.list13.add(new Pair(str2, ""));
                    i3 = i4;
                }
            } else {
                int i5 = 0;
                while (i5 < 4) {
                    int i6 = i5 + 1;
                    JsonElement jsonElement8 = jsonObject.get("Zone" + i6 + "SetTemperature");
                    if (jsonElement8 == null || (str3 = jsonElement8.getAsString()) == null) {
                        str3 = "";
                    }
                    JsonElement jsonElement9 = jsonObject.get("Zone" + i6 + "RealHumidity");
                    if (jsonElement9 == null || (str4 = jsonElement9.getAsString()) == null) {
                        str4 = "";
                    }
                    if (!(str3.length() > 0)) {
                        if (!(str4.length() > 0)) {
                            break;
                        }
                    }
                    this.list11.add(new Pair(this.list.get(i5), ""));
                    this.list12.add(new Pair(str3, this.temperatureUnit));
                    JsonObject properties3 = deviceInfo.getProperties();
                    if (Intrinsics.areEqual((Object) (properties3 == null || (jsonElement2 = properties3.get("HumidityMeasureSetting")) == null) ? null : jsonElement2.getAsString(), (Object) "0")) {
                        this.list13.clear();
                    } else {
                        this.list13.add(new Pair(str4, ""));
                    }
                    i5 = i6;
                }
            }
        }
        refreshAdapter();
    }

    /* renamed from: subscribeObservable$lambda-21  reason: not valid java name */
    public static final void m27167subscribeObservable$lambda21(OneApplianceFragment oneApplianceFragment, List<Notification> list2) {
        Intrinsics.checkNotNullParameter(oneApplianceFragment, "this$0");
        if (list2 != null) {
            CardView cardView = (CardView) oneApplianceFragment._$_findCachedViewById(R$id.device_notification);
            Intrinsics.checkNotNullExpressionValue(cardView, "device_notification");
            cardView.setVisibility(0);
            oneApplianceFragment.unReadList = list2;
            if (list2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("unReadList");
                list2 = null;
            }
            oneApplianceFragment.getUnReadMSG(list2);
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
        return R$layout.fragment_one_appliance;
    }

    public final void clearNotification() {
        Job unused = BuildersKt__Builders_commonKt.launch$default(this, Dispatchers.getIO(), (CoroutineStart) null, new OneApplianceFragment$clearNotification$1(this, (Continuation<? super OneApplianceFragment$clearNotification$1>) null), 2, (Object) null);
        CardView cardView = (CardView) _$_findCachedViewById(R$id.device_notification);
        Intrinsics.checkNotNullExpressionValue(cardView, "device_notification");
        cardView.setVisibility(8);
    }

    @NotNull
    public Class<DeviceViewModel> initViewModelClz() {
        return DeviceViewModel.class;
    }

    public void initWidgets(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        RelativeLayout relativeLayout = (RelativeLayout) _$_findCachedViewById(R$id.wine_cooler_name_layout);
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "wine_cooler_name_layout");
        boolean z = true;
        relativeLayout.setVisibility(this.isHomePage ^ true ? 0 : 8);
        setOfflineStatusShow(this.device);
        this.isBattle = isBattle(this.deviceAuid);
        DeviceInfo deviceInfo = this.device;
        if (deviceInfo != null) {
            String.valueOf(deviceInfo);
            DeviceCache instance = DeviceCache.Companion.getInstance();
            DeviceInfo deviceInfo2 = this.device;
            String str = null;
            if (instance.isDeviceType(deviceInfo2 == null ? null : deviceInfo2.getDeviceId()) != DeviceCache.Companion.getInstance().getSingleZoneDevice()) {
                DeviceCache instance2 = DeviceCache.Companion.getInstance();
                DeviceInfo deviceInfo3 = this.device;
                if (deviceInfo3 != null) {
                    str = deviceInfo3.getDeviceId();
                }
                if (instance2.isDeviceType(str) != DeviceCache.Companion.getInstance().getBattleSingleZoneDevice()) {
                    z = false;
                }
            }
            this.isSingleZone = z;
        }
        if (this.isSingleZone) {
            setSingleZoneData(this.device);
        } else {
            initThreeZoneLayout();
        }
        EventBus.getDefault().register(this);
    }

    public final boolean isBattle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, KeyConst.KEY_AUIT);
        return DeviceCache.Companion.getInstance().isDeviceType(str) == DeviceCache.Companion.getInstance().getBattleSingleZoneDevice() || DeviceCache.Companion.getInstance().isDeviceType(str) == DeviceCache.Companion.getInstance().getBattleTwoZoneDevice();
    }

    public final boolean isHomePage() {
        return this.isHomePage;
    }

    public final boolean isThreeOrOldSingle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, KeyConst.KEY_AUIT);
        return DeviceCache.Companion.getInstance().isDeviceType(str) == DeviceCache.Companion.getInstance().getSingleZoneDevice() || DeviceCache.Companion.getInstance().isDeviceType(str) == DeviceCache.Companion.getInstance().getThreeZoneDevice();
    }

    public final boolean isThreeZone(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, KeyConst.KEY_AUIT);
        return DeviceCache.Companion.getInstance().isDeviceType(str) == DeviceCache.Companion.getInstance().getThreeZoneDevice();
    }

    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && intent != null) {
            this.isKeyLockOn = intent.getBooleanExtra(EventBusConstKt.AUTH_CODE, false);
            ((ToggleButton) _$_findCachedViewById(R$id.toggle_child_lock)).setChecked(this.isKeyLockOn);
        }
    }

    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        if (getArguments() == null) {
            String deviceAuid2 = ((DeviceInfoActivity) context).getDeviceAuid();
            SPManagerKt.setDeviceAuid(deviceAuid2);
            this.deviceAuid = deviceAuid2;
            this.device = DeviceCache.Companion.getInstance().getDevice(this.deviceAuid);
            return;
        }
        Bundle arguments = getArguments();
        Object obj = arguments == null ? null : arguments.get(EventBusConstKt.DEVICE_LIST_KEY);
        if (obj != null) {
            List asMutableList = TypeIntrinsics.asMutableList(obj);
            String deviceId = ((DeviceInfo) CollectionsKt___CollectionsKt.first(asMutableList)).getDeviceId();
            SPManagerKt.setDeviceAuid(deviceId);
            this.deviceAuid = deviceId;
            this.device = (DeviceInfo) CollectionsKt___CollectionsKt.first(asMutableList);
            Intrinsics.stringPlus("device = mutableList.first()", CollectionsKt___CollectionsKt.first(asMutableList));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableList<com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo>");
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
        FragmentActivity activity;
        Intrinsics.checkNotNullParameter(obj, "message");
        if (Intrinsics.areEqual(obj, (Object) 105) && (activity = getActivity()) != null) {
            activity.finish();
        }
    }

    public void onPause() {
        super.onPause();
        clearNotification();
    }

    public final void refreshWineCoolerInfo(@NotNull DeviceInfo deviceInfo) {
        boolean z;
        Intrinsics.checkNotNullParameter(deviceInfo, GeneralMethodConstant.METHOD_DEVICE_INFO);
        if (this.device == null) {
            this.device = deviceInfo;
        }
        HumitureListAdapter humitureListAdapter = null;
        if (this.device != null) {
            DeviceCache instance = DeviceCache.Companion.getInstance();
            DeviceInfo deviceInfo2 = this.device;
            if (instance.isDeviceType(deviceInfo2 == null ? null : deviceInfo2.getDeviceId()) != DeviceCache.Companion.getInstance().getSingleZoneDevice()) {
                DeviceCache instance2 = DeviceCache.Companion.getInstance();
                DeviceInfo deviceInfo3 = this.device;
                if (instance2.isDeviceType(deviceInfo3 == null ? null : deviceInfo3.getDeviceId()) != DeviceCache.Companion.getInstance().getBattleSingleZoneDevice()) {
                    z = false;
                    this.isSingleZone = z;
                }
            }
            z = true;
            this.isSingleZone = z;
        }
        setOfflineStatusShow(deviceInfo);
        if (this.isSingleZone) {
            setSingleZoneData(deviceInfo);
            return;
        }
        setThreeZoneData(deviceInfo);
        if (((ListView) _$_findCachedViewById(R$id.lv1)) != null) {
            ListView listView = (ListView) _$_findCachedViewById(R$id.lv1);
            HumitureListAdapter humitureListAdapter2 = this.arrayAdapter1;
            if (humitureListAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("arrayAdapter1");
                humitureListAdapter2 = null;
            }
            listView.setAdapter(humitureListAdapter2);
        }
        if (((ListView) _$_findCachedViewById(R$id.lv2)) != null) {
            ListView listView2 = (ListView) _$_findCachedViewById(R$id.lv2);
            HumitureListAdapter humitureListAdapter3 = this.arrayAdapter2;
            if (humitureListAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("arrayAdapter2");
                humitureListAdapter3 = null;
            }
            listView2.setAdapter(humitureListAdapter3);
        }
        if (((ListView) _$_findCachedViewById(R$id.lv3)) != null) {
            ListView listView3 = (ListView) _$_findCachedViewById(R$id.lv3);
            HumitureListAdapter humitureListAdapter4 = this.arrayAdapter3;
            if (humitureListAdapter4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("arrayAdapter3");
            } else {
                humitureListAdapter = humitureListAdapter4;
            }
            listView3.setAdapter(humitureListAdapter);
        }
    }

    public final void setHomePage(boolean z) {
        this.isHomePage = z;
    }

    public final void setIsShowVi(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, KeyConst.KEY_AUIT);
        if (isThreeOrOldSingle(str)) {
            ((LinearLayout) _$_findCachedViewById(R$id.ll_vibration2)).setVisibility(0);
            ((LinearLayout) _$_findCachedViewById(R$id.ll_vibration1)).setVisibility(0);
            return;
        }
        ((LinearLayout) _$_findCachedViewById(R$id.ll_vibration2)).setVisibility(8);
        ((LinearLayout) _$_findCachedViewById(R$id.ll_vibration1)).setVisibility(8);
    }

    public void setListeners() {
        ((ImageView) _$_findCachedViewById(R$id.iv_lock_top)).setOnClickListener(new C7537c(this));
        ((ImageView) _$_findCachedViewById(R$id.iv_lights_top)).setOnClickListener(new C7538d(this));
        ((ImageView) _$_findCachedViewById(R$id.iv_lock_go)).setOnClickListener(new C7552r(this));
        ((ToggleButton) _$_findCachedViewById(R$id.toggle_child_lock)).setOnCheckedChangeListener(new C7541g(this));
        RelativeLayout relativeLayout = (RelativeLayout) _$_findCachedViewById(R$id.wine_inventory_maintain1);
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "wine_inventory_maintain1");
        JuConnectExtKt.singleClickListener(relativeLayout, new OneApplianceFragment$setListeners$5(this));
        View _$_findCachedViewById = _$_findCachedViewById(R$id.single_zone_layout);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "single_zone_layout");
        JuConnectExtKt.singleClickListener(_$_findCachedViewById, new OneApplianceFragment$setListeners$6(this));
        View _$_findCachedViewById2 = _$_findCachedViewById(R$id.wine_inventory_humiture);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById2, "wine_inventory_humiture");
        JuConnectExtKt.singleClickListener(_$_findCachedViewById2, new OneApplianceFragment$setListeners$7(this));
        CardView cardView = (CardView) _$_findCachedViewById(R$id.device_correlation_lights);
        Intrinsics.checkNotNullExpressionValue(cardView, "device_correlation_lights");
        JuConnectExtKt.singleClickListener(cardView, new OneApplianceFragment$setListeners$8(this));
        CardView cardView2 = (CardView) _$_findCachedViewById(R$id.device_correlation_statistics);
        Intrinsics.checkNotNullExpressionValue(cardView2, "device_correlation_statistics");
        JuConnectExtKt.singleClickListener(cardView2, new OneApplianceFragment$setListeners$9(this));
        CardView cardView3 = (CardView) _$_findCachedViewById(R$id.device_correlation_settings);
        Intrinsics.checkNotNullExpressionValue(cardView3, "device_correlation_settings");
        JuConnectExtKt.singleClickListener(cardView3, new OneApplianceFragment$setListeners$10(this));
        CardView cardView4 = (CardView) _$_findCachedViewById(R$id.device_correlation_manuals);
        Intrinsics.checkNotNullExpressionValue(cardView4, "device_correlation_manuals");
        JuConnectExtKt.singleClickListener(cardView4, new OneApplianceFragment$setListeners$11(this));
        CardView cardView5 = (CardView) _$_findCachedViewById(R$id.device_correlation_service);
        Intrinsics.checkNotNullExpressionValue(cardView5, "device_correlation_service");
        JuConnectExtKt.singleClickListener(cardView5, OneApplianceFragment$setListeners$12.INSTANCE);
        TextView textView = (TextView) _$_findCachedViewById(R$id.device_notification_clear);
        Intrinsics.checkNotNullExpressionValue(textView, "device_notification_clear");
        JuConnectExtKt.singleClickListener(textView, new OneApplianceFragment$setListeners$13(this));
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(R$id.device_notification_more);
        Intrinsics.checkNotNullExpressionValue(linearLayout, "device_notification_more");
        JuConnectExtKt.singleClickListener(linearLayout, new OneApplianceFragment$setListeners$14(this));
        LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(R$id.sabbath_is_active_not);
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "sabbath_is_active_not");
        JuConnectExtKt.singleClickListener(linearLayout2, new OneApplianceFragment$setListeners$15(this));
    }

    public final void setSabbathActive(boolean z) {
        if (z) {
            ((ImageView) _$_findCachedViewById(R$id.iv_light)).setAlpha(0.3f);
            ((TextView) _$_findCachedViewById(R$id.tv_light)).setAlpha(0.3f);
            ((ToggleButton) _$_findCachedViewById(R$id.toggle_child_lock)).setAlpha(0.3f);
            ((ImageView) _$_findCachedViewById(R$id.iv_lock)).setAlpha(0.3f);
            ((TextView) _$_findCachedViewById(R$id.tv_lock)).setAlpha(0.3f);
            ((TextView) _$_findCachedViewById(R$id.control_appliance)).setAlpha(0.3f);
            ((IconFontView) _$_findCachedViewById(R$id.dashboard_wine_cooler_ic2)).setAlpha(0.3f);
            return;
        }
        ((ImageView) _$_findCachedViewById(R$id.iv_light)).setAlpha(1.0f);
        ((TextView) _$_findCachedViewById(R$id.tv_light)).setAlpha(1.0f);
        ((ToggleButton) _$_findCachedViewById(R$id.toggle_child_lock)).setAlpha(1.0f);
        ((ImageView) _$_findCachedViewById(R$id.iv_lock)).setAlpha(1.0f);
        ((TextView) _$_findCachedViewById(R$id.tv_lock)).setAlpha(1.0f);
        ((TextView) _$_findCachedViewById(R$id.control_appliance)).setAlpha(1.0f);
        ((IconFontView) _$_findCachedViewById(R$id.dashboard_wine_cooler_ic2)).setAlpha(1.0f);
    }

    public void subscribeObservable() {
        super.subscribeObservable();
        getMessageViewModel().getUnReadMessageLiveData().observe(this, new C7553s(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0276  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void updateProp(@org.jetbrains.annotations.NotNull com.hisense.connect_life.hismart.networks.request.message.model.DeviceStatusMessage r8) {
        /*
            r7 = this;
            java.lang.String r0 = "deviceStatusMessage"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r7.deviceAuid
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            java.lang.String r2 = r8.getDeviceid()
            r0.append(r2)
            r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo r2 = r7.device
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x002b
            r2 = r3
            goto L_0x002c
        L_0x002b:
            r2 = r4
        L_0x002c:
            r0.append(r2)
            r0.append(r1)
            r0.toString()
            java.lang.String r0 = r7.deviceAuid
            java.lang.String r1 = r8.getDeviceid()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            if (r0 == 0) goto L_0x02d8
            com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo r0 = r7.device
            if (r0 == 0) goto L_0x02d8
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            com.google.gson.JsonObject r1 = r8.getProperties()
            r0.setProperties(r1)
            boolean r0 = r7.isSingleZone
            if (r0 == 0) goto L_0x0059
            com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo r0 = r7.device
            r7.setSingleZoneData(r0)
            goto L_0x005e
        L_0x0059:
            com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo r0 = r7.device
            r7.setThreeZoneData(r0)
        L_0x005e:
            r0 = 0
            int r1 = com.hisense.juconnect.app_device.R$id.lv2     // Catch:{ Exception -> 0x00ad }
            android.view.View r1 = r7._$_findCachedViewById(r1)     // Catch:{ Exception -> 0x00ad }
            android.widget.ListView r1 = (android.widget.ListView) r1     // Catch:{ Exception -> 0x00ad }
            com.hisense.juconnect.app_device.adapter.HumitureListAdapter r2 = r7.arrayAdapter2     // Catch:{ Exception -> 0x00ad }
            java.lang.String r5 = "arrayAdapter2"
            if (r2 != 0) goto L_0x0071
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)     // Catch:{ Exception -> 0x00ad }
            r2 = r0
        L_0x0071:
            r1.setAdapter(r2)     // Catch:{ Exception -> 0x00ad }
            int r1 = com.hisense.juconnect.app_device.R$id.lv3     // Catch:{ Exception -> 0x00ad }
            android.view.View r1 = r7._$_findCachedViewById(r1)     // Catch:{ Exception -> 0x00ad }
            android.widget.ListView r1 = (android.widget.ListView) r1     // Catch:{ Exception -> 0x00ad }
            com.hisense.juconnect.app_device.adapter.HumitureListAdapter r2 = r7.arrayAdapter3     // Catch:{ Exception -> 0x00ad }
            java.lang.String r6 = "arrayAdapter3"
            if (r2 != 0) goto L_0x0086
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r6)     // Catch:{ Exception -> 0x00ad }
            r2 = r0
        L_0x0086:
            r1.setAdapter(r2)     // Catch:{ Exception -> 0x00ad }
            com.hisense.juconnect.app_device.adapter.HumitureListAdapter r1 = r7.arrayAdapter1     // Catch:{ Exception -> 0x00ad }
            if (r1 != 0) goto L_0x0093
            java.lang.String r1 = "arrayAdapter1"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)     // Catch:{ Exception -> 0x00ad }
            r1 = r0
        L_0x0093:
            r1.notifyDataSetChanged()     // Catch:{ Exception -> 0x00ad }
            com.hisense.juconnect.app_device.adapter.HumitureListAdapter r1 = r7.arrayAdapter2     // Catch:{ Exception -> 0x00ad }
            if (r1 != 0) goto L_0x009e
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)     // Catch:{ Exception -> 0x00ad }
            r1 = r0
        L_0x009e:
            r1.notifyDataSetChanged()     // Catch:{ Exception -> 0x00ad }
            com.hisense.juconnect.app_device.adapter.HumitureListAdapter r1 = r7.arrayAdapter3     // Catch:{ Exception -> 0x00ad }
            if (r1 != 0) goto L_0x00a9
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r6)     // Catch:{ Exception -> 0x00ad }
            r1 = r0
        L_0x00a9:
            r1.notifyDataSetChanged()     // Catch:{ Exception -> 0x00ad }
            goto L_0x00b1
        L_0x00ad:
            r1 = move-exception
            r1.printStackTrace()
        L_0x00b1:
            com.google.gson.JsonObject r1 = r8.getProperties()
            java.lang.String r2 = "0"
            if (r1 != 0) goto L_0x00bb
        L_0x00b9:
            r1 = r2
            goto L_0x00cb
        L_0x00bb:
            java.lang.String r5 = "KeyLockStatus"
            com.google.gson.JsonElement r1 = r1.get(r5)
            if (r1 != 0) goto L_0x00c4
            goto L_0x00b9
        L_0x00c4:
            java.lang.String r1 = r1.getAsString()
            if (r1 != 0) goto L_0x00cb
            goto L_0x00b9
        L_0x00cb:
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            java.lang.String r5 = r8.getDeviceid()
            boolean r5 = r7.isThreeZone(r5)
            if (r5 != 0) goto L_0x00db
            r1 = r1 ^ 1
        L_0x00db:
            r7.isKeyLockOn = r1
            com.google.gson.JsonObject r5 = r8.getProperties()
            if (r5 != 0) goto L_0x00e5
        L_0x00e3:
            r5 = r2
            goto L_0x00f5
        L_0x00e5:
            java.lang.String r6 = "ChildLockSoundVolume"
            com.google.gson.JsonElement r5 = r5.get(r6)
            if (r5 != 0) goto L_0x00ee
            goto L_0x00e3
        L_0x00ee:
            java.lang.String r5 = r5.getAsString()
            if (r5 != 0) goto L_0x00f5
            goto L_0x00e3
        L_0x00f5:
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r2)
            r5 = r5 ^ r3
            r7.soundIsOpen = r5
            com.google.gson.JsonObject r5 = r8.getProperties()
            if (r5 != 0) goto L_0x0104
        L_0x0102:
            r5 = r2
            goto L_0x0114
        L_0x0104:
            java.lang.String r6 = "RemoteControlMode"
            com.google.gson.JsonElement r5 = r5.get(r6)
            if (r5 != 0) goto L_0x010d
            goto L_0x0102
        L_0x010d:
            java.lang.String r5 = r5.getAsString()
            if (r5 != 0) goto L_0x0114
            goto L_0x0102
        L_0x0114:
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r2)
            r5 = r5 ^ r3
            r7.isRemote = r5
            r6 = 8
            if (r5 == 0) goto L_0x0136
            int r5 = com.hisense.juconnect.app_device.R$id.font_remote_on
            android.view.View r5 = r7._$_findCachedViewById(r5)
            com.hisense.connect_life.core.widget.OvenIconFontView r5 = (com.hisense.connect_life.core.widget.OvenIconFontView) r5
            r5.setVisibility(r4)
            int r5 = com.hisense.juconnect.app_device.R$id.font_remote_off
            android.view.View r5 = r7._$_findCachedViewById(r5)
            com.hisense.connect_life.core.widget.ClAllFontView r5 = (com.hisense.connect_life.core.widget.ClAllFontView) r5
            r5.setVisibility(r6)
            goto L_0x014c
        L_0x0136:
            int r5 = com.hisense.juconnect.app_device.R$id.font_remote_on
            android.view.View r5 = r7._$_findCachedViewById(r5)
            com.hisense.connect_life.core.widget.OvenIconFontView r5 = (com.hisense.connect_life.core.widget.OvenIconFontView) r5
            r5.setVisibility(r6)
            int r5 = com.hisense.juconnect.app_device.R$id.font_remote_off
            android.view.View r5 = r7._$_findCachedViewById(r5)
            com.hisense.connect_life.core.widget.ClAllFontView r5 = (com.hisense.connect_life.core.widget.ClAllFontView) r5
            r5.setVisibility(r4)
        L_0x014c:
            int r5 = com.hisense.juconnect.app_device.R$id.toggle_child_lock
            android.view.View r5 = r7._$_findCachedViewById(r5)
            android.widget.ToggleButton r5 = (android.widget.ToggleButton) r5
            if (r5 != 0) goto L_0x0157
            goto L_0x015a
        L_0x0157:
            r5.setChecked(r1)
        L_0x015a:
            com.google.gson.JsonObject r1 = r8.getProperties()
            if (r1 != 0) goto L_0x0162
        L_0x0160:
            r1 = r0
            goto L_0x016f
        L_0x0162:
            java.lang.String r5 = "SabbathMode"
            com.google.gson.JsonElement r1 = r1.get(r5)
            if (r1 != 0) goto L_0x016b
            goto L_0x0160
        L_0x016b:
            java.lang.String r1 = r1.getAsString()
        L_0x016f:
            java.lang.String r5 = "1"
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r5)
            if (r1 == 0) goto L_0x01d9
            com.google.gson.JsonObject r1 = r8.getProperties()
            if (r1 != 0) goto L_0x017f
        L_0x017d:
            r1 = r0
            goto L_0x018c
        L_0x017f:
            java.lang.String r5 = "SabbathModeStatus"
            com.google.gson.JsonElement r1 = r1.get(r5)
            if (r1 != 0) goto L_0x0188
            goto L_0x017d
        L_0x0188:
            java.lang.String r1 = r1.getAsString()
        L_0x018c:
            java.lang.String r5 = "2"
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r5)
            if (r1 == 0) goto L_0x01d9
            r7.isSubbathActive = r3
            int r1 = com.hisense.juconnect.app_device.R$id.iv_lock_top
            android.view.View r1 = r7._$_findCachedViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1.setVisibility(r4)
            int r1 = com.hisense.juconnect.app_device.R$id.sabbath_is_active
            android.view.View r1 = r7._$_findCachedViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1.setVisibility(r4)
            int r1 = com.hisense.juconnect.app_device.R$id.sabbath_is_noactive
            android.view.View r1 = r7._$_findCachedViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1.setVisibility(r6)
            int r1 = com.hisense.juconnect.app_device.R$id.iv_lights_top
            android.view.View r1 = r7._$_findCachedViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1.setVisibility(r4)
            int r1 = com.hisense.juconnect.app_device.R$id.font_w_on02
            android.view.View r1 = r7._$_findCachedViewById(r1)
            com.hisense.connect_life.core.widget.OvenIconFontView r1 = (com.hisense.connect_life.core.widget.OvenIconFontView) r1
            r1.setVisibility(r4)
            int r1 = com.hisense.juconnect.app_device.R$id.font_w_off02
            android.view.View r1 = r7._$_findCachedViewById(r1)
            com.hisense.connect_life.core.widget.OvenIconFontView r1 = (com.hisense.connect_life.core.widget.OvenIconFontView) r1
            r1.setVisibility(r6)
            goto L_0x021d
        L_0x01d9:
            r7.isSubbathActive = r4
            int r1 = com.hisense.juconnect.app_device.R$id.iv_lock_top
            android.view.View r1 = r7._$_findCachedViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1.setVisibility(r6)
            int r1 = com.hisense.juconnect.app_device.R$id.sabbath_is_active
            android.view.View r1 = r7._$_findCachedViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1.setVisibility(r6)
            int r1 = com.hisense.juconnect.app_device.R$id.sabbath_is_noactive
            android.view.View r1 = r7._$_findCachedViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1.setVisibility(r4)
            int r1 = com.hisense.juconnect.app_device.R$id.iv_lights_top
            android.view.View r1 = r7._$_findCachedViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1.setVisibility(r6)
            int r1 = com.hisense.juconnect.app_device.R$id.font_w_on02
            android.view.View r1 = r7._$_findCachedViewById(r1)
            com.hisense.connect_life.core.widget.OvenIconFontView r1 = (com.hisense.connect_life.core.widget.OvenIconFontView) r1
            r1.setVisibility(r6)
            int r1 = com.hisense.juconnect.app_device.R$id.font_w_off02
            android.view.View r1 = r7._$_findCachedViewById(r1)
            com.hisense.connect_life.core.widget.OvenIconFontView r1 = (com.hisense.connect_life.core.widget.OvenIconFontView) r1
            r1.setVisibility(r4)
        L_0x021d:
            boolean r1 = r7.isSubbathActive
            r7.setSabbathActive(r1)
            com.google.gson.JsonObject r1 = r8.getProperties()
            if (r1 != 0) goto L_0x022a
        L_0x0228:
            r1 = r2
            goto L_0x023a
        L_0x022a:
            java.lang.String r5 = "ChildLockNotSting"
            com.google.gson.JsonElement r1 = r1.get(r5)
            if (r1 != 0) goto L_0x0233
            goto L_0x0228
        L_0x0233:
            java.lang.String r1 = r1.getAsString()
            if (r1 != 0) goto L_0x023a
            goto L_0x0228
        L_0x023a:
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            r1 = r1 ^ r3
            r7.ChildLockNot = r1
            com.google.gson.JsonObject r1 = r8.getProperties()
            if (r1 != 0) goto L_0x0249
        L_0x0247:
            r1 = r2
            goto L_0x0259
        L_0x0249:
            java.lang.String r5 = "ChildLockSetting"
            com.google.gson.JsonElement r1 = r1.get(r5)
            if (r1 != 0) goto L_0x0252
            goto L_0x0247
        L_0x0252:
            java.lang.String r1 = r1.getAsString()
            if (r1 != 0) goto L_0x0259
            goto L_0x0247
        L_0x0259:
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            r1 = r1 ^ r3
            r7.ChildLockSet = r1
            com.google.gson.JsonObject r8 = r8.getProperties()
            if (r8 != 0) goto L_0x0267
            goto L_0x0274
        L_0x0267:
            java.lang.String r1 = "RealVibration"
            com.google.gson.JsonElement r8 = r8.get(r1)
            if (r8 != 0) goto L_0x0270
            goto L_0x0274
        L_0x0270:
            java.lang.String r0 = r8.getAsString()
        L_0x0274:
            if (r0 == 0) goto L_0x02bb
            kotlin.jvm.internal.StringCompanionObject r8 = kotlin.jvm.internal.StringCompanionObject.INSTANCE
            java.lang.Object[] r8 = new java.lang.Object[r3]
            float r0 = java.lang.Float.parseFloat(r0)
            r1 = 1092406477(0x411ccccd, float:9.8)
            float r0 = r0 * r1
            r1 = 1149239296(0x44800000, float:1024.0)
            float r0 = r0 / r1
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r8[r4] = r0
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r3)
            java.lang.String r0 = "%.4f"
            java.lang.String r8 = java.lang.String.format(r0, r8)
            java.lang.String r0 = "format(format, *args)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r0)
            int r0 = com.hisense.juconnect.app_device.R$id.tv_vibration1
            android.view.View r0 = r7._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r1 = "m/s²"
            java.lang.String r2 = kotlin.jvm.internal.Intrinsics.stringPlus(r8, r1)
            r0.setText(r2)
            int r0 = com.hisense.juconnect.app_device.R$id.tv_vibration2
            android.view.View r0 = r7._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r8 = kotlin.jvm.internal.Intrinsics.stringPlus(r8, r1)
            r0.setText(r8)
            goto L_0x02d3
        L_0x02bb:
            int r8 = com.hisense.juconnect.app_device.R$id.tv_vibration1
            android.view.View r8 = r7._$_findCachedViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            java.lang.String r0 = "0m/s²"
            r8.setText(r0)
            int r8 = com.hisense.juconnect.app_device.R$id.tv_vibration2
            android.view.View r8 = r7._$_findCachedViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r8.setText(r0)
        L_0x02d3:
            java.lang.String r8 = r7.deviceAuid
            r7.setIsShowVi(r8)
        L_0x02d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.juconnect.app_device.fragment.OneApplianceFragment.updateProp(com.hisense.connect_life.hismart.networks.request.message.model.DeviceStatusMessage):void");
    }

    public final void updateWifiStatus(@NotNull WifiMessage wifiMessage) {
        Intrinsics.checkNotNullParameter(wifiMessage, "wifiMessage");
        DeviceInfo deviceInfo = this.device;
        if (deviceInfo != null && Intrinsics.areEqual((Object) deviceInfo.getWifiId(), (Object) wifiMessage.getWifiid())) {
            deviceInfo.setOnlineStatus(OnlineStatus.Companion.fromType(wifiMessage.getOnlinestats()));
            IconFontView iconFontView = (IconFontView) _$_findCachedViewById(R$id.dashboard_wine_cooler_ic);
            Intrinsics.checkNotNullExpressionValue(iconFontView, "dashboard_wine_cooler_ic");
            int i = 0;
            if (!(OnlineStatus.OFFLINE == deviceInfo.getOnlineStatus())) {
                i = 8;
            }
            iconFontView.setVisibility(i);
        }
    }
}
