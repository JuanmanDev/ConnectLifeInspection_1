package p040c.p482v.p483a.p492g;

import androidx.lifecycle.Observer;
import com.internationalwinecooler.p529ui.webview.InventoryWebViewActivity;

/* renamed from: c.v.a.g.m */
/* compiled from: lambda */
public final /* synthetic */ class C7633m implements Observer {

    /* renamed from: a */
    public final /* synthetic */ InventoryWebViewActivity f14366a;

    public /* synthetic */ C7633m(InventoryWebViewActivity inventoryWebViewActivity) {
        this.f14366a = inventoryWebViewActivity;
    }

    public final void onChanged(Object obj) {
        InventoryWebViewActivity.m27210setListeners$lambda0(this.f14366a, (Boolean) obj);
    }
}
