package com.hisense.connect_life.app_account.widget;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ChangeEmailDialog.kt */
public final class ChangeEmailDialog$setListeners$1 extends Lambda implements Function1<View, Unit> {
    public final /* synthetic */ ChangeEmailDialog this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChangeEmailDialog$setListeners$1(ChangeEmailDialog changeEmailDialog) {
        super(1);
        this.this$0 = changeEmailDialog;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable View view) {
        boolean z = true;
        this.this$0.switchProcess(true);
        Job access$getOldCodeJob$p = this.this$0.oldCodeJob;
        if (access$getOldCodeJob$p == null || !access$getOldCodeJob$p.isActive()) {
            z = false;
        }
        if (!z) {
            ChangeEmailDialog changeEmailDialog = this.this$0;
            changeEmailDialog.requestAuthCode(changeEmailDialog.oldEmail, 5);
        }
    }
}
