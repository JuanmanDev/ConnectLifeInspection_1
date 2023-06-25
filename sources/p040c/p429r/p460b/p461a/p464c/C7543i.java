package p040c.p429r.p460b.p461a.p464c;

import android.view.View;
import android.widget.ExpandableListView;
import com.hisense.juconnect.app_device.fragment.NotificationBaseFragment;

/* renamed from: c.r.b.a.c.i */
/* compiled from: lambda */
public final /* synthetic */ class C7543i implements ExpandableListView.OnChildClickListener {

    /* renamed from: e */
    public final /* synthetic */ NotificationBaseFragment f14242e;

    public /* synthetic */ C7543i(NotificationBaseFragment notificationBaseFragment) {
        this.f14242e = notificationBaseFragment;
    }

    public final boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j) {
        return NotificationBaseFragment.m27161setListeners$lambda2(this.f14242e, expandableListView, view, i, i2, j);
    }
}
