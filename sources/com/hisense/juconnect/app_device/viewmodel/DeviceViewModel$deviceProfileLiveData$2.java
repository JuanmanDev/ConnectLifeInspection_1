package com.hisense.juconnect.app_device.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.hisense.connect_life.hismart.networks.request.device.model.DevicePropertyBean;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/hisense/connect_life/hismart/networks/request/device/model/DevicePropertyBean;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: DeviceViewModel.kt */
public final class DeviceViewModel$deviceProfileLiveData$2 extends Lambda implements Function0<MutableLiveData<List<? extends DevicePropertyBean>>> {
    public static final DeviceViewModel$deviceProfileLiveData$2 INSTANCE = new DeviceViewModel$deviceProfileLiveData$2();

    public DeviceViewModel$deviceProfileLiveData$2() {
        super(0);
    }

    @NotNull
    public final MutableLiveData<List<DevicePropertyBean>> invoke() {
        return new MutableLiveData<>();
    }
}
