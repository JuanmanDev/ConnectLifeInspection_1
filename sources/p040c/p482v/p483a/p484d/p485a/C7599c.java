package p040c.p482v.p483a.p484d.p485a;

import android.view.View;
import com.hisense.connect_life.core.widget.InventoryExactPositionTextView;
import com.internationalwinecooler.p529ui.adapter.cabinet_exact.InventoryExactShelfAdapter;
import com.juconnect.connectlife.model.WineInventoryBean;

/* renamed from: c.v.a.d.a.c */
/* compiled from: lambda */
public final /* synthetic */ class C7599c implements View.OnClickListener {

    /* renamed from: e */
    public final /* synthetic */ InventoryExactShelfAdapter f14324e;

    /* renamed from: l */
    public final /* synthetic */ InventoryExactPositionTextView f14325l;

    /* renamed from: m */
    public final /* synthetic */ InventoryExactPositionTextView f14326m;

    /* renamed from: n */
    public final /* synthetic */ WineInventoryBean f14327n;

    /* renamed from: o */
    public final /* synthetic */ int f14328o;

    /* renamed from: p */
    public final /* synthetic */ int f14329p;

    /* renamed from: q */
    public final /* synthetic */ int f14330q;

    public /* synthetic */ C7599c(InventoryExactShelfAdapter inventoryExactShelfAdapter, InventoryExactPositionTextView inventoryExactPositionTextView, InventoryExactPositionTextView inventoryExactPositionTextView2, WineInventoryBean wineInventoryBean, int i, int i2, int i3) {
        this.f14324e = inventoryExactShelfAdapter;
        this.f14325l = inventoryExactPositionTextView;
        this.f14326m = inventoryExactPositionTextView2;
        this.f14327n = wineInventoryBean;
        this.f14328o = i;
        this.f14329p = i2;
        this.f14330q = i3;
    }

    public final void onClick(View view) {
        InventoryExactShelfAdapter.m27181setTwoExactWineInfoA1$lambda14$lambda13(this.f14324e, this.f14325l, this.f14326m, this.f14327n, this.f14328o, this.f14329p, this.f14330q, view);
    }
}
