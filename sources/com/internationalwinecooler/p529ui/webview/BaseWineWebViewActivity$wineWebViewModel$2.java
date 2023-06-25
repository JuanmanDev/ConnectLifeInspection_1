package com.internationalwinecooler.p529ui.webview;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.internationalwinecooler.p529ui.WineWebViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo47991d2 = {"<anonymous>", "Lcom/internationalwinecooler/ui/WineWebViewModel;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.webview.BaseWineWebViewActivity$wineWebViewModel$2 */
/* compiled from: BaseWineWebViewActivity.kt */
public final class BaseWineWebViewActivity$wineWebViewModel$2 extends Lambda implements Function0<WineWebViewModel> {
    public final /* synthetic */ BaseWineWebViewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseWineWebViewActivity$wineWebViewModel$2(BaseWineWebViewActivity baseWineWebViewActivity) {
        super(0);
        this.this$0 = baseWineWebViewActivity;
    }

    @NotNull
    public final WineWebViewModel invoke() {
        ViewModel viewModel = ViewModelProviders.m97of((FragmentActivity) this.this$0).get(WineWebViewModel.class);
        Intrinsics.checkNotNullExpressionValue(viewModel, "of(this).get(WineWebViewModel::class.java)");
        return (WineWebViewModel) viewModel;
    }
}
