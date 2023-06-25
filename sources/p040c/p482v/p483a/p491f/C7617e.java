package p040c.p482v.p483a.p491f;

import androidx.lifecycle.Observer;
import com.internationalwinecooler.p529ui.inventory.InventoryMainActivity;
import kotlin.Pair;

/* renamed from: c.v.a.f.e */
/* compiled from: lambda */
public final /* synthetic */ class C7617e implements Observer {

    /* renamed from: a */
    public final /* synthetic */ InventoryMainActivity f14349a;

    public /* synthetic */ C7617e(InventoryMainActivity inventoryMainActivity) {
        this.f14349a = inventoryMainActivity;
    }

    public final void onChanged(Object obj) {
        InventoryMainActivity.m27201subscribeObservableCategory$lambda33(this.f14349a, (Pair) obj);
    }
}
