package com.hisense.juconnect.app_device.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.gson.Gson;
import com.hisense.connect_life.core.base.BaseVmActivity;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.AppConfig;
import com.hisense.connect_life.core.global.EventBusConstKt;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.global.Paths;
import com.hisense.connect_life.core.global.SPManagerKt;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.core.utils.LogUtilsShen;
import com.hisense.connect_life.core.widget.IconFontView;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.hismart.networks.request.device.DeviceCache;
import com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo;
import com.hisense.connect_life.hismart.networks.request.message.MsgObserverViewModel;
import com.hisense.connect_life.hismart.networks.request.message.listener.MessageReceivedListener;
import com.hisense.connect_life.hismart.networks.request.message.model.DeviceStatusMessage;
import com.hisense.connect_life.hismart.networks.request.wine.model.FilterCondition;
import com.hisense.juconnect.app_device.R$id;
import com.hisense.juconnect.app_device.R$layout;
import com.hisense.juconnect.app_device.R$string;
import com.hisense.juconnect.app_device.event.GetUserMessage;
import com.hisense.juconnect.app_device.event.NewMessage;
import com.hisense.juconnect.app_device.event.ToastMsg;
import com.hisense.juconnect.app_device.event.UnbindMsg;
import com.hisense.juconnect.app_device.fragment.OneApplianceFragment;
import com.hisense.juconnect.app_device.fragment.ShareDialog;
import com.hisense.juconnect.app_device.viewmodel.DeviceViewModel;
import com.juconnect.connectlife.model.ConlManual;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p041a.p042a.p043a.p045b.C1337a;
import p040c.p072c.p073a.p074a.C1502i;
import p040c.p072c.p073a.p074a.C1519p;
import p040c.p429r.p460b.p461a.p462a.C7488d;
import p040c.p429r.p460b.p461a.p462a.C7495g0;
import p040c.p429r.p460b.p461a.p462a.C7501j0;
import p040c.p429r.p460b.p461a.p462a.C7517r0;
import p040c.p429r.p460b.p461a.p462a.C7522u;
import p040c.p429r.p460b.p461a.p462a.C7524v;

@Route(path = "/device/DeviceInfoActivity")
@Metadata(mo47990d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \\2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\\B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u00103\u001a\u0002042\u0006\u00105\u001a\u00020$H\u0002J\b\u00106\u001a\u000207H\u0014J\u0010\u00108\u001a\u00020$2\u0006\u00109\u001a\u00020\u0005H\u0002J\u0010\u0010:\u001a\u0002042\u0006\u0010;\u001a\u00020$H\u0002J\u0006\u0010<\u001a\u00020\u0005J\u0010\u0010=\u001a\u0002042\u0006\u0010>\u001a\u00020\u0005H\u0002J\b\u0010?\u001a\u000204H\u0014J\u000e\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00020AH\u0016J\b\u0010B\u001a\u000204H\u0015J\u0010\u0010C\u001a\u0002042\u0006\u0010D\u001a\u00020EH\u0007J\"\u0010F\u001a\u0002042\u0006\u0010G\u001a\u0002072\u0006\u0010H\u001a\u0002072\b\u0010I\u001a\u0004\u0018\u00010JH\u0014J\u0012\u0010K\u001a\u0002042\b\u0010L\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010M\u001a\u000204H\u0014J\u0010\u0010N\u001a\u0002042\u0006\u0010O\u001a\u00020PH\u0007J\b\u0010Q\u001a\u000204H\u0014J\u0006\u0010R\u001a\u000204J\b\u0010S\u001a\u000204H\u0002J\b\u0010T\u001a\u000204H\u0014J\u000e\u0010U\u001a\u0002042\u0006\u0010V\u001a\u00020\u0005J\b\u0010W\u001a\u000204H\u0016J\u0010\u0010X\u001a\u0002042\u0006\u0010X\u001a\u00020YH\u0007J\u0010\u0010Z\u001a\u0002042\u0006\u0010Z\u001a\u00020[H\u0007R\u001a\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u00020\u0005X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0007\"\u0004\b\u001d\u0010\tR\u000e\u0010\u001e\u001a\u00020\u001fX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u00020\u0005X.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0007\"\u0004\b\"\u0010\tR\u000e\u0010#\u001a\u00020$X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020$X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010(\u001a\u00020)8BX\u0002¢\u0006\f\n\u0004\b,\u0010\u0018\u001a\u0004\b*\u0010+R\u000e\u0010-\u001a\u00020.X.¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020$X\u000e¢\u0006\u0002\n\u0000R\u001a\u00100\u001a\u00020\u0005X.¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0007\"\u0004\b2\u0010\t¨\u0006]"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/activity/DeviceInfoActivity;", "Lcom/hisense/connect_life/core/base/BaseVmActivity;", "Lcom/hisense/juconnect/app_device/viewmodel/DeviceViewModel;", "()V", "accessToken", "", "getAccessToken", "()Ljava/lang/String;", "setAccessToken", "(Ljava/lang/String;)V", "auid", "getAuid", "setAuid", "bundle", "Landroid/os/Bundle;", "getBundle", "()Landroid/os/Bundle;", "setBundle", "(Landroid/os/Bundle;)V", "connectLifeViewModel", "Lcom/hisense/juconnect/app_device/activity/ConnectLifeViewModel;", "getConnectLifeViewModel", "()Lcom/hisense/juconnect/app_device/activity/ConnectLifeViewModel;", "connectLifeViewModel$delegate", "Lkotlin/Lazy;", "currentDeviceInfo", "Lcom/hisense/connect_life/hismart/networks/request/device/model/DeviceInfo;", "deviceName", "getDeviceName", "setDeviceName", "dialog", "Lcom/hisense/juconnect/app_device/fragment/ShareDialog;", "dnamicName", "getDnamicName", "setDnamicName", "hasThisDevice", "", "messageReceivedListener", "Lcom/hisense/connect_life/hismart/networks/request/message/listener/MessageReceivedListener;", "messageState", "msgObserverViewModel", "Lcom/hisense/connect_life/hismart/networks/request/message/MsgObserverViewModel;", "getMsgObserverViewModel", "()Lcom/hisense/connect_life/hismart/networks/request/message/MsgObserverViewModel;", "msgObserverViewModel$delegate", "oneApplianceFragment", "Lcom/hisense/juconnect/app_device/fragment/OneApplianceFragment;", "showLoadingFlag", "wifiId", "getWifiId", "setWifiId", "NewMessage", "", "flag", "bindLayout", "", "checkEmailFormat", "userBox", "getApplianceList", "showDialog", "getDeviceAuid", "gotoSystemBrowser", "targetUrl", "initData", "initViewModelClz", "Ljava/lang/Class;", "initWidgets", "newMessage", "zoneWineBindEvent", "Lcom/hisense/juconnect/app_device/event/NewMessage;", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "onDestroy", "onEvent", "message", "", "onResume", "queryWineCoolerManual", "setDeviceNickName", "setListeners", "showToast", "str", "subscribeObservable", "toastMsg", "Lcom/hisense/juconnect/app_device/event/ToastMsg;", "unBindMsg", "Lcom/hisense/juconnect/app_device/event/UnbindMsg;", "Companion", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: DeviceInfoActivity.kt */
public final class DeviceInfoActivity extends BaseVmActivity<DeviceViewModel> {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String TAG = DeviceInfoActivity.class.getSimpleName();
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public String accessToken;
    public String auid;
    @Autowired(name = "deviceInfoBundle")
    public Bundle bundle;
    @NotNull
    public final Lazy connectLifeViewModel$delegate = LazyKt__LazyJVMKt.lazy(new DeviceInfoActivity$connectLifeViewModel$2(this));
    @Nullable
    public DeviceInfo currentDeviceInfo;
    public String deviceName;
    @NotNull
    public final ShareDialog dialog = new ShareDialog();
    public String dnamicName;
    public boolean hasThisDevice;
    @Nullable
    public MessageReceivedListener messageReceivedListener;
    public boolean messageState = true;
    @NotNull
    public final Lazy msgObserverViewModel$delegate = LazyKt__LazyJVMKt.lazy(new DeviceInfoActivity$msgObserverViewModel$2(this));
    public OneApplianceFragment oneApplianceFragment;
    public boolean showLoadingFlag = true;
    public String wifiId;

    @Metadata(mo47990d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/activity/DeviceInfoActivity$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: DeviceInfoActivity.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getTAG() {
            return DeviceInfoActivity.TAG;
        }
    }

    /* access modifiers changed from: private */
    public final void NewMessage(boolean z) {
        Gson gson = new Gson();
        if (this.auid != null) {
            ArrayList arrayList = (ArrayList) gson.fromJson(SPManagerKt.getDeviceId(), new DeviceInfoActivity$NewMessage$type$1().getType());
            if (arrayList != null) {
                if (arrayList.contains(getAuid())) {
                    this.messageState = false;
                    if (z) {
                        arrayList.removeIf(new C7522u(this));
                    }
                }
                String json = gson.toJson((Object) arrayList);
                Intrinsics.checkNotNullExpressionValue(json, "json");
                SPManagerKt.setDeviceId(json);
            }
        }
    }

    /* renamed from: NewMessage$lambda-13  reason: not valid java name */
    public static final boolean m27103NewMessage$lambda13(DeviceInfoActivity deviceInfoActivity, String str) {
        Intrinsics.checkNotNullParameter(deviceInfoActivity, "this$0");
        Intrinsics.checkNotNullParameter(str, LanguageConstKt.f15954it);
        return Intrinsics.areEqual((Object) str, (Object) deviceInfoActivity.getAuid());
    }

    public static final /* synthetic */ DeviceViewModel access$getMViewModel(DeviceInfoActivity deviceInfoActivity) {
        return (DeviceViewModel) deviceInfoActivity.getMViewModel();
    }

    /* access modifiers changed from: private */
    public final boolean checkEmailFormat(String str) {
        return (str.length() > 0) && C1519p.m1017a(str);
    }

    private final void getApplianceList(boolean z) {
        if (z) {
            showLoading();
        }
        ((DeviceViewModel) getMViewModel()).getApplianceListWithProperty(z);
    }

    private final ConnectLifeViewModel getConnectLifeViewModel() {
        return (ConnectLifeViewModel) this.connectLifeViewModel$delegate.getValue();
    }

    private final MsgObserverViewModel getMsgObserverViewModel() {
        return (MsgObserverViewModel) this.msgObserverViewModel$delegate.getValue();
    }

    private final void gotoSystemBrowser(String str) {
        Intent intent = new Intent();
        Uri parse = Uri.parse(str);
        Intrinsics.checkNotNullExpressionValue(parse, "parse(targetUrl)");
        intent.setAction("android.intent.action.VIEW");
        intent.setData(parse);
        startActivity(intent);
    }

    private final void setDeviceNickName() {
        String auid2 = getAuid();
        if (auid2 != null) {
            DeviceInfo device = DeviceCache.Companion.getInstance().getDevice(auid2);
            String str = null;
            if (TextUtils.isEmpty(device == null ? null : device.getDeviceNickName())) {
                ((TextView) _$_findCachedViewById(R$id.tv_appliance_name)).setText(auid2);
                return;
            }
            TextView textView = (TextView) _$_findCachedViewById(R$id.tv_appliance_name);
            DeviceInfo device2 = DeviceCache.Companion.getInstance().getDevice(auid2);
            if (device2 != null) {
                str = device2.getDeviceNickName();
            }
            textView.setText(str);
        }
    }

    /* renamed from: setListeners$lambda-2  reason: not valid java name */
    public static final void m27104setListeners$lambda2(DeviceInfoActivity deviceInfoActivity, View view) {
        Intrinsics.checkNotNullParameter(deviceInfoActivity, "this$0");
        Postcard a = C1337a.m211c().mo15011a(Paths.Device.ShareInfoActivity);
        a.withString("deviceId", deviceInfoActivity.getAuid());
        a.withString(EventBusConstKt.WIFIID, deviceInfoActivity.getWifiId());
        a.navigation();
    }

    /* renamed from: subscribeObservable$lambda-10  reason: not valid java name */
    public static final void m27105subscribeObservable$lambda10(DeviceInfoActivity deviceInfoActivity, DeviceStatusMessage deviceStatusMessage) {
        Intrinsics.checkNotNullParameter(deviceInfoActivity, "this$0");
        if (deviceStatusMessage != null) {
            OneApplianceFragment oneApplianceFragment2 = deviceInfoActivity.oneApplianceFragment;
            if (oneApplianceFragment2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("oneApplianceFragment");
                oneApplianceFragment2 = null;
            }
            oneApplianceFragment2.updateProp(deviceStatusMessage);
        }
    }

    /* renamed from: subscribeObservable$lambda-12  reason: not valid java name */
    public static final void m27106subscribeObservable$lambda12(DeviceInfoActivity deviceInfoActivity, ConlManual conlManual) {
        Intrinsics.checkNotNullParameter(deviceInfoActivity, "this$0");
        LogUtilsShen.Companion.mo39138e(Intrinsics.stringPlus("manualLiveData: ", conlManual));
        deviceInfoActivity.hideLoading();
        Postcard a = C1337a.m211c().mo15011a(Paths.Account.SingleWebViewActivity);
        a.withString(KeyConst.KEY_TITLE_TEXT, deviceInfoActivity.getString(R$string.manuals));
        a.withString(KeyConst.KEY_TARGET_URL, "https://partners.gorenje.com/fts/GetDigitDoc.ashx?sifra=735911&jezik=en&tipVsebine=1&docName=829827en.html");
        a.navigation();
    }

    /* renamed from: subscribeObservable$lambda-5  reason: not valid java name */
    public static final void m27107subscribeObservable$lambda5(DeviceInfoActivity deviceInfoActivity, Pair pair) {
        Intrinsics.checkNotNullParameter(deviceInfoActivity, "this$0");
        if (((Boolean) pair.getFirst()).booleanValue()) {
            deviceInfoActivity.dialog.dismiss();
        }
    }

    /* renamed from: subscribeObservable$lambda-8  reason: not valid java name */
    public static final void m27108subscribeObservable$lambda8(DeviceInfoActivity deviceInfoActivity, Pair pair) {
        Intrinsics.checkNotNullParameter(deviceInfoActivity, "this$0");
        deviceInfoActivity.hideLoading();
        deviceInfoActivity.setDeviceNickName();
        if (!((Collection) pair.getSecond()).isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (DeviceInfo deviceId : DeviceCache.Companion.getInstance().getDeviceList()) {
                arrayList.add(deviceId.getDeviceId());
            }
            OneApplianceFragment oneApplianceFragment2 = null;
            ((DeviceViewModel) deviceInfoActivity.getMViewModel()).getRemoteQueryByDevList(arrayList, (FilterCondition) null);
            SPManagerKt.setHasDevice(false);
            for (DeviceInfo deviceInfo : (Iterable) pair.getSecond()) {
                ((ImageView) deviceInfoActivity._$_findCachedViewById(R$id.icon_share)).setVisibility(deviceInfo.isAdmin() == 1 ? 0 : 8);
                deviceInfoActivity.getAuid() + " ==" + deviceInfo.getDeviceId() + ' ' + Intrinsics.areEqual((Object) deviceInfoActivity.getAuid(), (Object) deviceInfo.getDeviceId()) + ' ';
                if (Intrinsics.areEqual((Object) deviceInfo.getDeviceId(), (Object) deviceInfoActivity.getAuid())) {
                    deviceInfoActivity.hasThisDevice = true;
                    OneApplianceFragment oneApplianceFragment3 = deviceInfoActivity.oneApplianceFragment;
                    if (oneApplianceFragment3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("oneApplianceFragment");
                    } else {
                        oneApplianceFragment2 = oneApplianceFragment3;
                    }
                    oneApplianceFragment2.refreshWineCoolerInfo(deviceInfo);
                    return;
                }
            }
            boolean z = deviceInfoActivity.hasThisDevice;
            ((DeviceViewModel) deviceInfoActivity.getMViewModel()).getRemoteQueryByDevList(arrayList, (FilterCondition) null);
            return;
        }
        SPManagerKt.setHasDevice(true);
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
        return R$layout.activity_device_info;
    }

    @NotNull
    public final String getAccessToken() {
        String str = this.accessToken;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("accessToken");
        return null;
    }

    @NotNull
    public final String getAuid() {
        String str = this.auid;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(KeyConst.KEY_AUIT);
        return null;
    }

    @NotNull
    public final Bundle getBundle() {
        Bundle bundle2 = this.bundle;
        if (bundle2 != null) {
            return bundle2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("bundle");
        return null;
    }

    @NotNull
    public final String getDeviceAuid() {
        return this.auid != null ? getAuid() : "";
    }

    @NotNull
    public final String getDeviceName() {
        String str = this.deviceName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("deviceName");
        return null;
    }

    @NotNull
    public final String getDnamicName() {
        String str = this.dnamicName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dnamicName");
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

    public void initData() {
        super.initData();
        getMsgObserverViewModel().subscribeMessage();
    }

    @NotNull
    public Class<DeviceViewModel> initViewModelClz() {
        return DeviceViewModel.class;
    }

    @SuppressLint({"ResourceType"})
    public void initWidgets() {
        this.oneApplianceFragment = new OneApplianceFragment();
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        int i = R$id.activity_device_info;
        OneApplianceFragment oneApplianceFragment2 = this.oneApplianceFragment;
        OneApplianceFragment oneApplianceFragment3 = null;
        if (oneApplianceFragment2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("oneApplianceFragment");
            oneApplianceFragment2 = null;
        }
        beginTransaction.add(i, (Fragment) oneApplianceFragment2).commit();
        String.valueOf(getBundle().get(EventBusConstKt.DEVICE));
        Object obj = getBundle().get(EventBusConstKt.DEVICE);
        if (obj != null) {
            DeviceInfo deviceInfo = (DeviceInfo) C1502i.m924d((String) obj, DeviceInfo.class);
            this.currentDeviceInfo = deviceInfo;
            if (deviceInfo != null) {
                setAuid(deviceInfo.getDeviceId());
                setWifiId(deviceInfo.getWifiId());
                setDeviceName(deviceInfo.getDeviceNickName());
            }
            setDnamicName(String.valueOf(getBundle().get(EventBusConstKt.COOLER_DNAME)));
            setAccessToken(String.valueOf(getBundle().get(EventBusConstKt.COOLER_ACCESS_TOKEN)));
            AppConfig.Companion.setAnonymousLoginToken(getAccessToken());
            String serviceType = AppConfig.Companion.getServiceType();
            int hashCode = serviceType.hashCode();
            if (hashCode != -1422446064) {
                if (hashCode != 99349) {
                    if (hashCode == 1090594823 && serviceType.equals("release")) {
                        HiSmart.Companion.getInstance().setWineHost(getDnamicName());
                    }
                } else if (serviceType.equals("dev")) {
                    HiSmart.Companion.getInstance().setWineHost(getDnamicName());
                }
            } else if (serviceType.equals("testing")) {
                HiSmart.Companion.getInstance().setWineHost(getDnamicName());
            }
            setAccessToken(String.valueOf(getBundle().get(EventBusConstKt.COOLER_ACCESS_TOKEN)));
            OneApplianceFragment oneApplianceFragment4 = this.oneApplianceFragment;
            if (oneApplianceFragment4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("oneApplianceFragment");
            } else {
                oneApplianceFragment3 = oneApplianceFragment4;
            }
            oneApplianceFragment3.setHomePage(false);
            setDeviceNickName();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void newMessage(@NotNull NewMessage newMessage) {
        Intrinsics.checkNotNullParameter(newMessage, "zoneWineBindEvent");
        NewMessage(false);
    }

    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        OneApplianceFragment oneApplianceFragment2 = this.oneApplianceFragment;
        if (oneApplianceFragment2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("oneApplianceFragment");
            oneApplianceFragment2 = null;
        }
        oneApplianceFragment2.onActivityResult(i, i2, intent);
    }

    public void onCreate(@Nullable Bundle bundle2) {
        super.onCreate(bundle2);
        EventBus.getDefault().register(this);
    }

    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "message");
        if (Intrinsics.areEqual(obj, (Object) 105)) {
            getApplianceList(false);
        } else if (Intrinsics.areEqual(obj, (Object) Integer.valueOf(EventBusConstKt.HAVE_NEW_MESSAHE))) {
            ((FrameLayout) _$_findCachedViewById(R$id.info_hav_notification)).setVisibility(0);
        }
    }

    public void onResume() {
        super.onResume();
        this.hasThisDevice = false;
        boolean z = this.showLoadingFlag;
        if (z) {
            getApplianceList(z);
        }
        this.showLoadingFlag = false;
        NewMessage(false);
        EventBus.getDefault().post(new GetUserMessage(getWifiId(), getAuid()));
    }

    public final void queryWineCoolerManual() {
        Postcard a = C1337a.m211c().mo15011a(Paths.Device.ManualListActivity);
        a.withString("AUID", getAuid());
        a.withString("DEVICE_NAME", getDeviceName());
        a.navigation();
    }

    public final void setAccessToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.accessToken = str;
    }

    public final void setAuid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.auid = str;
    }

    public final void setBundle(@NotNull Bundle bundle2) {
        Intrinsics.checkNotNullParameter(bundle2, "<set-?>");
        this.bundle = bundle2;
    }

    public final void setDeviceName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceName = str;
    }

    public final void setDnamicName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dnamicName = str;
    }

    public void setListeners() {
        IconFontView iconFontView = (IconFontView) _$_findCachedViewById(R$id.info_back);
        Intrinsics.checkNotNullExpressionValue(iconFontView, "info_back");
        JuConnectExtKt.singleClickListener(iconFontView, new DeviceInfoActivity$setListeners$1(this));
        FrameLayout frameLayout = (FrameLayout) _$_findCachedViewById(R$id.info_notification);
        Intrinsics.checkNotNullExpressionValue(frameLayout, "info_notification");
        JuConnectExtKt.singleClickListener(frameLayout, new DeviceInfoActivity$setListeners$2(this));
        ((ImageView) _$_findCachedViewById(R$id.icon_share)).setOnClickListener(new C7524v(this));
        this.dialog.setOnSendCallback(new DeviceInfoActivity$setListeners$4(this));
    }

    public final void setWifiId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.wifiId = str;
    }

    public final void showToast(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "str");
        Toast makeText = Toast.makeText(this, str, 0);
        View inflate = LayoutInflater.from(this).inflate(R$layout.iwh_toast, (ViewGroup) null);
        makeText.setGravity(87, 0, 0);
        makeText.setView(inflate);
        makeText.setMargin(0.0f, 0.0f);
        ((TextView) inflate.findViewById(R$id.iwh_toast_text)).setText(str);
        makeText.show();
    }

    public void subscribeObservable() {
        super.subscribeObservable();
        ((DeviceViewModel) getMViewModel()).getShareDeviceLiveData().observe(this, new C7488d(this));
        ((DeviceViewModel) getMViewModel()).getApplListLiveData().observe(this, new C7517r0(this));
        getMsgObserverViewModel().getStatusMsgLiveData().observe(this, new C7501j0(this));
        getConnectLifeViewModel().getManualLiveData().observe(this, new C7495g0(this));
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void toastMsg(@NotNull ToastMsg toastMsg) {
        Intrinsics.checkNotNullParameter(toastMsg, "toastMsg");
        showToast(toastMsg.getToast());
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void unBindMsg(@NotNull UnbindMsg unbindMsg) {
        Intrinsics.checkNotNullParameter(unbindMsg, "unBindMsg");
        if (Intrinsics.areEqual((Object) unbindMsg.getDeviceId(), (Object) getAuid())) {
            finish();
        }
    }
}
