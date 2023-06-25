package com.internationalwinecooler.p529ui.fragment.cabinet_generic;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.donkingliang.groupedadapter.adapter.GroupedRecyclerViewAdapter;
import com.donkingliang.groupedadapter.holder.BaseViewHolder;
import com.donkingliang.groupedadapter.widget.StickyHeaderLayout;
import com.hisense.connect_life.core.base.BaseFragment;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.utils.LogUtilsShen;
import com.hisense.connect_life.core.utils.SPUtils;
import com.hisense.connect_life.hismart.networks.request.device.DeviceCache;
import com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo;
import com.hisense.connect_life.hismart.networks.request.wine.model.FilterCondition;
import com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo;
import com.hisense.connect_life.hismart.sql.account.LoginUserInfoProvider;
import com.hisense.connect_life.hismart.sql.account.LoginUserInfoRoom;
import com.hisense.juconnect.connectlife.R;
import com.internationalwinecooler.p529ui.WineCabinetListModel;
import com.internationalwinecooler.p529ui.adapter.cabinet_generic.InventoryZoneMainExpandAdapter;
import com.internationalwinecooler.p529ui.inventory.InventoryMainActivity;
import com.internationalwinecooler.p529ui.model.EventBottleNum;
import com.internationalwinecooler.p529ui.model.GroupModel;
import com.juconnect.connect_life.R$id;
import com.juconnect.connectlife.model.WineInventoryBean;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.greenrobot.eventbus.EventBus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p482v.p483a.p487e.p489b.C7604a;
import p040c.p482v.p483a.p487e.p489b.C7605b;
import p040c.p482v.p483a.p487e.p489b.C7606c;

@Metadata(mo47990d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010!\u001a\u00020\fH\u0014J&\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0014\u0010&\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0018\u00010\u0014H\u0002J&\u0010'\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0014\u0010(\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0018\u00010\u0014H\u0002J\u0010\u0010)\u001a\u00020#2\b\u0010*\u001a\u0004\u0018\u00010+J\u0010\u0010,\u001a\u00020#2\u0006\u0010-\u001a\u00020.H\u0014J\u0010\u0010/\u001a\u00020#2\u0006\u00100\u001a\u000201H\u0016J$\u00102\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0014\u0010&\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0018\u00010\u0014J\u0006\u00103\u001a\u00020#J\b\u00104\u001a\u00020#H\u0002J\b\u00105\u001a\u00020#H\u0014J\u0016\u00106\u001a\u00020#2\u0006\u00107\u001a\u00020%2\u0006\u00108\u001a\u000209R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0012X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\fXD¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000eR\u000e\u0010\u0018\u001a\u00020\u0019X.¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u00020\fXD¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u000eR\u0014\u0010\u001c\u001a\u00020\fXD¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u000eR\u001a\u0010\u001e\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010\u0010¨\u0006:"}, mo47991d2 = {"Lcom/internationalwinecooler/ui/fragment/cabinet_generic/InventoryGenericCabinetZoneBaseFragment;", "Lcom/hisense/connect_life/core/base/BaseFragment;", "()V", "inventoryWineViewModel", "Lcom/internationalwinecooler/ui/WineCabinetListModel;", "getInventoryWineViewModel", "()Lcom/internationalwinecooler/ui/WineCabinetListModel;", "inventoryWineViewModel$delegate", "Lkotlin/Lazy;", "parentActivity", "Lcom/internationalwinecooler/ui/inventory/InventoryMainActivity;", "unplacedBottlesCount", "", "getUnplacedBottlesCount", "()I", "setUnplacedBottlesCount", "(I)V", "wineAuidSortMap", "", "", "", "Lcom/juconnect/connectlife/model/WineInventoryBean;", "zoneAType", "getZoneAType", "zoneAdapter", "Lcom/internationalwinecooler/ui/adapter/cabinet_generic/InventoryZoneMainExpandAdapter;", "zoneBType", "getZoneBType", "zoneCType", "getZoneCType", "zoneType", "getZoneType", "setZoneType", "bindLayout", "getData", "", "isSearch", "", "dataList", "getDataByAuid", "searchList", "getRemoteQueryByDevList", "filterCondition", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/FilterCondition;", "initWidgets", "view", "Landroid/view/View;", "onAttach", "context", "Landroid/content/Context;", "refreshAdapter", "refreshListWithLocalRoom", "setAdapterData", "setListeners", "setUnplacedLayoutState", "isSelect", "holder", "Lcom/donkingliang/groupedadapter/holder/BaseViewHolder;", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.fragment.cabinet_generic.InventoryGenericCabinetZoneBaseFragment */
/* compiled from: InventoryGenericCabinetZoneBaseFragment.kt */
public abstract class InventoryGenericCabinetZoneBaseFragment extends BaseFragment {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @NotNull
    public final Lazy inventoryWineViewModel$delegate = LazyKt__LazyJVMKt.lazy(new InventoryGenericCabinetZoneBaseFragment$inventoryWineViewModel$2(this));
    public InventoryMainActivity parentActivity;
    public int unplacedBottlesCount;
    @NotNull
    public final Map<String, List<WineInventoryBean>> wineAuidSortMap = new LinkedHashMap();
    public final int zoneAType = 1;
    public InventoryZoneMainExpandAdapter zoneAdapter;
    public final int zoneBType = 2;
    public final int zoneCType = 3;
    public int zoneType = 1;

    private final void getData(boolean z, List<? extends List<WineInventoryBean>> list) {
        getDataByAuid(z, list);
        setAdapterData();
    }

    private final void getDataByAuid(boolean z, List<? extends List<WineInventoryBean>> list) {
        List<DeviceInfo> deviceList = DeviceCache.Companion.getInstance().getDeviceList();
        ArrayList<DeviceInfo> arrayList = new ArrayList<>();
        for (T next : deviceList) {
            if (Intrinsics.areEqual((Object) ((DeviceInfo) next).getDeviceTypeCode(), (Object) "001")) {
                arrayList.add(next);
            }
        }
        LogUtilsShen.Companion.mo39140i(Intrinsics.stringPlus("设备的数量", Integer.valueOf(arrayList.size())));
        InventoryMainActivity inventoryMainActivity = this.parentActivity;
        InventoryMainActivity inventoryMainActivity2 = null;
        if (inventoryMainActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("parentActivity");
            inventoryMainActivity = null;
        }
        if (!TextUtils.isEmpty(inventoryMainActivity.deviceAuid)) {
            ArrayList arrayList2 = new ArrayList();
            for (Object next2 : arrayList) {
                String deviceId = ((DeviceInfo) next2).getDeviceId();
                InventoryMainActivity inventoryMainActivity3 = this.parentActivity;
                if (inventoryMainActivity3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("parentActivity");
                    inventoryMainActivity3 = null;
                }
                if (Intrinsics.areEqual((Object) deviceId, (Object) inventoryMainActivity3.deviceAuid)) {
                    arrayList2.add(next2);
                }
            }
            arrayList = arrayList2;
        }
        InventoryMainActivity inventoryMainActivity4 = this.parentActivity;
        if (inventoryMainActivity4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("parentActivity");
            inventoryMainActivity4 = null;
        }
        if (!TextUtils.isEmpty(inventoryMainActivity4.getFilterConditionDeviceId())) {
            ArrayList arrayList3 = new ArrayList();
            for (Object next3 : arrayList) {
                String deviceId2 = ((DeviceInfo) next3).getDeviceId();
                InventoryMainActivity inventoryMainActivity5 = this.parentActivity;
                if (inventoryMainActivity5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("parentActivity");
                    inventoryMainActivity5 = null;
                }
                if (Intrinsics.areEqual((Object) deviceId2, (Object) inventoryMainActivity5.getFilterConditionDeviceId())) {
                    arrayList3.add(next3);
                }
            }
            arrayList = arrayList3;
        }
        LogUtilsShen.Companion.mo39140i(Intrinsics.stringPlus("设备的数量----过滤之后", Integer.valueOf(arrayList.size())));
        ArrayList arrayList4 = new ArrayList();
        ArrayList<String> arrayList5 = new ArrayList<>();
        ArrayList<List> arrayList6 = new ArrayList<>();
        arrayList6.clear();
        arrayList4.clear();
        arrayList5.clear();
        if (!z) {
            InventoryMainActivity inventoryMainActivity6 = this.parentActivity;
            if (inventoryMainActivity6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("parentActivity");
            } else {
                inventoryMainActivity2 = inventoryMainActivity6;
            }
            arrayList6.addAll(inventoryMainActivity2.getBaseWineSortList());
        } else if (list != null) {
            arrayList6.addAll(list);
        }
        ArrayList arrayList7 = new ArrayList();
        for (List<WineInventoryBean> it : arrayList6) {
            for (WineInventoryBean add : it) {
                arrayList7.add(add);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next4 : arrayList7) {
            String auid = ((WineInventoryBean) next4).getAuid();
            Object obj = linkedHashMap.get(auid);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(auid, obj);
            }
            ((List) obj).add(next4);
        }
        for (Map.Entry key : linkedHashMap.entrySet()) {
            String str = (String) key.getKey();
            if (str != null) {
                arrayList5.add(str);
            }
        }
        for (DeviceInfo deviceId3 : arrayList) {
            arrayList4.add(deviceId3.getDeviceId());
        }
        for (String remove : arrayList5) {
            arrayList4.remove(remove);
        }
        this.wineAuidSortMap.clear();
        this.wineAuidSortMap.putAll(linkedHashMap);
        for (String put : CollectionsKt___CollectionsKt.distinct(arrayList4)) {
            this.wineAuidSortMap.put(put, CollectionsKt__CollectionsKt.emptyList());
        }
    }

    /* access modifiers changed from: private */
    public final WineCabinetListModel getInventoryWineViewModel() {
        return (WineCabinetListModel) this.inventoryWineViewModel$delegate.getValue();
    }

    /* renamed from: initWidgets$lambda-1  reason: not valid java name */
    public static final void m27186initWidgets$lambda1(InventoryGenericCabinetZoneBaseFragment inventoryGenericCabinetZoneBaseFragment, Pair pair) {
        Intrinsics.checkNotNullParameter(inventoryGenericCabinetZoneBaseFragment, "this$0");
        InventoryMainActivity inventoryMainActivity = inventoryGenericCabinetZoneBaseFragment.parentActivity;
        InventoryMainActivity inventoryMainActivity2 = null;
        if (inventoryMainActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("parentActivity");
            inventoryMainActivity = null;
        }
        inventoryMainActivity.dismissLoading();
        InventoryMainActivity inventoryMainActivity3 = inventoryGenericCabinetZoneBaseFragment.parentActivity;
        if (inventoryMainActivity3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("parentActivity");
            inventoryMainActivity3 = null;
        }
        inventoryMainActivity3.getBaseWineSortList().clear();
        if (!TextUtils.isEmpty((CharSequence) pair.getFirst())) {
            InventoryMainActivity inventoryMainActivity4 = inventoryGenericCabinetZoneBaseFragment.parentActivity;
            if (inventoryMainActivity4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("parentActivity");
                inventoryMainActivity4 = null;
            }
            Object first = pair.getFirst();
            Intrinsics.checkNotNull(first);
            inventoryMainActivity4.setFilterConditionDeviceId((String) first);
        } else {
            InventoryMainActivity inventoryMainActivity5 = inventoryGenericCabinetZoneBaseFragment.parentActivity;
            if (inventoryMainActivity5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("parentActivity");
                inventoryMainActivity5 = null;
            }
            inventoryMainActivity5.setFilterConditionDeviceId("");
        }
        InventoryMainActivity inventoryMainActivity6 = inventoryGenericCabinetZoneBaseFragment.parentActivity;
        if (inventoryMainActivity6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("parentActivity");
            inventoryMainActivity6 = null;
        }
        List<List<WineInventoryBean>> baseWineSortList = inventoryMainActivity6.getBaseWineSortList();
        Iterable<WineBaseInfo> iterable = (Iterable) pair.getSecond();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        for (WineBaseInfo wineInventoryBean : iterable) {
            arrayList.add(WineCabinetListModel.Companion.toWineInventoryBean(wineInventoryBean));
        }
        baseWineSortList.add(arrayList);
        InventoryMainActivity inventoryMainActivity7 = inventoryGenericCabinetZoneBaseFragment.parentActivity;
        if (inventoryMainActivity7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("parentActivity");
            inventoryMainActivity7 = null;
        }
        inventoryGenericCabinetZoneBaseFragment.refreshAdapter(false, inventoryMainActivity7.getBaseWineSortList());
        InventoryMainActivity inventoryMainActivity8 = inventoryGenericCabinetZoneBaseFragment.parentActivity;
        if (inventoryMainActivity8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("parentActivity");
            inventoryMainActivity8 = null;
        }
        inventoryMainActivity8.hideEmptyView();
        InventoryMainActivity inventoryMainActivity9 = inventoryGenericCabinetZoneBaseFragment.parentActivity;
        if (inventoryMainActivity9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("parentActivity");
            inventoryMainActivity9 = null;
        }
        if (TextUtils.isEmpty(inventoryMainActivity9.deviceAuid)) {
            EventBus eventBus = EventBus.getDefault();
            InventoryMainActivity inventoryMainActivity10 = inventoryGenericCabinetZoneBaseFragment.parentActivity;
            if (inventoryMainActivity10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("parentActivity");
            } else {
                inventoryMainActivity2 = inventoryMainActivity10;
            }
            eventBus.post(new EventBottleNum(inventoryMainActivity2.getBaseWineSortList().size()));
        }
    }

    /* renamed from: initWidgets$lambda-2  reason: not valid java name */
    public static final void m27187initWidgets$lambda2(GroupedRecyclerViewAdapter groupedRecyclerViewAdapter, BaseViewHolder baseViewHolder, int i) {
        if (groupedRecyclerViewAdapter != null) {
            InventoryZoneMainExpandAdapter inventoryZoneMainExpandAdapter = (InventoryZoneMainExpandAdapter) groupedRecyclerViewAdapter;
            if (inventoryZoneMainExpandAdapter.isExpand(i)) {
                inventoryZoneMainExpandAdapter.collapseGroup(i);
            } else {
                inventoryZoneMainExpandAdapter.expandGroup(i);
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type com.internationalwinecooler.ui.adapter.cabinet_generic.InventoryZoneMainExpandAdapter");
        }
    }

    /* renamed from: initWidgets$lambda-3  reason: not valid java name */
    public static final void m27188initWidgets$lambda3(GroupedRecyclerViewAdapter groupedRecyclerViewAdapter, BaseViewHolder baseViewHolder, int i, int i2) {
    }

    private final void setAdapterData() {
        InventoryZoneMainExpandAdapter inventoryZoneMainExpandAdapter = this.zoneAdapter;
        InventoryZoneMainExpandAdapter inventoryZoneMainExpandAdapter2 = null;
        if (inventoryZoneMainExpandAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("zoneAdapter");
            inventoryZoneMainExpandAdapter = null;
        }
        inventoryZoneMainExpandAdapter.setData(GroupModel.Companion.getGenericExpandableGroups(false, this.wineAuidSortMap.size(), 1, this.wineAuidSortMap), this.wineAuidSortMap);
        InventoryZoneMainExpandAdapter inventoryZoneMainExpandAdapter3 = this.zoneAdapter;
        if (inventoryZoneMainExpandAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("zoneAdapter");
            inventoryZoneMainExpandAdapter3 = null;
        }
        inventoryZoneMainExpandAdapter3.notifyDataSetChanged();
        InventoryZoneMainExpandAdapter inventoryZoneMainExpandAdapter4 = this.zoneAdapter;
        if (inventoryZoneMainExpandAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("zoneAdapter");
            inventoryZoneMainExpandAdapter4 = null;
        }
        if (inventoryZoneMainExpandAdapter4.expandGroupList().size() > 0) {
            InventoryZoneMainExpandAdapter inventoryZoneMainExpandAdapter5 = this.zoneAdapter;
            if (inventoryZoneMainExpandAdapter5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("zoneAdapter");
                inventoryZoneMainExpandAdapter5 = null;
            }
            InventoryZoneMainExpandAdapter inventoryZoneMainExpandAdapter6 = this.zoneAdapter;
            if (inventoryZoneMainExpandAdapter6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("zoneAdapter");
            } else {
                inventoryZoneMainExpandAdapter2 = inventoryZoneMainExpandAdapter6;
            }
            Integer num = inventoryZoneMainExpandAdapter2.expandGroupList().get(0);
            Intrinsics.checkNotNullExpressionValue(num, "zoneAdapter.expandGroupList()[0]");
            inventoryZoneMainExpandAdapter5.expandGroup(num.intValue());
        }
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Nullable
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public int bindLayout() {
        return R.layout.fragment_zone_main_layout;
    }

    public final void getRemoteQueryByDevList(@Nullable FilterCondition filterCondition) {
        ArrayList arrayList = new ArrayList();
        InventoryMainActivity inventoryMainActivity = this.parentActivity;
        if (inventoryMainActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("parentActivity");
            inventoryMainActivity = null;
        }
        if (!TextUtils.isEmpty(inventoryMainActivity.deviceAuid)) {
            InventoryMainActivity inventoryMainActivity2 = this.parentActivity;
            if (inventoryMainActivity2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("parentActivity");
                inventoryMainActivity2 = null;
            }
            arrayList.add(inventoryMainActivity2.deviceAuid);
        } else {
            for (DeviceInfo deviceId : DeviceCache.Companion.getInstance().getDeviceList()) {
                arrayList.add(deviceId.getDeviceId());
            }
        }
        long j = 0;
        if (filterCondition == null) {
            Object obj = SPUtils.INSTANCE.get(KeyConst.SP_Query_By_Dev_List, 0L);
            if (obj != null) {
                j = ((Long) obj).longValue();
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
            }
        }
        Job unused = BuildersKt__Builders_commonKt.launch$default(this, Dispatchers.getIO(), (CoroutineStart) null, new C8709x40ff71e4(filterCondition, this, (Continuation<? super C8709x40ff71e4>) null), 2, (Object) null);
        getInventoryWineViewModel().getRemoteQueryByDevList(arrayList, filterCondition, j, false);
    }

    public final int getUnplacedBottlesCount() {
        return this.unplacedBottlesCount;
    }

    public final int getZoneAType() {
        return this.zoneAType;
    }

    public final int getZoneBType() {
        return this.zoneBType;
    }

    public final int getZoneCType() {
        return this.zoneCType;
    }

    public final int getZoneType() {
        return this.zoneType;
    }

    public void initWidgets(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        this.zoneAdapter = new InventoryZoneMainExpandAdapter(requireActivity, this.zoneType);
        setAdapterData();
        InventoryMainActivity inventoryMainActivity = this.parentActivity;
        InventoryZoneMainExpandAdapter inventoryZoneMainExpandAdapter = null;
        if (inventoryMainActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("parentActivity");
            inventoryMainActivity = null;
        }
        if (inventoryMainActivity.expired) {
            getRemoteQueryByDevList(new FilterCondition((List) null, (List) null, (List) null, (List) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (Integer) null, (String) null, (Integer) null, Long.valueOf(System.currentTimeMillis()), (Integer) null, 6143, (DefaultConstructorMarker) null));
        } else {
            getRemoteQueryByDevList((FilterCondition) null);
        }
        getInventoryWineViewModel().getRemoteLiveData().observe(this, new C7606c(this));
        ((RecyclerView) _$_findCachedViewById(R$id.zone_main_recycler_view)).setLayoutManager(new LinearLayoutManager(getActivity()));
        InventoryZoneMainExpandAdapter inventoryZoneMainExpandAdapter2 = this.zoneAdapter;
        if (inventoryZoneMainExpandAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("zoneAdapter");
            inventoryZoneMainExpandAdapter2 = null;
        }
        inventoryZoneMainExpandAdapter2.setOnHeaderClickListener(C7605b.f14337a);
        InventoryZoneMainExpandAdapter inventoryZoneMainExpandAdapter3 = this.zoneAdapter;
        if (inventoryZoneMainExpandAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("zoneAdapter");
            inventoryZoneMainExpandAdapter3 = null;
        }
        inventoryZoneMainExpandAdapter3.setOnChildClickListener(C7604a.f14336a);
        InventoryZoneMainExpandAdapter inventoryZoneMainExpandAdapter4 = this.zoneAdapter;
        if (inventoryZoneMainExpandAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("zoneAdapter");
            inventoryZoneMainExpandAdapter4 = null;
        }
        inventoryZoneMainExpandAdapter4.setIItemCallback(new InventoryGenericCabinetZoneBaseFragment$initWidgets$4());
        ((StickyHeaderLayout) _$_findCachedViewById(R$id.sticky_layout)).setSticky(false);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R$id.zone_main_recycler_view);
        InventoryZoneMainExpandAdapter inventoryZoneMainExpandAdapter5 = this.zoneAdapter;
        if (inventoryZoneMainExpandAdapter5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("zoneAdapter");
        } else {
            inventoryZoneMainExpandAdapter = inventoryZoneMainExpandAdapter5;
        }
        recyclerView.setAdapter(inventoryZoneMainExpandAdapter);
    }

    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        if (getActivity() instanceof InventoryMainActivity) {
            this.parentActivity = (InventoryMainActivity) context;
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final void refreshAdapter(boolean z, @Nullable List<? extends List<WineInventoryBean>> list) {
        if (this.zoneAdapter != null) {
            getData(z, list);
        }
    }

    public final void refreshListWithLocalRoom() {
        InventoryMainActivity inventoryMainActivity = this.parentActivity;
        InventoryMainActivity inventoryMainActivity2 = null;
        if (inventoryMainActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("parentActivity");
            inventoryMainActivity = null;
        }
        if (TextUtils.isEmpty(inventoryMainActivity.deviceAuid)) {
            getInventoryWineViewModel().getRemoteLiveData().postValue(new Pair("", LoginUserInfoRoom.Companion.loginUserInfoProvider().getAllWineInventoryNew()));
            return;
        }
        MutableLiveData<Pair<String, List<WineBaseInfo>>> remoteLiveData = getInventoryWineViewModel().getRemoteLiveData();
        LoginUserInfoProvider loginUserInfoProvider = LoginUserInfoRoom.Companion.loginUserInfoProvider();
        InventoryMainActivity inventoryMainActivity3 = this.parentActivity;
        if (inventoryMainActivity3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("parentActivity");
        } else {
            inventoryMainActivity2 = inventoryMainActivity3;
        }
        remoteLiveData.postValue(new Pair("", loginUserInfoProvider.getAllWineInventoryByDeviceId(inventoryMainActivity2.deviceAuid)));
    }

    public void setListeners() {
    }

    public final void setUnplacedBottlesCount(int i) {
        this.unplacedBottlesCount = i;
    }

    public final void setUnplacedLayoutState(boolean z, @NotNull BaseViewHolder baseViewHolder) {
        Intrinsics.checkNotNullParameter(baseViewHolder, "holder");
        InventoryZoneMainExpandAdapter inventoryZoneMainExpandAdapter = this.zoneAdapter;
        if (inventoryZoneMainExpandAdapter != null) {
            if (inventoryZoneMainExpandAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("zoneAdapter");
                inventoryZoneMainExpandAdapter = null;
            }
            inventoryZoneMainExpandAdapter.setUnplacedLayoutState(z, baseViewHolder);
        }
    }

    public final void setZoneType(int i) {
        this.zoneType = i;
    }
}
