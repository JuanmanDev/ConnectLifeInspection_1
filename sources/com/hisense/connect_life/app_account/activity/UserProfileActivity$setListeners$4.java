package com.hisense.connect_life.app_account.activity;

import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.hisense.connect_life.app_account.R$string;
import com.hisense.connect_life.app_account.widget.MultiSelectionDialog;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.hismart.constants.RequestTag;
import com.hisense.connect_life.hismart.networks.request.account.model.UserProfile;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: UserProfileActivity.kt */
public final class UserProfileActivity$setListeners$4 extends Lambda implements Function1<View, Unit> {
    public final /* synthetic */ UserProfileActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserProfileActivity$setListeners$4(UserProfileActivity userProfileActivity) {
        super(1);
        this.this$0 = userProfileActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable View view) {
        int i;
        String gender;
        UserProfile access$getOldUserProfile$p = this.this$0.oldUserProfile;
        if (!(access$getOldUserProfile$p == null || (gender = access$getOldUserProfile$p.getGender()) == null)) {
            if (!(gender.length() == 0) && TextUtils.isDigitsOnly(gender)) {
                i = Integer.parseInt(gender);
                String string = this.this$0.getString(R$string.f15734mr);
                Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.mr)");
                String string2 = this.this$0.getString(R$string.f15735ms);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.ms)");
                String string3 = this.this$0.getString(R$string.setting_title_placeholder);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.setting_title_placeholder)");
                MultiSelectionDialog multiSelectionDialog = new MultiSelectionDialog(new String[]{string, string2}, string3, i);
                final UserProfileActivity userProfileActivity = this.this$0;
                multiSelectionDialog.setCallback(new MultiSelectionDialog.ISelectSelection() {
                    public void onSelectionSelected(@NotNull String str) {
                        UserProfile access$getOldUserProfile$p;
                        String str2 = str;
                        Intrinsics.checkNotNullParameter(str2, "selection");
                        userProfileActivity.settingTitle(str2);
                        String str3 = Intrinsics.areEqual((Object) str2, (Object) userProfileActivity.getString(R$string.f15734mr)) ? "0" : "1";
                        UserProfile access$getOldUserProfile$p2 = userProfileActivity.oldUserProfile;
                        if (!Intrinsics.areEqual((Object) str3, (Object) access$getOldUserProfile$p2 == null ? null : access$getOldUserProfile$p2.getGender()) && (access$getOldUserProfile$p = userProfileActivity.oldUserProfile) != null) {
                            UserProfileActivity userProfileActivity = userProfileActivity;
                            UserProfile copy$default = UserProfile.copy$default(access$getOldUserProfile$p, (String) null, (String) null, (String) null, (List) null, (List) null, (String) null, (String) null, (List) null, (String) null, (String) null, (List) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, 131071, (Object) null);
                            copy$default.setGender(str3);
                            userProfileActivity.updateUserProfile(copy$default, RequestTag.Title);
                        }
                    }
                });
                FragmentManager supportFragmentManager = this.this$0.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
                JuConnectExtKt.displayDialog(multiSelectionDialog, supportFragmentManager);
            }
        }
        i = 0;
        String string4 = this.this$0.getString(R$string.f15734mr);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.mr)");
        String string22 = this.this$0.getString(R$string.f15735ms);
        Intrinsics.checkNotNullExpressionValue(string22, "getString(R.string.ms)");
        String string32 = this.this$0.getString(R$string.setting_title_placeholder);
        Intrinsics.checkNotNullExpressionValue(string32, "getString(R.string.setting_title_placeholder)");
        MultiSelectionDialog multiSelectionDialog2 = new MultiSelectionDialog(new String[]{string4, string22}, string32, i);
        final UserProfileActivity userProfileActivity2 = this.this$0;
        multiSelectionDialog2.setCallback(new MultiSelectionDialog.ISelectSelection() {
            public void onSelectionSelected(@NotNull String str) {
                UserProfile access$getOldUserProfile$p;
                String str2 = str;
                Intrinsics.checkNotNullParameter(str2, "selection");
                userProfileActivity2.settingTitle(str2);
                String str3 = Intrinsics.areEqual((Object) str2, (Object) userProfileActivity2.getString(R$string.f15734mr)) ? "0" : "1";
                UserProfile access$getOldUserProfile$p2 = userProfileActivity2.oldUserProfile;
                if (!Intrinsics.areEqual((Object) str3, (Object) access$getOldUserProfile$p2 == null ? null : access$getOldUserProfile$p2.getGender()) && (access$getOldUserProfile$p = userProfileActivity2.oldUserProfile) != null) {
                    UserProfileActivity userProfileActivity = userProfileActivity2;
                    UserProfile copy$default = UserProfile.copy$default(access$getOldUserProfile$p, (String) null, (String) null, (String) null, (List) null, (List) null, (String) null, (String) null, (List) null, (String) null, (String) null, (List) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, 131071, (Object) null);
                    copy$default.setGender(str3);
                    userProfileActivity.updateUserProfile(copy$default, RequestTag.Title);
                }
            }
        });
        FragmentManager supportFragmentManager2 = this.this$0.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "supportFragmentManager");
        JuConnectExtKt.displayDialog(multiSelectionDialog2, supportFragmentManager2);
    }
}
