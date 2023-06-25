package com.internationalwinecooler.p529ui.fragment.cabinet_generic;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import com.donkingliang.groupedadapter.holder.BaseViewHolder;
import com.hisense.connect_life.hismart.networks.request.message.MessageObserver;
import com.hisense.connect_life.hismart.networks.request.message.listener.MessageReceivedListener;
import com.hisense.connect_life.hismart.networks.request.wine.model.FilterCondition;
import com.hisense.juconnect.connectlife.R;
import com.internationalwinecooler.p529ui.AddWineSuccessModel;
import com.internationalwinecooler.p529ui.RefreshWineFragment;
import com.internationalwinecooler.p529ui.fragment.InventoryWineBaseFragment;
import com.internationalwinecooler.p529ui.inventory.InventoryMainActivity;
import com.juconnect.connect_life.R$id;
import com.juconnect.connectlife.model.WineInventoryBean;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0014J\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\u000eH\u0014J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0017H\u0007J\b\u0010\u0018\u001a\u00020\u000eH\u0016J\u0010\u0010\u0019\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ$\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001e2\u0014\u0010\u001f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 \u0018\u00010 J\u001c\u0010\"\u001a\u00020\u000e2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0 2\u0006\u0010$\u001a\u00020\u001eJ\b\u0010%\u001a\u00020\u000eH\u0014J\u0016\u0010&\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020)J\u0006\u0010*\u001a\u00020\u000eJ\u000e\u0010+\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u001eJ\b\u0010-\u001a\u00020\u000eH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006."}, mo47991d2 = {"Lcom/internationalwinecooler/ui/fragment/cabinet_generic/InventoryGenericCabinetFragment;", "Lcom/internationalwinecooler/ui/fragment/InventoryWineBaseFragment;", "()V", "currentFragment", "Landroidx/fragment/app/Fragment;", "messageReceivedListener", "Lcom/hisense/connect_life/hismart/networks/request/message/listener/MessageReceivedListener;", "sortId", "", "zoneAFragment", "Lcom/internationalwinecooler/ui/fragment/cabinet_generic/InventoryGenericCabinetZoneAFragment;", "bindLayout", "", "freshLocalRoom", "", "initResourceViewId", "initWidgets", "view", "Landroid/view/View;", "onAddWineEvent", "event", "Lcom/internationalwinecooler/ui/AddWineSuccessModel;", "onChangeFavoriteWineEvent", "Lcom/internationalwinecooler/ui/RefreshWineFragment;", "onDestroy", "refreshFragment", "filterCondition", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/FilterCondition;", "refreshZoneMainAdapter", "isSearch", "", "dataList", "", "Lcom/juconnect/connectlife/model/WineInventoryBean;", "setDeleteShow", "idInventoryList", "showToast", "setListeners", "setUnplacedLayoutState", "isSelect", "holder", "Lcom/donkingliang/groupedadapter/holder/BaseViewHolder;", "setWineSearchCounts", "setZoneTopViewShowOrHide", "isHide", "subscribeMsgObservable", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.fragment.cabinet_generic.InventoryGenericCabinetFragment */
/* compiled from: InventoryGenericCabinetFragment.kt */
public final class InventoryGenericCabinetFragment extends InventoryWineBaseFragment {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @Nullable
    public Fragment currentFragment;
    @Nullable
    public MessageReceivedListener messageReceivedListener;
    @NotNull
    public String sortId = "";
    @NotNull
    public InventoryGenericCabinetZoneAFragment zoneAFragment = new InventoryGenericCabinetZoneAFragment();

    private final void subscribeMsgObservable() {
        InventoryGenericCabinetFragment$subscribeMsgObservable$1 inventoryGenericCabinetFragment$subscribeMsgObservable$1 = new InventoryGenericCabinetFragment$subscribeMsgObservable$1(this);
        this.messageReceivedListener = inventoryGenericCabinetFragment$subscribeMsgObservable$1;
        if (inventoryGenericCabinetFragment$subscribeMsgObservable$1 != null) {
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
        return R.layout.fragment_wine_cabinet_generic_layout;
    }

    public final void freshLocalRoom() {
        this.zoneAFragment.refreshListWithLocalRoom();
    }

    public void initResourceViewId() {
        TextView textView = (TextView) _$_findCachedViewById(R$id.empty_view);
        Intrinsics.checkNotNullExpressionValue(textView, "empty_view");
        setEmptyView(textView);
        FrameLayout frameLayout = (FrameLayout) _$_findCachedViewById(R$id.inventory_zone_fl);
        Intrinsics.checkNotNullExpressionValue(frameLayout, "inventory_zone_fl");
        setWineView(frameLayout);
    }

    public void initWidgets(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        initResourceViewId();
        setContainerViewId(R.id.inventory_zone_fl);
        requireActivity().getSupportFragmentManager().beginTransaction().add(getContainerViewId(), (Fragment) this.zoneAFragment).commit();
        this.currentFragment = this.zoneAFragment;
        super.initWidgets(view);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onAddWineEvent(@NotNull AddWineSuccessModel addWineSuccessModel) {
        Intrinsics.checkNotNullParameter(addWineSuccessModel, NotificationCompat.CATEGORY_EVENT);
        freshLocalRoom();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onChangeFavoriteWineEvent(@NotNull RefreshWineFragment refreshWineFragment) {
        Intrinsics.checkNotNullParameter(refreshWineFragment, NotificationCompat.CATEGORY_EVENT);
        freshLocalRoom();
    }

    public void onDestroy() {
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

    public final void refreshFragment(@Nullable FilterCondition filterCondition) {
        this.zoneAFragment.getRemoteQueryByDevList(filterCondition);
    }

    public final void refreshZoneMainAdapter(boolean z, @Nullable List<? extends List<WineInventoryBean>> list) {
        Fragment fragment = this.currentFragment;
        if (!(fragment instanceof InventoryGenericCabinetZoneBaseFragment)) {
            return;
        }
        if (fragment != null) {
            ((InventoryGenericCabinetZoneBaseFragment) fragment).refreshAdapter(z, list);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.internationalwinecooler.ui.fragment.cabinet_generic.InventoryGenericCabinetZoneBaseFragment");
    }

    public final void setDeleteShow(@NotNull List<String> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "idInventoryList");
        if (!list.isEmpty()) {
            for (String str : list) {
                InventoryMainActivity parentActivity = getParentActivity();
                List<List<WineInventoryBean>> baseWineSortList = getParentActivity().getBaseWineSortList();
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(baseWineSortList, 10));
                for (List it : baseWineSortList) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object next : it) {
                        if (!Intrinsics.areEqual((Object) ((WineInventoryBean) next).getIdInventory(), (Object) str)) {
                            arrayList2.add(next);
                        }
                    }
                    arrayList.add(arrayList2);
                }
                parentActivity.setBaseWineSortList(TypeIntrinsics.asMutableList(arrayList));
            }
            if (z) {
                setDeleteWineSucc(list, false);
            }
        }
        setEmptyViewShow(false, CollectionsKt__CollectionsKt.emptyList());
        refreshZoneMainAdapter(false, (List<? extends List<WineInventoryBean>>) null);
    }

    public void setListeners() {
        subscribeMsgObservable();
    }

    public final void setUnplacedLayoutState(boolean z, @NotNull BaseViewHolder baseViewHolder) {
        Intrinsics.checkNotNullParameter(baseViewHolder, "holder");
        Fragment fragment = this.currentFragment;
        if (!(fragment instanceof InventoryGenericCabinetZoneBaseFragment)) {
            return;
        }
        if (fragment != null) {
            ((InventoryGenericCabinetZoneBaseFragment) fragment).setUnplacedLayoutState(z, baseViewHolder);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.internationalwinecooler.ui.fragment.cabinet_generic.InventoryGenericCabinetZoneBaseFragment");
    }

    public final void setWineSearchCounts() {
        if (getParentActivity().isSearchState()) {
            getParentActivity().getGenericWineBottlesFilterCount();
        } else {
            getParentActivity().getWineBottlesCount();
        }
    }

    public final void setZoneTopViewShowOrHide(boolean z) {
    }
}
