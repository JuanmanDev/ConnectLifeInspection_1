package p040c.p482v.p483a.p484d.p485a;

import android.view.View;
import com.hisense.connect_life.core.widget.InventoryExactPositionTextView;
import com.internationalwinecooler.p529ui.adapter.cabinet_exact.InventoryExactShelfAdapter;
import com.juconnect.connectlife.model.WineInventoryBean;

/* renamed from: c.v.a.d.a.b */
/* compiled from: lambda */
public final /* synthetic */ class C7598b implements View.OnClickListener {

    /* renamed from: e */
    public final /* synthetic */ InventoryExactShelfAdapter f14317e;

    /* renamed from: l */
    public final /* synthetic */ InventoryExactPositionTextView f14318l;

    /* renamed from: m */
    public final /* synthetic */ InventoryExactPositionTextView f14319m;

    /* renamed from: n */
    public final /* synthetic */ WineInventoryBean f14320n;

    /* renamed from: o */
    public final /* synthetic */ int f14321o;

    /* renamed from: p */
    public final /* synthetic */ int f14322p;

    /* renamed from: q */
    public final /* synthetic */ int f14323q;

    public /* synthetic */ C7598b(InventoryExactShelfAdapter inventoryExactShelfAdapter, InventoryExactPositionTextView inventoryExactPositionTextView, InventoryExactPositionTextView inventoryExactPositionTextView2, WineInventoryBean wineInventoryBean, int i, int i2, int i3) {
        this.f14317e = inventoryExactShelfAdapter;
        this.f14318l = inventoryExactPositionTextView;
        this.f14319m = inventoryExactPositionTextView2;
        this.f14320n = wineInventoryBean;
        this.f14321o = i;
        this.f14322p = i2;
        this.f14323q = i3;
    }

    public final void onClick(View view) {
        InventoryExactShelfAdapter.m27179setExactWineInfo$lambda10$lambda9(this.f14317e, this.f14318l, this.f14319m, this.f14320n, this.f14321o, this.f14322p, this.f14323q, view);
    }
}
