package com.hisense.connect_life.app_account.activity;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.hisense.connect_life.app_account.R$id;
import com.hisense.connect_life.app_account.R$string;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0010"}, mo47991d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "text", "", "start", "", "count", "after", "onTextChanged", "before", "core-ktx_release", "androidx/core/widget/TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$1"}, mo47992k = 1, mo47993mv = {1, 6, 0})
/* renamed from: com.hisense.connect_life.app_account.activity.RegisterInputEmaliActiviy$setListeners$$inlined$doAfterTextChanged$2 */
/* compiled from: TextView.kt */
public final class C8454x9cabadbe implements TextWatcher {
    public final /* synthetic */ RegisterInputEmaliActiviy this$0;

    public C8454x9cabadbe(RegisterInputEmaliActiviy registerInputEmaliActiviy) {
        this.this$0 = registerInputEmaliActiviy;
    }

    public void afterTextChanged(@Nullable Editable editable) {
        RegisterInputEmaliActiviy registerInputEmaliActiviy = this.this$0;
        if (!registerInputEmaliActiviy.checkPasswordFormat(((EditText) registerInputEmaliActiviy._$_findCachedViewById(R$id.sign_password)).getText().toString())) {
            RegisterInputEmaliActiviy registerInputEmaliActiviy2 = this.this$0;
            String string = registerInputEmaliActiviy2.getString(R$string.input_password_too_long_tips);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.input_password_too_long_tips)");
            TextView textView = (TextView) this.this$0._$_findCachedViewById(R$id.tv_error_password);
            Intrinsics.checkNotNullExpressionValue(textView, "tv_error_password");
            LinearLayout linearLayout = (LinearLayout) this.this$0._$_findCachedViewById(R$id.ll_et_password_bg);
            Intrinsics.checkNotNullExpressionValue(linearLayout, "ll_et_password_bg");
            registerInputEmaliActiviy2.showPasswordError(true, string, textView, linearLayout);
        } else {
            if (!(((EditText) this.this$0._$_findCachedViewById(R$id.sign_repeat_password)).getText().toString().length() > 0) || this.this$0.checkPasswordSame()) {
                RegisterInputEmaliActiviy registerInputEmaliActiviy3 = this.this$0;
                TextView textView2 = (TextView) registerInputEmaliActiviy3._$_findCachedViewById(R$id.tv_error_password);
                Intrinsics.checkNotNullExpressionValue(textView2, "tv_error_password");
                LinearLayout linearLayout2 = (LinearLayout) this.this$0._$_findCachedViewById(R$id.ll_et_password_bg);
                Intrinsics.checkNotNullExpressionValue(linearLayout2, "ll_et_password_bg");
                registerInputEmaliActiviy3.showPasswordError(false, "", textView2, linearLayout2);
                RegisterInputEmaliActiviy registerInputEmaliActiviy4 = this.this$0;
                TextView textView3 = (TextView) registerInputEmaliActiviy4._$_findCachedViewById(R$id.tv_error_repeat_password);
                Intrinsics.checkNotNullExpressionValue(textView3, "tv_error_repeat_password");
                LinearLayout linearLayout3 = (LinearLayout) this.this$0._$_findCachedViewById(R$id.ll_et_repeat_password_bg);
                Intrinsics.checkNotNullExpressionValue(linearLayout3, "ll_et_repeat_password_bg");
                registerInputEmaliActiviy4.showPasswordError(false, "", textView3, linearLayout3);
            } else {
                RegisterInputEmaliActiviy registerInputEmaliActiviy5 = this.this$0;
                String string2 = registerInputEmaliActiviy5.getString(R$string.inconsistent_passwords);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.inconsistent_passwords)");
                TextView textView4 = (TextView) this.this$0._$_findCachedViewById(R$id.tv_error_password);
                Intrinsics.checkNotNullExpressionValue(textView4, "tv_error_password");
                LinearLayout linearLayout4 = (LinearLayout) this.this$0._$_findCachedViewById(R$id.ll_et_password_bg);
                Intrinsics.checkNotNullExpressionValue(linearLayout4, "ll_et_password_bg");
                registerInputEmaliActiviy5.showPasswordError(true, string2, textView4, linearLayout4);
            }
        }
        this.this$0.setNextShow();
    }

    public void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }
}
