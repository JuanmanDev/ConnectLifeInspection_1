package com.hisense.juconnect.app_device.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.hisense.connect_life.app_account.util.AccountUtils;
import com.hisense.connect_life.core.base.BaseViewModel;
import com.hisense.connect_life.core.global.EventBusConstKt;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.utils.SPUtils;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.hismart.networks.request.account.model.LoginInfo;
import com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo;
import com.hisense.connect_life.hismart.networks.request.device.model.DevicePropertyBean;
import com.hisense.connect_life.hismart.networks.request.device.model.DeviceStatusBean;
import com.hisense.connect_life.hismart.networks.request.device.model.InstructionBookInfo;
import com.hisense.connect_life.hismart.networks.request.device.model.SimpleDeviceBean;
import com.hisense.connect_life.hismart.networks.request.device.model.UpgradeInfo;
import com.hisense.connect_life.hismart.networks.request.device.model.UserShareResult;
import com.hisense.connect_life.hismart.networks.request.wine.model.FilterCondition;
import com.juconnect.connect_life.global.GeneralMethodConstant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(mo47990d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J6\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\u00122\u0006\u0010A\u001a\u00020\u00122\u0006\u0010B\u001a\u00020\u00122\u0006\u0010C\u001a\u00020\u00122\u0006\u0010D\u001a\u00020\u00122\u0006\u0010E\u001a\u00020\u0012J\u0016\u0010F\u001a\u00020?2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002J\u0014\u0010H\u001a\u00020?2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00050\rJ\u0006\u0010J\u001a\u00020?J\u000e\u0010K\u001a\u00020?2\u0006\u0010L\u001a\u00020\u000eJ\u000e\u0010M\u001a\u00020?2\u0006\u0010N\u001a\u00020\fJ\u001e\u0010O\u001a\u00020?2\f\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00120\r2\b\u0010Q\u001a\u0004\u0018\u00010RJ\u0006\u0010S\u001a\u00020?J\u0014\u0010T\u001a\u00020?2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00120\rJ\u000e\u0010V\u001a\u00020?2\u0006\u0010@\u001a\u00020\u0012J\u0006\u0010W\u001a\u00020?J\u0016\u0010X\u001a\u00020?2\u0006\u0010Y\u001a\u00020\u00122\u0006\u0010Z\u001a\u00020\u0012J\u0014\u0010[\u001a\u00020?2\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020]0\rJ*\u0010^\u001a\u00020?2\u0006\u0010_\u001a\u00020\u00122\u0006\u0010`\u001a\u00020\u00122\u0012\u0010a\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120bJ\u001e\u0010c\u001a\u00020?2\u0006\u0010A\u001a\u00020\u00122\u0006\u0010@\u001a\u00020\u00122\u0006\u0010d\u001a\u00020\u0012J\u000e\u0010e\u001a\u00020f2\u0006\u0010g\u001a\u00020hJ\u001e\u0010i\u001a\u00020?2\u0006\u0010@\u001a\u00020\u00122\u0006\u0010A\u001a\u00020\u00122\u0006\u0010j\u001a\u00020\u0012J\f\u0010k\u001a\b\u0012\u0004\u0012\u00020\u000e0\rR!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048FX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R3\u0010\n\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u000b0\u00048FX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u000f\u0010\u0007R-\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00120\u000b0\u00048FX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\t\u001a\u0004\b\u0013\u0010\u0007R-\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00120\u000b0\u00048FX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\t\u001a\u0004\b\u0016\u0010\u0007R-\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00120\u000b0\u00048FX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\t\u001a\u0004\b\u0019\u0010\u0007R!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u00048FX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\t\u001a\u0004\b\u001c\u0010\u0007R'\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\r0\u00048FX\u0002¢\u0006\f\n\u0004\b!\u0010\t\u001a\u0004\b \u0010\u0007R'\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\r0\u00048FX\u0002¢\u0006\f\n\u0004\b%\u0010\t\u001a\u0004\b$\u0010\u0007R'\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\r0\u00048FX\u0002¢\u0006\f\n\u0004\b(\u0010\t\u001a\u0004\b'\u0010\u0007R3\u0010)\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\r0\u000b0\u00048FX\u0002¢\u0006\f\n\u0004\b,\u0010\t\u001a\u0004\b+\u0010\u0007R3\u0010-\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\r0\u000b0\u00048FX\u0002¢\u0006\f\n\u0004\b0\u0010\t\u001a\u0004\b/\u0010\u0007R-\u00101\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002020\u000b0\u00048FX\u0002¢\u0006\f\n\u0004\b4\u0010\t\u001a\u0004\b3\u0010\u0007R-\u00105\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00120\u000b0\u00048FX\u0002¢\u0006\f\n\u0004\b7\u0010\t\u001a\u0004\b6\u0010\u0007R!\u00108\u001a\b\u0012\u0004\u0012\u00020\f0\u00048FX\u0002¢\u0006\f\n\u0004\b:\u0010\t\u001a\u0004\b9\u0010\u0007R!\u0010;\u001a\b\u0012\u0004\u0012\u00020\f0\u00048FX\u0002¢\u0006\f\n\u0004\b=\u0010\t\u001a\u0004\b<\u0010\u0007¨\u0006l"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/viewmodel/DeviceViewModel;", "Lcom/hisense/connect_life/core/base/BaseViewModel;", "()V", "_refreshLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "get_refreshLiveData", "()Landroidx/lifecycle/MutableLiveData;", "_refreshLiveData$delegate", "Lkotlin/Lazy;", "applListLiveData", "Lkotlin/Pair;", "", "", "Lcom/hisense/connect_life/hismart/networks/request/device/model/DeviceInfo;", "getApplListLiveData", "applListLiveData$delegate", "bindDeviceIdLiveData", "", "getBindDeviceIdLiveData", "bindDeviceIdLiveData$delegate", "bindDeviceLiveData", "getBindDeviceLiveData", "bindDeviceLiveData$delegate", "cancelShareLiveData", "getCancelShareLiveData", "cancelShareLiveData$delegate", "deviceCommandLiveData", "getDeviceCommandLiveData", "deviceCommandLiveData$delegate", "deviceOnlineLiveData", "Lcom/hisense/connect_life/hismart/networks/request/device/model/DeviceStatusBean;", "getDeviceOnlineLiveData", "deviceOnlineLiveData$delegate", "deviceProfileLiveData", "Lcom/hisense/connect_life/hismart/networks/request/device/model/DevicePropertyBean;", "getDeviceProfileLiveData", "deviceProfileLiveData$delegate", "devicePropertyLiveData", "getDevicePropertyLiveData", "devicePropertyLiveData$delegate", "instructionBookLiveData", "Lcom/hisense/connect_life/hismart/networks/request/device/model/InstructionBookInfo;", "getInstructionBookLiveData", "instructionBookLiveData$delegate", "otaCheckWifiDeviceVersionLiveData", "Lcom/hisense/connect_life/hismart/networks/request/device/model/UpgradeInfo;", "getOtaCheckWifiDeviceVersionLiveData", "otaCheckWifiDeviceVersionLiveData$delegate", "shareDeviceListLiveData", "Lcom/hisense/connect_life/hismart/networks/request/device/model/UserShareResult;", "getShareDeviceListLiveData", "shareDeviceListLiveData$delegate", "shareDeviceLiveData", "getShareDeviceLiveData", "shareDeviceLiveData$delegate", "singleZoneQrCodeAuidTypeLiveData", "getSingleZoneQrCodeAuidTypeLiveData", "singleZoneQrCodeAuidTypeLiveData$delegate", "updateDeviceLiveData", "getUpdateDeviceLiveData", "updateDeviceLiveData$delegate", "bindDevice", "", "wifiId", "deviceId", "nickName", "applianceType", "deviceFeatureCode", "gpsInfo", "cacheUserDeviceList", "deviceInfos", "cancelShare", "shareIdList", "correlationManuals", "filterDeviceInfo", "it", "getApplianceListWithProperty", "showDialog", "getRemoteQueryByDevList", "deviceIdList", "filterCondition", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/FilterCondition;", "getShareList", "otaCheckWifiDeviceVersion", "wifiIds", "otaConfirmUpgrade", "postRefreshData", "queryApplianceProfile", "auid", "heidi", "queryDeviceOnline", "devices", "Lcom/hisense/connect_life/hismart/networks/request/device/model/SimpleDeviceBean;", "sendCommand", "deviceid", "wifiid", "properties", "", "shareDevice", "userBox", "toSmallJsonObject", "Lcom/google/gson/JsonObject;", "jsonObject", "Lorg/json/JSONObject;", "updateDeviceCustomInfo", "deviceNickName", "useCacheDeviceList", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: DeviceViewModel.kt */
public final class DeviceViewModel extends BaseViewModel {
    @NotNull
    public final Lazy _refreshLiveData$delegate = LazyKt__LazyJVMKt.lazy(DeviceViewModel$_refreshLiveData$2.INSTANCE);
    @NotNull
    public final Lazy applListLiveData$delegate = LazyKt__LazyJVMKt.lazy(DeviceViewModel$applListLiveData$2.INSTANCE);
    @NotNull
    public final Lazy bindDeviceIdLiveData$delegate = LazyKt__LazyJVMKt.lazy(DeviceViewModel$bindDeviceIdLiveData$2.INSTANCE);
    @NotNull
    public final Lazy bindDeviceLiveData$delegate = LazyKt__LazyJVMKt.lazy(DeviceViewModel$bindDeviceLiveData$2.INSTANCE);
    @NotNull
    public final Lazy cancelShareLiveData$delegate = LazyKt__LazyJVMKt.lazy(DeviceViewModel$cancelShareLiveData$2.INSTANCE);
    @NotNull
    public final Lazy deviceCommandLiveData$delegate = LazyKt__LazyJVMKt.lazy(DeviceViewModel$deviceCommandLiveData$2.INSTANCE);
    @NotNull
    public final Lazy deviceOnlineLiveData$delegate = LazyKt__LazyJVMKt.lazy(DeviceViewModel$deviceOnlineLiveData$2.INSTANCE);
    @NotNull
    public final Lazy deviceProfileLiveData$delegate = LazyKt__LazyJVMKt.lazy(DeviceViewModel$deviceProfileLiveData$2.INSTANCE);
    @NotNull
    public final Lazy devicePropertyLiveData$delegate = LazyKt__LazyJVMKt.lazy(DeviceViewModel$devicePropertyLiveData$2.INSTANCE);
    @NotNull
    public final Lazy instructionBookLiveData$delegate = LazyKt__LazyJVMKt.lazy(DeviceViewModel$instructionBookLiveData$2.INSTANCE);
    @NotNull
    public final Lazy otaCheckWifiDeviceVersionLiveData$delegate = LazyKt__LazyJVMKt.lazy(DeviceViewModel$otaCheckWifiDeviceVersionLiveData$2.INSTANCE);
    @NotNull
    public final Lazy shareDeviceListLiveData$delegate = LazyKt__LazyJVMKt.lazy(DeviceViewModel$shareDeviceListLiveData$2.INSTANCE);
    @NotNull
    public final Lazy shareDeviceLiveData$delegate = LazyKt__LazyJVMKt.lazy(DeviceViewModel$shareDeviceLiveData$2.INSTANCE);
    @NotNull
    public final Lazy singleZoneQrCodeAuidTypeLiveData$delegate = LazyKt__LazyJVMKt.lazy(DeviceViewModel$singleZoneQrCodeAuidTypeLiveData$2.INSTANCE);
    @NotNull
    public final Lazy updateDeviceLiveData$delegate = LazyKt__LazyJVMKt.lazy(DeviceViewModel$updateDeviceLiveData$2.INSTANCE);

    /* access modifiers changed from: private */
    public final void cacheUserDeviceList(List<DeviceInfo> list) {
        String str;
        LoginInfo userInfo = AccountUtils.Companion.getUserInfo();
        if (userInfo == null) {
            str = null;
        } else {
            str = userInfo.getCustomerId();
        }
        String stringPlus = Intrinsics.stringPlus(str, "deviceList");
        if (list == null || list.isEmpty()) {
            SPUtils.INSTANCE.remove(stringPlus);
        } else if (userInfo != null) {
            String json = new Gson().toJson((Object) list);
            SPUtils sPUtils = SPUtils.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(json, "jsonValue");
            sPUtils.put(stringPlus, json);
        }
    }

    public final void bindDevice(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, EventBusConstKt.WIFIID);
        Intrinsics.checkNotNullParameter(str2, "deviceId");
        Intrinsics.checkNotNullParameter(str3, "nickName");
        Intrinsics.checkNotNullParameter(str4, "applianceType");
        Intrinsics.checkNotNullParameter(str5, "deviceFeatureCode");
        Intrinsics.checkNotNullParameter(str6, "gpsInfo");
        updateLoadingStatus(true);
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new DeviceViewModel$bindDevice$1(str, str2, str3, str4, this, (Continuation<? super DeviceViewModel$bindDevice$1>) null), 2, (Object) null);
    }

    public final void cancelShare(@NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "shareIdList");
        updateLoadingStatus(true);
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new DeviceViewModel$cancelShare$1(list, this, (Continuation<? super DeviceViewModel$cancelShare$1>) null), 2, (Object) null);
    }

    public final void correlationManuals() {
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new DeviceViewModel$correlationManuals$1(this, (Continuation<? super DeviceViewModel$correlationManuals$1>) null), 2, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0031, code lost:
        r2 = r2.getAsString();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void filterDeviceInfo(@org.jetbrains.annotations.NotNull com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo r23) {
        /*
            r22 = this;
            r0 = r23
            java.lang.String r1 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            com.hisense.connect_life.hismart.networks.request.device.model.OnlineStatus r1 = com.hisense.connect_life.hismart.networks.request.device.model.OnlineStatus.CONNECTED
            com.hisense.connect_life.hismart.networks.request.device.model.OnlineStatus r2 = r23.getOnlineStatus()
            r3 = 1
            java.lang.String r4 = "Zone3RealHumidity"
            java.lang.String r5 = "Zone2RealHumidity"
            java.lang.String r6 = "Zone1RealHumidity"
            java.lang.String r7 = "Zone3SetTemperature"
            r8 = 0
            java.lang.String r9 = "Zone2SetTemperature"
            java.lang.String r10 = "Zone1SetTemperature"
            java.lang.String r11 = "TemperatureUnit"
            if (r1 != r2) goto L_0x00c6
            com.google.gson.JsonObject r1 = r23.getProperties()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            com.google.gson.JsonElement r2 = r1.get(r11)
            java.lang.String r11 = "0"
            if (r2 != 0) goto L_0x0031
        L_0x002e:
            r21 = r11
            goto L_0x003a
        L_0x0031:
            java.lang.String r2 = r2.getAsString()
            if (r2 != 0) goto L_0x0038
            goto L_0x002e
        L_0x0038:
            r21 = r2
        L_0x003a:
            com.google.gson.JsonElement r2 = r1.get(r10)
            java.lang.String r10 = ""
            if (r2 != 0) goto L_0x0044
        L_0x0042:
            r15 = r10
            goto L_0x004c
        L_0x0044:
            java.lang.String r2 = r2.getAsString()
            if (r2 != 0) goto L_0x004b
            goto L_0x0042
        L_0x004b:
            r15 = r2
        L_0x004c:
            com.google.gson.JsonElement r2 = r1.get(r9)
            if (r2 != 0) goto L_0x0055
        L_0x0052:
            r16 = r10
            goto L_0x005e
        L_0x0055:
            java.lang.String r2 = r2.getAsString()
            if (r2 != 0) goto L_0x005c
            goto L_0x0052
        L_0x005c:
            r16 = r2
        L_0x005e:
            com.google.gson.JsonElement r2 = r1.get(r7)
            if (r2 != 0) goto L_0x0067
        L_0x0064:
            r17 = r10
            goto L_0x0070
        L_0x0067:
            java.lang.String r2 = r2.getAsString()
            if (r2 != 0) goto L_0x006e
            goto L_0x0064
        L_0x006e:
            r17 = r2
        L_0x0070:
            com.google.gson.JsonElement r2 = r1.get(r6)
            if (r2 != 0) goto L_0x0079
        L_0x0076:
            r18 = r10
            goto L_0x0082
        L_0x0079:
            java.lang.String r2 = r2.getAsString()
            if (r2 != 0) goto L_0x0080
            goto L_0x0076
        L_0x0080:
            r18 = r2
        L_0x0082:
            com.google.gson.JsonElement r2 = r1.get(r5)
            if (r2 != 0) goto L_0x008b
        L_0x0088:
            r19 = r10
            goto L_0x0094
        L_0x008b:
            java.lang.String r2 = r2.getAsString()
            if (r2 != 0) goto L_0x0092
            goto L_0x0088
        L_0x0092:
            r19 = r2
        L_0x0094:
            com.google.gson.JsonElement r1 = r1.get(r4)
            if (r1 != 0) goto L_0x009d
        L_0x009a:
            r20 = r10
            goto L_0x00a6
        L_0x009d:
            java.lang.String r1 = r1.getAsString()
            if (r1 != 0) goto L_0x00a4
            goto L_0x009a
        L_0x00a4:
            r20 = r1
        L_0x00a6:
            java.lang.String r13 = r23.getDeviceId()
            com.hisense.connect_life.hismart.networks.request.device.model.OnlineStatus r1 = com.hisense.connect_life.hismart.networks.request.device.model.OnlineStatus.OFFLINE
            com.hisense.connect_life.hismart.networks.request.device.model.OnlineStatus r0 = r23.getOnlineStatus()
            if (r1 == r0) goto L_0x00b4
            r14 = r3
            goto L_0x00b5
        L_0x00b4:
            r14 = r8
        L_0x00b5:
            com.hisense.connect_life.hismart.networks.request.device.model.DeviceTemperatureInfo r0 = new com.hisense.connect_life.hismart.networks.request.device.model.DeviceTemperatureInfo
            r12 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            com.hisense.connect_life.hismart.sql.account.LoginUserInfoRoom$Companion r1 = com.hisense.connect_life.hismart.sql.account.LoginUserInfoRoom.Companion
            com.hisense.connect_life.hismart.sql.account.LoginUserInfoProvider r1 = r1.loginUserInfoProvider()
            r1.insertDeviceInfo(r0)
            goto L_0x0149
        L_0x00c6:
            com.hisense.connect_life.hismart.sql.account.LoginUserInfoRoom$Companion r1 = com.hisense.connect_life.hismart.sql.account.LoginUserInfoRoom.Companion
            com.hisense.connect_life.hismart.sql.account.LoginUserInfoProvider r1 = r1.loginUserInfoProvider()
            java.util.List r1 = r1.getAllDeviceInfo()
            if (r1 != 0) goto L_0x00d4
            r2 = 0
            goto L_0x00dc
        L_0x00d4:
            int r2 = r1.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L_0x00dc:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            int r2 = r2.intValue()
            if (r2 <= 0) goto L_0x0149
            java.util.Iterator r1 = r1.iterator()
        L_0x00e9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0149
            java.lang.Object r2 = r1.next()
            com.hisense.connect_life.hismart.networks.request.device.model.DeviceTemperatureInfo r2 = (com.hisense.connect_life.hismart.networks.request.device.model.DeviceTemperatureInfo) r2
            java.lang.String r12 = r2.getDeviceId()
            java.lang.String r13 = r23.getDeviceId()
            boolean r12 = android.text.TextUtils.equals(r12, r13)
            if (r12 == 0) goto L_0x00e9
            com.google.gson.JsonObject r12 = new com.google.gson.JsonObject
            r12.<init>()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            java.lang.String r14 = "Zone2Use"
            r12.addProperty((java.lang.String) r14, (java.lang.Number) r13)
            java.lang.String r13 = r2.getTemperatureUnit()
            r12.addProperty((java.lang.String) r11, (java.lang.String) r13)
            java.lang.String r13 = r2.getZone1SetTemperature()
            r12.addProperty((java.lang.String) r10, (java.lang.String) r13)
            java.lang.String r13 = r2.getZone2SetTemperature()
            r12.addProperty((java.lang.String) r9, (java.lang.String) r13)
            java.lang.String r13 = r2.getZone3SetTemperature()
            r12.addProperty((java.lang.String) r7, (java.lang.String) r13)
            java.lang.String r13 = r2.getZone1RealHumidity()
            r12.addProperty((java.lang.String) r6, (java.lang.String) r13)
            java.lang.String r13 = r2.getZone2RealHumidity()
            r12.addProperty((java.lang.String) r5, (java.lang.String) r13)
            java.lang.String r2 = r2.getZone3RealHumidity()
            r12.addProperty((java.lang.String) r4, (java.lang.String) r2)
            r0.setProperties(r12)
            r0.setShowErrorIcon(r3)
            goto L_0x00e9
        L_0x0149:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.juconnect.app_device.viewmodel.DeviceViewModel.filterDeviceInfo(com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo):void");
    }

    @NotNull
    public final MutableLiveData<Pair<Boolean, List<DeviceInfo>>> getApplListLiveData() {
        return (MutableLiveData) this.applListLiveData$delegate.getValue();
    }

    public final void getApplianceListWithProperty(boolean z) {
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new DeviceViewModel$getApplianceListWithProperty$1(this, (Continuation<? super DeviceViewModel$getApplianceListWithProperty$1>) null), 2, (Object) null);
    }

    @NotNull
    public final MutableLiveData<Pair<Boolean, String>> getBindDeviceIdLiveData() {
        return (MutableLiveData) this.bindDeviceIdLiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<Pair<Boolean, String>> getBindDeviceLiveData() {
        return (MutableLiveData) this.bindDeviceLiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<Pair<Boolean, String>> getCancelShareLiveData() {
        return (MutableLiveData) this.cancelShareLiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<Boolean> getDeviceCommandLiveData() {
        return (MutableLiveData) this.deviceCommandLiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<List<DeviceStatusBean>> getDeviceOnlineLiveData() {
        return (MutableLiveData) this.deviceOnlineLiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<List<DevicePropertyBean>> getDeviceProfileLiveData() {
        return (MutableLiveData) this.deviceProfileLiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<List<DevicePropertyBean>> getDevicePropertyLiveData() {
        return (MutableLiveData) this.devicePropertyLiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<Pair<Boolean, List<InstructionBookInfo>>> getInstructionBookLiveData() {
        return (MutableLiveData) this.instructionBookLiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<Pair<Boolean, List<UpgradeInfo>>> getOtaCheckWifiDeviceVersionLiveData() {
        return (MutableLiveData) this.otaCheckWifiDeviceVersionLiveData$delegate.getValue();
    }

    public final void getRemoteQueryByDevList(@NotNull List<String> list, @Nullable FilterCondition filterCondition) {
        Intrinsics.checkNotNullParameter(list, "deviceIdList");
        new MutableLiveData();
        HiSmart.Companion.getInstance().wineWineInventoryManagerSerivce().queryByDevList(list, filterCondition, 0, new DeviceViewModel$getRemoteQueryByDevList$1(this, filterCondition, list), DeviceViewModel$getRemoteQueryByDevList$2.INSTANCE);
    }

    @NotNull
    public final MutableLiveData<Pair<Boolean, UserShareResult>> getShareDeviceListLiveData() {
        return (MutableLiveData) this.shareDeviceListLiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<Pair<Boolean, String>> getShareDeviceLiveData() {
        return (MutableLiveData) this.shareDeviceLiveData$delegate.getValue();
    }

    public final void getShareList() {
        updateLoadingStatus(true);
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new DeviceViewModel$getShareList$1(this, (Continuation<? super DeviceViewModel$getShareList$1>) null), 2, (Object) null);
    }

    @NotNull
    public final MutableLiveData<Boolean> getSingleZoneQrCodeAuidTypeLiveData() {
        return (MutableLiveData) this.singleZoneQrCodeAuidTypeLiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<Boolean> getUpdateDeviceLiveData() {
        return (MutableLiveData) this.updateDeviceLiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<Integer> get_refreshLiveData() {
        return (MutableLiveData) this._refreshLiveData$delegate.getValue();
    }

    public final void otaCheckWifiDeviceVersion(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "wifiIds");
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new DeviceViewModel$otaCheckWifiDeviceVersion$1(list, this, (Continuation<? super DeviceViewModel$otaCheckWifiDeviceVersion$1>) null), 2, (Object) null);
    }

    public final void otaConfirmUpgrade(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, EventBusConstKt.WIFIID);
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new DeviceViewModel$otaConfirmUpgrade$1(str, (Continuation<? super DeviceViewModel$otaConfirmUpgrade$1>) null), 2, (Object) null);
    }

    public final void postRefreshData() {
        Integer value = get_refreshLiveData().getValue();
        if (value == null) {
            value = 0;
        }
        get_refreshLiveData().postValue(Integer.valueOf(value.intValue() + 1));
    }

    public final void queryApplianceProfile(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, KeyConst.KEY_AUIT);
        Intrinsics.checkNotNullParameter(str2, "heidi");
        updateLoadingStatus(true);
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new DeviceViewModel$queryApplianceProfile$1(str, str2, this, (Continuation<? super DeviceViewModel$queryApplianceProfile$1>) null), 2, (Object) null);
    }

    public final void queryDeviceOnline(@NotNull List<SimpleDeviceBean> list) {
        Intrinsics.checkNotNullParameter(list, "devices");
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new DeviceViewModel$queryDeviceOnline$1(list, this, (Continuation<? super DeviceViewModel$queryDeviceOnline$1>) null), 2, (Object) null);
    }

    public final void sendCommand(@NotNull String str, @NotNull String str2, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "deviceid");
        Intrinsics.checkNotNullParameter(str2, "wifiid");
        Intrinsics.checkNotNullParameter(map, "properties");
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new DeviceViewModel$sendCommand$1(str, str2, map, this, (Continuation<? super DeviceViewModel$sendCommand$1>) null), 2, (Object) null);
    }

    public final void shareDevice(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "deviceId");
        Intrinsics.checkNotNullParameter(str2, EventBusConstKt.WIFIID);
        Intrinsics.checkNotNullParameter(str3, "userBox");
        updateLoadingStatus(true);
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new DeviceViewModel$shareDevice$1(str, str2, str3, this, (Continuation<? super DeviceViewModel$shareDevice$1>) null), 2, (Object) null);
    }

    @NotNull
    public final JsonObject toSmallJsonObject(@NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "jsonObject");
        JsonObject jsonObject = new JsonObject();
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "jsonObject.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            jsonObject.addProperty(next, jSONObject.get(next).toString());
        }
        return jsonObject;
    }

    public final void updateDeviceCustomInfo(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, EventBusConstKt.WIFIID);
        Intrinsics.checkNotNullParameter(str2, "deviceId");
        Intrinsics.checkNotNullParameter(str3, "deviceNickName");
        updateLoadingStatus(true);
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new DeviceViewModel$updateDeviceCustomInfo$1(str, str2, str3, this, (Continuation<? super DeviceViewModel$updateDeviceCustomInfo$1>) null), 2, (Object) null);
    }

    @NotNull
    public final List<DeviceInfo> useCacheDeviceList() {
        LoginInfo userInfo = AccountUtils.Companion.getUserInfo();
        if (userInfo == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        JSONArray jSONArray = new JSONArray(String.valueOf(SPUtils.INSTANCE.get(Intrinsics.stringPlus(userInfo.getCustomerId(), "deviceList"), HttpUrl.PATH_SEGMENT_ENCODE_SET_URI)));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int length = jSONArray.length();
        while (i < length) {
            int i2 = i + 1;
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            DeviceInfo deviceInfo = (DeviceInfo) new Gson().fromJson(jSONObject.toString(), DeviceInfo.class);
            if (jSONObject.has("properties")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("properties");
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "jsonDeviceProperty");
                deviceInfo.setProperties(toSmallJsonObject(jSONObject2));
            }
            Intrinsics.checkNotNullExpressionValue(deviceInfo, GeneralMethodConstant.METHOD_DEVICE_INFO);
            arrayList.add(deviceInfo);
            i = i2;
        }
        return arrayList;
    }
}
