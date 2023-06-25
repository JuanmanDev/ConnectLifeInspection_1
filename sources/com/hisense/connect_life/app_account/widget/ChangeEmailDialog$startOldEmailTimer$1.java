package com.hisense.connect_life.app_account.widget;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(mo47990d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo47991d2 = {"<anonymous>", "", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ChangeEmailDialog.kt */
public final class ChangeEmailDialog$startOldEmailTimer$1 extends Lambda implements Function0<Unit> {
    public final /* synthetic */ ChangeEmailDialog this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChangeEmailDialog$startOldEmailTimer$1(ChangeEmailDialog changeEmailDialog) {
        super(0);
        this.this$0 = changeEmailDialog;
    }

    public final void invoke() {
        Integer num = (Integer) this.this$0.liveDataUIState.getValue();
        if (num != null && num.intValue() == 3) {
            this.this$0.resetResendButton();
        }
    }
}
