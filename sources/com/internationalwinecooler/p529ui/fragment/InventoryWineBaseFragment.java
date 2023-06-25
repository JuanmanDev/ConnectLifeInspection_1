package com.internationalwinecooler.p529ui.fragment;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.hisense.connect_life.core.base.BaseFragment;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.hismart.networks.request.device.DeviceCache;
import com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo;
import com.hisense.connect_life.hismart.networks.request.wine.model.WineCategoryInfo;
import com.hisense.juconnect.connectlife.R;
import com.internationalwinecooler.p529ui.inventory.InventoryMainActivity;
import com.internationalwinecooler.p529ui.model.EventBottleNum;
import com.juconnect.connectlife.model.WineInventoryBean;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0002J\b\u0010!\u001a\u00020\"H$J\u0010\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0019H\u0014J\u0010\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020\"H\u0016J\u0010\u0010)\u001a\u00020\"2\u0006\u0010*\u001a\u00020+H\u0007J\u001c\u0010,\u001a\u00020\"2\u0006\u0010-\u001a\u00020.2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020100J\u001c\u00102\u001a\u00020\"2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u001f002\u0006\u00104\u001a\u00020.J\"\u00105\u001a\u00020\"2\u0006\u0010-\u001a\u00020.2\u0012\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060000J\b\u00107\u001a\u00020\"H\u0016J\b\u00108\u001a\u00020\"H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u00069"}, mo47991d2 = {"Lcom/internationalwinecooler/ui/fragment/InventoryWineBaseFragment;", "Lcom/hisense/connect_life/core/base/BaseFragment;", "()V", "bottlesCountTextView", "Landroid/widget/TextView;", "getBottlesCountTextView", "()Landroid/widget/TextView;", "setBottlesCountTextView", "(Landroid/widget/TextView;)V", "containerViewId", "", "getContainerViewId", "()I", "setContainerViewId", "(I)V", "emptyView", "getEmptyView", "setEmptyView", "parentActivity", "Lcom/internationalwinecooler/ui/inventory/InventoryMainActivity;", "getParentActivity", "()Lcom/internationalwinecooler/ui/inventory/InventoryMainActivity;", "setParentActivity", "(Lcom/internationalwinecooler/ui/inventory/InventoryMainActivity;)V", "wineView", "Landroid/view/View;", "getWineView", "()Landroid/view/View;", "setWineView", "(Landroid/view/View;)V", "getWineCoolerName", "", "deviceId", "initResourceViewId", "", "initWidgets", "view", "onAttach", "context", "Landroid/content/Context;", "onDestroy", "onEvent", "message", "Lcom/internationalwinecooler/ui/model/EventBottleNum;", "setCategoryEmptyViewShow", "isSearch", "", "searchList", "", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/WineCategoryInfo;", "setDeleteWineSucc", "it", "categoryId", "setEmptyViewShow", "Lcom/juconnect/connectlife/model/WineInventoryBean;", "setWineBottlesCounts", "setWineBottlesCountsFromCategory", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.fragment.InventoryWineBaseFragment */
/* compiled from: InventoryWineBaseFragment.kt */
public abstract class InventoryWineBaseFragment extends BaseFragment {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public TextView bottlesCountTextView;
    public int containerViewId;
    public TextView emptyView;
    public InventoryMainActivity parentActivity;
    public View wineView;

    /* access modifiers changed from: private */
    public final String getWineCoolerName(String str) {
        Boolean bool;
        if (str == null) {
            bool = null;
        } else {
            bool = Boolean.valueOf(DeviceCache.Companion.getInstance().getDevice(str) == null);
        }
        if (bool.booleanValue()) {
            return getString(R.string.device_deleted);
        }
        DeviceInfo device = DeviceCache.Companion.getInstance().getDevice(str);
        if (device == null) {
            return null;
        }
        return device.getDeviceNickName();
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

    @NotNull
    public final TextView getBottlesCountTextView() {
        TextView textView = this.bottlesCountTextView;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("bottlesCountTextView");
        return null;
    }

    public final int getContainerViewId() {
        return this.containerViewId;
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
    public final InventoryMainActivity getParentActivity() {
        InventoryMainActivity inventoryMainActivity = this.parentActivity;
        if (inventoryMainActivity != null) {
            return inventoryMainActivity;
        }
        Intrinsics.throwUninitializedPropertyAccessException("parentActivity");
        return null;
    }

    @NotNull
    public final View getWineView() {
        View view = this.wineView;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("wineView");
        return null;
    }

    public abstract void initResourceViewId();

    public void initWidgets(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        if (getActivity() instanceof InventoryMainActivity) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                setParentActivity((InventoryMainActivity) activity);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.internationalwinecooler.ui.inventory.InventoryMainActivity");
            }
        }
        EventBus.getDefault().register(this);
    }

    public void onDestroy() {
        EventBus.getDefault().unregister(this);
        super.onDestroy();
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@NotNull EventBottleNum eventBottleNum) {
        Intrinsics.checkNotNullParameter(eventBottleNum, "message");
        setWineBottlesCounts();
    }

    public final void setBottlesCountTextView(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.bottlesCountTextView = textView;
    }

    public final void setCategoryEmptyViewShow(boolean z, @NotNull List<WineCategoryInfo> list) {
        Intrinsics.checkNotNullParameter(list, "searchList");
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        if (this.emptyView != null && this.wineView != null) {
            if (z) {
                arrayList.addAll(list);
            } else {
                arrayList.addAll(getParentActivity().getBaseWineCategoryList());
            }
            if (arrayList.isEmpty()) {
                getEmptyView().setVisibility(0);
                getWineView().setVisibility(8);
                return;
            }
            getEmptyView().setVisibility(8);
            getWineView().setVisibility(0);
        }
    }

    public final void setContainerViewId(int i) {
        this.containerViewId = i;
    }

    public final void setDeleteWineSucc(@NotNull List<String> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, LanguageConstKt.f15954it);
        Job unused = BuildersKt__Builders_commonKt.launch$default(this, Dispatchers.getIO(), (CoroutineStart) null, new InventoryWineBaseFragment$setDeleteWineSucc$1(z, list, this, (Continuation<? super InventoryWineBaseFragment$setDeleteWineSucc$1>) null), 2, (Object) null);
    }

    public final void setEmptyView(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.emptyView = textView;
    }

    public final void setEmptyViewShow(boolean z, @NotNull List<? extends List<WineInventoryBean>> list) {
        Intrinsics.checkNotNullParameter(list, "searchList");
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        if (this.emptyView != null && this.wineView != null) {
            if (z) {
                arrayList.addAll(list);
            } else {
                arrayList.addAll(getParentActivity().getBaseWineSortList());
            }
            if (!arrayList.isEmpty()) {
                Collection collection = (Collection) arrayList.get(0);
                if (!(collection == null || collection.isEmpty())) {
                    getEmptyView().setVisibility(8);
                    getWineView().setVisibility(0);
                    return;
                }
            }
            getEmptyView().setVisibility(0);
            getWineView().setVisibility(8);
        }
    }

    public final void setParentActivity(@NotNull InventoryMainActivity inventoryMainActivity) {
        Intrinsics.checkNotNullParameter(inventoryMainActivity, "<set-?>");
        this.parentActivity = inventoryMainActivity;
    }

    public void setWineBottlesCounts() {
        getParentActivity().getWineBottlesCount();
    }

    public void setWineBottlesCountsFromCategory() {
        getParentActivity().getWineBottlesCountFromCategory();
    }

    public final void setWineView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.wineView = view;
    }
}
