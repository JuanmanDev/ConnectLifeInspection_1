package com.hisense.connect_life.app_account.widget;

import android.app.Dialog;
import android.view.View;
import android.widget.TextView;
import com.hisense.connect_life.app_account.R$id;
import com.hisense.connect_life.app_account.R$string;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ChangeEmailDialog.kt */
public final class ChangeEmailDialog$setListeners$3 extends Lambda implements Function1<View, Unit> {
    public final /* synthetic */ ChangeEmailDialog this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChangeEmailDialog$setListeners$3(ChangeEmailDialog changeEmailDialog) {
        super(1);
        this.this$0 = changeEmailDialog;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable View view) {
        String obj = ((TextView) this.this$0._$_findCachedViewById(R$id.tv_cancel)).getText().toString();
        String string = this.this$0.getString(R$string.back);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.back)");
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "ROOT");
        String upperCase = string.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        if (Intrinsics.areEqual((Object) obj, (Object) upperCase)) {
            this.this$0.liveDataUIState.setValue(Integer.valueOf(this.this$0.currentProcess.lastStep()));
            return;
        }
        this.this$0.dismiss();
        Dialog dialog = this.this$0.getDialog();
        if (dialog != null) {
            dialog.cancel();
        }
    }
}
