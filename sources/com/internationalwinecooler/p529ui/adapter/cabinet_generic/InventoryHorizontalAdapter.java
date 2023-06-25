package com.internationalwinecooler.p529ui.adapter.cabinet_generic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.hisense.connect_life.core.listener.IItemCallback;
import com.hisense.connect_life.core.utils.Holder;
import com.hisense.connect_life.core.widget.IconFontView;
import com.hisense.juconnect.connectlife.R;
import com.juconnect.connect_life.R$id;
import com.juconnect.connectlife.model.WineInventoryBean;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\b\u0010\u0012\u001a\u00020\rH\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\rH\u0016J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\rH\u0016J\u0014\u0010\u001b\u001a\u00020\u00142\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u0018\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u000e\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006!"}, mo47991d2 = {"Lcom/internationalwinecooler/ui/adapter/cabinet_generic/InventoryHorizontalAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/hisense/connect_life/core/utils/Holder;", "context", "Landroid/content/Context;", "wineList", "", "Lcom/juconnect/connectlife/model/WineInventoryBean;", "(Landroid/content/Context;Ljava/util/List;)V", "getContext", "()Landroid/content/Context;", "iItemCallback", "Lcom/hisense/connect_life/core/listener/IItemCallback;", "", "onItemClickListener", "Lcom/internationalwinecooler/ui/adapter/cabinet_generic/InventoryHorizontalAdapter$OnItemClickListener;", "getWineList", "()Ljava/util/List;", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setIItemCallback", "setIsFavorite", "isFavorite", "", "setOnItemClickListener", "OnItemClickListener", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.adapter.cabinet_generic.InventoryHorizontalAdapter */
/* compiled from: InventoryHorizontalAdapter.kt */
public final class InventoryHorizontalAdapter extends RecyclerView.Adapter<Holder> {
    @NotNull
    public final Context context;
    @Nullable
    public IItemCallback<? super Integer> iItemCallback;
    @Nullable
    public OnItemClickListener onItemClickListener;
    @NotNull
    public final List<WineInventoryBean> wineList;

    @Metadata(mo47990d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, mo47991d2 = {"Lcom/internationalwinecooler/ui/adapter/cabinet_generic/InventoryHorizontalAdapter$OnItemClickListener;", "", "onItemClick", "", "position", "", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* renamed from: com.internationalwinecooler.ui.adapter.cabinet_generic.InventoryHorizontalAdapter$OnItemClickListener */
    /* compiled from: InventoryHorizontalAdapter.kt */
    public interface OnItemClickListener {
        void onItemClick(int i);
    }

    public InventoryHorizontalAdapter(@NotNull Context context2, @NotNull List<WineInventoryBean> list) {
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(list, "wineList");
        this.context = context2;
        this.wineList = list;
    }

    private final void setIsFavorite(Holder holder, boolean z) {
        if (z) {
            ((IconFontView) holder.itemView.findViewById(R$id.ic_favorite)).setText(this.context.getString(R.string.btn_favourutes_slected));
            ((IconFontView) holder.itemView.findViewById(R$id.ic_favorite)).setTextColor(this.context.getColor(R.color.colorButton));
            return;
        }
        ((IconFontView) holder.itemView.findViewById(R$id.ic_favorite)).setText(this.context.getString(R.string.btn_favourutes_normal));
        ((IconFontView) holder.itemView.findViewById(R$id.ic_favorite)).setTextColor(this.context.getColor(R.color.colorWhite));
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    public int getItemCount() {
        return this.wineList.size();
    }

    @NotNull
    public final List<WineInventoryBean> getWineList() {
        return this.wineList;
    }

    public final void setIItemCallback(@NotNull IItemCallback<? super Integer> iItemCallback2) {
        Intrinsics.checkNotNullParameter(iItemCallback2, "iItemCallback");
        this.iItemCallback = iItemCallback2;
    }

    public final void setOnItemClickListener(@NotNull OnItemClickListener onItemClickListener2) {
        Intrinsics.checkNotNullParameter(onItemClickListener2, "onItemClickListener");
        this.onItemClickListener = onItemClickListener2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull com.hisense.connect_life.core.utils.Holder r9, int r10) {
        /*
            r8 = this;
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.util.List<com.juconnect.connectlife.model.WineInventoryBean> r0 = r8.wineList
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x021c
            java.util.List<com.juconnect.connectlife.model.WineInventoryBean> r0 = r8.wineList
            java.lang.Object r0 = r0.get(r10)
            com.juconnect.connectlife.model.WineInventoryBean r0 = (com.juconnect.connectlife.model.WineInventoryBean) r0
            java.lang.String r0 = r0.getImageUrl()
            java.util.List<com.juconnect.connectlife.model.WineInventoryBean> r1 = r8.wineList
            java.lang.Object r1 = r1.get(r10)
            com.juconnect.connectlife.model.WineInventoryBean r1 = (com.juconnect.connectlife.model.WineInventoryBean) r1
            java.lang.String r1 = r1.getWineType()
            java.util.List<com.juconnect.connectlife.model.WineInventoryBean> r2 = r8.wineList
            java.lang.Object r2 = r2.get(r10)
            com.juconnect.connectlife.model.WineInventoryBean r2 = (com.juconnect.connectlife.model.WineInventoryBean) r2
            java.lang.String r2 = r2.getName()
            java.util.List<com.juconnect.connectlife.model.WineInventoryBean> r3 = r8.wineList
            java.lang.Object r3 = r3.get(r10)
            com.juconnect.connectlife.model.WineInventoryBean r3 = (com.juconnect.connectlife.model.WineInventoryBean) r3
            java.lang.Boolean r3 = r3.isFavorite()
            r4 = 2131623937(0x7f0e0001, float:1.887504E38)
            if (r0 == 0) goto L_0x006f
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 == 0) goto L_0x004b
            goto L_0x006f
        L_0x004b:
            android.content.Context r5 = r8.context
            c.d.a.g r5 = p040c.p077d.p078a.C1541c.m1099u(r5)
            c.d.a.f r5 = r5.mo15512s(r0)
            c.d.a.o.a r5 = r5.mo16285c0(r4)
            c.d.a.f r5 = (p040c.p077d.p078a.C1544f) r5
            c.d.a.o.a r5 = r5.mo16298j(r4)
            c.d.a.f r5 = (p040c.p077d.p078a.C1544f) r5
            android.view.View r6 = r9.itemView
            int r7 = com.juconnect.connect_life.R$id.wine_image
            android.view.View r6 = r6.findViewById(r7)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r5.mo15478D0(r6)
            goto L_0x0093
        L_0x006f:
            android.content.Context r5 = r8.context
            c.d.a.g r5 = p040c.p077d.p078a.C1541c.m1099u(r5)
            r6 = 2131624032(0x7f0e0060, float:1.8875232E38)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            c.d.a.f r5 = r5.mo15511r(r6)
            c.d.a.o.a r5 = r5.mo16285c0(r4)
            c.d.a.f r5 = (p040c.p077d.p078a.C1544f) r5
            android.view.View r6 = r9.itemView
            int r7 = com.juconnect.connect_life.R$id.wine_image
            android.view.View r6 = r6.findViewById(r7)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r5.mo15478D0(r6)
        L_0x0093:
            if (r0 != 0) goto L_0x0096
            goto L_0x00bb
        L_0x0096:
            android.content.Context r5 = r8.getContext()
            c.d.a.g r5 = p040c.p077d.p078a.C1541c.m1099u(r5)
            c.d.a.f r0 = r5.mo15512s(r0)
            c.d.a.o.a r0 = r0.mo16285c0(r4)
            c.d.a.f r0 = (p040c.p077d.p078a.C1544f) r0
            c.d.a.o.a r0 = r0.mo16298j(r4)
            c.d.a.f r0 = (p040c.p077d.p078a.C1544f) r0
            android.view.View r4 = r9.itemView
            int r5 = com.juconnect.connect_life.R$id.wine_image
            android.view.View r4 = r4.findViewById(r5)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r0.mo15478D0(r4)
        L_0x00bb:
            java.lang.String r0 = ""
            if (r1 != 0) goto L_0x00ce
            android.view.View r1 = r9.itemView
            int r4 = com.juconnect.connect_life.R$id.type_text
            android.view.View r1 = r1.findViewById(r4)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.setText(r0)
            goto L_0x01cb
        L_0x00ce:
            int r4 = r1.hashCode()
            switch(r4) {
                case 49: goto L_0x019e;
                case 50: goto L_0x017e;
                case 51: goto L_0x015e;
                case 52: goto L_0x013d;
                case 53: goto L_0x011b;
                case 54: goto L_0x00f9;
                case 55: goto L_0x00d7;
                default: goto L_0x00d5;
            }
        L_0x00d5:
            goto L_0x01be
        L_0x00d7:
            java.lang.String r4 = "7"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00e1
            goto L_0x01be
        L_0x00e1:
            android.view.View r1 = r9.itemView
            int r4 = com.juconnect.connect_life.R$id.type_text
            android.view.View r1 = r1.findViewById(r4)
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.content.Context r4 = r8.context
            r5 = 2131821862(0x7f110526, float:1.927648E38)
            java.lang.String r4 = r4.getString(r5)
            r1.setText(r4)
            goto L_0x01cb
        L_0x00f9:
            java.lang.String r4 = "6"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0103
            goto L_0x01be
        L_0x0103:
            android.view.View r1 = r9.itemView
            int r4 = com.juconnect.connect_life.R$id.type_text
            android.view.View r1 = r1.findViewById(r4)
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.content.Context r4 = r8.context
            r5 = 2131821161(0x7f110269, float:1.9275057E38)
            java.lang.String r4 = r4.getString(r5)
            r1.setText(r4)
            goto L_0x01cb
        L_0x011b:
            java.lang.String r4 = "5"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0125
            goto L_0x01be
        L_0x0125:
            android.view.View r1 = r9.itemView
            int r4 = com.juconnect.connect_life.R$id.type_text
            android.view.View r1 = r1.findViewById(r4)
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.content.Context r4 = r8.context
            r5 = 2131821065(0x7f110209, float:1.9274863E38)
            java.lang.String r4 = r4.getString(r5)
            r1.setText(r4)
            goto L_0x01cb
        L_0x013d:
            java.lang.String r4 = "4"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0147
            goto L_0x01be
        L_0x0147:
            android.view.View r1 = r9.itemView
            int r4 = com.juconnect.connect_life.R$id.type_text
            android.view.View r1 = r1.findViewById(r4)
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.content.Context r4 = r8.context
            r5 = 2131821584(0x7f110410, float:1.9275915E38)
            java.lang.String r4 = r4.getString(r5)
            r1.setText(r4)
            goto L_0x01cb
        L_0x015e:
            java.lang.String r4 = "3"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0167
            goto L_0x01be
        L_0x0167:
            android.view.View r1 = r9.itemView
            int r4 = com.juconnect.connect_life.R$id.type_text
            android.view.View r1 = r1.findViewById(r4)
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.content.Context r4 = r8.context
            r5 = 2131821778(0x7f1104d2, float:1.9276309E38)
            java.lang.String r4 = r4.getString(r5)
            r1.setText(r4)
            goto L_0x01cb
        L_0x017e:
            java.lang.String r4 = "2"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0187
            goto L_0x01be
        L_0x0187:
            android.view.View r1 = r9.itemView
            int r4 = com.juconnect.connect_life.R$id.type_text
            android.view.View r1 = r1.findViewById(r4)
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.content.Context r4 = r8.context
            r5 = 2131821909(0x7f110555, float:1.9276574E38)
            java.lang.String r4 = r4.getString(r5)
            r1.setText(r4)
            goto L_0x01cb
        L_0x019e:
            java.lang.String r4 = "1"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x01a7
            goto L_0x01be
        L_0x01a7:
            android.view.View r1 = r9.itemView
            int r4 = com.juconnect.connect_life.R$id.type_text
            android.view.View r1 = r1.findViewById(r4)
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.content.Context r4 = r8.context
            r5 = 2131821517(0x7f1103cd, float:1.927578E38)
            java.lang.String r4 = r4.getString(r5)
            r1.setText(r4)
            goto L_0x01cb
        L_0x01be:
            android.view.View r1 = r9.itemView
            int r4 = com.juconnect.connect_life.R$id.type_text
            android.view.View r1 = r1.findViewById(r4)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.setText(r0)
        L_0x01cb:
            if (r2 != 0) goto L_0x01db
            android.view.View r1 = r9.itemView
            int r2 = com.juconnect.connect_life.R$id.name_text
            android.view.View r1 = r1.findViewById(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.setText(r0)
            goto L_0x01e8
        L_0x01db:
            android.view.View r0 = r9.itemView
            int r1 = com.juconnect.connect_life.R$id.name_text
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r2)
        L_0x01e8:
            if (r3 != 0) goto L_0x01ef
            r0 = 0
            r8.setIsFavorite(r9, r0)
            goto L_0x01f6
        L_0x01ef:
            boolean r0 = r3.booleanValue()
            r8.setIsFavorite(r9, r0)
        L_0x01f6:
            android.view.View r0 = r9.itemView
            int r1 = com.juconnect.connect_life.R$id.ic_favorite
            android.view.View r0 = r0.findViewById(r1)
            com.hisense.connect_life.core.widget.IconFontView r0 = (com.hisense.connect_life.core.widget.IconFontView) r0
            java.lang.String r1 = "holder.itemView.ic_favorite"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            com.internationalwinecooler.ui.adapter.cabinet_generic.InventoryHorizontalAdapter$onBindViewHolder$2 r1 = new com.internationalwinecooler.ui.adapter.cabinet_generic.InventoryHorizontalAdapter$onBindViewHolder$2
            r1.<init>(r8, r10)
            com.hisense.connect_life.core.extentions.JuConnectExtKt.singleClickListener(r0, r1)
            android.view.View r9 = r9.itemView
            java.lang.String r0 = "holder.itemView"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r0)
            com.internationalwinecooler.ui.adapter.cabinet_generic.InventoryHorizontalAdapter$onBindViewHolder$3 r0 = new com.internationalwinecooler.ui.adapter.cabinet_generic.InventoryHorizontalAdapter$onBindViewHolder$3
            r0.<init>(r8, r10)
            com.hisense.connect_life.core.extentions.JuConnectExtKt.singleClickListener(r9, r0)
        L_0x021c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.internationalwinecooler.p529ui.adapter.cabinet_generic.InventoryHorizontalAdapter.onBindViewHolder(com.hisense.connect_life.core.utils.Holder, int):void");
    }

    @NotNull
    public Holder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        return new Holder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.inventory_horizontal_item_layout, viewGroup, false));
    }
}
