package com.hisense.juconnect.app_device.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.utils.Holder;
import com.hisense.connect_life.core.widget.NovaTextView;
import com.hisense.connect_life.core.widget.OvenIconFontView;
import com.hisense.juconnect.app_device.R$id;
import com.hisense.juconnect.app_device.R$layout;
import com.hisense.juconnect.app_device.R$string;
import com.juconnect.connectlife.model.ConlManual;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0018H\u0016J\u0018\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0018H\u0016J\u000e\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\nJ\u000e\u0010#\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/adapter/ManualListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/hisense/connect_life/core/utils/Holder;", "data", "", "Lcom/juconnect/connectlife/model/ConlManual;", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "deviceName", "", "getDeviceName", "()Ljava/lang/String;", "setDeviceName", "(Ljava/lang/String;)V", "mContext", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "onItemClickListener", "Lcom/hisense/juconnect/app_device/adapter/ManualListAdapter$OnItemClickListener;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setName", "name", "setOnItemClickListener", "OnItemClickListener", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ManualListAdapter.kt */
public final class ManualListAdapter extends RecyclerView.Adapter<Holder> {
    @NotNull
    public final List<ConlManual> data;
    @Nullable
    public String deviceName;
    public Context mContext;
    @Nullable
    public OnItemClickListener onItemClickListener;

    @Metadata(mo47990d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/adapter/ManualListAdapter$OnItemClickListener;", "", "onItemClick", "", "position", "", "data", "Lcom/juconnect/connectlife/model/ConlManual;", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: ManualListAdapter.kt */
    public interface OnItemClickListener {
        void onItemClick(int i, @NotNull ConlManual conlManual);
    }

    public ManualListAdapter(@NotNull List<ConlManual> list) {
        Intrinsics.checkNotNullParameter(list, "data");
        this.data = list;
    }

    @NotNull
    public final List<ConlManual> getData() {
        return this.data;
    }

    @Nullable
    public final String getDeviceName() {
        return this.deviceName;
    }

    public int getItemCount() {
        return this.data.size();
    }

    @NotNull
    public final Context getMContext() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContext");
        return null;
    }

    public final void setDeviceName(@Nullable String str) {
        this.deviceName = str;
    }

    public final void setMContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        this.deviceName = str;
        notifyDataSetChanged();
    }

    public final void setOnItemClickListener(@NotNull OnItemClickListener onItemClickListener2) {
        Intrinsics.checkNotNullParameter(onItemClickListener2, "onItemClickListener");
        this.onItemClickListener = onItemClickListener2;
    }

    public void onBindViewHolder(@NotNull Holder holder, int i) {
        String str;
        Intrinsics.checkNotNullParameter(holder, "holder");
        ((TextView) holder.itemView.findViewById(R$id.tv_manual_name)).setText(this.data.get(i).getDesc());
        NovaTextView novaTextView = (NovaTextView) holder.itemView.findViewById(R$id.tv_device_name);
        String str2 = this.deviceName;
        if (str2 == null) {
            str2 = "";
        }
        novaTextView.setText(str2);
        OvenIconFontView ovenIconFontView = (OvenIconFontView) holder.itemView.findViewById(R$id.ifv_manual);
        if (!StringsKt__StringsKt.contains$default((CharSequence) this.data.get(i).getUrl(), (CharSequence) ".pdf", false, 2, (Object) null)) {
            str = getMContext().getString(R$string.icon_manual_icon_pdf);
        } else {
            str = getMContext().getString(R$string.icon_manual_icon_html);
        }
        ovenIconFontView.setText(str);
        View view = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "holder.itemView");
        JuConnectExtKt.singleClickListener(view, new ManualListAdapter$onBindViewHolder$1(this, i));
    }

    @NotNull
    public Holder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        setMContext(context);
        return new Holder(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.item_manual_list, viewGroup, false));
    }
}
