package com.internationalwinecooler.p529ui.fragment;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.FastScroller;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.core.utils.Holder;
import com.hisense.connect_life.hismart.networks.request.message.MessageObserver;
import com.hisense.connect_life.hismart.networks.request.message.listener.MessageReceivedListener;
import com.hisense.connect_life.hismart.networks.request.wine.model.WineCategoryInfo;
import com.hisense.juconnect.connectlife.R;
import com.internationalwinecooler.p529ui.adapter.WineCategoryListAdapter;
import com.juconnect.connect_life.R$id;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p140m.p141a.C2056a;
import p040c.p140m.p141a.C2059b;
import p040c.p140m.p141a.C2060c;

@Metadata(mo47990d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010!\u001a\u00020\u0014H\u0014J\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0007J\b\u0010&\u001a\u00020#H\u0014J\u0010\u0010'\u001a\u00020#2\u0006\u0010(\u001a\u00020)H\u0014J%\u0010*\u001a\u00020#2\u0006\u0010+\u001a\u00020\u00112\b\u0010,\u001a\u0004\u0018\u00010\u00142\u0006\u0010-\u001a\u00020\u0014¢\u0006\u0002\u0010.J\b\u0010/\u001a\u00020#H\u0016J\u0014\u00100\u001a\u00020#2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u000702J\u0006\u00103\u001a\u00020#J\u0006\u00104\u001a\u00020#J\b\u00105\u001a\u00020#H\u0014J\b\u00106\u001a\u00020#H\u0016J\u0006\u00107\u001a\u00020#J\b\u00108\u001a\u00020#H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001cX.¢\u0006\u0002\n\u0000¨\u00069"}, mo47991d2 = {"Lcom/internationalwinecooler/ui/fragment/WineCategoryListFragment;", "Lcom/internationalwinecooler/ui/fragment/InventoryWineBaseFragment;", "()V", "categoryListAdapter", "Lcom/internationalwinecooler/ui/adapter/WineCategoryListAdapter;", "idCategoriesList", "", "", "isInit", "", "job", "Lkotlinx/coroutines/CompletableJob;", "getJob", "()Lkotlinx/coroutines/CompletableJob;", "setJob", "(Lkotlinx/coroutines/CompletableJob;)V", "mHolder", "Lcom/hisense/connect_life/core/utils/Holder;", "mIsFavorite", "mPosition", "", "messageReceivedListener", "Lcom/hisense/connect_life/hismart/networks/request/message/listener/MessageReceivedListener;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "selectedDeleteWineList", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/WineCategoryInfo;", "skeletonScreen", "Lcom/ethanhua/skeleton/SkeletonScreen;", "sortId", "wineCategoryFavorite", "bindLayout", "dismissSkeletonScreen", "", "filter", "s", "initResourceViewId", "initWidgets", "view", "Landroid/view/View;", "notifiItemData", "holder", "favorite", "position", "(Lcom/hisense/connect_life/core/utils/Holder;Ljava/lang/Integer;I)V", "onDestroy", "setDeleteShow", "it", "", "setIsFavoriteRequest", "setIsFavoriteRequestFailed", "setListeners", "setWineBottlesCounts", "setWineCategoryListShow", "subscribeMsgObservable", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.fragment.WineCategoryListFragment */
/* compiled from: WineCategoryListFragment.kt */
public final class WineCategoryListFragment extends InventoryWineBaseFragment {
    @NotNull
    public Map<Integer, View> _$_findViewCache;
    public WineCategoryListAdapter categoryListAdapter;
    @NotNull
    public List<String> idCategoriesList = new ArrayList();
    public boolean isInit = true;
    @NotNull
    public CompletableJob job;
    public Holder mHolder;
    public boolean mIsFavorite;
    public int mPosition;
    @Nullable
    public MessageReceivedListener messageReceivedListener;
    @NotNull
    public final CoroutineScope scope;
    @NotNull
    public List<WineCategoryInfo> selectedDeleteWineList = new ArrayList();
    public C2060c skeletonScreen;
    @NotNull
    public String sortId = "";
    public WineCategoryInfo wineCategoryFavorite;

    public WineCategoryListFragment() {
        CompletableJob Job$default = JobKt.Job$default((Job) null, 1, (Object) null);
        this.job = Job$default;
        this.scope = CoroutineScopeKt.CoroutineScope(Job$default);
        this._$_findViewCache = new LinkedHashMap();
    }

    private final void subscribeMsgObservable() {
        WineCategoryListFragment$subscribeMsgObservable$1 wineCategoryListFragment$subscribeMsgObservable$1 = new WineCategoryListFragment$subscribeMsgObservable$1(this);
        this.messageReceivedListener = wineCategoryListFragment$subscribeMsgObservable$1;
        if (wineCategoryListFragment$subscribeMsgObservable$1 != null) {
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
        return R.layout.fragment_wine_list_layout;
    }

    public final void dismissSkeletonScreen() {
        C2060c cVar = this.skeletonScreen;
        WineCategoryListAdapter wineCategoryListAdapter = null;
        if (cVar != null) {
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("skeletonScreen");
            }
            if (this.isInit) {
                C2060c cVar2 = this.skeletonScreen;
                if (cVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("skeletonScreen");
                    cVar2 = null;
                }
                cVar2.mo16683a();
                this.isInit = false;
            }
        }
        if (((RecyclerView) _$_findCachedViewById(R$id.wine_list_recycler)).getAdapter() == null) {
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R$id.wine_list_recycler);
            WineCategoryListAdapter wineCategoryListAdapter2 = this.categoryListAdapter;
            if (wineCategoryListAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("categoryListAdapter");
            } else {
                wineCategoryListAdapter = wineCategoryListAdapter2;
            }
            recyclerView.setAdapter(wineCategoryListAdapter);
        }
    }

    public final void filter(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "s");
        WineCategoryListAdapter wineCategoryListAdapter = this.categoryListAdapter;
        if (wineCategoryListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("categoryListAdapter");
            wineCategoryListAdapter = null;
        }
        wineCategoryListAdapter.filterName(str);
    }

    @NotNull
    public final CompletableJob getJob() {
        return this.job;
    }

    @NotNull
    public final CoroutineScope getScope() {
        return this.scope;
    }

    public void initResourceViewId() {
        TextView textView = (TextView) _$_findCachedViewById(R$id.empty_view);
        Intrinsics.checkNotNullExpressionValue(textView, "empty_view");
        setEmptyView(textView);
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(R$id.wine_layout);
        Intrinsics.checkNotNullExpressionValue(linearLayout, "wine_layout");
        setWineView(linearLayout);
    }

    public void initWidgets(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.initWidgets(view);
        initResourceViewId();
        int inventoryType = getParentActivity().getInventoryType();
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity);
        Intrinsics.checkNotNullExpressionValue(activity, "activity!!");
        this.categoryListAdapter = new WineCategoryListAdapter(inventoryType, activity);
        ((RecyclerView) _$_findCachedViewById(R$id.wine_list_recycler)).setLayoutManager(new LinearLayoutManager(getActivity()));
        C2056a.C2058b a = C2059b.m2882a((RecyclerView) _$_findCachedViewById(R$id.wine_list_recycler));
        WineCategoryListAdapter wineCategoryListAdapter = this.categoryListAdapter;
        if (wineCategoryListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("categoryListAdapter");
            wineCategoryListAdapter = null;
        }
        a.mo16685j(wineCategoryListAdapter);
        a.mo16692q(true);
        a.mo16686k(30);
        a.mo16687l(R.color.color_defalut);
        a.mo16690o(true);
        a.mo16689n(FastScroller.HIDE_DELAY_AFTER_DRAGGING_MS);
        a.mo16688m(10);
        a.mo16691p(R.layout.inventory_wine_list_item_default);
        C2056a r = a.mo16693r();
        Intrinsics.checkNotNullExpressionValue(r, "bind(wine_list_recycler)…骨架屏UI\n            .show()");
        this.skeletonScreen = r;
    }

    public final void notifiItemData(@NotNull Holder holder, @Nullable Integer num, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        WineCategoryListAdapter wineCategoryListAdapter = this.categoryListAdapter;
        if (wineCategoryListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("categoryListAdapter");
            wineCategoryListAdapter = null;
        }
        boolean z = true;
        if (num == null || num.intValue() != 1) {
            z = false;
        }
        wineCategoryListAdapter.setIsFavoriteRequest(holder, Boolean.valueOf(z), i);
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

    public final void setDeleteShow(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, LanguageConstKt.f15954it);
        if (!list.isEmpty()) {
            for (WineCategoryInfo remove : this.selectedDeleteWineList) {
                getParentActivity().getBaseWineCategoryList().remove(remove);
            }
            setWineBottlesCounts();
            setDeleteWineSucc(list, true);
        } else {
            String string = getString(R.string.failure);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.failure)");
            showString(string);
        }
        setCategoryEmptyViewShow(false, CollectionsKt__CollectionsKt.emptyList());
        ((CardView) _$_findCachedViewById(R$id.delete_cv)).setVisibility(8);
        WineCategoryListAdapter wineCategoryListAdapter = this.categoryListAdapter;
        WineCategoryListAdapter wineCategoryListAdapter2 = null;
        if (wineCategoryListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("categoryListAdapter");
            wineCategoryListAdapter = null;
        }
        wineCategoryListAdapter.clearSelectState();
        WineCategoryListAdapter wineCategoryListAdapter3 = this.categoryListAdapter;
        if (wineCategoryListAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("categoryListAdapter");
            wineCategoryListAdapter3 = null;
        }
        wineCategoryListAdapter3.setDataList(getParentActivity().getBaseWineCategoryList(), true ^ getParentActivity().isSelectShowDelete());
        WineCategoryListAdapter wineCategoryListAdapter4 = this.categoryListAdapter;
        if (wineCategoryListAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("categoryListAdapter");
        } else {
            wineCategoryListAdapter2 = wineCategoryListAdapter4;
        }
        wineCategoryListAdapter2.notifyDataSetChanged();
    }

    public final void setIsFavoriteRequest() {
        WineCategoryListAdapter wineCategoryListAdapter = this.categoryListAdapter;
        Holder holder = null;
        if (wineCategoryListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("categoryListAdapter");
            wineCategoryListAdapter = null;
        }
        Holder holder2 = this.mHolder;
        if (holder2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHolder");
        } else {
            holder = holder2;
        }
        wineCategoryListAdapter.setIsFavoriteRequest(holder, Boolean.valueOf(this.mIsFavorite), this.mPosition);
    }

    public final void setIsFavoriteRequestFailed() {
        WineCategoryListAdapter wineCategoryListAdapter = this.categoryListAdapter;
        Holder holder = null;
        if (wineCategoryListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("categoryListAdapter");
            wineCategoryListAdapter = null;
        }
        Holder holder2 = this.mHolder;
        if (holder2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHolder");
        } else {
            holder = holder2;
        }
        wineCategoryListAdapter.setIsFavoriteRequest(holder, Boolean.valueOf(!this.mIsFavorite), this.mPosition);
    }

    public final void setJob(@NotNull CompletableJob completableJob) {
        Intrinsics.checkNotNullParameter(completableJob, "<set-?>");
        this.job = completableJob;
    }

    public void setListeners() {
        WineCategoryListAdapter wineCategoryListAdapter = this.categoryListAdapter;
        WineCategoryListAdapter wineCategoryListAdapter2 = null;
        if (wineCategoryListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("categoryListAdapter");
            wineCategoryListAdapter = null;
        }
        wineCategoryListAdapter.setItemIndexedCallback(new WineCategoryListFragment$setListeners$1(this));
        WineCategoryListAdapter wineCategoryListAdapter3 = this.categoryListAdapter;
        if (wineCategoryListAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("categoryListAdapter");
            wineCategoryListAdapter3 = null;
        }
        wineCategoryListAdapter3.setSelectDeleteCallback(new WineCategoryListFragment$setListeners$2(this));
        WineCategoryListAdapter wineCategoryListAdapter4 = this.categoryListAdapter;
        if (wineCategoryListAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("categoryListAdapter");
            wineCategoryListAdapter4 = null;
        }
        wineCategoryListAdapter4.setClickFavoriteCallback(new WineCategoryListFragment$setListeners$3(this));
        WineCategoryListAdapter wineCategoryListAdapter5 = this.categoryListAdapter;
        if (wineCategoryListAdapter5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("categoryListAdapter");
        } else {
            wineCategoryListAdapter2 = wineCategoryListAdapter5;
        }
        wineCategoryListAdapter2.setEmptyViewListener(new WineCategoryListFragment$setListeners$4(this));
        subscribeMsgObservable();
    }

    public void setWineBottlesCounts() {
        setWineBottlesCountsFromCategory();
    }

    public final void setWineCategoryListShow() {
        dismissSkeletonScreen();
        WineCategoryListAdapter wineCategoryListAdapter = this.categoryListAdapter;
        WineCategoryListAdapter wineCategoryListAdapter2 = null;
        if (wineCategoryListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("categoryListAdapter");
            wineCategoryListAdapter = null;
        }
        wineCategoryListAdapter.clearSelectState();
        List<WineCategoryInfo> baseWineCategoryList = getParentActivity().getBaseWineCategoryList();
        if (baseWineCategoryList != null) {
            WineCategoryListAdapter wineCategoryListAdapter3 = this.categoryListAdapter;
            if (wineCategoryListAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("categoryListAdapter");
                wineCategoryListAdapter3 = null;
            }
            wineCategoryListAdapter3.setDataList(baseWineCategoryList, !getParentActivity().isSelectShowDelete());
        }
        WineCategoryListAdapter wineCategoryListAdapter4 = this.categoryListAdapter;
        if (wineCategoryListAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("categoryListAdapter");
        } else {
            wineCategoryListAdapter2 = wineCategoryListAdapter4;
        }
        wineCategoryListAdapter2.notifyDataSetChanged();
        setWineBottlesCountsFromCategory();
        setCategoryEmptyViewShow(false, CollectionsKt__CollectionsKt.emptyList());
        this.idCategoriesList.clear();
        ((CardView) _$_findCachedViewById(R$id.delete_cv)).setVisibility(8);
    }
}
