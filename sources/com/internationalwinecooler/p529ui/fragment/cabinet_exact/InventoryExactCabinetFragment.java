package com.internationalwinecooler.p529ui.fragment.cabinet_exact;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.donkingliang.groupedadapter.adapter.GroupedRecyclerViewAdapter;
import com.donkingliang.groupedadapter.holder.BaseViewHolder;
import com.donkingliang.groupedadapter.widget.StickyHeaderLayout;
import com.hisense.connect_life.core.base.BaseFragment;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.core.utils.SPUtils;
import com.hisense.connect_life.hismart.networks.request.device.DeviceCache;
import com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo;
import com.hisense.connect_life.hismart.networks.request.message.MessageObserver;
import com.hisense.connect_life.hismart.networks.request.message.listener.MessageReceivedListener;
import com.hisense.connect_life.hismart.networks.request.wine.model.FilterCondition;
import com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo;
import com.hisense.connect_life.hismart.sql.account.LoginUserInfoProvider;
import com.hisense.connect_life.hismart.sql.account.LoginUserInfoRoom;
import com.hisense.juconnect.connectlife.R;
import com.internationalwinecooler.p529ui.AddWineSuccessModel;
import com.internationalwinecooler.p529ui.RefreshWineFragment;
import com.internationalwinecooler.p529ui.WineCabinetListModel;
import com.internationalwinecooler.p529ui.adapter.cabinet_exact.InventoryExactMainExpandAdapter;
import com.internationalwinecooler.p529ui.inventory.InventoryMainActivity;
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
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p482v.p483a.p487e.p488a.C7601a;
import p040c.p482v.p483a.p487e.p488a.C7602b;
import p040c.p482v.p483a.p487e.p488a.C7603c;

@Metadata(mo47990d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0014J&\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0014\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0018\u00010\u0012H\u0002J&\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0014\u0010\u001c\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0018\u00010\u0012H\u0002J\u0010\u0010\u001d\u001a\u00020\u00172\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u00112\u0006\u0010!\u001a\u00020\u0011H\u0002J\u0010\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020$H\u0014J\u0014\u0010%\u001a\u00020\u00172\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00110\u0012J\u0010\u0010'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020)H\u0007J\u0010\u0010*\u001a\u00020\u00172\u0006\u0010+\u001a\u00020,H\u0016J\u0010\u0010-\u001a\u00020\u00172\u0006\u0010(\u001a\u00020.H\u0007J\b\u0010/\u001a\u00020\u0017H\u0016J\u0006\u00100\u001a\u00020\u0017J\u0006\u00101\u001a\u00020\u0017J\b\u00102\u001a\u00020\u0017H\u0002J\u001c\u00103\u001a\u00020\u00172\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00110\u00122\u0006\u00105\u001a\u00020\u0019J\u0014\u00106\u001a\u00020\u00172\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00110\u0012J\b\u00108\u001a\u00020\u0017H\u0014J\u0016\u00109\u001a\u00020\u00172\u0006\u0010:\u001a\u00020\u00192\u0006\u0010;\u001a\u00020<J\b\u0010=\u001a\u00020\u0017H\u0007J\b\u0010>\u001a\u00020\u0017H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\"\u0010\u000f\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0010X\u0004¢\u0006\u0002\n\u0000¨\u0006?"}, mo47991d2 = {"Lcom/internationalwinecooler/ui/fragment/cabinet_exact/InventoryExactCabinetFragment;", "Lcom/hisense/connect_life/core/base/BaseFragment;", "()V", "exactAdapter", "Lcom/internationalwinecooler/ui/adapter/cabinet_exact/InventoryExactMainExpandAdapter;", "inventoryWineViewModel", "Lcom/internationalwinecooler/ui/WineCabinetListModel;", "getInventoryWineViewModel", "()Lcom/internationalwinecooler/ui/WineCabinetListModel;", "inventoryWineViewModel$delegate", "Lkotlin/Lazy;", "messageReceivedListener", "Lcom/hisense/connect_life/hismart/networks/request/message/listener/MessageReceivedListener;", "parentActivity", "Lcom/internationalwinecooler/ui/inventory/InventoryMainActivity;", "wineAuidSortMap", "", "", "", "Lcom/juconnect/connectlife/model/WineInventoryBean;", "bindLayout", "", "getData", "", "isSearch", "", "dataList", "getDataByAuid", "searchList", "getRemoteQueryByDevList", "filterCondition", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/FilterCondition;", "getWineCoolerName", "deviceId", "initWidgets", "view", "Landroid/view/View;", "notifyExactAdapter", "inventoryId", "onAddWineEvent", "event", "Lcom/internationalwinecooler/ui/AddWineSuccessModel;", "onAttach", "context", "Landroid/content/Context;", "onChangeFavoriteWineEvent", "Lcom/internationalwinecooler/ui/RefreshWineFragment;", "onDestroy", "refreshExactWineListSearch", "refreshListWithLocalRoom", "setAdapterData", "setDeleteShow", "idInventoryList", "showToast", "setDeleteWineSucc", "it", "setListeners", "setUnplacedLayoutState", "isSelect", "holder", "Lcom/donkingliang/groupedadapter/holder/BaseViewHolder;", "setWineBottlesCounts", "subscribeMsgObservable", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.fragment.cabinet_exact.InventoryExactCabinetFragment */
/* compiled from: InventoryExactCabinetFragment.kt */
public final class InventoryExactCabinetFragment extends BaseFragment {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public InventoryExactMainExpandAdapter exactAdapter;
    @NotNull
    public final Lazy inventoryWineViewModel$delegate = LazyKt__LazyJVMKt.lazy(new InventoryExactCabinetFragment$inventoryWineViewModel$2(this));
    @Nullable
    public MessageReceivedListener messageReceivedListener;
    public InventoryMainActivity parentActivity;
    @NotNull
    public final Map<String, List<WineInventoryBean>> wineAuidSortMap = new LinkedHashMap();

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
            arrayList6.addAll(inventoryMainActivity2.getExactBaseWineSortList());
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
        for (DeviceInfo deviceId3 : arrayList) {
            arrayList4.add(deviceId3.getDeviceId());
        }
        for (Map.Entry key : linkedHashMap.entrySet()) {
            String str = (String) key.getKey();
            if (str != null) {
                arrayList5.add(str);
            }
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

    /* access modifiers changed from: private */
    public final String getWineCoolerName(String str) {
        if (DeviceCache.Companion.getInstance().getDevice(str) == null) {
            return getString(R.string.device_deleted);
        }
        DeviceInfo device = DeviceCache.Companion.getInstance().getDevice(str);
        if (device == null) {
            return null;
        }
        return device.getDeviceNickName();
    }

    /* renamed from: initWidgets$lambda-2  reason: not valid java name */
    public static final void m27183initWidgets$lambda2(GroupedRecyclerViewAdapter groupedRecyclerViewAdapter, BaseViewHolder baseViewHolder, int i) {
        if (groupedRecyclerViewAdapter != null) {
            InventoryExactMainExpandAdapter inventoryExactMainExpandAdapter = (InventoryExactMainExpandAdapter) groupedRecyclerViewAdapter;
            if (inventoryExactMainExpandAdapter.isExpand(i)) {
                inventoryExactMainExpandAdapter.collapseGroup(i);
            } else {
                inventoryExactMainExpandAdapter.expandGroup(i);
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type com.internationalwinecooler.ui.adapter.cabinet_exact.InventoryExactMainExpandAdapter");
        }
    }

    /* renamed from: initWidgets$lambda-3  reason: not valid java name */
    public static final void m27184initWidgets$lambda3(GroupedRecyclerViewAdapter groupedRecyclerViewAdapter, BaseViewHolder baseViewHolder, int i, int i2) {
    }

    /* renamed from: initWidgets$lambda-6  reason: not valid java name */
    public static final void m27185initWidgets$lambda6(InventoryExactCabinetFragment inventoryExactCabinetFragment, Pair pair) {
        Intrinsics.checkNotNullParameter(inventoryExactCabinetFragment, "this$0");
        InventoryMainActivity inventoryMainActivity = inventoryExactCabinetFragment.parentActivity;
        InventoryMainActivity inventoryMainActivity2 = null;
        if (inventoryMainActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("parentActivity");
            inventoryMainActivity = null;
        }
        inventoryMainActivity.dismissLoading();
        InventoryMainActivity inventoryMainActivity3 = inventoryExactCabinetFragment.parentActivity;
        if (inventoryMainActivity3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("parentActivity");
            inventoryMainActivity3 = null;
        }
        inventoryMainActivity3.getExactBaseWineSortList().clear();
        InventoryMainActivity inventoryMainActivity4 = inventoryExactCabinetFragment.parentActivity;
        if (inventoryMainActivity4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("parentActivity");
            inventoryMainActivity4 = null;
        }
        inventoryMainActivity4.getBaseWineSortList().clear();
        if (!TextUtils.isEmpty((CharSequence) pair.getFirst())) {
            InventoryMainActivity inventoryMainActivity5 = inventoryExactCabinetFragment.parentActivity;
            if (inventoryMainActivity5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("parentActivity");
                inventoryMainActivity5 = null;
            }
            Object first = pair.getFirst();
            Intrinsics.checkNotNull(first);
            inventoryMainActivity5.setFilterConditionDeviceId((String) first);
        } else {
            InventoryMainActivity inventoryMainActivity6 = inventoryExactCabinetFragment.parentActivity;
            if (inventoryMainActivity6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("parentActivity");
                inventoryMainActivity6 = null;
            }
            inventoryMainActivity6.setFilterConditionDeviceId("");
        }
        InventoryMainActivity inventoryMainActivity7 = inventoryExactCabinetFragment.parentActivity;
        if (inventoryMainActivity7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("parentActivity");
            inventoryMainActivity7 = null;
        }
        List<List<WineInventoryBean>> exactBaseWineSortList = inventoryMainActivity7.getExactBaseWineSortList();
        Iterable<WineBaseInfo> iterable = (Iterable) pair.getSecond();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        for (WineBaseInfo wineInventoryBean : iterable) {
            arrayList.add(WineCabinetListModel.Companion.toWineInventoryBean(wineInventoryBean));
        }
        exactBaseWineSortList.add(arrayList);
        InventoryMainActivity inventoryMainActivity8 = inventoryExactCabinetFragment.parentActivity;
        if (inventoryMainActivity8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("parentActivity");
        } else {
            inventoryMainActivity2 = inventoryMainActivity8;
        }
        List<List<WineInventoryBean>> baseWineSortList = inventoryMainActivity2.getBaseWineSortList();
        Iterable<WineBaseInfo> iterable2 = (Iterable) pair.getSecond();
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable2, 10));
        for (WineBaseInfo wineInventoryBean2 : iterable2) {
            arrayList2.add(WineCabinetListModel.Companion.toWineInventoryBean(wineInventoryBean2));
        }
        baseWineSortList.add(arrayList2);
        inventoryExactCabinetFragment.refreshExactWineListSearch();
    }

    private final void setAdapterData() {
        InventoryExactMainExpandAdapter inventoryExactMainExpandAdapter = this.exactAdapter;
        InventoryExactMainExpandAdapter inventoryExactMainExpandAdapter2 = null;
        if (inventoryExactMainExpandAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("exactAdapter");
            inventoryExactMainExpandAdapter = null;
        }
        inventoryExactMainExpandAdapter.setData(GroupModel.Companion.getExactExpandableGroups(false, 1, this.wineAuidSortMap), this.wineAuidSortMap);
        InventoryExactMainExpandAdapter inventoryExactMainExpandAdapter3 = this.exactAdapter;
        if (inventoryExactMainExpandAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("exactAdapter");
            inventoryExactMainExpandAdapter3 = null;
        }
        inventoryExactMainExpandAdapter3.notifyDataSetChanged();
        InventoryExactMainExpandAdapter inventoryExactMainExpandAdapter4 = this.exactAdapter;
        if (inventoryExactMainExpandAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("exactAdapter");
            inventoryExactMainExpandAdapter4 = null;
        }
        if (inventoryExactMainExpandAdapter4.expandGroupList().size() > 0) {
            InventoryExactMainExpandAdapter inventoryExactMainExpandAdapter5 = this.exactAdapter;
            if (inventoryExactMainExpandAdapter5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("exactAdapter");
                inventoryExactMainExpandAdapter5 = null;
            }
            InventoryExactMainExpandAdapter inventoryExactMainExpandAdapter6 = this.exactAdapter;
            if (inventoryExactMainExpandAdapter6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("exactAdapter");
            } else {
                inventoryExactMainExpandAdapter2 = inventoryExactMainExpandAdapter6;
            }
            Integer num = inventoryExactMainExpandAdapter2.expandGroupList().get(0);
            Intrinsics.checkNotNullExpressionValue(num, "exactAdapter.expandGroupList()[0]");
            inventoryExactMainExpandAdapter5.expandGroup(num.intValue());
        }
    }

    private final void subscribeMsgObservable() {
        InventoryExactCabinetFragment$subscribeMsgObservable$1 inventoryExactCabinetFragment$subscribeMsgObservable$1 = new InventoryExactCabinetFragment$subscribeMsgObservable$1(this);
        this.messageReceivedListener = inventoryExactCabinetFragment$subscribeMsgObservable$1;
        if (inventoryExactCabinetFragment$subscribeMsgObservable$1 != null) {
            MessageObserver instance = MessageObserver.Companion.getInstance();
            MessageReceivedListener messageReceivedListener2 = this.messageReceivedListener;
            Intrinsics.checkNotNull(messageReceivedListener2);
            instance.subscribe(messageReceivedListener2);
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
        return R.layout.fragment_wine_cabinet_exact_layout;
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
        Job unused = BuildersKt__Builders_commonKt.launch$default(this, Dispatchers.getIO(), (CoroutineStart) null, new InventoryExactCabinetFragment$getRemoteQueryByDevList$2(filterCondition, this, (Continuation<? super InventoryExactCabinetFragment$getRemoteQueryByDevList$2>) null), 2, (Object) null);
        getInventoryWineViewModel().getRemoteQueryByDevList(arrayList, filterCondition, j, false);
    }

    public void initWidgets(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        this.exactAdapter = new InventoryExactMainExpandAdapter(requireActivity);
        setAdapterData();
        InventoryMainActivity inventoryMainActivity = this.parentActivity;
        InventoryExactMainExpandAdapter inventoryExactMainExpandAdapter = null;
        if (inventoryMainActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("parentActivity");
            inventoryMainActivity = null;
        }
        if (inventoryMainActivity.expired) {
            getRemoteQueryByDevList(new FilterCondition((List) null, (List) null, (List) null, (List) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (Integer) null, (String) null, (Integer) null, Long.valueOf(System.currentTimeMillis()), (Integer) null, 6143, (DefaultConstructorMarker) null));
        } else {
            getRemoteQueryByDevList((FilterCondition) null);
        }
        ((RecyclerView) _$_findCachedViewById(R$id.exact_cabinet_recycler_view)).setLayoutManager(new LinearLayoutManager(getActivity()));
        InventoryExactMainExpandAdapter inventoryExactMainExpandAdapter2 = this.exactAdapter;
        if (inventoryExactMainExpandAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("exactAdapter");
            inventoryExactMainExpandAdapter2 = null;
        }
        inventoryExactMainExpandAdapter2.setOnHeaderClickListener(C7602b.f14334a);
        InventoryExactMainExpandAdapter inventoryExactMainExpandAdapter3 = this.exactAdapter;
        if (inventoryExactMainExpandAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("exactAdapter");
            inventoryExactMainExpandAdapter3 = null;
        }
        inventoryExactMainExpandAdapter3.setOnChildClickListener(C7601a.f14333a);
        InventoryExactMainExpandAdapter inventoryExactMainExpandAdapter4 = this.exactAdapter;
        if (inventoryExactMainExpandAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("exactAdapter");
            inventoryExactMainExpandAdapter4 = null;
        }
        inventoryExactMainExpandAdapter4.setIItemCallback(new InventoryExactCabinetFragment$initWidgets$3());
        ((StickyHeaderLayout) _$_findCachedViewById(R$id.sticky_layout)).setSticky(false);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R$id.exact_cabinet_recycler_view);
        InventoryExactMainExpandAdapter inventoryExactMainExpandAdapter5 = this.exactAdapter;
        if (inventoryExactMainExpandAdapter5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("exactAdapter");
        } else {
            inventoryExactMainExpandAdapter = inventoryExactMainExpandAdapter5;
        }
        recyclerView.setAdapter(inventoryExactMainExpandAdapter);
        getInventoryWineViewModel().getRemoteLiveData().observe(this, new C7603c(this));
    }

    public final void notifyExactAdapter(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "inventoryId");
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onAddWineEvent(@NotNull AddWineSuccessModel addWineSuccessModel) {
        Intrinsics.checkNotNullParameter(addWineSuccessModel, NotificationCompat.CATEGORY_EVENT);
        refreshListWithLocalRoom();
    }

    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        if (getActivity() instanceof InventoryMainActivity) {
            this.parentActivity = (InventoryMainActivity) context;
        }
        EventBus.getDefault().register(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onChangeFavoriteWineEvent(@NotNull RefreshWineFragment refreshWineFragment) {
        Intrinsics.checkNotNullParameter(refreshWineFragment, NotificationCompat.CATEGORY_EVENT);
        refreshListWithLocalRoom();
    }

    public void onDestroy() {
        EventBus.getDefault().unregister(this);
        super.onDestroy();
        MessageReceivedListener messageReceivedListener2 = this.messageReceivedListener;
        if (messageReceivedListener2 != null) {
            MessageObserver.Companion.getInstance().unsubscribe(messageReceivedListener2);
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final void refreshExactWineListSearch() {
        InventoryMainActivity inventoryMainActivity = this.parentActivity;
        if (inventoryMainActivity != null) {
            if (inventoryMainActivity == null) {
                Intrinsics.throwUninitializedPropertyAccessException("parentActivity");
                inventoryMainActivity = null;
            }
            getData(true, inventoryMainActivity.getExactBaseWineSortList());
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

    public final void setDeleteShow(@NotNull List<String> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "idInventoryList");
        if (!list.isEmpty()) {
            InventoryMainActivity inventoryMainActivity = this.parentActivity;
            InventoryMainActivity inventoryMainActivity2 = null;
            if (inventoryMainActivity == null) {
                Intrinsics.throwUninitializedPropertyAccessException("parentActivity");
                inventoryMainActivity = null;
            }
            String.valueOf(inventoryMainActivity.getExactBaseWineSortList());
            for (String str : list) {
                InventoryMainActivity inventoryMainActivity3 = this.parentActivity;
                if (inventoryMainActivity3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("parentActivity");
                    inventoryMainActivity3 = null;
                }
                InventoryMainActivity inventoryMainActivity4 = this.parentActivity;
                if (inventoryMainActivity4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("parentActivity");
                    inventoryMainActivity4 = null;
                }
                List<List<WineInventoryBean>> exactBaseWineSortList = inventoryMainActivity4.getExactBaseWineSortList();
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(exactBaseWineSortList, 10));
                for (List it : exactBaseWineSortList) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object next : it) {
                        if (!Intrinsics.areEqual((Object) ((WineInventoryBean) next).getIdInventory(), (Object) str)) {
                            arrayList2.add(next);
                        }
                    }
                    arrayList.add(arrayList2);
                }
                inventoryMainActivity3.setExactBaseWineSortList(TypeIntrinsics.asMutableList(arrayList));
            }
            InventoryMainActivity inventoryMainActivity5 = this.parentActivity;
            if (inventoryMainActivity5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("parentActivity");
            } else {
                inventoryMainActivity2 = inventoryMainActivity5;
            }
            String.valueOf(inventoryMainActivity2.getExactBaseWineSortList());
            if (z) {
                setDeleteWineSucc(list);
            }
        } else {
            String string = getString(R.string.failure);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.failure)");
            showString(string);
        }
        refreshExactWineListSearch();
    }

    public final void setDeleteWineSucc(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, LanguageConstKt.f15954it);
        Job unused = BuildersKt__Builders_commonKt.launch$default(this, Dispatchers.getIO(), (CoroutineStart) null, new InventoryExactCabinetFragment$setDeleteWineSucc$1(this, list, (Continuation<? super InventoryExactCabinetFragment$setDeleteWineSucc$1>) null), 2, (Object) null);
    }

    public void setListeners() {
        subscribeMsgObservable();
    }

    public final void setUnplacedLayoutState(boolean z, @NotNull BaseViewHolder baseViewHolder) {
        Intrinsics.checkNotNullParameter(baseViewHolder, "holder");
        InventoryExactMainExpandAdapter inventoryExactMainExpandAdapter = this.exactAdapter;
        if (inventoryExactMainExpandAdapter != null) {
            if (inventoryExactMainExpandAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("exactAdapter");
                inventoryExactMainExpandAdapter = null;
            }
            inventoryExactMainExpandAdapter.setUnplacedLayoutState(z, baseViewHolder);
        }
    }

    @SuppressLint({"SetTextI18n"})
    public final void setWineBottlesCounts() {
        InventoryMainActivity inventoryMainActivity = this.parentActivity;
        InventoryMainActivity inventoryMainActivity2 = null;
        if (inventoryMainActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("parentActivity");
            inventoryMainActivity = null;
        }
        if (inventoryMainActivity.isSearchState()) {
            InventoryMainActivity inventoryMainActivity3 = this.parentActivity;
            if (inventoryMainActivity3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("parentActivity");
            } else {
                inventoryMainActivity2 = inventoryMainActivity3;
            }
            inventoryMainActivity2.getExactWineBottlesFilterCount();
            return;
        }
        InventoryMainActivity inventoryMainActivity4 = this.parentActivity;
        if (inventoryMainActivity4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("parentActivity");
        } else {
            inventoryMainActivity2 = inventoryMainActivity4;
        }
        inventoryMainActivity2.getWineBottlesCount();
    }
}
