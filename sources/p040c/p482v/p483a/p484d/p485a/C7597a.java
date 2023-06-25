package p040c.p482v.p483a.p484d.p485a;

import android.view.View;
import com.hisense.connect_life.core.widget.InventoryExactPositionTextView;
import com.internationalwinecooler.p529ui.adapter.cabinet_exact.InventoryExactShelfAdapter;
import com.juconnect.connectlife.model.WineInventoryBean;

/* renamed from: c.v.a.d.a.a */
/* compiled from: lambda */
public final /* synthetic */ class C7597a implements View.OnClickListener {

    /* renamed from: e */
    public final /* synthetic */ InventoryExactShelfAdapter f14310e;

    /* renamed from: l */
    public final /* synthetic */ InventoryExactPositionTextView f14311l;

    /* renamed from: m */
    public final /* synthetic */ InventoryExactPositionTextView f14312m;

    /* renamed from: n */
    public final /* synthetic */ WineInventoryBean f14313n;

    /* renamed from: o */
    public final /* synthetic */ int f14314o;

    /* renamed from: p */
    public final /* synthetic */ int f14315p;

    /* renamed from: q */
    public final /* synthetic */ int f14316q;

    public /* synthetic */ C7597a(InventoryExactShelfAdapter inventoryExactShelfAdapter, InventoryExactPositionTextView inventoryExactPositionTextView, InventoryExactPositionTextView inventoryExactPositionTextView2, WineInventoryBean wineInventoryBean, int i, int i2, int i3) {
        this.f14310e = inventoryExactShelfAdapter;
        this.f14311l = inventoryExactPositionTextView;
        this.f14312m = inventoryExactPositionTextView2;
        this.f14313n = wineInventoryBean;
        this.f14314o = i;
        this.f14315p = i2;
        this.f14316q = i3;
    }

    public final void onClick(View view) {
        InventoryExactShelfAdapter.m27180setExactWineInfoA1$lambda12$lambda11(this.f14310e, this.f14311l, this.f14312m, this.f14313n, this.f14314o, this.f14315p, this.f14316q, view);
    }
}
