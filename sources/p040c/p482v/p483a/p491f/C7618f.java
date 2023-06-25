package p040c.p482v.p483a.p491f;

import androidx.lifecycle.Observer;
import com.internationalwinecooler.p529ui.inventory.InventoryMainActivity;
import java.util.List;
import kotlin.jvm.internal.Ref;

/* renamed from: c.v.a.f.f */
/* compiled from: lambda */
public final /* synthetic */ class C7618f implements Observer {

    /* renamed from: a */
    public final /* synthetic */ InventoryMainActivity f14350a;

    /* renamed from: b */
    public final /* synthetic */ Ref.ObjectRef f14351b;

    public /* synthetic */ C7618f(InventoryMainActivity inventoryMainActivity, Ref.ObjectRef objectRef) {
        this.f14350a = inventoryMainActivity;
        this.f14351b = objectRef;
    }

    public final void onChanged(Object obj) {
        InventoryMainActivity.m27195getWineCategoryWithLastChange$lambda11(this.f14350a, this.f14351b, (List) obj);
    }
}
