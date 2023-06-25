package com.hisense.juconnect.app_device.fragment;

import com.hisense.juconnect.app_device.adapter.NotificationAdapter;
import com.hisense.juconnect.app_device.event.DeleteNotification;
import com.juconnect.connectlife.sql.NotificationRoom;
import java.util.ArrayList;
import kotlin.Metadata;
import org.greenrobot.eventbus.EventBus;

@Metadata(mo47990d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, mo47991d2 = {"com/hisense/juconnect/app_device/fragment/NotificationBaseFragment$setListeners$5", "Lcom/hisense/juconnect/app_device/adapter/NotificationAdapter$OnSelectClickListener;", "onSelectClick", "", "position", "", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: NotificationBaseFragment.kt */
public final class NotificationBaseFragment$setListeners$5 implements NotificationAdapter.OnSelectClickListener {
    public final /* synthetic */ NotificationBaseFragment this$0;

    public NotificationBaseFragment$setListeners$5(NotificationBaseFragment notificationBaseFragment) {
        this.this$0 = notificationBaseFragment;
    }

    public void onSelectClick(int i) {
        ArrayList arrayList = new ArrayList();
        this.this$0.getList1().get(i).getMsgId();
        NotificationRoom.Companion.notificationProvider().deleteById(this.this$0.getList1().get(i).getMsgId());
        arrayList.add(this.this$0.getList1().get(i).getMsgId());
        EventBus.getDefault().post(104);
        EventBus.getDefault().post(new DeleteNotification(arrayList));
        this.this$0.getCheckedList().clear();
    }
}
