package com.hisense.connect_life.app_account.activity;

import android.view.View;
import com.hisense.connect_life.app_account.R$string;
import com.hisense.connect_life.core.global.EventBusConstKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: GUserAgreementWebViewActivity.kt */
public final class GUserAgreementWebViewActivity$setListeners$3 extends Lambda implements Function1<View, Unit> {
    public final /* synthetic */ GUserAgreementWebViewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GUserAgreementWebViewActivity$setListeners$3(GUserAgreementWebViewActivity gUserAgreementWebViewActivity) {
        super(1);
        this.this$0 = gUserAgreementWebViewActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable View view) {
        String from = this.this$0.getFrom();
        switch (from.hashCode()) {
            case -902839837:
                if (from.equals(EventBusConstKt.FROM_REGISTER_USERAGREEMENT)) {
                    this.this$0.getVerification();
                    return;
                }
                return;
            case -897648709:
                if (from.equals(EventBusConstKt.FROM_THIRD_REGISTER_USERAGREEMENT)) {
                    if (this.this$0.getUserEmail().length() > 0) {
                        GUserAgreementWebViewActivity.access$getMViewModel(this.this$0).checkLoginNameSign(this.this$0.getUserEmail());
                        return;
                    } else {
                        this.this$0.gotoThirdRegister();
                        return;
                    }
                } else {
                    return;
                }
            case -746733270:
                if (from.equals(EventBusConstKt.THIRD_REGISTER)) {
                    GUserAgreementWebViewActivity gUserAgreementWebViewActivity = this.this$0;
                    String string = gUserAgreementWebViewActivity.getString(R$string.register_privacy_policy_connetlife);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.regis…rivacy_policy_connetlife)");
                    gUserAgreementWebViewActivity.gotoAgreementWebViewActivity(string, this.this$0.getPrivacyPolicyUrl(), EventBusConstKt.FROM_THIRD_REGISTER_USERAGREEMENT, this.this$0.getAgreementUrl(), this.this$0.getPrivacyPolicyUrl());
                    this.this$0.finish();
                    return;
                }
                return;
            case -690213213:
                if (!from.equals(EventBusConstKt.REGISTER)) {
                    return;
                }
                break;
            case 94627080:
                boolean equals = from.equals(EventBusConstKt.CHECK);
                return;
            case 103149417:
                if (!from.equals(EventBusConstKt.LOGIN)) {
                    return;
                }
                break;
            case 354267177:
                if (from.equals(EventBusConstKt.FROM_LOGIN_USERAGREEMENT)) {
                    this.this$0.updateJHLUserRegisterProtocol();
                    return;
                }
                return;
            default:
                return;
        }
        GUserAgreementWebViewActivity gUserAgreementWebViewActivity2 = this.this$0;
        String string2 = gUserAgreementWebViewActivity2.getString(R$string.register_privacy_policy_connetlife);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.regis…rivacy_policy_connetlife)");
        gUserAgreementWebViewActivity2.gotoAgreementWebViewActivity(string2, this.this$0.getPrivacyPolicyUrl(), Intrinsics.areEqual((Object) this.this$0.getFrom(), (Object) EventBusConstKt.REGISTER) ? EventBusConstKt.FROM_REGISTER_USERAGREEMENT : EventBusConstKt.FROM_LOGIN_USERAGREEMENT, this.this$0.getAgreementUrl(), this.this$0.getPrivacyPolicyUrl());
        this.this$0.finish();
    }
}
