package com.hisense.juconnect.app_device.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.listener.IItemIndexedCallback;
import com.hisense.connect_life.core.utils.Holder;
import com.hisense.connect_life.hismart.networks.request.device.DeviceCache;
import com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo;
import com.hisense.juconnect.app_device.R$id;
import com.hisense.juconnect.app_device.R$layout;
import com.juconnect.connectlife.model.TicketBean;
import java.text.SimpleDateFormat;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\fH\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fH\u0016J\u0014\u0010\u0018\u001a\u00020\u00112\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/adapter/TicketsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/hisense/connect_life/core/utils/Holder;", "data", "", "Lcom/juconnect/connectlife/model/TicketBean;", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "itemIndexedCallback", "Lcom/hisense/connect_life/core/listener/IItemIndexedCallback;", "getItemCount", "", "getRepairDate", "", "dateString", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setItemIndexedCallback", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: TicketsAdapter.kt */
public final class TicketsAdapter extends RecyclerView.Adapter<Holder> {
    @NotNull
    public final List<TicketBean> data;
    @Nullable
    public IItemIndexedCallback<? super TicketBean> itemIndexedCallback;

    public TicketsAdapter(@NotNull List<TicketBean> list) {
        Intrinsics.checkNotNullParameter(list, "data");
        this.data = list;
    }

    private final String getRepairDate(String str) {
        String format = new SimpleDateFormat("dd/MM, HH:mm").format(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSSSSS").parse(str));
        Intrinsics.checkNotNullExpressionValue(format, "format2.format(date)");
        return format;
    }

    @NotNull
    public final List<TicketBean> getData() {
        return this.data;
    }

    public int getItemCount() {
        return this.data.size();
    }

    public final void setItemIndexedCallback(@NotNull IItemIndexedCallback<? super TicketBean> iItemIndexedCallback) {
        Intrinsics.checkNotNullParameter(iItemIndexedCallback, "itemIndexedCallback");
        this.itemIndexedCallback = iItemIndexedCallback;
    }

    public void onBindViewHolder(@NotNull Holder holder, int i) {
        String str;
        Intrinsics.checkNotNullParameter(holder, "holder");
        ((TextView) holder.itemView.findViewById(R$id.item_ticket_title)).setText(this.data.get(i).getError().getTitle());
        DeviceCache instance = DeviceCache.Companion.getInstance();
        String auid = this.data.get(i).getProduct().getAuid();
        Intrinsics.checkNotNull(auid);
        if (instance.getDevice(auid) == null) {
            ((TextView) holder.itemView.findViewById(R$id.item_ticket_name)).setText(this.data.get(i).getProduct().getAuid());
        } else {
            TextView textView = (TextView) holder.itemView.findViewById(R$id.item_ticket_name);
            DeviceCache instance2 = DeviceCache.Companion.getInstance();
            String auid2 = this.data.get(i).getProduct().getAuid();
            Intrinsics.checkNotNull(auid2);
            DeviceInfo device = instance2.getDevice(auid2);
            textView.setText(device == null ? null : device.getDeviceNickName());
        }
        TextView textView2 = (TextView) holder.itemView.findViewById(R$id.item_ticket_status);
        if (Intrinsics.areEqual((Object) this.data.get(i).getStatus(), (Object) KeyConst.CLAIM_FINISHED)) {
            String dateOfRepair = this.data.get(i).getDateOfRepair();
            Intrinsics.checkNotNull(dateOfRepair);
            str = getRepairDate(dateOfRepair);
        } else {
            str = "PENDING";
        }
        textView2.setText(str);
        View view = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "holder.itemView");
        JuConnectExtKt.singleClickListener(view, new TicketsAdapter$onBindViewHolder$1(this, i));
    }

    @NotNull
    public Holder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        return new Holder(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.item_ticket, viewGroup, false));
    }
}
