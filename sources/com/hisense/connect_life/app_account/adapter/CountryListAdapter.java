package com.hisense.connect_life.app_account.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.hisense.connect_life.app_account.R$id;
import com.hisense.connect_life.app_account.R$layout;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.utils.Holder;
import com.hisense.connect_life.hismart.networks.request.language.model.Region;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u000fH\u0016J\u001c\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u00172\u0006\u0010\u0018\u001a\u00020\u0006J\u0018\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u000fH\u0016J\u0018\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000fH\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/adapter/CountryListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/hisense/connect_life/core/utils/Holder;", "Landroid/widget/Filterable;", "()V", "mCountryCode", "", "getMCountryCode", "()Ljava/lang/String;", "setMCountryCode", "(Ljava/lang/String;)V", "mFilterList", "", "Lcom/hisense/connect_life/hismart/networks/request/language/model/Region;", "mPosition", "", "mRegionList", "getFilter", "Landroid/widget/Filter;", "getItemCount", "initData", "", "regionList", "", "countryCode", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: CountryListAdapter.kt */
public final class CountryListAdapter extends RecyclerView.Adapter<Holder> implements Filterable {
    @NotNull
    public String mCountryCode = "";
    @NotNull
    public List<Region> mFilterList = new ArrayList();
    public int mPosition = -1;
    @NotNull
    public final List<Region> mRegionList = new ArrayList();

    @NotNull
    public Filter getFilter() {
        return new CountryListAdapter$getFilter$1(new ArrayList(), this);
    }

    public int getItemCount() {
        return this.mFilterList.size();
    }

    @NotNull
    public final String getMCountryCode() {
        return this.mCountryCode;
    }

    public final void initData(@NotNull List<Region> list, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "regionList");
        Intrinsics.checkNotNullParameter(str, "countryCode");
        this.mCountryCode = str;
        this.mRegionList.clear();
        this.mRegionList.addAll(list);
        this.mFilterList.clear();
        this.mFilterList.addAll(this.mRegionList);
    }

    public final void setMCountryCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mCountryCode = str;
    }

    public void onBindViewHolder(@NotNull Holder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ((TextView) holder.itemView.findViewById(R$id.tv_country_name)).setText(this.mFilterList.get(i).getName());
        RelativeLayout relativeLayout = (RelativeLayout) holder.itemView.findViewById(R$id.item_layout);
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "holder.itemView.item_layout");
        JuConnectExtKt.singleClickListener(relativeLayout, new CountryListAdapter$onBindViewHolder$1(this, holder));
        int i2 = 8;
        if (!Intrinsics.areEqual((Object) this.mCountryCode, (Object) "") || i != 0) {
            ImageView imageView = (ImageView) holder.itemView.findViewById(R$id.iv_select);
            Intrinsics.checkNotNullExpressionValue(imageView, "holder.itemView.iv_select");
            if (Intrinsics.areEqual((Object) this.mFilterList.get(i).getCode(), (Object) this.mCountryCode)) {
                i2 = 0;
            }
            imageView.setVisibility(i2);
            return;
        }
        ImageView imageView2 = (ImageView) holder.itemView.findViewById(R$id.iv_select);
        Intrinsics.checkNotNullExpressionValue(imageView2, "holder.itemView.iv_select");
        imageView2.setVisibility(8);
    }

    @NotNull
    public Holder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        return new Holder(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.country_list_item, viewGroup, false));
    }
}
