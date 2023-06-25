package com.internationalwinecooler.p529ui.adapter.cabinet_generic;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.donkingliang.groupedadapter.adapter.GroupedRecyclerViewAdapter;
import com.donkingliang.groupedadapter.holder.BaseViewHolder;
import com.hisense.connect_life.core.listener.IItemCallback;
import com.hisense.connect_life.core.widget.IconFontView;
import com.hisense.connect_life.hismart.networks.request.device.DeviceCache;
import com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo;
import com.hisense.juconnect.connectlife.R;
import com.internationalwinecooler.p529ui.inventory.InventoryMainActivity;
import com.internationalwinecooler.p529ui.model.ChildEntity;
import com.internationalwinecooler.p529ui.model.ExpandableGroupEntity;
import com.internationalwinecooler.p529ui.model.GroupModel;
import com.juconnect.connect_life.R$id;
import com.juconnect.connectlife.model.WineInventoryBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p482v.p483a.p484d.p486b.C7600a;

@Metadata(mo47990d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0005J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0018\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u000e\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0005J\u0016\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001dJ\u0016\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u00050\nj\b\u0012\u0004\u0012\u00020\u0005`\u000bJ\u0010\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u0005H\u0016J\u0010\u0010#\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0005H\u0016J\u0010\u0010$\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u0005H\u0016J\b\u0010%\u001a\u00020\u0005H\u0016J\u0010\u0010&\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u0005H\u0016J\u0010\u0010'\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u0005H\u0016J\u0010\u0010(\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u0005H\u0016J\u000e\u0010)\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u0005J \u0010*\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020,2\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\u0005H\u0016J\u0018\u0010.\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020,2\u0006\u0010\u001b\u001a\u00020\u0005H\u0016J\u0018\u0010/\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020,2\u0006\u0010\u001b\u001a\u00020\u0005H\u0016J0\u00100\u001a\u00020\u001a2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u001a\u0010\u0013\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00110\u0014J\u0014\u00101\u001a\u00020\u001a2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\rJ\u0016\u00102\u001a\u00020\u001a2\u0006\u00103\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020,J\u0010\u00104\u001a\u00020\u001a2\u0006\u00105\u001a\u00020\u001dH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00050\nj\b\u0012\u0004\u0012\u00020\u0005`\u000bX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X.¢\u0006\u0002\n\u0000R\"\u0010\u0013\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00110\u0014X.¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u00066"}, mo47991d2 = {"Lcom/internationalwinecooler/ui/adapter/cabinet_generic/InventoryZoneMainExpandAdapter;", "Lcom/donkingliang/groupedadapter/adapter/GroupedRecyclerViewAdapter;", "context", "Landroid/content/Context;", "zoneType", "", "(Landroid/content/Context;I)V", "getContext", "()Landroid/content/Context;", "expandItemList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "iItemCallback", "Lcom/hisense/connect_life/core/listener/IItemCallback;", "itemGroupAdapter", "Lcom/internationalwinecooler/ui/adapter/cabinet_generic/InventoryZoneItemGroupAdapter;", "mGroups", "", "Lcom/internationalwinecooler/ui/model/ExpandableGroupEntity;", "wineAuidSortMap", "", "", "Lcom/juconnect/connectlife/model/WineInventoryBean;", "getZoneType", "()I", "collapseGroup", "", "groupPosition", "animate", "", "expandAndCloseElseGroup", "expandGroup", "expandGroupList", "getChildLayout", "viewType", "getChildrenCount", "getFooterLayout", "getGroupCount", "getHeaderLayout", "hasFooter", "hasHeader", "isExpand", "onBindChildViewHolder", "holder", "Lcom/donkingliang/groupedadapter/holder/BaseViewHolder;", "childPosition", "onBindFooterViewHolder", "onBindHeaderViewHolder", "setData", "setIItemCallback", "setUnplacedLayoutState", "isSelect", "setZoneTopViewShowOrHide", "isHide", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.adapter.cabinet_generic.InventoryZoneMainExpandAdapter */
/* compiled from: InventoryZoneMainExpandAdapter.kt */
public final class InventoryZoneMainExpandAdapter extends GroupedRecyclerViewAdapter {
    @NotNull
    public final Context context;
    @NotNull
    public ArrayList<Integer> expandItemList = new ArrayList<>();
    @Nullable
    public IItemCallback<? super Integer> iItemCallback;
    public InventoryZoneItemGroupAdapter itemGroupAdapter;
    public List<ExpandableGroupEntity> mGroups;
    public Map<String, ? extends List<WineInventoryBean>> wineAuidSortMap;
    public final int zoneType;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InventoryZoneMainExpandAdapter(@NotNull Context context2, int i) {
        super(context2);
        Intrinsics.checkNotNullParameter(context2, "context");
        this.context = context2;
        this.zoneType = i;
    }

    private final void expandAndCloseElseGroup(int i, boolean z) {
        boolean z2;
        List<ExpandableGroupEntity> list = this.mGroups;
        List<ExpandableGroupEntity> list2 = null;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGroups");
            list = null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            z2 = false;
            if (!it.hasNext()) {
                break;
            }
            ExpandableGroupEntity expandableGroupEntity = (ExpandableGroupEntity) it.next();
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
        ExpandableGroupEntity expandableGroupEntity2 = list2.get(i);
        expandableGroupEntity2.setExpand(true);
        if (z) {
            notifyChildrenInserted(i);
        } else {
            notifyDataChanged();
        }
        DeviceCache instance = DeviceCache.Companion.getInstance();
        String auid = expandableGroupEntity2.getAuid();
        Intrinsics.checkNotNull(auid);
        if (instance.isDeviceType(auid) == DeviceCache.Companion.getInstance().getSingleZoneDevice()) {
            z2 = true;
        }
        setZoneTopViewShowOrHide(z2);
        this.expandItemList.clear();
        this.expandItemList.add(Integer.valueOf(i));
    }

    /* renamed from: onBindChildViewHolder$lambda-1  reason: not valid java name */
    public static final void m27182onBindChildViewHolder$lambda1(InventoryZoneMainExpandAdapter inventoryZoneMainExpandAdapter, InventoryZoneItemGroupAdapter inventoryZoneItemGroupAdapter, GroupedRecyclerViewAdapter groupedRecyclerViewAdapter, BaseViewHolder baseViewHolder, int i) {
        Intrinsics.checkNotNullParameter(inventoryZoneMainExpandAdapter, "this$0");
        Intrinsics.checkNotNullParameter(inventoryZoneItemGroupAdapter, "$itemGroupAdapter");
        Context context2 = inventoryZoneMainExpandAdapter.context;
        if (context2 instanceof InventoryMainActivity) {
            Intrinsics.checkNotNullExpressionValue(baseViewHolder, "mHolder");
            ((InventoryMainActivity) context2).showUnplacedDialog(baseViewHolder);
            inventoryZoneItemGroupAdapter.setUnplacedLayoutState(true, baseViewHolder);
            inventoryZoneMainExpandAdapter.itemGroupAdapter = inventoryZoneItemGroupAdapter;
        }
    }

    private final void setZoneTopViewShowOrHide(boolean z) {
        Context context2 = this.context;
        if (context2 instanceof InventoryMainActivity) {
            ((InventoryMainActivity) context2).setGenericZoneTopViewShowOrHide(z);
        }
    }

    public final void collapseGroup(int i) {
        collapseGroup(i, false);
        setZoneTopViewShowOrHide(false);
    }

    public final void expandGroup(int i) {
        expandAndCloseElseGroup(i, false);
    }

    @NotNull
    public final ArrayList<Integer> expandGroupList() {
        return this.expandItemList;
    }

    public int getChildLayout(int i) {
        return R.layout.fragment_zone_main_layout_child;
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
        return R.layout.fragment_zone_main_layout_header;
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

    public void onBindChildViewHolder(@NotNull BaseViewHolder baseViewHolder, int i, int i2) {
        Intrinsics.checkNotNullParameter(baseViewHolder, "holder");
        List<ExpandableGroupEntity> list = this.mGroups;
        Map<String, ? extends List<WineInventoryBean>> map = null;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGroups");
            list = null;
        }
        ChildEntity childEntity = list.get(i).getChildren().get(i2);
        Intrinsics.checkNotNullExpressionValue(childEntity, "mGroups[groupPosition].children[childPosition]");
        ChildEntity childEntity2 = childEntity;
        int size = childEntity2.getZoneAMap().size() + childEntity2.getZoneBMap().size() + childEntity2.getZoneCMap().size();
        RecyclerView recyclerView = (RecyclerView) baseViewHolder.itemView.findViewById(R$id.zone_main_child_recycler_view);
        ArrayList arrayList = new ArrayList();
        GroupModel.Companion companion = GroupModel.Companion;
        Map<String, ? extends List<WineInventoryBean>> map2 = this.wineAuidSortMap;
        if (map2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("wineAuidSortMap");
        } else {
            map = map2;
        }
        ExpandableGroupEntity expandableGroupEntity = companion.getGenericExpandableGroups(false, 1, size, map).get(i);
        Intrinsics.checkNotNullExpressionValue(expandableGroupEntity, "GroupModel.getGenericExp…\n        )[groupPosition]");
        arrayList.clear();
        arrayList.add(expandableGroupEntity);
        Context context2 = this.mContext;
        Intrinsics.checkNotNullExpressionValue(context2, "mContext");
        InventoryZoneItemGroupAdapter inventoryZoneItemGroupAdapter = new InventoryZoneItemGroupAdapter(context2, arrayList, this.zoneType);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.mContext);
        linearLayoutManager.setOrientation(1);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(false);
        inventoryZoneItemGroupAdapter.setOnHeaderClickListener(new C7600a(this, inventoryZoneItemGroupAdapter));
        inventoryZoneItemGroupAdapter.setIItemCallback(new InventoryZoneMainExpandAdapter$onBindChildViewHolder$2(this));
        recyclerView.setAdapter(inventoryZoneItemGroupAdapter);
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
                    ((TextView) baseViewHolder.itemView.findViewById(R$id.wine_cooler_name_text)).setText(auid);
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
        InventoryZoneItemGroupAdapter inventoryZoneItemGroupAdapter = this.itemGroupAdapter;
        if (inventoryZoneItemGroupAdapter != null) {
            if (inventoryZoneItemGroupAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("itemGroupAdapter");
                inventoryZoneItemGroupAdapter = null;
            }
            inventoryZoneItemGroupAdapter.setUnplacedLayoutState(z, baseViewHolder);
        }
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

    private final void collapseGroup(int i, boolean z) {
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
}
