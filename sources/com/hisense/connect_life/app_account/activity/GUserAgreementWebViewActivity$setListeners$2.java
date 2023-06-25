package com.hisense.connect_life.app_account.activity;

import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.hisense.connect_life.app_account.R$id;
import com.hisense.connect_life.app_account.widget.ExtraWebView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: GUserAgreementWebViewActivity.kt */
public final class GUserAgreementWebViewActivity$setListeners$2 extends Lambda implements Function1<View, Unit> {
    public final /* synthetic */ GUserAgreementWebViewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GUserAgreementWebViewActivity$setListeners$2(GUserAgreementWebViewActivity gUserAgreementWebViewActivity) {
        super(1);
        this.this$0 = gUserAgreementWebViewActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable View view) {
        ((ExtraWebView) this.this$0._$_findCachedViewById(R$id.local_webView)).scrollTo(0, (int) (((float) ((ExtraWebView) this.this$0._$_findCachedViewById(R$id.local_webView)).getContentHeight()) * ((ExtraWebView) this.this$0._$_findCachedViewById(R$id.local_webView)).getScale()));
        ((TextView) this.this$0._$_findCachedViewById(R$id.tv_agree)).setVisibility(0);
        ((CardView) this.this$0._$_findCachedViewById(R$id.card_down)).setVisibility(8);
    }
}
