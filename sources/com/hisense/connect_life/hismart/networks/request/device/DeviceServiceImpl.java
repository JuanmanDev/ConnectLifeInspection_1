package com.hisense.connect_life.hismart.networks.request.device;

import android.text.TextUtils;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.test.orchestrator.junit.BundleJUnitUtils;
import com.google.gson.Gson;
import com.hisense.connect_life.core.global.EventBusConstKt;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.hismart.model.JuResponse;
import com.hisense.connect_life.hismart.model.JuResult;
import com.hisense.connect_life.hismart.networks.HiNetWorks;
import com.hisense.connect_life.hismart.networks.parameters.ParameterUtils;
import com.hisense.connect_life.hismart.networks.request.HiResponse;
import com.hisense.connect_life.hismart.networks.request.HiResult;
import com.hisense.connect_life.hismart.networks.request.device.model.ApplianceListResult;
import com.hisense.connect_life.hismart.networks.request.device.model.ApplianceProfile;
import com.hisense.connect_life.hismart.networks.request.device.model.ApplianceProfileResult;
import com.hisense.connect_life.hismart.networks.request.device.model.BindDeviceSuccessData;
import com.hisense.connect_life.hismart.networks.request.device.model.DevType;
import com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo;
import com.hisense.connect_life.hismart.networks.request.device.model.DevicePropertyBean;
import com.hisense.connect_life.hismart.networks.request.device.model.DevicePropertyResult;
import com.hisense.connect_life.hismart.networks.request.device.model.DeviceStatusBean;
import com.hisense.connect_life.hismart.networks.request.device.model.DeviceStatusResult;
import com.hisense.connect_life.hismart.networks.request.device.model.InstructionBookInfo;
import com.hisense.connect_life.hismart.networks.request.device.model.InstructionBookResult;
import com.hisense.connect_life.hismart.networks.request.device.model.OnlineStatus;
import com.hisense.connect_life.hismart.networks.request.device.model.SimpleDeviceBean;
import com.hisense.connect_life.hismart.networks.request.device.model.UpgradeInfo;
import com.hisense.connect_life.hismart.networks.request.device.model.UpgradeInfoResult;
import com.hisense.connect_life.hismart.networks.request.device.model.UserShareResult;
import com.hisense.connect_life.hismart.networks.request.url.CloudService;
import com.hisense.connect_life.hismart.networks.retrofit.RetrofitUtils;
import com.hisense.connect_life.hismart.utils.LoggerUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p040c.p429r.p430a.p439c.p440a.p441a.p446e.C7353a;
import p040c.p429r.p430a.p439c.p440a.p441a.p446e.C7354a0;
import p040c.p429r.p430a.p439c.p440a.p441a.p446e.C7355b;
import p040c.p429r.p430a.p439c.p440a.p441a.p446e.C7356b0;
import p040c.p429r.p430a.p439c.p440a.p441a.p446e.C7357c;
import p040c.p429r.p430a.p439c.p440a.p441a.p446e.C7358c0;
import p040c.p429r.p430a.p439c.p440a.p441a.p446e.C7359d;
import p040c.p429r.p430a.p439c.p440a.p441a.p446e.C7360d0;
import p040c.p429r.p430a.p439c.p440a.p441a.p446e.C7361e;
import p040c.p429r.p430a.p439c.p440a.p441a.p446e.C7362e0;
import p040c.p429r.p430a.p439c.p440a.p441a.p446e.C7363f;
import p040c.p429r.p430a.p439c.p440a.p441a.p446e.C7364f0;
import p040c.p429r.p430a.p439c.p440a.p441a.p446e.C7365g;
import p040c.p429r.p430a.p439c.p440a.p441a.p446e.C7366g0;
import p040c.p429r.p430a.p439c.p440a.p441a.p446e.C7367h;
import p040c.p429r.p430a.p439c.p440a.p441a.p446e.C7368h0;
import p040c.p429r.p430a.p439c.p440a.p441a.p446e.C7369i;
import p040c.p429r.p430a.p439c.p440a.p441a.p446e.C7370i0;
import p040c.p429r.p430a.p439c.p440a.p441a.p446e.C7371j;
import p040c.p429r.p430a.p439c.p440a.p441a.p446e.C7372j0;
import p040c.p429r.p430a.p439c.p440a.p441a.p446e.C7373k;
import p040c.p429r.p430a.p439c.p440a.p441a.p446e.C7374k0;
import p040c.p429r.p430a.p439c.p440a.p441a.p446e.C7375l;
import p040c.p429r.p430a.p439c.p440a.p441a.p446e.C7376l0;
import p040c.p429r.p430a.p439c.p440a.p441a.p446e.C7377m;
import p040c.p429r.p430a.p439c.p440a.p441a.p446e.C7378m0;
import p040c.p429r.p430a.p439c.p440a.p441a.p446e.C7379n;
import p040c.p429r.p430a.p439c.p440a.p441a.p446e.C7380o;
import p040c.p429r.p430a.p439c.p440a.p441a.p446e.C7381p;
import p040c.p429r.p430a.p439c.p440a.p441a.p446e.C7382q;
import p040c.p429r.p430a.p439c.p440a.p441a.p446e.C7383r;
import p040c.p429r.p430a.p439c.p440a.p441a.p446e.C7384s;
import p040c.p429r.p430a.p439c.p440a.p441a.p446e.C7385t;
import p040c.p429r.p430a.p439c.p440a.p441a.p446e.C7386u;
import p040c.p429r.p430a.p439c.p440a.p441a.p446e.C7387v;
import p040c.p429r.p430a.p439c.p440a.p441a.p446e.C7388w;
import p040c.p429r.p430a.p439c.p440a.p441a.p446e.C7389x;
import p040c.p429r.p430a.p439c.p440a.p441a.p446e.C7390y;
import p040c.p429r.p430a.p439c.p440a.p441a.p446e.C7391z;
import p553f.p594c.C9185c;
import p553f.p594c.p595n.p597b.C9200a;
import p553f.p594c.p598o.C9207b;
import p553f.p594c.p618w.C9324a;
import p648m.p683f.C9801a;

@Metadata(mo47990d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JP\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00120\u0010H\u0016J>\u0010\u0015\u001a\u00020\t2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00120\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00120\u0010H\u0016J6\u0010\u001a\u001a\u00020\t2\u0018\u0010\u000f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u0017\u0012\u0004\u0012\u00020\u00120\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00120\u0010H\u0016J6\u0010\u001c\u001a\u00020\t2\u0018\u0010\u000f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u0017\u0012\u0004\u0012\u00020\u00120\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00120\u0010H\u0016JB\u0010\u001d\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b2\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0004\u0012\u00020\u00120\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00120\u0010H\u0016JL\u0010\u001f\u001a\u00020\t2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00172\u0006\u0010\"\u001a\u00020\u00182\u0018\u0010\u000f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u0017\u0012\u0004\u0012\u00020\u00120\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00120\u0010H\u0016J0\u0010$\u001a\u00020\t2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00120\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00120\u0010H\u0016JD\u0010&\u001a\u00020\t2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00172\u0018\u0010\u000f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u0017\u0012\u0004\u0012\u00020\u00120\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00120\u0010H\u0016J8\u0010)\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00120\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00120\u0010H\u0016JB\u0010*\u001a\u00020\t2\u0006\u0010+\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u000b2\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0004\u0012\u00020\u00120\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00120\u0010H\u0016JD\u0010-\u001a\u00020\t2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u00172\u0018\u0010\u000f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\u0017\u0012\u0004\u0012\u00020\u00120\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00120\u0010H\u0016J\"\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020403022\f\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u0017H\u0002J\"\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020603022\f\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u0017H\u0002JT\u00107\u001a\u00020\t2\u0006\u00108\u001a\u00020\u000b2\u0006\u00109\u001a\u00020\u000b2\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0;2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00120\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00120\u0010H\u0016JP\u0010<\u001a\u00020\t2\u0006\u0010=\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020\u000b2\u0018\u0010\u000f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020?03\u0012\u0004\u0012\u00020\u00120\u00102\u0014\u0010@\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00120\u0010H\u0016J@\u0010A\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00120\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00120\u0010H\u0016J^\u0010B\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010C\u001a\u00020\u000b2\u0006\u0010D\u001a\u00020\u000b2\u0006\u0010E\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020\u000b2\u0018\u0010\u000f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020?03\u0012\u0004\u0012\u00020\u00120\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00120\u0010H\u0016JH\u0010G\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00120\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00120\u0010H\u0016JP\u0010H\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00120\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00120\u0010H\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006L"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/device/DeviceServiceImpl;", "Lcom/hisense/connect_life/hismart/networks/request/device/IDeviceService;", "()V", "deviceApi", "Lcom/hisense/connect_life/hismart/networks/request/device/DeviceApi;", "kotlin.jvm.PlatformType", "deviceControlApi", "Lcom/hisense/connect_life/hismart/networks/request/device/DeviceControlApi;", "bindAppliance", "Lio/reactivex/disposables/Disposable;", "wifiId", "", "deviceId", "deviceNickName", "applianceType", "success", "Lkotlin/Function1;", "Lcom/hisense/connect_life/hismart/networks/request/device/model/BindDeviceSuccessData;", "", "failure", "", "cancelShare", "shareIdList", "", "", "", "getApplianceList", "Lcom/hisense/connect_life/hismart/networks/request/device/model/DeviceInfo;", "getApplianceListWithProperty", "getApplianceProfile", "Lcom/hisense/connect_life/hismart/networks/request/device/model/ApplianceProfile;", "getCorrelationManuals", "typeList", "Lcom/hisense/connect_life/hismart/networks/request/device/model/DevType;", "type", "Lcom/hisense/connect_life/hismart/networks/request/device/model/InstructionBookInfo;", "getUserShareList", "Lcom/hisense/connect_life/hismart/networks/request/device/model/UserShareResult;", "otaCheckWifiDeviceVersion", "wifiIds", "Lcom/hisense/connect_life/hismart/networks/request/device/model/UpgradeInfo;", "otaConfirmUpgrade", "queryApplianceProfile", "auid", "heidi", "queryDeviceOnline", "devices", "Lcom/hisense/connect_life/hismart/networks/request/device/model/SimpleDeviceBean;", "Lcom/hisense/connect_life/hismart/networks/request/device/model/DeviceStatusBean;", "queryDeviceOnlineFlowable", "Lio/reactivex/Flowable;", "Lcom/hisense/connect_life/hismart/networks/request/HiResult;", "Lcom/hisense/connect_life/hismart/networks/request/device/model/DeviceStatusResult;", "queryDevicePropertyFlowable", "Lcom/hisense/connect_life/hismart/networks/request/device/model/DevicePropertyResult;", "sendCommand", "deviceid", "wifiid", "properties", "", "shareDevices", "devId", "userBox", "Lcom/hisense/connect_life/hismart/networks/request/HiResponse;", "error", "unbindAppliance", "updateApplianceProfile", "auId", "purchaseDate", "warrantyEndDate", "applianceMedia", "updateDeviceCustomInfo", "updateFile", "uploadFile", "Ljava/io/File;", "fileType", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: DeviceServiceImpl.kt */
public final class DeviceServiceImpl implements IDeviceService {
    public final DeviceApi deviceApi = ((DeviceApi) RetrofitUtils.INSTANCE.getRetrofit(HiNetWorks.Companion.getInstance().getHostUrl(CloudService.DEVICE)).mo51323b(DeviceApi.class));
    public final DeviceControlApi deviceControlApi = ((DeviceControlApi) RetrofitUtils.INSTANCE.getRetrofit(HiNetWorks.Companion.getInstance().getHostUrl(CloudService.DEVICE_INTERACTIVE)).mo51323b(DeviceControlApi.class));

    /* renamed from: bindAppliance$lambda-25  reason: not valid java name */
    public static final void m26991bindAppliance$lambda25(Function1 function1, Function1 function12, HiResult hiResult) {
        BindDeviceSuccessData bindDeviceSuccessData;
        BindDeviceSuccessData bindDeviceSuccessData2;
        Intrinsics.checkNotNullParameter(function1, "$success");
        Intrinsics.checkNotNullParameter(function12, "$failure");
        LoggerUtil.Companion.mo41769e(Intrinsics.stringPlus("bindAppliance suc:0 ", hiResult));
        Object obj = null;
        LoggerUtil.Companion.mo41769e(Intrinsics.stringPlus("bindAppliance suc:0 ", hiResult == null ? null : (BindDeviceSuccessData) hiResult.getResponse()));
        boolean z = false;
        if (!(hiResult == null || (bindDeviceSuccessData2 = (BindDeviceSuccessData) hiResult.getResponse()) == null || bindDeviceSuccessData2.getResultCode() != 0)) {
            z = true;
        }
        if (z) {
            if (hiResult != null) {
                obj = (BindDeviceSuccessData) hiResult.getResponse();
            }
            function1.invoke(obj);
            return;
        }
        if (!(hiResult == null || (bindDeviceSuccessData = (BindDeviceSuccessData) hiResult.getResponse()) == null)) {
            obj = Integer.valueOf(bindDeviceSuccessData.getResultCode());
        }
        function12.invoke(new Throwable(String.valueOf(obj)));
    }

    /* renamed from: bindAppliance$lambda-26  reason: not valid java name */
    public static final void m26992bindAppliance$lambda26(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$failure");
        LoggerUtil.Companion.mo41769e("bindAppliance error");
        LoggerUtil.Companion.mo41769e(Intrinsics.stringPlus("bindAppliance error ", th));
        Intrinsics.checkNotNullExpressionValue(th, LanguageConstKt.f15954it);
        function1.invoke(th);
    }

    /* renamed from: cancelShare$lambda-29  reason: not valid java name */
    public static final void m26993cancelShare$lambda29(Function1 function1, HiResult hiResult) {
        HiResponse hiResponse;
        Intrinsics.checkNotNullParameter(function1, "$success");
        boolean z = false;
        if (!(hiResult == null || (hiResponse = (HiResponse) hiResult.getResponse()) == null || hiResponse.getResultCode() != 0)) {
            z = true;
        }
        function1.invoke(Boolean.valueOf(z));
    }

    /* renamed from: cancelShare$lambda-30  reason: not valid java name */
    public static final void m26994cancelShare$lambda30(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$failure");
        Intrinsics.checkNotNullExpressionValue(th, LanguageConstKt.f15954it);
        function1.invoke(th);
    }

    /* renamed from: getApplianceList$lambda-1  reason: not valid java name */
    public static final void m26995getApplianceList$lambda1(Function1 function1, HiResult hiResult) {
        ApplianceListResult applianceListResult;
        Intrinsics.checkNotNullParameter(function1, "$success");
        List<DeviceInfo> list = null;
        if (!(hiResult == null || (applianceListResult = (ApplianceListResult) hiResult.getResponse()) == null)) {
            list = applianceListResult.getDeviceInfoList();
        }
        if (list == null) {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (DeviceInfo deviceInfo : list) {
            if (deviceInfo.getDeviceTypeCode().equals("001")) {
                arrayList.add(deviceInfo);
            }
        }
        DeviceCache.Companion.getInstance().refreshList(arrayList);
        function1.invoke(arrayList);
    }

    /* renamed from: getApplianceList$lambda-2  reason: not valid java name */
    public static final void m26996getApplianceList$lambda2(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$failure");
        Intrinsics.checkNotNullExpressionValue(th, LanguageConstKt.f15954it);
        function1.invoke(th);
    }

    /* renamed from: getApplianceListWithProperty$lambda-14  reason: not valid java name */
    public static final C9801a m26997getApplianceListWithProperty$lambda14(DeviceServiceImpl deviceServiceImpl, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(deviceServiceImpl, "this$0");
        Intrinsics.checkNotNullParameter(arrayList, LanguageConstKt.f15954it);
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            DeviceInfo deviceInfo = (DeviceInfo) it.next();
            arrayList2.add(new SimpleDeviceBean(deviceInfo.getDeviceId(), deviceInfo.getWifiId()));
        }
        return deviceServiceImpl.queryDevicePropertyFlowable(arrayList2).mo46982k(new C7378m0(arrayList));
    }

    /* renamed from: getApplianceListWithProperty$lambda-14$lambda-13  reason: not valid java name */
    public static final ArrayList m26998getApplianceListWithProperty$lambda14$lambda13(ArrayList arrayList, HiResult hiResult) {
        Intrinsics.checkNotNullParameter(arrayList, "$it");
        Intrinsics.checkNotNullParameter(hiResult, "propertyResult");
        List<DevicePropertyBean> devicesProperties = ((DevicePropertyResult) hiResult.getResponse()).getDevicesProperties();
        if (devicesProperties != null && (!devicesProperties.isEmpty())) {
            int i = 0;
            for (T next : devicesProperties) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                DevicePropertyBean devicePropertyBean = (DevicePropertyBean) next;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    DeviceInfo deviceInfo = (DeviceInfo) it.next();
                    if (TextUtils.equals(deviceInfo.getDeviceId(), devicePropertyBean.getDeviceid())) {
                        deviceInfo.setProperties(devicePropertyBean.getProperties());
                    }
                }
                i = i2;
            }
        }
        return arrayList;
    }

    /* renamed from: getApplianceListWithProperty$lambda-15  reason: not valid java name */
    public static final void m26999getApplianceListWithProperty$lambda15(Function1 function1, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(function1, "$success");
        List list = arrayList;
        if (arrayList == null) {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        Intrinsics.stringPlus("获取设备列表 存在缓存里面", Integer.valueOf(list.size()));
        DeviceCache.Companion.getInstance().refreshList(list);
        function1.invoke(list);
    }

    /* renamed from: getApplianceListWithProperty$lambda-16  reason: not valid java name */
    public static final void m27000getApplianceListWithProperty$lambda16(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$failure");
        Intrinsics.checkNotNullExpressionValue(th, LanguageConstKt.f15954it);
        function1.invoke(th);
    }

    /* renamed from: getApplianceListWithProperty$lambda-4  reason: not valid java name */
    public static final ArrayList m27001getApplianceListWithProperty$lambda4(HiResult hiResult) {
        Intrinsics.checkNotNullParameter(hiResult, LanguageConstKt.f15954it);
        ApplianceListResult applianceListResult = (ApplianceListResult) hiResult.getResponse();
        List<DeviceInfo> deviceInfoList = applianceListResult == null ? null : applianceListResult.getDeviceInfoList();
        if (deviceInfoList == null) {
            deviceInfoList = CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (DeviceInfo deviceInfo : deviceInfoList) {
            if (deviceInfo.getDeviceTypeCode().equals("001")) {
                arrayList.add(deviceInfo);
            }
        }
        return arrayList;
    }

    /* renamed from: getApplianceListWithProperty$lambda-9  reason: not valid java name */
    public static final C9801a m27002getApplianceListWithProperty$lambda9(DeviceServiceImpl deviceServiceImpl, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(deviceServiceImpl, "this$0");
        Intrinsics.checkNotNullParameter(arrayList, LanguageConstKt.f15954it);
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            DeviceInfo deviceInfo = (DeviceInfo) it.next();
            arrayList2.add(new SimpleDeviceBean(deviceInfo.getDeviceId(), deviceInfo.getWifiId()));
        }
        return deviceServiceImpl.queryDeviceOnlineFlowable(arrayList2).mo46982k(new C7355b(arrayList));
    }

    /* renamed from: getApplianceListWithProperty$lambda-9$lambda-8  reason: not valid java name */
    public static final ArrayList m27003getApplianceListWithProperty$lambda9$lambda8(ArrayList arrayList, HiResult hiResult) {
        Intrinsics.checkNotNullParameter(arrayList, "$it");
        Intrinsics.checkNotNullParameter(hiResult, "statusResult");
        List<DeviceStatusBean> devicesOnlineStatus = ((DeviceStatusResult) hiResult.getResponse()).getDevicesOnlineStatus();
        if (devicesOnlineStatus != null && (!devicesOnlineStatus.isEmpty())) {
            int i = 0;
            for (T next : devicesOnlineStatus) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                DeviceStatusBean deviceStatusBean = (DeviceStatusBean) next;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    DeviceInfo deviceInfo = (DeviceInfo) it.next();
                    if (TextUtils.equals(deviceInfo.getDeviceId(), deviceStatusBean.getDeviceid())) {
                        deviceInfo.setOnlineStatus(OnlineStatus.Companion.fromType(deviceStatusBean.getOnlineStatus().getMainOnline()));
                    }
                }
                i = i2;
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.hisense.connect_life.hismart.networks.request.device.model.ApplianceProfileResult} */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        r1 = (com.hisense.connect_life.hismart.networks.request.device.model.ApplianceProfileResult) r3.getResponse();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: getApplianceProfile$lambda-17  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m27004getApplianceProfile$lambda17(kotlin.jvm.functions.Function1 r2, com.hisense.connect_life.hismart.networks.request.HiResult r3) {
        /*
            java.lang.String r0 = "$success"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            if (r3 != 0) goto L_0x000a
        L_0x0008:
            r1 = r0
            goto L_0x0017
        L_0x000a:
            java.lang.Object r1 = r3.getResponse()
            com.hisense.connect_life.hismart.networks.request.device.model.ApplianceProfileResult r1 = (com.hisense.connect_life.hismart.networks.request.device.model.ApplianceProfileResult) r1
            if (r1 != 0) goto L_0x0013
            goto L_0x0008
        L_0x0013:
            com.hisense.connect_life.hismart.networks.request.device.model.ApplianceProfile r1 = r1.getApplianceProfile()
        L_0x0017:
            r2.invoke(r1)
            com.hisense.connect_life.hismart.utils.LoggerUtil$Companion r2 = com.hisense.connect_life.hismart.utils.LoggerUtil.Companion
            if (r3 != 0) goto L_0x001f
            goto L_0x0026
        L_0x001f:
            java.lang.Object r3 = r3.getResponse()
            r0 = r3
            com.hisense.connect_life.hismart.networks.request.device.model.ApplianceProfileResult r0 = (com.hisense.connect_life.hismart.networks.request.device.model.ApplianceProfileResult) r0
        L_0x0026:
            java.lang.String r3 = "getApplianceProfile suc:0 "
            java.lang.String r3 = kotlin.jvm.internal.Intrinsics.stringPlus(r3, r0)
            r2.mo41769e(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.connect_life.hismart.networks.request.device.DeviceServiceImpl.m27004getApplianceProfile$lambda17(kotlin.jvm.functions.Function1, com.hisense.connect_life.hismart.networks.request.HiResult):void");
    }

    /* renamed from: getApplianceProfile$lambda-18  reason: not valid java name */
    public static final void m27005getApplianceProfile$lambda18(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$failure");
        Intrinsics.checkNotNullExpressionValue(th, LanguageConstKt.f15954it);
        function1.invoke(th);
        LoggerUtil.Companion.mo41769e(Intrinsics.stringPlus("getApplianceProfile fai: ", th));
    }

    /* renamed from: getCorrelationManuals$lambda-47  reason: not valid java name */
    public static final void m27006getCorrelationManuals$lambda47(Function1 function1, Function1 function12, HiResult hiResult) {
        Intrinsics.checkNotNullParameter(function1, "$success");
        Intrinsics.checkNotNullParameter(function12, "$failure");
        if (((InstructionBookResult) hiResult.getResponse()).getResultCode() == 0) {
            function1.invoke(((InstructionBookResult) hiResult.getResponse()).getDevInstruction());
        } else {
            function12.invoke(new Throwable("Fail"));
        }
    }

    /* renamed from: getCorrelationManuals$lambda-48  reason: not valid java name */
    public static final void m27007getCorrelationManuals$lambda48(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$failure");
        Intrinsics.checkNotNullExpressionValue(th, LanguageConstKt.f15954it);
        function1.invoke(th);
    }

    /* renamed from: getUserShareList$lambda-37  reason: not valid java name */
    public static final void m27008getUserShareList$lambda37(Function1 function1, HiResult hiResult) {
        Intrinsics.checkNotNullParameter(function1, "$success");
        Intrinsics.stringPlus("接口返回", hiResult);
        function1.invoke(hiResult.getResponse());
    }

    /* renamed from: getUserShareList$lambda-38  reason: not valid java name */
    public static final void m27009getUserShareList$lambda38(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$failure");
        Intrinsics.checkNotNullExpressionValue(th, LanguageConstKt.f15954it);
        function1.invoke(th);
    }

    /* renamed from: otaCheckWifiDeviceVersion$lambda-39  reason: not valid java name */
    public static final void m27010otaCheckWifiDeviceVersion$lambda39(Function1 function1, HiResult hiResult) {
        Intrinsics.checkNotNullParameter(function1, "$success");
        function1.invoke(((UpgradeInfoResult) hiResult.getResponse()).getUpgradeInfo());
    }

    /* renamed from: otaCheckWifiDeviceVersion$lambda-40  reason: not valid java name */
    public static final void m27011otaCheckWifiDeviceVersion$lambda40(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$failure");
        Intrinsics.checkNotNullExpressionValue(th, LanguageConstKt.f15954it);
        function1.invoke(th);
    }

    /* renamed from: otaConfirmUpgrade$lambda-41  reason: not valid java name */
    public static final void m27012otaConfirmUpgrade$lambda41(Function1 function1, HiResult hiResult) {
        Intrinsics.checkNotNullParameter(function1, "$success");
        function1.invoke(Boolean.valueOf(((HiResponse) hiResult.getResponse()).getResultCode() == 0));
    }

    /* renamed from: otaConfirmUpgrade$lambda-42  reason: not valid java name */
    public static final void m27013otaConfirmUpgrade$lambda42(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$failure");
        Intrinsics.checkNotNullExpressionValue(th, LanguageConstKt.f15954it);
        function1.invoke(th);
    }

    /* renamed from: queryApplianceProfile$lambda-19  reason: not valid java name */
    public static final void m27014queryApplianceProfile$lambda19(Function1 function1, HiResult hiResult) {
        ApplianceProfileResult applianceProfileResult;
        Intrinsics.checkNotNullParameter(function1, "$success");
        ApplianceProfile applianceProfile = null;
        if (!(hiResult == null || (applianceProfileResult = (ApplianceProfileResult) hiResult.getResponse()) == null)) {
            applianceProfile = applianceProfileResult.getApplianceProfile();
        }
        function1.invoke(applianceProfile);
        LoggerUtil.Companion.mo41769e(Intrinsics.stringPlus("queryApplianceProfile suc:0 ", hiResult));
        LoggerUtil.Companion.mo41769e(Intrinsics.stringPlus("queryApplianceProfile getHostUrl: ", HiNetWorks.Companion.getInstance().getHostUrl(CloudService.DEVICE)));
    }

    /* renamed from: queryApplianceProfile$lambda-20  reason: not valid java name */
    public static final void m27015queryApplianceProfile$lambda20(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$failure");
        Intrinsics.checkNotNullExpressionValue(th, LanguageConstKt.f15954it);
        function1.invoke(th);
        LoggerUtil.Companion.mo41769e(Intrinsics.stringPlus("queryApplianceProfile fai: ", th));
    }

    /* renamed from: queryDeviceOnline$lambda-35  reason: not valid java name */
    public static final void m27016queryDeviceOnline$lambda35(Function1 function1, HiResult hiResult) {
        DeviceStatusResult deviceStatusResult;
        Intrinsics.checkNotNullParameter(function1, "$success");
        List<DeviceStatusBean> list = null;
        if (!(hiResult == null || (deviceStatusResult = (DeviceStatusResult) hiResult.getResponse()) == null)) {
            list = deviceStatusResult.getDevicesOnlineStatus();
        }
        if (list == null) {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        function1.invoke(list);
    }

    /* renamed from: queryDeviceOnline$lambda-36  reason: not valid java name */
    public static final void m27017queryDeviceOnline$lambda36(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$failure");
        Intrinsics.checkNotNullExpressionValue(th, LanguageConstKt.f15954it);
        function1.invoke(th);
    }

    private final C9185c<HiResult<DeviceStatusResult>> queryDeviceOnlineFlowable(List<SimpleDeviceBean> list) {
        RequestBody requestBody;
        try {
            requestBody = ParameterUtils.Companion.createParamBodySpec$default(ParameterUtils.Companion, (Map) null, (Map) null, MapsKt__MapsJVMKt.mapOf(TuplesKt.m25743to("devices", new JSONArray(new Gson().toJson((Object) list)))), 3, (Object) null);
        } catch (JSONException unused) {
            requestBody = ParameterUtils.Companion.createParamBodySpec$default(ParameterUtils.Companion, (Map) null, (Map) null, (Map) null, 7, (Object) null);
        }
        return this.deviceControlApi.queryDeviceOnline(requestBody);
    }

    private final C9185c<HiResult<DevicePropertyResult>> queryDevicePropertyFlowable(List<SimpleDeviceBean> list) {
        RequestBody requestBody;
        try {
            requestBody = ParameterUtils.Companion.createParamBodySpec$default(ParameterUtils.Companion, (Map) null, (Map) null, MapsKt__MapsJVMKt.mapOf(TuplesKt.m25743to("devices", new JSONArray(new Gson().toJson((Object) list)))), 3, (Object) null);
        } catch (JSONException unused) {
            requestBody = ParameterUtils.Companion.createParamBodySpec$default(ParameterUtils.Companion, (Map) null, (Map) null, (Map) null, 7, (Object) null);
        }
        return this.deviceControlApi.queryDeviceProperty(requestBody);
    }

    /* renamed from: sendCommand$lambda-33  reason: not valid java name */
    public static final void m27018sendCommand$lambda33(Function1 function1, HiResult hiResult) {
        HiResponse hiResponse;
        Intrinsics.checkNotNullParameter(function1, "$success");
        boolean z = false;
        if (!(hiResult == null || (hiResponse = (HiResponse) hiResult.getResponse()) == null || hiResponse.getResultCode() != 0)) {
            z = true;
        }
        function1.invoke(Boolean.valueOf(z));
    }

    /* renamed from: sendCommand$lambda-34  reason: not valid java name */
    public static final void m27019sendCommand$lambda34(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$failure");
        Intrinsics.checkNotNullExpressionValue(th, LanguageConstKt.f15954it);
        function1.invoke(th);
    }

    /* renamed from: shareDevices$lambda-21  reason: not valid java name */
    public static final void m27020shareDevices$lambda21(Function1 function1, HiResult hiResult) {
        Intrinsics.checkNotNullParameter(function1, "$success");
        Intrinsics.stringPlus("接口请求成功回来了", hiResult);
        Intrinsics.checkNotNullExpressionValue(hiResult, LanguageConstKt.f15954it);
        function1.invoke(hiResult);
    }

    /* renamed from: shareDevices$lambda-22  reason: not valid java name */
    public static final void m27021shareDevices$lambda22(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$error");
        Intrinsics.stringPlus("接口请求失败回来了", th);
        function1.invoke(th);
    }

    /* renamed from: unbindAppliance$lambda-27  reason: not valid java name */
    public static final void m27022unbindAppliance$lambda27(Function1 function1, HiResult hiResult) {
        HiResponse hiResponse;
        Intrinsics.checkNotNullParameter(function1, "$success");
        boolean z = false;
        if (!(hiResult == null || (hiResponse = (HiResponse) hiResult.getResponse()) == null || hiResponse.getResultCode() != 0)) {
            z = true;
        }
        function1.invoke(Boolean.valueOf(z));
    }

    /* renamed from: unbindAppliance$lambda-28  reason: not valid java name */
    public static final void m27023unbindAppliance$lambda28(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$failure");
        Intrinsics.checkNotNullExpressionValue(th, LanguageConstKt.f15954it);
        function1.invoke(th);
    }

    /* renamed from: updateApplianceProfile$lambda-23  reason: not valid java name */
    public static final void m27024updateApplianceProfile$lambda23(Function1 function1, HiResult hiResult) {
        Intrinsics.checkNotNullParameter(function1, "$success");
        Intrinsics.checkNotNullExpressionValue(hiResult, LanguageConstKt.f15954it);
        function1.invoke(hiResult);
    }

    /* renamed from: updateApplianceProfile$lambda-24  reason: not valid java name */
    public static final void m27025updateApplianceProfile$lambda24(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$failure");
        Intrinsics.checkNotNullExpressionValue(th, LanguageConstKt.f15954it);
        function1.invoke(th);
    }

    /* renamed from: updateDeviceCustomInfo$lambda-31  reason: not valid java name */
    public static final void m27026updateDeviceCustomInfo$lambda31(Function1 function1, HiResult hiResult) {
        HiResponse hiResponse;
        Intrinsics.checkNotNullParameter(function1, "$success");
        boolean z = false;
        if (!(hiResult == null || (hiResponse = (HiResponse) hiResult.getResponse()) == null || hiResponse.getResultCode() != 0)) {
            z = true;
        }
        function1.invoke(Boolean.valueOf(z));
    }

    /* renamed from: updateDeviceCustomInfo$lambda-32  reason: not valid java name */
    public static final void m27027updateDeviceCustomInfo$lambda32(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$failure");
        Intrinsics.checkNotNullExpressionValue(th, LanguageConstKt.f15954it);
        function1.invoke(th);
    }

    /* renamed from: updateFile$lambda-45  reason: not valid java name */
    public static final void m27028updateFile$lambda45(Function1 function1, JuResult juResult) {
        JuResponse response;
        Intrinsics.checkNotNullParameter(function1, "$success");
        boolean z = false;
        if (!(juResult == null || (response = juResult.getResponse()) == null || response.getResultCode() != 0)) {
            z = true;
        }
        function1.invoke(Boolean.valueOf(z));
    }

    /* renamed from: updateFile$lambda-46  reason: not valid java name */
    public static final void m27029updateFile$lambda46(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$failure");
        Intrinsics.checkNotNullExpressionValue(th, LanguageConstKt.f15954it);
        function1.invoke(th);
    }

    @NotNull
    public C9207b bindAppliance(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull Function1<? super BindDeviceSuccessData, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, EventBusConstKt.WIFIID);
        Intrinsics.checkNotNullParameter(str2, "deviceId");
        Intrinsics.checkNotNullParameter(str3, "deviceNickName");
        Intrinsics.checkNotNullParameter(str4, "applianceType");
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, BundleJUnitUtils.KEY_FAILURE);
        C9207b s = this.deviceApi.bindAppliance(ParameterUtils.Companion.createParamBody(MapsKt__MapsKt.mapOf(TuplesKt.m25743to(EventBusConstKt.WIFIID, str), TuplesKt.m25743to("deviceId", str2), TuplesKt.m25743to("deviceNickName", str3), TuplesKt.m25743to("applianceType", str4), TuplesKt.m25743to("deviceFeatureCode", "000")))).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7382q(function1, function12), new C7381p(function12));
        Intrinsics.checkNotNullExpressionValue(s, "deviceApi.bindAppliance(…re(it)\n                })");
        return s;
    }

    @NotNull
    public C9207b cancelShare(@NotNull List<Integer> list, @NotNull Function1<? super Boolean, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        RequestBody requestBody;
        Intrinsics.checkNotNullParameter(list, "shareIdList");
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, BundleJUnitUtils.KEY_FAILURE);
        try {
            requestBody = ParameterUtils.Companion.createParamBodySpec$default(ParameterUtils.Companion, (Map) null, (Map) null, MapsKt__MapsJVMKt.mapOf(TuplesKt.m25743to("shareIdList", new JSONArray(new Gson().toJson((Object) list)))), 3, (Object) null);
        } catch (JSONException unused) {
            requestBody = ParameterUtils.Companion.createParamBodySpec$default(ParameterUtils.Companion, (Map) null, (Map) null, (Map) null, 7, (Object) null);
        }
        C9207b s = this.deviceApi.cancelShare(requestBody).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7369i(function1), new C7380o(function12));
        Intrinsics.checkNotNullExpressionValue(s, "deviceApi.cancelShare(pa…ailure(it)\n            })");
        return s;
    }

    @NotNull
    public C9207b getApplianceList(@NotNull Function1<? super List<DeviceInfo>, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, BundleJUnitUtils.KEY_FAILURE);
        C9207b s = this.deviceApi.getApplianceList(ParameterUtils.Companion.createParamMap(MapsKt__MapsKt.emptyMap())).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7361e(function1), new C7375l(function12));
        Intrinsics.checkNotNullExpressionValue(s, "deviceApi.getApplianceLi…re(it)\n                })");
        return s;
    }

    @NotNull
    public C9207b getApplianceListWithProperty(@NotNull Function1<? super List<DeviceInfo>, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, BundleJUnitUtils.KEY_FAILURE);
        C9207b s = this.deviceApi.getApplianceList(ParameterUtils.Companion.createParamMap(MapsKt__MapsKt.emptyMap())).mo46994w(C9324a.m25177b()).mo46982k(C7363f.f14048e).mo46980h(new C7360d0(this)).mo46980h(new C7357c(this)).mo46983l(C9200a.m24953a()).mo46990s(new C7390y(function1), new C7384s(function12));
        Intrinsics.checkNotNullExpressionValue(s, "deviceApi.getApplianceLi…re(it)\n                })");
        return s;
    }

    @NotNull
    public C9207b getApplianceProfile(@NotNull String str, @NotNull String str2, @NotNull Function1<? super ApplianceProfile, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, "deviceId");
        Intrinsics.checkNotNullParameter(str2, EventBusConstKt.WIFIID);
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, BundleJUnitUtils.KEY_FAILURE);
        C9207b s = this.deviceApi.getApplianceProfile(ParameterUtils.Companion.createParamMap(MapsKt__MapsKt.mapOf(TuplesKt.m25743to("deviceId", str), TuplesKt.m25743to(EventBusConstKt.WIFIID, str2)))).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7356b0(function1), new C7377m(function12));
        Intrinsics.checkNotNullExpressionValue(s, "deviceApi.getAppliancePr… $it\")\n                })");
        return s;
    }

    @NotNull
    public C9207b getCorrelationManuals(@NotNull List<DevType> list, int i, @NotNull Function1<? super List<InstructionBookInfo>, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(list, "typeList");
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, BundleJUnitUtils.KEY_FAILURE);
        C9207b s = this.deviceApi.instractionBook(ParameterUtils.Companion.createParamBody(MapsKt__MapsKt.mapOf(TuplesKt.m25743to("typeList", new Gson().toJson((Object) list)), TuplesKt.m25743to("type", String.valueOf(i))))).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7359d(function1, function12), new C7371j(function12));
        Intrinsics.checkNotNullExpressionValue(s, "deviceApi.instractionBoo…re(it)\n                })");
        return s;
    }

    @NotNull
    public C9207b getUserShareList(@NotNull Function1<? super UserShareResult, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, BundleJUnitUtils.KEY_FAILURE);
        C9207b s = this.deviceApi.getUserShareDeviceList(ParameterUtils.Companion.createSignParamMap()).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7379n(function1), new C7367h(function12));
        Intrinsics.checkNotNullExpressionValue(s, "deviceApi.getUserShareDe…ailure(it)\n            })");
        return s;
    }

    @NotNull
    public C9207b otaCheckWifiDeviceVersion(@NotNull List<String> list, @NotNull Function1<? super List<UpgradeInfo>, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        RequestBody requestBody;
        Intrinsics.checkNotNullParameter(list, "wifiIds");
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, BundleJUnitUtils.KEY_FAILURE);
        try {
            requestBody = ParameterUtils.Companion.createParamBodySpec$default(ParameterUtils.Companion, (Map) null, (Map) null, MapsKt__MapsJVMKt.mapOf(TuplesKt.m25743to("wifiIds", new JSONArray(new Gson().toJson((Object) list)))), 3, (Object) null);
        } catch (Exception unused) {
            requestBody = ParameterUtils.Companion.createParamBodySpec$default(ParameterUtils.Companion, (Map) null, (Map) null, (Map) null, 7, (Object) null);
        }
        C9207b s = this.deviceApi.otaCheckWifiDeviceVersion(requestBody).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7385t(function1), new C7386u(function12));
        Intrinsics.checkNotNullExpressionValue(s, "deviceApi.otaCheckWifiDe…re(it)\n                })");
        return s;
    }

    @NotNull
    public C9207b otaConfirmUpgrade(@NotNull String str, @NotNull Function1<? super Boolean, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, EventBusConstKt.WIFIID);
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, BundleJUnitUtils.KEY_FAILURE);
        C9207b s = this.deviceApi.otaConfirmUpgrade(ParameterUtils.Companion.createParamMap(MapsKt__MapsJVMKt.mapOf(TuplesKt.m25743to(EventBusConstKt.WIFIID, str)))).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7388w(function1), new C7383r(function12));
        Intrinsics.checkNotNullExpressionValue(s, "deviceApi.otaConfirmUpgr…re(it)\n                })");
        return s;
    }

    @NotNull
    public C9207b queryApplianceProfile(@NotNull String str, @NotNull String str2, @NotNull Function1<? super ApplianceProfile, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, KeyConst.KEY_AUIT);
        Intrinsics.checkNotNullParameter(str2, "heidi");
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, BundleJUnitUtils.KEY_FAILURE);
        C9207b s = this.deviceApi.queryApplianceProfile(ParameterUtils.Companion.createParamMap(MapsKt__MapsKt.mapOf(TuplesKt.m25743to(KeyConst.KEY_AUIT, str), TuplesKt.m25743to("heidi", str2)))).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7353a(function1), new C7362e0(function12));
        Intrinsics.checkNotNullExpressionValue(s, "deviceApi.queryAppliance… $it\")\n                })");
        return s;
    }

    @NotNull
    public C9207b queryDeviceOnline(@NotNull List<SimpleDeviceBean> list, @NotNull Function1<? super List<DeviceStatusBean>, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(list, "devices");
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, BundleJUnitUtils.KEY_FAILURE);
        C9207b s = queryDeviceOnlineFlowable(list).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7366g0(function1), new C7374k0(function12));
        Intrinsics.checkNotNullExpressionValue(s, "queryDeviceOnlineFlowabl…re(it)\n                })");
        return s;
    }

    @NotNull
    public C9207b sendCommand(@NotNull String str, @NotNull String str2, @NotNull Map<String, String> map, @NotNull Function1<? super Boolean, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        RequestBody requestBody;
        Intrinsics.checkNotNullParameter(str, "deviceid");
        Intrinsics.checkNotNullParameter(str2, "wifiid");
        Intrinsics.checkNotNullParameter(map, "properties");
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, BundleJUnitUtils.KEY_FAILURE);
        Map mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m25743to("wifiid", str2), TuplesKt.m25743to("deviceid", str));
        try {
            requestBody = ParameterUtils.Companion.createParamBodySpec$default(ParameterUtils.Companion, mapOf, MapsKt__MapsJVMKt.mapOf(TuplesKt.m25743to("properties", new JSONObject(new Gson().toJson((Object) map)))), (Map) null, 4, (Object) null);
        } catch (JSONException unused) {
            requestBody = ParameterUtils.Companion.createParamBodySpec$default(ParameterUtils.Companion, (Map) null, (Map) null, (Map) null, 7, (Object) null);
        }
        C9207b s = this.deviceControlApi.sendCommand(requestBody).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7364f0(function1), new C7389x(function12));
        Intrinsics.checkNotNullExpressionValue(s, "deviceControlApi.sendCom…re(it)\n                })");
        return s;
    }

    @NotNull
    public C9207b shareDevices(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Function1<? super HiResult<HiResponse>, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, "devId");
        Intrinsics.checkNotNullParameter(str2, EventBusConstKt.WIFIID);
        Intrinsics.checkNotNullParameter(str3, "userBox");
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, "error");
        C9207b s = this.deviceApi.shareAppliance(ParameterUtils.Companion.createParamBody(MapsKt__MapsKt.mapOf(TuplesKt.m25743to(EventBusConstKt.WIFIID, str2), TuplesKt.m25743to("deviceId", str), TuplesKt.m25743to("userMailbox", str3)))).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7373k(function1), new C7391z(function12));
        Intrinsics.checkNotNullExpressionValue(s, "deviceApi.shareAppliance… error(it)\n            })");
        return s;
    }

    @NotNull
    public C9207b unbindAppliance(@NotNull String str, @NotNull String str2, @NotNull Function1<? super Boolean, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, EventBusConstKt.WIFIID);
        Intrinsics.checkNotNullParameter(str2, "deviceId");
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, BundleJUnitUtils.KEY_FAILURE);
        C9207b s = this.deviceApi.unbindAppliance(ParameterUtils.Companion.createParamBody(MapsKt__MapsKt.mapOf(TuplesKt.m25743to(EventBusConstKt.WIFIID, str), TuplesKt.m25743to("deviceId", str2)))).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7354a0(function1), new C7372j0(function12));
        Intrinsics.checkNotNullExpressionValue(s, "deviceApi.unbindApplianc…re(it)\n                })");
        return s;
    }

    @NotNull
    public C9207b updateApplianceProfile(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull Function1<? super HiResult<HiResponse>, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        RequestBody requestBody;
        Map map;
        String str6 = str;
        String str7 = str2;
        String str8 = str3;
        String str9 = str4;
        String str10 = str5;
        Function1<? super HiResult<HiResponse>, Unit> function13 = function1;
        Function1<? super Throwable, Unit> function14 = function12;
        Intrinsics.checkNotNullParameter(str6, EventBusConstKt.WIFIID);
        Intrinsics.checkNotNullParameter(str7, "auId");
        Intrinsics.checkNotNullParameter(str8, "purchaseDate");
        Intrinsics.checkNotNullParameter(str9, "warrantyEndDate");
        Intrinsics.checkNotNullParameter(str10, "applianceMedia");
        Intrinsics.checkNotNullParameter(function13, "success");
        Intrinsics.checkNotNullParameter(function14, BundleJUnitUtils.KEY_FAILURE);
        Map mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m25743to(EventBusConstKt.WIFIID, str6), TuplesKt.m25743to("auId", str7), TuplesKt.m25743to("purchaseDate", str8), TuplesKt.m25743to("warrantyEndDate", str9));
        try {
            if (!TextUtils.isEmpty(str5)) {
                map = MapsKt__MapsJVMKt.mapOf(TuplesKt.m25743to("applianceMedia", new JSONObject(str10)));
            } else {
                map = MapsKt__MapsKt.emptyMap();
            }
            requestBody = ParameterUtils.Companion.createParamBodySpec$default(ParameterUtils.Companion, mapOf, map, (Map) null, 4, (Object) null);
        } catch (JSONException unused) {
            requestBody = ParameterUtils.Companion.createParamBodySpec$default(ParameterUtils.Companion, (Map) null, (Map) null, (Map) null, 7, (Object) null);
        }
        C9207b s = this.deviceApi.updateApplianceProfile(requestBody).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7368h0(function13), new C7370i0(function14));
        Intrinsics.checkNotNullExpressionValue(s, "deviceApi.updateApplianc…re(it)\n                })");
        return s;
    }

    @NotNull
    public C9207b updateDeviceCustomInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Function1<? super Boolean, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, EventBusConstKt.WIFIID);
        Intrinsics.checkNotNullParameter(str2, "deviceId");
        Intrinsics.checkNotNullParameter(str3, "deviceNickName");
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, BundleJUnitUtils.KEY_FAILURE);
        C9207b s = this.deviceApi.updateDeviceCustomInfo(ParameterUtils.Companion.createParamBody(MapsKt__MapsKt.mapOf(TuplesKt.m25743to(EventBusConstKt.WIFIID, str), TuplesKt.m25743to("deviceId", str2), TuplesKt.m25743to("deviceNickName", str3)))).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7358c0(function1), new C7387v(function12));
        Intrinsics.checkNotNullExpressionValue(s, "deviceApi.updateDeviceCu…re(it)\n                })");
        return s;
    }

    @NotNull
    public C9207b updateFile(@NotNull String str, @NotNull String str2, @NotNull File file, @NotNull String str3, @NotNull Function1<? super Boolean, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, EventBusConstKt.WIFIID);
        Intrinsics.checkNotNullParameter(str2, "deviceId");
        Intrinsics.checkNotNullParameter(file, "uploadFile");
        Intrinsics.checkNotNullParameter(str3, "fileType");
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, BundleJUnitUtils.KEY_FAILURE);
        RequestBody create = RequestBody.Companion.create(MediaType.Companion.parse(ShareTarget.ENCODING_TYPE_MULTIPART), file);
        MultipartBody.Part createFormData = MultipartBody.Part.Companion.createFormData("uploadFile", file.getName(), create);
        Map<String, String> mutableMap = MapsKt__MapsKt.toMutableMap(ParameterUtils.Companion.createParamMap(MapsKt__MapsKt.mapOf(TuplesKt.m25743to(EventBusConstKt.WIFIID, str), TuplesKt.m25743to("deviceId", str2), TuplesKt.m25743to("fileName", file.getName()), TuplesKt.m25743to("fileType", str3))));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : mutableMap.entrySet()) {
            linkedHashMap.put(next.getKey(), RequestBody.Companion.create(MediaType.Companion.parse(ShareTarget.ENCODING_TYPE_MULTIPART), (String) next.getValue()));
        }
        new MultipartBody.Builder((String) null, 1, (DefaultConstructorMarker) null).addPart(create);
        C9207b s = this.deviceApi.updateFile(createFormData, linkedHashMap).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7365g(function1), new C7376l0(function12));
        Intrinsics.checkNotNullExpressionValue(s, "deviceApi.updateFile(bod…re(it)\n                })");
        return s;
    }
}
