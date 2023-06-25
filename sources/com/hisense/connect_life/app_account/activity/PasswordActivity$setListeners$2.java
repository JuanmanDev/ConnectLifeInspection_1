package com.hisense.connect_life.app_account.activity;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import com.hisense.connect_life.app_account.R$id;
import com.hisense.connect_life.app_account.R$string;
import com.hisense.connect_life.core.utils.NetUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: PasswordActivity.kt */
public final class PasswordActivity$setListeners$2 extends Lambda implements Function1<View, Unit> {
    public final /* synthetic */ PasswordActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PasswordActivity$setListeners$2(PasswordActivity passwordActivity) {
        super(1);
        this.this$0 = passwordActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable View view) {
        if (TextUtils.isEmpty(((EditText) this.this$0._$_findCachedViewById(R$id.sign_password)).getText().toString())) {
            return;
        }
        if (NetUtils.Companion.getNETWORK_ENABLE()) {
            PasswordActivity.access$getMViewModel(this.this$0).signIn(this.this$0.getEmail(), ((EditText) this.this$0._$_findCachedViewById(R$id.sign_password)).getText().toString());
            return;
        }
        PasswordActivity passwordActivity = this.this$0;
        String string = passwordActivity.getString(R$string.network_lost);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.network_lost)");
        passwordActivity.showString(string);
    }
}
