package p040c.p482v.p483a.p491f;

import androidx.lifecycle.Observer;
import com.internationalwinecooler.p529ui.inventory.InventoryMainActivity;
import com.internationalwinecooler.p529ui.model.UserFilerWineCondition;

/* renamed from: c.v.a.f.b */
/* compiled from: lambda */
public final /* synthetic */ class C7614b implements Observer {

    /* renamed from: a */
    public final /* synthetic */ InventoryMainActivity f14346a;

    public /* synthetic */ C7614b(InventoryMainActivity inventoryMainActivity) {
        this.f14346a = inventoryMainActivity;
    }

    public final void onChanged(Object obj) {
        InventoryMainActivity.m27200subscribeObservableCategory$lambda32(this.f14346a, (UserFilerWineCondition) obj);
    }
}
