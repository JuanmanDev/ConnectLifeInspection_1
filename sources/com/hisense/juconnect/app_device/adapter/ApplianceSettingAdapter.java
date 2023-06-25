package com.hisense.juconnect.app_device.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.utils.Holder;
import com.hisense.connect_life.core.utils.LoggerUtil;
import com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo;
import com.hisense.juconnect.app_device.R$id;
import com.hisense.juconnect.app_device.R$layout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016J\u000e\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/adapter/ApplianceSettingAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/hisense/connect_life/core/utils/Holder;", "data", "", "Lcom/hisense/connect_life/hismart/networks/request/device/model/DeviceInfo;", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "onItemClickListener", "Lcom/hisense/juconnect/app_device/adapter/ApplianceSettingAdapter$OnItemClickListener;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnItemClickListener", "OnItemClickListener", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ApplianceSettingAdapter.kt */
public final class ApplianceSettingAdapter extends RecyclerView.Adapter<Holder> {
    @NotNull
    public final List<DeviceInfo> data;
    @Nullable
    public OnItemClickListener onItemClickListener;

    @Metadata(mo47990d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/adapter/ApplianceSettingAdapter$OnItemClickListener;", "", "onItemClick", "", "position", "", "data", "Lcom/hisense/connect_life/hismart/networks/request/device/model/DeviceInfo;", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: ApplianceSettingAdapter.kt */
    public interface OnItemClickListener {
        void onItemClick(int i, @NotNull DeviceInfo deviceInfo);
    }

    public ApplianceSettingAdapter(@NotNull List<DeviceInfo> list) {
        Intrinsics.checkNotNullParameter(list, "data");
        this.data = list;
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
        Intrinsics.checkNotNullParameter(holder, "holder");
        ((TextView) holder.itemView.findViewById(R$id.wine_cooler_name)).setText(this.data.get(i).getDeviceNickName());
        LoggerUtil.Companion.mo39146e(Intrinsics.stringPlus("deviceList: ", this.data.get(i).getWifiId()));
        ((TextView) holder.itemView.findViewById(R$id.wine_cooler_status)).setText(String.valueOf(this.data.get(i).getOnlineStatus()));
        View view = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "holder.itemView");
        JuConnectExtKt.singleClickListener(view, new ApplianceSettingAdapter$onBindViewHolder$1(this, i));
    }

    @NotNull
    public Holder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        return new Holder(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.item_wine_cooler, viewGroup, false));
    }
}
