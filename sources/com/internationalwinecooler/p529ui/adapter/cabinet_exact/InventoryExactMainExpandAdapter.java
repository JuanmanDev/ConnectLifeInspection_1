package com.internationalwinecooler.p529ui.adapter.cabinet_exact;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.donkingliang.groupedadapter.adapter.GroupedRecyclerViewAdapter;
import com.donkingliang.groupedadapter.holder.BaseViewHolder;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.listener.IItemCallback;
import com.hisense.connect_life.core.widget.IconFontView;
import com.hisense.connect_life.hismart.networks.request.device.DeviceCache;
import com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo;
import com.hisense.juconnect.connectlife.R;
import com.internationalwinecooler.p529ui.adapter.cabinet_generic.InventoryZoneItemGroupAdapter;
import com.internationalwinecooler.p529ui.inventory.InventoryMainActivity;
import com.internationalwinecooler.p529ui.model.ExpandableGroupEntity;
import com.juconnect.connect_life.R$id;
import com.juconnect.connectlife.model.WineInventoryBean;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p072c.p073a.p074a.C1499f;

@Metadata(mo47990d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\tJ\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0018\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u000e\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\tJ\u0016\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0016\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nJ\u0010\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\tH\u0016J\u0010\u0010#\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\tH\u0016J\u0010\u0010$\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\tH\u0016J\b\u0010%\u001a\u00020\tH\u0016J\u0010\u0010&\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\tH\u0016J\u0010\u0010'\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\tH\u0016J\u0010\u0010(\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\tH\u0016J\u0001\u0010)\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020\u00142\u0006\u0010+\u001a\u00020,2\u0012\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00100\u00102\u0012\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00100\u00102\u0012\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00100\u00102\u0012\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00100\u00102\u0012\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00100\u00102\u0012\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00100\u0010H\u0002J\u000e\u00103\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\tJ \u00104\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020,2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u00105\u001a\u00020\tH\u0016J\u0018\u00106\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020,2\u0006\u0010\u001b\u001a\u00020\tH\u0016J\u0018\u00107\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020,2\u0006\u0010\u001b\u001a\u00020\tH\u0016J0\u00108\u001a\u00020\u001a2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u001a\u0010\u0012\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00100\u0013J\u0014\u00109\u001a\u00020\u001a2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\fJ\u0016\u0010:\u001a\u00020\u001a2\u0006\u0010;\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020,J\u0010\u0010<\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020,H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X.¢\u0006\u0002\n\u0000R\"\u0010\u0012\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00100\u0013X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\tXD¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006="}, mo47991d2 = {"Lcom/internationalwinecooler/ui/adapter/cabinet_exact/InventoryExactMainExpandAdapter;", "Lcom/donkingliang/groupedadapter/adapter/GroupedRecyclerViewAdapter;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "expandItemList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "iItemCallback", "Lcom/hisense/connect_life/core/listener/IItemCallback;", "itemGroupAdapter", "Lcom/internationalwinecooler/ui/adapter/cabinet_generic/InventoryZoneItemGroupAdapter;", "mGroups", "", "Lcom/internationalwinecooler/ui/model/ExpandableGroupEntity;", "wineAuidSortMap", "", "", "Lcom/juconnect/connectlife/model/WineInventoryBean;", "zoneType", "getZoneType", "()I", "collapseGroup", "", "groupPosition", "animate", "", "expandAndCloseElseGroup", "expandGroup", "expandGroupList", "getChildLayout", "viewType", "getChildrenCount", "getFooterLayout", "getGroupCount", "getHeaderLayout", "hasFooter", "hasHeader", "initAdapter", "auid", "holder", "Lcom/donkingliang/groupedadapter/holder/BaseViewHolder;", "zoneAWineList", "zoneBWineList", "zoneCWineList", "battleSingleWineList", "battleAWineList", "battleBWineList", "isExpand", "onBindChildViewHolder", "childPosition", "onBindFooterViewHolder", "onBindHeaderViewHolder", "setData", "setIItemCallback", "setUnplacedLayoutState", "isSelect", "setZoneClickStateChange", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@SuppressLint({"SetTextI18n"})
/* renamed from: com.internationalwinecooler.ui.adapter.cabinet_exact.InventoryExactMainExpandAdapter */
/* compiled from: InventoryExactMainExpandAdapter.kt */
public final class InventoryExactMainExpandAdapter extends GroupedRecyclerViewAdapter {
    @NotNull
    public final Context context;
    @NotNull
    public ArrayList<Integer> expandItemList = new ArrayList<>();
    @Nullable
    public IItemCallback<? super Integer> iItemCallback;
    public InventoryZoneItemGroupAdapter itemGroupAdapter;
    public List<ExpandableGroupEntity> mGroups;
    public Map<String, ? extends List<WineInventoryBean>> wineAuidSortMap;
    public final int zoneType = 100;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InventoryExactMainExpandAdapter(@NotNull Context context2) {
        super(context2);
        Intrinsics.checkNotNullParameter(context2, "context");
        this.context = context2;
    }

    private final void expandAndCloseElseGroup(int i, boolean z) {
        List<ExpandableGroupEntity> list = this.mGroups;
        List<ExpandableGroupEntity> list2 = null;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGroups");
            list = null;
        }
        for (ExpandableGroupEntity expandableGroupEntity : list) {
            if (expandableGroupEntity.isExpand()) {
                List<ExpandableGroupEntity> list3 = this.mGroups;
                if (list3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mGroups");
                    list3 = null;
                }
                if (!Intrinsics.areEqual((Object) list3.get(i).getAuid(), (Object) expandableGroupEntity.getAuid())) {
                    expandableGroupEntity.setExpand(false);
                    if (z) {
                        notifyChildrenInserted(i);
                    } else {
                        notifyDataChanged();
                    }
                }
            }
        }
        List<ExpandableGroupEntity> list4 = this.mGroups;
        if (list4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGroups");
        } else {
            list2 = list4;
        }
        list2.get(i).setExpand(true);
        if (z) {
            notifyChildrenInserted(i);
        } else {
            notifyDataChanged();
        }
        this.expandItemList.clear();
        this.expandItemList.add(Integer.valueOf(i));
    }

    private final void initAdapter(String str, BaseViewHolder baseViewHolder, List<? extends List<WineInventoryBean>> list, List<? extends List<WineInventoryBean>> list2, List<? extends List<WineInventoryBean>> list3, List<? extends List<WineInventoryBean>> list4, List<? extends List<WineInventoryBean>> list5, List<? extends List<WineInventoryBean>> list6) {
        String str2 = str;
        BaseViewHolder baseViewHolder2 = baseViewHolder;
        InventoryExactShelfAdapter inventoryExactShelfAdapter = new InventoryExactShelfAdapter(this.context, 1);
        InventoryExactShelfAdapter inventoryExactShelfAdapter2 = new InventoryExactShelfAdapter(this.context, 2);
        InventoryExactShelfAdapter inventoryExactShelfAdapter3 = new InventoryExactShelfAdapter(this.context, 3);
        InventoryExactShelfAdapter inventoryExactShelfAdapter4 = new InventoryExactShelfAdapter(this.context, 4);
        InventoryExactShelfAdapter inventoryExactShelfAdapter5 = new InventoryExactShelfAdapter(this.context, 5);
        InventoryExactShelfAdapter inventoryExactShelfAdapter6 = new InventoryExactShelfAdapter(this.context, 6);
        ((RecyclerView) baseViewHolder2.itemView.findViewById(R$id.shelf_a_recycler_view)).setLayoutManager(new LinearLayoutManager(this.context));
        ((RecyclerView) baseViewHolder2.itemView.findViewById(R$id.shelf_b_recycler_view)).setLayoutManager(new LinearLayoutManager(this.context));
        ((RecyclerView) baseViewHolder2.itemView.findViewById(R$id.shelf_c_recycler_view)).setLayoutManager(new LinearLayoutManager(this.context));
        if (DeviceCache.Companion.getInstance().isDeviceType(str) == DeviceCache.Companion.getInstance().getBattleSingleZoneDevice()) {
            inventoryExactShelfAdapter4.setData(list4);
            ((RecyclerView) baseViewHolder2.itemView.findViewById(R$id.shelf_a_recycler_view)).setAdapter(inventoryExactShelfAdapter4);
        } else if (DeviceCache.Companion.getInstance().isDeviceType(str) == DeviceCache.Companion.getInstance().getBattleTwoZoneDevice()) {
            inventoryExactShelfAdapter5.setData(list5);
            inventoryExactShelfAdapter6.setData(list6);
            ((RecyclerView) baseViewHolder2.itemView.findViewById(R$id.shelf_a_recycler_view)).setAdapter(inventoryExactShelfAdapter5);
            ((RecyclerView) baseViewHolder2.itemView.findViewById(R$id.shelf_b_recycler_view)).setAdapter(inventoryExactShelfAdapter6);
        } else {
            List<? extends List<WineInventoryBean>> list7 = list;
            inventoryExactShelfAdapter.setData(list);
            inventoryExactShelfAdapter2.setData(list2);
            inventoryExactShelfAdapter3.setData(list3);
            ((RecyclerView) baseViewHolder2.itemView.findViewById(R$id.shelf_a_recycler_view)).setAdapter(inventoryExactShelfAdapter);
            ((RecyclerView) baseViewHolder2.itemView.findViewById(R$id.shelf_b_recycler_view)).setAdapter(inventoryExactShelfAdapter2);
            ((RecyclerView) baseViewHolder2.itemView.findViewById(R$id.shelf_c_recycler_view)).setAdapter(inventoryExactShelfAdapter3);
        }
    }

    private final void setZoneClickStateChange(BaseViewHolder baseViewHolder) {
        TextView textView = (TextView) baseViewHolder.itemView.findViewById(R$id.zone_a_text);
        Intrinsics.checkNotNullExpressionValue(textView, "holder.itemView.zone_a_text");
        JuConnectExtKt.singleClickListener(textView, new InventoryExactMainExpandAdapter$setZoneClickStateChange$1(baseViewHolder));
        TextView textView2 = (TextView) baseViewHolder.itemView.findViewById(R$id.zone_b_text);
        Intrinsics.checkNotNullExpressionValue(textView2, "holder.itemView.zone_b_text");
        JuConnectExtKt.singleClickListener(textView2, new InventoryExactMainExpandAdapter$setZoneClickStateChange$2(baseViewHolder));
        TextView textView3 = (TextView) baseViewHolder.itemView.findViewById(R$id.zone_c_text);
        Intrinsics.checkNotNullExpressionValue(textView3, "holder.itemView.zone_c_text");
        JuConnectExtKt.singleClickListener(textView3, new InventoryExactMainExpandAdapter$setZoneClickStateChange$3(baseViewHolder));
    }

    public final void collapseGroup(int i) {
        collapseGroup(i, false);
    }

    public final void expandGroup(int i) {
        expandAndCloseElseGroup(i, false);
    }

    @NotNull
    public final ArrayList<Integer> expandGroupList() {
        return this.expandItemList;
    }

    public int getChildLayout(int i) {
        return R.layout.inventory_exact_main_layout_child;
    }

    public int getChildrenCount(int i) {
        if (!isExpand(i)) {
            return 0;
        }
        List<ExpandableGroupEntity> list = this.mGroups;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGroups");
            list = null;
        }
        return list.get(i).getChildren().size();
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    public int getFooterLayout(int i) {
        return 0;
    }

    public int getGroupCount() {
        List<ExpandableGroupEntity> list = this.mGroups;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGroups");
            list = null;
        }
        return list.size();
    }

    public int getHeaderLayout(int i) {
        return R.layout.inventory_exact_main_layout_header;
    }

    public final int getZoneType() {
        return this.zoneType;
    }

    public boolean hasFooter(int i) {
        return false;
    }

    public boolean hasHeader(int i) {
        return true;
    }

    public final boolean isExpand(int i) {
        List<ExpandableGroupEntity> list = this.mGroups;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGroups");
            list = null;
        }
        return list.get(i).isExpand();
    }

    /* JADX WARNING: Removed duplicated region for block: B:172:0x075d  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0766  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0787  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x079a  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x081f  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0824  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBindChildViewHolder(@org.jetbrains.annotations.NotNull com.donkingliang.groupedadapter.holder.BaseViewHolder r26, int r27, int r28) {
        /*
            r25 = this;
            r9 = r25
            r10 = r26
            r0 = r27
            java.lang.String r1 = "holder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r1)
            android.view.View r1 = r10.itemView
            int r2 = com.juconnect.connect_life.R$id.zone_main_child_recycler_view
            android.view.View r1 = r1.findViewById(r2)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            com.hisense.connect_life.hismart.networks.request.device.DeviceCache$Companion r2 = com.hisense.connect_life.hismart.networks.request.device.DeviceCache.Companion
            com.hisense.connect_life.hismart.networks.request.device.DeviceCache r2 = r2.getInstance()
            java.util.List<com.internationalwinecooler.ui.model.ExpandableGroupEntity> r3 = r9.mGroups
            java.lang.String r4 = "mGroups"
            if (r3 != 0) goto L_0x0025
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            r3 = 0
        L_0x0025:
            java.lang.Object r3 = r3.get(r0)
            com.internationalwinecooler.ui.model.ExpandableGroupEntity r3 = (com.internationalwinecooler.p529ui.model.ExpandableGroupEntity) r3
            java.lang.String r3 = r3.getAuid()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            int r2 = r2.isDeviceType(r3)
            com.hisense.connect_life.hismart.networks.request.device.DeviceCache$Companion r3 = com.hisense.connect_life.hismart.networks.request.device.DeviceCache.Companion
            com.hisense.connect_life.hismart.networks.request.device.DeviceCache r3 = r3.getInstance()
            int r3 = r3.getSingleZoneDevice()
            r6 = 1
            r7 = 8
            r8 = 0
            if (r2 != r3) goto L_0x00eb
            r1.setVisibility(r8)
            android.view.View r2 = r10.itemView
            int r3 = com.juconnect.connect_life.R$id.zoneLayout
            android.view.View r2 = r2.findViewById(r3)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r2.setVisibility(r7)
            android.view.View r2 = r10.itemView
            int r3 = com.juconnect.connect_life.R$id.unplaced_layout
            android.view.View r2 = r2.findViewById(r3)
            r2.setVisibility(r8)
            java.util.List<com.internationalwinecooler.ui.model.ExpandableGroupEntity> r2 = r9.mGroups
            if (r2 != 0) goto L_0x0069
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            r2 = 0
        L_0x0069:
            java.lang.Object r2 = r2.get(r0)
            com.internationalwinecooler.ui.model.ExpandableGroupEntity r2 = (com.internationalwinecooler.p529ui.model.ExpandableGroupEntity) r2
            java.util.ArrayList r2 = r2.getChildren()
            r3 = r28
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r3 = "mGroups[groupPosition].children[childPosition]"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            com.internationalwinecooler.ui.model.ChildEntity r2 = (com.internationalwinecooler.p529ui.model.ChildEntity) r2
            java.util.Map r3 = r2.getZoneAMap()
            int r3 = r3.size()
            java.util.Map r11 = r2.getZoneBMap()
            int r11 = r11.size()
            int r3 = r3 + r11
            java.util.Map r2 = r2.getZoneCMap()
            int r2 = r2.size()
            int r3 = r3 + r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.internationalwinecooler.ui.model.GroupModel$Companion r11 = com.internationalwinecooler.p529ui.model.GroupModel.Companion
            java.util.Map<java.lang.String, ? extends java.util.List<com.juconnect.connectlife.model.WineInventoryBean>> r12 = r9.wineAuidSortMap
            if (r12 != 0) goto L_0x00ab
            java.lang.String r12 = "wineAuidSortMap"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r12)
            r12 = 0
        L_0x00ab:
            java.util.ArrayList r3 = r11.getGenericExpandableGroups(r8, r6, r3, r12)
            java.lang.Object r3 = r3.get(r0)
            java.lang.String r11 = "GroupModel.getGenericExp…         )[groupPosition]"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r11)
            com.internationalwinecooler.ui.model.ExpandableGroupEntity r3 = (com.internationalwinecooler.p529ui.model.ExpandableGroupEntity) r3
            r2.clear()
            r2.add(r3)
            com.internationalwinecooler.ui.adapter.cabinet_generic.InventoryZoneItemGroupAdapter r3 = new com.internationalwinecooler.ui.adapter.cabinet_generic.InventoryZoneItemGroupAdapter
            android.content.Context r11 = r9.mContext
            java.lang.String r12 = "mContext"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r12)
            int r12 = r9.zoneType
            r3.<init>(r11, r2, r12)
            androidx.recyclerview.widget.LinearLayoutManager r2 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r11 = r9.mContext
            r2.<init>(r11)
            r2.setOrientation(r6)
            r1.setLayoutManager(r2)
            r1.setHasFixedSize(r8)
            com.internationalwinecooler.ui.adapter.cabinet_exact.InventoryExactMainExpandAdapter$onBindChildViewHolder$1 r2 = new com.internationalwinecooler.ui.adapter.cabinet_exact.InventoryExactMainExpandAdapter$onBindChildViewHolder$1
            r2.<init>(r9)
            r3.setIItemCallback(r2)
            r1.setAdapter(r3)
            goto L_0x020a
        L_0x00eb:
            com.hisense.connect_life.hismart.networks.request.device.DeviceCache$Companion r2 = com.hisense.connect_life.hismart.networks.request.device.DeviceCache.Companion
            com.hisense.connect_life.hismart.networks.request.device.DeviceCache r2 = r2.getInstance()
            java.util.List<com.internationalwinecooler.ui.model.ExpandableGroupEntity> r3 = r9.mGroups
            if (r3 != 0) goto L_0x00f9
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            r3 = 0
        L_0x00f9:
            java.lang.Object r3 = r3.get(r0)
            com.internationalwinecooler.ui.model.ExpandableGroupEntity r3 = (com.internationalwinecooler.p529ui.model.ExpandableGroupEntity) r3
            java.lang.String r3 = r3.getAuid()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            int r2 = r2.isDeviceType(r3)
            com.hisense.connect_life.hismart.networks.request.device.DeviceCache$Companion r3 = com.hisense.connect_life.hismart.networks.request.device.DeviceCache.Companion
            com.hisense.connect_life.hismart.networks.request.device.DeviceCache r3 = r3.getInstance()
            int r3 = r3.getBattleSingleZoneDevice()
            if (r2 != r3) goto L_0x015a
            android.view.View r2 = r10.itemView
            int r3 = com.juconnect.connect_life.R$id.unplaced_layout
            android.view.View r2 = r2.findViewById(r3)
            r2.setVisibility(r8)
            r1.setVisibility(r7)
            android.view.View r1 = r10.itemView
            int r2 = com.juconnect.connect_life.R$id.zoneLayout
            android.view.View r1 = r1.findViewById(r2)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1.setVisibility(r8)
            android.view.View r1 = r10.itemView
            int r2 = com.juconnect.connect_life.R$id.zone_a_layout
            android.view.View r1 = r1.findViewById(r2)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1.setVisibility(r8)
            android.view.View r1 = r10.itemView
            int r2 = com.juconnect.connect_life.R$id.zone_b_layout
            android.view.View r1 = r1.findViewById(r2)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1.setVisibility(r7)
            android.view.View r1 = r10.itemView
            int r2 = com.juconnect.connect_life.R$id.zone_c_layout
            android.view.View r1 = r1.findViewById(r2)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1.setVisibility(r7)
            goto L_0x020a
        L_0x015a:
            com.hisense.connect_life.hismart.networks.request.device.DeviceCache$Companion r2 = com.hisense.connect_life.hismart.networks.request.device.DeviceCache.Companion
            com.hisense.connect_life.hismart.networks.request.device.DeviceCache r2 = r2.getInstance()
            java.util.List<com.internationalwinecooler.ui.model.ExpandableGroupEntity> r3 = r9.mGroups
            if (r3 != 0) goto L_0x0168
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            r3 = 0
        L_0x0168:
            java.lang.Object r3 = r3.get(r0)
            com.internationalwinecooler.ui.model.ExpandableGroupEntity r3 = (com.internationalwinecooler.p529ui.model.ExpandableGroupEntity) r3
            java.lang.String r3 = r3.getAuid()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            int r2 = r2.isDeviceType(r3)
            com.hisense.connect_life.hismart.networks.request.device.DeviceCache$Companion r3 = com.hisense.connect_life.hismart.networks.request.device.DeviceCache.Companion
            com.hisense.connect_life.hismart.networks.request.device.DeviceCache r3 = r3.getInstance()
            int r3 = r3.getBattleTwoZoneDevice()
            if (r2 != r3) goto L_0x01c8
            android.view.View r2 = r10.itemView
            int r3 = com.juconnect.connect_life.R$id.unplaced_layout
            android.view.View r2 = r2.findViewById(r3)
            r2.setVisibility(r8)
            r1.setVisibility(r7)
            android.view.View r1 = r10.itemView
            int r2 = com.juconnect.connect_life.R$id.zoneLayout
            android.view.View r1 = r1.findViewById(r2)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1.setVisibility(r8)
            android.view.View r1 = r10.itemView
            int r2 = com.juconnect.connect_life.R$id.zone_a_layout
            android.view.View r1 = r1.findViewById(r2)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1.setVisibility(r8)
            android.view.View r1 = r10.itemView
            int r2 = com.juconnect.connect_life.R$id.zone_b_layout
            android.view.View r1 = r1.findViewById(r2)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1.setVisibility(r8)
            android.view.View r1 = r10.itemView
            int r2 = com.juconnect.connect_life.R$id.zone_c_layout
            android.view.View r1 = r1.findViewById(r2)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1.setVisibility(r7)
            goto L_0x020a
        L_0x01c8:
            android.view.View r2 = r10.itemView
            int r3 = com.juconnect.connect_life.R$id.unplaced_layout
            android.view.View r2 = r2.findViewById(r3)
            r2.setVisibility(r8)
            r1.setVisibility(r7)
            android.view.View r1 = r10.itemView
            int r2 = com.juconnect.connect_life.R$id.zoneLayout
            android.view.View r1 = r1.findViewById(r2)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1.setVisibility(r8)
            android.view.View r1 = r10.itemView
            int r2 = com.juconnect.connect_life.R$id.zone_a_layout
            android.view.View r1 = r1.findViewById(r2)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1.setVisibility(r8)
            android.view.View r1 = r10.itemView
            int r2 = com.juconnect.connect_life.R$id.zone_b_layout
            android.view.View r1 = r1.findViewById(r2)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1.setVisibility(r8)
            android.view.View r1 = r10.itemView
            int r2 = com.juconnect.connect_life.R$id.zone_c_layout
            android.view.View r1 = r1.findViewById(r2)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1.setVisibility(r8)
        L_0x020a:
            java.util.List<com.internationalwinecooler.ui.model.ExpandableGroupEntity> r1 = r9.mGroups
            if (r1 != 0) goto L_0x0212
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            r1 = 0
        L_0x0212:
            java.lang.Object r1 = r1.get(r0)
            com.internationalwinecooler.ui.model.ExpandableGroupEntity r1 = (com.internationalwinecooler.p529ui.model.ExpandableGroupEntity) r1
            java.util.ArrayList r1 = r1.getChildren()
            java.lang.Object r1 = r1.get(r8)
            java.lang.String r2 = "mGroups[groupPosition].children[0]"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            com.internationalwinecooler.ui.model.ChildEntity r1 = (com.internationalwinecooler.p529ui.model.ChildEntity) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r18 = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Map r19 = r1.getUnplacedMap()
            java.util.Set r19 = r19.entrySet()
            java.util.Iterator r19 = r19.iterator()
        L_0x027b:
            boolean r20 = r19.hasNext()
            if (r20 == 0) goto L_0x02c9
            java.lang.Object r20 = r19.next()
            java.util.Map$Entry r20 = (java.util.Map.Entry) r20
            java.lang.Object r9 = r20.getValue()
            r5.add(r9)
            java.lang.Object r9 = r20.getValue()
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            r28 = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x029f:
            boolean r20 = r9.hasNext()
            if (r20 == 0) goto L_0x02bf
            r20 = r15
            java.lang.Object r15 = r9.next()
            r21 = r15
            com.juconnect.connectlife.model.WineInventoryBean r21 = (com.juconnect.connectlife.model.WineInventoryBean) r21
            boolean r21 = r21.isFilteredOut()
            r17 = 1
            r21 = r21 ^ 1
            if (r21 == 0) goto L_0x02bc
            r5.add(r15)
        L_0x02bc:
            r15 = r20
            goto L_0x029f
        L_0x02bf:
            r20 = r15
            r2.add(r5)
            r9 = r25
            r5 = r28
            goto L_0x027b
        L_0x02c9:
            r28 = r5
            r20 = r15
            java.util.Map r5 = r1.getZoneAMap()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x02d9:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x0321
            java.lang.Object r9 = r5.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r15 = r9.getValue()
            r8.add(r15)
            java.lang.Object r9 = r9.getValue()
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x02fb:
            boolean r19 = r9.hasNext()
            if (r19 == 0) goto L_0x031b
            r19 = r5
            java.lang.Object r5 = r9.next()
            r21 = r5
            com.juconnect.connectlife.model.WineInventoryBean r21 = (com.juconnect.connectlife.model.WineInventoryBean) r21
            boolean r21 = r21.isFilteredOut()
            r17 = 1
            r21 = r21 ^ 1
            if (r21 == 0) goto L_0x0318
            r15.add(r5)
        L_0x0318:
            r5 = r19
            goto L_0x02fb
        L_0x031b:
            r19 = r5
            r3.add(r15)
            goto L_0x02d9
        L_0x0321:
            java.util.Map r5 = r1.getZoneBMap()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x032d:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x0375
            java.lang.Object r9 = r5.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r15 = r9.getValue()
            r7.add(r15)
            java.lang.Object r9 = r9.getValue()
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x034f:
            boolean r19 = r9.hasNext()
            if (r19 == 0) goto L_0x036f
            r19 = r5
            java.lang.Object r5 = r9.next()
            r21 = r5
            com.juconnect.connectlife.model.WineInventoryBean r21 = (com.juconnect.connectlife.model.WineInventoryBean) r21
            boolean r21 = r21.isFilteredOut()
            r17 = 1
            r21 = r21 ^ 1
            if (r21 == 0) goto L_0x036c
            r15.add(r5)
        L_0x036c:
            r5 = r19
            goto L_0x034f
        L_0x036f:
            r19 = r5
            r11.add(r15)
            goto L_0x032d
        L_0x0375:
            java.util.Map r5 = r1.getZoneCMap()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x0381:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x03c9
            java.lang.Object r9 = r5.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r15 = r9.getValue()
            r6.add(r15)
            java.lang.Object r9 = r9.getValue()
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x03a3:
            boolean r19 = r9.hasNext()
            if (r19 == 0) goto L_0x03c3
            r19 = r5
            java.lang.Object r5 = r9.next()
            r21 = r5
            com.juconnect.connectlife.model.WineInventoryBean r21 = (com.juconnect.connectlife.model.WineInventoryBean) r21
            boolean r21 = r21.isFilteredOut()
            r17 = 1
            r21 = r21 ^ 1
            if (r21 == 0) goto L_0x03c0
            r15.add(r5)
        L_0x03c0:
            r5 = r19
            goto L_0x03a3
        L_0x03c3:
            r19 = r5
            r12.add(r15)
            goto L_0x0381
        L_0x03c9:
            java.util.Map r5 = r1.getBattleMapSingle()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x03d5:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x041d
            java.lang.Object r9 = r5.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r15 = r9.getValue()
            r0.add(r15)
            java.lang.Object r9 = r9.getValue()
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x03f7:
            boolean r19 = r9.hasNext()
            if (r19 == 0) goto L_0x0417
            r19 = r5
            java.lang.Object r5 = r9.next()
            r21 = r5
            com.juconnect.connectlife.model.WineInventoryBean r21 = (com.juconnect.connectlife.model.WineInventoryBean) r21
            boolean r21 = r21.isFilteredOut()
            r17 = 1
            r21 = r21 ^ 1
            if (r21 == 0) goto L_0x0414
            r15.add(r5)
        L_0x0414:
            r5 = r19
            goto L_0x03f7
        L_0x0417:
            r19 = r5
            r13.add(r15)
            goto L_0x03d5
        L_0x041d:
            java.util.Map r5 = r1.getBattleAMap()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x0429:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x0471
            java.lang.Object r9 = r5.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r15 = r9.getValue()
            r4.add(r15)
            java.lang.Object r9 = r9.getValue()
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x044b:
            boolean r19 = r9.hasNext()
            if (r19 == 0) goto L_0x046b
            r19 = r5
            java.lang.Object r5 = r9.next()
            r21 = r5
            com.juconnect.connectlife.model.WineInventoryBean r21 = (com.juconnect.connectlife.model.WineInventoryBean) r21
            boolean r21 = r21.isFilteredOut()
            r17 = 1
            r21 = r21 ^ 1
            if (r21 == 0) goto L_0x0468
            r15.add(r5)
        L_0x0468:
            r5 = r19
            goto L_0x044b
        L_0x046b:
            r19 = r5
            r14.add(r15)
            goto L_0x0429
        L_0x0471:
            java.util.Map r1 = r1.getBattleBMap()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x047d:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x04c3
            java.lang.Object r5 = r1.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r9 = r5.getValue()
            r10.add(r9)
            java.lang.Object r5 = r5.getValue()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x049f:
            boolean r15 = r5.hasNext()
            if (r15 == 0) goto L_0x04bb
            java.lang.Object r15 = r5.next()
            r19 = r15
            com.juconnect.connectlife.model.WineInventoryBean r19 = (com.juconnect.connectlife.model.WineInventoryBean) r19
            boolean r19 = r19.isFilteredOut()
            r17 = 1
            r19 = r19 ^ 1
            if (r19 == 0) goto L_0x049f
            r9.add(r15)
            goto L_0x049f
        L_0x04bb:
            r15 = r20
            r17 = 1
            r15.add(r9)
            goto L_0x047d
        L_0x04c3:
            r15 = r20
            java.util.Iterator r1 = r2.iterator()
            r2 = 0
        L_0x04ca:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x04dc
            java.lang.Object r5 = r1.next()
            java.util.List r5 = (java.util.List) r5
            int r5 = r5.size()
            int r2 = r2 + r5
            goto L_0x04ca
        L_0x04dc:
            java.util.Iterator r1 = r3.iterator()
            r3 = 0
        L_0x04e1:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x04f3
            java.lang.Object r5 = r1.next()
            java.util.List r5 = (java.util.List) r5
            int r5 = r5.size()
            int r3 = r3 + r5
            goto L_0x04e1
        L_0x04f3:
            java.util.Iterator r1 = r11.iterator()
            r5 = 0
        L_0x04f8:
            boolean r9 = r1.hasNext()
            if (r9 == 0) goto L_0x050a
            java.lang.Object r9 = r1.next()
            java.util.List r9 = (java.util.List) r9
            int r9 = r9.size()
            int r5 = r5 + r9
            goto L_0x04f8
        L_0x050a:
            java.util.Iterator r1 = r12.iterator()
            r9 = 0
        L_0x050f:
            boolean r11 = r1.hasNext()
            if (r11 == 0) goto L_0x0521
            java.lang.Object r11 = r1.next()
            java.util.List r11 = (java.util.List) r11
            int r11 = r11.size()
            int r9 = r9 + r11
            goto L_0x050f
        L_0x0521:
            java.util.Iterator r1 = r13.iterator()
        L_0x0525:
            boolean r11 = r1.hasNext()
            if (r11 == 0) goto L_0x0535
            java.lang.Object r11 = r1.next()
            java.util.List r11 = (java.util.List) r11
            r11.size()
            goto L_0x0525
        L_0x0535:
            java.util.Iterator r1 = r14.iterator()
        L_0x0539:
            boolean r11 = r1.hasNext()
            if (r11 == 0) goto L_0x0549
            java.lang.Object r11 = r1.next()
            java.util.List r11 = (java.util.List) r11
            r11.size()
            goto L_0x0539
        L_0x0549:
            java.util.Iterator r1 = r15.iterator()
        L_0x054d:
            boolean r11 = r1.hasNext()
            if (r11 == 0) goto L_0x055d
            java.lang.Object r11 = r1.next()
            java.util.List r11 = (java.util.List) r11
            r11.size()
            goto L_0x054d
        L_0x055d:
            java.util.Iterator r1 = r28.iterator()
            r11 = 0
        L_0x0562:
            boolean r12 = r1.hasNext()
            if (r12 == 0) goto L_0x0574
            java.lang.Object r12 = r1.next()
            java.util.List r12 = (java.util.List) r12
            int r12 = r12.size()
            int r11 = r11 + r12
            goto L_0x0562
        L_0x0574:
            java.util.Iterator r1 = r8.iterator()
            r12 = 0
        L_0x0579:
            boolean r13 = r1.hasNext()
            if (r13 == 0) goto L_0x058b
            java.lang.Object r13 = r1.next()
            java.util.List r13 = (java.util.List) r13
            int r13 = r13.size()
            int r12 = r12 + r13
            goto L_0x0579
        L_0x058b:
            java.util.Iterator r1 = r7.iterator()
            r13 = 0
        L_0x0590:
            boolean r14 = r1.hasNext()
            if (r14 == 0) goto L_0x05a2
            java.lang.Object r14 = r1.next()
            java.util.List r14 = (java.util.List) r14
            int r14 = r14.size()
            int r13 = r13 + r14
            goto L_0x0590
        L_0x05a2:
            java.util.Iterator r1 = r6.iterator()
            r14 = 0
        L_0x05a7:
            boolean r15 = r1.hasNext()
            if (r15 == 0) goto L_0x05b9
            java.lang.Object r15 = r1.next()
            java.util.List r15 = (java.util.List) r15
            int r15 = r15.size()
            int r14 = r14 + r15
            goto L_0x05a7
        L_0x05b9:
            java.util.Iterator r1 = r0.iterator()
            r15 = 0
        L_0x05be:
            boolean r17 = r1.hasNext()
            if (r17 == 0) goto L_0x05d1
            java.lang.Object r17 = r1.next()
            java.util.List r17 = (java.util.List) r17
            int r17 = r17.size()
            int r15 = r15 + r17
            goto L_0x05be
        L_0x05d1:
            java.util.Iterator r1 = r4.iterator()
            r17 = 0
        L_0x05d7:
            boolean r19 = r1.hasNext()
            if (r19 == 0) goto L_0x05ea
            java.lang.Object r19 = r1.next()
            java.util.List r19 = (java.util.List) r19
            int r19 = r19.size()
            int r17 = r17 + r19
            goto L_0x05d7
        L_0x05ea:
            java.util.Iterator r1 = r10.iterator()
            r19 = 0
        L_0x05f0:
            boolean r20 = r1.hasNext()
            if (r20 == 0) goto L_0x0603
            java.lang.Object r20 = r1.next()
            java.util.List r20 = (java.util.List) r20
            int r20 = r20.size()
            int r19 = r19 + r20
            goto L_0x05f0
        L_0x0603:
            r28 = r10
            r10 = r25
            android.content.Context r1 = r10.context
            r20 = r0
            boolean r0 = r1 instanceof com.internationalwinecooler.p529ui.inventory.InventoryMainActivity
            if (r0 == 0) goto L_0x0734
            com.internationalwinecooler.ui.inventory.InventoryMainActivity r1 = (com.internationalwinecooler.p529ui.inventory.InventoryMainActivity) r1
            int r0 = r1.getSelectFilterCount()
            java.lang.String r1 = "holder.itemView.bottles_count_c_filtered"
            r21 = r4
            java.lang.String r4 = "holder.itemView.bottles_count_b_filtered"
            r22 = r6
            java.lang.String r6 = "holder.itemView.bottles_count_a_filtered"
            r23 = r7
            java.lang.String r7 = "holder.itemView.bottles_…laced_filtered_count_text"
            if (r0 > 0) goto L_0x0678
            android.content.Context r0 = r10.context
            com.internationalwinecooler.ui.inventory.InventoryMainActivity r0 = (com.internationalwinecooler.p529ui.inventory.InventoryMainActivity) r0
            boolean r0 = r0.isSearchState()
            if (r0 == 0) goto L_0x0630
            goto L_0x0678
        L_0x0630:
            r0 = r26
            r24 = r28
            android.view.View r2 = r0.itemView
            int r3 = com.juconnect.connect_life.R$id.bottles_unplaced_filtered_count_text
            android.view.View r2 = r2.findViewById(r3)
            android.widget.TextView r2 = (android.widget.TextView) r2
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r7)
            r3 = 8
            r2.setVisibility(r3)
            android.view.View r2 = r0.itemView
            int r5 = com.juconnect.connect_life.R$id.bottles_count_a_filtered
            android.view.View r2 = r2.findViewById(r5)
            android.widget.TextView r2 = (android.widget.TextView) r2
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r6)
            r2.setVisibility(r3)
            android.view.View r2 = r0.itemView
            int r5 = com.juconnect.connect_life.R$id.bottles_count_b_filtered
            android.view.View r2 = r2.findViewById(r5)
            android.widget.TextView r2 = (android.widget.TextView) r2
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            r2.setVisibility(r3)
            android.view.View r2 = r0.itemView
            int r4 = com.juconnect.connect_life.R$id.bottles_count_c_filtered
            android.view.View r2 = r2.findViewById(r4)
            android.widget.TextView r2 = (android.widget.TextView) r2
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            r2.setVisibility(r3)
            goto L_0x073e
        L_0x0678:
            r0 = r26
            r24 = r28
            r28 = r8
            android.view.View r8 = r0.itemView
            r16 = r14
            int r14 = com.juconnect.connect_life.R$id.bottles_unplaced_filtered_count_text
            android.view.View r8 = r8.findViewById(r14)
            android.widget.TextView r8 = (android.widget.TextView) r8
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r7)
            r7 = 0
            r8.setVisibility(r7)
            android.view.View r8 = r0.itemView
            int r14 = com.juconnect.connect_life.R$id.bottles_count_a_filtered
            android.view.View r8 = r8.findViewById(r14)
            android.widget.TextView r8 = (android.widget.TextView) r8
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r6)
            r8.setVisibility(r7)
            android.view.View r6 = r0.itemView
            int r8 = com.juconnect.connect_life.R$id.bottles_count_b_filtered
            android.view.View r6 = r6.findViewById(r8)
            android.widget.TextView r6 = (android.widget.TextView) r6
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r4)
            r6.setVisibility(r7)
            android.view.View r4 = r0.itemView
            int r6 = com.juconnect.connect_life.R$id.bottles_count_c_filtered
            android.view.View r4 = r4.findViewById(r6)
            android.widget.TextView r4 = (android.widget.TextView) r4
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r1)
            r4.setVisibility(r7)
            android.view.View r1 = r0.itemView
            int r4 = com.juconnect.connect_life.R$id.bottles_unplaced_filtered_count_text
            android.view.View r1 = r1.findViewById(r4)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            r2 = 47
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r1.setText(r4)
            android.view.View r1 = r0.itemView
            int r4 = com.juconnect.connect_life.R$id.bottles_count_a_filtered
            android.view.View r1 = r1.findViewById(r4)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r4.append(r2)
            java.lang.String r3 = r4.toString()
            r1.setText(r3)
            android.view.View r1 = r0.itemView
            int r3 = com.juconnect.connect_life.R$id.bottles_count_b_filtered
            android.view.View r1 = r1.findViewById(r3)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r5)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            r1.setText(r3)
            android.view.View r1 = r0.itemView
            int r3 = com.juconnect.connect_life.R$id.bottles_count_c_filtered
            android.view.View r1 = r1.findViewById(r3)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.setText(r2)
            goto L_0x0742
        L_0x0734:
            r0 = r26
            r24 = r28
            r21 = r4
            r22 = r6
            r23 = r7
        L_0x073e:
            r28 = r8
            r16 = r14
        L_0x0742:
            android.view.View r1 = r0.itemView
            int r2 = com.juconnect.connect_life.R$id.bottles_unplaced_count_text
            android.view.View r1 = r1.findViewById(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r2 = java.lang.String.valueOf(r11)
            r1.setText(r2)
            com.hisense.connect_life.hismart.networks.request.device.DeviceCache$Companion r1 = com.hisense.connect_life.hismart.networks.request.device.DeviceCache.Companion
            com.hisense.connect_life.hismart.networks.request.device.DeviceCache r1 = r1.getInstance()
            java.util.List<com.internationalwinecooler.ui.model.ExpandableGroupEntity> r2 = r10.mGroups
            if (r2 != 0) goto L_0x0766
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r18)
            r3 = r27
            r6 = r20
            r2 = 0
            goto L_0x076a
        L_0x0766:
            r3 = r27
            r6 = r20
        L_0x076a:
            java.lang.Object r2 = r2.get(r3)
            com.internationalwinecooler.ui.model.ExpandableGroupEntity r2 = (com.internationalwinecooler.p529ui.model.ExpandableGroupEntity) r2
            java.lang.String r2 = r2.getAuid()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            int r1 = r1.isDeviceType(r2)
            com.hisense.connect_life.hismart.networks.request.device.DeviceCache$Companion r2 = com.hisense.connect_life.hismart.networks.request.device.DeviceCache.Companion
            com.hisense.connect_life.hismart.networks.request.device.DeviceCache r2 = r2.getInstance()
            int r2 = r2.getBattleSingleZoneDevice()
            if (r1 != r2) goto L_0x079a
            android.view.View r1 = r0.itemView
            int r2 = com.juconnect.connect_life.R$id.bottles_count_a
            android.view.View r1 = r1.findViewById(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r2 = java.lang.String.valueOf(r15)
            r1.setText(r2)
            goto L_0x081b
        L_0x079a:
            com.hisense.connect_life.hismart.networks.request.device.DeviceCache$Companion r1 = com.hisense.connect_life.hismart.networks.request.device.DeviceCache.Companion
            com.hisense.connect_life.hismart.networks.request.device.DeviceCache r1 = r1.getInstance()
            java.util.List<com.internationalwinecooler.ui.model.ExpandableGroupEntity> r2 = r10.mGroups
            if (r2 != 0) goto L_0x07a8
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r18)
            r2 = 0
        L_0x07a8:
            java.lang.Object r2 = r2.get(r3)
            com.internationalwinecooler.ui.model.ExpandableGroupEntity r2 = (com.internationalwinecooler.p529ui.model.ExpandableGroupEntity) r2
            java.lang.String r2 = r2.getAuid()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            int r1 = r1.isDeviceType(r2)
            com.hisense.connect_life.hismart.networks.request.device.DeviceCache$Companion r2 = com.hisense.connect_life.hismart.networks.request.device.DeviceCache.Companion
            com.hisense.connect_life.hismart.networks.request.device.DeviceCache r2 = r2.getInstance()
            int r2 = r2.getBattleTwoZoneDevice()
            if (r1 != r2) goto L_0x07e8
            android.view.View r1 = r0.itemView
            int r2 = com.juconnect.connect_life.R$id.bottles_count_a
            android.view.View r1 = r1.findViewById(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r2 = java.lang.String.valueOf(r17)
            r1.setText(r2)
            android.view.View r1 = r0.itemView
            int r2 = com.juconnect.connect_life.R$id.bottles_count_b
            android.view.View r1 = r1.findViewById(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r2 = java.lang.String.valueOf(r19)
            r1.setText(r2)
            goto L_0x081b
        L_0x07e8:
            android.view.View r1 = r0.itemView
            int r2 = com.juconnect.connect_life.R$id.bottles_count_a
            android.view.View r1 = r1.findViewById(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r2 = java.lang.String.valueOf(r12)
            r1.setText(r2)
            android.view.View r1 = r0.itemView
            int r2 = com.juconnect.connect_life.R$id.bottles_count_b
            android.view.View r1 = r1.findViewById(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r2 = java.lang.String.valueOf(r13)
            r1.setText(r2)
            android.view.View r1 = r0.itemView
            int r2 = com.juconnect.connect_life.R$id.bottles_count_c
            android.view.View r1 = r1.findViewById(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r2 = java.lang.String.valueOf(r16)
            r1.setText(r2)
        L_0x081b:
            java.util.List<com.internationalwinecooler.ui.model.ExpandableGroupEntity> r1 = r10.mGroups
            if (r1 != 0) goto L_0x0824
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r18)
            r5 = 0
            goto L_0x0825
        L_0x0824:
            r5 = r1
        L_0x0825:
            java.lang.Object r1 = r5.get(r3)
            com.internationalwinecooler.ui.model.ExpandableGroupEntity r1 = (com.internationalwinecooler.p529ui.model.ExpandableGroupEntity) r1
            java.lang.String r1 = r1.getAuid()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            r9 = r0
            r0 = r25
            r2 = r26
            r3 = r28
            r7 = r21
            r4 = r23
            r5 = r22
            r8 = r24
            r0.initAdapter(r1, r2, r3, r4, r5, r6, r7, r8)
            r25.setZoneClickStateChange(r26)
            android.view.View r0 = r9.itemView
            int r1 = com.juconnect.connect_life.R$id.unplaced_layout
            android.view.View r0 = r0.findViewById(r1)
            java.lang.String r1 = "holder.itemView.unplaced_layout"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            com.internationalwinecooler.ui.adapter.cabinet_exact.InventoryExactMainExpandAdapter$onBindChildViewHolder$23 r1 = new com.internationalwinecooler.ui.adapter.cabinet_exact.InventoryExactMainExpandAdapter$onBindChildViewHolder$23
            r1.<init>(r10, r9)
            com.hisense.connect_life.core.extentions.JuConnectExtKt.singleClickListener(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.internationalwinecooler.p529ui.adapter.cabinet_exact.InventoryExactMainExpandAdapter.onBindChildViewHolder(com.donkingliang.groupedadapter.holder.BaseViewHolder, int, int):void");
    }

    public void onBindFooterViewHolder(@NotNull BaseViewHolder baseViewHolder, int i) {
        Intrinsics.checkNotNullParameter(baseViewHolder, "holder");
    }

    public void onBindHeaderViewHolder(@NotNull BaseViewHolder baseViewHolder, int i) {
        Intrinsics.checkNotNullParameter(baseViewHolder, "holder");
        List<ExpandableGroupEntity> list = this.mGroups;
        String str = null;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGroups");
            list = null;
        }
        if (!list.isEmpty()) {
            List<ExpandableGroupEntity> list2 = this.mGroups;
            if (list2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mGroups");
                list2 = null;
            }
            ExpandableGroupEntity expandableGroupEntity = list2.get(i);
            String auid = expandableGroupEntity.getAuid();
            if (auid != null) {
                DeviceInfo device = DeviceCache.Companion.getInstance().getDevice(auid);
                if (TextUtils.isEmpty(device == null ? null : device.getDeviceNickName())) {
                    ((TextView) baseViewHolder.itemView.findViewById(R$id.wine_cooler_name_text)).setText(expandableGroupEntity.getAuid());
                } else {
                    TextView textView = (TextView) baseViewHolder.itemView.findViewById(R$id.wine_cooler_name_text);
                    DeviceInfo device2 = DeviceCache.Companion.getInstance().getDevice(auid);
                    if (device2 != null) {
                        str = device2.getDeviceNickName();
                    }
                    textView.setText(str);
                }
            }
            baseViewHolder.mo22538b(R.id.bottles_count, expandableGroupEntity.getBottlesCount());
            Context context2 = this.context;
            if (context2 instanceof InventoryMainActivity) {
                if (((InventoryMainActivity) context2).getSelectFilterCount() > 0 || ((InventoryMainActivity) this.context).isSearchState()) {
                    TextView textView2 = (TextView) baseViewHolder.itemView.findViewById(R$id.bottles_filter_count);
                    Intrinsics.checkNotNullExpressionValue(textView2, "holder.itemView.bottles_filter_count");
                    textView2.setVisibility(0);
                    ((TextView) baseViewHolder.itemView.findViewById(R$id.bottles_filter_count)).setText(Intrinsics.stringPlus(expandableGroupEntity.getFilterBottlesCount(), "/"));
                } else {
                    TextView textView3 = (TextView) baseViewHolder.itemView.findViewById(R$id.bottles_filter_count);
                    Intrinsics.checkNotNullExpressionValue(textView3, "holder.itemView.bottles_filter_count");
                    textView3.setVisibility(8);
                }
            }
            if (expandableGroupEntity.isExpand()) {
                ((IconFontView) baseViewHolder.itemView.findViewById(R$id.wine_cooler_name_icon)).setText(this.context.getString(R.string.btn_main_unfold_up));
            } else {
                ((IconFontView) baseViewHolder.itemView.findViewById(R$id.wine_cooler_name_icon)).setText(this.context.getString(R.string.btn_main_unfold_down));
            }
        }
    }

    public final void setData(@NotNull List<ExpandableGroupEntity> list, @NotNull Map<String, ? extends List<WineInventoryBean>> map) {
        Intrinsics.checkNotNullParameter(list, "mGroups");
        Intrinsics.checkNotNullParameter(map, "wineAuidSortMap");
        this.mGroups = list;
        this.wineAuidSortMap = map;
    }

    public final void setIItemCallback(@NotNull IItemCallback<? super Integer> iItemCallback2) {
        Intrinsics.checkNotNullParameter(iItemCallback2, "iItemCallback");
        this.iItemCallback = iItemCallback2;
    }

    public final void setUnplacedLayoutState(boolean z, @NotNull BaseViewHolder baseViewHolder) {
        Intrinsics.checkNotNullParameter(baseViewHolder, "holder");
        if (z) {
            ((RelativeLayout) baseViewHolder.itemView.findViewById(R$id.bottles_layout)).setBackgroundResource(R.drawable.inventory_rectangle_black_select);
            ((IconFontView) baseViewHolder.itemView.findViewById(R$id.bottles_icon)).setTextColor(C1499f.m915a(R.color.colorWhite));
            ((TextView) baseViewHolder.itemView.findViewById(R$id.text_unplaced)).setTextColor(C1499f.m915a(R.color.colorBlack));
            ((TextView) baseViewHolder.itemView.findViewById(R$id.bottles_unplaced_count_text)).setTextColor(C1499f.m915a(R.color.colorBlack));
            ((IconFontView) baseViewHolder.itemView.findViewById(R$id.bottles_count_icon)).setTextColor(C1499f.m915a(R.color.colorBlack));
            return;
        }
        ((RelativeLayout) baseViewHolder.itemView.findViewById(R$id.bottles_layout)).setBackgroundResource(R.drawable.inventory_rectangle_black);
        ((IconFontView) baseViewHolder.itemView.findViewById(R$id.bottles_icon)).setTextColor(C1499f.m915a(R.color.colorBlack));
        ((TextView) baseViewHolder.itemView.findViewById(R$id.text_unplaced)).setTextColor(C1499f.m915a(R.color.transparent_99));
        ((TextView) baseViewHolder.itemView.findViewById(R$id.bottles_unplaced_count_text)).setTextColor(C1499f.m915a(R.color.transparent_99));
        ((IconFontView) baseViewHolder.itemView.findViewById(R$id.bottles_count_icon)).setTextColor(C1499f.m915a(R.color.transparent_99));
    }

    public final void collapseGroup(int i, boolean z) {
        List<ExpandableGroupEntity> list = this.mGroups;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGroups");
            list = null;
        }
        list.get(i).setExpand(false);
        if (z) {
            notifyChildrenRemoved(i);
        } else {
            notifyDataChanged();
        }
        this.expandItemList.remove(Integer.valueOf(i));
    }

    public final void expandGroup(int i, boolean z) {
        List<ExpandableGroupEntity> list = this.mGroups;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGroups");
            list = null;
        }
        list.get(i).setExpand(true);
        if (z) {
            notifyChildrenInserted(i);
        } else {
            notifyDataChanged();
        }
        this.expandItemList.add(Integer.valueOf(i));
    }
}
