package com.hisense.connect_life.app_account.widget;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.hisense.connect_life.app_account.R$id;
import com.hisense.connect_life.app_account.R$string;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ChangeEmailDialog.kt */
public final class ChangeEmailDialog$setListeners$4 extends Lambda implements Function1<View, Unit> {
    public final /* synthetic */ ChangeEmailDialog this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChangeEmailDialog$setListeners$4(ChangeEmailDialog changeEmailDialog) {
        super(1);
        this.this$0 = changeEmailDialog;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable View view) {
        Integer num = (Integer) this.this$0.liveDataUIState.getValue();
        if (num != null && num.intValue() == 0) {
            this.this$0.requestCheckPassword();
        } else if (num != null && num.intValue() == 3) {
            ChangeEmailDialog changeEmailDialog = this.this$0;
            changeEmailDialog.requestCheckAuthCode(changeEmailDialog.oldEmail, 5);
        } else if (num != null && num.intValue() == 1) {
            this.this$0.requestCheckNewEmail();
        } else if (num != null && num.intValue() == 2) {
            ChangeEmailDialog changeEmailDialog2 = this.this$0;
            changeEmailDialog2.requestCheckAuthCode(StringsKt__StringsKt.trim((CharSequence) ((EditText) changeEmailDialog2._$_findCachedViewById(R$id.component_input_email)).getText().toString()).toString(), 6);
        } else if (num != null && num.intValue() == 4) {
            ChangeEmailDialog changeEmailDialog3 = this.this$0;
            changeEmailDialog3.newPassword = StringsKt__StringsKt.trim((CharSequence) ((EditText) changeEmailDialog3._$_findCachedViewById(R$id.component_input_password)).getText().toString()).toString();
            this.this$0.liveDataUIState.setValue(Integer.valueOf(this.this$0.currentProcess.nextStep()));
        } else if (num != null && num.intValue() == 5) {
            ChangeEmailDialog changeEmailDialog4 = this.this$0;
            changeEmailDialog4.confirmNewPassword = StringsKt__StringsKt.trim((CharSequence) ((EditText) changeEmailDialog4._$_findCachedViewById(R$id.component_input_password)).getText().toString()).toString();
            if (!Intrinsics.areEqual((Object) this.this$0.newPassword, (Object) this.this$0.confirmNewPassword)) {
                ((TextView) this.this$0._$_findCachedViewById(R$id.tv_error_password)).setText(this.this$0.getString(R$string.two_pwds_are_not_same));
                this.this$0.liveDataUIState.setValue(Integer.valueOf(this.this$0.currentProcess.lastStep()));
                ChangeEmailDialog changeEmailDialog5 = this.this$0;
                TextView textView = (TextView) changeEmailDialog5._$_findCachedViewById(R$id.tv_error_password);
                Intrinsics.checkNotNullExpressionValue(textView, "tv_error_password");
                changeEmailDialog5.visible(textView);
                return;
            }
            this.this$0.requestChangeEmail();
        }
    }
}
