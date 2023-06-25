package com.hisense.juconnect.app_device.fragment;

import com.hisense.juconnect.app_device.R$string;
import com.hisense.juconnect.app_device.activity.NotificationActivity;
import com.hisense.juconnect.app_device.adapter.NotificationAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo47990d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, mo47991d2 = {"com/hisense/juconnect/app_device/fragment/NotificationBaseFragment$setListeners$4", "Lcom/hisense/juconnect/app_device/adapter/NotificationAdapter$OnSelectClickListener;", "onSelectClick", "", "position", "", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: NotificationBaseFragment.kt */
public final class NotificationBaseFragment$setListeners$4 implements NotificationAdapter.OnSelectClickListener {
    public final /* synthetic */ NotificationBaseFragment this$0;

    public NotificationBaseFragment$setListeners$4(NotificationBaseFragment notificationBaseFragment) {
        this.this$0 = notificationBaseFragment;
    }

    public void onSelectClick(int i) {
        if (i == 0) {
            String title = this.this$0.getGroupList().get(i).getTitle();
            if (Intrinsics.areEqual((Object) title, (Object) this.this$0.getString(R$string.today))) {
                NotificationBaseFragment notificationBaseFragment = this.this$0;
                notificationBaseFragment.selectData(notificationBaseFragment.getList1(), i);
            } else if (Intrinsics.areEqual((Object) title, (Object) this.this$0.getString(R$string.this_week))) {
                NotificationBaseFragment notificationBaseFragment2 = this.this$0;
                notificationBaseFragment2.selectData(notificationBaseFragment2.getList2(), i);
            } else if (Intrinsics.areEqual((Object) title, (Object) this.this$0.getString(R$string.this_month))) {
                NotificationBaseFragment notificationBaseFragment3 = this.this$0;
                notificationBaseFragment3.selectData(notificationBaseFragment3.getList3(), i);
            }
        } else if (i != 1) {
            NotificationBaseFragment notificationBaseFragment4 = this.this$0;
            notificationBaseFragment4.selectData(notificationBaseFragment4.getList3(), i);
        } else {
            String title2 = this.this$0.getGroupList().get(i).getTitle();
            if (Intrinsics.areEqual((Object) title2, (Object) this.this$0.getString(R$string.this_week))) {
                NotificationBaseFragment notificationBaseFragment5 = this.this$0;
                notificationBaseFragment5.selectData(notificationBaseFragment5.getList2(), i);
            } else if (Intrinsics.areEqual((Object) title2, (Object) this.this$0.getString(R$string.this_month))) {
                NotificationBaseFragment notificationBaseFragment6 = this.this$0;
                notificationBaseFragment6.selectData(notificationBaseFragment6.getList3(), i);
            }
        }
        NotificationActivity parentActivity = this.this$0.getParentActivity();
        if (parentActivity != null) {
            parentActivity.logSelectCount(this.this$0.getCheckedList().size());
        }
        this.this$0.refreshAdapter();
    }
}
