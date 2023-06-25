package com.hisense.juconnect.app_device.activity;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.hisense.juconnect.app_device.R$id;
import com.hisense.juconnect.app_device.adapter.WifiListAdapter;
import com.hisense.juconnect.app_socket.utils.LogUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t"}, mo47991d2 = {"com/hisense/juconnect/app_device/activity/SingleZoneApplianceIdentificationActivity$setListeners$4", "Lcom/hisense/juconnect/app_device/adapter/WifiListAdapter$OnItemClickListener;", "onItemClick", "", "position", "", "ssid", "", "bssid", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: SingleZoneApplianceIdentificationActivity.kt */
public final class SingleZoneApplianceIdentificationActivity$setListeners$4 implements WifiListAdapter.OnItemClickListener {
    public final /* synthetic */ SingleZoneApplianceIdentificationActivity this$0;

    public SingleZoneApplianceIdentificationActivity$setListeners$4(SingleZoneApplianceIdentificationActivity singleZoneApplianceIdentificationActivity) {
        this.this$0 = singleZoneApplianceIdentificationActivity;
    }

    public void onItemClick(int i, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "ssid");
        Intrinsics.checkNotNullParameter(str2, "bssid");
        ((RecyclerView) this.this$0._$_findCachedViewById(R$id.lv_wifi_ssid)).setVisibility(8);
        LogUtils.Companion.debug("data.ssid:", str);
        ((TextView) this.this$0._$_findCachedViewById(R$id.et_connection_setup_wifi_name)).setText(str);
        this.this$0.myBssid = str2;
    }
}
