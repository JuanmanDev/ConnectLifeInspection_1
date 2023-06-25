package com.hisense.connect_life.app_account.work;

import com.hisense.connect_life.app_account.util.AccountUtils;
import com.hisense.connect_life.core.utils.LoggerUtil;
import com.hisense.connect_life.hismart.networks.request.account.model.UserProfile;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "Lcom/hisense/connect_life/hismart/networks/request/account/model/UserProfile;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: UserProfileWork.kt */
public final class UserProfileWork$doWork$1 extends Lambda implements Function1<UserProfile, Unit> {
    public static final UserProfileWork$doWork$1 INSTANCE = new UserProfileWork$doWork$1();

    public UserProfileWork$doWork$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((UserProfile) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable UserProfile userProfile) {
        if (userProfile != null) {
            LoggerUtil.Companion.mo39146e(Intrinsics.stringPlus("UserProfileWork getUserProfile success: ", userProfile));
            AccountUtils.Companion.saveLoginUserInfoDatabase(userProfile.getFirstName(), userProfile.getLastName(), userProfile.getPhotoUrl());
        }
    }
}
