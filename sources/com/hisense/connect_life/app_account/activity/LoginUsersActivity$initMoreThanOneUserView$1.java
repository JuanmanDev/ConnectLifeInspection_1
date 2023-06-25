package com.hisense.connect_life.app_account.activity;

import androidx.recyclerview.widget.GridLayoutManager;
import com.hisense.connect_life.app_account.adapter.LoginUserNameAdapter;
import com.hisense.connect_life.app_account.util.AccountUtils;
import com.hisense.connect_life.hismart.sql.account.LoginUserInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0016J \u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0016¨\u0006\n"}, mo47991d2 = {"com/hisense/connect_life/app_account/activity/LoginUsersActivity$initMoreThanOneUserView$1", "Lcom/hisense/connect_life/app_account/adapter/LoginUserNameAdapter$OnItemClickListener;", "onDeleteItemClick", "", "position", "", "loginUserInfo", "Lcom/hisense/connect_life/hismart/sql/account/LoginUserInfo;", "userIconBg", "onItemClick", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: LoginUsersActivity.kt */
public final class LoginUsersActivity$initMoreThanOneUserView$1 implements LoginUserNameAdapter.OnItemClickListener {
    public final /* synthetic */ GridLayoutManager $gridLayoutManager;
    public final /* synthetic */ LoginUsersActivity this$0;

    public LoginUsersActivity$initMoreThanOneUserView$1(LoginUsersActivity loginUsersActivity, GridLayoutManager gridLayoutManager) {
        this.this$0 = loginUsersActivity;
        this.$gridLayoutManager = gridLayoutManager;
    }

    public void onDeleteItemClick(int i, @NotNull LoginUserInfo loginUserInfo, int i2) {
        Intrinsics.checkNotNullParameter(loginUserInfo, "loginUserInfo");
        AccountUtils.Companion.deleteCurrentUserInfoFromDatabase(loginUserInfo.getCustomer_id_s());
        this.this$0.loginUserInfoList.remove(i);
        LoginUsersActivity loginUsersActivity = this.this$0;
        int i3 = 1;
        if (loginUsersActivity.loginUserInfoList.size() > 1) {
            i3 = 2;
        }
        loginUsersActivity.spanCount = i3;
        this.$gridLayoutManager.setSpanCount(this.this$0.spanCount);
        LoginUserNameAdapter access$getLoginUserNameAdapter$p = this.this$0.loginUserNameAdapter;
        if (access$getLoginUserNameAdapter$p == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loginUserNameAdapter");
            access$getLoginUserNameAdapter$p = null;
        }
        access$getLoginUserNameAdapter$p.setDeleteStatus(false);
    }

    public void onItemClick(int i, @NotNull LoginUserInfo loginUserInfo, int i2) {
        Intrinsics.checkNotNullParameter(loginUserInfo, "loginUserInfo");
        this.this$0.clickUserInfo = loginUserInfo;
        this.this$0.email = loginUserInfo.getEmail();
        this.this$0.psw = loginUserInfo.getPsw();
        this.this$0.refreshToken = loginUserInfo.getRefresh_token();
        this.this$0.userName = loginUserInfo.getLogin_name();
        this.this$0.firstName = loginUserInfo.getFirst_name();
        this.this$0.lastName = loginUserInfo.getLast_name();
        this.this$0.userIconBgColor = i2;
        this.this$0.photoUrl = loginUserInfo.getPhoto_url();
        this.this$0.loginSource = loginUserInfo.getLogin_source();
        this.this$0.thirdPlatformId = loginUserInfo.getThird_platform_id();
        this.this$0.refreshToken();
    }
}
