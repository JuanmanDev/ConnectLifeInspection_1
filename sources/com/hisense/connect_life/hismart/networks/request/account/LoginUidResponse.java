package com.hisense.connect_life.hismart.networks.request.account;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b,\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B]\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0002\u0010\u000fJ\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\tHÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003Jm\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u0005HÆ\u0001J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u00020\u0003HÖ\u0001J\t\u00109\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0007\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\n\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013R\u001a\u0010\r\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0011\"\u0004\b!\u0010\u0013R\u001a\u0010\u000e\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0011\"\u0004\b#\u0010\u0013R\u001a\u0010\u000b\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0011\"\u0004\b%\u0010\u0013R\u001a\u0010\f\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0019\"\u0004\b'\u0010\u001bR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0019\"\u0004\b)\u0010\u001b¨\u0006:"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/account/LoginUidResponse;", "", "resultCode", "", "desc", "", "customerId", "accessToken", "accessTokenCreateTime", "", "accessTokenExpiredTime", "refreshToken", "refreshTokenExpiredTime", "errorCode", "errorDesc", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "setAccessToken", "(Ljava/lang/String;)V", "getAccessTokenCreateTime", "()J", "setAccessTokenCreateTime", "(J)V", "getAccessTokenExpiredTime", "()I", "setAccessTokenExpiredTime", "(I)V", "getCustomerId", "setCustomerId", "getDesc", "setDesc", "getErrorCode", "setErrorCode", "getErrorDesc", "setErrorDesc", "getRefreshToken", "setRefreshToken", "getRefreshTokenExpiredTime", "setRefreshTokenExpiredTime", "getResultCode", "setResultCode", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ChinaBeans.kt */
public final class LoginUidResponse {
    @NotNull
    public String accessToken;
    public long accessTokenCreateTime;
    public int accessTokenExpiredTime;
    @NotNull
    public String customerId;
    @NotNull
    public String desc;
    @NotNull
    public String errorCode;
    @NotNull
    public String errorDesc;
    @NotNull
    public String refreshToken;
    public int refreshTokenExpiredTime;
    public int resultCode;

    public LoginUidResponse(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, long j, int i2, @NotNull String str4, int i3, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "desc");
        Intrinsics.checkNotNullParameter(str2, "customerId");
        Intrinsics.checkNotNullParameter(str3, "accessToken");
        Intrinsics.checkNotNullParameter(str4, "refreshToken");
        Intrinsics.checkNotNullParameter(str5, "errorCode");
        Intrinsics.checkNotNullParameter(str6, "errorDesc");
        this.resultCode = i;
        this.desc = str;
        this.customerId = str2;
        this.accessToken = str3;
        this.accessTokenCreateTime = j;
        this.accessTokenExpiredTime = i2;
        this.refreshToken = str4;
        this.refreshTokenExpiredTime = i3;
        this.errorCode = str5;
        this.errorDesc = str6;
    }

    public static /* synthetic */ LoginUidResponse copy$default(LoginUidResponse loginUidResponse, int i, String str, String str2, String str3, long j, int i2, String str4, int i3, String str5, String str6, int i4, Object obj) {
        LoginUidResponse loginUidResponse2 = loginUidResponse;
        int i5 = i4;
        return loginUidResponse.copy((i5 & 1) != 0 ? loginUidResponse2.resultCode : i, (i5 & 2) != 0 ? loginUidResponse2.desc : str, (i5 & 4) != 0 ? loginUidResponse2.customerId : str2, (i5 & 8) != 0 ? loginUidResponse2.accessToken : str3, (i5 & 16) != 0 ? loginUidResponse2.accessTokenCreateTime : j, (i5 & 32) != 0 ? loginUidResponse2.accessTokenExpiredTime : i2, (i5 & 64) != 0 ? loginUidResponse2.refreshToken : str4, (i5 & 128) != 0 ? loginUidResponse2.refreshTokenExpiredTime : i3, (i5 & 256) != 0 ? loginUidResponse2.errorCode : str5, (i5 & 512) != 0 ? loginUidResponse2.errorDesc : str6);
    }

    public final int component1() {
        return this.resultCode;
    }

    @NotNull
    public final String component10() {
        return this.errorDesc;
    }

    @NotNull
    public final String component2() {
        return this.desc;
    }

    @NotNull
    public final String component3() {
        return this.customerId;
    }

    @NotNull
    public final String component4() {
        return this.accessToken;
    }

    public final long component5() {
        return this.accessTokenCreateTime;
    }

    public final int component6() {
        return this.accessTokenExpiredTime;
    }

    @NotNull
    public final String component7() {
        return this.refreshToken;
    }

    public final int component8() {
        return this.refreshTokenExpiredTime;
    }

    @NotNull
    public final String component9() {
        return this.errorCode;
    }

    @NotNull
    public final LoginUidResponse copy(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, long j, int i2, @NotNull String str4, int i3, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "desc");
        String str7 = str2;
        Intrinsics.checkNotNullParameter(str7, "customerId");
        String str8 = str3;
        Intrinsics.checkNotNullParameter(str8, "accessToken");
        String str9 = str4;
        Intrinsics.checkNotNullParameter(str9, "refreshToken");
        String str10 = str5;
        Intrinsics.checkNotNullParameter(str10, "errorCode");
        String str11 = str6;
        Intrinsics.checkNotNullParameter(str11, "errorDesc");
        return new LoginUidResponse(i, str, str7, str8, j, i2, str9, i3, str10, str11);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginUidResponse)) {
            return false;
        }
        LoginUidResponse loginUidResponse = (LoginUidResponse) obj;
        return this.resultCode == loginUidResponse.resultCode && Intrinsics.areEqual((Object) this.desc, (Object) loginUidResponse.desc) && Intrinsics.areEqual((Object) this.customerId, (Object) loginUidResponse.customerId) && Intrinsics.areEqual((Object) this.accessToken, (Object) loginUidResponse.accessToken) && this.accessTokenCreateTime == loginUidResponse.accessTokenCreateTime && this.accessTokenExpiredTime == loginUidResponse.accessTokenExpiredTime && Intrinsics.areEqual((Object) this.refreshToken, (Object) loginUidResponse.refreshToken) && this.refreshTokenExpiredTime == loginUidResponse.refreshTokenExpiredTime && Intrinsics.areEqual((Object) this.errorCode, (Object) loginUidResponse.errorCode) && Intrinsics.areEqual((Object) this.errorDesc, (Object) loginUidResponse.errorDesc);
    }

    @NotNull
    public final String getAccessToken() {
        return this.accessToken;
    }

    public final long getAccessTokenCreateTime() {
        return this.accessTokenCreateTime;
    }

    public final int getAccessTokenExpiredTime() {
        return this.accessTokenExpiredTime;
    }

    @NotNull
    public final String getCustomerId() {
        return this.customerId;
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    @NotNull
    public final String getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final String getErrorDesc() {
        return this.errorDesc;
    }

    @NotNull
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final int getRefreshTokenExpiredTime() {
        return this.refreshTokenExpiredTime;
    }

    public final int getResultCode() {
        return this.resultCode;
    }

    public int hashCode() {
        return (((((((((((((((((Integer.hashCode(this.resultCode) * 31) + this.desc.hashCode()) * 31) + this.customerId.hashCode()) * 31) + this.accessToken.hashCode()) * 31) + Long.hashCode(this.accessTokenCreateTime)) * 31) + Integer.hashCode(this.accessTokenExpiredTime)) * 31) + this.refreshToken.hashCode()) * 31) + Integer.hashCode(this.refreshTokenExpiredTime)) * 31) + this.errorCode.hashCode()) * 31) + this.errorDesc.hashCode();
    }

    public final void setAccessToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.accessToken = str;
    }

    public final void setAccessTokenCreateTime(long j) {
        this.accessTokenCreateTime = j;
    }

    public final void setAccessTokenExpiredTime(int i) {
        this.accessTokenExpiredTime = i;
    }

    public final void setCustomerId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.customerId = str;
    }

    public final void setDesc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.desc = str;
    }

    public final void setErrorCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.errorCode = str;
    }

    public final void setErrorDesc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.errorDesc = str;
    }

    public final void setRefreshToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.refreshToken = str;
    }

    public final void setRefreshTokenExpiredTime(int i) {
        this.refreshTokenExpiredTime = i;
    }

    public final void setResultCode(int i) {
        this.resultCode = i;
    }

    @NotNull
    public String toString() {
        return "LoginUidResponse(resultCode=" + this.resultCode + ", desc=" + this.desc + ", customerId=" + this.customerId + ", accessToken=" + this.accessToken + ", accessTokenCreateTime=" + this.accessTokenCreateTime + ", accessTokenExpiredTime=" + this.accessTokenExpiredTime + ", refreshToken=" + this.refreshToken + ", refreshTokenExpiredTime=" + this.refreshTokenExpiredTime + ", errorCode=" + this.errorCode + ", errorDesc=" + this.errorDesc + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ LoginUidResponse(int r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, long r20, int r22, java.lang.String r23, int r24, java.lang.String r25, java.lang.String r26, int r27, kotlin.jvm.internal.DefaultConstructorMarker r28) {
        /*
            r15 = this;
            r0 = r27
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r4 = r2
            goto L_0x000b
        L_0x0009:
            r4 = r16
        L_0x000b:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0013
            r5 = 0
            r8 = r5
            goto L_0x0015
        L_0x0013:
            r8 = r20
        L_0x0015:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x001b
            r10 = r2
            goto L_0x001d
        L_0x001b:
            r10 = r22
        L_0x001d:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0023
            r12 = r2
            goto L_0x0025
        L_0x0023:
            r12 = r24
        L_0x0025:
            r3 = r15
            r5 = r17
            r6 = r18
            r7 = r19
            r11 = r23
            r13 = r25
            r14 = r26
            r3.<init>(r4, r5, r6, r7, r8, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.connect_life.hismart.networks.request.account.LoginUidResponse.<init>(int, java.lang.String, java.lang.String, java.lang.String, long, int, java.lang.String, int, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
