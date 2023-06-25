package com.hisense.connect_life.app_account.activity;

import android.widget.Button;
import com.hisense.connect_life.app_account.R$id;
import com.hisense.connect_life.app_account.R$string;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: LoginResetPswActivity.kt */
public final class LoginResetPswActivity$startCountDown$2 extends Lambda implements Function1<Integer, Unit> {
    public final /* synthetic */ LoginResetPswActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoginResetPswActivity$startCountDown$2(LoginResetPswActivity loginResetPswActivity) {
        super(1);
        this.this$0 = loginResetPswActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        LoginResetPswActivity loginResetPswActivity = this.this$0;
        String string = loginResetPswActivity.getString(R$string.resend_in_x_seconds, new Object[]{Integer.valueOf(loginResetPswActivity.countDownTime - i)});
        Intrinsics.checkNotNullExpressionValue(string, "getString(\n             …e - it)\n                )");
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "ROOT");
        String upperCase = string.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        ((Button) this.this$0._$_findCachedViewById(R$id.get_verification_code)).setText(upperCase);
    }
}
