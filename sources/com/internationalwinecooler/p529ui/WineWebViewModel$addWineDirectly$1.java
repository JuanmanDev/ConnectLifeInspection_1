package com.internationalwinecooler.p529ui;

import com.hisense.connect_life.hismart.networks.request.HiResponse;
import com.hisense.connect_life.hismart.networks.request.wine.model.AddWineResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "Lcom/hisense/connect_life/hismart/networks/request/HiResponse;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.WineWebViewModel$addWineDirectly$1 */
/* compiled from: WineWebViewModel.kt */
public final class WineWebViewModel$addWineDirectly$1 extends Lambda implements Function1<HiResponse, Unit> {
    public final /* synthetic */ AddWineResult $addWineResult;
    public final /* synthetic */ WineWebViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WineWebViewModel$addWineDirectly$1(WineWebViewModel wineWebViewModel, AddWineResult addWineResult) {
        super(1);
        this.this$0 = wineWebViewModel;
        this.$addWineResult = addWineResult;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((HiResponse) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable HiResponse hiResponse) {
        int i = 1;
        boolean z = false;
        if (hiResponse != null && hiResponse.getResultCode() == 0) {
            z = true;
        }
        if (z) {
            this.this$0.addWineSuccess("add wine success", this.$addWineResult);
            return;
        }
        WineWebViewModel wineWebViewModel = this.this$0;
        String valueOf = String.valueOf(hiResponse);
        if (hiResponse != null) {
            i = hiResponse.getResultCode();
        }
        wineWebViewModel.addWineInfoError(valueOf, i);
    }
}
