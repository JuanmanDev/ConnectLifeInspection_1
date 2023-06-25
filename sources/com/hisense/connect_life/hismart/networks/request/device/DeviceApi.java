package com.hisense.connect_life.hismart.networks.request.device;

import com.hisense.connect_life.hismart.model.JuResult;
import com.hisense.connect_life.hismart.networks.request.HiResponse;
import com.hisense.connect_life.hismart.networks.request.HiResult;
import com.hisense.connect_life.hismart.networks.request.device.model.ApplianceListResult;
import com.hisense.connect_life.hismart.networks.request.device.model.ApplianceProfileResult;
import com.hisense.connect_life.hismart.networks.request.device.model.BindDeviceSuccessData;
import com.hisense.connect_life.hismart.networks.request.device.model.InstructionBookResult;
import com.hisense.connect_life.hismart.networks.request.device.model.UpgradeInfoResult;
import com.hisense.connect_life.hismart.networks.request.device.model.UserShareResult;
import java.util.Map;
import kotlin.Metadata;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import p553f.p594c.C9185c;
import p692o.p698x.C9945a;
import p692o.p698x.C9950f;
import p692o.p698x.C9955k;
import p692o.p698x.C9958n;
import p692o.p698x.C9960p;
import p692o.p698x.C9961q;
import p692o.p698x.C9964t;

@Metadata(mo47990d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J\u001e\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J*\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u00032\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fH'J*\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00040\u00032\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fH'J*\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00040\u00032\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fH'J\u001e\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J\u001e\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J*\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u00032\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fH'J*\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00040\u00032\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fH'J\u001e\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J\u001e\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J\u001e\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u00032\b\b\u0001\u0010\u001b\u001a\u00020\u0007H'J\u001e\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J3\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00032\b\b\u0001\u0010\u001f\u001a\u00020 2\u0019\b\u0001\u0010!\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\"0\fH'¨\u0006#"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/device/DeviceApi;", "", "bindAppliance", "Lio/reactivex/Flowable;", "Lcom/hisense/connect_life/hismart/networks/request/HiResult;", "Lcom/hisense/connect_life/hismart/networks/request/device/model/BindDeviceSuccessData;", "params", "Lokhttp3/RequestBody;", "cancelShare", "Lcom/hisense/connect_life/hismart/networks/request/HiResponse;", "getApplianceList", "Lcom/hisense/connect_life/hismart/networks/request/device/model/ApplianceListResult;", "", "", "getApplianceProfile", "Lcom/hisense/connect_life/hismart/networks/request/device/model/ApplianceProfileResult;", "getUserShareDeviceList", "Lcom/hisense/connect_life/hismart/networks/request/device/model/UserShareResult;", "instractionBook", "Lcom/hisense/connect_life/hismart/networks/request/device/model/InstructionBookResult;", "otaCheckWifiDeviceVersion", "Lcom/hisense/connect_life/hismart/networks/request/device/model/UpgradeInfoResult;", "otaConfirmUpgrade", "queryApplianceProfile", "shareAppliance", "unbindAppliance", "updateApplianceProfile", "profile", "updateDeviceCustomInfo", "updateFile", "Lcom/hisense/connect_life/hismart/model/JuResult;", "fileBody", "Lokhttp3/MultipartBody$Part;", "requestBodyMap", "Lkotlin/jvm/JvmSuppressWildcards;", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: DeviceApi.kt */
public interface DeviceApi {
    @NotNull
    @C9958n("dms/save_bind_relation")
    C9185c<HiResult<BindDeviceSuccessData>> bindAppliance(@NotNull @C9945a RequestBody requestBody);

    @NotNull
    @C9958n("dms/cancel_share")
    C9185c<HiResult<HiResponse>> cancelShare(@NotNull @C9945a RequestBody requestBody);

    @NotNull
    @C9950f("dms/get_customer_device_list_info")
    C9185c<HiResult<ApplianceListResult>> getApplianceList(@NotNull @C9964t Map<String, String> map);

    @NotNull
    @C9950f("dms/get_appliance_profile")
    C9185c<HiResult<ApplianceProfileResult>> getApplianceProfile(@NotNull @C9964t Map<String, String> map);

    @NotNull
    @C9950f("dms/get_user_share_device_list")
    C9185c<HiResult<UserShareResult>> getUserShareDeviceList(@NotNull @C9964t Map<String, String> map);

    @NotNull
    @C9958n("resource/getDeviceInstructionBook")
    C9185c<HiResult<InstructionBookResult>> instractionBook(@NotNull @C9945a RequestBody requestBody);

    @NotNull
    @C9958n("wfota/check_wifi_device_version")
    C9185c<HiResult<UpgradeInfoResult>> otaCheckWifiDeviceVersion(@NotNull @C9945a RequestBody requestBody);

    @NotNull
    @C9950f("wfota/confirm_upgrade")
    C9185c<HiResult<HiResponse>> otaConfirmUpgrade(@NotNull @C9964t Map<String, String> map);

    @NotNull
    @C9950f("dms/query_appliance_profile")
    C9185c<HiResult<ApplianceProfileResult>> queryApplianceProfile(@NotNull @C9964t Map<String, String> map);

    @NotNull
    @C9958n("dms/device_share")
    C9185c<HiResult<HiResponse>> shareAppliance(@NotNull @C9945a RequestBody requestBody);

    @NotNull
    @C9958n("dms/delete_customer_device")
    C9185c<HiResult<HiResponse>> unbindAppliance(@NotNull @C9945a RequestBody requestBody);

    @NotNull
    @C9958n("dms/update_appliance_profile")
    C9185c<HiResult<HiResponse>> updateApplianceProfile(@NotNull @C9945a RequestBody requestBody);

    @NotNull
    @C9958n("dms/update_device_custom_info")
    C9185c<HiResult<HiResponse>> updateDeviceCustomInfo(@NotNull @C9945a RequestBody requestBody);

    @C9958n("dms/update_file")
    @C9955k
    @NotNull
    C9185c<JuResult> updateFile(@NotNull @C9960p MultipartBody.Part part, @NotNull @C9961q Map<String, RequestBody> map);
}
