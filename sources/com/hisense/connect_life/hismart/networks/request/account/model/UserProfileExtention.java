package com.hisense.connect_life.hismart.networks.request.account.model;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/account/model/UserProfileExtention;", "", "userProfile", "Lcom/hisense/connect_life/hismart/networks/request/account/model/UserProfile;", "errorMsg", "", "(Lcom/hisense/connect_life/hismart/networks/request/account/model/UserProfile;Ljava/lang/String;)V", "getErrorMsg", "()Ljava/lang/String;", "setErrorMsg", "(Ljava/lang/String;)V", "getUserProfile", "()Lcom/hisense/connect_life/hismart/networks/request/account/model/UserProfile;", "setUserProfile", "(Lcom/hisense/connect_life/hismart/networks/request/account/model/UserProfile;)V", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: UserProfileExtention.kt */
public final class UserProfileExtention {
    @Nullable
    public String errorMsg;
    @Nullable
    public UserProfile userProfile;

    public UserProfileExtention(@Nullable UserProfile userProfile2, @Nullable String str) {
        this.userProfile = userProfile2;
        this.errorMsg = str;
    }

    @Nullable
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    @Nullable
    public final UserProfile getUserProfile() {
        return this.userProfile;
    }

    public final void setErrorMsg(@Nullable String str) {
        this.errorMsg = str;
    }

    public final void setUserProfile(@Nullable UserProfile userProfile2) {
        this.userProfile = userProfile2;
    }
}
