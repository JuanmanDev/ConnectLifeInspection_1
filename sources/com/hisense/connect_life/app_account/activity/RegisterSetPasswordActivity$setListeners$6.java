package com.hisense.connect_life.app_account.activity;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.hisense.connect_life.app_account.R$id;
import com.hisense.connect_life.app_account.R$string;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, mo47991d2 = {"com/hisense/connect_life/app_account/activity/RegisterSetPasswordActivity$setListeners$6", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: RegisterSetPasswordActivity.kt */
public final class RegisterSetPasswordActivity$setListeners$6 implements TextWatcher {
    public final /* synthetic */ RegisterSetPasswordActivity this$0;

    public RegisterSetPasswordActivity$setListeners$6(RegisterSetPasswordActivity registerSetPasswordActivity) {
        this.this$0 = registerSetPasswordActivity;
    }

    public void afterTextChanged(@Nullable Editable editable) {
        if (((EditText) this.this$0._$_findCachedViewById(R$id.sign_repeat_password)).length() > 30) {
            RegisterSetPasswordActivity registerSetPasswordActivity = this.this$0;
            String string = registerSetPasswordActivity.getString(R$string.input_password_too_long_tips);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.input_password_too_long_tips)");
            registerSetPasswordActivity.showString(string);
            if (editable != null) {
                editable.delete(((EditText) this.this$0._$_findCachedViewById(R$id.sign_repeat_password)).getSelectionStart() - 1, ((EditText) this.this$0._$_findCachedViewById(R$id.sign_repeat_password)).getSelectionEnd());
            }
            ((EditText) this.this$0._$_findCachedViewById(R$id.sign_repeat_password)).setText(editable);
            ((EditText) this.this$0._$_findCachedViewById(R$id.sign_repeat_password)).setSelection(((EditText) this.this$0._$_findCachedViewById(R$id.sign_repeat_password)).length());
        }
    }

    public void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        boolean z = false;
        ((TextInputLayout) this.this$0._$_findCachedViewById(R$id.til_repeat_password)).setErrorEnabled(false);
        RegisterSetPasswordActivity registerSetPasswordActivity = this.this$0;
        if (((EditText) registerSetPasswordActivity._$_findCachedViewById(R$id.sign_repeat_password)).getText().toString().length() > 7 && ((EditText) this.this$0._$_findCachedViewById(R$id.sign_password)).getText().toString().length() > 7) {
            z = true;
        }
        registerSetPasswordActivity.setNextShow(z);
    }
}
