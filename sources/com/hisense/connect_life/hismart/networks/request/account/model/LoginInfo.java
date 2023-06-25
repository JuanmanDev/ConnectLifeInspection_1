package com.hisense.connect_life.hismart.networks.request.account.model;

import com.google.firebase.messaging.FirebaseMessagingService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b3\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0002\u0010\u0011J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0006HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\nHÆ\u0003J\t\u00109\u001a\u00020\u0006HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0006HÆ\u0003J\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÆ\u0001J\u0013\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010@\u001a\u00020\u0006HÖ\u0001J\t\u0010A\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u000e\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u001a\u0010\u000f\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R\u001a\u0010\f\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0013\"\u0004\b\u001f\u0010\u0015R\u001a\u0010\r\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R\u001a\u0010\u0010\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0013\"\u0004\b'\u0010\u0015R\u001a\u0010\b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0013\"\u0004\b)\u0010\u0015R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010\u000b\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010!\"\u0004\b/\u0010#¨\u0006B"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/account/model/LoginInfo;", "", "loginName", "", "password", "subscriberId", "", "customerId", "token", "tokenCreateTime", "", "tokenExpireTime", "refreshToken", "refreshTokenExpiredTime", "email", "loginSource", "thirdPlatformId", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCustomerId", "()Ljava/lang/String;", "setCustomerId", "(Ljava/lang/String;)V", "getEmail", "setEmail", "getLoginName", "setLoginName", "getLoginSource", "setLoginSource", "getPassword", "setPassword", "getRefreshToken", "setRefreshToken", "getRefreshTokenExpiredTime", "()I", "setRefreshTokenExpiredTime", "(I)V", "getSubscriberId", "setSubscriberId", "getThirdPlatformId", "setThirdPlatformId", "getToken", "setToken", "getTokenCreateTime", "()J", "setTokenCreateTime", "(J)V", "getTokenExpireTime", "setTokenExpireTime", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: LoginInfo.kt */
public final class LoginInfo {
    @NotNull
    public String customerId;
    @NotNull
    public String email;
    @NotNull
    public String loginName;
    @NotNull
    public String loginSource;
    @NotNull
    public String password;
    @NotNull
    public String refreshToken;
    public int refreshTokenExpiredTime;
    public int subscriberId;
    @NotNull
    public String thirdPlatformId;
    @NotNull
    public String token;
    public long tokenCreateTime;
    public int tokenExpireTime;

    public LoginInfo(@NotNull String str, @NotNull String str2, int i, @NotNull String str3, @NotNull String str4, long j, int i2, @NotNull String str5, int i3, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "loginName");
        Intrinsics.checkNotNullParameter(str2, "password");
        Intrinsics.checkNotNullParameter(str3, "customerId");
        Intrinsics.checkNotNullParameter(str4, FirebaseMessagingService.EXTRA_TOKEN);
        Intrinsics.checkNotNullParameter(str5, "refreshToken");
        Intrinsics.checkNotNullParameter(str6, "email");
        Intrinsics.checkNotNullParameter(str7, "loginSource");
        Intrinsics.checkNotNullParameter(str8, "thirdPlatformId");
        this.loginName = str;
        this.password = str2;
        this.subscriberId = i;
        this.customerId = str3;
        this.token = str4;
        this.tokenCreateTime = j;
        this.tokenExpireTime = i2;
        this.refreshToken = str5;
        this.refreshTokenExpiredTime = i3;
        this.email = str6;
        this.loginSource = str7;
        this.thirdPlatformId = str8;
    }

    public static /* synthetic */ LoginInfo copy$default(LoginInfo loginInfo, String str, String str2, int i, String str3, String str4, long j, int i2, String str5, int i3, String str6, String str7, String str8, int i4, Object obj) {
        LoginInfo loginInfo2 = loginInfo;
        int i5 = i4;
        return loginInfo.copy((i5 & 1) != 0 ? loginInfo2.loginName : str, (i5 & 2) != 0 ? loginInfo2.password : str2, (i5 & 4) != 0 ? loginInfo2.subscriberId : i, (i5 & 8) != 0 ? loginInfo2.customerId : str3, (i5 & 16) != 0 ? loginInfo2.token : str4, (i5 & 32) != 0 ? loginInfo2.tokenCreateTime : j, (i5 & 64) != 0 ? loginInfo2.tokenExpireTime : i2, (i5 & 128) != 0 ? loginInfo2.refreshToken : str5, (i5 & 256) != 0 ? loginInfo2.refreshTokenExpiredTime : i3, (i5 & 512) != 0 ? loginInfo2.email : str6, (i5 & 1024) != 0 ? loginInfo2.loginSource : str7, (i5 & 2048) != 0 ? loginInfo2.thirdPlatformId : str8);
    }

    @NotNull
    public final String component1() {
        return this.loginName;
    }

    @NotNull
    public final String component10() {
        return this.email;
    }

    @NotNull
    public final String component11() {
        return this.loginSource;
    }

    @NotNull
    public final String component12() {
        return this.thirdPlatformId;
    }

    @NotNull
    public final String component2() {
        return this.password;
    }

    public final int component3() {
        return this.subscriberId;
    }

    @NotNull
    public final String component4() {
        return this.customerId;
    }

    @NotNull
    public final String component5() {
        return this.token;
    }

    public final long component6() {
        return this.tokenCreateTime;
    }

    public final int component7() {
        return this.tokenExpireTime;
    }

    @NotNull
    public final String component8() {
        return this.refreshToken;
    }

    public final int component9() {
        return this.refreshTokenExpiredTime;
    }

    @NotNull
    public final LoginInfo copy(@NotNull String str, @NotNull String str2, int i, @NotNull String str3, @NotNull String str4, long j, int i2, @NotNull String str5, int i3, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        String str9 = str;
        Intrinsics.checkNotNullParameter(str9, "loginName");
        String str10 = str2;
        Intrinsics.checkNotNullParameter(str10, "password");
        String str11 = str3;
        Intrinsics.checkNotNullParameter(str11, "customerId");
        String str12 = str4;
        Intrinsics.checkNotNullParameter(str12, FirebaseMessagingService.EXTRA_TOKEN);
        String str13 = str5;
        Intrinsics.checkNotNullParameter(str13, "refreshToken");
        String str14 = str6;
        Intrinsics.checkNotNullParameter(str14, "email");
        String str15 = str7;
        Intrinsics.checkNotNullParameter(str15, "loginSource");
        String str16 = str8;
        Intrinsics.checkNotNullParameter(str16, "thirdPlatformId");
        return new LoginInfo(str9, str10, i, str11, str12, j, i2, str13, i3, str14, str15, str16);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginInfo)) {
            return false;
        }
        LoginInfo loginInfo = (LoginInfo) obj;
        return Intrinsics.areEqual((Object) this.loginName, (Object) loginInfo.loginName) && Intrinsics.areEqual((Object) this.password, (Object) loginInfo.password) && this.subscriberId == loginInfo.subscriberId && Intrinsics.areEqual((Object) this.customerId, (Object) loginInfo.customerId) && Intrinsics.areEqual((Object) this.token, (Object) loginInfo.token) && this.tokenCreateTime == loginInfo.tokenCreateTime && this.tokenExpireTime == loginInfo.tokenExpireTime && Intrinsics.areEqual((Object) this.refreshToken, (Object) loginInfo.refreshToken) && this.refreshTokenExpiredTime == loginInfo.refreshTokenExpiredTime && Intrinsics.areEqual((Object) this.email, (Object) loginInfo.email) && Intrinsics.areEqual((Object) this.loginSource, (Object) loginInfo.loginSource) && Intrinsics.areEqual((Object) this.thirdPlatformId, (Object) loginInfo.thirdPlatformId);
    }

    @NotNull
    public final String getCustomerId() {
        return this.customerId;
    }

    @NotNull
    public final String getEmail() {
        return this.email;
    }

    @NotNull
    public final String getLoginName() {
        return this.loginName;
    }

    @NotNull
    public final String getLoginSource() {
        return this.loginSource;
    }

    @NotNull
    public final String getPassword() {
        return this.password;
    }

    @NotNull
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final int getRefreshTokenExpiredTime() {
        return this.refreshTokenExpiredTime;
    }

    public final int getSubscriberId() {
        return this.subscriberId;
    }

    @NotNull
    public final String getThirdPlatformId() {
        return this.thirdPlatformId;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    public final long getTokenCreateTime() {
        return this.tokenCreateTime;
    }

    public final int getTokenExpireTime() {
        return this.tokenExpireTime;
    }

    public int hashCode() {
        return (((((((((((((((((((((this.loginName.hashCode() * 31) + this.password.hashCode()) * 31) + Integer.hashCode(this.subscriberId)) * 31) + this.customerId.hashCode()) * 31) + this.token.hashCode()) * 31) + Long.hashCode(this.tokenCreateTime)) * 31) + Integer.hashCode(this.tokenExpireTime)) * 31) + this.refreshToken.hashCode()) * 31) + Integer.hashCode(this.refreshTokenExpiredTime)) * 31) + this.email.hashCode()) * 31) + this.loginSource.hashCode()) * 31) + this.thirdPlatformId.hashCode();
    }

    public final void setCustomerId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.customerId = str;
    }

    public final void setEmail(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.email = str;
    }

    public final void setLoginName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.loginName = str;
    }

    public final void setLoginSource(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.loginSource = str;
    }

    public final void setPassword(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.password = str;
    }

    public final void setRefreshToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.refreshToken = str;
    }

    public final void setRefreshTokenExpiredTime(int i) {
        this.refreshTokenExpiredTime = i;
    }

    public final void setSubscriberId(int i) {
        this.subscriberId = i;
    }

    public final void setThirdPlatformId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.thirdPlatformId = str;
    }

    public final void setToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.token = str;
    }

    public final void setTokenCreateTime(long j) {
        this.tokenCreateTime = j;
    }

    public final void setTokenExpireTime(int i) {
        this.tokenExpireTime = i;
    }

    @NotNull
    public String toString() {
        return "LoginInfo(loginName=" + this.loginName + ", password=" + this.password + ", subscriberId=" + this.subscriberId + ", customerId=" + this.customerId + ", token=" + this.token + ", tokenCreateTime=" + this.tokenCreateTime + ", tokenExpireTime=" + this.tokenExpireTime + ", refreshToken=" + this.refreshToken + ", refreshTokenExpiredTime=" + this.refreshTokenExpiredTime + ", email=" + this.email + ", loginSource=" + this.loginSource + ", thirdPlatformId=" + this.thirdPlatformId + ')';
    }
}
