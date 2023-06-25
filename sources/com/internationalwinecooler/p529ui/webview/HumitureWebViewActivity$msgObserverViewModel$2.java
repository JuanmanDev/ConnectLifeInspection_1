package com.internationalwinecooler.p529ui.webview;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.hisense.connect_life.hismart.networks.request.message.MsgObserverViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo47991d2 = {"<anonymous>", "Lcom/hisense/connect_life/hismart/networks/request/message/MsgObserverViewModel;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.webview.HumitureWebViewActivity$msgObserverViewModel$2 */
/* compiled from: HumitureWebViewActivity.kt */
public final class HumitureWebViewActivity$msgObserverViewModel$2 extends Lambda implements Function0<MsgObserverViewModel> {
    public final /* synthetic */ HumitureWebViewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HumitureWebViewActivity$msgObserverViewModel$2(HumitureWebViewActivity humitureWebViewActivity) {
        super(0);
        this.this$0 = humitureWebViewActivity;
    }

    @NotNull
    public final MsgObserverViewModel invoke() {
        ViewModel viewModel = ViewModelProviders.m97of((FragmentActivity) this.this$0).get(MsgObserverViewModel.class);
        Intrinsics.checkNotNullExpressionValue(viewModel, "of(this).get(MsgObserverViewModel::class.java)");
        return (MsgObserverViewModel) viewModel;
    }
}
