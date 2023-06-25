package com.hisense.juconnect.app_device.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.hisense.connect_life.app_account.util.FileSizeUtil;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.listener.IItemCallback;
import com.hisense.connect_life.core.utils.Holder;
import com.hisense.connect_life.hismart.networks.request.device.DeviceCache;
import com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo;
import com.hisense.connect_life.hismart.networks.request.device.model.UpgradeInfo;
import com.hisense.juconnect.app_device.R$color;
import com.hisense.juconnect.app_device.R$drawable;
import com.hisense.juconnect.app_device.R$id;
import com.hisense.juconnect.app_device.R$layout;
import com.hisense.juconnect.app_device.R$string;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fH\u0016J\u0018\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000fH\u0002J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0002J\u0014\u0010\u001a\u001a\u00020\u00112\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u0018\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000fH\u0002R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/adapter/FirmwareUpdateAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/hisense/connect_life/core/utils/Holder;", "mContext", "Landroid/content/Context;", "dataList", "", "Lcom/hisense/connect_life/hismart/networks/request/device/model/UpgradeInfo;", "(Landroid/content/Context;Ljava/util/List;)V", "getDataList", "()Ljava/util/List;", "iItemCallback", "Lcom/hisense/connect_life/core/listener/IItemCallback;", "", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setDeviceNickNameByWifiId", "setFirmWareDetailShowOrHide", "setIItemCallback", "setUpdateBtnShow", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: FirmwareUpdateAdapter.kt */
public final class FirmwareUpdateAdapter extends RecyclerView.Adapter<Holder> {
    @NotNull
    public final List<UpgradeInfo> dataList;
    @Nullable
    public IItemCallback<? super String> iItemCallback;
    @NotNull
    public final Context mContext;

    public FirmwareUpdateAdapter(@NotNull Context context, @NotNull List<UpgradeInfo> list) {
        Intrinsics.checkNotNullParameter(context, "mContext");
        Intrinsics.checkNotNullParameter(list, "dataList");
        this.mContext = context;
        this.dataList = list;
    }

    private final void setDeviceNickNameByWifiId(Holder holder, int i) {
        String wifiId = this.dataList.get(i).getWifiId();
        if (wifiId != null) {
            DeviceInfo deviceByWifiId = DeviceCache.Companion.getInstance().getDeviceByWifiId(wifiId);
            String str = null;
            if (TextUtils.isEmpty(deviceByWifiId == null ? null : deviceByWifiId.getDeviceNickName())) {
                ((TextView) holder.itemView.findViewById(R$id.rv_appliance_name)).setText(wifiId);
                return;
            }
            TextView textView = (TextView) holder.itemView.findViewById(R$id.rv_appliance_name);
            DeviceInfo deviceByWifiId2 = DeviceCache.Companion.getInstance().getDeviceByWifiId(wifiId);
            if (deviceByWifiId2 != null) {
                str = deviceByWifiId2.getDeviceNickName();
            }
            textView.setText(str);
        }
    }

    /* access modifiers changed from: private */
    public final void setFirmWareDetailShowOrHide(Holder holder) {
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

    private final void setUpdateBtnShow(Holder holder, int i) {
        if (this.dataList.get(i).getOnlineStatus()) {
            ((Button) holder.itemView.findViewById(R$id.bt_update)).setBackgroundResource(R$drawable.button_next_select_bg);
            ((Button) holder.itemView.findViewById(R$id.bt_update)).setTextColor(this.mContext.getColor(R$color.colorWhite));
            ((Button) holder.itemView.findViewById(R$id.bt_update)).setEnabled(true);
            return;
        }
        ((Button) holder.itemView.findViewById(R$id.bt_update)).setBackgroundResource(R$drawable.button_next_unselect_bg);
        ((Button) holder.itemView.findViewById(R$id.bt_update)).setTextColor(this.mContext.getColor(R$color.colorText_86));
        ((Button) holder.itemView.findViewById(R$id.bt_update)).setEnabled(false);
    }

    @NotNull
    public final List<UpgradeInfo> getDataList() {
        return this.dataList;
    }

    public int getItemCount() {
        return this.dataList.size();
    }

    public final void setIItemCallback(@NotNull IItemCallback<? super String> iItemCallback2) {
        Intrinsics.checkNotNullParameter(iItemCallback2, "iItemCallback");
        this.iItemCallback = iItemCallback2;
    }

    public void onBindViewHolder(@NotNull Holder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ((TextView) holder.itemView.findViewById(R$id.tv_firmware_detail_title)).getPaint().setFlags(8);
        ((TextView) holder.itemView.findViewById(R$id.tv_firmware_detail_title)).getPaint().setAntiAlias(true);
        ((TextView) holder.itemView.findViewById(R$id.tv_firmware_version)).setText(this.mContext.getString(R$string.version) + ": " + this.dataList.get(i).getLatestVersion() + " - " + FileSizeUtil.Companion.FormetFileSize((long) this.dataList.get(i).getFileSize(), FileSizeUtil.Companion.getSIZETYPE_MB()) + "MB");
        setDeviceNickNameByWifiId(holder, i);
        ((TextView) holder.itemView.findViewById(R$id.tv_firmware_detail_content)).setText(this.dataList.get(i).getVersionDetail());
        setUpdateBtnShow(holder, i);
        Button button = (Button) holder.itemView.findViewById(R$id.bt_update);
        Intrinsics.checkNotNullExpressionValue(button, "holder.itemView.bt_update");
        JuConnectExtKt.singleClickListener(button, new FirmwareUpdateAdapter$onBindViewHolder$1(holder, this, i));
        TextView textView = (TextView) holder.itemView.findViewById(R$id.tv_firmware_detail_title);
        Intrinsics.checkNotNullExpressionValue(textView, "holder.itemView.tv_firmware_detail_title");
        JuConnectExtKt.singleClickListener(textView, new FirmwareUpdateAdapter$onBindViewHolder$2(this, holder));
    }

    @NotNull
    public Holder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        return new Holder(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.item_firmware_update_layout, viewGroup, false));
    }
}
