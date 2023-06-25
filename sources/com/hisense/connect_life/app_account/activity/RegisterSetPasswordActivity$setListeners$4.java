package com.hisense.connect_life.app_account.activity;

import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.hisense.connect_life.app_account.R$id;
import com.hisense.connect_life.app_account.R$string;
import com.hisense.connect_life.core.widget.IconFontView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: RegisterSetPasswordActivity.kt */
public final class RegisterSetPasswordActivity$setListeners$4 extends Lambda implements Function1<View, Unit> {
    public final /* synthetic */ RegisterSetPasswordActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RegisterSetPasswordActivity$setListeners$4(RegisterSetPasswordActivity registerSetPasswordActivity) {
        super(1);
        this.this$0 = registerSetPasswordActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable View view) {
        IconFontView iconFontView = (IconFontView) this.this$0._$_findCachedViewById(R$id.show_hide_repeat_password_set);
        RegisterSetPasswordActivity registerSetPasswordActivity = this.this$0;
        if (TextUtils.equals(iconFontView.getText(), registerSetPasswordActivity.getString(R$string.icon_login_password_show))) {
            iconFontView.setTextSize(20.0f);
            ((EditText) registerSetPasswordActivity._$_findCachedViewById(R$id.sign_repeat_password)).setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            Editable text = ((EditText) registerSetPasswordActivity._$_findCachedViewById(R$id.sign_repeat_password)).getText();
            Selection.setSelection(text, text.length());
            iconFontView.setText(iconFontView.getResources().getString(R$string.icon_login_password_close));
            return;
        }
        iconFontView.setTextSize(14.0f);
        ((EditText) registerSetPasswordActivity._$_findCachedViewById(R$id.sign_repeat_password)).setTransformationMethod(PasswordTransformationMethod.getInstance());
        Editable text2 = ((EditText) registerSetPasswordActivity._$_findCachedViewById(R$id.sign_repeat_password)).getText();
        Selection.setSelection(text2, text2.length());
        iconFontView.setText(iconFontView.getResources().getString(R$string.icon_login_password_show));
    }
}
