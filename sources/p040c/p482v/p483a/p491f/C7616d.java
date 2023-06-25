package p040c.p482v.p483a.p491f;

import androidx.lifecycle.Observer;
import com.internationalwinecooler.p529ui.inventory.InventoryMainActivity;
import kotlin.Pair;

/* renamed from: c.v.a.f.d */
/* compiled from: lambda */
public final /* synthetic */ class C7616d implements Observer {

    /* renamed from: a */
    public final /* synthetic */ InventoryMainActivity f14348a;

    public /* synthetic */ C7616d(InventoryMainActivity inventoryMainActivity) {
        this.f14348a = inventoryMainActivity;
    }

    public final void onChanged(Object obj) {
        InventoryMainActivity.m27202subscribeObservableCategory$lambda34(this.f14348a, (Pair) obj);
    }
}
