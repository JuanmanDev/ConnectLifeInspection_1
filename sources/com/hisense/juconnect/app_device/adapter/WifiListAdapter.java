package com.hisense.juconnect.app_device.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.listener.IItemCallback;
import com.hisense.connect_life.core.utils.Holder;
import com.hisense.juconnect.app_device.R$id;
import com.hisense.juconnect.app_device.R$layout;
import com.hisense.juconnect.app_device.R$string;
import com.hisense.juconnect.app_socket.utils.LogUtils;
import com.juconnect.connectlife.model.WifiInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0010H\u0016J\u0010\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0002J\u0014\u0010\u001a\u001a\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\fJ\u000e\u0010\u001b\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000eR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/adapter/WifiListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/hisense/connect_life/core/utils/Holder;", "mContext", "Landroid/content/Context;", "dataList", "", "Lcom/juconnect/connectlife/model/WifiInfo;", "(Landroid/content/Context;Ljava/util/List;)V", "getDataList", "()Ljava/util/List;", "iItemCallback", "Lcom/hisense/connect_life/core/listener/IItemCallback;", "onItemClickListener", "Lcom/hisense/juconnect/app_device/adapter/WifiListAdapter$OnItemClickListener;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setFirmWareDetailShowOrHide", "setIItemCallback", "setOnItemClickListener", "OnItemClickListener", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WifiListAdapter.kt */
public final class WifiListAdapter extends RecyclerView.Adapter<Holder> {
    @NotNull
    public final List<WifiInfo> dataList;
    @Nullable
    public IItemCallback<? super WifiInfo> iItemCallback;
    @NotNull
    public final Context mContext;
    @Nullable
    public OnItemClickListener onItemClickListener;

    @Metadata(mo47990d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&¨\u0006\t"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/adapter/WifiListAdapter$OnItemClickListener;", "", "onItemClick", "", "position", "", "ssid", "", "bssid", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: WifiListAdapter.kt */
    public interface OnItemClickListener {
        void onItemClick(int i, @NotNull String str, @NotNull String str2);
    }

    public WifiListAdapter(@NotNull Context context, @NotNull List<WifiInfo> list) {
        Intrinsics.checkNotNullParameter(context, "mContext");
        Intrinsics.checkNotNullParameter(list, "dataList");
        this.mContext = context;
        this.dataList = list;
    }

    private final void setFirmWareDetailShowOrHide(Holder holder) {
        if (Intrinsics.areEqual((Object) ((TextView) holder.itemView.findViewById(R$id.tv_firmware_detail_title)).getText(), (Object) this.mContext.getString(R$string.firmware_details))) {
            ((TextView) holder.itemView.findViewById(R$id.tv_firmware_detail_title)).setText(this.mContext.getString(R$string.firmware_hide_details));
            TextView textView = (TextView) holder.itemView.findViewById(R$id.tv_firmware_detail_content);
            Intrinsics.checkNotNullExpressionValue(textView, "holder.itemView.tv_firmware_detail_content");
            textView.setVisibility(0);
            return;
        }
        TextView textView2 = (TextView) holder.itemView.findViewById(R$id.tv_firmware_detail_content);
        Intrinsics.checkNotNullExpressionValue(textView2, "holder.itemView.tv_firmware_detail_content");
        textView2.setVisibility(8);
        ((TextView) holder.itemView.findViewById(R$id.tv_firmware_detail_title)).setText(this.mContext.getString(R$string.firmware_details));
    }

    @NotNull
    public final List<WifiInfo> getDataList() {
        return this.dataList;
    }

    public int getItemCount() {
        return this.dataList.size();
    }

    public final void setIItemCallback(@NotNull IItemCallback<? super WifiInfo> iItemCallback2) {
        Intrinsics.checkNotNullParameter(iItemCallback2, "iItemCallback");
        this.iItemCallback = iItemCallback2;
    }

    public final void setOnItemClickListener(@NotNull OnItemClickListener onItemClickListener2) {
        Intrinsics.checkNotNullParameter(onItemClickListener2, "onItemClickListener");
        this.onItemClickListener = onItemClickListener2;
    }

    public void onBindViewHolder(@NotNull Holder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        LogUtils.Companion.debug("onBindViewHolder:", "dataList[position]");
        ((TextView) holder.itemView.findViewById(R$id.tv_wifi_list)).setText(this.dataList.get(i).getSsid());
        View view = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "holder.itemView");
        JuConnectExtKt.singleClickListener(view, new WifiListAdapter$onBindViewHolder$1(this, i));
    }

    @NotNull
    public Holder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        return new Holder(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.wifi_list_layout, viewGroup, false));
    }
}
