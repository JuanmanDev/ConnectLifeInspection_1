package com.hisense.juconnect.app_device.fragment;

import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.Paths;
import com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo;
import com.hisense.juconnect.app_device.adapter.DashboardDeviceAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, mo47991d2 = {"com/hisense/juconnect/app_device/fragment/ApplianceListFragment$setListeners$2", "Lcom/hisense/juconnect/app_device/adapter/DashboardDeviceAdapter$OnItemClickListener;", "onItemClick", "", "position", "", "data", "Lcom/hisense/connect_life/hismart/networks/request/device/model/DeviceInfo;", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ApplianceListFragment.kt */
public final class ApplianceListFragment$setListeners$2 implements DashboardDeviceAdapter.OnItemClickListener {
    public final /* synthetic */ ApplianceListFragment this$0;

    public ApplianceListFragment$setListeners$2(ApplianceListFragment applianceListFragment) {
        this.this$0 = applianceListFragment;
    }

    public void onItemClick(int i, @NotNull DeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "data");
        if (i == this.this$0.listData.size() - 1) {
            JuConnectExtKt.navigation(Paths.Device.AddApplianceFirstActivity);
        }
    }
}
