package com.hisense.connect_life.app_account.widget;

import android.text.TextWatcher;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0010"}, mo47991d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "text", "", "start", "", "count", "after", "onTextChanged", "before", "core-ktx_release", "androidx/core/widget/TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$1"}, mo47992k = 1, mo47993mv = {1, 6, 0})
/* compiled from: TextView.kt */
public final class ChangeEmailDialog$setListeners$$inlined$doAfterTextChanged$1 implements TextWatcher {
    public final /* synthetic */ ChangeEmailDialog this$0;

    public ChangeEmailDialog$setListeners$$inlined$doAfterTextChanged$1(ChangeEmailDialog changeEmailDialog) {
        this.this$0 = changeEmailDialog;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x006d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void afterTextChanged(@org.jetbrains.annotations.Nullable android.text.Editable r5) {
        /*
            r4 = this;
            com.hisense.connect_life.app_account.widget.ChangeEmailDialog r5 = r4.this$0
            int r0 = com.hisense.connect_life.app_account.R$id.component_input_password
            android.view.View r0 = r5._$_findCachedViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            int r0 = r0.length()
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L_0x001c
            r0 = r1
            goto L_0x001d
        L_0x001c:
            r0 = r2
        L_0x001d:
            if (r0 == 0) goto L_0x0039
            com.hisense.connect_life.app_account.widget.ChangeEmailDialog r0 = r4.this$0
            int r3 = com.hisense.connect_life.app_account.R$id.component_input_password
            android.view.View r3 = r0._$_findCachedViewById(r3)
            android.widget.EditText r3 = (android.widget.EditText) r3
            android.text.Editable r3 = r3.getText()
            java.lang.String r3 = r3.toString()
            boolean r0 = r0.isContainsNumbersAndLetters(r3)
            if (r0 == 0) goto L_0x0039
            r0 = r1
            goto L_0x003a
        L_0x0039:
            r0 = r2
        L_0x003a:
            r5.enableNextButton(r0)
            com.hisense.connect_life.app_account.widget.ChangeEmailDialog r5 = r4.this$0
            int r0 = com.hisense.connect_life.app_account.R$id.component_input_password
            android.view.View r0 = r5._$_findCachedViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            java.lang.String r3 = "component_input_password"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            r5.showEdittextError(r0, r2)
            com.hisense.connect_life.app_account.widget.ChangeEmailDialog r5 = r4.this$0
            int r0 = com.hisense.connect_life.app_account.R$id.component_input_password
            android.view.View r5 = r5._$_findCachedViewById(r0)
            android.widget.EditText r5 = (android.widget.EditText) r5
            android.text.Editable r5 = r5.getText()
            java.lang.String r5 = r5.toString()
            int r5 = r5.length()
            if (r5 <= 0) goto L_0x0068
            goto L_0x0069
        L_0x0068:
            r1 = r2
        L_0x0069:
            java.lang.String r5 = "tv_error_password"
            if (r1 == 0) goto L_0x0096
            com.hisense.connect_life.app_account.widget.ChangeEmailDialog r0 = r4.this$0
            int r1 = com.hisense.connect_life.app_account.R$id.component_input_password
            android.view.View r1 = r0._$_findCachedViewById(r1)
            android.widget.EditText r1 = (android.widget.EditText) r1
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.isContainsNumbersAndLetters(r1)
            if (r0 == 0) goto L_0x0096
            com.hisense.connect_life.app_account.widget.ChangeEmailDialog r0 = r4.this$0
            int r1 = com.hisense.connect_life.app_account.R$id.tv_error_password
            android.view.View r1 = r0._$_findCachedViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r5)
            r0.gone(r1)
            goto L_0x00bb
        L_0x0096:
            com.hisense.connect_life.app_account.widget.ChangeEmailDialog r0 = r4.this$0
            int r1 = com.hisense.connect_life.app_account.R$id.tv_error_password
            android.view.View r0 = r0._$_findCachedViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            com.hisense.connect_life.app_account.widget.ChangeEmailDialog r1 = r4.this$0
            int r2 = com.hisense.connect_life.app_account.R$string.input_password_too_long_tips
            java.lang.String r1 = r1.getString(r2)
            r0.setText(r1)
            com.hisense.connect_life.app_account.widget.ChangeEmailDialog r0 = r4.this$0
            int r1 = com.hisense.connect_life.app_account.R$id.tv_error_password
            android.view.View r1 = r0._$_findCachedViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r5)
            r0.visible(r1)
        L_0x00bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.connect_life.app_account.widget.ChangeEmailDialog$setListeners$$inlined$doAfterTextChanged$1.afterTextChanged(android.text.Editable):void");
    }

    public void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }
}
