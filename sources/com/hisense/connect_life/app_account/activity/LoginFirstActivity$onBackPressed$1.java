package com.hisense.connect_life.app_account.activity;

import android.app.Application;
import com.hisense.connect_life.core.base.BaseApplication;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(mo47990d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo47991d2 = {"<anonymous>", "", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: LoginFirstActivity.kt */
public final class LoginFirstActivity$onBackPressed$1 extends Lambda implements Function0<Unit> {
    public final /* synthetic */ LoginFirstActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoginFirstActivity$onBackPressed$1(LoginFirstActivity loginFirstActivity) {
        super(0);
        this.this$0 = loginFirstActivity;
    }

    public final void invoke() {
        Application application = this.this$0.getApplication();
        if (application != null) {
            ((BaseApplication) application).setUpgradeHaveBeenChecked(false);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.hisense.connect_life.core.base.BaseApplication");
    }
}
