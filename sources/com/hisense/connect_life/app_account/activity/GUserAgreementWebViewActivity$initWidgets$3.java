package com.hisense.connect_life.app_account.activity;

import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.hisense.connect_life.app_account.R$id;
import com.hisense.connect_life.app_account.widget.ExtraWebView;
import kotlin.Metadata;

@Metadata(mo47990d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0016J(\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0016J(\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0016¨\u0006\u000b"}, mo47991d2 = {"com/hisense/connect_life/app_account/activity/GUserAgreementWebViewActivity$initWidgets$3", "Lcom/hisense/connect_life/app_account/widget/ExtraWebView$OnScrollChangeListener;", "onPageEnd", "", "l", "", "t", "oldl", "oldt", "onPageTop", "onScrollChanged", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: GUserAgreementWebViewActivity.kt */
public final class GUserAgreementWebViewActivity$initWidgets$3 implements ExtraWebView.OnScrollChangeListener {
    public final /* synthetic */ GUserAgreementWebViewActivity this$0;

    public GUserAgreementWebViewActivity$initWidgets$3(GUserAgreementWebViewActivity gUserAgreementWebViewActivity) {
        this.this$0 = gUserAgreementWebViewActivity;
    }

    public void onPageEnd(int i, int i2, int i3, int i4) {
        i + " , " + i2 + " , " + i3 + " , " + i4;
        ((TextView) this.this$0._$_findCachedViewById(R$id.tv_agree)).setVisibility(0);
        ((CardView) this.this$0._$_findCachedViewById(R$id.card_down)).setVisibility(8);
    }

    public void onPageTop(int i, int i2, int i3, int i4) {
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        ((TextView) this.this$0._$_findCachedViewById(R$id.tv_agree)).setVisibility(8);
        ((CardView) this.this$0._$_findCachedViewById(R$id.card_down)).setVisibility(0);
    }
}
