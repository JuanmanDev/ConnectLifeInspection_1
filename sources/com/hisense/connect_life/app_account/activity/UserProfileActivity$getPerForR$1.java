package com.hisense.connect_life.app_account.activity;

import com.hisense.connect_life.app_account.R$string;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import p040c.p472t.p473a.C7567d;

@Metadata(mo47990d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J \u0010\t\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000b"}, mo47991d2 = {"com/hisense/connect_life/app_account/activity/UserProfileActivity$getPerForR$1", "Lcom/hjq/permissions/OnPermissionCallback;", "onDenied", "", "permissions", "", "", "never", "", "onGranted", "all", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: UserProfileActivity.kt */
public final class UserProfileActivity$getPerForR$1 implements C7567d {
    public final /* synthetic */ UserProfileActivity this$0;

    public UserProfileActivity$getPerForR$1(UserProfileActivity userProfileActivity) {
        this.this$0 = userProfileActivity;
    }

    public void onDenied(@Nullable List<String> list, boolean z) {
        this.this$0.showString(R$string.camera_permissions);
    }

    public void onGranted(@Nullable List<String> list, boolean z) {
        this.this$0.gotoCamera();
    }
}
