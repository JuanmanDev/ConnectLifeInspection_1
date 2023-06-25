package com.hisense.connect_life.app_account.widget;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import com.hisense.connect_life.app_account.R$id;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0010"}, mo47991d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "text", "", "start", "", "count", "after", "onTextChanged", "before", "core-ktx_release", "androidx/core/widget/TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$1"}, mo47992k = 1, mo47993mv = {1, 6, 0})
/* compiled from: TextView.kt */
public final class ChangeEmailDialog$setListeners$$inlined$doAfterTextChanged$2 implements TextWatcher {
    public final /* synthetic */ ChangeEmailDialog this$0;

    public ChangeEmailDialog$setListeners$$inlined$doAfterTextChanged$2(ChangeEmailDialog changeEmailDialog) {
        this.this$0 = changeEmailDialog;
    }

    public void afterTextChanged(@Nullable Editable editable) {
        Integer num;
        Integer num2 = (Integer) this.this$0.liveDataUIState.getValue();
        if (num2 != null && num2.intValue() == 3) {
            ChangeEmailDialog changeEmailDialog = this.this$0;
            changeEmailDialog.oldEmailCode = ((EditText) changeEmailDialog._$_findCachedViewById(R$id.component_input_code)).getText().toString();
        } else if (num2 != null && num2.intValue() == 2) {
            ChangeEmailDialog changeEmailDialog2 = this.this$0;
            changeEmailDialog2.newEmailCode = ((EditText) changeEmailDialog2._$_findCachedViewById(R$id.component_input_code)).getText().toString();
        }
        Integer num3 = (Integer) this.this$0.liveDataUIState.getValue();
        if ((num3 != null && num3.intValue() == 3) || ((num = (Integer) this.this$0.liveDataUIState.getValue()) != null && num.intValue() == 2)) {
            ChangeEmailDialog changeEmailDialog3 = this.this$0;
            changeEmailDialog3.enableNextButton(((EditText) changeEmailDialog3._$_findCachedViewById(R$id.component_input_code)).getText().toString().length() > 0);
        }
        ChangeEmailDialog changeEmailDialog4 = this.this$0;
        EditText editText = (EditText) changeEmailDialog4._$_findCachedViewById(R$id.component_input_code);
        Intrinsics.checkNotNullExpressionValue(editText, "component_input_code");
        changeEmailDialog4.showEdittextError(editText, false);
        ChangeEmailDialog changeEmailDialog5 = this.this$0;
        TextView textView = (TextView) changeEmailDialog5._$_findCachedViewById(R$id.tv_error_code);
        Intrinsics.checkNotNullExpressionValue(textView, "tv_error_code");
        changeEmailDialog5.gone(textView);
    }

    public void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }
}
