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

@Metadata(mo47990d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, mo47991d2 = {"com/hisense/connect_life/app_account/activity/DeviceCerVerificationActivity$setListeners$4", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: DeviceCerVerificationActivity.kt */
public final class DeviceCerVerificationActivity$setListeners$4 implements TextWatcher {
    public final /* synthetic */ DeviceCerVerificationActivity this$0;

    public DeviceCerVerificationActivity$setListeners$4(DeviceCerVerificationActivity deviceCerVerificationActivity) {
        this.this$0 = deviceCerVerificationActivity;
    }

    public void afterTextChanged(@Nullable Editable editable) {
    }

    public void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        boolean z = false;
        ((TextInputLayout) this.this$0._$_findCachedViewById(R$id.til_verification)).setErrorEnabled(false);
        Editable text = ((EditText) this.this$0._$_findCachedViewById(R$id.edit_verification)).getText();
        Intrinsics.checkNotNullExpressionValue(text, "edit_verification.text");
        if (text.length() > 0) {
            ((EditText) this.this$0._$_findCachedViewById(R$id.edit_verification)).setBackgroundResource(R$drawable.edittext_background_contour);
        } else {
            ((EditText) this.this$0._$_findCachedViewById(R$id.edit_verification)).setBackgroundResource(R$drawable.edittext_background_white);
        }
        DeviceCerVerificationActivity deviceCerVerificationActivity = this.this$0;
        Editable text2 = ((EditText) deviceCerVerificationActivity._$_findCachedViewById(R$id.edit_verification)).getText();
        Intrinsics.checkNotNullExpressionValue(text2, "edit_verification.text");
        if (text2.length() > 0) {
            z = true;
        }
        deviceCerVerificationActivity.setNextShow(z);
    }
}
