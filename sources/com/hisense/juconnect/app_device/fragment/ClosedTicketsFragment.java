package com.hisense.juconnect.app_device.fragment;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.hisense.juconnect.app_device.R$id;
import com.hisense.juconnect.app_device.R$layout;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0014J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\t"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/fragment/ClosedTicketsFragment;", "Lcom/hisense/juconnect/app_device/fragment/TicketsBaseFragment;", "()V", "bindLayout", "", "initWidgets", "", "view", "Landroid/view/View;", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ClosedTicketsFragment.kt */
public final class ClosedTicketsFragment extends TicketsBaseFragment {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();

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
        return R$layout.fragment_closed_tickets;
    }

    public void initWidgets(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        setCurrentFragmentIndex(1);
        TextView textView = (TextView) _$_findCachedViewById(R$id.closed_tickets_empty);
        Intrinsics.checkNotNullExpressionValue(textView, "closed_tickets_empty");
        setEmptyView(textView);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R$id.closed_tickets_service);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "closed_tickets_service");
        setTicketsRecyclerView(recyclerView);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) _$_findCachedViewById(R$id.closed_tickets_refreshLayout);
        Intrinsics.checkNotNullExpressionValue(swipeRefreshLayout, "closed_tickets_refreshLayout");
        setSwipeRefreshLayout(swipeRefreshLayout);
        super.initWidgets(view);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }
}
