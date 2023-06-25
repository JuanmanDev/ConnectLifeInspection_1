package com.hisense.juconnect.app_device.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.utils.Holder;
import com.hisense.juconnect.app_device.R$id;
import com.hisense.juconnect.app_device.R$layout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0019\u001aB\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000eH\u0016J\u0016\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/adapter/AplianceManagementAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/hisense/connect_life/core/utils/Holder;", "data", "", "", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "footerClickListener", "Lcom/hisense/juconnect/app_device/adapter/AplianceManagementAdapter$FooterClickListener;", "onItemClickListener", "Lcom/hisense/juconnect/app_device/adapter/AplianceManagementAdapter$OnItemClickListener;", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnItemClickListener", "FooterClickListener", "OnItemClickListener", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: AplianceManagementAdapter.kt */
public final class AplianceManagementAdapter extends RecyclerView.Adapter<Holder> {
    @NotNull
    public final List<String> data;
    @Nullable
    public FooterClickListener footerClickListener;
    @Nullable
    public OnItemClickListener onItemClickListener;

    @Metadata(mo47990d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/adapter/AplianceManagementAdapter$FooterClickListener;", "", "footerClickListener", "", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: AplianceManagementAdapter.kt */
    public interface FooterClickListener {
        void footerClickListener();
    }

    @Metadata(mo47990d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/adapter/AplianceManagementAdapter$OnItemClickListener;", "", "onItemClick", "", "position", "", "data", "", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: AplianceManagementAdapter.kt */
    public interface OnItemClickListener {
        void onItemClick(int i, @NotNull String str);
    }

    public AplianceManagementAdapter(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "data");
        this.data = list;
    }

    @NotNull
    public final List<String> getData() {
        return this.data;
    }

    public int getItemCount() {
        return this.data.size() + 2;
    }

    public int getItemViewType(int i) {
        if (i == 0) {
            return 10010;
        }
        if (i + 1 == this.data.size() + 2) {
            return 10086;
        }
        return super.getItemViewType(i);
    }

    public final void setOnItemClickListener(@NotNull OnItemClickListener onItemClickListener2, @NotNull FooterClickListener footerClickListener2) {
        Intrinsics.checkNotNullParameter(onItemClickListener2, "onItemClickListener");
        Intrinsics.checkNotNullParameter(footerClickListener2, "footerClickListener");
        this.onItemClickListener = onItemClickListener2;
        this.footerClickListener = footerClickListener2;
    }

    public void onBindViewHolder(@NotNull Holder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (i > 0 && i <= this.data.size()) {
            ((TextView) holder.itemView.findViewById(R$id.item_appliance_manager_device_name)).setText(this.data.get(i - 1));
        }
        View view = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "holder.itemView");
        JuConnectExtKt.singleClickListener(view, new AplianceManagementAdapter$onBindViewHolder$1(i, this));
    }

    @NotNull
    public Holder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        if (i == 10010) {
            return new Holder(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.item_appliance_manager_head, viewGroup, false));
        }
        if (i != 10086) {
            return new Holder(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.item_appliance_manager, viewGroup, false));
        }
        return new Holder(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.add_new_appliance, viewGroup, false));
    }
}
