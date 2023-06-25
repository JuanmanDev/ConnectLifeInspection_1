package com.internationalwinecooler.p529ui.adapter.cabinet_exact;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.donkingliang.groupedadapter.holder.BaseViewHolder;
import com.hisense.juconnect.connectlife.R;
import com.juconnect.connect_life.R$id;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import p040c.p072c.p073a.p074a.C1499f;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.adapter.cabinet_exact.InventoryExactMainExpandAdapter$setZoneClickStateChange$1 */
/* compiled from: InventoryExactMainExpandAdapter.kt */
public final class InventoryExactMainExpandAdapter$setZoneClickStateChange$1 extends Lambda implements Function1<View, Unit> {
    public final /* synthetic */ BaseViewHolder $holder;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InventoryExactMainExpandAdapter$setZoneClickStateChange$1(BaseViewHolder baseViewHolder) {
        super(1);
        this.$holder = baseViewHolder;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable View view) {
        RecyclerView recyclerView = (RecyclerView) this.$holder.itemView.findViewById(R$id.shelf_a_recycler_view);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "holder.itemView.shelf_a_recycler_view");
        recyclerView.setVisibility(0);
        RecyclerView recyclerView2 = (RecyclerView) this.$holder.itemView.findViewById(R$id.shelf_b_recycler_view);
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "holder.itemView.shelf_b_recycler_view");
        recyclerView2.setVisibility(8);
        RecyclerView recyclerView3 = (RecyclerView) this.$holder.itemView.findViewById(R$id.shelf_c_recycler_view);
        Intrinsics.checkNotNullExpressionValue(recyclerView3, "holder.itemView.shelf_c_recycler_view");
        recyclerView3.setVisibility(8);
        RelativeLayout relativeLayout = (RelativeLayout) this.$holder.itemView.findViewById(R$id.bottles_count_a_layout);
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "holder.itemView.bottles_count_a_layout");
        relativeLayout.setVisibility(8);
        RelativeLayout relativeLayout2 = (RelativeLayout) this.$holder.itemView.findViewById(R$id.bottles_count_b_layout);
        Intrinsics.checkNotNullExpressionValue(relativeLayout2, "holder.itemView.bottles_count_b_layout");
        relativeLayout2.setVisibility(0);
        RelativeLayout relativeLayout3 = (RelativeLayout) this.$holder.itemView.findViewById(R$id.bottles_count_c_layout);
        Intrinsics.checkNotNullExpressionValue(relativeLayout3, "holder.itemView.bottles_count_c_layout");
        relativeLayout3.setVisibility(0);
        ((TextView) this.$holder.itemView.findViewById(R$id.zone_a_text)).setBackgroundResource(R.drawable.inventory_shelf_a_select);
        ((TextView) this.$holder.itemView.findViewById(R$id.zone_b_text)).setBackgroundResource(R.drawable.inventory_shelf_b_normal);
        ((TextView) this.$holder.itemView.findViewById(R$id.zone_c_text)).setBackgroundResource(R.drawable.inventory_shelf_c_normal);
        ((TextView) this.$holder.itemView.findViewById(R$id.zone_a_text)).setTextColor(C1499f.m915a(R.color.colorWhite));
        ((TextView) this.$holder.itemView.findViewById(R$id.zone_b_text)).setTextColor(C1499f.m915a(R.color.colorBlack));
        ((TextView) this.$holder.itemView.findViewById(R$id.zone_c_text)).setTextColor(C1499f.m915a(R.color.colorBlack));
    }
}
