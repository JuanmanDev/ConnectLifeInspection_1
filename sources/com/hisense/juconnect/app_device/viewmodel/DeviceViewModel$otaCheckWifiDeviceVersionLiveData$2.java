package com.hisense.juconnect.app_device.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.hisense.connect_life.hismart.networks.request.device.model.UpgradeInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00020\u0001H\n¢\u0006\u0002\b\u0006"}, mo47991d2 = {"<anonymous>", "Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Pair;", "", "", "Lcom/hisense/connect_life/hismart/networks/request/device/model/UpgradeInfo;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: DeviceViewModel.kt */
public final class DeviceViewModel$otaCheckWifiDeviceVersionLiveData$2 extends Lambda implements Function0<MutableLiveData<Pair<? extends Boolean, ? extends List<? extends UpgradeInfo>>>> {
    public static final DeviceViewModel$otaCheckWifiDeviceVersionLiveData$2 INSTANCE = new DeviceViewModel$otaCheckWifiDeviceVersionLiveData$2();

    public DeviceViewModel$otaCheckWifiDeviceVersionLiveData$2() {
        super(0);
    }

    @NotNull
    public final MutableLiveData<Pair<Boolean, List<UpgradeInfo>>> invoke() {
        return new MutableLiveData<>();
    }
}
