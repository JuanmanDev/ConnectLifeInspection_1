package com.hisense.connect_life.app_account.widget;

import android.widget.TextView;
import com.hisense.connect_life.app_account.R$id;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ChangeEmailDialog.kt */
public final class ChangeEmailDialog$startNewEmailTimer$2 extends Lambda implements Function1<Integer, Unit> {
    public final /* synthetic */ ChangeEmailDialog this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChangeEmailDialog$startNewEmailTimer$2(ChangeEmailDialog changeEmailDialog) {
        super(1);
        this.this$0 = changeEmailDialog;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        Integer num = (Integer) this.this$0.liveDataUIState.getValue();
        if (num != null && num.intValue() == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append(60 - i);
            sb.append('s');
            ((TextView) this.this$0._$_findCachedViewById(R$id.send_it_to_me)).setText(sb.toString());
        }
    }
}
