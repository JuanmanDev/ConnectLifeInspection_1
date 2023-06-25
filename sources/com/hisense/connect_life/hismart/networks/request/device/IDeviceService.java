package com.hisense.connect_life.hismart.networks.request.device;

import com.hisense.connect_life.hismart.networks.request.HiResponse;
import com.hisense.connect_life.hismart.networks.request.HiResult;
import com.hisense.connect_life.hismart.networks.request.device.model.ApplianceProfile;
import com.hisense.connect_life.hismart.networks.request.device.model.BindDeviceSuccessData;
import com.hisense.connect_life.hismart.networks.request.device.model.DevType;
import com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo;
import com.hisense.connect_life.hismart.networks.request.device.model.DeviceStatusBean;
import com.hisense.connect_life.hismart.networks.request.device.model.InstructionBookInfo;
import com.hisense.connect_life.hismart.networks.request.device.model.SimpleDeviceBean;
import com.hisense.connect_life.hismart.networks.request.device.model.UpgradeInfo;
import com.hisense.connect_life.hismart.networks.request.device.model.UserShareResult;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p553f.p594c.p598o.C9207b;

@Metadata(mo47990d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JP\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\nH&J>\u0010\u000f\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f0\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\nH&J6\u0010\u0014\u001a\u00020\u00032\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0011\u0012\u0004\u0012\u00020\f0\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\nH&J6\u0010\u0016\u001a\u00020\u00032\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0011\u0012\u0004\u0012\u00020\f0\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\nH&JB\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\f0\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\nH&JL\u0010\u0019\u001a\u00020\u00032\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00112\u0006\u0010\u001c\u001a\u00020\u00122\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u0011\u0012\u0004\u0012\u00020\f0\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\nH&J0\u0010\u001e\u001a\u00020\u00032\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\f0\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\nH&JD\u0010 \u001a\u00020\u00032\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u00112\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u0011\u0012\u0004\u0012\u00020\f0\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\nH&J8\u0010#\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f0\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\nH&JB\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00052\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\f0\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\nH&JD\u0010'\u001a\u00020\u00032\f\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u00112\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u0011\u0012\u0004\u0012\u00020\f0\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\nH&JT\u0010+\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\u00052\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050/2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f0\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\nH&JP\u00100\u001a\u00020\u00032\u0006\u00101\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u00052\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020403\u0012\u0004\u0012\u00020\f0\n2\u0014\u00105\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\f0\nH&J@\u00106\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f0\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\nH&J^\u00107\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u00108\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u00052\u0006\u0010:\u001a\u00020\u00052\u0006\u0010;\u001a\u00020\u00052\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020403\u0012\u0004\u0012\u00020\f0\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\nH&JH\u0010<\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f0\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\nH&JP\u0010=\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f0\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\nH&¨\u0006A"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/device/IDeviceService;", "", "bindAppliance", "Lio/reactivex/disposables/Disposable;", "wifiId", "", "deviceId", "deviceNickName", "applianceType", "success", "Lkotlin/Function1;", "Lcom/hisense/connect_life/hismart/networks/request/device/model/BindDeviceSuccessData;", "", "failure", "", "cancelShare", "shareIdList", "", "", "", "getApplianceList", "Lcom/hisense/connect_life/hismart/networks/request/device/model/DeviceInfo;", "getApplianceListWithProperty", "getApplianceProfile", "Lcom/hisense/connect_life/hismart/networks/request/device/model/ApplianceProfile;", "getCorrelationManuals", "typeList", "Lcom/hisense/connect_life/hismart/networks/request/device/model/DevType;", "type", "Lcom/hisense/connect_life/hismart/networks/request/device/model/InstructionBookInfo;", "getUserShareList", "Lcom/hisense/connect_life/hismart/networks/request/device/model/UserShareResult;", "otaCheckWifiDeviceVersion", "wifiIds", "Lcom/hisense/connect_life/hismart/networks/request/device/model/UpgradeInfo;", "otaConfirmUpgrade", "queryApplianceProfile", "auid", "heidi", "queryDeviceOnline", "devices", "Lcom/hisense/connect_life/hismart/networks/request/device/model/SimpleDeviceBean;", "Lcom/hisense/connect_life/hismart/networks/request/device/model/DeviceStatusBean;", "sendCommand", "deviceid", "wifiid", "properties", "", "shareDevices", "devId", "userBox", "Lcom/hisense/connect_life/hismart/networks/request/HiResult;", "Lcom/hisense/connect_life/hismart/networks/request/HiResponse;", "error", "unbindAppliance", "updateApplianceProfile", "auId", "purchaseDate", "warrantyEndDate", "applianceMedia", "updateDeviceCustomInfo", "updateFile", "uploadFile", "Ljava/io/File;", "fileType", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: IDeviceService.kt */
public interface IDeviceService {
    @NotNull
    C9207b bindAppliance(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull Function1<? super BindDeviceSuccessData, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b cancelShare(@NotNull List<Integer> list, @NotNull Function1<? super Boolean, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b getApplianceList(@NotNull Function1<? super List<DeviceInfo>, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b getApplianceListWithProperty(@NotNull Function1<? super List<DeviceInfo>, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b getApplianceProfile(@NotNull String str, @NotNull String str2, @NotNull Function1<? super ApplianceProfile, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b getCorrelationManuals(@NotNull List<DevType> list, int i, @NotNull Function1<? super List<InstructionBookInfo>, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b getUserShareList(@NotNull Function1<? super UserShareResult, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b otaCheckWifiDeviceVersion(@NotNull List<String> list, @NotNull Function1<? super List<UpgradeInfo>, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b otaConfirmUpgrade(@NotNull String str, @NotNull Function1<? super Boolean, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b queryApplianceProfile(@NotNull String str, @NotNull String str2, @NotNull Function1<? super ApplianceProfile, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b queryDeviceOnline(@NotNull List<SimpleDeviceBean> list, @NotNull Function1<? super List<DeviceStatusBean>, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b sendCommand(@NotNull String str, @NotNull String str2, @NotNull Map<String, String> map, @NotNull Function1<? super Boolean, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b shareDevices(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Function1<? super HiResult<HiResponse>, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b unbindAppliance(@NotNull String str, @NotNull String str2, @NotNull Function1<? super Boolean, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b updateApplianceProfile(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull Function1<? super HiResult<HiResponse>, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b updateDeviceCustomInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Function1<? super Boolean, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b updateFile(@NotNull String str, @NotNull String str2, @NotNull File file, @NotNull String str3, @NotNull Function1<? super Boolean, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);
}
