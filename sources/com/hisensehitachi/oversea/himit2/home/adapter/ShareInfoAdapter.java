package com.hisensehitachi.oversea.himit2.home.adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.hisense.connect_life.hismart.networks.request.device.model.UserInfo;
import com.hisense.juconnect.app_device.R$id;
import com.hisense.juconnect.app_device.R$layout;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p467s.p468a.p469a.p470a.p471a.C7563a;

@Metadata(mo47990d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0019\u001aB\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000eH\u0017J\u001c\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016J\u0014\u0010\u0017\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\bR\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0006¨\u0006\u001b"}, mo47991d2 = {"Lcom/hisensehitachi/oversea/himit2/home/adapter/ShareInfoAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/hisensehitachi/oversea/himit2/home/adapter/ShareInfoAdapter$MyViewHolder;", "data", "Ljava/util/ArrayList;", "Lcom/hisense/connect_life/hismart/networks/request/device/model/UserInfo;", "(Ljava/util/ArrayList;)V", "DeleteCallback", "Lcom/hisensehitachi/oversea/himit2/home/adapter/ShareInfoAdapter$IItemIndexedCallback;", "devData", "getDevData", "()Ljava/util/ArrayList;", "setDevData", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setDeleteCallback", "itemIndexedCallback", "IItemIndexedCallback", "MyViewHolder", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ShareInfoAdapter.kt */
public final class ShareInfoAdapter extends RecyclerView.Adapter<MyViewHolder> {
    @Nullable
    public IItemIndexedCallback<? super UserInfo> DeleteCallback;
    @NotNull
    public ArrayList<UserInfo> devData;

    @Metadata(mo47990d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J\u001d\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0002\u0010\b¨\u0006\t"}, mo47991d2 = {"Lcom/hisensehitachi/oversea/himit2/home/adapter/ShareInfoAdapter$IItemIndexedCallback;", "T", "", "accept", "", "index", "", "item", "(ILjava/lang/Object;)V", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: ShareInfoAdapter.kt */
    public interface IItemIndexedCallback<T> {
        void accept(int i, T t);
    }

    @Metadata(mo47990d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, mo47991d2 = {"Lcom/hisensehitachi/oversea/himit2/home/adapter/ShareInfoAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/hisensehitachi/oversea/himit2/home/adapter/ShareInfoAdapter;Landroid/view/View;)V", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: ShareInfoAdapter.kt */
    public final class MyViewHolder extends RecyclerView.ViewHolder {
        public final /* synthetic */ ShareInfoAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MyViewHolder(@NotNull ShareInfoAdapter shareInfoAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(shareInfoAdapter, "this$0");
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = shareInfoAdapter;
        }
    }

    public ShareInfoAdapter(@NotNull ArrayList<UserInfo> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "data");
        this.devData = arrayList;
    }

    /* renamed from: onBindViewHolder$lambda-1$lambda-0  reason: not valid java name */
    public static final void m27175onBindViewHolder$lambda1$lambda0(ShareInfoAdapter shareInfoAdapter, int i, View view) {
        Intrinsics.checkNotNullParameter(shareInfoAdapter, "this$0");
        IItemIndexedCallback<? super UserInfo> iItemIndexedCallback = shareInfoAdapter.DeleteCallback;
        if (iItemIndexedCallback != null) {
            UserInfo userInfo = shareInfoAdapter.devData.get(i);
            Intrinsics.checkNotNullExpressionValue(userInfo, "devData.get(position)");
            iItemIndexedCallback.accept(i, userInfo);
        }
    }

    @NotNull
    public final ArrayList<UserInfo> getDevData() {
        return this.devData;
    }

    public int getItemCount() {
        return this.devData.size();
    }

    public final void setDeleteCallback(@NotNull IItemIndexedCallback<? super UserInfo> iItemIndexedCallback) {
        Intrinsics.checkNotNullParameter(iItemIndexedCallback, "itemIndexedCallback");
        this.DeleteCallback = iItemIndexedCallback;
    }

    public final void setDevData(@NotNull ArrayList<UserInfo> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.devData = arrayList;
    }

    @SuppressLint({"SetTextI18n"})
    public void onBindViewHolder(@NotNull MyViewHolder myViewHolder, int i) {
        Intrinsics.checkNotNullParameter(myViewHolder, "holder");
        if (!this.devData.isEmpty()) {
            View view = myViewHolder.itemView;
            ((TextView) view.findViewById(R$id.user_box)).setText(getDevData().get(i).getUserMailbox());
            ((LinearLayout) view.findViewById(R$id.llTaskDelete)).setOnClickListener(new C7563a(this, i));
        }
    }

    @NotNull
    public MyViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.share_info, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflater");
        return new MyViewHolder(this, inflate);
    }
}
