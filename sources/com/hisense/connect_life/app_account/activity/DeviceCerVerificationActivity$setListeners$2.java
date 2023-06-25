package com.hisense.connect_life.app_account.activity;

import android.view.View;
import android.widget.EditText;
import com.hisense.connect_life.app_account.R$id;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: DeviceCerVerificationActivity.kt */
public final class DeviceCerVerificationActivity$setListeners$2 extends Lambda implements Function1<View, Unit> {
    public final /* synthetic */ DeviceCerVerificationActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeviceCerVerificationActivity$setListeners$2(DeviceCerVerificationActivity deviceCerVerificationActivity) {
        super(1);
        this.this$0 = deviceCerVerificationActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable View view) {
        if (!(((EditText) this.this$0._$_findCachedViewById(R$id.edit_verification)).getText().toString().length() == 0)) {
            DeviceCerVerificationActivity deviceCerVerificationActivity = this.this$0;
            deviceCerVerificationActivity.mAuthCode = ((EditText) deviceCerVerificationActivity._$_findCachedViewById(R$id.edit_verification)).getText().toString();
            DeviceCerVerificationActivity.access$getMViewModel(this.this$0).checkAuthCode(this.this$0.getEmail(), this.this$0.mAuthCode, "4");
        }
    }
}
