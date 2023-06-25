package com.hisense.connect_life.hismart.networks.request.device;

import com.hisense.connect_life.hismart.networks.request.HiResponse;
import com.hisense.connect_life.hismart.networks.request.HiResult;
import com.hisense.connect_life.hismart.networks.request.device.model.DevicePropertyResult;
import com.hisense.connect_life.hismart.networks.request.device.model.DeviceStatusResult;
import kotlin.Metadata;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import p553f.p594c.C9185c;
import p692o.p698x.C9945a;
import p692o.p698x.C9958n;

@Metadata(mo47990d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J\u001e\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J\u001e\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'¨\u0006\f"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/device/DeviceControlApi;", "", "queryDeviceOnline", "Lio/reactivex/Flowable;", "Lcom/hisense/connect_life/hismart/networks/request/HiResult;", "Lcom/hisense/connect_life/hismart/networks/request/device/model/DeviceStatusResult;", "profile", "Lokhttp3/RequestBody;", "queryDeviceProperty", "Lcom/hisense/connect_life/hismart/networks/request/device/model/DevicePropertyResult;", "sendCommand", "Lcom/hisense/connect_life/hismart/networks/request/HiResponse;", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: DeviceControlApi.kt */
public interface DeviceControlApi {
    @NotNull
    @C9958n("device/online/get")
    C9185c<HiResult<DeviceStatusResult>> queryDeviceOnline(@NotNull @C9945a RequestBody requestBody);

    @NotNull
    @C9958n("device/property/get")
    C9185c<HiResult<DevicePropertyResult>> queryDeviceProperty(@NotNull @C9945a RequestBody requestBody);

    @NotNull
    @C9958n("device/property/set")
    C9185c<HiResult<HiResponse>> sendCommand(@NotNull @C9945a RequestBody requestBody);
}
