package com.hisense.connect_life.app_account.activity;

import android.widget.Button;
import com.hisense.connect_life.app_account.R$id;
import com.hisense.connect_life.app_account.R$string;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(mo47990d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo47991d2 = {"<anonymous>", "", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: LoginResetPswActivity.kt */
public final class LoginResetPswActivity$startCountDown$1 extends Lambda implements Function0<Unit> {
    public final /* synthetic */ LoginResetPswActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoginResetPswActivity$startCountDown$1(LoginResetPswActivity loginResetPswActivity) {
        super(0);
        this.this$0 = loginResetPswActivity;
    }

    public final void invoke() {
        String string = this.this$0.getString(R$string.resend);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.resend)");
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "ROOT");
        String upperCase = string.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        ((Button) this.this$0._$_findCachedViewById(R$id.get_verification_code)).setText(upperCase);
        LoginResetPswActivity loginResetPswActivity = this.this$0;
        Button button = (Button) loginResetPswActivity._$_findCachedViewById(R$id.get_verification_code);
        Intrinsics.checkNotNullExpressionValue(button, "get_verification_code");
        loginResetPswActivity.enableButton(button, true);
    }
}
