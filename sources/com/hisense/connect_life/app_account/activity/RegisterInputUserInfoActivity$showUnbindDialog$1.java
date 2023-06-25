package com.hisense.connect_life.app_account.activity;

import com.hisense.connect_life.core.listener.IItemCallback;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, mo47991d2 = {"com/hisense/connect_life/app_account/activity/RegisterInputUserInfoActivity$showUnbindDialog$1", "Lcom/hisense/connect_life/core/listener/IItemCallback;", "", "accept", "", "item", "cancel", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: RegisterInputUserInfoActivity.kt */
public final class RegisterInputUserInfoActivity$showUnbindDialog$1 implements IItemCallback<String> {
    public final /* synthetic */ RegisterInputUserInfoActivity this$0;

    public RegisterInputUserInfoActivity$showUnbindDialog$1(RegisterInputUserInfoActivity registerInputUserInfoActivity) {
        this.this$0 = registerInputUserInfoActivity;
    }

    public void cancel() {
        this.this$0.hideLoading();
    }

    public void accept(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "item");
        this.this$0.addUserProfile(false);
    }
}
