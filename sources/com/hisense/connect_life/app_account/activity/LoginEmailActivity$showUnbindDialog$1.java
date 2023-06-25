package com.hisense.connect_life.app_account.activity;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.hisense.connect_life.app_account.viewmodel.AccountViewModel;
import com.hisense.connect_life.core.listener.IItemCallback;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, mo47991d2 = {"com/hisense/connect_life/app_account/activity/LoginEmailActivity$showUnbindDialog$1", "Lcom/hisense/connect_life/core/listener/IItemCallback;", "", "accept", "", "item", "cancel", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: LoginEmailActivity.kt */
public final class LoginEmailActivity$showUnbindDialog$1 implements IItemCallback<String> {
    public final /* synthetic */ LoginEmailActivity this$0;

    public LoginEmailActivity$showUnbindDialog$1(LoginEmailActivity loginEmailActivity) {
        this.this$0 = loginEmailActivity;
    }

    public void cancel() {
    }

    public void accept(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "item");
        GoogleSignInAccount access$getMGoogleSignInAccount$p = this.this$0.mGoogleSignInAccount;
        String str2 = null;
        if ((access$getMGoogleSignInAccount$p == null ? null : access$getMGoogleSignInAccount$p.mo24419Q()) != null) {
            AccountViewModel access$getMViewModel = LoginEmailActivity.access$getMViewModel(this.this$0);
            GoogleSignInAccount access$getMGoogleSignInAccount$p2 = this.this$0.mGoogleSignInAccount;
            if (access$getMGoogleSignInAccount$p2 != null) {
                str2 = access$getMGoogleSignInAccount$p2.mo24419Q();
            }
            Intrinsics.checkNotNull(str2);
            Intrinsics.checkNotNullExpressionValue(str2, "mGoogleSignInAccount?.email!!");
            access$getMViewModel.checkLoginNameSign(str2);
            return;
        }
        GoogleSignInAccount access$getMGoogleSignInAccount$p3 = this.this$0.mGoogleSignInAccount;
        if (access$getMGoogleSignInAccount$p3 != null) {
            this.this$0.gotoThirdRegister(access$getMGoogleSignInAccount$p3);
        }
    }
}
