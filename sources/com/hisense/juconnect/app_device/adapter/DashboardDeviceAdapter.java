package com.hisense.juconnect.app_device.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.SPManagerKt;
import com.hisense.connect_life.core.utils.Holder;
import com.hisense.connect_life.core.widget.IconFontView;
import com.hisense.connect_life.hismart.networks.request.device.DeviceCache;
import com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo;
import com.hisense.connect_life.hismart.networks.request.device.model.OnlineStatus;
import com.hisense.juconnect.app_device.R$id;
import com.hisense.juconnect.app_device.R$layout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016J\u000e\u0010\u0017\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0018\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000eH\u0002J \u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000eH\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/adapter/DashboardDeviceAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/hisense/connect_life/core/utils/Holder;", "data", "", "Lcom/hisense/connect_life/hismart/networks/request/device/model/DeviceInfo;", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "onItemClickListener", "Lcom/hisense/juconnect/app_device/adapter/DashboardDeviceAdapter$OnItemClickListener;", "temperatureUnit", "", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnItemClickListener", "setOnlineOrOfflineShow", "isOffline", "", "setTemperatureUnit", "setZoneShow", "auid", "OnItemClickListener", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: DashboardDeviceAdapter.kt */
public final class DashboardDeviceAdapter extends RecyclerView.Adapter<Holder> {
    @NotNull
    public final List<DeviceInfo> data;
    @Nullable
    public OnItemClickListener onItemClickListener;
    @NotNull
    public String temperatureUnit = "0";

    @Metadata(mo47990d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/adapter/DashboardDeviceAdapter$OnItemClickListener;", "", "onItemClick", "", "position", "", "data", "Lcom/hisense/connect_life/hismart/networks/request/device/model/DeviceInfo;", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: DashboardDeviceAdapter.kt */
    public interface OnItemClickListener {
        void onItemClick(int i, @NotNull DeviceInfo deviceInfo);
    }

    public DashboardDeviceAdapter(@NotNull List<DeviceInfo> list) {
        Intrinsics.checkNotNullParameter(list, "data");
        this.data = list;
    }

    private final void setOnlineOrOfflineShow(Holder holder, boolean z) {
        TextView textView = (TextView) holder.itemView.findViewById(R$id.error_text);
        Intrinsics.checkNotNullExpressionValue(textView, "holder.itemView.error_text");
        int i = 0;
        textView.setVisibility(z ? 0 : 8);
        IconFontView iconFontView = (IconFontView) holder.itemView.findViewById(R$id.error_icon);
        Intrinsics.checkNotNullExpressionValue(iconFontView, "holder.itemView.error_icon");
        if (!z) {
            i = 8;
        }
        iconFontView.setVisibility(i);
    }

    private final void setTemperatureUnit(Holder holder, int i) {
        String str;
        JsonElement jsonElement;
        JsonObject properties = this.data.get(i).getProperties();
        if (properties == null || (jsonElement = properties.get("TemperatureUnit")) == null || (str = jsonElement.getAsString()) == null) {
            str = "0";
        }
        if (Intrinsics.areEqual((Object) str, (Object) "0")) {
            ((TextView) holder.itemView.findViewById(R$id.temperature_unit_a)).setText("℃");
            ((TextView) holder.itemView.findViewById(R$id.temperature_unit_b)).setText("℃");
            ((TextView) holder.itemView.findViewById(R$id.temperature_unit_c)).setText("℃");
            return;
        }
        ((TextView) holder.itemView.findViewById(R$id.temperature_unit_a)).setText("℉");
        ((TextView) holder.itemView.findViewById(R$id.temperature_unit_b)).setText("℉");
        ((TextView) holder.itemView.findViewById(R$id.temperature_unit_c)).setText("℉");
    }

    private final void setZoneShow(String str, Holder holder, int i) {
        if (DeviceCache.Companion.getInstance().isDeviceType(str) == DeviceCache.Companion.getInstance().getSingleZoneDevice()) {
            ((TextView) holder.itemView.findViewById(R$id.item_temperature_tv_a)).setVisibility(0);
            ((TextView) holder.itemView.findViewById(R$id.temperature_unit_a)).setVisibility(0);
            ((TextView) holder.itemView.findViewById(R$id.item_temperature_tv_b)).setVisibility(4);
            ((TextView) holder.itemView.findViewById(R$id.item_temperature_tv_c)).setVisibility(4);
            ((TextView) holder.itemView.findViewById(R$id.temperature_unit_b)).setVisibility(4);
            ((TextView) holder.itemView.findViewById(R$id.temperature_unit_c)).setVisibility(4);
        } else if (DeviceCache.Companion.getInstance().isDeviceType(str) == DeviceCache.Companion.getInstance().getBattleSingleZoneDevice()) {
            ((TextView) holder.itemView.findViewById(R$id.item_temperature_tv_a)).setVisibility(0);
            ((TextView) holder.itemView.findViewById(R$id.temperature_unit_a)).setVisibility(0);
            ((TextView) holder.itemView.findViewById(R$id.item_temperature_tv_b)).setVisibility(4);
            ((TextView) holder.itemView.findViewById(R$id.item_temperature_tv_c)).setVisibility(4);
            ((TextView) holder.itemView.findViewById(R$id.temperature_unit_b)).setVisibility(4);
            ((TextView) holder.itemView.findViewById(R$id.temperature_unit_c)).setVisibility(4);
        } else if (DeviceCache.Companion.getInstance().isDeviceType(str) == DeviceCache.Companion.getInstance().getBattleTwoZoneDevice()) {
            ((TextView) holder.itemView.findViewById(R$id.item_temperature_tv_a)).setVisibility(0);
            ((TextView) holder.itemView.findViewById(R$id.temperature_unit_a)).setVisibility(0);
            ((TextView) holder.itemView.findViewById(R$id.item_temperature_tv_b)).setVisibility(0);
            ((TextView) holder.itemView.findViewById(R$id.item_temperature_tv_c)).setVisibility(4);
            ((TextView) holder.itemView.findViewById(R$id.temperature_unit_b)).setVisibility(0);
            ((TextView) holder.itemView.findViewById(R$id.temperature_unit_c)).setVisibility(4);
        } else if (DeviceCache.Companion.getInstance().isDeviceType(str) == DeviceCache.Companion.getInstance().getBattleNull()) {
            ((TextView) holder.itemView.findViewById(R$id.item_temperature_tv_a)).setVisibility(4);
            ((TextView) holder.itemView.findViewById(R$id.item_temperature_tv_b)).setVisibility(4);
            ((TextView) holder.itemView.findViewById(R$id.item_temperature_tv_c)).setVisibility(4);
            ((TextView) holder.itemView.findViewById(R$id.temperature_unit_a)).setVisibility(4);
            ((TextView) holder.itemView.findViewById(R$id.temperature_unit_b)).setVisibility(4);
            ((TextView) holder.itemView.findViewById(R$id.temperature_unit_c)).setVisibility(4);
        } else {
            ((TextView) holder.itemView.findViewById(R$id.item_temperature_tv_a)).setVisibility(0);
            ((TextView) holder.itemView.findViewById(R$id.temperature_unit_a)).setVisibility(0);
            ((TextView) holder.itemView.findViewById(R$id.item_temperature_tv_b)).setVisibility(0);
            ((TextView) holder.itemView.findViewById(R$id.item_temperature_tv_c)).setVisibility(0);
            ((TextView) holder.itemView.findViewById(R$id.temperature_unit_b)).setVisibility(0);
            ((TextView) holder.itemView.findViewById(R$id.temperature_unit_c)).setVisibility(0);
        }
    }

    @NotNull
    public final List<DeviceInfo> getData() {
        return this.data;
    }

    public int getItemCount() {
        return this.data.size();
    }

    public final void setOnItemClickListener(@NotNull OnItemClickListener onItemClickListener2) {
        Intrinsics.checkNotNullParameter(onItemClickListener2, "onItemClickListener");
        this.onItemClickListener = onItemClickListener2;
    }

    public void onBindViewHolder(@NotNull Holder holder, int i) {
        String str;
        String str2;
        String str3;
        String asString;
        String asString2;
        Intrinsics.checkNotNullParameter(holder, "holder");
        boolean z = true;
        if (i == this.data.size() - 1) {
            ((RelativeLayout) holder.itemView.findViewById(R$id.dashboard_show_device)).setVisibility(8);
            ((LinearLayout) holder.itemView.findViewById(R$id.dashboard_add_device)).setVisibility(0);
        } else {
            ((RelativeLayout) holder.itemView.findViewById(R$id.dashboard_show_device)).setVisibility(0);
            ((LinearLayout) holder.itemView.findViewById(R$id.dashboard_add_device)).setVisibility(8);
            String deviceNickName = this.data.get(i).getDeviceNickName();
            if (deviceNickName == null) {
                deviceNickName = "";
            }
            setTemperatureUnit(holder, i);
            setZoneShow(this.data.get(i).getDeviceId(), holder, i);
            if (OnlineStatus.OFFLINE != this.data.get(i).getOnlineStatus()) {
                z = false;
            }
            setOnlineOrOfflineShow(holder, z);
            String str4 = "--";
            if (this.data.get(i).getProperties() != null) {
                JsonObject properties = this.data.get(i).getProperties();
                Intrinsics.checkNotNull(properties);
                if (properties.size() > 0) {
                    JsonObject properties2 = this.data.get(i).getProperties();
                    Intrinsics.checkNotNull(properties2);
                    DeviceInfo deviceInfo = getData().get(i);
                    Intrinsics.checkNotNull(deviceInfo);
                    String deviceId = deviceInfo.getDeviceId();
                    JsonElement jsonElement = properties2.get("Zone2Use");
                    String str5 = "0";
                    if (jsonElement == null || (str = jsonElement.getAsString()) == null) {
                        str = str5;
                    }
                    SPManagerKt.setZone2Use(deviceId, str);
                    JsonElement jsonElement2 = properties2.get("TemperatureUnit");
                    if (!(jsonElement2 == null || (asString2 = jsonElement2.getAsString()) == null)) {
                        str5 = asString2;
                    }
                    this.temperatureUnit = str5;
                    JsonElement jsonElement3 = properties2.get("Zone1SetTemperature");
                    if (jsonElement3 == null || (str2 = jsonElement3.getAsString()) == null) {
                        str2 = str4;
                    }
                    JsonElement jsonElement4 = properties2.get("Zone2SetTemperature");
                    if (jsonElement4 == null || (str3 = jsonElement4.getAsString()) == null) {
                        str3 = str4;
                    }
                    JsonElement jsonElement5 = properties2.get("Zone3SetTemperature");
                    if (!(jsonElement5 == null || (asString = jsonElement5.getAsString()) == null)) {
                        str4 = asString;
                    }
                    ((TextView) holder.itemView.findViewById(R$id.item_temperature_tv_a)).setText(str2);
                    ((TextView) holder.itemView.findViewById(R$id.item_temperature_tv_b)).setText(str3);
                    ((TextView) holder.itemView.findViewById(R$id.item_temperature_tv_c)).setText(str4);
                    ((TextView) holder.itemView.findViewById(R$id.wine_cooler_name_text)).setText(deviceNickName);
                }
            }
            ((TextView) holder.itemView.findViewById(R$id.item_temperature_tv_a)).setText(str4);
            ((TextView) holder.itemView.findViewById(R$id.item_temperature_tv_b)).setText(str4);
            ((TextView) holder.itemView.findViewById(R$id.item_temperature_tv_c)).setText(str4);
            ((TextView) holder.itemView.findViewById(R$id.temperature_unit_a)).setText("");
            ((TextView) holder.itemView.findViewById(R$id.temperature_unit_b)).setText("");
            ((TextView) holder.itemView.findViewById(R$id.temperature_unit_c)).setText("");
            ((TextView) holder.itemView.findViewById(R$id.wine_cooler_name_text)).setText(deviceNickName);
        }
        View view = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "holder.itemView");
        JuConnectExtKt.singleClickListener(view, new DashboardDeviceAdapter$onBindViewHolder$2(this, i));
    }

    @NotNull
    public Holder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        return new Holder(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.item_dashboard_wine_cooler2, viewGroup, false));
    }
}
