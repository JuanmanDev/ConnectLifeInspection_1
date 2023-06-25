package com.hisense.connect_life.app_account.activity;

import android.text.TextUtils;
import android.view.View;
import com.hisense.connect_life.app_account.R$string;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: PrivacyPolicyActivity.kt */
public final class PrivacyPolicyActivity$setListeners$4 extends Lambda implements Function1<View, Unit> {
    public final /* synthetic */ PrivacyPolicyActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PrivacyPolicyActivity$setListeners$4(PrivacyPolicyActivity privacyPolicyActivity) {
        super(1);
        this.this$0 = privacyPolicyActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable View view) {
        if (TextUtils.isEmpty(this.this$0.getConnetlifePrivacyPolicyUrl())) {
            PrivacyPolicyActivity privacyPolicyActivity = this.this$0;
            String string = privacyPolicyActivity.getString(R$string.failure);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.failure)");
            privacyPolicyActivity.showString(string);
            return;
        }
        this.this$0.isReadPolicy = true;
        PrivacyPolicyActivity privacyPolicyActivity2 = this.this$0;
        String string2 = privacyPolicyActivity2.getString(R$string.register_privacy_policy_connetlife);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.regis…rivacy_policy_connetlife)");
        privacyPolicyActivity2.gotoAgreementWebViewActivity(string2, this.this$0.getConnetlifePrivacyPolicyUrl());
    }
}
