package com.hisense.juconnect.app_device.fragment;

import android.view.View;
import android.widget.AbsListView;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016J\u001a\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¨\u0006\f"}, mo47991d2 = {"com/hisense/juconnect/app_device/fragment/NotificationBaseFragment$setListeners$6", "Landroid/widget/AbsListView$OnScrollListener;", "onScroll", "", "view", "Landroid/widget/AbsListView;", "firstVisibleItem", "", "visibleItemCount", "totalItemCount", "onScrollStateChanged", "scrollState", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: NotificationBaseFragment.kt */
public final class NotificationBaseFragment$setListeners$6 implements AbsListView.OnScrollListener {
    public final /* synthetic */ NotificationBaseFragment this$0;

    public NotificationBaseFragment$setListeners$6(NotificationBaseFragment notificationBaseFragment) {
        this.this$0 = notificationBaseFragment;
    }

    public void onScroll(@Nullable AbsListView absListView, int i, int i2, int i3) {
        View childAt = absListView == null ? null : absListView.getChildAt(i);
        if (!this.this$0.getSelected()) {
            this.this$0.getSwipeRefreshLayout().setEnabled(i == 0 && (childAt == null || childAt.getTop() == 0));
        }
    }

    public void onScrollStateChanged(@Nullable AbsListView absListView, int i) {
    }
}
