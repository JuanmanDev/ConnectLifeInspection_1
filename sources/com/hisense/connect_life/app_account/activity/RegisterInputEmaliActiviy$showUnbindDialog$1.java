package com.hisense.connect_life.app_account.activity;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.hisense.connect_life.app_account.R$string;
import com.hisense.connect_life.core.global.ThirdAccountType;
import com.hisense.connect_life.core.listener.IItemCallback;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.hismart.core.HiSystemParameter;
import com.hisense.connect_life.third_account.viewmodel.ThirdAccountViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, mo47991d2 = {"com/hisense/connect_life/app_account/activity/RegisterInputEmaliActiviy$showUnbindDialog$1", "Lcom/hisense/connect_life/core/listener/IItemCallback;", "", "accept", "", "item", "cancel", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: RegisterInputEmaliActiviy.kt */
public final class RegisterInputEmaliActiviy$showUnbindDialog$1 implements IItemCallback<String> {
    public final /* synthetic */ RegisterInputEmaliActiviy this$0;

    public RegisterInputEmaliActiviy$showUnbindDialog$1(RegisterInputEmaliActiviy registerInputEmaliActiviy) {
        this.this$0 = registerInputEmaliActiviy;
    }

    public void cancel() {
    }

    public void accept(@NotNull String str) {
        ThirdAccountViewModel thirdAccountViewModel;
        String jhkSerial;
        Intrinsics.checkNotNullParameter(str, "item");
        this.this$0.showLoading(true);
        ThirdAccountViewModel access$getThirdLoginModel$p = this.this$0.thirdLoginModel;
        String str2 = null;
        if (access$getThirdLoginModel$p == null) {
            Intrinsics.throwUninitializedPropertyAccessException("thirdLoginModel");
            thirdAccountViewModel = null;
        } else {
            thirdAccountViewModel = access$getThirdLoginModel$p;
        }
        String string = this.this$0.getString(R$string.server_client_id);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.server_client_id)");
        String name = ThirdAccountType.GOOGLE.name();
        GoogleSignInAccount access$getMGoogleSignInAccount$p = this.this$0.mGoogleSignInAccount;
        String U = access$getMGoogleSignInAccount$p == null ? null : access$getMGoogleSignInAccount$p.mo24423U();
        Intrinsics.checkNotNull(U);
        Intrinsics.checkNotNullExpressionValue(U, "mGoogleSignInAccount?.idToken!!");
        GoogleSignInAccount access$getMGoogleSignInAccount$p2 = this.this$0.mGoogleSignInAccount;
        if (access$getMGoogleSignInAccount$p2 != null) {
            str2 = access$getMGoogleSignInAccount$p2.mo24419Q();
        }
        String str3 = str2;
        Intrinsics.checkNotNull(str3);
        Intrinsics.checkNotNullExpressionValue(str3, "mGoogleSignInAccount?.email!!");
        HiSystemParameter hiSystemParameter = HiSmart.Companion.getInstance().getHiSystemParameter();
        thirdAccountViewModel.thirdRegister(string, name, U, str3, "", (hiSystemParameter == null || (jhkSerial = hiSystemParameter.getJhkSerial()) == null) ? "" : jhkSerial);
    }
}
