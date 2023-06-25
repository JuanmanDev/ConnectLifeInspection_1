package com.internationalwinecooler.p529ui.webview;

import android.app.Activity;
import com.hisense.connect_life.core.listener.IPredicate;
import com.hisense.juconnect.connectlife.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p687n.p688a.p689a.C9818b;
import pub.devrel.easypermissions.EasyPermissions;

@Metadata(mo47990d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, mo47991d2 = {"com/internationalwinecooler/ui/webview/InventoryWebViewActivity$displayAddWineDialog$1", "Lcom/hisense/connect_life/core/listener/IPredicate;", "accept", "", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.webview.InventoryWebViewActivity$displayAddWineDialog$1 */
/* compiled from: InventoryWebViewActivity.kt */
public final class InventoryWebViewActivity$displayAddWineDialog$1 implements IPredicate {
    public final /* synthetic */ InventoryWebViewActivity this$0;

    public InventoryWebViewActivity$displayAddWineDialog$1(InventoryWebViewActivity inventoryWebViewActivity) {
        this.this$0 = inventoryWebViewActivity;
    }

    public void accept() {
        if (EasyPermissions.m26767a(this.this$0, "android.permission.CAMERA")) {
            this.this$0.gotoAddWineActivity();
            return;
        }
        C9818b.C9820b bVar = new C9818b.C9820b((Activity) this.this$0, 3, "android.permission.CAMERA");
        bVar.mo50749d(R.string.camera_permissions);
        bVar.mo50748c(R.string.rationale_ask_ok);
        bVar.mo50747b(R.string.camera_cancel);
        C9818b a = bVar.mo50746a();
        Intrinsics.checkNotNullExpressionValue(a, "Builder(\n               …                 .build()");
        EasyPermissions.m26771e(a);
    }
}
