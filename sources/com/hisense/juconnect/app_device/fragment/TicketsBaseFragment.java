package com.hisense.juconnect.app_device.fragment;

import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.hisense.connect_life.core.base.BaseViewModel;
import com.hisense.connect_life.core.base.BaseVmFragment;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.juconnect.app_device.adapter.TicketsAdapter;
import com.hisense.juconnect.app_device.model.TicketViewModel;
import com.juconnect.connectlife.model.TicketBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p429r.p460b.p461a.p464c.C7547m;
import p040c.p429r.p460b.p461a.p464c.C7548n;

@Metadata(mo47990d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u000e\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.J\u000e\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000200H\u0016J\u0010\u00101\u001a\u00020,2\u0006\u00102\u001a\u000203H\u0014J\b\u00104\u001a\u00020,H\u0002J\b\u00105\u001a\u00020,H\u0002J\b\u00106\u001a\u00020,H\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u001aj\b\u0012\u0004\u0012\u00020\u0018`\u001bX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u001aj\b\u0012\u0004\u0012\u00020\u0018`\u001bX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u00020\u001eX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u000e\u0010#\u001a\u00020$X.¢\u0006\u0002\n\u0000R\u001a\u0010%\u001a\u00020&X.¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u00067"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/fragment/TicketsBaseFragment;", "Lcom/hisense/connect_life/core/base/BaseVmFragment;", "Lcom/hisense/connect_life/core/base/BaseViewModel;", "()V", "currentFragmentIndex", "", "getCurrentFragmentIndex", "()I", "setCurrentFragmentIndex", "(I)V", "emptyView", "Landroid/widget/TextView;", "getEmptyView", "()Landroid/widget/TextView;", "setEmptyView", "(Landroid/widget/TextView;)V", "inventoryWineViewModel", "Lcom/hisense/juconnect/app_device/model/TicketViewModel;", "getInventoryWineViewModel", "()Lcom/hisense/juconnect/app_device/model/TicketViewModel;", "inventoryWineViewModel$delegate", "Lkotlin/Lazy;", "listData", "", "Lcom/juconnect/connectlife/model/TicketBean;", "list_closed", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "list_opened", "swipeRefreshLayout", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "getSwipeRefreshLayout", "()Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "setSwipeRefreshLayout", "(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V", "ticketsAdapter", "Lcom/hisense/juconnect/app_device/adapter/TicketsAdapter;", "ticketsRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getTicketsRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setTicketsRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "getTickets", "", "showLoading", "", "initViewModelClz", "Ljava/lang/Class;", "initWidgets", "view", "Landroid/view/View;", "refreshData", "setEmptyShow", "setListeners", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: TicketsBaseFragment.kt */
public abstract class TicketsBaseFragment extends BaseVmFragment<BaseViewModel> {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public int currentFragmentIndex;
    public TextView emptyView;
    @NotNull
    public final Lazy inventoryWineViewModel$delegate = LazyKt__LazyJVMKt.lazy(new TicketsBaseFragment$inventoryWineViewModel$2(this));
    @NotNull
    public final List<TicketBean> listData = new ArrayList();
    @NotNull
    public ArrayList<TicketBean> list_closed = new ArrayList<>();
    @NotNull
    public ArrayList<TicketBean> list_opened = new ArrayList<>();
    public SwipeRefreshLayout swipeRefreshLayout;
    public TicketsAdapter ticketsAdapter;
    public RecyclerView ticketsRecyclerView;

    /* access modifiers changed from: private */
    public final TicketViewModel getInventoryWineViewModel() {
        return (TicketViewModel) this.inventoryWineViewModel$delegate.getValue();
    }

    /* renamed from: initWidgets$lambda-1  reason: not valid java name */
    public static final void m27169initWidgets$lambda1(TicketsBaseFragment ticketsBaseFragment, List list) {
        Intrinsics.checkNotNullParameter(ticketsBaseFragment, "this$0");
        ticketsBaseFragment.list_closed.clear();
        ticketsBaseFragment.list_opened.clear();
        Intrinsics.checkNotNullExpressionValue(list, LanguageConstKt.f15954it);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TicketBean ticketBean = (TicketBean) it.next();
            if (Intrinsics.areEqual((Object) KeyConst.CLAIM_FINISHED, (Object) ticketBean.getStatus())) {
                ticketsBaseFragment.list_closed.add(ticketBean);
            } else {
                ticketsBaseFragment.list_opened.add(ticketBean);
            }
        }
        if (list.size() > 0) {
            ticketsBaseFragment.refreshData();
        }
    }

    /* access modifiers changed from: private */
    public final void refreshData() {
        ArrayList<TicketBean> arrayList = this.list_opened;
        if (arrayList.size() > 1) {
            CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList, new TicketsBaseFragment$refreshData$$inlined$sortBy$1());
        }
        ArrayList<TicketBean> arrayList2 = this.list_closed;
        if (arrayList2.size() > 1) {
            CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList2, new TicketsBaseFragment$refreshData$$inlined$sortBy$2());
        }
        List<TicketBean> list = this.listData;
        if (list != null) {
            list.clear();
        }
        int i = this.currentFragmentIndex;
        TicketsAdapter ticketsAdapter2 = null;
        if (i == 0) {
            List<TicketBean> list2 = this.listData;
            ArrayList<TicketBean> arrayList3 = this.list_opened;
            list2.addAll(arrayList3 == null ? null : CollectionsKt___CollectionsKt.reversed(arrayList3));
        } else if (i == 1) {
            List<TicketBean> list3 = this.listData;
            ArrayList<TicketBean> arrayList4 = this.list_closed;
            list3.addAll(arrayList4 == null ? null : CollectionsKt___CollectionsKt.reversed(arrayList4));
        }
        setEmptyShow();
        TicketsAdapter ticketsAdapter3 = this.ticketsAdapter;
        if (ticketsAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ticketsAdapter");
        } else {
            ticketsAdapter2 = ticketsAdapter3;
        }
        ticketsAdapter2.notifyDataSetChanged();
    }

    private final void setEmptyShow() {
        TextView emptyView2 = getEmptyView();
        int i = 0;
        if (!(this.listData.size() == 0)) {
            i = 8;
        }
        emptyView2.setVisibility(i);
    }

    /* renamed from: setListeners$lambda-2  reason: not valid java name */
    public static final void m27170setListeners$lambda2(TicketsBaseFragment ticketsBaseFragment) {
        Intrinsics.checkNotNullParameter(ticketsBaseFragment, "this$0");
        ticketsBaseFragment.getTickets(false);
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

    public final int getCurrentFragmentIndex() {
        return this.currentFragmentIndex;
    }

    @NotNull
    public final TextView getEmptyView() {
        TextView textView = this.emptyView;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("emptyView");
        return null;
    }

    @NotNull
    public final SwipeRefreshLayout getSwipeRefreshLayout() {
        SwipeRefreshLayout swipeRefreshLayout2 = this.swipeRefreshLayout;
        if (swipeRefreshLayout2 != null) {
            return swipeRefreshLayout2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("swipeRefreshLayout");
        return null;
    }

    public final void getTickets(boolean z) {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        showProgressDialog(requireActivity, true);
        HiSmart.Companion.getInstance().wineWineInventoryManagerSerivce().getTickeList(new TicketsBaseFragment$getTickets$1(this), new TicketsBaseFragment$getTickets$2(this));
    }

    @NotNull
    public final RecyclerView getTicketsRecyclerView() {
        RecyclerView recyclerView = this.ticketsRecyclerView;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("ticketsRecyclerView");
        return null;
    }

    @NotNull
    public Class<BaseViewModel> initViewModelClz() {
        return BaseViewModel.class;
    }

    public void initWidgets(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        getTicketsRecyclerView().setLayoutManager(new LinearLayoutManager(getActivity()));
        this.ticketsAdapter = new TicketsAdapter(this.listData);
        RecyclerView ticketsRecyclerView2 = getTicketsRecyclerView();
        TicketsAdapter ticketsAdapter2 = this.ticketsAdapter;
        if (ticketsAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ticketsAdapter");
            ticketsAdapter2 = null;
        }
        ticketsRecyclerView2.setAdapter(ticketsAdapter2);
        getInventoryWineViewModel().getTicketListData().observe(this, new C7547m(this));
        Job unused = BuildersKt__Builders_commonKt.launch$default(this, Dispatchers.getIO(), (CoroutineStart) null, new TicketsBaseFragment$initWidgets$2(this, (Continuation<? super TicketsBaseFragment$initWidgets$2>) null), 2, (Object) null);
        getTickets(false);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final void setCurrentFragmentIndex(int i) {
        this.currentFragmentIndex = i;
    }

    public final void setEmptyView(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.emptyView = textView;
    }

    public void setListeners() {
        TicketsAdapter ticketsAdapter2 = this.ticketsAdapter;
        if (ticketsAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ticketsAdapter");
            ticketsAdapter2 = null;
        }
        ticketsAdapter2.setItemIndexedCallback(new TicketsBaseFragment$setListeners$1());
        getSwipeRefreshLayout().setOnRefreshListener(new C7548n(this));
    }

    public final void setSwipeRefreshLayout(@NotNull SwipeRefreshLayout swipeRefreshLayout2) {
        Intrinsics.checkNotNullParameter(swipeRefreshLayout2, "<set-?>");
        this.swipeRefreshLayout = swipeRefreshLayout2;
    }

    public final void setTicketsRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<set-?>");
        this.ticketsRecyclerView = recyclerView;
    }
}
