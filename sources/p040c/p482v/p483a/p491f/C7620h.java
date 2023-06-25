package p040c.p482v.p483a.p491f;

import androidx.lifecycle.Observer;
import com.internationalwinecooler.p529ui.inventory.InventoryMainActivity;
import java.util.List;

/* renamed from: c.v.a.f.h */
/* compiled from: lambda */
public final /* synthetic */ class C7620h implements Observer {

    /* renamed from: a */
    public final /* synthetic */ InventoryMainActivity f14353a;

    public /* synthetic */ C7620h(InventoryMainActivity inventoryMainActivity) {
        this.f14353a = inventoryMainActivity;
    }

    public final void onChanged(Object obj) {
        InventoryMainActivity.m27198subscribeObservable$lambda29(this.f14353a, (List) obj);
    }
}
