package com.hisense.connect_life.app_account.widget;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import com.hisense.connect_life.app_account.R$id;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import p040c.p072c.p073a.p074a.C1519p;

@Metadata(mo47990d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0010"}, mo47991d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "text", "", "start", "", "count", "after", "onTextChanged", "before", "core-ktx_release", "androidx/core/widget/TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$1"}, mo47992k = 1, mo47993mv = {1, 6, 0})
/* compiled from: TextView.kt */
public final class ChangeEmailDialog$setListeners$$inlined$doAfterTextChanged$3 implements TextWatcher {
    public final /* synthetic */ ChangeEmailDialog this$0;

    public ChangeEmailDialog$setListeners$$inlined$doAfterTextChanged$3(ChangeEmailDialog changeEmailDialog) {
        this.this$0 = changeEmailDialog;
    }

    public void afterTextChanged(@Nullable Editable editable) {
        ChangeEmailDialog changeEmailDialog = this.this$0;
        boolean z = true;
        if (!(((EditText) changeEmailDialog._$_findCachedViewById(R$id.component_input_email)).getText().toString().length() > 0) || !C1519p.m1017a(((EditText) this.this$0._$_findCachedViewById(R$id.component_input_email)).getText().toString())) {
            z = false;
        }
        changeEmailDialog.enableNextButton(z);
        ChangeEmailDialog changeEmailDialog2 = this.this$0;
        EditText editText = (EditText) changeEmailDialog2._$_findCachedViewById(R$id.component_input_email);
        Intrinsics.checkNotNullExpressionValue(editText, "component_input_email");
        changeEmailDialog2.showEdittextError(editText, false);
        ChangeEmailDialog changeEmailDialog3 = this.this$0;
        TextView textView = (TextView) changeEmailDialog3._$_findCachedViewById(R$id.tv_error_email);
        Intrinsics.checkNotNullExpressionValue(textView, "tv_error_email");
        changeEmailDialog3.gone(textView);
    }

    public void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }
}
