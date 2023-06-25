package com.hisense.connect_life.app_account.activity;

import android.text.Editable;
import android.text.TextWatcher;
import com.hisense.connect_life.app_account.R$string;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0010"}, mo47991d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "text", "", "start", "", "count", "after", "onTextChanged", "before", "core-ktx_release", "androidx/core/widget/TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$1"}, mo47992k = 1, mo47993mv = {1, 6, 0})
/* renamed from: com.hisense.connect_life.app_account.activity.LoginResetFirstActivity$setListeners$$inlined$doAfterTextChanged$1 */
/* compiled from: TextView.kt */
public final class C8447x695a5a64 implements TextWatcher {
    public final /* synthetic */ LoginResetFirstActivity this$0;

    public C8447x695a5a64(LoginResetFirstActivity loginResetFirstActivity) {
        this.this$0 = loginResetFirstActivity;
    }

    public void afterTextChanged(@Nullable Editable editable) {
        LoginResetFirstActivity loginResetFirstActivity = this.this$0;
        String string = this.this$0.getString(R$string.change_email_tips_2);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.change_email_tips_2)");
        loginResetFirstActivity.showEmailError(!loginResetFirstActivity.checkEmailFormat(), string);
        LoginResetFirstActivity loginResetFirstActivity2 = this.this$0;
        loginResetFirstActivity2.enableNextButton(loginResetFirstActivity2.checkEmailFormat());
    }

    public void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }
}
