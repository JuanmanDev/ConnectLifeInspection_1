package com.hisense.connect_life.app_account.util;

import android.text.TextUtils;
import androidx.test.internal.runner.RunnerArgs;
import com.hisense.connect_life.core.global.AppConfig;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.hismart.networks.request.account.model.LoginInfo;
import com.hisense.connect_life.hismart.networks.request.device.model.ClientLoginInfo;
import com.hisense.connect_life.hismart.sql.account.LoginUserInfo;
import com.hisense.connect_life.hismart.sql.account.LoginUserInfoRoom;
import com.hmct.cloud.sdk.bean.account.SignonReplyInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p072c.p073a.p074a.C1502i;
import p040c.p072c.p073a.p074a.C1506m;
import p040c.p072c.p073a.p074a.C1524t;

@Metadata(mo47990d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/util/AccountUtils;", "", "()V", "Companion", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: AccountUtils.kt */
public final class AccountUtils {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    @Metadata(mo47990d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bJ.\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bJ\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0010\u001a\u00020\u000eJ\u0010\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\bJ\u000e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\bJ$\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0019\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0014J \u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\bJ\u000e\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\bJ\u0016\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bJ\u0012\u0010\u001e\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0014H\u0002J\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0 ¨\u0006!"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/util/AccountUtils$Companion;", "", "()V", "cacheLoginInfo", "Lcom/hisense/connect_life/hismart/networks/request/account/model/LoginInfo;", "info", "Lcom/hisense/connect_life/hismart/networks/request/device/model/ClientLoginInfo;", "password", "", "email", "loginSource", "thirdPlatformId", "Lcom/hmct/cloud/sdk/bean/account/SignonReplyInfo;", "clearLoginInfo", "", "deleteAllUserInfoFromDatabase", "deleteCurrentUserInfoFromDatabase", "customerId", "deleteUserEmail", "getLoginUserInfo", "Lcom/hisense/connect_life/hismart/sql/account/LoginUserInfo;", "firstName", "lastName", "photoUrl", "getUserInfo", "saveLoginUserInfoDatabase", "loginUserInfo", "saveUserEmail", "updateRefreshToken", "refreshToken", "updateUserLoginInfo", "userEmails", "", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: AccountUtils.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final LoginUserInfo getLoginUserInfo(String str, String str2, String str3) {
            LoginInfo userInfo = getUserInfo();
            int i = -1;
            if (userInfo != null) {
                try {
                    String customerId = userInfo.getCustomerId();
                    if (customerId != null) {
                        i = Integer.parseInt(customerId);
                    }
                } catch (Exception unused) {
                }
            }
            int i2 = i;
            if (userInfo == null) {
                return null;
            }
            return new LoginUserInfo(userInfo.getLoginName(), userInfo.getPassword(), userInfo.getSubscriberId(), i2, userInfo.getCustomerId(), userInfo.getToken(), userInfo.getTokenCreateTime(), userInfo.getTokenExpireTime(), userInfo.getRefreshToken(), userInfo.getRefreshTokenExpiredTime(), userInfo.getEmail(), System.currentTimeMillis(), str, str2, str3, userInfo.getLoginSource(), userInfo.getThirdPlatformId());
        }

        private final void updateUserLoginInfo(LoginUserInfo loginUserInfo) {
            saveLoginUserInfoDatabase(loginUserInfo);
        }

        @NotNull
        public final LoginInfo cacheLoginInfo(@NotNull ClientLoginInfo clientLoginInfo, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
            Intrinsics.checkNotNullParameter(clientLoginInfo, "info");
            String str5 = str;
            Intrinsics.checkNotNullParameter(str5, "password");
            String str6 = str2;
            Intrinsics.checkNotNullParameter(str6, "email");
            String str7 = str3;
            Intrinsics.checkNotNullParameter(str7, "loginSource");
            String str8 = str4;
            Intrinsics.checkNotNullParameter(str8, "thirdPlatformId");
            LoginInfo loginInfo = new LoginInfo(str2, str5, 0, clientLoginInfo.getCustomerId(), clientLoginInfo.getAccessToken(), clientLoginInfo.getAccessTokenCreateTime(), clientLoginInfo.getAccessTokenExpiredTime(), clientLoginInfo.getRefreshToken(), clientLoginInfo.getRefreshTokenExpiredTime(), str6, str7, str8);
            C1524t.m1042f(AppConfig.SP_NAME_APP).mo15423n(KeyConst.KEY_LOGIN_INFO, C1502i.m930j(loginInfo));
            return loginInfo;
        }

        public final void clearLoginInfo() {
            C1524t.m1042f(AppConfig.SP_NAME_APP).mo15427r(KeyConst.KEY_LOGIN_INFO);
        }

        public final void deleteAllUserInfoFromDatabase() {
            LoginUserInfoRoom.Companion.loginUserInfoProvider().deleteAll();
        }

        public final void deleteCurrentUserInfoFromDatabase() {
            ArrayList<LoginUserInfo> sortAndGetAll = LoginUserInfoRoom.Companion.loginUserInfoProvider().sortAndGetAll();
            if (!sortAndGetAll.isEmpty()) {
                LoginUserInfoRoom.Companion.loginUserInfoProvider().deleteById(sortAndGetAll.get(0).getCustomer_id_s());
                return;
            }
            C1506m.m968r("List<LoginUserInfo> is empty!");
        }

        public final void deleteUserEmail(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "email");
            boolean z = false;
            if (!(str.length() == 0)) {
                String j = C1524t.m1042f(AppConfig.SP_NAME_APP).mo15420j(KeyConst.LOGIN_EMAILS, "");
                Intrinsics.checkNotNullExpressionValue(j, "sources");
                if (j.length() > 0) {
                    z = true;
                }
                if (z) {
                    List mutableList = CollectionsKt___CollectionsKt.toMutableList(StringsKt__StringsKt.split$default((CharSequence) j, new String[]{RunnerArgs.CLASS_SEPARATOR}, false, 0, 6, (Object) null));
                    ArrayList arrayList = new ArrayList();
                    for (Object next : mutableList) {
                        if (!Intrinsics.areEqual((Object) (String) next, (Object) str)) {
                            arrayList.add(next);
                        }
                    }
                    String joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, RunnerArgs.CLASS_SEPARATOR, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
                    Intrinsics.stringPlus("deleteUserEmail:准备存入sp的邮箱列表String是:", joinToString$default);
                    C1524t.m1042f(AppConfig.SP_NAME_APP).mo15423n(KeyConst.LOGIN_EMAILS, joinToString$default);
                }
            }
        }

        @Nullable
        public final LoginInfo getUserInfo() {
            String j = C1524t.m1042f(AppConfig.SP_NAME_APP).mo15420j(KeyConst.KEY_LOGIN_INFO, "");
            if (TextUtils.isEmpty(j)) {
                return null;
            }
            try {
                return (LoginInfo) C1502i.m924d(j, LoginInfo.class);
            } catch (Exception unused) {
                return null;
            }
        }

        public final void saveLoginUserInfoDatabase(@NotNull String str, @NotNull String str2, @Nullable String str3) {
            Intrinsics.checkNotNullParameter(str, "firstName");
            Intrinsics.checkNotNullParameter(str2, "lastName");
            LoginUserInfo loginUserInfo = getLoginUserInfo(str, str2, str3);
            if (loginUserInfo != null) {
                AccountUtils.Companion.saveUserEmail(loginUserInfo.getEmail());
                if (LoginUserInfoRoom.Companion.loginUserInfoProvider().getUserInfoById(loginUserInfo.getCustomer_id_s()) != null) {
                    LoginUserInfoRoom.Companion.loginUserInfoProvider().update(loginUserInfo);
                    return;
                }
                if (!LoginUserInfoRoom.Companion.loginUserInfoProvider().getAll().isEmpty()) {
                    AccountUtils.Companion.deleteAllUserInfoFromDatabase();
                }
                LoginUserInfoRoom.Companion.loginUserInfoProvider().insert(loginUserInfo);
            }
        }

        public final void saveUserEmail(@NotNull String str) {
            List list;
            Intrinsics.checkNotNullParameter(str, "email");
            if (!(str.length() == 0)) {
                String j = C1524t.m1042f(AppConfig.SP_NAME_APP).mo15420j(KeyConst.LOGIN_EMAILS, "");
                Intrinsics.checkNotNullExpressionValue(j, "sources");
                if (j.length() > 0) {
                    list = StringsKt__StringsKt.contains$default((CharSequence) j, (CharSequence) RunnerArgs.CLASS_SEPARATOR, false, 2, (Object) null) ? CollectionsKt___CollectionsKt.toMutableList(StringsKt__StringsKt.split$default((CharSequence) j, new String[]{RunnerArgs.CLASS_SEPARATOR}, false, 0, 6, (Object) null)) : CollectionsKt__CollectionsKt.mutableListOf(j);
                } else {
                    list = new ArrayList();
                }
                List list2 = list;
                Intrinsics.stringPlus("从sp读取到的邮箱列表是:", list2);
                if (list2.contains(str)) {
                    list2.remove(str);
                    list2.add(str);
                    C1524t.m1042f(AppConfig.SP_NAME_APP).mo15423n(KeyConst.LOGIN_EMAILS, list2.size() > 1 ? CollectionsKt___CollectionsKt.joinToString$default(list2, RunnerArgs.CLASS_SEPARATOR, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null) : (String) list2.get(0));
                    return;
                }
                list2.add(str);
                Intrinsics.stringPlus("添加邮箱成功:", str);
                if (list2.size() > 5) {
                    Intrinsics.stringPlus("邮箱数量大于5个,需要删除最后一个:", CollectionsKt___CollectionsKt.first(list2));
                    list2.remove(CollectionsKt___CollectionsKt.first(list2));
                }
                Intrinsics.stringPlus("准备存入sp的邮箱列表是:", list2);
                String joinToString$default = list2.size() > 1 ? CollectionsKt___CollectionsKt.joinToString$default(list2, RunnerArgs.CLASS_SEPARATOR, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null) : (String) list2.get(0);
                Intrinsics.stringPlus("准备存入sp的邮箱列表String是:", joinToString$default);
                C1524t.m1042f(AppConfig.SP_NAME_APP).mo15423n(KeyConst.LOGIN_EMAILS, joinToString$default);
            }
        }

        public final void updateRefreshToken(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "refreshToken");
            Intrinsics.checkNotNullParameter(str2, "customerId");
            C1506m.m960j(Intrinsics.stringPlus("refreshToken:", str));
            LoginUserInfo userInfoById = LoginUserInfoRoom.Companion.loginUserInfoProvider().getUserInfoById(str2);
            if (userInfoById != null) {
                userInfoById.setRefresh_token(str);
                AccountUtils.Companion.updateUserLoginInfo(userInfoById);
            }
        }

        @NotNull
        public final List<String> userEmails() {
            String j = C1524t.m1042f(AppConfig.SP_NAME_APP).mo15420j(KeyConst.LOGIN_EMAILS, "");
            Intrinsics.checkNotNullExpressionValue(j, "sources");
            if (j.length() > 0) {
                return CollectionsKt___CollectionsKt.reversed(CollectionsKt___CollectionsKt.toList(StringsKt__StringsKt.split$default((CharSequence) j, new String[]{RunnerArgs.CLASS_SEPARATOR}, false, 0, 6, (Object) null)));
            }
            return CollectionsKt__CollectionsKt.emptyList();
        }

        public final void deleteCurrentUserInfoFromDatabase(@Nullable String str) {
            if (str != null) {
                LoginUserInfoRoom.Companion.loginUserInfoProvider().deleteById(str);
            }
        }

        public final void saveLoginUserInfoDatabase(@Nullable LoginUserInfo loginUserInfo) {
            if (loginUserInfo != null) {
                AccountUtils.Companion.saveUserEmail(loginUserInfo.getEmail());
                if (LoginUserInfoRoom.Companion.loginUserInfoProvider().getUserInfoById(loginUserInfo.getCustomer_id_s()) != null) {
                    LoginUserInfoRoom.Companion.loginUserInfoProvider().update(loginUserInfo);
                    return;
                }
                if (!LoginUserInfoRoom.Companion.loginUserInfoProvider().getAll().isEmpty()) {
                    AccountUtils.Companion.deleteAllUserInfoFromDatabase();
                }
                LoginUserInfoRoom.Companion.loginUserInfoProvider().insert(loginUserInfo);
            }
        }

        @NotNull
        public final LoginInfo cacheLoginInfo(@NotNull SignonReplyInfo signonReplyInfo, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
            Intrinsics.checkNotNullParameter(signonReplyInfo, "info");
            String str5 = str;
            Intrinsics.checkNotNullParameter(str5, "password");
            String str6 = str2;
            Intrinsics.checkNotNullParameter(str6, "email");
            String str7 = str3;
            Intrinsics.checkNotNullParameter(str7, "loginSource");
            String str8 = str4;
            Intrinsics.checkNotNullParameter(str8, "thirdPlatformId");
            String loginName = signonReplyInfo.getLoginName();
            Intrinsics.checkNotNullExpressionValue(loginName, "info.loginName");
            int subscriberId = signonReplyInfo.getSubscriberId();
            String valueOf = String.valueOf(signonReplyInfo.getCustomerId());
            String token = signonReplyInfo.getToken();
            Intrinsics.checkNotNullExpressionValue(token, "info.token");
            long tokenCreateTime = signonReplyInfo.getTokenCreateTime();
            int tokenExpireTime = signonReplyInfo.getTokenExpireTime();
            String refreshToken = signonReplyInfo.getRefreshToken();
            Intrinsics.checkNotNullExpressionValue(refreshToken, "info.refreshToken");
            LoginInfo loginInfo = new LoginInfo(loginName, str5, subscriberId, valueOf, token, tokenCreateTime, tokenExpireTime, refreshToken, signonReplyInfo.getRefreshTokenExpiredTime(), str6, str7, str8);
            C1524t.m1042f(AppConfig.SP_NAME_APP).mo15423n(KeyConst.KEY_LOGIN_INFO, C1502i.m930j(loginInfo));
            return loginInfo;
        }
    }
}
