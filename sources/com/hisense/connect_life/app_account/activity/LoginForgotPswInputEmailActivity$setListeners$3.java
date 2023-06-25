package com.hisense.connect_life.app_account.activity;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.hisense.connect_life.app_account.R$drawable;
import com.hisense.connect_life.app_account.R$id;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, mo47991d2 = {"com/hisense/connect_life/app_account/activity/LoginForgotPswInputEmailActivity$setListeners$3", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: LoginForgotPswInputEmailActivity.kt */
public final class LoginForgotPswInputEmailActivity$setListeners$3 implements TextWatcher {
    public final /* synthetic */ LoginForgotPswInputEmailActivity this$0;

    public LoginForgotPswInputEmailActivity$setListeners$3(LoginForgotPswInputEmailActivity loginForgotPswInputEmailActivity) {
        this.this$0 = loginForgotPswInputEmailActivity;
    }

    public void afterTextChanged(@Nullable Editable editable) {
    }

    public void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        boolean z = false;
        ((TextInputLayout) this.this$0._$_findCachedViewById(R$id.tv_error_email)).setErrorEnabled(false);
        Editable text = ((EditText) this.this$0._$_findCachedViewById(R$id.forget_email)).getText();
        Intrinsics.checkNotNullExpressionValue(text, "forget_email.text");
        if (text.length() > 0) {
            z = true;
        }
        if (z) {
            ((EditText) this.this$0._$_findCachedViewById(R$id.forget_email)).setBackgroundResource(R$drawable.edittext_background_contour);
        } else {
            ((EditText) this.this$0._$_findCachedViewById(R$id.forget_email)).setBackgroundResource(R$drawable.edittext_background_white);
        }
        this.this$0.setGetVerificationBtnShow();
    }
}
