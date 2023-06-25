package p040c.p482v.p483a.p492g;

import androidx.lifecycle.Observer;
import com.internationalwinecooler.p529ui.webview.InventoryWebViewActivity;
import kotlin.Pair;

/* renamed from: c.v.a.g.q */
/* compiled from: lambda */
public final /* synthetic */ class C7637q implements Observer {

    /* renamed from: a */
    public final /* synthetic */ InventoryWebViewActivity f14371a;

    public /* synthetic */ C7637q(InventoryWebViewActivity inventoryWebViewActivity) {
        this.f14371a = inventoryWebViewActivity;
    }

    public final void onChanged(Object obj) {
        InventoryWebViewActivity.m27211setListeners$lambda2(this.f14371a, (Pair) obj);
    }
}
