package com.internationalwinecooler.p529ui.adapter.cabinet_generic;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.donkingliang.groupedadapter.adapter.GroupedRecyclerViewAdapter;
import com.donkingliang.groupedadapter.holder.BaseViewHolder;
import com.hisense.connect_life.core.listener.IItemCallback;
import com.hisense.connect_life.core.widget.IconFontView;
import com.hisense.connect_life.hismart.networks.request.device.DeviceCache;
import com.hisense.juconnect.connectlife.R;
import com.internationalwinecooler.p529ui.model.ChildEntity;
import com.internationalwinecooler.p529ui.model.ExpandableGroupEntity;
import com.juconnect.connect_life.R$id;
import com.juconnect.connectlife.model.WineInventoryBean;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p072c.p073a.p074a.C1499f;

@Metadata(mo47990d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0016J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\tH\u0016J\u0010\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0016J\b\u0010\u0018\u001a\u00020\tH\u0016J\u0010\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0016J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\tH\u0016J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\tH\u0016J \u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010!\u001a\u00020\tH\u0016J\u0018\u0010\"\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\tH\u0016J\u0018\u0010#\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\tH\u0016J \u0010$\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010!\u001a\u00020\tH\u0003J\u0018\u0010%\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\tH\u0002J\u0014\u0010&\u001a\u00020\u001e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000eJ\u0016\u0010'\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006)"}, mo47991d2 = {"Lcom/internationalwinecooler/ui/adapter/cabinet_generic/InventoryZoneItemGroupAdapter;", "Lcom/donkingliang/groupedadapter/adapter/GroupedRecyclerViewAdapter;", "context", "Landroid/content/Context;", "mGroups", "Ljava/util/ArrayList;", "Lcom/internationalwinecooler/ui/model/ExpandableGroupEntity;", "Lkotlin/collections/ArrayList;", "zoneType", "", "(Landroid/content/Context;Ljava/util/ArrayList;I)V", "getContext", "()Landroid/content/Context;", "iItemCallback", "Lcom/hisense/connect_life/core/listener/IItemCallback;", "getMGroups", "()Ljava/util/ArrayList;", "getZoneType", "()I", "getChildLayout", "viewType", "getChildrenCount", "groupPosition", "getFooterLayout", "getGroupCount", "getHeaderLayout", "hasFooter", "", "hasHeader", "onBindChildViewHolder", "", "holder", "Lcom/donkingliang/groupedadapter/holder/BaseViewHolder;", "childPosition", "onBindFooterViewHolder", "onBindHeaderViewHolder", "setChildViewData", "setHeaderViewData", "setIItemCallback", "setUnplacedLayoutState", "isSelect", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.adapter.cabinet_generic.InventoryZoneItemGroupAdapter */
/* compiled from: InventoryZoneItemGroupAdapter.kt */
public final class InventoryZoneItemGroupAdapter extends GroupedRecyclerViewAdapter {
    @NotNull
    public final Context context;
    @Nullable
    public IItemCallback<? super Integer> iItemCallback;
    @NotNull
    public final ArrayList<ExpandableGroupEntity> mGroups;
    public final int zoneType;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InventoryZoneItemGroupAdapter(@NotNull Context context2, @NotNull ArrayList<ExpandableGroupEntity> arrayList, int i) {
        super(context2);
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(arrayList, "mGroups");
        this.context = context2;
        this.mGroups = arrayList;
        this.zoneType = i;
    }

    @SuppressLint({"SetTextI18n"})
    private final void setChildViewData(BaseViewHolder baseViewHolder, int i, int i2) {
        String auid = this.mGroups.get(i).getAuid();
        ChildEntity childEntity = this.mGroups.get(i).getChildren().get(0);
        Intrinsics.checkNotNullExpressionValue(childEntity, "mGroups[groupPosition].children[0]");
        ChildEntity childEntity2 = childEntity;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        DeviceCache instance = DeviceCache.Companion.getInstance();
        Intrinsics.checkNotNull(auid);
        if (instance.isDeviceType(auid) == DeviceCache.Companion.getInstance().getSingleZoneDevice()) {
            for (Map.Entry next : childEntity2.getZoneAMapSingle().entrySet()) {
                arrayList2.add(new Pair(next.getKey(), next.getValue()));
            }
        } else if (DeviceCache.Companion.getInstance().isDeviceType(auid) == DeviceCache.Companion.getInstance().getBattleSingleZoneDevice()) {
            for (Map.Entry next2 : childEntity2.getBattleMapSingle().entrySet()) {
                arrayList2.add(new Pair(next2.getKey(), next2.getValue()));
            }
        } else if (DeviceCache.Companion.getInstance().isDeviceType(auid) == DeviceCache.Companion.getInstance().getBattleTwoZoneDevice()) {
            for (Map.Entry next3 : childEntity2.getBattleAMap().entrySet()) {
                arrayList2.add(new Pair(next3.getKey(), next3.getValue()));
            }
            for (Map.Entry next4 : childEntity2.getBattleBMap().entrySet()) {
                arrayList2.add(new Pair(next4.getKey(), next4.getValue()));
            }
        } else {
            for (Map.Entry next5 : childEntity2.getZoneAMap().entrySet()) {
                arrayList2.add(new Pair(next5.getKey(), next5.getValue()));
            }
            for (Map.Entry next6 : childEntity2.getZoneBMap().entrySet()) {
                arrayList2.add(new Pair(next6.getKey(), next6.getValue()));
            }
            for (Map.Entry next7 : childEntity2.getZoneCMap().entrySet()) {
                arrayList2.add(new Pair(next7.getKey(), next7.getValue()));
            }
        }
        ((TextView) baseViewHolder.itemView.findViewById(R$id.text_shelf_name)).setText(String.valueOf(((Pair) arrayList2.get(i2)).getFirst()));
        ((TextView) baseViewHolder.itemView.findViewById(R$id.text_bottles_num)).setText(Intrinsics.stringPlus(" ", Integer.valueOf(((List) ((Pair) arrayList2.get(i2)).getSecond()).size())));
        arrayList.clear();
        arrayList.addAll((Collection) ((Pair) arrayList2.get(i2)).getSecond());
        Context context2 = this.mContext;
        Intrinsics.checkNotNullExpressionValue(context2, "mContext");
        InventoryHorizontalAdapter inventoryHorizontalAdapter = new InventoryHorizontalAdapter(context2, arrayList);
        ((RecyclerView) baseViewHolder.itemView.findViewById(R$id.wine_zone_item_recycler)).setLayoutManager(new LinearLayoutManager(this.mContext, 0, false));
        ((RecyclerView) baseViewHolder.itemView.findViewById(R$id.wine_zone_item_recycler)).setHasFixedSize(false);
        inventoryHorizontalAdapter.setIItemCallback(new InventoryZoneItemGroupAdapter$setChildViewData$8(this));
        ((RecyclerView) baseViewHolder.itemView.findViewById(R$id.wine_zone_item_recycler)).setAdapter(inventoryHorizontalAdapter);
    }

    private final void setHeaderViewData(BaseViewHolder baseViewHolder, int i) {
        int i2 = 0;
        ChildEntity childEntity = this.mGroups.get(i).getChildren().get(0);
        Intrinsics.checkNotNullExpressionValue(childEntity, "mGroups[groupPosition].children[0]");
        for (Map.Entry<String, List<WineInventoryBean>> value : childEntity.getUnplacedMap().entrySet()) {
            i2 += ((List) value.getValue()).size();
        }
        baseViewHolder.mo22538b(R.id.bottles_count_text, String.valueOf(i2));
    }

    public int getChildLayout(int i) {
        return R.layout.fragment_zone_main_item_layout_child;
    }

    public int getChildrenCount(int i) {
        int i2;
        int i3;
        DeviceCache instance = DeviceCache.Companion.getInstance();
        String auid = this.mGroups.get(i).getAuid();
        Intrinsics.checkNotNull(auid);
        if (instance.isDeviceType(auid) == DeviceCache.Companion.getInstance().getSingleZoneDevice()) {
            return this.mGroups.get(i).getChildren().get(0).getZoneAMapSingle().size();
        }
        DeviceCache instance2 = DeviceCache.Companion.getInstance();
        String auid2 = this.mGroups.get(i).getAuid();
        Intrinsics.checkNotNull(auid2);
        if (instance2.isDeviceType(auid2) == DeviceCache.Companion.getInstance().getBattleSingleZoneDevice()) {
            return this.mGroups.get(i).getChildren().get(0).getBattleMapSingle().size();
        }
        DeviceCache instance3 = DeviceCache.Companion.getInstance();
        String auid3 = this.mGroups.get(i).getAuid();
        Intrinsics.checkNotNull(auid3);
        if (instance3.isDeviceType(auid3) == DeviceCache.Companion.getInstance().getBattleTwoZoneDevice()) {
            i3 = this.mGroups.get(i).getChildren().get(0).getBattleAMap().size();
            i2 = this.mGroups.get(i).getChildren().get(0).getBattleBMap().size();
        } else {
            i3 = this.mGroups.get(i).getChildren().get(0).getZoneAMap().size() + this.mGroups.get(i).getChildren().get(0).getZoneBMap().size();
            i2 = this.mGroups.get(i).getChildren().get(0).getZoneCMap().size();
        }
        return i2 + i3;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    public int getFooterLayout(int i) {
        return 0;
    }

    public int getGroupCount() {
        return this.mGroups.size();
    }

    public int getHeaderLayout(int i) {
        return R.layout.fragment_zone_main_item_layout_header;
    }

    @NotNull
    public final ArrayList<ExpandableGroupEntity> getMGroups() {
        return this.mGroups;
    }

    public final int getZoneType() {
        return this.zoneType;
    }

    public boolean hasFooter(int i) {
        return false;
    }

    public boolean hasHeader(int i) {
        return this.zoneType != 100;
    }

    public void onBindChildViewHolder(@NotNull BaseViewHolder baseViewHolder, int i, int i2) {
        Intrinsics.checkNotNullParameter(baseViewHolder, "holder");
        setChildViewData(baseViewHolder, i, i2);
    }

    public void onBindFooterViewHolder(@NotNull BaseViewHolder baseViewHolder, int i) {
        Intrinsics.checkNotNullParameter(baseViewHolder, "holder");
    }

    public void onBindHeaderViewHolder(@NotNull BaseViewHolder baseViewHolder, int i) {
        Intrinsics.checkNotNullParameter(baseViewHolder, "holder");
        setHeaderViewData(baseViewHolder, i);
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
            ((TextView) baseViewHolder.itemView.findViewById(R$id.bottles_count_text)).setTextColor(C1499f.m915a(R.color.colorBlack));
            ((IconFontView) baseViewHolder.itemView.findViewById(R$id.bottles_count_icon)).setTextColor(C1499f.m915a(R.color.colorBlack));
            return;
        }
        ((RelativeLayout) baseViewHolder.itemView.findViewById(R$id.bottles_layout)).setBackgroundResource(R.drawable.inventory_rectangle_black);
        ((IconFontView) baseViewHolder.itemView.findViewById(R$id.bottles_icon)).setTextColor(C1499f.m915a(R.color.colorBlack));
        ((TextView) baseViewHolder.itemView.findViewById(R$id.text_unplaced)).setTextColor(C1499f.m915a(R.color.transparent_99));
        ((TextView) baseViewHolder.itemView.findViewById(R$id.bottles_count_text)).setTextColor(C1499f.m915a(R.color.transparent_99));
        ((IconFontView) baseViewHolder.itemView.findViewById(R$id.bottles_count_icon)).setTextColor(C1499f.m915a(R.color.transparent_99));
    }
}
