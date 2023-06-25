package com.hisense.connect_life.app_account.activity;

import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.hisense.connect_life.app_account.R$id;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: DeleteAccountEmailCode.kt */
public final class DeleteAccountEmailCode$setListeners$3 extends Lambda implements Function1<View, Unit> {
    public final /* synthetic */ DeleteAccountEmailCode this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeleteAccountEmailCode$setListeners$3(DeleteAccountEmailCode deleteAccountEmailCode) {
        super(1);
        this.this$0 = deleteAccountEmailCode;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable View view) {
        Editable text = ((EditText) this.this$0._$_findCachedViewById(R$id.edit_verification)).getText();
        Intrinsics.checkNotNullExpressionValue(text, "edit_verification.text");
        if (text.length() > 0) {
            DeleteAccountEmailCode.access$getMViewModel(this.this$0).checkAuthCode(this.this$0.getEmailStr(), ((EditText) this.this$0._$_findCachedViewById(R$id.edit_verification)).getText().toString(), "7");
        }
    }
}
